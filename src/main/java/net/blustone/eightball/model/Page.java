package net.blustone.eightball.model;

import net.blustone.eightball.EightballParser;

import javax.swing.text.html.HTML;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Page implements HtmlGeneratable {

    private List<HtmlGeneratable> gens = new ArrayList<>();
    private String id, title;
    private Map<String, Scheme> schemes = new HashMap<>();

    public static final String TEMPLATE = Utilities.readAll(Page.class.getResourceAsStream("/8ball.html"));

    public Page(String id, EightballParser.PropertySetContext ctx) {
        this.id = id;
        Map<String, Object> props = Utilities.getProperties(ctx);
        title = props.containsKey("title") ? Utilities.trimQuotes(props.get("title").toString()) : id;
    }

    public void addGeneratable(HtmlGeneratable generatable) {
        gens.add(generatable);
    }

    @Override
    public String toHtml() {
        return String.format(TEMPLATE, title, gens.stream()
                .map(HtmlGeneratable::toHtml)
                .collect(Collectors.joining("\n")));
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}
