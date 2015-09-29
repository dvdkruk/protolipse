/*
 * generated by Xtext
 */
package protolipse.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import protolipse.services.ProtobufGrammarAccess;

public class ProtobufParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ProtobufGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected protolipse.parser.antlr.internal.InternalProtobufParser createParser(XtextTokenStream stream) {
		return new protolipse.parser.antlr.internal.InternalProtobufParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Proto";
	}
	
	public ProtobufGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ProtobufGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}