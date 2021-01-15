// Generated from ESDF.g4 by ANTLR 4.9.1
package maow.esdf.internal;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ESDFParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ESDFVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ESDFParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(ESDFParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link ESDFParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(ESDFParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ESDFParser#headerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderStatement(ESDFParser.HeaderStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ESDFParser#headerElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderElement(ESDFParser.HeaderElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ESDFParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ESDFParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ESDFParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(ESDFParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ESDFParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(ESDFParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ESDFParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ESDFParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ESDFParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(ESDFParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ESDFParser#nestedElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedElement(ESDFParser.NestedElementContext ctx);
}