package net.blustone.eightball.model;

import net.blustone.eightball.EightballParser;

import java.util.List;
import java.util.Map;

public class Image implements HtmlGeneratable {

    public final String imagePath, w, h, alt;

    public Image(String imagePath, EightballParser.PropertySetContext ctx) {
        this.imagePath = imagePath;
        Map<String, Object> props = Utilities.getProperties(ctx);
        alt = props.getOrDefault("alt", "Missing image").toString();
        w = props.getOrDefault("width", "auto").toString();
        h = props.getOrDefault("height", "auto").toString();
    }

    @Override
    public String toHtml(List<Page> pages) {
        return String.format("<img width='%s' height='%s' src='%s' alt='%s' />", w, h, imagePath, alt);
    }

}
