package net.blustone.eightball.model;

import net.blustone.eightball.EightballParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Utilities {

    private Utilities() {
    }

    public static Map<String, Object> getProperties(EightballParser.PropertySetContext ctx) {
        if (ctx == null || ctx.property() == null || ctx.property().isEmpty()) return Collections.emptyMap();
        Map<String, Object> map = new HashMap<>();
        for (EightballParser.PropertyContext ctx2 : ctx.property()) {
            TerminalNode _int = ctx2.INT(), _str = ctx2.STRING(), _id = ctx2.ID(1);
            map.put(ctx2.ID(0).getText(), _int == null
                    ? _str == null
                    ? _id == null
                    ? null
                    : _id.getText()
                    : _str.getText()
                    : Long.parseLong(_int.getText()));
        }
        return map;
    }

    public static String toString(Object o) {
        return o == null ? null : o.toString();
    }

    public static String trimQuotes(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String readAll(InputStream stream) {
        StringBuilder builder = new StringBuilder();
        try {
            for (int read = stream.read(); read != -1; read = stream.read())
                builder.append((char) read);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } return builder.toString();
    }

}
