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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMINT", "RULE_NUMDOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'to'", "'package'", "'syntax'", "'import'", "'option'", "'message'", "'service'", "'enum'", "'required'", "'optional'", "'repeated'", "'extensions'", "'extend'", "'group'", "'rpc'", "'returns'", "'int32'", "'int64'", "'uint32'", "'uint64'", "'sint32'", "'sint64'", "'fixed32'", "'fixed64'", "'sfixed32'", "'sfixed64'", "'float'", "'double'", "'bool'", "'string'", "'bytes'", "'default'", "'max'", "'void'", "'weak'", "'packed'", "'true'", "'false'", "';'", "'='", "'public'", "'{'", "'}'", "'oneof'", "','", "'['", "']'", "'('", "')'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
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
    public static final int T__60=60;
    public static final int T__61=61;
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
    public static final int T__62=62;
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


    // $ANTLR start "entryRuleImport"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:145:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:146:1: ( ruleImport EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:147:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport247);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport254); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:154:1: ruleImport : ( ( rule__Import__Alternatives ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:158:2: ( ( ( rule__Import__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:159:1: ( ( rule__Import__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:159:1: ( ( rule__Import__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:160:1: ( rule__Import__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:161:1: ( rule__Import__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:161:2: rule__Import__Alternatives
            {
            pushFollow(FOLLOW_rule__Import__Alternatives_in_ruleImport280);
            rule__Import__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getAlternatives()); 
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


    // $ANTLR start "entryRulePublicImport"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:173:1: entryRulePublicImport : rulePublicImport EOF ;
    public final void entryRulePublicImport() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:174:1: ( rulePublicImport EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:175:1: rulePublicImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportRule()); 
            }
            pushFollow(FOLLOW_rulePublicImport_in_entryRulePublicImport307);
            rulePublicImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPublicImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePublicImport314); if (state.failed) return ;

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
    // $ANTLR end "entryRulePublicImport"


    // $ANTLR start "rulePublicImport"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:182:1: rulePublicImport : ( ( rule__PublicImport__Group__0 ) ) ;
    public final void rulePublicImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:186:2: ( ( ( rule__PublicImport__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:187:1: ( ( rule__PublicImport__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:187:1: ( ( rule__PublicImport__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:188:1: ( rule__PublicImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:189:1: ( rule__PublicImport__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:189:2: rule__PublicImport__Group__0
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__0_in_rulePublicImport340);
            rule__PublicImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPublicImportAccess().getGroup()); 
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
    // $ANTLR end "rulePublicImport"


    // $ANTLR start "entryRuleWeakImport"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:201:1: entryRuleWeakImport : ruleWeakImport EOF ;
    public final void entryRuleWeakImport() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:202:1: ( ruleWeakImport EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:203:1: ruleWeakImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportRule()); 
            }
            pushFollow(FOLLOW_ruleWeakImport_in_entryRuleWeakImport367);
            ruleWeakImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeakImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeakImport374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWeakImport"


    // $ANTLR start "ruleWeakImport"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:210:1: ruleWeakImport : ( ( rule__WeakImport__Group__0 ) ) ;
    public final void ruleWeakImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:214:2: ( ( ( rule__WeakImport__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:215:1: ( ( rule__WeakImport__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:215:1: ( ( rule__WeakImport__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:216:1: ( rule__WeakImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:217:1: ( rule__WeakImport__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:217:2: rule__WeakImport__Group__0
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__0_in_ruleWeakImport400);
            rule__WeakImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeakImportAccess().getGroup()); 
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
    // $ANTLR end "ruleWeakImport"


    // $ANTLR start "entryRuleOption"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:229:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:230:1: ( ruleOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:231:1: ruleOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionRule()); 
            }
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption427);
            ruleOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption434); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:238:1: ruleOption : ( ( rule__Option__Alternatives ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:242:2: ( ( ( rule__Option__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:243:1: ( ( rule__Option__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:243:1: ( ( rule__Option__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:244:1: ( rule__Option__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:245:1: ( rule__Option__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:245:2: rule__Option__Alternatives
            {
            pushFollow(FOLLOW_rule__Option__Alternatives_in_ruleOption460);
            rule__Option__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getAlternatives()); 
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


    // $ANTLR start "entryRuleNativeOption"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:257:1: entryRuleNativeOption : ruleNativeOption EOF ;
    public final void entryRuleNativeOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:258:1: ( ruleNativeOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:259:1: ruleNativeOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionRule()); 
            }
            pushFollow(FOLLOW_ruleNativeOption_in_entryRuleNativeOption487);
            ruleNativeOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeOption494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNativeOption"


    // $ANTLR start "ruleNativeOption"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:266:1: ruleNativeOption : ( ( rule__NativeOption__Group__0 ) ) ;
    public final void ruleNativeOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:270:2: ( ( ( rule__NativeOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:271:1: ( ( rule__NativeOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:271:1: ( ( rule__NativeOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:272:1: ( rule__NativeOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:273:1: ( rule__NativeOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:273:2: rule__NativeOption__Group__0
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__0_in_ruleNativeOption520);
            rule__NativeOption__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeOptionAccess().getGroup()); 
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
    // $ANTLR end "ruleNativeOption"


    // $ANTLR start "entryRuleCustomOption"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:285:1: entryRuleCustomOption : ruleCustomOption EOF ;
    public final void entryRuleCustomOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:286:1: ( ruleCustomOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:287:1: ruleCustomOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionRule()); 
            }
            pushFollow(FOLLOW_ruleCustomOption_in_entryRuleCustomOption547);
            ruleCustomOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomOption554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCustomOption"


    // $ANTLR start "ruleCustomOption"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:294:1: ruleCustomOption : ( ( rule__CustomOption__Group__0 ) ) ;
    public final void ruleCustomOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:298:2: ( ( ( rule__CustomOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:299:1: ( ( rule__CustomOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:299:1: ( ( rule__CustomOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:300:1: ( rule__CustomOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:301:1: ( rule__CustomOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:301:2: rule__CustomOption__Group__0
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__0_in_ruleCustomOption580);
            rule__CustomOption__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomOptionAccess().getGroup()); 
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
    // $ANTLR end "ruleCustomOption"


    // $ANTLR start "entryRuleValue"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:313:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:314:1: ( ruleValue EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:315:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue607);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue614); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:322:1: ruleValue : ( ruleSimpleValueLink ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:326:2: ( ( ruleSimpleValueLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:327:1: ( ruleSimpleValueLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:327:1: ( ruleSimpleValueLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:328:1: ruleSimpleValueLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getSimpleValueLinkParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleSimpleValueLink_in_ruleValue640);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:341:1: entryRuleSimpleValueLink : ruleSimpleValueLink EOF ;
    public final void entryRuleSimpleValueLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:342:1: ( ruleSimpleValueLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:343:1: ruleSimpleValueLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleValueLinkRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleValueLink_in_entryRuleSimpleValueLink666);
            ruleSimpleValueLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleValueLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleValueLink673); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:350:1: ruleSimpleValueLink : ( ( rule__SimpleValueLink__Alternatives ) ) ;
    public final void ruleSimpleValueLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:354:2: ( ( ( rule__SimpleValueLink__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:355:1: ( ( rule__SimpleValueLink__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:355:1: ( ( rule__SimpleValueLink__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:356:1: ( rule__SimpleValueLink__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleValueLinkAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:357:1: ( rule__SimpleValueLink__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:357:2: rule__SimpleValueLink__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleValueLink__Alternatives_in_ruleSimpleValueLink699);
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


    // $ANTLR start "entryRuleCustomIdLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:369:1: entryRuleCustomIdLink : ruleCustomIdLink EOF ;
    public final void entryRuleCustomIdLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:370:1: ( ruleCustomIdLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:371:1: ruleCustomIdLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomIdLinkRule()); 
            }
            pushFollow(FOLLOW_ruleCustomIdLink_in_entryRuleCustomIdLink726);
            ruleCustomIdLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomIdLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomIdLink733); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCustomIdLink"


    // $ANTLR start "ruleCustomIdLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:378:1: ruleCustomIdLink : ( ( rule__CustomIdLink__TargetAssignment ) ) ;
    public final void ruleCustomIdLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:382:2: ( ( ( rule__CustomIdLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:383:1: ( ( rule__CustomIdLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:383:1: ( ( rule__CustomIdLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:384:1: ( rule__CustomIdLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomIdLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:385:1: ( rule__CustomIdLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:385:2: rule__CustomIdLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__CustomIdLink__TargetAssignment_in_ruleCustomIdLink759);
            rule__CustomIdLink__TargetAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomIdLinkAccess().getTargetAssignment()); 
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
    // $ANTLR end "ruleCustomIdLink"


    // $ANTLR start "entryRuleStringLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:397:1: entryRuleStringLink : ruleStringLink EOF ;
    public final void entryRuleStringLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:398:1: ( ruleStringLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:399:1: ruleStringLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLinkRule()); 
            }
            pushFollow(FOLLOW_ruleStringLink_in_entryRuleStringLink786);
            ruleStringLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLink793); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:406:1: ruleStringLink : ( ( rule__StringLink__TargetAssignment ) ) ;
    public final void ruleStringLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:410:2: ( ( ( rule__StringLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:411:1: ( ( rule__StringLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:411:1: ( ( rule__StringLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:412:1: ( rule__StringLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:413:1: ( rule__StringLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:413:2: rule__StringLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__StringLink__TargetAssignment_in_ruleStringLink819);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:425:1: entryRuleBooleanLink : ruleBooleanLink EOF ;
    public final void entryRuleBooleanLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:426:1: ( ruleBooleanLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:427:1: ruleBooleanLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLinkRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink846);
            ruleBooleanLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLink853); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:434:1: ruleBooleanLink : ( ( rule__BooleanLink__TargetAssignment ) ) ;
    public final void ruleBooleanLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:438:2: ( ( ( rule__BooleanLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:439:1: ( ( rule__BooleanLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:439:1: ( ( rule__BooleanLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:440:1: ( rule__BooleanLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:441:1: ( rule__BooleanLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:441:2: rule__BooleanLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLink__TargetAssignment_in_ruleBooleanLink879);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:453:1: entryRuleNumberLink : ruleNumberLink EOF ;
    public final void entryRuleNumberLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:454:1: ( ruleNumberLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:455:1: ruleNumberLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLinkRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLink_in_entryRuleNumberLink906);
            ruleNumberLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLink913); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:462:1: ruleNumberLink : ( ( rule__NumberLink__Alternatives ) ) ;
    public final void ruleNumberLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:466:2: ( ( ( rule__NumberLink__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:467:1: ( ( rule__NumberLink__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:467:1: ( ( rule__NumberLink__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:468:1: ( rule__NumberLink__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLinkAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:469:1: ( rule__NumberLink__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:469:2: rule__NumberLink__Alternatives
            {
            pushFollow(FOLLOW_rule__NumberLink__Alternatives_in_ruleNumberLink939);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:481:1: entryRuleIntLink : ruleIntLink EOF ;
    public final void entryRuleIntLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:482:1: ( ruleIntLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:483:1: ruleIntLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLinkRule()); 
            }
            pushFollow(FOLLOW_ruleIntLink_in_entryRuleIntLink966);
            ruleIntLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLink973); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:490:1: ruleIntLink : ( ( rule__IntLink__TargetAssignment ) ) ;
    public final void ruleIntLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:494:2: ( ( ( rule__IntLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:495:1: ( ( rule__IntLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:495:1: ( ( rule__IntLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:496:1: ( rule__IntLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:497:1: ( rule__IntLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:497:2: rule__IntLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__IntLink__TargetAssignment_in_ruleIntLink999);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:509:1: entryRuleDoubleLink : ruleDoubleLink EOF ;
    public final void entryRuleDoubleLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:510:1: ( ruleDoubleLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:511:1: ruleDoubleLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLinkRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink1026);
            ruleDoubleLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLink1033); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:518:1: ruleDoubleLink : ( ( rule__DoubleLink__TargetAssignment ) ) ;
    public final void ruleDoubleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:522:2: ( ( ( rule__DoubleLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:523:1: ( ( rule__DoubleLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:523:1: ( ( rule__DoubleLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:524:1: ( rule__DoubleLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:525:1: ( rule__DoubleLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:525:2: rule__DoubleLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__DoubleLink__TargetAssignment_in_ruleDoubleLink1059);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:537:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:538:1: ( ruleComplexType EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:539:1: ruleComplexType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeRule()); 
            }
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType1086);
            ruleComplexType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType1093); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:546:1: ruleComplexType : ( ( rule__ComplexType__Alternatives ) ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:550:2: ( ( ( rule__ComplexType__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:551:1: ( ( rule__ComplexType__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:551:1: ( ( rule__ComplexType__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:552:1: ( rule__ComplexType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:553:1: ( rule__ComplexType__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:553:2: rule__ComplexType__Alternatives
            {
            pushFollow(FOLLOW_rule__ComplexType__Alternatives_in_ruleComplexType1119);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:565:1: entryRuleExtensibleType : ruleExtensibleType EOF ;
    public final void entryRuleExtensibleType() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:566:1: ( ruleExtensibleType EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:567:1: ruleExtensibleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensibleTypeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType1146);
            ruleExtensibleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensibleTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensibleType1153); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:574:1: ruleExtensibleType : ( ( rule__ExtensibleType__Alternatives ) ) ;
    public final void ruleExtensibleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:578:2: ( ( ( rule__ExtensibleType__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:579:1: ( ( rule__ExtensibleType__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:579:1: ( ( rule__ExtensibleType__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:580:1: ( rule__ExtensibleType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensibleTypeAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:581:1: ( rule__ExtensibleType__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:581:2: rule__ExtensibleType__Alternatives
            {
            pushFollow(FOLLOW_rule__ExtensibleType__Alternatives_in_ruleExtensibleType1179);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:593:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:594:1: ( ruleMessage EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:595:1: ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage1206);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage1213); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:602:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:606:2: ( ( ( rule__Message__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:607:1: ( ( rule__Message__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:607:1: ( ( rule__Message__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:608:1: ( rule__Message__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:609:1: ( rule__Message__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:609:2: rule__Message__Group__0
            {
            pushFollow(FOLLOW_rule__Message__Group__0_in_ruleMessage1239);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:621:1: entryRuleMessageElement : ruleMessageElement EOF ;
    public final void entryRuleMessageElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:622:1: ( ruleMessageElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:623:1: ruleMessageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageElementRule()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_entryRuleMessageElement1266);
            ruleMessageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageElement1273); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:630:1: ruleMessageElement : ( ( rule__MessageElement__Alternatives ) ) ;
    public final void ruleMessageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:634:2: ( ( ( rule__MessageElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:635:1: ( ( rule__MessageElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:635:1: ( ( rule__MessageElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:636:1: ( rule__MessageElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:637:1: ( rule__MessageElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:637:2: rule__MessageElement__Alternatives
            {
            pushFollow(FOLLOW_rule__MessageElement__Alternatives_in_ruleMessageElement1299);
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


    // $ANTLR start "entryRuleOneof"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:649:1: entryRuleOneof : ruleOneof EOF ;
    public final void entryRuleOneof() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:650:1: ( ruleOneof EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:651:1: ruleOneof EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofRule()); 
            }
            pushFollow(FOLLOW_ruleOneof_in_entryRuleOneof1326);
            ruleOneof();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneof1333); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOneof"


    // $ANTLR start "ruleOneof"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:658:1: ruleOneof : ( ( rule__Oneof__Group__0 ) ) ;
    public final void ruleOneof() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:662:2: ( ( ( rule__Oneof__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:663:1: ( ( rule__Oneof__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:663:1: ( ( rule__Oneof__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:664:1: ( rule__Oneof__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:665:1: ( rule__Oneof__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:665:2: rule__Oneof__Group__0
            {
            pushFollow(FOLLOW_rule__Oneof__Group__0_in_ruleOneof1359);
            rule__Oneof__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofAccess().getGroup()); 
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
    // $ANTLR end "ruleOneof"


    // $ANTLR start "entryRuleOneofField"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:677:1: entryRuleOneofField : ruleOneofField EOF ;
    public final void entryRuleOneofField() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:678:1: ( ruleOneofField EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:679:1: ruleOneofField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldRule()); 
            }
            pushFollow(FOLLOW_ruleOneofField_in_entryRuleOneofField1386);
            ruleOneofField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneofField1393); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOneofField"


    // $ANTLR start "ruleOneofField"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:686:1: ruleOneofField : ( ( rule__OneofField__Group__0 ) ) ;
    public final void ruleOneofField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:690:2: ( ( ( rule__OneofField__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:691:1: ( ( rule__OneofField__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:691:1: ( ( rule__OneofField__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:692:1: ( rule__OneofField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:693:1: ( rule__OneofField__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:693:2: rule__OneofField__Group__0
            {
            pushFollow(FOLLOW_rule__OneofField__Group__0_in_ruleOneofField1419);
            rule__OneofField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofFieldAccess().getGroup()); 
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
    // $ANTLR end "ruleOneofField"


    // $ANTLR start "entryRuleIndexedElement"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:705:1: entryRuleIndexedElement : ruleIndexedElement EOF ;
    public final void entryRuleIndexedElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:706:1: ( ruleIndexedElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:707:1: ruleIndexedElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexedElementRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement1446);
            ruleIndexedElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexedElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedElement1453); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:714:1: ruleIndexedElement : ( ( rule__IndexedElement__Alternatives ) ) ;
    public final void ruleIndexedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:718:2: ( ( ( rule__IndexedElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:719:1: ( ( rule__IndexedElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:719:1: ( ( rule__IndexedElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:720:1: ( rule__IndexedElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexedElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:721:1: ( rule__IndexedElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:721:2: rule__IndexedElement__Alternatives
            {
            pushFollow(FOLLOW_rule__IndexedElement__Alternatives_in_ruleIndexedElement1479);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:733:1: entryRuleExtensionRange : ruleExtensionRange EOF ;
    public final void entryRuleExtensionRange() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:734:1: ( ruleExtensionRange EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:735:1: ruleExtensionRange EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange1506);
            ruleExtensionRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionRange1513); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:742:1: ruleExtensionRange : ( ( rule__ExtensionRange__Group__0 ) ) ;
    public final void ruleExtensionRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:746:2: ( ( ( rule__ExtensionRange__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:747:1: ( ( rule__ExtensionRange__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:747:1: ( ( rule__ExtensionRange__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:748:1: ( rule__ExtensionRange__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:749:1: ( rule__ExtensionRange__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:749:2: rule__ExtensionRange__Group__0
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__0_in_ruleExtensionRange1539);
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


    // $ANTLR start "entryRuleRange"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:761:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:762:1: ( ruleRange EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:763:1: ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange1566);
            ruleRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange1573); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:770:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:774:2: ( ( ( rule__Range__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:775:1: ( ( rule__Range__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:775:1: ( ( rule__Range__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:776:1: ( rule__Range__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:777:1: ( rule__Range__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:777:2: rule__Range__Group__0
            {
            pushFollow(FOLLOW_rule__Range__Group__0_in_ruleRange1599);
            rule__Range__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getGroup()); 
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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleMessageField"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:789:1: entryRuleMessageField : ruleMessageField EOF ;
    public final void entryRuleMessageField() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:790:1: ( ruleMessageField EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:791:1: ruleMessageField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldRule()); 
            }
            pushFollow(FOLLOW_ruleMessageField_in_entryRuleMessageField1626);
            ruleMessageField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageField1633); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:798:1: ruleMessageField : ( ( rule__MessageField__Group__0 ) ) ;
    public final void ruleMessageField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:802:2: ( ( ( rule__MessageField__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:803:1: ( ( rule__MessageField__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:803:1: ( ( rule__MessageField__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:804:1: ( rule__MessageField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:805:1: ( rule__MessageField__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:805:2: rule__MessageField__Group__0
            {
            pushFollow(FOLLOW_rule__MessageField__Group__0_in_ruleMessageField1659);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:817:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:818:1: ( ruleGroup EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:819:1: ruleGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupRule()); 
            }
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup1686);
            ruleGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup1693); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:826:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:830:2: ( ( ( rule__Group__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:831:1: ( ( rule__Group__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:831:1: ( ( rule__Group__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:832:1: ( rule__Group__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:833:1: ( rule__Group__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:833:2: rule__Group__Group__0
            {
            pushFollow(FOLLOW_rule__Group__Group__0_in_ruleGroup1719);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:845:1: entryRuleTypeLink : ruleTypeLink EOF ;
    public final void entryRuleTypeLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:846:1: ( ruleTypeLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:847:1: ruleTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_entryRuleTypeLink1746);
            ruleTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLink1753); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:854:1: ruleTypeLink : ( ( rule__TypeLink__Alternatives ) ) ;
    public final void ruleTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:858:2: ( ( ( rule__TypeLink__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:859:1: ( ( rule__TypeLink__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:859:1: ( ( rule__TypeLink__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:860:1: ( rule__TypeLink__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLinkAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:861:1: ( rule__TypeLink__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:861:2: rule__TypeLink__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeLink__Alternatives_in_ruleTypeLink1779);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:873:1: entryRuleComplexTypeLink : ruleComplexTypeLink EOF ;
    public final void entryRuleComplexTypeLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:874:1: ( ruleComplexTypeLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:875:1: ruleComplexTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink1806);
            ruleComplexTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLink1813); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:882:1: ruleComplexTypeLink : ( ( rule__ComplexTypeLink__TargetAssignment ) ) ;
    public final void ruleComplexTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:886:2: ( ( ( rule__ComplexTypeLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:887:1: ( ( rule__ComplexTypeLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:887:1: ( ( rule__ComplexTypeLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:888:1: ( rule__ComplexTypeLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:889:1: ( rule__ComplexTypeLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:889:2: rule__ComplexTypeLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__ComplexTypeLink__TargetAssignment_in_ruleComplexTypeLink1839);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:901:1: entryRuleScalarTypeLink : ruleScalarTypeLink EOF ;
    public final void entryRuleScalarTypeLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:902:1: ( ruleScalarTypeLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:903:1: ruleScalarTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink1866);
            ruleScalarTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScalarTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarTypeLink1873); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:910:1: ruleScalarTypeLink : ( ( rule__ScalarTypeLink__TargetAssignment ) ) ;
    public final void ruleScalarTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:914:2: ( ( ( rule__ScalarTypeLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:915:1: ( ( rule__ScalarTypeLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:915:1: ( ( rule__ScalarTypeLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:916:1: ( rule__ScalarTypeLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:917:1: ( rule__ScalarTypeLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:917:2: rule__ScalarTypeLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__ScalarTypeLink__TargetAssignment_in_ruleScalarTypeLink1899);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:929:1: entryRuleFieldOptions : ruleFieldOptions EOF ;
    public final void entryRuleFieldOptions() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:930:1: ( ruleFieldOptions EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:931:1: ruleFieldOptions EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions1926);
            ruleFieldOptions();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOptions1933); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:938:1: ruleFieldOptions : ( ( rule__FieldOptions__Group__0 ) ) ;
    public final void ruleFieldOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:942:2: ( ( ( rule__FieldOptions__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:943:1: ( ( rule__FieldOptions__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:943:1: ( ( rule__FieldOptions__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:944:1: ( rule__FieldOptions__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:945:1: ( rule__FieldOptions__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:945:2: rule__FieldOptions__Group__0
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__0_in_ruleFieldOptions1959);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:957:1: entryRuleFieldOption : ruleFieldOption EOF ;
    public final void entryRuleFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:958:1: ( ruleFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:959:1: ruleFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_entryRuleFieldOption1986);
            ruleFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOption1993); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:966:1: ruleFieldOption : ( ( rule__FieldOption__Alternatives ) ) ;
    public final void ruleFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:970:2: ( ( ( rule__FieldOption__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:971:1: ( ( rule__FieldOption__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:971:1: ( ( rule__FieldOption__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:972:1: ( rule__FieldOption__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:973:1: ( rule__FieldOption__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:973:2: rule__FieldOption__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldOption__Alternatives_in_ruleFieldOption2019);
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


    // $ANTLR start "entryRulePackedValueFieldOption"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:985:1: entryRulePackedValueFieldOption : rulePackedValueFieldOption EOF ;
    public final void entryRulePackedValueFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:986:1: ( rulePackedValueFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:987:1: rulePackedValueFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionRule()); 
            }
            pushFollow(FOLLOW_rulePackedValueFieldOption_in_entryRulePackedValueFieldOption2046);
            rulePackedValueFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackedValueFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackedValueFieldOption2053); if (state.failed) return ;

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
    // $ANTLR end "entryRulePackedValueFieldOption"


    // $ANTLR start "rulePackedValueFieldOption"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:994:1: rulePackedValueFieldOption : ( ( rule__PackedValueFieldOption__Group__0 ) ) ;
    public final void rulePackedValueFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:998:2: ( ( ( rule__PackedValueFieldOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:999:1: ( ( rule__PackedValueFieldOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:999:1: ( ( rule__PackedValueFieldOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1000:1: ( rule__PackedValueFieldOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1001:1: ( rule__PackedValueFieldOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1001:2: rule__PackedValueFieldOption__Group__0
            {
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__0_in_rulePackedValueFieldOption2079);
            rule__PackedValueFieldOption__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackedValueFieldOptionAccess().getGroup()); 
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
    // $ANTLR end "rulePackedValueFieldOption"


    // $ANTLR start "entryRuleDefaultValueFieldOption"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1013:1: entryRuleDefaultValueFieldOption : ruleDefaultValueFieldOption EOF ;
    public final void entryRuleDefaultValueFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1014:1: ( ruleDefaultValueFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1015:1: ruleDefaultValueFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption2106);
            ruleDefaultValueFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultValueFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValueFieldOption2113); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1022:1: ruleDefaultValueFieldOption : ( ( rule__DefaultValueFieldOption__Group__0 ) ) ;
    public final void ruleDefaultValueFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1026:2: ( ( ( rule__DefaultValueFieldOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1027:1: ( ( rule__DefaultValueFieldOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1027:1: ( ( rule__DefaultValueFieldOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1028:1: ( rule__DefaultValueFieldOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1029:1: ( rule__DefaultValueFieldOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1029:2: rule__DefaultValueFieldOption__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__0_in_ruleDefaultValueFieldOption2139);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1041:1: entryRuleNativeFieldOption : ruleNativeFieldOption EOF ;
    public final void entryRuleNativeFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1042:1: ( ruleNativeFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1043:1: ruleNativeFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption2166);
            ruleNativeFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeFieldOption2173); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1050:1: ruleNativeFieldOption : ( ( rule__NativeFieldOption__Group__0 ) ) ;
    public final void ruleNativeFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1054:2: ( ( ( rule__NativeFieldOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1055:1: ( ( rule__NativeFieldOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1055:1: ( ( rule__NativeFieldOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1056:1: ( rule__NativeFieldOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1057:1: ( rule__NativeFieldOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1057:2: rule__NativeFieldOption__Group__0
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__0_in_ruleNativeFieldOption2199);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1069:1: entryRuleOptionSource : ruleOptionSource EOF ;
    public final void entryRuleOptionSource() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1070:1: ( ruleOptionSource EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1071:1: ruleOptionSource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceRule()); 
            }
            pushFollow(FOLLOW_ruleOptionSource_in_entryRuleOptionSource2226);
            ruleOptionSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionSourceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionSource2233); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1078:1: ruleOptionSource : ( ( rule__OptionSource__TargetAssignment ) ) ;
    public final void ruleOptionSource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1082:2: ( ( ( rule__OptionSource__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1083:1: ( ( rule__OptionSource__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1083:1: ( ( rule__OptionSource__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1084:1: ( rule__OptionSource__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1085:1: ( rule__OptionSource__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1085:2: rule__OptionSource__TargetAssignment
            {
            pushFollow(FOLLOW_rule__OptionSource__TargetAssignment_in_ruleOptionSource2259);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1097:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1098:1: ( ruleEnum EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1099:1: ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum2286);
            ruleEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum2293); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1106:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1110:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1111:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1111:1: ( ( rule__Enum__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1112:1: ( rule__Enum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1113:1: ( rule__Enum__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1113:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum2319);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1125:1: entryRuleEnumElement : ruleEnumElement EOF ;
    public final void entryRuleEnumElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1126:1: ( ruleEnumElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1127:1: ruleEnumElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumElementRule()); 
            }
            pushFollow(FOLLOW_ruleEnumElement_in_entryRuleEnumElement2346);
            ruleEnumElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumElement2353); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1134:1: ruleEnumElement : ( ( rule__EnumElement__Alternatives ) ) ;
    public final void ruleEnumElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1138:2: ( ( ( rule__EnumElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1139:1: ( ( rule__EnumElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1139:1: ( ( rule__EnumElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1140:1: ( rule__EnumElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1141:1: ( rule__EnumElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1141:2: rule__EnumElement__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumElement__Alternatives_in_ruleEnumElement2379);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1153:1: entryRuleEnumField : ruleEnumField EOF ;
    public final void entryRuleEnumField() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1154:1: ( ruleEnumField EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1155:1: ruleEnumField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldRule()); 
            }
            pushFollow(FOLLOW_ruleEnumField_in_entryRuleEnumField2406);
            ruleEnumField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumField2413); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1162:1: ruleEnumField : ( ( rule__EnumField__Group__0 ) ) ;
    public final void ruleEnumField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1166:2: ( ( ( rule__EnumField__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1167:1: ( ( rule__EnumField__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1167:1: ( ( rule__EnumField__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1168:1: ( rule__EnumField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1169:1: ( rule__EnumField__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1169:2: rule__EnumField__Group__0
            {
            pushFollow(FOLLOW_rule__EnumField__Group__0_in_ruleEnumField2439);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1181:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1182:1: ( ruleService EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1183:1: ruleService EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService2466);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService2473); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1190:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1194:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1195:1: ( ( rule__Service__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1195:1: ( ( rule__Service__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1196:1: ( rule__Service__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1197:1: ( rule__Service__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1197:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService2499);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1209:1: entryRuleServiceElement : ruleServiceElement EOF ;
    public final void entryRuleServiceElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1210:1: ( ruleServiceElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1211:1: ruleServiceElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceElementRule()); 
            }
            pushFollow(FOLLOW_ruleServiceElement_in_entryRuleServiceElement2526);
            ruleServiceElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceElement2533); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1218:1: ruleServiceElement : ( ( rule__ServiceElement__Alternatives ) ) ;
    public final void ruleServiceElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1222:2: ( ( ( rule__ServiceElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1223:1: ( ( rule__ServiceElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1223:1: ( ( rule__ServiceElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1224:1: ( rule__ServiceElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1225:1: ( rule__ServiceElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1225:2: rule__ServiceElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ServiceElement__Alternatives_in_ruleServiceElement2559);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1237:1: entryRuleRpc : ruleRpc EOF ;
    public final void entryRuleRpc() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1238:1: ( ruleRpc EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1239:1: ruleRpc EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcRule()); 
            }
            pushFollow(FOLLOW_ruleRpc_in_entryRuleRpc2586);
            ruleRpc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRpc2593); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1246:1: ruleRpc : ( ( rule__Rpc__Group__0 ) ) ;
    public final void ruleRpc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1250:2: ( ( ( rule__Rpc__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1251:1: ( ( rule__Rpc__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1251:1: ( ( rule__Rpc__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1252:1: ( rule__Rpc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1253:1: ( rule__Rpc__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1253:2: rule__Rpc__Group__0
            {
            pushFollow(FOLLOW_rule__Rpc__Group__0_in_ruleRpc2619);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1265:1: entryRuleMessageLink : ruleMessageLink EOF ;
    public final void entryRuleMessageLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1266:1: ( ruleMessageLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1267:1: ruleMessageLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkRule()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_entryRuleMessageLink2646);
            ruleMessageLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageLink2653); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1274:1: ruleMessageLink : ( ( rule__MessageLink__TargetAssignment ) ) ;
    public final void ruleMessageLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1278:2: ( ( ( rule__MessageLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1279:1: ( ( rule__MessageLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1279:1: ( ( rule__MessageLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1280:1: ( rule__MessageLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1281:1: ( rule__MessageLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1281:2: rule__MessageLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__MessageLink__TargetAssignment_in_ruleMessageLink2679);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1293:1: entryRuleExtend : ruleExtend EOF ;
    public final void entryRuleExtend() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1294:1: ( ruleExtend EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1295:1: ruleExtend EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendRule()); 
            }
            pushFollow(FOLLOW_ruleExtend_in_entryRuleExtend2706);
            ruleExtend();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtend2713); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1302:1: ruleExtend : ( ( rule__Extend__Group__0 ) ) ;
    public final void ruleExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1306:2: ( ( ( rule__Extend__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1307:1: ( ( rule__Extend__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1307:1: ( ( rule__Extend__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1308:1: ( rule__Extend__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1309:1: ( rule__Extend__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1309:2: rule__Extend__Group__0
            {
            pushFollow(FOLLOW_rule__Extend__Group__0_in_ruleExtend2739);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1321:1: entryRuleVar_full : ruleVar_full EOF ;
    public final void entryRuleVar_full() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1322:1: ( ruleVar_full EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1323:1: ruleVar_full EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_fullRule()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_entryRuleVar_full2766);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_fullRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar_full2773); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1330:1: ruleVar_full : ( ( rule__Var_full__Alternatives ) ) ;
    public final void ruleVar_full() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1334:2: ( ( ( rule__Var_full__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1335:1: ( ( rule__Var_full__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1335:1: ( ( rule__Var_full__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1336:1: ( rule__Var_full__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_fullAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1337:1: ( rule__Var_full__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1337:2: rule__Var_full__Alternatives
            {
            pushFollow(FOLLOW_rule__Var_full__Alternatives_in_ruleVar_full2799);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1349:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1350:1: ( ruleVar EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1351:1: ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar2826);
            ruleVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar2833); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1358:1: ruleVar : ( ( rule__Var__Alternatives ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1362:2: ( ( ( rule__Var__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1363:1: ( ( rule__Var__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1363:1: ( ( rule__Var__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1364:1: ( rule__Var__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1365:1: ( rule__Var__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1365:2: rule__Var__Alternatives
            {
            pushFollow(FOLLOW_rule__Var__Alternatives_in_ruleVar2859);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1377:1: entryRuleFULL_ID : ruleFULL_ID EOF ;
    public final void entryRuleFULL_ID() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1378:1: ( ruleFULL_ID EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1379:1: ruleFULL_ID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDRule()); 
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID2886);
            ruleFULL_ID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFULL_IDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFULL_ID2893); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1386:1: ruleFULL_ID : ( ( rule__FULL_ID__Group__0 ) ) ;
    public final void ruleFULL_ID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1390:2: ( ( ( rule__FULL_ID__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1391:1: ( ( rule__FULL_ID__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1391:1: ( ( rule__FULL_ID__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1392:1: ( rule__FULL_ID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1393:1: ( rule__FULL_ID__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1393:2: rule__FULL_ID__Group__0
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group__0_in_ruleFULL_ID2919);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1405:1: entryRuleVarReserved : ruleVarReserved EOF ;
    public final void entryRuleVarReserved() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1406:1: ( ruleVarReserved EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1407:1: ruleVarReserved EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReservedRule()); 
            }
            pushFollow(FOLLOW_ruleVarReserved_in_entryRuleVarReserved2946);
            ruleVarReserved();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarReservedRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarReserved2953); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1414:1: ruleVarReserved : ( ( rule__VarReserved__Alternatives ) ) ;
    public final void ruleVarReserved() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1418:2: ( ( ( rule__VarReserved__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1419:1: ( ( rule__VarReserved__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1419:1: ( ( rule__VarReserved__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1420:1: ( rule__VarReserved__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReservedAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1421:1: ( rule__VarReserved__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1421:2: rule__VarReserved__Alternatives
            {
            pushFollow(FOLLOW_rule__VarReserved__Alternatives_in_ruleVarReserved2979);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1436:1: ruleBOOL : ( ( rule__BOOL__Alternatives ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1440:1: ( ( ( rule__BOOL__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1441:1: ( ( rule__BOOL__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1441:1: ( ( rule__BOOL__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1442:1: ( rule__BOOL__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1443:1: ( rule__BOOL__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1443:2: rule__BOOL__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL3018);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1455:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1459:1: ( ( ( rule__Modifier__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1460:1: ( ( rule__Modifier__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1460:1: ( ( rule__Modifier__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1461:1: ( rule__Modifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModifierAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1462:1: ( rule__Modifier__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1462:2: rule__Modifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Modifier__Alternatives_in_ruleModifier3054);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1474:1: ruleScalarType : ( ( rule__ScalarType__Alternatives ) ) ;
    public final void ruleScalarType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1478:1: ( ( ( rule__ScalarType__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1479:1: ( ( rule__ScalarType__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1479:1: ( ( rule__ScalarType__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1480:1: ( rule__ScalarType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1481:1: ( rule__ScalarType__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1481:2: rule__ScalarType__Alternatives
            {
            pushFollow(FOLLOW_rule__ScalarType__Alternatives_in_ruleScalarType3090);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1492:1: rule__Statement__Alternatives : ( ( ruleComplexType ) | ( ( ruleExtend ) ) | ( ruleService ) | ( ruleCustomOption ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1496:1: ( ( ruleComplexType ) | ( ( ruleExtend ) ) | ( ruleService ) | ( ruleCustomOption ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 17:
                {
                alt1=4;
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1497:1: ( ruleComplexType )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1497:1: ( ruleComplexType )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1498:1: ruleComplexType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getComplexTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleComplexType_in_rule__Statement__Alternatives3125);
                    ruleComplexType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getComplexTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1503:6: ( ( ruleExtend ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1503:6: ( ( ruleExtend ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1504:1: ( ruleExtend )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getExtendParserRuleCall_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1505:1: ( ruleExtend )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1505:3: ruleExtend
                    {
                    pushFollow(FOLLOW_ruleExtend_in_rule__Statement__Alternatives3143);
                    ruleExtend();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getExtendParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1509:6: ( ruleService )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1509:6: ( ruleService )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1510:1: ruleService
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getServiceParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleService_in_rule__Statement__Alternatives3161);
                    ruleService();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getServiceParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1515:6: ( ruleCustomOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1515:6: ( ruleCustomOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1516:1: ruleCustomOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getCustomOptionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleCustomOption_in_rule__Statement__Alternatives3178);
                    ruleCustomOption();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getCustomOptionParserRuleCall_3()); 
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


    // $ANTLR start "rule__Import__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1526:1: rule__Import__Alternatives : ( ( rulePublicImport ) | ( ruleWeakImport ) );
    public final void rule__Import__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1530:1: ( ( rulePublicImport ) | ( ruleWeakImport ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==53) ) {
                    alt2=1;
                }
                else if ( (LA2_1==RULE_STRING||LA2_1==47) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1531:1: ( rulePublicImport )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1531:1: ( rulePublicImport )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1532:1: rulePublicImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getPublicImportParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePublicImport_in_rule__Import__Alternatives3210);
                    rulePublicImport();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportAccess().getPublicImportParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1537:6: ( ruleWeakImport )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1537:6: ( ruleWeakImport )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1538:1: ruleWeakImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getWeakImportParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleWeakImport_in_rule__Import__Alternatives3227);
                    ruleWeakImport();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportAccess().getWeakImportParserRuleCall_1()); 
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
    // $ANTLR end "rule__Import__Alternatives"


    // $ANTLR start "rule__Option__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1548:1: rule__Option__Alternatives : ( ( ( ruleNativeOption ) ) | ( ruleCustomOption ) );
    public final void rule__Option__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1552:1: ( ( ( ruleNativeOption ) ) | ( ruleCustomOption ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1553:1: ( ( ruleNativeOption ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1553:1: ( ( ruleNativeOption ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1554:1: ( ruleNativeOption )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOptionAccess().getNativeOptionParserRuleCall_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1555:1: ( ruleNativeOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1555:3: ruleNativeOption
                    {
                    pushFollow(FOLLOW_ruleNativeOption_in_rule__Option__Alternatives3260);
                    ruleNativeOption();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOptionAccess().getNativeOptionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1559:6: ( ruleCustomOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1559:6: ( ruleCustomOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1560:1: ruleCustomOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOptionAccess().getCustomOptionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCustomOption_in_rule__Option__Alternatives3278);
                    ruleCustomOption();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOptionAccess().getCustomOptionParserRuleCall_1()); 
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
    // $ANTLR end "rule__Option__Alternatives"


    // $ANTLR start "rule__SimpleValueLink__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1570:1: rule__SimpleValueLink__Alternatives : ( ( ruleNumberLink ) | ( ruleBooleanLink ) | ( ruleStringLink ) | ( ruleCustomIdLink ) );
    public final void rule__SimpleValueLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1574:1: ( ( ruleNumberLink ) | ( ruleBooleanLink ) | ( ruleStringLink ) | ( ruleCustomIdLink ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_NUMINT:
            case RULE_NUMDOUBLE:
                {
                alt4=1;
                }
                break;
            case 49:
            case 50:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1575:1: ( ruleNumberLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1575:1: ( ruleNumberLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1576:1: ruleNumberLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getNumberLinkParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleNumberLink_in_rule__SimpleValueLink__Alternatives3310);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1581:6: ( ruleBooleanLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1581:6: ( ruleBooleanLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1582:1: ruleBooleanLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getBooleanLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLink_in_rule__SimpleValueLink__Alternatives3327);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1587:6: ( ruleStringLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1587:6: ( ruleStringLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1588:1: ruleStringLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getStringLinkParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleStringLink_in_rule__SimpleValueLink__Alternatives3344);
                    ruleStringLink();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleValueLinkAccess().getStringLinkParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1593:6: ( ruleCustomIdLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1593:6: ( ruleCustomIdLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1594:1: ruleCustomIdLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getCustomIdLinkParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleCustomIdLink_in_rule__SimpleValueLink__Alternatives3361);
                    ruleCustomIdLink();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleValueLinkAccess().getCustomIdLinkParserRuleCall_3()); 
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1604:1: rule__NumberLink__Alternatives : ( ( ruleIntLink ) | ( ruleDoubleLink ) );
    public final void rule__NumberLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1608:1: ( ( ruleIntLink ) | ( ruleDoubleLink ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NUMINT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_NUMDOUBLE) ) {
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1609:1: ( ruleIntLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1609:1: ( ruleIntLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1610:1: ruleIntLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLinkAccess().getIntLinkParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleIntLink_in_rule__NumberLink__Alternatives3393);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1615:6: ( ruleDoubleLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1615:6: ( ruleDoubleLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1616:1: ruleDoubleLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLinkAccess().getDoubleLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleDoubleLink_in_rule__NumberLink__Alternatives3410);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1626:1: rule__ComplexType__Alternatives : ( ( ruleEnum ) | ( ruleExtensibleType ) );
    public final void rule__ComplexType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1630:1: ( ( ruleEnum ) | ( ruleExtensibleType ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==18||(LA6_0>=21 && LA6_0<=23)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1631:1: ( ruleEnum )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1631:1: ( ruleEnum )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1632:1: ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComplexTypeAccess().getEnumParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEnum_in_rule__ComplexType__Alternatives3442);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1637:6: ( ruleExtensibleType )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1637:6: ( ruleExtensibleType )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1638:1: ruleExtensibleType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComplexTypeAccess().getExtensibleTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleExtensibleType_in_rule__ComplexType__Alternatives3459);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1648:1: rule__ExtensibleType__Alternatives : ( ( ruleMessage ) | ( ruleGroup ) );
    public final void rule__ExtensibleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1652:1: ( ( ruleMessage ) | ( ruleGroup ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=21 && LA7_0<=23)) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1653:1: ( ruleMessage )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1653:1: ( ruleMessage )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1654:1: ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensibleTypeAccess().getMessageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMessage_in_rule__ExtensibleType__Alternatives3491);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1659:6: ( ruleGroup )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1659:6: ( ruleGroup )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1660:1: ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensibleTypeAccess().getGroupParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGroup_in_rule__ExtensibleType__Alternatives3508);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1670:1: rule__MessageElement__Alternatives : ( ( ruleMessage ) | ( ruleIndexedElement ) | ( ruleOneof ) | ( ruleEnum ) | ( ruleService ) | ( ( ruleExtend ) ) | ( ruleExtensionRange ) | ( ruleOption ) );
    public final void rule__MessageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1674:1: ( ( ruleMessage ) | ( ruleIndexedElement ) | ( ruleOneof ) | ( ruleEnum ) | ( ruleService ) | ( ( ruleExtend ) ) | ( ruleExtensionRange ) | ( ruleOption ) )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 21:
            case 22:
            case 23:
                {
                alt8=2;
                }
                break;
            case 56:
                {
                alt8=3;
                }
                break;
            case 20:
                {
                alt8=4;
                }
                break;
            case 19:
                {
                alt8=5;
                }
                break;
            case 25:
                {
                alt8=6;
                }
                break;
            case 24:
                {
                alt8=7;
                }
                break;
            case 17:
                {
                alt8=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1675:1: ( ruleMessage )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1675:1: ( ruleMessage )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1676:1: ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getMessageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMessage_in_rule__MessageElement__Alternatives3540);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1681:6: ( ruleIndexedElement )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1681:6: ( ruleIndexedElement )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1682:1: ruleIndexedElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getIndexedElementParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIndexedElement_in_rule__MessageElement__Alternatives3557);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1687:6: ( ruleOneof )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1687:6: ( ruleOneof )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1688:1: ruleOneof
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getOneofParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleOneof_in_rule__MessageElement__Alternatives3574);
                    ruleOneof();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageElementAccess().getOneofParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1693:6: ( ruleEnum )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1693:6: ( ruleEnum )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1694:1: ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getEnumParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleEnum_in_rule__MessageElement__Alternatives3591);
                    ruleEnum();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageElementAccess().getEnumParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1699:6: ( ruleService )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1699:6: ( ruleService )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1700:1: ruleService
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getServiceParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleService_in_rule__MessageElement__Alternatives3608);
                    ruleService();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageElementAccess().getServiceParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1705:6: ( ( ruleExtend ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1705:6: ( ( ruleExtend ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1706:1: ( ruleExtend )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getExtendParserRuleCall_5()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1707:1: ( ruleExtend )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1707:3: ruleExtend
                    {
                    pushFollow(FOLLOW_ruleExtend_in_rule__MessageElement__Alternatives3626);
                    ruleExtend();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageElementAccess().getExtendParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1711:6: ( ruleExtensionRange )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1711:6: ( ruleExtensionRange )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1712:1: ruleExtensionRange
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getExtensionRangeParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleExtensionRange_in_rule__MessageElement__Alternatives3644);
                    ruleExtensionRange();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageElementAccess().getExtensionRangeParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1717:6: ( ruleOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1717:6: ( ruleOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1718:1: ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getOptionParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_ruleOption_in_rule__MessageElement__Alternatives3661);
                    ruleOption();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageElementAccess().getOptionParserRuleCall_7()); 
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1728:1: rule__IndexedElement__Alternatives : ( ( ruleMessageField ) | ( ruleGroup ) );
    public final void rule__IndexedElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1732:1: ( ( ruleMessageField ) | ( ruleGroup ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1733:1: ( ruleMessageField )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1733:1: ( ruleMessageField )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1734:1: ruleMessageField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIndexedElementAccess().getMessageFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMessageField_in_rule__IndexedElement__Alternatives3693);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1739:6: ( ruleGroup )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1739:6: ( ruleGroup )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1740:1: ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIndexedElementAccess().getGroupParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGroup_in_rule__IndexedElement__Alternatives3710);
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


    // $ANTLR start "rule__Range__Alternatives_1_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1750:1: rule__Range__Alternatives_1_1 : ( ( ( rule__Range__ToAssignment_1_1_0 ) ) | ( ( rule__Range__MaxAssignment_1_1_1 ) ) );
    public final void rule__Range__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1754:1: ( ( ( rule__Range__ToAssignment_1_1_0 ) ) | ( ( rule__Range__MaxAssignment_1_1_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_NUMINT) ) {
                alt10=1;
            }
            else if ( (LA10_0==45) ) {
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1755:1: ( ( rule__Range__ToAssignment_1_1_0 ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1755:1: ( ( rule__Range__ToAssignment_1_1_0 ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1756:1: ( rule__Range__ToAssignment_1_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeAccess().getToAssignment_1_1_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1757:1: ( rule__Range__ToAssignment_1_1_0 )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1757:2: rule__Range__ToAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Range__ToAssignment_1_1_0_in_rule__Range__Alternatives_1_13742);
                    rule__Range__ToAssignment_1_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRangeAccess().getToAssignment_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1761:6: ( ( rule__Range__MaxAssignment_1_1_1 ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1761:6: ( ( rule__Range__MaxAssignment_1_1_1 ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1762:1: ( rule__Range__MaxAssignment_1_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeAccess().getMaxAssignment_1_1_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1763:1: ( rule__Range__MaxAssignment_1_1_1 )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1763:2: rule__Range__MaxAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_rule__Range__MaxAssignment_1_1_1_in_rule__Range__Alternatives_1_13760);
                    rule__Range__MaxAssignment_1_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRangeAccess().getMaxAssignment_1_1_1()); 
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
    // $ANTLR end "rule__Range__Alternatives_1_1"


    // $ANTLR start "rule__TypeLink__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1772:1: rule__TypeLink__Alternatives : ( ( ( ruleScalarTypeLink ) ) | ( ruleComplexTypeLink ) );
    public final void rule__TypeLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1776:1: ( ( ( ruleScalarTypeLink ) ) | ( ruleComplexTypeLink ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1777:1: ( ( ruleScalarTypeLink ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1777:1: ( ( ruleScalarTypeLink ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1778:1: ( ruleScalarTypeLink )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLinkAccess().getScalarTypeLinkParserRuleCall_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1779:1: ( ruleScalarTypeLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1779:3: ruleScalarTypeLink
                    {
                    pushFollow(FOLLOW_ruleScalarTypeLink_in_rule__TypeLink__Alternatives3794);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1783:6: ( ruleComplexTypeLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1783:6: ( ruleComplexTypeLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1784:1: ruleComplexTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLinkAccess().getComplexTypeLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleComplexTypeLink_in_rule__TypeLink__Alternatives3812);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1794:1: rule__FieldOption__Alternatives : ( ( ( rulePackedValueFieldOption ) ) | ( ( ruleDefaultValueFieldOption ) ) | ( ruleNativeFieldOption ) );
    public final void rule__FieldOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1798:1: ( ( ( rulePackedValueFieldOption ) ) | ( ( ruleDefaultValueFieldOption ) ) | ( ruleNativeFieldOption ) )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1799:1: ( ( rulePackedValueFieldOption ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1799:1: ( ( rulePackedValueFieldOption ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1800:1: ( rulePackedValueFieldOption )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldOptionAccess().getPackedValueFieldOptionParserRuleCall_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1801:1: ( rulePackedValueFieldOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1801:3: rulePackedValueFieldOption
                    {
                    pushFollow(FOLLOW_rulePackedValueFieldOption_in_rule__FieldOption__Alternatives3845);
                    rulePackedValueFieldOption();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldOptionAccess().getPackedValueFieldOptionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1805:6: ( ( ruleDefaultValueFieldOption ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1805:6: ( ( ruleDefaultValueFieldOption ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1806:1: ( ruleDefaultValueFieldOption )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldOptionAccess().getDefaultValueFieldOptionParserRuleCall_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1807:1: ( ruleDefaultValueFieldOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1807:3: ruleDefaultValueFieldOption
                    {
                    pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_rule__FieldOption__Alternatives3864);
                    ruleDefaultValueFieldOption();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldOptionAccess().getDefaultValueFieldOptionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1811:6: ( ruleNativeFieldOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1811:6: ( ruleNativeFieldOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1812:1: ruleNativeFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldOptionAccess().getNativeFieldOptionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleNativeFieldOption_in_rule__FieldOption__Alternatives3882);
                    ruleNativeFieldOption();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldOptionAccess().getNativeFieldOptionParserRuleCall_2()); 
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1822:1: rule__EnumElement__Alternatives : ( ( ruleEnumField ) | ( ruleCustomOption ) );
    public final void rule__EnumElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1826:1: ( ( ruleEnumField ) | ( ruleCustomOption ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==17) ) {
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1827:1: ( ruleEnumField )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1827:1: ( ruleEnumField )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1828:1: ruleEnumField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumElementAccess().getEnumFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEnumField_in_rule__EnumElement__Alternatives3914);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1833:6: ( ruleCustomOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1833:6: ( ruleCustomOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1834:1: ruleCustomOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumElementAccess().getCustomOptionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCustomOption_in_rule__EnumElement__Alternatives3931);
                    ruleCustomOption();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnumElementAccess().getCustomOptionParserRuleCall_1()); 
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1844:1: rule__ServiceElement__Alternatives : ( ( ( ruleRpc ) ) | ( ruleOption ) );
    public final void rule__ServiceElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1848:1: ( ( ( ruleRpc ) ) | ( ruleOption ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            else if ( (LA14_0==17) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1849:1: ( ( ruleRpc ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1849:1: ( ( ruleRpc ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1850:1: ( ruleRpc )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getServiceElementAccess().getRpcParserRuleCall_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1851:1: ( ruleRpc )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1851:3: ruleRpc
                    {
                    pushFollow(FOLLOW_ruleRpc_in_rule__ServiceElement__Alternatives3964);
                    ruleRpc();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getServiceElementAccess().getRpcParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1855:6: ( ruleOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1855:6: ( ruleOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1856:1: ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getServiceElementAccess().getOptionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleOption_in_rule__ServiceElement__Alternatives3982);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1866:1: rule__Var_full__Alternatives : ( ( ruleFULL_ID ) | ( ruleVar ) );
    public final void rule__Var_full__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1870:1: ( ( ruleFULL_ID ) | ( ruleVar ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EOF||LA15_1==RULE_ID||(LA15_1>=13 && LA15_1<=48)||(LA15_1>=51 && LA15_1<=52)||LA15_1==54||LA15_1==61) ) {
                    alt15=2;
                }
                else if ( (LA15_1==62) ) {
                    alt15=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA15_0>=13 && LA15_0<=48)) ) {
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1871:1: ( ruleFULL_ID )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1871:1: ( ruleFULL_ID )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1872:1: ruleFULL_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_fullAccess().getFULL_IDParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleFULL_ID_in_rule__Var_full__Alternatives4014);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1877:6: ( ruleVar )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1877:6: ( ruleVar )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1878:1: ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_fullAccess().getVarParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVar_in_rule__Var_full__Alternatives4031);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1888:1: rule__Var__Alternatives : ( ( RULE_ID ) | ( ruleVarReserved ) );
    public final void rule__Var__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1892:1: ( ( RULE_ID ) | ( ruleVarReserved ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=13 && LA16_0<=48)) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1893:1: ( RULE_ID )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1893:1: ( RULE_ID )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1894:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Var__Alternatives4063); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1899:6: ( ruleVarReserved )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1899:6: ( ruleVarReserved )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1900:1: ruleVarReserved
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarAccess().getVarReservedParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVarReserved_in_rule__Var__Alternatives4080);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1910:1: rule__VarReserved__Alternatives : ( ( 'to' ) | ( 'package' ) | ( 'syntax' ) | ( 'import' ) | ( 'option' ) | ( 'message' ) | ( 'service' ) | ( 'enum' ) | ( 'required' ) | ( 'optional' ) | ( 'repeated' ) | ( 'extensions' ) | ( 'extend' ) | ( 'group' ) | ( 'rpc' ) | ( 'returns' ) | ( 'int32' ) | ( 'int64' ) | ( 'uint32' ) | ( 'uint64' ) | ( 'sint32' ) | ( 'sint64' ) | ( 'fixed32' ) | ( 'fixed64' ) | ( 'sfixed32' ) | ( 'sfixed64' ) | ( 'float' ) | ( 'double' ) | ( 'bool' ) | ( 'string' ) | ( 'bytes' ) | ( 'default' ) | ( 'max' ) | ( 'void' ) | ( 'weak' ) | ( 'packed' ) );
    public final void rule__VarReserved__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1914:1: ( ( 'to' ) | ( 'package' ) | ( 'syntax' ) | ( 'import' ) | ( 'option' ) | ( 'message' ) | ( 'service' ) | ( 'enum' ) | ( 'required' ) | ( 'optional' ) | ( 'repeated' ) | ( 'extensions' ) | ( 'extend' ) | ( 'group' ) | ( 'rpc' ) | ( 'returns' ) | ( 'int32' ) | ( 'int64' ) | ( 'uint32' ) | ( 'uint64' ) | ( 'sint32' ) | ( 'sint64' ) | ( 'fixed32' ) | ( 'fixed64' ) | ( 'sfixed32' ) | ( 'sfixed64' ) | ( 'float' ) | ( 'double' ) | ( 'bool' ) | ( 'string' ) | ( 'bytes' ) | ( 'default' ) | ( 'max' ) | ( 'void' ) | ( 'weak' ) | ( 'packed' ) )
            int alt17=36;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt17=1;
                }
                break;
            case 14:
                {
                alt17=2;
                }
                break;
            case 15:
                {
                alt17=3;
                }
                break;
            case 16:
                {
                alt17=4;
                }
                break;
            case 17:
                {
                alt17=5;
                }
                break;
            case 18:
                {
                alt17=6;
                }
                break;
            case 19:
                {
                alt17=7;
                }
                break;
            case 20:
                {
                alt17=8;
                }
                break;
            case 21:
                {
                alt17=9;
                }
                break;
            case 22:
                {
                alt17=10;
                }
                break;
            case 23:
                {
                alt17=11;
                }
                break;
            case 24:
                {
                alt17=12;
                }
                break;
            case 25:
                {
                alt17=13;
                }
                break;
            case 26:
                {
                alt17=14;
                }
                break;
            case 27:
                {
                alt17=15;
                }
                break;
            case 28:
                {
                alt17=16;
                }
                break;
            case 29:
                {
                alt17=17;
                }
                break;
            case 30:
                {
                alt17=18;
                }
                break;
            case 31:
                {
                alt17=19;
                }
                break;
            case 32:
                {
                alt17=20;
                }
                break;
            case 33:
                {
                alt17=21;
                }
                break;
            case 34:
                {
                alt17=22;
                }
                break;
            case 35:
                {
                alt17=23;
                }
                break;
            case 36:
                {
                alt17=24;
                }
                break;
            case 37:
                {
                alt17=25;
                }
                break;
            case 38:
                {
                alt17=26;
                }
                break;
            case 39:
                {
                alt17=27;
                }
                break;
            case 40:
                {
                alt17=28;
                }
                break;
            case 41:
                {
                alt17=29;
                }
                break;
            case 42:
                {
                alt17=30;
                }
                break;
            case 43:
                {
                alt17=31;
                }
                break;
            case 44:
                {
                alt17=32;
                }
                break;
            case 45:
                {
                alt17=33;
                }
                break;
            case 46:
                {
                alt17=34;
                }
                break;
            case 47:
                {
                alt17=35;
                }
                break;
            case 48:
                {
                alt17=36;
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1915:1: ( 'to' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1915:1: ( 'to' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1916:1: 'to'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getToKeyword_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__VarReserved__Alternatives4113); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getToKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1923:6: ( 'package' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1923:6: ( 'package' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1924:1: 'package'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getPackageKeyword_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__VarReserved__Alternatives4133); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getPackageKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1931:6: ( 'syntax' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1931:6: ( 'syntax' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1932:1: 'syntax'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSyntaxKeyword_2()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__VarReserved__Alternatives4153); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSyntaxKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1939:6: ( 'import' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1939:6: ( 'import' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1940:1: 'import'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getImportKeyword_3()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__VarReserved__Alternatives4173); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getImportKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1947:6: ( 'option' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1947:6: ( 'option' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1948:1: 'option'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getOptionKeyword_4()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__VarReserved__Alternatives4193); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getOptionKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1955:6: ( 'message' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1955:6: ( 'message' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1956:1: 'message'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getMessageKeyword_5()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__VarReserved__Alternatives4213); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getMessageKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1963:6: ( 'service' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1963:6: ( 'service' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1964:1: 'service'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getServiceKeyword_6()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__VarReserved__Alternatives4233); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getServiceKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1971:6: ( 'enum' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1971:6: ( 'enum' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1972:1: 'enum'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getEnumKeyword_7()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__VarReserved__Alternatives4253); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getEnumKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1979:6: ( 'required' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1979:6: ( 'required' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1980:1: 'required'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getRequiredKeyword_8()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__VarReserved__Alternatives4273); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getRequiredKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1987:6: ( 'optional' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1987:6: ( 'optional' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1988:1: 'optional'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getOptionalKeyword_9()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__VarReserved__Alternatives4293); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getOptionalKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1995:6: ( 'repeated' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1995:6: ( 'repeated' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1996:1: 'repeated'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getRepeatedKeyword_10()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__VarReserved__Alternatives4313); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getRepeatedKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2003:6: ( 'extensions' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2003:6: ( 'extensions' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2004:1: 'extensions'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getExtensionsKeyword_11()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__VarReserved__Alternatives4333); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getExtensionsKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2011:6: ( 'extend' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2011:6: ( 'extend' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2012:1: 'extend'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getExtendKeyword_12()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__VarReserved__Alternatives4353); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getExtendKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2019:6: ( 'group' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2019:6: ( 'group' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2020:1: 'group'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getGroupKeyword_13()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__VarReserved__Alternatives4373); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getGroupKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2027:6: ( 'rpc' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2027:6: ( 'rpc' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2028:1: 'rpc'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getRpcKeyword_14()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__VarReserved__Alternatives4393); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getRpcKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2035:6: ( 'returns' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2035:6: ( 'returns' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2036:1: 'returns'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getReturnsKeyword_15()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__VarReserved__Alternatives4413); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getReturnsKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2043:6: ( 'int32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2043:6: ( 'int32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2044:1: 'int32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getInt32Keyword_16()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__VarReserved__Alternatives4433); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getInt32Keyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2051:6: ( 'int64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2051:6: ( 'int64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2052:1: 'int64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getInt64Keyword_17()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__VarReserved__Alternatives4453); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getInt64Keyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2059:6: ( 'uint32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2059:6: ( 'uint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2060:1: 'uint32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getUint32Keyword_18()); 
                    }
                    match(input,31,FOLLOW_31_in_rule__VarReserved__Alternatives4473); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getUint32Keyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2067:6: ( 'uint64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2067:6: ( 'uint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2068:1: 'uint64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getUint64Keyword_19()); 
                    }
                    match(input,32,FOLLOW_32_in_rule__VarReserved__Alternatives4493); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getUint64Keyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2075:6: ( 'sint32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2075:6: ( 'sint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2076:1: 'sint32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSint32Keyword_20()); 
                    }
                    match(input,33,FOLLOW_33_in_rule__VarReserved__Alternatives4513); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSint32Keyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2083:6: ( 'sint64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2083:6: ( 'sint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2084:1: 'sint64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSint64Keyword_21()); 
                    }
                    match(input,34,FOLLOW_34_in_rule__VarReserved__Alternatives4533); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSint64Keyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2091:6: ( 'fixed32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2091:6: ( 'fixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2092:1: 'fixed32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getFixed32Keyword_22()); 
                    }
                    match(input,35,FOLLOW_35_in_rule__VarReserved__Alternatives4553); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getFixed32Keyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2099:6: ( 'fixed64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2099:6: ( 'fixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2100:1: 'fixed64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getFixed64Keyword_23()); 
                    }
                    match(input,36,FOLLOW_36_in_rule__VarReserved__Alternatives4573); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getFixed64Keyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2107:6: ( 'sfixed32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2107:6: ( 'sfixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2108:1: 'sfixed32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSfixed32Keyword_24()); 
                    }
                    match(input,37,FOLLOW_37_in_rule__VarReserved__Alternatives4593); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSfixed32Keyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2115:6: ( 'sfixed64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2115:6: ( 'sfixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2116:1: 'sfixed64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSfixed64Keyword_25()); 
                    }
                    match(input,38,FOLLOW_38_in_rule__VarReserved__Alternatives4613); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSfixed64Keyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2123:6: ( 'float' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2123:6: ( 'float' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2124:1: 'float'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getFloatKeyword_26()); 
                    }
                    match(input,39,FOLLOW_39_in_rule__VarReserved__Alternatives4633); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getFloatKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2131:6: ( 'double' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2131:6: ( 'double' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2132:1: 'double'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getDoubleKeyword_27()); 
                    }
                    match(input,40,FOLLOW_40_in_rule__VarReserved__Alternatives4653); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getDoubleKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2139:6: ( 'bool' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2139:6: ( 'bool' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2140:1: 'bool'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getBoolKeyword_28()); 
                    }
                    match(input,41,FOLLOW_41_in_rule__VarReserved__Alternatives4673); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getBoolKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2147:6: ( 'string' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2147:6: ( 'string' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2148:1: 'string'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getStringKeyword_29()); 
                    }
                    match(input,42,FOLLOW_42_in_rule__VarReserved__Alternatives4693); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getStringKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2155:6: ( 'bytes' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2155:6: ( 'bytes' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2156:1: 'bytes'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getBytesKeyword_30()); 
                    }
                    match(input,43,FOLLOW_43_in_rule__VarReserved__Alternatives4713); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getBytesKeyword_30()); 
                    }

                    }


                    }
                    break;
                case 32 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2163:6: ( 'default' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2163:6: ( 'default' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2164:1: 'default'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getDefaultKeyword_31()); 
                    }
                    match(input,44,FOLLOW_44_in_rule__VarReserved__Alternatives4733); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getDefaultKeyword_31()); 
                    }

                    }


                    }
                    break;
                case 33 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2171:6: ( 'max' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2171:6: ( 'max' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2172:1: 'max'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getMaxKeyword_32()); 
                    }
                    match(input,45,FOLLOW_45_in_rule__VarReserved__Alternatives4753); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getMaxKeyword_32()); 
                    }

                    }


                    }
                    break;
                case 34 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2179:6: ( 'void' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2179:6: ( 'void' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2180:1: 'void'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getVoidKeyword_33()); 
                    }
                    match(input,46,FOLLOW_46_in_rule__VarReserved__Alternatives4773); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getVoidKeyword_33()); 
                    }

                    }


                    }
                    break;
                case 35 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2187:6: ( 'weak' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2187:6: ( 'weak' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2188:1: 'weak'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getWeakKeyword_34()); 
                    }
                    match(input,47,FOLLOW_47_in_rule__VarReserved__Alternatives4793); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getWeakKeyword_34()); 
                    }

                    }


                    }
                    break;
                case 36 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2195:6: ( 'packed' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2195:6: ( 'packed' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2196:1: 'packed'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getPackedKeyword_35()); 
                    }
                    match(input,48,FOLLOW_48_in_rule__VarReserved__Alternatives4813); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getPackedKeyword_35()); 
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2209:1: rule__BOOL__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BOOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2213:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==49) ) {
                alt18=1;
            }
            else if ( (LA18_0==50) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2214:1: ( ( 'true' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2214:1: ( ( 'true' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2215:1: ( 'true' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2216:1: ( 'true' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2216:3: 'true'
                    {
                    match(input,49,FOLLOW_49_in_rule__BOOL__Alternatives4849); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2221:6: ( ( 'false' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2221:6: ( ( 'false' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2222:1: ( 'false' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLAccess().getFalseEnumLiteralDeclaration_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2223:1: ( 'false' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2223:3: 'false'
                    {
                    match(input,50,FOLLOW_50_in_rule__BOOL__Alternatives4870); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2233:1: rule__Modifier__Alternatives : ( ( ( 'optional' ) ) | ( ( 'required' ) ) | ( ( 'repeated' ) ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2237:1: ( ( ( 'optional' ) ) | ( ( 'required' ) ) | ( ( 'repeated' ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt19=1;
                }
                break;
            case 21:
                {
                alt19=2;
                }
                break;
            case 23:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2238:1: ( ( 'optional' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2238:1: ( ( 'optional' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2239:1: ( 'optional' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2240:1: ( 'optional' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2240:3: 'optional'
                    {
                    match(input,22,FOLLOW_22_in_rule__Modifier__Alternatives4906); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2245:6: ( ( 'required' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2245:6: ( ( 'required' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2246:1: ( 'required' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2247:1: ( 'required' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2247:3: 'required'
                    {
                    match(input,21,FOLLOW_21_in_rule__Modifier__Alternatives4927); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2252:6: ( ( 'repeated' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2252:6: ( ( 'repeated' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2253:1: ( 'repeated' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getRepeatedEnumLiteralDeclaration_2()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2254:1: ( 'repeated' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2254:3: 'repeated'
                    {
                    match(input,23,FOLLOW_23_in_rule__Modifier__Alternatives4948); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2264:1: rule__ScalarType__Alternatives : ( ( ( 'int32' ) ) | ( ( 'int64' ) ) | ( ( 'uint32' ) ) | ( ( 'uint64' ) ) | ( ( 'sint32' ) ) | ( ( 'sint64' ) ) | ( ( 'fixed32' ) ) | ( ( 'fixed64' ) ) | ( ( 'sfixed32' ) ) | ( ( 'sfixed64' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'bool' ) ) | ( ( 'string' ) ) | ( ( 'bytes' ) ) );
    public final void rule__ScalarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2268:1: ( ( ( 'int32' ) ) | ( ( 'int64' ) ) | ( ( 'uint32' ) ) | ( ( 'uint64' ) ) | ( ( 'sint32' ) ) | ( ( 'sint64' ) ) | ( ( 'fixed32' ) ) | ( ( 'fixed64' ) ) | ( ( 'sfixed32' ) ) | ( ( 'sfixed64' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'bool' ) ) | ( ( 'string' ) ) | ( ( 'bytes' ) ) )
            int alt20=15;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt20=1;
                }
                break;
            case 30:
                {
                alt20=2;
                }
                break;
            case 31:
                {
                alt20=3;
                }
                break;
            case 32:
                {
                alt20=4;
                }
                break;
            case 33:
                {
                alt20=5;
                }
                break;
            case 34:
                {
                alt20=6;
                }
                break;
            case 35:
                {
                alt20=7;
                }
                break;
            case 36:
                {
                alt20=8;
                }
                break;
            case 37:
                {
                alt20=9;
                }
                break;
            case 38:
                {
                alt20=10;
                }
                break;
            case 39:
                {
                alt20=11;
                }
                break;
            case 40:
                {
                alt20=12;
                }
                break;
            case 41:
                {
                alt20=13;
                }
                break;
            case 42:
                {
                alt20=14;
                }
                break;
            case 43:
                {
                alt20=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2269:1: ( ( 'int32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2269:1: ( ( 'int32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2270:1: ( 'int32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2271:1: ( 'int32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2271:3: 'int32'
                    {
                    match(input,29,FOLLOW_29_in_rule__ScalarType__Alternatives4984); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2276:6: ( ( 'int64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2276:6: ( ( 'int64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2277:1: ( 'int64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2278:1: ( 'int64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2278:3: 'int64'
                    {
                    match(input,30,FOLLOW_30_in_rule__ScalarType__Alternatives5005); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2283:6: ( ( 'uint32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2283:6: ( ( 'uint32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2284:1: ( 'uint32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2285:1: ( 'uint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2285:3: 'uint32'
                    {
                    match(input,31,FOLLOW_31_in_rule__ScalarType__Alternatives5026); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2290:6: ( ( 'uint64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2290:6: ( ( 'uint64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2291:1: ( 'uint64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2292:1: ( 'uint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2292:3: 'uint64'
                    {
                    match(input,32,FOLLOW_32_in_rule__ScalarType__Alternatives5047); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2297:6: ( ( 'sint32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2297:6: ( ( 'sint32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2298:1: ( 'sint32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2299:1: ( 'sint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2299:3: 'sint32'
                    {
                    match(input,33,FOLLOW_33_in_rule__ScalarType__Alternatives5068); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2304:6: ( ( 'sint64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2304:6: ( ( 'sint64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2305:1: ( 'sint64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2306:1: ( 'sint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2306:3: 'sint64'
                    {
                    match(input,34,FOLLOW_34_in_rule__ScalarType__Alternatives5089); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2311:6: ( ( 'fixed32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2311:6: ( ( 'fixed32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2312:1: ( 'fixed32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2313:1: ( 'fixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2313:3: 'fixed32'
                    {
                    match(input,35,FOLLOW_35_in_rule__ScalarType__Alternatives5110); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2318:6: ( ( 'fixed64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2318:6: ( ( 'fixed64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2319:1: ( 'fixed64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2320:1: ( 'fixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2320:3: 'fixed64'
                    {
                    match(input,36,FOLLOW_36_in_rule__ScalarType__Alternatives5131); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2325:6: ( ( 'sfixed32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2325:6: ( ( 'sfixed32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2326:1: ( 'sfixed32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2327:1: ( 'sfixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2327:3: 'sfixed32'
                    {
                    match(input,37,FOLLOW_37_in_rule__ScalarType__Alternatives5152); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2332:6: ( ( 'sfixed64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2332:6: ( ( 'sfixed64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2333:1: ( 'sfixed64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2334:1: ( 'sfixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2334:3: 'sfixed64'
                    {
                    match(input,38,FOLLOW_38_in_rule__ScalarType__Alternatives5173); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2339:6: ( ( 'float' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2339:6: ( ( 'float' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2340:1: ( 'float' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2341:1: ( 'float' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2341:3: 'float'
                    {
                    match(input,39,FOLLOW_39_in_rule__ScalarType__Alternatives5194); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2346:6: ( ( 'double' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2346:6: ( ( 'double' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2347:1: ( 'double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2348:1: ( 'double' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2348:3: 'double'
                    {
                    match(input,40,FOLLOW_40_in_rule__ScalarType__Alternatives5215); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2353:6: ( ( 'bool' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2353:6: ( ( 'bool' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2354:1: ( 'bool' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2355:1: ( 'bool' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2355:3: 'bool'
                    {
                    match(input,41,FOLLOW_41_in_rule__ScalarType__Alternatives5236); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2360:6: ( ( 'string' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2360:6: ( ( 'string' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2361:1: ( 'string' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2362:1: ( 'string' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2362:3: 'string'
                    {
                    match(input,42,FOLLOW_42_in_rule__ScalarType__Alternatives5257); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2367:6: ( ( 'bytes' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2367:6: ( ( 'bytes' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2368:1: ( 'bytes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getBytesEnumLiteralDeclaration_14()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2369:1: ( 'bytes' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2369:3: 'bytes'
                    {
                    match(input,43,FOLLOW_43_in_rule__ScalarType__Alternatives5278); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2381:1: rule__Proto__Group__0 : rule__Proto__Group__0__Impl rule__Proto__Group__1 ;
    public final void rule__Proto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2385:1: ( rule__Proto__Group__0__Impl rule__Proto__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2386:2: rule__Proto__Group__0__Impl rule__Proto__Group__1
            {
            pushFollow(FOLLOW_rule__Proto__Group__0__Impl_in_rule__Proto__Group__05311);
            rule__Proto__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Proto__Group__1_in_rule__Proto__Group__05314);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2393:1: rule__Proto__Group__0__Impl : ( ( rule__Proto__SyntaxAssignment_0 )? ) ;
    public final void rule__Proto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2397:1: ( ( ( rule__Proto__SyntaxAssignment_0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2398:1: ( ( rule__Proto__SyntaxAssignment_0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2398:1: ( ( rule__Proto__SyntaxAssignment_0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2399:1: ( rule__Proto__SyntaxAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getSyntaxAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2400:1: ( rule__Proto__SyntaxAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2400:2: rule__Proto__SyntaxAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Proto__SyntaxAssignment_0_in_rule__Proto__Group__0__Impl5341);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2410:1: rule__Proto__Group__1 : rule__Proto__Group__1__Impl rule__Proto__Group__2 ;
    public final void rule__Proto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2414:1: ( rule__Proto__Group__1__Impl rule__Proto__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2415:2: rule__Proto__Group__1__Impl rule__Proto__Group__2
            {
            pushFollow(FOLLOW_rule__Proto__Group__1__Impl_in_rule__Proto__Group__15372);
            rule__Proto__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Proto__Group__2_in_rule__Proto__Group__15375);
            rule__Proto__Group__2();

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2422:1: rule__Proto__Group__1__Impl : ( ( rule__Proto__ImportsAssignment_1 )* ) ;
    public final void rule__Proto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2426:1: ( ( ( rule__Proto__ImportsAssignment_1 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2427:1: ( ( rule__Proto__ImportsAssignment_1 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2427:1: ( ( rule__Proto__ImportsAssignment_1 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2428:1: ( rule__Proto__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getImportsAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2429:1: ( rule__Proto__ImportsAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2429:2: rule__Proto__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Proto__ImportsAssignment_1_in_rule__Proto__Group__1__Impl5402);
            	    rule__Proto__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getImportsAssignment_1()); 
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


    // $ANTLR start "rule__Proto__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2439:1: rule__Proto__Group__2 : rule__Proto__Group__2__Impl rule__Proto__Group__3 ;
    public final void rule__Proto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2443:1: ( rule__Proto__Group__2__Impl rule__Proto__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2444:2: rule__Proto__Group__2__Impl rule__Proto__Group__3
            {
            pushFollow(FOLLOW_rule__Proto__Group__2__Impl_in_rule__Proto__Group__25433);
            rule__Proto__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Proto__Group__3_in_rule__Proto__Group__25436);
            rule__Proto__Group__3();

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
    // $ANTLR end "rule__Proto__Group__2"


    // $ANTLR start "rule__Proto__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2451:1: rule__Proto__Group__2__Impl : ( ( rule__Proto__Group_2__0 )? ) ;
    public final void rule__Proto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2455:1: ( ( ( rule__Proto__Group_2__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2456:1: ( ( rule__Proto__Group_2__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2456:1: ( ( rule__Proto__Group_2__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2457:1: ( rule__Proto__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getGroup_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2458:1: ( rule__Proto__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==14) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2458:2: rule__Proto__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Proto__Group_2__0_in_rule__Proto__Group__2__Impl5463);
                    rule__Proto__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Proto__Group__2__Impl"


    // $ANTLR start "rule__Proto__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2468:1: rule__Proto__Group__3 : rule__Proto__Group__3__Impl ;
    public final void rule__Proto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2472:1: ( rule__Proto__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2473:2: rule__Proto__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Proto__Group__3__Impl_in_rule__Proto__Group__35494);
            rule__Proto__Group__3__Impl();

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
    // $ANTLR end "rule__Proto__Group__3"


    // $ANTLR start "rule__Proto__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2479:1: rule__Proto__Group__3__Impl : ( ( rule__Proto__StatementsAssignment_3 )* ) ;
    public final void rule__Proto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2483:1: ( ( ( rule__Proto__StatementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2484:1: ( ( rule__Proto__StatementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2484:1: ( ( rule__Proto__StatementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2485:1: ( rule__Proto__StatementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getStatementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2486:1: ( rule__Proto__StatementsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=17 && LA24_0<=23)||LA24_0==25) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2486:2: rule__Proto__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Proto__StatementsAssignment_3_in_rule__Proto__Group__3__Impl5521);
            	    rule__Proto__StatementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getStatementsAssignment_3()); 
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
    // $ANTLR end "rule__Proto__Group__3__Impl"


    // $ANTLR start "rule__Proto__Group_2__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2504:1: rule__Proto__Group_2__0 : rule__Proto__Group_2__0__Impl rule__Proto__Group_2__1 ;
    public final void rule__Proto__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2508:1: ( rule__Proto__Group_2__0__Impl rule__Proto__Group_2__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2509:2: rule__Proto__Group_2__0__Impl rule__Proto__Group_2__1
            {
            pushFollow(FOLLOW_rule__Proto__Group_2__0__Impl_in_rule__Proto__Group_2__05560);
            rule__Proto__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Proto__Group_2__1_in_rule__Proto__Group_2__05563);
            rule__Proto__Group_2__1();

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
    // $ANTLR end "rule__Proto__Group_2__0"


    // $ANTLR start "rule__Proto__Group_2__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2516:1: rule__Proto__Group_2__0__Impl : ( 'package' ) ;
    public final void rule__Proto__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2520:1: ( ( 'package' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2521:1: ( 'package' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2521:1: ( 'package' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2522:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getPackageKeyword_2_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Proto__Group_2__0__Impl5591); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getPackageKeyword_2_0()); 
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
    // $ANTLR end "rule__Proto__Group_2__0__Impl"


    // $ANTLR start "rule__Proto__Group_2__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2535:1: rule__Proto__Group_2__1 : rule__Proto__Group_2__1__Impl rule__Proto__Group_2__2 ;
    public final void rule__Proto__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2539:1: ( rule__Proto__Group_2__1__Impl rule__Proto__Group_2__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2540:2: rule__Proto__Group_2__1__Impl rule__Proto__Group_2__2
            {
            pushFollow(FOLLOW_rule__Proto__Group_2__1__Impl_in_rule__Proto__Group_2__15622);
            rule__Proto__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Proto__Group_2__2_in_rule__Proto__Group_2__15625);
            rule__Proto__Group_2__2();

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
    // $ANTLR end "rule__Proto__Group_2__1"


    // $ANTLR start "rule__Proto__Group_2__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2547:1: rule__Proto__Group_2__1__Impl : ( ( rule__Proto__NameAssignment_2_1 ) ) ;
    public final void rule__Proto__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2551:1: ( ( ( rule__Proto__NameAssignment_2_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2552:1: ( ( rule__Proto__NameAssignment_2_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2552:1: ( ( rule__Proto__NameAssignment_2_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2553:1: ( rule__Proto__NameAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getNameAssignment_2_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2554:1: ( rule__Proto__NameAssignment_2_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2554:2: rule__Proto__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Proto__NameAssignment_2_1_in_rule__Proto__Group_2__1__Impl5652);
            rule__Proto__NameAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getNameAssignment_2_1()); 
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
    // $ANTLR end "rule__Proto__Group_2__1__Impl"


    // $ANTLR start "rule__Proto__Group_2__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2564:1: rule__Proto__Group_2__2 : rule__Proto__Group_2__2__Impl ;
    public final void rule__Proto__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2568:1: ( rule__Proto__Group_2__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2569:2: rule__Proto__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Proto__Group_2__2__Impl_in_rule__Proto__Group_2__25682);
            rule__Proto__Group_2__2__Impl();

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
    // $ANTLR end "rule__Proto__Group_2__2"


    // $ANTLR start "rule__Proto__Group_2__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2575:1: rule__Proto__Group_2__2__Impl : ( ';' ) ;
    public final void rule__Proto__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2579:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2580:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2580:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2581:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getSemicolonKeyword_2_2()); 
            }
            match(input,51,FOLLOW_51_in_rule__Proto__Group_2__2__Impl5710); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getSemicolonKeyword_2_2()); 
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
    // $ANTLR end "rule__Proto__Group_2__2__Impl"


    // $ANTLR start "rule__Syntax__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2600:1: rule__Syntax__Group__0 : rule__Syntax__Group__0__Impl rule__Syntax__Group__1 ;
    public final void rule__Syntax__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2604:1: ( rule__Syntax__Group__0__Impl rule__Syntax__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2605:2: rule__Syntax__Group__0__Impl rule__Syntax__Group__1
            {
            pushFollow(FOLLOW_rule__Syntax__Group__0__Impl_in_rule__Syntax__Group__05747);
            rule__Syntax__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Syntax__Group__1_in_rule__Syntax__Group__05750);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2612:1: rule__Syntax__Group__0__Impl : ( 'syntax' ) ;
    public final void rule__Syntax__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2616:1: ( ( 'syntax' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2617:1: ( 'syntax' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2617:1: ( 'syntax' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2618:1: 'syntax'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getSyntaxKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Syntax__Group__0__Impl5778); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2631:1: rule__Syntax__Group__1 : rule__Syntax__Group__1__Impl rule__Syntax__Group__2 ;
    public final void rule__Syntax__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2635:1: ( rule__Syntax__Group__1__Impl rule__Syntax__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2636:2: rule__Syntax__Group__1__Impl rule__Syntax__Group__2
            {
            pushFollow(FOLLOW_rule__Syntax__Group__1__Impl_in_rule__Syntax__Group__15809);
            rule__Syntax__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Syntax__Group__2_in_rule__Syntax__Group__15812);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2643:1: rule__Syntax__Group__1__Impl : ( '=' ) ;
    public final void rule__Syntax__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2647:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2648:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2648:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2649:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getEqualsSignKeyword_1()); 
            }
            match(input,52,FOLLOW_52_in_rule__Syntax__Group__1__Impl5840); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2662:1: rule__Syntax__Group__2 : rule__Syntax__Group__2__Impl rule__Syntax__Group__3 ;
    public final void rule__Syntax__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2666:1: ( rule__Syntax__Group__2__Impl rule__Syntax__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2667:2: rule__Syntax__Group__2__Impl rule__Syntax__Group__3
            {
            pushFollow(FOLLOW_rule__Syntax__Group__2__Impl_in_rule__Syntax__Group__25871);
            rule__Syntax__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Syntax__Group__3_in_rule__Syntax__Group__25874);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2674:1: rule__Syntax__Group__2__Impl : ( ( rule__Syntax__NameAssignment_2 ) ) ;
    public final void rule__Syntax__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2678:1: ( ( ( rule__Syntax__NameAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2679:1: ( ( rule__Syntax__NameAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2679:1: ( ( rule__Syntax__NameAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2680:1: ( rule__Syntax__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getNameAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2681:1: ( rule__Syntax__NameAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2681:2: rule__Syntax__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Syntax__NameAssignment_2_in_rule__Syntax__Group__2__Impl5901);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2691:1: rule__Syntax__Group__3 : rule__Syntax__Group__3__Impl ;
    public final void rule__Syntax__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2695:1: ( rule__Syntax__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2696:2: rule__Syntax__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Syntax__Group__3__Impl_in_rule__Syntax__Group__35931);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2702:1: rule__Syntax__Group__3__Impl : ( ';' ) ;
    public final void rule__Syntax__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2706:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2707:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2707:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2708:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getSemicolonKeyword_3()); 
            }
            match(input,51,FOLLOW_51_in_rule__Syntax__Group__3__Impl5959); if (state.failed) return ;
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


    // $ANTLR start "rule__PublicImport__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2729:1: rule__PublicImport__Group__0 : rule__PublicImport__Group__0__Impl rule__PublicImport__Group__1 ;
    public final void rule__PublicImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2733:1: ( rule__PublicImport__Group__0__Impl rule__PublicImport__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2734:2: rule__PublicImport__Group__0__Impl rule__PublicImport__Group__1
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__0__Impl_in_rule__PublicImport__Group__05998);
            rule__PublicImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PublicImport__Group__1_in_rule__PublicImport__Group__06001);
            rule__PublicImport__Group__1();

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
    // $ANTLR end "rule__PublicImport__Group__0"


    // $ANTLR start "rule__PublicImport__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2741:1: rule__PublicImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__PublicImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2745:1: ( ( 'import' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2746:1: ( 'import' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2746:1: ( 'import' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2747:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getImportKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__PublicImport__Group__0__Impl6029); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPublicImportAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__PublicImport__Group__0__Impl"


    // $ANTLR start "rule__PublicImport__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2760:1: rule__PublicImport__Group__1 : rule__PublicImport__Group__1__Impl rule__PublicImport__Group__2 ;
    public final void rule__PublicImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2764:1: ( rule__PublicImport__Group__1__Impl rule__PublicImport__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2765:2: rule__PublicImport__Group__1__Impl rule__PublicImport__Group__2
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__1__Impl_in_rule__PublicImport__Group__16060);
            rule__PublicImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PublicImport__Group__2_in_rule__PublicImport__Group__16063);
            rule__PublicImport__Group__2();

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
    // $ANTLR end "rule__PublicImport__Group__1"


    // $ANTLR start "rule__PublicImport__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2772:1: rule__PublicImport__Group__1__Impl : ( 'public' ) ;
    public final void rule__PublicImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2776:1: ( ( 'public' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2777:1: ( 'public' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2777:1: ( 'public' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2778:1: 'public'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getPublicKeyword_1()); 
            }
            match(input,53,FOLLOW_53_in_rule__PublicImport__Group__1__Impl6091); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPublicImportAccess().getPublicKeyword_1()); 
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
    // $ANTLR end "rule__PublicImport__Group__1__Impl"


    // $ANTLR start "rule__PublicImport__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2791:1: rule__PublicImport__Group__2 : rule__PublicImport__Group__2__Impl rule__PublicImport__Group__3 ;
    public final void rule__PublicImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2795:1: ( rule__PublicImport__Group__2__Impl rule__PublicImport__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2796:2: rule__PublicImport__Group__2__Impl rule__PublicImport__Group__3
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__2__Impl_in_rule__PublicImport__Group__26122);
            rule__PublicImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PublicImport__Group__3_in_rule__PublicImport__Group__26125);
            rule__PublicImport__Group__3();

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
    // $ANTLR end "rule__PublicImport__Group__2"


    // $ANTLR start "rule__PublicImport__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2803:1: rule__PublicImport__Group__2__Impl : ( ( rule__PublicImport__ImportURIAssignment_2 ) ) ;
    public final void rule__PublicImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2807:1: ( ( ( rule__PublicImport__ImportURIAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2808:1: ( ( rule__PublicImport__ImportURIAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2808:1: ( ( rule__PublicImport__ImportURIAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2809:1: ( rule__PublicImport__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getImportURIAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2810:1: ( rule__PublicImport__ImportURIAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2810:2: rule__PublicImport__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__PublicImport__ImportURIAssignment_2_in_rule__PublicImport__Group__2__Impl6152);
            rule__PublicImport__ImportURIAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPublicImportAccess().getImportURIAssignment_2()); 
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
    // $ANTLR end "rule__PublicImport__Group__2__Impl"


    // $ANTLR start "rule__PublicImport__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2820:1: rule__PublicImport__Group__3 : rule__PublicImport__Group__3__Impl ;
    public final void rule__PublicImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2824:1: ( rule__PublicImport__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2825:2: rule__PublicImport__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__3__Impl_in_rule__PublicImport__Group__36182);
            rule__PublicImport__Group__3__Impl();

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
    // $ANTLR end "rule__PublicImport__Group__3"


    // $ANTLR start "rule__PublicImport__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2831:1: rule__PublicImport__Group__3__Impl : ( ';' ) ;
    public final void rule__PublicImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2835:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2836:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2836:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2837:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getSemicolonKeyword_3()); 
            }
            match(input,51,FOLLOW_51_in_rule__PublicImport__Group__3__Impl6210); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPublicImportAccess().getSemicolonKeyword_3()); 
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
    // $ANTLR end "rule__PublicImport__Group__3__Impl"


    // $ANTLR start "rule__WeakImport__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2858:1: rule__WeakImport__Group__0 : rule__WeakImport__Group__0__Impl rule__WeakImport__Group__1 ;
    public final void rule__WeakImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2862:1: ( rule__WeakImport__Group__0__Impl rule__WeakImport__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2863:2: rule__WeakImport__Group__0__Impl rule__WeakImport__Group__1
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__0__Impl_in_rule__WeakImport__Group__06249);
            rule__WeakImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WeakImport__Group__1_in_rule__WeakImport__Group__06252);
            rule__WeakImport__Group__1();

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
    // $ANTLR end "rule__WeakImport__Group__0"


    // $ANTLR start "rule__WeakImport__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2870:1: rule__WeakImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__WeakImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2874:1: ( ( 'import' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2875:1: ( 'import' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2875:1: ( 'import' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2876:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getImportKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__WeakImport__Group__0__Impl6280); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeakImportAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__WeakImport__Group__0__Impl"


    // $ANTLR start "rule__WeakImport__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2889:1: rule__WeakImport__Group__1 : rule__WeakImport__Group__1__Impl rule__WeakImport__Group__2 ;
    public final void rule__WeakImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2893:1: ( rule__WeakImport__Group__1__Impl rule__WeakImport__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2894:2: rule__WeakImport__Group__1__Impl rule__WeakImport__Group__2
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__1__Impl_in_rule__WeakImport__Group__16311);
            rule__WeakImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WeakImport__Group__2_in_rule__WeakImport__Group__16314);
            rule__WeakImport__Group__2();

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
    // $ANTLR end "rule__WeakImport__Group__1"


    // $ANTLR start "rule__WeakImport__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2901:1: rule__WeakImport__Group__1__Impl : ( ( 'weak' )? ) ;
    public final void rule__WeakImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2905:1: ( ( ( 'weak' )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2906:1: ( ( 'weak' )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2906:1: ( ( 'weak' )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2907:1: ( 'weak' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getWeakKeyword_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2908:1: ( 'weak' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2909:2: 'weak'
                    {
                    match(input,47,FOLLOW_47_in_rule__WeakImport__Group__1__Impl6343); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeakImportAccess().getWeakKeyword_1()); 
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
    // $ANTLR end "rule__WeakImport__Group__1__Impl"


    // $ANTLR start "rule__WeakImport__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2920:1: rule__WeakImport__Group__2 : rule__WeakImport__Group__2__Impl rule__WeakImport__Group__3 ;
    public final void rule__WeakImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2924:1: ( rule__WeakImport__Group__2__Impl rule__WeakImport__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2925:2: rule__WeakImport__Group__2__Impl rule__WeakImport__Group__3
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__2__Impl_in_rule__WeakImport__Group__26376);
            rule__WeakImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WeakImport__Group__3_in_rule__WeakImport__Group__26379);
            rule__WeakImport__Group__3();

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
    // $ANTLR end "rule__WeakImport__Group__2"


    // $ANTLR start "rule__WeakImport__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2932:1: rule__WeakImport__Group__2__Impl : ( ( rule__WeakImport__ImportURIAssignment_2 ) ) ;
    public final void rule__WeakImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2936:1: ( ( ( rule__WeakImport__ImportURIAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2937:1: ( ( rule__WeakImport__ImportURIAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2937:1: ( ( rule__WeakImport__ImportURIAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2938:1: ( rule__WeakImport__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getImportURIAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2939:1: ( rule__WeakImport__ImportURIAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2939:2: rule__WeakImport__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__WeakImport__ImportURIAssignment_2_in_rule__WeakImport__Group__2__Impl6406);
            rule__WeakImport__ImportURIAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeakImportAccess().getImportURIAssignment_2()); 
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
    // $ANTLR end "rule__WeakImport__Group__2__Impl"


    // $ANTLR start "rule__WeakImport__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2949:1: rule__WeakImport__Group__3 : rule__WeakImport__Group__3__Impl ;
    public final void rule__WeakImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2953:1: ( rule__WeakImport__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2954:2: rule__WeakImport__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__3__Impl_in_rule__WeakImport__Group__36436);
            rule__WeakImport__Group__3__Impl();

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
    // $ANTLR end "rule__WeakImport__Group__3"


    // $ANTLR start "rule__WeakImport__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2960:1: rule__WeakImport__Group__3__Impl : ( ';' ) ;
    public final void rule__WeakImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2964:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2965:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2965:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2966:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getSemicolonKeyword_3()); 
            }
            match(input,51,FOLLOW_51_in_rule__WeakImport__Group__3__Impl6464); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeakImportAccess().getSemicolonKeyword_3()); 
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
    // $ANTLR end "rule__WeakImport__Group__3__Impl"


    // $ANTLR start "rule__NativeOption__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2987:1: rule__NativeOption__Group__0 : rule__NativeOption__Group__0__Impl rule__NativeOption__Group__1 ;
    public final void rule__NativeOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2991:1: ( rule__NativeOption__Group__0__Impl rule__NativeOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2992:2: rule__NativeOption__Group__0__Impl rule__NativeOption__Group__1
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__0__Impl_in_rule__NativeOption__Group__06503);
            rule__NativeOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeOption__Group__1_in_rule__NativeOption__Group__06506);
            rule__NativeOption__Group__1();

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
    // $ANTLR end "rule__NativeOption__Group__0"


    // $ANTLR start "rule__NativeOption__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2999:1: rule__NativeOption__Group__0__Impl : ( 'option' ) ;
    public final void rule__NativeOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3003:1: ( ( 'option' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3004:1: ( 'option' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3004:1: ( 'option' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3005:1: 'option'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getOptionKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__NativeOption__Group__0__Impl6534); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeOptionAccess().getOptionKeyword_0()); 
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
    // $ANTLR end "rule__NativeOption__Group__0__Impl"


    // $ANTLR start "rule__NativeOption__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3018:1: rule__NativeOption__Group__1 : rule__NativeOption__Group__1__Impl rule__NativeOption__Group__2 ;
    public final void rule__NativeOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3022:1: ( rule__NativeOption__Group__1__Impl rule__NativeOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3023:2: rule__NativeOption__Group__1__Impl rule__NativeOption__Group__2
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__1__Impl_in_rule__NativeOption__Group__16565);
            rule__NativeOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeOption__Group__2_in_rule__NativeOption__Group__16568);
            rule__NativeOption__Group__2();

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
    // $ANTLR end "rule__NativeOption__Group__1"


    // $ANTLR start "rule__NativeOption__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3030:1: rule__NativeOption__Group__1__Impl : ( ( rule__NativeOption__SourceAssignment_1 ) ) ;
    public final void rule__NativeOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3034:1: ( ( ( rule__NativeOption__SourceAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3035:1: ( ( rule__NativeOption__SourceAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3035:1: ( ( rule__NativeOption__SourceAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3036:1: ( rule__NativeOption__SourceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getSourceAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3037:1: ( rule__NativeOption__SourceAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3037:2: rule__NativeOption__SourceAssignment_1
            {
            pushFollow(FOLLOW_rule__NativeOption__SourceAssignment_1_in_rule__NativeOption__Group__1__Impl6595);
            rule__NativeOption__SourceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeOptionAccess().getSourceAssignment_1()); 
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
    // $ANTLR end "rule__NativeOption__Group__1__Impl"


    // $ANTLR start "rule__NativeOption__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3047:1: rule__NativeOption__Group__2 : rule__NativeOption__Group__2__Impl rule__NativeOption__Group__3 ;
    public final void rule__NativeOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3051:1: ( rule__NativeOption__Group__2__Impl rule__NativeOption__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3052:2: rule__NativeOption__Group__2__Impl rule__NativeOption__Group__3
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__2__Impl_in_rule__NativeOption__Group__26625);
            rule__NativeOption__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeOption__Group__3_in_rule__NativeOption__Group__26628);
            rule__NativeOption__Group__3();

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
    // $ANTLR end "rule__NativeOption__Group__2"


    // $ANTLR start "rule__NativeOption__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3059:1: rule__NativeOption__Group__2__Impl : ( '=' ) ;
    public final void rule__NativeOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3063:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3064:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3064:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3065:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getEqualsSignKeyword_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__NativeOption__Group__2__Impl6656); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeOptionAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__NativeOption__Group__2__Impl"


    // $ANTLR start "rule__NativeOption__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3078:1: rule__NativeOption__Group__3 : rule__NativeOption__Group__3__Impl rule__NativeOption__Group__4 ;
    public final void rule__NativeOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3082:1: ( rule__NativeOption__Group__3__Impl rule__NativeOption__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3083:2: rule__NativeOption__Group__3__Impl rule__NativeOption__Group__4
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__3__Impl_in_rule__NativeOption__Group__36687);
            rule__NativeOption__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeOption__Group__4_in_rule__NativeOption__Group__36690);
            rule__NativeOption__Group__4();

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
    // $ANTLR end "rule__NativeOption__Group__3"


    // $ANTLR start "rule__NativeOption__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3090:1: rule__NativeOption__Group__3__Impl : ( ( rule__NativeOption__ValueAssignment_3 ) ) ;
    public final void rule__NativeOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3094:1: ( ( ( rule__NativeOption__ValueAssignment_3 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3095:1: ( ( rule__NativeOption__ValueAssignment_3 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3095:1: ( ( rule__NativeOption__ValueAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3096:1: ( rule__NativeOption__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getValueAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3097:1: ( rule__NativeOption__ValueAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3097:2: rule__NativeOption__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__NativeOption__ValueAssignment_3_in_rule__NativeOption__Group__3__Impl6717);
            rule__NativeOption__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeOptionAccess().getValueAssignment_3()); 
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
    // $ANTLR end "rule__NativeOption__Group__3__Impl"


    // $ANTLR start "rule__NativeOption__Group__4"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3107:1: rule__NativeOption__Group__4 : rule__NativeOption__Group__4__Impl ;
    public final void rule__NativeOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3111:1: ( rule__NativeOption__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3112:2: rule__NativeOption__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__4__Impl_in_rule__NativeOption__Group__46747);
            rule__NativeOption__Group__4__Impl();

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
    // $ANTLR end "rule__NativeOption__Group__4"


    // $ANTLR start "rule__NativeOption__Group__4__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3118:1: rule__NativeOption__Group__4__Impl : ( ';' ) ;
    public final void rule__NativeOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3122:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3123:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3123:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3124:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getSemicolonKeyword_4()); 
            }
            match(input,51,FOLLOW_51_in_rule__NativeOption__Group__4__Impl6775); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeOptionAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__NativeOption__Group__4__Impl"


    // $ANTLR start "rule__CustomOption__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3147:1: rule__CustomOption__Group__0 : rule__CustomOption__Group__0__Impl rule__CustomOption__Group__1 ;
    public final void rule__CustomOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3151:1: ( rule__CustomOption__Group__0__Impl rule__CustomOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3152:2: rule__CustomOption__Group__0__Impl rule__CustomOption__Group__1
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__0__Impl_in_rule__CustomOption__Group__06816);
            rule__CustomOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomOption__Group__1_in_rule__CustomOption__Group__06819);
            rule__CustomOption__Group__1();

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
    // $ANTLR end "rule__CustomOption__Group__0"


    // $ANTLR start "rule__CustomOption__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3159:1: rule__CustomOption__Group__0__Impl : ( 'option' ) ;
    public final void rule__CustomOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3163:1: ( ( 'option' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3164:1: ( 'option' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3164:1: ( 'option' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3165:1: 'option'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getOptionKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__CustomOption__Group__0__Impl6847); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomOptionAccess().getOptionKeyword_0()); 
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
    // $ANTLR end "rule__CustomOption__Group__0__Impl"


    // $ANTLR start "rule__CustomOption__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3178:1: rule__CustomOption__Group__1 : rule__CustomOption__Group__1__Impl rule__CustomOption__Group__2 ;
    public final void rule__CustomOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3182:1: ( rule__CustomOption__Group__1__Impl rule__CustomOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3183:2: rule__CustomOption__Group__1__Impl rule__CustomOption__Group__2
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__1__Impl_in_rule__CustomOption__Group__16878);
            rule__CustomOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomOption__Group__2_in_rule__CustomOption__Group__16881);
            rule__CustomOption__Group__2();

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
    // $ANTLR end "rule__CustomOption__Group__1"


    // $ANTLR start "rule__CustomOption__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3190:1: rule__CustomOption__Group__1__Impl : ( ( rule__CustomOption__SourceAssignment_1 ) ) ;
    public final void rule__CustomOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3194:1: ( ( ( rule__CustomOption__SourceAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3195:1: ( ( rule__CustomOption__SourceAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3195:1: ( ( rule__CustomOption__SourceAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3196:1: ( rule__CustomOption__SourceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getSourceAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3197:1: ( rule__CustomOption__SourceAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3197:2: rule__CustomOption__SourceAssignment_1
            {
            pushFollow(FOLLOW_rule__CustomOption__SourceAssignment_1_in_rule__CustomOption__Group__1__Impl6908);
            rule__CustomOption__SourceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomOptionAccess().getSourceAssignment_1()); 
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
    // $ANTLR end "rule__CustomOption__Group__1__Impl"


    // $ANTLR start "rule__CustomOption__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3207:1: rule__CustomOption__Group__2 : rule__CustomOption__Group__2__Impl rule__CustomOption__Group__3 ;
    public final void rule__CustomOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3211:1: ( rule__CustomOption__Group__2__Impl rule__CustomOption__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3212:2: rule__CustomOption__Group__2__Impl rule__CustomOption__Group__3
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__2__Impl_in_rule__CustomOption__Group__26938);
            rule__CustomOption__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomOption__Group__3_in_rule__CustomOption__Group__26941);
            rule__CustomOption__Group__3();

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
    // $ANTLR end "rule__CustomOption__Group__2"


    // $ANTLR start "rule__CustomOption__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3219:1: rule__CustomOption__Group__2__Impl : ( '=' ) ;
    public final void rule__CustomOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3223:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3224:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3224:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3225:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getEqualsSignKeyword_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__CustomOption__Group__2__Impl6969); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomOptionAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__CustomOption__Group__2__Impl"


    // $ANTLR start "rule__CustomOption__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3238:1: rule__CustomOption__Group__3 : rule__CustomOption__Group__3__Impl rule__CustomOption__Group__4 ;
    public final void rule__CustomOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3242:1: ( rule__CustomOption__Group__3__Impl rule__CustomOption__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3243:2: rule__CustomOption__Group__3__Impl rule__CustomOption__Group__4
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__3__Impl_in_rule__CustomOption__Group__37000);
            rule__CustomOption__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomOption__Group__4_in_rule__CustomOption__Group__37003);
            rule__CustomOption__Group__4();

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
    // $ANTLR end "rule__CustomOption__Group__3"


    // $ANTLR start "rule__CustomOption__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3250:1: rule__CustomOption__Group__3__Impl : ( ( rule__CustomOption__ValueAssignment_3 ) ) ;
    public final void rule__CustomOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3254:1: ( ( ( rule__CustomOption__ValueAssignment_3 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3255:1: ( ( rule__CustomOption__ValueAssignment_3 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3255:1: ( ( rule__CustomOption__ValueAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3256:1: ( rule__CustomOption__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getValueAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3257:1: ( rule__CustomOption__ValueAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3257:2: rule__CustomOption__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__CustomOption__ValueAssignment_3_in_rule__CustomOption__Group__3__Impl7030);
            rule__CustomOption__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomOptionAccess().getValueAssignment_3()); 
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
    // $ANTLR end "rule__CustomOption__Group__3__Impl"


    // $ANTLR start "rule__CustomOption__Group__4"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3267:1: rule__CustomOption__Group__4 : rule__CustomOption__Group__4__Impl ;
    public final void rule__CustomOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3271:1: ( rule__CustomOption__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3272:2: rule__CustomOption__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__4__Impl_in_rule__CustomOption__Group__47060);
            rule__CustomOption__Group__4__Impl();

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
    // $ANTLR end "rule__CustomOption__Group__4"


    // $ANTLR start "rule__CustomOption__Group__4__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3278:1: rule__CustomOption__Group__4__Impl : ( ';' ) ;
    public final void rule__CustomOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3282:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3283:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3283:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3284:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getSemicolonKeyword_4()); 
            }
            match(input,51,FOLLOW_51_in_rule__CustomOption__Group__4__Impl7088); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomOptionAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__CustomOption__Group__4__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3307:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3311:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3312:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__07129);
            rule__Message__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__07132);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3319:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3323:1: ( ( 'message' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3324:1: ( 'message' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3324:1: ( 'message' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3325:1: 'message'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMessageKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Message__Group__0__Impl7160); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3338:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3342:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3343:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__17191);
            rule__Message__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__2_in_rule__Message__Group__17194);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3350:1: rule__Message__Group__1__Impl : ( ( rule__Message__NameAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3354:1: ( ( ( rule__Message__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3355:1: ( ( rule__Message__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3355:1: ( ( rule__Message__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3356:1: ( rule__Message__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3357:1: ( rule__Message__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3357:2: rule__Message__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Message__NameAssignment_1_in_rule__Message__Group__1__Impl7221);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3367:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3371:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3372:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__27251);
            rule__Message__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__3_in_rule__Message__Group__27254);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3379:1: rule__Message__Group__2__Impl : ( '{' ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3383:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3384:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3384:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3385:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__Message__Group__2__Impl7282); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3398:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3402:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3403:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__37313);
            rule__Message__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__4_in_rule__Message__Group__37316);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3410:1: rule__Message__Group__3__Impl : ( ( rule__Message__ElementsAssignment_3 )* ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3414:1: ( ( ( rule__Message__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3415:1: ( ( rule__Message__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3415:1: ( ( rule__Message__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3416:1: ( rule__Message__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3417:1: ( rule__Message__ElementsAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=17 && LA26_0<=25)||LA26_0==56) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3417:2: rule__Message__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Message__ElementsAssignment_3_in_rule__Message__Group__3__Impl7343);
            	    rule__Message__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3427:1: rule__Message__Group__4 : rule__Message__Group__4__Impl ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3431:1: ( rule__Message__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3432:2: rule__Message__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__47374);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3438:1: rule__Message__Group__4__Impl : ( '}' ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3442:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3443:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3443:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3444:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,55,FOLLOW_55_in_rule__Message__Group__4__Impl7402); if (state.failed) return ;
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


    // $ANTLR start "rule__Oneof__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3467:1: rule__Oneof__Group__0 : rule__Oneof__Group__0__Impl rule__Oneof__Group__1 ;
    public final void rule__Oneof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3471:1: ( rule__Oneof__Group__0__Impl rule__Oneof__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3472:2: rule__Oneof__Group__0__Impl rule__Oneof__Group__1
            {
            pushFollow(FOLLOW_rule__Oneof__Group__0__Impl_in_rule__Oneof__Group__07443);
            rule__Oneof__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Oneof__Group__1_in_rule__Oneof__Group__07446);
            rule__Oneof__Group__1();

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
    // $ANTLR end "rule__Oneof__Group__0"


    // $ANTLR start "rule__Oneof__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3479:1: rule__Oneof__Group__0__Impl : ( 'oneof' ) ;
    public final void rule__Oneof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3483:1: ( ( 'oneof' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3484:1: ( 'oneof' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3484:1: ( 'oneof' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3485:1: 'oneof'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getOneofKeyword_0()); 
            }
            match(input,56,FOLLOW_56_in_rule__Oneof__Group__0__Impl7474); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofAccess().getOneofKeyword_0()); 
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
    // $ANTLR end "rule__Oneof__Group__0__Impl"


    // $ANTLR start "rule__Oneof__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3498:1: rule__Oneof__Group__1 : rule__Oneof__Group__1__Impl rule__Oneof__Group__2 ;
    public final void rule__Oneof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3502:1: ( rule__Oneof__Group__1__Impl rule__Oneof__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3503:2: rule__Oneof__Group__1__Impl rule__Oneof__Group__2
            {
            pushFollow(FOLLOW_rule__Oneof__Group__1__Impl_in_rule__Oneof__Group__17505);
            rule__Oneof__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Oneof__Group__2_in_rule__Oneof__Group__17508);
            rule__Oneof__Group__2();

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
    // $ANTLR end "rule__Oneof__Group__1"


    // $ANTLR start "rule__Oneof__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3510:1: rule__Oneof__Group__1__Impl : ( ( rule__Oneof__NameAssignment_1 ) ) ;
    public final void rule__Oneof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3514:1: ( ( ( rule__Oneof__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3515:1: ( ( rule__Oneof__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3515:1: ( ( rule__Oneof__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3516:1: ( rule__Oneof__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3517:1: ( rule__Oneof__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3517:2: rule__Oneof__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Oneof__NameAssignment_1_in_rule__Oneof__Group__1__Impl7535);
            rule__Oneof__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Oneof__Group__1__Impl"


    // $ANTLR start "rule__Oneof__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3527:1: rule__Oneof__Group__2 : rule__Oneof__Group__2__Impl rule__Oneof__Group__3 ;
    public final void rule__Oneof__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3531:1: ( rule__Oneof__Group__2__Impl rule__Oneof__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3532:2: rule__Oneof__Group__2__Impl rule__Oneof__Group__3
            {
            pushFollow(FOLLOW_rule__Oneof__Group__2__Impl_in_rule__Oneof__Group__27565);
            rule__Oneof__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Oneof__Group__3_in_rule__Oneof__Group__27568);
            rule__Oneof__Group__3();

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
    // $ANTLR end "rule__Oneof__Group__2"


    // $ANTLR start "rule__Oneof__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3539:1: rule__Oneof__Group__2__Impl : ( '{' ) ;
    public final void rule__Oneof__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3543:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3544:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3544:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3545:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__Oneof__Group__2__Impl7596); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Oneof__Group__2__Impl"


    // $ANTLR start "rule__Oneof__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3558:1: rule__Oneof__Group__3 : rule__Oneof__Group__3__Impl rule__Oneof__Group__4 ;
    public final void rule__Oneof__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3562:1: ( rule__Oneof__Group__3__Impl rule__Oneof__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3563:2: rule__Oneof__Group__3__Impl rule__Oneof__Group__4
            {
            pushFollow(FOLLOW_rule__Oneof__Group__3__Impl_in_rule__Oneof__Group__37627);
            rule__Oneof__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Oneof__Group__4_in_rule__Oneof__Group__37630);
            rule__Oneof__Group__4();

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
    // $ANTLR end "rule__Oneof__Group__3"


    // $ANTLR start "rule__Oneof__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3570:1: rule__Oneof__Group__3__Impl : ( ( rule__Oneof__FieldsAssignment_3 )* ) ;
    public final void rule__Oneof__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3574:1: ( ( ( rule__Oneof__FieldsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3575:1: ( ( rule__Oneof__FieldsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3575:1: ( ( rule__Oneof__FieldsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3576:1: ( rule__Oneof__FieldsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getFieldsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3577:1: ( rule__Oneof__FieldsAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||(LA27_0>=13 && LA27_0<=48)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3577:2: rule__Oneof__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Oneof__FieldsAssignment_3_in_rule__Oneof__Group__3__Impl7657);
            	    rule__Oneof__FieldsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofAccess().getFieldsAssignment_3()); 
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
    // $ANTLR end "rule__Oneof__Group__3__Impl"


    // $ANTLR start "rule__Oneof__Group__4"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3587:1: rule__Oneof__Group__4 : rule__Oneof__Group__4__Impl ;
    public final void rule__Oneof__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3591:1: ( rule__Oneof__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3592:2: rule__Oneof__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Oneof__Group__4__Impl_in_rule__Oneof__Group__47688);
            rule__Oneof__Group__4__Impl();

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
    // $ANTLR end "rule__Oneof__Group__4"


    // $ANTLR start "rule__Oneof__Group__4__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3598:1: rule__Oneof__Group__4__Impl : ( '}' ) ;
    public final void rule__Oneof__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3602:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3603:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3603:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3604:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,55,FOLLOW_55_in_rule__Oneof__Group__4__Impl7716); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__Oneof__Group__4__Impl"


    // $ANTLR start "rule__OneofField__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3627:1: rule__OneofField__Group__0 : rule__OneofField__Group__0__Impl rule__OneofField__Group__1 ;
    public final void rule__OneofField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3631:1: ( rule__OneofField__Group__0__Impl rule__OneofField__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3632:2: rule__OneofField__Group__0__Impl rule__OneofField__Group__1
            {
            pushFollow(FOLLOW_rule__OneofField__Group__0__Impl_in_rule__OneofField__Group__07757);
            rule__OneofField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OneofField__Group__1_in_rule__OneofField__Group__07760);
            rule__OneofField__Group__1();

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
    // $ANTLR end "rule__OneofField__Group__0"


    // $ANTLR start "rule__OneofField__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3639:1: rule__OneofField__Group__0__Impl : ( ( rule__OneofField__TypeAssignment_0 ) ) ;
    public final void rule__OneofField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3643:1: ( ( ( rule__OneofField__TypeAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3644:1: ( ( rule__OneofField__TypeAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3644:1: ( ( rule__OneofField__TypeAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3645:1: ( rule__OneofField__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getTypeAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3646:1: ( rule__OneofField__TypeAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3646:2: rule__OneofField__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__OneofField__TypeAssignment_0_in_rule__OneofField__Group__0__Impl7787);
            rule__OneofField__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofFieldAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__OneofField__Group__0__Impl"


    // $ANTLR start "rule__OneofField__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3656:1: rule__OneofField__Group__1 : rule__OneofField__Group__1__Impl rule__OneofField__Group__2 ;
    public final void rule__OneofField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3660:1: ( rule__OneofField__Group__1__Impl rule__OneofField__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3661:2: rule__OneofField__Group__1__Impl rule__OneofField__Group__2
            {
            pushFollow(FOLLOW_rule__OneofField__Group__1__Impl_in_rule__OneofField__Group__17817);
            rule__OneofField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OneofField__Group__2_in_rule__OneofField__Group__17820);
            rule__OneofField__Group__2();

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
    // $ANTLR end "rule__OneofField__Group__1"


    // $ANTLR start "rule__OneofField__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3668:1: rule__OneofField__Group__1__Impl : ( ( rule__OneofField__NameAssignment_1 ) ) ;
    public final void rule__OneofField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3672:1: ( ( ( rule__OneofField__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3673:1: ( ( rule__OneofField__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3673:1: ( ( rule__OneofField__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3674:1: ( rule__OneofField__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3675:1: ( rule__OneofField__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3675:2: rule__OneofField__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OneofField__NameAssignment_1_in_rule__OneofField__Group__1__Impl7847);
            rule__OneofField__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofFieldAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__OneofField__Group__1__Impl"


    // $ANTLR start "rule__OneofField__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3685:1: rule__OneofField__Group__2 : rule__OneofField__Group__2__Impl rule__OneofField__Group__3 ;
    public final void rule__OneofField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3689:1: ( rule__OneofField__Group__2__Impl rule__OneofField__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3690:2: rule__OneofField__Group__2__Impl rule__OneofField__Group__3
            {
            pushFollow(FOLLOW_rule__OneofField__Group__2__Impl_in_rule__OneofField__Group__27877);
            rule__OneofField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OneofField__Group__3_in_rule__OneofField__Group__27880);
            rule__OneofField__Group__3();

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
    // $ANTLR end "rule__OneofField__Group__2"


    // $ANTLR start "rule__OneofField__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3697:1: rule__OneofField__Group__2__Impl : ( '=' ) ;
    public final void rule__OneofField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3701:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3702:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3702:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3703:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getEqualsSignKeyword_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__OneofField__Group__2__Impl7908); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofFieldAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__OneofField__Group__2__Impl"


    // $ANTLR start "rule__OneofField__Group__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3716:1: rule__OneofField__Group__3 : rule__OneofField__Group__3__Impl rule__OneofField__Group__4 ;
    public final void rule__OneofField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3720:1: ( rule__OneofField__Group__3__Impl rule__OneofField__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3721:2: rule__OneofField__Group__3__Impl rule__OneofField__Group__4
            {
            pushFollow(FOLLOW_rule__OneofField__Group__3__Impl_in_rule__OneofField__Group__37939);
            rule__OneofField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OneofField__Group__4_in_rule__OneofField__Group__37942);
            rule__OneofField__Group__4();

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
    // $ANTLR end "rule__OneofField__Group__3"


    // $ANTLR start "rule__OneofField__Group__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3728:1: rule__OneofField__Group__3__Impl : ( ( rule__OneofField__IndexAssignment_3 ) ) ;
    public final void rule__OneofField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3732:1: ( ( ( rule__OneofField__IndexAssignment_3 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3733:1: ( ( rule__OneofField__IndexAssignment_3 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3733:1: ( ( rule__OneofField__IndexAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3734:1: ( rule__OneofField__IndexAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getIndexAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3735:1: ( rule__OneofField__IndexAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3735:2: rule__OneofField__IndexAssignment_3
            {
            pushFollow(FOLLOW_rule__OneofField__IndexAssignment_3_in_rule__OneofField__Group__3__Impl7969);
            rule__OneofField__IndexAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofFieldAccess().getIndexAssignment_3()); 
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
    // $ANTLR end "rule__OneofField__Group__3__Impl"


    // $ANTLR start "rule__OneofField__Group__4"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3745:1: rule__OneofField__Group__4 : rule__OneofField__Group__4__Impl rule__OneofField__Group__5 ;
    public final void rule__OneofField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3749:1: ( rule__OneofField__Group__4__Impl rule__OneofField__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3750:2: rule__OneofField__Group__4__Impl rule__OneofField__Group__5
            {
            pushFollow(FOLLOW_rule__OneofField__Group__4__Impl_in_rule__OneofField__Group__47999);
            rule__OneofField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OneofField__Group__5_in_rule__OneofField__Group__48002);
            rule__OneofField__Group__5();

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
    // $ANTLR end "rule__OneofField__Group__4"


    // $ANTLR start "rule__OneofField__Group__4__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3757:1: rule__OneofField__Group__4__Impl : ( ( rule__OneofField__OptionsAssignment_4 )? ) ;
    public final void rule__OneofField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3761:1: ( ( ( rule__OneofField__OptionsAssignment_4 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3762:1: ( ( rule__OneofField__OptionsAssignment_4 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3762:1: ( ( rule__OneofField__OptionsAssignment_4 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3763:1: ( rule__OneofField__OptionsAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getOptionsAssignment_4()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3764:1: ( rule__OneofField__OptionsAssignment_4 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==58) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3764:2: rule__OneofField__OptionsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__OneofField__OptionsAssignment_4_in_rule__OneofField__Group__4__Impl8029);
                    rule__OneofField__OptionsAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofFieldAccess().getOptionsAssignment_4()); 
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
    // $ANTLR end "rule__OneofField__Group__4__Impl"


    // $ANTLR start "rule__OneofField__Group__5"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3774:1: rule__OneofField__Group__5 : rule__OneofField__Group__5__Impl ;
    public final void rule__OneofField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3778:1: ( rule__OneofField__Group__5__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3779:2: rule__OneofField__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__OneofField__Group__5__Impl_in_rule__OneofField__Group__58060);
            rule__OneofField__Group__5__Impl();

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
    // $ANTLR end "rule__OneofField__Group__5"


    // $ANTLR start "rule__OneofField__Group__5__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3785:1: rule__OneofField__Group__5__Impl : ( ';' ) ;
    public final void rule__OneofField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3789:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3790:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3790:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3791:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getSemicolonKeyword_5()); 
            }
            match(input,51,FOLLOW_51_in_rule__OneofField__Group__5__Impl8088); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofFieldAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__OneofField__Group__5__Impl"


    // $ANTLR start "rule__ExtensionRange__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3816:1: rule__ExtensionRange__Group__0 : rule__ExtensionRange__Group__0__Impl rule__ExtensionRange__Group__1 ;
    public final void rule__ExtensionRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3820:1: ( rule__ExtensionRange__Group__0__Impl rule__ExtensionRange__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3821:2: rule__ExtensionRange__Group__0__Impl rule__ExtensionRange__Group__1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__0__Impl_in_rule__ExtensionRange__Group__08131);
            rule__ExtensionRange__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group__1_in_rule__ExtensionRange__Group__08134);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3828:1: rule__ExtensionRange__Group__0__Impl : ( 'extensions' ) ;
    public final void rule__ExtensionRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3832:1: ( ( 'extensions' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3833:1: ( 'extensions' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3833:1: ( 'extensions' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3834:1: 'extensions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getExtensionsKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__ExtensionRange__Group__0__Impl8162); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3847:1: rule__ExtensionRange__Group__1 : rule__ExtensionRange__Group__1__Impl rule__ExtensionRange__Group__2 ;
    public final void rule__ExtensionRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3851:1: ( rule__ExtensionRange__Group__1__Impl rule__ExtensionRange__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3852:2: rule__ExtensionRange__Group__1__Impl rule__ExtensionRange__Group__2
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__1__Impl_in_rule__ExtensionRange__Group__18193);
            rule__ExtensionRange__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group__2_in_rule__ExtensionRange__Group__18196);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3859:1: rule__ExtensionRange__Group__1__Impl : ( ( rule__ExtensionRange__RangesAssignment_1 ) ) ;
    public final void rule__ExtensionRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3863:1: ( ( ( rule__ExtensionRange__RangesAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3864:1: ( ( rule__ExtensionRange__RangesAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3864:1: ( ( rule__ExtensionRange__RangesAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3865:1: ( rule__ExtensionRange__RangesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getRangesAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3866:1: ( rule__ExtensionRange__RangesAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3866:2: rule__ExtensionRange__RangesAssignment_1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__RangesAssignment_1_in_rule__ExtensionRange__Group__1__Impl8223);
            rule__ExtensionRange__RangesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeAccess().getRangesAssignment_1()); 
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3876:1: rule__ExtensionRange__Group__2 : rule__ExtensionRange__Group__2__Impl rule__ExtensionRange__Group__3 ;
    public final void rule__ExtensionRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3880:1: ( rule__ExtensionRange__Group__2__Impl rule__ExtensionRange__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3881:2: rule__ExtensionRange__Group__2__Impl rule__ExtensionRange__Group__3
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__2__Impl_in_rule__ExtensionRange__Group__28253);
            rule__ExtensionRange__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group__3_in_rule__ExtensionRange__Group__28256);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3888:1: rule__ExtensionRange__Group__2__Impl : ( ( rule__ExtensionRange__Group_2__0 )* ) ;
    public final void rule__ExtensionRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3892:1: ( ( ( rule__ExtensionRange__Group_2__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3893:1: ( ( rule__ExtensionRange__Group_2__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3893:1: ( ( rule__ExtensionRange__Group_2__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3894:1: ( rule__ExtensionRange__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getGroup_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3895:1: ( rule__ExtensionRange__Group_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==57) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3895:2: rule__ExtensionRange__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ExtensionRange__Group_2__0_in_rule__ExtensionRange__Group__2__Impl8283);
            	    rule__ExtensionRange__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3905:1: rule__ExtensionRange__Group__3 : rule__ExtensionRange__Group__3__Impl ;
    public final void rule__ExtensionRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3909:1: ( rule__ExtensionRange__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3910:2: rule__ExtensionRange__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__3__Impl_in_rule__ExtensionRange__Group__38314);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3916:1: rule__ExtensionRange__Group__3__Impl : ( ';' ) ;
    public final void rule__ExtensionRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3920:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3921:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3921:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3922:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getSemicolonKeyword_3()); 
            }
            match(input,51,FOLLOW_51_in_rule__ExtensionRange__Group__3__Impl8342); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3943:1: rule__ExtensionRange__Group_2__0 : rule__ExtensionRange__Group_2__0__Impl rule__ExtensionRange__Group_2__1 ;
    public final void rule__ExtensionRange__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3947:1: ( rule__ExtensionRange__Group_2__0__Impl rule__ExtensionRange__Group_2__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3948:2: rule__ExtensionRange__Group_2__0__Impl rule__ExtensionRange__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group_2__0__Impl_in_rule__ExtensionRange__Group_2__08381);
            rule__ExtensionRange__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group_2__1_in_rule__ExtensionRange__Group_2__08384);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3955:1: rule__ExtensionRange__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ExtensionRange__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3959:1: ( ( ',' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3960:1: ( ',' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3960:1: ( ',' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3961:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getCommaKeyword_2_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__ExtensionRange__Group_2__0__Impl8412); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeAccess().getCommaKeyword_2_0()); 
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3974:1: rule__ExtensionRange__Group_2__1 : rule__ExtensionRange__Group_2__1__Impl ;
    public final void rule__ExtensionRange__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3978:1: ( rule__ExtensionRange__Group_2__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3979:2: rule__ExtensionRange__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group_2__1__Impl_in_rule__ExtensionRange__Group_2__18443);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3985:1: rule__ExtensionRange__Group_2__1__Impl : ( ( rule__ExtensionRange__RangesAssignment_2_1 ) ) ;
    public final void rule__ExtensionRange__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3989:1: ( ( ( rule__ExtensionRange__RangesAssignment_2_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3990:1: ( ( rule__ExtensionRange__RangesAssignment_2_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3990:1: ( ( rule__ExtensionRange__RangesAssignment_2_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3991:1: ( rule__ExtensionRange__RangesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getRangesAssignment_2_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3992:1: ( rule__ExtensionRange__RangesAssignment_2_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3992:2: rule__ExtensionRange__RangesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__RangesAssignment_2_1_in_rule__ExtensionRange__Group_2__1__Impl8470);
            rule__ExtensionRange__RangesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeAccess().getRangesAssignment_2_1()); 
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


    // $ANTLR start "rule__Range__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4006:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4010:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4011:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__08504);
            rule__Range__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Range__Group__1_in_rule__Range__Group__08507);
            rule__Range__Group__1();

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
    // $ANTLR end "rule__Range__Group__0"


    // $ANTLR start "rule__Range__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4018:1: rule__Range__Group__0__Impl : ( ( rule__Range__FromAssignment_0 ) ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4022:1: ( ( ( rule__Range__FromAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4023:1: ( ( rule__Range__FromAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4023:1: ( ( rule__Range__FromAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4024:1: ( rule__Range__FromAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getFromAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4025:1: ( rule__Range__FromAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4025:2: rule__Range__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Range__FromAssignment_0_in_rule__Range__Group__0__Impl8534);
            rule__Range__FromAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getFromAssignment_0()); 
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
    // $ANTLR end "rule__Range__Group__0__Impl"


    // $ANTLR start "rule__Range__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4035:1: rule__Range__Group__1 : rule__Range__Group__1__Impl ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4039:1: ( rule__Range__Group__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4040:2: rule__Range__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__18564);
            rule__Range__Group__1__Impl();

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
    // $ANTLR end "rule__Range__Group__1"


    // $ANTLR start "rule__Range__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4046:1: rule__Range__Group__1__Impl : ( ( rule__Range__Group_1__0 )? ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4050:1: ( ( ( rule__Range__Group_1__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4051:1: ( ( rule__Range__Group_1__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4051:1: ( ( rule__Range__Group_1__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4052:1: ( rule__Range__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getGroup_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4053:1: ( rule__Range__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4053:2: rule__Range__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Range__Group_1__0_in_rule__Range__Group__1__Impl8591);
                    rule__Range__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Range__Group__1__Impl"


    // $ANTLR start "rule__Range__Group_1__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4067:1: rule__Range__Group_1__0 : rule__Range__Group_1__0__Impl rule__Range__Group_1__1 ;
    public final void rule__Range__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4071:1: ( rule__Range__Group_1__0__Impl rule__Range__Group_1__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4072:2: rule__Range__Group_1__0__Impl rule__Range__Group_1__1
            {
            pushFollow(FOLLOW_rule__Range__Group_1__0__Impl_in_rule__Range__Group_1__08626);
            rule__Range__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Range__Group_1__1_in_rule__Range__Group_1__08629);
            rule__Range__Group_1__1();

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
    // $ANTLR end "rule__Range__Group_1__0"


    // $ANTLR start "rule__Range__Group_1__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4079:1: rule__Range__Group_1__0__Impl : ( 'to' ) ;
    public final void rule__Range__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4083:1: ( ( 'to' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4084:1: ( 'to' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4084:1: ( 'to' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4085:1: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getToKeyword_1_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__Range__Group_1__0__Impl8657); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getToKeyword_1_0()); 
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
    // $ANTLR end "rule__Range__Group_1__0__Impl"


    // $ANTLR start "rule__Range__Group_1__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4098:1: rule__Range__Group_1__1 : rule__Range__Group_1__1__Impl ;
    public final void rule__Range__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4102:1: ( rule__Range__Group_1__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4103:2: rule__Range__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Range__Group_1__1__Impl_in_rule__Range__Group_1__18688);
            rule__Range__Group_1__1__Impl();

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
    // $ANTLR end "rule__Range__Group_1__1"


    // $ANTLR start "rule__Range__Group_1__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4109:1: rule__Range__Group_1__1__Impl : ( ( rule__Range__Alternatives_1_1 ) ) ;
    public final void rule__Range__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4113:1: ( ( ( rule__Range__Alternatives_1_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4114:1: ( ( rule__Range__Alternatives_1_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4114:1: ( ( rule__Range__Alternatives_1_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4115:1: ( rule__Range__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getAlternatives_1_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4116:1: ( rule__Range__Alternatives_1_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4116:2: rule__Range__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__Range__Alternatives_1_1_in_rule__Range__Group_1__1__Impl8715);
            rule__Range__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getAlternatives_1_1()); 
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
    // $ANTLR end "rule__Range__Group_1__1__Impl"


    // $ANTLR start "rule__MessageField__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4130:1: rule__MessageField__Group__0 : rule__MessageField__Group__0__Impl rule__MessageField__Group__1 ;
    public final void rule__MessageField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4134:1: ( rule__MessageField__Group__0__Impl rule__MessageField__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4135:2: rule__MessageField__Group__0__Impl rule__MessageField__Group__1
            {
            pushFollow(FOLLOW_rule__MessageField__Group__0__Impl_in_rule__MessageField__Group__08749);
            rule__MessageField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__1_in_rule__MessageField__Group__08752);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4142:1: rule__MessageField__Group__0__Impl : ( ( rule__MessageField__ModifierAssignment_0 ) ) ;
    public final void rule__MessageField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4146:1: ( ( ( rule__MessageField__ModifierAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4147:1: ( ( rule__MessageField__ModifierAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4147:1: ( ( rule__MessageField__ModifierAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4148:1: ( rule__MessageField__ModifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getModifierAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4149:1: ( rule__MessageField__ModifierAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4149:2: rule__MessageField__ModifierAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageField__ModifierAssignment_0_in_rule__MessageField__Group__0__Impl8779);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4159:1: rule__MessageField__Group__1 : rule__MessageField__Group__1__Impl rule__MessageField__Group__2 ;
    public final void rule__MessageField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4163:1: ( rule__MessageField__Group__1__Impl rule__MessageField__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4164:2: rule__MessageField__Group__1__Impl rule__MessageField__Group__2
            {
            pushFollow(FOLLOW_rule__MessageField__Group__1__Impl_in_rule__MessageField__Group__18809);
            rule__MessageField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__2_in_rule__MessageField__Group__18812);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4171:1: rule__MessageField__Group__1__Impl : ( ( rule__MessageField__TypeAssignment_1 ) ) ;
    public final void rule__MessageField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4175:1: ( ( ( rule__MessageField__TypeAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4176:1: ( ( rule__MessageField__TypeAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4176:1: ( ( rule__MessageField__TypeAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4177:1: ( rule__MessageField__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getTypeAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4178:1: ( rule__MessageField__TypeAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4178:2: rule__MessageField__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MessageField__TypeAssignment_1_in_rule__MessageField__Group__1__Impl8839);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4188:1: rule__MessageField__Group__2 : rule__MessageField__Group__2__Impl rule__MessageField__Group__3 ;
    public final void rule__MessageField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4192:1: ( rule__MessageField__Group__2__Impl rule__MessageField__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4193:2: rule__MessageField__Group__2__Impl rule__MessageField__Group__3
            {
            pushFollow(FOLLOW_rule__MessageField__Group__2__Impl_in_rule__MessageField__Group__28869);
            rule__MessageField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__3_in_rule__MessageField__Group__28872);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4200:1: rule__MessageField__Group__2__Impl : ( ( rule__MessageField__NameAssignment_2 ) ) ;
    public final void rule__MessageField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4204:1: ( ( ( rule__MessageField__NameAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4205:1: ( ( rule__MessageField__NameAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4205:1: ( ( rule__MessageField__NameAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4206:1: ( rule__MessageField__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getNameAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4207:1: ( rule__MessageField__NameAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4207:2: rule__MessageField__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MessageField__NameAssignment_2_in_rule__MessageField__Group__2__Impl8899);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4217:1: rule__MessageField__Group__3 : rule__MessageField__Group__3__Impl rule__MessageField__Group__4 ;
    public final void rule__MessageField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4221:1: ( rule__MessageField__Group__3__Impl rule__MessageField__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4222:2: rule__MessageField__Group__3__Impl rule__MessageField__Group__4
            {
            pushFollow(FOLLOW_rule__MessageField__Group__3__Impl_in_rule__MessageField__Group__38929);
            rule__MessageField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__4_in_rule__MessageField__Group__38932);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4229:1: rule__MessageField__Group__3__Impl : ( '=' ) ;
    public final void rule__MessageField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4233:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4234:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4234:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4235:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getEqualsSignKeyword_3()); 
            }
            match(input,52,FOLLOW_52_in_rule__MessageField__Group__3__Impl8960); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4248:1: rule__MessageField__Group__4 : rule__MessageField__Group__4__Impl rule__MessageField__Group__5 ;
    public final void rule__MessageField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4252:1: ( rule__MessageField__Group__4__Impl rule__MessageField__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4253:2: rule__MessageField__Group__4__Impl rule__MessageField__Group__5
            {
            pushFollow(FOLLOW_rule__MessageField__Group__4__Impl_in_rule__MessageField__Group__48991);
            rule__MessageField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__5_in_rule__MessageField__Group__48994);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4260:1: rule__MessageField__Group__4__Impl : ( ( rule__MessageField__IndexAssignment_4 ) ) ;
    public final void rule__MessageField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4264:1: ( ( ( rule__MessageField__IndexAssignment_4 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4265:1: ( ( rule__MessageField__IndexAssignment_4 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4265:1: ( ( rule__MessageField__IndexAssignment_4 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4266:1: ( rule__MessageField__IndexAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getIndexAssignment_4()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4267:1: ( rule__MessageField__IndexAssignment_4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4267:2: rule__MessageField__IndexAssignment_4
            {
            pushFollow(FOLLOW_rule__MessageField__IndexAssignment_4_in_rule__MessageField__Group__4__Impl9021);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4277:1: rule__MessageField__Group__5 : rule__MessageField__Group__5__Impl rule__MessageField__Group__6 ;
    public final void rule__MessageField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4281:1: ( rule__MessageField__Group__5__Impl rule__MessageField__Group__6 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4282:2: rule__MessageField__Group__5__Impl rule__MessageField__Group__6
            {
            pushFollow(FOLLOW_rule__MessageField__Group__5__Impl_in_rule__MessageField__Group__59051);
            rule__MessageField__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__6_in_rule__MessageField__Group__59054);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4289:1: rule__MessageField__Group__5__Impl : ( ( rule__MessageField__OptionsAssignment_5 )? ) ;
    public final void rule__MessageField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4293:1: ( ( ( rule__MessageField__OptionsAssignment_5 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4294:1: ( ( rule__MessageField__OptionsAssignment_5 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4294:1: ( ( rule__MessageField__OptionsAssignment_5 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4295:1: ( rule__MessageField__OptionsAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getOptionsAssignment_5()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4296:1: ( rule__MessageField__OptionsAssignment_5 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==58) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4296:2: rule__MessageField__OptionsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__MessageField__OptionsAssignment_5_in_rule__MessageField__Group__5__Impl9081);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4306:1: rule__MessageField__Group__6 : rule__MessageField__Group__6__Impl ;
    public final void rule__MessageField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4310:1: ( rule__MessageField__Group__6__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4311:2: rule__MessageField__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MessageField__Group__6__Impl_in_rule__MessageField__Group__69112);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4317:1: rule__MessageField__Group__6__Impl : ( ';' ) ;
    public final void rule__MessageField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4321:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4322:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4322:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4323:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getSemicolonKeyword_6()); 
            }
            match(input,51,FOLLOW_51_in_rule__MessageField__Group__6__Impl9140); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4350:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4354:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4355:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__09185);
            rule__Group__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__1_in_rule__Group__Group__09188);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4362:1: rule__Group__Group__0__Impl : ( ( rule__Group__ModifierAssignment_0 ) ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4366:1: ( ( ( rule__Group__ModifierAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4367:1: ( ( rule__Group__ModifierAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4367:1: ( ( rule__Group__ModifierAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4368:1: ( rule__Group__ModifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getModifierAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4369:1: ( rule__Group__ModifierAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4369:2: rule__Group__ModifierAssignment_0
            {
            pushFollow(FOLLOW_rule__Group__ModifierAssignment_0_in_rule__Group__Group__0__Impl9215);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4379:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4383:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4384:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__19245);
            rule__Group__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__2_in_rule__Group__Group__19248);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4391:1: rule__Group__Group__1__Impl : ( 'group' ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4395:1: ( ( 'group' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4396:1: ( 'group' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4396:1: ( 'group' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4397:1: 'group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getGroupKeyword_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Group__Group__1__Impl9276); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4410:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4414:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4415:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__29307);
            rule__Group__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__3_in_rule__Group__Group__29310);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4422:1: rule__Group__Group__2__Impl : ( ( rule__Group__NameAssignment_2 ) ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4426:1: ( ( ( rule__Group__NameAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4427:1: ( ( rule__Group__NameAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4427:1: ( ( rule__Group__NameAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4428:1: ( rule__Group__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getNameAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4429:1: ( rule__Group__NameAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4429:2: rule__Group__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl9337);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4439:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4443:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4444:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__39367);
            rule__Group__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__4_in_rule__Group__Group__39370);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4451:1: rule__Group__Group__3__Impl : ( '=' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4455:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4456:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4456:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4457:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getEqualsSignKeyword_3()); 
            }
            match(input,52,FOLLOW_52_in_rule__Group__Group__3__Impl9398); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4470:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4474:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4475:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__49429);
            rule__Group__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__5_in_rule__Group__Group__49432);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4482:1: rule__Group__Group__4__Impl : ( ( rule__Group__IndexAssignment_4 ) ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4486:1: ( ( ( rule__Group__IndexAssignment_4 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4487:1: ( ( rule__Group__IndexAssignment_4 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4487:1: ( ( rule__Group__IndexAssignment_4 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4488:1: ( rule__Group__IndexAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getIndexAssignment_4()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4489:1: ( rule__Group__IndexAssignment_4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4489:2: rule__Group__IndexAssignment_4
            {
            pushFollow(FOLLOW_rule__Group__IndexAssignment_4_in_rule__Group__Group__4__Impl9459);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4499:1: rule__Group__Group__5 : rule__Group__Group__5__Impl rule__Group__Group__6 ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4503:1: ( rule__Group__Group__5__Impl rule__Group__Group__6 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4504:2: rule__Group__Group__5__Impl rule__Group__Group__6
            {
            pushFollow(FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__59489);
            rule__Group__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__6_in_rule__Group__Group__59492);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4511:1: rule__Group__Group__5__Impl : ( '{' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4515:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4516:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4516:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4517:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,54,FOLLOW_54_in_rule__Group__Group__5__Impl9520); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4530:1: rule__Group__Group__6 : rule__Group__Group__6__Impl rule__Group__Group__7 ;
    public final void rule__Group__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4534:1: ( rule__Group__Group__6__Impl rule__Group__Group__7 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4535:2: rule__Group__Group__6__Impl rule__Group__Group__7
            {
            pushFollow(FOLLOW_rule__Group__Group__6__Impl_in_rule__Group__Group__69551);
            rule__Group__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__7_in_rule__Group__Group__69554);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4542:1: rule__Group__Group__6__Impl : ( ( rule__Group__ElementsAssignment_6 )* ) ;
    public final void rule__Group__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4546:1: ( ( ( rule__Group__ElementsAssignment_6 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4547:1: ( ( rule__Group__ElementsAssignment_6 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4547:1: ( ( rule__Group__ElementsAssignment_6 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4548:1: ( rule__Group__ElementsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getElementsAssignment_6()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4549:1: ( rule__Group__ElementsAssignment_6 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=21 && LA32_0<=23)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4549:2: rule__Group__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Group__ElementsAssignment_6_in_rule__Group__Group__6__Impl9581);
            	    rule__Group__ElementsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4559:1: rule__Group__Group__7 : rule__Group__Group__7__Impl ;
    public final void rule__Group__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4563:1: ( rule__Group__Group__7__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4564:2: rule__Group__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Group__Group__7__Impl_in_rule__Group__Group__79612);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4570:1: rule__Group__Group__7__Impl : ( '}' ) ;
    public final void rule__Group__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4574:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4575:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4575:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4576:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,55,FOLLOW_55_in_rule__Group__Group__7__Impl9640); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4605:1: rule__FieldOptions__Group__0 : rule__FieldOptions__Group__0__Impl rule__FieldOptions__Group__1 ;
    public final void rule__FieldOptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4609:1: ( rule__FieldOptions__Group__0__Impl rule__FieldOptions__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4610:2: rule__FieldOptions__Group__0__Impl rule__FieldOptions__Group__1
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__0__Impl_in_rule__FieldOptions__Group__09687);
            rule__FieldOptions__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group__1_in_rule__FieldOptions__Group__09690);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4617:1: rule__FieldOptions__Group__0__Impl : ( '[' ) ;
    public final void rule__FieldOptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4621:1: ( ( '[' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4622:1: ( '[' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4622:1: ( '[' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4623:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,58,FOLLOW_58_in_rule__FieldOptions__Group__0__Impl9718); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4636:1: rule__FieldOptions__Group__1 : rule__FieldOptions__Group__1__Impl rule__FieldOptions__Group__2 ;
    public final void rule__FieldOptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4640:1: ( rule__FieldOptions__Group__1__Impl rule__FieldOptions__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4641:2: rule__FieldOptions__Group__1__Impl rule__FieldOptions__Group__2
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__1__Impl_in_rule__FieldOptions__Group__19749);
            rule__FieldOptions__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group__2_in_rule__FieldOptions__Group__19752);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4648:1: rule__FieldOptions__Group__1__Impl : ( ( rule__FieldOptions__OptionsAssignment_1 ) ) ;
    public final void rule__FieldOptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4652:1: ( ( ( rule__FieldOptions__OptionsAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4653:1: ( ( rule__FieldOptions__OptionsAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4653:1: ( ( rule__FieldOptions__OptionsAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4654:1: ( rule__FieldOptions__OptionsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4655:1: ( rule__FieldOptions__OptionsAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4655:2: rule__FieldOptions__OptionsAssignment_1
            {
            pushFollow(FOLLOW_rule__FieldOptions__OptionsAssignment_1_in_rule__FieldOptions__Group__1__Impl9779);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4665:1: rule__FieldOptions__Group__2 : rule__FieldOptions__Group__2__Impl rule__FieldOptions__Group__3 ;
    public final void rule__FieldOptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4669:1: ( rule__FieldOptions__Group__2__Impl rule__FieldOptions__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4670:2: rule__FieldOptions__Group__2__Impl rule__FieldOptions__Group__3
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__2__Impl_in_rule__FieldOptions__Group__29809);
            rule__FieldOptions__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group__3_in_rule__FieldOptions__Group__29812);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4677:1: rule__FieldOptions__Group__2__Impl : ( ( rule__FieldOptions__Group_2__0 )* ) ;
    public final void rule__FieldOptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4681:1: ( ( ( rule__FieldOptions__Group_2__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4682:1: ( ( rule__FieldOptions__Group_2__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4682:1: ( ( rule__FieldOptions__Group_2__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4683:1: ( rule__FieldOptions__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getGroup_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4684:1: ( rule__FieldOptions__Group_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==57) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4684:2: rule__FieldOptions__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FieldOptions__Group_2__0_in_rule__FieldOptions__Group__2__Impl9839);
            	    rule__FieldOptions__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4694:1: rule__FieldOptions__Group__3 : rule__FieldOptions__Group__3__Impl ;
    public final void rule__FieldOptions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4698:1: ( rule__FieldOptions__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4699:2: rule__FieldOptions__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__3__Impl_in_rule__FieldOptions__Group__39870);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4705:1: rule__FieldOptions__Group__3__Impl : ( ']' ) ;
    public final void rule__FieldOptions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4709:1: ( ( ']' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4710:1: ( ']' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4710:1: ( ']' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4711:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,59,FOLLOW_59_in_rule__FieldOptions__Group__3__Impl9898); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4732:1: rule__FieldOptions__Group_2__0 : rule__FieldOptions__Group_2__0__Impl rule__FieldOptions__Group_2__1 ;
    public final void rule__FieldOptions__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4736:1: ( rule__FieldOptions__Group_2__0__Impl rule__FieldOptions__Group_2__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4737:2: rule__FieldOptions__Group_2__0__Impl rule__FieldOptions__Group_2__1
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group_2__0__Impl_in_rule__FieldOptions__Group_2__09937);
            rule__FieldOptions__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group_2__1_in_rule__FieldOptions__Group_2__09940);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4744:1: rule__FieldOptions__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FieldOptions__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4748:1: ( ( ',' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4749:1: ( ',' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4749:1: ( ',' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4750:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getCommaKeyword_2_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__FieldOptions__Group_2__0__Impl9968); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4763:1: rule__FieldOptions__Group_2__1 : rule__FieldOptions__Group_2__1__Impl ;
    public final void rule__FieldOptions__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4767:1: ( rule__FieldOptions__Group_2__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4768:2: rule__FieldOptions__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group_2__1__Impl_in_rule__FieldOptions__Group_2__19999);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4774:1: rule__FieldOptions__Group_2__1__Impl : ( ( rule__FieldOptions__OptionsAssignment_2_1 ) ) ;
    public final void rule__FieldOptions__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4778:1: ( ( ( rule__FieldOptions__OptionsAssignment_2_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4779:1: ( ( rule__FieldOptions__OptionsAssignment_2_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4779:1: ( ( rule__FieldOptions__OptionsAssignment_2_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4780:1: ( rule__FieldOptions__OptionsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsAssignment_2_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4781:1: ( rule__FieldOptions__OptionsAssignment_2_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4781:2: rule__FieldOptions__OptionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FieldOptions__OptionsAssignment_2_1_in_rule__FieldOptions__Group_2__1__Impl10026);
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


    // $ANTLR start "rule__PackedValueFieldOption__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4795:1: rule__PackedValueFieldOption__Group__0 : rule__PackedValueFieldOption__Group__0__Impl rule__PackedValueFieldOption__Group__1 ;
    public final void rule__PackedValueFieldOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4799:1: ( rule__PackedValueFieldOption__Group__0__Impl rule__PackedValueFieldOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4800:2: rule__PackedValueFieldOption__Group__0__Impl rule__PackedValueFieldOption__Group__1
            {
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__0__Impl_in_rule__PackedValueFieldOption__Group__010060);
            rule__PackedValueFieldOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__1_in_rule__PackedValueFieldOption__Group__010063);
            rule__PackedValueFieldOption__Group__1();

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
    // $ANTLR end "rule__PackedValueFieldOption__Group__0"


    // $ANTLR start "rule__PackedValueFieldOption__Group__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4807:1: rule__PackedValueFieldOption__Group__0__Impl : ( ( 'packed' ) ) ;
    public final void rule__PackedValueFieldOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4811:1: ( ( ( 'packed' ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4812:1: ( ( 'packed' ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4812:1: ( ( 'packed' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4813:1: ( 'packed' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionAccess().getPackedKeyword_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4814:1: ( 'packed' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4815:2: 'packed'
            {
            match(input,48,FOLLOW_48_in_rule__PackedValueFieldOption__Group__0__Impl10092); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackedValueFieldOptionAccess().getPackedKeyword_0()); 
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
    // $ANTLR end "rule__PackedValueFieldOption__Group__0__Impl"


    // $ANTLR start "rule__PackedValueFieldOption__Group__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4826:1: rule__PackedValueFieldOption__Group__1 : rule__PackedValueFieldOption__Group__1__Impl rule__PackedValueFieldOption__Group__2 ;
    public final void rule__PackedValueFieldOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4830:1: ( rule__PackedValueFieldOption__Group__1__Impl rule__PackedValueFieldOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4831:2: rule__PackedValueFieldOption__Group__1__Impl rule__PackedValueFieldOption__Group__2
            {
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__1__Impl_in_rule__PackedValueFieldOption__Group__110124);
            rule__PackedValueFieldOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__2_in_rule__PackedValueFieldOption__Group__110127);
            rule__PackedValueFieldOption__Group__2();

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
    // $ANTLR end "rule__PackedValueFieldOption__Group__1"


    // $ANTLR start "rule__PackedValueFieldOption__Group__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4838:1: rule__PackedValueFieldOption__Group__1__Impl : ( '=' ) ;
    public final void rule__PackedValueFieldOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4842:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4843:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4843:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4844:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,52,FOLLOW_52_in_rule__PackedValueFieldOption__Group__1__Impl10155); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackedValueFieldOptionAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__PackedValueFieldOption__Group__1__Impl"


    // $ANTLR start "rule__PackedValueFieldOption__Group__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4857:1: rule__PackedValueFieldOption__Group__2 : rule__PackedValueFieldOption__Group__2__Impl ;
    public final void rule__PackedValueFieldOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4861:1: ( rule__PackedValueFieldOption__Group__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4862:2: rule__PackedValueFieldOption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__2__Impl_in_rule__PackedValueFieldOption__Group__210186);
            rule__PackedValueFieldOption__Group__2__Impl();

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
    // $ANTLR end "rule__PackedValueFieldOption__Group__2"


    // $ANTLR start "rule__PackedValueFieldOption__Group__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4868:1: rule__PackedValueFieldOption__Group__2__Impl : ( ( rule__PackedValueFieldOption__ValueAssignment_2 ) ) ;
    public final void rule__PackedValueFieldOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4872:1: ( ( ( rule__PackedValueFieldOption__ValueAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4873:1: ( ( rule__PackedValueFieldOption__ValueAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4873:1: ( ( rule__PackedValueFieldOption__ValueAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4874:1: ( rule__PackedValueFieldOption__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionAccess().getValueAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4875:1: ( rule__PackedValueFieldOption__ValueAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4875:2: rule__PackedValueFieldOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__PackedValueFieldOption__ValueAssignment_2_in_rule__PackedValueFieldOption__Group__2__Impl10213);
            rule__PackedValueFieldOption__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackedValueFieldOptionAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__PackedValueFieldOption__Group__2__Impl"


    // $ANTLR start "rule__DefaultValueFieldOption__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4891:1: rule__DefaultValueFieldOption__Group__0 : rule__DefaultValueFieldOption__Group__0__Impl rule__DefaultValueFieldOption__Group__1 ;
    public final void rule__DefaultValueFieldOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4895:1: ( rule__DefaultValueFieldOption__Group__0__Impl rule__DefaultValueFieldOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4896:2: rule__DefaultValueFieldOption__Group__0__Impl rule__DefaultValueFieldOption__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__0__Impl_in_rule__DefaultValueFieldOption__Group__010249);
            rule__DefaultValueFieldOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__1_in_rule__DefaultValueFieldOption__Group__010252);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4903:1: rule__DefaultValueFieldOption__Group__0__Impl : ( ( 'default' ) ) ;
    public final void rule__DefaultValueFieldOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4907:1: ( ( ( 'default' ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4908:1: ( ( 'default' ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4908:1: ( ( 'default' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4909:1: ( 'default' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getDefaultKeyword_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4910:1: ( 'default' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4911:2: 'default'
            {
            match(input,44,FOLLOW_44_in_rule__DefaultValueFieldOption__Group__0__Impl10281); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4922:1: rule__DefaultValueFieldOption__Group__1 : rule__DefaultValueFieldOption__Group__1__Impl rule__DefaultValueFieldOption__Group__2 ;
    public final void rule__DefaultValueFieldOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4926:1: ( rule__DefaultValueFieldOption__Group__1__Impl rule__DefaultValueFieldOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4927:2: rule__DefaultValueFieldOption__Group__1__Impl rule__DefaultValueFieldOption__Group__2
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__1__Impl_in_rule__DefaultValueFieldOption__Group__110313);
            rule__DefaultValueFieldOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__2_in_rule__DefaultValueFieldOption__Group__110316);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4934:1: rule__DefaultValueFieldOption__Group__1__Impl : ( '=' ) ;
    public final void rule__DefaultValueFieldOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4938:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4939:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4939:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4940:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,52,FOLLOW_52_in_rule__DefaultValueFieldOption__Group__1__Impl10344); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4953:1: rule__DefaultValueFieldOption__Group__2 : rule__DefaultValueFieldOption__Group__2__Impl ;
    public final void rule__DefaultValueFieldOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4957:1: ( rule__DefaultValueFieldOption__Group__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4958:2: rule__DefaultValueFieldOption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__2__Impl_in_rule__DefaultValueFieldOption__Group__210375);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4964:1: rule__DefaultValueFieldOption__Group__2__Impl : ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) ) ;
    public final void rule__DefaultValueFieldOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4968:1: ( ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4969:1: ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4969:1: ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4970:1: ( rule__DefaultValueFieldOption__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getValueAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4971:1: ( rule__DefaultValueFieldOption__ValueAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4971:2: rule__DefaultValueFieldOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__ValueAssignment_2_in_rule__DefaultValueFieldOption__Group__2__Impl10402);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4987:1: rule__NativeFieldOption__Group__0 : rule__NativeFieldOption__Group__0__Impl rule__NativeFieldOption__Group__1 ;
    public final void rule__NativeFieldOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4991:1: ( rule__NativeFieldOption__Group__0__Impl rule__NativeFieldOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4992:2: rule__NativeFieldOption__Group__0__Impl rule__NativeFieldOption__Group__1
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__0__Impl_in_rule__NativeFieldOption__Group__010438);
            rule__NativeFieldOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__1_in_rule__NativeFieldOption__Group__010441);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4999:1: rule__NativeFieldOption__Group__0__Impl : ( ( rule__NativeFieldOption__SourceAssignment_0 ) ) ;
    public final void rule__NativeFieldOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5003:1: ( ( ( rule__NativeFieldOption__SourceAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5004:1: ( ( rule__NativeFieldOption__SourceAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5004:1: ( ( rule__NativeFieldOption__SourceAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5005:1: ( rule__NativeFieldOption__SourceAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getSourceAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5006:1: ( rule__NativeFieldOption__SourceAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5006:2: rule__NativeFieldOption__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__SourceAssignment_0_in_rule__NativeFieldOption__Group__0__Impl10468);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5016:1: rule__NativeFieldOption__Group__1 : rule__NativeFieldOption__Group__1__Impl rule__NativeFieldOption__Group__2 ;
    public final void rule__NativeFieldOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5020:1: ( rule__NativeFieldOption__Group__1__Impl rule__NativeFieldOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5021:2: rule__NativeFieldOption__Group__1__Impl rule__NativeFieldOption__Group__2
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__1__Impl_in_rule__NativeFieldOption__Group__110498);
            rule__NativeFieldOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__2_in_rule__NativeFieldOption__Group__110501);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5028:1: rule__NativeFieldOption__Group__1__Impl : ( '=' ) ;
    public final void rule__NativeFieldOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5032:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5033:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5033:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5034:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,52,FOLLOW_52_in_rule__NativeFieldOption__Group__1__Impl10529); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5047:1: rule__NativeFieldOption__Group__2 : rule__NativeFieldOption__Group__2__Impl ;
    public final void rule__NativeFieldOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5051:1: ( rule__NativeFieldOption__Group__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5052:2: rule__NativeFieldOption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__2__Impl_in_rule__NativeFieldOption__Group__210560);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5058:1: rule__NativeFieldOption__Group__2__Impl : ( ( rule__NativeFieldOption__ValueAssignment_2 ) ) ;
    public final void rule__NativeFieldOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5062:1: ( ( ( rule__NativeFieldOption__ValueAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5063:1: ( ( rule__NativeFieldOption__ValueAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5063:1: ( ( rule__NativeFieldOption__ValueAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5064:1: ( rule__NativeFieldOption__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getValueAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5065:1: ( rule__NativeFieldOption__ValueAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5065:2: rule__NativeFieldOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__ValueAssignment_2_in_rule__NativeFieldOption__Group__2__Impl10587);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5081:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5085:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5086:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__010623);
            rule__Enum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__010626);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5093:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5097:1: ( ( 'enum' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5098:1: ( 'enum' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5098:1: ( 'enum' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5099:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Enum__Group__0__Impl10654); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5112:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5116:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5117:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__110685);
            rule__Enum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__110688);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5124:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5128:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5129:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5129:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5130:1: ( rule__Enum__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5131:1: ( rule__Enum__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5131:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl10715);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5141:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5145:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5146:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__210745);
            rule__Enum__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__210748);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5153:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5157:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5158:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5158:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5159:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__Enum__Group__2__Impl10776); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5172:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5176:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5177:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__310807);
            rule__Enum__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__310810);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5184:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__ElementsAssignment_3 )* ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5188:1: ( ( ( rule__Enum__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5189:1: ( ( rule__Enum__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5189:1: ( ( rule__Enum__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5190:1: ( rule__Enum__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5191:1: ( rule__Enum__ElementsAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||LA34_0==17) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5191:2: rule__Enum__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enum__ElementsAssignment_3_in_rule__Enum__Group__3__Impl10837);
            	    rule__Enum__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5201:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5205:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5206:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__410868);
            rule__Enum__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__410871);
            rule__Enum__Group__5();

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5213:1: rule__Enum__Group__4__Impl : ( '}' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5217:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5218:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5218:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5219:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,55,FOLLOW_55_in_rule__Enum__Group__4__Impl10899); if (state.failed) return ;
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


    // $ANTLR start "rule__Enum__Group__5"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5232:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5236:1: ( rule__Enum__Group__5__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5237:2: rule__Enum__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__510930);
            rule__Enum__Group__5__Impl();

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
    // $ANTLR end "rule__Enum__Group__5"


    // $ANTLR start "rule__Enum__Group__5__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5243:1: rule__Enum__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5247:1: ( ( ( ';' )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5248:1: ( ( ';' )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5248:1: ( ( ';' )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5249:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getSemicolonKeyword_5()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5250:1: ( ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5251:2: ';'
                    {
                    match(input,51,FOLLOW_51_in_rule__Enum__Group__5__Impl10959); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__Enum__Group__5__Impl"


    // $ANTLR start "rule__EnumField__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5274:1: rule__EnumField__Group__0 : rule__EnumField__Group__0__Impl rule__EnumField__Group__1 ;
    public final void rule__EnumField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5278:1: ( rule__EnumField__Group__0__Impl rule__EnumField__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5279:2: rule__EnumField__Group__0__Impl rule__EnumField__Group__1
            {
            pushFollow(FOLLOW_rule__EnumField__Group__0__Impl_in_rule__EnumField__Group__011004);
            rule__EnumField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__1_in_rule__EnumField__Group__011007);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5286:1: rule__EnumField__Group__0__Impl : ( ( rule__EnumField__NameAssignment_0 ) ) ;
    public final void rule__EnumField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5290:1: ( ( ( rule__EnumField__NameAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5291:1: ( ( rule__EnumField__NameAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5291:1: ( ( rule__EnumField__NameAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5292:1: ( rule__EnumField__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getNameAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5293:1: ( rule__EnumField__NameAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5293:2: rule__EnumField__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumField__NameAssignment_0_in_rule__EnumField__Group__0__Impl11034);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5303:1: rule__EnumField__Group__1 : rule__EnumField__Group__1__Impl rule__EnumField__Group__2 ;
    public final void rule__EnumField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5307:1: ( rule__EnumField__Group__1__Impl rule__EnumField__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5308:2: rule__EnumField__Group__1__Impl rule__EnumField__Group__2
            {
            pushFollow(FOLLOW_rule__EnumField__Group__1__Impl_in_rule__EnumField__Group__111064);
            rule__EnumField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__2_in_rule__EnumField__Group__111067);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5315:1: rule__EnumField__Group__1__Impl : ( '=' ) ;
    public final void rule__EnumField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5319:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5320:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5320:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5321:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,52,FOLLOW_52_in_rule__EnumField__Group__1__Impl11095); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5334:1: rule__EnumField__Group__2 : rule__EnumField__Group__2__Impl rule__EnumField__Group__3 ;
    public final void rule__EnumField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5338:1: ( rule__EnumField__Group__2__Impl rule__EnumField__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5339:2: rule__EnumField__Group__2__Impl rule__EnumField__Group__3
            {
            pushFollow(FOLLOW_rule__EnumField__Group__2__Impl_in_rule__EnumField__Group__211126);
            rule__EnumField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__3_in_rule__EnumField__Group__211129);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5346:1: rule__EnumField__Group__2__Impl : ( ( rule__EnumField__IndexAssignment_2 ) ) ;
    public final void rule__EnumField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5350:1: ( ( ( rule__EnumField__IndexAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5351:1: ( ( rule__EnumField__IndexAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5351:1: ( ( rule__EnumField__IndexAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5352:1: ( rule__EnumField__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getIndexAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5353:1: ( rule__EnumField__IndexAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5353:2: rule__EnumField__IndexAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumField__IndexAssignment_2_in_rule__EnumField__Group__2__Impl11156);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5363:1: rule__EnumField__Group__3 : rule__EnumField__Group__3__Impl rule__EnumField__Group__4 ;
    public final void rule__EnumField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5367:1: ( rule__EnumField__Group__3__Impl rule__EnumField__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5368:2: rule__EnumField__Group__3__Impl rule__EnumField__Group__4
            {
            pushFollow(FOLLOW_rule__EnumField__Group__3__Impl_in_rule__EnumField__Group__311186);
            rule__EnumField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__4_in_rule__EnumField__Group__311189);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5375:1: rule__EnumField__Group__3__Impl : ( ( rule__EnumField__Group_3__0 )? ) ;
    public final void rule__EnumField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5379:1: ( ( ( rule__EnumField__Group_3__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5380:1: ( ( rule__EnumField__Group_3__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5380:1: ( ( rule__EnumField__Group_3__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5381:1: ( rule__EnumField__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getGroup_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5382:1: ( rule__EnumField__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==58) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5382:2: rule__EnumField__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumField__Group_3__0_in_rule__EnumField__Group__3__Impl11216);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5392:1: rule__EnumField__Group__4 : rule__EnumField__Group__4__Impl ;
    public final void rule__EnumField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5396:1: ( rule__EnumField__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5397:2: rule__EnumField__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumField__Group__4__Impl_in_rule__EnumField__Group__411247);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5403:1: rule__EnumField__Group__4__Impl : ( ';' ) ;
    public final void rule__EnumField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5407:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5408:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5408:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5409:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getSemicolonKeyword_4()); 
            }
            match(input,51,FOLLOW_51_in_rule__EnumField__Group__4__Impl11275); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5432:1: rule__EnumField__Group_3__0 : rule__EnumField__Group_3__0__Impl rule__EnumField__Group_3__1 ;
    public final void rule__EnumField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5436:1: ( rule__EnumField__Group_3__0__Impl rule__EnumField__Group_3__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5437:2: rule__EnumField__Group_3__0__Impl rule__EnumField__Group_3__1
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__0__Impl_in_rule__EnumField__Group_3__011316);
            rule__EnumField__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3__1_in_rule__EnumField__Group_3__011319);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5444:1: rule__EnumField__Group_3__0__Impl : ( '[' ) ;
    public final void rule__EnumField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5448:1: ( ( '[' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5449:1: ( '[' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5449:1: ( '[' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5450:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getLeftSquareBracketKeyword_3_0()); 
            }
            match(input,58,FOLLOW_58_in_rule__EnumField__Group_3__0__Impl11347); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5463:1: rule__EnumField__Group_3__1 : rule__EnumField__Group_3__1__Impl rule__EnumField__Group_3__2 ;
    public final void rule__EnumField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5467:1: ( rule__EnumField__Group_3__1__Impl rule__EnumField__Group_3__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5468:2: rule__EnumField__Group_3__1__Impl rule__EnumField__Group_3__2
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__1__Impl_in_rule__EnumField__Group_3__111378);
            rule__EnumField__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3__2_in_rule__EnumField__Group_3__111381);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5475:1: rule__EnumField__Group_3__1__Impl : ( ( rule__EnumField__OptionsAssignment_3_1 ) ) ;
    public final void rule__EnumField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5479:1: ( ( ( rule__EnumField__OptionsAssignment_3_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5480:1: ( ( rule__EnumField__OptionsAssignment_3_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5480:1: ( ( rule__EnumField__OptionsAssignment_3_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5481:1: ( rule__EnumField__OptionsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsAssignment_3_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5482:1: ( rule__EnumField__OptionsAssignment_3_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5482:2: rule__EnumField__OptionsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumField__OptionsAssignment_3_1_in_rule__EnumField__Group_3__1__Impl11408);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5492:1: rule__EnumField__Group_3__2 : rule__EnumField__Group_3__2__Impl rule__EnumField__Group_3__3 ;
    public final void rule__EnumField__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5496:1: ( rule__EnumField__Group_3__2__Impl rule__EnumField__Group_3__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5497:2: rule__EnumField__Group_3__2__Impl rule__EnumField__Group_3__3
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__2__Impl_in_rule__EnumField__Group_3__211438);
            rule__EnumField__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3__3_in_rule__EnumField__Group_3__211441);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5504:1: rule__EnumField__Group_3__2__Impl : ( ( rule__EnumField__Group_3_2__0 )* ) ;
    public final void rule__EnumField__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5508:1: ( ( ( rule__EnumField__Group_3_2__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5509:1: ( ( rule__EnumField__Group_3_2__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5509:1: ( ( rule__EnumField__Group_3_2__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5510:1: ( rule__EnumField__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getGroup_3_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5511:1: ( rule__EnumField__Group_3_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==57) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5511:2: rule__EnumField__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumField__Group_3_2__0_in_rule__EnumField__Group_3__2__Impl11468);
            	    rule__EnumField__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5521:1: rule__EnumField__Group_3__3 : rule__EnumField__Group_3__3__Impl ;
    public final void rule__EnumField__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5525:1: ( rule__EnumField__Group_3__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5526:2: rule__EnumField__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__3__Impl_in_rule__EnumField__Group_3__311499);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5532:1: rule__EnumField__Group_3__3__Impl : ( ']' ) ;
    public final void rule__EnumField__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5536:1: ( ( ']' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5537:1: ( ']' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5537:1: ( ']' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5538:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getRightSquareBracketKeyword_3_3()); 
            }
            match(input,59,FOLLOW_59_in_rule__EnumField__Group_3__3__Impl11527); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5559:1: rule__EnumField__Group_3_2__0 : rule__EnumField__Group_3_2__0__Impl rule__EnumField__Group_3_2__1 ;
    public final void rule__EnumField__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5563:1: ( rule__EnumField__Group_3_2__0__Impl rule__EnumField__Group_3_2__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5564:2: rule__EnumField__Group_3_2__0__Impl rule__EnumField__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3_2__0__Impl_in_rule__EnumField__Group_3_2__011566);
            rule__EnumField__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3_2__1_in_rule__EnumField__Group_3_2__011569);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5571:1: rule__EnumField__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__EnumField__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5575:1: ( ( ',' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5576:1: ( ',' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5576:1: ( ',' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5577:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__EnumField__Group_3_2__0__Impl11597); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5590:1: rule__EnumField__Group_3_2__1 : rule__EnumField__Group_3_2__1__Impl ;
    public final void rule__EnumField__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5594:1: ( rule__EnumField__Group_3_2__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5595:2: rule__EnumField__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3_2__1__Impl_in_rule__EnumField__Group_3_2__111628);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5601:1: rule__EnumField__Group_3_2__1__Impl : ( ( rule__EnumField__OptionsAssignment_3_2_1 ) ) ;
    public final void rule__EnumField__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5605:1: ( ( ( rule__EnumField__OptionsAssignment_3_2_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5606:1: ( ( rule__EnumField__OptionsAssignment_3_2_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5606:1: ( ( rule__EnumField__OptionsAssignment_3_2_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5607:1: ( rule__EnumField__OptionsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsAssignment_3_2_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5608:1: ( rule__EnumField__OptionsAssignment_3_2_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5608:2: rule__EnumField__OptionsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__EnumField__OptionsAssignment_3_2_1_in_rule__EnumField__Group_3_2__1__Impl11655);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5622:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5626:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5627:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__011689);
            rule__Service__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__011692);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5634:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5638:1: ( ( 'service' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5639:1: ( 'service' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5639:1: ( 'service' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5640:1: 'service'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Service__Group__0__Impl11720); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5653:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5657:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5658:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__111751);
            rule__Service__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__111754);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5665:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5669:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5670:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5670:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5671:1: ( rule__Service__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5672:1: ( rule__Service__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5672:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl11781);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5682:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5686:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5687:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__211811);
            rule__Service__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__211814);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5694:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5698:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5699:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5699:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5700:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__Service__Group__2__Impl11842); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5713:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5717:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5718:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__311873);
            rule__Service__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__311876);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5725:1: rule__Service__Group__3__Impl : ( ( rule__Service__ElementsAssignment_3 )* ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5729:1: ( ( ( rule__Service__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5730:1: ( ( rule__Service__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5730:1: ( ( rule__Service__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5731:1: ( rule__Service__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5732:1: ( rule__Service__ElementsAssignment_3 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==17||LA38_0==27) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5732:2: rule__Service__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Service__ElementsAssignment_3_in_rule__Service__Group__3__Impl11903);
            	    rule__Service__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getElementsAssignment_3()); 
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5742:1: rule__Service__Group__4 : rule__Service__Group__4__Impl ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5746:1: ( rule__Service__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5747:2: rule__Service__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__411934);
            rule__Service__Group__4__Impl();

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5753:1: rule__Service__Group__4__Impl : ( '}' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5757:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5758:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5758:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5759:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,55,FOLLOW_55_in_rule__Service__Group__4__Impl11962); if (state.failed) return ;
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


    // $ANTLR start "rule__Rpc__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5782:1: rule__Rpc__Group__0 : rule__Rpc__Group__0__Impl rule__Rpc__Group__1 ;
    public final void rule__Rpc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5786:1: ( rule__Rpc__Group__0__Impl rule__Rpc__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5787:2: rule__Rpc__Group__0__Impl rule__Rpc__Group__1
            {
            pushFollow(FOLLOW_rule__Rpc__Group__0__Impl_in_rule__Rpc__Group__012003);
            rule__Rpc__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__1_in_rule__Rpc__Group__012006);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5794:1: rule__Rpc__Group__0__Impl : ( ( 'rpc' ) ) ;
    public final void rule__Rpc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5798:1: ( ( ( 'rpc' ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5799:1: ( ( 'rpc' ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5799:1: ( ( 'rpc' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5800:1: ( 'rpc' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRpcKeyword_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5801:1: ( 'rpc' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5802:2: 'rpc'
            {
            match(input,27,FOLLOW_27_in_rule__Rpc__Group__0__Impl12035); if (state.failed) return ;

            }

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5813:1: rule__Rpc__Group__1 : rule__Rpc__Group__1__Impl rule__Rpc__Group__2 ;
    public final void rule__Rpc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5817:1: ( rule__Rpc__Group__1__Impl rule__Rpc__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5818:2: rule__Rpc__Group__1__Impl rule__Rpc__Group__2
            {
            pushFollow(FOLLOW_rule__Rpc__Group__1__Impl_in_rule__Rpc__Group__112067);
            rule__Rpc__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__2_in_rule__Rpc__Group__112070);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5825:1: rule__Rpc__Group__1__Impl : ( ( rule__Rpc__NameAssignment_1 ) ) ;
    public final void rule__Rpc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5829:1: ( ( ( rule__Rpc__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5830:1: ( ( rule__Rpc__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5830:1: ( ( rule__Rpc__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5831:1: ( rule__Rpc__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5832:1: ( rule__Rpc__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5832:2: rule__Rpc__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rpc__NameAssignment_1_in_rule__Rpc__Group__1__Impl12097);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5842:1: rule__Rpc__Group__2 : rule__Rpc__Group__2__Impl rule__Rpc__Group__3 ;
    public final void rule__Rpc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5846:1: ( rule__Rpc__Group__2__Impl rule__Rpc__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5847:2: rule__Rpc__Group__2__Impl rule__Rpc__Group__3
            {
            pushFollow(FOLLOW_rule__Rpc__Group__2__Impl_in_rule__Rpc__Group__212127);
            rule__Rpc__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__3_in_rule__Rpc__Group__212130);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5854:1: rule__Rpc__Group__2__Impl : ( '(' ) ;
    public final void rule__Rpc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5858:1: ( ( '(' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5859:1: ( '(' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5859:1: ( '(' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5860:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,60,FOLLOW_60_in_rule__Rpc__Group__2__Impl12158); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5873:1: rule__Rpc__Group__3 : rule__Rpc__Group__3__Impl rule__Rpc__Group__4 ;
    public final void rule__Rpc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5877:1: ( rule__Rpc__Group__3__Impl rule__Rpc__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5878:2: rule__Rpc__Group__3__Impl rule__Rpc__Group__4
            {
            pushFollow(FOLLOW_rule__Rpc__Group__3__Impl_in_rule__Rpc__Group__312189);
            rule__Rpc__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__4_in_rule__Rpc__Group__312192);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5885:1: rule__Rpc__Group__3__Impl : ( ( rule__Rpc__ArgTypeAssignment_3 ) ) ;
    public final void rule__Rpc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5889:1: ( ( ( rule__Rpc__ArgTypeAssignment_3 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5890:1: ( ( rule__Rpc__ArgTypeAssignment_3 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5890:1: ( ( rule__Rpc__ArgTypeAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5891:1: ( rule__Rpc__ArgTypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getArgTypeAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5892:1: ( rule__Rpc__ArgTypeAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5892:2: rule__Rpc__ArgTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Rpc__ArgTypeAssignment_3_in_rule__Rpc__Group__3__Impl12219);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5902:1: rule__Rpc__Group__4 : rule__Rpc__Group__4__Impl rule__Rpc__Group__5 ;
    public final void rule__Rpc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5906:1: ( rule__Rpc__Group__4__Impl rule__Rpc__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5907:2: rule__Rpc__Group__4__Impl rule__Rpc__Group__5
            {
            pushFollow(FOLLOW_rule__Rpc__Group__4__Impl_in_rule__Rpc__Group__412249);
            rule__Rpc__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__5_in_rule__Rpc__Group__412252);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5914:1: rule__Rpc__Group__4__Impl : ( ')' ) ;
    public final void rule__Rpc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5918:1: ( ( ')' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5919:1: ( ')' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5919:1: ( ')' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5920:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,61,FOLLOW_61_in_rule__Rpc__Group__4__Impl12280); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5933:1: rule__Rpc__Group__5 : rule__Rpc__Group__5__Impl rule__Rpc__Group__6 ;
    public final void rule__Rpc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5937:1: ( rule__Rpc__Group__5__Impl rule__Rpc__Group__6 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5938:2: rule__Rpc__Group__5__Impl rule__Rpc__Group__6
            {
            pushFollow(FOLLOW_rule__Rpc__Group__5__Impl_in_rule__Rpc__Group__512311);
            rule__Rpc__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__6_in_rule__Rpc__Group__512314);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5945:1: rule__Rpc__Group__5__Impl : ( 'returns' ) ;
    public final void rule__Rpc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5949:1: ( ( 'returns' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5950:1: ( 'returns' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5950:1: ( 'returns' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5951:1: 'returns'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getReturnsKeyword_5()); 
            }
            match(input,28,FOLLOW_28_in_rule__Rpc__Group__5__Impl12342); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5964:1: rule__Rpc__Group__6 : rule__Rpc__Group__6__Impl rule__Rpc__Group__7 ;
    public final void rule__Rpc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5968:1: ( rule__Rpc__Group__6__Impl rule__Rpc__Group__7 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5969:2: rule__Rpc__Group__6__Impl rule__Rpc__Group__7
            {
            pushFollow(FOLLOW_rule__Rpc__Group__6__Impl_in_rule__Rpc__Group__612373);
            rule__Rpc__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__7_in_rule__Rpc__Group__612376);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5976:1: rule__Rpc__Group__6__Impl : ( '(' ) ;
    public final void rule__Rpc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5980:1: ( ( '(' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5981:1: ( '(' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5981:1: ( '(' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5982:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getLeftParenthesisKeyword_6()); 
            }
            match(input,60,FOLLOW_60_in_rule__Rpc__Group__6__Impl12404); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5995:1: rule__Rpc__Group__7 : rule__Rpc__Group__7__Impl rule__Rpc__Group__8 ;
    public final void rule__Rpc__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5999:1: ( rule__Rpc__Group__7__Impl rule__Rpc__Group__8 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6000:2: rule__Rpc__Group__7__Impl rule__Rpc__Group__8
            {
            pushFollow(FOLLOW_rule__Rpc__Group__7__Impl_in_rule__Rpc__Group__712435);
            rule__Rpc__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__8_in_rule__Rpc__Group__712438);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6007:1: rule__Rpc__Group__7__Impl : ( ( rule__Rpc__ReturnTypeAssignment_7 ) ) ;
    public final void rule__Rpc__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6011:1: ( ( ( rule__Rpc__ReturnTypeAssignment_7 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6012:1: ( ( rule__Rpc__ReturnTypeAssignment_7 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6012:1: ( ( rule__Rpc__ReturnTypeAssignment_7 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6013:1: ( rule__Rpc__ReturnTypeAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getReturnTypeAssignment_7()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6014:1: ( rule__Rpc__ReturnTypeAssignment_7 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6014:2: rule__Rpc__ReturnTypeAssignment_7
            {
            pushFollow(FOLLOW_rule__Rpc__ReturnTypeAssignment_7_in_rule__Rpc__Group__7__Impl12465);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6024:1: rule__Rpc__Group__8 : rule__Rpc__Group__8__Impl rule__Rpc__Group__9 ;
    public final void rule__Rpc__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6028:1: ( rule__Rpc__Group__8__Impl rule__Rpc__Group__9 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6029:2: rule__Rpc__Group__8__Impl rule__Rpc__Group__9
            {
            pushFollow(FOLLOW_rule__Rpc__Group__8__Impl_in_rule__Rpc__Group__812495);
            rule__Rpc__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__9_in_rule__Rpc__Group__812498);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6036:1: rule__Rpc__Group__8__Impl : ( ')' ) ;
    public final void rule__Rpc__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6040:1: ( ( ')' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6041:1: ( ')' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6041:1: ( ')' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6042:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,61,FOLLOW_61_in_rule__Rpc__Group__8__Impl12526); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6055:1: rule__Rpc__Group__9 : rule__Rpc__Group__9__Impl rule__Rpc__Group__10 ;
    public final void rule__Rpc__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6059:1: ( rule__Rpc__Group__9__Impl rule__Rpc__Group__10 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6060:2: rule__Rpc__Group__9__Impl rule__Rpc__Group__10
            {
            pushFollow(FOLLOW_rule__Rpc__Group__9__Impl_in_rule__Rpc__Group__912557);
            rule__Rpc__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__10_in_rule__Rpc__Group__912560);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6067:1: rule__Rpc__Group__9__Impl : ( ( rule__Rpc__Group_9__0 )? ) ;
    public final void rule__Rpc__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6071:1: ( ( ( rule__Rpc__Group_9__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6072:1: ( ( rule__Rpc__Group_9__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6072:1: ( ( rule__Rpc__Group_9__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6073:1: ( rule__Rpc__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getGroup_9()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6074:1: ( rule__Rpc__Group_9__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6074:2: rule__Rpc__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Rpc__Group_9__0_in_rule__Rpc__Group__9__Impl12587);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6084:1: rule__Rpc__Group__10 : rule__Rpc__Group__10__Impl ;
    public final void rule__Rpc__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6088:1: ( rule__Rpc__Group__10__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6089:2: rule__Rpc__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Rpc__Group__10__Impl_in_rule__Rpc__Group__1012618);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6095:1: rule__Rpc__Group__10__Impl : ( ';' ) ;
    public final void rule__Rpc__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6099:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6100:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6100:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6101:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getSemicolonKeyword_10()); 
            }
            match(input,51,FOLLOW_51_in_rule__Rpc__Group__10__Impl12646); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getSemicolonKeyword_10()); 
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6136:1: rule__Rpc__Group_9__0 : rule__Rpc__Group_9__0__Impl rule__Rpc__Group_9__1 ;
    public final void rule__Rpc__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6140:1: ( rule__Rpc__Group_9__0__Impl rule__Rpc__Group_9__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6141:2: rule__Rpc__Group_9__0__Impl rule__Rpc__Group_9__1
            {
            pushFollow(FOLLOW_rule__Rpc__Group_9__0__Impl_in_rule__Rpc__Group_9__012699);
            rule__Rpc__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group_9__1_in_rule__Rpc__Group_9__012702);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6148:1: rule__Rpc__Group_9__0__Impl : ( '{' ) ;
    public final void rule__Rpc__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6152:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6153:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6153:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6154:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getLeftCurlyBracketKeyword_9_0()); 
            }
            match(input,54,FOLLOW_54_in_rule__Rpc__Group_9__0__Impl12730); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6167:1: rule__Rpc__Group_9__1 : rule__Rpc__Group_9__1__Impl rule__Rpc__Group_9__2 ;
    public final void rule__Rpc__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6171:1: ( rule__Rpc__Group_9__1__Impl rule__Rpc__Group_9__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6172:2: rule__Rpc__Group_9__1__Impl rule__Rpc__Group_9__2
            {
            pushFollow(FOLLOW_rule__Rpc__Group_9__1__Impl_in_rule__Rpc__Group_9__112761);
            rule__Rpc__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group_9__2_in_rule__Rpc__Group_9__112764);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6179:1: rule__Rpc__Group_9__1__Impl : ( ( rule__Rpc__OptionsAssignment_9_1 )* ) ;
    public final void rule__Rpc__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6183:1: ( ( ( rule__Rpc__OptionsAssignment_9_1 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6184:1: ( ( rule__Rpc__OptionsAssignment_9_1 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6184:1: ( ( rule__Rpc__OptionsAssignment_9_1 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6185:1: ( rule__Rpc__OptionsAssignment_9_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getOptionsAssignment_9_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6186:1: ( rule__Rpc__OptionsAssignment_9_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==17) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6186:2: rule__Rpc__OptionsAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_rule__Rpc__OptionsAssignment_9_1_in_rule__Rpc__Group_9__1__Impl12791);
            	    rule__Rpc__OptionsAssignment_9_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6196:1: rule__Rpc__Group_9__2 : rule__Rpc__Group_9__2__Impl ;
    public final void rule__Rpc__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6200:1: ( rule__Rpc__Group_9__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6201:2: rule__Rpc__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Rpc__Group_9__2__Impl_in_rule__Rpc__Group_9__212822);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6207:1: rule__Rpc__Group_9__2__Impl : ( '}' ) ;
    public final void rule__Rpc__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6211:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6212:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6212:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6213:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRightCurlyBracketKeyword_9_2()); 
            }
            match(input,55,FOLLOW_55_in_rule__Rpc__Group_9__2__Impl12850); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6232:1: rule__Extend__Group__0 : rule__Extend__Group__0__Impl rule__Extend__Group__1 ;
    public final void rule__Extend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6236:1: ( rule__Extend__Group__0__Impl rule__Extend__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6237:2: rule__Extend__Group__0__Impl rule__Extend__Group__1
            {
            pushFollow(FOLLOW_rule__Extend__Group__0__Impl_in_rule__Extend__Group__012887);
            rule__Extend__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__1_in_rule__Extend__Group__012890);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6244:1: rule__Extend__Group__0__Impl : ( ( 'extend' ) ) ;
    public final void rule__Extend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6248:1: ( ( ( 'extend' ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6249:1: ( ( 'extend' ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6249:1: ( ( 'extend' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6250:1: ( 'extend' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getExtendKeyword_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6251:1: ( 'extend' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6252:2: 'extend'
            {
            match(input,25,FOLLOW_25_in_rule__Extend__Group__0__Impl12919); if (state.failed) return ;

            }

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6263:1: rule__Extend__Group__1 : rule__Extend__Group__1__Impl rule__Extend__Group__2 ;
    public final void rule__Extend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6267:1: ( rule__Extend__Group__1__Impl rule__Extend__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6268:2: rule__Extend__Group__1__Impl rule__Extend__Group__2
            {
            pushFollow(FOLLOW_rule__Extend__Group__1__Impl_in_rule__Extend__Group__112951);
            rule__Extend__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__2_in_rule__Extend__Group__112954);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6275:1: rule__Extend__Group__1__Impl : ( ( rule__Extend__TypeAssignment_1 ) ) ;
    public final void rule__Extend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6279:1: ( ( ( rule__Extend__TypeAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6280:1: ( ( rule__Extend__TypeAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6280:1: ( ( rule__Extend__TypeAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6281:1: ( rule__Extend__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getTypeAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6282:1: ( rule__Extend__TypeAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6282:2: rule__Extend__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Extend__TypeAssignment_1_in_rule__Extend__Group__1__Impl12981);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6292:1: rule__Extend__Group__2 : rule__Extend__Group__2__Impl rule__Extend__Group__3 ;
    public final void rule__Extend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6296:1: ( rule__Extend__Group__2__Impl rule__Extend__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6297:2: rule__Extend__Group__2__Impl rule__Extend__Group__3
            {
            pushFollow(FOLLOW_rule__Extend__Group__2__Impl_in_rule__Extend__Group__213011);
            rule__Extend__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__3_in_rule__Extend__Group__213014);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6304:1: rule__Extend__Group__2__Impl : ( '{' ) ;
    public final void rule__Extend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6308:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6309:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6309:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6310:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__Extend__Group__2__Impl13042); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6323:1: rule__Extend__Group__3 : rule__Extend__Group__3__Impl rule__Extend__Group__4 ;
    public final void rule__Extend__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6327:1: ( rule__Extend__Group__3__Impl rule__Extend__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6328:2: rule__Extend__Group__3__Impl rule__Extend__Group__4
            {
            pushFollow(FOLLOW_rule__Extend__Group__3__Impl_in_rule__Extend__Group__313073);
            rule__Extend__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__4_in_rule__Extend__Group__313076);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6335:1: rule__Extend__Group__3__Impl : ( ( rule__Extend__ElementsAssignment_3 )* ) ;
    public final void rule__Extend__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6339:1: ( ( ( rule__Extend__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6340:1: ( ( rule__Extend__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6340:1: ( ( rule__Extend__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6341:1: ( rule__Extend__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6342:1: ( rule__Extend__ElementsAssignment_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=17 && LA41_0<=25)||LA41_0==56) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6342:2: rule__Extend__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Extend__ElementsAssignment_3_in_rule__Extend__Group__3__Impl13103);
            	    rule__Extend__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6352:1: rule__Extend__Group__4 : rule__Extend__Group__4__Impl ;
    public final void rule__Extend__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6356:1: ( rule__Extend__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6357:2: rule__Extend__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Extend__Group__4__Impl_in_rule__Extend__Group__413134);
            rule__Extend__Group__4__Impl();

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6363:1: rule__Extend__Group__4__Impl : ( '}' ) ;
    public final void rule__Extend__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6367:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6368:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6368:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6369:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,55,FOLLOW_55_in_rule__Extend__Group__4__Impl13162); if (state.failed) return ;
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


    // $ANTLR start "rule__FULL_ID__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6392:1: rule__FULL_ID__Group__0 : rule__FULL_ID__Group__0__Impl rule__FULL_ID__Group__1 ;
    public final void rule__FULL_ID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6396:1: ( rule__FULL_ID__Group__0__Impl rule__FULL_ID__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6397:2: rule__FULL_ID__Group__0__Impl rule__FULL_ID__Group__1
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group__0__Impl_in_rule__FULL_ID__Group__013203);
            rule__FULL_ID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FULL_ID__Group__1_in_rule__FULL_ID__Group__013206);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6404:1: rule__FULL_ID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FULL_ID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6408:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6409:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6409:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6410:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FULL_ID__Group__0__Impl13233); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6421:1: rule__FULL_ID__Group__1 : rule__FULL_ID__Group__1__Impl ;
    public final void rule__FULL_ID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6425:1: ( rule__FULL_ID__Group__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6426:2: rule__FULL_ID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group__1__Impl_in_rule__FULL_ID__Group__113262);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6432:1: rule__FULL_ID__Group__1__Impl : ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) ) ;
    public final void rule__FULL_ID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6436:1: ( ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6437:1: ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6437:1: ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6438:1: ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6438:1: ( ( rule__FULL_ID__Group_1__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6439:1: ( rule__FULL_ID__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getGroup_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6440:1: ( rule__FULL_ID__Group_1__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6440:2: rule__FULL_ID__Group_1__0
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl13291);
            rule__FULL_ID__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFULL_IDAccess().getGroup_1()); 
            }

            }

            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6443:1: ( ( rule__FULL_ID__Group_1__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6444:1: ( rule__FULL_ID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getGroup_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6445:1: ( rule__FULL_ID__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==62) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6445:2: rule__FULL_ID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl13303);
            	    rule__FULL_ID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6460:1: rule__FULL_ID__Group_1__0 : rule__FULL_ID__Group_1__0__Impl rule__FULL_ID__Group_1__1 ;
    public final void rule__FULL_ID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6464:1: ( rule__FULL_ID__Group_1__0__Impl rule__FULL_ID__Group_1__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6465:2: rule__FULL_ID__Group_1__0__Impl rule__FULL_ID__Group_1__1
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__0__Impl_in_rule__FULL_ID__Group_1__013340);
            rule__FULL_ID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__1_in_rule__FULL_ID__Group_1__013343);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6472:1: rule__FULL_ID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FULL_ID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6476:1: ( ( '.' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6477:1: ( '.' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6477:1: ( '.' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6478:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,62,FOLLOW_62_in_rule__FULL_ID__Group_1__0__Impl13371); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6491:1: rule__FULL_ID__Group_1__1 : rule__FULL_ID__Group_1__1__Impl ;
    public final void rule__FULL_ID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6495:1: ( rule__FULL_ID__Group_1__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6496:2: rule__FULL_ID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__1__Impl_in_rule__FULL_ID__Group_1__113402);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6502:1: rule__FULL_ID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FULL_ID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6506:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6507:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6507:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6508:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FULL_ID__Group_1__1__Impl13429); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6525:1: rule__Proto__SyntaxAssignment_0 : ( ruleSyntax ) ;
    public final void rule__Proto__SyntaxAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6529:1: ( ( ruleSyntax ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6530:1: ( ruleSyntax )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6530:1: ( ruleSyntax )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6531:1: ruleSyntax
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getSyntaxSyntaxParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSyntax_in_rule__Proto__SyntaxAssignment_013468);
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


    // $ANTLR start "rule__Proto__ImportsAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6540:1: rule__Proto__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__Proto__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6544:1: ( ( ruleImport ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6545:1: ( ruleImport )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6545:1: ( ruleImport )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6546:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getImportsImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Proto__ImportsAssignment_113499);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getImportsImportParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Proto__ImportsAssignment_1"


    // $ANTLR start "rule__Proto__NameAssignment_2_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6555:1: rule__Proto__NameAssignment_2_1 : ( ruleVar_full ) ;
    public final void rule__Proto__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6559:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6560:1: ( ruleVar_full )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6560:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6561:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getNameVar_fullParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__Proto__NameAssignment_2_113530);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getNameVar_fullParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Proto__NameAssignment_2_1"


    // $ANTLR start "rule__Proto__StatementsAssignment_3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6570:1: rule__Proto__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Proto__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6574:1: ( ( ruleStatement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6575:1: ( ruleStatement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6575:1: ( ruleStatement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6576:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getStatementsStatementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Proto__StatementsAssignment_313561);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getStatementsStatementParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Proto__StatementsAssignment_3"


    // $ANTLR start "rule__Syntax__NameAssignment_2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6585:1: rule__Syntax__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Syntax__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6589:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6590:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6590:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6591:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Syntax__NameAssignment_213592); if (state.failed) return ;
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


    // $ANTLR start "rule__PublicImport__ImportURIAssignment_2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6600:1: rule__PublicImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PublicImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6604:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6605:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6605:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6606:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PublicImport__ImportURIAssignment_213623); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPublicImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__PublicImport__ImportURIAssignment_2"


    // $ANTLR start "rule__WeakImport__ImportURIAssignment_2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6615:1: rule__WeakImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__WeakImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6619:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6620:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6620:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6621:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__WeakImport__ImportURIAssignment_213654); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeakImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__WeakImport__ImportURIAssignment_2"


    // $ANTLR start "rule__NativeOption__SourceAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6630:1: rule__NativeOption__SourceAssignment_1 : ( ( ruleVar_full ) ) ;
    public final void rule__NativeOption__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6634:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6635:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6635:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6636:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getSourceMessageFieldCrossReference_1_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6637:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6638:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getSourceMessageFieldVar_fullParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__NativeOption__SourceAssignment_113689);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeOptionAccess().getSourceMessageFieldVar_fullParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeOptionAccess().getSourceMessageFieldCrossReference_1_0()); 
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
    // $ANTLR end "rule__NativeOption__SourceAssignment_1"


    // $ANTLR start "rule__NativeOption__ValueAssignment_3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6649:1: rule__NativeOption__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__NativeOption__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6653:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6654:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6654:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6655:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getValueValueParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__NativeOption__ValueAssignment_313724);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeOptionAccess().getValueValueParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__NativeOption__ValueAssignment_3"


    // $ANTLR start "rule__CustomOption__SourceAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6664:1: rule__CustomOption__SourceAssignment_1 : ( RULE_ID ) ;
    public final void rule__CustomOption__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6668:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6669:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6669:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6670:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getSourceIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomOption__SourceAssignment_113755); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomOptionAccess().getSourceIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__CustomOption__SourceAssignment_1"


    // $ANTLR start "rule__CustomOption__ValueAssignment_3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6679:1: rule__CustomOption__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__CustomOption__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6683:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6684:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6684:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6685:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getValueValueParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__CustomOption__ValueAssignment_313786);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomOptionAccess().getValueValueParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__CustomOption__ValueAssignment_3"


    // $ANTLR start "rule__CustomIdLink__TargetAssignment"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6694:1: rule__CustomIdLink__TargetAssignment : ( RULE_ID ) ;
    public final void rule__CustomIdLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6698:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6699:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6699:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6700:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomIdLinkAccess().getTargetIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomIdLink__TargetAssignment13817); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomIdLinkAccess().getTargetIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__CustomIdLink__TargetAssignment"


    // $ANTLR start "rule__StringLink__TargetAssignment"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6709:1: rule__StringLink__TargetAssignment : ( RULE_STRING ) ;
    public final void rule__StringLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6713:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6714:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6714:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6715:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLinkAccess().getTargetSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLink__TargetAssignment13848); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6724:1: rule__BooleanLink__TargetAssignment : ( ruleBOOL ) ;
    public final void rule__BooleanLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6728:1: ( ( ruleBOOL ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6729:1: ( ruleBOOL )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6729:1: ( ruleBOOL )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6730:1: ruleBOOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLinkAccess().getTargetBOOLEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_rule__BooleanLink__TargetAssignment13879);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6739:1: rule__IntLink__TargetAssignment : ( RULE_NUMINT ) ;
    public final void rule__IntLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6743:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6744:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6744:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6745:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLinkAccess().getTargetNUMINTTerminalRuleCall_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__IntLink__TargetAssignment13910); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6754:1: rule__DoubleLink__TargetAssignment : ( RULE_NUMDOUBLE ) ;
    public final void rule__DoubleLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6758:1: ( ( RULE_NUMDOUBLE ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6759:1: ( RULE_NUMDOUBLE )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6759:1: ( RULE_NUMDOUBLE )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6760:1: RULE_NUMDOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLinkAccess().getTargetNUMDOUBLETerminalRuleCall_0()); 
            }
            match(input,RULE_NUMDOUBLE,FOLLOW_RULE_NUMDOUBLE_in_rule__DoubleLink__TargetAssignment13941); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6769:1: rule__Message__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6773:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6774:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6774:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6775:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__NameAssignment_113972); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6784:1: rule__Message__ElementsAssignment_3 : ( ruleMessageElement ) ;
    public final void rule__Message__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6788:1: ( ( ruleMessageElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6789:1: ( ruleMessageElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6789:1: ( ruleMessageElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6790:1: ruleMessageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getElementsMessageElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_rule__Message__ElementsAssignment_314003);
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


    // $ANTLR start "rule__Oneof__NameAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6799:1: rule__Oneof__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Oneof__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6803:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6804:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6804:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6805:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Oneof__NameAssignment_114034); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Oneof__NameAssignment_1"


    // $ANTLR start "rule__Oneof__FieldsAssignment_3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6814:1: rule__Oneof__FieldsAssignment_3 : ( ruleOneofField ) ;
    public final void rule__Oneof__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6818:1: ( ( ruleOneofField ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6819:1: ( ruleOneofField )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6819:1: ( ruleOneofField )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6820:1: ruleOneofField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getFieldsOneofFieldParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleOneofField_in_rule__Oneof__FieldsAssignment_314065);
            ruleOneofField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofAccess().getFieldsOneofFieldParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Oneof__FieldsAssignment_3"


    // $ANTLR start "rule__OneofField__TypeAssignment_0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6829:1: rule__OneofField__TypeAssignment_0 : ( ruleTypeLink ) ;
    public final void rule__OneofField__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6833:1: ( ( ruleTypeLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6834:1: ( ruleTypeLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6834:1: ( ruleTypeLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6835:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getTypeTypeLinkParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__OneofField__TypeAssignment_014096);
            ruleTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofFieldAccess().getTypeTypeLinkParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__OneofField__TypeAssignment_0"


    // $ANTLR start "rule__OneofField__NameAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6844:1: rule__OneofField__NameAssignment_1 : ( ruleVar ) ;
    public final void rule__OneofField__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6848:1: ( ( ruleVar ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6849:1: ( ruleVar )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6849:1: ( ruleVar )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6850:1: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getNameVarParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleVar_in_rule__OneofField__NameAssignment_114127);
            ruleVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofFieldAccess().getNameVarParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__OneofField__NameAssignment_1"


    // $ANTLR start "rule__OneofField__IndexAssignment_3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6859:1: rule__OneofField__IndexAssignment_3 : ( RULE_NUMINT ) ;
    public final void rule__OneofField__IndexAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6863:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6864:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6864:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6865:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getIndexNUMINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__OneofField__IndexAssignment_314158); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofFieldAccess().getIndexNUMINTTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__OneofField__IndexAssignment_3"


    // $ANTLR start "rule__OneofField__OptionsAssignment_4"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6874:1: rule__OneofField__OptionsAssignment_4 : ( ruleFieldOptions ) ;
    public final void rule__OneofField__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6878:1: ( ( ruleFieldOptions ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6879:1: ( ruleFieldOptions )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6879:1: ( ruleFieldOptions )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6880:1: ruleFieldOptions
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getOptionsFieldOptionsParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_rule__OneofField__OptionsAssignment_414189);
            ruleFieldOptions();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofFieldAccess().getOptionsFieldOptionsParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__OneofField__OptionsAssignment_4"


    // $ANTLR start "rule__ExtensionRange__RangesAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6889:1: rule__ExtensionRange__RangesAssignment_1 : ( ruleRange ) ;
    public final void rule__ExtensionRange__RangesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6893:1: ( ( ruleRange ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6894:1: ( ruleRange )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6894:1: ( ruleRange )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6895:1: ruleRange
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getRangesRangeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleRange_in_rule__ExtensionRange__RangesAssignment_114220);
            ruleRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeAccess().getRangesRangeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ExtensionRange__RangesAssignment_1"


    // $ANTLR start "rule__ExtensionRange__RangesAssignment_2_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6904:1: rule__ExtensionRange__RangesAssignment_2_1 : ( ruleRange ) ;
    public final void rule__ExtensionRange__RangesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6908:1: ( ( ruleRange ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6909:1: ( ruleRange )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6909:1: ( ruleRange )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6910:1: ruleRange
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getRangesRangeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleRange_in_rule__ExtensionRange__RangesAssignment_2_114251);
            ruleRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeAccess().getRangesRangeParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__ExtensionRange__RangesAssignment_2_1"


    // $ANTLR start "rule__Range__FromAssignment_0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6919:1: rule__Range__FromAssignment_0 : ( RULE_NUMINT ) ;
    public final void rule__Range__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6923:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6924:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6924:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6925:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getFromNUMINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__Range__FromAssignment_014282); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getFromNUMINTTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Range__FromAssignment_0"


    // $ANTLR start "rule__Range__ToAssignment_1_1_0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6934:1: rule__Range__ToAssignment_1_1_0 : ( RULE_NUMINT ) ;
    public final void rule__Range__ToAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6938:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6939:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6939:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6940:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getToNUMINTTerminalRuleCall_1_1_0_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__Range__ToAssignment_1_1_014313); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getToNUMINTTerminalRuleCall_1_1_0_0()); 
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
    // $ANTLR end "rule__Range__ToAssignment_1_1_0"


    // $ANTLR start "rule__Range__MaxAssignment_1_1_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6949:1: rule__Range__MaxAssignment_1_1_1 : ( ( 'max' ) ) ;
    public final void rule__Range__MaxAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6953:1: ( ( ( 'max' ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6954:1: ( ( 'max' ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6954:1: ( ( 'max' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6955:1: ( 'max' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getMaxMaxKeyword_1_1_1_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6956:1: ( 'max' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6957:1: 'max'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getMaxMaxKeyword_1_1_1_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Range__MaxAssignment_1_1_114349); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getMaxMaxKeyword_1_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getMaxMaxKeyword_1_1_1_0()); 
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
    // $ANTLR end "rule__Range__MaxAssignment_1_1_1"


    // $ANTLR start "rule__MessageField__ModifierAssignment_0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6972:1: rule__MessageField__ModifierAssignment_0 : ( ruleModifier ) ;
    public final void rule__MessageField__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6976:1: ( ( ruleModifier ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6977:1: ( ruleModifier )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6977:1: ( ruleModifier )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6978:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getModifierModifierEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__MessageField__ModifierAssignment_014388);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6987:1: rule__MessageField__TypeAssignment_1 : ( ruleTypeLink ) ;
    public final void rule__MessageField__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6991:1: ( ( ruleTypeLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6992:1: ( ruleTypeLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6992:1: ( ruleTypeLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6993:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getTypeTypeLinkParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__MessageField__TypeAssignment_114419);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7002:1: rule__MessageField__NameAssignment_2 : ( ruleVar ) ;
    public final void rule__MessageField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7006:1: ( ( ruleVar ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7007:1: ( ruleVar )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7007:1: ( ruleVar )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7008:1: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getNameVarParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVar_in_rule__MessageField__NameAssignment_214450);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7017:1: rule__MessageField__IndexAssignment_4 : ( RULE_NUMINT ) ;
    public final void rule__MessageField__IndexAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7021:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7022:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7022:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7023:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getIndexNUMINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__MessageField__IndexAssignment_414481); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7032:1: rule__MessageField__OptionsAssignment_5 : ( ruleFieldOptions ) ;
    public final void rule__MessageField__OptionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7036:1: ( ( ruleFieldOptions ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7037:1: ( ruleFieldOptions )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7037:1: ( ruleFieldOptions )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7038:1: ruleFieldOptions
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getOptionsFieldOptionsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_rule__MessageField__OptionsAssignment_514512);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7047:1: rule__Group__ModifierAssignment_0 : ( ruleModifier ) ;
    public final void rule__Group__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7051:1: ( ( ruleModifier ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7052:1: ( ruleModifier )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7052:1: ( ruleModifier )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7053:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getModifierModifierEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Group__ModifierAssignment_014543);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7062:1: rule__Group__NameAssignment_2 : ( ruleVar ) ;
    public final void rule__Group__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7066:1: ( ( ruleVar ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7067:1: ( ruleVar )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7067:1: ( ruleVar )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7068:1: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getNameVarParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVar_in_rule__Group__NameAssignment_214574);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7077:1: rule__Group__IndexAssignment_4 : ( RULE_NUMINT ) ;
    public final void rule__Group__IndexAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7081:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7082:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7082:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7083:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getIndexNUMINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__Group__IndexAssignment_414605); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7092:1: rule__Group__ElementsAssignment_6 : ( ruleMessageField ) ;
    public final void rule__Group__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7096:1: ( ( ruleMessageField ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7097:1: ( ruleMessageField )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7097:1: ( ruleMessageField )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7098:1: ruleMessageField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getElementsMessageFieldParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleMessageField_in_rule__Group__ElementsAssignment_614636);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7107:1: rule__ComplexTypeLink__TargetAssignment : ( ( ruleVar_full ) ) ;
    public final void rule__ComplexTypeLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7111:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7112:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7112:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7113:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeCrossReference_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7114:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7115:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeVar_fullParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__ComplexTypeLink__TargetAssignment14671);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7126:1: rule__ScalarTypeLink__TargetAssignment : ( ruleScalarType ) ;
    public final void rule__ScalarTypeLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7130:1: ( ( ruleScalarType ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7131:1: ( ruleScalarType )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7131:1: ( ruleScalarType )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7132:1: ruleScalarType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeLinkAccess().getTargetScalarTypeEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleScalarType_in_rule__ScalarTypeLink__TargetAssignment14706);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7141:1: rule__FieldOptions__OptionsAssignment_1 : ( ruleFieldOption ) ;
    public final void rule__FieldOptions__OptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7145:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7146:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7146:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7147:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_114737);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7156:1: rule__FieldOptions__OptionsAssignment_2_1 : ( ruleFieldOption ) ;
    public final void rule__FieldOptions__OptionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7160:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7161:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7161:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7162:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_2_114768);
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


    // $ANTLR start "rule__PackedValueFieldOption__ValueAssignment_2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7171:1: rule__PackedValueFieldOption__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__PackedValueFieldOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7175:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7176:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7176:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7177:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__PackedValueFieldOption__ValueAssignment_214799);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackedValueFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__PackedValueFieldOption__ValueAssignment_2"


    // $ANTLR start "rule__DefaultValueFieldOption__ValueAssignment_2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7186:1: rule__DefaultValueFieldOption__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__DefaultValueFieldOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7190:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7191:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7191:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7192:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__DefaultValueFieldOption__ValueAssignment_214830);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7201:1: rule__NativeFieldOption__SourceAssignment_0 : ( ruleOptionSource ) ;
    public final void rule__NativeFieldOption__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7205:1: ( ( ruleOptionSource ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7206:1: ( ruleOptionSource )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7206:1: ( ruleOptionSource )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7207:1: ruleOptionSource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getSourceOptionSourceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleOptionSource_in_rule__NativeFieldOption__SourceAssignment_014861);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7216:1: rule__NativeFieldOption__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__NativeFieldOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7220:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7221:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7221:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7222:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__NativeFieldOption__ValueAssignment_214892);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7231:1: rule__OptionSource__TargetAssignment : ( ( ruleVar_full ) ) ;
    public final void rule__OptionSource__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7235:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7236:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7236:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7237:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceAccess().getTargetIndexedElementCrossReference_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7238:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7239:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceAccess().getTargetIndexedElementVar_fullParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__OptionSource__TargetAssignment14927);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7250:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7254:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7255:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7255:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7256:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_114962); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7265:1: rule__Enum__ElementsAssignment_3 : ( ruleEnumElement ) ;
    public final void rule__Enum__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7269:1: ( ( ruleEnumElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7270:1: ( ruleEnumElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7270:1: ( ruleEnumElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7271:1: ruleEnumElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleEnumElement_in_rule__Enum__ElementsAssignment_314993);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7280:1: rule__EnumField__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7284:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7285:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7285:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7286:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumField__NameAssignment_015024); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7295:1: rule__EnumField__IndexAssignment_2 : ( RULE_NUMINT ) ;
    public final void rule__EnumField__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7299:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7300:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7300:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7301:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getIndexNUMINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__EnumField__IndexAssignment_215055); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7310:1: rule__EnumField__OptionsAssignment_3_1 : ( ruleFieldOption ) ;
    public final void rule__EnumField__OptionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7314:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7315:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7315:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7316:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_115086);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7325:1: rule__EnumField__OptionsAssignment_3_2_1 : ( ruleFieldOption ) ;
    public final void rule__EnumField__OptionsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7329:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7330:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7330:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7331:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_2_115117);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7340:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7344:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7345:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7345:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7346:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_115148); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7355:1: rule__Service__ElementsAssignment_3 : ( ruleServiceElement ) ;
    public final void rule__Service__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7359:1: ( ( ruleServiceElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7360:1: ( ruleServiceElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7360:1: ( ruleServiceElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7361:1: ruleServiceElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getElementsServiceElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleServiceElement_in_rule__Service__ElementsAssignment_315179);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7370:1: rule__Rpc__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rpc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7374:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7375:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7375:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7376:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rpc__NameAssignment_115210); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7385:1: rule__Rpc__ArgTypeAssignment_3 : ( ruleMessageLink ) ;
    public final void rule__Rpc__ArgTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7389:1: ( ( ruleMessageLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7390:1: ( ruleMessageLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7390:1: ( ruleMessageLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7391:1: ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getArgTypeMessageLinkParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_rule__Rpc__ArgTypeAssignment_315241);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7400:1: rule__Rpc__ReturnTypeAssignment_7 : ( ruleMessageLink ) ;
    public final void rule__Rpc__ReturnTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7404:1: ( ( ruleMessageLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7405:1: ( ruleMessageLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7405:1: ( ruleMessageLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7406:1: ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getReturnTypeMessageLinkParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_rule__Rpc__ReturnTypeAssignment_715272);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7415:1: rule__Rpc__OptionsAssignment_9_1 : ( ruleOption ) ;
    public final void rule__Rpc__OptionsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7419:1: ( ( ruleOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7420:1: ( ruleOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7420:1: ( ruleOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7421:1: ruleOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getOptionsOptionParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_ruleOption_in_rule__Rpc__OptionsAssignment_9_115303);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7430:1: rule__MessageLink__TargetAssignment : ( ( ruleVar_full ) ) ;
    public final void rule__MessageLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7434:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7435:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7435:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7436:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkAccess().getTargetMessageCrossReference_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7437:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7438:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkAccess().getTargetMessageVar_fullParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__MessageLink__TargetAssignment15338);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageLinkAccess().getTargetMessageVar_fullParserRuleCall_0_1()); 
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7449:1: rule__Extend__TypeAssignment_1 : ( ( ruleVar_full ) ) ;
    public final void rule__Extend__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7453:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7454:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7454:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7455:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getTypeMessageCrossReference_1_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7456:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7457:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getTypeMessageVar_fullParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__Extend__TypeAssignment_115377);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getTypeMessageVar_fullParserRuleCall_1_0_1()); 
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7468:1: rule__Extend__ElementsAssignment_3 : ( ruleMessageElement ) ;
    public final void rule__Extend__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7472:1: ( ( ruleMessageElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7473:1: ( ruleMessageElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7473:1: ( ruleMessageElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7474:1: ruleMessageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getElementsMessageElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_rule__Extend__ElementsAssignment_315412);
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

    // $ANTLR start synpred5_InternalProtobuf
    public final void synpred5_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1553:1: ( ( ( ruleNativeOption ) ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1553:1: ( ( ruleNativeOption ) )
        {
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1553:1: ( ( ruleNativeOption ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1554:1: ( ruleNativeOption )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getOptionAccess().getNativeOptionParserRuleCall_0()); 
        }
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1555:1: ( ruleNativeOption )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1555:3: ruleNativeOption
        {
        pushFollow(FOLLOW_ruleNativeOption_in_synpred5_InternalProtobuf3260);
        ruleNativeOption();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalProtobuf

    // $ANTLR start synpred21_InternalProtobuf
    public final void synpred21_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1777:1: ( ( ( ruleScalarTypeLink ) ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1777:1: ( ( ruleScalarTypeLink ) )
        {
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1777:1: ( ( ruleScalarTypeLink ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1778:1: ( ruleScalarTypeLink )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTypeLinkAccess().getScalarTypeLinkParserRuleCall_0()); 
        }
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1779:1: ( ruleScalarTypeLink )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1779:3: ruleScalarTypeLink
        {
        pushFollow(FOLLOW_ruleScalarTypeLink_in_synpred21_InternalProtobuf3794);
        ruleScalarTypeLink();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred21_InternalProtobuf

    // $ANTLR start synpred22_InternalProtobuf
    public final void synpred22_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1799:1: ( ( ( rulePackedValueFieldOption ) ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1799:1: ( ( rulePackedValueFieldOption ) )
        {
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1799:1: ( ( rulePackedValueFieldOption ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1800:1: ( rulePackedValueFieldOption )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getFieldOptionAccess().getPackedValueFieldOptionParserRuleCall_0()); 
        }
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1801:1: ( rulePackedValueFieldOption )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1801:3: rulePackedValueFieldOption
        {
        pushFollow(FOLLOW_rulePackedValueFieldOption_in_synpred22_InternalProtobuf3845);
        rulePackedValueFieldOption();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred22_InternalProtobuf

    // $ANTLR start synpred23_InternalProtobuf
    public final void synpred23_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1805:6: ( ( ( ruleDefaultValueFieldOption ) ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1805:6: ( ( ruleDefaultValueFieldOption ) )
        {
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1805:6: ( ( ruleDefaultValueFieldOption ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1806:1: ( ruleDefaultValueFieldOption )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getFieldOptionAccess().getDefaultValueFieldOptionParserRuleCall_1()); 
        }
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1807:1: ( ruleDefaultValueFieldOption )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1807:3: ruleDefaultValueFieldOption
        {
        pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_synpred23_InternalProtobuf3864);
        ruleDefaultValueFieldOption();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred23_InternalProtobuf

    // Delegated rules

    public final boolean synpred5_InternalProtobuf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalProtobuf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalProtobuf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalProtobuf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalProtobuf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalProtobuf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalProtobuf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalProtobuf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\15\uffff";
    static final String DFA3_minS =
        "\1\21\1\4\1\64\1\uffff\1\4\6\63\1\0\1\uffff";
    static final String DFA3_maxS =
        "\1\21\1\60\1\76\1\uffff\1\62\6\63\1\0\1\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\1\10\uffff\1\2";
    static final String DFA3_specialS =
        "\13\uffff\1\0\1\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2\10\uffff\44\3",
            "\1\4\11\uffff\1\3",
            "",
            "\1\12\1\11\1\5\1\6\51\uffff\1\7\1\10",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\uffff",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1548:1: rule__Option__Alternatives : ( ( ( ruleNativeOption ) ) | ( ruleCustomOption ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_11 = input.LA(1);

                         
                        int index3_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 3;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index3_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA9_eotS =
        "\56\uffff";
    static final String DFA9_eofS =
        "\56\uffff";
    static final String DFA9_minS =
        "\1\25\4\4\1\uffff\45\64\1\6\1\63\1\uffff";
    static final String DFA9_maxS =
        "\1\27\4\60\1\uffff\45\64\1\6\1\72\1\uffff";
    static final String DFA9_acceptS =
        "\5\uffff\1\1\47\uffff\1\2";
    static final String DFA9_specialS =
        "\56\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\1\1\3",
            "\1\5\10\uffff\15\5\1\4\26\5",
            "\1\5\10\uffff\15\5\1\4\26\5",
            "\1\5\10\uffff\15\5\1\4\26\5",
            "\1\6\10\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52",
            "",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\54",
            "\1\5\2\uffff\1\55\3\uffff\1\5",
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
            return "1728:1: rule__IndexedElement__Alternatives : ( ( ruleMessageField ) | ( ruleGroup ) );";
        }
    }
    static final String DFA11_eotS =
        "\22\uffff";
    static final String DFA11_eofS =
        "\22\uffff";
    static final String DFA11_minS =
        "\1\4\17\0\2\uffff";
    static final String DFA11_maxS =
        "\1\60\17\0\2\uffff";
    static final String DFA11_acceptS =
        "\20\uffff\1\2\1\1";
    static final String DFA11_specialS =
        "\1\uffff\1\7\1\16\1\3\1\2\1\5\1\12\1\15\1\14\1\0\1\6\1\11\1\10\1\13\1\4\1\1\2\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\20\10\uffff\20\20\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\5\20",
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

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1772:1: rule__TypeLink__Alternatives : ( ( ( ruleScalarTypeLink ) ) | ( ruleComplexTypeLink ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_15 = input.LA(1);

                         
                        int index11_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_14 = input.LA(1);

                         
                        int index11_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_14);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_12 = input.LA(1);

                         
                        int index11_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_12);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_11 = input.LA(1);

                         
                        int index11_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA11_13 = input.LA(1);

                         
                        int index11_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA12_eotS =
        "\24\uffff";
    static final String DFA12_eofS =
        "\24\uffff";
    static final String DFA12_minS =
        "\1\4\2\64\1\uffff\2\4\14\0\2\uffff";
    static final String DFA12_maxS =
        "\1\60\2\64\1\uffff\2\62\14\0\2\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\3\16\uffff\1\1\1\2";
    static final String DFA12_specialS =
        "\6\uffff\1\5\1\0\1\1\1\2\1\4\1\12\1\11\1\3\1\6\1\7\1\10\1\13\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\3\10\uffff\37\3\1\2\3\3\1\1",
            "\1\4",
            "\1\5",
            "",
            "\1\13\1\12\1\6\1\7\51\uffff\1\10\1\11",
            "\1\21\1\20\1\14\1\15\51\uffff\1\16\1\17",
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

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1794:1: rule__FieldOption__Alternatives : ( ( ( rulePackedValueFieldOption ) ) | ( ( ruleDefaultValueFieldOption ) ) | ( ruleNativeFieldOption ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_13 = input.LA(1);

                         
                        int index12_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_10 = input.LA(1);

                         
                        int index12_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_14 = input.LA(1);

                         
                        int index12_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_15 = input.LA(1);

                         
                        int index12_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_15);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_16 = input.LA(1);

                         
                        int index12_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_16);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_12 = input.LA(1);

                         
                        int index12_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_12);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_11 = input.LA(1);

                         
                        int index12_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_17 = input.LA(1);

                         
                        int index12_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
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
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Alternatives_in_ruleImport280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicImport_in_entryRulePublicImport307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePublicImport314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__0_in_rulePublicImport340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakImport_in_entryRuleWeakImport367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeakImport374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__0_in_ruleWeakImport400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Alternatives_in_ruleOption460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeOption_in_entryRuleNativeOption487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeOption494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__0_in_ruleNativeOption520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_entryRuleCustomOption547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomOption554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__0_in_ruleCustomOption580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_ruleValue640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_entryRuleSimpleValueLink666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValueLink673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleValueLink__Alternatives_in_ruleSimpleValueLink699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomIdLink_in_entryRuleCustomIdLink726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomIdLink733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomIdLink__TargetAssignment_in_ruleCustomIdLink759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_entryRuleStringLink786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLink793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLink__TargetAssignment_in_ruleStringLink819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLink853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLink__TargetAssignment_in_ruleBooleanLink879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_entryRuleNumberLink906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLink913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLink__Alternatives_in_ruleNumberLink939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_entryRuleIntLink966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLink973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLink__TargetAssignment_in_ruleIntLink999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLink1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLink__TargetAssignment_in_ruleDoubleLink1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Alternatives_in_ruleComplexType1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensibleType1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensibleType__Alternatives_in_ruleExtensibleType1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0_in_ruleMessage1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_entryRuleMessageElement1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageElement1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageElement__Alternatives_in_ruleMessageElement1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneof_in_entryRuleOneof1326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneof1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__Group__0_in_ruleOneof1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneofField_in_entryRuleOneofField1386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneofField1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__0_in_ruleOneofField1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement1446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedElement1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexedElement__Alternatives_in_ruleIndexedElement1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionRange1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__0_in_ruleExtensionRange1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange1566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0_in_ruleRange1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_entryRuleMessageField1626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageField1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__0_in_ruleMessageField1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0_in_ruleGroup1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_entryRuleTypeLink1746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLink1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeLink__Alternatives_in_ruleTypeLink1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink1806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLink1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLink__TargetAssignment_in_ruleComplexTypeLink1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink1866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarTypeLink1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScalarTypeLink__TargetAssignment_in_ruleScalarTypeLink1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions1926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOptions1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__0_in_ruleFieldOptions1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_entryRuleFieldOption1986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOption1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOption__Alternatives_in_ruleFieldOption2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackedValueFieldOption_in_entryRulePackedValueFieldOption2046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackedValueFieldOption2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__0_in_rulePackedValueFieldOption2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption2106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValueFieldOption2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__0_in_ruleDefaultValueFieldOption2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption2166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeFieldOption2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__0_in_ruleNativeFieldOption2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_entryRuleOptionSource2226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionSource2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionSource__TargetAssignment_in_ruleOptionSource2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum2286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_entryRuleEnumElement2346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumElement2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumElement__Alternatives_in_ruleEnumElement2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_entryRuleEnumField2406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumField2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__0_in_ruleEnumField2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService2466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceElement_in_entryRuleServiceElement2526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceElement2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceElement__Alternatives_in_ruleServiceElement2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_entryRuleRpc2586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRpc2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__0_in_ruleRpc2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_entryRuleMessageLink2646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageLink2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageLink__TargetAssignment_in_ruleMessageLink2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_entryRuleExtend2706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtend2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__0_in_ruleExtend2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_entryRuleVar_full2766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar_full2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var_full__Alternatives_in_ruleVar_full2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar2826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Alternatives_in_ruleVar2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID2886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFULL_ID2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__0_in_ruleFULL_ID2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_entryRuleVarReserved2946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarReserved2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarReserved__Alternatives_in_ruleVarReserved2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__Alternatives_in_ruleModifier3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScalarType__Alternatives_in_ruleScalarType3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_rule__Statement__Alternatives3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_rule__Statement__Alternatives3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Statement__Alternatives3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_rule__Statement__Alternatives3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicImport_in_rule__Import__Alternatives3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakImport_in_rule__Import__Alternatives3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeOption_in_rule__Option__Alternatives3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_rule__Option__Alternatives3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_rule__SimpleValueLink__Alternatives3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_rule__SimpleValueLink__Alternatives3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_rule__SimpleValueLink__Alternatives3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomIdLink_in_rule__SimpleValueLink__Alternatives3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_rule__NumberLink__Alternatives3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_rule__NumberLink__Alternatives3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__ComplexType__Alternatives3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_rule__ComplexType__Alternatives3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__ExtensibleType__Alternatives3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__ExtensibleType__Alternatives3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__MessageElement__Alternatives3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_rule__MessageElement__Alternatives3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneof_in_rule__MessageElement__Alternatives3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__MessageElement__Alternatives3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__MessageElement__Alternatives3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_rule__MessageElement__Alternatives3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_rule__MessageElement__Alternatives3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__MessageElement__Alternatives3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_rule__IndexedElement__Alternatives3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__IndexedElement__Alternatives3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__ToAssignment_1_1_0_in_rule__Range__Alternatives_1_13742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__MaxAssignment_1_1_1_in_rule__Range__Alternatives_1_13760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_rule__TypeLink__Alternatives3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_rule__TypeLink__Alternatives3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackedValueFieldOption_in_rule__FieldOption__Alternatives3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_rule__FieldOption__Alternatives3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_rule__FieldOption__Alternatives3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_rule__EnumElement__Alternatives3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_rule__EnumElement__Alternatives3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_rule__ServiceElement__Alternatives3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__ServiceElement__Alternatives3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_rule__Var_full__Alternatives4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Var_full__Alternatives4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Var__Alternatives4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_rule__Var__Alternatives4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VarReserved__Alternatives4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__VarReserved__Alternatives4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__VarReserved__Alternatives4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VarReserved__Alternatives4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VarReserved__Alternatives4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__VarReserved__Alternatives4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VarReserved__Alternatives4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VarReserved__Alternatives4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VarReserved__Alternatives4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VarReserved__Alternatives4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VarReserved__Alternatives4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__VarReserved__Alternatives4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__VarReserved__Alternatives4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__VarReserved__Alternatives4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__VarReserved__Alternatives4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__VarReserved__Alternatives4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VarReserved__Alternatives4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__VarReserved__Alternatives4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__VarReserved__Alternatives4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__VarReserved__Alternatives4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__VarReserved__Alternatives4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__VarReserved__Alternatives4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__VarReserved__Alternatives4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__VarReserved__Alternatives4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__VarReserved__Alternatives4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__VarReserved__Alternatives4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__VarReserved__Alternatives4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__VarReserved__Alternatives4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__VarReserved__Alternatives4673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__VarReserved__Alternatives4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__VarReserved__Alternatives4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__VarReserved__Alternatives4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__VarReserved__Alternatives4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__VarReserved__Alternatives4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__VarReserved__Alternatives4793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__VarReserved__Alternatives4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__BOOL__Alternatives4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__BOOL__Alternatives4870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Modifier__Alternatives4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Modifier__Alternatives4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Modifier__Alternatives4948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ScalarType__Alternatives4984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ScalarType__Alternatives5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ScalarType__Alternatives5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ScalarType__Alternatives5047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ScalarType__Alternatives5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ScalarType__Alternatives5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ScalarType__Alternatives5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ScalarType__Alternatives5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ScalarType__Alternatives5152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ScalarType__Alternatives5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ScalarType__Alternatives5194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ScalarType__Alternatives5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ScalarType__Alternatives5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ScalarType__Alternatives5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ScalarType__Alternatives5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group__0__Impl_in_rule__Proto__Group__05311 = new BitSet(new long[]{0x0000000002FF4000L});
    public static final BitSet FOLLOW_rule__Proto__Group__1_in_rule__Proto__Group__05314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__SyntaxAssignment_0_in_rule__Proto__Group__0__Impl5341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group__1__Impl_in_rule__Proto__Group__15372 = new BitSet(new long[]{0x0000000002FF4000L});
    public static final BitSet FOLLOW_rule__Proto__Group__2_in_rule__Proto__Group__15375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__ImportsAssignment_1_in_rule__Proto__Group__1__Impl5402 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Proto__Group__2__Impl_in_rule__Proto__Group__25433 = new BitSet(new long[]{0x0000000002FF4000L});
    public static final BitSet FOLLOW_rule__Proto__Group__3_in_rule__Proto__Group__25436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group_2__0_in_rule__Proto__Group__2__Impl5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group__3__Impl_in_rule__Proto__Group__35494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__StatementsAssignment_3_in_rule__Proto__Group__3__Impl5521 = new BitSet(new long[]{0x0000000002FE0002L});
    public static final BitSet FOLLOW_rule__Proto__Group_2__0__Impl_in_rule__Proto__Group_2__05560 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Proto__Group_2__1_in_rule__Proto__Group_2__05563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Proto__Group_2__0__Impl5591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group_2__1__Impl_in_rule__Proto__Group_2__15622 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Proto__Group_2__2_in_rule__Proto__Group_2__15625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__NameAssignment_2_1_in_rule__Proto__Group_2__1__Impl5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group_2__2__Impl_in_rule__Proto__Group_2__25682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Proto__Group_2__2__Impl5710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group__0__Impl_in_rule__Syntax__Group__05747 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Syntax__Group__1_in_rule__Syntax__Group__05750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Syntax__Group__0__Impl5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group__1__Impl_in_rule__Syntax__Group__15809 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Syntax__Group__2_in_rule__Syntax__Group__15812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Syntax__Group__1__Impl5840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group__2__Impl_in_rule__Syntax__Group__25871 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Syntax__Group__3_in_rule__Syntax__Group__25874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__NameAssignment_2_in_rule__Syntax__Group__2__Impl5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group__3__Impl_in_rule__Syntax__Group__35931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Syntax__Group__3__Impl5959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__0__Impl_in_rule__PublicImport__Group__05998 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__1_in_rule__PublicImport__Group__06001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PublicImport__Group__0__Impl6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__1__Impl_in_rule__PublicImport__Group__16060 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__2_in_rule__PublicImport__Group__16063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__PublicImport__Group__1__Impl6091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__2__Impl_in_rule__PublicImport__Group__26122 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__3_in_rule__PublicImport__Group__26125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__ImportURIAssignment_2_in_rule__PublicImport__Group__2__Impl6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__3__Impl_in_rule__PublicImport__Group__36182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__PublicImport__Group__3__Impl6210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__0__Impl_in_rule__WeakImport__Group__06249 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__1_in_rule__WeakImport__Group__06252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WeakImport__Group__0__Impl6280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__1__Impl_in_rule__WeakImport__Group__16311 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__2_in_rule__WeakImport__Group__16314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__WeakImport__Group__1__Impl6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__2__Impl_in_rule__WeakImport__Group__26376 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__3_in_rule__WeakImport__Group__26379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__ImportURIAssignment_2_in_rule__WeakImport__Group__2__Impl6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__3__Impl_in_rule__WeakImport__Group__36436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__WeakImport__Group__3__Impl6464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__0__Impl_in_rule__NativeOption__Group__06503 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__1_in_rule__NativeOption__Group__06506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NativeOption__Group__0__Impl6534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__1__Impl_in_rule__NativeOption__Group__16565 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__2_in_rule__NativeOption__Group__16568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__SourceAssignment_1_in_rule__NativeOption__Group__1__Impl6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__2__Impl_in_rule__NativeOption__Group__26625 = new BitSet(new long[]{0x00060000000000F0L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__3_in_rule__NativeOption__Group__26628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__NativeOption__Group__2__Impl6656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__3__Impl_in_rule__NativeOption__Group__36687 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__4_in_rule__NativeOption__Group__36690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__ValueAssignment_3_in_rule__NativeOption__Group__3__Impl6717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__4__Impl_in_rule__NativeOption__Group__46747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__NativeOption__Group__4__Impl6775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__0__Impl_in_rule__CustomOption__Group__06816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__1_in_rule__CustomOption__Group__06819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CustomOption__Group__0__Impl6847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__1__Impl_in_rule__CustomOption__Group__16878 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__2_in_rule__CustomOption__Group__16881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__SourceAssignment_1_in_rule__CustomOption__Group__1__Impl6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__2__Impl_in_rule__CustomOption__Group__26938 = new BitSet(new long[]{0x00060000000000F0L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__3_in_rule__CustomOption__Group__26941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__CustomOption__Group__2__Impl6969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__3__Impl_in_rule__CustomOption__Group__37000 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__4_in_rule__CustomOption__Group__37003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__ValueAssignment_3_in_rule__CustomOption__Group__3__Impl7030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__4__Impl_in_rule__CustomOption__Group__47060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__CustomOption__Group__4__Impl7088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__07129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__07132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Message__Group__0__Impl7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__17191 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Message__Group__2_in_rule__Message__Group__17194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__NameAssignment_1_in_rule__Message__Group__1__Impl7221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__27251 = new BitSet(new long[]{0x0180000003FE0000L});
    public static final BitSet FOLLOW_rule__Message__Group__3_in_rule__Message__Group__27254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Message__Group__2__Impl7282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__37313 = new BitSet(new long[]{0x0180000003FE0000L});
    public static final BitSet FOLLOW_rule__Message__Group__4_in_rule__Message__Group__37316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__ElementsAssignment_3_in_rule__Message__Group__3__Impl7343 = new BitSet(new long[]{0x0100000003FE0002L});
    public static final BitSet FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__47374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Message__Group__4__Impl7402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__Group__0__Impl_in_rule__Oneof__Group__07443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Oneof__Group__1_in_rule__Oneof__Group__07446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Oneof__Group__0__Impl7474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__Group__1__Impl_in_rule__Oneof__Group__17505 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Oneof__Group__2_in_rule__Oneof__Group__17508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__NameAssignment_1_in_rule__Oneof__Group__1__Impl7535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__Group__2__Impl_in_rule__Oneof__Group__27565 = new BitSet(new long[]{0x0081FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Oneof__Group__3_in_rule__Oneof__Group__27568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Oneof__Group__2__Impl7596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__Group__3__Impl_in_rule__Oneof__Group__37627 = new BitSet(new long[]{0x0081FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Oneof__Group__4_in_rule__Oneof__Group__37630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__FieldsAssignment_3_in_rule__Oneof__Group__3__Impl7657 = new BitSet(new long[]{0x0001FFFFFFFFE012L});
    public static final BitSet FOLLOW_rule__Oneof__Group__4__Impl_in_rule__Oneof__Group__47688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Oneof__Group__4__Impl7716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__0__Impl_in_rule__OneofField__Group__07757 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__OneofField__Group__1_in_rule__OneofField__Group__07760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__TypeAssignment_0_in_rule__OneofField__Group__0__Impl7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__1__Impl_in_rule__OneofField__Group__17817 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__OneofField__Group__2_in_rule__OneofField__Group__17820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__NameAssignment_1_in_rule__OneofField__Group__1__Impl7847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__2__Impl_in_rule__OneofField__Group__27877 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__OneofField__Group__3_in_rule__OneofField__Group__27880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__OneofField__Group__2__Impl7908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__3__Impl_in_rule__OneofField__Group__37939 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_rule__OneofField__Group__4_in_rule__OneofField__Group__37942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__IndexAssignment_3_in_rule__OneofField__Group__3__Impl7969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__4__Impl_in_rule__OneofField__Group__47999 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_rule__OneofField__Group__5_in_rule__OneofField__Group__48002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__OptionsAssignment_4_in_rule__OneofField__Group__4__Impl8029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__5__Impl_in_rule__OneofField__Group__58060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__OneofField__Group__5__Impl8088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__0__Impl_in_rule__ExtensionRange__Group__08131 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__1_in_rule__ExtensionRange__Group__08134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ExtensionRange__Group__0__Impl8162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__1__Impl_in_rule__ExtensionRange__Group__18193 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__2_in_rule__ExtensionRange__Group__18196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__RangesAssignment_1_in_rule__ExtensionRange__Group__1__Impl8223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__2__Impl_in_rule__ExtensionRange__Group__28253 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__3_in_rule__ExtensionRange__Group__28256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__0_in_rule__ExtensionRange__Group__2__Impl8283 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__3__Impl_in_rule__ExtensionRange__Group__38314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ExtensionRange__Group__3__Impl8342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__0__Impl_in_rule__ExtensionRange__Group_2__08381 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__1_in_rule__ExtensionRange__Group_2__08384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ExtensionRange__Group_2__0__Impl8412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__1__Impl_in_rule__ExtensionRange__Group_2__18443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__RangesAssignment_2_1_in_rule__ExtensionRange__Group_2__1__Impl8470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__08504 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Range__Group__1_in_rule__Range__Group__08507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__FromAssignment_0_in_rule__Range__Group__0__Impl8534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__18564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group_1__0_in_rule__Range__Group__1__Impl8591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group_1__0__Impl_in_rule__Range__Group_1__08626 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_rule__Range__Group_1__1_in_rule__Range__Group_1__08629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Range__Group_1__0__Impl8657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group_1__1__Impl_in_rule__Range__Group_1__18688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Alternatives_1_1_in_rule__Range__Group_1__1__Impl8715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__0__Impl_in_rule__MessageField__Group__08749 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__MessageField__Group__1_in_rule__MessageField__Group__08752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__ModifierAssignment_0_in_rule__MessageField__Group__0__Impl8779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__1__Impl_in_rule__MessageField__Group__18809 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__MessageField__Group__2_in_rule__MessageField__Group__18812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__TypeAssignment_1_in_rule__MessageField__Group__1__Impl8839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__2__Impl_in_rule__MessageField__Group__28869 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__MessageField__Group__3_in_rule__MessageField__Group__28872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__NameAssignment_2_in_rule__MessageField__Group__2__Impl8899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__3__Impl_in_rule__MessageField__Group__38929 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MessageField__Group__4_in_rule__MessageField__Group__38932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__MessageField__Group__3__Impl8960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__4__Impl_in_rule__MessageField__Group__48991 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_rule__MessageField__Group__5_in_rule__MessageField__Group__48994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__IndexAssignment_4_in_rule__MessageField__Group__4__Impl9021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__5__Impl_in_rule__MessageField__Group__59051 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_rule__MessageField__Group__6_in_rule__MessageField__Group__59054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__OptionsAssignment_5_in_rule__MessageField__Group__5__Impl9081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__6__Impl_in_rule__MessageField__Group__69112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__MessageField__Group__6__Impl9140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__09185 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__09188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__ModifierAssignment_0_in_rule__Group__Group__0__Impl9215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__19245 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__19248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Group__Group__1__Impl9276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__29307 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__29310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl9337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__39367 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__39370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Group__Group__3__Impl9398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__49429 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Group__Group__5_in_rule__Group__Group__49432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__IndexAssignment_4_in_rule__Group__Group__4__Impl9459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__59489 = new BitSet(new long[]{0x0080000000F40000L});
    public static final BitSet FOLLOW_rule__Group__Group__6_in_rule__Group__Group__59492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Group__Group__5__Impl9520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__6__Impl_in_rule__Group__Group__69551 = new BitSet(new long[]{0x0080000000F40000L});
    public static final BitSet FOLLOW_rule__Group__Group__7_in_rule__Group__Group__69554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__ElementsAssignment_6_in_rule__Group__Group__6__Impl9581 = new BitSet(new long[]{0x0000000000F40002L});
    public static final BitSet FOLLOW_rule__Group__Group__7__Impl_in_rule__Group__Group__79612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Group__Group__7__Impl9640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__0__Impl_in_rule__FieldOptions__Group__09687 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__1_in_rule__FieldOptions__Group__09690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__FieldOptions__Group__0__Impl9718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__1__Impl_in_rule__FieldOptions__Group__19749 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__2_in_rule__FieldOptions__Group__19752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__OptionsAssignment_1_in_rule__FieldOptions__Group__1__Impl9779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__2__Impl_in_rule__FieldOptions__Group__29809 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__3_in_rule__FieldOptions__Group__29812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__0_in_rule__FieldOptions__Group__2__Impl9839 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__3__Impl_in_rule__FieldOptions__Group__39870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__FieldOptions__Group__3__Impl9898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__0__Impl_in_rule__FieldOptions__Group_2__09937 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__1_in_rule__FieldOptions__Group_2__09940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__FieldOptions__Group_2__0__Impl9968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__1__Impl_in_rule__FieldOptions__Group_2__19999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__OptionsAssignment_2_1_in_rule__FieldOptions__Group_2__1__Impl10026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__0__Impl_in_rule__PackedValueFieldOption__Group__010060 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__1_in_rule__PackedValueFieldOption__Group__010063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__PackedValueFieldOption__Group__0__Impl10092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__1__Impl_in_rule__PackedValueFieldOption__Group__110124 = new BitSet(new long[]{0x00060000000000F0L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__2_in_rule__PackedValueFieldOption__Group__110127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__PackedValueFieldOption__Group__1__Impl10155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__2__Impl_in_rule__PackedValueFieldOption__Group__210186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__ValueAssignment_2_in_rule__PackedValueFieldOption__Group__2__Impl10213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__0__Impl_in_rule__DefaultValueFieldOption__Group__010249 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__1_in_rule__DefaultValueFieldOption__Group__010252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DefaultValueFieldOption__Group__0__Impl10281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__1__Impl_in_rule__DefaultValueFieldOption__Group__110313 = new BitSet(new long[]{0x00060000000000F0L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__2_in_rule__DefaultValueFieldOption__Group__110316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__DefaultValueFieldOption__Group__1__Impl10344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__2__Impl_in_rule__DefaultValueFieldOption__Group__210375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__ValueAssignment_2_in_rule__DefaultValueFieldOption__Group__2__Impl10402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__0__Impl_in_rule__NativeFieldOption__Group__010438 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__1_in_rule__NativeFieldOption__Group__010441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__SourceAssignment_0_in_rule__NativeFieldOption__Group__0__Impl10468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__1__Impl_in_rule__NativeFieldOption__Group__110498 = new BitSet(new long[]{0x00060000000000F0L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__2_in_rule__NativeFieldOption__Group__110501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__NativeFieldOption__Group__1__Impl10529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__2__Impl_in_rule__NativeFieldOption__Group__210560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__ValueAssignment_2_in_rule__NativeFieldOption__Group__2__Impl10587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__010623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__010626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Enum__Group__0__Impl10654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__110685 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__110688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl10715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__210745 = new BitSet(new long[]{0x0080000002FE0010L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__210748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Enum__Group__2__Impl10776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__310807 = new BitSet(new long[]{0x0080000002FE0010L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__310810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__ElementsAssignment_3_in_rule__Enum__Group__3__Impl10837 = new BitSet(new long[]{0x0000000002FE0012L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__410868 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__410871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Enum__Group__4__Impl10899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__510930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Enum__Group__5__Impl10959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__0__Impl_in_rule__EnumField__Group__011004 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__1_in_rule__EnumField__Group__011007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__NameAssignment_0_in_rule__EnumField__Group__0__Impl11034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__1__Impl_in_rule__EnumField__Group__111064 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumField__Group__2_in_rule__EnumField__Group__111067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__EnumField__Group__1__Impl11095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__2__Impl_in_rule__EnumField__Group__211126 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__3_in_rule__EnumField__Group__211129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__IndexAssignment_2_in_rule__EnumField__Group__2__Impl11156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__3__Impl_in_rule__EnumField__Group__311186 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__4_in_rule__EnumField__Group__311189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__0_in_rule__EnumField__Group__3__Impl11216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__4__Impl_in_rule__EnumField__Group__411247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__EnumField__Group__4__Impl11275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__0__Impl_in_rule__EnumField__Group_3__011316 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__1_in_rule__EnumField__Group_3__011319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__EnumField__Group_3__0__Impl11347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__1__Impl_in_rule__EnumField__Group_3__111378 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__2_in_rule__EnumField__Group_3__111381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__OptionsAssignment_3_1_in_rule__EnumField__Group_3__1__Impl11408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__2__Impl_in_rule__EnumField__Group_3__211438 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__3_in_rule__EnumField__Group_3__211441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__0_in_rule__EnumField__Group_3__2__Impl11468 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__3__Impl_in_rule__EnumField__Group_3__311499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__EnumField__Group_3__3__Impl11527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__0__Impl_in_rule__EnumField__Group_3_2__011566 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__1_in_rule__EnumField__Group_3_2__011569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__EnumField__Group_3_2__0__Impl11597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__1__Impl_in_rule__EnumField__Group_3_2__111628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__OptionsAssignment_3_2_1_in_rule__EnumField__Group_3_2__1__Impl11655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__011689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__011692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Service__Group__0__Impl11720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__111751 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__111754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl11781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__211811 = new BitSet(new long[]{0x018000000BFE0000L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__211814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Service__Group__2__Impl11842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__311873 = new BitSet(new long[]{0x018000000BFE0000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__311876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__ElementsAssignment_3_in_rule__Service__Group__3__Impl11903 = new BitSet(new long[]{0x010000000BFE0002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__411934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Service__Group__4__Impl11962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__0__Impl_in_rule__Rpc__Group__012003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rpc__Group__1_in_rule__Rpc__Group__012006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Rpc__Group__0__Impl12035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__1__Impl_in_rule__Rpc__Group__112067 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__2_in_rule__Rpc__Group__112070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__NameAssignment_1_in_rule__Rpc__Group__1__Impl12097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__2__Impl_in_rule__Rpc__Group__212127 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Rpc__Group__3_in_rule__Rpc__Group__212130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Rpc__Group__2__Impl12158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__3__Impl_in_rule__Rpc__Group__312189 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__4_in_rule__Rpc__Group__312192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__ArgTypeAssignment_3_in_rule__Rpc__Group__3__Impl12219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__4__Impl_in_rule__Rpc__Group__412249 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__5_in_rule__Rpc__Group__412252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Rpc__Group__4__Impl12280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__5__Impl_in_rule__Rpc__Group__512311 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__6_in_rule__Rpc__Group__512314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Rpc__Group__5__Impl12342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__6__Impl_in_rule__Rpc__Group__612373 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Rpc__Group__7_in_rule__Rpc__Group__612376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Rpc__Group__6__Impl12404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__7__Impl_in_rule__Rpc__Group__712435 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__8_in_rule__Rpc__Group__712438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__ReturnTypeAssignment_7_in_rule__Rpc__Group__7__Impl12465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__8__Impl_in_rule__Rpc__Group__812495 = new BitSet(new long[]{0x0048000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__9_in_rule__Rpc__Group__812498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Rpc__Group__8__Impl12526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__9__Impl_in_rule__Rpc__Group__912557 = new BitSet(new long[]{0x0048000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__10_in_rule__Rpc__Group__912560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__0_in_rule__Rpc__Group__9__Impl12587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__10__Impl_in_rule__Rpc__Group__1012618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Rpc__Group__10__Impl12646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__0__Impl_in_rule__Rpc__Group_9__012699 = new BitSet(new long[]{0x0180000003FE0000L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__1_in_rule__Rpc__Group_9__012702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Rpc__Group_9__0__Impl12730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__1__Impl_in_rule__Rpc__Group_9__112761 = new BitSet(new long[]{0x0180000003FE0000L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__2_in_rule__Rpc__Group_9__112764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__OptionsAssignment_9_1_in_rule__Rpc__Group_9__1__Impl12791 = new BitSet(new long[]{0x0100000003FE0002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__2__Impl_in_rule__Rpc__Group_9__212822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Rpc__Group_9__2__Impl12850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__0__Impl_in_rule__Extend__Group__012887 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Extend__Group__1_in_rule__Extend__Group__012890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Extend__Group__0__Impl12919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__1__Impl_in_rule__Extend__Group__112951 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Extend__Group__2_in_rule__Extend__Group__112954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__TypeAssignment_1_in_rule__Extend__Group__1__Impl12981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__2__Impl_in_rule__Extend__Group__213011 = new BitSet(new long[]{0x0180000003FE0000L});
    public static final BitSet FOLLOW_rule__Extend__Group__3_in_rule__Extend__Group__213014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Extend__Group__2__Impl13042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__3__Impl_in_rule__Extend__Group__313073 = new BitSet(new long[]{0x0180000003FE0000L});
    public static final BitSet FOLLOW_rule__Extend__Group__4_in_rule__Extend__Group__313076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__ElementsAssignment_3_in_rule__Extend__Group__3__Impl13103 = new BitSet(new long[]{0x0100000003FE0002L});
    public static final BitSet FOLLOW_rule__Extend__Group__4__Impl_in_rule__Extend__Group__413134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Extend__Group__4__Impl13162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__0__Impl_in_rule__FULL_ID__Group__013203 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__1_in_rule__FULL_ID__Group__013206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FULL_ID__Group__0__Impl13233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__1__Impl_in_rule__FULL_ID__Group__113262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl13291 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl13303 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__0__Impl_in_rule__FULL_ID__Group_1__013340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__1_in_rule__FULL_ID__Group_1__013343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__FULL_ID__Group_1__0__Impl13371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__1__Impl_in_rule__FULL_ID__Group_1__113402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FULL_ID__Group_1__1__Impl13429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_rule__Proto__SyntaxAssignment_013468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Proto__ImportsAssignment_113499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__Proto__NameAssignment_2_113530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Proto__StatementsAssignment_313561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Syntax__NameAssignment_213592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PublicImport__ImportURIAssignment_213623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__WeakImport__ImportURIAssignment_213654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__NativeOption__SourceAssignment_113689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__NativeOption__ValueAssignment_313724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomOption__SourceAssignment_113755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__CustomOption__ValueAssignment_313786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomIdLink__TargetAssignment13817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLink__TargetAssignment13848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__BooleanLink__TargetAssignment13879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__IntLink__TargetAssignment13910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMDOUBLE_in_rule__DoubleLink__TargetAssignment13941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__NameAssignment_113972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_rule__Message__ElementsAssignment_314003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Oneof__NameAssignment_114034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneofField_in_rule__Oneof__FieldsAssignment_314065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__OneofField__TypeAssignment_014096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__OneofField__NameAssignment_114127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__OneofField__IndexAssignment_314158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_rule__OneofField__OptionsAssignment_414189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_rule__ExtensionRange__RangesAssignment_114220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_rule__ExtensionRange__RangesAssignment_2_114251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__Range__FromAssignment_014282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__Range__ToAssignment_1_1_014313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Range__MaxAssignment_1_1_114349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__MessageField__ModifierAssignment_014388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__MessageField__TypeAssignment_114419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__MessageField__NameAssignment_214450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__MessageField__IndexAssignment_414481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_rule__MessageField__OptionsAssignment_514512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Group__ModifierAssignment_014543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Group__NameAssignment_214574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__Group__IndexAssignment_414605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_rule__Group__ElementsAssignment_614636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__ComplexTypeLink__TargetAssignment14671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarType_in_rule__ScalarTypeLink__TargetAssignment14706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_114737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_2_114768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__PackedValueFieldOption__ValueAssignment_214799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__DefaultValueFieldOption__ValueAssignment_214830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_rule__NativeFieldOption__SourceAssignment_014861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__NativeFieldOption__ValueAssignment_214892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__OptionSource__TargetAssignment14927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_114962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_rule__Enum__ElementsAssignment_314993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumField__NameAssignment_015024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__EnumField__IndexAssignment_215055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_115086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_2_115117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_115148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceElement_in_rule__Service__ElementsAssignment_315179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rpc__NameAssignment_115210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_rule__Rpc__ArgTypeAssignment_315241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_rule__Rpc__ReturnTypeAssignment_715272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Rpc__OptionsAssignment_9_115303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__MessageLink__TargetAssignment15338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__Extend__TypeAssignment_115377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_rule__Extend__ElementsAssignment_315412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeOption_in_synpred5_InternalProtobuf3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_synpred21_InternalProtobuf3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackedValueFieldOption_in_synpred22_InternalProtobuf3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_synpred23_InternalProtobuf3864 = new BitSet(new long[]{0x0000000000000002L});

}