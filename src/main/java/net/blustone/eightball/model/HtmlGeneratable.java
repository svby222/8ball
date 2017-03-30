package net.blustone.eightball.model;

import java.util.List;

public interface HtmlGeneratable {

    String toHtml(List<Page> otherPages);

}
