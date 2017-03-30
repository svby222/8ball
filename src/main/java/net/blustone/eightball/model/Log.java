package net.blustone.eightball.model;

import net.blustone.eightball.EightballParser;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Log implements HtmlGeneratable, BlockStatement<EightballParser.LogStatementContext> {

    private List<Pair<String, String>> statements = new ArrayList<>();
    private Scheme scheme;
    private int id;
    private String name;

    public static final String TEMPLATE =
            "<div class='logSection'><button id='%s' onclick=\"toggleLog(this, '%s', '%s')\">Show %s</button><div class='logText' id='%s'>%s</div></div>";

    public Log(String name, Scheme scheme, int id) {
        this.name = name;
        this.scheme = scheme;
        this.id = id;
    }

    @Override
    public void addStatement(EightballParser.LogStatementContext statement) {
        statements.add(new Pair<>(statement.ID().getText(), Utilities.trimQuotes(statement.STRING().getText())));
    }

    @Override
    public String toHtml() {
        String buttonId = "showLog-" + id;
        String divId = "hsLog-" + id;
        String generatedText = statements.stream()
                .map((pair) -> {
                    if(pair.a == null) {
                        return "???";
                    } else {
                        return String.format("<span style='color:%s'>%s</span>",
                                scheme.getMap().getOrDefault(pair.a, "black"), pair.b);
                    }
                }).collect(Collectors.joining("<br />"));
        return String.format(TEMPLATE, buttonId, divId, name, name, divId, generatedText);
    }

}
