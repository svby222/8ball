package net.blustone.eightball.model;

public class Text implements HtmlGeneratable {

    private String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public String toHtml() {
        return String.format("<p class='hsText'>%s</p>", text);
    }

}
