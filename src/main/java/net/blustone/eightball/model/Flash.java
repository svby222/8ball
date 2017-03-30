package net.blustone.eightball.model;

import net.blustone.eightball.EightballParser;

import java.util.Map;

public class Flash implements HtmlGeneratable {

    private String path, w, h;

    public static final String TEMPLATE = "<embed width='%s' height='%s' src='%s'>";

    public Flash(String path, EightballParser.PropertySetContext ctx) {
        this.path = path;
        Map<String, Object> props = Utilities.getProperties(ctx);
        w = props.getOrDefault("width", "500").toString();
        h = props.getOrDefault("height", "300").toString();
    }

    @Override
    public String toHtml() {
        return String.format(TEMPLATE, w, h, path);
    }

}
