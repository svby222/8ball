package net.blustone.eightball.model;

import java.util.List;

public class Link implements HtmlGeneratable {

    private String page, pageName;

    public Link(String page) {
        this.page = page;
    }

    @Override
    public String toHtml(List<Page> pages) {
        for (Page page : pages)
            if (page.getId().equals(this.page))
                pageName = page.getTitle();
        if (pageName == null) return "";
        return String.format("<p class='eightballNext'><a href='%s'>%s</a></p>", page + ".html", pageName);
    }

}
