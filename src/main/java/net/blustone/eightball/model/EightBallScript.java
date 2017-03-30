package net.blustone.eightball.model;

import net.blustone.eightball.EightballAdapter;
import net.blustone.eightball.EightballLexer;
import net.blustone.eightball.EightballListener;
import net.blustone.eightball.EightballParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.rmi.CORBA.Util;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.util.stream.Collectors;

public class EightBallScript {

    private String text;

    public EightBallScript(String text) {
        this.text = text;
    }

    public List<Page> interpret() {
        EightballLexer lexer = new EightballLexer(new ANTLRInputStream(text));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EightballParser parser = new EightballParser(tokens);
        EightballParser.ProgramContext context = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();

        List<Page> pages = new ArrayList<>();

        EightballListener listener = new EightballAdapter() {
            Page current = null;
            Map<String, Scheme> schemes = new HashMap<>();
            Scheme mostRecent = null;
            Log log = null;
            int logId = 0;

            @Override
            public void enterImageStatement(EightballParser.ImageStatementContext ctx) {
                current.addGeneratable(new Image(Utilities.trimQuotes(ctx.STRING().getText()), ctx.propertySet()));
            }

            @Override
            public void enterScheme(EightballParser.SchemeContext ctx) {
                Scheme scheme = new Scheme(ctx.ID().getText());
                mostRecent = scheme;
            }

            @Override
            public void exitScheme(EightballParser.SchemeContext ctx) {
                schemes.put(mostRecent.getName(), mostRecent);
            }

            @Override
            public void enterLog(EightballParser.LogContext ctx) {
                String scheme = Utilities.toString(Utilities.getProperties(ctx.propertySet()).get("colors"));
                log = new Log(Utilities.trimQuotes(ctx.STRING().getText()), scheme == null ? mostRecent : schemes.get(scheme), logId++);
            }

            @Override
            public void exitLog(EightballParser.LogContext ctx) {
                current.addGeneratable(log);
                log = null;
            }

            @Override
            public void enterFlashStatement(EightballParser.FlashStatementContext ctx) {
                current.addGeneratable(new Flash(Utilities.trimQuotes(ctx.STRING().getText()), ctx.propertySet()));
            }

            @Override
            public void enterTextStatement(EightballParser.TextStatementContext ctx) {
                current.addGeneratable(new Text(Utilities.trimQuotes(ctx.STRING().getText())));
            }

            @Override
            public void enterPage(EightballParser.PageContext ctx) {
                String id = ctx.ID() == null ? "page" + (pages.size() + 1) : ctx.ID().getText();
                current = new Page(id, ctx.propertySet());
            }

            @Override
            public void exitPage(EightballParser.PageContext ctx) {
                pages.add(current);
                current = null;
                logId = 0;
            }

            @Override
            public void enterSchemeStatement(EightballParser.SchemeStatementContext ctx) {
                mostRecent.addStatement(ctx);
            }

            @Override
            public void enterLogStatement(EightballParser.LogStatementContext ctx) {
                log.addStatement(ctx);
            }
        };

        walker.walk(listener, context);

        return Collections.unmodifiableList(pages);
    }

    public void writeToFolder(File folder) throws IOException {
        Files.copy(getClass().getResourceAsStream("/8ball.css"), new File(folder, "8ball.css").toPath(), StandardCopyOption.REPLACE_EXISTING);
        Files.copy(getClass().getResourceAsStream("/8ball.js"), new File(folder, "8ball.js").toPath(), StandardCopyOption.REPLACE_EXISTING);
        for (Page p : interpret())
            try (PrintWriter w = new PrintWriter(new File(folder, p.getId() + ".html"))) {
                w.println(p.toHtml());
            }
    }

    public static EightBallScript from(File file) throws IOException {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            for (String line = reader.readLine(); line != null; line = reader.readLine())
                builder.append(line).append('\n');
        }
        return new EightBallScript(builder.toString());
    }

    public static EightBallScript from(String file) throws IOException {
        return from(new File(file));
    }

}
