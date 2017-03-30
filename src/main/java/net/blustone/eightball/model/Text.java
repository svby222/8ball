package net.blustone.eightball.model;

import java.util.List;

public class Text implements HtmlGeneratable {

    private String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public String toHtml(List<Page> pages) {
        return String.format("<p class='hsText'>%s</p>", text);
    }

}
