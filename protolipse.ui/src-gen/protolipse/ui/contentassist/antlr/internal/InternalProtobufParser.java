package protolipse.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import protolipse.services.ProtobufGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalProtobufParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMINT", "RULE_NUMDOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'to'", "'package'", "'syntax'", "'import'", "'option'", "'message'", "'service'", "'enum'", "'required'", "'optional'", "'repeated'", "'extensions'", "'extend'", "'group'", "'rpc'", "'returns'", "'int32'", "'int64'", "'uint32'", "'uint64'", "'sint32'", "'sint64'", "'fixed32'", "'fixed64'", "'sfixed32'", "'sfixed64'", "'float'", "'double'", "'bool'", "'string'", "'bytes'", "'default'", "'max'", "'void'", "'true'", "'false'", "'='", "';'", "'{'", "'}'", "'['", "']'", "','", "'('", "')'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_NUMDOUBLE=7;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_NUMINT=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalProtobufParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProtobufParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProtobufParser.tokenNames; }
    public String getGrammarFileName() { return "../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g"; }


     
     	private ProtobufGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ProtobufGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleProto"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:61:1: entryRuleProto : ruleProto EOF ;
    public final void entryRuleProto() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:62:1: ( ruleProto EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:63:1: ruleProto EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoRule()); 
            }
            pushFollow(FOLLOW_ruleProto_in_entryRuleProto67);
            ruleProto();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProto74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProto"


    // $ANTLR start "ruleProto"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:70:1: ruleProto : ( ( rule__Proto__Group__0 ) ) ;
    public final void ruleProto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:74:2: ( ( ( rule__Proto__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:75:1: ( ( rule__Proto__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:75:1: ( ( rule__Proto__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:76:1: ( rule__Proto__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:77:1: ( rule__Proto__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:77:2: rule__Proto__Group__0
            {
            pushFollow(FOLLOW_rule__Proto__Group__0_in_ruleProto100);
            rule__Proto__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProto"


    // $ANTLR start "entryRuleStatement"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:89:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:90:1: ( ruleStatement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:91:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement127);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:98:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:102:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:103:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:103:1: ( ( rule__Statement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:104:1: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:105:1: ( rule__Statement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:105:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement160);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSyntax"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:117:1: entryRuleSyntax : ruleSyntax EOF ;
    public final void entryRuleSyntax() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:118:1: ( ruleSyntax EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:119:1: ruleSyntax EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxRule()); 
            }
            pushFollow(FOLLOW_ruleSyntax_in_entryRuleSyntax187);
            ruleSyntax();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSyntaxRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyntax194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSyntax"


    // $ANTLR start "ruleSyntax"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:126:1: ruleSyntax : ( ( rule__Syntax__Group__0 ) ) ;
    public final void ruleSyntax() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:130:2: ( ( ( rule__Syntax__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:131:1: ( ( rule__Syntax__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:131:1: ( ( rule__Syntax__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:132:1: ( rule__Syntax__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:133:1: ( rule__Syntax__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:133:2: rule__Syntax__Group__0
            {
            pushFollow(FOLLOW_rule__Syntax__Group__0_in_ruleSyntax220);
            rule__Syntax__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSyntaxAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSyntax"


    // $ANTLR start "entryRulePackage"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:145:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:146:1: ( rulePackage EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:147:1: rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage247);
            rulePackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage254); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:154:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:158:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:159:1: ( ( rule__Package__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:159:1: ( ( rule__Package__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:160:1: ( rule__Package__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:161:1: ( rule__Package__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:161:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage280);
            rule__Package__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleImport"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:173:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:174:1: ( ruleImport EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:175:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport307);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport314); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:182:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:186:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:187:1: ( ( rule__Import__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:187:1: ( ( rule__Import__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:188:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:189:1: ( rule__Import__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:189:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport340);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleOption"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:201:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:202:1: ( ruleOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:203:1: ruleOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionRule()); 
            }
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption367);
            ruleOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption374); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:210:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:214:2: ( ( ( rule__Option__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:215:1: ( ( rule__Option__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:215:1: ( ( rule__Option__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:216:1: ( rule__Option__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:217:1: ( rule__Option__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:217:2: rule__Option__Group__0
            {
            pushFollow(FOLLOW_rule__Option__Group__0_in_ruleOption400);
            rule__Option__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleValue"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:229:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:230:1: ( ruleValue EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:231:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue427);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue434); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:238:1: ruleValue : ( ruleSimpleValueLink ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:242:2: ( ( ruleSimpleValueLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:243:1: ( ruleSimpleValueLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:243:1: ( ruleSimpleValueLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:244:1: ruleSimpleValueLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getSimpleValueLinkParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleSimpleValueLink_in_ruleValue460);
            ruleSimpleValueLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getSimpleValueLinkParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleSimpleValueLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:257:1: entryRuleSimpleValueLink : ruleSimpleValueLink EOF ;
    public final void entryRuleSimpleValueLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:258:1: ( ruleSimpleValueLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:259:1: ruleSimpleValueLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleValueLinkRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleValueLink_in_entryRuleSimpleValueLink486);
            ruleSimpleValueLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleValueLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleValueLink493); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleValueLink"


    // $ANTLR start "ruleSimpleValueLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:266:1: ruleSimpleValueLink : ( ( rule__SimpleValueLink__Alternatives ) ) ;
    public final void ruleSimpleValueLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:270:2: ( ( ( rule__SimpleValueLink__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:271:1: ( ( rule__SimpleValueLink__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:271:1: ( ( rule__SimpleValueLink__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:272:1: ( rule__SimpleValueLink__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleValueLinkAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:273:1: ( rule__SimpleValueLink__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:273:2: rule__SimpleValueLink__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleValueLink__Alternatives_in_ruleSimpleValueLink519);
            rule__SimpleValueLink__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleValueLinkAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleValueLink"


    // $ANTLR start "entryRuleStringLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:285:1: entryRuleStringLink : ruleStringLink EOF ;
    public final void entryRuleStringLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:286:1: ( ruleStringLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:287:1: ruleStringLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLinkRule()); 
            }
            pushFollow(FOLLOW_ruleStringLink_in_entryRuleStringLink546);
            ruleStringLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLink553); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLink"


    // $ANTLR start "ruleStringLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:294:1: ruleStringLink : ( ( rule__StringLink__TargetAssignment ) ) ;
    public final void ruleStringLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:298:2: ( ( ( rule__StringLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:299:1: ( ( rule__StringLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:299:1: ( ( rule__StringLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:300:1: ( rule__StringLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:301:1: ( rule__StringLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:301:2: rule__StringLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__StringLink__TargetAssignment_in_ruleStringLink579);
            rule__StringLink__TargetAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLinkAccess().getTargetAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLink"


    // $ANTLR start "entryRuleBooleanLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:313:1: entryRuleBooleanLink : ruleBooleanLink EOF ;
    public final void entryRuleBooleanLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:314:1: ( ruleBooleanLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:315:1: ruleBooleanLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLinkRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink606);
            ruleBooleanLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLink613); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanLink"


    // $ANTLR start "ruleBooleanLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:322:1: ruleBooleanLink : ( ( rule__BooleanLink__TargetAssignment ) ) ;
    public final void ruleBooleanLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:326:2: ( ( ( rule__BooleanLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:327:1: ( ( rule__BooleanLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:327:1: ( ( rule__BooleanLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:328:1: ( rule__BooleanLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:329:1: ( rule__BooleanLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:329:2: rule__BooleanLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLink__TargetAssignment_in_ruleBooleanLink639);
            rule__BooleanLink__TargetAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLinkAccess().getTargetAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLink"


    // $ANTLR start "entryRuleNumberLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:341:1: entryRuleNumberLink : ruleNumberLink EOF ;
    public final void entryRuleNumberLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:342:1: ( ruleNumberLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:343:1: ruleNumberLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLinkRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLink_in_entryRuleNumberLink666);
            ruleNumberLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLink673); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberLink"


    // $ANTLR start "ruleNumberLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:350:1: ruleNumberLink : ( ( rule__NumberLink__Alternatives ) ) ;
    public final void ruleNumberLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:354:2: ( ( ( rule__NumberLink__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:355:1: ( ( rule__NumberLink__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:355:1: ( ( rule__NumberLink__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:356:1: ( rule__NumberLink__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLinkAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:357:1: ( rule__NumberLink__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:357:2: rule__NumberLink__Alternatives
            {
            pushFollow(FOLLOW_rule__NumberLink__Alternatives_in_ruleNumberLink699);
            rule__NumberLink__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLinkAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLink"


    // $ANTLR start "entryRuleIntLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:369:1: entryRuleIntLink : ruleIntLink EOF ;
    public final void entryRuleIntLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:370:1: ( ruleIntLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:371:1: ruleIntLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLinkRule()); 
            }
            pushFollow(FOLLOW_ruleIntLink_in_entryRuleIntLink726);
            ruleIntLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLink733); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntLink"


    // $ANTLR start "ruleIntLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:378:1: ruleIntLink : ( ( rule__IntLink__TargetAssignment ) ) ;
    public final void ruleIntLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:382:2: ( ( ( rule__IntLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:383:1: ( ( rule__IntLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:383:1: ( ( rule__IntLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:384:1: ( rule__IntLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:385:1: ( rule__IntLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:385:2: rule__IntLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__IntLink__TargetAssignment_in_ruleIntLink759);
            rule__IntLink__TargetAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLinkAccess().getTargetAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLink"


    // $ANTLR start "entryRuleDoubleLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:397:1: entryRuleDoubleLink : ruleDoubleLink EOF ;
    public final void entryRuleDoubleLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:398:1: ( ruleDoubleLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:399:1: ruleDoubleLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLinkRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink786);
            ruleDoubleLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLink793); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoubleLink"


    // $ANTLR start "ruleDoubleLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:406:1: ruleDoubleLink : ( ( rule__DoubleLink__TargetAssignment ) ) ;
    public final void ruleDoubleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:410:2: ( ( ( rule__DoubleLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:411:1: ( ( rule__DoubleLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:411:1: ( ( rule__DoubleLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:412:1: ( rule__DoubleLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:413:1: ( rule__DoubleLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:413:2: rule__DoubleLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__DoubleLink__TargetAssignment_in_ruleDoubleLink819);
            rule__DoubleLink__TargetAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleLinkAccess().getTargetAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleLink"


    // $ANTLR start "entryRuleComplexType"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:425:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:426:1: ( ruleComplexType EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:427:1: ruleComplexType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeRule()); 
            }
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType846);
            ruleComplexType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType853); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:434:1: ruleComplexType : ( ( rule__ComplexType__Alternatives ) ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:438:2: ( ( ( rule__ComplexType__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:439:1: ( ( rule__ComplexType__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:439:1: ( ( rule__ComplexType__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:440:1: ( rule__ComplexType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:441:1: ( rule__ComplexType__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:441:2: rule__ComplexType__Alternatives
            {
            pushFollow(FOLLOW_rule__ComplexType__Alternatives_in_ruleComplexType879);
            rule__ComplexType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleExtensibleType"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:453:1: entryRuleExtensibleType : ruleExtensibleType EOF ;
    public final void entryRuleExtensibleType() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:454:1: ( ruleExtensibleType EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:455:1: ruleExtensibleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensibleTypeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType906);
            ruleExtensibleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensibleTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensibleType913); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtensibleType"


    // $ANTLR start "ruleExtensibleType"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:462:1: ruleExtensibleType : ( ( rule__ExtensibleType__Alternatives ) ) ;
    public final void ruleExtensibleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:466:2: ( ( ( rule__ExtensibleType__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:467:1: ( ( rule__ExtensibleType__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:467:1: ( ( rule__ExtensibleType__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:468:1: ( rule__ExtensibleType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensibleTypeAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:469:1: ( rule__ExtensibleType__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:469:2: rule__ExtensibleType__Alternatives
            {
            pushFollow(FOLLOW_rule__ExtensibleType__Alternatives_in_ruleExtensibleType939);
            rule__ExtensibleType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensibleTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtensibleType"


    // $ANTLR start "entryRuleMessage"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:481:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:482:1: ( ruleMessage EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:483:1: ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage966);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage973); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:490:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:494:2: ( ( ( rule__Message__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:495:1: ( ( rule__Message__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:495:1: ( ( rule__Message__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:496:1: ( rule__Message__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:497:1: ( rule__Message__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:497:2: rule__Message__Group__0
            {
            pushFollow(FOLLOW_rule__Message__Group__0_in_ruleMessage999);
            rule__Message__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMessageElement"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:509:1: entryRuleMessageElement : ruleMessageElement EOF ;
    public final void entryRuleMessageElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:510:1: ( ruleMessageElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:511:1: ruleMessageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageElementRule()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_entryRuleMessageElement1026);
            ruleMessageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageElement1033); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageElement"


    // $ANTLR start "ruleMessageElement"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:518:1: ruleMessageElement : ( ( rule__MessageElement__Alternatives ) ) ;
    public final void ruleMessageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:522:2: ( ( ( rule__MessageElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:523:1: ( ( rule__MessageElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:523:1: ( ( rule__MessageElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:524:1: ( rule__MessageElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:525:1: ( rule__MessageElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:525:2: rule__MessageElement__Alternatives
            {
            pushFollow(FOLLOW_rule__MessageElement__Alternatives_in_ruleMessageElement1059);
            rule__MessageElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageElement"


    // $ANTLR start "entryRuleIndexedElement"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:537:1: entryRuleIndexedElement : ruleIndexedElement EOF ;
    public final void entryRuleIndexedElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:538:1: ( ruleIndexedElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:539:1: ruleIndexedElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexedElementRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement1086);
            ruleIndexedElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexedElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedElement1093); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIndexedElement"


    // $ANTLR start "ruleIndexedElement"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:546:1: ruleIndexedElement : ( ( rule__IndexedElement__Alternatives ) ) ;
    public final void ruleIndexedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:550:2: ( ( ( rule__IndexedElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:551:1: ( ( rule__IndexedElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:551:1: ( ( rule__IndexedElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:552:1: ( rule__IndexedElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexedElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:553:1: ( rule__IndexedElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:553:2: rule__IndexedElement__Alternatives
            {
            pushFollow(FOLLOW_rule__IndexedElement__Alternatives_in_ruleIndexedElement1119);
            rule__IndexedElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexedElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIndexedElement"


    // $ANTLR start "entryRuleExtensionRange"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:565:1: entryRuleExtensionRange : ruleExtensionRange EOF ;
    public final void entryRuleExtensionRange() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:566:1: ( ruleExtensionRange EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:567:1: ruleExtensionRange EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange1146);
            ruleExtensionRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionRange1153); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtensionRange"


    // $ANTLR start "ruleExtensionRange"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:574:1: ruleExtensionRange : ( ( rule__ExtensionRange__Group__0 ) ) ;
    public final void ruleExtensionRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:578:2: ( ( ( rule__ExtensionRange__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:579:1: ( ( rule__ExtensionRange__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:579:1: ( ( rule__ExtensionRange__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:580:1: ( rule__ExtensionRange__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:581:1: ( rule__ExtensionRange__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:581:2: rule__ExtensionRange__Group__0
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__0_in_ruleExtensionRange1179);
            rule__ExtensionRange__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtensionRange"


    // $ANTLR start "entryRuleMessageField"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:593:1: entryRuleMessageField : ruleMessageField EOF ;
    public final void entryRuleMessageField() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:594:1: ( ruleMessageField EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:595:1: ruleMessageField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldRule()); 
            }
            pushFollow(FOLLOW_ruleMessageField_in_entryRuleMessageField1206);
            ruleMessageField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageField1213); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageField"


    // $ANTLR start "ruleMessageField"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:602:1: ruleMessageField : ( ( rule__MessageField__Group__0 ) ) ;
    public final void ruleMessageField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:606:2: ( ( ( rule__MessageField__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:607:1: ( ( rule__MessageField__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:607:1: ( ( rule__MessageField__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:608:1: ( rule__MessageField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:609:1: ( rule__MessageField__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:609:2: rule__MessageField__Group__0
            {
            pushFollow(FOLLOW_rule__MessageField__Group__0_in_ruleMessageField1239);
            rule__MessageField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageField"


    // $ANTLR start "entryRuleGroup"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:621:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:622:1: ( ruleGroup EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:623:1: ruleGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupRule()); 
            }
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup1266);
            ruleGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup1273); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:630:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:634:2: ( ( ( rule__Group__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:635:1: ( ( rule__Group__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:635:1: ( ( rule__Group__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:636:1: ( rule__Group__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:637:1: ( rule__Group__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:637:2: rule__Group__Group__0
            {
            pushFollow(FOLLOW_rule__Group__Group__0_in_ruleGroup1299);
            rule__Group__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleTypeLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:649:1: entryRuleTypeLink : ruleTypeLink EOF ;
    public final void entryRuleTypeLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:650:1: ( ruleTypeLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:651:1: ruleTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_entryRuleTypeLink1326);
            ruleTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLink1333); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeLink"


    // $ANTLR start "ruleTypeLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:658:1: ruleTypeLink : ( ( rule__TypeLink__Alternatives ) ) ;
    public final void ruleTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:662:2: ( ( ( rule__TypeLink__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:663:1: ( ( rule__TypeLink__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:663:1: ( ( rule__TypeLink__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:664:1: ( rule__TypeLink__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLinkAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:665:1: ( rule__TypeLink__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:665:2: rule__TypeLink__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeLink__Alternatives_in_ruleTypeLink1359);
            rule__TypeLink__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLinkAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeLink"


    // $ANTLR start "entryRuleComplexTypeLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:677:1: entryRuleComplexTypeLink : ruleComplexTypeLink EOF ;
    public final void entryRuleComplexTypeLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:678:1: ( ruleComplexTypeLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:679:1: ruleComplexTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink1386);
            ruleComplexTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLink1393); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexTypeLink"


    // $ANTLR start "ruleComplexTypeLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:686:1: ruleComplexTypeLink : ( ( rule__ComplexTypeLink__TargetAssignment ) ) ;
    public final void ruleComplexTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:690:2: ( ( ( rule__ComplexTypeLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:691:1: ( ( rule__ComplexTypeLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:691:1: ( ( rule__ComplexTypeLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:692:1: ( rule__ComplexTypeLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:693:1: ( rule__ComplexTypeLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:693:2: rule__ComplexTypeLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__ComplexTypeLink__TargetAssignment_in_ruleComplexTypeLink1419);
            rule__ComplexTypeLink__TargetAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeLinkAccess().getTargetAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexTypeLink"


    // $ANTLR start "entryRuleScalarTypeLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:705:1: entryRuleScalarTypeLink : ruleScalarTypeLink EOF ;
    public final void entryRuleScalarTypeLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:706:1: ( ruleScalarTypeLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:707:1: ruleScalarTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink1446);
            ruleScalarTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScalarTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarTypeLink1453); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScalarTypeLink"


    // $ANTLR start "ruleScalarTypeLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:714:1: ruleScalarTypeLink : ( ( rule__ScalarTypeLink__TargetAssignment ) ) ;
    public final void ruleScalarTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:718:2: ( ( ( rule__ScalarTypeLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:719:1: ( ( rule__ScalarTypeLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:719:1: ( ( rule__ScalarTypeLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:720:1: ( rule__ScalarTypeLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:721:1: ( rule__ScalarTypeLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:721:2: rule__ScalarTypeLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__ScalarTypeLink__TargetAssignment_in_ruleScalarTypeLink1479);
            rule__ScalarTypeLink__TargetAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScalarTypeLinkAccess().getTargetAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScalarTypeLink"


    // $ANTLR start "entryRuleFieldOptions"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:733:1: entryRuleFieldOptions : ruleFieldOptions EOF ;
    public final void entryRuleFieldOptions() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:734:1: ( ruleFieldOptions EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:735:1: ruleFieldOptions EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions1506);
            ruleFieldOptions();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOptions1513); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldOptions"


    // $ANTLR start "ruleFieldOptions"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:742:1: ruleFieldOptions : ( ( rule__FieldOptions__Group__0 ) ) ;
    public final void ruleFieldOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:746:2: ( ( ( rule__FieldOptions__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:747:1: ( ( rule__FieldOptions__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:747:1: ( ( rule__FieldOptions__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:748:1: ( rule__FieldOptions__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:749:1: ( rule__FieldOptions__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:749:2: rule__FieldOptions__Group__0
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__0_in_ruleFieldOptions1539);
            rule__FieldOptions__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldOptions"


    // $ANTLR start "entryRuleFieldOption"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:761:1: entryRuleFieldOption : ruleFieldOption EOF ;
    public final void entryRuleFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:762:1: ( ruleFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:763:1: ruleFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_entryRuleFieldOption1566);
            ruleFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOption1573); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldOption"


    // $ANTLR start "ruleFieldOption"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:770:1: ruleFieldOption : ( ( rule__FieldOption__Alternatives ) ) ;
    public final void ruleFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:774:2: ( ( ( rule__FieldOption__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:775:1: ( ( rule__FieldOption__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:775:1: ( ( rule__FieldOption__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:776:1: ( rule__FieldOption__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:777:1: ( rule__FieldOption__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:777:2: rule__FieldOption__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldOption__Alternatives_in_ruleFieldOption1599);
            rule__FieldOption__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldOption"


    // $ANTLR start "entryRuleDefaultValueFieldOption"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:789:1: entryRuleDefaultValueFieldOption : ruleDefaultValueFieldOption EOF ;
    public final void entryRuleDefaultValueFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:790:1: ( ruleDefaultValueFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:791:1: ruleDefaultValueFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption1626);
            ruleDefaultValueFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultValueFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValueFieldOption1633); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefaultValueFieldOption"


    // $ANTLR start "ruleDefaultValueFieldOption"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:798:1: ruleDefaultValueFieldOption : ( ( rule__DefaultValueFieldOption__Group__0 ) ) ;
    public final void ruleDefaultValueFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:802:2: ( ( ( rule__DefaultValueFieldOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:803:1: ( ( rule__DefaultValueFieldOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:803:1: ( ( rule__DefaultValueFieldOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:804:1: ( rule__DefaultValueFieldOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:805:1: ( rule__DefaultValueFieldOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:805:2: rule__DefaultValueFieldOption__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__0_in_ruleDefaultValueFieldOption1659);
            rule__DefaultValueFieldOption__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultValueFieldOptionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultValueFieldOption"


    // $ANTLR start "entryRuleNativeFieldOption"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:817:1: entryRuleNativeFieldOption : ruleNativeFieldOption EOF ;
    public final void entryRuleNativeFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:818:1: ( ruleNativeFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:819:1: ruleNativeFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption1686);
            ruleNativeFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeFieldOption1693); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNativeFieldOption"


    // $ANTLR start "ruleNativeFieldOption"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:826:1: ruleNativeFieldOption : ( ( rule__NativeFieldOption__Group__0 ) ) ;
    public final void ruleNativeFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:830:2: ( ( ( rule__NativeFieldOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:831:1: ( ( rule__NativeFieldOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:831:1: ( ( rule__NativeFieldOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:832:1: ( rule__NativeFieldOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:833:1: ( rule__NativeFieldOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:833:2: rule__NativeFieldOption__Group__0
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__0_in_ruleNativeFieldOption1719);
            rule__NativeFieldOption__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeFieldOptionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNativeFieldOption"


    // $ANTLR start "entryRuleOptionSource"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:845:1: entryRuleOptionSource : ruleOptionSource EOF ;
    public final void entryRuleOptionSource() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:846:1: ( ruleOptionSource EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:847:1: ruleOptionSource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceRule()); 
            }
            pushFollow(FOLLOW_ruleOptionSource_in_entryRuleOptionSource1746);
            ruleOptionSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionSourceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionSource1753); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptionSource"


    // $ANTLR start "ruleOptionSource"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:854:1: ruleOptionSource : ( ( rule__OptionSource__TargetAssignment ) ) ;
    public final void ruleOptionSource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:858:2: ( ( ( rule__OptionSource__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:859:1: ( ( rule__OptionSource__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:859:1: ( ( rule__OptionSource__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:860:1: ( rule__OptionSource__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:861:1: ( rule__OptionSource__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:861:2: rule__OptionSource__TargetAssignment
            {
            pushFollow(FOLLOW_rule__OptionSource__TargetAssignment_in_ruleOptionSource1779);
            rule__OptionSource__TargetAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionSourceAccess().getTargetAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionSource"


    // $ANTLR start "entryRuleEnum"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:873:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:874:1: ( ruleEnum EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:875:1: ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum1806);
            ruleEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum1813); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:882:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:886:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:887:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:887:1: ( ( rule__Enum__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:888:1: ( rule__Enum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:889:1: ( rule__Enum__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:889:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum1839);
            rule__Enum__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumElement"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:901:1: entryRuleEnumElement : ruleEnumElement EOF ;
    public final void entryRuleEnumElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:902:1: ( ruleEnumElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:903:1: ruleEnumElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumElementRule()); 
            }
            pushFollow(FOLLOW_ruleEnumElement_in_entryRuleEnumElement1866);
            ruleEnumElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumElement1873); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumElement"


    // $ANTLR start "ruleEnumElement"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:910:1: ruleEnumElement : ( ( rule__EnumElement__Alternatives ) ) ;
    public final void ruleEnumElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:914:2: ( ( ( rule__EnumElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:915:1: ( ( rule__EnumElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:915:1: ( ( rule__EnumElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:916:1: ( rule__EnumElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:917:1: ( rule__EnumElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:917:2: rule__EnumElement__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumElement__Alternatives_in_ruleEnumElement1899);
            rule__EnumElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumElement"


    // $ANTLR start "entryRuleEnumField"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:929:1: entryRuleEnumField : ruleEnumField EOF ;
    public final void entryRuleEnumField() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:930:1: ( ruleEnumField EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:931:1: ruleEnumField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldRule()); 
            }
            pushFollow(FOLLOW_ruleEnumField_in_entryRuleEnumField1926);
            ruleEnumField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumField1933); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumField"


    // $ANTLR start "ruleEnumField"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:938:1: ruleEnumField : ( ( rule__EnumField__Group__0 ) ) ;
    public final void ruleEnumField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:942:2: ( ( ( rule__EnumField__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:943:1: ( ( rule__EnumField__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:943:1: ( ( rule__EnumField__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:944:1: ( rule__EnumField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:945:1: ( rule__EnumField__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:945:2: rule__EnumField__Group__0
            {
            pushFollow(FOLLOW_rule__EnumField__Group__0_in_ruleEnumField1959);
            rule__EnumField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumField"


    // $ANTLR start "entryRuleService"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:957:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:958:1: ( ruleService EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:959:1: ruleService EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService1986);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService1993); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:966:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:970:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:971:1: ( ( rule__Service__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:971:1: ( ( rule__Service__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:972:1: ( rule__Service__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:973:1: ( rule__Service__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:973:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService2019);
            rule__Service__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleServiceElement"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:985:1: entryRuleServiceElement : ruleServiceElement EOF ;
    public final void entryRuleServiceElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:986:1: ( ruleServiceElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:987:1: ruleServiceElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceElementRule()); 
            }
            pushFollow(FOLLOW_ruleServiceElement_in_entryRuleServiceElement2046);
            ruleServiceElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceElement2053); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceElement"


    // $ANTLR start "ruleServiceElement"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:994:1: ruleServiceElement : ( ( rule__ServiceElement__Alternatives ) ) ;
    public final void ruleServiceElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:998:2: ( ( ( rule__ServiceElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:999:1: ( ( rule__ServiceElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:999:1: ( ( rule__ServiceElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1000:1: ( rule__ServiceElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1001:1: ( rule__ServiceElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1001:2: rule__ServiceElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ServiceElement__Alternatives_in_ruleServiceElement2079);
            rule__ServiceElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceElement"


    // $ANTLR start "entryRuleRpc"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1013:1: entryRuleRpc : ruleRpc EOF ;
    public final void entryRuleRpc() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1014:1: ( ruleRpc EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1015:1: ruleRpc EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcRule()); 
            }
            pushFollow(FOLLOW_ruleRpc_in_entryRuleRpc2106);
            ruleRpc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRpc2113); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRpc"


    // $ANTLR start "ruleRpc"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1022:1: ruleRpc : ( ( rule__Rpc__Group__0 ) ) ;
    public final void ruleRpc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1026:2: ( ( ( rule__Rpc__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1027:1: ( ( rule__Rpc__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1027:1: ( ( rule__Rpc__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1028:1: ( rule__Rpc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1029:1: ( rule__Rpc__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1029:2: rule__Rpc__Group__0
            {
            pushFollow(FOLLOW_rule__Rpc__Group__0_in_ruleRpc2139);
            rule__Rpc__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRpc"


    // $ANTLR start "entryRuleMessageLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1041:1: entryRuleMessageLink : ruleMessageLink EOF ;
    public final void entryRuleMessageLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1042:1: ( ruleMessageLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1043:1: ruleMessageLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkRule()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_entryRuleMessageLink2166);
            ruleMessageLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageLink2173); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageLink"


    // $ANTLR start "ruleMessageLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1050:1: ruleMessageLink : ( ( rule__MessageLink__TargetAssignment ) ) ;
    public final void ruleMessageLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1054:2: ( ( ( rule__MessageLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1055:1: ( ( rule__MessageLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1055:1: ( ( rule__MessageLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1056:1: ( rule__MessageLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1057:1: ( rule__MessageLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1057:2: rule__MessageLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__MessageLink__TargetAssignment_in_ruleMessageLink2199);
            rule__MessageLink__TargetAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageLinkAccess().getTargetAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageLink"


    // $ANTLR start "entryRuleExtend"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1069:1: entryRuleExtend : ruleExtend EOF ;
    public final void entryRuleExtend() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1070:1: ( ruleExtend EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1071:1: ruleExtend EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendRule()); 
            }
            pushFollow(FOLLOW_ruleExtend_in_entryRuleExtend2226);
            ruleExtend();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtend2233); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtend"


    // $ANTLR start "ruleExtend"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1078:1: ruleExtend : ( ( rule__Extend__Group__0 ) ) ;
    public final void ruleExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1082:2: ( ( ( rule__Extend__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1083:1: ( ( rule__Extend__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1083:1: ( ( rule__Extend__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1084:1: ( rule__Extend__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1085:1: ( rule__Extend__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1085:2: rule__Extend__Group__0
            {
            pushFollow(FOLLOW_rule__Extend__Group__0_in_ruleExtend2259);
            rule__Extend__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtend"


    // $ANTLR start "entryRuleVar_full"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1097:1: entryRuleVar_full : ruleVar_full EOF ;
    public final void entryRuleVar_full() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1098:1: ( ruleVar_full EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1099:1: ruleVar_full EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_fullRule()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_entryRuleVar_full2286);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_fullRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar_full2293); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVar_full"


    // $ANTLR start "ruleVar_full"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1106:1: ruleVar_full : ( ( rule__Var_full__Alternatives ) ) ;
    public final void ruleVar_full() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1110:2: ( ( ( rule__Var_full__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1111:1: ( ( rule__Var_full__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1111:1: ( ( rule__Var_full__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1112:1: ( rule__Var_full__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_fullAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1113:1: ( rule__Var_full__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1113:2: rule__Var_full__Alternatives
            {
            pushFollow(FOLLOW_rule__Var_full__Alternatives_in_ruleVar_full2319);
            rule__Var_full__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_fullAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVar_full"


    // $ANTLR start "entryRuleVar"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1125:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1126:1: ( ruleVar EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1127:1: ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar2346);
            ruleVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar2353); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1134:1: ruleVar : ( ( rule__Var__Alternatives ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1138:2: ( ( ( rule__Var__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1139:1: ( ( rule__Var__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1139:1: ( ( rule__Var__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1140:1: ( rule__Var__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1141:1: ( rule__Var__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1141:2: rule__Var__Alternatives
            {
            pushFollow(FOLLOW_rule__Var__Alternatives_in_ruleVar2379);
            rule__Var__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleFULL_ID"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1153:1: entryRuleFULL_ID : ruleFULL_ID EOF ;
    public final void entryRuleFULL_ID() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1154:1: ( ruleFULL_ID EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1155:1: ruleFULL_ID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDRule()); 
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID2406);
            ruleFULL_ID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFULL_IDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFULL_ID2413); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFULL_ID"


    // $ANTLR start "ruleFULL_ID"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1162:1: ruleFULL_ID : ( ( rule__FULL_ID__Group__0 ) ) ;
    public final void ruleFULL_ID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1166:2: ( ( ( rule__FULL_ID__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1167:1: ( ( rule__FULL_ID__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1167:1: ( ( rule__FULL_ID__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1168:1: ( rule__FULL_ID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1169:1: ( rule__FULL_ID__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1169:2: rule__FULL_ID__Group__0
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group__0_in_ruleFULL_ID2439);
            rule__FULL_ID__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFULL_IDAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFULL_ID"


    // $ANTLR start "entryRuleVarReserved"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1181:1: entryRuleVarReserved : ruleVarReserved EOF ;
    public final void entryRuleVarReserved() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1182:1: ( ruleVarReserved EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1183:1: ruleVarReserved EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReservedRule()); 
            }
            pushFollow(FOLLOW_ruleVarReserved_in_entryRuleVarReserved2466);
            ruleVarReserved();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarReservedRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarReserved2473); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarReserved"


    // $ANTLR start "ruleVarReserved"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1190:1: ruleVarReserved : ( ( rule__VarReserved__Alternatives ) ) ;
    public final void ruleVarReserved() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1194:2: ( ( ( rule__VarReserved__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1195:1: ( ( rule__VarReserved__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1195:1: ( ( rule__VarReserved__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1196:1: ( rule__VarReserved__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReservedAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1197:1: ( rule__VarReserved__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1197:2: rule__VarReserved__Alternatives
            {
            pushFollow(FOLLOW_rule__VarReserved__Alternatives_in_ruleVarReserved2499);
            rule__VarReserved__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarReservedAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarReserved"


    // $ANTLR start "ruleBOOL"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1212:1: ruleBOOL : ( ( rule__BOOL__Alternatives ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1216:1: ( ( ( rule__BOOL__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1217:1: ( ( rule__BOOL__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1217:1: ( ( rule__BOOL__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1218:1: ( rule__BOOL__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1219:1: ( rule__BOOL__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1219:2: rule__BOOL__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL2538);
            rule__BOOL__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOLAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "ruleModifier"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1231:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1235:1: ( ( ( rule__Modifier__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1236:1: ( ( rule__Modifier__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1236:1: ( ( rule__Modifier__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1237:1: ( rule__Modifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModifierAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1238:1: ( rule__Modifier__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1238:2: rule__Modifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Modifier__Alternatives_in_ruleModifier2574);
            rule__Modifier__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModifierAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifier"


    // $ANTLR start "ruleScalarType"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1250:1: ruleScalarType : ( ( rule__ScalarType__Alternatives ) ) ;
    public final void ruleScalarType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1254:1: ( ( ( rule__ScalarType__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1255:1: ( ( rule__ScalarType__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1255:1: ( ( rule__ScalarType__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1256:1: ( rule__ScalarType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1257:1: ( rule__ScalarType__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1257:2: rule__ScalarType__Alternatives
            {
            pushFollow(FOLLOW_rule__ScalarType__Alternatives_in_ruleScalarType2610);
            rule__ScalarType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScalarTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScalarType"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1268:1: rule__Statement__Alternatives : ( ( rulePackage ) | ( ruleImport ) | ( ruleComplexType ) | ( ruleExtend ) | ( ruleService ) | ( ruleOption ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1272:1: ( ( rulePackage ) | ( ruleImport ) | ( ruleComplexType ) | ( ruleExtend ) | ( ruleService ) | ( ruleOption ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
                {
                alt1=3;
                }
                break;
            case 25:
                {
                alt1=4;
                }
                break;
            case 19:
                {
                alt1=5;
                }
                break;
            case 17:
                {
                alt1=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1273:1: ( rulePackage )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1273:1: ( rulePackage )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1274:1: rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getPackageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePackage_in_rule__Statement__Alternatives2645);
                    rulePackage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getPackageParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1279:6: ( ruleImport )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1279:6: ( ruleImport )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1280:1: ruleImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getImportParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleImport_in_rule__Statement__Alternatives2662);
                    ruleImport();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getImportParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1285:6: ( ruleComplexType )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1285:6: ( ruleComplexType )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1286:1: ruleComplexType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getComplexTypeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleComplexType_in_rule__Statement__Alternatives2679);
                    ruleComplexType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getComplexTypeParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1291:6: ( ruleExtend )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1291:6: ( ruleExtend )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1292:1: ruleExtend
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getExtendParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleExtend_in_rule__Statement__Alternatives2696);
                    ruleExtend();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getExtendParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1297:6: ( ruleService )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1297:6: ( ruleService )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1298:1: ruleService
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getServiceParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleService_in_rule__Statement__Alternatives2713);
                    ruleService();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getServiceParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1303:6: ( ruleOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1303:6: ( ruleOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1304:1: ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getOptionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleOption_in_rule__Statement__Alternatives2730);
                    ruleOption();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getOptionParserRuleCall_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__SimpleValueLink__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1314:1: rule__SimpleValueLink__Alternatives : ( ( ruleNumberLink ) | ( ruleBooleanLink ) | ( ruleStringLink ) );
    public final void rule__SimpleValueLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1318:1: ( ( ruleNumberLink ) | ( ruleBooleanLink ) | ( ruleStringLink ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_NUMINT:
            case RULE_NUMDOUBLE:
                {
                alt2=1;
                }
                break;
            case 47:
            case 48:
                {
                alt2=2;
                }
                break;
            case RULE_STRING:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1319:1: ( ruleNumberLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1319:1: ( ruleNumberLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1320:1: ruleNumberLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getNumberLinkParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleNumberLink_in_rule__SimpleValueLink__Alternatives2762);
                    ruleNumberLink();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleValueLinkAccess().getNumberLinkParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1325:6: ( ruleBooleanLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1325:6: ( ruleBooleanLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1326:1: ruleBooleanLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getBooleanLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLink_in_rule__SimpleValueLink__Alternatives2779);
                    ruleBooleanLink();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleValueLinkAccess().getBooleanLinkParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1331:6: ( ruleStringLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1331:6: ( ruleStringLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1332:1: ruleStringLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getStringLinkParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleStringLink_in_rule__SimpleValueLink__Alternatives2796);
                    ruleStringLink();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleValueLinkAccess().getStringLinkParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValueLink__Alternatives"


    // $ANTLR start "rule__NumberLink__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1342:1: rule__NumberLink__Alternatives : ( ( ruleIntLink ) | ( ruleDoubleLink ) );
    public final void rule__NumberLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1346:1: ( ( ruleIntLink ) | ( ruleDoubleLink ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_NUMINT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_NUMDOUBLE) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1347:1: ( ruleIntLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1347:1: ( ruleIntLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1348:1: ruleIntLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLinkAccess().getIntLinkParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleIntLink_in_rule__NumberLink__Alternatives2828);
                    ruleIntLink();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumberLinkAccess().getIntLinkParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1353:6: ( ruleDoubleLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1353:6: ( ruleDoubleLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1354:1: ruleDoubleLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLinkAccess().getDoubleLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleDoubleLink_in_rule__NumberLink__Alternatives2845);
                    ruleDoubleLink();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumberLinkAccess().getDoubleLinkParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLink__Alternatives"


    // $ANTLR start "rule__ComplexType__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1364:1: rule__ComplexType__Alternatives : ( ( ruleEnum ) | ( ruleExtensibleType ) );
    public final void rule__ComplexType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1368:1: ( ( ruleEnum ) | ( ruleExtensibleType ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==18||(LA4_0>=21 && LA4_0<=23)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1369:1: ( ruleEnum )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1369:1: ( ruleEnum )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1370:1: ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComplexTypeAccess().getEnumParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEnum_in_rule__ComplexType__Alternatives2877);
                    ruleEnum();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComplexTypeAccess().getEnumParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1375:6: ( ruleExtensibleType )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1375:6: ( ruleExtensibleType )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1376:1: ruleExtensibleType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComplexTypeAccess().getExtensibleTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleExtensibleType_in_rule__ComplexType__Alternatives2894);
                    ruleExtensibleType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComplexTypeAccess().getExtensibleTypeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Alternatives"


    // $ANTLR start "rule__ExtensibleType__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1386:1: rule__ExtensibleType__Alternatives : ( ( ruleMessage ) | ( ruleGroup ) );
    public final void rule__ExtensibleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1390:1: ( ( ruleMessage ) | ( ruleGroup ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=21 && LA5_0<=23)) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1391:1: ( ruleMessage )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1391:1: ( ruleMessage )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1392:1: ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensibleTypeAccess().getMessageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMessage_in_rule__ExtensibleType__Alternatives2926);
                    ruleMessage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtensibleTypeAccess().getMessageParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1397:6: ( ruleGroup )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1397:6: ( ruleGroup )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1398:1: ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensibleTypeAccess().getGroupParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGroup_in_rule__ExtensibleType__Alternatives2943);
                    ruleGroup();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtensibleTypeAccess().getGroupParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensibleType__Alternatives"


    // $ANTLR start "rule__MessageElement__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1408:1: rule__MessageElement__Alternatives : ( ( ruleMessage ) | ( ruleIndexedElement ) | ( ruleEnum ) | ( ruleService ) | ( ruleExtend ) | ( ruleExtensionRange ) | ( ruleOption ) );
    public final void rule__MessageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1412:1: ( ( ruleMessage ) | ( ruleIndexedElement ) | ( ruleEnum ) | ( ruleService ) | ( ruleExtend ) | ( ruleExtensionRange ) | ( ruleOption ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 21:
            case 22:
            case 23:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            case 25:
                {
                alt6=5;
                }
                break;
            case 24:
                {
                alt6=6;
                }
                break;
            case 17:
                {
                alt6=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1413:1: ( ruleMessage )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1413:1: ( ruleMessage )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1414:1: ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getMessageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMessage_in_rule__MessageElement__Alternatives2975);
                    ruleMessage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageElementAccess().getMessageParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1419:6: ( ruleIndexedElement )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1419:6: ( ruleIndexedElement )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1420:1: ruleIndexedElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getIndexedElementParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIndexedElement_in_rule__MessageElement__Alternatives2992);
                    ruleIndexedElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageElementAccess().getIndexedElementParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1425:6: ( ruleEnum )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1425:6: ( ruleEnum )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1426:1: ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getEnumParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleEnum_in_rule__MessageElement__Alternatives3009);
                    ruleEnum();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageElementAccess().getEnumParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1431:6: ( ruleService )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1431:6: ( ruleService )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1432:1: ruleService
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getServiceParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleService_in_rule__MessageElement__Alternatives3026);
                    ruleService();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageElementAccess().getServiceParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1437:6: ( ruleExtend )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1437:6: ( ruleExtend )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1438:1: ruleExtend
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getExtendParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleExtend_in_rule__MessageElement__Alternatives3043);
                    ruleExtend();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageElementAccess().getExtendParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1443:6: ( ruleExtensionRange )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1443:6: ( ruleExtensionRange )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1444:1: ruleExtensionRange
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getExtensionRangeParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleExtensionRange_in_rule__MessageElement__Alternatives3060);
                    ruleExtensionRange();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageElementAccess().getExtensionRangeParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1449:6: ( ruleOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1449:6: ( ruleOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1450:1: ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getOptionParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleOption_in_rule__MessageElement__Alternatives3077);
                    ruleOption();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageElementAccess().getOptionParserRuleCall_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__Alternatives"


    // $ANTLR start "rule__IndexedElement__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1460:1: rule__IndexedElement__Alternatives : ( ( ruleMessageField ) | ( ruleGroup ) );
    public final void rule__IndexedElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1464:1: ( ( ruleMessageField ) | ( ruleGroup ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1465:1: ( ruleMessageField )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1465:1: ( ruleMessageField )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1466:1: ruleMessageField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIndexedElementAccess().getMessageFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMessageField_in_rule__IndexedElement__Alternatives3109);
                    ruleMessageField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIndexedElementAccess().getMessageFieldParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1471:6: ( ruleGroup )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1471:6: ( ruleGroup )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1472:1: ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIndexedElementAccess().getGroupParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGroup_in_rule__IndexedElement__Alternatives3126);
                    ruleGroup();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIndexedElementAccess().getGroupParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexedElement__Alternatives"


    // $ANTLR start "rule__TypeLink__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1482:1: rule__TypeLink__Alternatives : ( ( ( ruleScalarTypeLink ) ) | ( ruleComplexTypeLink ) );
    public final void rule__TypeLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1486:1: ( ( ( ruleScalarTypeLink ) ) | ( ruleComplexTypeLink ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1487:1: ( ( ruleScalarTypeLink ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1487:1: ( ( ruleScalarTypeLink ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1488:1: ( ruleScalarTypeLink )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLinkAccess().getScalarTypeLinkParserRuleCall_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1489:1: ( ruleScalarTypeLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1489:3: ruleScalarTypeLink
                    {
                    pushFollow(FOLLOW_ruleScalarTypeLink_in_rule__TypeLink__Alternatives3159);
                    ruleScalarTypeLink();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeLinkAccess().getScalarTypeLinkParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1493:6: ( ruleComplexTypeLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1493:6: ( ruleComplexTypeLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1494:1: ruleComplexTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLinkAccess().getComplexTypeLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleComplexTypeLink_in_rule__TypeLink__Alternatives3177);
                    ruleComplexTypeLink();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeLinkAccess().getComplexTypeLinkParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLink__Alternatives"


    // $ANTLR start "rule__FieldOption__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1504:1: rule__FieldOption__Alternatives : ( ( ( ruleDefaultValueFieldOption ) ) | ( ruleNativeFieldOption ) );
    public final void rule__FieldOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1508:1: ( ( ( ruleDefaultValueFieldOption ) ) | ( ruleNativeFieldOption ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1509:1: ( ( ruleDefaultValueFieldOption ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1509:1: ( ( ruleDefaultValueFieldOption ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1510:1: ( ruleDefaultValueFieldOption )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldOptionAccess().getDefaultValueFieldOptionParserRuleCall_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1511:1: ( ruleDefaultValueFieldOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1511:3: ruleDefaultValueFieldOption
                    {
                    pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_rule__FieldOption__Alternatives3210);
                    ruleDefaultValueFieldOption();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldOptionAccess().getDefaultValueFieldOptionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1515:6: ( ruleNativeFieldOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1515:6: ( ruleNativeFieldOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1516:1: ruleNativeFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldOptionAccess().getNativeFieldOptionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNativeFieldOption_in_rule__FieldOption__Alternatives3228);
                    ruleNativeFieldOption();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldOptionAccess().getNativeFieldOptionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Alternatives"


    // $ANTLR start "rule__EnumElement__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1526:1: rule__EnumElement__Alternatives : ( ( ruleEnumField ) | ( ruleOption ) );
    public final void rule__EnumElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1530:1: ( ( ruleEnumField ) | ( ruleOption ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1531:1: ( ruleEnumField )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1531:1: ( ruleEnumField )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1532:1: ruleEnumField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumElementAccess().getEnumFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEnumField_in_rule__EnumElement__Alternatives3260);
                    ruleEnumField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnumElementAccess().getEnumFieldParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1537:6: ( ruleOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1537:6: ( ruleOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1538:1: ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumElementAccess().getOptionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleOption_in_rule__EnumElement__Alternatives3277);
                    ruleOption();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnumElementAccess().getOptionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumElement__Alternatives"


    // $ANTLR start "rule__ServiceElement__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1548:1: rule__ServiceElement__Alternatives : ( ( ruleRpc ) | ( ruleOption ) );
    public final void rule__ServiceElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1552:1: ( ( ruleRpc ) | ( ruleOption ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1553:1: ( ruleRpc )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1553:1: ( ruleRpc )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1554:1: ruleRpc
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getServiceElementAccess().getRpcParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleRpc_in_rule__ServiceElement__Alternatives3309);
                    ruleRpc();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getServiceElementAccess().getRpcParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1559:6: ( ruleOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1559:6: ( ruleOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1560:1: ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getServiceElementAccess().getOptionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleOption_in_rule__ServiceElement__Alternatives3326);
                    ruleOption();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getServiceElementAccess().getOptionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceElement__Alternatives"


    // $ANTLR start "rule__Var_full__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1570:1: rule__Var_full__Alternatives : ( ( ruleFULL_ID ) | ( ruleVar ) );
    public final void rule__Var_full__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1574:1: ( ( ruleFULL_ID ) | ( ruleVar ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||LA12_1==RULE_ID||(LA12_1>=13 && LA12_1<=46)||(LA12_1>=49 && LA12_1<=50)) ) {
                    alt12=2;
                }
                else if ( (LA12_1==58) ) {
                    alt12=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA12_0>=13 && LA12_0<=46)) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1575:1: ( ruleFULL_ID )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1575:1: ( ruleFULL_ID )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1576:1: ruleFULL_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_fullAccess().getFULL_IDParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleFULL_ID_in_rule__Var_full__Alternatives3358);
                    ruleFULL_ID();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVar_fullAccess().getFULL_IDParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1581:6: ( ruleVar )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1581:6: ( ruleVar )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1582:1: ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_fullAccess().getVarParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVar_in_rule__Var_full__Alternatives3375);
                    ruleVar();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVar_fullAccess().getVarParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_full__Alternatives"


    // $ANTLR start "rule__Var__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1592:1: rule__Var__Alternatives : ( ( RULE_ID ) | ( ruleVarReserved ) );
    public final void rule__Var__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1596:1: ( ( RULE_ID ) | ( ruleVarReserved ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=13 && LA13_0<=46)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1597:1: ( RULE_ID )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1597:1: ( RULE_ID )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1598:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Var__Alternatives3407); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1603:6: ( ruleVarReserved )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1603:6: ( ruleVarReserved )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1604:1: ruleVarReserved
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarAccess().getVarReservedParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVarReserved_in_rule__Var__Alternatives3424);
                    ruleVarReserved();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarAccess().getVarReservedParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Alternatives"


    // $ANTLR start "rule__VarReserved__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1614:1: rule__VarReserved__Alternatives : ( ( 'to' ) | ( 'package' ) | ( 'syntax' ) | ( 'import' ) | ( 'option' ) | ( 'message' ) | ( 'service' ) | ( 'enum' ) | ( 'required' ) | ( 'optional' ) | ( 'repeated' ) | ( 'extensions' ) | ( 'extend' ) | ( 'group' ) | ( 'rpc' ) | ( 'returns' ) | ( 'int32' ) | ( 'int64' ) | ( 'uint32' ) | ( 'uint64' ) | ( 'sint32' ) | ( 'sint64' ) | ( 'fixed32' ) | ( 'fixed64' ) | ( 'sfixed32' ) | ( 'sfixed64' ) | ( 'float' ) | ( 'double' ) | ( 'bool' ) | ( 'string' ) | ( 'bytes' ) | ( 'default' ) | ( 'max' ) | ( 'void' ) );
    public final void rule__VarReserved__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1618:1: ( ( 'to' ) | ( 'package' ) | ( 'syntax' ) | ( 'import' ) | ( 'option' ) | ( 'message' ) | ( 'service' ) | ( 'enum' ) | ( 'required' ) | ( 'optional' ) | ( 'repeated' ) | ( 'extensions' ) | ( 'extend' ) | ( 'group' ) | ( 'rpc' ) | ( 'returns' ) | ( 'int32' ) | ( 'int64' ) | ( 'uint32' ) | ( 'uint64' ) | ( 'sint32' ) | ( 'sint64' ) | ( 'fixed32' ) | ( 'fixed64' ) | ( 'sfixed32' ) | ( 'sfixed64' ) | ( 'float' ) | ( 'double' ) | ( 'bool' ) | ( 'string' ) | ( 'bytes' ) | ( 'default' ) | ( 'max' ) | ( 'void' ) )
            int alt14=34;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt14=1;
                }
                break;
            case 14:
                {
                alt14=2;
                }
                break;
            case 15:
                {
                alt14=3;
                }
                break;
            case 16:
                {
                alt14=4;
                }
                break;
            case 17:
                {
                alt14=5;
                }
                break;
            case 18:
                {
                alt14=6;
                }
                break;
            case 19:
                {
                alt14=7;
                }
                break;
            case 20:
                {
                alt14=8;
                }
                break;
            case 21:
                {
                alt14=9;
                }
                break;
            case 22:
                {
                alt14=10;
                }
                break;
            case 23:
                {
                alt14=11;
                }
                break;
            case 24:
                {
                alt14=12;
                }
                break;
            case 25:
                {
                alt14=13;
                }
                break;
            case 26:
                {
                alt14=14;
                }
                break;
            case 27:
                {
                alt14=15;
                }
                break;
            case 28:
                {
                alt14=16;
                }
                break;
            case 29:
                {
                alt14=17;
                }
                break;
            case 30:
                {
                alt14=18;
                }
                break;
            case 31:
                {
                alt14=19;
                }
                break;
            case 32:
                {
                alt14=20;
                }
                break;
            case 33:
                {
                alt14=21;
                }
                break;
            case 34:
                {
                alt14=22;
                }
                break;
            case 35:
                {
                alt14=23;
                }
                break;
            case 36:
                {
                alt14=24;
                }
                break;
            case 37:
                {
                alt14=25;
                }
                break;
            case 38:
                {
                alt14=26;
                }
                break;
            case 39:
                {
                alt14=27;
                }
                break;
            case 40:
                {
                alt14=28;
                }
                break;
            case 41:
                {
                alt14=29;
                }
                break;
            case 42:
                {
                alt14=30;
                }
                break;
            case 43:
                {
                alt14=31;
                }
                break;
            case 44:
                {
                alt14=32;
                }
                break;
            case 45:
                {
                alt14=33;
                }
                break;
            case 46:
                {
                alt14=34;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1619:1: ( 'to' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1619:1: ( 'to' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1620:1: 'to'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getToKeyword_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__VarReserved__Alternatives3457); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getToKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1627:6: ( 'package' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1627:6: ( 'package' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1628:1: 'package'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getPackageKeyword_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__VarReserved__Alternatives3477); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getPackageKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1635:6: ( 'syntax' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1635:6: ( 'syntax' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1636:1: 'syntax'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSyntaxKeyword_2()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__VarReserved__Alternatives3497); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSyntaxKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1643:6: ( 'import' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1643:6: ( 'import' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1644:1: 'import'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getImportKeyword_3()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__VarReserved__Alternatives3517); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getImportKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1651:6: ( 'option' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1651:6: ( 'option' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1652:1: 'option'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getOptionKeyword_4()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__VarReserved__Alternatives3537); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getOptionKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1659:6: ( 'message' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1659:6: ( 'message' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1660:1: 'message'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getMessageKeyword_5()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__VarReserved__Alternatives3557); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getMessageKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1667:6: ( 'service' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1667:6: ( 'service' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1668:1: 'service'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getServiceKeyword_6()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__VarReserved__Alternatives3577); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getServiceKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1675:6: ( 'enum' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1675:6: ( 'enum' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1676:1: 'enum'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getEnumKeyword_7()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__VarReserved__Alternatives3597); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getEnumKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1683:6: ( 'required' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1683:6: ( 'required' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1684:1: 'required'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getRequiredKeyword_8()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__VarReserved__Alternatives3617); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getRequiredKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1691:6: ( 'optional' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1691:6: ( 'optional' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1692:1: 'optional'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getOptionalKeyword_9()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__VarReserved__Alternatives3637); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getOptionalKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1699:6: ( 'repeated' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1699:6: ( 'repeated' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1700:1: 'repeated'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getRepeatedKeyword_10()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__VarReserved__Alternatives3657); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getRepeatedKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1707:6: ( 'extensions' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1707:6: ( 'extensions' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1708:1: 'extensions'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getExtensionsKeyword_11()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__VarReserved__Alternatives3677); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getExtensionsKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1715:6: ( 'extend' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1715:6: ( 'extend' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1716:1: 'extend'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getExtendKeyword_12()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__VarReserved__Alternatives3697); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getExtendKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1723:6: ( 'group' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1723:6: ( 'group' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1724:1: 'group'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getGroupKeyword_13()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__VarReserved__Alternatives3717); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getGroupKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1731:6: ( 'rpc' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1731:6: ( 'rpc' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1732:1: 'rpc'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getRpcKeyword_14()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__VarReserved__Alternatives3737); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getRpcKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1739:6: ( 'returns' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1739:6: ( 'returns' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1740:1: 'returns'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getReturnsKeyword_15()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__VarReserved__Alternatives3757); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getReturnsKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1747:6: ( 'int32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1747:6: ( 'int32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1748:1: 'int32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getInt32Keyword_16()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__VarReserved__Alternatives3777); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getInt32Keyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1755:6: ( 'int64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1755:6: ( 'int64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1756:1: 'int64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getInt64Keyword_17()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__VarReserved__Alternatives3797); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getInt64Keyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1763:6: ( 'uint32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1763:6: ( 'uint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1764:1: 'uint32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getUint32Keyword_18()); 
                    }
                    match(input,31,FOLLOW_31_in_rule__VarReserved__Alternatives3817); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getUint32Keyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1771:6: ( 'uint64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1771:6: ( 'uint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1772:1: 'uint64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getUint64Keyword_19()); 
                    }
                    match(input,32,FOLLOW_32_in_rule__VarReserved__Alternatives3837); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getUint64Keyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1779:6: ( 'sint32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1779:6: ( 'sint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1780:1: 'sint32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSint32Keyword_20()); 
                    }
                    match(input,33,FOLLOW_33_in_rule__VarReserved__Alternatives3857); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSint32Keyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1787:6: ( 'sint64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1787:6: ( 'sint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1788:1: 'sint64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSint64Keyword_21()); 
                    }
                    match(input,34,FOLLOW_34_in_rule__VarReserved__Alternatives3877); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSint64Keyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1795:6: ( 'fixed32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1795:6: ( 'fixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1796:1: 'fixed32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getFixed32Keyword_22()); 
                    }
                    match(input,35,FOLLOW_35_in_rule__VarReserved__Alternatives3897); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getFixed32Keyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1803:6: ( 'fixed64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1803:6: ( 'fixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1804:1: 'fixed64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getFixed64Keyword_23()); 
                    }
                    match(input,36,FOLLOW_36_in_rule__VarReserved__Alternatives3917); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getFixed64Keyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1811:6: ( 'sfixed32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1811:6: ( 'sfixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1812:1: 'sfixed32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSfixed32Keyword_24()); 
                    }
                    match(input,37,FOLLOW_37_in_rule__VarReserved__Alternatives3937); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSfixed32Keyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1819:6: ( 'sfixed64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1819:6: ( 'sfixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1820:1: 'sfixed64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSfixed64Keyword_25()); 
                    }
                    match(input,38,FOLLOW_38_in_rule__VarReserved__Alternatives3957); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSfixed64Keyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1827:6: ( 'float' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1827:6: ( 'float' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1828:1: 'float'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getFloatKeyword_26()); 
                    }
                    match(input,39,FOLLOW_39_in_rule__VarReserved__Alternatives3977); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getFloatKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1835:6: ( 'double' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1835:6: ( 'double' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1836:1: 'double'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getDoubleKeyword_27()); 
                    }
                    match(input,40,FOLLOW_40_in_rule__VarReserved__Alternatives3997); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getDoubleKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1843:6: ( 'bool' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1843:6: ( 'bool' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1844:1: 'bool'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getBoolKeyword_28()); 
                    }
                    match(input,41,FOLLOW_41_in_rule__VarReserved__Alternatives4017); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getBoolKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1851:6: ( 'string' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1851:6: ( 'string' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1852:1: 'string'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getStringKeyword_29()); 
                    }
                    match(input,42,FOLLOW_42_in_rule__VarReserved__Alternatives4037); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getStringKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1859:6: ( 'bytes' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1859:6: ( 'bytes' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1860:1: 'bytes'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getBytesKeyword_30()); 
                    }
                    match(input,43,FOLLOW_43_in_rule__VarReserved__Alternatives4057); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getBytesKeyword_30()); 
                    }

                    }


                    }
                    break;
                case 32 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1867:6: ( 'default' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1867:6: ( 'default' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1868:1: 'default'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getDefaultKeyword_31()); 
                    }
                    match(input,44,FOLLOW_44_in_rule__VarReserved__Alternatives4077); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getDefaultKeyword_31()); 
                    }

                    }


                    }
                    break;
                case 33 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1875:6: ( 'max' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1875:6: ( 'max' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1876:1: 'max'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getMaxKeyword_32()); 
                    }
                    match(input,45,FOLLOW_45_in_rule__VarReserved__Alternatives4097); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getMaxKeyword_32()); 
                    }

                    }


                    }
                    break;
                case 34 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1883:6: ( 'void' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1883:6: ( 'void' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1884:1: 'void'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getVoidKeyword_33()); 
                    }
                    match(input,46,FOLLOW_46_in_rule__VarReserved__Alternatives4117); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getVoidKeyword_33()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarReserved__Alternatives"


    // $ANTLR start "rule__BOOL__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1897:1: rule__BOOL__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BOOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1901:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==47) ) {
                alt15=1;
            }
            else if ( (LA15_0==48) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1902:1: ( ( 'true' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1902:1: ( ( 'true' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1903:1: ( 'true' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1904:1: ( 'true' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1904:3: 'true'
                    {
                    match(input,47,FOLLOW_47_in_rule__BOOL__Alternatives4153); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1909:6: ( ( 'false' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1909:6: ( ( 'false' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1910:1: ( 'false' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLAccess().getFalseEnumLiteralDeclaration_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1911:1: ( 'false' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1911:3: 'false'
                    {
                    match(input,48,FOLLOW_48_in_rule__BOOL__Alternatives4174); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOLAccess().getFalseEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOL__Alternatives"


    // $ANTLR start "rule__Modifier__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1921:1: rule__Modifier__Alternatives : ( ( ( 'optional' ) ) | ( ( 'required' ) ) | ( ( 'repeated' ) ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1925:1: ( ( ( 'optional' ) ) | ( ( 'required' ) ) | ( ( 'repeated' ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt16=1;
                }
                break;
            case 21:
                {
                alt16=2;
                }
                break;
            case 23:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1926:1: ( ( 'optional' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1926:1: ( ( 'optional' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1927:1: ( 'optional' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1928:1: ( 'optional' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1928:3: 'optional'
                    {
                    match(input,22,FOLLOW_22_in_rule__Modifier__Alternatives4210); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1933:6: ( ( 'required' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1933:6: ( ( 'required' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1934:1: ( 'required' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1935:1: ( 'required' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1935:3: 'required'
                    {
                    match(input,21,FOLLOW_21_in_rule__Modifier__Alternatives4231); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1940:6: ( ( 'repeated' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1940:6: ( ( 'repeated' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1941:1: ( 'repeated' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getRepeatedEnumLiteralDeclaration_2()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1942:1: ( 'repeated' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1942:3: 'repeated'
                    {
                    match(input,23,FOLLOW_23_in_rule__Modifier__Alternatives4252); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getRepeatedEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__Alternatives"


    // $ANTLR start "rule__ScalarType__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1952:1: rule__ScalarType__Alternatives : ( ( ( 'int32' ) ) | ( ( 'int64' ) ) | ( ( 'uint32' ) ) | ( ( 'uint64' ) ) | ( ( 'sint32' ) ) | ( ( 'sint64' ) ) | ( ( 'fixed32' ) ) | ( ( 'fixed64' ) ) | ( ( 'sfixed32' ) ) | ( ( 'sfixed64' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'bool' ) ) | ( ( 'string' ) ) | ( ( 'bytes' ) ) );
    public final void rule__ScalarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1956:1: ( ( ( 'int32' ) ) | ( ( 'int64' ) ) | ( ( 'uint32' ) ) | ( ( 'uint64' ) ) | ( ( 'sint32' ) ) | ( ( 'sint64' ) ) | ( ( 'fixed32' ) ) | ( ( 'fixed64' ) ) | ( ( 'sfixed32' ) ) | ( ( 'sfixed64' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'bool' ) ) | ( ( 'string' ) ) | ( ( 'bytes' ) ) )
            int alt17=15;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt17=1;
                }
                break;
            case 30:
                {
                alt17=2;
                }
                break;
            case 31:
                {
                alt17=3;
                }
                break;
            case 32:
                {
                alt17=4;
                }
                break;
            case 33:
                {
                alt17=5;
                }
                break;
            case 34:
                {
                alt17=6;
                }
                break;
            case 35:
                {
                alt17=7;
                }
                break;
            case 36:
                {
                alt17=8;
                }
                break;
            case 37:
                {
                alt17=9;
                }
                break;
            case 38:
                {
                alt17=10;
                }
                break;
            case 39:
                {
                alt17=11;
                }
                break;
            case 40:
                {
                alt17=12;
                }
                break;
            case 41:
                {
                alt17=13;
                }
                break;
            case 42:
                {
                alt17=14;
                }
                break;
            case 43:
                {
                alt17=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1957:1: ( ( 'int32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1957:1: ( ( 'int32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1958:1: ( 'int32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1959:1: ( 'int32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1959:3: 'int32'
                    {
                    match(input,29,FOLLOW_29_in_rule__ScalarType__Alternatives4288); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1964:6: ( ( 'int64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1964:6: ( ( 'int64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1965:1: ( 'int64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1966:1: ( 'int64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1966:3: 'int64'
                    {
                    match(input,30,FOLLOW_30_in_rule__ScalarType__Alternatives4309); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1971:6: ( ( 'uint32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1971:6: ( ( 'uint32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1972:1: ( 'uint32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1973:1: ( 'uint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1973:3: 'uint32'
                    {
                    match(input,31,FOLLOW_31_in_rule__ScalarType__Alternatives4330); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1978:6: ( ( 'uint64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1978:6: ( ( 'uint64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1979:1: ( 'uint64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1980:1: ( 'uint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1980:3: 'uint64'
                    {
                    match(input,32,FOLLOW_32_in_rule__ScalarType__Alternatives4351); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1985:6: ( ( 'sint32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1985:6: ( ( 'sint32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1986:1: ( 'sint32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1987:1: ( 'sint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1987:3: 'sint32'
                    {
                    match(input,33,FOLLOW_33_in_rule__ScalarType__Alternatives4372); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1992:6: ( ( 'sint64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1992:6: ( ( 'sint64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1993:1: ( 'sint64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1994:1: ( 'sint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1994:3: 'sint64'
                    {
                    match(input,34,FOLLOW_34_in_rule__ScalarType__Alternatives4393); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1999:6: ( ( 'fixed32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1999:6: ( ( 'fixed32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2000:1: ( 'fixed32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2001:1: ( 'fixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2001:3: 'fixed32'
                    {
                    match(input,35,FOLLOW_35_in_rule__ScalarType__Alternatives4414); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2006:6: ( ( 'fixed64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2006:6: ( ( 'fixed64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2007:1: ( 'fixed64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2008:1: ( 'fixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2008:3: 'fixed64'
                    {
                    match(input,36,FOLLOW_36_in_rule__ScalarType__Alternatives4435); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2013:6: ( ( 'sfixed32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2013:6: ( ( 'sfixed32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2014:1: ( 'sfixed32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2015:1: ( 'sfixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2015:3: 'sfixed32'
                    {
                    match(input,37,FOLLOW_37_in_rule__ScalarType__Alternatives4456); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2020:6: ( ( 'sfixed64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2020:6: ( ( 'sfixed64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2021:1: ( 'sfixed64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2022:1: ( 'sfixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2022:3: 'sfixed64'
                    {
                    match(input,38,FOLLOW_38_in_rule__ScalarType__Alternatives4477); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2027:6: ( ( 'float' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2027:6: ( ( 'float' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2028:1: ( 'float' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2029:1: ( 'float' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2029:3: 'float'
                    {
                    match(input,39,FOLLOW_39_in_rule__ScalarType__Alternatives4498); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2034:6: ( ( 'double' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2034:6: ( ( 'double' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2035:1: ( 'double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2036:1: ( 'double' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2036:3: 'double'
                    {
                    match(input,40,FOLLOW_40_in_rule__ScalarType__Alternatives4519); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2041:6: ( ( 'bool' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2041:6: ( ( 'bool' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2042:1: ( 'bool' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2043:1: ( 'bool' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2043:3: 'bool'
                    {
                    match(input,41,FOLLOW_41_in_rule__ScalarType__Alternatives4540); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2048:6: ( ( 'string' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2048:6: ( ( 'string' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2049:1: ( 'string' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2050:1: ( 'string' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2050:3: 'string'
                    {
                    match(input,42,FOLLOW_42_in_rule__ScalarType__Alternatives4561); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2055:6: ( ( 'bytes' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2055:6: ( ( 'bytes' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2056:1: ( 'bytes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getBytesEnumLiteralDeclaration_14()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2057:1: ( 'bytes' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2057:3: 'bytes'
                    {
                    match(input,43,FOLLOW_43_in_rule__ScalarType__Alternatives4582); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getBytesEnumLiteralDeclaration_14()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarType__Alternatives"


    // $ANTLR start "rule__Proto__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2069:1: rule__Proto__Group__0 : rule__Proto__Group__0__Impl rule__Proto__Group__1 ;
    public final void rule__Proto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2073:1: ( rule__Proto__Group__0__Impl rule__Proto__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2074:2: rule__Proto__Group__0__Impl rule__Proto__Group__1
            {
            pushFollow(FOLLOW_rule__Proto__Group__0__Impl_in_rule__Proto__Group__04615);
            rule__Proto__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Proto__Group__1_in_rule__Proto__Group__04618);
            rule__Proto__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proto__Group__0"


    // $ANTLR start "rule__Proto__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2081:1: rule__Proto__Group__0__Impl : ( ( rule__Proto__SyntaxAssignment_0 )? ) ;
    public final void rule__Proto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2085:1: ( ( ( rule__Proto__SyntaxAssignment_0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2086:1: ( ( rule__Proto__SyntaxAssignment_0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2086:1: ( ( rule__Proto__SyntaxAssignment_0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2087:1: ( rule__Proto__SyntaxAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getSyntaxAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2088:1: ( rule__Proto__SyntaxAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2088:2: rule__Proto__SyntaxAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Proto__SyntaxAssignment_0_in_rule__Proto__Group__0__Impl4645);
                    rule__Proto__SyntaxAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getSyntaxAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proto__Group__0__Impl"


    // $ANTLR start "rule__Proto__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2098:1: rule__Proto__Group__1 : rule__Proto__Group__1__Impl ;
    public final void rule__Proto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2102:1: ( rule__Proto__Group__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2103:2: rule__Proto__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Proto__Group__1__Impl_in_rule__Proto__Group__14676);
            rule__Proto__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proto__Group__1"


    // $ANTLR start "rule__Proto__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2109:1: rule__Proto__Group__1__Impl : ( ( rule__Proto__StatementsAssignment_1 )* ) ;
    public final void rule__Proto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2113:1: ( ( ( rule__Proto__StatementsAssignment_1 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2114:1: ( ( rule__Proto__StatementsAssignment_1 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2114:1: ( ( rule__Proto__StatementsAssignment_1 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2115:1: ( rule__Proto__StatementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getStatementsAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2116:1: ( rule__Proto__StatementsAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==14||(LA19_0>=16 && LA19_0<=23)||LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2116:2: rule__Proto__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Proto__StatementsAssignment_1_in_rule__Proto__Group__1__Impl4703);
            	    rule__Proto__StatementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getStatementsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proto__Group__1__Impl"


    // $ANTLR start "rule__Syntax__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2130:1: rule__Syntax__Group__0 : rule__Syntax__Group__0__Impl rule__Syntax__Group__1 ;
    public final void rule__Syntax__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2134:1: ( rule__Syntax__Group__0__Impl rule__Syntax__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2135:2: rule__Syntax__Group__0__Impl rule__Syntax__Group__1
            {
            pushFollow(FOLLOW_rule__Syntax__Group__0__Impl_in_rule__Syntax__Group__04738);
            rule__Syntax__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Syntax__Group__1_in_rule__Syntax__Group__04741);
            rule__Syntax__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group__0"


    // $ANTLR start "rule__Syntax__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2142:1: rule__Syntax__Group__0__Impl : ( 'syntax' ) ;
    public final void rule__Syntax__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2146:1: ( ( 'syntax' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2147:1: ( 'syntax' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2147:1: ( 'syntax' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2148:1: 'syntax'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getSyntaxKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Syntax__Group__0__Impl4769); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSyntaxAccess().getSyntaxKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group__0__Impl"


    // $ANTLR start "rule__Syntax__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2161:1: rule__Syntax__Group__1 : rule__Syntax__Group__1__Impl rule__Syntax__Group__2 ;
    public final void rule__Syntax__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2165:1: ( rule__Syntax__Group__1__Impl rule__Syntax__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2166:2: rule__Syntax__Group__1__Impl rule__Syntax__Group__2
            {
            pushFollow(FOLLOW_rule__Syntax__Group__1__Impl_in_rule__Syntax__Group__14800);
            rule__Syntax__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Syntax__Group__2_in_rule__Syntax__Group__14803);
            rule__Syntax__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group__1"


    // $ANTLR start "rule__Syntax__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2173:1: rule__Syntax__Group__1__Impl : ( '=' ) ;
    public final void rule__Syntax__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2177:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2178:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2178:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2179:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getEqualsSignKeyword_1()); 
            }
            match(input,49,FOLLOW_49_in_rule__Syntax__Group__1__Impl4831); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSyntaxAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group__1__Impl"


    // $ANTLR start "rule__Syntax__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2192:1: rule__Syntax__Group__2 : rule__Syntax__Group__2__Impl rule__Syntax__Group__3 ;
    public final void rule__Syntax__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2196:1: ( rule__Syntax__Group__2__Impl rule__Syntax__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2197:2: rule__Syntax__Group__2__Impl rule__Syntax__Group__3
            {
            pushFollow(FOLLOW_rule__Syntax__Group__2__Impl_in_rule__Syntax__Group__24862);
            rule__Syntax__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Syntax__Group__3_in_rule__Syntax__Group__24865);
            rule__Syntax__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group__2"


    // $ANTLR start "rule__Syntax__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2204:1: rule__Syntax__Group__2__Impl : ( ( rule__Syntax__NameAssignment_2 ) ) ;
    public final void rule__Syntax__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2208:1: ( ( ( rule__Syntax__NameAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2209:1: ( ( rule__Syntax__NameAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2209:1: ( ( rule__Syntax__NameAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2210:1: ( rule__Syntax__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getNameAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2211:1: ( rule__Syntax__NameAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2211:2: rule__Syntax__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Syntax__NameAssignment_2_in_rule__Syntax__Group__2__Impl4892);
            rule__Syntax__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSyntaxAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group__2__Impl"


    // $ANTLR start "rule__Syntax__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2221:1: rule__Syntax__Group__3 : rule__Syntax__Group__3__Impl ;
    public final void rule__Syntax__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2225:1: ( rule__Syntax__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2226:2: rule__Syntax__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Syntax__Group__3__Impl_in_rule__Syntax__Group__34922);
            rule__Syntax__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group__3"


    // $ANTLR start "rule__Syntax__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2232:1: rule__Syntax__Group__3__Impl : ( ';' ) ;
    public final void rule__Syntax__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2236:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2237:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2237:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2238:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getSemicolonKeyword_3()); 
            }
            match(input,50,FOLLOW_50_in_rule__Syntax__Group__3__Impl4950); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSyntaxAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2259:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2263:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2264:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__04989);
            rule__Package__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__04992);
            rule__Package__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2271:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2275:1: ( ( 'package' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2276:1: ( 'package' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2276:1: ( 'package' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2277:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Package__Group__0__Impl5020); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2290:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2294:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2295:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__15051);
            rule__Package__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__15054);
            rule__Package__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2302:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2306:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2307:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2307:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2308:1: ( rule__Package__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2309:1: ( rule__Package__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2309:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl5081);
            rule__Package__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2319:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2323:1: ( rule__Package__Group__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2324:2: rule__Package__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__25111);
            rule__Package__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2330:1: rule__Package__Group__2__Impl : ( ';' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2334:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2335:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2335:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2336:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getSemicolonKeyword_2()); 
            }
            match(input,50,FOLLOW_50_in_rule__Package__Group__2__Impl5139); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2355:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2359:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2360:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__05176);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__05179);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2367:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2371:1: ( ( 'import' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2372:1: ( 'import' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2372:1: ( 'import' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2373:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Import__Group__0__Impl5207); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2386:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2390:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2391:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__15238);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__15241);
            rule__Import__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2398:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2402:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2403:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2403:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2404:1: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2405:1: ( rule__Import__ImportURIAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2405:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl5268);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2415:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2419:1: ( rule__Import__Group__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2420:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__25298);
            rule__Import__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2426:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2430:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2431:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2431:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2432:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            }
            match(input,50,FOLLOW_50_in_rule__Import__Group__2__Impl5326); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Option__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2451:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2455:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2456:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__05363);
            rule__Option__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Option__Group__1_in_rule__Option__Group__05366);
            rule__Option__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0"


    // $ANTLR start "rule__Option__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2463:1: rule__Option__Group__0__Impl : ( 'option' ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2467:1: ( ( 'option' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2468:1: ( 'option' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2468:1: ( 'option' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2469:1: 'option'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getOptionKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Option__Group__0__Impl5394); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getOptionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0__Impl"


    // $ANTLR start "rule__Option__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2482:1: rule__Option__Group__1 : rule__Option__Group__1__Impl rule__Option__Group__2 ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2486:1: ( rule__Option__Group__1__Impl rule__Option__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2487:2: rule__Option__Group__1__Impl rule__Option__Group__2
            {
            pushFollow(FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__15425);
            rule__Option__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Option__Group__2_in_rule__Option__Group__15428);
            rule__Option__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__1"


    // $ANTLR start "rule__Option__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2494:1: rule__Option__Group__1__Impl : ( ( rule__Option__SourceAssignment_1 ) ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2498:1: ( ( ( rule__Option__SourceAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2499:1: ( ( rule__Option__SourceAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2499:1: ( ( rule__Option__SourceAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2500:1: ( rule__Option__SourceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getSourceAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2501:1: ( rule__Option__SourceAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2501:2: rule__Option__SourceAssignment_1
            {
            pushFollow(FOLLOW_rule__Option__SourceAssignment_1_in_rule__Option__Group__1__Impl5455);
            rule__Option__SourceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getSourceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__1__Impl"


    // $ANTLR start "rule__Option__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2511:1: rule__Option__Group__2 : rule__Option__Group__2__Impl rule__Option__Group__3 ;
    public final void rule__Option__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2515:1: ( rule__Option__Group__2__Impl rule__Option__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2516:2: rule__Option__Group__2__Impl rule__Option__Group__3
            {
            pushFollow(FOLLOW_rule__Option__Group__2__Impl_in_rule__Option__Group__25485);
            rule__Option__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Option__Group__3_in_rule__Option__Group__25488);
            rule__Option__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__2"


    // $ANTLR start "rule__Option__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2523:1: rule__Option__Group__2__Impl : ( '=' ) ;
    public final void rule__Option__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2527:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2528:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2528:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2529:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getEqualsSignKeyword_2()); 
            }
            match(input,49,FOLLOW_49_in_rule__Option__Group__2__Impl5516); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__2__Impl"


    // $ANTLR start "rule__Option__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2542:1: rule__Option__Group__3 : rule__Option__Group__3__Impl rule__Option__Group__4 ;
    public final void rule__Option__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2546:1: ( rule__Option__Group__3__Impl rule__Option__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2547:2: rule__Option__Group__3__Impl rule__Option__Group__4
            {
            pushFollow(FOLLOW_rule__Option__Group__3__Impl_in_rule__Option__Group__35547);
            rule__Option__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Option__Group__4_in_rule__Option__Group__35550);
            rule__Option__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__3"


    // $ANTLR start "rule__Option__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2554:1: rule__Option__Group__3__Impl : ( ( rule__Option__ValueAssignment_3 ) ) ;
    public final void rule__Option__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2558:1: ( ( ( rule__Option__ValueAssignment_3 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2559:1: ( ( rule__Option__ValueAssignment_3 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2559:1: ( ( rule__Option__ValueAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2560:1: ( rule__Option__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getValueAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2561:1: ( rule__Option__ValueAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2561:2: rule__Option__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Option__ValueAssignment_3_in_rule__Option__Group__3__Impl5577);
            rule__Option__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getValueAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__3__Impl"


    // $ANTLR start "rule__Option__Group__4"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2571:1: rule__Option__Group__4 : rule__Option__Group__4__Impl ;
    public final void rule__Option__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2575:1: ( rule__Option__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2576:2: rule__Option__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Option__Group__4__Impl_in_rule__Option__Group__45607);
            rule__Option__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__4"


    // $ANTLR start "rule__Option__Group__4__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2582:1: rule__Option__Group__4__Impl : ( ';' ) ;
    public final void rule__Option__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2586:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2587:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2587:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2588:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getSemicolonKeyword_4()); 
            }
            match(input,50,FOLLOW_50_in_rule__Option__Group__4__Impl5635); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__4__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2611:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2615:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2616:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__05676);
            rule__Message__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__05679);
            rule__Message__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2623:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2627:1: ( ( 'message' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2628:1: ( 'message' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2628:1: ( 'message' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2629:1: 'message'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMessageKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Message__Group__0__Impl5707); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getMessageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2642:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2646:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2647:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__15738);
            rule__Message__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__2_in_rule__Message__Group__15741);
            rule__Message__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2654:1: rule__Message__Group__1__Impl : ( ( rule__Message__NameAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2658:1: ( ( ( rule__Message__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2659:1: ( ( rule__Message__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2659:1: ( ( rule__Message__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2660:1: ( rule__Message__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2661:1: ( rule__Message__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2661:2: rule__Message__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Message__NameAssignment_1_in_rule__Message__Group__1__Impl5768);
            rule__Message__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2671:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2675:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2676:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__25798);
            rule__Message__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__3_in_rule__Message__Group__25801);
            rule__Message__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2"


    // $ANTLR start "rule__Message__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2683:1: rule__Message__Group__2__Impl : ( '{' ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2687:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2688:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2688:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2689:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,51,FOLLOW_51_in_rule__Message__Group__2__Impl5829); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2__Impl"


    // $ANTLR start "rule__Message__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2702:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2706:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2707:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__35860);
            rule__Message__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__4_in_rule__Message__Group__35863);
            rule__Message__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__3"


    // $ANTLR start "rule__Message__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2714:1: rule__Message__Group__3__Impl : ( ( rule__Message__ElementsAssignment_3 )* ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2718:1: ( ( ( rule__Message__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2719:1: ( ( rule__Message__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2719:1: ( ( rule__Message__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2720:1: ( rule__Message__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2721:1: ( rule__Message__ElementsAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=17 && LA20_0<=25)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2721:2: rule__Message__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Message__ElementsAssignment_3_in_rule__Message__Group__3__Impl5890);
            	    rule__Message__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getElementsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__3__Impl"


    // $ANTLR start "rule__Message__Group__4"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2731:1: rule__Message__Group__4 : rule__Message__Group__4__Impl ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2735:1: ( rule__Message__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2736:2: rule__Message__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__45921);
            rule__Message__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__4"


    // $ANTLR start "rule__Message__Group__4__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2742:1: rule__Message__Group__4__Impl : ( '}' ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2746:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2747:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2747:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2748:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,52,FOLLOW_52_in_rule__Message__Group__4__Impl5949); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__4__Impl"


    // $ANTLR start "rule__ExtensionRange__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2771:1: rule__ExtensionRange__Group__0 : rule__ExtensionRange__Group__0__Impl rule__ExtensionRange__Group__1 ;
    public final void rule__ExtensionRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2775:1: ( rule__ExtensionRange__Group__0__Impl rule__ExtensionRange__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2776:2: rule__ExtensionRange__Group__0__Impl rule__ExtensionRange__Group__1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__0__Impl_in_rule__ExtensionRange__Group__05990);
            rule__ExtensionRange__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group__1_in_rule__ExtensionRange__Group__05993);
            rule__ExtensionRange__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionRange__Group__0"


    // $ANTLR start "rule__ExtensionRange__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2783:1: rule__ExtensionRange__Group__0__Impl : ( 'extensions' ) ;
    public final void rule__ExtensionRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2787:1: ( ( 'extensions' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2788:1: ( 'extensions' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2788:1: ( 'extensions' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2789:1: 'extensions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getExtensionsKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__ExtensionRange__Group__0__Impl6021); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeAccess().getExtensionsKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionRange__Group__0__Impl"


    // $ANTLR start "rule__ExtensionRange__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2802:1: rule__ExtensionRange__Group__1 : rule__ExtensionRange__Group__1__Impl rule__ExtensionRange__Group__2 ;
    public final void rule__ExtensionRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2806:1: ( rule__ExtensionRange__Group__1__Impl rule__ExtensionRange__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2807:2: rule__ExtensionRange__Group__1__Impl rule__ExtensionRange__Group__2
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__1__Impl_in_rule__ExtensionRange__Group__16052);
            rule__ExtensionRange__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group__2_in_rule__ExtensionRange__Group__16055);
            rule__ExtensionRange__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionRange__Group__1"


    // $ANTLR start "rule__ExtensionRange__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2814:1: rule__ExtensionRange__Group__1__Impl : ( ( rule__ExtensionRange__FromAssignment_1 ) ) ;
    public final void rule__ExtensionRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2818:1: ( ( ( rule__ExtensionRange__FromAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2819:1: ( ( rule__ExtensionRange__FromAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2819:1: ( ( rule__ExtensionRange__FromAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2820:1: ( rule__ExtensionRange__FromAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getFromAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2821:1: ( rule__ExtensionRange__FromAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2821:2: rule__ExtensionRange__FromAssignment_1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__FromAssignment_1_in_rule__ExtensionRange__Group__1__Impl6082);
            rule__ExtensionRange__FromAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeAccess().getFromAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionRange__Group__1__Impl"


    // $ANTLR start "rule__ExtensionRange__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2831:1: rule__ExtensionRange__Group__2 : rule__ExtensionRange__Group__2__Impl rule__ExtensionRange__Group__3 ;
    public final void rule__ExtensionRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2835:1: ( rule__ExtensionRange__Group__2__Impl rule__ExtensionRange__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2836:2: rule__ExtensionRange__Group__2__Impl rule__ExtensionRange__Group__3
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__2__Impl_in_rule__ExtensionRange__Group__26112);
            rule__ExtensionRange__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group__3_in_rule__ExtensionRange__Group__26115);
            rule__ExtensionRange__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionRange__Group__2"


    // $ANTLR start "rule__ExtensionRange__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2843:1: rule__ExtensionRange__Group__2__Impl : ( ( rule__ExtensionRange__Group_2__0 )? ) ;
    public final void rule__ExtensionRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2847:1: ( ( ( rule__ExtensionRange__Group_2__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2848:1: ( ( rule__ExtensionRange__Group_2__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2848:1: ( ( rule__ExtensionRange__Group_2__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2849:1: ( rule__ExtensionRange__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getGroup_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2850:1: ( rule__ExtensionRange__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==13) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2850:2: rule__ExtensionRange__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ExtensionRange__Group_2__0_in_rule__ExtensionRange__Group__2__Impl6142);
                    rule__ExtensionRange__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionRange__Group__2__Impl"


    // $ANTLR start "rule__ExtensionRange__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2860:1: rule__ExtensionRange__Group__3 : rule__ExtensionRange__Group__3__Impl ;
    public final void rule__ExtensionRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2864:1: ( rule__ExtensionRange__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2865:2: rule__ExtensionRange__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__3__Impl_in_rule__ExtensionRange__Group__36173);
            rule__ExtensionRange__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionRange__Group__3"


    // $ANTLR start "rule__ExtensionRange__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2871:1: rule__ExtensionRange__Group__3__Impl : ( ';' ) ;
    public final void rule__ExtensionRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2875:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2876:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2876:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2877:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getSemicolonKeyword_3()); 
            }
            match(input,50,FOLLOW_50_in_rule__ExtensionRange__Group__3__Impl6201); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionRange__Group__3__Impl"


    // $ANTLR start "rule__ExtensionRange__Group_2__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2898:1: rule__ExtensionRange__Group_2__0 : rule__ExtensionRange__Group_2__0__Impl rule__ExtensionRange__Group_2__1 ;
    public final void rule__ExtensionRange__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2902:1: ( rule__ExtensionRange__Group_2__0__Impl rule__ExtensionRange__Group_2__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2903:2: rule__ExtensionRange__Group_2__0__Impl rule__ExtensionRange__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group_2__0__Impl_in_rule__ExtensionRange__Group_2__06240);
            rule__ExtensionRange__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group_2__1_in_rule__ExtensionRange__Group_2__06243);
            rule__ExtensionRange__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionRange__Group_2__0"


    // $ANTLR start "rule__ExtensionRange__Group_2__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2910:1: rule__ExtensionRange__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__ExtensionRange__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2914:1: ( ( 'to' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2915:1: ( 'to' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2915:1: ( 'to' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2916:1: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getToKeyword_2_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__ExtensionRange__Group_2__0__Impl6271); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeAccess().getToKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionRange__Group_2__0__Impl"


    // $ANTLR start "rule__ExtensionRange__Group_2__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2929:1: rule__ExtensionRange__Group_2__1 : rule__ExtensionRange__Group_2__1__Impl ;
    public final void rule__ExtensionRange__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2933:1: ( rule__ExtensionRange__Group_2__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2934:2: rule__ExtensionRange__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group_2__1__Impl_in_rule__ExtensionRange__Group_2__16302);
            rule__ExtensionRange__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionRange__Group_2__1"


    // $ANTLR start "rule__ExtensionRange__Group_2__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2940:1: rule__ExtensionRange__Group_2__1__Impl : ( ( rule__ExtensionRange__ToAssignment_2_1 ) ) ;
    public final void rule__ExtensionRange__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2944:1: ( ( ( rule__ExtensionRange__ToAssignment_2_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2945:1: ( ( rule__ExtensionRange__ToAssignment_2_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2945:1: ( ( rule__ExtensionRange__ToAssignment_2_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2946:1: ( rule__ExtensionRange__ToAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getToAssignment_2_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2947:1: ( rule__ExtensionRange__ToAssignment_2_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2947:2: rule__ExtensionRange__ToAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__ToAssignment_2_1_in_rule__ExtensionRange__Group_2__1__Impl6329);
            rule__ExtensionRange__ToAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeAccess().getToAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionRange__Group_2__1__Impl"


    // $ANTLR start "rule__MessageField__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2961:1: rule__MessageField__Group__0 : rule__MessageField__Group__0__Impl rule__MessageField__Group__1 ;
    public final void rule__MessageField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2965:1: ( rule__MessageField__Group__0__Impl rule__MessageField__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2966:2: rule__MessageField__Group__0__Impl rule__MessageField__Group__1
            {
            pushFollow(FOLLOW_rule__MessageField__Group__0__Impl_in_rule__MessageField__Group__06363);
            rule__MessageField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__1_in_rule__MessageField__Group__06366);
            rule__MessageField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__Group__0"


    // $ANTLR start "rule__MessageField__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2973:1: rule__MessageField__Group__0__Impl : ( ( rule__MessageField__ModifierAssignment_0 ) ) ;
    public final void rule__MessageField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2977:1: ( ( ( rule__MessageField__ModifierAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2978:1: ( ( rule__MessageField__ModifierAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2978:1: ( ( rule__MessageField__ModifierAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2979:1: ( rule__MessageField__ModifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getModifierAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2980:1: ( rule__MessageField__ModifierAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2980:2: rule__MessageField__ModifierAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageField__ModifierAssignment_0_in_rule__MessageField__Group__0__Impl6393);
            rule__MessageField__ModifierAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldAccess().getModifierAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__Group__0__Impl"


    // $ANTLR start "rule__MessageField__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2990:1: rule__MessageField__Group__1 : rule__MessageField__Group__1__Impl rule__MessageField__Group__2 ;
    public final void rule__MessageField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2994:1: ( rule__MessageField__Group__1__Impl rule__MessageField__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2995:2: rule__MessageField__Group__1__Impl rule__MessageField__Group__2
            {
            pushFollow(FOLLOW_rule__MessageField__Group__1__Impl_in_rule__MessageField__Group__16423);
            rule__MessageField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__2_in_rule__MessageField__Group__16426);
            rule__MessageField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__Group__1"


    // $ANTLR start "rule__MessageField__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3002:1: rule__MessageField__Group__1__Impl : ( ( rule__MessageField__TypeAssignment_1 ) ) ;
    public final void rule__MessageField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3006:1: ( ( ( rule__MessageField__TypeAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3007:1: ( ( rule__MessageField__TypeAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3007:1: ( ( rule__MessageField__TypeAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3008:1: ( rule__MessageField__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getTypeAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3009:1: ( rule__MessageField__TypeAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3009:2: rule__MessageField__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MessageField__TypeAssignment_1_in_rule__MessageField__Group__1__Impl6453);
            rule__MessageField__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__Group__1__Impl"


    // $ANTLR start "rule__MessageField__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3019:1: rule__MessageField__Group__2 : rule__MessageField__Group__2__Impl rule__MessageField__Group__3 ;
    public final void rule__MessageField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3023:1: ( rule__MessageField__Group__2__Impl rule__MessageField__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3024:2: rule__MessageField__Group__2__Impl rule__MessageField__Group__3
            {
            pushFollow(FOLLOW_rule__MessageField__Group__2__Impl_in_rule__MessageField__Group__26483);
            rule__MessageField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__3_in_rule__MessageField__Group__26486);
            rule__MessageField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__Group__2"


    // $ANTLR start "rule__MessageField__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3031:1: rule__MessageField__Group__2__Impl : ( ( rule__MessageField__NameAssignment_2 ) ) ;
    public final void rule__MessageField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3035:1: ( ( ( rule__MessageField__NameAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3036:1: ( ( rule__MessageField__NameAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3036:1: ( ( rule__MessageField__NameAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3037:1: ( rule__MessageField__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getNameAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3038:1: ( rule__MessageField__NameAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3038:2: rule__MessageField__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MessageField__NameAssignment_2_in_rule__MessageField__Group__2__Impl6513);
            rule__MessageField__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__Group__2__Impl"


    // $ANTLR start "rule__MessageField__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3048:1: rule__MessageField__Group__3 : rule__MessageField__Group__3__Impl rule__MessageField__Group__4 ;
    public final void rule__MessageField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3052:1: ( rule__MessageField__Group__3__Impl rule__MessageField__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3053:2: rule__MessageField__Group__3__Impl rule__MessageField__Group__4
            {
            pushFollow(FOLLOW_rule__MessageField__Group__3__Impl_in_rule__MessageField__Group__36543);
            rule__MessageField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__4_in_rule__MessageField__Group__36546);
            rule__MessageField__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__Group__3"


    // $ANTLR start "rule__MessageField__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3060:1: rule__MessageField__Group__3__Impl : ( '=' ) ;
    public final void rule__MessageField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3064:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3065:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3065:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3066:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getEqualsSignKeyword_3()); 
            }
            match(input,49,FOLLOW_49_in_rule__MessageField__Group__3__Impl6574); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldAccess().getEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__Group__3__Impl"


    // $ANTLR start "rule__MessageField__Group__4"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3079:1: rule__MessageField__Group__4 : rule__MessageField__Group__4__Impl rule__MessageField__Group__5 ;
    public final void rule__MessageField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3083:1: ( rule__MessageField__Group__4__Impl rule__MessageField__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3084:2: rule__MessageField__Group__4__Impl rule__MessageField__Group__5
            {
            pushFollow(FOLLOW_rule__MessageField__Group__4__Impl_in_rule__MessageField__Group__46605);
            rule__MessageField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__5_in_rule__MessageField__Group__46608);
            rule__MessageField__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__Group__4"


    // $ANTLR start "rule__MessageField__Group__4__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3091:1: rule__MessageField__Group__4__Impl : ( ( rule__MessageField__IndexAssignment_4 ) ) ;
    public final void rule__MessageField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3095:1: ( ( ( rule__MessageField__IndexAssignment_4 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3096:1: ( ( rule__MessageField__IndexAssignment_4 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3096:1: ( ( rule__MessageField__IndexAssignment_4 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3097:1: ( rule__MessageField__IndexAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getIndexAssignment_4()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3098:1: ( rule__MessageField__IndexAssignment_4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3098:2: rule__MessageField__IndexAssignment_4
            {
            pushFollow(FOLLOW_rule__MessageField__IndexAssignment_4_in_rule__MessageField__Group__4__Impl6635);
            rule__MessageField__IndexAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldAccess().getIndexAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__Group__4__Impl"


    // $ANTLR start "rule__MessageField__Group__5"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3108:1: rule__MessageField__Group__5 : rule__MessageField__Group__5__Impl rule__MessageField__Group__6 ;
    public final void rule__MessageField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3112:1: ( rule__MessageField__Group__5__Impl rule__MessageField__Group__6 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3113:2: rule__MessageField__Group__5__Impl rule__MessageField__Group__6
            {
            pushFollow(FOLLOW_rule__MessageField__Group__5__Impl_in_rule__MessageField__Group__56665);
            rule__MessageField__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__6_in_rule__MessageField__Group__56668);
            rule__MessageField__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__Group__5"


    // $ANTLR start "rule__MessageField__Group__5__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3120:1: rule__MessageField__Group__5__Impl : ( ( rule__MessageField__OptionsAssignment_5 )? ) ;
    public final void rule__MessageField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3124:1: ( ( ( rule__MessageField__OptionsAssignment_5 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3125:1: ( ( rule__MessageField__OptionsAssignment_5 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3125:1: ( ( rule__MessageField__OptionsAssignment_5 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3126:1: ( rule__MessageField__OptionsAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getOptionsAssignment_5()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3127:1: ( rule__MessageField__OptionsAssignment_5 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==53) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3127:2: rule__MessageField__OptionsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__MessageField__OptionsAssignment_5_in_rule__MessageField__Group__5__Impl6695);
                    rule__MessageField__OptionsAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldAccess().getOptionsAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__Group__5__Impl"


    // $ANTLR start "rule__MessageField__Group__6"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3137:1: rule__MessageField__Group__6 : rule__MessageField__Group__6__Impl ;
    public final void rule__MessageField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3141:1: ( rule__MessageField__Group__6__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3142:2: rule__MessageField__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MessageField__Group__6__Impl_in_rule__MessageField__Group__66726);
            rule__MessageField__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__Group__6"


    // $ANTLR start "rule__MessageField__Group__6__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3148:1: rule__MessageField__Group__6__Impl : ( ';' ) ;
    public final void rule__MessageField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3152:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3153:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3153:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3154:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getSemicolonKeyword_6()); 
            }
            match(input,50,FOLLOW_50_in_rule__MessageField__Group__6__Impl6754); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__Group__6__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3181:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3185:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3186:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__06799);
            rule__Group__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__1_in_rule__Group__Group__06802);
            rule__Group__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3193:1: rule__Group__Group__0__Impl : ( ( rule__Group__ModifierAssignment_0 ) ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3197:1: ( ( ( rule__Group__ModifierAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3198:1: ( ( rule__Group__ModifierAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3198:1: ( ( rule__Group__ModifierAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3199:1: ( rule__Group__ModifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getModifierAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3200:1: ( rule__Group__ModifierAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3200:2: rule__Group__ModifierAssignment_0
            {
            pushFollow(FOLLOW_rule__Group__ModifierAssignment_0_in_rule__Group__Group__0__Impl6829);
            rule__Group__ModifierAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getModifierAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3210:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3214:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3215:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__16859);
            rule__Group__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__2_in_rule__Group__Group__16862);
            rule__Group__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3222:1: rule__Group__Group__1__Impl : ( 'group' ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3226:1: ( ( 'group' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3227:1: ( 'group' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3227:1: ( 'group' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3228:1: 'group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getGroupKeyword_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Group__Group__1__Impl6890); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getGroupKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3241:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3245:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3246:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__26921);
            rule__Group__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__3_in_rule__Group__Group__26924);
            rule__Group__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3253:1: rule__Group__Group__2__Impl : ( ( rule__Group__NameAssignment_2 ) ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3257:1: ( ( ( rule__Group__NameAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3258:1: ( ( rule__Group__NameAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3258:1: ( ( rule__Group__NameAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3259:1: ( rule__Group__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getNameAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3260:1: ( rule__Group__NameAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3260:2: rule__Group__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl6951);
            rule__Group__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3270:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3274:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3275:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__36981);
            rule__Group__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__4_in_rule__Group__Group__36984);
            rule__Group__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3"


    // $ANTLR start "rule__Group__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3282:1: rule__Group__Group__3__Impl : ( '=' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3286:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3287:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3287:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3288:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getEqualsSignKeyword_3()); 
            }
            match(input,49,FOLLOW_49_in_rule__Group__Group__3__Impl7012); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3__Impl"


    // $ANTLR start "rule__Group__Group__4"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3301:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3305:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3306:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__47043);
            rule__Group__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__5_in_rule__Group__Group__47046);
            rule__Group__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4"


    // $ANTLR start "rule__Group__Group__4__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3313:1: rule__Group__Group__4__Impl : ( ( rule__Group__IndexAssignment_4 ) ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3317:1: ( ( ( rule__Group__IndexAssignment_4 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3318:1: ( ( rule__Group__IndexAssignment_4 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3318:1: ( ( rule__Group__IndexAssignment_4 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3319:1: ( rule__Group__IndexAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getIndexAssignment_4()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3320:1: ( rule__Group__IndexAssignment_4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3320:2: rule__Group__IndexAssignment_4
            {
            pushFollow(FOLLOW_rule__Group__IndexAssignment_4_in_rule__Group__Group__4__Impl7073);
            rule__Group__IndexAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getIndexAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4__Impl"


    // $ANTLR start "rule__Group__Group__5"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3330:1: rule__Group__Group__5 : rule__Group__Group__5__Impl rule__Group__Group__6 ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3334:1: ( rule__Group__Group__5__Impl rule__Group__Group__6 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3335:2: rule__Group__Group__5__Impl rule__Group__Group__6
            {
            pushFollow(FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__57103);
            rule__Group__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__6_in_rule__Group__Group__57106);
            rule__Group__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5"


    // $ANTLR start "rule__Group__Group__5__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3342:1: rule__Group__Group__5__Impl : ( '{' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3346:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3347:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3347:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3348:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,51,FOLLOW_51_in_rule__Group__Group__5__Impl7134); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5__Impl"


    // $ANTLR start "rule__Group__Group__6"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3361:1: rule__Group__Group__6 : rule__Group__Group__6__Impl rule__Group__Group__7 ;
    public final void rule__Group__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3365:1: ( rule__Group__Group__6__Impl rule__Group__Group__7 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3366:2: rule__Group__Group__6__Impl rule__Group__Group__7
            {
            pushFollow(FOLLOW_rule__Group__Group__6__Impl_in_rule__Group__Group__67165);
            rule__Group__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__7_in_rule__Group__Group__67168);
            rule__Group__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__6"


    // $ANTLR start "rule__Group__Group__6__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3373:1: rule__Group__Group__6__Impl : ( ( rule__Group__ElementsAssignment_6 )* ) ;
    public final void rule__Group__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3377:1: ( ( ( rule__Group__ElementsAssignment_6 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3378:1: ( ( rule__Group__ElementsAssignment_6 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3378:1: ( ( rule__Group__ElementsAssignment_6 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3379:1: ( rule__Group__ElementsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getElementsAssignment_6()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3380:1: ( rule__Group__ElementsAssignment_6 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=21 && LA23_0<=23)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3380:2: rule__Group__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Group__ElementsAssignment_6_in_rule__Group__Group__6__Impl7195);
            	    rule__Group__ElementsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getElementsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__6__Impl"


    // $ANTLR start "rule__Group__Group__7"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3390:1: rule__Group__Group__7 : rule__Group__Group__7__Impl ;
    public final void rule__Group__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3394:1: ( rule__Group__Group__7__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3395:2: rule__Group__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Group__Group__7__Impl_in_rule__Group__Group__77226);
            rule__Group__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__7"


    // $ANTLR start "rule__Group__Group__7__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3401:1: rule__Group__Group__7__Impl : ( '}' ) ;
    public final void rule__Group__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3405:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3406:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3406:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3407:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,52,FOLLOW_52_in_rule__Group__Group__7__Impl7254); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__7__Impl"


    // $ANTLR start "rule__FieldOptions__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3436:1: rule__FieldOptions__Group__0 : rule__FieldOptions__Group__0__Impl rule__FieldOptions__Group__1 ;
    public final void rule__FieldOptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3440:1: ( rule__FieldOptions__Group__0__Impl rule__FieldOptions__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3441:2: rule__FieldOptions__Group__0__Impl rule__FieldOptions__Group__1
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__0__Impl_in_rule__FieldOptions__Group__07301);
            rule__FieldOptions__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group__1_in_rule__FieldOptions__Group__07304);
            rule__FieldOptions__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptions__Group__0"


    // $ANTLR start "rule__FieldOptions__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3448:1: rule__FieldOptions__Group__0__Impl : ( '[' ) ;
    public final void rule__FieldOptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3452:1: ( ( '[' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3453:1: ( '[' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3453:1: ( '[' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3454:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,53,FOLLOW_53_in_rule__FieldOptions__Group__0__Impl7332); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionsAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptions__Group__0__Impl"


    // $ANTLR start "rule__FieldOptions__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3467:1: rule__FieldOptions__Group__1 : rule__FieldOptions__Group__1__Impl rule__FieldOptions__Group__2 ;
    public final void rule__FieldOptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3471:1: ( rule__FieldOptions__Group__1__Impl rule__FieldOptions__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3472:2: rule__FieldOptions__Group__1__Impl rule__FieldOptions__Group__2
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__1__Impl_in_rule__FieldOptions__Group__17363);
            rule__FieldOptions__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group__2_in_rule__FieldOptions__Group__17366);
            rule__FieldOptions__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptions__Group__1"


    // $ANTLR start "rule__FieldOptions__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3479:1: rule__FieldOptions__Group__1__Impl : ( ( rule__FieldOptions__OptionsAssignment_1 ) ) ;
    public final void rule__FieldOptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3483:1: ( ( ( rule__FieldOptions__OptionsAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3484:1: ( ( rule__FieldOptions__OptionsAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3484:1: ( ( rule__FieldOptions__OptionsAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3485:1: ( rule__FieldOptions__OptionsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3486:1: ( rule__FieldOptions__OptionsAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3486:2: rule__FieldOptions__OptionsAssignment_1
            {
            pushFollow(FOLLOW_rule__FieldOptions__OptionsAssignment_1_in_rule__FieldOptions__Group__1__Impl7393);
            rule__FieldOptions__OptionsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionsAccess().getOptionsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptions__Group__1__Impl"


    // $ANTLR start "rule__FieldOptions__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3496:1: rule__FieldOptions__Group__2 : rule__FieldOptions__Group__2__Impl rule__FieldOptions__Group__3 ;
    public final void rule__FieldOptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3500:1: ( rule__FieldOptions__Group__2__Impl rule__FieldOptions__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3501:2: rule__FieldOptions__Group__2__Impl rule__FieldOptions__Group__3
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__2__Impl_in_rule__FieldOptions__Group__27423);
            rule__FieldOptions__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group__3_in_rule__FieldOptions__Group__27426);
            rule__FieldOptions__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptions__Group__2"


    // $ANTLR start "rule__FieldOptions__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3508:1: rule__FieldOptions__Group__2__Impl : ( ( rule__FieldOptions__Group_2__0 )* ) ;
    public final void rule__FieldOptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3512:1: ( ( ( rule__FieldOptions__Group_2__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3513:1: ( ( rule__FieldOptions__Group_2__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3513:1: ( ( rule__FieldOptions__Group_2__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3514:1: ( rule__FieldOptions__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getGroup_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3515:1: ( rule__FieldOptions__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==55) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3515:2: rule__FieldOptions__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FieldOptions__Group_2__0_in_rule__FieldOptions__Group__2__Impl7453);
            	    rule__FieldOptions__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionsAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptions__Group__2__Impl"


    // $ANTLR start "rule__FieldOptions__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3525:1: rule__FieldOptions__Group__3 : rule__FieldOptions__Group__3__Impl ;
    public final void rule__FieldOptions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3529:1: ( rule__FieldOptions__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3530:2: rule__FieldOptions__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__3__Impl_in_rule__FieldOptions__Group__37484);
            rule__FieldOptions__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptions__Group__3"


    // $ANTLR start "rule__FieldOptions__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3536:1: rule__FieldOptions__Group__3__Impl : ( ']' ) ;
    public final void rule__FieldOptions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3540:1: ( ( ']' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3541:1: ( ']' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3541:1: ( ']' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3542:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,54,FOLLOW_54_in_rule__FieldOptions__Group__3__Impl7512); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionsAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptions__Group__3__Impl"


    // $ANTLR start "rule__FieldOptions__Group_2__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3563:1: rule__FieldOptions__Group_2__0 : rule__FieldOptions__Group_2__0__Impl rule__FieldOptions__Group_2__1 ;
    public final void rule__FieldOptions__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3567:1: ( rule__FieldOptions__Group_2__0__Impl rule__FieldOptions__Group_2__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3568:2: rule__FieldOptions__Group_2__0__Impl rule__FieldOptions__Group_2__1
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group_2__0__Impl_in_rule__FieldOptions__Group_2__07551);
            rule__FieldOptions__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group_2__1_in_rule__FieldOptions__Group_2__07554);
            rule__FieldOptions__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptions__Group_2__0"


    // $ANTLR start "rule__FieldOptions__Group_2__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3575:1: rule__FieldOptions__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FieldOptions__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3579:1: ( ( ',' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3580:1: ( ',' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3580:1: ( ',' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3581:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getCommaKeyword_2_0()); 
            }
            match(input,55,FOLLOW_55_in_rule__FieldOptions__Group_2__0__Impl7582); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionsAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptions__Group_2__0__Impl"


    // $ANTLR start "rule__FieldOptions__Group_2__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3594:1: rule__FieldOptions__Group_2__1 : rule__FieldOptions__Group_2__1__Impl ;
    public final void rule__FieldOptions__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3598:1: ( rule__FieldOptions__Group_2__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3599:2: rule__FieldOptions__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group_2__1__Impl_in_rule__FieldOptions__Group_2__17613);
            rule__FieldOptions__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptions__Group_2__1"


    // $ANTLR start "rule__FieldOptions__Group_2__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3605:1: rule__FieldOptions__Group_2__1__Impl : ( ( rule__FieldOptions__OptionsAssignment_2_1 ) ) ;
    public final void rule__FieldOptions__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3609:1: ( ( ( rule__FieldOptions__OptionsAssignment_2_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3610:1: ( ( rule__FieldOptions__OptionsAssignment_2_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3610:1: ( ( rule__FieldOptions__OptionsAssignment_2_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3611:1: ( rule__FieldOptions__OptionsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsAssignment_2_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3612:1: ( rule__FieldOptions__OptionsAssignment_2_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3612:2: rule__FieldOptions__OptionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FieldOptions__OptionsAssignment_2_1_in_rule__FieldOptions__Group_2__1__Impl7640);
            rule__FieldOptions__OptionsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionsAccess().getOptionsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptions__Group_2__1__Impl"


    // $ANTLR start "rule__DefaultValueFieldOption__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3626:1: rule__DefaultValueFieldOption__Group__0 : rule__DefaultValueFieldOption__Group__0__Impl rule__DefaultValueFieldOption__Group__1 ;
    public final void rule__DefaultValueFieldOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3630:1: ( rule__DefaultValueFieldOption__Group__0__Impl rule__DefaultValueFieldOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3631:2: rule__DefaultValueFieldOption__Group__0__Impl rule__DefaultValueFieldOption__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__0__Impl_in_rule__DefaultValueFieldOption__Group__07674);
            rule__DefaultValueFieldOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__1_in_rule__DefaultValueFieldOption__Group__07677);
            rule__DefaultValueFieldOption__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValueFieldOption__Group__0"


    // $ANTLR start "rule__DefaultValueFieldOption__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3638:1: rule__DefaultValueFieldOption__Group__0__Impl : ( ( 'default' ) ) ;
    public final void rule__DefaultValueFieldOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3642:1: ( ( ( 'default' ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3643:1: ( ( 'default' ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3643:1: ( ( 'default' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3644:1: ( 'default' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getDefaultKeyword_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3645:1: ( 'default' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3646:2: 'default'
            {
            match(input,44,FOLLOW_44_in_rule__DefaultValueFieldOption__Group__0__Impl7706); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultValueFieldOptionAccess().getDefaultKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValueFieldOption__Group__0__Impl"


    // $ANTLR start "rule__DefaultValueFieldOption__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3657:1: rule__DefaultValueFieldOption__Group__1 : rule__DefaultValueFieldOption__Group__1__Impl rule__DefaultValueFieldOption__Group__2 ;
    public final void rule__DefaultValueFieldOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3661:1: ( rule__DefaultValueFieldOption__Group__1__Impl rule__DefaultValueFieldOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3662:2: rule__DefaultValueFieldOption__Group__1__Impl rule__DefaultValueFieldOption__Group__2
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__1__Impl_in_rule__DefaultValueFieldOption__Group__17738);
            rule__DefaultValueFieldOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__2_in_rule__DefaultValueFieldOption__Group__17741);
            rule__DefaultValueFieldOption__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValueFieldOption__Group__1"


    // $ANTLR start "rule__DefaultValueFieldOption__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3669:1: rule__DefaultValueFieldOption__Group__1__Impl : ( '=' ) ;
    public final void rule__DefaultValueFieldOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3673:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3674:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3674:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3675:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,49,FOLLOW_49_in_rule__DefaultValueFieldOption__Group__1__Impl7769); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultValueFieldOptionAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValueFieldOption__Group__1__Impl"


    // $ANTLR start "rule__DefaultValueFieldOption__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3688:1: rule__DefaultValueFieldOption__Group__2 : rule__DefaultValueFieldOption__Group__2__Impl ;
    public final void rule__DefaultValueFieldOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3692:1: ( rule__DefaultValueFieldOption__Group__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3693:2: rule__DefaultValueFieldOption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__2__Impl_in_rule__DefaultValueFieldOption__Group__27800);
            rule__DefaultValueFieldOption__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValueFieldOption__Group__2"


    // $ANTLR start "rule__DefaultValueFieldOption__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3699:1: rule__DefaultValueFieldOption__Group__2__Impl : ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) ) ;
    public final void rule__DefaultValueFieldOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3703:1: ( ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3704:1: ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3704:1: ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3705:1: ( rule__DefaultValueFieldOption__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getValueAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3706:1: ( rule__DefaultValueFieldOption__ValueAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3706:2: rule__DefaultValueFieldOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__ValueAssignment_2_in_rule__DefaultValueFieldOption__Group__2__Impl7827);
            rule__DefaultValueFieldOption__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultValueFieldOptionAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValueFieldOption__Group__2__Impl"


    // $ANTLR start "rule__NativeFieldOption__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3722:1: rule__NativeFieldOption__Group__0 : rule__NativeFieldOption__Group__0__Impl rule__NativeFieldOption__Group__1 ;
    public final void rule__NativeFieldOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3726:1: ( rule__NativeFieldOption__Group__0__Impl rule__NativeFieldOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3727:2: rule__NativeFieldOption__Group__0__Impl rule__NativeFieldOption__Group__1
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__0__Impl_in_rule__NativeFieldOption__Group__07863);
            rule__NativeFieldOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__1_in_rule__NativeFieldOption__Group__07866);
            rule__NativeFieldOption__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeFieldOption__Group__0"


    // $ANTLR start "rule__NativeFieldOption__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3734:1: rule__NativeFieldOption__Group__0__Impl : ( ( rule__NativeFieldOption__SourceAssignment_0 ) ) ;
    public final void rule__NativeFieldOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3738:1: ( ( ( rule__NativeFieldOption__SourceAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3739:1: ( ( rule__NativeFieldOption__SourceAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3739:1: ( ( rule__NativeFieldOption__SourceAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3740:1: ( rule__NativeFieldOption__SourceAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getSourceAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3741:1: ( rule__NativeFieldOption__SourceAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3741:2: rule__NativeFieldOption__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__SourceAssignment_0_in_rule__NativeFieldOption__Group__0__Impl7893);
            rule__NativeFieldOption__SourceAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeFieldOptionAccess().getSourceAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeFieldOption__Group__0__Impl"


    // $ANTLR start "rule__NativeFieldOption__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3751:1: rule__NativeFieldOption__Group__1 : rule__NativeFieldOption__Group__1__Impl rule__NativeFieldOption__Group__2 ;
    public final void rule__NativeFieldOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3755:1: ( rule__NativeFieldOption__Group__1__Impl rule__NativeFieldOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3756:2: rule__NativeFieldOption__Group__1__Impl rule__NativeFieldOption__Group__2
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__1__Impl_in_rule__NativeFieldOption__Group__17923);
            rule__NativeFieldOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__2_in_rule__NativeFieldOption__Group__17926);
            rule__NativeFieldOption__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeFieldOption__Group__1"


    // $ANTLR start "rule__NativeFieldOption__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3763:1: rule__NativeFieldOption__Group__1__Impl : ( '=' ) ;
    public final void rule__NativeFieldOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3767:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3768:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3768:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3769:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,49,FOLLOW_49_in_rule__NativeFieldOption__Group__1__Impl7954); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeFieldOptionAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeFieldOption__Group__1__Impl"


    // $ANTLR start "rule__NativeFieldOption__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3782:1: rule__NativeFieldOption__Group__2 : rule__NativeFieldOption__Group__2__Impl ;
    public final void rule__NativeFieldOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3786:1: ( rule__NativeFieldOption__Group__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3787:2: rule__NativeFieldOption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__2__Impl_in_rule__NativeFieldOption__Group__27985);
            rule__NativeFieldOption__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeFieldOption__Group__2"


    // $ANTLR start "rule__NativeFieldOption__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3793:1: rule__NativeFieldOption__Group__2__Impl : ( ( rule__NativeFieldOption__ValueAssignment_2 ) ) ;
    public final void rule__NativeFieldOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3797:1: ( ( ( rule__NativeFieldOption__ValueAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3798:1: ( ( rule__NativeFieldOption__ValueAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3798:1: ( ( rule__NativeFieldOption__ValueAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3799:1: ( rule__NativeFieldOption__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getValueAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3800:1: ( rule__NativeFieldOption__ValueAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3800:2: rule__NativeFieldOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__ValueAssignment_2_in_rule__NativeFieldOption__Group__2__Impl8012);
            rule__NativeFieldOption__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeFieldOptionAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeFieldOption__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3816:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3820:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3821:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__08048);
            rule__Enum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__08051);
            rule__Enum__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3828:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3832:1: ( ( 'enum' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3833:1: ( 'enum' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3833:1: ( 'enum' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3834:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Enum__Group__0__Impl8079); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3847:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3851:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3852:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__18110);
            rule__Enum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__18113);
            rule__Enum__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3859:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3863:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3864:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3864:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3865:1: ( rule__Enum__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3866:1: ( rule__Enum__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3866:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl8140);
            rule__Enum__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3876:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3880:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3881:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__28170);
            rule__Enum__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__28173);
            rule__Enum__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3888:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3892:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3893:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3893:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3894:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,51,FOLLOW_51_in_rule__Enum__Group__2__Impl8201); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3907:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3911:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3912:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__38232);
            rule__Enum__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__38235);
            rule__Enum__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3919:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__ElementsAssignment_3 )* ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3923:1: ( ( ( rule__Enum__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3924:1: ( ( rule__Enum__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3924:1: ( ( rule__Enum__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3925:1: ( rule__Enum__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3926:1: ( rule__Enum__ElementsAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==17) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3926:2: rule__Enum__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enum__ElementsAssignment_3_in_rule__Enum__Group__3__Impl8262);
            	    rule__Enum__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getElementsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__4"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3936:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3940:1: ( rule__Enum__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3941:2: rule__Enum__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__48293);
            rule__Enum__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4"


    // $ANTLR start "rule__Enum__Group__4__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3947:1: rule__Enum__Group__4__Impl : ( '}' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3951:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3952:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3952:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3953:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,52,FOLLOW_52_in_rule__Enum__Group__4__Impl8321); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4__Impl"


    // $ANTLR start "rule__EnumField__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3976:1: rule__EnumField__Group__0 : rule__EnumField__Group__0__Impl rule__EnumField__Group__1 ;
    public final void rule__EnumField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3980:1: ( rule__EnumField__Group__0__Impl rule__EnumField__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3981:2: rule__EnumField__Group__0__Impl rule__EnumField__Group__1
            {
            pushFollow(FOLLOW_rule__EnumField__Group__0__Impl_in_rule__EnumField__Group__08362);
            rule__EnumField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__1_in_rule__EnumField__Group__08365);
            rule__EnumField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group__0"


    // $ANTLR start "rule__EnumField__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3988:1: rule__EnumField__Group__0__Impl : ( ( rule__EnumField__NameAssignment_0 ) ) ;
    public final void rule__EnumField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3992:1: ( ( ( rule__EnumField__NameAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3993:1: ( ( rule__EnumField__NameAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3993:1: ( ( rule__EnumField__NameAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3994:1: ( rule__EnumField__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getNameAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3995:1: ( rule__EnumField__NameAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3995:2: rule__EnumField__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumField__NameAssignment_0_in_rule__EnumField__Group__0__Impl8392);
            rule__EnumField__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group__0__Impl"


    // $ANTLR start "rule__EnumField__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4005:1: rule__EnumField__Group__1 : rule__EnumField__Group__1__Impl rule__EnumField__Group__2 ;
    public final void rule__EnumField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4009:1: ( rule__EnumField__Group__1__Impl rule__EnumField__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4010:2: rule__EnumField__Group__1__Impl rule__EnumField__Group__2
            {
            pushFollow(FOLLOW_rule__EnumField__Group__1__Impl_in_rule__EnumField__Group__18422);
            rule__EnumField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__2_in_rule__EnumField__Group__18425);
            rule__EnumField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group__1"


    // $ANTLR start "rule__EnumField__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4017:1: rule__EnumField__Group__1__Impl : ( '=' ) ;
    public final void rule__EnumField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4021:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4022:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4022:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4023:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,49,FOLLOW_49_in_rule__EnumField__Group__1__Impl8453); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group__1__Impl"


    // $ANTLR start "rule__EnumField__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4036:1: rule__EnumField__Group__2 : rule__EnumField__Group__2__Impl rule__EnumField__Group__3 ;
    public final void rule__EnumField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4040:1: ( rule__EnumField__Group__2__Impl rule__EnumField__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4041:2: rule__EnumField__Group__2__Impl rule__EnumField__Group__3
            {
            pushFollow(FOLLOW_rule__EnumField__Group__2__Impl_in_rule__EnumField__Group__28484);
            rule__EnumField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__3_in_rule__EnumField__Group__28487);
            rule__EnumField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group__2"


    // $ANTLR start "rule__EnumField__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4048:1: rule__EnumField__Group__2__Impl : ( ( rule__EnumField__IndexAssignment_2 ) ) ;
    public final void rule__EnumField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4052:1: ( ( ( rule__EnumField__IndexAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4053:1: ( ( rule__EnumField__IndexAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4053:1: ( ( rule__EnumField__IndexAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4054:1: ( rule__EnumField__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getIndexAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4055:1: ( rule__EnumField__IndexAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4055:2: rule__EnumField__IndexAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumField__IndexAssignment_2_in_rule__EnumField__Group__2__Impl8514);
            rule__EnumField__IndexAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getIndexAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group__2__Impl"


    // $ANTLR start "rule__EnumField__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4065:1: rule__EnumField__Group__3 : rule__EnumField__Group__3__Impl rule__EnumField__Group__4 ;
    public final void rule__EnumField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4069:1: ( rule__EnumField__Group__3__Impl rule__EnumField__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4070:2: rule__EnumField__Group__3__Impl rule__EnumField__Group__4
            {
            pushFollow(FOLLOW_rule__EnumField__Group__3__Impl_in_rule__EnumField__Group__38544);
            rule__EnumField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__4_in_rule__EnumField__Group__38547);
            rule__EnumField__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group__3"


    // $ANTLR start "rule__EnumField__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4077:1: rule__EnumField__Group__3__Impl : ( ( rule__EnumField__Group_3__0 )? ) ;
    public final void rule__EnumField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4081:1: ( ( ( rule__EnumField__Group_3__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4082:1: ( ( rule__EnumField__Group_3__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4082:1: ( ( rule__EnumField__Group_3__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4083:1: ( rule__EnumField__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getGroup_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4084:1: ( rule__EnumField__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==53) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4084:2: rule__EnumField__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumField__Group_3__0_in_rule__EnumField__Group__3__Impl8574);
                    rule__EnumField__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group__3__Impl"


    // $ANTLR start "rule__EnumField__Group__4"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4094:1: rule__EnumField__Group__4 : rule__EnumField__Group__4__Impl ;
    public final void rule__EnumField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4098:1: ( rule__EnumField__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4099:2: rule__EnumField__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumField__Group__4__Impl_in_rule__EnumField__Group__48605);
            rule__EnumField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group__4"


    // $ANTLR start "rule__EnumField__Group__4__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4105:1: rule__EnumField__Group__4__Impl : ( ';' ) ;
    public final void rule__EnumField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4109:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4110:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4110:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4111:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getSemicolonKeyword_4()); 
            }
            match(input,50,FOLLOW_50_in_rule__EnumField__Group__4__Impl8633); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group__4__Impl"


    // $ANTLR start "rule__EnumField__Group_3__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4134:1: rule__EnumField__Group_3__0 : rule__EnumField__Group_3__0__Impl rule__EnumField__Group_3__1 ;
    public final void rule__EnumField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4138:1: ( rule__EnumField__Group_3__0__Impl rule__EnumField__Group_3__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4139:2: rule__EnumField__Group_3__0__Impl rule__EnumField__Group_3__1
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__0__Impl_in_rule__EnumField__Group_3__08674);
            rule__EnumField__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3__1_in_rule__EnumField__Group_3__08677);
            rule__EnumField__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group_3__0"


    // $ANTLR start "rule__EnumField__Group_3__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4146:1: rule__EnumField__Group_3__0__Impl : ( '[' ) ;
    public final void rule__EnumField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4150:1: ( ( '[' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4151:1: ( '[' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4151:1: ( '[' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4152:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getLeftSquareBracketKeyword_3_0()); 
            }
            match(input,53,FOLLOW_53_in_rule__EnumField__Group_3__0__Impl8705); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getLeftSquareBracketKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group_3__0__Impl"


    // $ANTLR start "rule__EnumField__Group_3__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4165:1: rule__EnumField__Group_3__1 : rule__EnumField__Group_3__1__Impl rule__EnumField__Group_3__2 ;
    public final void rule__EnumField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4169:1: ( rule__EnumField__Group_3__1__Impl rule__EnumField__Group_3__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4170:2: rule__EnumField__Group_3__1__Impl rule__EnumField__Group_3__2
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__1__Impl_in_rule__EnumField__Group_3__18736);
            rule__EnumField__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3__2_in_rule__EnumField__Group_3__18739);
            rule__EnumField__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group_3__1"


    // $ANTLR start "rule__EnumField__Group_3__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4177:1: rule__EnumField__Group_3__1__Impl : ( ( rule__EnumField__OptionsAssignment_3_1 ) ) ;
    public final void rule__EnumField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4181:1: ( ( ( rule__EnumField__OptionsAssignment_3_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4182:1: ( ( rule__EnumField__OptionsAssignment_3_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4182:1: ( ( rule__EnumField__OptionsAssignment_3_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4183:1: ( rule__EnumField__OptionsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsAssignment_3_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4184:1: ( rule__EnumField__OptionsAssignment_3_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4184:2: rule__EnumField__OptionsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumField__OptionsAssignment_3_1_in_rule__EnumField__Group_3__1__Impl8766);
            rule__EnumField__OptionsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getOptionsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group_3__1__Impl"


    // $ANTLR start "rule__EnumField__Group_3__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4194:1: rule__EnumField__Group_3__2 : rule__EnumField__Group_3__2__Impl rule__EnumField__Group_3__3 ;
    public final void rule__EnumField__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4198:1: ( rule__EnumField__Group_3__2__Impl rule__EnumField__Group_3__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4199:2: rule__EnumField__Group_3__2__Impl rule__EnumField__Group_3__3
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__2__Impl_in_rule__EnumField__Group_3__28796);
            rule__EnumField__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3__3_in_rule__EnumField__Group_3__28799);
            rule__EnumField__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group_3__2"


    // $ANTLR start "rule__EnumField__Group_3__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4206:1: rule__EnumField__Group_3__2__Impl : ( ( rule__EnumField__Group_3_2__0 )* ) ;
    public final void rule__EnumField__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4210:1: ( ( ( rule__EnumField__Group_3_2__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4211:1: ( ( rule__EnumField__Group_3_2__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4211:1: ( ( rule__EnumField__Group_3_2__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4212:1: ( rule__EnumField__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getGroup_3_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4213:1: ( rule__EnumField__Group_3_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==55) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4213:2: rule__EnumField__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumField__Group_3_2__0_in_rule__EnumField__Group_3__2__Impl8826);
            	    rule__EnumField__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group_3__2__Impl"


    // $ANTLR start "rule__EnumField__Group_3__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4223:1: rule__EnumField__Group_3__3 : rule__EnumField__Group_3__3__Impl ;
    public final void rule__EnumField__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4227:1: ( rule__EnumField__Group_3__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4228:2: rule__EnumField__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__3__Impl_in_rule__EnumField__Group_3__38857);
            rule__EnumField__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group_3__3"


    // $ANTLR start "rule__EnumField__Group_3__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4234:1: rule__EnumField__Group_3__3__Impl : ( ']' ) ;
    public final void rule__EnumField__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4238:1: ( ( ']' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4239:1: ( ']' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4239:1: ( ']' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4240:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getRightSquareBracketKeyword_3_3()); 
            }
            match(input,54,FOLLOW_54_in_rule__EnumField__Group_3__3__Impl8885); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getRightSquareBracketKeyword_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group_3__3__Impl"


    // $ANTLR start "rule__EnumField__Group_3_2__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4261:1: rule__EnumField__Group_3_2__0 : rule__EnumField__Group_3_2__0__Impl rule__EnumField__Group_3_2__1 ;
    public final void rule__EnumField__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4265:1: ( rule__EnumField__Group_3_2__0__Impl rule__EnumField__Group_3_2__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4266:2: rule__EnumField__Group_3_2__0__Impl rule__EnumField__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3_2__0__Impl_in_rule__EnumField__Group_3_2__08924);
            rule__EnumField__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3_2__1_in_rule__EnumField__Group_3_2__08927);
            rule__EnumField__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group_3_2__0"


    // $ANTLR start "rule__EnumField__Group_3_2__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4273:1: rule__EnumField__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__EnumField__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4277:1: ( ( ',' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4278:1: ( ',' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4278:1: ( ',' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4279:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,55,FOLLOW_55_in_rule__EnumField__Group_3_2__0__Impl8955); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getCommaKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group_3_2__0__Impl"


    // $ANTLR start "rule__EnumField__Group_3_2__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4292:1: rule__EnumField__Group_3_2__1 : rule__EnumField__Group_3_2__1__Impl ;
    public final void rule__EnumField__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4296:1: ( rule__EnumField__Group_3_2__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4297:2: rule__EnumField__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3_2__1__Impl_in_rule__EnumField__Group_3_2__18986);
            rule__EnumField__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group_3_2__1"


    // $ANTLR start "rule__EnumField__Group_3_2__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4303:1: rule__EnumField__Group_3_2__1__Impl : ( ( rule__EnumField__OptionsAssignment_3_2_1 ) ) ;
    public final void rule__EnumField__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4307:1: ( ( ( rule__EnumField__OptionsAssignment_3_2_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4308:1: ( ( rule__EnumField__OptionsAssignment_3_2_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4308:1: ( ( rule__EnumField__OptionsAssignment_3_2_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4309:1: ( rule__EnumField__OptionsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsAssignment_3_2_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4310:1: ( rule__EnumField__OptionsAssignment_3_2_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4310:2: rule__EnumField__OptionsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__EnumField__OptionsAssignment_3_2_1_in_rule__EnumField__Group_3_2__1__Impl9013);
            rule__EnumField__OptionsAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getOptionsAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__Group_3_2__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4324:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4328:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4329:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__09047);
            rule__Service__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__09050);
            rule__Service__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4336:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4340:1: ( ( 'service' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4341:1: ( 'service' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4341:1: ( 'service' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4342:1: 'service'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Service__Group__0__Impl9078); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4355:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4359:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4360:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__19109);
            rule__Service__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__19112);
            rule__Service__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4367:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4371:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4372:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4372:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4373:1: ( rule__Service__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4374:1: ( rule__Service__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4374:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl9139);
            rule__Service__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4384:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4388:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4389:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__29169);
            rule__Service__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__29172);
            rule__Service__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4396:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4400:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4401:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4401:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4402:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,51,FOLLOW_51_in_rule__Service__Group__2__Impl9200); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4415:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4419:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4420:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__39231);
            rule__Service__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__39234);
            rule__Service__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4427:1: rule__Service__Group__3__Impl : ( ( ( rule__Service__ElementsAssignment_3 ) ) ( ( rule__Service__ElementsAssignment_3 )* ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4431:1: ( ( ( ( rule__Service__ElementsAssignment_3 ) ) ( ( rule__Service__ElementsAssignment_3 )* ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4432:1: ( ( ( rule__Service__ElementsAssignment_3 ) ) ( ( rule__Service__ElementsAssignment_3 )* ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4432:1: ( ( ( rule__Service__ElementsAssignment_3 ) ) ( ( rule__Service__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4433:1: ( ( rule__Service__ElementsAssignment_3 ) ) ( ( rule__Service__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4433:1: ( ( rule__Service__ElementsAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4434:1: ( rule__Service__ElementsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4435:1: ( rule__Service__ElementsAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4435:2: rule__Service__ElementsAssignment_3
            {
            pushFollow(FOLLOW_rule__Service__ElementsAssignment_3_in_rule__Service__Group__3__Impl9263);
            rule__Service__ElementsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getElementsAssignment_3()); 
            }

            }

            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4438:1: ( ( rule__Service__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4439:1: ( rule__Service__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4440:1: ( rule__Service__ElementsAssignment_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==17||LA28_0==27) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4440:2: rule__Service__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Service__ElementsAssignment_3_in_rule__Service__Group__3__Impl9275);
            	    rule__Service__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getElementsAssignment_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4451:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4455:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4456:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__49308);
            rule__Service__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__5_in_rule__Service__Group__49311);
            rule__Service__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4463:1: rule__Service__Group__4__Impl : ( '}' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4467:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4468:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4468:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4469:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,52,FOLLOW_52_in_rule__Service__Group__4__Impl9339); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4482:1: rule__Service__Group__5 : rule__Service__Group__5__Impl ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4486:1: ( rule__Service__Group__5__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4487:2: rule__Service__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__59370);
            rule__Service__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4493:1: rule__Service__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4497:1: ( ( ( ';' )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4498:1: ( ( ';' )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4498:1: ( ( ';' )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4499:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getSemicolonKeyword_5()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4500:1: ( ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==50) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4501:2: ';'
                    {
                    match(input,50,FOLLOW_50_in_rule__Service__Group__5__Impl9399); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Rpc__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4524:1: rule__Rpc__Group__0 : rule__Rpc__Group__0__Impl rule__Rpc__Group__1 ;
    public final void rule__Rpc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4528:1: ( rule__Rpc__Group__0__Impl rule__Rpc__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4529:2: rule__Rpc__Group__0__Impl rule__Rpc__Group__1
            {
            pushFollow(FOLLOW_rule__Rpc__Group__0__Impl_in_rule__Rpc__Group__09444);
            rule__Rpc__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__1_in_rule__Rpc__Group__09447);
            rule__Rpc__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__0"


    // $ANTLR start "rule__Rpc__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4536:1: rule__Rpc__Group__0__Impl : ( 'rpc' ) ;
    public final void rule__Rpc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4540:1: ( ( 'rpc' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4541:1: ( 'rpc' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4541:1: ( 'rpc' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4542:1: 'rpc'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRpcKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Rpc__Group__0__Impl9475); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getRpcKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__0__Impl"


    // $ANTLR start "rule__Rpc__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4555:1: rule__Rpc__Group__1 : rule__Rpc__Group__1__Impl rule__Rpc__Group__2 ;
    public final void rule__Rpc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4559:1: ( rule__Rpc__Group__1__Impl rule__Rpc__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4560:2: rule__Rpc__Group__1__Impl rule__Rpc__Group__2
            {
            pushFollow(FOLLOW_rule__Rpc__Group__1__Impl_in_rule__Rpc__Group__19506);
            rule__Rpc__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__2_in_rule__Rpc__Group__19509);
            rule__Rpc__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__1"


    // $ANTLR start "rule__Rpc__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4567:1: rule__Rpc__Group__1__Impl : ( ( rule__Rpc__NameAssignment_1 ) ) ;
    public final void rule__Rpc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4571:1: ( ( ( rule__Rpc__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4572:1: ( ( rule__Rpc__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4572:1: ( ( rule__Rpc__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4573:1: ( rule__Rpc__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4574:1: ( rule__Rpc__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4574:2: rule__Rpc__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rpc__NameAssignment_1_in_rule__Rpc__Group__1__Impl9536);
            rule__Rpc__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__1__Impl"


    // $ANTLR start "rule__Rpc__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4584:1: rule__Rpc__Group__2 : rule__Rpc__Group__2__Impl rule__Rpc__Group__3 ;
    public final void rule__Rpc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4588:1: ( rule__Rpc__Group__2__Impl rule__Rpc__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4589:2: rule__Rpc__Group__2__Impl rule__Rpc__Group__3
            {
            pushFollow(FOLLOW_rule__Rpc__Group__2__Impl_in_rule__Rpc__Group__29566);
            rule__Rpc__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__3_in_rule__Rpc__Group__29569);
            rule__Rpc__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__2"


    // $ANTLR start "rule__Rpc__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4596:1: rule__Rpc__Group__2__Impl : ( '(' ) ;
    public final void rule__Rpc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4600:1: ( ( '(' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4601:1: ( '(' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4601:1: ( '(' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4602:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,56,FOLLOW_56_in_rule__Rpc__Group__2__Impl9597); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__2__Impl"


    // $ANTLR start "rule__Rpc__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4615:1: rule__Rpc__Group__3 : rule__Rpc__Group__3__Impl rule__Rpc__Group__4 ;
    public final void rule__Rpc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4619:1: ( rule__Rpc__Group__3__Impl rule__Rpc__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4620:2: rule__Rpc__Group__3__Impl rule__Rpc__Group__4
            {
            pushFollow(FOLLOW_rule__Rpc__Group__3__Impl_in_rule__Rpc__Group__39628);
            rule__Rpc__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__4_in_rule__Rpc__Group__39631);
            rule__Rpc__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__3"


    // $ANTLR start "rule__Rpc__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4627:1: rule__Rpc__Group__3__Impl : ( ( rule__Rpc__ArgTypeAssignment_3 ) ) ;
    public final void rule__Rpc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4631:1: ( ( ( rule__Rpc__ArgTypeAssignment_3 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4632:1: ( ( rule__Rpc__ArgTypeAssignment_3 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4632:1: ( ( rule__Rpc__ArgTypeAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4633:1: ( rule__Rpc__ArgTypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getArgTypeAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4634:1: ( rule__Rpc__ArgTypeAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4634:2: rule__Rpc__ArgTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Rpc__ArgTypeAssignment_3_in_rule__Rpc__Group__3__Impl9658);
            rule__Rpc__ArgTypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getArgTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__3__Impl"


    // $ANTLR start "rule__Rpc__Group__4"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4644:1: rule__Rpc__Group__4 : rule__Rpc__Group__4__Impl rule__Rpc__Group__5 ;
    public final void rule__Rpc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4648:1: ( rule__Rpc__Group__4__Impl rule__Rpc__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4649:2: rule__Rpc__Group__4__Impl rule__Rpc__Group__5
            {
            pushFollow(FOLLOW_rule__Rpc__Group__4__Impl_in_rule__Rpc__Group__49688);
            rule__Rpc__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__5_in_rule__Rpc__Group__49691);
            rule__Rpc__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__4"


    // $ANTLR start "rule__Rpc__Group__4__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4656:1: rule__Rpc__Group__4__Impl : ( ')' ) ;
    public final void rule__Rpc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4660:1: ( ( ')' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4661:1: ( ')' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4661:1: ( ')' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4662:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,57,FOLLOW_57_in_rule__Rpc__Group__4__Impl9719); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__4__Impl"


    // $ANTLR start "rule__Rpc__Group__5"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4675:1: rule__Rpc__Group__5 : rule__Rpc__Group__5__Impl rule__Rpc__Group__6 ;
    public final void rule__Rpc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4679:1: ( rule__Rpc__Group__5__Impl rule__Rpc__Group__6 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4680:2: rule__Rpc__Group__5__Impl rule__Rpc__Group__6
            {
            pushFollow(FOLLOW_rule__Rpc__Group__5__Impl_in_rule__Rpc__Group__59750);
            rule__Rpc__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__6_in_rule__Rpc__Group__59753);
            rule__Rpc__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__5"


    // $ANTLR start "rule__Rpc__Group__5__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4687:1: rule__Rpc__Group__5__Impl : ( 'returns' ) ;
    public final void rule__Rpc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4691:1: ( ( 'returns' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4692:1: ( 'returns' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4692:1: ( 'returns' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4693:1: 'returns'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getReturnsKeyword_5()); 
            }
            match(input,28,FOLLOW_28_in_rule__Rpc__Group__5__Impl9781); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getReturnsKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__5__Impl"


    // $ANTLR start "rule__Rpc__Group__6"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4706:1: rule__Rpc__Group__6 : rule__Rpc__Group__6__Impl rule__Rpc__Group__7 ;
    public final void rule__Rpc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4710:1: ( rule__Rpc__Group__6__Impl rule__Rpc__Group__7 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4711:2: rule__Rpc__Group__6__Impl rule__Rpc__Group__7
            {
            pushFollow(FOLLOW_rule__Rpc__Group__6__Impl_in_rule__Rpc__Group__69812);
            rule__Rpc__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__7_in_rule__Rpc__Group__69815);
            rule__Rpc__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__6"


    // $ANTLR start "rule__Rpc__Group__6__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4718:1: rule__Rpc__Group__6__Impl : ( '(' ) ;
    public final void rule__Rpc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4722:1: ( ( '(' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4723:1: ( '(' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4723:1: ( '(' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4724:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getLeftParenthesisKeyword_6()); 
            }
            match(input,56,FOLLOW_56_in_rule__Rpc__Group__6__Impl9843); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getLeftParenthesisKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__6__Impl"


    // $ANTLR start "rule__Rpc__Group__7"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4737:1: rule__Rpc__Group__7 : rule__Rpc__Group__7__Impl rule__Rpc__Group__8 ;
    public final void rule__Rpc__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4741:1: ( rule__Rpc__Group__7__Impl rule__Rpc__Group__8 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4742:2: rule__Rpc__Group__7__Impl rule__Rpc__Group__8
            {
            pushFollow(FOLLOW_rule__Rpc__Group__7__Impl_in_rule__Rpc__Group__79874);
            rule__Rpc__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__8_in_rule__Rpc__Group__79877);
            rule__Rpc__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__7"


    // $ANTLR start "rule__Rpc__Group__7__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4749:1: rule__Rpc__Group__7__Impl : ( ( rule__Rpc__ReturnTypeAssignment_7 ) ) ;
    public final void rule__Rpc__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4753:1: ( ( ( rule__Rpc__ReturnTypeAssignment_7 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4754:1: ( ( rule__Rpc__ReturnTypeAssignment_7 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4754:1: ( ( rule__Rpc__ReturnTypeAssignment_7 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4755:1: ( rule__Rpc__ReturnTypeAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getReturnTypeAssignment_7()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4756:1: ( rule__Rpc__ReturnTypeAssignment_7 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4756:2: rule__Rpc__ReturnTypeAssignment_7
            {
            pushFollow(FOLLOW_rule__Rpc__ReturnTypeAssignment_7_in_rule__Rpc__Group__7__Impl9904);
            rule__Rpc__ReturnTypeAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getReturnTypeAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__7__Impl"


    // $ANTLR start "rule__Rpc__Group__8"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4766:1: rule__Rpc__Group__8 : rule__Rpc__Group__8__Impl rule__Rpc__Group__9 ;
    public final void rule__Rpc__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4770:1: ( rule__Rpc__Group__8__Impl rule__Rpc__Group__9 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4771:2: rule__Rpc__Group__8__Impl rule__Rpc__Group__9
            {
            pushFollow(FOLLOW_rule__Rpc__Group__8__Impl_in_rule__Rpc__Group__89934);
            rule__Rpc__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__9_in_rule__Rpc__Group__89937);
            rule__Rpc__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__8"


    // $ANTLR start "rule__Rpc__Group__8__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4778:1: rule__Rpc__Group__8__Impl : ( ')' ) ;
    public final void rule__Rpc__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4782:1: ( ( ')' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4783:1: ( ')' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4783:1: ( ')' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4784:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,57,FOLLOW_57_in_rule__Rpc__Group__8__Impl9965); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getRightParenthesisKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__8__Impl"


    // $ANTLR start "rule__Rpc__Group__9"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4797:1: rule__Rpc__Group__9 : rule__Rpc__Group__9__Impl rule__Rpc__Group__10 ;
    public final void rule__Rpc__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4801:1: ( rule__Rpc__Group__9__Impl rule__Rpc__Group__10 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4802:2: rule__Rpc__Group__9__Impl rule__Rpc__Group__10
            {
            pushFollow(FOLLOW_rule__Rpc__Group__9__Impl_in_rule__Rpc__Group__99996);
            rule__Rpc__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__10_in_rule__Rpc__Group__99999);
            rule__Rpc__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__9"


    // $ANTLR start "rule__Rpc__Group__9__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4809:1: rule__Rpc__Group__9__Impl : ( ( rule__Rpc__Group_9__0 )? ) ;
    public final void rule__Rpc__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4813:1: ( ( ( rule__Rpc__Group_9__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4814:1: ( ( rule__Rpc__Group_9__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4814:1: ( ( rule__Rpc__Group_9__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4815:1: ( rule__Rpc__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getGroup_9()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4816:1: ( rule__Rpc__Group_9__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==51) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4816:2: rule__Rpc__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Rpc__Group_9__0_in_rule__Rpc__Group__9__Impl10026);
                    rule__Rpc__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getGroup_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__9__Impl"


    // $ANTLR start "rule__Rpc__Group__10"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4826:1: rule__Rpc__Group__10 : rule__Rpc__Group__10__Impl ;
    public final void rule__Rpc__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4830:1: ( rule__Rpc__Group__10__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4831:2: rule__Rpc__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Rpc__Group__10__Impl_in_rule__Rpc__Group__1010057);
            rule__Rpc__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__10"


    // $ANTLR start "rule__Rpc__Group__10__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4837:1: rule__Rpc__Group__10__Impl : ( ( ( ';' ) ) ( ( ';' )* ) ) ;
    public final void rule__Rpc__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4841:1: ( ( ( ( ';' ) ) ( ( ';' )* ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4842:1: ( ( ( ';' ) ) ( ( ';' )* ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4842:1: ( ( ( ';' ) ) ( ( ';' )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4843:1: ( ( ';' ) ) ( ( ';' )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4843:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4844:1: ( ';' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getSemicolonKeyword_10()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4845:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4846:2: ';'
            {
            match(input,50,FOLLOW_50_in_rule__Rpc__Group__10__Impl10088); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getSemicolonKeyword_10()); 
            }

            }

            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4850:1: ( ( ';' )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4851:1: ( ';' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getSemicolonKeyword_10()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4852:1: ( ';' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==50) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4853:2: ';'
            	    {
            	    match(input,50,FOLLOW_50_in_rule__Rpc__Group__10__Impl10104); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getSemicolonKeyword_10()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group__10__Impl"


    // $ANTLR start "rule__Rpc__Group_9__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4887:1: rule__Rpc__Group_9__0 : rule__Rpc__Group_9__0__Impl rule__Rpc__Group_9__1 ;
    public final void rule__Rpc__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4891:1: ( rule__Rpc__Group_9__0__Impl rule__Rpc__Group_9__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4892:2: rule__Rpc__Group_9__0__Impl rule__Rpc__Group_9__1
            {
            pushFollow(FOLLOW_rule__Rpc__Group_9__0__Impl_in_rule__Rpc__Group_9__010161);
            rule__Rpc__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group_9__1_in_rule__Rpc__Group_9__010164);
            rule__Rpc__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group_9__0"


    // $ANTLR start "rule__Rpc__Group_9__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4899:1: rule__Rpc__Group_9__0__Impl : ( '{' ) ;
    public final void rule__Rpc__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4903:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4904:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4904:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4905:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getLeftCurlyBracketKeyword_9_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__Rpc__Group_9__0__Impl10192); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getLeftCurlyBracketKeyword_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group_9__0__Impl"


    // $ANTLR start "rule__Rpc__Group_9__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4918:1: rule__Rpc__Group_9__1 : rule__Rpc__Group_9__1__Impl rule__Rpc__Group_9__2 ;
    public final void rule__Rpc__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4922:1: ( rule__Rpc__Group_9__1__Impl rule__Rpc__Group_9__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4923:2: rule__Rpc__Group_9__1__Impl rule__Rpc__Group_9__2
            {
            pushFollow(FOLLOW_rule__Rpc__Group_9__1__Impl_in_rule__Rpc__Group_9__110223);
            rule__Rpc__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group_9__2_in_rule__Rpc__Group_9__110226);
            rule__Rpc__Group_9__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group_9__1"


    // $ANTLR start "rule__Rpc__Group_9__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4930:1: rule__Rpc__Group_9__1__Impl : ( ( rule__Rpc__OptionsAssignment_9_1 )* ) ;
    public final void rule__Rpc__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4934:1: ( ( ( rule__Rpc__OptionsAssignment_9_1 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4935:1: ( ( rule__Rpc__OptionsAssignment_9_1 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4935:1: ( ( rule__Rpc__OptionsAssignment_9_1 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4936:1: ( rule__Rpc__OptionsAssignment_9_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getOptionsAssignment_9_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4937:1: ( rule__Rpc__OptionsAssignment_9_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==17) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4937:2: rule__Rpc__OptionsAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_rule__Rpc__OptionsAssignment_9_1_in_rule__Rpc__Group_9__1__Impl10253);
            	    rule__Rpc__OptionsAssignment_9_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getOptionsAssignment_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group_9__1__Impl"


    // $ANTLR start "rule__Rpc__Group_9__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4947:1: rule__Rpc__Group_9__2 : rule__Rpc__Group_9__2__Impl ;
    public final void rule__Rpc__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4951:1: ( rule__Rpc__Group_9__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4952:2: rule__Rpc__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Rpc__Group_9__2__Impl_in_rule__Rpc__Group_9__210284);
            rule__Rpc__Group_9__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group_9__2"


    // $ANTLR start "rule__Rpc__Group_9__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4958:1: rule__Rpc__Group_9__2__Impl : ( '}' ) ;
    public final void rule__Rpc__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4962:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4963:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4963:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4964:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRightCurlyBracketKeyword_9_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__Rpc__Group_9__2__Impl10312); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getRightCurlyBracketKeyword_9_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__Group_9__2__Impl"


    // $ANTLR start "rule__Extend__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4983:1: rule__Extend__Group__0 : rule__Extend__Group__0__Impl rule__Extend__Group__1 ;
    public final void rule__Extend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4987:1: ( rule__Extend__Group__0__Impl rule__Extend__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4988:2: rule__Extend__Group__0__Impl rule__Extend__Group__1
            {
            pushFollow(FOLLOW_rule__Extend__Group__0__Impl_in_rule__Extend__Group__010349);
            rule__Extend__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__1_in_rule__Extend__Group__010352);
            rule__Extend__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__0"


    // $ANTLR start "rule__Extend__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4995:1: rule__Extend__Group__0__Impl : ( 'extend' ) ;
    public final void rule__Extend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4999:1: ( ( 'extend' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5000:1: ( 'extend' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5000:1: ( 'extend' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5001:1: 'extend'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getExtendKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Extend__Group__0__Impl10380); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getExtendKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__0__Impl"


    // $ANTLR start "rule__Extend__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5014:1: rule__Extend__Group__1 : rule__Extend__Group__1__Impl rule__Extend__Group__2 ;
    public final void rule__Extend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5018:1: ( rule__Extend__Group__1__Impl rule__Extend__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5019:2: rule__Extend__Group__1__Impl rule__Extend__Group__2
            {
            pushFollow(FOLLOW_rule__Extend__Group__1__Impl_in_rule__Extend__Group__110411);
            rule__Extend__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__2_in_rule__Extend__Group__110414);
            rule__Extend__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__1"


    // $ANTLR start "rule__Extend__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5026:1: rule__Extend__Group__1__Impl : ( ( rule__Extend__TypeAssignment_1 ) ) ;
    public final void rule__Extend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5030:1: ( ( ( rule__Extend__TypeAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5031:1: ( ( rule__Extend__TypeAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5031:1: ( ( rule__Extend__TypeAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5032:1: ( rule__Extend__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getTypeAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5033:1: ( rule__Extend__TypeAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5033:2: rule__Extend__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Extend__TypeAssignment_1_in_rule__Extend__Group__1__Impl10441);
            rule__Extend__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__1__Impl"


    // $ANTLR start "rule__Extend__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5043:1: rule__Extend__Group__2 : rule__Extend__Group__2__Impl rule__Extend__Group__3 ;
    public final void rule__Extend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5047:1: ( rule__Extend__Group__2__Impl rule__Extend__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5048:2: rule__Extend__Group__2__Impl rule__Extend__Group__3
            {
            pushFollow(FOLLOW_rule__Extend__Group__2__Impl_in_rule__Extend__Group__210471);
            rule__Extend__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__3_in_rule__Extend__Group__210474);
            rule__Extend__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__2"


    // $ANTLR start "rule__Extend__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5055:1: rule__Extend__Group__2__Impl : ( '{' ) ;
    public final void rule__Extend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5059:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5060:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5060:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5061:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,51,FOLLOW_51_in_rule__Extend__Group__2__Impl10502); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__2__Impl"


    // $ANTLR start "rule__Extend__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5074:1: rule__Extend__Group__3 : rule__Extend__Group__3__Impl rule__Extend__Group__4 ;
    public final void rule__Extend__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5078:1: ( rule__Extend__Group__3__Impl rule__Extend__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5079:2: rule__Extend__Group__3__Impl rule__Extend__Group__4
            {
            pushFollow(FOLLOW_rule__Extend__Group__3__Impl_in_rule__Extend__Group__310533);
            rule__Extend__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__4_in_rule__Extend__Group__310536);
            rule__Extend__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__3"


    // $ANTLR start "rule__Extend__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5086:1: rule__Extend__Group__3__Impl : ( ( rule__Extend__ElementsAssignment_3 )* ) ;
    public final void rule__Extend__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5090:1: ( ( ( rule__Extend__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5091:1: ( ( rule__Extend__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5091:1: ( ( rule__Extend__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5092:1: ( rule__Extend__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5093:1: ( rule__Extend__ElementsAssignment_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=17 && LA33_0<=25)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5093:2: rule__Extend__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Extend__ElementsAssignment_3_in_rule__Extend__Group__3__Impl10563);
            	    rule__Extend__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getElementsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__3__Impl"


    // $ANTLR start "rule__Extend__Group__4"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5103:1: rule__Extend__Group__4 : rule__Extend__Group__4__Impl rule__Extend__Group__5 ;
    public final void rule__Extend__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5107:1: ( rule__Extend__Group__4__Impl rule__Extend__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5108:2: rule__Extend__Group__4__Impl rule__Extend__Group__5
            {
            pushFollow(FOLLOW_rule__Extend__Group__4__Impl_in_rule__Extend__Group__410594);
            rule__Extend__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__5_in_rule__Extend__Group__410597);
            rule__Extend__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__4"


    // $ANTLR start "rule__Extend__Group__4__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5115:1: rule__Extend__Group__4__Impl : ( '}' ) ;
    public final void rule__Extend__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5119:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5120:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5120:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5121:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,52,FOLLOW_52_in_rule__Extend__Group__4__Impl10625); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__4__Impl"


    // $ANTLR start "rule__Extend__Group__5"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5134:1: rule__Extend__Group__5 : rule__Extend__Group__5__Impl ;
    public final void rule__Extend__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5138:1: ( rule__Extend__Group__5__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5139:2: rule__Extend__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Extend__Group__5__Impl_in_rule__Extend__Group__510656);
            rule__Extend__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__5"


    // $ANTLR start "rule__Extend__Group__5__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5145:1: rule__Extend__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__Extend__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5149:1: ( ( ( ';' )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5150:1: ( ( ';' )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5150:1: ( ( ';' )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5151:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getSemicolonKeyword_5()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5152:1: ( ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5153:2: ';'
                    {
                    match(input,50,FOLLOW_50_in_rule__Extend__Group__5__Impl10685); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__5__Impl"


    // $ANTLR start "rule__FULL_ID__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5176:1: rule__FULL_ID__Group__0 : rule__FULL_ID__Group__0__Impl rule__FULL_ID__Group__1 ;
    public final void rule__FULL_ID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5180:1: ( rule__FULL_ID__Group__0__Impl rule__FULL_ID__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5181:2: rule__FULL_ID__Group__0__Impl rule__FULL_ID__Group__1
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group__0__Impl_in_rule__FULL_ID__Group__010730);
            rule__FULL_ID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FULL_ID__Group__1_in_rule__FULL_ID__Group__010733);
            rule__FULL_ID__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FULL_ID__Group__0"


    // $ANTLR start "rule__FULL_ID__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5188:1: rule__FULL_ID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FULL_ID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5192:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5193:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5193:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5194:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FULL_ID__Group__0__Impl10760); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FULL_ID__Group__0__Impl"


    // $ANTLR start "rule__FULL_ID__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5205:1: rule__FULL_ID__Group__1 : rule__FULL_ID__Group__1__Impl ;
    public final void rule__FULL_ID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5209:1: ( rule__FULL_ID__Group__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5210:2: rule__FULL_ID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group__1__Impl_in_rule__FULL_ID__Group__110789);
            rule__FULL_ID__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FULL_ID__Group__1"


    // $ANTLR start "rule__FULL_ID__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5216:1: rule__FULL_ID__Group__1__Impl : ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) ) ;
    public final void rule__FULL_ID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5220:1: ( ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5221:1: ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5221:1: ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5222:1: ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5222:1: ( ( rule__FULL_ID__Group_1__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5223:1: ( rule__FULL_ID__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getGroup_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5224:1: ( rule__FULL_ID__Group_1__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5224:2: rule__FULL_ID__Group_1__0
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl10818);
            rule__FULL_ID__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFULL_IDAccess().getGroup_1()); 
            }

            }

            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5227:1: ( ( rule__FULL_ID__Group_1__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5228:1: ( rule__FULL_ID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getGroup_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5229:1: ( rule__FULL_ID__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==58) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5229:2: rule__FULL_ID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl10830);
            	    rule__FULL_ID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFULL_IDAccess().getGroup_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FULL_ID__Group__1__Impl"


    // $ANTLR start "rule__FULL_ID__Group_1__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5244:1: rule__FULL_ID__Group_1__0 : rule__FULL_ID__Group_1__0__Impl rule__FULL_ID__Group_1__1 ;
    public final void rule__FULL_ID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5248:1: ( rule__FULL_ID__Group_1__0__Impl rule__FULL_ID__Group_1__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5249:2: rule__FULL_ID__Group_1__0__Impl rule__FULL_ID__Group_1__1
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__0__Impl_in_rule__FULL_ID__Group_1__010867);
            rule__FULL_ID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__1_in_rule__FULL_ID__Group_1__010870);
            rule__FULL_ID__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FULL_ID__Group_1__0"


    // $ANTLR start "rule__FULL_ID__Group_1__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5256:1: rule__FULL_ID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FULL_ID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5260:1: ( ( '.' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5261:1: ( '.' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5261:1: ( '.' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5262:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,58,FOLLOW_58_in_rule__FULL_ID__Group_1__0__Impl10898); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFULL_IDAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FULL_ID__Group_1__0__Impl"


    // $ANTLR start "rule__FULL_ID__Group_1__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5275:1: rule__FULL_ID__Group_1__1 : rule__FULL_ID__Group_1__1__Impl ;
    public final void rule__FULL_ID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5279:1: ( rule__FULL_ID__Group_1__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5280:2: rule__FULL_ID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__1__Impl_in_rule__FULL_ID__Group_1__110929);
            rule__FULL_ID__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FULL_ID__Group_1__1"


    // $ANTLR start "rule__FULL_ID__Group_1__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5286:1: rule__FULL_ID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FULL_ID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5290:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5291:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5291:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5292:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FULL_ID__Group_1__1__Impl10956); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FULL_ID__Group_1__1__Impl"


    // $ANTLR start "rule__Proto__SyntaxAssignment_0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5309:1: rule__Proto__SyntaxAssignment_0 : ( ruleSyntax ) ;
    public final void rule__Proto__SyntaxAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5313:1: ( ( ruleSyntax ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5314:1: ( ruleSyntax )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5314:1: ( ruleSyntax )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5315:1: ruleSyntax
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getSyntaxSyntaxParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSyntax_in_rule__Proto__SyntaxAssignment_010995);
            ruleSyntax();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getSyntaxSyntaxParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proto__SyntaxAssignment_0"


    // $ANTLR start "rule__Proto__StatementsAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5324:1: rule__Proto__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Proto__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5328:1: ( ( ruleStatement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5329:1: ( ruleStatement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5329:1: ( ruleStatement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5330:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getStatementsStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Proto__StatementsAssignment_111026);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getStatementsStatementParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proto__StatementsAssignment_1"


    // $ANTLR start "rule__Syntax__NameAssignment_2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5339:1: rule__Syntax__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Syntax__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5343:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5344:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5344:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5345:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Syntax__NameAssignment_211057); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSyntaxAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__NameAssignment_2"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5354:1: rule__Package__NameAssignment_1 : ( ruleVar_full ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5358:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5359:1: ( ruleVar_full )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5359:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5360:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameVar_fullParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__Package__NameAssignment_111088);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getNameVar_fullParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5369:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5373:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5374:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5374:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5375:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_111119); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__Option__SourceAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5384:1: rule__Option__SourceAssignment_1 : ( ( ruleVar_full ) ) ;
    public final void rule__Option__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5388:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5389:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5389:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5390:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getSourceMessageFieldCrossReference_1_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5391:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5392:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getSourceMessageFieldVar_fullParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__Option__SourceAssignment_111154);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getSourceMessageFieldVar_fullParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getSourceMessageFieldCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__SourceAssignment_1"


    // $ANTLR start "rule__Option__ValueAssignment_3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5403:1: rule__Option__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__Option__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5407:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5408:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5408:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5409:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getValueValueParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Option__ValueAssignment_311189);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getValueValueParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__ValueAssignment_3"


    // $ANTLR start "rule__StringLink__TargetAssignment"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5418:1: rule__StringLink__TargetAssignment : ( RULE_STRING ) ;
    public final void rule__StringLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5422:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5423:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5423:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5424:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLinkAccess().getTargetSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLink__TargetAssignment11220); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLinkAccess().getTargetSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLink__TargetAssignment"


    // $ANTLR start "rule__BooleanLink__TargetAssignment"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5433:1: rule__BooleanLink__TargetAssignment : ( ruleBOOL ) ;
    public final void rule__BooleanLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5437:1: ( ( ruleBOOL ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5438:1: ( ruleBOOL )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5438:1: ( ruleBOOL )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5439:1: ruleBOOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLinkAccess().getTargetBOOLEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_rule__BooleanLink__TargetAssignment11251);
            ruleBOOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLinkAccess().getTargetBOOLEnumRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLink__TargetAssignment"


    // $ANTLR start "rule__IntLink__TargetAssignment"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5448:1: rule__IntLink__TargetAssignment : ( RULE_NUMINT ) ;
    public final void rule__IntLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5452:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5453:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5453:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5454:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLinkAccess().getTargetNUMINTTerminalRuleCall_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__IntLink__TargetAssignment11282); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLinkAccess().getTargetNUMINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLink__TargetAssignment"


    // $ANTLR start "rule__DoubleLink__TargetAssignment"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5463:1: rule__DoubleLink__TargetAssignment : ( RULE_NUMDOUBLE ) ;
    public final void rule__DoubleLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5467:1: ( ( RULE_NUMDOUBLE ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5468:1: ( RULE_NUMDOUBLE )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5468:1: ( RULE_NUMDOUBLE )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5469:1: RULE_NUMDOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLinkAccess().getTargetNUMDOUBLETerminalRuleCall_0()); 
            }
            match(input,RULE_NUMDOUBLE,FOLLOW_RULE_NUMDOUBLE_in_rule__DoubleLink__TargetAssignment11313); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleLinkAccess().getTargetNUMDOUBLETerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLink__TargetAssignment"


    // $ANTLR start "rule__Message__NameAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5478:1: rule__Message__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5482:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5483:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5483:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5484:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__NameAssignment_111344); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__NameAssignment_1"


    // $ANTLR start "rule__Message__ElementsAssignment_3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5493:1: rule__Message__ElementsAssignment_3 : ( ruleMessageElement ) ;
    public final void rule__Message__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5497:1: ( ( ruleMessageElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5498:1: ( ruleMessageElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5498:1: ( ruleMessageElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5499:1: ruleMessageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getElementsMessageElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_rule__Message__ElementsAssignment_311375);
            ruleMessageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getElementsMessageElementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__ElementsAssignment_3"


    // $ANTLR start "rule__ExtensionRange__FromAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5508:1: rule__ExtensionRange__FromAssignment_1 : ( RULE_NUMINT ) ;
    public final void rule__ExtensionRange__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5512:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5513:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5513:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5514:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getFromNUMINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__ExtensionRange__FromAssignment_111406); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeAccess().getFromNUMINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionRange__FromAssignment_1"


    // $ANTLR start "rule__ExtensionRange__ToAssignment_2_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5523:1: rule__ExtensionRange__ToAssignment_2_1 : ( RULE_NUMINT ) ;
    public final void rule__ExtensionRange__ToAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5527:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5528:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5528:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5529:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getToNUMINTTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__ExtensionRange__ToAssignment_2_111437); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeAccess().getToNUMINTTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionRange__ToAssignment_2_1"


    // $ANTLR start "rule__MessageField__ModifierAssignment_0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5538:1: rule__MessageField__ModifierAssignment_0 : ( ruleModifier ) ;
    public final void rule__MessageField__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5542:1: ( ( ruleModifier ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5543:1: ( ruleModifier )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5543:1: ( ruleModifier )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5544:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getModifierModifierEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__MessageField__ModifierAssignment_011468);
            ruleModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldAccess().getModifierModifierEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__ModifierAssignment_0"


    // $ANTLR start "rule__MessageField__TypeAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5553:1: rule__MessageField__TypeAssignment_1 : ( ruleTypeLink ) ;
    public final void rule__MessageField__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5557:1: ( ( ruleTypeLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5558:1: ( ruleTypeLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5558:1: ( ruleTypeLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5559:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getTypeTypeLinkParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__MessageField__TypeAssignment_111499);
            ruleTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldAccess().getTypeTypeLinkParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__TypeAssignment_1"


    // $ANTLR start "rule__MessageField__NameAssignment_2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5568:1: rule__MessageField__NameAssignment_2 : ( ruleVar ) ;
    public final void rule__MessageField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5572:1: ( ( ruleVar ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5573:1: ( ruleVar )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5573:1: ( ruleVar )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5574:1: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getNameVarParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVar_in_rule__MessageField__NameAssignment_211530);
            ruleVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldAccess().getNameVarParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__NameAssignment_2"


    // $ANTLR start "rule__MessageField__IndexAssignment_4"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5583:1: rule__MessageField__IndexAssignment_4 : ( RULE_NUMINT ) ;
    public final void rule__MessageField__IndexAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5587:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5588:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5588:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5589:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getIndexNUMINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__MessageField__IndexAssignment_411561); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldAccess().getIndexNUMINTTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__IndexAssignment_4"


    // $ANTLR start "rule__MessageField__OptionsAssignment_5"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5598:1: rule__MessageField__OptionsAssignment_5 : ( ruleFieldOptions ) ;
    public final void rule__MessageField__OptionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5602:1: ( ( ruleFieldOptions ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5603:1: ( ruleFieldOptions )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5603:1: ( ruleFieldOptions )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5604:1: ruleFieldOptions
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getOptionsFieldOptionsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_rule__MessageField__OptionsAssignment_511592);
            ruleFieldOptions();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldAccess().getOptionsFieldOptionsParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageField__OptionsAssignment_5"


    // $ANTLR start "rule__Group__ModifierAssignment_0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5613:1: rule__Group__ModifierAssignment_0 : ( ruleModifier ) ;
    public final void rule__Group__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5617:1: ( ( ruleModifier ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5618:1: ( ruleModifier )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5618:1: ( ruleModifier )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5619:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getModifierModifierEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Group__ModifierAssignment_011623);
            ruleModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getModifierModifierEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__ModifierAssignment_0"


    // $ANTLR start "rule__Group__NameAssignment_2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5628:1: rule__Group__NameAssignment_2 : ( ruleVar ) ;
    public final void rule__Group__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5632:1: ( ( ruleVar ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5633:1: ( ruleVar )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5633:1: ( ruleVar )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5634:1: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getNameVarParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVar_in_rule__Group__NameAssignment_211654);
            ruleVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getNameVarParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__NameAssignment_2"


    // $ANTLR start "rule__Group__IndexAssignment_4"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5643:1: rule__Group__IndexAssignment_4 : ( RULE_NUMINT ) ;
    public final void rule__Group__IndexAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5647:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5648:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5648:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5649:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getIndexNUMINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__Group__IndexAssignment_411685); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getIndexNUMINTTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__IndexAssignment_4"


    // $ANTLR start "rule__Group__ElementsAssignment_6"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5658:1: rule__Group__ElementsAssignment_6 : ( ruleMessageField ) ;
    public final void rule__Group__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5662:1: ( ( ruleMessageField ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5663:1: ( ruleMessageField )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5663:1: ( ruleMessageField )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5664:1: ruleMessageField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getElementsMessageFieldParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleMessageField_in_rule__Group__ElementsAssignment_611716);
            ruleMessageField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getElementsMessageFieldParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__ElementsAssignment_6"


    // $ANTLR start "rule__ComplexTypeLink__TargetAssignment"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5673:1: rule__ComplexTypeLink__TargetAssignment : ( ( ruleVar_full ) ) ;
    public final void rule__ComplexTypeLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5677:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5678:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5678:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5679:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeCrossReference_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5680:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5681:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeVar_fullParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__ComplexTypeLink__TargetAssignment11751);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeVar_fullParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeLink__TargetAssignment"


    // $ANTLR start "rule__ScalarTypeLink__TargetAssignment"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5692:1: rule__ScalarTypeLink__TargetAssignment : ( ruleScalarType ) ;
    public final void rule__ScalarTypeLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5696:1: ( ( ruleScalarType ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5697:1: ( ruleScalarType )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5697:1: ( ruleScalarType )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5698:1: ruleScalarType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeLinkAccess().getTargetScalarTypeEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleScalarType_in_rule__ScalarTypeLink__TargetAssignment11786);
            ruleScalarType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScalarTypeLinkAccess().getTargetScalarTypeEnumRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarTypeLink__TargetAssignment"


    // $ANTLR start "rule__FieldOptions__OptionsAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5707:1: rule__FieldOptions__OptionsAssignment_1 : ( ruleFieldOption ) ;
    public final void rule__FieldOptions__OptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5711:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5712:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5712:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5713:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_111817);
            ruleFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptions__OptionsAssignment_1"


    // $ANTLR start "rule__FieldOptions__OptionsAssignment_2_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5722:1: rule__FieldOptions__OptionsAssignment_2_1 : ( ruleFieldOption ) ;
    public final void rule__FieldOptions__OptionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5726:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5727:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5727:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5728:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_2_111848);
            ruleFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptions__OptionsAssignment_2_1"


    // $ANTLR start "rule__DefaultValueFieldOption__ValueAssignment_2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5737:1: rule__DefaultValueFieldOption__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__DefaultValueFieldOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5741:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5742:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5742:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5743:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__DefaultValueFieldOption__ValueAssignment_211879);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultValueFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValueFieldOption__ValueAssignment_2"


    // $ANTLR start "rule__NativeFieldOption__SourceAssignment_0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5752:1: rule__NativeFieldOption__SourceAssignment_0 : ( ruleOptionSource ) ;
    public final void rule__NativeFieldOption__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5756:1: ( ( ruleOptionSource ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5757:1: ( ruleOptionSource )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5757:1: ( ruleOptionSource )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5758:1: ruleOptionSource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getSourceOptionSourceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleOptionSource_in_rule__NativeFieldOption__SourceAssignment_011910);
            ruleOptionSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeFieldOptionAccess().getSourceOptionSourceParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeFieldOption__SourceAssignment_0"


    // $ANTLR start "rule__NativeFieldOption__ValueAssignment_2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5767:1: rule__NativeFieldOption__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__NativeFieldOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5771:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5772:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5772:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5773:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__NativeFieldOption__ValueAssignment_211941);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeFieldOption__ValueAssignment_2"


    // $ANTLR start "rule__OptionSource__TargetAssignment"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5782:1: rule__OptionSource__TargetAssignment : ( ( ruleVar_full ) ) ;
    public final void rule__OptionSource__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5786:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5787:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5787:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5788:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceAccess().getTargetIndexedElementCrossReference_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5789:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5790:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceAccess().getTargetIndexedElementVar_fullParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__OptionSource__TargetAssignment11976);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionSourceAccess().getTargetIndexedElementVar_fullParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionSourceAccess().getTargetIndexedElementCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionSource__TargetAssignment"


    // $ANTLR start "rule__Enum__NameAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5801:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5805:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5806:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5806:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5807:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_112011); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__NameAssignment_1"


    // $ANTLR start "rule__Enum__ElementsAssignment_3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5816:1: rule__Enum__ElementsAssignment_3 : ( ruleEnumElement ) ;
    public final void rule__Enum__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5820:1: ( ( ruleEnumElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5821:1: ( ruleEnumElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5821:1: ( ruleEnumElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5822:1: ruleEnumElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleEnumElement_in_rule__Enum__ElementsAssignment_312042);
            ruleEnumElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__ElementsAssignment_3"


    // $ANTLR start "rule__EnumField__NameAssignment_0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5831:1: rule__EnumField__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5835:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5836:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5836:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5837:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumField__NameAssignment_012073); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__NameAssignment_0"


    // $ANTLR start "rule__EnumField__IndexAssignment_2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5846:1: rule__EnumField__IndexAssignment_2 : ( RULE_NUMINT ) ;
    public final void rule__EnumField__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5850:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5851:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5851:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5852:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getIndexNUMINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__EnumField__IndexAssignment_212104); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getIndexNUMINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__IndexAssignment_2"


    // $ANTLR start "rule__EnumField__OptionsAssignment_3_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5861:1: rule__EnumField__OptionsAssignment_3_1 : ( ruleFieldOption ) ;
    public final void rule__EnumField__OptionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5865:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5866:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5866:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5867:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_112135);
            ruleFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__OptionsAssignment_3_1"


    // $ANTLR start "rule__EnumField__OptionsAssignment_3_2_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5876:1: rule__EnumField__OptionsAssignment_3_2_1 : ( ruleFieldOption ) ;
    public final void rule__EnumField__OptionsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5880:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5881:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5881:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5882:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_2_112166);
            ruleFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__OptionsAssignment_3_2_1"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5891:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5895:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5896:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5896:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5897:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_112197); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__ElementsAssignment_3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5906:1: rule__Service__ElementsAssignment_3 : ( ruleServiceElement ) ;
    public final void rule__Service__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5910:1: ( ( ruleServiceElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5911:1: ( ruleServiceElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5911:1: ( ruleServiceElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5912:1: ruleServiceElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getElementsServiceElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleServiceElement_in_rule__Service__ElementsAssignment_312228);
            ruleServiceElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getElementsServiceElementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ElementsAssignment_3"


    // $ANTLR start "rule__Rpc__NameAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5921:1: rule__Rpc__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rpc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5925:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5926:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5926:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5927:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rpc__NameAssignment_112259); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__NameAssignment_1"


    // $ANTLR start "rule__Rpc__ArgTypeAssignment_3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5936:1: rule__Rpc__ArgTypeAssignment_3 : ( ruleMessageLink ) ;
    public final void rule__Rpc__ArgTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5940:1: ( ( ruleMessageLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5941:1: ( ruleMessageLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5941:1: ( ruleMessageLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5942:1: ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getArgTypeMessageLinkParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_rule__Rpc__ArgTypeAssignment_312290);
            ruleMessageLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getArgTypeMessageLinkParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__ArgTypeAssignment_3"


    // $ANTLR start "rule__Rpc__ReturnTypeAssignment_7"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5951:1: rule__Rpc__ReturnTypeAssignment_7 : ( ruleMessageLink ) ;
    public final void rule__Rpc__ReturnTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5955:1: ( ( ruleMessageLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5956:1: ( ruleMessageLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5956:1: ( ruleMessageLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5957:1: ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getReturnTypeMessageLinkParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_rule__Rpc__ReturnTypeAssignment_712321);
            ruleMessageLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getReturnTypeMessageLinkParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__ReturnTypeAssignment_7"


    // $ANTLR start "rule__Rpc__OptionsAssignment_9_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5966:1: rule__Rpc__OptionsAssignment_9_1 : ( ruleOption ) ;
    public final void rule__Rpc__OptionsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5970:1: ( ( ruleOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5971:1: ( ruleOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5971:1: ( ruleOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5972:1: ruleOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getOptionsOptionParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_ruleOption_in_rule__Rpc__OptionsAssignment_9_112352);
            ruleOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getOptionsOptionParserRuleCall_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rpc__OptionsAssignment_9_1"


    // $ANTLR start "rule__MessageLink__TargetAssignment"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5981:1: rule__MessageLink__TargetAssignment : ( ( ruleFULL_ID ) ) ;
    public final void rule__MessageLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5985:1: ( ( ( ruleFULL_ID ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5986:1: ( ( ruleFULL_ID ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5986:1: ( ( ruleFULL_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5987:1: ( ruleFULL_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkAccess().getTargetMessageCrossReference_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5988:1: ( ruleFULL_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5989:1: ruleFULL_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkAccess().getTargetMessageFULL_IDParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_rule__MessageLink__TargetAssignment12387);
            ruleFULL_ID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageLinkAccess().getTargetMessageFULL_IDParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageLinkAccess().getTargetMessageCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageLink__TargetAssignment"


    // $ANTLR start "rule__Extend__TypeAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6000:1: rule__Extend__TypeAssignment_1 : ( ( ruleFULL_ID ) ) ;
    public final void rule__Extend__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6004:1: ( ( ( ruleFULL_ID ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6005:1: ( ( ruleFULL_ID ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6005:1: ( ( ruleFULL_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6006:1: ( ruleFULL_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getTypeMessageCrossReference_1_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6007:1: ( ruleFULL_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6008:1: ruleFULL_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getTypeMessageFULL_IDParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_rule__Extend__TypeAssignment_112426);
            ruleFULL_ID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getTypeMessageFULL_IDParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getTypeMessageCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__TypeAssignment_1"


    // $ANTLR start "rule__Extend__ElementsAssignment_3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6019:1: rule__Extend__ElementsAssignment_3 : ( ruleMessageElement ) ;
    public final void rule__Extend__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6023:1: ( ( ruleMessageElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6024:1: ( ruleMessageElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6024:1: ( ruleMessageElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6025:1: ruleMessageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getElementsMessageElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_rule__Extend__ElementsAssignment_312461);
            ruleMessageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getElementsMessageElementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__ElementsAssignment_3"

    // $ANTLR start synpred18_InternalProtobuf
    public final void synpred18_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1487:1: ( ( ( ruleScalarTypeLink ) ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1487:1: ( ( ruleScalarTypeLink ) )
        {
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1487:1: ( ( ruleScalarTypeLink ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1488:1: ( ruleScalarTypeLink )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTypeLinkAccess().getScalarTypeLinkParserRuleCall_0()); 
        }
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1489:1: ( ruleScalarTypeLink )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1489:3: ruleScalarTypeLink
        {
        pushFollow(FOLLOW_ruleScalarTypeLink_in_synpred18_InternalProtobuf3159);
        ruleScalarTypeLink();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred18_InternalProtobuf

    // $ANTLR start synpred19_InternalProtobuf
    public final void synpred19_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1509:1: ( ( ( ruleDefaultValueFieldOption ) ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1509:1: ( ( ruleDefaultValueFieldOption ) )
        {
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1509:1: ( ( ruleDefaultValueFieldOption ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1510:1: ( ruleDefaultValueFieldOption )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getFieldOptionAccess().getDefaultValueFieldOptionParserRuleCall_0()); 
        }
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1511:1: ( ruleDefaultValueFieldOption )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1511:3: ruleDefaultValueFieldOption
        {
        pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_synpred19_InternalProtobuf3210);
        ruleDefaultValueFieldOption();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_InternalProtobuf

    // Delegated rules

    public final boolean synpred19_InternalProtobuf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalProtobuf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalProtobuf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalProtobuf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA7_eotS =
        "\54\uffff";
    static final String DFA7_eofS =
        "\54\uffff";
    static final String DFA7_minS =
        "\1\25\4\4\1\uffff\43\61\1\6\1\62\1\uffff";
    static final String DFA7_maxS =
        "\1\27\4\56\1\uffff\43\61\1\6\1\65\1\uffff";
    static final String DFA7_acceptS =
        "\5\uffff\1\1\45\uffff\1\2";
    static final String DFA7_specialS =
        "\54\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\1\1\1\3",
            "\1\5\10\uffff\15\5\1\4\24\5",
            "\1\5\10\uffff\15\5\1\4\24\5",
            "\1\5\10\uffff\15\5\1\4\24\5",
            "\1\6\10\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50",
            "",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\52",
            "\1\5\1\53\1\uffff\1\5",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1460:1: rule__IndexedElement__Alternatives : ( ( ruleMessageField ) | ( ruleGroup ) );";
        }
    }
    static final String DFA8_eotS =
        "\22\uffff";
    static final String DFA8_eofS =
        "\22\uffff";
    static final String DFA8_minS =
        "\1\4\17\0\2\uffff";
    static final String DFA8_maxS =
        "\1\56\17\0\2\uffff";
    static final String DFA8_acceptS =
        "\20\uffff\1\2\1\1";
    static final String DFA8_specialS =
        "\1\uffff\1\12\1\7\1\4\1\0\1\15\1\13\1\10\1\5\1\1\1\16\1\14\1\11\1\6\1\3\1\2\2\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\20\10\uffff\20\20\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\3\20",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1482:1: rule__TypeLink__Alternatives : ( ( ( ruleScalarTypeLink ) ) | ( ruleComplexTypeLink ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_9 = input.LA(1);

                         
                        int index8_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index8_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_15 = input.LA(1);

                         
                        int index8_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index8_15);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_14 = input.LA(1);

                         
                        int index8_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index8_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_8 = input.LA(1);

                         
                        int index8_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index8_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_13 = input.LA(1);

                         
                        int index8_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index8_13);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index8_7);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA8_12 = input.LA(1);

                         
                        int index8_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index8_12);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA8_11 = input.LA(1);

                         
                        int index8_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index8_11);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA8_10 = input.LA(1);

                         
                        int index8_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index8_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\1\4\1\61\1\uffff\1\5\5\0\1\uffff";
    static final String DFA9_maxS =
        "\1\56\1\61\1\uffff\1\60\5\0\1\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\6\uffff\1\1";
    static final String DFA9_specialS =
        "\4\uffff\1\0\1\4\1\2\1\3\1\1\1\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\10\uffff\37\2\1\1\2\2",
            "\1\3",
            "",
            "\1\10\1\4\1\5\47\uffff\1\6\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1504:1: rule__FieldOption__Alternatives : ( ( ( ruleDefaultValueFieldOption ) ) | ( ruleNativeFieldOption ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalProtobuf()) ) {s = 9;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalProtobuf()) ) {s = 9;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalProtobuf()) ) {s = 9;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalProtobuf()) ) {s = 9;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalProtobuf()) ) {s = 9;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleProto_in_entryRuleProto67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProto74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group__0_in_ruleProto100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_entryRuleSyntax187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntax194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group__0_in_ruleSyntax220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__0_in_ruleOption400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_ruleValue460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_entryRuleSimpleValueLink486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValueLink493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleValueLink__Alternatives_in_ruleSimpleValueLink519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_entryRuleStringLink546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLink553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLink__TargetAssignment_in_ruleStringLink579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLink613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLink__TargetAssignment_in_ruleBooleanLink639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_entryRuleNumberLink666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLink673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLink__Alternatives_in_ruleNumberLink699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_entryRuleIntLink726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLink733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLink__TargetAssignment_in_ruleIntLink759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLink793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLink__TargetAssignment_in_ruleDoubleLink819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Alternatives_in_ruleComplexType879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensibleType913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensibleType__Alternatives_in_ruleExtensibleType939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0_in_ruleMessage999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_entryRuleMessageElement1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageElement1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageElement__Alternatives_in_ruleMessageElement1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedElement1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexedElement__Alternatives_in_ruleIndexedElement1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionRange1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__0_in_ruleExtensionRange1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_entryRuleMessageField1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageField1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__0_in_ruleMessageField1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0_in_ruleGroup1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_entryRuleTypeLink1326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLink1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeLink__Alternatives_in_ruleTypeLink1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink1386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLink1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLink__TargetAssignment_in_ruleComplexTypeLink1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink1446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarTypeLink1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScalarTypeLink__TargetAssignment_in_ruleScalarTypeLink1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOptions1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__0_in_ruleFieldOptions1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_entryRuleFieldOption1566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOption1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOption__Alternatives_in_ruleFieldOption1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption1626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValueFieldOption1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__0_in_ruleDefaultValueFieldOption1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption1686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeFieldOption1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__0_in_ruleNativeFieldOption1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_entryRuleOptionSource1746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionSource1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionSource__TargetAssignment_in_ruleOptionSource1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_entryRuleEnumElement1866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumElement1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumElement__Alternatives_in_ruleEnumElement1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_entryRuleEnumField1926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumField1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__0_in_ruleEnumField1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService1986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceElement_in_entryRuleServiceElement2046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceElement2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceElement__Alternatives_in_ruleServiceElement2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_entryRuleRpc2106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRpc2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__0_in_ruleRpc2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_entryRuleMessageLink2166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageLink2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageLink__TargetAssignment_in_ruleMessageLink2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_entryRuleExtend2226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtend2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__0_in_ruleExtend2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_entryRuleVar_full2286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar_full2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var_full__Alternatives_in_ruleVar_full2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar2346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Alternatives_in_ruleVar2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID2406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFULL_ID2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__0_in_ruleFULL_ID2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_entryRuleVarReserved2466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarReserved2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarReserved__Alternatives_in_ruleVarReserved2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__Alternatives_in_ruleModifier2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScalarType__Alternatives_in_ruleScalarType2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Statement__Alternatives2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Statement__Alternatives2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_rule__Statement__Alternatives2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_rule__Statement__Alternatives2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Statement__Alternatives2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Statement__Alternatives2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_rule__SimpleValueLink__Alternatives2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_rule__SimpleValueLink__Alternatives2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_rule__SimpleValueLink__Alternatives2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_rule__NumberLink__Alternatives2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_rule__NumberLink__Alternatives2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__ComplexType__Alternatives2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_rule__ComplexType__Alternatives2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__ExtensibleType__Alternatives2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__ExtensibleType__Alternatives2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__MessageElement__Alternatives2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_rule__MessageElement__Alternatives2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__MessageElement__Alternatives3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__MessageElement__Alternatives3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_rule__MessageElement__Alternatives3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_rule__MessageElement__Alternatives3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__MessageElement__Alternatives3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_rule__IndexedElement__Alternatives3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__IndexedElement__Alternatives3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_rule__TypeLink__Alternatives3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_rule__TypeLink__Alternatives3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_rule__FieldOption__Alternatives3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_rule__FieldOption__Alternatives3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_rule__EnumElement__Alternatives3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__EnumElement__Alternatives3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_rule__ServiceElement__Alternatives3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__ServiceElement__Alternatives3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_rule__Var_full__Alternatives3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Var_full__Alternatives3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Var__Alternatives3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_rule__Var__Alternatives3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VarReserved__Alternatives3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__VarReserved__Alternatives3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__VarReserved__Alternatives3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VarReserved__Alternatives3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VarReserved__Alternatives3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__VarReserved__Alternatives3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VarReserved__Alternatives3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VarReserved__Alternatives3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VarReserved__Alternatives3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VarReserved__Alternatives3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VarReserved__Alternatives3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__VarReserved__Alternatives3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__VarReserved__Alternatives3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__VarReserved__Alternatives3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__VarReserved__Alternatives3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__VarReserved__Alternatives3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VarReserved__Alternatives3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__VarReserved__Alternatives3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__VarReserved__Alternatives3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__VarReserved__Alternatives3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__VarReserved__Alternatives3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__VarReserved__Alternatives3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__VarReserved__Alternatives3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__VarReserved__Alternatives3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__VarReserved__Alternatives3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__VarReserved__Alternatives3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__VarReserved__Alternatives3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__VarReserved__Alternatives3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__VarReserved__Alternatives4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__VarReserved__Alternatives4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__VarReserved__Alternatives4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__VarReserved__Alternatives4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__VarReserved__Alternatives4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__VarReserved__Alternatives4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__BOOL__Alternatives4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__BOOL__Alternatives4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Modifier__Alternatives4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Modifier__Alternatives4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Modifier__Alternatives4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ScalarType__Alternatives4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ScalarType__Alternatives4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ScalarType__Alternatives4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ScalarType__Alternatives4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ScalarType__Alternatives4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ScalarType__Alternatives4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ScalarType__Alternatives4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ScalarType__Alternatives4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ScalarType__Alternatives4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ScalarType__Alternatives4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ScalarType__Alternatives4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ScalarType__Alternatives4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ScalarType__Alternatives4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ScalarType__Alternatives4561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ScalarType__Alternatives4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group__0__Impl_in_rule__Proto__Group__04615 = new BitSet(new long[]{0x0000000002FF4000L});
    public static final BitSet FOLLOW_rule__Proto__Group__1_in_rule__Proto__Group__04618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__SyntaxAssignment_0_in_rule__Proto__Group__0__Impl4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group__1__Impl_in_rule__Proto__Group__14676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__StatementsAssignment_1_in_rule__Proto__Group__1__Impl4703 = new BitSet(new long[]{0x0000000002FF4002L});
    public static final BitSet FOLLOW_rule__Syntax__Group__0__Impl_in_rule__Syntax__Group__04738 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Syntax__Group__1_in_rule__Syntax__Group__04741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Syntax__Group__0__Impl4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group__1__Impl_in_rule__Syntax__Group__14800 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Syntax__Group__2_in_rule__Syntax__Group__14803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Syntax__Group__1__Impl4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group__2__Impl_in_rule__Syntax__Group__24862 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Syntax__Group__3_in_rule__Syntax__Group__24865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__NameAssignment_2_in_rule__Syntax__Group__2__Impl4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group__3__Impl_in_rule__Syntax__Group__34922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Syntax__Group__3__Impl4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__04989 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__04992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Package__Group__0__Impl5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__15051 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__15054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__25111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Package__Group__2__Impl5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__05176 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__05179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Import__Group__0__Impl5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__15238 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__15241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__25298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Import__Group__2__Impl5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__05363 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Option__Group__1_in_rule__Option__Group__05366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Option__Group__0__Impl5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__15425 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Option__Group__2_in_rule__Option__Group__15428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__SourceAssignment_1_in_rule__Option__Group__1__Impl5455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__2__Impl_in_rule__Option__Group__25485 = new BitSet(new long[]{0x00018000000000E0L});
    public static final BitSet FOLLOW_rule__Option__Group__3_in_rule__Option__Group__25488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Option__Group__2__Impl5516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__3__Impl_in_rule__Option__Group__35547 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Option__Group__4_in_rule__Option__Group__35550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__ValueAssignment_3_in_rule__Option__Group__3__Impl5577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__4__Impl_in_rule__Option__Group__45607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Option__Group__4__Impl5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__05676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__05679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Message__Group__0__Impl5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__15738 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Message__Group__2_in_rule__Message__Group__15741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__NameAssignment_1_in_rule__Message__Group__1__Impl5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__25798 = new BitSet(new long[]{0x0010000003FF4000L});
    public static final BitSet FOLLOW_rule__Message__Group__3_in_rule__Message__Group__25801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Message__Group__2__Impl5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__35860 = new BitSet(new long[]{0x0010000003FF4000L});
    public static final BitSet FOLLOW_rule__Message__Group__4_in_rule__Message__Group__35863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__ElementsAssignment_3_in_rule__Message__Group__3__Impl5890 = new BitSet(new long[]{0x0000000003FF4002L});
    public static final BitSet FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__45921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Message__Group__4__Impl5949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__0__Impl_in_rule__ExtensionRange__Group__05990 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__1_in_rule__ExtensionRange__Group__05993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ExtensionRange__Group__0__Impl6021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__1__Impl_in_rule__ExtensionRange__Group__16052 = new BitSet(new long[]{0x0004000000002000L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__2_in_rule__ExtensionRange__Group__16055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__FromAssignment_1_in_rule__ExtensionRange__Group__1__Impl6082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__2__Impl_in_rule__ExtensionRange__Group__26112 = new BitSet(new long[]{0x0004000000002000L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__3_in_rule__ExtensionRange__Group__26115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__0_in_rule__ExtensionRange__Group__2__Impl6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__3__Impl_in_rule__ExtensionRange__Group__36173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ExtensionRange__Group__3__Impl6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__0__Impl_in_rule__ExtensionRange__Group_2__06240 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__1_in_rule__ExtensionRange__Group_2__06243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ExtensionRange__Group_2__0__Impl6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__1__Impl_in_rule__ExtensionRange__Group_2__16302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__ToAssignment_2_1_in_rule__ExtensionRange__Group_2__1__Impl6329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__0__Impl_in_rule__MessageField__Group__06363 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__MessageField__Group__1_in_rule__MessageField__Group__06366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__ModifierAssignment_0_in_rule__MessageField__Group__0__Impl6393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__1__Impl_in_rule__MessageField__Group__16423 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__MessageField__Group__2_in_rule__MessageField__Group__16426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__TypeAssignment_1_in_rule__MessageField__Group__1__Impl6453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__2__Impl_in_rule__MessageField__Group__26483 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__MessageField__Group__3_in_rule__MessageField__Group__26486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__NameAssignment_2_in_rule__MessageField__Group__2__Impl6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__3__Impl_in_rule__MessageField__Group__36543 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MessageField__Group__4_in_rule__MessageField__Group__36546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__MessageField__Group__3__Impl6574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__4__Impl_in_rule__MessageField__Group__46605 = new BitSet(new long[]{0x0024000000000000L});
    public static final BitSet FOLLOW_rule__MessageField__Group__5_in_rule__MessageField__Group__46608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__IndexAssignment_4_in_rule__MessageField__Group__4__Impl6635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__5__Impl_in_rule__MessageField__Group__56665 = new BitSet(new long[]{0x0024000000000000L});
    public static final BitSet FOLLOW_rule__MessageField__Group__6_in_rule__MessageField__Group__56668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__OptionsAssignment_5_in_rule__MessageField__Group__5__Impl6695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__6__Impl_in_rule__MessageField__Group__66726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__MessageField__Group__6__Impl6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__06799 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__06802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__ModifierAssignment_0_in_rule__Group__Group__0__Impl6829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__16859 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__16862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Group__Group__1__Impl6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__26921 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__26924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl6951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__36981 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__36984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Group__Group__3__Impl7012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__47043 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Group__Group__5_in_rule__Group__Group__47046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__IndexAssignment_4_in_rule__Group__Group__4__Impl7073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__57103 = new BitSet(new long[]{0x0010000000F40000L});
    public static final BitSet FOLLOW_rule__Group__Group__6_in_rule__Group__Group__57106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Group__Group__5__Impl7134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__6__Impl_in_rule__Group__Group__67165 = new BitSet(new long[]{0x0010000000F40000L});
    public static final BitSet FOLLOW_rule__Group__Group__7_in_rule__Group__Group__67168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__ElementsAssignment_6_in_rule__Group__Group__6__Impl7195 = new BitSet(new long[]{0x0000000000F40002L});
    public static final BitSet FOLLOW_rule__Group__Group__7__Impl_in_rule__Group__Group__77226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Group__Group__7__Impl7254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__0__Impl_in_rule__FieldOptions__Group__07301 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__1_in_rule__FieldOptions__Group__07304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__FieldOptions__Group__0__Impl7332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__1__Impl_in_rule__FieldOptions__Group__17363 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__2_in_rule__FieldOptions__Group__17366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__OptionsAssignment_1_in_rule__FieldOptions__Group__1__Impl7393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__2__Impl_in_rule__FieldOptions__Group__27423 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__3_in_rule__FieldOptions__Group__27426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__0_in_rule__FieldOptions__Group__2__Impl7453 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__3__Impl_in_rule__FieldOptions__Group__37484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__FieldOptions__Group__3__Impl7512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__0__Impl_in_rule__FieldOptions__Group_2__07551 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__1_in_rule__FieldOptions__Group_2__07554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__FieldOptions__Group_2__0__Impl7582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__1__Impl_in_rule__FieldOptions__Group_2__17613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__OptionsAssignment_2_1_in_rule__FieldOptions__Group_2__1__Impl7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__0__Impl_in_rule__DefaultValueFieldOption__Group__07674 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__1_in_rule__DefaultValueFieldOption__Group__07677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DefaultValueFieldOption__Group__0__Impl7706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__1__Impl_in_rule__DefaultValueFieldOption__Group__17738 = new BitSet(new long[]{0x00018000000000E0L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__2_in_rule__DefaultValueFieldOption__Group__17741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__DefaultValueFieldOption__Group__1__Impl7769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__2__Impl_in_rule__DefaultValueFieldOption__Group__27800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__ValueAssignment_2_in_rule__DefaultValueFieldOption__Group__2__Impl7827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__0__Impl_in_rule__NativeFieldOption__Group__07863 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__1_in_rule__NativeFieldOption__Group__07866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__SourceAssignment_0_in_rule__NativeFieldOption__Group__0__Impl7893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__1__Impl_in_rule__NativeFieldOption__Group__17923 = new BitSet(new long[]{0x00018000000000E0L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__2_in_rule__NativeFieldOption__Group__17926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__NativeFieldOption__Group__1__Impl7954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__2__Impl_in_rule__NativeFieldOption__Group__27985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__ValueAssignment_2_in_rule__NativeFieldOption__Group__2__Impl8012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__08048 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__08051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Enum__Group__0__Impl8079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__18110 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__18113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl8140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__28170 = new BitSet(new long[]{0x0010000002FF4010L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__28173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Enum__Group__2__Impl8201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__38232 = new BitSet(new long[]{0x0010000002FF4010L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__38235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__ElementsAssignment_3_in_rule__Enum__Group__3__Impl8262 = new BitSet(new long[]{0x0000000002FF4012L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__48293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Enum__Group__4__Impl8321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__0__Impl_in_rule__EnumField__Group__08362 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__1_in_rule__EnumField__Group__08365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__NameAssignment_0_in_rule__EnumField__Group__0__Impl8392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__1__Impl_in_rule__EnumField__Group__18422 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumField__Group__2_in_rule__EnumField__Group__18425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__EnumField__Group__1__Impl8453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__2__Impl_in_rule__EnumField__Group__28484 = new BitSet(new long[]{0x0024000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__3_in_rule__EnumField__Group__28487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__IndexAssignment_2_in_rule__EnumField__Group__2__Impl8514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__3__Impl_in_rule__EnumField__Group__38544 = new BitSet(new long[]{0x0024000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__4_in_rule__EnumField__Group__38547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__0_in_rule__EnumField__Group__3__Impl8574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__4__Impl_in_rule__EnumField__Group__48605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__EnumField__Group__4__Impl8633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__0__Impl_in_rule__EnumField__Group_3__08674 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__1_in_rule__EnumField__Group_3__08677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__EnumField__Group_3__0__Impl8705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__1__Impl_in_rule__EnumField__Group_3__18736 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__2_in_rule__EnumField__Group_3__18739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__OptionsAssignment_3_1_in_rule__EnumField__Group_3__1__Impl8766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__2__Impl_in_rule__EnumField__Group_3__28796 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__3_in_rule__EnumField__Group_3__28799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__0_in_rule__EnumField__Group_3__2__Impl8826 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__3__Impl_in_rule__EnumField__Group_3__38857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__EnumField__Group_3__3__Impl8885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__0__Impl_in_rule__EnumField__Group_3_2__08924 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__1_in_rule__EnumField__Group_3_2__08927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__EnumField__Group_3_2__0__Impl8955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__1__Impl_in_rule__EnumField__Group_3_2__18986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__OptionsAssignment_3_2_1_in_rule__EnumField__Group_3_2__1__Impl9013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__09047 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__09050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Service__Group__0__Impl9078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__19109 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__19112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl9139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__29169 = new BitSet(new long[]{0x000000000AFF4000L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__29172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Service__Group__2__Impl9200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__39231 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__39234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__ElementsAssignment_3_in_rule__Service__Group__3__Impl9263 = new BitSet(new long[]{0x000000000AFF4002L});
    public static final BitSet FOLLOW_rule__Service__ElementsAssignment_3_in_rule__Service__Group__3__Impl9275 = new BitSet(new long[]{0x000000000AFF4002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__49308 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Service__Group__5_in_rule__Service__Group__49311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Service__Group__4__Impl9339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__59370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Service__Group__5__Impl9399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__0__Impl_in_rule__Rpc__Group__09444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rpc__Group__1_in_rule__Rpc__Group__09447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Rpc__Group__0__Impl9475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__1__Impl_in_rule__Rpc__Group__19506 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__2_in_rule__Rpc__Group__19509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__NameAssignment_1_in_rule__Rpc__Group__1__Impl9536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__2__Impl_in_rule__Rpc__Group__29566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rpc__Group__3_in_rule__Rpc__Group__29569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Rpc__Group__2__Impl9597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__3__Impl_in_rule__Rpc__Group__39628 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__4_in_rule__Rpc__Group__39631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__ArgTypeAssignment_3_in_rule__Rpc__Group__3__Impl9658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__4__Impl_in_rule__Rpc__Group__49688 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__5_in_rule__Rpc__Group__49691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Rpc__Group__4__Impl9719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__5__Impl_in_rule__Rpc__Group__59750 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__6_in_rule__Rpc__Group__59753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Rpc__Group__5__Impl9781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__6__Impl_in_rule__Rpc__Group__69812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rpc__Group__7_in_rule__Rpc__Group__69815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Rpc__Group__6__Impl9843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__7__Impl_in_rule__Rpc__Group__79874 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__8_in_rule__Rpc__Group__79877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__ReturnTypeAssignment_7_in_rule__Rpc__Group__7__Impl9904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__8__Impl_in_rule__Rpc__Group__89934 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__9_in_rule__Rpc__Group__89937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Rpc__Group__8__Impl9965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__9__Impl_in_rule__Rpc__Group__99996 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__10_in_rule__Rpc__Group__99999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__0_in_rule__Rpc__Group__9__Impl10026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__10__Impl_in_rule__Rpc__Group__1010057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Rpc__Group__10__Impl10088 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Rpc__Group__10__Impl10104 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__0__Impl_in_rule__Rpc__Group_9__010161 = new BitSet(new long[]{0x0010000002FF4000L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__1_in_rule__Rpc__Group_9__010164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Rpc__Group_9__0__Impl10192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__1__Impl_in_rule__Rpc__Group_9__110223 = new BitSet(new long[]{0x0010000002FF4000L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__2_in_rule__Rpc__Group_9__110226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__OptionsAssignment_9_1_in_rule__Rpc__Group_9__1__Impl10253 = new BitSet(new long[]{0x0000000002FF4002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__2__Impl_in_rule__Rpc__Group_9__210284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Rpc__Group_9__2__Impl10312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__0__Impl_in_rule__Extend__Group__010349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Extend__Group__1_in_rule__Extend__Group__010352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Extend__Group__0__Impl10380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__1__Impl_in_rule__Extend__Group__110411 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Extend__Group__2_in_rule__Extend__Group__110414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__TypeAssignment_1_in_rule__Extend__Group__1__Impl10441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__2__Impl_in_rule__Extend__Group__210471 = new BitSet(new long[]{0x0010000003FF4000L});
    public static final BitSet FOLLOW_rule__Extend__Group__3_in_rule__Extend__Group__210474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Extend__Group__2__Impl10502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__3__Impl_in_rule__Extend__Group__310533 = new BitSet(new long[]{0x0010000003FF4000L});
    public static final BitSet FOLLOW_rule__Extend__Group__4_in_rule__Extend__Group__310536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__ElementsAssignment_3_in_rule__Extend__Group__3__Impl10563 = new BitSet(new long[]{0x0000000003FF4002L});
    public static final BitSet FOLLOW_rule__Extend__Group__4__Impl_in_rule__Extend__Group__410594 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Extend__Group__5_in_rule__Extend__Group__410597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Extend__Group__4__Impl10625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__5__Impl_in_rule__Extend__Group__510656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Extend__Group__5__Impl10685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__0__Impl_in_rule__FULL_ID__Group__010730 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__1_in_rule__FULL_ID__Group__010733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FULL_ID__Group__0__Impl10760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__1__Impl_in_rule__FULL_ID__Group__110789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl10818 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl10830 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__0__Impl_in_rule__FULL_ID__Group_1__010867 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__1_in_rule__FULL_ID__Group_1__010870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__FULL_ID__Group_1__0__Impl10898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__1__Impl_in_rule__FULL_ID__Group_1__110929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FULL_ID__Group_1__1__Impl10956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_rule__Proto__SyntaxAssignment_010995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Proto__StatementsAssignment_111026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Syntax__NameAssignment_211057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__Package__NameAssignment_111088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_111119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__Option__SourceAssignment_111154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Option__ValueAssignment_311189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLink__TargetAssignment11220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__BooleanLink__TargetAssignment11251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__IntLink__TargetAssignment11282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMDOUBLE_in_rule__DoubleLink__TargetAssignment11313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__NameAssignment_111344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_rule__Message__ElementsAssignment_311375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__ExtensionRange__FromAssignment_111406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__ExtensionRange__ToAssignment_2_111437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__MessageField__ModifierAssignment_011468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__MessageField__TypeAssignment_111499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__MessageField__NameAssignment_211530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__MessageField__IndexAssignment_411561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_rule__MessageField__OptionsAssignment_511592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Group__ModifierAssignment_011623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Group__NameAssignment_211654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__Group__IndexAssignment_411685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_rule__Group__ElementsAssignment_611716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__ComplexTypeLink__TargetAssignment11751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarType_in_rule__ScalarTypeLink__TargetAssignment11786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_111817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_2_111848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__DefaultValueFieldOption__ValueAssignment_211879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_rule__NativeFieldOption__SourceAssignment_011910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__NativeFieldOption__ValueAssignment_211941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__OptionSource__TargetAssignment11976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_112011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_rule__Enum__ElementsAssignment_312042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumField__NameAssignment_012073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__EnumField__IndexAssignment_212104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_112135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_2_112166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_112197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceElement_in_rule__Service__ElementsAssignment_312228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rpc__NameAssignment_112259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_rule__Rpc__ArgTypeAssignment_312290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_rule__Rpc__ReturnTypeAssignment_712321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Rpc__OptionsAssignment_9_112352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_rule__MessageLink__TargetAssignment12387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_rule__Extend__TypeAssignment_112426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_rule__Extend__ElementsAssignment_312461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_synpred18_InternalProtobuf3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_synpred19_InternalProtobuf3210 = new BitSet(new long[]{0x0000000000000002L});

}