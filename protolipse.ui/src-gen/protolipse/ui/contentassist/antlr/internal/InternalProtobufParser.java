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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMINT", "RULE_NUMDOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'to'", "'package'", "'syntax'", "'import'", "'option'", "'message'", "'service'", "'enum'", "'required'", "'optional'", "'repeated'", "'extensions'", "'extend'", "'group'", "'rpc'", "'returns'", "'int32'", "'int64'", "'uint32'", "'uint64'", "'sint32'", "'sint64'", "'fixed32'", "'fixed64'", "'sfixed32'", "'sfixed64'", "'float'", "'double'", "'bool'", "'string'", "'bytes'", "'default'", "'max'", "'void'", "'weak'", "'packed'", "'true'", "'false'", "'='", "';'", "'public'", "'{'", "'}'", "'oneof'", "','", "'['", "']'", "'('", "')'", "'.'"
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:266:1: ruleOption : ( ( rule__Option__Alternatives ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:270:2: ( ( ( rule__Option__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:271:1: ( ( rule__Option__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:271:1: ( ( rule__Option__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:272:1: ( rule__Option__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:273:1: ( rule__Option__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:273:2: rule__Option__Alternatives
            {
            pushFollow(FOLLOW_rule__Option__Alternatives_in_ruleOption520);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:285:1: entryRuleNativeOption : ruleNativeOption EOF ;
    public final void entryRuleNativeOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:286:1: ( ruleNativeOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:287:1: ruleNativeOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionRule()); 
            }
            pushFollow(FOLLOW_ruleNativeOption_in_entryRuleNativeOption547);
            ruleNativeOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeOption554); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:294:1: ruleNativeOption : ( ( rule__NativeOption__Group__0 ) ) ;
    public final void ruleNativeOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:298:2: ( ( ( rule__NativeOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:299:1: ( ( rule__NativeOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:299:1: ( ( rule__NativeOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:300:1: ( rule__NativeOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:301:1: ( rule__NativeOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:301:2: rule__NativeOption__Group__0
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__0_in_ruleNativeOption580);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:313:1: entryRuleCustomOption : ruleCustomOption EOF ;
    public final void entryRuleCustomOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:314:1: ( ruleCustomOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:315:1: ruleCustomOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionRule()); 
            }
            pushFollow(FOLLOW_ruleCustomOption_in_entryRuleCustomOption607);
            ruleCustomOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomOption614); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:322:1: ruleCustomOption : ( ( rule__CustomOption__Group__0 ) ) ;
    public final void ruleCustomOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:326:2: ( ( ( rule__CustomOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:327:1: ( ( rule__CustomOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:327:1: ( ( rule__CustomOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:328:1: ( rule__CustomOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:329:1: ( rule__CustomOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:329:2: rule__CustomOption__Group__0
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__0_in_ruleCustomOption640);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:341:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:342:1: ( ruleValue EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:343:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue667);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue674); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:350:1: ruleValue : ( ruleSimpleValueLink ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:354:2: ( ( ruleSimpleValueLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:355:1: ( ruleSimpleValueLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:355:1: ( ruleSimpleValueLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:356:1: ruleSimpleValueLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getSimpleValueLinkParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleSimpleValueLink_in_ruleValue700);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:369:1: entryRuleSimpleValueLink : ruleSimpleValueLink EOF ;
    public final void entryRuleSimpleValueLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:370:1: ( ruleSimpleValueLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:371:1: ruleSimpleValueLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleValueLinkRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleValueLink_in_entryRuleSimpleValueLink726);
            ruleSimpleValueLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleValueLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleValueLink733); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:378:1: ruleSimpleValueLink : ( ( rule__SimpleValueLink__Alternatives ) ) ;
    public final void ruleSimpleValueLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:382:2: ( ( ( rule__SimpleValueLink__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:383:1: ( ( rule__SimpleValueLink__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:383:1: ( ( rule__SimpleValueLink__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:384:1: ( rule__SimpleValueLink__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleValueLinkAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:385:1: ( rule__SimpleValueLink__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:385:2: rule__SimpleValueLink__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleValueLink__Alternatives_in_ruleSimpleValueLink759);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:397:1: entryRuleCustomIdLink : ruleCustomIdLink EOF ;
    public final void entryRuleCustomIdLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:398:1: ( ruleCustomIdLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:399:1: ruleCustomIdLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomIdLinkRule()); 
            }
            pushFollow(FOLLOW_ruleCustomIdLink_in_entryRuleCustomIdLink786);
            ruleCustomIdLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomIdLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomIdLink793); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:406:1: ruleCustomIdLink : ( ( rule__CustomIdLink__TargetAssignment ) ) ;
    public final void ruleCustomIdLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:410:2: ( ( ( rule__CustomIdLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:411:1: ( ( rule__CustomIdLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:411:1: ( ( rule__CustomIdLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:412:1: ( rule__CustomIdLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomIdLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:413:1: ( rule__CustomIdLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:413:2: rule__CustomIdLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__CustomIdLink__TargetAssignment_in_ruleCustomIdLink819);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:425:1: entryRuleStringLink : ruleStringLink EOF ;
    public final void entryRuleStringLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:426:1: ( ruleStringLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:427:1: ruleStringLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLinkRule()); 
            }
            pushFollow(FOLLOW_ruleStringLink_in_entryRuleStringLink846);
            ruleStringLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLink853); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:434:1: ruleStringLink : ( ( rule__StringLink__TargetAssignment ) ) ;
    public final void ruleStringLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:438:2: ( ( ( rule__StringLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:439:1: ( ( rule__StringLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:439:1: ( ( rule__StringLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:440:1: ( rule__StringLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:441:1: ( rule__StringLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:441:2: rule__StringLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__StringLink__TargetAssignment_in_ruleStringLink879);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:453:1: entryRuleBooleanLink : ruleBooleanLink EOF ;
    public final void entryRuleBooleanLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:454:1: ( ruleBooleanLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:455:1: ruleBooleanLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLinkRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink906);
            ruleBooleanLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLink913); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:462:1: ruleBooleanLink : ( ( rule__BooleanLink__TargetAssignment ) ) ;
    public final void ruleBooleanLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:466:2: ( ( ( rule__BooleanLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:467:1: ( ( rule__BooleanLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:467:1: ( ( rule__BooleanLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:468:1: ( rule__BooleanLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:469:1: ( rule__BooleanLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:469:2: rule__BooleanLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLink__TargetAssignment_in_ruleBooleanLink939);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:481:1: entryRuleNumberLink : ruleNumberLink EOF ;
    public final void entryRuleNumberLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:482:1: ( ruleNumberLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:483:1: ruleNumberLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLinkRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLink_in_entryRuleNumberLink966);
            ruleNumberLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLink973); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:490:1: ruleNumberLink : ( ( rule__NumberLink__Alternatives ) ) ;
    public final void ruleNumberLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:494:2: ( ( ( rule__NumberLink__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:495:1: ( ( rule__NumberLink__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:495:1: ( ( rule__NumberLink__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:496:1: ( rule__NumberLink__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLinkAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:497:1: ( rule__NumberLink__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:497:2: rule__NumberLink__Alternatives
            {
            pushFollow(FOLLOW_rule__NumberLink__Alternatives_in_ruleNumberLink999);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:509:1: entryRuleIntLink : ruleIntLink EOF ;
    public final void entryRuleIntLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:510:1: ( ruleIntLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:511:1: ruleIntLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLinkRule()); 
            }
            pushFollow(FOLLOW_ruleIntLink_in_entryRuleIntLink1026);
            ruleIntLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLink1033); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:518:1: ruleIntLink : ( ( rule__IntLink__TargetAssignment ) ) ;
    public final void ruleIntLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:522:2: ( ( ( rule__IntLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:523:1: ( ( rule__IntLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:523:1: ( ( rule__IntLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:524:1: ( rule__IntLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:525:1: ( rule__IntLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:525:2: rule__IntLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__IntLink__TargetAssignment_in_ruleIntLink1059);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:537:1: entryRuleDoubleLink : ruleDoubleLink EOF ;
    public final void entryRuleDoubleLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:538:1: ( ruleDoubleLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:539:1: ruleDoubleLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLinkRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink1086);
            ruleDoubleLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLink1093); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:546:1: ruleDoubleLink : ( ( rule__DoubleLink__TargetAssignment ) ) ;
    public final void ruleDoubleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:550:2: ( ( ( rule__DoubleLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:551:1: ( ( rule__DoubleLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:551:1: ( ( rule__DoubleLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:552:1: ( rule__DoubleLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:553:1: ( rule__DoubleLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:553:2: rule__DoubleLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__DoubleLink__TargetAssignment_in_ruleDoubleLink1119);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:565:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:566:1: ( ruleComplexType EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:567:1: ruleComplexType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeRule()); 
            }
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType1146);
            ruleComplexType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType1153); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:574:1: ruleComplexType : ( ( rule__ComplexType__Alternatives ) ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:578:2: ( ( ( rule__ComplexType__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:579:1: ( ( rule__ComplexType__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:579:1: ( ( rule__ComplexType__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:580:1: ( rule__ComplexType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:581:1: ( rule__ComplexType__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:581:2: rule__ComplexType__Alternatives
            {
            pushFollow(FOLLOW_rule__ComplexType__Alternatives_in_ruleComplexType1179);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:593:1: entryRuleExtensibleType : ruleExtensibleType EOF ;
    public final void entryRuleExtensibleType() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:594:1: ( ruleExtensibleType EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:595:1: ruleExtensibleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensibleTypeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType1206);
            ruleExtensibleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensibleTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensibleType1213); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:602:1: ruleExtensibleType : ( ( rule__ExtensibleType__Alternatives ) ) ;
    public final void ruleExtensibleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:606:2: ( ( ( rule__ExtensibleType__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:607:1: ( ( rule__ExtensibleType__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:607:1: ( ( rule__ExtensibleType__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:608:1: ( rule__ExtensibleType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensibleTypeAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:609:1: ( rule__ExtensibleType__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:609:2: rule__ExtensibleType__Alternatives
            {
            pushFollow(FOLLOW_rule__ExtensibleType__Alternatives_in_ruleExtensibleType1239);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:621:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:622:1: ( ruleMessage EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:623:1: ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage1266);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage1273); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:630:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:634:2: ( ( ( rule__Message__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:635:1: ( ( rule__Message__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:635:1: ( ( rule__Message__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:636:1: ( rule__Message__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:637:1: ( rule__Message__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:637:2: rule__Message__Group__0
            {
            pushFollow(FOLLOW_rule__Message__Group__0_in_ruleMessage1299);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:649:1: entryRuleMessageElement : ruleMessageElement EOF ;
    public final void entryRuleMessageElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:650:1: ( ruleMessageElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:651:1: ruleMessageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageElementRule()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_entryRuleMessageElement1326);
            ruleMessageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageElement1333); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:658:1: ruleMessageElement : ( ( rule__MessageElement__Alternatives ) ) ;
    public final void ruleMessageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:662:2: ( ( ( rule__MessageElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:663:1: ( ( rule__MessageElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:663:1: ( ( rule__MessageElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:664:1: ( rule__MessageElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:665:1: ( rule__MessageElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:665:2: rule__MessageElement__Alternatives
            {
            pushFollow(FOLLOW_rule__MessageElement__Alternatives_in_ruleMessageElement1359);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:677:1: entryRuleOneof : ruleOneof EOF ;
    public final void entryRuleOneof() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:678:1: ( ruleOneof EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:679:1: ruleOneof EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofRule()); 
            }
            pushFollow(FOLLOW_ruleOneof_in_entryRuleOneof1386);
            ruleOneof();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneof1393); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:686:1: ruleOneof : ( ( rule__Oneof__Group__0 ) ) ;
    public final void ruleOneof() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:690:2: ( ( ( rule__Oneof__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:691:1: ( ( rule__Oneof__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:691:1: ( ( rule__Oneof__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:692:1: ( rule__Oneof__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:693:1: ( rule__Oneof__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:693:2: rule__Oneof__Group__0
            {
            pushFollow(FOLLOW_rule__Oneof__Group__0_in_ruleOneof1419);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:705:1: entryRuleOneofField : ruleOneofField EOF ;
    public final void entryRuleOneofField() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:706:1: ( ruleOneofField EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:707:1: ruleOneofField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldRule()); 
            }
            pushFollow(FOLLOW_ruleOneofField_in_entryRuleOneofField1446);
            ruleOneofField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneofField1453); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:714:1: ruleOneofField : ( ( rule__OneofField__Group__0 ) ) ;
    public final void ruleOneofField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:718:2: ( ( ( rule__OneofField__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:719:1: ( ( rule__OneofField__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:719:1: ( ( rule__OneofField__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:720:1: ( rule__OneofField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:721:1: ( rule__OneofField__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:721:2: rule__OneofField__Group__0
            {
            pushFollow(FOLLOW_rule__OneofField__Group__0_in_ruleOneofField1479);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:733:1: entryRuleIndexedElement : ruleIndexedElement EOF ;
    public final void entryRuleIndexedElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:734:1: ( ruleIndexedElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:735:1: ruleIndexedElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexedElementRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement1506);
            ruleIndexedElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexedElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedElement1513); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:742:1: ruleIndexedElement : ( ( rule__IndexedElement__Alternatives ) ) ;
    public final void ruleIndexedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:746:2: ( ( ( rule__IndexedElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:747:1: ( ( rule__IndexedElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:747:1: ( ( rule__IndexedElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:748:1: ( rule__IndexedElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexedElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:749:1: ( rule__IndexedElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:749:2: rule__IndexedElement__Alternatives
            {
            pushFollow(FOLLOW_rule__IndexedElement__Alternatives_in_ruleIndexedElement1539);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:761:1: entryRuleExtensionRange : ruleExtensionRange EOF ;
    public final void entryRuleExtensionRange() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:762:1: ( ruleExtensionRange EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:763:1: ruleExtensionRange EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange1566);
            ruleExtensionRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionRange1573); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:770:1: ruleExtensionRange : ( ( rule__ExtensionRange__Group__0 ) ) ;
    public final void ruleExtensionRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:774:2: ( ( ( rule__ExtensionRange__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:775:1: ( ( rule__ExtensionRange__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:775:1: ( ( rule__ExtensionRange__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:776:1: ( rule__ExtensionRange__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:777:1: ( rule__ExtensionRange__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:777:2: rule__ExtensionRange__Group__0
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__0_in_ruleExtensionRange1599);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:789:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:790:1: ( ruleRange EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:791:1: ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange1626);
            ruleRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange1633); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:798:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:802:2: ( ( ( rule__Range__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:803:1: ( ( rule__Range__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:803:1: ( ( rule__Range__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:804:1: ( rule__Range__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:805:1: ( rule__Range__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:805:2: rule__Range__Group__0
            {
            pushFollow(FOLLOW_rule__Range__Group__0_in_ruleRange1659);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:817:1: entryRuleMessageField : ruleMessageField EOF ;
    public final void entryRuleMessageField() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:818:1: ( ruleMessageField EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:819:1: ruleMessageField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldRule()); 
            }
            pushFollow(FOLLOW_ruleMessageField_in_entryRuleMessageField1686);
            ruleMessageField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageField1693); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:826:1: ruleMessageField : ( ( rule__MessageField__Group__0 ) ) ;
    public final void ruleMessageField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:830:2: ( ( ( rule__MessageField__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:831:1: ( ( rule__MessageField__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:831:1: ( ( rule__MessageField__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:832:1: ( rule__MessageField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:833:1: ( rule__MessageField__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:833:2: rule__MessageField__Group__0
            {
            pushFollow(FOLLOW_rule__MessageField__Group__0_in_ruleMessageField1719);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:845:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:846:1: ( ruleGroup EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:847:1: ruleGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupRule()); 
            }
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup1746);
            ruleGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup1753); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:854:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:858:2: ( ( ( rule__Group__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:859:1: ( ( rule__Group__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:859:1: ( ( rule__Group__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:860:1: ( rule__Group__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:861:1: ( rule__Group__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:861:2: rule__Group__Group__0
            {
            pushFollow(FOLLOW_rule__Group__Group__0_in_ruleGroup1779);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:873:1: entryRuleTypeLink : ruleTypeLink EOF ;
    public final void entryRuleTypeLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:874:1: ( ruleTypeLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:875:1: ruleTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_entryRuleTypeLink1806);
            ruleTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLink1813); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:882:1: ruleTypeLink : ( ( rule__TypeLink__Alternatives ) ) ;
    public final void ruleTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:886:2: ( ( ( rule__TypeLink__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:887:1: ( ( rule__TypeLink__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:887:1: ( ( rule__TypeLink__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:888:1: ( rule__TypeLink__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLinkAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:889:1: ( rule__TypeLink__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:889:2: rule__TypeLink__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeLink__Alternatives_in_ruleTypeLink1839);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:901:1: entryRuleComplexTypeLink : ruleComplexTypeLink EOF ;
    public final void entryRuleComplexTypeLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:902:1: ( ruleComplexTypeLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:903:1: ruleComplexTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink1866);
            ruleComplexTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLink1873); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:910:1: ruleComplexTypeLink : ( ( rule__ComplexTypeLink__TargetAssignment ) ) ;
    public final void ruleComplexTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:914:2: ( ( ( rule__ComplexTypeLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:915:1: ( ( rule__ComplexTypeLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:915:1: ( ( rule__ComplexTypeLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:916:1: ( rule__ComplexTypeLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:917:1: ( rule__ComplexTypeLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:917:2: rule__ComplexTypeLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__ComplexTypeLink__TargetAssignment_in_ruleComplexTypeLink1899);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:929:1: entryRuleScalarTypeLink : ruleScalarTypeLink EOF ;
    public final void entryRuleScalarTypeLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:930:1: ( ruleScalarTypeLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:931:1: ruleScalarTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink1926);
            ruleScalarTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScalarTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarTypeLink1933); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:938:1: ruleScalarTypeLink : ( ( rule__ScalarTypeLink__TargetAssignment ) ) ;
    public final void ruleScalarTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:942:2: ( ( ( rule__ScalarTypeLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:943:1: ( ( rule__ScalarTypeLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:943:1: ( ( rule__ScalarTypeLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:944:1: ( rule__ScalarTypeLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:945:1: ( rule__ScalarTypeLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:945:2: rule__ScalarTypeLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__ScalarTypeLink__TargetAssignment_in_ruleScalarTypeLink1959);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:957:1: entryRuleFieldOptions : ruleFieldOptions EOF ;
    public final void entryRuleFieldOptions() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:958:1: ( ruleFieldOptions EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:959:1: ruleFieldOptions EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions1986);
            ruleFieldOptions();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOptions1993); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:966:1: ruleFieldOptions : ( ( rule__FieldOptions__Group__0 ) ) ;
    public final void ruleFieldOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:970:2: ( ( ( rule__FieldOptions__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:971:1: ( ( rule__FieldOptions__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:971:1: ( ( rule__FieldOptions__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:972:1: ( rule__FieldOptions__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:973:1: ( rule__FieldOptions__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:973:2: rule__FieldOptions__Group__0
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__0_in_ruleFieldOptions2019);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:985:1: entryRuleFieldOption : ruleFieldOption EOF ;
    public final void entryRuleFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:986:1: ( ruleFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:987:1: ruleFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_entryRuleFieldOption2046);
            ruleFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOption2053); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:994:1: ruleFieldOption : ( ( rule__FieldOption__Alternatives ) ) ;
    public final void ruleFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:998:2: ( ( ( rule__FieldOption__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:999:1: ( ( rule__FieldOption__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:999:1: ( ( rule__FieldOption__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1000:1: ( rule__FieldOption__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1001:1: ( rule__FieldOption__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1001:2: rule__FieldOption__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldOption__Alternatives_in_ruleFieldOption2079);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1013:1: entryRulePackedValueFieldOption : rulePackedValueFieldOption EOF ;
    public final void entryRulePackedValueFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1014:1: ( rulePackedValueFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1015:1: rulePackedValueFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionRule()); 
            }
            pushFollow(FOLLOW_rulePackedValueFieldOption_in_entryRulePackedValueFieldOption2106);
            rulePackedValueFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackedValueFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackedValueFieldOption2113); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1022:1: rulePackedValueFieldOption : ( ( rule__PackedValueFieldOption__Group__0 ) ) ;
    public final void rulePackedValueFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1026:2: ( ( ( rule__PackedValueFieldOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1027:1: ( ( rule__PackedValueFieldOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1027:1: ( ( rule__PackedValueFieldOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1028:1: ( rule__PackedValueFieldOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1029:1: ( rule__PackedValueFieldOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1029:2: rule__PackedValueFieldOption__Group__0
            {
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__0_in_rulePackedValueFieldOption2139);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1041:1: entryRuleDefaultValueFieldOption : ruleDefaultValueFieldOption EOF ;
    public final void entryRuleDefaultValueFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1042:1: ( ruleDefaultValueFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1043:1: ruleDefaultValueFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption2166);
            ruleDefaultValueFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultValueFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValueFieldOption2173); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1050:1: ruleDefaultValueFieldOption : ( ( rule__DefaultValueFieldOption__Group__0 ) ) ;
    public final void ruleDefaultValueFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1054:2: ( ( ( rule__DefaultValueFieldOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1055:1: ( ( rule__DefaultValueFieldOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1055:1: ( ( rule__DefaultValueFieldOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1056:1: ( rule__DefaultValueFieldOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1057:1: ( rule__DefaultValueFieldOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1057:2: rule__DefaultValueFieldOption__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__0_in_ruleDefaultValueFieldOption2199);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1069:1: entryRuleNativeFieldOption : ruleNativeFieldOption EOF ;
    public final void entryRuleNativeFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1070:1: ( ruleNativeFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1071:1: ruleNativeFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption2226);
            ruleNativeFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeFieldOption2233); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1078:1: ruleNativeFieldOption : ( ( rule__NativeFieldOption__Group__0 ) ) ;
    public final void ruleNativeFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1082:2: ( ( ( rule__NativeFieldOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1083:1: ( ( rule__NativeFieldOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1083:1: ( ( rule__NativeFieldOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1084:1: ( rule__NativeFieldOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1085:1: ( rule__NativeFieldOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1085:2: rule__NativeFieldOption__Group__0
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__0_in_ruleNativeFieldOption2259);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1097:1: entryRuleOptionSource : ruleOptionSource EOF ;
    public final void entryRuleOptionSource() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1098:1: ( ruleOptionSource EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1099:1: ruleOptionSource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceRule()); 
            }
            pushFollow(FOLLOW_ruleOptionSource_in_entryRuleOptionSource2286);
            ruleOptionSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionSourceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionSource2293); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1106:1: ruleOptionSource : ( ( rule__OptionSource__TargetAssignment ) ) ;
    public final void ruleOptionSource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1110:2: ( ( ( rule__OptionSource__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1111:1: ( ( rule__OptionSource__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1111:1: ( ( rule__OptionSource__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1112:1: ( rule__OptionSource__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1113:1: ( rule__OptionSource__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1113:2: rule__OptionSource__TargetAssignment
            {
            pushFollow(FOLLOW_rule__OptionSource__TargetAssignment_in_ruleOptionSource2319);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1125:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1126:1: ( ruleEnum EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1127:1: ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum2346);
            ruleEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum2353); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1134:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1138:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1139:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1139:1: ( ( rule__Enum__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1140:1: ( rule__Enum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1141:1: ( rule__Enum__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1141:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum2379);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1153:1: entryRuleEnumElement : ruleEnumElement EOF ;
    public final void entryRuleEnumElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1154:1: ( ruleEnumElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1155:1: ruleEnumElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumElementRule()); 
            }
            pushFollow(FOLLOW_ruleEnumElement_in_entryRuleEnumElement2406);
            ruleEnumElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumElement2413); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1162:1: ruleEnumElement : ( ( rule__EnumElement__Alternatives ) ) ;
    public final void ruleEnumElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1166:2: ( ( ( rule__EnumElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1167:1: ( ( rule__EnumElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1167:1: ( ( rule__EnumElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1168:1: ( rule__EnumElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1169:1: ( rule__EnumElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1169:2: rule__EnumElement__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumElement__Alternatives_in_ruleEnumElement2439);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1181:1: entryRuleEnumField : ruleEnumField EOF ;
    public final void entryRuleEnumField() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1182:1: ( ruleEnumField EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1183:1: ruleEnumField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldRule()); 
            }
            pushFollow(FOLLOW_ruleEnumField_in_entryRuleEnumField2466);
            ruleEnumField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumField2473); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1190:1: ruleEnumField : ( ( rule__EnumField__Group__0 ) ) ;
    public final void ruleEnumField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1194:2: ( ( ( rule__EnumField__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1195:1: ( ( rule__EnumField__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1195:1: ( ( rule__EnumField__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1196:1: ( rule__EnumField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1197:1: ( rule__EnumField__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1197:2: rule__EnumField__Group__0
            {
            pushFollow(FOLLOW_rule__EnumField__Group__0_in_ruleEnumField2499);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1209:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1210:1: ( ruleService EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1211:1: ruleService EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService2526);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService2533); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1218:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1222:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1223:1: ( ( rule__Service__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1223:1: ( ( rule__Service__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1224:1: ( rule__Service__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1225:1: ( rule__Service__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1225:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService2559);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1237:1: entryRuleServiceElement : ruleServiceElement EOF ;
    public final void entryRuleServiceElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1238:1: ( ruleServiceElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1239:1: ruleServiceElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceElementRule()); 
            }
            pushFollow(FOLLOW_ruleServiceElement_in_entryRuleServiceElement2586);
            ruleServiceElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceElement2593); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1246:1: ruleServiceElement : ( ( rule__ServiceElement__Alternatives ) ) ;
    public final void ruleServiceElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1250:2: ( ( ( rule__ServiceElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1251:1: ( ( rule__ServiceElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1251:1: ( ( rule__ServiceElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1252:1: ( rule__ServiceElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1253:1: ( rule__ServiceElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1253:2: rule__ServiceElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ServiceElement__Alternatives_in_ruleServiceElement2619);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1265:1: entryRuleRpc : ruleRpc EOF ;
    public final void entryRuleRpc() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1266:1: ( ruleRpc EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1267:1: ruleRpc EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcRule()); 
            }
            pushFollow(FOLLOW_ruleRpc_in_entryRuleRpc2646);
            ruleRpc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRpc2653); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1274:1: ruleRpc : ( ( rule__Rpc__Group__0 ) ) ;
    public final void ruleRpc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1278:2: ( ( ( rule__Rpc__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1279:1: ( ( rule__Rpc__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1279:1: ( ( rule__Rpc__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1280:1: ( rule__Rpc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1281:1: ( rule__Rpc__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1281:2: rule__Rpc__Group__0
            {
            pushFollow(FOLLOW_rule__Rpc__Group__0_in_ruleRpc2679);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1293:1: entryRuleMessageLink : ruleMessageLink EOF ;
    public final void entryRuleMessageLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1294:1: ( ruleMessageLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1295:1: ruleMessageLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkRule()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_entryRuleMessageLink2706);
            ruleMessageLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageLink2713); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1302:1: ruleMessageLink : ( ( rule__MessageLink__TargetAssignment ) ) ;
    public final void ruleMessageLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1306:2: ( ( ( rule__MessageLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1307:1: ( ( rule__MessageLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1307:1: ( ( rule__MessageLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1308:1: ( rule__MessageLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1309:1: ( rule__MessageLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1309:2: rule__MessageLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__MessageLink__TargetAssignment_in_ruleMessageLink2739);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1321:1: entryRuleExtend : ruleExtend EOF ;
    public final void entryRuleExtend() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1322:1: ( ruleExtend EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1323:1: ruleExtend EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendRule()); 
            }
            pushFollow(FOLLOW_ruleExtend_in_entryRuleExtend2766);
            ruleExtend();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtend2773); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1330:1: ruleExtend : ( ( rule__Extend__Group__0 ) ) ;
    public final void ruleExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1334:2: ( ( ( rule__Extend__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1335:1: ( ( rule__Extend__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1335:1: ( ( rule__Extend__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1336:1: ( rule__Extend__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1337:1: ( rule__Extend__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1337:2: rule__Extend__Group__0
            {
            pushFollow(FOLLOW_rule__Extend__Group__0_in_ruleExtend2799);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1349:1: entryRuleVar_full : ruleVar_full EOF ;
    public final void entryRuleVar_full() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1350:1: ( ruleVar_full EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1351:1: ruleVar_full EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_fullRule()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_entryRuleVar_full2826);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_fullRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar_full2833); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1358:1: ruleVar_full : ( ( rule__Var_full__Alternatives ) ) ;
    public final void ruleVar_full() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1362:2: ( ( ( rule__Var_full__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1363:1: ( ( rule__Var_full__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1363:1: ( ( rule__Var_full__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1364:1: ( rule__Var_full__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_fullAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1365:1: ( rule__Var_full__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1365:2: rule__Var_full__Alternatives
            {
            pushFollow(FOLLOW_rule__Var_full__Alternatives_in_ruleVar_full2859);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1377:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1378:1: ( ruleVar EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1379:1: ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar2886);
            ruleVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar2893); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1386:1: ruleVar : ( ( rule__Var__Alternatives ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1390:2: ( ( ( rule__Var__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1391:1: ( ( rule__Var__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1391:1: ( ( rule__Var__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1392:1: ( rule__Var__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1393:1: ( rule__Var__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1393:2: rule__Var__Alternatives
            {
            pushFollow(FOLLOW_rule__Var__Alternatives_in_ruleVar2919);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1405:1: entryRuleFULL_ID : ruleFULL_ID EOF ;
    public final void entryRuleFULL_ID() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1406:1: ( ruleFULL_ID EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1407:1: ruleFULL_ID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDRule()); 
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID2946);
            ruleFULL_ID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFULL_IDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFULL_ID2953); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1414:1: ruleFULL_ID : ( ( rule__FULL_ID__Group__0 ) ) ;
    public final void ruleFULL_ID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1418:2: ( ( ( rule__FULL_ID__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1419:1: ( ( rule__FULL_ID__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1419:1: ( ( rule__FULL_ID__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1420:1: ( rule__FULL_ID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1421:1: ( rule__FULL_ID__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1421:2: rule__FULL_ID__Group__0
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group__0_in_ruleFULL_ID2979);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1433:1: entryRuleVarReserved : ruleVarReserved EOF ;
    public final void entryRuleVarReserved() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1434:1: ( ruleVarReserved EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1435:1: ruleVarReserved EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReservedRule()); 
            }
            pushFollow(FOLLOW_ruleVarReserved_in_entryRuleVarReserved3006);
            ruleVarReserved();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarReservedRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarReserved3013); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1442:1: ruleVarReserved : ( ( rule__VarReserved__Alternatives ) ) ;
    public final void ruleVarReserved() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1446:2: ( ( ( rule__VarReserved__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1447:1: ( ( rule__VarReserved__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1447:1: ( ( rule__VarReserved__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1448:1: ( rule__VarReserved__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReservedAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1449:1: ( rule__VarReserved__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1449:2: rule__VarReserved__Alternatives
            {
            pushFollow(FOLLOW_rule__VarReserved__Alternatives_in_ruleVarReserved3039);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1464:1: ruleBOOL : ( ( rule__BOOL__Alternatives ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1468:1: ( ( ( rule__BOOL__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1469:1: ( ( rule__BOOL__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1469:1: ( ( rule__BOOL__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1470:1: ( rule__BOOL__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1471:1: ( rule__BOOL__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1471:2: rule__BOOL__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL3078);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1483:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1487:1: ( ( ( rule__Modifier__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1488:1: ( ( rule__Modifier__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1488:1: ( ( rule__Modifier__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1489:1: ( rule__Modifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModifierAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1490:1: ( rule__Modifier__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1490:2: rule__Modifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Modifier__Alternatives_in_ruleModifier3114);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1502:1: ruleScalarType : ( ( rule__ScalarType__Alternatives ) ) ;
    public final void ruleScalarType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1506:1: ( ( ( rule__ScalarType__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1507:1: ( ( rule__ScalarType__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1507:1: ( ( rule__ScalarType__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1508:1: ( rule__ScalarType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1509:1: ( rule__ScalarType__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1509:2: rule__ScalarType__Alternatives
            {
            pushFollow(FOLLOW_rule__ScalarType__Alternatives_in_ruleScalarType3150);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1520:1: rule__Statement__Alternatives : ( ( rulePackage ) | ( ruleImport ) | ( ruleComplexType ) | ( ( ruleExtend ) ) | ( ruleService ) | ( ruleCustomOption ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1524:1: ( ( rulePackage ) | ( ruleImport ) | ( ruleComplexType ) | ( ( ruleExtend ) ) | ( ruleService ) | ( ruleCustomOption ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1525:1: ( rulePackage )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1525:1: ( rulePackage )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1526:1: rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getPackageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePackage_in_rule__Statement__Alternatives3185);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1531:6: ( ruleImport )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1531:6: ( ruleImport )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1532:1: ruleImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getImportParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleImport_in_rule__Statement__Alternatives3202);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1537:6: ( ruleComplexType )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1537:6: ( ruleComplexType )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1538:1: ruleComplexType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getComplexTypeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleComplexType_in_rule__Statement__Alternatives3219);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1543:6: ( ( ruleExtend ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1543:6: ( ( ruleExtend ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1544:1: ( ruleExtend )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getExtendParserRuleCall_3()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1545:1: ( ruleExtend )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1545:3: ruleExtend
                    {
                    pushFollow(FOLLOW_ruleExtend_in_rule__Statement__Alternatives3237);
                    ruleExtend();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getExtendParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1549:6: ( ruleService )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1549:6: ( ruleService )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1550:1: ruleService
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getServiceParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleService_in_rule__Statement__Alternatives3255);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1555:6: ( ruleCustomOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1555:6: ( ruleCustomOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1556:1: ruleCustomOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getCustomOptionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleCustomOption_in_rule__Statement__Alternatives3272);
                    ruleCustomOption();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getCustomOptionParserRuleCall_5()); 
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1566:1: rule__Import__Alternatives : ( ( rulePublicImport ) | ( ruleWeakImport ) );
    public final void rule__Import__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1570:1: ( ( rulePublicImport ) | ( ruleWeakImport ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1571:1: ( rulePublicImport )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1571:1: ( rulePublicImport )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1572:1: rulePublicImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getPublicImportParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePublicImport_in_rule__Import__Alternatives3304);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1577:6: ( ruleWeakImport )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1577:6: ( ruleWeakImport )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1578:1: ruleWeakImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getWeakImportParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleWeakImport_in_rule__Import__Alternatives3321);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1588:1: rule__Option__Alternatives : ( ( ( ruleNativeOption ) ) | ( ruleCustomOption ) );
    public final void rule__Option__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1592:1: ( ( ( ruleNativeOption ) ) | ( ruleCustomOption ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1593:1: ( ( ruleNativeOption ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1593:1: ( ( ruleNativeOption ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1594:1: ( ruleNativeOption )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOptionAccess().getNativeOptionParserRuleCall_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1595:1: ( ruleNativeOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1595:3: ruleNativeOption
                    {
                    pushFollow(FOLLOW_ruleNativeOption_in_rule__Option__Alternatives3354);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1599:6: ( ruleCustomOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1599:6: ( ruleCustomOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1600:1: ruleCustomOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOptionAccess().getCustomOptionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCustomOption_in_rule__Option__Alternatives3372);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1610:1: rule__SimpleValueLink__Alternatives : ( ( ruleNumberLink ) | ( ruleBooleanLink ) | ( ruleStringLink ) | ( ruleCustomIdLink ) );
    public final void rule__SimpleValueLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1614:1: ( ( ruleNumberLink ) | ( ruleBooleanLink ) | ( ruleStringLink ) | ( ruleCustomIdLink ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1615:1: ( ruleNumberLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1615:1: ( ruleNumberLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1616:1: ruleNumberLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getNumberLinkParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleNumberLink_in_rule__SimpleValueLink__Alternatives3404);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1621:6: ( ruleBooleanLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1621:6: ( ruleBooleanLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1622:1: ruleBooleanLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getBooleanLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLink_in_rule__SimpleValueLink__Alternatives3421);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1627:6: ( ruleStringLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1627:6: ( ruleStringLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1628:1: ruleStringLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getStringLinkParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleStringLink_in_rule__SimpleValueLink__Alternatives3438);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1633:6: ( ruleCustomIdLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1633:6: ( ruleCustomIdLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1634:1: ruleCustomIdLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getCustomIdLinkParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleCustomIdLink_in_rule__SimpleValueLink__Alternatives3455);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1644:1: rule__NumberLink__Alternatives : ( ( ruleIntLink ) | ( ruleDoubleLink ) );
    public final void rule__NumberLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1648:1: ( ( ruleIntLink ) | ( ruleDoubleLink ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1649:1: ( ruleIntLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1649:1: ( ruleIntLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1650:1: ruleIntLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLinkAccess().getIntLinkParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleIntLink_in_rule__NumberLink__Alternatives3487);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1655:6: ( ruleDoubleLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1655:6: ( ruleDoubleLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1656:1: ruleDoubleLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLinkAccess().getDoubleLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleDoubleLink_in_rule__NumberLink__Alternatives3504);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1666:1: rule__ComplexType__Alternatives : ( ( ruleEnum ) | ( ruleExtensibleType ) );
    public final void rule__ComplexType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1670:1: ( ( ruleEnum ) | ( ruleExtensibleType ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1671:1: ( ruleEnum )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1671:1: ( ruleEnum )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1672:1: ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComplexTypeAccess().getEnumParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEnum_in_rule__ComplexType__Alternatives3536);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1677:6: ( ruleExtensibleType )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1677:6: ( ruleExtensibleType )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1678:1: ruleExtensibleType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComplexTypeAccess().getExtensibleTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleExtensibleType_in_rule__ComplexType__Alternatives3553);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1688:1: rule__ExtensibleType__Alternatives : ( ( ruleMessage ) | ( ruleGroup ) );
    public final void rule__ExtensibleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1692:1: ( ( ruleMessage ) | ( ruleGroup ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1693:1: ( ruleMessage )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1693:1: ( ruleMessage )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1694:1: ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensibleTypeAccess().getMessageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMessage_in_rule__ExtensibleType__Alternatives3585);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1699:6: ( ruleGroup )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1699:6: ( ruleGroup )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1700:1: ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensibleTypeAccess().getGroupParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGroup_in_rule__ExtensibleType__Alternatives3602);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1710:1: rule__MessageElement__Alternatives : ( ( ruleMessage ) | ( ruleIndexedElement ) | ( ruleOneof ) | ( ruleEnum ) | ( ruleService ) | ( ( ruleExtend ) ) | ( ruleExtensionRange ) | ( ruleOption ) );
    public final void rule__MessageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1714:1: ( ( ruleMessage ) | ( ruleIndexedElement ) | ( ruleOneof ) | ( ruleEnum ) | ( ruleService ) | ( ( ruleExtend ) ) | ( ruleExtensionRange ) | ( ruleOption ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1715:1: ( ruleMessage )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1715:1: ( ruleMessage )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1716:1: ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getMessageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMessage_in_rule__MessageElement__Alternatives3634);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1721:6: ( ruleIndexedElement )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1721:6: ( ruleIndexedElement )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1722:1: ruleIndexedElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getIndexedElementParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIndexedElement_in_rule__MessageElement__Alternatives3651);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1727:6: ( ruleOneof )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1727:6: ( ruleOneof )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1728:1: ruleOneof
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getOneofParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleOneof_in_rule__MessageElement__Alternatives3668);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1733:6: ( ruleEnum )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1733:6: ( ruleEnum )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1734:1: ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getEnumParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleEnum_in_rule__MessageElement__Alternatives3685);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1739:6: ( ruleService )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1739:6: ( ruleService )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1740:1: ruleService
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getServiceParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleService_in_rule__MessageElement__Alternatives3702);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1745:6: ( ( ruleExtend ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1745:6: ( ( ruleExtend ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1746:1: ( ruleExtend )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getExtendParserRuleCall_5()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1747:1: ( ruleExtend )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1747:3: ruleExtend
                    {
                    pushFollow(FOLLOW_ruleExtend_in_rule__MessageElement__Alternatives3720);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1751:6: ( ruleExtensionRange )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1751:6: ( ruleExtensionRange )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1752:1: ruleExtensionRange
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getExtensionRangeParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleExtensionRange_in_rule__MessageElement__Alternatives3738);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1757:6: ( ruleOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1757:6: ( ruleOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1758:1: ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getOptionParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_ruleOption_in_rule__MessageElement__Alternatives3755);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1768:1: rule__IndexedElement__Alternatives : ( ( ruleMessageField ) | ( ruleGroup ) );
    public final void rule__IndexedElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1772:1: ( ( ruleMessageField ) | ( ruleGroup ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1773:1: ( ruleMessageField )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1773:1: ( ruleMessageField )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1774:1: ruleMessageField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIndexedElementAccess().getMessageFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMessageField_in_rule__IndexedElement__Alternatives3787);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1779:6: ( ruleGroup )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1779:6: ( ruleGroup )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1780:1: ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIndexedElementAccess().getGroupParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGroup_in_rule__IndexedElement__Alternatives3804);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1790:1: rule__Range__Alternatives_1_1 : ( ( ( rule__Range__ToAssignment_1_1_0 ) ) | ( ( rule__Range__MaxAssignment_1_1_1 ) ) );
    public final void rule__Range__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1794:1: ( ( ( rule__Range__ToAssignment_1_1_0 ) ) | ( ( rule__Range__MaxAssignment_1_1_1 ) ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1795:1: ( ( rule__Range__ToAssignment_1_1_0 ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1795:1: ( ( rule__Range__ToAssignment_1_1_0 ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1796:1: ( rule__Range__ToAssignment_1_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeAccess().getToAssignment_1_1_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1797:1: ( rule__Range__ToAssignment_1_1_0 )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1797:2: rule__Range__ToAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Range__ToAssignment_1_1_0_in_rule__Range__Alternatives_1_13836);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1801:6: ( ( rule__Range__MaxAssignment_1_1_1 ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1801:6: ( ( rule__Range__MaxAssignment_1_1_1 ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1802:1: ( rule__Range__MaxAssignment_1_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeAccess().getMaxAssignment_1_1_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1803:1: ( rule__Range__MaxAssignment_1_1_1 )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1803:2: rule__Range__MaxAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_rule__Range__MaxAssignment_1_1_1_in_rule__Range__Alternatives_1_13854);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1812:1: rule__TypeLink__Alternatives : ( ( ( ruleScalarTypeLink ) ) | ( ruleComplexTypeLink ) );
    public final void rule__TypeLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1816:1: ( ( ( ruleScalarTypeLink ) ) | ( ruleComplexTypeLink ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1817:1: ( ( ruleScalarTypeLink ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1817:1: ( ( ruleScalarTypeLink ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1818:1: ( ruleScalarTypeLink )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLinkAccess().getScalarTypeLinkParserRuleCall_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1819:1: ( ruleScalarTypeLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1819:3: ruleScalarTypeLink
                    {
                    pushFollow(FOLLOW_ruleScalarTypeLink_in_rule__TypeLink__Alternatives3888);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1823:6: ( ruleComplexTypeLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1823:6: ( ruleComplexTypeLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1824:1: ruleComplexTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLinkAccess().getComplexTypeLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleComplexTypeLink_in_rule__TypeLink__Alternatives3906);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1834:1: rule__FieldOption__Alternatives : ( ( ( rulePackedValueFieldOption ) ) | ( ( ruleDefaultValueFieldOption ) ) | ( ruleNativeFieldOption ) );
    public final void rule__FieldOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1838:1: ( ( ( rulePackedValueFieldOption ) ) | ( ( ruleDefaultValueFieldOption ) ) | ( ruleNativeFieldOption ) )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1839:1: ( ( rulePackedValueFieldOption ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1839:1: ( ( rulePackedValueFieldOption ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1840:1: ( rulePackedValueFieldOption )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldOptionAccess().getPackedValueFieldOptionParserRuleCall_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1841:1: ( rulePackedValueFieldOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1841:3: rulePackedValueFieldOption
                    {
                    pushFollow(FOLLOW_rulePackedValueFieldOption_in_rule__FieldOption__Alternatives3939);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1845:6: ( ( ruleDefaultValueFieldOption ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1845:6: ( ( ruleDefaultValueFieldOption ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1846:1: ( ruleDefaultValueFieldOption )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldOptionAccess().getDefaultValueFieldOptionParserRuleCall_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1847:1: ( ruleDefaultValueFieldOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1847:3: ruleDefaultValueFieldOption
                    {
                    pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_rule__FieldOption__Alternatives3958);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1851:6: ( ruleNativeFieldOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1851:6: ( ruleNativeFieldOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1852:1: ruleNativeFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldOptionAccess().getNativeFieldOptionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleNativeFieldOption_in_rule__FieldOption__Alternatives3976);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1862:1: rule__EnumElement__Alternatives : ( ( ruleEnumField ) | ( ruleCustomOption ) );
    public final void rule__EnumElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1866:1: ( ( ruleEnumField ) | ( ruleCustomOption ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1867:1: ( ruleEnumField )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1867:1: ( ruleEnumField )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1868:1: ruleEnumField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumElementAccess().getEnumFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEnumField_in_rule__EnumElement__Alternatives4008);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1873:6: ( ruleCustomOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1873:6: ( ruleCustomOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1874:1: ruleCustomOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumElementAccess().getCustomOptionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCustomOption_in_rule__EnumElement__Alternatives4025);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1884:1: rule__ServiceElement__Alternatives : ( ( ( ruleRpc ) ) | ( ruleOption ) );
    public final void rule__ServiceElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1888:1: ( ( ( ruleRpc ) ) | ( ruleOption ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1889:1: ( ( ruleRpc ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1889:1: ( ( ruleRpc ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1890:1: ( ruleRpc )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getServiceElementAccess().getRpcParserRuleCall_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1891:1: ( ruleRpc )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1891:3: ruleRpc
                    {
                    pushFollow(FOLLOW_ruleRpc_in_rule__ServiceElement__Alternatives4058);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1895:6: ( ruleOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1895:6: ( ruleOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1896:1: ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getServiceElementAccess().getOptionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleOption_in_rule__ServiceElement__Alternatives4076);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1906:1: rule__Var_full__Alternatives : ( ( ruleFULL_ID ) | ( ruleVar ) );
    public final void rule__Var_full__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1910:1: ( ( ruleFULL_ID ) | ( ruleVar ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==62) ) {
                    alt15=1;
                }
                else if ( (LA15_1==EOF||LA15_1==RULE_ID||(LA15_1>=13 && LA15_1<=48)||(LA15_1>=51 && LA15_1<=52)||LA15_1==54||LA15_1==61) ) {
                    alt15=2;
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1911:1: ( ruleFULL_ID )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1911:1: ( ruleFULL_ID )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1912:1: ruleFULL_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_fullAccess().getFULL_IDParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleFULL_ID_in_rule__Var_full__Alternatives4108);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1917:6: ( ruleVar )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1917:6: ( ruleVar )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1918:1: ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_fullAccess().getVarParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVar_in_rule__Var_full__Alternatives4125);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1928:1: rule__Var__Alternatives : ( ( RULE_ID ) | ( ruleVarReserved ) );
    public final void rule__Var__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1932:1: ( ( RULE_ID ) | ( ruleVarReserved ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1933:1: ( RULE_ID )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1933:1: ( RULE_ID )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1934:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Var__Alternatives4157); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1939:6: ( ruleVarReserved )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1939:6: ( ruleVarReserved )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1940:1: ruleVarReserved
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarAccess().getVarReservedParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVarReserved_in_rule__Var__Alternatives4174);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1950:1: rule__VarReserved__Alternatives : ( ( 'to' ) | ( 'package' ) | ( 'syntax' ) | ( 'import' ) | ( 'option' ) | ( 'message' ) | ( 'service' ) | ( 'enum' ) | ( 'required' ) | ( 'optional' ) | ( 'repeated' ) | ( 'extensions' ) | ( 'extend' ) | ( 'group' ) | ( 'rpc' ) | ( 'returns' ) | ( 'int32' ) | ( 'int64' ) | ( 'uint32' ) | ( 'uint64' ) | ( 'sint32' ) | ( 'sint64' ) | ( 'fixed32' ) | ( 'fixed64' ) | ( 'sfixed32' ) | ( 'sfixed64' ) | ( 'float' ) | ( 'double' ) | ( 'bool' ) | ( 'string' ) | ( 'bytes' ) | ( 'default' ) | ( 'max' ) | ( 'void' ) | ( 'weak' ) | ( 'packed' ) );
    public final void rule__VarReserved__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1954:1: ( ( 'to' ) | ( 'package' ) | ( 'syntax' ) | ( 'import' ) | ( 'option' ) | ( 'message' ) | ( 'service' ) | ( 'enum' ) | ( 'required' ) | ( 'optional' ) | ( 'repeated' ) | ( 'extensions' ) | ( 'extend' ) | ( 'group' ) | ( 'rpc' ) | ( 'returns' ) | ( 'int32' ) | ( 'int64' ) | ( 'uint32' ) | ( 'uint64' ) | ( 'sint32' ) | ( 'sint64' ) | ( 'fixed32' ) | ( 'fixed64' ) | ( 'sfixed32' ) | ( 'sfixed64' ) | ( 'float' ) | ( 'double' ) | ( 'bool' ) | ( 'string' ) | ( 'bytes' ) | ( 'default' ) | ( 'max' ) | ( 'void' ) | ( 'weak' ) | ( 'packed' ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1955:1: ( 'to' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1955:1: ( 'to' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1956:1: 'to'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getToKeyword_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__VarReserved__Alternatives4207); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getToKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1963:6: ( 'package' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1963:6: ( 'package' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1964:1: 'package'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getPackageKeyword_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__VarReserved__Alternatives4227); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getPackageKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1971:6: ( 'syntax' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1971:6: ( 'syntax' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1972:1: 'syntax'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSyntaxKeyword_2()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__VarReserved__Alternatives4247); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSyntaxKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1979:6: ( 'import' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1979:6: ( 'import' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1980:1: 'import'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getImportKeyword_3()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__VarReserved__Alternatives4267); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getImportKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1987:6: ( 'option' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1987:6: ( 'option' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1988:1: 'option'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getOptionKeyword_4()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__VarReserved__Alternatives4287); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getOptionKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1995:6: ( 'message' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1995:6: ( 'message' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1996:1: 'message'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getMessageKeyword_5()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__VarReserved__Alternatives4307); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getMessageKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2003:6: ( 'service' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2003:6: ( 'service' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2004:1: 'service'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getServiceKeyword_6()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__VarReserved__Alternatives4327); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getServiceKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2011:6: ( 'enum' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2011:6: ( 'enum' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2012:1: 'enum'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getEnumKeyword_7()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__VarReserved__Alternatives4347); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getEnumKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2019:6: ( 'required' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2019:6: ( 'required' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2020:1: 'required'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getRequiredKeyword_8()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__VarReserved__Alternatives4367); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getRequiredKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2027:6: ( 'optional' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2027:6: ( 'optional' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2028:1: 'optional'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getOptionalKeyword_9()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__VarReserved__Alternatives4387); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getOptionalKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2035:6: ( 'repeated' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2035:6: ( 'repeated' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2036:1: 'repeated'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getRepeatedKeyword_10()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__VarReserved__Alternatives4407); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getRepeatedKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2043:6: ( 'extensions' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2043:6: ( 'extensions' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2044:1: 'extensions'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getExtensionsKeyword_11()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__VarReserved__Alternatives4427); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getExtensionsKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2051:6: ( 'extend' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2051:6: ( 'extend' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2052:1: 'extend'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getExtendKeyword_12()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__VarReserved__Alternatives4447); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getExtendKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2059:6: ( 'group' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2059:6: ( 'group' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2060:1: 'group'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getGroupKeyword_13()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__VarReserved__Alternatives4467); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getGroupKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2067:6: ( 'rpc' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2067:6: ( 'rpc' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2068:1: 'rpc'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getRpcKeyword_14()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__VarReserved__Alternatives4487); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getRpcKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2075:6: ( 'returns' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2075:6: ( 'returns' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2076:1: 'returns'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getReturnsKeyword_15()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__VarReserved__Alternatives4507); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getReturnsKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2083:6: ( 'int32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2083:6: ( 'int32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2084:1: 'int32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getInt32Keyword_16()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__VarReserved__Alternatives4527); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getInt32Keyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2091:6: ( 'int64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2091:6: ( 'int64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2092:1: 'int64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getInt64Keyword_17()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__VarReserved__Alternatives4547); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getInt64Keyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2099:6: ( 'uint32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2099:6: ( 'uint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2100:1: 'uint32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getUint32Keyword_18()); 
                    }
                    match(input,31,FOLLOW_31_in_rule__VarReserved__Alternatives4567); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getUint32Keyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2107:6: ( 'uint64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2107:6: ( 'uint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2108:1: 'uint64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getUint64Keyword_19()); 
                    }
                    match(input,32,FOLLOW_32_in_rule__VarReserved__Alternatives4587); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getUint64Keyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2115:6: ( 'sint32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2115:6: ( 'sint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2116:1: 'sint32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSint32Keyword_20()); 
                    }
                    match(input,33,FOLLOW_33_in_rule__VarReserved__Alternatives4607); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSint32Keyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2123:6: ( 'sint64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2123:6: ( 'sint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2124:1: 'sint64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSint64Keyword_21()); 
                    }
                    match(input,34,FOLLOW_34_in_rule__VarReserved__Alternatives4627); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSint64Keyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2131:6: ( 'fixed32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2131:6: ( 'fixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2132:1: 'fixed32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getFixed32Keyword_22()); 
                    }
                    match(input,35,FOLLOW_35_in_rule__VarReserved__Alternatives4647); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getFixed32Keyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2139:6: ( 'fixed64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2139:6: ( 'fixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2140:1: 'fixed64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getFixed64Keyword_23()); 
                    }
                    match(input,36,FOLLOW_36_in_rule__VarReserved__Alternatives4667); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getFixed64Keyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2147:6: ( 'sfixed32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2147:6: ( 'sfixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2148:1: 'sfixed32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSfixed32Keyword_24()); 
                    }
                    match(input,37,FOLLOW_37_in_rule__VarReserved__Alternatives4687); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSfixed32Keyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2155:6: ( 'sfixed64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2155:6: ( 'sfixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2156:1: 'sfixed64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSfixed64Keyword_25()); 
                    }
                    match(input,38,FOLLOW_38_in_rule__VarReserved__Alternatives4707); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSfixed64Keyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2163:6: ( 'float' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2163:6: ( 'float' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2164:1: 'float'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getFloatKeyword_26()); 
                    }
                    match(input,39,FOLLOW_39_in_rule__VarReserved__Alternatives4727); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getFloatKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2171:6: ( 'double' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2171:6: ( 'double' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2172:1: 'double'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getDoubleKeyword_27()); 
                    }
                    match(input,40,FOLLOW_40_in_rule__VarReserved__Alternatives4747); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getDoubleKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2179:6: ( 'bool' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2179:6: ( 'bool' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2180:1: 'bool'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getBoolKeyword_28()); 
                    }
                    match(input,41,FOLLOW_41_in_rule__VarReserved__Alternatives4767); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getBoolKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2187:6: ( 'string' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2187:6: ( 'string' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2188:1: 'string'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getStringKeyword_29()); 
                    }
                    match(input,42,FOLLOW_42_in_rule__VarReserved__Alternatives4787); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getStringKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2195:6: ( 'bytes' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2195:6: ( 'bytes' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2196:1: 'bytes'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getBytesKeyword_30()); 
                    }
                    match(input,43,FOLLOW_43_in_rule__VarReserved__Alternatives4807); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getBytesKeyword_30()); 
                    }

                    }


                    }
                    break;
                case 32 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2203:6: ( 'default' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2203:6: ( 'default' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2204:1: 'default'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getDefaultKeyword_31()); 
                    }
                    match(input,44,FOLLOW_44_in_rule__VarReserved__Alternatives4827); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getDefaultKeyword_31()); 
                    }

                    }


                    }
                    break;
                case 33 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2211:6: ( 'max' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2211:6: ( 'max' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2212:1: 'max'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getMaxKeyword_32()); 
                    }
                    match(input,45,FOLLOW_45_in_rule__VarReserved__Alternatives4847); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getMaxKeyword_32()); 
                    }

                    }


                    }
                    break;
                case 34 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2219:6: ( 'void' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2219:6: ( 'void' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2220:1: 'void'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getVoidKeyword_33()); 
                    }
                    match(input,46,FOLLOW_46_in_rule__VarReserved__Alternatives4867); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getVoidKeyword_33()); 
                    }

                    }


                    }
                    break;
                case 35 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2227:6: ( 'weak' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2227:6: ( 'weak' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2228:1: 'weak'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getWeakKeyword_34()); 
                    }
                    match(input,47,FOLLOW_47_in_rule__VarReserved__Alternatives4887); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getWeakKeyword_34()); 
                    }

                    }


                    }
                    break;
                case 36 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2235:6: ( 'packed' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2235:6: ( 'packed' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2236:1: 'packed'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getPackedKeyword_35()); 
                    }
                    match(input,48,FOLLOW_48_in_rule__VarReserved__Alternatives4907); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2249:1: rule__BOOL__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BOOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2253:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2254:1: ( ( 'true' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2254:1: ( ( 'true' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2255:1: ( 'true' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2256:1: ( 'true' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2256:3: 'true'
                    {
                    match(input,49,FOLLOW_49_in_rule__BOOL__Alternatives4943); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2261:6: ( ( 'false' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2261:6: ( ( 'false' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2262:1: ( 'false' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLAccess().getFalseEnumLiteralDeclaration_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2263:1: ( 'false' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2263:3: 'false'
                    {
                    match(input,50,FOLLOW_50_in_rule__BOOL__Alternatives4964); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2273:1: rule__Modifier__Alternatives : ( ( ( 'optional' ) ) | ( ( 'required' ) ) | ( ( 'repeated' ) ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2277:1: ( ( ( 'optional' ) ) | ( ( 'required' ) ) | ( ( 'repeated' ) ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2278:1: ( ( 'optional' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2278:1: ( ( 'optional' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2279:1: ( 'optional' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2280:1: ( 'optional' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2280:3: 'optional'
                    {
                    match(input,22,FOLLOW_22_in_rule__Modifier__Alternatives5000); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2285:6: ( ( 'required' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2285:6: ( ( 'required' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2286:1: ( 'required' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2287:1: ( 'required' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2287:3: 'required'
                    {
                    match(input,21,FOLLOW_21_in_rule__Modifier__Alternatives5021); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2292:6: ( ( 'repeated' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2292:6: ( ( 'repeated' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2293:1: ( 'repeated' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getRepeatedEnumLiteralDeclaration_2()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2294:1: ( 'repeated' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2294:3: 'repeated'
                    {
                    match(input,23,FOLLOW_23_in_rule__Modifier__Alternatives5042); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2304:1: rule__ScalarType__Alternatives : ( ( ( 'int32' ) ) | ( ( 'int64' ) ) | ( ( 'uint32' ) ) | ( ( 'uint64' ) ) | ( ( 'sint32' ) ) | ( ( 'sint64' ) ) | ( ( 'fixed32' ) ) | ( ( 'fixed64' ) ) | ( ( 'sfixed32' ) ) | ( ( 'sfixed64' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'bool' ) ) | ( ( 'string' ) ) | ( ( 'bytes' ) ) );
    public final void rule__ScalarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2308:1: ( ( ( 'int32' ) ) | ( ( 'int64' ) ) | ( ( 'uint32' ) ) | ( ( 'uint64' ) ) | ( ( 'sint32' ) ) | ( ( 'sint64' ) ) | ( ( 'fixed32' ) ) | ( ( 'fixed64' ) ) | ( ( 'sfixed32' ) ) | ( ( 'sfixed64' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'bool' ) ) | ( ( 'string' ) ) | ( ( 'bytes' ) ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2309:1: ( ( 'int32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2309:1: ( ( 'int32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2310:1: ( 'int32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2311:1: ( 'int32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2311:3: 'int32'
                    {
                    match(input,29,FOLLOW_29_in_rule__ScalarType__Alternatives5078); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2316:6: ( ( 'int64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2316:6: ( ( 'int64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2317:1: ( 'int64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2318:1: ( 'int64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2318:3: 'int64'
                    {
                    match(input,30,FOLLOW_30_in_rule__ScalarType__Alternatives5099); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2323:6: ( ( 'uint32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2323:6: ( ( 'uint32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2324:1: ( 'uint32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2325:1: ( 'uint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2325:3: 'uint32'
                    {
                    match(input,31,FOLLOW_31_in_rule__ScalarType__Alternatives5120); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2330:6: ( ( 'uint64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2330:6: ( ( 'uint64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2331:1: ( 'uint64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2332:1: ( 'uint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2332:3: 'uint64'
                    {
                    match(input,32,FOLLOW_32_in_rule__ScalarType__Alternatives5141); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2337:6: ( ( 'sint32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2337:6: ( ( 'sint32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2338:1: ( 'sint32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2339:1: ( 'sint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2339:3: 'sint32'
                    {
                    match(input,33,FOLLOW_33_in_rule__ScalarType__Alternatives5162); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2344:6: ( ( 'sint64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2344:6: ( ( 'sint64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2345:1: ( 'sint64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2346:1: ( 'sint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2346:3: 'sint64'
                    {
                    match(input,34,FOLLOW_34_in_rule__ScalarType__Alternatives5183); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2351:6: ( ( 'fixed32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2351:6: ( ( 'fixed32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2352:1: ( 'fixed32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2353:1: ( 'fixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2353:3: 'fixed32'
                    {
                    match(input,35,FOLLOW_35_in_rule__ScalarType__Alternatives5204); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2358:6: ( ( 'fixed64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2358:6: ( ( 'fixed64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2359:1: ( 'fixed64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2360:1: ( 'fixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2360:3: 'fixed64'
                    {
                    match(input,36,FOLLOW_36_in_rule__ScalarType__Alternatives5225); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2365:6: ( ( 'sfixed32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2365:6: ( ( 'sfixed32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2366:1: ( 'sfixed32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2367:1: ( 'sfixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2367:3: 'sfixed32'
                    {
                    match(input,37,FOLLOW_37_in_rule__ScalarType__Alternatives5246); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2372:6: ( ( 'sfixed64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2372:6: ( ( 'sfixed64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2373:1: ( 'sfixed64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2374:1: ( 'sfixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2374:3: 'sfixed64'
                    {
                    match(input,38,FOLLOW_38_in_rule__ScalarType__Alternatives5267); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2379:6: ( ( 'float' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2379:6: ( ( 'float' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2380:1: ( 'float' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2381:1: ( 'float' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2381:3: 'float'
                    {
                    match(input,39,FOLLOW_39_in_rule__ScalarType__Alternatives5288); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2386:6: ( ( 'double' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2386:6: ( ( 'double' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2387:1: ( 'double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2388:1: ( 'double' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2388:3: 'double'
                    {
                    match(input,40,FOLLOW_40_in_rule__ScalarType__Alternatives5309); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2393:6: ( ( 'bool' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2393:6: ( ( 'bool' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2394:1: ( 'bool' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2395:1: ( 'bool' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2395:3: 'bool'
                    {
                    match(input,41,FOLLOW_41_in_rule__ScalarType__Alternatives5330); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2400:6: ( ( 'string' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2400:6: ( ( 'string' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2401:1: ( 'string' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2402:1: ( 'string' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2402:3: 'string'
                    {
                    match(input,42,FOLLOW_42_in_rule__ScalarType__Alternatives5351); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2407:6: ( ( 'bytes' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2407:6: ( ( 'bytes' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2408:1: ( 'bytes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getBytesEnumLiteralDeclaration_14()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2409:1: ( 'bytes' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2409:3: 'bytes'
                    {
                    match(input,43,FOLLOW_43_in_rule__ScalarType__Alternatives5372); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2421:1: rule__Proto__Group__0 : rule__Proto__Group__0__Impl rule__Proto__Group__1 ;
    public final void rule__Proto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2425:1: ( rule__Proto__Group__0__Impl rule__Proto__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2426:2: rule__Proto__Group__0__Impl rule__Proto__Group__1
            {
            pushFollow(FOLLOW_rule__Proto__Group__0__Impl_in_rule__Proto__Group__05405);
            rule__Proto__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Proto__Group__1_in_rule__Proto__Group__05408);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2433:1: rule__Proto__Group__0__Impl : ( ( rule__Proto__SyntaxAssignment_0 )? ) ;
    public final void rule__Proto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2437:1: ( ( ( rule__Proto__SyntaxAssignment_0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2438:1: ( ( rule__Proto__SyntaxAssignment_0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2438:1: ( ( rule__Proto__SyntaxAssignment_0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2439:1: ( rule__Proto__SyntaxAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getSyntaxAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2440:1: ( rule__Proto__SyntaxAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2440:2: rule__Proto__SyntaxAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Proto__SyntaxAssignment_0_in_rule__Proto__Group__0__Impl5435);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2450:1: rule__Proto__Group__1 : rule__Proto__Group__1__Impl ;
    public final void rule__Proto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2454:1: ( rule__Proto__Group__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2455:2: rule__Proto__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Proto__Group__1__Impl_in_rule__Proto__Group__15466);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2461:1: rule__Proto__Group__1__Impl : ( ( rule__Proto__StatementsAssignment_1 )* ) ;
    public final void rule__Proto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2465:1: ( ( ( rule__Proto__StatementsAssignment_1 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2466:1: ( ( rule__Proto__StatementsAssignment_1 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2466:1: ( ( rule__Proto__StatementsAssignment_1 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2467:1: ( rule__Proto__StatementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getStatementsAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2468:1: ( rule__Proto__StatementsAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==14||(LA22_0>=16 && LA22_0<=23)||LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2468:2: rule__Proto__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Proto__StatementsAssignment_1_in_rule__Proto__Group__1__Impl5493);
            	    rule__Proto__StatementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2482:1: rule__Syntax__Group__0 : rule__Syntax__Group__0__Impl rule__Syntax__Group__1 ;
    public final void rule__Syntax__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2486:1: ( rule__Syntax__Group__0__Impl rule__Syntax__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2487:2: rule__Syntax__Group__0__Impl rule__Syntax__Group__1
            {
            pushFollow(FOLLOW_rule__Syntax__Group__0__Impl_in_rule__Syntax__Group__05528);
            rule__Syntax__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Syntax__Group__1_in_rule__Syntax__Group__05531);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2494:1: rule__Syntax__Group__0__Impl : ( 'syntax' ) ;
    public final void rule__Syntax__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2498:1: ( ( 'syntax' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2499:1: ( 'syntax' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2499:1: ( 'syntax' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2500:1: 'syntax'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getSyntaxKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Syntax__Group__0__Impl5559); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2513:1: rule__Syntax__Group__1 : rule__Syntax__Group__1__Impl rule__Syntax__Group__2 ;
    public final void rule__Syntax__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2517:1: ( rule__Syntax__Group__1__Impl rule__Syntax__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2518:2: rule__Syntax__Group__1__Impl rule__Syntax__Group__2
            {
            pushFollow(FOLLOW_rule__Syntax__Group__1__Impl_in_rule__Syntax__Group__15590);
            rule__Syntax__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Syntax__Group__2_in_rule__Syntax__Group__15593);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2525:1: rule__Syntax__Group__1__Impl : ( '=' ) ;
    public final void rule__Syntax__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2529:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2530:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2530:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2531:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getEqualsSignKeyword_1()); 
            }
            match(input,51,FOLLOW_51_in_rule__Syntax__Group__1__Impl5621); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2544:1: rule__Syntax__Group__2 : rule__Syntax__Group__2__Impl rule__Syntax__Group__3 ;
    public final void rule__Syntax__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2548:1: ( rule__Syntax__Group__2__Impl rule__Syntax__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2549:2: rule__Syntax__Group__2__Impl rule__Syntax__Group__3
            {
            pushFollow(FOLLOW_rule__Syntax__Group__2__Impl_in_rule__Syntax__Group__25652);
            rule__Syntax__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Syntax__Group__3_in_rule__Syntax__Group__25655);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2556:1: rule__Syntax__Group__2__Impl : ( ( rule__Syntax__NameAssignment_2 ) ) ;
    public final void rule__Syntax__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2560:1: ( ( ( rule__Syntax__NameAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2561:1: ( ( rule__Syntax__NameAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2561:1: ( ( rule__Syntax__NameAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2562:1: ( rule__Syntax__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getNameAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2563:1: ( rule__Syntax__NameAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2563:2: rule__Syntax__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Syntax__NameAssignment_2_in_rule__Syntax__Group__2__Impl5682);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2573:1: rule__Syntax__Group__3 : rule__Syntax__Group__3__Impl ;
    public final void rule__Syntax__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2577:1: ( rule__Syntax__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2578:2: rule__Syntax__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Syntax__Group__3__Impl_in_rule__Syntax__Group__35712);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2584:1: rule__Syntax__Group__3__Impl : ( ';' ) ;
    public final void rule__Syntax__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2588:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2589:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2589:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2590:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getSemicolonKeyword_3()); 
            }
            match(input,52,FOLLOW_52_in_rule__Syntax__Group__3__Impl5740); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2611:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2615:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2616:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__05779);
            rule__Package__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__05782);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2623:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2627:1: ( ( 'package' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2628:1: ( 'package' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2628:1: ( 'package' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2629:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Package__Group__0__Impl5810); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2642:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2646:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2647:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__15841);
            rule__Package__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__15844);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2654:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2658:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2659:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2659:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2660:1: ( rule__Package__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2661:1: ( rule__Package__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2661:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl5871);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2671:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2675:1: ( rule__Package__Group__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2676:2: rule__Package__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__25901);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2682:1: rule__Package__Group__2__Impl : ( ';' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2686:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2687:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2687:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2688:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getSemicolonKeyword_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__Package__Group__2__Impl5929); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2707:1: rule__PublicImport__Group__0 : rule__PublicImport__Group__0__Impl rule__PublicImport__Group__1 ;
    public final void rule__PublicImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2711:1: ( rule__PublicImport__Group__0__Impl rule__PublicImport__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2712:2: rule__PublicImport__Group__0__Impl rule__PublicImport__Group__1
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__0__Impl_in_rule__PublicImport__Group__05966);
            rule__PublicImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PublicImport__Group__1_in_rule__PublicImport__Group__05969);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2719:1: rule__PublicImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__PublicImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2723:1: ( ( 'import' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2724:1: ( 'import' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2724:1: ( 'import' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2725:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getImportKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__PublicImport__Group__0__Impl5997); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2738:1: rule__PublicImport__Group__1 : rule__PublicImport__Group__1__Impl rule__PublicImport__Group__2 ;
    public final void rule__PublicImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2742:1: ( rule__PublicImport__Group__1__Impl rule__PublicImport__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2743:2: rule__PublicImport__Group__1__Impl rule__PublicImport__Group__2
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__1__Impl_in_rule__PublicImport__Group__16028);
            rule__PublicImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PublicImport__Group__2_in_rule__PublicImport__Group__16031);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2750:1: rule__PublicImport__Group__1__Impl : ( 'public' ) ;
    public final void rule__PublicImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2754:1: ( ( 'public' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2755:1: ( 'public' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2755:1: ( 'public' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2756:1: 'public'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getPublicKeyword_1()); 
            }
            match(input,53,FOLLOW_53_in_rule__PublicImport__Group__1__Impl6059); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2769:1: rule__PublicImport__Group__2 : rule__PublicImport__Group__2__Impl rule__PublicImport__Group__3 ;
    public final void rule__PublicImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2773:1: ( rule__PublicImport__Group__2__Impl rule__PublicImport__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2774:2: rule__PublicImport__Group__2__Impl rule__PublicImport__Group__3
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__2__Impl_in_rule__PublicImport__Group__26090);
            rule__PublicImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PublicImport__Group__3_in_rule__PublicImport__Group__26093);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2781:1: rule__PublicImport__Group__2__Impl : ( ( rule__PublicImport__ImportURIAssignment_2 ) ) ;
    public final void rule__PublicImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2785:1: ( ( ( rule__PublicImport__ImportURIAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2786:1: ( ( rule__PublicImport__ImportURIAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2786:1: ( ( rule__PublicImport__ImportURIAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2787:1: ( rule__PublicImport__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getImportURIAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2788:1: ( rule__PublicImport__ImportURIAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2788:2: rule__PublicImport__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__PublicImport__ImportURIAssignment_2_in_rule__PublicImport__Group__2__Impl6120);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2798:1: rule__PublicImport__Group__3 : rule__PublicImport__Group__3__Impl ;
    public final void rule__PublicImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2802:1: ( rule__PublicImport__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2803:2: rule__PublicImport__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__3__Impl_in_rule__PublicImport__Group__36150);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2809:1: rule__PublicImport__Group__3__Impl : ( ';' ) ;
    public final void rule__PublicImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2813:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2814:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2814:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2815:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getSemicolonKeyword_3()); 
            }
            match(input,52,FOLLOW_52_in_rule__PublicImport__Group__3__Impl6178); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2836:1: rule__WeakImport__Group__0 : rule__WeakImport__Group__0__Impl rule__WeakImport__Group__1 ;
    public final void rule__WeakImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2840:1: ( rule__WeakImport__Group__0__Impl rule__WeakImport__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2841:2: rule__WeakImport__Group__0__Impl rule__WeakImport__Group__1
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__0__Impl_in_rule__WeakImport__Group__06217);
            rule__WeakImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WeakImport__Group__1_in_rule__WeakImport__Group__06220);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2848:1: rule__WeakImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__WeakImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2852:1: ( ( 'import' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2853:1: ( 'import' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2853:1: ( 'import' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2854:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getImportKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__WeakImport__Group__0__Impl6248); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2867:1: rule__WeakImport__Group__1 : rule__WeakImport__Group__1__Impl rule__WeakImport__Group__2 ;
    public final void rule__WeakImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2871:1: ( rule__WeakImport__Group__1__Impl rule__WeakImport__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2872:2: rule__WeakImport__Group__1__Impl rule__WeakImport__Group__2
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__1__Impl_in_rule__WeakImport__Group__16279);
            rule__WeakImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WeakImport__Group__2_in_rule__WeakImport__Group__16282);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2879:1: rule__WeakImport__Group__1__Impl : ( ( 'weak' )? ) ;
    public final void rule__WeakImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2883:1: ( ( ( 'weak' )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2884:1: ( ( 'weak' )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2884:1: ( ( 'weak' )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2885:1: ( 'weak' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getWeakKeyword_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2886:1: ( 'weak' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2887:2: 'weak'
                    {
                    match(input,47,FOLLOW_47_in_rule__WeakImport__Group__1__Impl6311); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2898:1: rule__WeakImport__Group__2 : rule__WeakImport__Group__2__Impl rule__WeakImport__Group__3 ;
    public final void rule__WeakImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2902:1: ( rule__WeakImport__Group__2__Impl rule__WeakImport__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2903:2: rule__WeakImport__Group__2__Impl rule__WeakImport__Group__3
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__2__Impl_in_rule__WeakImport__Group__26344);
            rule__WeakImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WeakImport__Group__3_in_rule__WeakImport__Group__26347);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2910:1: rule__WeakImport__Group__2__Impl : ( ( rule__WeakImport__ImportURIAssignment_2 ) ) ;
    public final void rule__WeakImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2914:1: ( ( ( rule__WeakImport__ImportURIAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2915:1: ( ( rule__WeakImport__ImportURIAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2915:1: ( ( rule__WeakImport__ImportURIAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2916:1: ( rule__WeakImport__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getImportURIAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2917:1: ( rule__WeakImport__ImportURIAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2917:2: rule__WeakImport__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__WeakImport__ImportURIAssignment_2_in_rule__WeakImport__Group__2__Impl6374);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2927:1: rule__WeakImport__Group__3 : rule__WeakImport__Group__3__Impl ;
    public final void rule__WeakImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2931:1: ( rule__WeakImport__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2932:2: rule__WeakImport__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__3__Impl_in_rule__WeakImport__Group__36404);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2938:1: rule__WeakImport__Group__3__Impl : ( ';' ) ;
    public final void rule__WeakImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2942:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2943:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2943:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2944:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getSemicolonKeyword_3()); 
            }
            match(input,52,FOLLOW_52_in_rule__WeakImport__Group__3__Impl6432); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2965:1: rule__NativeOption__Group__0 : rule__NativeOption__Group__0__Impl rule__NativeOption__Group__1 ;
    public final void rule__NativeOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2969:1: ( rule__NativeOption__Group__0__Impl rule__NativeOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2970:2: rule__NativeOption__Group__0__Impl rule__NativeOption__Group__1
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__0__Impl_in_rule__NativeOption__Group__06471);
            rule__NativeOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeOption__Group__1_in_rule__NativeOption__Group__06474);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2977:1: rule__NativeOption__Group__0__Impl : ( 'option' ) ;
    public final void rule__NativeOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2981:1: ( ( 'option' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2982:1: ( 'option' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2982:1: ( 'option' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2983:1: 'option'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getOptionKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__NativeOption__Group__0__Impl6502); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2996:1: rule__NativeOption__Group__1 : rule__NativeOption__Group__1__Impl rule__NativeOption__Group__2 ;
    public final void rule__NativeOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3000:1: ( rule__NativeOption__Group__1__Impl rule__NativeOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3001:2: rule__NativeOption__Group__1__Impl rule__NativeOption__Group__2
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__1__Impl_in_rule__NativeOption__Group__16533);
            rule__NativeOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeOption__Group__2_in_rule__NativeOption__Group__16536);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3008:1: rule__NativeOption__Group__1__Impl : ( ( rule__NativeOption__SourceAssignment_1 ) ) ;
    public final void rule__NativeOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3012:1: ( ( ( rule__NativeOption__SourceAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3013:1: ( ( rule__NativeOption__SourceAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3013:1: ( ( rule__NativeOption__SourceAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3014:1: ( rule__NativeOption__SourceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getSourceAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3015:1: ( rule__NativeOption__SourceAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3015:2: rule__NativeOption__SourceAssignment_1
            {
            pushFollow(FOLLOW_rule__NativeOption__SourceAssignment_1_in_rule__NativeOption__Group__1__Impl6563);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3025:1: rule__NativeOption__Group__2 : rule__NativeOption__Group__2__Impl rule__NativeOption__Group__3 ;
    public final void rule__NativeOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3029:1: ( rule__NativeOption__Group__2__Impl rule__NativeOption__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3030:2: rule__NativeOption__Group__2__Impl rule__NativeOption__Group__3
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__2__Impl_in_rule__NativeOption__Group__26593);
            rule__NativeOption__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeOption__Group__3_in_rule__NativeOption__Group__26596);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3037:1: rule__NativeOption__Group__2__Impl : ( '=' ) ;
    public final void rule__NativeOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3041:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3042:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3042:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3043:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getEqualsSignKeyword_2()); 
            }
            match(input,51,FOLLOW_51_in_rule__NativeOption__Group__2__Impl6624); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3056:1: rule__NativeOption__Group__3 : rule__NativeOption__Group__3__Impl rule__NativeOption__Group__4 ;
    public final void rule__NativeOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3060:1: ( rule__NativeOption__Group__3__Impl rule__NativeOption__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3061:2: rule__NativeOption__Group__3__Impl rule__NativeOption__Group__4
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__3__Impl_in_rule__NativeOption__Group__36655);
            rule__NativeOption__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeOption__Group__4_in_rule__NativeOption__Group__36658);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3068:1: rule__NativeOption__Group__3__Impl : ( ( rule__NativeOption__ValueAssignment_3 ) ) ;
    public final void rule__NativeOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3072:1: ( ( ( rule__NativeOption__ValueAssignment_3 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3073:1: ( ( rule__NativeOption__ValueAssignment_3 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3073:1: ( ( rule__NativeOption__ValueAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3074:1: ( rule__NativeOption__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getValueAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3075:1: ( rule__NativeOption__ValueAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3075:2: rule__NativeOption__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__NativeOption__ValueAssignment_3_in_rule__NativeOption__Group__3__Impl6685);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3085:1: rule__NativeOption__Group__4 : rule__NativeOption__Group__4__Impl ;
    public final void rule__NativeOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3089:1: ( rule__NativeOption__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3090:2: rule__NativeOption__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__4__Impl_in_rule__NativeOption__Group__46715);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3096:1: rule__NativeOption__Group__4__Impl : ( ';' ) ;
    public final void rule__NativeOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3100:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3101:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3101:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3102:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getSemicolonKeyword_4()); 
            }
            match(input,52,FOLLOW_52_in_rule__NativeOption__Group__4__Impl6743); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3125:1: rule__CustomOption__Group__0 : rule__CustomOption__Group__0__Impl rule__CustomOption__Group__1 ;
    public final void rule__CustomOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3129:1: ( rule__CustomOption__Group__0__Impl rule__CustomOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3130:2: rule__CustomOption__Group__0__Impl rule__CustomOption__Group__1
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__0__Impl_in_rule__CustomOption__Group__06784);
            rule__CustomOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomOption__Group__1_in_rule__CustomOption__Group__06787);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3137:1: rule__CustomOption__Group__0__Impl : ( 'option' ) ;
    public final void rule__CustomOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3141:1: ( ( 'option' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3142:1: ( 'option' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3142:1: ( 'option' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3143:1: 'option'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getOptionKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__CustomOption__Group__0__Impl6815); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3156:1: rule__CustomOption__Group__1 : rule__CustomOption__Group__1__Impl rule__CustomOption__Group__2 ;
    public final void rule__CustomOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3160:1: ( rule__CustomOption__Group__1__Impl rule__CustomOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3161:2: rule__CustomOption__Group__1__Impl rule__CustomOption__Group__2
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__1__Impl_in_rule__CustomOption__Group__16846);
            rule__CustomOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomOption__Group__2_in_rule__CustomOption__Group__16849);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3168:1: rule__CustomOption__Group__1__Impl : ( ( rule__CustomOption__SourceAssignment_1 ) ) ;
    public final void rule__CustomOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3172:1: ( ( ( rule__CustomOption__SourceAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3173:1: ( ( rule__CustomOption__SourceAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3173:1: ( ( rule__CustomOption__SourceAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3174:1: ( rule__CustomOption__SourceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getSourceAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3175:1: ( rule__CustomOption__SourceAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3175:2: rule__CustomOption__SourceAssignment_1
            {
            pushFollow(FOLLOW_rule__CustomOption__SourceAssignment_1_in_rule__CustomOption__Group__1__Impl6876);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3185:1: rule__CustomOption__Group__2 : rule__CustomOption__Group__2__Impl rule__CustomOption__Group__3 ;
    public final void rule__CustomOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3189:1: ( rule__CustomOption__Group__2__Impl rule__CustomOption__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3190:2: rule__CustomOption__Group__2__Impl rule__CustomOption__Group__3
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__2__Impl_in_rule__CustomOption__Group__26906);
            rule__CustomOption__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomOption__Group__3_in_rule__CustomOption__Group__26909);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3197:1: rule__CustomOption__Group__2__Impl : ( '=' ) ;
    public final void rule__CustomOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3201:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3202:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3202:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3203:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getEqualsSignKeyword_2()); 
            }
            match(input,51,FOLLOW_51_in_rule__CustomOption__Group__2__Impl6937); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3216:1: rule__CustomOption__Group__3 : rule__CustomOption__Group__3__Impl rule__CustomOption__Group__4 ;
    public final void rule__CustomOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3220:1: ( rule__CustomOption__Group__3__Impl rule__CustomOption__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3221:2: rule__CustomOption__Group__3__Impl rule__CustomOption__Group__4
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__3__Impl_in_rule__CustomOption__Group__36968);
            rule__CustomOption__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomOption__Group__4_in_rule__CustomOption__Group__36971);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3228:1: rule__CustomOption__Group__3__Impl : ( ( rule__CustomOption__ValueAssignment_3 ) ) ;
    public final void rule__CustomOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3232:1: ( ( ( rule__CustomOption__ValueAssignment_3 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3233:1: ( ( rule__CustomOption__ValueAssignment_3 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3233:1: ( ( rule__CustomOption__ValueAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3234:1: ( rule__CustomOption__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getValueAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3235:1: ( rule__CustomOption__ValueAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3235:2: rule__CustomOption__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__CustomOption__ValueAssignment_3_in_rule__CustomOption__Group__3__Impl6998);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3245:1: rule__CustomOption__Group__4 : rule__CustomOption__Group__4__Impl ;
    public final void rule__CustomOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3249:1: ( rule__CustomOption__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3250:2: rule__CustomOption__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__4__Impl_in_rule__CustomOption__Group__47028);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3256:1: rule__CustomOption__Group__4__Impl : ( ';' ) ;
    public final void rule__CustomOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3260:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3261:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3261:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3262:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getSemicolonKeyword_4()); 
            }
            match(input,52,FOLLOW_52_in_rule__CustomOption__Group__4__Impl7056); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3285:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3289:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3290:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__07097);
            rule__Message__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__07100);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3297:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3301:1: ( ( 'message' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3302:1: ( 'message' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3302:1: ( 'message' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3303:1: 'message'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMessageKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Message__Group__0__Impl7128); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3316:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3320:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3321:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__17159);
            rule__Message__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__2_in_rule__Message__Group__17162);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3328:1: rule__Message__Group__1__Impl : ( ( rule__Message__NameAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3332:1: ( ( ( rule__Message__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3333:1: ( ( rule__Message__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3333:1: ( ( rule__Message__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3334:1: ( rule__Message__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3335:1: ( rule__Message__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3335:2: rule__Message__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Message__NameAssignment_1_in_rule__Message__Group__1__Impl7189);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3345:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3349:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3350:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__27219);
            rule__Message__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__3_in_rule__Message__Group__27222);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3357:1: rule__Message__Group__2__Impl : ( '{' ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3361:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3362:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3362:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3363:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__Message__Group__2__Impl7250); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3376:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3380:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3381:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__37281);
            rule__Message__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__4_in_rule__Message__Group__37284);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3388:1: rule__Message__Group__3__Impl : ( ( rule__Message__ElementsAssignment_3 )* ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3392:1: ( ( ( rule__Message__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3393:1: ( ( rule__Message__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3393:1: ( ( rule__Message__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3394:1: ( rule__Message__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3395:1: ( rule__Message__ElementsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=17 && LA24_0<=25)||LA24_0==56) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3395:2: rule__Message__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Message__ElementsAssignment_3_in_rule__Message__Group__3__Impl7311);
            	    rule__Message__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3405:1: rule__Message__Group__4 : rule__Message__Group__4__Impl ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3409:1: ( rule__Message__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3410:2: rule__Message__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__47342);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3416:1: rule__Message__Group__4__Impl : ( '}' ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3420:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3421:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3421:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3422:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,55,FOLLOW_55_in_rule__Message__Group__4__Impl7370); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3445:1: rule__Oneof__Group__0 : rule__Oneof__Group__0__Impl rule__Oneof__Group__1 ;
    public final void rule__Oneof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3449:1: ( rule__Oneof__Group__0__Impl rule__Oneof__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3450:2: rule__Oneof__Group__0__Impl rule__Oneof__Group__1
            {
            pushFollow(FOLLOW_rule__Oneof__Group__0__Impl_in_rule__Oneof__Group__07411);
            rule__Oneof__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Oneof__Group__1_in_rule__Oneof__Group__07414);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3457:1: rule__Oneof__Group__0__Impl : ( 'oneof' ) ;
    public final void rule__Oneof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3461:1: ( ( 'oneof' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3462:1: ( 'oneof' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3462:1: ( 'oneof' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3463:1: 'oneof'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getOneofKeyword_0()); 
            }
            match(input,56,FOLLOW_56_in_rule__Oneof__Group__0__Impl7442); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3476:1: rule__Oneof__Group__1 : rule__Oneof__Group__1__Impl rule__Oneof__Group__2 ;
    public final void rule__Oneof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3480:1: ( rule__Oneof__Group__1__Impl rule__Oneof__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3481:2: rule__Oneof__Group__1__Impl rule__Oneof__Group__2
            {
            pushFollow(FOLLOW_rule__Oneof__Group__1__Impl_in_rule__Oneof__Group__17473);
            rule__Oneof__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Oneof__Group__2_in_rule__Oneof__Group__17476);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3488:1: rule__Oneof__Group__1__Impl : ( ( rule__Oneof__NameAssignment_1 ) ) ;
    public final void rule__Oneof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3492:1: ( ( ( rule__Oneof__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3493:1: ( ( rule__Oneof__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3493:1: ( ( rule__Oneof__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3494:1: ( rule__Oneof__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3495:1: ( rule__Oneof__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3495:2: rule__Oneof__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Oneof__NameAssignment_1_in_rule__Oneof__Group__1__Impl7503);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3505:1: rule__Oneof__Group__2 : rule__Oneof__Group__2__Impl rule__Oneof__Group__3 ;
    public final void rule__Oneof__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3509:1: ( rule__Oneof__Group__2__Impl rule__Oneof__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3510:2: rule__Oneof__Group__2__Impl rule__Oneof__Group__3
            {
            pushFollow(FOLLOW_rule__Oneof__Group__2__Impl_in_rule__Oneof__Group__27533);
            rule__Oneof__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Oneof__Group__3_in_rule__Oneof__Group__27536);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3517:1: rule__Oneof__Group__2__Impl : ( '{' ) ;
    public final void rule__Oneof__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3521:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3522:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3522:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3523:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__Oneof__Group__2__Impl7564); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3536:1: rule__Oneof__Group__3 : rule__Oneof__Group__3__Impl rule__Oneof__Group__4 ;
    public final void rule__Oneof__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3540:1: ( rule__Oneof__Group__3__Impl rule__Oneof__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3541:2: rule__Oneof__Group__3__Impl rule__Oneof__Group__4
            {
            pushFollow(FOLLOW_rule__Oneof__Group__3__Impl_in_rule__Oneof__Group__37595);
            rule__Oneof__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Oneof__Group__4_in_rule__Oneof__Group__37598);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3548:1: rule__Oneof__Group__3__Impl : ( ( rule__Oneof__FieldsAssignment_3 )* ) ;
    public final void rule__Oneof__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3552:1: ( ( ( rule__Oneof__FieldsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3553:1: ( ( rule__Oneof__FieldsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3553:1: ( ( rule__Oneof__FieldsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3554:1: ( rule__Oneof__FieldsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getFieldsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3555:1: ( rule__Oneof__FieldsAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||(LA25_0>=13 && LA25_0<=48)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3555:2: rule__Oneof__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Oneof__FieldsAssignment_3_in_rule__Oneof__Group__3__Impl7625);
            	    rule__Oneof__FieldsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3565:1: rule__Oneof__Group__4 : rule__Oneof__Group__4__Impl ;
    public final void rule__Oneof__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3569:1: ( rule__Oneof__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3570:2: rule__Oneof__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Oneof__Group__4__Impl_in_rule__Oneof__Group__47656);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3576:1: rule__Oneof__Group__4__Impl : ( '}' ) ;
    public final void rule__Oneof__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3580:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3581:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3581:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3582:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,55,FOLLOW_55_in_rule__Oneof__Group__4__Impl7684); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3605:1: rule__OneofField__Group__0 : rule__OneofField__Group__0__Impl rule__OneofField__Group__1 ;
    public final void rule__OneofField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3609:1: ( rule__OneofField__Group__0__Impl rule__OneofField__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3610:2: rule__OneofField__Group__0__Impl rule__OneofField__Group__1
            {
            pushFollow(FOLLOW_rule__OneofField__Group__0__Impl_in_rule__OneofField__Group__07725);
            rule__OneofField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OneofField__Group__1_in_rule__OneofField__Group__07728);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3617:1: rule__OneofField__Group__0__Impl : ( ( rule__OneofField__TypeAssignment_0 ) ) ;
    public final void rule__OneofField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3621:1: ( ( ( rule__OneofField__TypeAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3622:1: ( ( rule__OneofField__TypeAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3622:1: ( ( rule__OneofField__TypeAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3623:1: ( rule__OneofField__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getTypeAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3624:1: ( rule__OneofField__TypeAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3624:2: rule__OneofField__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__OneofField__TypeAssignment_0_in_rule__OneofField__Group__0__Impl7755);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3634:1: rule__OneofField__Group__1 : rule__OneofField__Group__1__Impl rule__OneofField__Group__2 ;
    public final void rule__OneofField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3638:1: ( rule__OneofField__Group__1__Impl rule__OneofField__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3639:2: rule__OneofField__Group__1__Impl rule__OneofField__Group__2
            {
            pushFollow(FOLLOW_rule__OneofField__Group__1__Impl_in_rule__OneofField__Group__17785);
            rule__OneofField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OneofField__Group__2_in_rule__OneofField__Group__17788);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3646:1: rule__OneofField__Group__1__Impl : ( ( rule__OneofField__NameAssignment_1 ) ) ;
    public final void rule__OneofField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3650:1: ( ( ( rule__OneofField__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3651:1: ( ( rule__OneofField__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3651:1: ( ( rule__OneofField__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3652:1: ( rule__OneofField__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3653:1: ( rule__OneofField__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3653:2: rule__OneofField__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OneofField__NameAssignment_1_in_rule__OneofField__Group__1__Impl7815);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3663:1: rule__OneofField__Group__2 : rule__OneofField__Group__2__Impl rule__OneofField__Group__3 ;
    public final void rule__OneofField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3667:1: ( rule__OneofField__Group__2__Impl rule__OneofField__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3668:2: rule__OneofField__Group__2__Impl rule__OneofField__Group__3
            {
            pushFollow(FOLLOW_rule__OneofField__Group__2__Impl_in_rule__OneofField__Group__27845);
            rule__OneofField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OneofField__Group__3_in_rule__OneofField__Group__27848);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3675:1: rule__OneofField__Group__2__Impl : ( '=' ) ;
    public final void rule__OneofField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3679:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3680:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3680:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3681:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getEqualsSignKeyword_2()); 
            }
            match(input,51,FOLLOW_51_in_rule__OneofField__Group__2__Impl7876); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3694:1: rule__OneofField__Group__3 : rule__OneofField__Group__3__Impl rule__OneofField__Group__4 ;
    public final void rule__OneofField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3698:1: ( rule__OneofField__Group__3__Impl rule__OneofField__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3699:2: rule__OneofField__Group__3__Impl rule__OneofField__Group__4
            {
            pushFollow(FOLLOW_rule__OneofField__Group__3__Impl_in_rule__OneofField__Group__37907);
            rule__OneofField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OneofField__Group__4_in_rule__OneofField__Group__37910);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3706:1: rule__OneofField__Group__3__Impl : ( ( rule__OneofField__IndexAssignment_3 ) ) ;
    public final void rule__OneofField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3710:1: ( ( ( rule__OneofField__IndexAssignment_3 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3711:1: ( ( rule__OneofField__IndexAssignment_3 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3711:1: ( ( rule__OneofField__IndexAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3712:1: ( rule__OneofField__IndexAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getIndexAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3713:1: ( rule__OneofField__IndexAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3713:2: rule__OneofField__IndexAssignment_3
            {
            pushFollow(FOLLOW_rule__OneofField__IndexAssignment_3_in_rule__OneofField__Group__3__Impl7937);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3723:1: rule__OneofField__Group__4 : rule__OneofField__Group__4__Impl rule__OneofField__Group__5 ;
    public final void rule__OneofField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3727:1: ( rule__OneofField__Group__4__Impl rule__OneofField__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3728:2: rule__OneofField__Group__4__Impl rule__OneofField__Group__5
            {
            pushFollow(FOLLOW_rule__OneofField__Group__4__Impl_in_rule__OneofField__Group__47967);
            rule__OneofField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OneofField__Group__5_in_rule__OneofField__Group__47970);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3735:1: rule__OneofField__Group__4__Impl : ( ( rule__OneofField__OptionsAssignment_4 )? ) ;
    public final void rule__OneofField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3739:1: ( ( ( rule__OneofField__OptionsAssignment_4 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3740:1: ( ( rule__OneofField__OptionsAssignment_4 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3740:1: ( ( rule__OneofField__OptionsAssignment_4 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3741:1: ( rule__OneofField__OptionsAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getOptionsAssignment_4()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3742:1: ( rule__OneofField__OptionsAssignment_4 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==58) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3742:2: rule__OneofField__OptionsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__OneofField__OptionsAssignment_4_in_rule__OneofField__Group__4__Impl7997);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3752:1: rule__OneofField__Group__5 : rule__OneofField__Group__5__Impl ;
    public final void rule__OneofField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3756:1: ( rule__OneofField__Group__5__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3757:2: rule__OneofField__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__OneofField__Group__5__Impl_in_rule__OneofField__Group__58028);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3763:1: rule__OneofField__Group__5__Impl : ( ';' ) ;
    public final void rule__OneofField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3767:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3768:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3768:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3769:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getSemicolonKeyword_5()); 
            }
            match(input,52,FOLLOW_52_in_rule__OneofField__Group__5__Impl8056); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3794:1: rule__ExtensionRange__Group__0 : rule__ExtensionRange__Group__0__Impl rule__ExtensionRange__Group__1 ;
    public final void rule__ExtensionRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3798:1: ( rule__ExtensionRange__Group__0__Impl rule__ExtensionRange__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3799:2: rule__ExtensionRange__Group__0__Impl rule__ExtensionRange__Group__1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__0__Impl_in_rule__ExtensionRange__Group__08099);
            rule__ExtensionRange__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group__1_in_rule__ExtensionRange__Group__08102);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3806:1: rule__ExtensionRange__Group__0__Impl : ( 'extensions' ) ;
    public final void rule__ExtensionRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3810:1: ( ( 'extensions' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3811:1: ( 'extensions' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3811:1: ( 'extensions' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3812:1: 'extensions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getExtensionsKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__ExtensionRange__Group__0__Impl8130); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3825:1: rule__ExtensionRange__Group__1 : rule__ExtensionRange__Group__1__Impl rule__ExtensionRange__Group__2 ;
    public final void rule__ExtensionRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3829:1: ( rule__ExtensionRange__Group__1__Impl rule__ExtensionRange__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3830:2: rule__ExtensionRange__Group__1__Impl rule__ExtensionRange__Group__2
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__1__Impl_in_rule__ExtensionRange__Group__18161);
            rule__ExtensionRange__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group__2_in_rule__ExtensionRange__Group__18164);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3837:1: rule__ExtensionRange__Group__1__Impl : ( ( rule__ExtensionRange__RangesAssignment_1 ) ) ;
    public final void rule__ExtensionRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3841:1: ( ( ( rule__ExtensionRange__RangesAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3842:1: ( ( rule__ExtensionRange__RangesAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3842:1: ( ( rule__ExtensionRange__RangesAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3843:1: ( rule__ExtensionRange__RangesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getRangesAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3844:1: ( rule__ExtensionRange__RangesAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3844:2: rule__ExtensionRange__RangesAssignment_1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__RangesAssignment_1_in_rule__ExtensionRange__Group__1__Impl8191);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3854:1: rule__ExtensionRange__Group__2 : rule__ExtensionRange__Group__2__Impl rule__ExtensionRange__Group__3 ;
    public final void rule__ExtensionRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3858:1: ( rule__ExtensionRange__Group__2__Impl rule__ExtensionRange__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3859:2: rule__ExtensionRange__Group__2__Impl rule__ExtensionRange__Group__3
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__2__Impl_in_rule__ExtensionRange__Group__28221);
            rule__ExtensionRange__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group__3_in_rule__ExtensionRange__Group__28224);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3866:1: rule__ExtensionRange__Group__2__Impl : ( ( rule__ExtensionRange__Group_2__0 )* ) ;
    public final void rule__ExtensionRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3870:1: ( ( ( rule__ExtensionRange__Group_2__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3871:1: ( ( rule__ExtensionRange__Group_2__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3871:1: ( ( rule__ExtensionRange__Group_2__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3872:1: ( rule__ExtensionRange__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getGroup_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3873:1: ( rule__ExtensionRange__Group_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==57) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3873:2: rule__ExtensionRange__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ExtensionRange__Group_2__0_in_rule__ExtensionRange__Group__2__Impl8251);
            	    rule__ExtensionRange__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3883:1: rule__ExtensionRange__Group__3 : rule__ExtensionRange__Group__3__Impl ;
    public final void rule__ExtensionRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3887:1: ( rule__ExtensionRange__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3888:2: rule__ExtensionRange__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__3__Impl_in_rule__ExtensionRange__Group__38282);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3894:1: rule__ExtensionRange__Group__3__Impl : ( ';' ) ;
    public final void rule__ExtensionRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3898:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3899:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3899:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3900:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getSemicolonKeyword_3()); 
            }
            match(input,52,FOLLOW_52_in_rule__ExtensionRange__Group__3__Impl8310); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3921:1: rule__ExtensionRange__Group_2__0 : rule__ExtensionRange__Group_2__0__Impl rule__ExtensionRange__Group_2__1 ;
    public final void rule__ExtensionRange__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3925:1: ( rule__ExtensionRange__Group_2__0__Impl rule__ExtensionRange__Group_2__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3926:2: rule__ExtensionRange__Group_2__0__Impl rule__ExtensionRange__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group_2__0__Impl_in_rule__ExtensionRange__Group_2__08349);
            rule__ExtensionRange__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group_2__1_in_rule__ExtensionRange__Group_2__08352);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3933:1: rule__ExtensionRange__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ExtensionRange__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3937:1: ( ( ',' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3938:1: ( ',' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3938:1: ( ',' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3939:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getCommaKeyword_2_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__ExtensionRange__Group_2__0__Impl8380); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3952:1: rule__ExtensionRange__Group_2__1 : rule__ExtensionRange__Group_2__1__Impl ;
    public final void rule__ExtensionRange__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3956:1: ( rule__ExtensionRange__Group_2__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3957:2: rule__ExtensionRange__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group_2__1__Impl_in_rule__ExtensionRange__Group_2__18411);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3963:1: rule__ExtensionRange__Group_2__1__Impl : ( ( rule__ExtensionRange__RangesAssignment_2_1 ) ) ;
    public final void rule__ExtensionRange__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3967:1: ( ( ( rule__ExtensionRange__RangesAssignment_2_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3968:1: ( ( rule__ExtensionRange__RangesAssignment_2_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3968:1: ( ( rule__ExtensionRange__RangesAssignment_2_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3969:1: ( rule__ExtensionRange__RangesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getRangesAssignment_2_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3970:1: ( rule__ExtensionRange__RangesAssignment_2_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3970:2: rule__ExtensionRange__RangesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__RangesAssignment_2_1_in_rule__ExtensionRange__Group_2__1__Impl8438);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3984:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3988:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3989:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__08472);
            rule__Range__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Range__Group__1_in_rule__Range__Group__08475);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3996:1: rule__Range__Group__0__Impl : ( ( rule__Range__FromAssignment_0 ) ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4000:1: ( ( ( rule__Range__FromAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4001:1: ( ( rule__Range__FromAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4001:1: ( ( rule__Range__FromAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4002:1: ( rule__Range__FromAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getFromAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4003:1: ( rule__Range__FromAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4003:2: rule__Range__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Range__FromAssignment_0_in_rule__Range__Group__0__Impl8502);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4013:1: rule__Range__Group__1 : rule__Range__Group__1__Impl ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4017:1: ( rule__Range__Group__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4018:2: rule__Range__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__18532);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4024:1: rule__Range__Group__1__Impl : ( ( rule__Range__Group_1__0 )? ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4028:1: ( ( ( rule__Range__Group_1__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4029:1: ( ( rule__Range__Group_1__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4029:1: ( ( rule__Range__Group_1__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4030:1: ( rule__Range__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getGroup_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4031:1: ( rule__Range__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4031:2: rule__Range__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Range__Group_1__0_in_rule__Range__Group__1__Impl8559);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4045:1: rule__Range__Group_1__0 : rule__Range__Group_1__0__Impl rule__Range__Group_1__1 ;
    public final void rule__Range__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4049:1: ( rule__Range__Group_1__0__Impl rule__Range__Group_1__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4050:2: rule__Range__Group_1__0__Impl rule__Range__Group_1__1
            {
            pushFollow(FOLLOW_rule__Range__Group_1__0__Impl_in_rule__Range__Group_1__08594);
            rule__Range__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Range__Group_1__1_in_rule__Range__Group_1__08597);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4057:1: rule__Range__Group_1__0__Impl : ( 'to' ) ;
    public final void rule__Range__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4061:1: ( ( 'to' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4062:1: ( 'to' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4062:1: ( 'to' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4063:1: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getToKeyword_1_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__Range__Group_1__0__Impl8625); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4076:1: rule__Range__Group_1__1 : rule__Range__Group_1__1__Impl ;
    public final void rule__Range__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4080:1: ( rule__Range__Group_1__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4081:2: rule__Range__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Range__Group_1__1__Impl_in_rule__Range__Group_1__18656);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4087:1: rule__Range__Group_1__1__Impl : ( ( rule__Range__Alternatives_1_1 ) ) ;
    public final void rule__Range__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4091:1: ( ( ( rule__Range__Alternatives_1_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4092:1: ( ( rule__Range__Alternatives_1_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4092:1: ( ( rule__Range__Alternatives_1_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4093:1: ( rule__Range__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getAlternatives_1_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4094:1: ( rule__Range__Alternatives_1_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4094:2: rule__Range__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__Range__Alternatives_1_1_in_rule__Range__Group_1__1__Impl8683);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4108:1: rule__MessageField__Group__0 : rule__MessageField__Group__0__Impl rule__MessageField__Group__1 ;
    public final void rule__MessageField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4112:1: ( rule__MessageField__Group__0__Impl rule__MessageField__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4113:2: rule__MessageField__Group__0__Impl rule__MessageField__Group__1
            {
            pushFollow(FOLLOW_rule__MessageField__Group__0__Impl_in_rule__MessageField__Group__08717);
            rule__MessageField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__1_in_rule__MessageField__Group__08720);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4120:1: rule__MessageField__Group__0__Impl : ( ( rule__MessageField__ModifierAssignment_0 ) ) ;
    public final void rule__MessageField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4124:1: ( ( ( rule__MessageField__ModifierAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4125:1: ( ( rule__MessageField__ModifierAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4125:1: ( ( rule__MessageField__ModifierAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4126:1: ( rule__MessageField__ModifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getModifierAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4127:1: ( rule__MessageField__ModifierAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4127:2: rule__MessageField__ModifierAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageField__ModifierAssignment_0_in_rule__MessageField__Group__0__Impl8747);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4137:1: rule__MessageField__Group__1 : rule__MessageField__Group__1__Impl rule__MessageField__Group__2 ;
    public final void rule__MessageField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4141:1: ( rule__MessageField__Group__1__Impl rule__MessageField__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4142:2: rule__MessageField__Group__1__Impl rule__MessageField__Group__2
            {
            pushFollow(FOLLOW_rule__MessageField__Group__1__Impl_in_rule__MessageField__Group__18777);
            rule__MessageField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__2_in_rule__MessageField__Group__18780);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4149:1: rule__MessageField__Group__1__Impl : ( ( rule__MessageField__TypeAssignment_1 ) ) ;
    public final void rule__MessageField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4153:1: ( ( ( rule__MessageField__TypeAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4154:1: ( ( rule__MessageField__TypeAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4154:1: ( ( rule__MessageField__TypeAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4155:1: ( rule__MessageField__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getTypeAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4156:1: ( rule__MessageField__TypeAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4156:2: rule__MessageField__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MessageField__TypeAssignment_1_in_rule__MessageField__Group__1__Impl8807);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4166:1: rule__MessageField__Group__2 : rule__MessageField__Group__2__Impl rule__MessageField__Group__3 ;
    public final void rule__MessageField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4170:1: ( rule__MessageField__Group__2__Impl rule__MessageField__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4171:2: rule__MessageField__Group__2__Impl rule__MessageField__Group__3
            {
            pushFollow(FOLLOW_rule__MessageField__Group__2__Impl_in_rule__MessageField__Group__28837);
            rule__MessageField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__3_in_rule__MessageField__Group__28840);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4178:1: rule__MessageField__Group__2__Impl : ( ( rule__MessageField__NameAssignment_2 ) ) ;
    public final void rule__MessageField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4182:1: ( ( ( rule__MessageField__NameAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4183:1: ( ( rule__MessageField__NameAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4183:1: ( ( rule__MessageField__NameAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4184:1: ( rule__MessageField__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getNameAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4185:1: ( rule__MessageField__NameAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4185:2: rule__MessageField__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MessageField__NameAssignment_2_in_rule__MessageField__Group__2__Impl8867);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4195:1: rule__MessageField__Group__3 : rule__MessageField__Group__3__Impl rule__MessageField__Group__4 ;
    public final void rule__MessageField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4199:1: ( rule__MessageField__Group__3__Impl rule__MessageField__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4200:2: rule__MessageField__Group__3__Impl rule__MessageField__Group__4
            {
            pushFollow(FOLLOW_rule__MessageField__Group__3__Impl_in_rule__MessageField__Group__38897);
            rule__MessageField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__4_in_rule__MessageField__Group__38900);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4207:1: rule__MessageField__Group__3__Impl : ( '=' ) ;
    public final void rule__MessageField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4211:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4212:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4212:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4213:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getEqualsSignKeyword_3()); 
            }
            match(input,51,FOLLOW_51_in_rule__MessageField__Group__3__Impl8928); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4226:1: rule__MessageField__Group__4 : rule__MessageField__Group__4__Impl rule__MessageField__Group__5 ;
    public final void rule__MessageField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4230:1: ( rule__MessageField__Group__4__Impl rule__MessageField__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4231:2: rule__MessageField__Group__4__Impl rule__MessageField__Group__5
            {
            pushFollow(FOLLOW_rule__MessageField__Group__4__Impl_in_rule__MessageField__Group__48959);
            rule__MessageField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__5_in_rule__MessageField__Group__48962);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4238:1: rule__MessageField__Group__4__Impl : ( ( rule__MessageField__IndexAssignment_4 ) ) ;
    public final void rule__MessageField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4242:1: ( ( ( rule__MessageField__IndexAssignment_4 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4243:1: ( ( rule__MessageField__IndexAssignment_4 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4243:1: ( ( rule__MessageField__IndexAssignment_4 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4244:1: ( rule__MessageField__IndexAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getIndexAssignment_4()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4245:1: ( rule__MessageField__IndexAssignment_4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4245:2: rule__MessageField__IndexAssignment_4
            {
            pushFollow(FOLLOW_rule__MessageField__IndexAssignment_4_in_rule__MessageField__Group__4__Impl8989);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4255:1: rule__MessageField__Group__5 : rule__MessageField__Group__5__Impl rule__MessageField__Group__6 ;
    public final void rule__MessageField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4259:1: ( rule__MessageField__Group__5__Impl rule__MessageField__Group__6 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4260:2: rule__MessageField__Group__5__Impl rule__MessageField__Group__6
            {
            pushFollow(FOLLOW_rule__MessageField__Group__5__Impl_in_rule__MessageField__Group__59019);
            rule__MessageField__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__6_in_rule__MessageField__Group__59022);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4267:1: rule__MessageField__Group__5__Impl : ( ( rule__MessageField__OptionsAssignment_5 )? ) ;
    public final void rule__MessageField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4271:1: ( ( ( rule__MessageField__OptionsAssignment_5 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4272:1: ( ( rule__MessageField__OptionsAssignment_5 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4272:1: ( ( rule__MessageField__OptionsAssignment_5 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4273:1: ( rule__MessageField__OptionsAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getOptionsAssignment_5()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4274:1: ( rule__MessageField__OptionsAssignment_5 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==58) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4274:2: rule__MessageField__OptionsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__MessageField__OptionsAssignment_5_in_rule__MessageField__Group__5__Impl9049);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4284:1: rule__MessageField__Group__6 : rule__MessageField__Group__6__Impl ;
    public final void rule__MessageField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4288:1: ( rule__MessageField__Group__6__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4289:2: rule__MessageField__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MessageField__Group__6__Impl_in_rule__MessageField__Group__69080);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4295:1: rule__MessageField__Group__6__Impl : ( ';' ) ;
    public final void rule__MessageField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4299:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4300:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4300:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4301:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getSemicolonKeyword_6()); 
            }
            match(input,52,FOLLOW_52_in_rule__MessageField__Group__6__Impl9108); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4328:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4332:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4333:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__09153);
            rule__Group__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__1_in_rule__Group__Group__09156);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4340:1: rule__Group__Group__0__Impl : ( ( rule__Group__ModifierAssignment_0 ) ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4344:1: ( ( ( rule__Group__ModifierAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4345:1: ( ( rule__Group__ModifierAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4345:1: ( ( rule__Group__ModifierAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4346:1: ( rule__Group__ModifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getModifierAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4347:1: ( rule__Group__ModifierAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4347:2: rule__Group__ModifierAssignment_0
            {
            pushFollow(FOLLOW_rule__Group__ModifierAssignment_0_in_rule__Group__Group__0__Impl9183);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4357:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4361:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4362:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__19213);
            rule__Group__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__2_in_rule__Group__Group__19216);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4369:1: rule__Group__Group__1__Impl : ( 'group' ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4373:1: ( ( 'group' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4374:1: ( 'group' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4374:1: ( 'group' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4375:1: 'group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getGroupKeyword_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Group__Group__1__Impl9244); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4388:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4392:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4393:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__29275);
            rule__Group__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__3_in_rule__Group__Group__29278);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4400:1: rule__Group__Group__2__Impl : ( ( rule__Group__NameAssignment_2 ) ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4404:1: ( ( ( rule__Group__NameAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4405:1: ( ( rule__Group__NameAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4405:1: ( ( rule__Group__NameAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4406:1: ( rule__Group__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getNameAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4407:1: ( rule__Group__NameAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4407:2: rule__Group__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl9305);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4417:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4421:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4422:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__39335);
            rule__Group__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__4_in_rule__Group__Group__39338);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4429:1: rule__Group__Group__3__Impl : ( '=' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4433:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4434:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4434:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4435:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getEqualsSignKeyword_3()); 
            }
            match(input,51,FOLLOW_51_in_rule__Group__Group__3__Impl9366); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4448:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4452:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4453:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__49397);
            rule__Group__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__5_in_rule__Group__Group__49400);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4460:1: rule__Group__Group__4__Impl : ( ( rule__Group__IndexAssignment_4 ) ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4464:1: ( ( ( rule__Group__IndexAssignment_4 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4465:1: ( ( rule__Group__IndexAssignment_4 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4465:1: ( ( rule__Group__IndexAssignment_4 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4466:1: ( rule__Group__IndexAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getIndexAssignment_4()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4467:1: ( rule__Group__IndexAssignment_4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4467:2: rule__Group__IndexAssignment_4
            {
            pushFollow(FOLLOW_rule__Group__IndexAssignment_4_in_rule__Group__Group__4__Impl9427);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4477:1: rule__Group__Group__5 : rule__Group__Group__5__Impl rule__Group__Group__6 ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4481:1: ( rule__Group__Group__5__Impl rule__Group__Group__6 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4482:2: rule__Group__Group__5__Impl rule__Group__Group__6
            {
            pushFollow(FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__59457);
            rule__Group__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__6_in_rule__Group__Group__59460);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4489:1: rule__Group__Group__5__Impl : ( '{' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4493:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4494:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4494:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4495:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,54,FOLLOW_54_in_rule__Group__Group__5__Impl9488); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4508:1: rule__Group__Group__6 : rule__Group__Group__6__Impl rule__Group__Group__7 ;
    public final void rule__Group__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4512:1: ( rule__Group__Group__6__Impl rule__Group__Group__7 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4513:2: rule__Group__Group__6__Impl rule__Group__Group__7
            {
            pushFollow(FOLLOW_rule__Group__Group__6__Impl_in_rule__Group__Group__69519);
            rule__Group__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__7_in_rule__Group__Group__69522);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4520:1: rule__Group__Group__6__Impl : ( ( rule__Group__ElementsAssignment_6 )* ) ;
    public final void rule__Group__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4524:1: ( ( ( rule__Group__ElementsAssignment_6 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4525:1: ( ( rule__Group__ElementsAssignment_6 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4525:1: ( ( rule__Group__ElementsAssignment_6 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4526:1: ( rule__Group__ElementsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getElementsAssignment_6()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4527:1: ( rule__Group__ElementsAssignment_6 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=21 && LA30_0<=23)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4527:2: rule__Group__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Group__ElementsAssignment_6_in_rule__Group__Group__6__Impl9549);
            	    rule__Group__ElementsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4537:1: rule__Group__Group__7 : rule__Group__Group__7__Impl ;
    public final void rule__Group__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4541:1: ( rule__Group__Group__7__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4542:2: rule__Group__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Group__Group__7__Impl_in_rule__Group__Group__79580);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4548:1: rule__Group__Group__7__Impl : ( '}' ) ;
    public final void rule__Group__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4552:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4553:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4553:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4554:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,55,FOLLOW_55_in_rule__Group__Group__7__Impl9608); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4583:1: rule__FieldOptions__Group__0 : rule__FieldOptions__Group__0__Impl rule__FieldOptions__Group__1 ;
    public final void rule__FieldOptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4587:1: ( rule__FieldOptions__Group__0__Impl rule__FieldOptions__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4588:2: rule__FieldOptions__Group__0__Impl rule__FieldOptions__Group__1
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__0__Impl_in_rule__FieldOptions__Group__09655);
            rule__FieldOptions__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group__1_in_rule__FieldOptions__Group__09658);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4595:1: rule__FieldOptions__Group__0__Impl : ( '[' ) ;
    public final void rule__FieldOptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4599:1: ( ( '[' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4600:1: ( '[' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4600:1: ( '[' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4601:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,58,FOLLOW_58_in_rule__FieldOptions__Group__0__Impl9686); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4614:1: rule__FieldOptions__Group__1 : rule__FieldOptions__Group__1__Impl rule__FieldOptions__Group__2 ;
    public final void rule__FieldOptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4618:1: ( rule__FieldOptions__Group__1__Impl rule__FieldOptions__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4619:2: rule__FieldOptions__Group__1__Impl rule__FieldOptions__Group__2
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__1__Impl_in_rule__FieldOptions__Group__19717);
            rule__FieldOptions__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group__2_in_rule__FieldOptions__Group__19720);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4626:1: rule__FieldOptions__Group__1__Impl : ( ( rule__FieldOptions__OptionsAssignment_1 ) ) ;
    public final void rule__FieldOptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4630:1: ( ( ( rule__FieldOptions__OptionsAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4631:1: ( ( rule__FieldOptions__OptionsAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4631:1: ( ( rule__FieldOptions__OptionsAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4632:1: ( rule__FieldOptions__OptionsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4633:1: ( rule__FieldOptions__OptionsAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4633:2: rule__FieldOptions__OptionsAssignment_1
            {
            pushFollow(FOLLOW_rule__FieldOptions__OptionsAssignment_1_in_rule__FieldOptions__Group__1__Impl9747);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4643:1: rule__FieldOptions__Group__2 : rule__FieldOptions__Group__2__Impl rule__FieldOptions__Group__3 ;
    public final void rule__FieldOptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4647:1: ( rule__FieldOptions__Group__2__Impl rule__FieldOptions__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4648:2: rule__FieldOptions__Group__2__Impl rule__FieldOptions__Group__3
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__2__Impl_in_rule__FieldOptions__Group__29777);
            rule__FieldOptions__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group__3_in_rule__FieldOptions__Group__29780);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4655:1: rule__FieldOptions__Group__2__Impl : ( ( rule__FieldOptions__Group_2__0 )* ) ;
    public final void rule__FieldOptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4659:1: ( ( ( rule__FieldOptions__Group_2__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4660:1: ( ( rule__FieldOptions__Group_2__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4660:1: ( ( rule__FieldOptions__Group_2__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4661:1: ( rule__FieldOptions__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getGroup_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4662:1: ( rule__FieldOptions__Group_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==57) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4662:2: rule__FieldOptions__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FieldOptions__Group_2__0_in_rule__FieldOptions__Group__2__Impl9807);
            	    rule__FieldOptions__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4672:1: rule__FieldOptions__Group__3 : rule__FieldOptions__Group__3__Impl ;
    public final void rule__FieldOptions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4676:1: ( rule__FieldOptions__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4677:2: rule__FieldOptions__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__3__Impl_in_rule__FieldOptions__Group__39838);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4683:1: rule__FieldOptions__Group__3__Impl : ( ']' ) ;
    public final void rule__FieldOptions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4687:1: ( ( ']' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4688:1: ( ']' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4688:1: ( ']' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4689:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,59,FOLLOW_59_in_rule__FieldOptions__Group__3__Impl9866); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4710:1: rule__FieldOptions__Group_2__0 : rule__FieldOptions__Group_2__0__Impl rule__FieldOptions__Group_2__1 ;
    public final void rule__FieldOptions__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4714:1: ( rule__FieldOptions__Group_2__0__Impl rule__FieldOptions__Group_2__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4715:2: rule__FieldOptions__Group_2__0__Impl rule__FieldOptions__Group_2__1
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group_2__0__Impl_in_rule__FieldOptions__Group_2__09905);
            rule__FieldOptions__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group_2__1_in_rule__FieldOptions__Group_2__09908);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4722:1: rule__FieldOptions__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FieldOptions__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4726:1: ( ( ',' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4727:1: ( ',' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4727:1: ( ',' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4728:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getCommaKeyword_2_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__FieldOptions__Group_2__0__Impl9936); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4741:1: rule__FieldOptions__Group_2__1 : rule__FieldOptions__Group_2__1__Impl ;
    public final void rule__FieldOptions__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4745:1: ( rule__FieldOptions__Group_2__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4746:2: rule__FieldOptions__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group_2__1__Impl_in_rule__FieldOptions__Group_2__19967);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4752:1: rule__FieldOptions__Group_2__1__Impl : ( ( rule__FieldOptions__OptionsAssignment_2_1 ) ) ;
    public final void rule__FieldOptions__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4756:1: ( ( ( rule__FieldOptions__OptionsAssignment_2_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4757:1: ( ( rule__FieldOptions__OptionsAssignment_2_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4757:1: ( ( rule__FieldOptions__OptionsAssignment_2_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4758:1: ( rule__FieldOptions__OptionsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsAssignment_2_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4759:1: ( rule__FieldOptions__OptionsAssignment_2_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4759:2: rule__FieldOptions__OptionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FieldOptions__OptionsAssignment_2_1_in_rule__FieldOptions__Group_2__1__Impl9994);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4773:1: rule__PackedValueFieldOption__Group__0 : rule__PackedValueFieldOption__Group__0__Impl rule__PackedValueFieldOption__Group__1 ;
    public final void rule__PackedValueFieldOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4777:1: ( rule__PackedValueFieldOption__Group__0__Impl rule__PackedValueFieldOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4778:2: rule__PackedValueFieldOption__Group__0__Impl rule__PackedValueFieldOption__Group__1
            {
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__0__Impl_in_rule__PackedValueFieldOption__Group__010028);
            rule__PackedValueFieldOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__1_in_rule__PackedValueFieldOption__Group__010031);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4785:1: rule__PackedValueFieldOption__Group__0__Impl : ( ( 'packed' ) ) ;
    public final void rule__PackedValueFieldOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4789:1: ( ( ( 'packed' ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4790:1: ( ( 'packed' ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4790:1: ( ( 'packed' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4791:1: ( 'packed' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionAccess().getPackedKeyword_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4792:1: ( 'packed' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4793:2: 'packed'
            {
            match(input,48,FOLLOW_48_in_rule__PackedValueFieldOption__Group__0__Impl10060); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4804:1: rule__PackedValueFieldOption__Group__1 : rule__PackedValueFieldOption__Group__1__Impl rule__PackedValueFieldOption__Group__2 ;
    public final void rule__PackedValueFieldOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4808:1: ( rule__PackedValueFieldOption__Group__1__Impl rule__PackedValueFieldOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4809:2: rule__PackedValueFieldOption__Group__1__Impl rule__PackedValueFieldOption__Group__2
            {
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__1__Impl_in_rule__PackedValueFieldOption__Group__110092);
            rule__PackedValueFieldOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__2_in_rule__PackedValueFieldOption__Group__110095);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4816:1: rule__PackedValueFieldOption__Group__1__Impl : ( '=' ) ;
    public final void rule__PackedValueFieldOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4820:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4821:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4821:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4822:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,51,FOLLOW_51_in_rule__PackedValueFieldOption__Group__1__Impl10123); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4835:1: rule__PackedValueFieldOption__Group__2 : rule__PackedValueFieldOption__Group__2__Impl ;
    public final void rule__PackedValueFieldOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4839:1: ( rule__PackedValueFieldOption__Group__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4840:2: rule__PackedValueFieldOption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__2__Impl_in_rule__PackedValueFieldOption__Group__210154);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4846:1: rule__PackedValueFieldOption__Group__2__Impl : ( ( rule__PackedValueFieldOption__ValueAssignment_2 ) ) ;
    public final void rule__PackedValueFieldOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4850:1: ( ( ( rule__PackedValueFieldOption__ValueAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4851:1: ( ( rule__PackedValueFieldOption__ValueAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4851:1: ( ( rule__PackedValueFieldOption__ValueAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4852:1: ( rule__PackedValueFieldOption__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionAccess().getValueAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4853:1: ( rule__PackedValueFieldOption__ValueAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4853:2: rule__PackedValueFieldOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__PackedValueFieldOption__ValueAssignment_2_in_rule__PackedValueFieldOption__Group__2__Impl10181);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4869:1: rule__DefaultValueFieldOption__Group__0 : rule__DefaultValueFieldOption__Group__0__Impl rule__DefaultValueFieldOption__Group__1 ;
    public final void rule__DefaultValueFieldOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4873:1: ( rule__DefaultValueFieldOption__Group__0__Impl rule__DefaultValueFieldOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4874:2: rule__DefaultValueFieldOption__Group__0__Impl rule__DefaultValueFieldOption__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__0__Impl_in_rule__DefaultValueFieldOption__Group__010217);
            rule__DefaultValueFieldOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__1_in_rule__DefaultValueFieldOption__Group__010220);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4881:1: rule__DefaultValueFieldOption__Group__0__Impl : ( ( 'default' ) ) ;
    public final void rule__DefaultValueFieldOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4885:1: ( ( ( 'default' ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4886:1: ( ( 'default' ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4886:1: ( ( 'default' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4887:1: ( 'default' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getDefaultKeyword_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4888:1: ( 'default' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4889:2: 'default'
            {
            match(input,44,FOLLOW_44_in_rule__DefaultValueFieldOption__Group__0__Impl10249); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4900:1: rule__DefaultValueFieldOption__Group__1 : rule__DefaultValueFieldOption__Group__1__Impl rule__DefaultValueFieldOption__Group__2 ;
    public final void rule__DefaultValueFieldOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4904:1: ( rule__DefaultValueFieldOption__Group__1__Impl rule__DefaultValueFieldOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4905:2: rule__DefaultValueFieldOption__Group__1__Impl rule__DefaultValueFieldOption__Group__2
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__1__Impl_in_rule__DefaultValueFieldOption__Group__110281);
            rule__DefaultValueFieldOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__2_in_rule__DefaultValueFieldOption__Group__110284);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4912:1: rule__DefaultValueFieldOption__Group__1__Impl : ( '=' ) ;
    public final void rule__DefaultValueFieldOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4916:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4917:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4917:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4918:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,51,FOLLOW_51_in_rule__DefaultValueFieldOption__Group__1__Impl10312); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4931:1: rule__DefaultValueFieldOption__Group__2 : rule__DefaultValueFieldOption__Group__2__Impl ;
    public final void rule__DefaultValueFieldOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4935:1: ( rule__DefaultValueFieldOption__Group__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4936:2: rule__DefaultValueFieldOption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__2__Impl_in_rule__DefaultValueFieldOption__Group__210343);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4942:1: rule__DefaultValueFieldOption__Group__2__Impl : ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) ) ;
    public final void rule__DefaultValueFieldOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4946:1: ( ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4947:1: ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4947:1: ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4948:1: ( rule__DefaultValueFieldOption__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getValueAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4949:1: ( rule__DefaultValueFieldOption__ValueAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4949:2: rule__DefaultValueFieldOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__ValueAssignment_2_in_rule__DefaultValueFieldOption__Group__2__Impl10370);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4965:1: rule__NativeFieldOption__Group__0 : rule__NativeFieldOption__Group__0__Impl rule__NativeFieldOption__Group__1 ;
    public final void rule__NativeFieldOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4969:1: ( rule__NativeFieldOption__Group__0__Impl rule__NativeFieldOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4970:2: rule__NativeFieldOption__Group__0__Impl rule__NativeFieldOption__Group__1
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__0__Impl_in_rule__NativeFieldOption__Group__010406);
            rule__NativeFieldOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__1_in_rule__NativeFieldOption__Group__010409);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4977:1: rule__NativeFieldOption__Group__0__Impl : ( ( rule__NativeFieldOption__SourceAssignment_0 ) ) ;
    public final void rule__NativeFieldOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4981:1: ( ( ( rule__NativeFieldOption__SourceAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4982:1: ( ( rule__NativeFieldOption__SourceAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4982:1: ( ( rule__NativeFieldOption__SourceAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4983:1: ( rule__NativeFieldOption__SourceAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getSourceAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4984:1: ( rule__NativeFieldOption__SourceAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4984:2: rule__NativeFieldOption__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__SourceAssignment_0_in_rule__NativeFieldOption__Group__0__Impl10436);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4994:1: rule__NativeFieldOption__Group__1 : rule__NativeFieldOption__Group__1__Impl rule__NativeFieldOption__Group__2 ;
    public final void rule__NativeFieldOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4998:1: ( rule__NativeFieldOption__Group__1__Impl rule__NativeFieldOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4999:2: rule__NativeFieldOption__Group__1__Impl rule__NativeFieldOption__Group__2
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__1__Impl_in_rule__NativeFieldOption__Group__110466);
            rule__NativeFieldOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__2_in_rule__NativeFieldOption__Group__110469);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5006:1: rule__NativeFieldOption__Group__1__Impl : ( '=' ) ;
    public final void rule__NativeFieldOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5010:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5011:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5011:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5012:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,51,FOLLOW_51_in_rule__NativeFieldOption__Group__1__Impl10497); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5025:1: rule__NativeFieldOption__Group__2 : rule__NativeFieldOption__Group__2__Impl ;
    public final void rule__NativeFieldOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5029:1: ( rule__NativeFieldOption__Group__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5030:2: rule__NativeFieldOption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__2__Impl_in_rule__NativeFieldOption__Group__210528);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5036:1: rule__NativeFieldOption__Group__2__Impl : ( ( rule__NativeFieldOption__ValueAssignment_2 ) ) ;
    public final void rule__NativeFieldOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5040:1: ( ( ( rule__NativeFieldOption__ValueAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5041:1: ( ( rule__NativeFieldOption__ValueAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5041:1: ( ( rule__NativeFieldOption__ValueAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5042:1: ( rule__NativeFieldOption__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getValueAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5043:1: ( rule__NativeFieldOption__ValueAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5043:2: rule__NativeFieldOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__ValueAssignment_2_in_rule__NativeFieldOption__Group__2__Impl10555);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5059:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5063:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5064:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__010591);
            rule__Enum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__010594);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5071:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5075:1: ( ( 'enum' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5076:1: ( 'enum' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5076:1: ( 'enum' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5077:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Enum__Group__0__Impl10622); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5090:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5094:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5095:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__110653);
            rule__Enum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__110656);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5102:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5106:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5107:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5107:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5108:1: ( rule__Enum__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5109:1: ( rule__Enum__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5109:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl10683);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5119:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5123:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5124:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__210713);
            rule__Enum__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__210716);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5131:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5135:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5136:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5136:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5137:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__Enum__Group__2__Impl10744); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5150:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5154:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5155:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__310775);
            rule__Enum__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__310778);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5162:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__ElementsAssignment_3 )* ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5166:1: ( ( ( rule__Enum__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5167:1: ( ( rule__Enum__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5167:1: ( ( rule__Enum__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5168:1: ( rule__Enum__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5169:1: ( rule__Enum__ElementsAssignment_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||LA32_0==17) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5169:2: rule__Enum__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enum__ElementsAssignment_3_in_rule__Enum__Group__3__Impl10805);
            	    rule__Enum__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5179:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5183:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5184:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__410836);
            rule__Enum__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__410839);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5191:1: rule__Enum__Group__4__Impl : ( '}' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5195:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5196:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5196:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5197:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,55,FOLLOW_55_in_rule__Enum__Group__4__Impl10867); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5210:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5214:1: ( rule__Enum__Group__5__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5215:2: rule__Enum__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__510898);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5221:1: rule__Enum__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5225:1: ( ( ( ';' )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5226:1: ( ( ';' )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5226:1: ( ( ';' )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5227:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getSemicolonKeyword_5()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5228:1: ( ';' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==52) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5229:2: ';'
                    {
                    match(input,52,FOLLOW_52_in_rule__Enum__Group__5__Impl10927); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5252:1: rule__EnumField__Group__0 : rule__EnumField__Group__0__Impl rule__EnumField__Group__1 ;
    public final void rule__EnumField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5256:1: ( rule__EnumField__Group__0__Impl rule__EnumField__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5257:2: rule__EnumField__Group__0__Impl rule__EnumField__Group__1
            {
            pushFollow(FOLLOW_rule__EnumField__Group__0__Impl_in_rule__EnumField__Group__010972);
            rule__EnumField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__1_in_rule__EnumField__Group__010975);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5264:1: rule__EnumField__Group__0__Impl : ( ( rule__EnumField__NameAssignment_0 ) ) ;
    public final void rule__EnumField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5268:1: ( ( ( rule__EnumField__NameAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5269:1: ( ( rule__EnumField__NameAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5269:1: ( ( rule__EnumField__NameAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5270:1: ( rule__EnumField__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getNameAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5271:1: ( rule__EnumField__NameAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5271:2: rule__EnumField__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumField__NameAssignment_0_in_rule__EnumField__Group__0__Impl11002);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5281:1: rule__EnumField__Group__1 : rule__EnumField__Group__1__Impl rule__EnumField__Group__2 ;
    public final void rule__EnumField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5285:1: ( rule__EnumField__Group__1__Impl rule__EnumField__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5286:2: rule__EnumField__Group__1__Impl rule__EnumField__Group__2
            {
            pushFollow(FOLLOW_rule__EnumField__Group__1__Impl_in_rule__EnumField__Group__111032);
            rule__EnumField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__2_in_rule__EnumField__Group__111035);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5293:1: rule__EnumField__Group__1__Impl : ( '=' ) ;
    public final void rule__EnumField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5297:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5298:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5298:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5299:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,51,FOLLOW_51_in_rule__EnumField__Group__1__Impl11063); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5312:1: rule__EnumField__Group__2 : rule__EnumField__Group__2__Impl rule__EnumField__Group__3 ;
    public final void rule__EnumField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5316:1: ( rule__EnumField__Group__2__Impl rule__EnumField__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5317:2: rule__EnumField__Group__2__Impl rule__EnumField__Group__3
            {
            pushFollow(FOLLOW_rule__EnumField__Group__2__Impl_in_rule__EnumField__Group__211094);
            rule__EnumField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__3_in_rule__EnumField__Group__211097);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5324:1: rule__EnumField__Group__2__Impl : ( ( rule__EnumField__IndexAssignment_2 ) ) ;
    public final void rule__EnumField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5328:1: ( ( ( rule__EnumField__IndexAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5329:1: ( ( rule__EnumField__IndexAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5329:1: ( ( rule__EnumField__IndexAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5330:1: ( rule__EnumField__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getIndexAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5331:1: ( rule__EnumField__IndexAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5331:2: rule__EnumField__IndexAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumField__IndexAssignment_2_in_rule__EnumField__Group__2__Impl11124);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5341:1: rule__EnumField__Group__3 : rule__EnumField__Group__3__Impl rule__EnumField__Group__4 ;
    public final void rule__EnumField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5345:1: ( rule__EnumField__Group__3__Impl rule__EnumField__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5346:2: rule__EnumField__Group__3__Impl rule__EnumField__Group__4
            {
            pushFollow(FOLLOW_rule__EnumField__Group__3__Impl_in_rule__EnumField__Group__311154);
            rule__EnumField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__4_in_rule__EnumField__Group__311157);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5353:1: rule__EnumField__Group__3__Impl : ( ( rule__EnumField__Group_3__0 )? ) ;
    public final void rule__EnumField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5357:1: ( ( ( rule__EnumField__Group_3__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5358:1: ( ( rule__EnumField__Group_3__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5358:1: ( ( rule__EnumField__Group_3__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5359:1: ( rule__EnumField__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getGroup_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5360:1: ( rule__EnumField__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==58) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5360:2: rule__EnumField__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumField__Group_3__0_in_rule__EnumField__Group__3__Impl11184);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5370:1: rule__EnumField__Group__4 : rule__EnumField__Group__4__Impl ;
    public final void rule__EnumField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5374:1: ( rule__EnumField__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5375:2: rule__EnumField__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumField__Group__4__Impl_in_rule__EnumField__Group__411215);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5381:1: rule__EnumField__Group__4__Impl : ( ';' ) ;
    public final void rule__EnumField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5385:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5386:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5386:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5387:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getSemicolonKeyword_4()); 
            }
            match(input,52,FOLLOW_52_in_rule__EnumField__Group__4__Impl11243); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5410:1: rule__EnumField__Group_3__0 : rule__EnumField__Group_3__0__Impl rule__EnumField__Group_3__1 ;
    public final void rule__EnumField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5414:1: ( rule__EnumField__Group_3__0__Impl rule__EnumField__Group_3__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5415:2: rule__EnumField__Group_3__0__Impl rule__EnumField__Group_3__1
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__0__Impl_in_rule__EnumField__Group_3__011284);
            rule__EnumField__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3__1_in_rule__EnumField__Group_3__011287);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5422:1: rule__EnumField__Group_3__0__Impl : ( '[' ) ;
    public final void rule__EnumField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5426:1: ( ( '[' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5427:1: ( '[' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5427:1: ( '[' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5428:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getLeftSquareBracketKeyword_3_0()); 
            }
            match(input,58,FOLLOW_58_in_rule__EnumField__Group_3__0__Impl11315); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5441:1: rule__EnumField__Group_3__1 : rule__EnumField__Group_3__1__Impl rule__EnumField__Group_3__2 ;
    public final void rule__EnumField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5445:1: ( rule__EnumField__Group_3__1__Impl rule__EnumField__Group_3__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5446:2: rule__EnumField__Group_3__1__Impl rule__EnumField__Group_3__2
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__1__Impl_in_rule__EnumField__Group_3__111346);
            rule__EnumField__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3__2_in_rule__EnumField__Group_3__111349);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5453:1: rule__EnumField__Group_3__1__Impl : ( ( rule__EnumField__OptionsAssignment_3_1 ) ) ;
    public final void rule__EnumField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5457:1: ( ( ( rule__EnumField__OptionsAssignment_3_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5458:1: ( ( rule__EnumField__OptionsAssignment_3_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5458:1: ( ( rule__EnumField__OptionsAssignment_3_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5459:1: ( rule__EnumField__OptionsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsAssignment_3_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5460:1: ( rule__EnumField__OptionsAssignment_3_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5460:2: rule__EnumField__OptionsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumField__OptionsAssignment_3_1_in_rule__EnumField__Group_3__1__Impl11376);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5470:1: rule__EnumField__Group_3__2 : rule__EnumField__Group_3__2__Impl rule__EnumField__Group_3__3 ;
    public final void rule__EnumField__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5474:1: ( rule__EnumField__Group_3__2__Impl rule__EnumField__Group_3__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5475:2: rule__EnumField__Group_3__2__Impl rule__EnumField__Group_3__3
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__2__Impl_in_rule__EnumField__Group_3__211406);
            rule__EnumField__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3__3_in_rule__EnumField__Group_3__211409);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5482:1: rule__EnumField__Group_3__2__Impl : ( ( rule__EnumField__Group_3_2__0 )* ) ;
    public final void rule__EnumField__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5486:1: ( ( ( rule__EnumField__Group_3_2__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5487:1: ( ( rule__EnumField__Group_3_2__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5487:1: ( ( rule__EnumField__Group_3_2__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5488:1: ( rule__EnumField__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getGroup_3_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5489:1: ( rule__EnumField__Group_3_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==57) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5489:2: rule__EnumField__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumField__Group_3_2__0_in_rule__EnumField__Group_3__2__Impl11436);
            	    rule__EnumField__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5499:1: rule__EnumField__Group_3__3 : rule__EnumField__Group_3__3__Impl ;
    public final void rule__EnumField__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5503:1: ( rule__EnumField__Group_3__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5504:2: rule__EnumField__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__3__Impl_in_rule__EnumField__Group_3__311467);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5510:1: rule__EnumField__Group_3__3__Impl : ( ']' ) ;
    public final void rule__EnumField__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5514:1: ( ( ']' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5515:1: ( ']' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5515:1: ( ']' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5516:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getRightSquareBracketKeyword_3_3()); 
            }
            match(input,59,FOLLOW_59_in_rule__EnumField__Group_3__3__Impl11495); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5537:1: rule__EnumField__Group_3_2__0 : rule__EnumField__Group_3_2__0__Impl rule__EnumField__Group_3_2__1 ;
    public final void rule__EnumField__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5541:1: ( rule__EnumField__Group_3_2__0__Impl rule__EnumField__Group_3_2__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5542:2: rule__EnumField__Group_3_2__0__Impl rule__EnumField__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3_2__0__Impl_in_rule__EnumField__Group_3_2__011534);
            rule__EnumField__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3_2__1_in_rule__EnumField__Group_3_2__011537);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5549:1: rule__EnumField__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__EnumField__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5553:1: ( ( ',' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5554:1: ( ',' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5554:1: ( ',' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5555:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__EnumField__Group_3_2__0__Impl11565); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5568:1: rule__EnumField__Group_3_2__1 : rule__EnumField__Group_3_2__1__Impl ;
    public final void rule__EnumField__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5572:1: ( rule__EnumField__Group_3_2__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5573:2: rule__EnumField__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3_2__1__Impl_in_rule__EnumField__Group_3_2__111596);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5579:1: rule__EnumField__Group_3_2__1__Impl : ( ( rule__EnumField__OptionsAssignment_3_2_1 ) ) ;
    public final void rule__EnumField__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5583:1: ( ( ( rule__EnumField__OptionsAssignment_3_2_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5584:1: ( ( rule__EnumField__OptionsAssignment_3_2_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5584:1: ( ( rule__EnumField__OptionsAssignment_3_2_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5585:1: ( rule__EnumField__OptionsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsAssignment_3_2_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5586:1: ( rule__EnumField__OptionsAssignment_3_2_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5586:2: rule__EnumField__OptionsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__EnumField__OptionsAssignment_3_2_1_in_rule__EnumField__Group_3_2__1__Impl11623);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5600:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5604:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5605:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__011657);
            rule__Service__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__011660);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5612:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5616:1: ( ( 'service' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5617:1: ( 'service' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5617:1: ( 'service' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5618:1: 'service'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Service__Group__0__Impl11688); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5631:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5635:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5636:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__111719);
            rule__Service__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__111722);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5643:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5647:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5648:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5648:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5649:1: ( rule__Service__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5650:1: ( rule__Service__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5650:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl11749);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5660:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5664:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5665:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__211779);
            rule__Service__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__211782);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5672:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5676:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5677:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5677:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5678:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__Service__Group__2__Impl11810); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5691:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5695:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5696:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__311841);
            rule__Service__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__311844);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5703:1: rule__Service__Group__3__Impl : ( ( rule__Service__ElementsAssignment_3 )* ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5707:1: ( ( ( rule__Service__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5708:1: ( ( rule__Service__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5708:1: ( ( rule__Service__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5709:1: ( rule__Service__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5710:1: ( rule__Service__ElementsAssignment_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==17||LA36_0==27) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5710:2: rule__Service__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Service__ElementsAssignment_3_in_rule__Service__Group__3__Impl11871);
            	    rule__Service__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5720:1: rule__Service__Group__4 : rule__Service__Group__4__Impl ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5724:1: ( rule__Service__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5725:2: rule__Service__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__411902);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5731:1: rule__Service__Group__4__Impl : ( '}' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5735:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5736:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5736:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5737:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,55,FOLLOW_55_in_rule__Service__Group__4__Impl11930); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5760:1: rule__Rpc__Group__0 : rule__Rpc__Group__0__Impl rule__Rpc__Group__1 ;
    public final void rule__Rpc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5764:1: ( rule__Rpc__Group__0__Impl rule__Rpc__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5765:2: rule__Rpc__Group__0__Impl rule__Rpc__Group__1
            {
            pushFollow(FOLLOW_rule__Rpc__Group__0__Impl_in_rule__Rpc__Group__011971);
            rule__Rpc__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__1_in_rule__Rpc__Group__011974);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5772:1: rule__Rpc__Group__0__Impl : ( ( 'rpc' ) ) ;
    public final void rule__Rpc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5776:1: ( ( ( 'rpc' ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5777:1: ( ( 'rpc' ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5777:1: ( ( 'rpc' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5778:1: ( 'rpc' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRpcKeyword_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5779:1: ( 'rpc' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5780:2: 'rpc'
            {
            match(input,27,FOLLOW_27_in_rule__Rpc__Group__0__Impl12003); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5791:1: rule__Rpc__Group__1 : rule__Rpc__Group__1__Impl rule__Rpc__Group__2 ;
    public final void rule__Rpc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5795:1: ( rule__Rpc__Group__1__Impl rule__Rpc__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5796:2: rule__Rpc__Group__1__Impl rule__Rpc__Group__2
            {
            pushFollow(FOLLOW_rule__Rpc__Group__1__Impl_in_rule__Rpc__Group__112035);
            rule__Rpc__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__2_in_rule__Rpc__Group__112038);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5803:1: rule__Rpc__Group__1__Impl : ( ( rule__Rpc__NameAssignment_1 ) ) ;
    public final void rule__Rpc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5807:1: ( ( ( rule__Rpc__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5808:1: ( ( rule__Rpc__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5808:1: ( ( rule__Rpc__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5809:1: ( rule__Rpc__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5810:1: ( rule__Rpc__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5810:2: rule__Rpc__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rpc__NameAssignment_1_in_rule__Rpc__Group__1__Impl12065);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5820:1: rule__Rpc__Group__2 : rule__Rpc__Group__2__Impl rule__Rpc__Group__3 ;
    public final void rule__Rpc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5824:1: ( rule__Rpc__Group__2__Impl rule__Rpc__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5825:2: rule__Rpc__Group__2__Impl rule__Rpc__Group__3
            {
            pushFollow(FOLLOW_rule__Rpc__Group__2__Impl_in_rule__Rpc__Group__212095);
            rule__Rpc__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__3_in_rule__Rpc__Group__212098);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5832:1: rule__Rpc__Group__2__Impl : ( '(' ) ;
    public final void rule__Rpc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5836:1: ( ( '(' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5837:1: ( '(' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5837:1: ( '(' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5838:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,60,FOLLOW_60_in_rule__Rpc__Group__2__Impl12126); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5851:1: rule__Rpc__Group__3 : rule__Rpc__Group__3__Impl rule__Rpc__Group__4 ;
    public final void rule__Rpc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5855:1: ( rule__Rpc__Group__3__Impl rule__Rpc__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5856:2: rule__Rpc__Group__3__Impl rule__Rpc__Group__4
            {
            pushFollow(FOLLOW_rule__Rpc__Group__3__Impl_in_rule__Rpc__Group__312157);
            rule__Rpc__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__4_in_rule__Rpc__Group__312160);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5863:1: rule__Rpc__Group__3__Impl : ( ( rule__Rpc__ArgTypeAssignment_3 ) ) ;
    public final void rule__Rpc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5867:1: ( ( ( rule__Rpc__ArgTypeAssignment_3 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5868:1: ( ( rule__Rpc__ArgTypeAssignment_3 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5868:1: ( ( rule__Rpc__ArgTypeAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5869:1: ( rule__Rpc__ArgTypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getArgTypeAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5870:1: ( rule__Rpc__ArgTypeAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5870:2: rule__Rpc__ArgTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Rpc__ArgTypeAssignment_3_in_rule__Rpc__Group__3__Impl12187);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5880:1: rule__Rpc__Group__4 : rule__Rpc__Group__4__Impl rule__Rpc__Group__5 ;
    public final void rule__Rpc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5884:1: ( rule__Rpc__Group__4__Impl rule__Rpc__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5885:2: rule__Rpc__Group__4__Impl rule__Rpc__Group__5
            {
            pushFollow(FOLLOW_rule__Rpc__Group__4__Impl_in_rule__Rpc__Group__412217);
            rule__Rpc__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__5_in_rule__Rpc__Group__412220);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5892:1: rule__Rpc__Group__4__Impl : ( ')' ) ;
    public final void rule__Rpc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5896:1: ( ( ')' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5897:1: ( ')' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5897:1: ( ')' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5898:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,61,FOLLOW_61_in_rule__Rpc__Group__4__Impl12248); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5911:1: rule__Rpc__Group__5 : rule__Rpc__Group__5__Impl rule__Rpc__Group__6 ;
    public final void rule__Rpc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5915:1: ( rule__Rpc__Group__5__Impl rule__Rpc__Group__6 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5916:2: rule__Rpc__Group__5__Impl rule__Rpc__Group__6
            {
            pushFollow(FOLLOW_rule__Rpc__Group__5__Impl_in_rule__Rpc__Group__512279);
            rule__Rpc__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__6_in_rule__Rpc__Group__512282);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5923:1: rule__Rpc__Group__5__Impl : ( 'returns' ) ;
    public final void rule__Rpc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5927:1: ( ( 'returns' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5928:1: ( 'returns' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5928:1: ( 'returns' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5929:1: 'returns'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getReturnsKeyword_5()); 
            }
            match(input,28,FOLLOW_28_in_rule__Rpc__Group__5__Impl12310); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5942:1: rule__Rpc__Group__6 : rule__Rpc__Group__6__Impl rule__Rpc__Group__7 ;
    public final void rule__Rpc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5946:1: ( rule__Rpc__Group__6__Impl rule__Rpc__Group__7 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5947:2: rule__Rpc__Group__6__Impl rule__Rpc__Group__7
            {
            pushFollow(FOLLOW_rule__Rpc__Group__6__Impl_in_rule__Rpc__Group__612341);
            rule__Rpc__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__7_in_rule__Rpc__Group__612344);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5954:1: rule__Rpc__Group__6__Impl : ( '(' ) ;
    public final void rule__Rpc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5958:1: ( ( '(' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5959:1: ( '(' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5959:1: ( '(' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5960:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getLeftParenthesisKeyword_6()); 
            }
            match(input,60,FOLLOW_60_in_rule__Rpc__Group__6__Impl12372); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5973:1: rule__Rpc__Group__7 : rule__Rpc__Group__7__Impl rule__Rpc__Group__8 ;
    public final void rule__Rpc__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5977:1: ( rule__Rpc__Group__7__Impl rule__Rpc__Group__8 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5978:2: rule__Rpc__Group__7__Impl rule__Rpc__Group__8
            {
            pushFollow(FOLLOW_rule__Rpc__Group__7__Impl_in_rule__Rpc__Group__712403);
            rule__Rpc__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__8_in_rule__Rpc__Group__712406);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5985:1: rule__Rpc__Group__7__Impl : ( ( rule__Rpc__ReturnTypeAssignment_7 ) ) ;
    public final void rule__Rpc__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5989:1: ( ( ( rule__Rpc__ReturnTypeAssignment_7 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5990:1: ( ( rule__Rpc__ReturnTypeAssignment_7 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5990:1: ( ( rule__Rpc__ReturnTypeAssignment_7 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5991:1: ( rule__Rpc__ReturnTypeAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getReturnTypeAssignment_7()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5992:1: ( rule__Rpc__ReturnTypeAssignment_7 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5992:2: rule__Rpc__ReturnTypeAssignment_7
            {
            pushFollow(FOLLOW_rule__Rpc__ReturnTypeAssignment_7_in_rule__Rpc__Group__7__Impl12433);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6002:1: rule__Rpc__Group__8 : rule__Rpc__Group__8__Impl rule__Rpc__Group__9 ;
    public final void rule__Rpc__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6006:1: ( rule__Rpc__Group__8__Impl rule__Rpc__Group__9 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6007:2: rule__Rpc__Group__8__Impl rule__Rpc__Group__9
            {
            pushFollow(FOLLOW_rule__Rpc__Group__8__Impl_in_rule__Rpc__Group__812463);
            rule__Rpc__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__9_in_rule__Rpc__Group__812466);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6014:1: rule__Rpc__Group__8__Impl : ( ')' ) ;
    public final void rule__Rpc__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6018:1: ( ( ')' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6019:1: ( ')' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6019:1: ( ')' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6020:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,61,FOLLOW_61_in_rule__Rpc__Group__8__Impl12494); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6033:1: rule__Rpc__Group__9 : rule__Rpc__Group__9__Impl rule__Rpc__Group__10 ;
    public final void rule__Rpc__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6037:1: ( rule__Rpc__Group__9__Impl rule__Rpc__Group__10 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6038:2: rule__Rpc__Group__9__Impl rule__Rpc__Group__10
            {
            pushFollow(FOLLOW_rule__Rpc__Group__9__Impl_in_rule__Rpc__Group__912525);
            rule__Rpc__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__10_in_rule__Rpc__Group__912528);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6045:1: rule__Rpc__Group__9__Impl : ( ( rule__Rpc__Group_9__0 )? ) ;
    public final void rule__Rpc__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6049:1: ( ( ( rule__Rpc__Group_9__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6050:1: ( ( rule__Rpc__Group_9__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6050:1: ( ( rule__Rpc__Group_9__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6051:1: ( rule__Rpc__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getGroup_9()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6052:1: ( rule__Rpc__Group_9__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==54) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6052:2: rule__Rpc__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Rpc__Group_9__0_in_rule__Rpc__Group__9__Impl12555);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6062:1: rule__Rpc__Group__10 : rule__Rpc__Group__10__Impl ;
    public final void rule__Rpc__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6066:1: ( rule__Rpc__Group__10__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6067:2: rule__Rpc__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Rpc__Group__10__Impl_in_rule__Rpc__Group__1012586);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6073:1: rule__Rpc__Group__10__Impl : ( ';' ) ;
    public final void rule__Rpc__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6077:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6078:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6078:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6079:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getSemicolonKeyword_10()); 
            }
            match(input,52,FOLLOW_52_in_rule__Rpc__Group__10__Impl12614); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6114:1: rule__Rpc__Group_9__0 : rule__Rpc__Group_9__0__Impl rule__Rpc__Group_9__1 ;
    public final void rule__Rpc__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6118:1: ( rule__Rpc__Group_9__0__Impl rule__Rpc__Group_9__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6119:2: rule__Rpc__Group_9__0__Impl rule__Rpc__Group_9__1
            {
            pushFollow(FOLLOW_rule__Rpc__Group_9__0__Impl_in_rule__Rpc__Group_9__012667);
            rule__Rpc__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group_9__1_in_rule__Rpc__Group_9__012670);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6126:1: rule__Rpc__Group_9__0__Impl : ( '{' ) ;
    public final void rule__Rpc__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6130:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6131:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6131:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6132:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getLeftCurlyBracketKeyword_9_0()); 
            }
            match(input,54,FOLLOW_54_in_rule__Rpc__Group_9__0__Impl12698); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6145:1: rule__Rpc__Group_9__1 : rule__Rpc__Group_9__1__Impl rule__Rpc__Group_9__2 ;
    public final void rule__Rpc__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6149:1: ( rule__Rpc__Group_9__1__Impl rule__Rpc__Group_9__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6150:2: rule__Rpc__Group_9__1__Impl rule__Rpc__Group_9__2
            {
            pushFollow(FOLLOW_rule__Rpc__Group_9__1__Impl_in_rule__Rpc__Group_9__112729);
            rule__Rpc__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group_9__2_in_rule__Rpc__Group_9__112732);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6157:1: rule__Rpc__Group_9__1__Impl : ( ( rule__Rpc__OptionsAssignment_9_1 )* ) ;
    public final void rule__Rpc__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6161:1: ( ( ( rule__Rpc__OptionsAssignment_9_1 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6162:1: ( ( rule__Rpc__OptionsAssignment_9_1 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6162:1: ( ( rule__Rpc__OptionsAssignment_9_1 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6163:1: ( rule__Rpc__OptionsAssignment_9_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getOptionsAssignment_9_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6164:1: ( rule__Rpc__OptionsAssignment_9_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==17) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6164:2: rule__Rpc__OptionsAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_rule__Rpc__OptionsAssignment_9_1_in_rule__Rpc__Group_9__1__Impl12759);
            	    rule__Rpc__OptionsAssignment_9_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6174:1: rule__Rpc__Group_9__2 : rule__Rpc__Group_9__2__Impl ;
    public final void rule__Rpc__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6178:1: ( rule__Rpc__Group_9__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6179:2: rule__Rpc__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Rpc__Group_9__2__Impl_in_rule__Rpc__Group_9__212790);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6185:1: rule__Rpc__Group_9__2__Impl : ( '}' ) ;
    public final void rule__Rpc__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6189:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6190:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6190:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6191:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRightCurlyBracketKeyword_9_2()); 
            }
            match(input,55,FOLLOW_55_in_rule__Rpc__Group_9__2__Impl12818); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6210:1: rule__Extend__Group__0 : rule__Extend__Group__0__Impl rule__Extend__Group__1 ;
    public final void rule__Extend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6214:1: ( rule__Extend__Group__0__Impl rule__Extend__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6215:2: rule__Extend__Group__0__Impl rule__Extend__Group__1
            {
            pushFollow(FOLLOW_rule__Extend__Group__0__Impl_in_rule__Extend__Group__012855);
            rule__Extend__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__1_in_rule__Extend__Group__012858);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6222:1: rule__Extend__Group__0__Impl : ( ( 'extend' ) ) ;
    public final void rule__Extend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6226:1: ( ( ( 'extend' ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6227:1: ( ( 'extend' ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6227:1: ( ( 'extend' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6228:1: ( 'extend' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getExtendKeyword_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6229:1: ( 'extend' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6230:2: 'extend'
            {
            match(input,25,FOLLOW_25_in_rule__Extend__Group__0__Impl12887); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6241:1: rule__Extend__Group__1 : rule__Extend__Group__1__Impl rule__Extend__Group__2 ;
    public final void rule__Extend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6245:1: ( rule__Extend__Group__1__Impl rule__Extend__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6246:2: rule__Extend__Group__1__Impl rule__Extend__Group__2
            {
            pushFollow(FOLLOW_rule__Extend__Group__1__Impl_in_rule__Extend__Group__112919);
            rule__Extend__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__2_in_rule__Extend__Group__112922);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6253:1: rule__Extend__Group__1__Impl : ( ( rule__Extend__TypeAssignment_1 ) ) ;
    public final void rule__Extend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6257:1: ( ( ( rule__Extend__TypeAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6258:1: ( ( rule__Extend__TypeAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6258:1: ( ( rule__Extend__TypeAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6259:1: ( rule__Extend__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getTypeAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6260:1: ( rule__Extend__TypeAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6260:2: rule__Extend__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Extend__TypeAssignment_1_in_rule__Extend__Group__1__Impl12949);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6270:1: rule__Extend__Group__2 : rule__Extend__Group__2__Impl rule__Extend__Group__3 ;
    public final void rule__Extend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6274:1: ( rule__Extend__Group__2__Impl rule__Extend__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6275:2: rule__Extend__Group__2__Impl rule__Extend__Group__3
            {
            pushFollow(FOLLOW_rule__Extend__Group__2__Impl_in_rule__Extend__Group__212979);
            rule__Extend__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__3_in_rule__Extend__Group__212982);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6282:1: rule__Extend__Group__2__Impl : ( '{' ) ;
    public final void rule__Extend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6286:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6287:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6287:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6288:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__Extend__Group__2__Impl13010); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6301:1: rule__Extend__Group__3 : rule__Extend__Group__3__Impl rule__Extend__Group__4 ;
    public final void rule__Extend__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6305:1: ( rule__Extend__Group__3__Impl rule__Extend__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6306:2: rule__Extend__Group__3__Impl rule__Extend__Group__4
            {
            pushFollow(FOLLOW_rule__Extend__Group__3__Impl_in_rule__Extend__Group__313041);
            rule__Extend__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__4_in_rule__Extend__Group__313044);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6313:1: rule__Extend__Group__3__Impl : ( ( rule__Extend__ElementsAssignment_3 )* ) ;
    public final void rule__Extend__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6317:1: ( ( ( rule__Extend__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6318:1: ( ( rule__Extend__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6318:1: ( ( rule__Extend__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6319:1: ( rule__Extend__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6320:1: ( rule__Extend__ElementsAssignment_3 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=17 && LA39_0<=25)||LA39_0==56) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6320:2: rule__Extend__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Extend__ElementsAssignment_3_in_rule__Extend__Group__3__Impl13071);
            	    rule__Extend__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6330:1: rule__Extend__Group__4 : rule__Extend__Group__4__Impl ;
    public final void rule__Extend__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6334:1: ( rule__Extend__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6335:2: rule__Extend__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Extend__Group__4__Impl_in_rule__Extend__Group__413102);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6341:1: rule__Extend__Group__4__Impl : ( '}' ) ;
    public final void rule__Extend__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6345:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6346:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6346:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6347:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,55,FOLLOW_55_in_rule__Extend__Group__4__Impl13130); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6370:1: rule__FULL_ID__Group__0 : rule__FULL_ID__Group__0__Impl rule__FULL_ID__Group__1 ;
    public final void rule__FULL_ID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6374:1: ( rule__FULL_ID__Group__0__Impl rule__FULL_ID__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6375:2: rule__FULL_ID__Group__0__Impl rule__FULL_ID__Group__1
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group__0__Impl_in_rule__FULL_ID__Group__013171);
            rule__FULL_ID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FULL_ID__Group__1_in_rule__FULL_ID__Group__013174);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6382:1: rule__FULL_ID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FULL_ID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6386:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6387:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6387:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6388:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FULL_ID__Group__0__Impl13201); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6399:1: rule__FULL_ID__Group__1 : rule__FULL_ID__Group__1__Impl ;
    public final void rule__FULL_ID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6403:1: ( rule__FULL_ID__Group__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6404:2: rule__FULL_ID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group__1__Impl_in_rule__FULL_ID__Group__113230);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6410:1: rule__FULL_ID__Group__1__Impl : ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) ) ;
    public final void rule__FULL_ID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6414:1: ( ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6415:1: ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6415:1: ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6416:1: ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6416:1: ( ( rule__FULL_ID__Group_1__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6417:1: ( rule__FULL_ID__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getGroup_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6418:1: ( rule__FULL_ID__Group_1__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6418:2: rule__FULL_ID__Group_1__0
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl13259);
            rule__FULL_ID__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFULL_IDAccess().getGroup_1()); 
            }

            }

            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6421:1: ( ( rule__FULL_ID__Group_1__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6422:1: ( rule__FULL_ID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getGroup_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6423:1: ( rule__FULL_ID__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==62) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6423:2: rule__FULL_ID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl13271);
            	    rule__FULL_ID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6438:1: rule__FULL_ID__Group_1__0 : rule__FULL_ID__Group_1__0__Impl rule__FULL_ID__Group_1__1 ;
    public final void rule__FULL_ID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6442:1: ( rule__FULL_ID__Group_1__0__Impl rule__FULL_ID__Group_1__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6443:2: rule__FULL_ID__Group_1__0__Impl rule__FULL_ID__Group_1__1
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__0__Impl_in_rule__FULL_ID__Group_1__013308);
            rule__FULL_ID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__1_in_rule__FULL_ID__Group_1__013311);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6450:1: rule__FULL_ID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FULL_ID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6454:1: ( ( '.' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6455:1: ( '.' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6455:1: ( '.' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6456:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,62,FOLLOW_62_in_rule__FULL_ID__Group_1__0__Impl13339); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6469:1: rule__FULL_ID__Group_1__1 : rule__FULL_ID__Group_1__1__Impl ;
    public final void rule__FULL_ID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6473:1: ( rule__FULL_ID__Group_1__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6474:2: rule__FULL_ID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__1__Impl_in_rule__FULL_ID__Group_1__113370);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6480:1: rule__FULL_ID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FULL_ID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6484:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6485:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6485:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6486:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FULL_ID__Group_1__1__Impl13397); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6503:1: rule__Proto__SyntaxAssignment_0 : ( ruleSyntax ) ;
    public final void rule__Proto__SyntaxAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6507:1: ( ( ruleSyntax ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6508:1: ( ruleSyntax )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6508:1: ( ruleSyntax )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6509:1: ruleSyntax
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getSyntaxSyntaxParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSyntax_in_rule__Proto__SyntaxAssignment_013436);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6518:1: rule__Proto__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Proto__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6522:1: ( ( ruleStatement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6523:1: ( ruleStatement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6523:1: ( ruleStatement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6524:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getStatementsStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Proto__StatementsAssignment_113467);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6533:1: rule__Syntax__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Syntax__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6537:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6538:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6538:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6539:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSyntaxAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Syntax__NameAssignment_213498); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6548:1: rule__Package__NameAssignment_1 : ( ruleVar_full ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6552:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6553:1: ( ruleVar_full )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6553:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6554:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameVar_fullParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__Package__NameAssignment_113529);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6563:1: rule__PublicImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PublicImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6567:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6568:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6568:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6569:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PublicImport__ImportURIAssignment_213560); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6578:1: rule__WeakImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__WeakImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6582:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6583:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6583:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6584:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__WeakImport__ImportURIAssignment_213591); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6593:1: rule__NativeOption__SourceAssignment_1 : ( ( ruleVar_full ) ) ;
    public final void rule__NativeOption__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6597:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6598:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6598:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6599:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getSourceMessageFieldCrossReference_1_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6600:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6601:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getSourceMessageFieldVar_fullParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__NativeOption__SourceAssignment_113626);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6612:1: rule__NativeOption__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__NativeOption__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6616:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6617:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6617:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6618:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getValueValueParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__NativeOption__ValueAssignment_313661);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6627:1: rule__CustomOption__SourceAssignment_1 : ( RULE_ID ) ;
    public final void rule__CustomOption__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6631:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6632:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6632:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6633:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getSourceIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomOption__SourceAssignment_113692); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6642:1: rule__CustomOption__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__CustomOption__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6646:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6647:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6647:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6648:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getValueValueParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__CustomOption__ValueAssignment_313723);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6657:1: rule__CustomIdLink__TargetAssignment : ( RULE_ID ) ;
    public final void rule__CustomIdLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6661:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6662:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6662:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6663:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomIdLinkAccess().getTargetIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomIdLink__TargetAssignment13754); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6672:1: rule__StringLink__TargetAssignment : ( RULE_STRING ) ;
    public final void rule__StringLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6676:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6677:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6677:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6678:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLinkAccess().getTargetSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLink__TargetAssignment13785); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6687:1: rule__BooleanLink__TargetAssignment : ( ruleBOOL ) ;
    public final void rule__BooleanLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6691:1: ( ( ruleBOOL ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6692:1: ( ruleBOOL )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6692:1: ( ruleBOOL )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6693:1: ruleBOOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLinkAccess().getTargetBOOLEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_rule__BooleanLink__TargetAssignment13816);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6702:1: rule__IntLink__TargetAssignment : ( RULE_NUMINT ) ;
    public final void rule__IntLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6706:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6707:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6707:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6708:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLinkAccess().getTargetNUMINTTerminalRuleCall_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__IntLink__TargetAssignment13847); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6717:1: rule__DoubleLink__TargetAssignment : ( RULE_NUMDOUBLE ) ;
    public final void rule__DoubleLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6721:1: ( ( RULE_NUMDOUBLE ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6722:1: ( RULE_NUMDOUBLE )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6722:1: ( RULE_NUMDOUBLE )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6723:1: RULE_NUMDOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLinkAccess().getTargetNUMDOUBLETerminalRuleCall_0()); 
            }
            match(input,RULE_NUMDOUBLE,FOLLOW_RULE_NUMDOUBLE_in_rule__DoubleLink__TargetAssignment13878); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6732:1: rule__Message__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6736:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6737:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6737:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6738:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__NameAssignment_113909); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6747:1: rule__Message__ElementsAssignment_3 : ( ruleMessageElement ) ;
    public final void rule__Message__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6751:1: ( ( ruleMessageElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6752:1: ( ruleMessageElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6752:1: ( ruleMessageElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6753:1: ruleMessageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getElementsMessageElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_rule__Message__ElementsAssignment_313940);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6762:1: rule__Oneof__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Oneof__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6766:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6767:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6767:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6768:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Oneof__NameAssignment_113971); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6777:1: rule__Oneof__FieldsAssignment_3 : ( ruleOneofField ) ;
    public final void rule__Oneof__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6781:1: ( ( ruleOneofField ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6782:1: ( ruleOneofField )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6782:1: ( ruleOneofField )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6783:1: ruleOneofField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getFieldsOneofFieldParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleOneofField_in_rule__Oneof__FieldsAssignment_314002);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6792:1: rule__OneofField__TypeAssignment_0 : ( ruleTypeLink ) ;
    public final void rule__OneofField__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6796:1: ( ( ruleTypeLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6797:1: ( ruleTypeLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6797:1: ( ruleTypeLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6798:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getTypeTypeLinkParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__OneofField__TypeAssignment_014033);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6807:1: rule__OneofField__NameAssignment_1 : ( ruleVar ) ;
    public final void rule__OneofField__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6811:1: ( ( ruleVar ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6812:1: ( ruleVar )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6812:1: ( ruleVar )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6813:1: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getNameVarParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleVar_in_rule__OneofField__NameAssignment_114064);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6822:1: rule__OneofField__IndexAssignment_3 : ( RULE_NUMINT ) ;
    public final void rule__OneofField__IndexAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6826:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6827:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6827:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6828:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getIndexNUMINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__OneofField__IndexAssignment_314095); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6837:1: rule__OneofField__OptionsAssignment_4 : ( ruleFieldOptions ) ;
    public final void rule__OneofField__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6841:1: ( ( ruleFieldOptions ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6842:1: ( ruleFieldOptions )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6842:1: ( ruleFieldOptions )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6843:1: ruleFieldOptions
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getOptionsFieldOptionsParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_rule__OneofField__OptionsAssignment_414126);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6852:1: rule__ExtensionRange__RangesAssignment_1 : ( ruleRange ) ;
    public final void rule__ExtensionRange__RangesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6856:1: ( ( ruleRange ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6857:1: ( ruleRange )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6857:1: ( ruleRange )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6858:1: ruleRange
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getRangesRangeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleRange_in_rule__ExtensionRange__RangesAssignment_114157);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6867:1: rule__ExtensionRange__RangesAssignment_2_1 : ( ruleRange ) ;
    public final void rule__ExtensionRange__RangesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6871:1: ( ( ruleRange ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6872:1: ( ruleRange )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6872:1: ( ruleRange )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6873:1: ruleRange
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getRangesRangeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleRange_in_rule__ExtensionRange__RangesAssignment_2_114188);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6882:1: rule__Range__FromAssignment_0 : ( RULE_NUMINT ) ;
    public final void rule__Range__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6886:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6887:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6887:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6888:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getFromNUMINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__Range__FromAssignment_014219); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6897:1: rule__Range__ToAssignment_1_1_0 : ( RULE_NUMINT ) ;
    public final void rule__Range__ToAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6901:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6902:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6902:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6903:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getToNUMINTTerminalRuleCall_1_1_0_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__Range__ToAssignment_1_1_014250); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6912:1: rule__Range__MaxAssignment_1_1_1 : ( ( 'max' ) ) ;
    public final void rule__Range__MaxAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6916:1: ( ( ( 'max' ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6917:1: ( ( 'max' ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6917:1: ( ( 'max' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6918:1: ( 'max' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getMaxMaxKeyword_1_1_1_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6919:1: ( 'max' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6920:1: 'max'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getMaxMaxKeyword_1_1_1_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Range__MaxAssignment_1_1_114286); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6935:1: rule__MessageField__ModifierAssignment_0 : ( ruleModifier ) ;
    public final void rule__MessageField__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6939:1: ( ( ruleModifier ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6940:1: ( ruleModifier )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6940:1: ( ruleModifier )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6941:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getModifierModifierEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__MessageField__ModifierAssignment_014325);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6950:1: rule__MessageField__TypeAssignment_1 : ( ruleTypeLink ) ;
    public final void rule__MessageField__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6954:1: ( ( ruleTypeLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6955:1: ( ruleTypeLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6955:1: ( ruleTypeLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6956:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getTypeTypeLinkParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__MessageField__TypeAssignment_114356);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6965:1: rule__MessageField__NameAssignment_2 : ( ruleVar ) ;
    public final void rule__MessageField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6969:1: ( ( ruleVar ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6970:1: ( ruleVar )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6970:1: ( ruleVar )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6971:1: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getNameVarParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVar_in_rule__MessageField__NameAssignment_214387);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6980:1: rule__MessageField__IndexAssignment_4 : ( RULE_NUMINT ) ;
    public final void rule__MessageField__IndexAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6984:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6985:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6985:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6986:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getIndexNUMINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__MessageField__IndexAssignment_414418); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6995:1: rule__MessageField__OptionsAssignment_5 : ( ruleFieldOptions ) ;
    public final void rule__MessageField__OptionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6999:1: ( ( ruleFieldOptions ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7000:1: ( ruleFieldOptions )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7000:1: ( ruleFieldOptions )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7001:1: ruleFieldOptions
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getOptionsFieldOptionsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_rule__MessageField__OptionsAssignment_514449);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7010:1: rule__Group__ModifierAssignment_0 : ( ruleModifier ) ;
    public final void rule__Group__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7014:1: ( ( ruleModifier ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7015:1: ( ruleModifier )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7015:1: ( ruleModifier )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7016:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getModifierModifierEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Group__ModifierAssignment_014480);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7025:1: rule__Group__NameAssignment_2 : ( ruleVar ) ;
    public final void rule__Group__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7029:1: ( ( ruleVar ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7030:1: ( ruleVar )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7030:1: ( ruleVar )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7031:1: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getNameVarParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVar_in_rule__Group__NameAssignment_214511);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7040:1: rule__Group__IndexAssignment_4 : ( RULE_NUMINT ) ;
    public final void rule__Group__IndexAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7044:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7045:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7045:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7046:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getIndexNUMINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__Group__IndexAssignment_414542); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7055:1: rule__Group__ElementsAssignment_6 : ( ruleMessageField ) ;
    public final void rule__Group__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7059:1: ( ( ruleMessageField ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7060:1: ( ruleMessageField )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7060:1: ( ruleMessageField )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7061:1: ruleMessageField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getElementsMessageFieldParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleMessageField_in_rule__Group__ElementsAssignment_614573);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7070:1: rule__ComplexTypeLink__TargetAssignment : ( ( ruleVar_full ) ) ;
    public final void rule__ComplexTypeLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7074:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7075:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7075:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7076:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeCrossReference_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7077:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7078:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeVar_fullParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__ComplexTypeLink__TargetAssignment14608);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7089:1: rule__ScalarTypeLink__TargetAssignment : ( ruleScalarType ) ;
    public final void rule__ScalarTypeLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7093:1: ( ( ruleScalarType ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7094:1: ( ruleScalarType )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7094:1: ( ruleScalarType )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7095:1: ruleScalarType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeLinkAccess().getTargetScalarTypeEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleScalarType_in_rule__ScalarTypeLink__TargetAssignment14643);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7104:1: rule__FieldOptions__OptionsAssignment_1 : ( ruleFieldOption ) ;
    public final void rule__FieldOptions__OptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7108:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7109:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7109:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7110:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_114674);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7119:1: rule__FieldOptions__OptionsAssignment_2_1 : ( ruleFieldOption ) ;
    public final void rule__FieldOptions__OptionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7123:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7124:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7124:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7125:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_2_114705);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7134:1: rule__PackedValueFieldOption__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__PackedValueFieldOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7138:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7139:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7139:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7140:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__PackedValueFieldOption__ValueAssignment_214736);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7149:1: rule__DefaultValueFieldOption__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__DefaultValueFieldOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7153:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7154:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7154:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7155:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__DefaultValueFieldOption__ValueAssignment_214767);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7164:1: rule__NativeFieldOption__SourceAssignment_0 : ( ruleOptionSource ) ;
    public final void rule__NativeFieldOption__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7168:1: ( ( ruleOptionSource ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7169:1: ( ruleOptionSource )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7169:1: ( ruleOptionSource )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7170:1: ruleOptionSource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getSourceOptionSourceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleOptionSource_in_rule__NativeFieldOption__SourceAssignment_014798);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7179:1: rule__NativeFieldOption__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__NativeFieldOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7183:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7184:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7184:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7185:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__NativeFieldOption__ValueAssignment_214829);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7194:1: rule__OptionSource__TargetAssignment : ( ( ruleVar_full ) ) ;
    public final void rule__OptionSource__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7198:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7199:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7199:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7200:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceAccess().getTargetIndexedElementCrossReference_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7201:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7202:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceAccess().getTargetIndexedElementVar_fullParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__OptionSource__TargetAssignment14864);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7213:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7217:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7218:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7218:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7219:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_114899); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7228:1: rule__Enum__ElementsAssignment_3 : ( ruleEnumElement ) ;
    public final void rule__Enum__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7232:1: ( ( ruleEnumElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7233:1: ( ruleEnumElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7233:1: ( ruleEnumElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7234:1: ruleEnumElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleEnumElement_in_rule__Enum__ElementsAssignment_314930);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7243:1: rule__EnumField__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7247:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7248:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7248:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7249:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumField__NameAssignment_014961); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7258:1: rule__EnumField__IndexAssignment_2 : ( RULE_NUMINT ) ;
    public final void rule__EnumField__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7262:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7263:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7263:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7264:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getIndexNUMINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__EnumField__IndexAssignment_214992); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7273:1: rule__EnumField__OptionsAssignment_3_1 : ( ruleFieldOption ) ;
    public final void rule__EnumField__OptionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7277:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7278:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7278:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7279:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_115023);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7288:1: rule__EnumField__OptionsAssignment_3_2_1 : ( ruleFieldOption ) ;
    public final void rule__EnumField__OptionsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7292:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7293:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7293:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7294:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_2_115054);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7303:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7307:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7308:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7308:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7309:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_115085); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7318:1: rule__Service__ElementsAssignment_3 : ( ruleServiceElement ) ;
    public final void rule__Service__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7322:1: ( ( ruleServiceElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7323:1: ( ruleServiceElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7323:1: ( ruleServiceElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7324:1: ruleServiceElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getElementsServiceElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleServiceElement_in_rule__Service__ElementsAssignment_315116);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7333:1: rule__Rpc__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rpc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7337:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7338:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7338:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7339:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rpc__NameAssignment_115147); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7348:1: rule__Rpc__ArgTypeAssignment_3 : ( ruleMessageLink ) ;
    public final void rule__Rpc__ArgTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7352:1: ( ( ruleMessageLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7353:1: ( ruleMessageLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7353:1: ( ruleMessageLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7354:1: ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getArgTypeMessageLinkParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_rule__Rpc__ArgTypeAssignment_315178);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7363:1: rule__Rpc__ReturnTypeAssignment_7 : ( ruleMessageLink ) ;
    public final void rule__Rpc__ReturnTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7367:1: ( ( ruleMessageLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7368:1: ( ruleMessageLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7368:1: ( ruleMessageLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7369:1: ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getReturnTypeMessageLinkParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_rule__Rpc__ReturnTypeAssignment_715209);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7378:1: rule__Rpc__OptionsAssignment_9_1 : ( ruleOption ) ;
    public final void rule__Rpc__OptionsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7382:1: ( ( ruleOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7383:1: ( ruleOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7383:1: ( ruleOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7384:1: ruleOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getOptionsOptionParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_ruleOption_in_rule__Rpc__OptionsAssignment_9_115240);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7393:1: rule__MessageLink__TargetAssignment : ( ( ruleVar_full ) ) ;
    public final void rule__MessageLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7397:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7398:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7398:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7399:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkAccess().getTargetMessageCrossReference_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7400:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7401:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkAccess().getTargetMessageVar_fullParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__MessageLink__TargetAssignment15275);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7412:1: rule__Extend__TypeAssignment_1 : ( ( ruleVar_full ) ) ;
    public final void rule__Extend__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7416:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7417:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7417:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7418:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getTypeMessageCrossReference_1_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7419:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7420:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getTypeMessageVar_fullParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__Extend__TypeAssignment_115314);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7431:1: rule__Extend__ElementsAssignment_3 : ( ruleMessageElement ) ;
    public final void rule__Extend__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7435:1: ( ( ruleMessageElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7436:1: ( ruleMessageElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7436:1: ( ruleMessageElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7437:1: ruleMessageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getElementsMessageElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_rule__Extend__ElementsAssignment_315349);
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

    // $ANTLR start synpred7_InternalProtobuf
    public final void synpred7_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1593:1: ( ( ( ruleNativeOption ) ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1593:1: ( ( ruleNativeOption ) )
        {
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1593:1: ( ( ruleNativeOption ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1594:1: ( ruleNativeOption )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getOptionAccess().getNativeOptionParserRuleCall_0()); 
        }
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1595:1: ( ruleNativeOption )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1595:3: ruleNativeOption
        {
        pushFollow(FOLLOW_ruleNativeOption_in_synpred7_InternalProtobuf3354);
        ruleNativeOption();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalProtobuf

    // $ANTLR start synpred23_InternalProtobuf
    public final void synpred23_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1817:1: ( ( ( ruleScalarTypeLink ) ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1817:1: ( ( ruleScalarTypeLink ) )
        {
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1817:1: ( ( ruleScalarTypeLink ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1818:1: ( ruleScalarTypeLink )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTypeLinkAccess().getScalarTypeLinkParserRuleCall_0()); 
        }
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1819:1: ( ruleScalarTypeLink )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1819:3: ruleScalarTypeLink
        {
        pushFollow(FOLLOW_ruleScalarTypeLink_in_synpred23_InternalProtobuf3888);
        ruleScalarTypeLink();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred23_InternalProtobuf

    // $ANTLR start synpred24_InternalProtobuf
    public final void synpred24_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1839:1: ( ( ( rulePackedValueFieldOption ) ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1839:1: ( ( rulePackedValueFieldOption ) )
        {
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1839:1: ( ( rulePackedValueFieldOption ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1840:1: ( rulePackedValueFieldOption )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getFieldOptionAccess().getPackedValueFieldOptionParserRuleCall_0()); 
        }
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1841:1: ( rulePackedValueFieldOption )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1841:3: rulePackedValueFieldOption
        {
        pushFollow(FOLLOW_rulePackedValueFieldOption_in_synpred24_InternalProtobuf3939);
        rulePackedValueFieldOption();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred24_InternalProtobuf

    // $ANTLR start synpred25_InternalProtobuf
    public final void synpred25_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1845:6: ( ( ( ruleDefaultValueFieldOption ) ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1845:6: ( ( ruleDefaultValueFieldOption ) )
        {
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1845:6: ( ( ruleDefaultValueFieldOption ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1846:1: ( ruleDefaultValueFieldOption )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getFieldOptionAccess().getDefaultValueFieldOptionParserRuleCall_1()); 
        }
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1847:1: ( ruleDefaultValueFieldOption )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1847:3: ruleDefaultValueFieldOption
        {
        pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_synpred25_InternalProtobuf3958);
        ruleDefaultValueFieldOption();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred25_InternalProtobuf

    // Delegated rules

    public final boolean synpred24_InternalProtobuf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalProtobuf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalProtobuf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalProtobuf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalProtobuf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalProtobuf_fragment(); // can never throw exception
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\15\uffff";
    static final String DFA3_minS =
        "\1\21\1\4\1\63\1\uffff\1\4\6\64\1\0\1\uffff";
    static final String DFA3_maxS =
        "\1\21\1\60\1\76\1\uffff\1\62\6\64\1\0\1\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\1\10\uffff\1\2";
    static final String DFA3_specialS =
        "\13\uffff\1\0\1\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2\10\uffff\44\3",
            "\1\4\12\uffff\1\3",
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
            return "1588:1: rule__Option__Alternatives : ( ( ( ruleNativeOption ) ) | ( ruleCustomOption ) );";
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
                        if ( (synpred7_InternalProtobuf()) ) {s = 3;}

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
        "\1\25\3\4\1\uffff\1\4\45\63\1\6\1\64\1\uffff";
    static final String DFA9_maxS =
        "\1\27\3\60\1\uffff\1\60\45\63\1\6\1\72\1\uffff";
    static final String DFA9_acceptS =
        "\4\uffff\1\1\50\uffff\1\2";
    static final String DFA9_specialS =
        "\56\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\1\1\3",
            "\1\4\10\uffff\15\4\1\5\26\4",
            "\1\4\10\uffff\15\4\1\5\26\4",
            "\1\4\10\uffff\15\4\1\5\26\4",
            "",
            "\1\6\10\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52",
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
            "\1\4\1\uffff\1\55\3\uffff\1\4",
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
            return "1768:1: rule__IndexedElement__Alternatives : ( ( ruleMessageField ) | ( ruleGroup ) );";
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
        "\1\uffff\1\5\1\4\1\7\1\16\1\2\1\1\1\3\1\12\1\14\1\13\1\0\1\6\1\11\1\10\1\15\2\uffff}>";
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
            return "1812:1: rule__TypeLink__Alternatives : ( ( ( ruleScalarTypeLink ) ) | ( ruleComplexTypeLink ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_11 = input.LA(1);

                         
                        int index11_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_12 = input.LA(1);

                         
                        int index11_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_14 = input.LA(1);

                         
                        int index11_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_14);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_13 = input.LA(1);

                         
                        int index11_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_13);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_10);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA11_15 = input.LA(1);

                         
                        int index11_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_4);
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
        "\1\4\2\63\1\uffff\2\4\14\0\2\uffff";
    static final String DFA12_maxS =
        "\1\60\2\63\1\uffff\2\62\14\0\2\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\3\16\uffff\1\1\1\2";
    static final String DFA12_specialS =
        "\6\uffff\1\1\1\7\1\11\1\12\1\10\1\4\1\6\1\0\1\2\1\3\1\13\1\5\2\uffff}>";
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
            return "1834:1: rule__FieldOption__Alternatives : ( ( ( rulePackedValueFieldOption ) ) | ( ( ruleDefaultValueFieldOption ) ) | ( ruleNativeFieldOption ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_13 = input.LA(1);

                         
                        int index12_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_14 = input.LA(1);

                         
                        int index12_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_15 = input.LA(1);

                         
                        int index12_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_11 = input.LA(1);

                         
                        int index12_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_11);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_17 = input.LA(1);

                         
                        int index12_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_12 = input.LA(1);

                         
                        int index12_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_10 = input.LA(1);

                         
                        int index12_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_16 = input.LA(1);

                         
                        int index12_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_16);
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
    public static final BitSet FOLLOW_rule__Option__Alternatives_in_ruleOption520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeOption_in_entryRuleNativeOption547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeOption554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__0_in_ruleNativeOption580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_entryRuleCustomOption607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomOption614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__0_in_ruleCustomOption640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_ruleValue700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_entryRuleSimpleValueLink726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValueLink733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleValueLink__Alternatives_in_ruleSimpleValueLink759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomIdLink_in_entryRuleCustomIdLink786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomIdLink793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomIdLink__TargetAssignment_in_ruleCustomIdLink819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_entryRuleStringLink846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLink853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLink__TargetAssignment_in_ruleStringLink879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLink913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLink__TargetAssignment_in_ruleBooleanLink939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_entryRuleNumberLink966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLink973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLink__Alternatives_in_ruleNumberLink999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_entryRuleIntLink1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLink1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLink__TargetAssignment_in_ruleIntLink1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLink1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLink__TargetAssignment_in_ruleDoubleLink1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Alternatives_in_ruleComplexType1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensibleType1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensibleType__Alternatives_in_ruleExtensibleType1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0_in_ruleMessage1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_entryRuleMessageElement1326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageElement1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageElement__Alternatives_in_ruleMessageElement1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneof_in_entryRuleOneof1386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneof1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__Group__0_in_ruleOneof1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneofField_in_entryRuleOneofField1446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneofField1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__0_in_ruleOneofField1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedElement1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexedElement__Alternatives_in_ruleIndexedElement1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange1566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionRange1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__0_in_ruleExtensionRange1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange1626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0_in_ruleRange1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_entryRuleMessageField1686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageField1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__0_in_ruleMessageField1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0_in_ruleGroup1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_entryRuleTypeLink1806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLink1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeLink__Alternatives_in_ruleTypeLink1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink1866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLink1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLink__TargetAssignment_in_ruleComplexTypeLink1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink1926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarTypeLink1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScalarTypeLink__TargetAssignment_in_ruleScalarTypeLink1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions1986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOptions1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__0_in_ruleFieldOptions2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_entryRuleFieldOption2046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOption2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOption__Alternatives_in_ruleFieldOption2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackedValueFieldOption_in_entryRulePackedValueFieldOption2106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackedValueFieldOption2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__0_in_rulePackedValueFieldOption2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption2166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValueFieldOption2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__0_in_ruleDefaultValueFieldOption2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption2226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeFieldOption2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__0_in_ruleNativeFieldOption2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_entryRuleOptionSource2286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionSource2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionSource__TargetAssignment_in_ruleOptionSource2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum2346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_entryRuleEnumElement2406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumElement2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumElement__Alternatives_in_ruleEnumElement2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_entryRuleEnumField2466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumField2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__0_in_ruleEnumField2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService2526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceElement_in_entryRuleServiceElement2586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceElement2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceElement__Alternatives_in_ruleServiceElement2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_entryRuleRpc2646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRpc2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__0_in_ruleRpc2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_entryRuleMessageLink2706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageLink2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageLink__TargetAssignment_in_ruleMessageLink2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_entryRuleExtend2766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtend2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__0_in_ruleExtend2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_entryRuleVar_full2826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar_full2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var_full__Alternatives_in_ruleVar_full2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar2886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Alternatives_in_ruleVar2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID2946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFULL_ID2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__0_in_ruleFULL_ID2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_entryRuleVarReserved3006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarReserved3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarReserved__Alternatives_in_ruleVarReserved3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__Alternatives_in_ruleModifier3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScalarType__Alternatives_in_ruleScalarType3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Statement__Alternatives3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Statement__Alternatives3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_rule__Statement__Alternatives3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_rule__Statement__Alternatives3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Statement__Alternatives3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_rule__Statement__Alternatives3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicImport_in_rule__Import__Alternatives3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakImport_in_rule__Import__Alternatives3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeOption_in_rule__Option__Alternatives3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_rule__Option__Alternatives3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_rule__SimpleValueLink__Alternatives3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_rule__SimpleValueLink__Alternatives3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_rule__SimpleValueLink__Alternatives3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomIdLink_in_rule__SimpleValueLink__Alternatives3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_rule__NumberLink__Alternatives3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_rule__NumberLink__Alternatives3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__ComplexType__Alternatives3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_rule__ComplexType__Alternatives3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__ExtensibleType__Alternatives3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__ExtensibleType__Alternatives3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__MessageElement__Alternatives3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_rule__MessageElement__Alternatives3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneof_in_rule__MessageElement__Alternatives3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__MessageElement__Alternatives3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__MessageElement__Alternatives3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_rule__MessageElement__Alternatives3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_rule__MessageElement__Alternatives3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__MessageElement__Alternatives3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_rule__IndexedElement__Alternatives3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__IndexedElement__Alternatives3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__ToAssignment_1_1_0_in_rule__Range__Alternatives_1_13836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__MaxAssignment_1_1_1_in_rule__Range__Alternatives_1_13854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_rule__TypeLink__Alternatives3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_rule__TypeLink__Alternatives3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackedValueFieldOption_in_rule__FieldOption__Alternatives3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_rule__FieldOption__Alternatives3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_rule__FieldOption__Alternatives3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_rule__EnumElement__Alternatives4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_rule__EnumElement__Alternatives4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_rule__ServiceElement__Alternatives4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__ServiceElement__Alternatives4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_rule__Var_full__Alternatives4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Var_full__Alternatives4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Var__Alternatives4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_rule__Var__Alternatives4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VarReserved__Alternatives4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__VarReserved__Alternatives4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__VarReserved__Alternatives4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VarReserved__Alternatives4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VarReserved__Alternatives4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__VarReserved__Alternatives4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VarReserved__Alternatives4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VarReserved__Alternatives4347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VarReserved__Alternatives4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VarReserved__Alternatives4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VarReserved__Alternatives4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__VarReserved__Alternatives4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__VarReserved__Alternatives4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__VarReserved__Alternatives4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__VarReserved__Alternatives4487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__VarReserved__Alternatives4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VarReserved__Alternatives4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__VarReserved__Alternatives4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__VarReserved__Alternatives4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__VarReserved__Alternatives4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__VarReserved__Alternatives4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__VarReserved__Alternatives4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__VarReserved__Alternatives4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__VarReserved__Alternatives4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__VarReserved__Alternatives4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__VarReserved__Alternatives4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__VarReserved__Alternatives4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__VarReserved__Alternatives4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__VarReserved__Alternatives4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__VarReserved__Alternatives4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__VarReserved__Alternatives4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__VarReserved__Alternatives4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__VarReserved__Alternatives4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__VarReserved__Alternatives4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__VarReserved__Alternatives4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__VarReserved__Alternatives4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__BOOL__Alternatives4943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__BOOL__Alternatives4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Modifier__Alternatives5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Modifier__Alternatives5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Modifier__Alternatives5042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ScalarType__Alternatives5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ScalarType__Alternatives5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ScalarType__Alternatives5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ScalarType__Alternatives5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ScalarType__Alternatives5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ScalarType__Alternatives5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ScalarType__Alternatives5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ScalarType__Alternatives5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ScalarType__Alternatives5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ScalarType__Alternatives5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ScalarType__Alternatives5288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ScalarType__Alternatives5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ScalarType__Alternatives5330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ScalarType__Alternatives5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ScalarType__Alternatives5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group__0__Impl_in_rule__Proto__Group__05405 = new BitSet(new long[]{0x0000000002FF4000L});
    public static final BitSet FOLLOW_rule__Proto__Group__1_in_rule__Proto__Group__05408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__SyntaxAssignment_0_in_rule__Proto__Group__0__Impl5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group__1__Impl_in_rule__Proto__Group__15466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__StatementsAssignment_1_in_rule__Proto__Group__1__Impl5493 = new BitSet(new long[]{0x0000000002FF4002L});
    public static final BitSet FOLLOW_rule__Syntax__Group__0__Impl_in_rule__Syntax__Group__05528 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Syntax__Group__1_in_rule__Syntax__Group__05531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Syntax__Group__0__Impl5559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group__1__Impl_in_rule__Syntax__Group__15590 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Syntax__Group__2_in_rule__Syntax__Group__15593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Syntax__Group__1__Impl5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group__2__Impl_in_rule__Syntax__Group__25652 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Syntax__Group__3_in_rule__Syntax__Group__25655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__NameAssignment_2_in_rule__Syntax__Group__2__Impl5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group__3__Impl_in_rule__Syntax__Group__35712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Syntax__Group__3__Impl5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__05779 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__05782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Package__Group__0__Impl5810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__15841 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__15844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__25901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Package__Group__2__Impl5929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__0__Impl_in_rule__PublicImport__Group__05966 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__1_in_rule__PublicImport__Group__05969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PublicImport__Group__0__Impl5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__1__Impl_in_rule__PublicImport__Group__16028 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__2_in_rule__PublicImport__Group__16031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__PublicImport__Group__1__Impl6059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__2__Impl_in_rule__PublicImport__Group__26090 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__3_in_rule__PublicImport__Group__26093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__ImportURIAssignment_2_in_rule__PublicImport__Group__2__Impl6120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__3__Impl_in_rule__PublicImport__Group__36150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__PublicImport__Group__3__Impl6178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__0__Impl_in_rule__WeakImport__Group__06217 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__1_in_rule__WeakImport__Group__06220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WeakImport__Group__0__Impl6248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__1__Impl_in_rule__WeakImport__Group__16279 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__2_in_rule__WeakImport__Group__16282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__WeakImport__Group__1__Impl6311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__2__Impl_in_rule__WeakImport__Group__26344 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__3_in_rule__WeakImport__Group__26347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__ImportURIAssignment_2_in_rule__WeakImport__Group__2__Impl6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__3__Impl_in_rule__WeakImport__Group__36404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__WeakImport__Group__3__Impl6432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__0__Impl_in_rule__NativeOption__Group__06471 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__1_in_rule__NativeOption__Group__06474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NativeOption__Group__0__Impl6502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__1__Impl_in_rule__NativeOption__Group__16533 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__2_in_rule__NativeOption__Group__16536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__SourceAssignment_1_in_rule__NativeOption__Group__1__Impl6563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__2__Impl_in_rule__NativeOption__Group__26593 = new BitSet(new long[]{0x00060000000000F0L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__3_in_rule__NativeOption__Group__26596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__NativeOption__Group__2__Impl6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__3__Impl_in_rule__NativeOption__Group__36655 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__4_in_rule__NativeOption__Group__36658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__ValueAssignment_3_in_rule__NativeOption__Group__3__Impl6685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__4__Impl_in_rule__NativeOption__Group__46715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__NativeOption__Group__4__Impl6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__0__Impl_in_rule__CustomOption__Group__06784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__1_in_rule__CustomOption__Group__06787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CustomOption__Group__0__Impl6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__1__Impl_in_rule__CustomOption__Group__16846 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__2_in_rule__CustomOption__Group__16849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__SourceAssignment_1_in_rule__CustomOption__Group__1__Impl6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__2__Impl_in_rule__CustomOption__Group__26906 = new BitSet(new long[]{0x00060000000000F0L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__3_in_rule__CustomOption__Group__26909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__CustomOption__Group__2__Impl6937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__3__Impl_in_rule__CustomOption__Group__36968 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__4_in_rule__CustomOption__Group__36971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__ValueAssignment_3_in_rule__CustomOption__Group__3__Impl6998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__4__Impl_in_rule__CustomOption__Group__47028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__CustomOption__Group__4__Impl7056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__07097 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__07100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Message__Group__0__Impl7128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__17159 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Message__Group__2_in_rule__Message__Group__17162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__NameAssignment_1_in_rule__Message__Group__1__Impl7189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__27219 = new BitSet(new long[]{0x0180000003FF4000L});
    public static final BitSet FOLLOW_rule__Message__Group__3_in_rule__Message__Group__27222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Message__Group__2__Impl7250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__37281 = new BitSet(new long[]{0x0180000003FF4000L});
    public static final BitSet FOLLOW_rule__Message__Group__4_in_rule__Message__Group__37284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__ElementsAssignment_3_in_rule__Message__Group__3__Impl7311 = new BitSet(new long[]{0x0100000003FF4002L});
    public static final BitSet FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__47342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Message__Group__4__Impl7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__Group__0__Impl_in_rule__Oneof__Group__07411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Oneof__Group__1_in_rule__Oneof__Group__07414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Oneof__Group__0__Impl7442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__Group__1__Impl_in_rule__Oneof__Group__17473 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Oneof__Group__2_in_rule__Oneof__Group__17476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__NameAssignment_1_in_rule__Oneof__Group__1__Impl7503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__Group__2__Impl_in_rule__Oneof__Group__27533 = new BitSet(new long[]{0x0081FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Oneof__Group__3_in_rule__Oneof__Group__27536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Oneof__Group__2__Impl7564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__Group__3__Impl_in_rule__Oneof__Group__37595 = new BitSet(new long[]{0x0081FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Oneof__Group__4_in_rule__Oneof__Group__37598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__FieldsAssignment_3_in_rule__Oneof__Group__3__Impl7625 = new BitSet(new long[]{0x0001FFFFFFFFE012L});
    public static final BitSet FOLLOW_rule__Oneof__Group__4__Impl_in_rule__Oneof__Group__47656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Oneof__Group__4__Impl7684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__0__Impl_in_rule__OneofField__Group__07725 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__OneofField__Group__1_in_rule__OneofField__Group__07728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__TypeAssignment_0_in_rule__OneofField__Group__0__Impl7755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__1__Impl_in_rule__OneofField__Group__17785 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__OneofField__Group__2_in_rule__OneofField__Group__17788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__NameAssignment_1_in_rule__OneofField__Group__1__Impl7815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__2__Impl_in_rule__OneofField__Group__27845 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__OneofField__Group__3_in_rule__OneofField__Group__27848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__OneofField__Group__2__Impl7876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__3__Impl_in_rule__OneofField__Group__37907 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_rule__OneofField__Group__4_in_rule__OneofField__Group__37910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__IndexAssignment_3_in_rule__OneofField__Group__3__Impl7937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__4__Impl_in_rule__OneofField__Group__47967 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_rule__OneofField__Group__5_in_rule__OneofField__Group__47970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__OptionsAssignment_4_in_rule__OneofField__Group__4__Impl7997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__5__Impl_in_rule__OneofField__Group__58028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__OneofField__Group__5__Impl8056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__0__Impl_in_rule__ExtensionRange__Group__08099 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__1_in_rule__ExtensionRange__Group__08102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ExtensionRange__Group__0__Impl8130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__1__Impl_in_rule__ExtensionRange__Group__18161 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__2_in_rule__ExtensionRange__Group__18164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__RangesAssignment_1_in_rule__ExtensionRange__Group__1__Impl8191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__2__Impl_in_rule__ExtensionRange__Group__28221 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__3_in_rule__ExtensionRange__Group__28224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__0_in_rule__ExtensionRange__Group__2__Impl8251 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__3__Impl_in_rule__ExtensionRange__Group__38282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ExtensionRange__Group__3__Impl8310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__0__Impl_in_rule__ExtensionRange__Group_2__08349 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__1_in_rule__ExtensionRange__Group_2__08352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ExtensionRange__Group_2__0__Impl8380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__1__Impl_in_rule__ExtensionRange__Group_2__18411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__RangesAssignment_2_1_in_rule__ExtensionRange__Group_2__1__Impl8438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__08472 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Range__Group__1_in_rule__Range__Group__08475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__FromAssignment_0_in_rule__Range__Group__0__Impl8502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__18532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group_1__0_in_rule__Range__Group__1__Impl8559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group_1__0__Impl_in_rule__Range__Group_1__08594 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_rule__Range__Group_1__1_in_rule__Range__Group_1__08597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Range__Group_1__0__Impl8625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group_1__1__Impl_in_rule__Range__Group_1__18656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Alternatives_1_1_in_rule__Range__Group_1__1__Impl8683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__0__Impl_in_rule__MessageField__Group__08717 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__MessageField__Group__1_in_rule__MessageField__Group__08720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__ModifierAssignment_0_in_rule__MessageField__Group__0__Impl8747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__1__Impl_in_rule__MessageField__Group__18777 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__MessageField__Group__2_in_rule__MessageField__Group__18780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__TypeAssignment_1_in_rule__MessageField__Group__1__Impl8807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__2__Impl_in_rule__MessageField__Group__28837 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__MessageField__Group__3_in_rule__MessageField__Group__28840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__NameAssignment_2_in_rule__MessageField__Group__2__Impl8867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__3__Impl_in_rule__MessageField__Group__38897 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MessageField__Group__4_in_rule__MessageField__Group__38900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__MessageField__Group__3__Impl8928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__4__Impl_in_rule__MessageField__Group__48959 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_rule__MessageField__Group__5_in_rule__MessageField__Group__48962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__IndexAssignment_4_in_rule__MessageField__Group__4__Impl8989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__5__Impl_in_rule__MessageField__Group__59019 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_rule__MessageField__Group__6_in_rule__MessageField__Group__59022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__OptionsAssignment_5_in_rule__MessageField__Group__5__Impl9049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__6__Impl_in_rule__MessageField__Group__69080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__MessageField__Group__6__Impl9108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__09153 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__09156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__ModifierAssignment_0_in_rule__Group__Group__0__Impl9183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__19213 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__19216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Group__Group__1__Impl9244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__29275 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__29278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl9305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__39335 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__39338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Group__Group__3__Impl9366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__49397 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Group__Group__5_in_rule__Group__Group__49400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__IndexAssignment_4_in_rule__Group__Group__4__Impl9427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__59457 = new BitSet(new long[]{0x0080000000F40000L});
    public static final BitSet FOLLOW_rule__Group__Group__6_in_rule__Group__Group__59460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Group__Group__5__Impl9488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__6__Impl_in_rule__Group__Group__69519 = new BitSet(new long[]{0x0080000000F40000L});
    public static final BitSet FOLLOW_rule__Group__Group__7_in_rule__Group__Group__69522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__ElementsAssignment_6_in_rule__Group__Group__6__Impl9549 = new BitSet(new long[]{0x0000000000F40002L});
    public static final BitSet FOLLOW_rule__Group__Group__7__Impl_in_rule__Group__Group__79580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Group__Group__7__Impl9608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__0__Impl_in_rule__FieldOptions__Group__09655 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__1_in_rule__FieldOptions__Group__09658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__FieldOptions__Group__0__Impl9686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__1__Impl_in_rule__FieldOptions__Group__19717 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__2_in_rule__FieldOptions__Group__19720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__OptionsAssignment_1_in_rule__FieldOptions__Group__1__Impl9747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__2__Impl_in_rule__FieldOptions__Group__29777 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__3_in_rule__FieldOptions__Group__29780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__0_in_rule__FieldOptions__Group__2__Impl9807 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__3__Impl_in_rule__FieldOptions__Group__39838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__FieldOptions__Group__3__Impl9866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__0__Impl_in_rule__FieldOptions__Group_2__09905 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__1_in_rule__FieldOptions__Group_2__09908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__FieldOptions__Group_2__0__Impl9936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__1__Impl_in_rule__FieldOptions__Group_2__19967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__OptionsAssignment_2_1_in_rule__FieldOptions__Group_2__1__Impl9994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__0__Impl_in_rule__PackedValueFieldOption__Group__010028 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__1_in_rule__PackedValueFieldOption__Group__010031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__PackedValueFieldOption__Group__0__Impl10060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__1__Impl_in_rule__PackedValueFieldOption__Group__110092 = new BitSet(new long[]{0x00060000000000F0L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__2_in_rule__PackedValueFieldOption__Group__110095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__PackedValueFieldOption__Group__1__Impl10123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__2__Impl_in_rule__PackedValueFieldOption__Group__210154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__ValueAssignment_2_in_rule__PackedValueFieldOption__Group__2__Impl10181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__0__Impl_in_rule__DefaultValueFieldOption__Group__010217 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__1_in_rule__DefaultValueFieldOption__Group__010220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DefaultValueFieldOption__Group__0__Impl10249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__1__Impl_in_rule__DefaultValueFieldOption__Group__110281 = new BitSet(new long[]{0x00060000000000F0L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__2_in_rule__DefaultValueFieldOption__Group__110284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__DefaultValueFieldOption__Group__1__Impl10312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__2__Impl_in_rule__DefaultValueFieldOption__Group__210343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__ValueAssignment_2_in_rule__DefaultValueFieldOption__Group__2__Impl10370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__0__Impl_in_rule__NativeFieldOption__Group__010406 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__1_in_rule__NativeFieldOption__Group__010409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__SourceAssignment_0_in_rule__NativeFieldOption__Group__0__Impl10436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__1__Impl_in_rule__NativeFieldOption__Group__110466 = new BitSet(new long[]{0x00060000000000F0L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__2_in_rule__NativeFieldOption__Group__110469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__NativeFieldOption__Group__1__Impl10497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__2__Impl_in_rule__NativeFieldOption__Group__210528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__ValueAssignment_2_in_rule__NativeFieldOption__Group__2__Impl10555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__010591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__010594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Enum__Group__0__Impl10622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__110653 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__110656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl10683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__210713 = new BitSet(new long[]{0x0080000002FF4010L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__210716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Enum__Group__2__Impl10744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__310775 = new BitSet(new long[]{0x0080000002FF4010L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__310778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__ElementsAssignment_3_in_rule__Enum__Group__3__Impl10805 = new BitSet(new long[]{0x0000000002FF4012L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__410836 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__410839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Enum__Group__4__Impl10867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__510898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Enum__Group__5__Impl10927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__0__Impl_in_rule__EnumField__Group__010972 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__1_in_rule__EnumField__Group__010975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__NameAssignment_0_in_rule__EnumField__Group__0__Impl11002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__1__Impl_in_rule__EnumField__Group__111032 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumField__Group__2_in_rule__EnumField__Group__111035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__EnumField__Group__1__Impl11063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__2__Impl_in_rule__EnumField__Group__211094 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__3_in_rule__EnumField__Group__211097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__IndexAssignment_2_in_rule__EnumField__Group__2__Impl11124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__3__Impl_in_rule__EnumField__Group__311154 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__4_in_rule__EnumField__Group__311157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__0_in_rule__EnumField__Group__3__Impl11184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__4__Impl_in_rule__EnumField__Group__411215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__EnumField__Group__4__Impl11243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__0__Impl_in_rule__EnumField__Group_3__011284 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__1_in_rule__EnumField__Group_3__011287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__EnumField__Group_3__0__Impl11315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__1__Impl_in_rule__EnumField__Group_3__111346 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__2_in_rule__EnumField__Group_3__111349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__OptionsAssignment_3_1_in_rule__EnumField__Group_3__1__Impl11376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__2__Impl_in_rule__EnumField__Group_3__211406 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__3_in_rule__EnumField__Group_3__211409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__0_in_rule__EnumField__Group_3__2__Impl11436 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__3__Impl_in_rule__EnumField__Group_3__311467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__EnumField__Group_3__3__Impl11495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__0__Impl_in_rule__EnumField__Group_3_2__011534 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__1_in_rule__EnumField__Group_3_2__011537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__EnumField__Group_3_2__0__Impl11565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__1__Impl_in_rule__EnumField__Group_3_2__111596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__OptionsAssignment_3_2_1_in_rule__EnumField__Group_3_2__1__Impl11623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__011657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__011660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Service__Group__0__Impl11688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__111719 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__111722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl11749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__211779 = new BitSet(new long[]{0x018000000BFF4000L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__211782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Service__Group__2__Impl11810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__311841 = new BitSet(new long[]{0x018000000BFF4000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__311844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__ElementsAssignment_3_in_rule__Service__Group__3__Impl11871 = new BitSet(new long[]{0x010000000BFF4002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__411902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Service__Group__4__Impl11930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__0__Impl_in_rule__Rpc__Group__011971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rpc__Group__1_in_rule__Rpc__Group__011974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Rpc__Group__0__Impl12003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__1__Impl_in_rule__Rpc__Group__112035 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__2_in_rule__Rpc__Group__112038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__NameAssignment_1_in_rule__Rpc__Group__1__Impl12065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__2__Impl_in_rule__Rpc__Group__212095 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Rpc__Group__3_in_rule__Rpc__Group__212098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Rpc__Group__2__Impl12126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__3__Impl_in_rule__Rpc__Group__312157 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__4_in_rule__Rpc__Group__312160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__ArgTypeAssignment_3_in_rule__Rpc__Group__3__Impl12187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__4__Impl_in_rule__Rpc__Group__412217 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__5_in_rule__Rpc__Group__412220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Rpc__Group__4__Impl12248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__5__Impl_in_rule__Rpc__Group__512279 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__6_in_rule__Rpc__Group__512282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Rpc__Group__5__Impl12310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__6__Impl_in_rule__Rpc__Group__612341 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Rpc__Group__7_in_rule__Rpc__Group__612344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Rpc__Group__6__Impl12372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__7__Impl_in_rule__Rpc__Group__712403 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__8_in_rule__Rpc__Group__712406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__ReturnTypeAssignment_7_in_rule__Rpc__Group__7__Impl12433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__8__Impl_in_rule__Rpc__Group__812463 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__9_in_rule__Rpc__Group__812466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Rpc__Group__8__Impl12494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__9__Impl_in_rule__Rpc__Group__912525 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__10_in_rule__Rpc__Group__912528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__0_in_rule__Rpc__Group__9__Impl12555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__10__Impl_in_rule__Rpc__Group__1012586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Rpc__Group__10__Impl12614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__0__Impl_in_rule__Rpc__Group_9__012667 = new BitSet(new long[]{0x0180000003FF4000L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__1_in_rule__Rpc__Group_9__012670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Rpc__Group_9__0__Impl12698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__1__Impl_in_rule__Rpc__Group_9__112729 = new BitSet(new long[]{0x0180000003FF4000L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__2_in_rule__Rpc__Group_9__112732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__OptionsAssignment_9_1_in_rule__Rpc__Group_9__1__Impl12759 = new BitSet(new long[]{0x0100000003FF4002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__2__Impl_in_rule__Rpc__Group_9__212790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Rpc__Group_9__2__Impl12818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__0__Impl_in_rule__Extend__Group__012855 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Extend__Group__1_in_rule__Extend__Group__012858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Extend__Group__0__Impl12887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__1__Impl_in_rule__Extend__Group__112919 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Extend__Group__2_in_rule__Extend__Group__112922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__TypeAssignment_1_in_rule__Extend__Group__1__Impl12949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__2__Impl_in_rule__Extend__Group__212979 = new BitSet(new long[]{0x0180000003FF4000L});
    public static final BitSet FOLLOW_rule__Extend__Group__3_in_rule__Extend__Group__212982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Extend__Group__2__Impl13010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__3__Impl_in_rule__Extend__Group__313041 = new BitSet(new long[]{0x0180000003FF4000L});
    public static final BitSet FOLLOW_rule__Extend__Group__4_in_rule__Extend__Group__313044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__ElementsAssignment_3_in_rule__Extend__Group__3__Impl13071 = new BitSet(new long[]{0x0100000003FF4002L});
    public static final BitSet FOLLOW_rule__Extend__Group__4__Impl_in_rule__Extend__Group__413102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Extend__Group__4__Impl13130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__0__Impl_in_rule__FULL_ID__Group__013171 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__1_in_rule__FULL_ID__Group__013174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FULL_ID__Group__0__Impl13201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__1__Impl_in_rule__FULL_ID__Group__113230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl13259 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl13271 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__0__Impl_in_rule__FULL_ID__Group_1__013308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__1_in_rule__FULL_ID__Group_1__013311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__FULL_ID__Group_1__0__Impl13339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__1__Impl_in_rule__FULL_ID__Group_1__113370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FULL_ID__Group_1__1__Impl13397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_rule__Proto__SyntaxAssignment_013436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Proto__StatementsAssignment_113467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Syntax__NameAssignment_213498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__Package__NameAssignment_113529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PublicImport__ImportURIAssignment_213560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__WeakImport__ImportURIAssignment_213591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__NativeOption__SourceAssignment_113626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__NativeOption__ValueAssignment_313661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomOption__SourceAssignment_113692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__CustomOption__ValueAssignment_313723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomIdLink__TargetAssignment13754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLink__TargetAssignment13785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__BooleanLink__TargetAssignment13816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__IntLink__TargetAssignment13847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMDOUBLE_in_rule__DoubleLink__TargetAssignment13878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__NameAssignment_113909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_rule__Message__ElementsAssignment_313940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Oneof__NameAssignment_113971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneofField_in_rule__Oneof__FieldsAssignment_314002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__OneofField__TypeAssignment_014033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__OneofField__NameAssignment_114064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__OneofField__IndexAssignment_314095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_rule__OneofField__OptionsAssignment_414126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_rule__ExtensionRange__RangesAssignment_114157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_rule__ExtensionRange__RangesAssignment_2_114188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__Range__FromAssignment_014219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__Range__ToAssignment_1_1_014250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Range__MaxAssignment_1_1_114286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__MessageField__ModifierAssignment_014325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__MessageField__TypeAssignment_114356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__MessageField__NameAssignment_214387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__MessageField__IndexAssignment_414418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_rule__MessageField__OptionsAssignment_514449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Group__ModifierAssignment_014480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Group__NameAssignment_214511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__Group__IndexAssignment_414542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_rule__Group__ElementsAssignment_614573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__ComplexTypeLink__TargetAssignment14608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarType_in_rule__ScalarTypeLink__TargetAssignment14643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_114674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_2_114705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__PackedValueFieldOption__ValueAssignment_214736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__DefaultValueFieldOption__ValueAssignment_214767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_rule__NativeFieldOption__SourceAssignment_014798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__NativeFieldOption__ValueAssignment_214829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__OptionSource__TargetAssignment14864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_114899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_rule__Enum__ElementsAssignment_314930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumField__NameAssignment_014961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__EnumField__IndexAssignment_214992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_115023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_2_115054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_115085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceElement_in_rule__Service__ElementsAssignment_315116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rpc__NameAssignment_115147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_rule__Rpc__ArgTypeAssignment_315178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_rule__Rpc__ReturnTypeAssignment_715209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Rpc__OptionsAssignment_9_115240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__MessageLink__TargetAssignment15275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__Extend__TypeAssignment_115314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_rule__Extend__ElementsAssignment_315349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeOption_in_synpred7_InternalProtobuf3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_synpred23_InternalProtobuf3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackedValueFieldOption_in_synpred24_InternalProtobuf3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_synpred25_InternalProtobuf3958 = new BitSet(new long[]{0x0000000000000002L});

}