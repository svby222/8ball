package net.blustone.eightball.model;

import net.blustone.eightball.EightballParser;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Scheme implements BlockStatement<EightballParser.SchemeStatementContext> {

    private Map<String, String> colors = new HashMap<>();

    private String name;

    public Scheme(String name) {
        this.name = name;
    }

    @Override
    public void addStatement(EightballParser.SchemeStatementContext statement) {
        colors.put(statement.ID().getText(), Utilities.trimQuotes(statement.STRING().getText()));
    }

    public Map<String, String> getMap() {
        return Collections.unmodifiableMap(colors);
    }

    public String getName() {
        return name;
    }
}
