package net.blustone.eightball;// Generated from E:\Projects\Other\eightball\src\main\resources\Eightball.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EightballParser}.
 */
public interface EightballListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EightballParser#endStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndStatement(@NotNull EightballParser.EndStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EightballParser#endStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndStatement(@NotNull EightballParser.EndStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link EightballParser#imageStatement}.
	 * @param ctx the parse tree
	 */
	void enterImageStatement(@NotNull EightballParser.ImageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EightballParser#imageStatement}.
	 * @param ctx the parse tree
	 */
	void exitImageStatement(@NotNull EightballParser.ImageStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link EightballParser#schemeStatement}.
	 * @param ctx the parse tree
	 */
	void enterSchemeStatement(@NotNull EightballParser.SchemeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EightballParser#schemeStatement}.
	 * @param ctx the parse tree
	 */
	void exitSchemeStatement(@NotNull EightballParser.SchemeStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link EightballParser#scheme}.
	 * @param ctx the parse tree
	 */
	void enterScheme(@NotNull EightballParser.SchemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EightballParser#scheme}.
	 * @param ctx the parse tree
	 */
	void exitScheme(@NotNull EightballParser.SchemeContext ctx);

	/**
	 * Enter a parse tree produced by {@link EightballParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(@NotNull EightballParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link EightballParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(@NotNull EightballParser.LogContext ctx);

	/**
	 * Enter a parse tree produced by {@link EightballParser#propertySet}.
	 * @param ctx the parse tree
	 */
	void enterPropertySet(@NotNull EightballParser.PropertySetContext ctx);
	/**
	 * Exit a parse tree produced by {@link EightballParser#propertySet}.
	 * @param ctx the parse tree
	 */
	void exitPropertySet(@NotNull EightballParser.PropertySetContext ctx);

	/**
	 * Enter a parse tree produced by {@link EightballParser#inPageStatement}.
	 * @param ctx the parse tree
	 */
	void enterInPageStatement(@NotNull EightballParser.InPageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EightballParser#inPageStatement}.
	 * @param ctx the parse tree
	 */
	void exitInPageStatement(@NotNull EightballParser.InPageStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link EightballParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull EightballParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EightballParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull EightballParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link EightballParser#pageBlock}.
	 * @param ctx the parse tree
	 */
	void enterPageBlock(@NotNull EightballParser.PageBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EightballParser#pageBlock}.
	 * @param ctx the parse tree
	 */
	void exitPageBlock(@NotNull EightballParser.PageBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link EightballParser#flashStatement}.
	 * @param ctx the parse tree
	 */
	void enterFlashStatement(@NotNull EightballParser.FlashStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EightballParser#flashStatement}.
	 * @param ctx the parse tree
	 */
	void exitFlashStatement(@NotNull EightballParser.FlashStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link EightballParser#anything}.
	 * @param ctx the parse tree
	 */
	void enterAnything(@NotNull EightballParser.AnythingContext ctx);
	/**
	 * Exit a parse tree produced by {@link EightballParser#anything}.
	 * @param ctx the parse tree
	 */
	void exitAnything(@NotNull EightballParser.AnythingContext ctx);

	/**
	 * Enter a parse tree produced by {@link EightballParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(@NotNull EightballParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EightballParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(@NotNull EightballParser.PropertyContext ctx);

	/**
	 * Enter a parse tree produced by {@link EightballParser#logStatement}.
	 * @param ctx the parse tree
	 */
	void enterLogStatement(@NotNull EightballParser.LogStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EightballParser#logStatement}.
	 * @param ctx the parse tree
	 */
	void exitLogStatement(@NotNull EightballParser.LogStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link EightballParser#textStatement}.
	 * @param ctx the parse tree
	 */
	void enterTextStatement(@NotNull EightballParser.TextStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EightballParser#textStatement}.
	 * @param ctx the parse tree
	 */
	void exitTextStatement(@NotNull EightballParser.TextStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link EightballParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(@NotNull EightballParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link EightballParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(@NotNull EightballParser.PageContext ctx);
}