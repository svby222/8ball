package net.blustone.eightball.model;

import org.antlr.v4.runtime.ParserRuleContext;

public interface BlockStatement<T extends ParserRuleContext> {

    void addStatement(T statement);

}
