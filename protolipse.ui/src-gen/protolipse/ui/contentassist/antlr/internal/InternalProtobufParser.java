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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMINT", "RULE_NUMDOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'to'", "'package'", "'syntax'", "'import'", "'option'", "'message'", "'service'", "'enum'", "'required'", "'optional'", "'repeated'", "'extensions'", "'extend'", "'group'", "'rpc'", "'returns'", "'int32'", "'int64'", "'uint32'", "'uint64'", "'sint32'", "'sint64'", "'fixed32'", "'fixed64'", "'sfixed32'", "'sfixed64'", "'float'", "'double'", "'bool'", "'string'", "'bytes'", "'default'", "'max'", "'void'", "'true'", "'false'", "'='", "';'", "'public'", "'weak'", "'{'", "'}'", "'['", "']'", "','", "'('", "')'", "'.'"
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:182:1: ruleImport : ( ( rule__Import__Alternatives ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:186:2: ( ( ( rule__Import__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:187:1: ( ( rule__Import__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:187:1: ( ( rule__Import__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:188:1: ( rule__Import__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:189:1: ( rule__Import__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:189:2: rule__Import__Alternatives
            {
            pushFollow(FOLLOW_rule__Import__Alternatives_in_ruleImport340);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:201:1: entryRulePublicImport : rulePublicImport EOF ;
    public final void entryRulePublicImport() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:202:1: ( rulePublicImport EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:203:1: rulePublicImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportRule()); 
            }
            pushFollow(FOLLOW_rulePublicImport_in_entryRulePublicImport367);
            rulePublicImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPublicImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePublicImport374); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:210:1: rulePublicImport : ( ( rule__PublicImport__Group__0 ) ) ;
    public final void rulePublicImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:214:2: ( ( ( rule__PublicImport__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:215:1: ( ( rule__PublicImport__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:215:1: ( ( rule__PublicImport__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:216:1: ( rule__PublicImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:217:1: ( rule__PublicImport__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:217:2: rule__PublicImport__Group__0
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__0_in_rulePublicImport400);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:229:1: entryRuleWeakImport : ruleWeakImport EOF ;
    public final void entryRuleWeakImport() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:230:1: ( ruleWeakImport EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:231:1: ruleWeakImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportRule()); 
            }
            pushFollow(FOLLOW_ruleWeakImport_in_entryRuleWeakImport427);
            ruleWeakImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeakImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeakImport434); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:238:1: ruleWeakImport : ( ( rule__WeakImport__Group__0 ) ) ;
    public final void ruleWeakImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:242:2: ( ( ( rule__WeakImport__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:243:1: ( ( rule__WeakImport__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:243:1: ( ( rule__WeakImport__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:244:1: ( rule__WeakImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:245:1: ( rule__WeakImport__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:245:2: rule__WeakImport__Group__0
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__0_in_ruleWeakImport460);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:257:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:258:1: ( ruleOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:259:1: ruleOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionRule()); 
            }
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption487);
            ruleOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption494); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:266:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:270:2: ( ( ( rule__Option__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:271:1: ( ( rule__Option__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:271:1: ( ( rule__Option__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:272:1: ( rule__Option__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:273:1: ( rule__Option__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:273:2: rule__Option__Group__0
            {
            pushFollow(FOLLOW_rule__Option__Group__0_in_ruleOption520);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:285:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:286:1: ( ruleValue EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:287:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue547);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue554); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:294:1: ruleValue : ( ruleSimpleValueLink ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:298:2: ( ( ruleSimpleValueLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:299:1: ( ruleSimpleValueLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:299:1: ( ruleSimpleValueLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:300:1: ruleSimpleValueLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getSimpleValueLinkParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleSimpleValueLink_in_ruleValue580);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:313:1: entryRuleSimpleValueLink : ruleSimpleValueLink EOF ;
    public final void entryRuleSimpleValueLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:314:1: ( ruleSimpleValueLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:315:1: ruleSimpleValueLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleValueLinkRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleValueLink_in_entryRuleSimpleValueLink606);
            ruleSimpleValueLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleValueLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleValueLink613); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:322:1: ruleSimpleValueLink : ( ( rule__SimpleValueLink__Alternatives ) ) ;
    public final void ruleSimpleValueLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:326:2: ( ( ( rule__SimpleValueLink__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:327:1: ( ( rule__SimpleValueLink__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:327:1: ( ( rule__SimpleValueLink__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:328:1: ( rule__SimpleValueLink__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleValueLinkAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:329:1: ( rule__SimpleValueLink__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:329:2: rule__SimpleValueLink__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleValueLink__Alternatives_in_ruleSimpleValueLink639);
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


    // $ANTLR start "entryRuleEnumLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:341:1: entryRuleEnumLink : ruleEnumLink EOF ;
    public final void entryRuleEnumLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:342:1: ( ruleEnumLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:343:1: ruleEnumLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLinkRule()); 
            }
            pushFollow(FOLLOW_ruleEnumLink_in_entryRuleEnumLink666);
            ruleEnumLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLink673); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEnumLink"


    // $ANTLR start "ruleEnumLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:350:1: ruleEnumLink : ( ( rule__EnumLink__TargetAssignment ) ) ;
    public final void ruleEnumLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:354:2: ( ( ( rule__EnumLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:355:1: ( ( rule__EnumLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:355:1: ( ( rule__EnumLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:356:1: ( rule__EnumLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:357:1: ( rule__EnumLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:357:2: rule__EnumLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__EnumLink__TargetAssignment_in_ruleEnumLink699);
            rule__EnumLink__TargetAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLinkAccess().getTargetAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumLink"


    // $ANTLR start "entryRuleStringLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:369:1: entryRuleStringLink : ruleStringLink EOF ;
    public final void entryRuleStringLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:370:1: ( ruleStringLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:371:1: ruleStringLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLinkRule()); 
            }
            pushFollow(FOLLOW_ruleStringLink_in_entryRuleStringLink726);
            ruleStringLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLink733); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:378:1: ruleStringLink : ( ( rule__StringLink__TargetAssignment ) ) ;
    public final void ruleStringLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:382:2: ( ( ( rule__StringLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:383:1: ( ( rule__StringLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:383:1: ( ( rule__StringLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:384:1: ( rule__StringLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:385:1: ( rule__StringLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:385:2: rule__StringLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__StringLink__TargetAssignment_in_ruleStringLink759);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:397:1: entryRuleBooleanLink : ruleBooleanLink EOF ;
    public final void entryRuleBooleanLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:398:1: ( ruleBooleanLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:399:1: ruleBooleanLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLinkRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink786);
            ruleBooleanLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLink793); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:406:1: ruleBooleanLink : ( ( rule__BooleanLink__TargetAssignment ) ) ;
    public final void ruleBooleanLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:410:2: ( ( ( rule__BooleanLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:411:1: ( ( rule__BooleanLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:411:1: ( ( rule__BooleanLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:412:1: ( rule__BooleanLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:413:1: ( rule__BooleanLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:413:2: rule__BooleanLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLink__TargetAssignment_in_ruleBooleanLink819);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:425:1: entryRuleNumberLink : ruleNumberLink EOF ;
    public final void entryRuleNumberLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:426:1: ( ruleNumberLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:427:1: ruleNumberLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLinkRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLink_in_entryRuleNumberLink846);
            ruleNumberLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLink853); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:434:1: ruleNumberLink : ( ( rule__NumberLink__Alternatives ) ) ;
    public final void ruleNumberLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:438:2: ( ( ( rule__NumberLink__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:439:1: ( ( rule__NumberLink__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:439:1: ( ( rule__NumberLink__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:440:1: ( rule__NumberLink__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLinkAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:441:1: ( rule__NumberLink__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:441:2: rule__NumberLink__Alternatives
            {
            pushFollow(FOLLOW_rule__NumberLink__Alternatives_in_ruleNumberLink879);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:453:1: entryRuleIntLink : ruleIntLink EOF ;
    public final void entryRuleIntLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:454:1: ( ruleIntLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:455:1: ruleIntLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLinkRule()); 
            }
            pushFollow(FOLLOW_ruleIntLink_in_entryRuleIntLink906);
            ruleIntLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLink913); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:462:1: ruleIntLink : ( ( rule__IntLink__TargetAssignment ) ) ;
    public final void ruleIntLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:466:2: ( ( ( rule__IntLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:467:1: ( ( rule__IntLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:467:1: ( ( rule__IntLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:468:1: ( rule__IntLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:469:1: ( rule__IntLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:469:2: rule__IntLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__IntLink__TargetAssignment_in_ruleIntLink939);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:481:1: entryRuleDoubleLink : ruleDoubleLink EOF ;
    public final void entryRuleDoubleLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:482:1: ( ruleDoubleLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:483:1: ruleDoubleLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLinkRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink966);
            ruleDoubleLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLink973); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:490:1: ruleDoubleLink : ( ( rule__DoubleLink__TargetAssignment ) ) ;
    public final void ruleDoubleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:494:2: ( ( ( rule__DoubleLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:495:1: ( ( rule__DoubleLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:495:1: ( ( rule__DoubleLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:496:1: ( rule__DoubleLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:497:1: ( rule__DoubleLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:497:2: rule__DoubleLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__DoubleLink__TargetAssignment_in_ruleDoubleLink999);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:509:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:510:1: ( ruleComplexType EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:511:1: ruleComplexType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeRule()); 
            }
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType1026);
            ruleComplexType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType1033); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:518:1: ruleComplexType : ( ( rule__ComplexType__Alternatives ) ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:522:2: ( ( ( rule__ComplexType__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:523:1: ( ( rule__ComplexType__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:523:1: ( ( rule__ComplexType__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:524:1: ( rule__ComplexType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:525:1: ( rule__ComplexType__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:525:2: rule__ComplexType__Alternatives
            {
            pushFollow(FOLLOW_rule__ComplexType__Alternatives_in_ruleComplexType1059);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:537:1: entryRuleExtensibleType : ruleExtensibleType EOF ;
    public final void entryRuleExtensibleType() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:538:1: ( ruleExtensibleType EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:539:1: ruleExtensibleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensibleTypeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType1086);
            ruleExtensibleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensibleTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensibleType1093); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:546:1: ruleExtensibleType : ( ( rule__ExtensibleType__Alternatives ) ) ;
    public final void ruleExtensibleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:550:2: ( ( ( rule__ExtensibleType__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:551:1: ( ( rule__ExtensibleType__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:551:1: ( ( rule__ExtensibleType__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:552:1: ( rule__ExtensibleType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensibleTypeAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:553:1: ( rule__ExtensibleType__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:553:2: rule__ExtensibleType__Alternatives
            {
            pushFollow(FOLLOW_rule__ExtensibleType__Alternatives_in_ruleExtensibleType1119);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:565:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:566:1: ( ruleMessage EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:567:1: ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage1146);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage1153); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:574:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:578:2: ( ( ( rule__Message__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:579:1: ( ( rule__Message__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:579:1: ( ( rule__Message__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:580:1: ( rule__Message__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:581:1: ( rule__Message__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:581:2: rule__Message__Group__0
            {
            pushFollow(FOLLOW_rule__Message__Group__0_in_ruleMessage1179);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:593:1: entryRuleMessageElement : ruleMessageElement EOF ;
    public final void entryRuleMessageElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:594:1: ( ruleMessageElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:595:1: ruleMessageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageElementRule()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_entryRuleMessageElement1206);
            ruleMessageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageElement1213); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:602:1: ruleMessageElement : ( ( rule__MessageElement__Alternatives ) ) ;
    public final void ruleMessageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:606:2: ( ( ( rule__MessageElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:607:1: ( ( rule__MessageElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:607:1: ( ( rule__MessageElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:608:1: ( rule__MessageElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:609:1: ( rule__MessageElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:609:2: rule__MessageElement__Alternatives
            {
            pushFollow(FOLLOW_rule__MessageElement__Alternatives_in_ruleMessageElement1239);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:621:1: entryRuleIndexedElement : ruleIndexedElement EOF ;
    public final void entryRuleIndexedElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:622:1: ( ruleIndexedElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:623:1: ruleIndexedElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexedElementRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement1266);
            ruleIndexedElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexedElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedElement1273); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:630:1: ruleIndexedElement : ( ( rule__IndexedElement__Alternatives ) ) ;
    public final void ruleIndexedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:634:2: ( ( ( rule__IndexedElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:635:1: ( ( rule__IndexedElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:635:1: ( ( rule__IndexedElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:636:1: ( rule__IndexedElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexedElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:637:1: ( rule__IndexedElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:637:2: rule__IndexedElement__Alternatives
            {
            pushFollow(FOLLOW_rule__IndexedElement__Alternatives_in_ruleIndexedElement1299);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:649:1: entryRuleExtensionRange : ruleExtensionRange EOF ;
    public final void entryRuleExtensionRange() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:650:1: ( ruleExtensionRange EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:651:1: ruleExtensionRange EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange1326);
            ruleExtensionRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionRange1333); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:658:1: ruleExtensionRange : ( ( rule__ExtensionRange__Group__0 ) ) ;
    public final void ruleExtensionRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:662:2: ( ( ( rule__ExtensionRange__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:663:1: ( ( rule__ExtensionRange__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:663:1: ( ( rule__ExtensionRange__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:664:1: ( rule__ExtensionRange__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:665:1: ( rule__ExtensionRange__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:665:2: rule__ExtensionRange__Group__0
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__0_in_ruleExtensionRange1359);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:677:1: entryRuleMessageField : ruleMessageField EOF ;
    public final void entryRuleMessageField() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:678:1: ( ruleMessageField EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:679:1: ruleMessageField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldRule()); 
            }
            pushFollow(FOLLOW_ruleMessageField_in_entryRuleMessageField1386);
            ruleMessageField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageField1393); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:686:1: ruleMessageField : ( ( rule__MessageField__Group__0 ) ) ;
    public final void ruleMessageField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:690:2: ( ( ( rule__MessageField__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:691:1: ( ( rule__MessageField__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:691:1: ( ( rule__MessageField__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:692:1: ( rule__MessageField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:693:1: ( rule__MessageField__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:693:2: rule__MessageField__Group__0
            {
            pushFollow(FOLLOW_rule__MessageField__Group__0_in_ruleMessageField1419);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:705:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:706:1: ( ruleGroup EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:707:1: ruleGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupRule()); 
            }
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup1446);
            ruleGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup1453); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:714:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:718:2: ( ( ( rule__Group__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:719:1: ( ( rule__Group__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:719:1: ( ( rule__Group__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:720:1: ( rule__Group__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:721:1: ( rule__Group__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:721:2: rule__Group__Group__0
            {
            pushFollow(FOLLOW_rule__Group__Group__0_in_ruleGroup1479);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:733:1: entryRuleTypeLink : ruleTypeLink EOF ;
    public final void entryRuleTypeLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:734:1: ( ruleTypeLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:735:1: ruleTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_entryRuleTypeLink1506);
            ruleTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLink1513); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:742:1: ruleTypeLink : ( ( rule__TypeLink__Alternatives ) ) ;
    public final void ruleTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:746:2: ( ( ( rule__TypeLink__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:747:1: ( ( rule__TypeLink__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:747:1: ( ( rule__TypeLink__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:748:1: ( rule__TypeLink__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLinkAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:749:1: ( rule__TypeLink__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:749:2: rule__TypeLink__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeLink__Alternatives_in_ruleTypeLink1539);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:761:1: entryRuleComplexTypeLink : ruleComplexTypeLink EOF ;
    public final void entryRuleComplexTypeLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:762:1: ( ruleComplexTypeLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:763:1: ruleComplexTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink1566);
            ruleComplexTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLink1573); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:770:1: ruleComplexTypeLink : ( ( rule__ComplexTypeLink__TargetAssignment ) ) ;
    public final void ruleComplexTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:774:2: ( ( ( rule__ComplexTypeLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:775:1: ( ( rule__ComplexTypeLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:775:1: ( ( rule__ComplexTypeLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:776:1: ( rule__ComplexTypeLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:777:1: ( rule__ComplexTypeLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:777:2: rule__ComplexTypeLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__ComplexTypeLink__TargetAssignment_in_ruleComplexTypeLink1599);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:789:1: entryRuleScalarTypeLink : ruleScalarTypeLink EOF ;
    public final void entryRuleScalarTypeLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:790:1: ( ruleScalarTypeLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:791:1: ruleScalarTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink1626);
            ruleScalarTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScalarTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarTypeLink1633); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:798:1: ruleScalarTypeLink : ( ( rule__ScalarTypeLink__TargetAssignment ) ) ;
    public final void ruleScalarTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:802:2: ( ( ( rule__ScalarTypeLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:803:1: ( ( rule__ScalarTypeLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:803:1: ( ( rule__ScalarTypeLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:804:1: ( rule__ScalarTypeLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:805:1: ( rule__ScalarTypeLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:805:2: rule__ScalarTypeLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__ScalarTypeLink__TargetAssignment_in_ruleScalarTypeLink1659);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:817:1: entryRuleFieldOptions : ruleFieldOptions EOF ;
    public final void entryRuleFieldOptions() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:818:1: ( ruleFieldOptions EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:819:1: ruleFieldOptions EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions1686);
            ruleFieldOptions();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOptions1693); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:826:1: ruleFieldOptions : ( ( rule__FieldOptions__Group__0 ) ) ;
    public final void ruleFieldOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:830:2: ( ( ( rule__FieldOptions__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:831:1: ( ( rule__FieldOptions__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:831:1: ( ( rule__FieldOptions__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:832:1: ( rule__FieldOptions__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:833:1: ( rule__FieldOptions__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:833:2: rule__FieldOptions__Group__0
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__0_in_ruleFieldOptions1719);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:845:1: entryRuleFieldOption : ruleFieldOption EOF ;
    public final void entryRuleFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:846:1: ( ruleFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:847:1: ruleFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_entryRuleFieldOption1746);
            ruleFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOption1753); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:854:1: ruleFieldOption : ( ( rule__FieldOption__Alternatives ) ) ;
    public final void ruleFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:858:2: ( ( ( rule__FieldOption__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:859:1: ( ( rule__FieldOption__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:859:1: ( ( rule__FieldOption__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:860:1: ( rule__FieldOption__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:861:1: ( rule__FieldOption__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:861:2: rule__FieldOption__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldOption__Alternatives_in_ruleFieldOption1779);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:873:1: entryRuleDefaultValueFieldOption : ruleDefaultValueFieldOption EOF ;
    public final void entryRuleDefaultValueFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:874:1: ( ruleDefaultValueFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:875:1: ruleDefaultValueFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption1806);
            ruleDefaultValueFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultValueFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValueFieldOption1813); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:882:1: ruleDefaultValueFieldOption : ( ( rule__DefaultValueFieldOption__Group__0 ) ) ;
    public final void ruleDefaultValueFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:886:2: ( ( ( rule__DefaultValueFieldOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:887:1: ( ( rule__DefaultValueFieldOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:887:1: ( ( rule__DefaultValueFieldOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:888:1: ( rule__DefaultValueFieldOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:889:1: ( rule__DefaultValueFieldOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:889:2: rule__DefaultValueFieldOption__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__0_in_ruleDefaultValueFieldOption1839);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:901:1: entryRuleNativeFieldOption : ruleNativeFieldOption EOF ;
    public final void entryRuleNativeFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:902:1: ( ruleNativeFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:903:1: ruleNativeFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption1866);
            ruleNativeFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeFieldOption1873); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:910:1: ruleNativeFieldOption : ( ( rule__NativeFieldOption__Group__0 ) ) ;
    public final void ruleNativeFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:914:2: ( ( ( rule__NativeFieldOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:915:1: ( ( rule__NativeFieldOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:915:1: ( ( rule__NativeFieldOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:916:1: ( rule__NativeFieldOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:917:1: ( rule__NativeFieldOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:917:2: rule__NativeFieldOption__Group__0
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__0_in_ruleNativeFieldOption1899);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:929:1: entryRuleOptionSource : ruleOptionSource EOF ;
    public final void entryRuleOptionSource() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:930:1: ( ruleOptionSource EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:931:1: ruleOptionSource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceRule()); 
            }
            pushFollow(FOLLOW_ruleOptionSource_in_entryRuleOptionSource1926);
            ruleOptionSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionSourceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionSource1933); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:938:1: ruleOptionSource : ( ( rule__OptionSource__TargetAssignment ) ) ;
    public final void ruleOptionSource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:942:2: ( ( ( rule__OptionSource__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:943:1: ( ( rule__OptionSource__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:943:1: ( ( rule__OptionSource__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:944:1: ( rule__OptionSource__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:945:1: ( rule__OptionSource__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:945:2: rule__OptionSource__TargetAssignment
            {
            pushFollow(FOLLOW_rule__OptionSource__TargetAssignment_in_ruleOptionSource1959);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:957:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:958:1: ( ruleEnum EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:959:1: ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum1986);
            ruleEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum1993); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:966:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:970:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:971:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:971:1: ( ( rule__Enum__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:972:1: ( rule__Enum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:973:1: ( rule__Enum__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:973:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum2019);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:985:1: entryRuleEnumElement : ruleEnumElement EOF ;
    public final void entryRuleEnumElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:986:1: ( ruleEnumElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:987:1: ruleEnumElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumElementRule()); 
            }
            pushFollow(FOLLOW_ruleEnumElement_in_entryRuleEnumElement2046);
            ruleEnumElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumElement2053); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:994:1: ruleEnumElement : ( ( rule__EnumElement__Alternatives ) ) ;
    public final void ruleEnumElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:998:2: ( ( ( rule__EnumElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:999:1: ( ( rule__EnumElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:999:1: ( ( rule__EnumElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1000:1: ( rule__EnumElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1001:1: ( rule__EnumElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1001:2: rule__EnumElement__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumElement__Alternatives_in_ruleEnumElement2079);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1013:1: entryRuleEnumField : ruleEnumField EOF ;
    public final void entryRuleEnumField() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1014:1: ( ruleEnumField EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1015:1: ruleEnumField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldRule()); 
            }
            pushFollow(FOLLOW_ruleEnumField_in_entryRuleEnumField2106);
            ruleEnumField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumField2113); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1022:1: ruleEnumField : ( ( rule__EnumField__Group__0 ) ) ;
    public final void ruleEnumField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1026:2: ( ( ( rule__EnumField__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1027:1: ( ( rule__EnumField__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1027:1: ( ( rule__EnumField__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1028:1: ( rule__EnumField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1029:1: ( rule__EnumField__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1029:2: rule__EnumField__Group__0
            {
            pushFollow(FOLLOW_rule__EnumField__Group__0_in_ruleEnumField2139);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1041:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1042:1: ( ruleService EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1043:1: ruleService EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService2166);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService2173); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1050:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1054:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1055:1: ( ( rule__Service__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1055:1: ( ( rule__Service__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1056:1: ( rule__Service__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1057:1: ( rule__Service__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1057:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService2199);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1069:1: entryRuleServiceElement : ruleServiceElement EOF ;
    public final void entryRuleServiceElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1070:1: ( ruleServiceElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1071:1: ruleServiceElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceElementRule()); 
            }
            pushFollow(FOLLOW_ruleServiceElement_in_entryRuleServiceElement2226);
            ruleServiceElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceElement2233); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1078:1: ruleServiceElement : ( ( rule__ServiceElement__Alternatives ) ) ;
    public final void ruleServiceElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1082:2: ( ( ( rule__ServiceElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1083:1: ( ( rule__ServiceElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1083:1: ( ( rule__ServiceElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1084:1: ( rule__ServiceElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1085:1: ( rule__ServiceElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1085:2: rule__ServiceElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ServiceElement__Alternatives_in_ruleServiceElement2259);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1097:1: entryRuleRpc : ruleRpc EOF ;
    public final void entryRuleRpc() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1098:1: ( ruleRpc EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1099:1: ruleRpc EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcRule()); 
            }
            pushFollow(FOLLOW_ruleRpc_in_entryRuleRpc2286);
            ruleRpc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRpc2293); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1106:1: ruleRpc : ( ( rule__Rpc__Group__0 ) ) ;
    public final void ruleRpc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1110:2: ( ( ( rule__Rpc__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1111:1: ( ( rule__Rpc__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1111:1: ( ( rule__Rpc__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1112:1: ( rule__Rpc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1113:1: ( rule__Rpc__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1113:2: rule__Rpc__Group__0
            {
            pushFollow(FOLLOW_rule__Rpc__Group__0_in_ruleRpc2319);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1125:1: entryRuleMessageLink : ruleMessageLink EOF ;
    public final void entryRuleMessageLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1126:1: ( ruleMessageLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1127:1: ruleMessageLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkRule()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_entryRuleMessageLink2346);
            ruleMessageLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageLink2353); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1134:1: ruleMessageLink : ( ( rule__MessageLink__TargetAssignment ) ) ;
    public final void ruleMessageLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1138:2: ( ( ( rule__MessageLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1139:1: ( ( rule__MessageLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1139:1: ( ( rule__MessageLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1140:1: ( rule__MessageLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1141:1: ( rule__MessageLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1141:2: rule__MessageLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__MessageLink__TargetAssignment_in_ruleMessageLink2379);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1153:1: entryRuleExtend : ruleExtend EOF ;
    public final void entryRuleExtend() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1154:1: ( ruleExtend EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1155:1: ruleExtend EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendRule()); 
            }
            pushFollow(FOLLOW_ruleExtend_in_entryRuleExtend2406);
            ruleExtend();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtend2413); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1162:1: ruleExtend : ( ( rule__Extend__Group__0 ) ) ;
    public final void ruleExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1166:2: ( ( ( rule__Extend__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1167:1: ( ( rule__Extend__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1167:1: ( ( rule__Extend__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1168:1: ( rule__Extend__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1169:1: ( rule__Extend__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1169:2: rule__Extend__Group__0
            {
            pushFollow(FOLLOW_rule__Extend__Group__0_in_ruleExtend2439);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1181:1: entryRuleVar_full : ruleVar_full EOF ;
    public final void entryRuleVar_full() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1182:1: ( ruleVar_full EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1183:1: ruleVar_full EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_fullRule()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_entryRuleVar_full2466);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_fullRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar_full2473); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1190:1: ruleVar_full : ( ( rule__Var_full__Alternatives ) ) ;
    public final void ruleVar_full() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1194:2: ( ( ( rule__Var_full__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1195:1: ( ( rule__Var_full__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1195:1: ( ( rule__Var_full__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1196:1: ( rule__Var_full__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_fullAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1197:1: ( rule__Var_full__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1197:2: rule__Var_full__Alternatives
            {
            pushFollow(FOLLOW_rule__Var_full__Alternatives_in_ruleVar_full2499);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1209:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1210:1: ( ruleVar EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1211:1: ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar2526);
            ruleVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar2533); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1218:1: ruleVar : ( ( rule__Var__Alternatives ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1222:2: ( ( ( rule__Var__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1223:1: ( ( rule__Var__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1223:1: ( ( rule__Var__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1224:1: ( rule__Var__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1225:1: ( rule__Var__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1225:2: rule__Var__Alternatives
            {
            pushFollow(FOLLOW_rule__Var__Alternatives_in_ruleVar2559);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1237:1: entryRuleFULL_ID : ruleFULL_ID EOF ;
    public final void entryRuleFULL_ID() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1238:1: ( ruleFULL_ID EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1239:1: ruleFULL_ID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDRule()); 
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID2586);
            ruleFULL_ID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFULL_IDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFULL_ID2593); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1246:1: ruleFULL_ID : ( ( rule__FULL_ID__Group__0 ) ) ;
    public final void ruleFULL_ID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1250:2: ( ( ( rule__FULL_ID__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1251:1: ( ( rule__FULL_ID__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1251:1: ( ( rule__FULL_ID__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1252:1: ( rule__FULL_ID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1253:1: ( rule__FULL_ID__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1253:2: rule__FULL_ID__Group__0
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group__0_in_ruleFULL_ID2619);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1265:1: entryRuleVarReserved : ruleVarReserved EOF ;
    public final void entryRuleVarReserved() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1266:1: ( ruleVarReserved EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1267:1: ruleVarReserved EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReservedRule()); 
            }
            pushFollow(FOLLOW_ruleVarReserved_in_entryRuleVarReserved2646);
            ruleVarReserved();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarReservedRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarReserved2653); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1274:1: ruleVarReserved : ( ( rule__VarReserved__Alternatives ) ) ;
    public final void ruleVarReserved() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1278:2: ( ( ( rule__VarReserved__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1279:1: ( ( rule__VarReserved__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1279:1: ( ( rule__VarReserved__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1280:1: ( rule__VarReserved__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReservedAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1281:1: ( rule__VarReserved__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1281:2: rule__VarReserved__Alternatives
            {
            pushFollow(FOLLOW_rule__VarReserved__Alternatives_in_ruleVarReserved2679);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1296:1: ruleBOOL : ( ( rule__BOOL__Alternatives ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1300:1: ( ( ( rule__BOOL__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1301:1: ( ( rule__BOOL__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1301:1: ( ( rule__BOOL__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1302:1: ( rule__BOOL__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1303:1: ( rule__BOOL__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1303:2: rule__BOOL__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL2718);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1315:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1319:1: ( ( ( rule__Modifier__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1320:1: ( ( rule__Modifier__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1320:1: ( ( rule__Modifier__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1321:1: ( rule__Modifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModifierAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1322:1: ( rule__Modifier__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1322:2: rule__Modifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Modifier__Alternatives_in_ruleModifier2754);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1334:1: ruleScalarType : ( ( rule__ScalarType__Alternatives ) ) ;
    public final void ruleScalarType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1338:1: ( ( ( rule__ScalarType__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1339:1: ( ( rule__ScalarType__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1339:1: ( ( rule__ScalarType__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1340:1: ( rule__ScalarType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1341:1: ( rule__ScalarType__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1341:2: rule__ScalarType__Alternatives
            {
            pushFollow(FOLLOW_rule__ScalarType__Alternatives_in_ruleScalarType2790);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1352:1: rule__Statement__Alternatives : ( ( rulePackage ) | ( ruleImport ) | ( ruleComplexType ) | ( ruleExtend ) | ( ruleService ) | ( ruleOption ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1356:1: ( ( rulePackage ) | ( ruleImport ) | ( ruleComplexType ) | ( ruleExtend ) | ( ruleService ) | ( ruleOption ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1357:1: ( rulePackage )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1357:1: ( rulePackage )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1358:1: rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getPackageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePackage_in_rule__Statement__Alternatives2825);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1363:6: ( ruleImport )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1363:6: ( ruleImport )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1364:1: ruleImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getImportParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleImport_in_rule__Statement__Alternatives2842);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1369:6: ( ruleComplexType )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1369:6: ( ruleComplexType )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1370:1: ruleComplexType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getComplexTypeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleComplexType_in_rule__Statement__Alternatives2859);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1375:6: ( ruleExtend )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1375:6: ( ruleExtend )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1376:1: ruleExtend
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getExtendParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleExtend_in_rule__Statement__Alternatives2876);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1381:6: ( ruleService )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1381:6: ( ruleService )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1382:1: ruleService
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getServiceParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleService_in_rule__Statement__Alternatives2893);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1387:6: ( ruleOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1387:6: ( ruleOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1388:1: ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getOptionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleOption_in_rule__Statement__Alternatives2910);
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


    // $ANTLR start "rule__Import__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1398:1: rule__Import__Alternatives : ( ( rulePublicImport ) | ( ruleWeakImport ) );
    public final void rule__Import__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1402:1: ( ( rulePublicImport ) | ( ruleWeakImport ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==51) ) {
                    alt2=1;
                }
                else if ( (LA2_1==52) ) {
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1403:1: ( rulePublicImport )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1403:1: ( rulePublicImport )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1404:1: rulePublicImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getPublicImportParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePublicImport_in_rule__Import__Alternatives2942);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1409:6: ( ruleWeakImport )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1409:6: ( ruleWeakImport )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1410:1: ruleWeakImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getWeakImportParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleWeakImport_in_rule__Import__Alternatives2959);
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


    // $ANTLR start "rule__SimpleValueLink__Alternatives"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1420:1: rule__SimpleValueLink__Alternatives : ( ( ruleNumberLink ) | ( ruleBooleanLink ) | ( ruleStringLink ) | ( ruleEnumLink ) );
    public final void rule__SimpleValueLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1424:1: ( ( ruleNumberLink ) | ( ruleBooleanLink ) | ( ruleStringLink ) | ( ruleEnumLink ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_NUMINT:
            case RULE_NUMDOUBLE:
                {
                alt3=1;
                }
                break;
            case 47:
            case 48:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1425:1: ( ruleNumberLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1425:1: ( ruleNumberLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1426:1: ruleNumberLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getNumberLinkParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleNumberLink_in_rule__SimpleValueLink__Alternatives2991);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1431:6: ( ruleBooleanLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1431:6: ( ruleBooleanLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1432:1: ruleBooleanLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getBooleanLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLink_in_rule__SimpleValueLink__Alternatives3008);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1437:6: ( ruleStringLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1437:6: ( ruleStringLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1438:1: ruleStringLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getStringLinkParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleStringLink_in_rule__SimpleValueLink__Alternatives3025);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1443:6: ( ruleEnumLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1443:6: ( ruleEnumLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1444:1: ruleEnumLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getEnumLinkParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleEnumLink_in_rule__SimpleValueLink__Alternatives3042);
                    ruleEnumLink();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleValueLinkAccess().getEnumLinkParserRuleCall_3()); 
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1454:1: rule__NumberLink__Alternatives : ( ( ruleIntLink ) | ( ruleDoubleLink ) );
    public final void rule__NumberLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1458:1: ( ( ruleIntLink ) | ( ruleDoubleLink ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_NUMINT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_NUMDOUBLE) ) {
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1459:1: ( ruleIntLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1459:1: ( ruleIntLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1460:1: ruleIntLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLinkAccess().getIntLinkParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleIntLink_in_rule__NumberLink__Alternatives3074);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1465:6: ( ruleDoubleLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1465:6: ( ruleDoubleLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1466:1: ruleDoubleLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLinkAccess().getDoubleLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleDoubleLink_in_rule__NumberLink__Alternatives3091);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1476:1: rule__ComplexType__Alternatives : ( ( ruleEnum ) | ( ruleExtensibleType ) );
    public final void rule__ComplexType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1480:1: ( ( ruleEnum ) | ( ruleExtensibleType ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==18||(LA5_0>=21 && LA5_0<=23)) ) {
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1481:1: ( ruleEnum )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1481:1: ( ruleEnum )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1482:1: ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComplexTypeAccess().getEnumParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEnum_in_rule__ComplexType__Alternatives3123);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1487:6: ( ruleExtensibleType )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1487:6: ( ruleExtensibleType )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1488:1: ruleExtensibleType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComplexTypeAccess().getExtensibleTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleExtensibleType_in_rule__ComplexType__Alternatives3140);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1498:1: rule__ExtensibleType__Alternatives : ( ( ruleMessage ) | ( ruleGroup ) );
    public final void rule__ExtensibleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1502:1: ( ( ruleMessage ) | ( ruleGroup ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=21 && LA6_0<=23)) ) {
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1503:1: ( ruleMessage )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1503:1: ( ruleMessage )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1504:1: ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensibleTypeAccess().getMessageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMessage_in_rule__ExtensibleType__Alternatives3172);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1509:6: ( ruleGroup )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1509:6: ( ruleGroup )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1510:1: ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensibleTypeAccess().getGroupParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGroup_in_rule__ExtensibleType__Alternatives3189);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1520:1: rule__MessageElement__Alternatives : ( ( ruleMessage ) | ( ruleIndexedElement ) | ( ruleEnum ) | ( ruleService ) | ( ruleExtend ) | ( ruleExtensionRange ) | ( ruleOption ) );
    public final void rule__MessageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1524:1: ( ( ruleMessage ) | ( ruleIndexedElement ) | ( ruleEnum ) | ( ruleService ) | ( ruleExtend ) | ( ruleExtensionRange ) | ( ruleOption ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 21:
            case 22:
            case 23:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 25:
                {
                alt7=5;
                }
                break;
            case 24:
                {
                alt7=6;
                }
                break;
            case 17:
                {
                alt7=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1525:1: ( ruleMessage )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1525:1: ( ruleMessage )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1526:1: ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getMessageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMessage_in_rule__MessageElement__Alternatives3221);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1531:6: ( ruleIndexedElement )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1531:6: ( ruleIndexedElement )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1532:1: ruleIndexedElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getIndexedElementParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIndexedElement_in_rule__MessageElement__Alternatives3238);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1537:6: ( ruleEnum )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1537:6: ( ruleEnum )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1538:1: ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getEnumParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleEnum_in_rule__MessageElement__Alternatives3255);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1543:6: ( ruleService )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1543:6: ( ruleService )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1544:1: ruleService
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getServiceParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleService_in_rule__MessageElement__Alternatives3272);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1549:6: ( ruleExtend )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1549:6: ( ruleExtend )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1550:1: ruleExtend
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getExtendParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleExtend_in_rule__MessageElement__Alternatives3289);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1555:6: ( ruleExtensionRange )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1555:6: ( ruleExtensionRange )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1556:1: ruleExtensionRange
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getExtensionRangeParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleExtensionRange_in_rule__MessageElement__Alternatives3306);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1561:6: ( ruleOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1561:6: ( ruleOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1562:1: ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getOptionParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleOption_in_rule__MessageElement__Alternatives3323);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1572:1: rule__IndexedElement__Alternatives : ( ( ruleMessageField ) | ( ruleGroup ) );
    public final void rule__IndexedElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1576:1: ( ( ruleMessageField ) | ( ruleGroup ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1577:1: ( ruleMessageField )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1577:1: ( ruleMessageField )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1578:1: ruleMessageField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIndexedElementAccess().getMessageFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMessageField_in_rule__IndexedElement__Alternatives3355);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1583:6: ( ruleGroup )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1583:6: ( ruleGroup )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1584:1: ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIndexedElementAccess().getGroupParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGroup_in_rule__IndexedElement__Alternatives3372);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1594:1: rule__TypeLink__Alternatives : ( ( ( ruleScalarTypeLink ) ) | ( ruleComplexTypeLink ) );
    public final void rule__TypeLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1598:1: ( ( ( ruleScalarTypeLink ) ) | ( ruleComplexTypeLink ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1599:1: ( ( ruleScalarTypeLink ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1599:1: ( ( ruleScalarTypeLink ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1600:1: ( ruleScalarTypeLink )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLinkAccess().getScalarTypeLinkParserRuleCall_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1601:1: ( ruleScalarTypeLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1601:3: ruleScalarTypeLink
                    {
                    pushFollow(FOLLOW_ruleScalarTypeLink_in_rule__TypeLink__Alternatives3405);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1605:6: ( ruleComplexTypeLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1605:6: ( ruleComplexTypeLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1606:1: ruleComplexTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLinkAccess().getComplexTypeLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleComplexTypeLink_in_rule__TypeLink__Alternatives3423);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1616:1: rule__FieldOption__Alternatives : ( ( ( ruleDefaultValueFieldOption ) ) | ( ruleNativeFieldOption ) );
    public final void rule__FieldOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1620:1: ( ( ( ruleDefaultValueFieldOption ) ) | ( ruleNativeFieldOption ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1621:1: ( ( ruleDefaultValueFieldOption ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1621:1: ( ( ruleDefaultValueFieldOption ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1622:1: ( ruleDefaultValueFieldOption )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldOptionAccess().getDefaultValueFieldOptionParserRuleCall_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1623:1: ( ruleDefaultValueFieldOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1623:3: ruleDefaultValueFieldOption
                    {
                    pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_rule__FieldOption__Alternatives3456);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1627:6: ( ruleNativeFieldOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1627:6: ( ruleNativeFieldOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1628:1: ruleNativeFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldOptionAccess().getNativeFieldOptionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNativeFieldOption_in_rule__FieldOption__Alternatives3474);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1638:1: rule__EnumElement__Alternatives : ( ( ruleEnumField ) | ( ruleOption ) );
    public final void rule__EnumElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1642:1: ( ( ruleEnumField ) | ( ruleOption ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1643:1: ( ruleEnumField )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1643:1: ( ruleEnumField )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1644:1: ruleEnumField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumElementAccess().getEnumFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEnumField_in_rule__EnumElement__Alternatives3506);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1649:6: ( ruleOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1649:6: ( ruleOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1650:1: ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumElementAccess().getOptionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleOption_in_rule__EnumElement__Alternatives3523);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1660:1: rule__ServiceElement__Alternatives : ( ( ruleRpc ) | ( ruleOption ) );
    public final void rule__ServiceElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1664:1: ( ( ruleRpc ) | ( ruleOption ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( (LA12_0==17) ) {
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1665:1: ( ruleRpc )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1665:1: ( ruleRpc )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1666:1: ruleRpc
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getServiceElementAccess().getRpcParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleRpc_in_rule__ServiceElement__Alternatives3555);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1671:6: ( ruleOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1671:6: ( ruleOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1672:1: ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getServiceElementAccess().getOptionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleOption_in_rule__ServiceElement__Alternatives3572);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1682:1: rule__Var_full__Alternatives : ( ( ruleFULL_ID ) | ( ruleVar ) );
    public final void rule__Var_full__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1686:1: ( ( ruleFULL_ID ) | ( ruleVar ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||LA13_1==RULE_ID||(LA13_1>=13 && LA13_1<=46)||(LA13_1>=49 && LA13_1<=50)) ) {
                    alt13=2;
                }
                else if ( (LA13_1==60) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1687:1: ( ruleFULL_ID )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1687:1: ( ruleFULL_ID )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1688:1: ruleFULL_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_fullAccess().getFULL_IDParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleFULL_ID_in_rule__Var_full__Alternatives3604);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1693:6: ( ruleVar )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1693:6: ( ruleVar )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1694:1: ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_fullAccess().getVarParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVar_in_rule__Var_full__Alternatives3621);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1704:1: rule__Var__Alternatives : ( ( RULE_ID ) | ( ruleVarReserved ) );
    public final void rule__Var__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1708:1: ( ( RULE_ID ) | ( ruleVarReserved ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=13 && LA14_0<=46)) ) {
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1709:1: ( RULE_ID )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1709:1: ( RULE_ID )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1710:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Var__Alternatives3653); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1715:6: ( ruleVarReserved )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1715:6: ( ruleVarReserved )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1716:1: ruleVarReserved
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarAccess().getVarReservedParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVarReserved_in_rule__Var__Alternatives3670);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1726:1: rule__VarReserved__Alternatives : ( ( 'to' ) | ( 'package' ) | ( 'syntax' ) | ( 'import' ) | ( 'option' ) | ( 'message' ) | ( 'service' ) | ( 'enum' ) | ( 'required' ) | ( 'optional' ) | ( 'repeated' ) | ( 'extensions' ) | ( 'extend' ) | ( 'group' ) | ( 'rpc' ) | ( 'returns' ) | ( 'int32' ) | ( 'int64' ) | ( 'uint32' ) | ( 'uint64' ) | ( 'sint32' ) | ( 'sint64' ) | ( 'fixed32' ) | ( 'fixed64' ) | ( 'sfixed32' ) | ( 'sfixed64' ) | ( 'float' ) | ( 'double' ) | ( 'bool' ) | ( 'string' ) | ( 'bytes' ) | ( 'default' ) | ( 'max' ) | ( 'void' ) );
    public final void rule__VarReserved__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1730:1: ( ( 'to' ) | ( 'package' ) | ( 'syntax' ) | ( 'import' ) | ( 'option' ) | ( 'message' ) | ( 'service' ) | ( 'enum' ) | ( 'required' ) | ( 'optional' ) | ( 'repeated' ) | ( 'extensions' ) | ( 'extend' ) | ( 'group' ) | ( 'rpc' ) | ( 'returns' ) | ( 'int32' ) | ( 'int64' ) | ( 'uint32' ) | ( 'uint64' ) | ( 'sint32' ) | ( 'sint64' ) | ( 'fixed32' ) | ( 'fixed64' ) | ( 'sfixed32' ) | ( 'sfixed64' ) | ( 'float' ) | ( 'double' ) | ( 'bool' ) | ( 'string' ) | ( 'bytes' ) | ( 'default' ) | ( 'max' ) | ( 'void' ) )
            int alt15=34;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt15=1;
                }
                break;
            case 14:
                {
                alt15=2;
                }
                break;
            case 15:
                {
                alt15=3;
                }
                break;
            case 16:
                {
                alt15=4;
                }
                break;
            case 17:
                {
                alt15=5;
                }
                break;
            case 18:
                {
                alt15=6;
                }
                break;
            case 19:
                {
                alt15=7;
                }
                break;
            case 20:
                {
                alt15=8;
                }
                break;
            case 21:
                {
                alt15=9;
                }
                break;
            case 22:
                {
                alt15=10;
                }
                break;
            case 23:
                {
                alt15=11;
                }
                break;
            case 24:
                {
                alt15=12;
                }
                break;
            case 25:
                {
                alt15=13;
                }
                break;
            case 26:
                {
                alt15=14;
                }
                break;
            case 27:
                {
                alt15=15;
                }
                break;
            case 28:
                {
                alt15=16;
                }
                break;
            case 29:
                {
                alt15=17;
                }
                break;
            case 30:
                {
                alt15=18;
                }
                break;
            case 31:
                {
                alt15=19;
                }
                break;
            case 32:
                {
                alt15=20;
                }
                break;
            case 33:
                {
                alt15=21;
                }
                break;
            case 34:
                {
                alt15=22;
                }
                break;
            case 35:
                {
                alt15=23;
                }
                break;
            case 36:
                {
                alt15=24;
                }
                break;
            case 37:
                {
                alt15=25;
                }
                break;
            case 38:
                {
                alt15=26;
                }
                break;
            case 39:
                {
                alt15=27;
                }
                break;
            case 40:
                {
                alt15=28;
                }
                break;
            case 41:
                {
                alt15=29;
                }
                break;
            case 42:
                {
                alt15=30;
                }
                break;
            case 43:
                {
                alt15=31;
                }
                break;
            case 44:
                {
                alt15=32;
                }
                break;
            case 45:
                {
                alt15=33;
                }
                break;
            case 46:
                {
                alt15=34;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1731:1: ( 'to' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1731:1: ( 'to' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1732:1: 'to'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getToKeyword_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__VarReserved__Alternatives3703); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getToKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1739:6: ( 'package' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1739:6: ( 'package' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1740:1: 'package'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getPackageKeyword_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__VarReserved__Alternatives3723); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getPackageKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1747:6: ( 'syntax' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1747:6: ( 'syntax' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1748:1: 'syntax'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSyntaxKeyword_2()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__VarReserved__Alternatives3743); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSyntaxKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1755:6: ( 'import' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1755:6: ( 'import' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1756:1: 'import'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getImportKeyword_3()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__VarReserved__Alternatives3763); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getImportKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1763:6: ( 'option' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1763:6: ( 'option' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1764:1: 'option'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getOptionKeyword_4()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__VarReserved__Alternatives3783); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getOptionKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1771:6: ( 'message' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1771:6: ( 'message' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1772:1: 'message'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getMessageKeyword_5()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__VarReserved__Alternatives3803); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getMessageKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1779:6: ( 'service' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1779:6: ( 'service' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1780:1: 'service'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getServiceKeyword_6()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__VarReserved__Alternatives3823); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getServiceKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1787:6: ( 'enum' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1787:6: ( 'enum' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1788:1: 'enum'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getEnumKeyword_7()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__VarReserved__Alternatives3843); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getEnumKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1795:6: ( 'required' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1795:6: ( 'required' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1796:1: 'required'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getRequiredKeyword_8()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__VarReserved__Alternatives3863); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getRequiredKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1803:6: ( 'optional' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1803:6: ( 'optional' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1804:1: 'optional'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getOptionalKeyword_9()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__VarReserved__Alternatives3883); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getOptionalKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1811:6: ( 'repeated' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1811:6: ( 'repeated' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1812:1: 'repeated'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getRepeatedKeyword_10()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__VarReserved__Alternatives3903); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getRepeatedKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1819:6: ( 'extensions' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1819:6: ( 'extensions' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1820:1: 'extensions'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getExtensionsKeyword_11()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__VarReserved__Alternatives3923); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getExtensionsKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1827:6: ( 'extend' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1827:6: ( 'extend' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1828:1: 'extend'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getExtendKeyword_12()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__VarReserved__Alternatives3943); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getExtendKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1835:6: ( 'group' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1835:6: ( 'group' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1836:1: 'group'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getGroupKeyword_13()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__VarReserved__Alternatives3963); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getGroupKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1843:6: ( 'rpc' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1843:6: ( 'rpc' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1844:1: 'rpc'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getRpcKeyword_14()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__VarReserved__Alternatives3983); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getRpcKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1851:6: ( 'returns' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1851:6: ( 'returns' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1852:1: 'returns'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getReturnsKeyword_15()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__VarReserved__Alternatives4003); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getReturnsKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1859:6: ( 'int32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1859:6: ( 'int32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1860:1: 'int32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getInt32Keyword_16()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__VarReserved__Alternatives4023); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getInt32Keyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1867:6: ( 'int64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1867:6: ( 'int64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1868:1: 'int64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getInt64Keyword_17()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__VarReserved__Alternatives4043); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getInt64Keyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1875:6: ( 'uint32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1875:6: ( 'uint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1876:1: 'uint32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getUint32Keyword_18()); 
                    }
                    match(input,31,FOLLOW_31_in_rule__VarReserved__Alternatives4063); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getUint32Keyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1883:6: ( 'uint64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1883:6: ( 'uint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1884:1: 'uint64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getUint64Keyword_19()); 
                    }
                    match(input,32,FOLLOW_32_in_rule__VarReserved__Alternatives4083); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getUint64Keyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1891:6: ( 'sint32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1891:6: ( 'sint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1892:1: 'sint32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSint32Keyword_20()); 
                    }
                    match(input,33,FOLLOW_33_in_rule__VarReserved__Alternatives4103); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSint32Keyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1899:6: ( 'sint64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1899:6: ( 'sint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1900:1: 'sint64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSint64Keyword_21()); 
                    }
                    match(input,34,FOLLOW_34_in_rule__VarReserved__Alternatives4123); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSint64Keyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1907:6: ( 'fixed32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1907:6: ( 'fixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1908:1: 'fixed32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getFixed32Keyword_22()); 
                    }
                    match(input,35,FOLLOW_35_in_rule__VarReserved__Alternatives4143); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getFixed32Keyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1915:6: ( 'fixed64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1915:6: ( 'fixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1916:1: 'fixed64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getFixed64Keyword_23()); 
                    }
                    match(input,36,FOLLOW_36_in_rule__VarReserved__Alternatives4163); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getFixed64Keyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1923:6: ( 'sfixed32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1923:6: ( 'sfixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1924:1: 'sfixed32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSfixed32Keyword_24()); 
                    }
                    match(input,37,FOLLOW_37_in_rule__VarReserved__Alternatives4183); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSfixed32Keyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1931:6: ( 'sfixed64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1931:6: ( 'sfixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1932:1: 'sfixed64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSfixed64Keyword_25()); 
                    }
                    match(input,38,FOLLOW_38_in_rule__VarReserved__Alternatives4203); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSfixed64Keyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1939:6: ( 'float' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1939:6: ( 'float' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1940:1: 'float'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getFloatKeyword_26()); 
                    }
                    match(input,39,FOLLOW_39_in_rule__VarReserved__Alternatives4223); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getFloatKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1947:6: ( 'double' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1947:6: ( 'double' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1948:1: 'double'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getDoubleKeyword_27()); 
                    }
                    match(input,40,FOLLOW_40_in_rule__VarReserved__Alternatives4243); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getDoubleKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1955:6: ( 'bool' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1955:6: ( 'bool' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1956:1: 'bool'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getBoolKeyword_28()); 
                    }
                    match(input,41,FOLLOW_41_in_rule__VarReserved__Alternatives4263); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getBoolKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1963:6: ( 'string' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1963:6: ( 'string' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1964:1: 'string'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getStringKeyword_29()); 
                    }
                    match(input,42,FOLLOW_42_in_rule__VarReserved__Alternatives4283); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getStringKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1971:6: ( 'bytes' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1971:6: ( 'bytes' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1972:1: 'bytes'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getBytesKeyword_30()); 
                    }
                    match(input,43,FOLLOW_43_in_rule__VarReserved__Alternatives4303); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getBytesKeyword_30()); 
                    }

                    }


                    }
                    break;
                case 32 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1979:6: ( 'default' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1979:6: ( 'default' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1980:1: 'default'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getDefaultKeyword_31()); 
                    }
                    match(input,44,FOLLOW_44_in_rule__VarReserved__Alternatives4323); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getDefaultKeyword_31()); 
                    }

                    }


                    }
                    break;
                case 33 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1987:6: ( 'max' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1987:6: ( 'max' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1988:1: 'max'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getMaxKeyword_32()); 
                    }
                    match(input,45,FOLLOW_45_in_rule__VarReserved__Alternatives4343); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getMaxKeyword_32()); 
                    }

                    }


                    }
                    break;
                case 34 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1995:6: ( 'void' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1995:6: ( 'void' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1996:1: 'void'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getVoidKeyword_33()); 
                    }
                    match(input,46,FOLLOW_46_in_rule__VarReserved__Alternatives4363); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2009:1: rule__BOOL__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BOOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2013:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==47) ) {
                alt16=1;
            }
            else if ( (LA16_0==48) ) {
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2014:1: ( ( 'true' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2014:1: ( ( 'true' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2015:1: ( 'true' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2016:1: ( 'true' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2016:3: 'true'
                    {
                    match(input,47,FOLLOW_47_in_rule__BOOL__Alternatives4399); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2021:6: ( ( 'false' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2021:6: ( ( 'false' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2022:1: ( 'false' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLAccess().getFalseEnumLiteralDeclaration_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2023:1: ( 'false' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2023:3: 'false'
                    {
                    match(input,48,FOLLOW_48_in_rule__BOOL__Alternatives4420); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2033:1: rule__Modifier__Alternatives : ( ( ( 'optional' ) ) | ( ( 'required' ) ) | ( ( 'repeated' ) ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2037:1: ( ( ( 'optional' ) ) | ( ( 'required' ) ) | ( ( 'repeated' ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt17=1;
                }
                break;
            case 21:
                {
                alt17=2;
                }
                break;
            case 23:
                {
                alt17=3;
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2038:1: ( ( 'optional' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2038:1: ( ( 'optional' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2039:1: ( 'optional' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2040:1: ( 'optional' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2040:3: 'optional'
                    {
                    match(input,22,FOLLOW_22_in_rule__Modifier__Alternatives4456); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2045:6: ( ( 'required' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2045:6: ( ( 'required' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2046:1: ( 'required' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2047:1: ( 'required' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2047:3: 'required'
                    {
                    match(input,21,FOLLOW_21_in_rule__Modifier__Alternatives4477); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2052:6: ( ( 'repeated' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2052:6: ( ( 'repeated' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2053:1: ( 'repeated' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getRepeatedEnumLiteralDeclaration_2()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2054:1: ( 'repeated' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2054:3: 'repeated'
                    {
                    match(input,23,FOLLOW_23_in_rule__Modifier__Alternatives4498); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2064:1: rule__ScalarType__Alternatives : ( ( ( 'int32' ) ) | ( ( 'int64' ) ) | ( ( 'uint32' ) ) | ( ( 'uint64' ) ) | ( ( 'sint32' ) ) | ( ( 'sint64' ) ) | ( ( 'fixed32' ) ) | ( ( 'fixed64' ) ) | ( ( 'sfixed32' ) ) | ( ( 'sfixed64' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'bool' ) ) | ( ( 'string' ) ) | ( ( 'bytes' ) ) );
    public final void rule__ScalarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2068:1: ( ( ( 'int32' ) ) | ( ( 'int64' ) ) | ( ( 'uint32' ) ) | ( ( 'uint64' ) ) | ( ( 'sint32' ) ) | ( ( 'sint64' ) ) | ( ( 'fixed32' ) ) | ( ( 'fixed64' ) ) | ( ( 'sfixed32' ) ) | ( ( 'sfixed64' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'bool' ) ) | ( ( 'string' ) ) | ( ( 'bytes' ) ) )
            int alt18=15;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt18=1;
                }
                break;
            case 30:
                {
                alt18=2;
                }
                break;
            case 31:
                {
                alt18=3;
                }
                break;
            case 32:
                {
                alt18=4;
                }
                break;
            case 33:
                {
                alt18=5;
                }
                break;
            case 34:
                {
                alt18=6;
                }
                break;
            case 35:
                {
                alt18=7;
                }
                break;
            case 36:
                {
                alt18=8;
                }
                break;
            case 37:
                {
                alt18=9;
                }
                break;
            case 38:
                {
                alt18=10;
                }
                break;
            case 39:
                {
                alt18=11;
                }
                break;
            case 40:
                {
                alt18=12;
                }
                break;
            case 41:
                {
                alt18=13;
                }
                break;
            case 42:
                {
                alt18=14;
                }
                break;
            case 43:
                {
                alt18=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2069:1: ( ( 'int32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2069:1: ( ( 'int32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2070:1: ( 'int32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2071:1: ( 'int32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2071:3: 'int32'
                    {
                    match(input,29,FOLLOW_29_in_rule__ScalarType__Alternatives4534); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2076:6: ( ( 'int64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2076:6: ( ( 'int64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2077:1: ( 'int64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2078:1: ( 'int64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2078:3: 'int64'
                    {
                    match(input,30,FOLLOW_30_in_rule__ScalarType__Alternatives4555); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2083:6: ( ( 'uint32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2083:6: ( ( 'uint32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2084:1: ( 'uint32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2085:1: ( 'uint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2085:3: 'uint32'
                    {
                    match(input,31,FOLLOW_31_in_rule__ScalarType__Alternatives4576); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2090:6: ( ( 'uint64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2090:6: ( ( 'uint64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2091:1: ( 'uint64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2092:1: ( 'uint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2092:3: 'uint64'
                    {
                    match(input,32,FOLLOW_32_in_rule__ScalarType__Alternatives4597); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2097:6: ( ( 'sint32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2097:6: ( ( 'sint32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2098:1: ( 'sint32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2099:1: ( 'sint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2099:3: 'sint32'
                    {
                    match(input,33,FOLLOW_33_in_rule__ScalarType__Alternatives4618); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2104:6: ( ( 'sint64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2104:6: ( ( 'sint64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2105:1: ( 'sint64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2106:1: ( 'sint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2106:3: 'sint64'
                    {
                    match(input,34,FOLLOW_34_in_rule__ScalarType__Alternatives4639); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2111:6: ( ( 'fixed32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2111:6: ( ( 'fixed32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2112:1: ( 'fixed32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2113:1: ( 'fixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2113:3: 'fixed32'
                    {
                    match(input,35,FOLLOW_35_in_rule__ScalarType__Alternatives4660); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2118:6: ( ( 'fixed64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2118:6: ( ( 'fixed64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2119:1: ( 'fixed64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2120:1: ( 'fixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2120:3: 'fixed64'
                    {
                    match(input,36,FOLLOW_36_in_rule__ScalarType__Alternatives4681); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2125:6: ( ( 'sfixed32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2125:6: ( ( 'sfixed32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2126:1: ( 'sfixed32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2127:1: ( 'sfixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2127:3: 'sfixed32'
                    {
                    match(input,37,FOLLOW_37_in_rule__ScalarType__Alternatives4702); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2132:6: ( ( 'sfixed64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2132:6: ( ( 'sfixed64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2133:1: ( 'sfixed64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2134:1: ( 'sfixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2134:3: 'sfixed64'
                    {
                    match(input,38,FOLLOW_38_in_rule__ScalarType__Alternatives4723); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2139:6: ( ( 'float' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2139:6: ( ( 'float' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2140:1: ( 'float' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2141:1: ( 'float' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2141:3: 'float'
                    {
                    match(input,39,FOLLOW_39_in_rule__ScalarType__Alternatives4744); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2146:6: ( ( 'double' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2146:6: ( ( 'double' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2147:1: ( 'double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2148:1: ( 'double' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2148:3: 'double'
                    {
                    match(input,40,FOLLOW_40_in_rule__ScalarType__Alternatives4765); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2153:6: ( ( 'bool' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2153:6: ( ( 'bool' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2154:1: ( 'bool' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2155:1: ( 'bool' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2155:3: 'bool'
                    {
                    match(input,41,FOLLOW_41_in_rule__ScalarType__Alternatives4786); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2160:6: ( ( 'string' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2160:6: ( ( 'string' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2161:1: ( 'string' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2162:1: ( 'string' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2162:3: 'string'
                    {
                    match(input,42,FOLLOW_42_in_rule__ScalarType__Alternatives4807); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2167:6: ( ( 'bytes' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2167:6: ( ( 'bytes' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2168:1: ( 'bytes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getBytesEnumLiteralDeclaration_14()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2169:1: ( 'bytes' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2169:3: 'bytes'
                    {
                    match(input,43,FOLLOW_43_in_rule__ScalarType__Alternatives4828); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2181:1: rule__Proto__Group__0 : rule__Proto__Group__0__Impl rule__Proto__Group__1 ;
    public final void rule__Proto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2185:1: ( rule__Proto__Group__0__Impl rule__Proto__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2186:2: rule__Proto__Group__0__Impl rule__Proto__Group__1
            {
            pushFollow(FOLLOW_rule__Proto__Group__0__Impl_in_rule__Proto__Group__04861);
            rule__Proto__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Proto__Group__1_in_rule__Proto__Group__04864);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2193:1: rule__Proto__Group__0__Impl : ( ( rule__Proto__SyntaxAssignment_0 )? ) ;
    public final void rule__Proto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2197:1: ( ( ( rule__Proto__SyntaxAssignment_0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2198:1: ( ( rule__Proto__SyntaxAssignment_0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2198:1: ( ( rule__Proto__SyntaxAssignment_0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2199:1: ( rule__Proto__SyntaxAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getSyntaxAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2200:1: ( rule__Proto__SyntaxAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2200:2: rule__Proto__SyntaxAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Proto__SyntaxAssignment_0_in_rule__Proto__Group__0__Impl4891);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2210:1: rule__Proto__Group__1 : rule__Proto__Group__1__Impl ;
    public final void rule__Proto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2214:1: ( rule__Proto__Group__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2215:2: rule__Proto__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Proto__Group__1__Impl_in_rule__Proto__Group__14922);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2221:1: rule__Proto__Group__1__Impl : ( ( rule__Proto__StatementsAssignment_1 )* ) ;
    public final void rule__Proto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2225:1: ( ( ( rule__Proto__StatementsAssignment_1 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2226:1: ( ( rule__Proto__StatementsAssignment_1 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2226:1: ( ( rule__Proto__StatementsAssignment_1 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2227:1: ( rule__Proto__StatementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getStatementsAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2228:1: ( rule__Proto__StatementsAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==14||(LA20_0>=16 && LA20_0<=23)||LA20_0==25) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2228:2: rule__Proto__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Proto__StatementsAssignment_1_in_rule__Proto__Group__1__Impl4949);
            	    rule__Proto__StatementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2242:1: rule__Syntax__Group__0 : rule__Syntax__Group__0__Impl rule__Syntax__Group__1 ;
    public final void rule__Syntax__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2246:1: ( rule__Syntax__Group__0__Impl rule__Syntax__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2247:2: rule__Syntax__Group__0__Impl rule__Syntax__Group__1
            {
            pushFollow(FOLLOW_rule__Syntax__Group__0__Impl_in_rule__Syntax__Group__04984);
            rule__Syntax__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Syntax__Group__1_in_rule__Syntax__Group__04987);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2254:1: rule__Syntax__Group__0__Impl : ( 'syntax' ) ;
    public final void rule__Syntax__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2258:1: ( ( 'syntax' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2259:1: ( 'syntax' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2259:1: ( 'syntax' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2260:1: 'syntax'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getSyntaxKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Syntax__Group__0__Impl5015); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2273:1: rule__Syntax__Group__1 : rule__Syntax__Group__1__Impl rule__Syntax__Group__2 ;
    public final void rule__Syntax__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2277:1: ( rule__Syntax__Group__1__Impl rule__Syntax__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2278:2: rule__Syntax__Group__1__Impl rule__Syntax__Group__2
            {
            pushFollow(FOLLOW_rule__Syntax__Group__1__Impl_in_rule__Syntax__Group__15046);
            rule__Syntax__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Syntax__Group__2_in_rule__Syntax__Group__15049);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2285:1: rule__Syntax__Group__1__Impl : ( '=' ) ;
    public final void rule__Syntax__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2289:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2290:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2290:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2291:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getEqualsSignKeyword_1()); 
            }
            match(input,49,FOLLOW_49_in_rule__Syntax__Group__1__Impl5077); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2304:1: rule__Syntax__Group__2 : rule__Syntax__Group__2__Impl rule__Syntax__Group__3 ;
    public final void rule__Syntax__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2308:1: ( rule__Syntax__Group__2__Impl rule__Syntax__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2309:2: rule__Syntax__Group__2__Impl rule__Syntax__Group__3
            {
            pushFollow(FOLLOW_rule__Syntax__Group__2__Impl_in_rule__Syntax__Group__25108);
            rule__Syntax__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Syntax__Group__3_in_rule__Syntax__Group__25111);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2316:1: rule__Syntax__Group__2__Impl : ( ( rule__Syntax__NameAssignment_2 ) ) ;
    public final void rule__Syntax__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2320:1: ( ( ( rule__Syntax__NameAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2321:1: ( ( rule__Syntax__NameAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2321:1: ( ( rule__Syntax__NameAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2322:1: ( rule__Syntax__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getNameAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2323:1: ( rule__Syntax__NameAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2323:2: rule__Syntax__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Syntax__NameAssignment_2_in_rule__Syntax__Group__2__Impl5138);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2333:1: rule__Syntax__Group__3 : rule__Syntax__Group__3__Impl ;
    public final void rule__Syntax__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2337:1: ( rule__Syntax__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2338:2: rule__Syntax__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Syntax__Group__3__Impl_in_rule__Syntax__Group__35168);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2344:1: rule__Syntax__Group__3__Impl : ( ';' ) ;
    public final void rule__Syntax__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2348:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2349:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2349:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2350:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getSemicolonKeyword_3()); 
            }
            match(input,50,FOLLOW_50_in_rule__Syntax__Group__3__Impl5196); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2371:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2375:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2376:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__05235);
            rule__Package__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__05238);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2383:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2387:1: ( ( 'package' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2388:1: ( 'package' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2388:1: ( 'package' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2389:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Package__Group__0__Impl5266); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2402:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2406:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2407:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__15297);
            rule__Package__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__15300);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2414:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2418:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2419:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2419:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2420:1: ( rule__Package__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2421:1: ( rule__Package__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2421:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl5327);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2431:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2435:1: ( rule__Package__Group__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2436:2: rule__Package__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__25357);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2442:1: rule__Package__Group__2__Impl : ( ';' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2446:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2447:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2447:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2448:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getSemicolonKeyword_2()); 
            }
            match(input,50,FOLLOW_50_in_rule__Package__Group__2__Impl5385); if (state.failed) return ;
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


    // $ANTLR start "rule__PublicImport__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2467:1: rule__PublicImport__Group__0 : rule__PublicImport__Group__0__Impl rule__PublicImport__Group__1 ;
    public final void rule__PublicImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2471:1: ( rule__PublicImport__Group__0__Impl rule__PublicImport__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2472:2: rule__PublicImport__Group__0__Impl rule__PublicImport__Group__1
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__0__Impl_in_rule__PublicImport__Group__05422);
            rule__PublicImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PublicImport__Group__1_in_rule__PublicImport__Group__05425);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2479:1: rule__PublicImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__PublicImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2483:1: ( ( 'import' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2484:1: ( 'import' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2484:1: ( 'import' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2485:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getImportKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__PublicImport__Group__0__Impl5453); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2498:1: rule__PublicImport__Group__1 : rule__PublicImport__Group__1__Impl rule__PublicImport__Group__2 ;
    public final void rule__PublicImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2502:1: ( rule__PublicImport__Group__1__Impl rule__PublicImport__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2503:2: rule__PublicImport__Group__1__Impl rule__PublicImport__Group__2
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__1__Impl_in_rule__PublicImport__Group__15484);
            rule__PublicImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PublicImport__Group__2_in_rule__PublicImport__Group__15487);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2510:1: rule__PublicImport__Group__1__Impl : ( 'public' ) ;
    public final void rule__PublicImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2514:1: ( ( 'public' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2515:1: ( 'public' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2515:1: ( 'public' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2516:1: 'public'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getPublicKeyword_1()); 
            }
            match(input,51,FOLLOW_51_in_rule__PublicImport__Group__1__Impl5515); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2529:1: rule__PublicImport__Group__2 : rule__PublicImport__Group__2__Impl rule__PublicImport__Group__3 ;
    public final void rule__PublicImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2533:1: ( rule__PublicImport__Group__2__Impl rule__PublicImport__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2534:2: rule__PublicImport__Group__2__Impl rule__PublicImport__Group__3
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__2__Impl_in_rule__PublicImport__Group__25546);
            rule__PublicImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PublicImport__Group__3_in_rule__PublicImport__Group__25549);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2541:1: rule__PublicImport__Group__2__Impl : ( ( rule__PublicImport__ImportURIAssignment_2 ) ) ;
    public final void rule__PublicImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2545:1: ( ( ( rule__PublicImport__ImportURIAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2546:1: ( ( rule__PublicImport__ImportURIAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2546:1: ( ( rule__PublicImport__ImportURIAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2547:1: ( rule__PublicImport__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getImportURIAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2548:1: ( rule__PublicImport__ImportURIAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2548:2: rule__PublicImport__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__PublicImport__ImportURIAssignment_2_in_rule__PublicImport__Group__2__Impl5576);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2558:1: rule__PublicImport__Group__3 : rule__PublicImport__Group__3__Impl ;
    public final void rule__PublicImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2562:1: ( rule__PublicImport__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2563:2: rule__PublicImport__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__3__Impl_in_rule__PublicImport__Group__35606);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2569:1: rule__PublicImport__Group__3__Impl : ( ';' ) ;
    public final void rule__PublicImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2573:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2574:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2574:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2575:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getSemicolonKeyword_3()); 
            }
            match(input,50,FOLLOW_50_in_rule__PublicImport__Group__3__Impl5634); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2596:1: rule__WeakImport__Group__0 : rule__WeakImport__Group__0__Impl rule__WeakImport__Group__1 ;
    public final void rule__WeakImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2600:1: ( rule__WeakImport__Group__0__Impl rule__WeakImport__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2601:2: rule__WeakImport__Group__0__Impl rule__WeakImport__Group__1
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__0__Impl_in_rule__WeakImport__Group__05673);
            rule__WeakImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WeakImport__Group__1_in_rule__WeakImport__Group__05676);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2608:1: rule__WeakImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__WeakImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2612:1: ( ( 'import' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2613:1: ( 'import' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2613:1: ( 'import' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2614:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getImportKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__WeakImport__Group__0__Impl5704); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2627:1: rule__WeakImport__Group__1 : rule__WeakImport__Group__1__Impl rule__WeakImport__Group__2 ;
    public final void rule__WeakImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2631:1: ( rule__WeakImport__Group__1__Impl rule__WeakImport__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2632:2: rule__WeakImport__Group__1__Impl rule__WeakImport__Group__2
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__1__Impl_in_rule__WeakImport__Group__15735);
            rule__WeakImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WeakImport__Group__2_in_rule__WeakImport__Group__15738);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2639:1: rule__WeakImport__Group__1__Impl : ( 'weak' ) ;
    public final void rule__WeakImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2643:1: ( ( 'weak' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2644:1: ( 'weak' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2644:1: ( 'weak' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2645:1: 'weak'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getWeakKeyword_1()); 
            }
            match(input,52,FOLLOW_52_in_rule__WeakImport__Group__1__Impl5766); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2658:1: rule__WeakImport__Group__2 : rule__WeakImport__Group__2__Impl rule__WeakImport__Group__3 ;
    public final void rule__WeakImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2662:1: ( rule__WeakImport__Group__2__Impl rule__WeakImport__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2663:2: rule__WeakImport__Group__2__Impl rule__WeakImport__Group__3
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__2__Impl_in_rule__WeakImport__Group__25797);
            rule__WeakImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WeakImport__Group__3_in_rule__WeakImport__Group__25800);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2670:1: rule__WeakImport__Group__2__Impl : ( ( rule__WeakImport__ImportURIAssignment_2 ) ) ;
    public final void rule__WeakImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2674:1: ( ( ( rule__WeakImport__ImportURIAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2675:1: ( ( rule__WeakImport__ImportURIAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2675:1: ( ( rule__WeakImport__ImportURIAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2676:1: ( rule__WeakImport__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getImportURIAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2677:1: ( rule__WeakImport__ImportURIAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2677:2: rule__WeakImport__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__WeakImport__ImportURIAssignment_2_in_rule__WeakImport__Group__2__Impl5827);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2687:1: rule__WeakImport__Group__3 : rule__WeakImport__Group__3__Impl ;
    public final void rule__WeakImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2691:1: ( rule__WeakImport__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2692:2: rule__WeakImport__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__3__Impl_in_rule__WeakImport__Group__35857);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2698:1: rule__WeakImport__Group__3__Impl : ( ';' ) ;
    public final void rule__WeakImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2702:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2703:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2703:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2704:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getSemicolonKeyword_3()); 
            }
            match(input,50,FOLLOW_50_in_rule__WeakImport__Group__3__Impl5885); if (state.failed) return ;
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


    // $ANTLR start "rule__Option__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2725:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2729:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2730:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__05924);
            rule__Option__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Option__Group__1_in_rule__Option__Group__05927);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2737:1: rule__Option__Group__0__Impl : ( 'option' ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2741:1: ( ( 'option' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2742:1: ( 'option' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2742:1: ( 'option' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2743:1: 'option'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getOptionKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Option__Group__0__Impl5955); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2756:1: rule__Option__Group__1 : rule__Option__Group__1__Impl rule__Option__Group__2 ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2760:1: ( rule__Option__Group__1__Impl rule__Option__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2761:2: rule__Option__Group__1__Impl rule__Option__Group__2
            {
            pushFollow(FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__15986);
            rule__Option__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Option__Group__2_in_rule__Option__Group__15989);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2768:1: rule__Option__Group__1__Impl : ( ( rule__Option__SourceAssignment_1 ) ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2772:1: ( ( ( rule__Option__SourceAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2773:1: ( ( rule__Option__SourceAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2773:1: ( ( rule__Option__SourceAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2774:1: ( rule__Option__SourceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getSourceAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2775:1: ( rule__Option__SourceAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2775:2: rule__Option__SourceAssignment_1
            {
            pushFollow(FOLLOW_rule__Option__SourceAssignment_1_in_rule__Option__Group__1__Impl6016);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2785:1: rule__Option__Group__2 : rule__Option__Group__2__Impl rule__Option__Group__3 ;
    public final void rule__Option__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2789:1: ( rule__Option__Group__2__Impl rule__Option__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2790:2: rule__Option__Group__2__Impl rule__Option__Group__3
            {
            pushFollow(FOLLOW_rule__Option__Group__2__Impl_in_rule__Option__Group__26046);
            rule__Option__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Option__Group__3_in_rule__Option__Group__26049);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2797:1: rule__Option__Group__2__Impl : ( '=' ) ;
    public final void rule__Option__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2801:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2802:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2802:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2803:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getEqualsSignKeyword_2()); 
            }
            match(input,49,FOLLOW_49_in_rule__Option__Group__2__Impl6077); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2816:1: rule__Option__Group__3 : rule__Option__Group__3__Impl rule__Option__Group__4 ;
    public final void rule__Option__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2820:1: ( rule__Option__Group__3__Impl rule__Option__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2821:2: rule__Option__Group__3__Impl rule__Option__Group__4
            {
            pushFollow(FOLLOW_rule__Option__Group__3__Impl_in_rule__Option__Group__36108);
            rule__Option__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Option__Group__4_in_rule__Option__Group__36111);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2828:1: rule__Option__Group__3__Impl : ( ( rule__Option__ValueAssignment_3 ) ) ;
    public final void rule__Option__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2832:1: ( ( ( rule__Option__ValueAssignment_3 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2833:1: ( ( rule__Option__ValueAssignment_3 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2833:1: ( ( rule__Option__ValueAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2834:1: ( rule__Option__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getValueAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2835:1: ( rule__Option__ValueAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2835:2: rule__Option__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Option__ValueAssignment_3_in_rule__Option__Group__3__Impl6138);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2845:1: rule__Option__Group__4 : rule__Option__Group__4__Impl ;
    public final void rule__Option__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2849:1: ( rule__Option__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2850:2: rule__Option__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Option__Group__4__Impl_in_rule__Option__Group__46168);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2856:1: rule__Option__Group__4__Impl : ( ';' ) ;
    public final void rule__Option__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2860:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2861:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2861:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2862:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getSemicolonKeyword_4()); 
            }
            match(input,50,FOLLOW_50_in_rule__Option__Group__4__Impl6196); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2885:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2889:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2890:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__06237);
            rule__Message__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__06240);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2897:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2901:1: ( ( 'message' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2902:1: ( 'message' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2902:1: ( 'message' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2903:1: 'message'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMessageKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Message__Group__0__Impl6268); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2916:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2920:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2921:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__16299);
            rule__Message__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__2_in_rule__Message__Group__16302);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2928:1: rule__Message__Group__1__Impl : ( ( rule__Message__NameAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2932:1: ( ( ( rule__Message__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2933:1: ( ( rule__Message__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2933:1: ( ( rule__Message__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2934:1: ( rule__Message__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2935:1: ( rule__Message__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2935:2: rule__Message__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Message__NameAssignment_1_in_rule__Message__Group__1__Impl6329);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2945:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2949:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2950:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__26359);
            rule__Message__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__3_in_rule__Message__Group__26362);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2957:1: rule__Message__Group__2__Impl : ( '{' ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2961:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2962:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2962:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2963:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,53,FOLLOW_53_in_rule__Message__Group__2__Impl6390); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2976:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2980:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2981:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__36421);
            rule__Message__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__4_in_rule__Message__Group__36424);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2988:1: rule__Message__Group__3__Impl : ( ( rule__Message__ElementsAssignment_3 )* ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2992:1: ( ( ( rule__Message__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2993:1: ( ( rule__Message__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2993:1: ( ( rule__Message__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2994:1: ( rule__Message__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2995:1: ( rule__Message__ElementsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=17 && LA21_0<=25)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2995:2: rule__Message__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Message__ElementsAssignment_3_in_rule__Message__Group__3__Impl6451);
            	    rule__Message__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3005:1: rule__Message__Group__4 : rule__Message__Group__4__Impl ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3009:1: ( rule__Message__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3010:2: rule__Message__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__46482);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3016:1: rule__Message__Group__4__Impl : ( '}' ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3020:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3021:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3021:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3022:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,54,FOLLOW_54_in_rule__Message__Group__4__Impl6510); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3045:1: rule__ExtensionRange__Group__0 : rule__ExtensionRange__Group__0__Impl rule__ExtensionRange__Group__1 ;
    public final void rule__ExtensionRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3049:1: ( rule__ExtensionRange__Group__0__Impl rule__ExtensionRange__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3050:2: rule__ExtensionRange__Group__0__Impl rule__ExtensionRange__Group__1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__0__Impl_in_rule__ExtensionRange__Group__06551);
            rule__ExtensionRange__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group__1_in_rule__ExtensionRange__Group__06554);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3057:1: rule__ExtensionRange__Group__0__Impl : ( 'extensions' ) ;
    public final void rule__ExtensionRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3061:1: ( ( 'extensions' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3062:1: ( 'extensions' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3062:1: ( 'extensions' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3063:1: 'extensions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getExtensionsKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__ExtensionRange__Group__0__Impl6582); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3076:1: rule__ExtensionRange__Group__1 : rule__ExtensionRange__Group__1__Impl rule__ExtensionRange__Group__2 ;
    public final void rule__ExtensionRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3080:1: ( rule__ExtensionRange__Group__1__Impl rule__ExtensionRange__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3081:2: rule__ExtensionRange__Group__1__Impl rule__ExtensionRange__Group__2
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__1__Impl_in_rule__ExtensionRange__Group__16613);
            rule__ExtensionRange__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group__2_in_rule__ExtensionRange__Group__16616);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3088:1: rule__ExtensionRange__Group__1__Impl : ( ( rule__ExtensionRange__FromAssignment_1 ) ) ;
    public final void rule__ExtensionRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3092:1: ( ( ( rule__ExtensionRange__FromAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3093:1: ( ( rule__ExtensionRange__FromAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3093:1: ( ( rule__ExtensionRange__FromAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3094:1: ( rule__ExtensionRange__FromAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getFromAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3095:1: ( rule__ExtensionRange__FromAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3095:2: rule__ExtensionRange__FromAssignment_1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__FromAssignment_1_in_rule__ExtensionRange__Group__1__Impl6643);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3105:1: rule__ExtensionRange__Group__2 : rule__ExtensionRange__Group__2__Impl rule__ExtensionRange__Group__3 ;
    public final void rule__ExtensionRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3109:1: ( rule__ExtensionRange__Group__2__Impl rule__ExtensionRange__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3110:2: rule__ExtensionRange__Group__2__Impl rule__ExtensionRange__Group__3
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__2__Impl_in_rule__ExtensionRange__Group__26673);
            rule__ExtensionRange__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group__3_in_rule__ExtensionRange__Group__26676);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3117:1: rule__ExtensionRange__Group__2__Impl : ( ( rule__ExtensionRange__Group_2__0 )? ) ;
    public final void rule__ExtensionRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3121:1: ( ( ( rule__ExtensionRange__Group_2__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3122:1: ( ( rule__ExtensionRange__Group_2__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3122:1: ( ( rule__ExtensionRange__Group_2__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3123:1: ( rule__ExtensionRange__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getGroup_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3124:1: ( rule__ExtensionRange__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3124:2: rule__ExtensionRange__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ExtensionRange__Group_2__0_in_rule__ExtensionRange__Group__2__Impl6703);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3134:1: rule__ExtensionRange__Group__3 : rule__ExtensionRange__Group__3__Impl ;
    public final void rule__ExtensionRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3138:1: ( rule__ExtensionRange__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3139:2: rule__ExtensionRange__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__3__Impl_in_rule__ExtensionRange__Group__36734);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3145:1: rule__ExtensionRange__Group__3__Impl : ( ';' ) ;
    public final void rule__ExtensionRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3149:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3150:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3150:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3151:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getSemicolonKeyword_3()); 
            }
            match(input,50,FOLLOW_50_in_rule__ExtensionRange__Group__3__Impl6762); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3172:1: rule__ExtensionRange__Group_2__0 : rule__ExtensionRange__Group_2__0__Impl rule__ExtensionRange__Group_2__1 ;
    public final void rule__ExtensionRange__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3176:1: ( rule__ExtensionRange__Group_2__0__Impl rule__ExtensionRange__Group_2__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3177:2: rule__ExtensionRange__Group_2__0__Impl rule__ExtensionRange__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group_2__0__Impl_in_rule__ExtensionRange__Group_2__06801);
            rule__ExtensionRange__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group_2__1_in_rule__ExtensionRange__Group_2__06804);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3184:1: rule__ExtensionRange__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__ExtensionRange__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3188:1: ( ( 'to' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3189:1: ( 'to' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3189:1: ( 'to' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3190:1: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getToKeyword_2_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__ExtensionRange__Group_2__0__Impl6832); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3203:1: rule__ExtensionRange__Group_2__1 : rule__ExtensionRange__Group_2__1__Impl ;
    public final void rule__ExtensionRange__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3207:1: ( rule__ExtensionRange__Group_2__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3208:2: rule__ExtensionRange__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group_2__1__Impl_in_rule__ExtensionRange__Group_2__16863);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3214:1: rule__ExtensionRange__Group_2__1__Impl : ( ( rule__ExtensionRange__ToAssignment_2_1 ) ) ;
    public final void rule__ExtensionRange__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3218:1: ( ( ( rule__ExtensionRange__ToAssignment_2_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3219:1: ( ( rule__ExtensionRange__ToAssignment_2_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3219:1: ( ( rule__ExtensionRange__ToAssignment_2_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3220:1: ( rule__ExtensionRange__ToAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getToAssignment_2_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3221:1: ( rule__ExtensionRange__ToAssignment_2_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3221:2: rule__ExtensionRange__ToAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__ToAssignment_2_1_in_rule__ExtensionRange__Group_2__1__Impl6890);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3235:1: rule__MessageField__Group__0 : rule__MessageField__Group__0__Impl rule__MessageField__Group__1 ;
    public final void rule__MessageField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3239:1: ( rule__MessageField__Group__0__Impl rule__MessageField__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3240:2: rule__MessageField__Group__0__Impl rule__MessageField__Group__1
            {
            pushFollow(FOLLOW_rule__MessageField__Group__0__Impl_in_rule__MessageField__Group__06924);
            rule__MessageField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__1_in_rule__MessageField__Group__06927);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3247:1: rule__MessageField__Group__0__Impl : ( ( rule__MessageField__ModifierAssignment_0 ) ) ;
    public final void rule__MessageField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3251:1: ( ( ( rule__MessageField__ModifierAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3252:1: ( ( rule__MessageField__ModifierAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3252:1: ( ( rule__MessageField__ModifierAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3253:1: ( rule__MessageField__ModifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getModifierAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3254:1: ( rule__MessageField__ModifierAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3254:2: rule__MessageField__ModifierAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageField__ModifierAssignment_0_in_rule__MessageField__Group__0__Impl6954);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3264:1: rule__MessageField__Group__1 : rule__MessageField__Group__1__Impl rule__MessageField__Group__2 ;
    public final void rule__MessageField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3268:1: ( rule__MessageField__Group__1__Impl rule__MessageField__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3269:2: rule__MessageField__Group__1__Impl rule__MessageField__Group__2
            {
            pushFollow(FOLLOW_rule__MessageField__Group__1__Impl_in_rule__MessageField__Group__16984);
            rule__MessageField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__2_in_rule__MessageField__Group__16987);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3276:1: rule__MessageField__Group__1__Impl : ( ( rule__MessageField__TypeAssignment_1 ) ) ;
    public final void rule__MessageField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3280:1: ( ( ( rule__MessageField__TypeAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3281:1: ( ( rule__MessageField__TypeAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3281:1: ( ( rule__MessageField__TypeAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3282:1: ( rule__MessageField__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getTypeAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3283:1: ( rule__MessageField__TypeAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3283:2: rule__MessageField__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MessageField__TypeAssignment_1_in_rule__MessageField__Group__1__Impl7014);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3293:1: rule__MessageField__Group__2 : rule__MessageField__Group__2__Impl rule__MessageField__Group__3 ;
    public final void rule__MessageField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3297:1: ( rule__MessageField__Group__2__Impl rule__MessageField__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3298:2: rule__MessageField__Group__2__Impl rule__MessageField__Group__3
            {
            pushFollow(FOLLOW_rule__MessageField__Group__2__Impl_in_rule__MessageField__Group__27044);
            rule__MessageField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__3_in_rule__MessageField__Group__27047);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3305:1: rule__MessageField__Group__2__Impl : ( ( rule__MessageField__NameAssignment_2 ) ) ;
    public final void rule__MessageField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3309:1: ( ( ( rule__MessageField__NameAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3310:1: ( ( rule__MessageField__NameAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3310:1: ( ( rule__MessageField__NameAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3311:1: ( rule__MessageField__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getNameAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3312:1: ( rule__MessageField__NameAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3312:2: rule__MessageField__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MessageField__NameAssignment_2_in_rule__MessageField__Group__2__Impl7074);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3322:1: rule__MessageField__Group__3 : rule__MessageField__Group__3__Impl rule__MessageField__Group__4 ;
    public final void rule__MessageField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3326:1: ( rule__MessageField__Group__3__Impl rule__MessageField__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3327:2: rule__MessageField__Group__3__Impl rule__MessageField__Group__4
            {
            pushFollow(FOLLOW_rule__MessageField__Group__3__Impl_in_rule__MessageField__Group__37104);
            rule__MessageField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__4_in_rule__MessageField__Group__37107);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3334:1: rule__MessageField__Group__3__Impl : ( '=' ) ;
    public final void rule__MessageField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3338:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3339:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3339:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3340:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getEqualsSignKeyword_3()); 
            }
            match(input,49,FOLLOW_49_in_rule__MessageField__Group__3__Impl7135); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3353:1: rule__MessageField__Group__4 : rule__MessageField__Group__4__Impl rule__MessageField__Group__5 ;
    public final void rule__MessageField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3357:1: ( rule__MessageField__Group__4__Impl rule__MessageField__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3358:2: rule__MessageField__Group__4__Impl rule__MessageField__Group__5
            {
            pushFollow(FOLLOW_rule__MessageField__Group__4__Impl_in_rule__MessageField__Group__47166);
            rule__MessageField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__5_in_rule__MessageField__Group__47169);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3365:1: rule__MessageField__Group__4__Impl : ( ( rule__MessageField__IndexAssignment_4 ) ) ;
    public final void rule__MessageField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3369:1: ( ( ( rule__MessageField__IndexAssignment_4 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3370:1: ( ( rule__MessageField__IndexAssignment_4 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3370:1: ( ( rule__MessageField__IndexAssignment_4 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3371:1: ( rule__MessageField__IndexAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getIndexAssignment_4()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3372:1: ( rule__MessageField__IndexAssignment_4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3372:2: rule__MessageField__IndexAssignment_4
            {
            pushFollow(FOLLOW_rule__MessageField__IndexAssignment_4_in_rule__MessageField__Group__4__Impl7196);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3382:1: rule__MessageField__Group__5 : rule__MessageField__Group__5__Impl rule__MessageField__Group__6 ;
    public final void rule__MessageField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3386:1: ( rule__MessageField__Group__5__Impl rule__MessageField__Group__6 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3387:2: rule__MessageField__Group__5__Impl rule__MessageField__Group__6
            {
            pushFollow(FOLLOW_rule__MessageField__Group__5__Impl_in_rule__MessageField__Group__57226);
            rule__MessageField__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__6_in_rule__MessageField__Group__57229);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3394:1: rule__MessageField__Group__5__Impl : ( ( rule__MessageField__OptionsAssignment_5 )? ) ;
    public final void rule__MessageField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3398:1: ( ( ( rule__MessageField__OptionsAssignment_5 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3399:1: ( ( rule__MessageField__OptionsAssignment_5 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3399:1: ( ( rule__MessageField__OptionsAssignment_5 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3400:1: ( rule__MessageField__OptionsAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getOptionsAssignment_5()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3401:1: ( rule__MessageField__OptionsAssignment_5 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==55) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3401:2: rule__MessageField__OptionsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__MessageField__OptionsAssignment_5_in_rule__MessageField__Group__5__Impl7256);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3411:1: rule__MessageField__Group__6 : rule__MessageField__Group__6__Impl ;
    public final void rule__MessageField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3415:1: ( rule__MessageField__Group__6__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3416:2: rule__MessageField__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MessageField__Group__6__Impl_in_rule__MessageField__Group__67287);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3422:1: rule__MessageField__Group__6__Impl : ( ';' ) ;
    public final void rule__MessageField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3426:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3427:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3427:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3428:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getSemicolonKeyword_6()); 
            }
            match(input,50,FOLLOW_50_in_rule__MessageField__Group__6__Impl7315); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3455:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3459:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3460:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__07360);
            rule__Group__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__1_in_rule__Group__Group__07363);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3467:1: rule__Group__Group__0__Impl : ( ( rule__Group__ModifierAssignment_0 ) ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3471:1: ( ( ( rule__Group__ModifierAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3472:1: ( ( rule__Group__ModifierAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3472:1: ( ( rule__Group__ModifierAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3473:1: ( rule__Group__ModifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getModifierAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3474:1: ( rule__Group__ModifierAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3474:2: rule__Group__ModifierAssignment_0
            {
            pushFollow(FOLLOW_rule__Group__ModifierAssignment_0_in_rule__Group__Group__0__Impl7390);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3484:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3488:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3489:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__17420);
            rule__Group__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__2_in_rule__Group__Group__17423);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3496:1: rule__Group__Group__1__Impl : ( 'group' ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3500:1: ( ( 'group' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3501:1: ( 'group' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3501:1: ( 'group' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3502:1: 'group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getGroupKeyword_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Group__Group__1__Impl7451); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3515:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3519:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3520:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__27482);
            rule__Group__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__3_in_rule__Group__Group__27485);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3527:1: rule__Group__Group__2__Impl : ( ( rule__Group__NameAssignment_2 ) ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3531:1: ( ( ( rule__Group__NameAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3532:1: ( ( rule__Group__NameAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3532:1: ( ( rule__Group__NameAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3533:1: ( rule__Group__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getNameAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3534:1: ( rule__Group__NameAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3534:2: rule__Group__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl7512);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3544:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3548:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3549:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__37542);
            rule__Group__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__4_in_rule__Group__Group__37545);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3556:1: rule__Group__Group__3__Impl : ( '=' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3560:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3561:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3561:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3562:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getEqualsSignKeyword_3()); 
            }
            match(input,49,FOLLOW_49_in_rule__Group__Group__3__Impl7573); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3575:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3579:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3580:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__47604);
            rule__Group__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__5_in_rule__Group__Group__47607);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3587:1: rule__Group__Group__4__Impl : ( ( rule__Group__IndexAssignment_4 ) ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3591:1: ( ( ( rule__Group__IndexAssignment_4 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3592:1: ( ( rule__Group__IndexAssignment_4 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3592:1: ( ( rule__Group__IndexAssignment_4 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3593:1: ( rule__Group__IndexAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getIndexAssignment_4()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3594:1: ( rule__Group__IndexAssignment_4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3594:2: rule__Group__IndexAssignment_4
            {
            pushFollow(FOLLOW_rule__Group__IndexAssignment_4_in_rule__Group__Group__4__Impl7634);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3604:1: rule__Group__Group__5 : rule__Group__Group__5__Impl rule__Group__Group__6 ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3608:1: ( rule__Group__Group__5__Impl rule__Group__Group__6 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3609:2: rule__Group__Group__5__Impl rule__Group__Group__6
            {
            pushFollow(FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__57664);
            rule__Group__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__6_in_rule__Group__Group__57667);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3616:1: rule__Group__Group__5__Impl : ( '{' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3620:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3621:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3621:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3622:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,53,FOLLOW_53_in_rule__Group__Group__5__Impl7695); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3635:1: rule__Group__Group__6 : rule__Group__Group__6__Impl rule__Group__Group__7 ;
    public final void rule__Group__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3639:1: ( rule__Group__Group__6__Impl rule__Group__Group__7 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3640:2: rule__Group__Group__6__Impl rule__Group__Group__7
            {
            pushFollow(FOLLOW_rule__Group__Group__6__Impl_in_rule__Group__Group__67726);
            rule__Group__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__7_in_rule__Group__Group__67729);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3647:1: rule__Group__Group__6__Impl : ( ( rule__Group__ElementsAssignment_6 )* ) ;
    public final void rule__Group__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3651:1: ( ( ( rule__Group__ElementsAssignment_6 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3652:1: ( ( rule__Group__ElementsAssignment_6 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3652:1: ( ( rule__Group__ElementsAssignment_6 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3653:1: ( rule__Group__ElementsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getElementsAssignment_6()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3654:1: ( rule__Group__ElementsAssignment_6 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=21 && LA24_0<=23)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3654:2: rule__Group__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Group__ElementsAssignment_6_in_rule__Group__Group__6__Impl7756);
            	    rule__Group__ElementsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3664:1: rule__Group__Group__7 : rule__Group__Group__7__Impl ;
    public final void rule__Group__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3668:1: ( rule__Group__Group__7__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3669:2: rule__Group__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Group__Group__7__Impl_in_rule__Group__Group__77787);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3675:1: rule__Group__Group__7__Impl : ( '}' ) ;
    public final void rule__Group__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3679:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3680:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3680:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3681:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,54,FOLLOW_54_in_rule__Group__Group__7__Impl7815); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3710:1: rule__FieldOptions__Group__0 : rule__FieldOptions__Group__0__Impl rule__FieldOptions__Group__1 ;
    public final void rule__FieldOptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3714:1: ( rule__FieldOptions__Group__0__Impl rule__FieldOptions__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3715:2: rule__FieldOptions__Group__0__Impl rule__FieldOptions__Group__1
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__0__Impl_in_rule__FieldOptions__Group__07862);
            rule__FieldOptions__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group__1_in_rule__FieldOptions__Group__07865);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3722:1: rule__FieldOptions__Group__0__Impl : ( '[' ) ;
    public final void rule__FieldOptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3726:1: ( ( '[' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3727:1: ( '[' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3727:1: ( '[' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3728:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,55,FOLLOW_55_in_rule__FieldOptions__Group__0__Impl7893); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3741:1: rule__FieldOptions__Group__1 : rule__FieldOptions__Group__1__Impl rule__FieldOptions__Group__2 ;
    public final void rule__FieldOptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3745:1: ( rule__FieldOptions__Group__1__Impl rule__FieldOptions__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3746:2: rule__FieldOptions__Group__1__Impl rule__FieldOptions__Group__2
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__1__Impl_in_rule__FieldOptions__Group__17924);
            rule__FieldOptions__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group__2_in_rule__FieldOptions__Group__17927);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3753:1: rule__FieldOptions__Group__1__Impl : ( ( rule__FieldOptions__OptionsAssignment_1 ) ) ;
    public final void rule__FieldOptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3757:1: ( ( ( rule__FieldOptions__OptionsAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3758:1: ( ( rule__FieldOptions__OptionsAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3758:1: ( ( rule__FieldOptions__OptionsAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3759:1: ( rule__FieldOptions__OptionsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3760:1: ( rule__FieldOptions__OptionsAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3760:2: rule__FieldOptions__OptionsAssignment_1
            {
            pushFollow(FOLLOW_rule__FieldOptions__OptionsAssignment_1_in_rule__FieldOptions__Group__1__Impl7954);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3770:1: rule__FieldOptions__Group__2 : rule__FieldOptions__Group__2__Impl rule__FieldOptions__Group__3 ;
    public final void rule__FieldOptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3774:1: ( rule__FieldOptions__Group__2__Impl rule__FieldOptions__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3775:2: rule__FieldOptions__Group__2__Impl rule__FieldOptions__Group__3
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__2__Impl_in_rule__FieldOptions__Group__27984);
            rule__FieldOptions__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group__3_in_rule__FieldOptions__Group__27987);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3782:1: rule__FieldOptions__Group__2__Impl : ( ( rule__FieldOptions__Group_2__0 )* ) ;
    public final void rule__FieldOptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3786:1: ( ( ( rule__FieldOptions__Group_2__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3787:1: ( ( rule__FieldOptions__Group_2__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3787:1: ( ( rule__FieldOptions__Group_2__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3788:1: ( rule__FieldOptions__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getGroup_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3789:1: ( rule__FieldOptions__Group_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==57) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3789:2: rule__FieldOptions__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FieldOptions__Group_2__0_in_rule__FieldOptions__Group__2__Impl8014);
            	    rule__FieldOptions__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3799:1: rule__FieldOptions__Group__3 : rule__FieldOptions__Group__3__Impl ;
    public final void rule__FieldOptions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3803:1: ( rule__FieldOptions__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3804:2: rule__FieldOptions__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__3__Impl_in_rule__FieldOptions__Group__38045);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3810:1: rule__FieldOptions__Group__3__Impl : ( ']' ) ;
    public final void rule__FieldOptions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3814:1: ( ( ']' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3815:1: ( ']' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3815:1: ( ']' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3816:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,56,FOLLOW_56_in_rule__FieldOptions__Group__3__Impl8073); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3837:1: rule__FieldOptions__Group_2__0 : rule__FieldOptions__Group_2__0__Impl rule__FieldOptions__Group_2__1 ;
    public final void rule__FieldOptions__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3841:1: ( rule__FieldOptions__Group_2__0__Impl rule__FieldOptions__Group_2__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3842:2: rule__FieldOptions__Group_2__0__Impl rule__FieldOptions__Group_2__1
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group_2__0__Impl_in_rule__FieldOptions__Group_2__08112);
            rule__FieldOptions__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group_2__1_in_rule__FieldOptions__Group_2__08115);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3849:1: rule__FieldOptions__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FieldOptions__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3853:1: ( ( ',' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3854:1: ( ',' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3854:1: ( ',' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3855:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getCommaKeyword_2_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__FieldOptions__Group_2__0__Impl8143); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3868:1: rule__FieldOptions__Group_2__1 : rule__FieldOptions__Group_2__1__Impl ;
    public final void rule__FieldOptions__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3872:1: ( rule__FieldOptions__Group_2__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3873:2: rule__FieldOptions__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group_2__1__Impl_in_rule__FieldOptions__Group_2__18174);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3879:1: rule__FieldOptions__Group_2__1__Impl : ( ( rule__FieldOptions__OptionsAssignment_2_1 ) ) ;
    public final void rule__FieldOptions__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3883:1: ( ( ( rule__FieldOptions__OptionsAssignment_2_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3884:1: ( ( rule__FieldOptions__OptionsAssignment_2_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3884:1: ( ( rule__FieldOptions__OptionsAssignment_2_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3885:1: ( rule__FieldOptions__OptionsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsAssignment_2_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3886:1: ( rule__FieldOptions__OptionsAssignment_2_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3886:2: rule__FieldOptions__OptionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FieldOptions__OptionsAssignment_2_1_in_rule__FieldOptions__Group_2__1__Impl8201);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3900:1: rule__DefaultValueFieldOption__Group__0 : rule__DefaultValueFieldOption__Group__0__Impl rule__DefaultValueFieldOption__Group__1 ;
    public final void rule__DefaultValueFieldOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3904:1: ( rule__DefaultValueFieldOption__Group__0__Impl rule__DefaultValueFieldOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3905:2: rule__DefaultValueFieldOption__Group__0__Impl rule__DefaultValueFieldOption__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__0__Impl_in_rule__DefaultValueFieldOption__Group__08235);
            rule__DefaultValueFieldOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__1_in_rule__DefaultValueFieldOption__Group__08238);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3912:1: rule__DefaultValueFieldOption__Group__0__Impl : ( ( 'default' ) ) ;
    public final void rule__DefaultValueFieldOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3916:1: ( ( ( 'default' ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3917:1: ( ( 'default' ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3917:1: ( ( 'default' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3918:1: ( 'default' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getDefaultKeyword_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3919:1: ( 'default' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3920:2: 'default'
            {
            match(input,44,FOLLOW_44_in_rule__DefaultValueFieldOption__Group__0__Impl8267); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3931:1: rule__DefaultValueFieldOption__Group__1 : rule__DefaultValueFieldOption__Group__1__Impl rule__DefaultValueFieldOption__Group__2 ;
    public final void rule__DefaultValueFieldOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3935:1: ( rule__DefaultValueFieldOption__Group__1__Impl rule__DefaultValueFieldOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3936:2: rule__DefaultValueFieldOption__Group__1__Impl rule__DefaultValueFieldOption__Group__2
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__1__Impl_in_rule__DefaultValueFieldOption__Group__18299);
            rule__DefaultValueFieldOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__2_in_rule__DefaultValueFieldOption__Group__18302);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3943:1: rule__DefaultValueFieldOption__Group__1__Impl : ( '=' ) ;
    public final void rule__DefaultValueFieldOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3947:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3948:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3948:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3949:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,49,FOLLOW_49_in_rule__DefaultValueFieldOption__Group__1__Impl8330); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3962:1: rule__DefaultValueFieldOption__Group__2 : rule__DefaultValueFieldOption__Group__2__Impl ;
    public final void rule__DefaultValueFieldOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3966:1: ( rule__DefaultValueFieldOption__Group__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3967:2: rule__DefaultValueFieldOption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__2__Impl_in_rule__DefaultValueFieldOption__Group__28361);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3973:1: rule__DefaultValueFieldOption__Group__2__Impl : ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) ) ;
    public final void rule__DefaultValueFieldOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3977:1: ( ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3978:1: ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3978:1: ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3979:1: ( rule__DefaultValueFieldOption__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getValueAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3980:1: ( rule__DefaultValueFieldOption__ValueAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3980:2: rule__DefaultValueFieldOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__ValueAssignment_2_in_rule__DefaultValueFieldOption__Group__2__Impl8388);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3996:1: rule__NativeFieldOption__Group__0 : rule__NativeFieldOption__Group__0__Impl rule__NativeFieldOption__Group__1 ;
    public final void rule__NativeFieldOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4000:1: ( rule__NativeFieldOption__Group__0__Impl rule__NativeFieldOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4001:2: rule__NativeFieldOption__Group__0__Impl rule__NativeFieldOption__Group__1
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__0__Impl_in_rule__NativeFieldOption__Group__08424);
            rule__NativeFieldOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__1_in_rule__NativeFieldOption__Group__08427);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4008:1: rule__NativeFieldOption__Group__0__Impl : ( ( rule__NativeFieldOption__SourceAssignment_0 ) ) ;
    public final void rule__NativeFieldOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4012:1: ( ( ( rule__NativeFieldOption__SourceAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4013:1: ( ( rule__NativeFieldOption__SourceAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4013:1: ( ( rule__NativeFieldOption__SourceAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4014:1: ( rule__NativeFieldOption__SourceAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getSourceAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4015:1: ( rule__NativeFieldOption__SourceAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4015:2: rule__NativeFieldOption__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__SourceAssignment_0_in_rule__NativeFieldOption__Group__0__Impl8454);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4025:1: rule__NativeFieldOption__Group__1 : rule__NativeFieldOption__Group__1__Impl rule__NativeFieldOption__Group__2 ;
    public final void rule__NativeFieldOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4029:1: ( rule__NativeFieldOption__Group__1__Impl rule__NativeFieldOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4030:2: rule__NativeFieldOption__Group__1__Impl rule__NativeFieldOption__Group__2
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__1__Impl_in_rule__NativeFieldOption__Group__18484);
            rule__NativeFieldOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__2_in_rule__NativeFieldOption__Group__18487);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4037:1: rule__NativeFieldOption__Group__1__Impl : ( '=' ) ;
    public final void rule__NativeFieldOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4041:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4042:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4042:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4043:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,49,FOLLOW_49_in_rule__NativeFieldOption__Group__1__Impl8515); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4056:1: rule__NativeFieldOption__Group__2 : rule__NativeFieldOption__Group__2__Impl ;
    public final void rule__NativeFieldOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4060:1: ( rule__NativeFieldOption__Group__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4061:2: rule__NativeFieldOption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__2__Impl_in_rule__NativeFieldOption__Group__28546);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4067:1: rule__NativeFieldOption__Group__2__Impl : ( ( rule__NativeFieldOption__ValueAssignment_2 ) ) ;
    public final void rule__NativeFieldOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4071:1: ( ( ( rule__NativeFieldOption__ValueAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4072:1: ( ( rule__NativeFieldOption__ValueAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4072:1: ( ( rule__NativeFieldOption__ValueAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4073:1: ( rule__NativeFieldOption__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getValueAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4074:1: ( rule__NativeFieldOption__ValueAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4074:2: rule__NativeFieldOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__ValueAssignment_2_in_rule__NativeFieldOption__Group__2__Impl8573);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4090:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4094:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4095:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__08609);
            rule__Enum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__08612);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4102:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4106:1: ( ( 'enum' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4107:1: ( 'enum' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4107:1: ( 'enum' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4108:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Enum__Group__0__Impl8640); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4121:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4125:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4126:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__18671);
            rule__Enum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__18674);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4133:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4137:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4138:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4138:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4139:1: ( rule__Enum__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4140:1: ( rule__Enum__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4140:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl8701);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4150:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4154:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4155:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__28731);
            rule__Enum__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__28734);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4162:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4166:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4167:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4167:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4168:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,53,FOLLOW_53_in_rule__Enum__Group__2__Impl8762); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4181:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4185:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4186:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__38793);
            rule__Enum__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__38796);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4193:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__ElementsAssignment_3 )* ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4197:1: ( ( ( rule__Enum__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4198:1: ( ( rule__Enum__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4198:1: ( ( rule__Enum__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4199:1: ( rule__Enum__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4200:1: ( rule__Enum__ElementsAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==17) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4200:2: rule__Enum__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enum__ElementsAssignment_3_in_rule__Enum__Group__3__Impl8823);
            	    rule__Enum__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4210:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4214:1: ( rule__Enum__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4215:2: rule__Enum__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__48854);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4221:1: rule__Enum__Group__4__Impl : ( '}' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4225:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4226:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4226:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4227:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,54,FOLLOW_54_in_rule__Enum__Group__4__Impl8882); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4250:1: rule__EnumField__Group__0 : rule__EnumField__Group__0__Impl rule__EnumField__Group__1 ;
    public final void rule__EnumField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4254:1: ( rule__EnumField__Group__0__Impl rule__EnumField__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4255:2: rule__EnumField__Group__0__Impl rule__EnumField__Group__1
            {
            pushFollow(FOLLOW_rule__EnumField__Group__0__Impl_in_rule__EnumField__Group__08923);
            rule__EnumField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__1_in_rule__EnumField__Group__08926);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4262:1: rule__EnumField__Group__0__Impl : ( ( rule__EnumField__NameAssignment_0 ) ) ;
    public final void rule__EnumField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4266:1: ( ( ( rule__EnumField__NameAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4267:1: ( ( rule__EnumField__NameAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4267:1: ( ( rule__EnumField__NameAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4268:1: ( rule__EnumField__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getNameAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4269:1: ( rule__EnumField__NameAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4269:2: rule__EnumField__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumField__NameAssignment_0_in_rule__EnumField__Group__0__Impl8953);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4279:1: rule__EnumField__Group__1 : rule__EnumField__Group__1__Impl rule__EnumField__Group__2 ;
    public final void rule__EnumField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4283:1: ( rule__EnumField__Group__1__Impl rule__EnumField__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4284:2: rule__EnumField__Group__1__Impl rule__EnumField__Group__2
            {
            pushFollow(FOLLOW_rule__EnumField__Group__1__Impl_in_rule__EnumField__Group__18983);
            rule__EnumField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__2_in_rule__EnumField__Group__18986);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4291:1: rule__EnumField__Group__1__Impl : ( '=' ) ;
    public final void rule__EnumField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4295:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4296:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4296:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4297:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,49,FOLLOW_49_in_rule__EnumField__Group__1__Impl9014); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4310:1: rule__EnumField__Group__2 : rule__EnumField__Group__2__Impl rule__EnumField__Group__3 ;
    public final void rule__EnumField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4314:1: ( rule__EnumField__Group__2__Impl rule__EnumField__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4315:2: rule__EnumField__Group__2__Impl rule__EnumField__Group__3
            {
            pushFollow(FOLLOW_rule__EnumField__Group__2__Impl_in_rule__EnumField__Group__29045);
            rule__EnumField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__3_in_rule__EnumField__Group__29048);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4322:1: rule__EnumField__Group__2__Impl : ( ( rule__EnumField__IndexAssignment_2 ) ) ;
    public final void rule__EnumField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4326:1: ( ( ( rule__EnumField__IndexAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4327:1: ( ( rule__EnumField__IndexAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4327:1: ( ( rule__EnumField__IndexAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4328:1: ( rule__EnumField__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getIndexAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4329:1: ( rule__EnumField__IndexAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4329:2: rule__EnumField__IndexAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumField__IndexAssignment_2_in_rule__EnumField__Group__2__Impl9075);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4339:1: rule__EnumField__Group__3 : rule__EnumField__Group__3__Impl rule__EnumField__Group__4 ;
    public final void rule__EnumField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4343:1: ( rule__EnumField__Group__3__Impl rule__EnumField__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4344:2: rule__EnumField__Group__3__Impl rule__EnumField__Group__4
            {
            pushFollow(FOLLOW_rule__EnumField__Group__3__Impl_in_rule__EnumField__Group__39105);
            rule__EnumField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__4_in_rule__EnumField__Group__39108);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4351:1: rule__EnumField__Group__3__Impl : ( ( rule__EnumField__Group_3__0 )? ) ;
    public final void rule__EnumField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4355:1: ( ( ( rule__EnumField__Group_3__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4356:1: ( ( rule__EnumField__Group_3__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4356:1: ( ( rule__EnumField__Group_3__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4357:1: ( rule__EnumField__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getGroup_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4358:1: ( rule__EnumField__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==55) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4358:2: rule__EnumField__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumField__Group_3__0_in_rule__EnumField__Group__3__Impl9135);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4368:1: rule__EnumField__Group__4 : rule__EnumField__Group__4__Impl ;
    public final void rule__EnumField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4372:1: ( rule__EnumField__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4373:2: rule__EnumField__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumField__Group__4__Impl_in_rule__EnumField__Group__49166);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4379:1: rule__EnumField__Group__4__Impl : ( ';' ) ;
    public final void rule__EnumField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4383:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4384:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4384:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4385:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getSemicolonKeyword_4()); 
            }
            match(input,50,FOLLOW_50_in_rule__EnumField__Group__4__Impl9194); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4408:1: rule__EnumField__Group_3__0 : rule__EnumField__Group_3__0__Impl rule__EnumField__Group_3__1 ;
    public final void rule__EnumField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4412:1: ( rule__EnumField__Group_3__0__Impl rule__EnumField__Group_3__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4413:2: rule__EnumField__Group_3__0__Impl rule__EnumField__Group_3__1
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__0__Impl_in_rule__EnumField__Group_3__09235);
            rule__EnumField__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3__1_in_rule__EnumField__Group_3__09238);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4420:1: rule__EnumField__Group_3__0__Impl : ( '[' ) ;
    public final void rule__EnumField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4424:1: ( ( '[' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4425:1: ( '[' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4425:1: ( '[' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4426:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getLeftSquareBracketKeyword_3_0()); 
            }
            match(input,55,FOLLOW_55_in_rule__EnumField__Group_3__0__Impl9266); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4439:1: rule__EnumField__Group_3__1 : rule__EnumField__Group_3__1__Impl rule__EnumField__Group_3__2 ;
    public final void rule__EnumField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4443:1: ( rule__EnumField__Group_3__1__Impl rule__EnumField__Group_3__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4444:2: rule__EnumField__Group_3__1__Impl rule__EnumField__Group_3__2
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__1__Impl_in_rule__EnumField__Group_3__19297);
            rule__EnumField__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3__2_in_rule__EnumField__Group_3__19300);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4451:1: rule__EnumField__Group_3__1__Impl : ( ( rule__EnumField__OptionsAssignment_3_1 ) ) ;
    public final void rule__EnumField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4455:1: ( ( ( rule__EnumField__OptionsAssignment_3_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4456:1: ( ( rule__EnumField__OptionsAssignment_3_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4456:1: ( ( rule__EnumField__OptionsAssignment_3_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4457:1: ( rule__EnumField__OptionsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsAssignment_3_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4458:1: ( rule__EnumField__OptionsAssignment_3_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4458:2: rule__EnumField__OptionsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumField__OptionsAssignment_3_1_in_rule__EnumField__Group_3__1__Impl9327);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4468:1: rule__EnumField__Group_3__2 : rule__EnumField__Group_3__2__Impl rule__EnumField__Group_3__3 ;
    public final void rule__EnumField__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4472:1: ( rule__EnumField__Group_3__2__Impl rule__EnumField__Group_3__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4473:2: rule__EnumField__Group_3__2__Impl rule__EnumField__Group_3__3
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__2__Impl_in_rule__EnumField__Group_3__29357);
            rule__EnumField__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3__3_in_rule__EnumField__Group_3__29360);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4480:1: rule__EnumField__Group_3__2__Impl : ( ( rule__EnumField__Group_3_2__0 )* ) ;
    public final void rule__EnumField__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4484:1: ( ( ( rule__EnumField__Group_3_2__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4485:1: ( ( rule__EnumField__Group_3_2__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4485:1: ( ( rule__EnumField__Group_3_2__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4486:1: ( rule__EnumField__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getGroup_3_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4487:1: ( rule__EnumField__Group_3_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==57) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4487:2: rule__EnumField__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumField__Group_3_2__0_in_rule__EnumField__Group_3__2__Impl9387);
            	    rule__EnumField__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4497:1: rule__EnumField__Group_3__3 : rule__EnumField__Group_3__3__Impl ;
    public final void rule__EnumField__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4501:1: ( rule__EnumField__Group_3__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4502:2: rule__EnumField__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__3__Impl_in_rule__EnumField__Group_3__39418);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4508:1: rule__EnumField__Group_3__3__Impl : ( ']' ) ;
    public final void rule__EnumField__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4512:1: ( ( ']' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4513:1: ( ']' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4513:1: ( ']' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4514:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getRightSquareBracketKeyword_3_3()); 
            }
            match(input,56,FOLLOW_56_in_rule__EnumField__Group_3__3__Impl9446); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4535:1: rule__EnumField__Group_3_2__0 : rule__EnumField__Group_3_2__0__Impl rule__EnumField__Group_3_2__1 ;
    public final void rule__EnumField__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4539:1: ( rule__EnumField__Group_3_2__0__Impl rule__EnumField__Group_3_2__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4540:2: rule__EnumField__Group_3_2__0__Impl rule__EnumField__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3_2__0__Impl_in_rule__EnumField__Group_3_2__09485);
            rule__EnumField__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3_2__1_in_rule__EnumField__Group_3_2__09488);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4547:1: rule__EnumField__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__EnumField__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4551:1: ( ( ',' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4552:1: ( ',' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4552:1: ( ',' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4553:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__EnumField__Group_3_2__0__Impl9516); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4566:1: rule__EnumField__Group_3_2__1 : rule__EnumField__Group_3_2__1__Impl ;
    public final void rule__EnumField__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4570:1: ( rule__EnumField__Group_3_2__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4571:2: rule__EnumField__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3_2__1__Impl_in_rule__EnumField__Group_3_2__19547);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4577:1: rule__EnumField__Group_3_2__1__Impl : ( ( rule__EnumField__OptionsAssignment_3_2_1 ) ) ;
    public final void rule__EnumField__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4581:1: ( ( ( rule__EnumField__OptionsAssignment_3_2_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4582:1: ( ( rule__EnumField__OptionsAssignment_3_2_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4582:1: ( ( rule__EnumField__OptionsAssignment_3_2_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4583:1: ( rule__EnumField__OptionsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsAssignment_3_2_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4584:1: ( rule__EnumField__OptionsAssignment_3_2_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4584:2: rule__EnumField__OptionsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__EnumField__OptionsAssignment_3_2_1_in_rule__EnumField__Group_3_2__1__Impl9574);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4598:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4602:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4603:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__09608);
            rule__Service__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__09611);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4610:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4614:1: ( ( 'service' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4615:1: ( 'service' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4615:1: ( 'service' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4616:1: 'service'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Service__Group__0__Impl9639); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4629:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4633:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4634:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__19670);
            rule__Service__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__19673);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4641:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4645:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4646:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4646:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4647:1: ( rule__Service__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4648:1: ( rule__Service__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4648:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl9700);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4658:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4662:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4663:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__29730);
            rule__Service__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__29733);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4670:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4674:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4675:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4675:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4676:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,53,FOLLOW_53_in_rule__Service__Group__2__Impl9761); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4689:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4693:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4694:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__39792);
            rule__Service__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__39795);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4701:1: rule__Service__Group__3__Impl : ( ( ( rule__Service__ElementsAssignment_3 ) ) ( ( rule__Service__ElementsAssignment_3 )* ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4705:1: ( ( ( ( rule__Service__ElementsAssignment_3 ) ) ( ( rule__Service__ElementsAssignment_3 )* ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4706:1: ( ( ( rule__Service__ElementsAssignment_3 ) ) ( ( rule__Service__ElementsAssignment_3 )* ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4706:1: ( ( ( rule__Service__ElementsAssignment_3 ) ) ( ( rule__Service__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4707:1: ( ( rule__Service__ElementsAssignment_3 ) ) ( ( rule__Service__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4707:1: ( ( rule__Service__ElementsAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4708:1: ( rule__Service__ElementsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4709:1: ( rule__Service__ElementsAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4709:2: rule__Service__ElementsAssignment_3
            {
            pushFollow(FOLLOW_rule__Service__ElementsAssignment_3_in_rule__Service__Group__3__Impl9824);
            rule__Service__ElementsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getElementsAssignment_3()); 
            }

            }

            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4712:1: ( ( rule__Service__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4713:1: ( rule__Service__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4714:1: ( rule__Service__ElementsAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==17||LA29_0==27) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4714:2: rule__Service__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Service__ElementsAssignment_3_in_rule__Service__Group__3__Impl9836);
            	    rule__Service__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4725:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4729:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4730:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__49869);
            rule__Service__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__5_in_rule__Service__Group__49872);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4737:1: rule__Service__Group__4__Impl : ( '}' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4741:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4742:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4742:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4743:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,54,FOLLOW_54_in_rule__Service__Group__4__Impl9900); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4756:1: rule__Service__Group__5 : rule__Service__Group__5__Impl ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4760:1: ( rule__Service__Group__5__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4761:2: rule__Service__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__59931);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4767:1: rule__Service__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4771:1: ( ( ( ';' )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4772:1: ( ( ';' )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4772:1: ( ( ';' )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4773:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getSemicolonKeyword_5()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4774:1: ( ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==50) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4775:2: ';'
                    {
                    match(input,50,FOLLOW_50_in_rule__Service__Group__5__Impl9960); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4798:1: rule__Rpc__Group__0 : rule__Rpc__Group__0__Impl rule__Rpc__Group__1 ;
    public final void rule__Rpc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4802:1: ( rule__Rpc__Group__0__Impl rule__Rpc__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4803:2: rule__Rpc__Group__0__Impl rule__Rpc__Group__1
            {
            pushFollow(FOLLOW_rule__Rpc__Group__0__Impl_in_rule__Rpc__Group__010005);
            rule__Rpc__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__1_in_rule__Rpc__Group__010008);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4810:1: rule__Rpc__Group__0__Impl : ( 'rpc' ) ;
    public final void rule__Rpc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4814:1: ( ( 'rpc' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4815:1: ( 'rpc' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4815:1: ( 'rpc' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4816:1: 'rpc'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRpcKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Rpc__Group__0__Impl10036); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4829:1: rule__Rpc__Group__1 : rule__Rpc__Group__1__Impl rule__Rpc__Group__2 ;
    public final void rule__Rpc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4833:1: ( rule__Rpc__Group__1__Impl rule__Rpc__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4834:2: rule__Rpc__Group__1__Impl rule__Rpc__Group__2
            {
            pushFollow(FOLLOW_rule__Rpc__Group__1__Impl_in_rule__Rpc__Group__110067);
            rule__Rpc__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__2_in_rule__Rpc__Group__110070);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4841:1: rule__Rpc__Group__1__Impl : ( ( rule__Rpc__NameAssignment_1 ) ) ;
    public final void rule__Rpc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4845:1: ( ( ( rule__Rpc__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4846:1: ( ( rule__Rpc__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4846:1: ( ( rule__Rpc__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4847:1: ( rule__Rpc__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4848:1: ( rule__Rpc__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4848:2: rule__Rpc__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rpc__NameAssignment_1_in_rule__Rpc__Group__1__Impl10097);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4858:1: rule__Rpc__Group__2 : rule__Rpc__Group__2__Impl rule__Rpc__Group__3 ;
    public final void rule__Rpc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4862:1: ( rule__Rpc__Group__2__Impl rule__Rpc__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4863:2: rule__Rpc__Group__2__Impl rule__Rpc__Group__3
            {
            pushFollow(FOLLOW_rule__Rpc__Group__2__Impl_in_rule__Rpc__Group__210127);
            rule__Rpc__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__3_in_rule__Rpc__Group__210130);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4870:1: rule__Rpc__Group__2__Impl : ( '(' ) ;
    public final void rule__Rpc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4874:1: ( ( '(' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4875:1: ( '(' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4875:1: ( '(' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4876:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,58,FOLLOW_58_in_rule__Rpc__Group__2__Impl10158); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4889:1: rule__Rpc__Group__3 : rule__Rpc__Group__3__Impl rule__Rpc__Group__4 ;
    public final void rule__Rpc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4893:1: ( rule__Rpc__Group__3__Impl rule__Rpc__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4894:2: rule__Rpc__Group__3__Impl rule__Rpc__Group__4
            {
            pushFollow(FOLLOW_rule__Rpc__Group__3__Impl_in_rule__Rpc__Group__310189);
            rule__Rpc__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__4_in_rule__Rpc__Group__310192);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4901:1: rule__Rpc__Group__3__Impl : ( ( rule__Rpc__ArgTypeAssignment_3 ) ) ;
    public final void rule__Rpc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4905:1: ( ( ( rule__Rpc__ArgTypeAssignment_3 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4906:1: ( ( rule__Rpc__ArgTypeAssignment_3 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4906:1: ( ( rule__Rpc__ArgTypeAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4907:1: ( rule__Rpc__ArgTypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getArgTypeAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4908:1: ( rule__Rpc__ArgTypeAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4908:2: rule__Rpc__ArgTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Rpc__ArgTypeAssignment_3_in_rule__Rpc__Group__3__Impl10219);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4918:1: rule__Rpc__Group__4 : rule__Rpc__Group__4__Impl rule__Rpc__Group__5 ;
    public final void rule__Rpc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4922:1: ( rule__Rpc__Group__4__Impl rule__Rpc__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4923:2: rule__Rpc__Group__4__Impl rule__Rpc__Group__5
            {
            pushFollow(FOLLOW_rule__Rpc__Group__4__Impl_in_rule__Rpc__Group__410249);
            rule__Rpc__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__5_in_rule__Rpc__Group__410252);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4930:1: rule__Rpc__Group__4__Impl : ( ')' ) ;
    public final void rule__Rpc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4934:1: ( ( ')' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4935:1: ( ')' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4935:1: ( ')' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4936:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,59,FOLLOW_59_in_rule__Rpc__Group__4__Impl10280); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4949:1: rule__Rpc__Group__5 : rule__Rpc__Group__5__Impl rule__Rpc__Group__6 ;
    public final void rule__Rpc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4953:1: ( rule__Rpc__Group__5__Impl rule__Rpc__Group__6 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4954:2: rule__Rpc__Group__5__Impl rule__Rpc__Group__6
            {
            pushFollow(FOLLOW_rule__Rpc__Group__5__Impl_in_rule__Rpc__Group__510311);
            rule__Rpc__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__6_in_rule__Rpc__Group__510314);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4961:1: rule__Rpc__Group__5__Impl : ( 'returns' ) ;
    public final void rule__Rpc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4965:1: ( ( 'returns' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4966:1: ( 'returns' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4966:1: ( 'returns' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4967:1: 'returns'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getReturnsKeyword_5()); 
            }
            match(input,28,FOLLOW_28_in_rule__Rpc__Group__5__Impl10342); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4980:1: rule__Rpc__Group__6 : rule__Rpc__Group__6__Impl rule__Rpc__Group__7 ;
    public final void rule__Rpc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4984:1: ( rule__Rpc__Group__6__Impl rule__Rpc__Group__7 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4985:2: rule__Rpc__Group__6__Impl rule__Rpc__Group__7
            {
            pushFollow(FOLLOW_rule__Rpc__Group__6__Impl_in_rule__Rpc__Group__610373);
            rule__Rpc__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__7_in_rule__Rpc__Group__610376);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4992:1: rule__Rpc__Group__6__Impl : ( '(' ) ;
    public final void rule__Rpc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4996:1: ( ( '(' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4997:1: ( '(' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4997:1: ( '(' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4998:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getLeftParenthesisKeyword_6()); 
            }
            match(input,58,FOLLOW_58_in_rule__Rpc__Group__6__Impl10404); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5011:1: rule__Rpc__Group__7 : rule__Rpc__Group__7__Impl rule__Rpc__Group__8 ;
    public final void rule__Rpc__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5015:1: ( rule__Rpc__Group__7__Impl rule__Rpc__Group__8 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5016:2: rule__Rpc__Group__7__Impl rule__Rpc__Group__8
            {
            pushFollow(FOLLOW_rule__Rpc__Group__7__Impl_in_rule__Rpc__Group__710435);
            rule__Rpc__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__8_in_rule__Rpc__Group__710438);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5023:1: rule__Rpc__Group__7__Impl : ( ( rule__Rpc__ReturnTypeAssignment_7 ) ) ;
    public final void rule__Rpc__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5027:1: ( ( ( rule__Rpc__ReturnTypeAssignment_7 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5028:1: ( ( rule__Rpc__ReturnTypeAssignment_7 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5028:1: ( ( rule__Rpc__ReturnTypeAssignment_7 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5029:1: ( rule__Rpc__ReturnTypeAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getReturnTypeAssignment_7()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5030:1: ( rule__Rpc__ReturnTypeAssignment_7 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5030:2: rule__Rpc__ReturnTypeAssignment_7
            {
            pushFollow(FOLLOW_rule__Rpc__ReturnTypeAssignment_7_in_rule__Rpc__Group__7__Impl10465);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5040:1: rule__Rpc__Group__8 : rule__Rpc__Group__8__Impl rule__Rpc__Group__9 ;
    public final void rule__Rpc__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5044:1: ( rule__Rpc__Group__8__Impl rule__Rpc__Group__9 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5045:2: rule__Rpc__Group__8__Impl rule__Rpc__Group__9
            {
            pushFollow(FOLLOW_rule__Rpc__Group__8__Impl_in_rule__Rpc__Group__810495);
            rule__Rpc__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__9_in_rule__Rpc__Group__810498);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5052:1: rule__Rpc__Group__8__Impl : ( ')' ) ;
    public final void rule__Rpc__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5056:1: ( ( ')' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5057:1: ( ')' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5057:1: ( ')' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5058:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,59,FOLLOW_59_in_rule__Rpc__Group__8__Impl10526); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5071:1: rule__Rpc__Group__9 : rule__Rpc__Group__9__Impl rule__Rpc__Group__10 ;
    public final void rule__Rpc__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5075:1: ( rule__Rpc__Group__9__Impl rule__Rpc__Group__10 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5076:2: rule__Rpc__Group__9__Impl rule__Rpc__Group__10
            {
            pushFollow(FOLLOW_rule__Rpc__Group__9__Impl_in_rule__Rpc__Group__910557);
            rule__Rpc__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__10_in_rule__Rpc__Group__910560);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5083:1: rule__Rpc__Group__9__Impl : ( ( rule__Rpc__Group_9__0 )? ) ;
    public final void rule__Rpc__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5087:1: ( ( ( rule__Rpc__Group_9__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5088:1: ( ( rule__Rpc__Group_9__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5088:1: ( ( rule__Rpc__Group_9__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5089:1: ( rule__Rpc__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getGroup_9()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5090:1: ( rule__Rpc__Group_9__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==53) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5090:2: rule__Rpc__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Rpc__Group_9__0_in_rule__Rpc__Group__9__Impl10587);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5100:1: rule__Rpc__Group__10 : rule__Rpc__Group__10__Impl ;
    public final void rule__Rpc__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5104:1: ( rule__Rpc__Group__10__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5105:2: rule__Rpc__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Rpc__Group__10__Impl_in_rule__Rpc__Group__1010618);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5111:1: rule__Rpc__Group__10__Impl : ( ( ( ';' ) ) ( ( ';' )* ) ) ;
    public final void rule__Rpc__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5115:1: ( ( ( ( ';' ) ) ( ( ';' )* ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5116:1: ( ( ( ';' ) ) ( ( ';' )* ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5116:1: ( ( ( ';' ) ) ( ( ';' )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5117:1: ( ( ';' ) ) ( ( ';' )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5117:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5118:1: ( ';' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getSemicolonKeyword_10()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5119:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5120:2: ';'
            {
            match(input,50,FOLLOW_50_in_rule__Rpc__Group__10__Impl10649); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcAccess().getSemicolonKeyword_10()); 
            }

            }

            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5124:1: ( ( ';' )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5125:1: ( ';' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getSemicolonKeyword_10()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5126:1: ( ';' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==50) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5127:2: ';'
            	    {
            	    match(input,50,FOLLOW_50_in_rule__Rpc__Group__10__Impl10665); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5161:1: rule__Rpc__Group_9__0 : rule__Rpc__Group_9__0__Impl rule__Rpc__Group_9__1 ;
    public final void rule__Rpc__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5165:1: ( rule__Rpc__Group_9__0__Impl rule__Rpc__Group_9__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5166:2: rule__Rpc__Group_9__0__Impl rule__Rpc__Group_9__1
            {
            pushFollow(FOLLOW_rule__Rpc__Group_9__0__Impl_in_rule__Rpc__Group_9__010722);
            rule__Rpc__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group_9__1_in_rule__Rpc__Group_9__010725);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5173:1: rule__Rpc__Group_9__0__Impl : ( '{' ) ;
    public final void rule__Rpc__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5177:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5178:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5178:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5179:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getLeftCurlyBracketKeyword_9_0()); 
            }
            match(input,53,FOLLOW_53_in_rule__Rpc__Group_9__0__Impl10753); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5192:1: rule__Rpc__Group_9__1 : rule__Rpc__Group_9__1__Impl rule__Rpc__Group_9__2 ;
    public final void rule__Rpc__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5196:1: ( rule__Rpc__Group_9__1__Impl rule__Rpc__Group_9__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5197:2: rule__Rpc__Group_9__1__Impl rule__Rpc__Group_9__2
            {
            pushFollow(FOLLOW_rule__Rpc__Group_9__1__Impl_in_rule__Rpc__Group_9__110784);
            rule__Rpc__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group_9__2_in_rule__Rpc__Group_9__110787);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5204:1: rule__Rpc__Group_9__1__Impl : ( ( rule__Rpc__OptionsAssignment_9_1 )* ) ;
    public final void rule__Rpc__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5208:1: ( ( ( rule__Rpc__OptionsAssignment_9_1 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5209:1: ( ( rule__Rpc__OptionsAssignment_9_1 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5209:1: ( ( rule__Rpc__OptionsAssignment_9_1 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5210:1: ( rule__Rpc__OptionsAssignment_9_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getOptionsAssignment_9_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5211:1: ( rule__Rpc__OptionsAssignment_9_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==17) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5211:2: rule__Rpc__OptionsAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_rule__Rpc__OptionsAssignment_9_1_in_rule__Rpc__Group_9__1__Impl10814);
            	    rule__Rpc__OptionsAssignment_9_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5221:1: rule__Rpc__Group_9__2 : rule__Rpc__Group_9__2__Impl ;
    public final void rule__Rpc__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5225:1: ( rule__Rpc__Group_9__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5226:2: rule__Rpc__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Rpc__Group_9__2__Impl_in_rule__Rpc__Group_9__210845);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5232:1: rule__Rpc__Group_9__2__Impl : ( '}' ) ;
    public final void rule__Rpc__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5236:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5237:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5237:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5238:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRightCurlyBracketKeyword_9_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__Rpc__Group_9__2__Impl10873); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5257:1: rule__Extend__Group__0 : rule__Extend__Group__0__Impl rule__Extend__Group__1 ;
    public final void rule__Extend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5261:1: ( rule__Extend__Group__0__Impl rule__Extend__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5262:2: rule__Extend__Group__0__Impl rule__Extend__Group__1
            {
            pushFollow(FOLLOW_rule__Extend__Group__0__Impl_in_rule__Extend__Group__010910);
            rule__Extend__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__1_in_rule__Extend__Group__010913);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5269:1: rule__Extend__Group__0__Impl : ( 'extend' ) ;
    public final void rule__Extend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5273:1: ( ( 'extend' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5274:1: ( 'extend' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5274:1: ( 'extend' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5275:1: 'extend'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getExtendKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Extend__Group__0__Impl10941); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5288:1: rule__Extend__Group__1 : rule__Extend__Group__1__Impl rule__Extend__Group__2 ;
    public final void rule__Extend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5292:1: ( rule__Extend__Group__1__Impl rule__Extend__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5293:2: rule__Extend__Group__1__Impl rule__Extend__Group__2
            {
            pushFollow(FOLLOW_rule__Extend__Group__1__Impl_in_rule__Extend__Group__110972);
            rule__Extend__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__2_in_rule__Extend__Group__110975);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5300:1: rule__Extend__Group__1__Impl : ( ( rule__Extend__TypeAssignment_1 ) ) ;
    public final void rule__Extend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5304:1: ( ( ( rule__Extend__TypeAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5305:1: ( ( rule__Extend__TypeAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5305:1: ( ( rule__Extend__TypeAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5306:1: ( rule__Extend__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getTypeAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5307:1: ( rule__Extend__TypeAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5307:2: rule__Extend__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Extend__TypeAssignment_1_in_rule__Extend__Group__1__Impl11002);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5317:1: rule__Extend__Group__2 : rule__Extend__Group__2__Impl rule__Extend__Group__3 ;
    public final void rule__Extend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5321:1: ( rule__Extend__Group__2__Impl rule__Extend__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5322:2: rule__Extend__Group__2__Impl rule__Extend__Group__3
            {
            pushFollow(FOLLOW_rule__Extend__Group__2__Impl_in_rule__Extend__Group__211032);
            rule__Extend__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__3_in_rule__Extend__Group__211035);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5329:1: rule__Extend__Group__2__Impl : ( '{' ) ;
    public final void rule__Extend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5333:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5334:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5334:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5335:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,53,FOLLOW_53_in_rule__Extend__Group__2__Impl11063); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5348:1: rule__Extend__Group__3 : rule__Extend__Group__3__Impl rule__Extend__Group__4 ;
    public final void rule__Extend__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5352:1: ( rule__Extend__Group__3__Impl rule__Extend__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5353:2: rule__Extend__Group__3__Impl rule__Extend__Group__4
            {
            pushFollow(FOLLOW_rule__Extend__Group__3__Impl_in_rule__Extend__Group__311094);
            rule__Extend__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__4_in_rule__Extend__Group__311097);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5360:1: rule__Extend__Group__3__Impl : ( ( rule__Extend__ElementsAssignment_3 )* ) ;
    public final void rule__Extend__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5364:1: ( ( ( rule__Extend__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5365:1: ( ( rule__Extend__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5365:1: ( ( rule__Extend__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5366:1: ( rule__Extend__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5367:1: ( rule__Extend__ElementsAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=17 && LA34_0<=25)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5367:2: rule__Extend__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Extend__ElementsAssignment_3_in_rule__Extend__Group__3__Impl11124);
            	    rule__Extend__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5377:1: rule__Extend__Group__4 : rule__Extend__Group__4__Impl rule__Extend__Group__5 ;
    public final void rule__Extend__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5381:1: ( rule__Extend__Group__4__Impl rule__Extend__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5382:2: rule__Extend__Group__4__Impl rule__Extend__Group__5
            {
            pushFollow(FOLLOW_rule__Extend__Group__4__Impl_in_rule__Extend__Group__411155);
            rule__Extend__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__5_in_rule__Extend__Group__411158);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5389:1: rule__Extend__Group__4__Impl : ( '}' ) ;
    public final void rule__Extend__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5393:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5394:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5394:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5395:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,54,FOLLOW_54_in_rule__Extend__Group__4__Impl11186); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5408:1: rule__Extend__Group__5 : rule__Extend__Group__5__Impl ;
    public final void rule__Extend__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5412:1: ( rule__Extend__Group__5__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5413:2: rule__Extend__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Extend__Group__5__Impl_in_rule__Extend__Group__511217);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5419:1: rule__Extend__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__Extend__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5423:1: ( ( ( ';' )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5424:1: ( ( ';' )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5424:1: ( ( ';' )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5425:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getSemicolonKeyword_5()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5426:1: ( ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==50) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5427:2: ';'
                    {
                    match(input,50,FOLLOW_50_in_rule__Extend__Group__5__Impl11246); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5450:1: rule__FULL_ID__Group__0 : rule__FULL_ID__Group__0__Impl rule__FULL_ID__Group__1 ;
    public final void rule__FULL_ID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5454:1: ( rule__FULL_ID__Group__0__Impl rule__FULL_ID__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5455:2: rule__FULL_ID__Group__0__Impl rule__FULL_ID__Group__1
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group__0__Impl_in_rule__FULL_ID__Group__011291);
            rule__FULL_ID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FULL_ID__Group__1_in_rule__FULL_ID__Group__011294);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5462:1: rule__FULL_ID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FULL_ID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5466:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5467:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5467:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5468:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FULL_ID__Group__0__Impl11321); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5479:1: rule__FULL_ID__Group__1 : rule__FULL_ID__Group__1__Impl ;
    public final void rule__FULL_ID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5483:1: ( rule__FULL_ID__Group__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5484:2: rule__FULL_ID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group__1__Impl_in_rule__FULL_ID__Group__111350);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5490:1: rule__FULL_ID__Group__1__Impl : ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) ) ;
    public final void rule__FULL_ID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5494:1: ( ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5495:1: ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5495:1: ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5496:1: ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5496:1: ( ( rule__FULL_ID__Group_1__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5497:1: ( rule__FULL_ID__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getGroup_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5498:1: ( rule__FULL_ID__Group_1__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5498:2: rule__FULL_ID__Group_1__0
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl11379);
            rule__FULL_ID__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFULL_IDAccess().getGroup_1()); 
            }

            }

            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5501:1: ( ( rule__FULL_ID__Group_1__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5502:1: ( rule__FULL_ID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getGroup_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5503:1: ( rule__FULL_ID__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==60) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5503:2: rule__FULL_ID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl11391);
            	    rule__FULL_ID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5518:1: rule__FULL_ID__Group_1__0 : rule__FULL_ID__Group_1__0__Impl rule__FULL_ID__Group_1__1 ;
    public final void rule__FULL_ID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5522:1: ( rule__FULL_ID__Group_1__0__Impl rule__FULL_ID__Group_1__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5523:2: rule__FULL_ID__Group_1__0__Impl rule__FULL_ID__Group_1__1
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__0__Impl_in_rule__FULL_ID__Group_1__011428);
            rule__FULL_ID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__1_in_rule__FULL_ID__Group_1__011431);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5530:1: rule__FULL_ID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FULL_ID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5534:1: ( ( '.' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5535:1: ( '.' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5535:1: ( '.' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5536:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,60,FOLLOW_60_in_rule__FULL_ID__Group_1__0__Impl11459); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5549:1: rule__FULL_ID__Group_1__1 : rule__FULL_ID__Group_1__1__Impl ;
    public final void rule__FULL_ID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5553:1: ( rule__FULL_ID__Group_1__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5554:2: rule__FULL_ID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__1__Impl_in_rule__FULL_ID__Group_1__111490);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5560:1: rule__FULL_ID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FULL_ID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5564:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5565:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5565:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5566:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FULL_ID__Group_1__1__Impl11517); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5583:1: rule__Proto__SyntaxAssignment_0 : ( ruleSyntax ) ;
    public final void rule__Proto__SyntaxAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5587:1: ( ( ruleSyntax ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5588:1: ( ruleSyntax )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5588:1: ( ruleSyntax )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5589:1: ruleSyntax
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getSyntaxSyntaxParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSyntax_in_rule__Proto__SyntaxAssignment_011556);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5598:1: rule__Proto__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Proto__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5602:1: ( ( ruleStatement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5603:1: ( ruleStatement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5603:1: ( ruleStatement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5604:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getStatementsStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Proto__StatementsAssignment_111587);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5613:1: rule__Syntax__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Syntax__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5617:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5618:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5618:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5619:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Syntax__NameAssignment_211618); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5628:1: rule__Package__NameAssignment_1 : ( ruleVar_full ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5632:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5633:1: ( ruleVar_full )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5633:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5634:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameVar_fullParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__Package__NameAssignment_111649);
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


    // $ANTLR start "rule__PublicImport__ImportURIAssignment_2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5643:1: rule__PublicImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PublicImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5647:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5648:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5648:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5649:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PublicImport__ImportURIAssignment_211680); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5658:1: rule__WeakImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__WeakImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5662:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5663:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5663:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5664:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__WeakImport__ImportURIAssignment_211711); if (state.failed) return ;
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


    // $ANTLR start "rule__Option__SourceAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5673:1: rule__Option__SourceAssignment_1 : ( ( ruleVar_full ) ) ;
    public final void rule__Option__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5677:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5678:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5678:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5679:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getSourceMessageFieldCrossReference_1_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5680:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5681:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getSourceMessageFieldVar_fullParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__Option__SourceAssignment_111746);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5692:1: rule__Option__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__Option__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5696:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5697:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5697:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5698:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getValueValueParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Option__ValueAssignment_311781);
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


    // $ANTLR start "rule__EnumLink__TargetAssignment"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5707:1: rule__EnumLink__TargetAssignment : ( ( RULE_ID ) ) ;
    public final void rule__EnumLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5711:1: ( ( ( RULE_ID ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5712:1: ( ( RULE_ID ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5712:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5713:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLinkAccess().getTargetEnumFieldCrossReference_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5714:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5715:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLinkAccess().getTargetEnumFieldIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumLink__TargetAssignment11816); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLinkAccess().getTargetEnumFieldIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLinkAccess().getTargetEnumFieldCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLink__TargetAssignment"


    // $ANTLR start "rule__StringLink__TargetAssignment"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5726:1: rule__StringLink__TargetAssignment : ( RULE_STRING ) ;
    public final void rule__StringLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5730:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5731:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5731:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5732:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLinkAccess().getTargetSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLink__TargetAssignment11851); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5741:1: rule__BooleanLink__TargetAssignment : ( ruleBOOL ) ;
    public final void rule__BooleanLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5745:1: ( ( ruleBOOL ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5746:1: ( ruleBOOL )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5746:1: ( ruleBOOL )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5747:1: ruleBOOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLinkAccess().getTargetBOOLEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_rule__BooleanLink__TargetAssignment11882);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5756:1: rule__IntLink__TargetAssignment : ( RULE_NUMINT ) ;
    public final void rule__IntLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5760:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5761:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5761:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5762:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLinkAccess().getTargetNUMINTTerminalRuleCall_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__IntLink__TargetAssignment11913); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5771:1: rule__DoubleLink__TargetAssignment : ( RULE_NUMDOUBLE ) ;
    public final void rule__DoubleLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5775:1: ( ( RULE_NUMDOUBLE ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5776:1: ( RULE_NUMDOUBLE )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5776:1: ( RULE_NUMDOUBLE )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5777:1: RULE_NUMDOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLinkAccess().getTargetNUMDOUBLETerminalRuleCall_0()); 
            }
            match(input,RULE_NUMDOUBLE,FOLLOW_RULE_NUMDOUBLE_in_rule__DoubleLink__TargetAssignment11944); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5786:1: rule__Message__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5790:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5791:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5791:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5792:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__NameAssignment_111975); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5801:1: rule__Message__ElementsAssignment_3 : ( ruleMessageElement ) ;
    public final void rule__Message__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5805:1: ( ( ruleMessageElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5806:1: ( ruleMessageElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5806:1: ( ruleMessageElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5807:1: ruleMessageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getElementsMessageElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_rule__Message__ElementsAssignment_312006);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5816:1: rule__ExtensionRange__FromAssignment_1 : ( RULE_NUMINT ) ;
    public final void rule__ExtensionRange__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5820:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5821:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5821:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5822:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getFromNUMINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__ExtensionRange__FromAssignment_112037); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5831:1: rule__ExtensionRange__ToAssignment_2_1 : ( RULE_NUMINT ) ;
    public final void rule__ExtensionRange__ToAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5835:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5836:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5836:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5837:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getToNUMINTTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__ExtensionRange__ToAssignment_2_112068); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5846:1: rule__MessageField__ModifierAssignment_0 : ( ruleModifier ) ;
    public final void rule__MessageField__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5850:1: ( ( ruleModifier ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5851:1: ( ruleModifier )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5851:1: ( ruleModifier )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5852:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getModifierModifierEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__MessageField__ModifierAssignment_012099);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5861:1: rule__MessageField__TypeAssignment_1 : ( ruleTypeLink ) ;
    public final void rule__MessageField__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5865:1: ( ( ruleTypeLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5866:1: ( ruleTypeLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5866:1: ( ruleTypeLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5867:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getTypeTypeLinkParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__MessageField__TypeAssignment_112130);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5876:1: rule__MessageField__NameAssignment_2 : ( ruleVar ) ;
    public final void rule__MessageField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5880:1: ( ( ruleVar ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5881:1: ( ruleVar )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5881:1: ( ruleVar )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5882:1: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getNameVarParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVar_in_rule__MessageField__NameAssignment_212161);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5891:1: rule__MessageField__IndexAssignment_4 : ( RULE_NUMINT ) ;
    public final void rule__MessageField__IndexAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5895:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5896:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5896:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5897:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getIndexNUMINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__MessageField__IndexAssignment_412192); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5906:1: rule__MessageField__OptionsAssignment_5 : ( ruleFieldOptions ) ;
    public final void rule__MessageField__OptionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5910:1: ( ( ruleFieldOptions ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5911:1: ( ruleFieldOptions )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5911:1: ( ruleFieldOptions )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5912:1: ruleFieldOptions
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getOptionsFieldOptionsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_rule__MessageField__OptionsAssignment_512223);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5921:1: rule__Group__ModifierAssignment_0 : ( ruleModifier ) ;
    public final void rule__Group__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5925:1: ( ( ruleModifier ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5926:1: ( ruleModifier )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5926:1: ( ruleModifier )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5927:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getModifierModifierEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Group__ModifierAssignment_012254);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5936:1: rule__Group__NameAssignment_2 : ( ruleVar ) ;
    public final void rule__Group__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5940:1: ( ( ruleVar ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5941:1: ( ruleVar )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5941:1: ( ruleVar )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5942:1: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getNameVarParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVar_in_rule__Group__NameAssignment_212285);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5951:1: rule__Group__IndexAssignment_4 : ( RULE_NUMINT ) ;
    public final void rule__Group__IndexAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5955:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5956:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5956:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5957:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getIndexNUMINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__Group__IndexAssignment_412316); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5966:1: rule__Group__ElementsAssignment_6 : ( ruleMessageField ) ;
    public final void rule__Group__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5970:1: ( ( ruleMessageField ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5971:1: ( ruleMessageField )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5971:1: ( ruleMessageField )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5972:1: ruleMessageField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getElementsMessageFieldParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleMessageField_in_rule__Group__ElementsAssignment_612347);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5981:1: rule__ComplexTypeLink__TargetAssignment : ( ( ruleVar_full ) ) ;
    public final void rule__ComplexTypeLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5985:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5986:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5986:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5987:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeCrossReference_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5988:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5989:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeVar_fullParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__ComplexTypeLink__TargetAssignment12382);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6000:1: rule__ScalarTypeLink__TargetAssignment : ( ruleScalarType ) ;
    public final void rule__ScalarTypeLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6004:1: ( ( ruleScalarType ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6005:1: ( ruleScalarType )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6005:1: ( ruleScalarType )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6006:1: ruleScalarType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeLinkAccess().getTargetScalarTypeEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleScalarType_in_rule__ScalarTypeLink__TargetAssignment12417);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6015:1: rule__FieldOptions__OptionsAssignment_1 : ( ruleFieldOption ) ;
    public final void rule__FieldOptions__OptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6019:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6020:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6020:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6021:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_112448);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6030:1: rule__FieldOptions__OptionsAssignment_2_1 : ( ruleFieldOption ) ;
    public final void rule__FieldOptions__OptionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6034:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6035:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6035:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6036:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_2_112479);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6045:1: rule__DefaultValueFieldOption__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__DefaultValueFieldOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6049:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6050:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6050:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6051:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__DefaultValueFieldOption__ValueAssignment_212510);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6060:1: rule__NativeFieldOption__SourceAssignment_0 : ( ruleOptionSource ) ;
    public final void rule__NativeFieldOption__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6064:1: ( ( ruleOptionSource ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6065:1: ( ruleOptionSource )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6065:1: ( ruleOptionSource )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6066:1: ruleOptionSource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getSourceOptionSourceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleOptionSource_in_rule__NativeFieldOption__SourceAssignment_012541);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6075:1: rule__NativeFieldOption__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__NativeFieldOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6079:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6080:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6080:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6081:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__NativeFieldOption__ValueAssignment_212572);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6090:1: rule__OptionSource__TargetAssignment : ( ( ruleVar_full ) ) ;
    public final void rule__OptionSource__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6094:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6095:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6095:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6096:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceAccess().getTargetIndexedElementCrossReference_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6097:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6098:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceAccess().getTargetIndexedElementVar_fullParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__OptionSource__TargetAssignment12607);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6109:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6113:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6114:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6114:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6115:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_112642); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6124:1: rule__Enum__ElementsAssignment_3 : ( ruleEnumElement ) ;
    public final void rule__Enum__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6128:1: ( ( ruleEnumElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6129:1: ( ruleEnumElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6129:1: ( ruleEnumElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6130:1: ruleEnumElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleEnumElement_in_rule__Enum__ElementsAssignment_312673);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6139:1: rule__EnumField__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6143:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6144:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6144:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6145:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumField__NameAssignment_012704); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6154:1: rule__EnumField__IndexAssignment_2 : ( RULE_NUMINT ) ;
    public final void rule__EnumField__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6158:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6159:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6159:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6160:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getIndexNUMINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__EnumField__IndexAssignment_212735); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6169:1: rule__EnumField__OptionsAssignment_3_1 : ( ruleFieldOption ) ;
    public final void rule__EnumField__OptionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6173:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6174:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6174:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6175:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_112766);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6184:1: rule__EnumField__OptionsAssignment_3_2_1 : ( ruleFieldOption ) ;
    public final void rule__EnumField__OptionsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6188:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6189:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6189:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6190:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_2_112797);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6199:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6203:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6204:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6204:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6205:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_112828); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6214:1: rule__Service__ElementsAssignment_3 : ( ruleServiceElement ) ;
    public final void rule__Service__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6218:1: ( ( ruleServiceElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6219:1: ( ruleServiceElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6219:1: ( ruleServiceElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6220:1: ruleServiceElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getElementsServiceElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleServiceElement_in_rule__Service__ElementsAssignment_312859);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6229:1: rule__Rpc__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rpc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6233:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6234:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6234:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6235:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rpc__NameAssignment_112890); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6244:1: rule__Rpc__ArgTypeAssignment_3 : ( ruleMessageLink ) ;
    public final void rule__Rpc__ArgTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6248:1: ( ( ruleMessageLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6249:1: ( ruleMessageLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6249:1: ( ruleMessageLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6250:1: ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getArgTypeMessageLinkParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_rule__Rpc__ArgTypeAssignment_312921);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6259:1: rule__Rpc__ReturnTypeAssignment_7 : ( ruleMessageLink ) ;
    public final void rule__Rpc__ReturnTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6263:1: ( ( ruleMessageLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6264:1: ( ruleMessageLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6264:1: ( ruleMessageLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6265:1: ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getReturnTypeMessageLinkParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_rule__Rpc__ReturnTypeAssignment_712952);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6274:1: rule__Rpc__OptionsAssignment_9_1 : ( ruleOption ) ;
    public final void rule__Rpc__OptionsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6278:1: ( ( ruleOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6279:1: ( ruleOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6279:1: ( ruleOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6280:1: ruleOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getOptionsOptionParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_ruleOption_in_rule__Rpc__OptionsAssignment_9_112983);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6289:1: rule__MessageLink__TargetAssignment : ( ( ruleFULL_ID ) ) ;
    public final void rule__MessageLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6293:1: ( ( ( ruleFULL_ID ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6294:1: ( ( ruleFULL_ID ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6294:1: ( ( ruleFULL_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6295:1: ( ruleFULL_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkAccess().getTargetMessageCrossReference_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6296:1: ( ruleFULL_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6297:1: ruleFULL_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkAccess().getTargetMessageFULL_IDParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_rule__MessageLink__TargetAssignment13018);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6308:1: rule__Extend__TypeAssignment_1 : ( ( ruleFULL_ID ) ) ;
    public final void rule__Extend__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6312:1: ( ( ( ruleFULL_ID ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6313:1: ( ( ruleFULL_ID ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6313:1: ( ( ruleFULL_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6314:1: ( ruleFULL_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getTypeMessageCrossReference_1_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6315:1: ( ruleFULL_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6316:1: ruleFULL_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getTypeMessageFULL_IDParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_rule__Extend__TypeAssignment_113057);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6327:1: rule__Extend__ElementsAssignment_3 : ( ruleMessageElement ) ;
    public final void rule__Extend__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6331:1: ( ( ruleMessageElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6332:1: ( ruleMessageElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6332:1: ( ruleMessageElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6333:1: ruleMessageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getElementsMessageElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_rule__Extend__ElementsAssignment_313092);
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

    // $ANTLR start synpred20_InternalProtobuf
    public final void synpred20_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1599:1: ( ( ( ruleScalarTypeLink ) ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1599:1: ( ( ruleScalarTypeLink ) )
        {
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1599:1: ( ( ruleScalarTypeLink ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1600:1: ( ruleScalarTypeLink )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTypeLinkAccess().getScalarTypeLinkParserRuleCall_0()); 
        }
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1601:1: ( ruleScalarTypeLink )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1601:3: ruleScalarTypeLink
        {
        pushFollow(FOLLOW_ruleScalarTypeLink_in_synpred20_InternalProtobuf3405);
        ruleScalarTypeLink();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20_InternalProtobuf

    // $ANTLR start synpred21_InternalProtobuf
    public final void synpred21_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1621:1: ( ( ( ruleDefaultValueFieldOption ) ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1621:1: ( ( ruleDefaultValueFieldOption ) )
        {
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1621:1: ( ( ruleDefaultValueFieldOption ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1622:1: ( ruleDefaultValueFieldOption )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getFieldOptionAccess().getDefaultValueFieldOptionParserRuleCall_0()); 
        }
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1623:1: ( ruleDefaultValueFieldOption )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1623:3: ruleDefaultValueFieldOption
        {
        pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_synpred21_InternalProtobuf3456);
        ruleDefaultValueFieldOption();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred21_InternalProtobuf

    // Delegated rules

    public final boolean synpred20_InternalProtobuf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalProtobuf_fragment(); // can never throw exception
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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA8_eotS =
        "\54\uffff";
    static final String DFA8_eofS =
        "\54\uffff";
    static final String DFA8_minS =
        "\1\25\4\4\1\uffff\43\61\1\6\1\62\1\uffff";
    static final String DFA8_maxS =
        "\1\27\4\56\1\uffff\43\61\1\6\1\67\1\uffff";
    static final String DFA8_acceptS =
        "\5\uffff\1\1\45\uffff\1\2";
    static final String DFA8_specialS =
        "\54\uffff}>";
    static final String[] DFA8_transitionS = {
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
            "\1\5\2\uffff\1\53\1\uffff\1\5",
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
            return "1572:1: rule__IndexedElement__Alternatives : ( ( ruleMessageField ) | ( ruleGroup ) );";
        }
    }
    static final String DFA9_eotS =
        "\22\uffff";
    static final String DFA9_eofS =
        "\22\uffff";
    static final String DFA9_minS =
        "\1\4\17\0\2\uffff";
    static final String DFA9_maxS =
        "\1\56\17\0\2\uffff";
    static final String DFA9_acceptS =
        "\20\uffff\1\2\1\1";
    static final String DFA9_specialS =
        "\1\uffff\1\16\1\2\1\5\1\11\1\13\1\15\1\1\1\4\1\7\1\12\1\14\1\0\1\3\1\6\1\10\2\uffff}>";
    static final String[] DFA9_transitionS = {
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
            return "1594:1: rule__TypeLink__Alternatives : ( ( ( ruleScalarTypeLink ) ) | ( ruleComplexTypeLink ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_12 = input.LA(1);

                         
                        int index9_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index9_12);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_13 = input.LA(1);

                         
                        int index9_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index9_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_14 = input.LA(1);

                         
                        int index9_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index9_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_9 = input.LA(1);

                         
                        int index9_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index9_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_15 = input.LA(1);

                         
                        int index9_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index9_15);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA9_10 = input.LA(1);

                         
                        int index9_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index9_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA9_11 = input.LA(1);

                         
                        int index9_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index9_11);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index9_1);
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
    static final String DFA10_eotS =
        "\13\uffff";
    static final String DFA10_eofS =
        "\13\uffff";
    static final String DFA10_minS =
        "\1\4\1\61\1\uffff\1\4\6\0\1\uffff";
    static final String DFA10_maxS =
        "\1\56\1\61\1\uffff\1\60\6\0\1\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\7\uffff\1\1";
    static final String DFA10_specialS =
        "\4\uffff\1\0\1\4\1\2\1\3\1\1\1\5\1\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\10\uffff\37\2\1\1\2\2",
            "\1\3",
            "",
            "\1\11\1\10\1\4\1\5\47\uffff\1\6\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1616:1: rule__FieldOption__Alternatives : ( ( ( ruleDefaultValueFieldOption ) ) | ( ruleNativeFieldOption ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_9 = input.LA(1);

                         
                        int index10_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
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
    public static final BitSet FOLLOW_rule__Import__Alternatives_in_ruleImport340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicImport_in_entryRulePublicImport367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePublicImport374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__0_in_rulePublicImport400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakImport_in_entryRuleWeakImport427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeakImport434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__0_in_ruleWeakImport460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__0_in_ruleOption520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_ruleValue580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_entryRuleSimpleValueLink606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValueLink613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleValueLink__Alternatives_in_ruleSimpleValueLink639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLink_in_entryRuleEnumLink666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLink673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLink__TargetAssignment_in_ruleEnumLink699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_entryRuleStringLink726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLink733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLink__TargetAssignment_in_ruleStringLink759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLink793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLink__TargetAssignment_in_ruleBooleanLink819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_entryRuleNumberLink846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLink853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLink__Alternatives_in_ruleNumberLink879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_entryRuleIntLink906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLink913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLink__TargetAssignment_in_ruleIntLink939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLink973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLink__TargetAssignment_in_ruleDoubleLink999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Alternatives_in_ruleComplexType1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensibleType1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensibleType__Alternatives_in_ruleExtensibleType1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0_in_ruleMessage1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_entryRuleMessageElement1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageElement1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageElement__Alternatives_in_ruleMessageElement1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedElement1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexedElement__Alternatives_in_ruleIndexedElement1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange1326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionRange1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__0_in_ruleExtensionRange1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_entryRuleMessageField1386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageField1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__0_in_ruleMessageField1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0_in_ruleGroup1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_entryRuleTypeLink1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLink1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeLink__Alternatives_in_ruleTypeLink1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink1566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLink1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLink__TargetAssignment_in_ruleComplexTypeLink1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink1626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarTypeLink1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScalarTypeLink__TargetAssignment_in_ruleScalarTypeLink1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions1686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOptions1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__0_in_ruleFieldOptions1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_entryRuleFieldOption1746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOption1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOption__Alternatives_in_ruleFieldOption1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption1806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValueFieldOption1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__0_in_ruleDefaultValueFieldOption1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption1866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeFieldOption1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__0_in_ruleNativeFieldOption1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_entryRuleOptionSource1926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionSource1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionSource__TargetAssignment_in_ruleOptionSource1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_entryRuleEnumElement2046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumElement2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumElement__Alternatives_in_ruleEnumElement2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_entryRuleEnumField2106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumField2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__0_in_ruleEnumField2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService2166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceElement_in_entryRuleServiceElement2226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceElement2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceElement__Alternatives_in_ruleServiceElement2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_entryRuleRpc2286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRpc2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__0_in_ruleRpc2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_entryRuleMessageLink2346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageLink2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageLink__TargetAssignment_in_ruleMessageLink2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_entryRuleExtend2406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtend2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__0_in_ruleExtend2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_entryRuleVar_full2466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar_full2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var_full__Alternatives_in_ruleVar_full2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar2526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Alternatives_in_ruleVar2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID2586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFULL_ID2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__0_in_ruleFULL_ID2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_entryRuleVarReserved2646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarReserved2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarReserved__Alternatives_in_ruleVarReserved2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__Alternatives_in_ruleModifier2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScalarType__Alternatives_in_ruleScalarType2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Statement__Alternatives2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Statement__Alternatives2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_rule__Statement__Alternatives2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_rule__Statement__Alternatives2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Statement__Alternatives2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Statement__Alternatives2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicImport_in_rule__Import__Alternatives2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakImport_in_rule__Import__Alternatives2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_rule__SimpleValueLink__Alternatives2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_rule__SimpleValueLink__Alternatives3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_rule__SimpleValueLink__Alternatives3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLink_in_rule__SimpleValueLink__Alternatives3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_rule__NumberLink__Alternatives3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_rule__NumberLink__Alternatives3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__ComplexType__Alternatives3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_rule__ComplexType__Alternatives3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__ExtensibleType__Alternatives3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__ExtensibleType__Alternatives3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__MessageElement__Alternatives3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_rule__MessageElement__Alternatives3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__MessageElement__Alternatives3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__MessageElement__Alternatives3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_rule__MessageElement__Alternatives3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_rule__MessageElement__Alternatives3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__MessageElement__Alternatives3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_rule__IndexedElement__Alternatives3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__IndexedElement__Alternatives3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_rule__TypeLink__Alternatives3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_rule__TypeLink__Alternatives3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_rule__FieldOption__Alternatives3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_rule__FieldOption__Alternatives3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_rule__EnumElement__Alternatives3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__EnumElement__Alternatives3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_rule__ServiceElement__Alternatives3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__ServiceElement__Alternatives3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_rule__Var_full__Alternatives3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Var_full__Alternatives3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Var__Alternatives3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_rule__Var__Alternatives3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VarReserved__Alternatives3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__VarReserved__Alternatives3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__VarReserved__Alternatives3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VarReserved__Alternatives3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VarReserved__Alternatives3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__VarReserved__Alternatives3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VarReserved__Alternatives3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VarReserved__Alternatives3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VarReserved__Alternatives3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VarReserved__Alternatives3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VarReserved__Alternatives3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__VarReserved__Alternatives3923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__VarReserved__Alternatives3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__VarReserved__Alternatives3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__VarReserved__Alternatives3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__VarReserved__Alternatives4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VarReserved__Alternatives4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__VarReserved__Alternatives4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__VarReserved__Alternatives4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__VarReserved__Alternatives4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__VarReserved__Alternatives4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__VarReserved__Alternatives4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__VarReserved__Alternatives4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__VarReserved__Alternatives4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__VarReserved__Alternatives4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__VarReserved__Alternatives4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__VarReserved__Alternatives4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__VarReserved__Alternatives4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__VarReserved__Alternatives4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__VarReserved__Alternatives4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__VarReserved__Alternatives4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__VarReserved__Alternatives4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__VarReserved__Alternatives4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__VarReserved__Alternatives4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__BOOL__Alternatives4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__BOOL__Alternatives4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Modifier__Alternatives4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Modifier__Alternatives4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Modifier__Alternatives4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ScalarType__Alternatives4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ScalarType__Alternatives4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ScalarType__Alternatives4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ScalarType__Alternatives4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ScalarType__Alternatives4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ScalarType__Alternatives4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ScalarType__Alternatives4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ScalarType__Alternatives4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ScalarType__Alternatives4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ScalarType__Alternatives4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ScalarType__Alternatives4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ScalarType__Alternatives4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ScalarType__Alternatives4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ScalarType__Alternatives4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ScalarType__Alternatives4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group__0__Impl_in_rule__Proto__Group__04861 = new BitSet(new long[]{0x0000000002FF4000L});
    public static final BitSet FOLLOW_rule__Proto__Group__1_in_rule__Proto__Group__04864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__SyntaxAssignment_0_in_rule__Proto__Group__0__Impl4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group__1__Impl_in_rule__Proto__Group__14922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__StatementsAssignment_1_in_rule__Proto__Group__1__Impl4949 = new BitSet(new long[]{0x0000000002FF4002L});
    public static final BitSet FOLLOW_rule__Syntax__Group__0__Impl_in_rule__Syntax__Group__04984 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Syntax__Group__1_in_rule__Syntax__Group__04987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Syntax__Group__0__Impl5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group__1__Impl_in_rule__Syntax__Group__15046 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Syntax__Group__2_in_rule__Syntax__Group__15049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Syntax__Group__1__Impl5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group__2__Impl_in_rule__Syntax__Group__25108 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Syntax__Group__3_in_rule__Syntax__Group__25111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__NameAssignment_2_in_rule__Syntax__Group__2__Impl5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group__3__Impl_in_rule__Syntax__Group__35168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Syntax__Group__3__Impl5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__05235 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__05238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Package__Group__0__Impl5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__15297 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__15300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__25357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Package__Group__2__Impl5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__0__Impl_in_rule__PublicImport__Group__05422 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__1_in_rule__PublicImport__Group__05425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PublicImport__Group__0__Impl5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__1__Impl_in_rule__PublicImport__Group__15484 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__2_in_rule__PublicImport__Group__15487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__PublicImport__Group__1__Impl5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__2__Impl_in_rule__PublicImport__Group__25546 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__3_in_rule__PublicImport__Group__25549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__ImportURIAssignment_2_in_rule__PublicImport__Group__2__Impl5576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__3__Impl_in_rule__PublicImport__Group__35606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__PublicImport__Group__3__Impl5634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__0__Impl_in_rule__WeakImport__Group__05673 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__1_in_rule__WeakImport__Group__05676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WeakImport__Group__0__Impl5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__1__Impl_in_rule__WeakImport__Group__15735 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__2_in_rule__WeakImport__Group__15738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__WeakImport__Group__1__Impl5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__2__Impl_in_rule__WeakImport__Group__25797 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__3_in_rule__WeakImport__Group__25800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__ImportURIAssignment_2_in_rule__WeakImport__Group__2__Impl5827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__3__Impl_in_rule__WeakImport__Group__35857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__WeakImport__Group__3__Impl5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__05924 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Option__Group__1_in_rule__Option__Group__05927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Option__Group__0__Impl5955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__15986 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Option__Group__2_in_rule__Option__Group__15989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__SourceAssignment_1_in_rule__Option__Group__1__Impl6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__2__Impl_in_rule__Option__Group__26046 = new BitSet(new long[]{0x00018000000000F0L});
    public static final BitSet FOLLOW_rule__Option__Group__3_in_rule__Option__Group__26049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Option__Group__2__Impl6077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__3__Impl_in_rule__Option__Group__36108 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Option__Group__4_in_rule__Option__Group__36111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__ValueAssignment_3_in_rule__Option__Group__3__Impl6138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__4__Impl_in_rule__Option__Group__46168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Option__Group__4__Impl6196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__06237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__06240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Message__Group__0__Impl6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__16299 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Message__Group__2_in_rule__Message__Group__16302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__NameAssignment_1_in_rule__Message__Group__1__Impl6329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__26359 = new BitSet(new long[]{0x0040000003FF4000L});
    public static final BitSet FOLLOW_rule__Message__Group__3_in_rule__Message__Group__26362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Message__Group__2__Impl6390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__36421 = new BitSet(new long[]{0x0040000003FF4000L});
    public static final BitSet FOLLOW_rule__Message__Group__4_in_rule__Message__Group__36424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__ElementsAssignment_3_in_rule__Message__Group__3__Impl6451 = new BitSet(new long[]{0x0000000003FF4002L});
    public static final BitSet FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__46482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Message__Group__4__Impl6510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__0__Impl_in_rule__ExtensionRange__Group__06551 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__1_in_rule__ExtensionRange__Group__06554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ExtensionRange__Group__0__Impl6582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__1__Impl_in_rule__ExtensionRange__Group__16613 = new BitSet(new long[]{0x0004000000002000L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__2_in_rule__ExtensionRange__Group__16616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__FromAssignment_1_in_rule__ExtensionRange__Group__1__Impl6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__2__Impl_in_rule__ExtensionRange__Group__26673 = new BitSet(new long[]{0x0004000000002000L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__3_in_rule__ExtensionRange__Group__26676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__0_in_rule__ExtensionRange__Group__2__Impl6703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__3__Impl_in_rule__ExtensionRange__Group__36734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ExtensionRange__Group__3__Impl6762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__0__Impl_in_rule__ExtensionRange__Group_2__06801 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__1_in_rule__ExtensionRange__Group_2__06804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ExtensionRange__Group_2__0__Impl6832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__1__Impl_in_rule__ExtensionRange__Group_2__16863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__ToAssignment_2_1_in_rule__ExtensionRange__Group_2__1__Impl6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__0__Impl_in_rule__MessageField__Group__06924 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__MessageField__Group__1_in_rule__MessageField__Group__06927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__ModifierAssignment_0_in_rule__MessageField__Group__0__Impl6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__1__Impl_in_rule__MessageField__Group__16984 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__MessageField__Group__2_in_rule__MessageField__Group__16987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__TypeAssignment_1_in_rule__MessageField__Group__1__Impl7014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__2__Impl_in_rule__MessageField__Group__27044 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__MessageField__Group__3_in_rule__MessageField__Group__27047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__NameAssignment_2_in_rule__MessageField__Group__2__Impl7074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__3__Impl_in_rule__MessageField__Group__37104 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MessageField__Group__4_in_rule__MessageField__Group__37107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__MessageField__Group__3__Impl7135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__4__Impl_in_rule__MessageField__Group__47166 = new BitSet(new long[]{0x0084000000000000L});
    public static final BitSet FOLLOW_rule__MessageField__Group__5_in_rule__MessageField__Group__47169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__IndexAssignment_4_in_rule__MessageField__Group__4__Impl7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__5__Impl_in_rule__MessageField__Group__57226 = new BitSet(new long[]{0x0084000000000000L});
    public static final BitSet FOLLOW_rule__MessageField__Group__6_in_rule__MessageField__Group__57229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__OptionsAssignment_5_in_rule__MessageField__Group__5__Impl7256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__6__Impl_in_rule__MessageField__Group__67287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__MessageField__Group__6__Impl7315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__07360 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__07363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__ModifierAssignment_0_in_rule__Group__Group__0__Impl7390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__17420 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__17423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Group__Group__1__Impl7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__27482 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__27485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl7512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__37542 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__37545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Group__Group__3__Impl7573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__47604 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Group__Group__5_in_rule__Group__Group__47607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__IndexAssignment_4_in_rule__Group__Group__4__Impl7634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__57664 = new BitSet(new long[]{0x0040000000F40000L});
    public static final BitSet FOLLOW_rule__Group__Group__6_in_rule__Group__Group__57667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Group__Group__5__Impl7695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__6__Impl_in_rule__Group__Group__67726 = new BitSet(new long[]{0x0040000000F40000L});
    public static final BitSet FOLLOW_rule__Group__Group__7_in_rule__Group__Group__67729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__ElementsAssignment_6_in_rule__Group__Group__6__Impl7756 = new BitSet(new long[]{0x0000000000F40002L});
    public static final BitSet FOLLOW_rule__Group__Group__7__Impl_in_rule__Group__Group__77787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Group__Group__7__Impl7815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__0__Impl_in_rule__FieldOptions__Group__07862 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__1_in_rule__FieldOptions__Group__07865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__FieldOptions__Group__0__Impl7893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__1__Impl_in_rule__FieldOptions__Group__17924 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__2_in_rule__FieldOptions__Group__17927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__OptionsAssignment_1_in_rule__FieldOptions__Group__1__Impl7954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__2__Impl_in_rule__FieldOptions__Group__27984 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__3_in_rule__FieldOptions__Group__27987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__0_in_rule__FieldOptions__Group__2__Impl8014 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__3__Impl_in_rule__FieldOptions__Group__38045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__FieldOptions__Group__3__Impl8073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__0__Impl_in_rule__FieldOptions__Group_2__08112 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__1_in_rule__FieldOptions__Group_2__08115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__FieldOptions__Group_2__0__Impl8143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__1__Impl_in_rule__FieldOptions__Group_2__18174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__OptionsAssignment_2_1_in_rule__FieldOptions__Group_2__1__Impl8201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__0__Impl_in_rule__DefaultValueFieldOption__Group__08235 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__1_in_rule__DefaultValueFieldOption__Group__08238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DefaultValueFieldOption__Group__0__Impl8267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__1__Impl_in_rule__DefaultValueFieldOption__Group__18299 = new BitSet(new long[]{0x00018000000000F0L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__2_in_rule__DefaultValueFieldOption__Group__18302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__DefaultValueFieldOption__Group__1__Impl8330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__2__Impl_in_rule__DefaultValueFieldOption__Group__28361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__ValueAssignment_2_in_rule__DefaultValueFieldOption__Group__2__Impl8388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__0__Impl_in_rule__NativeFieldOption__Group__08424 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__1_in_rule__NativeFieldOption__Group__08427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__SourceAssignment_0_in_rule__NativeFieldOption__Group__0__Impl8454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__1__Impl_in_rule__NativeFieldOption__Group__18484 = new BitSet(new long[]{0x00018000000000F0L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__2_in_rule__NativeFieldOption__Group__18487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__NativeFieldOption__Group__1__Impl8515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__2__Impl_in_rule__NativeFieldOption__Group__28546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__ValueAssignment_2_in_rule__NativeFieldOption__Group__2__Impl8573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__08609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__08612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Enum__Group__0__Impl8640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__18671 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__18674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl8701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__28731 = new BitSet(new long[]{0x0040000002FF4010L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__28734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Enum__Group__2__Impl8762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__38793 = new BitSet(new long[]{0x0040000002FF4010L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__38796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__ElementsAssignment_3_in_rule__Enum__Group__3__Impl8823 = new BitSet(new long[]{0x0000000002FF4012L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__48854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Enum__Group__4__Impl8882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__0__Impl_in_rule__EnumField__Group__08923 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__1_in_rule__EnumField__Group__08926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__NameAssignment_0_in_rule__EnumField__Group__0__Impl8953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__1__Impl_in_rule__EnumField__Group__18983 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumField__Group__2_in_rule__EnumField__Group__18986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__EnumField__Group__1__Impl9014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__2__Impl_in_rule__EnumField__Group__29045 = new BitSet(new long[]{0x0084000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__3_in_rule__EnumField__Group__29048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__IndexAssignment_2_in_rule__EnumField__Group__2__Impl9075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__3__Impl_in_rule__EnumField__Group__39105 = new BitSet(new long[]{0x0084000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__4_in_rule__EnumField__Group__39108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__0_in_rule__EnumField__Group__3__Impl9135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__4__Impl_in_rule__EnumField__Group__49166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__EnumField__Group__4__Impl9194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__0__Impl_in_rule__EnumField__Group_3__09235 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__1_in_rule__EnumField__Group_3__09238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__EnumField__Group_3__0__Impl9266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__1__Impl_in_rule__EnumField__Group_3__19297 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__2_in_rule__EnumField__Group_3__19300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__OptionsAssignment_3_1_in_rule__EnumField__Group_3__1__Impl9327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__2__Impl_in_rule__EnumField__Group_3__29357 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__3_in_rule__EnumField__Group_3__29360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__0_in_rule__EnumField__Group_3__2__Impl9387 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__3__Impl_in_rule__EnumField__Group_3__39418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__EnumField__Group_3__3__Impl9446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__0__Impl_in_rule__EnumField__Group_3_2__09485 = new BitSet(new long[]{0x00007FFFFFFFE010L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__1_in_rule__EnumField__Group_3_2__09488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__EnumField__Group_3_2__0__Impl9516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__1__Impl_in_rule__EnumField__Group_3_2__19547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__OptionsAssignment_3_2_1_in_rule__EnumField__Group_3_2__1__Impl9574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__09608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__09611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Service__Group__0__Impl9639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__19670 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__19673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl9700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__29730 = new BitSet(new long[]{0x000000000AFF4000L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__29733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Service__Group__2__Impl9761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__39792 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__39795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__ElementsAssignment_3_in_rule__Service__Group__3__Impl9824 = new BitSet(new long[]{0x000000000AFF4002L});
    public static final BitSet FOLLOW_rule__Service__ElementsAssignment_3_in_rule__Service__Group__3__Impl9836 = new BitSet(new long[]{0x000000000AFF4002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__49869 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Service__Group__5_in_rule__Service__Group__49872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Service__Group__4__Impl9900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__59931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Service__Group__5__Impl9960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__0__Impl_in_rule__Rpc__Group__010005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rpc__Group__1_in_rule__Rpc__Group__010008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Rpc__Group__0__Impl10036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__1__Impl_in_rule__Rpc__Group__110067 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__2_in_rule__Rpc__Group__110070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__NameAssignment_1_in_rule__Rpc__Group__1__Impl10097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__2__Impl_in_rule__Rpc__Group__210127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rpc__Group__3_in_rule__Rpc__Group__210130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Rpc__Group__2__Impl10158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__3__Impl_in_rule__Rpc__Group__310189 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__4_in_rule__Rpc__Group__310192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__ArgTypeAssignment_3_in_rule__Rpc__Group__3__Impl10219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__4__Impl_in_rule__Rpc__Group__410249 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__5_in_rule__Rpc__Group__410252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Rpc__Group__4__Impl10280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__5__Impl_in_rule__Rpc__Group__510311 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__6_in_rule__Rpc__Group__510314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Rpc__Group__5__Impl10342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__6__Impl_in_rule__Rpc__Group__610373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rpc__Group__7_in_rule__Rpc__Group__610376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Rpc__Group__6__Impl10404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__7__Impl_in_rule__Rpc__Group__710435 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__8_in_rule__Rpc__Group__710438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__ReturnTypeAssignment_7_in_rule__Rpc__Group__7__Impl10465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__8__Impl_in_rule__Rpc__Group__810495 = new BitSet(new long[]{0x0024000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__9_in_rule__Rpc__Group__810498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Rpc__Group__8__Impl10526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__9__Impl_in_rule__Rpc__Group__910557 = new BitSet(new long[]{0x0024000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__10_in_rule__Rpc__Group__910560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__0_in_rule__Rpc__Group__9__Impl10587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__10__Impl_in_rule__Rpc__Group__1010618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Rpc__Group__10__Impl10649 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Rpc__Group__10__Impl10665 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__0__Impl_in_rule__Rpc__Group_9__010722 = new BitSet(new long[]{0x0040000002FF4000L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__1_in_rule__Rpc__Group_9__010725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Rpc__Group_9__0__Impl10753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__1__Impl_in_rule__Rpc__Group_9__110784 = new BitSet(new long[]{0x0040000002FF4000L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__2_in_rule__Rpc__Group_9__110787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__OptionsAssignment_9_1_in_rule__Rpc__Group_9__1__Impl10814 = new BitSet(new long[]{0x0000000002FF4002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__2__Impl_in_rule__Rpc__Group_9__210845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Rpc__Group_9__2__Impl10873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__0__Impl_in_rule__Extend__Group__010910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Extend__Group__1_in_rule__Extend__Group__010913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Extend__Group__0__Impl10941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__1__Impl_in_rule__Extend__Group__110972 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Extend__Group__2_in_rule__Extend__Group__110975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__TypeAssignment_1_in_rule__Extend__Group__1__Impl11002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__2__Impl_in_rule__Extend__Group__211032 = new BitSet(new long[]{0x0040000003FF4000L});
    public static final BitSet FOLLOW_rule__Extend__Group__3_in_rule__Extend__Group__211035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Extend__Group__2__Impl11063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__3__Impl_in_rule__Extend__Group__311094 = new BitSet(new long[]{0x0040000003FF4000L});
    public static final BitSet FOLLOW_rule__Extend__Group__4_in_rule__Extend__Group__311097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__ElementsAssignment_3_in_rule__Extend__Group__3__Impl11124 = new BitSet(new long[]{0x0000000003FF4002L});
    public static final BitSet FOLLOW_rule__Extend__Group__4__Impl_in_rule__Extend__Group__411155 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Extend__Group__5_in_rule__Extend__Group__411158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Extend__Group__4__Impl11186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__5__Impl_in_rule__Extend__Group__511217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Extend__Group__5__Impl11246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__0__Impl_in_rule__FULL_ID__Group__011291 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__1_in_rule__FULL_ID__Group__011294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FULL_ID__Group__0__Impl11321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__1__Impl_in_rule__FULL_ID__Group__111350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl11379 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl11391 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__0__Impl_in_rule__FULL_ID__Group_1__011428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__1_in_rule__FULL_ID__Group_1__011431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__FULL_ID__Group_1__0__Impl11459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__1__Impl_in_rule__FULL_ID__Group_1__111490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FULL_ID__Group_1__1__Impl11517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_rule__Proto__SyntaxAssignment_011556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Proto__StatementsAssignment_111587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Syntax__NameAssignment_211618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__Package__NameAssignment_111649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PublicImport__ImportURIAssignment_211680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__WeakImport__ImportURIAssignment_211711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__Option__SourceAssignment_111746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Option__ValueAssignment_311781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumLink__TargetAssignment11816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLink__TargetAssignment11851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__BooleanLink__TargetAssignment11882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__IntLink__TargetAssignment11913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMDOUBLE_in_rule__DoubleLink__TargetAssignment11944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__NameAssignment_111975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_rule__Message__ElementsAssignment_312006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__ExtensionRange__FromAssignment_112037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__ExtensionRange__ToAssignment_2_112068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__MessageField__ModifierAssignment_012099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__MessageField__TypeAssignment_112130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__MessageField__NameAssignment_212161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__MessageField__IndexAssignment_412192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_rule__MessageField__OptionsAssignment_512223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Group__ModifierAssignment_012254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Group__NameAssignment_212285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__Group__IndexAssignment_412316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_rule__Group__ElementsAssignment_612347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__ComplexTypeLink__TargetAssignment12382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarType_in_rule__ScalarTypeLink__TargetAssignment12417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_112448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_2_112479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__DefaultValueFieldOption__ValueAssignment_212510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_rule__NativeFieldOption__SourceAssignment_012541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__NativeFieldOption__ValueAssignment_212572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__OptionSource__TargetAssignment12607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_112642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_rule__Enum__ElementsAssignment_312673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumField__NameAssignment_012704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__EnumField__IndexAssignment_212735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_112766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_2_112797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_112828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceElement_in_rule__Service__ElementsAssignment_312859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rpc__NameAssignment_112890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_rule__Rpc__ArgTypeAssignment_312921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_rule__Rpc__ReturnTypeAssignment_712952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Rpc__OptionsAssignment_9_112983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_rule__MessageLink__TargetAssignment13018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_rule__Extend__TypeAssignment_113057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_rule__Extend__ElementsAssignment_313092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_synpred20_InternalProtobuf3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_synpred21_InternalProtobuf3456 = new BitSet(new long[]{0x0000000000000002L});

}