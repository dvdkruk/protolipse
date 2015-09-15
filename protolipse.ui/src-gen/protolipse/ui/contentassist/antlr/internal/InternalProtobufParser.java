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


    // $ANTLR start "entryRuleImport"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:117:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:118:1: ( ruleImport EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:119:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport187);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport194); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:126:1: ruleImport : ( ( rule__Import__Alternatives ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:130:2: ( ( ( rule__Import__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:131:1: ( ( rule__Import__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:131:1: ( ( rule__Import__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:132:1: ( rule__Import__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:133:1: ( rule__Import__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:133:2: rule__Import__Alternatives
            {
            pushFollow(FOLLOW_rule__Import__Alternatives_in_ruleImport220);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:145:1: entryRulePublicImport : rulePublicImport EOF ;
    public final void entryRulePublicImport() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:146:1: ( rulePublicImport EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:147:1: rulePublicImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportRule()); 
            }
            pushFollow(FOLLOW_rulePublicImport_in_entryRulePublicImport247);
            rulePublicImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPublicImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePublicImport254); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:154:1: rulePublicImport : ( ( rule__PublicImport__Group__0 ) ) ;
    public final void rulePublicImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:158:2: ( ( ( rule__PublicImport__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:159:1: ( ( rule__PublicImport__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:159:1: ( ( rule__PublicImport__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:160:1: ( rule__PublicImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:161:1: ( rule__PublicImport__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:161:2: rule__PublicImport__Group__0
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__0_in_rulePublicImport280);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:173:1: entryRuleWeakImport : ruleWeakImport EOF ;
    public final void entryRuleWeakImport() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:174:1: ( ruleWeakImport EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:175:1: ruleWeakImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportRule()); 
            }
            pushFollow(FOLLOW_ruleWeakImport_in_entryRuleWeakImport307);
            ruleWeakImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeakImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeakImport314); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:182:1: ruleWeakImport : ( ( rule__WeakImport__Group__0 ) ) ;
    public final void ruleWeakImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:186:2: ( ( ( rule__WeakImport__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:187:1: ( ( rule__WeakImport__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:187:1: ( ( rule__WeakImport__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:188:1: ( rule__WeakImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:189:1: ( rule__WeakImport__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:189:2: rule__WeakImport__Group__0
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__0_in_ruleWeakImport340);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:210:1: ruleOption : ( ( rule__Option__Alternatives ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:214:2: ( ( ( rule__Option__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:215:1: ( ( rule__Option__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:215:1: ( ( rule__Option__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:216:1: ( rule__Option__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:217:1: ( rule__Option__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:217:2: rule__Option__Alternatives
            {
            pushFollow(FOLLOW_rule__Option__Alternatives_in_ruleOption400);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:229:1: entryRuleNativeOption : ruleNativeOption EOF ;
    public final void entryRuleNativeOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:230:1: ( ruleNativeOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:231:1: ruleNativeOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionRule()); 
            }
            pushFollow(FOLLOW_ruleNativeOption_in_entryRuleNativeOption427);
            ruleNativeOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeOption434); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:238:1: ruleNativeOption : ( ( rule__NativeOption__Group__0 ) ) ;
    public final void ruleNativeOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:242:2: ( ( ( rule__NativeOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:243:1: ( ( rule__NativeOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:243:1: ( ( rule__NativeOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:244:1: ( rule__NativeOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:245:1: ( rule__NativeOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:245:2: rule__NativeOption__Group__0
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__0_in_ruleNativeOption460);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:257:1: entryRuleCustomOption : ruleCustomOption EOF ;
    public final void entryRuleCustomOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:258:1: ( ruleCustomOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:259:1: ruleCustomOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionRule()); 
            }
            pushFollow(FOLLOW_ruleCustomOption_in_entryRuleCustomOption487);
            ruleCustomOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomOption494); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:266:1: ruleCustomOption : ( ( rule__CustomOption__Group__0 ) ) ;
    public final void ruleCustomOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:270:2: ( ( ( rule__CustomOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:271:1: ( ( rule__CustomOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:271:1: ( ( rule__CustomOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:272:1: ( rule__CustomOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:273:1: ( rule__CustomOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:273:2: rule__CustomOption__Group__0
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__0_in_ruleCustomOption520);
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


    // $ANTLR start "entryRuleCustomIdLink"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:341:1: entryRuleCustomIdLink : ruleCustomIdLink EOF ;
    public final void entryRuleCustomIdLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:342:1: ( ruleCustomIdLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:343:1: ruleCustomIdLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomIdLinkRule()); 
            }
            pushFollow(FOLLOW_ruleCustomIdLink_in_entryRuleCustomIdLink666);
            ruleCustomIdLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomIdLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomIdLink673); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:350:1: ruleCustomIdLink : ( ( rule__CustomIdLink__TargetAssignment ) ) ;
    public final void ruleCustomIdLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:354:2: ( ( ( rule__CustomIdLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:355:1: ( ( rule__CustomIdLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:355:1: ( ( rule__CustomIdLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:356:1: ( rule__CustomIdLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomIdLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:357:1: ( rule__CustomIdLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:357:2: rule__CustomIdLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__CustomIdLink__TargetAssignment_in_ruleCustomIdLink699);
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


    // $ANTLR start "entryRuleOneof"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:621:1: entryRuleOneof : ruleOneof EOF ;
    public final void entryRuleOneof() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:622:1: ( ruleOneof EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:623:1: ruleOneof EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofRule()); 
            }
            pushFollow(FOLLOW_ruleOneof_in_entryRuleOneof1266);
            ruleOneof();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneof1273); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:630:1: ruleOneof : ( ( rule__Oneof__Group__0 ) ) ;
    public final void ruleOneof() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:634:2: ( ( ( rule__Oneof__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:635:1: ( ( rule__Oneof__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:635:1: ( ( rule__Oneof__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:636:1: ( rule__Oneof__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:637:1: ( rule__Oneof__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:637:2: rule__Oneof__Group__0
            {
            pushFollow(FOLLOW_rule__Oneof__Group__0_in_ruleOneof1299);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:649:1: entryRuleOneofField : ruleOneofField EOF ;
    public final void entryRuleOneofField() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:650:1: ( ruleOneofField EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:651:1: ruleOneofField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldRule()); 
            }
            pushFollow(FOLLOW_ruleOneofField_in_entryRuleOneofField1326);
            ruleOneofField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneofFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneofField1333); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:658:1: ruleOneofField : ( ( rule__OneofField__Group__0 ) ) ;
    public final void ruleOneofField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:662:2: ( ( ( rule__OneofField__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:663:1: ( ( rule__OneofField__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:663:1: ( ( rule__OneofField__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:664:1: ( rule__OneofField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:665:1: ( rule__OneofField__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:665:2: rule__OneofField__Group__0
            {
            pushFollow(FOLLOW_rule__OneofField__Group__0_in_ruleOneofField1359);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:677:1: entryRuleIndexedElement : ruleIndexedElement EOF ;
    public final void entryRuleIndexedElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:678:1: ( ruleIndexedElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:679:1: ruleIndexedElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexedElementRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement1386);
            ruleIndexedElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexedElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedElement1393); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:686:1: ruleIndexedElement : ( ( rule__IndexedElement__Alternatives ) ) ;
    public final void ruleIndexedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:690:2: ( ( ( rule__IndexedElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:691:1: ( ( rule__IndexedElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:691:1: ( ( rule__IndexedElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:692:1: ( rule__IndexedElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexedElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:693:1: ( rule__IndexedElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:693:2: rule__IndexedElement__Alternatives
            {
            pushFollow(FOLLOW_rule__IndexedElement__Alternatives_in_ruleIndexedElement1419);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:705:1: entryRuleExtensionRange : ruleExtensionRange EOF ;
    public final void entryRuleExtensionRange() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:706:1: ( ruleExtensionRange EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:707:1: ruleExtensionRange EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange1446);
            ruleExtensionRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionRangeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionRange1453); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:714:1: ruleExtensionRange : ( ( rule__ExtensionRange__Group__0 ) ) ;
    public final void ruleExtensionRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:718:2: ( ( ( rule__ExtensionRange__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:719:1: ( ( rule__ExtensionRange__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:719:1: ( ( rule__ExtensionRange__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:720:1: ( rule__ExtensionRange__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:721:1: ( rule__ExtensionRange__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:721:2: rule__ExtensionRange__Group__0
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__0_in_ruleExtensionRange1479);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:733:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:734:1: ( ruleRange EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:735:1: ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange1506);
            ruleRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange1513); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:742:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:746:2: ( ( ( rule__Range__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:747:1: ( ( rule__Range__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:747:1: ( ( rule__Range__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:748:1: ( rule__Range__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:749:1: ( rule__Range__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:749:2: rule__Range__Group__0
            {
            pushFollow(FOLLOW_rule__Range__Group__0_in_ruleRange1539);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:761:1: entryRuleMessageField : ruleMessageField EOF ;
    public final void entryRuleMessageField() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:762:1: ( ruleMessageField EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:763:1: ruleMessageField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldRule()); 
            }
            pushFollow(FOLLOW_ruleMessageField_in_entryRuleMessageField1566);
            ruleMessageField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageField1573); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:770:1: ruleMessageField : ( ( rule__MessageField__Group__0 ) ) ;
    public final void ruleMessageField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:774:2: ( ( ( rule__MessageField__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:775:1: ( ( rule__MessageField__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:775:1: ( ( rule__MessageField__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:776:1: ( rule__MessageField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:777:1: ( rule__MessageField__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:777:2: rule__MessageField__Group__0
            {
            pushFollow(FOLLOW_rule__MessageField__Group__0_in_ruleMessageField1599);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:789:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:790:1: ( ruleGroup EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:791:1: ruleGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupRule()); 
            }
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup1626);
            ruleGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup1633); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:798:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:802:2: ( ( ( rule__Group__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:803:1: ( ( rule__Group__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:803:1: ( ( rule__Group__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:804:1: ( rule__Group__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:805:1: ( rule__Group__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:805:2: rule__Group__Group__0
            {
            pushFollow(FOLLOW_rule__Group__Group__0_in_ruleGroup1659);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:817:1: entryRuleTypeLink : ruleTypeLink EOF ;
    public final void entryRuleTypeLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:818:1: ( ruleTypeLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:819:1: ruleTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_entryRuleTypeLink1686);
            ruleTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLink1693); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:826:1: ruleTypeLink : ( ( rule__TypeLink__Alternatives ) ) ;
    public final void ruleTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:830:2: ( ( ( rule__TypeLink__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:831:1: ( ( rule__TypeLink__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:831:1: ( ( rule__TypeLink__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:832:1: ( rule__TypeLink__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLinkAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:833:1: ( rule__TypeLink__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:833:2: rule__TypeLink__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeLink__Alternatives_in_ruleTypeLink1719);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:845:1: entryRuleComplexTypeLink : ruleComplexTypeLink EOF ;
    public final void entryRuleComplexTypeLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:846:1: ( ruleComplexTypeLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:847:1: ruleComplexTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink1746);
            ruleComplexTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLink1753); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:854:1: ruleComplexTypeLink : ( ( rule__ComplexTypeLink__TargetAssignment ) ) ;
    public final void ruleComplexTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:858:2: ( ( ( rule__ComplexTypeLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:859:1: ( ( rule__ComplexTypeLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:859:1: ( ( rule__ComplexTypeLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:860:1: ( rule__ComplexTypeLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:861:1: ( rule__ComplexTypeLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:861:2: rule__ComplexTypeLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__ComplexTypeLink__TargetAssignment_in_ruleComplexTypeLink1779);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:873:1: entryRuleScalarTypeLink : ruleScalarTypeLink EOF ;
    public final void entryRuleScalarTypeLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:874:1: ( ruleScalarTypeLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:875:1: ruleScalarTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink1806);
            ruleScalarTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScalarTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarTypeLink1813); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:882:1: ruleScalarTypeLink : ( ( rule__ScalarTypeLink__TargetAssignment ) ) ;
    public final void ruleScalarTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:886:2: ( ( ( rule__ScalarTypeLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:887:1: ( ( rule__ScalarTypeLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:887:1: ( ( rule__ScalarTypeLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:888:1: ( rule__ScalarTypeLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:889:1: ( rule__ScalarTypeLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:889:2: rule__ScalarTypeLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__ScalarTypeLink__TargetAssignment_in_ruleScalarTypeLink1839);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:901:1: entryRuleFieldOptions : ruleFieldOptions EOF ;
    public final void entryRuleFieldOptions() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:902:1: ( ruleFieldOptions EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:903:1: ruleFieldOptions EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions1866);
            ruleFieldOptions();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOptions1873); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:910:1: ruleFieldOptions : ( ( rule__FieldOptions__Group__0 ) ) ;
    public final void ruleFieldOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:914:2: ( ( ( rule__FieldOptions__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:915:1: ( ( rule__FieldOptions__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:915:1: ( ( rule__FieldOptions__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:916:1: ( rule__FieldOptions__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:917:1: ( rule__FieldOptions__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:917:2: rule__FieldOptions__Group__0
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__0_in_ruleFieldOptions1899);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:929:1: entryRuleFieldOption : ruleFieldOption EOF ;
    public final void entryRuleFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:930:1: ( ruleFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:931:1: ruleFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_entryRuleFieldOption1926);
            ruleFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOption1933); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:938:1: ruleFieldOption : ( ( rule__FieldOption__Alternatives ) ) ;
    public final void ruleFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:942:2: ( ( ( rule__FieldOption__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:943:1: ( ( rule__FieldOption__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:943:1: ( ( rule__FieldOption__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:944:1: ( rule__FieldOption__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:945:1: ( rule__FieldOption__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:945:2: rule__FieldOption__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldOption__Alternatives_in_ruleFieldOption1959);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:957:1: entryRulePackedValueFieldOption : rulePackedValueFieldOption EOF ;
    public final void entryRulePackedValueFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:958:1: ( rulePackedValueFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:959:1: rulePackedValueFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionRule()); 
            }
            pushFollow(FOLLOW_rulePackedValueFieldOption_in_entryRulePackedValueFieldOption1986);
            rulePackedValueFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackedValueFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackedValueFieldOption1993); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:966:1: rulePackedValueFieldOption : ( ( rule__PackedValueFieldOption__Group__0 ) ) ;
    public final void rulePackedValueFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:970:2: ( ( ( rule__PackedValueFieldOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:971:1: ( ( rule__PackedValueFieldOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:971:1: ( ( rule__PackedValueFieldOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:972:1: ( rule__PackedValueFieldOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:973:1: ( rule__PackedValueFieldOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:973:2: rule__PackedValueFieldOption__Group__0
            {
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__0_in_rulePackedValueFieldOption2019);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:985:1: entryRuleDefaultValueFieldOption : ruleDefaultValueFieldOption EOF ;
    public final void entryRuleDefaultValueFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:986:1: ( ruleDefaultValueFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:987:1: ruleDefaultValueFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption2046);
            ruleDefaultValueFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultValueFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValueFieldOption2053); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:994:1: ruleDefaultValueFieldOption : ( ( rule__DefaultValueFieldOption__Group__0 ) ) ;
    public final void ruleDefaultValueFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:998:2: ( ( ( rule__DefaultValueFieldOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:999:1: ( ( rule__DefaultValueFieldOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:999:1: ( ( rule__DefaultValueFieldOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1000:1: ( rule__DefaultValueFieldOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1001:1: ( rule__DefaultValueFieldOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1001:2: rule__DefaultValueFieldOption__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__0_in_ruleDefaultValueFieldOption2079);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1013:1: entryRuleNativeFieldOption : ruleNativeFieldOption EOF ;
    public final void entryRuleNativeFieldOption() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1014:1: ( ruleNativeFieldOption EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1015:1: ruleNativeFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption2106);
            ruleNativeFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeFieldOption2113); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1022:1: ruleNativeFieldOption : ( ( rule__NativeFieldOption__Group__0 ) ) ;
    public final void ruleNativeFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1026:2: ( ( ( rule__NativeFieldOption__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1027:1: ( ( rule__NativeFieldOption__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1027:1: ( ( rule__NativeFieldOption__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1028:1: ( rule__NativeFieldOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1029:1: ( rule__NativeFieldOption__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1029:2: rule__NativeFieldOption__Group__0
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__0_in_ruleNativeFieldOption2139);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1041:1: entryRuleOptionSource : ruleOptionSource EOF ;
    public final void entryRuleOptionSource() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1042:1: ( ruleOptionSource EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1043:1: ruleOptionSource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceRule()); 
            }
            pushFollow(FOLLOW_ruleOptionSource_in_entryRuleOptionSource2166);
            ruleOptionSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionSourceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionSource2173); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1050:1: ruleOptionSource : ( ( rule__OptionSource__TargetAssignment ) ) ;
    public final void ruleOptionSource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1054:2: ( ( ( rule__OptionSource__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1055:1: ( ( rule__OptionSource__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1055:1: ( ( rule__OptionSource__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1056:1: ( rule__OptionSource__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1057:1: ( rule__OptionSource__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1057:2: rule__OptionSource__TargetAssignment
            {
            pushFollow(FOLLOW_rule__OptionSource__TargetAssignment_in_ruleOptionSource2199);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1069:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1070:1: ( ruleEnum EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1071:1: ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum2226);
            ruleEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum2233); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1078:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1082:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1083:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1083:1: ( ( rule__Enum__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1084:1: ( rule__Enum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1085:1: ( rule__Enum__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1085:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum2259);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1097:1: entryRuleEnumElement : ruleEnumElement EOF ;
    public final void entryRuleEnumElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1098:1: ( ruleEnumElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1099:1: ruleEnumElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumElementRule()); 
            }
            pushFollow(FOLLOW_ruleEnumElement_in_entryRuleEnumElement2286);
            ruleEnumElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumElement2293); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1106:1: ruleEnumElement : ( ( rule__EnumElement__Alternatives ) ) ;
    public final void ruleEnumElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1110:2: ( ( ( rule__EnumElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1111:1: ( ( rule__EnumElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1111:1: ( ( rule__EnumElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1112:1: ( rule__EnumElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1113:1: ( rule__EnumElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1113:2: rule__EnumElement__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumElement__Alternatives_in_ruleEnumElement2319);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1125:1: entryRuleEnumField : ruleEnumField EOF ;
    public final void entryRuleEnumField() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1126:1: ( ruleEnumField EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1127:1: ruleEnumField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldRule()); 
            }
            pushFollow(FOLLOW_ruleEnumField_in_entryRuleEnumField2346);
            ruleEnumField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumField2353); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1134:1: ruleEnumField : ( ( rule__EnumField__Group__0 ) ) ;
    public final void ruleEnumField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1138:2: ( ( ( rule__EnumField__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1139:1: ( ( rule__EnumField__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1139:1: ( ( rule__EnumField__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1140:1: ( rule__EnumField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1141:1: ( rule__EnumField__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1141:2: rule__EnumField__Group__0
            {
            pushFollow(FOLLOW_rule__EnumField__Group__0_in_ruleEnumField2379);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1153:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1154:1: ( ruleService EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1155:1: ruleService EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService2406);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService2413); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1162:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1166:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1167:1: ( ( rule__Service__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1167:1: ( ( rule__Service__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1168:1: ( rule__Service__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1169:1: ( rule__Service__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1169:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService2439);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1181:1: entryRuleServiceElement : ruleServiceElement EOF ;
    public final void entryRuleServiceElement() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1182:1: ( ruleServiceElement EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1183:1: ruleServiceElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceElementRule()); 
            }
            pushFollow(FOLLOW_ruleServiceElement_in_entryRuleServiceElement2466);
            ruleServiceElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceElement2473); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1190:1: ruleServiceElement : ( ( rule__ServiceElement__Alternatives ) ) ;
    public final void ruleServiceElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1194:2: ( ( ( rule__ServiceElement__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1195:1: ( ( rule__ServiceElement__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1195:1: ( ( rule__ServiceElement__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1196:1: ( rule__ServiceElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceElementAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1197:1: ( rule__ServiceElement__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1197:2: rule__ServiceElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ServiceElement__Alternatives_in_ruleServiceElement2499);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1209:1: entryRuleRpc : ruleRpc EOF ;
    public final void entryRuleRpc() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1210:1: ( ruleRpc EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1211:1: ruleRpc EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcRule()); 
            }
            pushFollow(FOLLOW_ruleRpc_in_entryRuleRpc2526);
            ruleRpc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRpcRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRpc2533); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1218:1: ruleRpc : ( ( rule__Rpc__Group__0 ) ) ;
    public final void ruleRpc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1222:2: ( ( ( rule__Rpc__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1223:1: ( ( rule__Rpc__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1223:1: ( ( rule__Rpc__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1224:1: ( rule__Rpc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1225:1: ( rule__Rpc__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1225:2: rule__Rpc__Group__0
            {
            pushFollow(FOLLOW_rule__Rpc__Group__0_in_ruleRpc2559);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1237:1: entryRuleMessageLink : ruleMessageLink EOF ;
    public final void entryRuleMessageLink() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1238:1: ( ruleMessageLink EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1239:1: ruleMessageLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkRule()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_entryRuleMessageLink2586);
            ruleMessageLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageLink2593); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1246:1: ruleMessageLink : ( ( rule__MessageLink__TargetAssignment ) ) ;
    public final void ruleMessageLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1250:2: ( ( ( rule__MessageLink__TargetAssignment ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1251:1: ( ( rule__MessageLink__TargetAssignment ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1251:1: ( ( rule__MessageLink__TargetAssignment ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1252:1: ( rule__MessageLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkAccess().getTargetAssignment()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1253:1: ( rule__MessageLink__TargetAssignment )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1253:2: rule__MessageLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__MessageLink__TargetAssignment_in_ruleMessageLink2619);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1265:1: entryRuleExtend : ruleExtend EOF ;
    public final void entryRuleExtend() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1266:1: ( ruleExtend EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1267:1: ruleExtend EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendRule()); 
            }
            pushFollow(FOLLOW_ruleExtend_in_entryRuleExtend2646);
            ruleExtend();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtend2653); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1274:1: ruleExtend : ( ( rule__Extend__Group__0 ) ) ;
    public final void ruleExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1278:2: ( ( ( rule__Extend__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1279:1: ( ( rule__Extend__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1279:1: ( ( rule__Extend__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1280:1: ( rule__Extend__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1281:1: ( rule__Extend__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1281:2: rule__Extend__Group__0
            {
            pushFollow(FOLLOW_rule__Extend__Group__0_in_ruleExtend2679);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1293:1: entryRuleVar_full : ruleVar_full EOF ;
    public final void entryRuleVar_full() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1294:1: ( ruleVar_full EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1295:1: ruleVar_full EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_fullRule()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_entryRuleVar_full2706);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_fullRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar_full2713); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1302:1: ruleVar_full : ( ( rule__Var_full__Alternatives ) ) ;
    public final void ruleVar_full() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1306:2: ( ( ( rule__Var_full__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1307:1: ( ( rule__Var_full__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1307:1: ( ( rule__Var_full__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1308:1: ( rule__Var_full__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_fullAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1309:1: ( rule__Var_full__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1309:2: rule__Var_full__Alternatives
            {
            pushFollow(FOLLOW_rule__Var_full__Alternatives_in_ruleVar_full2739);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1321:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1322:1: ( ruleVar EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1323:1: ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar2766);
            ruleVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar2773); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1330:1: ruleVar : ( ( rule__Var__Alternatives ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1334:2: ( ( ( rule__Var__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1335:1: ( ( rule__Var__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1335:1: ( ( rule__Var__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1336:1: ( rule__Var__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1337:1: ( rule__Var__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1337:2: rule__Var__Alternatives
            {
            pushFollow(FOLLOW_rule__Var__Alternatives_in_ruleVar2799);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1349:1: entryRuleFULL_ID : ruleFULL_ID EOF ;
    public final void entryRuleFULL_ID() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1350:1: ( ruleFULL_ID EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1351:1: ruleFULL_ID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDRule()); 
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID2826);
            ruleFULL_ID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFULL_IDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFULL_ID2833); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1358:1: ruleFULL_ID : ( ( rule__FULL_ID__Group__0 ) ) ;
    public final void ruleFULL_ID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1362:2: ( ( ( rule__FULL_ID__Group__0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1363:1: ( ( rule__FULL_ID__Group__0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1363:1: ( ( rule__FULL_ID__Group__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1364:1: ( rule__FULL_ID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getGroup()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1365:1: ( rule__FULL_ID__Group__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1365:2: rule__FULL_ID__Group__0
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group__0_in_ruleFULL_ID2859);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1377:1: entryRuleVarReserved : ruleVarReserved EOF ;
    public final void entryRuleVarReserved() throws RecognitionException {
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1378:1: ( ruleVarReserved EOF )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1379:1: ruleVarReserved EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReservedRule()); 
            }
            pushFollow(FOLLOW_ruleVarReserved_in_entryRuleVarReserved2886);
            ruleVarReserved();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarReservedRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarReserved2893); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1386:1: ruleVarReserved : ( ( rule__VarReserved__Alternatives ) ) ;
    public final void ruleVarReserved() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1390:2: ( ( ( rule__VarReserved__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1391:1: ( ( rule__VarReserved__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1391:1: ( ( rule__VarReserved__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1392:1: ( rule__VarReserved__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReservedAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1393:1: ( rule__VarReserved__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1393:2: rule__VarReserved__Alternatives
            {
            pushFollow(FOLLOW_rule__VarReserved__Alternatives_in_ruleVarReserved2919);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1408:1: ruleBOOL : ( ( rule__BOOL__Alternatives ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1412:1: ( ( ( rule__BOOL__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1413:1: ( ( rule__BOOL__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1413:1: ( ( rule__BOOL__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1414:1: ( rule__BOOL__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1415:1: ( rule__BOOL__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1415:2: rule__BOOL__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL2958);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1427:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1431:1: ( ( ( rule__Modifier__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1432:1: ( ( rule__Modifier__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1432:1: ( ( rule__Modifier__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1433:1: ( rule__Modifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModifierAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1434:1: ( rule__Modifier__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1434:2: rule__Modifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Modifier__Alternatives_in_ruleModifier2994);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1446:1: ruleScalarType : ( ( rule__ScalarType__Alternatives ) ) ;
    public final void ruleScalarType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1450:1: ( ( ( rule__ScalarType__Alternatives ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1451:1: ( ( rule__ScalarType__Alternatives ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1451:1: ( ( rule__ScalarType__Alternatives ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1452:1: ( rule__ScalarType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeAccess().getAlternatives()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1453:1: ( rule__ScalarType__Alternatives )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1453:2: rule__ScalarType__Alternatives
            {
            pushFollow(FOLLOW_rule__ScalarType__Alternatives_in_ruleScalarType3030);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1464:1: rule__Statement__Alternatives : ( ( ruleComplexType ) | ( ( ruleExtend ) ) | ( ruleService ) | ( ruleCustomOption ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1468:1: ( ( ruleComplexType ) | ( ( ruleExtend ) ) | ( ruleService ) | ( ruleCustomOption ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1469:1: ( ruleComplexType )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1469:1: ( ruleComplexType )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1470:1: ruleComplexType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getComplexTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleComplexType_in_rule__Statement__Alternatives3065);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1475:6: ( ( ruleExtend ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1475:6: ( ( ruleExtend ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1476:1: ( ruleExtend )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getExtendParserRuleCall_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1477:1: ( ruleExtend )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1477:3: ruleExtend
                    {
                    pushFollow(FOLLOW_ruleExtend_in_rule__Statement__Alternatives3083);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1481:6: ( ruleService )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1481:6: ( ruleService )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1482:1: ruleService
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getServiceParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleService_in_rule__Statement__Alternatives3101);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1487:6: ( ruleCustomOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1487:6: ( ruleCustomOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1488:1: ruleCustomOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getCustomOptionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleCustomOption_in_rule__Statement__Alternatives3118);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1498:1: rule__Import__Alternatives : ( ( rulePublicImport ) | ( ruleWeakImport ) );
    public final void rule__Import__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1502:1: ( ( rulePublicImport ) | ( ruleWeakImport ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1503:1: ( rulePublicImport )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1503:1: ( rulePublicImport )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1504:1: rulePublicImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getPublicImportParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePublicImport_in_rule__Import__Alternatives3150);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1509:6: ( ruleWeakImport )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1509:6: ( ruleWeakImport )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1510:1: ruleWeakImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getWeakImportParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleWeakImport_in_rule__Import__Alternatives3167);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1520:1: rule__Option__Alternatives : ( ( ( ruleNativeOption ) ) | ( ruleCustomOption ) );
    public final void rule__Option__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1524:1: ( ( ( ruleNativeOption ) ) | ( ruleCustomOption ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1525:1: ( ( ruleNativeOption ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1525:1: ( ( ruleNativeOption ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1526:1: ( ruleNativeOption )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOptionAccess().getNativeOptionParserRuleCall_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1527:1: ( ruleNativeOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1527:3: ruleNativeOption
                    {
                    pushFollow(FOLLOW_ruleNativeOption_in_rule__Option__Alternatives3200);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1531:6: ( ruleCustomOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1531:6: ( ruleCustomOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1532:1: ruleCustomOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOptionAccess().getCustomOptionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCustomOption_in_rule__Option__Alternatives3218);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1542:1: rule__SimpleValueLink__Alternatives : ( ( ruleNumberLink ) | ( ruleBooleanLink ) | ( ruleStringLink ) | ( ruleCustomIdLink ) );
    public final void rule__SimpleValueLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1546:1: ( ( ruleNumberLink ) | ( ruleBooleanLink ) | ( ruleStringLink ) | ( ruleCustomIdLink ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1547:1: ( ruleNumberLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1547:1: ( ruleNumberLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1548:1: ruleNumberLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getNumberLinkParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleNumberLink_in_rule__SimpleValueLink__Alternatives3250);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1553:6: ( ruleBooleanLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1553:6: ( ruleBooleanLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1554:1: ruleBooleanLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getBooleanLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLink_in_rule__SimpleValueLink__Alternatives3267);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1559:6: ( ruleStringLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1559:6: ( ruleStringLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1560:1: ruleStringLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getStringLinkParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleStringLink_in_rule__SimpleValueLink__Alternatives3284);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1565:6: ( ruleCustomIdLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1565:6: ( ruleCustomIdLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1566:1: ruleCustomIdLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleValueLinkAccess().getCustomIdLinkParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleCustomIdLink_in_rule__SimpleValueLink__Alternatives3301);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1576:1: rule__NumberLink__Alternatives : ( ( ruleIntLink ) | ( ruleDoubleLink ) );
    public final void rule__NumberLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1580:1: ( ( ruleIntLink ) | ( ruleDoubleLink ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1581:1: ( ruleIntLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1581:1: ( ruleIntLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1582:1: ruleIntLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLinkAccess().getIntLinkParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleIntLink_in_rule__NumberLink__Alternatives3333);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1587:6: ( ruleDoubleLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1587:6: ( ruleDoubleLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1588:1: ruleDoubleLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLinkAccess().getDoubleLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleDoubleLink_in_rule__NumberLink__Alternatives3350);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1598:1: rule__ComplexType__Alternatives : ( ( ruleEnum ) | ( ruleExtensibleType ) );
    public final void rule__ComplexType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1602:1: ( ( ruleEnum ) | ( ruleExtensibleType ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1603:1: ( ruleEnum )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1603:1: ( ruleEnum )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1604:1: ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComplexTypeAccess().getEnumParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEnum_in_rule__ComplexType__Alternatives3382);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1609:6: ( ruleExtensibleType )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1609:6: ( ruleExtensibleType )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1610:1: ruleExtensibleType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComplexTypeAccess().getExtensibleTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleExtensibleType_in_rule__ComplexType__Alternatives3399);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1620:1: rule__ExtensibleType__Alternatives : ( ( ruleMessage ) | ( ruleGroup ) );
    public final void rule__ExtensibleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1624:1: ( ( ruleMessage ) | ( ruleGroup ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1625:1: ( ruleMessage )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1625:1: ( ruleMessage )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1626:1: ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensibleTypeAccess().getMessageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMessage_in_rule__ExtensibleType__Alternatives3431);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1631:6: ( ruleGroup )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1631:6: ( ruleGroup )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1632:1: ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensibleTypeAccess().getGroupParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGroup_in_rule__ExtensibleType__Alternatives3448);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1642:1: rule__MessageElement__Alternatives : ( ( ruleMessage ) | ( ruleIndexedElement ) | ( ruleOneof ) | ( ruleEnum ) | ( ruleService ) | ( ( ruleExtend ) ) | ( ruleExtensionRange ) | ( ruleOption ) );
    public final void rule__MessageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1646:1: ( ( ruleMessage ) | ( ruleIndexedElement ) | ( ruleOneof ) | ( ruleEnum ) | ( ruleService ) | ( ( ruleExtend ) ) | ( ruleExtensionRange ) | ( ruleOption ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1647:1: ( ruleMessage )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1647:1: ( ruleMessage )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1648:1: ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getMessageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMessage_in_rule__MessageElement__Alternatives3480);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1653:6: ( ruleIndexedElement )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1653:6: ( ruleIndexedElement )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1654:1: ruleIndexedElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getIndexedElementParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIndexedElement_in_rule__MessageElement__Alternatives3497);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1659:6: ( ruleOneof )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1659:6: ( ruleOneof )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1660:1: ruleOneof
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getOneofParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleOneof_in_rule__MessageElement__Alternatives3514);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1665:6: ( ruleEnum )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1665:6: ( ruleEnum )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1666:1: ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getEnumParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleEnum_in_rule__MessageElement__Alternatives3531);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1671:6: ( ruleService )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1671:6: ( ruleService )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1672:1: ruleService
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getServiceParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleService_in_rule__MessageElement__Alternatives3548);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1677:6: ( ( ruleExtend ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1677:6: ( ( ruleExtend ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1678:1: ( ruleExtend )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getExtendParserRuleCall_5()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1679:1: ( ruleExtend )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1679:3: ruleExtend
                    {
                    pushFollow(FOLLOW_ruleExtend_in_rule__MessageElement__Alternatives3566);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1683:6: ( ruleExtensionRange )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1683:6: ( ruleExtensionRange )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1684:1: ruleExtensionRange
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getExtensionRangeParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleExtensionRange_in_rule__MessageElement__Alternatives3584);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1689:6: ( ruleOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1689:6: ( ruleOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1690:1: ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageElementAccess().getOptionParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_ruleOption_in_rule__MessageElement__Alternatives3601);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1700:1: rule__IndexedElement__Alternatives : ( ( ruleMessageField ) | ( ruleGroup ) );
    public final void rule__IndexedElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1704:1: ( ( ruleMessageField ) | ( ruleGroup ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1705:1: ( ruleMessageField )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1705:1: ( ruleMessageField )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1706:1: ruleMessageField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIndexedElementAccess().getMessageFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMessageField_in_rule__IndexedElement__Alternatives3633);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1711:6: ( ruleGroup )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1711:6: ( ruleGroup )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1712:1: ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIndexedElementAccess().getGroupParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGroup_in_rule__IndexedElement__Alternatives3650);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1722:1: rule__Range__Alternatives_1_1 : ( ( ( rule__Range__ToAssignment_1_1_0 ) ) | ( ( rule__Range__MaxAssignment_1_1_1 ) ) );
    public final void rule__Range__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1726:1: ( ( ( rule__Range__ToAssignment_1_1_0 ) ) | ( ( rule__Range__MaxAssignment_1_1_1 ) ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1727:1: ( ( rule__Range__ToAssignment_1_1_0 ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1727:1: ( ( rule__Range__ToAssignment_1_1_0 ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1728:1: ( rule__Range__ToAssignment_1_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeAccess().getToAssignment_1_1_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1729:1: ( rule__Range__ToAssignment_1_1_0 )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1729:2: rule__Range__ToAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Range__ToAssignment_1_1_0_in_rule__Range__Alternatives_1_13682);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1733:6: ( ( rule__Range__MaxAssignment_1_1_1 ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1733:6: ( ( rule__Range__MaxAssignment_1_1_1 ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1734:1: ( rule__Range__MaxAssignment_1_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeAccess().getMaxAssignment_1_1_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1735:1: ( rule__Range__MaxAssignment_1_1_1 )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1735:2: rule__Range__MaxAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_rule__Range__MaxAssignment_1_1_1_in_rule__Range__Alternatives_1_13700);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1744:1: rule__TypeLink__Alternatives : ( ( ( ruleScalarTypeLink ) ) | ( ruleComplexTypeLink ) );
    public final void rule__TypeLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1748:1: ( ( ( ruleScalarTypeLink ) ) | ( ruleComplexTypeLink ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1749:1: ( ( ruleScalarTypeLink ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1749:1: ( ( ruleScalarTypeLink ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1750:1: ( ruleScalarTypeLink )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLinkAccess().getScalarTypeLinkParserRuleCall_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1751:1: ( ruleScalarTypeLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1751:3: ruleScalarTypeLink
                    {
                    pushFollow(FOLLOW_ruleScalarTypeLink_in_rule__TypeLink__Alternatives3734);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1755:6: ( ruleComplexTypeLink )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1755:6: ( ruleComplexTypeLink )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1756:1: ruleComplexTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLinkAccess().getComplexTypeLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleComplexTypeLink_in_rule__TypeLink__Alternatives3752);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1766:1: rule__FieldOption__Alternatives : ( ( ( rulePackedValueFieldOption ) ) | ( ( ruleDefaultValueFieldOption ) ) | ( ruleNativeFieldOption ) );
    public final void rule__FieldOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1770:1: ( ( ( rulePackedValueFieldOption ) ) | ( ( ruleDefaultValueFieldOption ) ) | ( ruleNativeFieldOption ) )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1771:1: ( ( rulePackedValueFieldOption ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1771:1: ( ( rulePackedValueFieldOption ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1772:1: ( rulePackedValueFieldOption )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldOptionAccess().getPackedValueFieldOptionParserRuleCall_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1773:1: ( rulePackedValueFieldOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1773:3: rulePackedValueFieldOption
                    {
                    pushFollow(FOLLOW_rulePackedValueFieldOption_in_rule__FieldOption__Alternatives3785);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1777:6: ( ( ruleDefaultValueFieldOption ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1777:6: ( ( ruleDefaultValueFieldOption ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1778:1: ( ruleDefaultValueFieldOption )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldOptionAccess().getDefaultValueFieldOptionParserRuleCall_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1779:1: ( ruleDefaultValueFieldOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1779:3: ruleDefaultValueFieldOption
                    {
                    pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_rule__FieldOption__Alternatives3804);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1783:6: ( ruleNativeFieldOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1783:6: ( ruleNativeFieldOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1784:1: ruleNativeFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldOptionAccess().getNativeFieldOptionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleNativeFieldOption_in_rule__FieldOption__Alternatives3822);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1794:1: rule__EnumElement__Alternatives : ( ( ruleEnumField ) | ( ruleCustomOption ) );
    public final void rule__EnumElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1798:1: ( ( ruleEnumField ) | ( ruleCustomOption ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1799:1: ( ruleEnumField )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1799:1: ( ruleEnumField )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1800:1: ruleEnumField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumElementAccess().getEnumFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEnumField_in_rule__EnumElement__Alternatives3854);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1805:6: ( ruleCustomOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1805:6: ( ruleCustomOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1806:1: ruleCustomOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumElementAccess().getCustomOptionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCustomOption_in_rule__EnumElement__Alternatives3871);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1816:1: rule__ServiceElement__Alternatives : ( ( ( ruleRpc ) ) | ( ruleOption ) );
    public final void rule__ServiceElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1820:1: ( ( ( ruleRpc ) ) | ( ruleOption ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1821:1: ( ( ruleRpc ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1821:1: ( ( ruleRpc ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1822:1: ( ruleRpc )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getServiceElementAccess().getRpcParserRuleCall_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1823:1: ( ruleRpc )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1823:3: ruleRpc
                    {
                    pushFollow(FOLLOW_ruleRpc_in_rule__ServiceElement__Alternatives3904);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1827:6: ( ruleOption )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1827:6: ( ruleOption )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1828:1: ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getServiceElementAccess().getOptionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleOption_in_rule__ServiceElement__Alternatives3922);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1838:1: rule__Var_full__Alternatives : ( ( ruleFULL_ID ) | ( ruleVar ) );
    public final void rule__Var_full__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1842:1: ( ( ruleFULL_ID ) | ( ruleVar ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1843:1: ( ruleFULL_ID )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1843:1: ( ruleFULL_ID )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1844:1: ruleFULL_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_fullAccess().getFULL_IDParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleFULL_ID_in_rule__Var_full__Alternatives3954);
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1849:6: ( ruleVar )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1849:6: ( ruleVar )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1850:1: ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_fullAccess().getVarParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVar_in_rule__Var_full__Alternatives3971);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1860:1: rule__Var__Alternatives : ( ( RULE_ID ) | ( ruleVarReserved ) );
    public final void rule__Var__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1864:1: ( ( RULE_ID ) | ( ruleVarReserved ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1865:1: ( RULE_ID )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1865:1: ( RULE_ID )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1866:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Var__Alternatives4003); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1871:6: ( ruleVarReserved )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1871:6: ( ruleVarReserved )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1872:1: ruleVarReserved
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarAccess().getVarReservedParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVarReserved_in_rule__Var__Alternatives4020);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1882:1: rule__VarReserved__Alternatives : ( ( 'to' ) | ( 'package' ) | ( 'syntax' ) | ( 'import' ) | ( 'option' ) | ( 'message' ) | ( 'service' ) | ( 'enum' ) | ( 'required' ) | ( 'optional' ) | ( 'repeated' ) | ( 'extensions' ) | ( 'extend' ) | ( 'group' ) | ( 'rpc' ) | ( 'returns' ) | ( 'int32' ) | ( 'int64' ) | ( 'uint32' ) | ( 'uint64' ) | ( 'sint32' ) | ( 'sint64' ) | ( 'fixed32' ) | ( 'fixed64' ) | ( 'sfixed32' ) | ( 'sfixed64' ) | ( 'float' ) | ( 'double' ) | ( 'bool' ) | ( 'string' ) | ( 'bytes' ) | ( 'default' ) | ( 'max' ) | ( 'void' ) | ( 'weak' ) | ( 'packed' ) );
    public final void rule__VarReserved__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1886:1: ( ( 'to' ) | ( 'package' ) | ( 'syntax' ) | ( 'import' ) | ( 'option' ) | ( 'message' ) | ( 'service' ) | ( 'enum' ) | ( 'required' ) | ( 'optional' ) | ( 'repeated' ) | ( 'extensions' ) | ( 'extend' ) | ( 'group' ) | ( 'rpc' ) | ( 'returns' ) | ( 'int32' ) | ( 'int64' ) | ( 'uint32' ) | ( 'uint64' ) | ( 'sint32' ) | ( 'sint64' ) | ( 'fixed32' ) | ( 'fixed64' ) | ( 'sfixed32' ) | ( 'sfixed64' ) | ( 'float' ) | ( 'double' ) | ( 'bool' ) | ( 'string' ) | ( 'bytes' ) | ( 'default' ) | ( 'max' ) | ( 'void' ) | ( 'weak' ) | ( 'packed' ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1887:1: ( 'to' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1887:1: ( 'to' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1888:1: 'to'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getToKeyword_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__VarReserved__Alternatives4053); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getToKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1895:6: ( 'package' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1895:6: ( 'package' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1896:1: 'package'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getPackageKeyword_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__VarReserved__Alternatives4073); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getPackageKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1903:6: ( 'syntax' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1903:6: ( 'syntax' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1904:1: 'syntax'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSyntaxKeyword_2()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__VarReserved__Alternatives4093); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSyntaxKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1911:6: ( 'import' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1911:6: ( 'import' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1912:1: 'import'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getImportKeyword_3()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__VarReserved__Alternatives4113); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getImportKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1919:6: ( 'option' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1919:6: ( 'option' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1920:1: 'option'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getOptionKeyword_4()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__VarReserved__Alternatives4133); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getOptionKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1927:6: ( 'message' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1927:6: ( 'message' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1928:1: 'message'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getMessageKeyword_5()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__VarReserved__Alternatives4153); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getMessageKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1935:6: ( 'service' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1935:6: ( 'service' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1936:1: 'service'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getServiceKeyword_6()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__VarReserved__Alternatives4173); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getServiceKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1943:6: ( 'enum' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1943:6: ( 'enum' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1944:1: 'enum'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getEnumKeyword_7()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__VarReserved__Alternatives4193); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getEnumKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1951:6: ( 'required' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1951:6: ( 'required' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1952:1: 'required'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getRequiredKeyword_8()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__VarReserved__Alternatives4213); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getRequiredKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1959:6: ( 'optional' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1959:6: ( 'optional' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1960:1: 'optional'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getOptionalKeyword_9()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__VarReserved__Alternatives4233); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getOptionalKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1967:6: ( 'repeated' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1967:6: ( 'repeated' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1968:1: 'repeated'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getRepeatedKeyword_10()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__VarReserved__Alternatives4253); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getRepeatedKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1975:6: ( 'extensions' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1975:6: ( 'extensions' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1976:1: 'extensions'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getExtensionsKeyword_11()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__VarReserved__Alternatives4273); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getExtensionsKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1983:6: ( 'extend' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1983:6: ( 'extend' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1984:1: 'extend'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getExtendKeyword_12()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__VarReserved__Alternatives4293); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getExtendKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1991:6: ( 'group' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1991:6: ( 'group' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1992:1: 'group'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getGroupKeyword_13()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__VarReserved__Alternatives4313); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getGroupKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1999:6: ( 'rpc' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1999:6: ( 'rpc' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2000:1: 'rpc'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getRpcKeyword_14()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__VarReserved__Alternatives4333); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getRpcKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2007:6: ( 'returns' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2007:6: ( 'returns' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2008:1: 'returns'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getReturnsKeyword_15()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__VarReserved__Alternatives4353); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getReturnsKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2015:6: ( 'int32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2015:6: ( 'int32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2016:1: 'int32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getInt32Keyword_16()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__VarReserved__Alternatives4373); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getInt32Keyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2023:6: ( 'int64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2023:6: ( 'int64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2024:1: 'int64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getInt64Keyword_17()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__VarReserved__Alternatives4393); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getInt64Keyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2031:6: ( 'uint32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2031:6: ( 'uint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2032:1: 'uint32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getUint32Keyword_18()); 
                    }
                    match(input,31,FOLLOW_31_in_rule__VarReserved__Alternatives4413); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getUint32Keyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2039:6: ( 'uint64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2039:6: ( 'uint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2040:1: 'uint64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getUint64Keyword_19()); 
                    }
                    match(input,32,FOLLOW_32_in_rule__VarReserved__Alternatives4433); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getUint64Keyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2047:6: ( 'sint32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2047:6: ( 'sint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2048:1: 'sint32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSint32Keyword_20()); 
                    }
                    match(input,33,FOLLOW_33_in_rule__VarReserved__Alternatives4453); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSint32Keyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2055:6: ( 'sint64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2055:6: ( 'sint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2056:1: 'sint64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSint64Keyword_21()); 
                    }
                    match(input,34,FOLLOW_34_in_rule__VarReserved__Alternatives4473); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSint64Keyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2063:6: ( 'fixed32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2063:6: ( 'fixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2064:1: 'fixed32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getFixed32Keyword_22()); 
                    }
                    match(input,35,FOLLOW_35_in_rule__VarReserved__Alternatives4493); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getFixed32Keyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2071:6: ( 'fixed64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2071:6: ( 'fixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2072:1: 'fixed64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getFixed64Keyword_23()); 
                    }
                    match(input,36,FOLLOW_36_in_rule__VarReserved__Alternatives4513); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getFixed64Keyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2079:6: ( 'sfixed32' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2079:6: ( 'sfixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2080:1: 'sfixed32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSfixed32Keyword_24()); 
                    }
                    match(input,37,FOLLOW_37_in_rule__VarReserved__Alternatives4533); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSfixed32Keyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2087:6: ( 'sfixed64' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2087:6: ( 'sfixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2088:1: 'sfixed64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getSfixed64Keyword_25()); 
                    }
                    match(input,38,FOLLOW_38_in_rule__VarReserved__Alternatives4553); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getSfixed64Keyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2095:6: ( 'float' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2095:6: ( 'float' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2096:1: 'float'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getFloatKeyword_26()); 
                    }
                    match(input,39,FOLLOW_39_in_rule__VarReserved__Alternatives4573); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getFloatKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2103:6: ( 'double' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2103:6: ( 'double' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2104:1: 'double'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getDoubleKeyword_27()); 
                    }
                    match(input,40,FOLLOW_40_in_rule__VarReserved__Alternatives4593); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getDoubleKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2111:6: ( 'bool' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2111:6: ( 'bool' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2112:1: 'bool'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getBoolKeyword_28()); 
                    }
                    match(input,41,FOLLOW_41_in_rule__VarReserved__Alternatives4613); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getBoolKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2119:6: ( 'string' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2119:6: ( 'string' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2120:1: 'string'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getStringKeyword_29()); 
                    }
                    match(input,42,FOLLOW_42_in_rule__VarReserved__Alternatives4633); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getStringKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2127:6: ( 'bytes' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2127:6: ( 'bytes' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2128:1: 'bytes'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getBytesKeyword_30()); 
                    }
                    match(input,43,FOLLOW_43_in_rule__VarReserved__Alternatives4653); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getBytesKeyword_30()); 
                    }

                    }


                    }
                    break;
                case 32 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2135:6: ( 'default' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2135:6: ( 'default' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2136:1: 'default'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getDefaultKeyword_31()); 
                    }
                    match(input,44,FOLLOW_44_in_rule__VarReserved__Alternatives4673); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getDefaultKeyword_31()); 
                    }

                    }


                    }
                    break;
                case 33 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2143:6: ( 'max' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2143:6: ( 'max' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2144:1: 'max'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getMaxKeyword_32()); 
                    }
                    match(input,45,FOLLOW_45_in_rule__VarReserved__Alternatives4693); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getMaxKeyword_32()); 
                    }

                    }


                    }
                    break;
                case 34 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2151:6: ( 'void' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2151:6: ( 'void' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2152:1: 'void'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getVoidKeyword_33()); 
                    }
                    match(input,46,FOLLOW_46_in_rule__VarReserved__Alternatives4713); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getVoidKeyword_33()); 
                    }

                    }


                    }
                    break;
                case 35 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2159:6: ( 'weak' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2159:6: ( 'weak' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2160:1: 'weak'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getWeakKeyword_34()); 
                    }
                    match(input,47,FOLLOW_47_in_rule__VarReserved__Alternatives4733); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarReservedAccess().getWeakKeyword_34()); 
                    }

                    }


                    }
                    break;
                case 36 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2167:6: ( 'packed' )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2167:6: ( 'packed' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2168:1: 'packed'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarReservedAccess().getPackedKeyword_35()); 
                    }
                    match(input,48,FOLLOW_48_in_rule__VarReserved__Alternatives4753); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2181:1: rule__BOOL__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BOOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2185:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2186:1: ( ( 'true' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2186:1: ( ( 'true' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2187:1: ( 'true' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2188:1: ( 'true' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2188:3: 'true'
                    {
                    match(input,49,FOLLOW_49_in_rule__BOOL__Alternatives4789); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2193:6: ( ( 'false' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2193:6: ( ( 'false' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2194:1: ( 'false' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLAccess().getFalseEnumLiteralDeclaration_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2195:1: ( 'false' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2195:3: 'false'
                    {
                    match(input,50,FOLLOW_50_in_rule__BOOL__Alternatives4810); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2205:1: rule__Modifier__Alternatives : ( ( ( 'optional' ) ) | ( ( 'required' ) ) | ( ( 'repeated' ) ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2209:1: ( ( ( 'optional' ) ) | ( ( 'required' ) ) | ( ( 'repeated' ) ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2210:1: ( ( 'optional' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2210:1: ( ( 'optional' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2211:1: ( 'optional' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2212:1: ( 'optional' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2212:3: 'optional'
                    {
                    match(input,22,FOLLOW_22_in_rule__Modifier__Alternatives4846); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2217:6: ( ( 'required' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2217:6: ( ( 'required' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2218:1: ( 'required' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2219:1: ( 'required' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2219:3: 'required'
                    {
                    match(input,21,FOLLOW_21_in_rule__Modifier__Alternatives4867); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2224:6: ( ( 'repeated' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2224:6: ( ( 'repeated' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2225:1: ( 'repeated' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getRepeatedEnumLiteralDeclaration_2()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2226:1: ( 'repeated' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2226:3: 'repeated'
                    {
                    match(input,23,FOLLOW_23_in_rule__Modifier__Alternatives4888); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2236:1: rule__ScalarType__Alternatives : ( ( ( 'int32' ) ) | ( ( 'int64' ) ) | ( ( 'uint32' ) ) | ( ( 'uint64' ) ) | ( ( 'sint32' ) ) | ( ( 'sint64' ) ) | ( ( 'fixed32' ) ) | ( ( 'fixed64' ) ) | ( ( 'sfixed32' ) ) | ( ( 'sfixed64' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'bool' ) ) | ( ( 'string' ) ) | ( ( 'bytes' ) ) );
    public final void rule__ScalarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2240:1: ( ( ( 'int32' ) ) | ( ( 'int64' ) ) | ( ( 'uint32' ) ) | ( ( 'uint64' ) ) | ( ( 'sint32' ) ) | ( ( 'sint64' ) ) | ( ( 'fixed32' ) ) | ( ( 'fixed64' ) ) | ( ( 'sfixed32' ) ) | ( ( 'sfixed64' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'bool' ) ) | ( ( 'string' ) ) | ( ( 'bytes' ) ) )
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
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2241:1: ( ( 'int32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2241:1: ( ( 'int32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2242:1: ( 'int32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2243:1: ( 'int32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2243:3: 'int32'
                    {
                    match(input,29,FOLLOW_29_in_rule__ScalarType__Alternatives4924); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2248:6: ( ( 'int64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2248:6: ( ( 'int64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2249:1: ( 'int64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2250:1: ( 'int64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2250:3: 'int64'
                    {
                    match(input,30,FOLLOW_30_in_rule__ScalarType__Alternatives4945); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2255:6: ( ( 'uint32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2255:6: ( ( 'uint32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2256:1: ( 'uint32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2257:1: ( 'uint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2257:3: 'uint32'
                    {
                    match(input,31,FOLLOW_31_in_rule__ScalarType__Alternatives4966); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2262:6: ( ( 'uint64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2262:6: ( ( 'uint64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2263:1: ( 'uint64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2264:1: ( 'uint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2264:3: 'uint64'
                    {
                    match(input,32,FOLLOW_32_in_rule__ScalarType__Alternatives4987); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2269:6: ( ( 'sint32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2269:6: ( ( 'sint32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2270:1: ( 'sint32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2271:1: ( 'sint32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2271:3: 'sint32'
                    {
                    match(input,33,FOLLOW_33_in_rule__ScalarType__Alternatives5008); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2276:6: ( ( 'sint64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2276:6: ( ( 'sint64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2277:1: ( 'sint64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2278:1: ( 'sint64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2278:3: 'sint64'
                    {
                    match(input,34,FOLLOW_34_in_rule__ScalarType__Alternatives5029); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2283:6: ( ( 'fixed32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2283:6: ( ( 'fixed32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2284:1: ( 'fixed32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2285:1: ( 'fixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2285:3: 'fixed32'
                    {
                    match(input,35,FOLLOW_35_in_rule__ScalarType__Alternatives5050); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2290:6: ( ( 'fixed64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2290:6: ( ( 'fixed64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2291:1: ( 'fixed64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2292:1: ( 'fixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2292:3: 'fixed64'
                    {
                    match(input,36,FOLLOW_36_in_rule__ScalarType__Alternatives5071); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2297:6: ( ( 'sfixed32' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2297:6: ( ( 'sfixed32' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2298:1: ( 'sfixed32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2299:1: ( 'sfixed32' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2299:3: 'sfixed32'
                    {
                    match(input,37,FOLLOW_37_in_rule__ScalarType__Alternatives5092); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2304:6: ( ( 'sfixed64' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2304:6: ( ( 'sfixed64' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2305:1: ( 'sfixed64' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2306:1: ( 'sfixed64' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2306:3: 'sfixed64'
                    {
                    match(input,38,FOLLOW_38_in_rule__ScalarType__Alternatives5113); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2311:6: ( ( 'float' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2311:6: ( ( 'float' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2312:1: ( 'float' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2313:1: ( 'float' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2313:3: 'float'
                    {
                    match(input,39,FOLLOW_39_in_rule__ScalarType__Alternatives5134); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2318:6: ( ( 'double' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2318:6: ( ( 'double' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2319:1: ( 'double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2320:1: ( 'double' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2320:3: 'double'
                    {
                    match(input,40,FOLLOW_40_in_rule__ScalarType__Alternatives5155); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2325:6: ( ( 'bool' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2325:6: ( ( 'bool' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2326:1: ( 'bool' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2327:1: ( 'bool' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2327:3: 'bool'
                    {
                    match(input,41,FOLLOW_41_in_rule__ScalarType__Alternatives5176); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2332:6: ( ( 'string' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2332:6: ( ( 'string' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2333:1: ( 'string' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2334:1: ( 'string' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2334:3: 'string'
                    {
                    match(input,42,FOLLOW_42_in_rule__ScalarType__Alternatives5197); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2339:6: ( ( 'bytes' ) )
                    {
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2339:6: ( ( 'bytes' ) )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2340:1: ( 'bytes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScalarTypeAccess().getBytesEnumLiteralDeclaration_14()); 
                    }
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2341:1: ( 'bytes' )
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2341:3: 'bytes'
                    {
                    match(input,43,FOLLOW_43_in_rule__ScalarType__Alternatives5218); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2353:1: rule__Proto__Group__0 : rule__Proto__Group__0__Impl rule__Proto__Group__1 ;
    public final void rule__Proto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2357:1: ( rule__Proto__Group__0__Impl rule__Proto__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2358:2: rule__Proto__Group__0__Impl rule__Proto__Group__1
            {
            pushFollow(FOLLOW_rule__Proto__Group__0__Impl_in_rule__Proto__Group__05251);
            rule__Proto__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Proto__Group__1_in_rule__Proto__Group__05254);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2365:1: rule__Proto__Group__0__Impl : ( ( rule__Proto__Group_0__0 )? ) ;
    public final void rule__Proto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2369:1: ( ( ( rule__Proto__Group_0__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2370:1: ( ( rule__Proto__Group_0__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2370:1: ( ( rule__Proto__Group_0__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2371:1: ( rule__Proto__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getGroup_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2372:1: ( rule__Proto__Group_0__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2372:2: rule__Proto__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Proto__Group_0__0_in_rule__Proto__Group__0__Impl5281);
                    rule__Proto__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getGroup_0()); 
            }

            }


            }

        }
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2382:1: rule__Proto__Group__1 : rule__Proto__Group__1__Impl rule__Proto__Group__2 ;
    public final void rule__Proto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2386:1: ( rule__Proto__Group__1__Impl rule__Proto__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2387:2: rule__Proto__Group__1__Impl rule__Proto__Group__2
            {
            pushFollow(FOLLOW_rule__Proto__Group__1__Impl_in_rule__Proto__Group__15312);
            rule__Proto__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Proto__Group__2_in_rule__Proto__Group__15315);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2394:1: rule__Proto__Group__1__Impl : ( ( rule__Proto__ImportsAssignment_1 )* ) ;
    public final void rule__Proto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2398:1: ( ( ( rule__Proto__ImportsAssignment_1 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2399:1: ( ( rule__Proto__ImportsAssignment_1 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2399:1: ( ( rule__Proto__ImportsAssignment_1 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2400:1: ( rule__Proto__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getImportsAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2401:1: ( rule__Proto__ImportsAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2401:2: rule__Proto__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Proto__ImportsAssignment_1_in_rule__Proto__Group__1__Impl5342);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2411:1: rule__Proto__Group__2 : rule__Proto__Group__2__Impl rule__Proto__Group__3 ;
    public final void rule__Proto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2415:1: ( rule__Proto__Group__2__Impl rule__Proto__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2416:2: rule__Proto__Group__2__Impl rule__Proto__Group__3
            {
            pushFollow(FOLLOW_rule__Proto__Group__2__Impl_in_rule__Proto__Group__25373);
            rule__Proto__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Proto__Group__3_in_rule__Proto__Group__25376);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2423:1: rule__Proto__Group__2__Impl : ( ( rule__Proto__Group_2__0 )? ) ;
    public final void rule__Proto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2427:1: ( ( ( rule__Proto__Group_2__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2428:1: ( ( rule__Proto__Group_2__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2428:1: ( ( rule__Proto__Group_2__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2429:1: ( rule__Proto__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getGroup_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2430:1: ( rule__Proto__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==14) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2430:2: rule__Proto__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Proto__Group_2__0_in_rule__Proto__Group__2__Impl5403);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2440:1: rule__Proto__Group__3 : rule__Proto__Group__3__Impl ;
    public final void rule__Proto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2444:1: ( rule__Proto__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2445:2: rule__Proto__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Proto__Group__3__Impl_in_rule__Proto__Group__35434);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2451:1: rule__Proto__Group__3__Impl : ( ( rule__Proto__StatementsAssignment_3 )* ) ;
    public final void rule__Proto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2455:1: ( ( ( rule__Proto__StatementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2456:1: ( ( rule__Proto__StatementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2456:1: ( ( rule__Proto__StatementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2457:1: ( rule__Proto__StatementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getStatementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2458:1: ( rule__Proto__StatementsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=17 && LA24_0<=23)||LA24_0==25) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2458:2: rule__Proto__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Proto__StatementsAssignment_3_in_rule__Proto__Group__3__Impl5461);
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


    // $ANTLR start "rule__Proto__Group_0__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2476:1: rule__Proto__Group_0__0 : rule__Proto__Group_0__0__Impl rule__Proto__Group_0__1 ;
    public final void rule__Proto__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2480:1: ( rule__Proto__Group_0__0__Impl rule__Proto__Group_0__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2481:2: rule__Proto__Group_0__0__Impl rule__Proto__Group_0__1
            {
            pushFollow(FOLLOW_rule__Proto__Group_0__0__Impl_in_rule__Proto__Group_0__05500);
            rule__Proto__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Proto__Group_0__1_in_rule__Proto__Group_0__05503);
            rule__Proto__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proto__Group_0__0"


    // $ANTLR start "rule__Proto__Group_0__0__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2488:1: rule__Proto__Group_0__0__Impl : ( 'syntax' ) ;
    public final void rule__Proto__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2492:1: ( ( 'syntax' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2493:1: ( 'syntax' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2493:1: ( 'syntax' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2494:1: 'syntax'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getSyntaxKeyword_0_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Proto__Group_0__0__Impl5531); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getSyntaxKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proto__Group_0__0__Impl"


    // $ANTLR start "rule__Proto__Group_0__1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2507:1: rule__Proto__Group_0__1 : rule__Proto__Group_0__1__Impl rule__Proto__Group_0__2 ;
    public final void rule__Proto__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2511:1: ( rule__Proto__Group_0__1__Impl rule__Proto__Group_0__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2512:2: rule__Proto__Group_0__1__Impl rule__Proto__Group_0__2
            {
            pushFollow(FOLLOW_rule__Proto__Group_0__1__Impl_in_rule__Proto__Group_0__15562);
            rule__Proto__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Proto__Group_0__2_in_rule__Proto__Group_0__15565);
            rule__Proto__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proto__Group_0__1"


    // $ANTLR start "rule__Proto__Group_0__1__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2519:1: rule__Proto__Group_0__1__Impl : ( '=' ) ;
    public final void rule__Proto__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2523:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2524:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2524:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2525:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getEqualsSignKeyword_0_1()); 
            }
            match(input,51,FOLLOW_51_in_rule__Proto__Group_0__1__Impl5593); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getEqualsSignKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proto__Group_0__1__Impl"


    // $ANTLR start "rule__Proto__Group_0__2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2538:1: rule__Proto__Group_0__2 : rule__Proto__Group_0__2__Impl rule__Proto__Group_0__3 ;
    public final void rule__Proto__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2542:1: ( rule__Proto__Group_0__2__Impl rule__Proto__Group_0__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2543:2: rule__Proto__Group_0__2__Impl rule__Proto__Group_0__3
            {
            pushFollow(FOLLOW_rule__Proto__Group_0__2__Impl_in_rule__Proto__Group_0__25624);
            rule__Proto__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Proto__Group_0__3_in_rule__Proto__Group_0__25627);
            rule__Proto__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proto__Group_0__2"


    // $ANTLR start "rule__Proto__Group_0__2__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2550:1: rule__Proto__Group_0__2__Impl : ( ( rule__Proto__SyntaxAssignment_0_2 ) ) ;
    public final void rule__Proto__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2554:1: ( ( ( rule__Proto__SyntaxAssignment_0_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2555:1: ( ( rule__Proto__SyntaxAssignment_0_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2555:1: ( ( rule__Proto__SyntaxAssignment_0_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2556:1: ( rule__Proto__SyntaxAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getSyntaxAssignment_0_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2557:1: ( rule__Proto__SyntaxAssignment_0_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2557:2: rule__Proto__SyntaxAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Proto__SyntaxAssignment_0_2_in_rule__Proto__Group_0__2__Impl5654);
            rule__Proto__SyntaxAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getSyntaxAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proto__Group_0__2__Impl"


    // $ANTLR start "rule__Proto__Group_0__3"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2567:1: rule__Proto__Group_0__3 : rule__Proto__Group_0__3__Impl ;
    public final void rule__Proto__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2571:1: ( rule__Proto__Group_0__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2572:2: rule__Proto__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Proto__Group_0__3__Impl_in_rule__Proto__Group_0__35684);
            rule__Proto__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proto__Group_0__3"


    // $ANTLR start "rule__Proto__Group_0__3__Impl"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2578:1: rule__Proto__Group_0__3__Impl : ( ';' ) ;
    public final void rule__Proto__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2582:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2583:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2583:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2584:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getSemicolonKeyword_0_3()); 
            }
            match(input,52,FOLLOW_52_in_rule__Proto__Group_0__3__Impl5712); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getSemicolonKeyword_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proto__Group_0__3__Impl"


    // $ANTLR start "rule__Proto__Group_2__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2605:1: rule__Proto__Group_2__0 : rule__Proto__Group_2__0__Impl rule__Proto__Group_2__1 ;
    public final void rule__Proto__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2609:1: ( rule__Proto__Group_2__0__Impl rule__Proto__Group_2__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2610:2: rule__Proto__Group_2__0__Impl rule__Proto__Group_2__1
            {
            pushFollow(FOLLOW_rule__Proto__Group_2__0__Impl_in_rule__Proto__Group_2__05751);
            rule__Proto__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Proto__Group_2__1_in_rule__Proto__Group_2__05754);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2617:1: rule__Proto__Group_2__0__Impl : ( 'package' ) ;
    public final void rule__Proto__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2621:1: ( ( 'package' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2622:1: ( 'package' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2622:1: ( 'package' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2623:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getPackageKeyword_2_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Proto__Group_2__0__Impl5782); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2636:1: rule__Proto__Group_2__1 : rule__Proto__Group_2__1__Impl rule__Proto__Group_2__2 ;
    public final void rule__Proto__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2640:1: ( rule__Proto__Group_2__1__Impl rule__Proto__Group_2__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2641:2: rule__Proto__Group_2__1__Impl rule__Proto__Group_2__2
            {
            pushFollow(FOLLOW_rule__Proto__Group_2__1__Impl_in_rule__Proto__Group_2__15813);
            rule__Proto__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Proto__Group_2__2_in_rule__Proto__Group_2__15816);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2648:1: rule__Proto__Group_2__1__Impl : ( ( rule__Proto__NameAssignment_2_1 ) ) ;
    public final void rule__Proto__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2652:1: ( ( ( rule__Proto__NameAssignment_2_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2653:1: ( ( rule__Proto__NameAssignment_2_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2653:1: ( ( rule__Proto__NameAssignment_2_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2654:1: ( rule__Proto__NameAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getNameAssignment_2_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2655:1: ( rule__Proto__NameAssignment_2_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2655:2: rule__Proto__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Proto__NameAssignment_2_1_in_rule__Proto__Group_2__1__Impl5843);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2665:1: rule__Proto__Group_2__2 : rule__Proto__Group_2__2__Impl ;
    public final void rule__Proto__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2669:1: ( rule__Proto__Group_2__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2670:2: rule__Proto__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Proto__Group_2__2__Impl_in_rule__Proto__Group_2__25873);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2676:1: rule__Proto__Group_2__2__Impl : ( ';' ) ;
    public final void rule__Proto__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2680:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2681:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2681:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2682:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getSemicolonKeyword_2_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__Proto__Group_2__2__Impl5901); if (state.failed) return ;
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


    // $ANTLR start "rule__PublicImport__Group__0"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2701:1: rule__PublicImport__Group__0 : rule__PublicImport__Group__0__Impl rule__PublicImport__Group__1 ;
    public final void rule__PublicImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2705:1: ( rule__PublicImport__Group__0__Impl rule__PublicImport__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2706:2: rule__PublicImport__Group__0__Impl rule__PublicImport__Group__1
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__0__Impl_in_rule__PublicImport__Group__05938);
            rule__PublicImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PublicImport__Group__1_in_rule__PublicImport__Group__05941);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2713:1: rule__PublicImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__PublicImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2717:1: ( ( 'import' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2718:1: ( 'import' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2718:1: ( 'import' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2719:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getImportKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__PublicImport__Group__0__Impl5969); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2732:1: rule__PublicImport__Group__1 : rule__PublicImport__Group__1__Impl rule__PublicImport__Group__2 ;
    public final void rule__PublicImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2736:1: ( rule__PublicImport__Group__1__Impl rule__PublicImport__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2737:2: rule__PublicImport__Group__1__Impl rule__PublicImport__Group__2
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__1__Impl_in_rule__PublicImport__Group__16000);
            rule__PublicImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PublicImport__Group__2_in_rule__PublicImport__Group__16003);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2744:1: rule__PublicImport__Group__1__Impl : ( 'public' ) ;
    public final void rule__PublicImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2748:1: ( ( 'public' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2749:1: ( 'public' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2749:1: ( 'public' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2750:1: 'public'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getPublicKeyword_1()); 
            }
            match(input,53,FOLLOW_53_in_rule__PublicImport__Group__1__Impl6031); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2763:1: rule__PublicImport__Group__2 : rule__PublicImport__Group__2__Impl rule__PublicImport__Group__3 ;
    public final void rule__PublicImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2767:1: ( rule__PublicImport__Group__2__Impl rule__PublicImport__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2768:2: rule__PublicImport__Group__2__Impl rule__PublicImport__Group__3
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__2__Impl_in_rule__PublicImport__Group__26062);
            rule__PublicImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PublicImport__Group__3_in_rule__PublicImport__Group__26065);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2775:1: rule__PublicImport__Group__2__Impl : ( ( rule__PublicImport__ImportURIAssignment_2 ) ) ;
    public final void rule__PublicImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2779:1: ( ( ( rule__PublicImport__ImportURIAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2780:1: ( ( rule__PublicImport__ImportURIAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2780:1: ( ( rule__PublicImport__ImportURIAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2781:1: ( rule__PublicImport__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getImportURIAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2782:1: ( rule__PublicImport__ImportURIAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2782:2: rule__PublicImport__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__PublicImport__ImportURIAssignment_2_in_rule__PublicImport__Group__2__Impl6092);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2792:1: rule__PublicImport__Group__3 : rule__PublicImport__Group__3__Impl ;
    public final void rule__PublicImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2796:1: ( rule__PublicImport__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2797:2: rule__PublicImport__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PublicImport__Group__3__Impl_in_rule__PublicImport__Group__36122);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2803:1: rule__PublicImport__Group__3__Impl : ( ';' ) ;
    public final void rule__PublicImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2807:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2808:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2808:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2809:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getSemicolonKeyword_3()); 
            }
            match(input,52,FOLLOW_52_in_rule__PublicImport__Group__3__Impl6150); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2830:1: rule__WeakImport__Group__0 : rule__WeakImport__Group__0__Impl rule__WeakImport__Group__1 ;
    public final void rule__WeakImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2834:1: ( rule__WeakImport__Group__0__Impl rule__WeakImport__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2835:2: rule__WeakImport__Group__0__Impl rule__WeakImport__Group__1
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__0__Impl_in_rule__WeakImport__Group__06189);
            rule__WeakImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WeakImport__Group__1_in_rule__WeakImport__Group__06192);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2842:1: rule__WeakImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__WeakImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2846:1: ( ( 'import' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2847:1: ( 'import' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2847:1: ( 'import' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2848:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getImportKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__WeakImport__Group__0__Impl6220); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2861:1: rule__WeakImport__Group__1 : rule__WeakImport__Group__1__Impl rule__WeakImport__Group__2 ;
    public final void rule__WeakImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2865:1: ( rule__WeakImport__Group__1__Impl rule__WeakImport__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2866:2: rule__WeakImport__Group__1__Impl rule__WeakImport__Group__2
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__1__Impl_in_rule__WeakImport__Group__16251);
            rule__WeakImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WeakImport__Group__2_in_rule__WeakImport__Group__16254);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2873:1: rule__WeakImport__Group__1__Impl : ( ( 'weak' )? ) ;
    public final void rule__WeakImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2877:1: ( ( ( 'weak' )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2878:1: ( ( 'weak' )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2878:1: ( ( 'weak' )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2879:1: ( 'weak' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getWeakKeyword_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2880:1: ( 'weak' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2881:2: 'weak'
                    {
                    match(input,47,FOLLOW_47_in_rule__WeakImport__Group__1__Impl6283); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2892:1: rule__WeakImport__Group__2 : rule__WeakImport__Group__2__Impl rule__WeakImport__Group__3 ;
    public final void rule__WeakImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2896:1: ( rule__WeakImport__Group__2__Impl rule__WeakImport__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2897:2: rule__WeakImport__Group__2__Impl rule__WeakImport__Group__3
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__2__Impl_in_rule__WeakImport__Group__26316);
            rule__WeakImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WeakImport__Group__3_in_rule__WeakImport__Group__26319);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2904:1: rule__WeakImport__Group__2__Impl : ( ( rule__WeakImport__ImportURIAssignment_2 ) ) ;
    public final void rule__WeakImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2908:1: ( ( ( rule__WeakImport__ImportURIAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2909:1: ( ( rule__WeakImport__ImportURIAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2909:1: ( ( rule__WeakImport__ImportURIAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2910:1: ( rule__WeakImport__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getImportURIAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2911:1: ( rule__WeakImport__ImportURIAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2911:2: rule__WeakImport__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__WeakImport__ImportURIAssignment_2_in_rule__WeakImport__Group__2__Impl6346);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2921:1: rule__WeakImport__Group__3 : rule__WeakImport__Group__3__Impl ;
    public final void rule__WeakImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2925:1: ( rule__WeakImport__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2926:2: rule__WeakImport__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WeakImport__Group__3__Impl_in_rule__WeakImport__Group__36376);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2932:1: rule__WeakImport__Group__3__Impl : ( ';' ) ;
    public final void rule__WeakImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2936:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2937:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2937:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2938:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getSemicolonKeyword_3()); 
            }
            match(input,52,FOLLOW_52_in_rule__WeakImport__Group__3__Impl6404); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2959:1: rule__NativeOption__Group__0 : rule__NativeOption__Group__0__Impl rule__NativeOption__Group__1 ;
    public final void rule__NativeOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2963:1: ( rule__NativeOption__Group__0__Impl rule__NativeOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2964:2: rule__NativeOption__Group__0__Impl rule__NativeOption__Group__1
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__0__Impl_in_rule__NativeOption__Group__06443);
            rule__NativeOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeOption__Group__1_in_rule__NativeOption__Group__06446);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2971:1: rule__NativeOption__Group__0__Impl : ( 'option' ) ;
    public final void rule__NativeOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2975:1: ( ( 'option' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2976:1: ( 'option' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2976:1: ( 'option' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2977:1: 'option'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getOptionKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__NativeOption__Group__0__Impl6474); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2990:1: rule__NativeOption__Group__1 : rule__NativeOption__Group__1__Impl rule__NativeOption__Group__2 ;
    public final void rule__NativeOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2994:1: ( rule__NativeOption__Group__1__Impl rule__NativeOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:2995:2: rule__NativeOption__Group__1__Impl rule__NativeOption__Group__2
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__1__Impl_in_rule__NativeOption__Group__16505);
            rule__NativeOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeOption__Group__2_in_rule__NativeOption__Group__16508);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3002:1: rule__NativeOption__Group__1__Impl : ( ( rule__NativeOption__SourceAssignment_1 ) ) ;
    public final void rule__NativeOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3006:1: ( ( ( rule__NativeOption__SourceAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3007:1: ( ( rule__NativeOption__SourceAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3007:1: ( ( rule__NativeOption__SourceAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3008:1: ( rule__NativeOption__SourceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getSourceAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3009:1: ( rule__NativeOption__SourceAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3009:2: rule__NativeOption__SourceAssignment_1
            {
            pushFollow(FOLLOW_rule__NativeOption__SourceAssignment_1_in_rule__NativeOption__Group__1__Impl6535);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3019:1: rule__NativeOption__Group__2 : rule__NativeOption__Group__2__Impl rule__NativeOption__Group__3 ;
    public final void rule__NativeOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3023:1: ( rule__NativeOption__Group__2__Impl rule__NativeOption__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3024:2: rule__NativeOption__Group__2__Impl rule__NativeOption__Group__3
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__2__Impl_in_rule__NativeOption__Group__26565);
            rule__NativeOption__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeOption__Group__3_in_rule__NativeOption__Group__26568);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3031:1: rule__NativeOption__Group__2__Impl : ( '=' ) ;
    public final void rule__NativeOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3035:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3036:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3036:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3037:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getEqualsSignKeyword_2()); 
            }
            match(input,51,FOLLOW_51_in_rule__NativeOption__Group__2__Impl6596); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3050:1: rule__NativeOption__Group__3 : rule__NativeOption__Group__3__Impl rule__NativeOption__Group__4 ;
    public final void rule__NativeOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3054:1: ( rule__NativeOption__Group__3__Impl rule__NativeOption__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3055:2: rule__NativeOption__Group__3__Impl rule__NativeOption__Group__4
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__3__Impl_in_rule__NativeOption__Group__36627);
            rule__NativeOption__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeOption__Group__4_in_rule__NativeOption__Group__36630);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3062:1: rule__NativeOption__Group__3__Impl : ( ( rule__NativeOption__ValueAssignment_3 ) ) ;
    public final void rule__NativeOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3066:1: ( ( ( rule__NativeOption__ValueAssignment_3 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3067:1: ( ( rule__NativeOption__ValueAssignment_3 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3067:1: ( ( rule__NativeOption__ValueAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3068:1: ( rule__NativeOption__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getValueAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3069:1: ( rule__NativeOption__ValueAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3069:2: rule__NativeOption__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__NativeOption__ValueAssignment_3_in_rule__NativeOption__Group__3__Impl6657);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3079:1: rule__NativeOption__Group__4 : rule__NativeOption__Group__4__Impl ;
    public final void rule__NativeOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3083:1: ( rule__NativeOption__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3084:2: rule__NativeOption__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NativeOption__Group__4__Impl_in_rule__NativeOption__Group__46687);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3090:1: rule__NativeOption__Group__4__Impl : ( ';' ) ;
    public final void rule__NativeOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3094:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3095:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3095:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3096:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getSemicolonKeyword_4()); 
            }
            match(input,52,FOLLOW_52_in_rule__NativeOption__Group__4__Impl6715); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3119:1: rule__CustomOption__Group__0 : rule__CustomOption__Group__0__Impl rule__CustomOption__Group__1 ;
    public final void rule__CustomOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3123:1: ( rule__CustomOption__Group__0__Impl rule__CustomOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3124:2: rule__CustomOption__Group__0__Impl rule__CustomOption__Group__1
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__0__Impl_in_rule__CustomOption__Group__06756);
            rule__CustomOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomOption__Group__1_in_rule__CustomOption__Group__06759);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3131:1: rule__CustomOption__Group__0__Impl : ( 'option' ) ;
    public final void rule__CustomOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3135:1: ( ( 'option' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3136:1: ( 'option' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3136:1: ( 'option' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3137:1: 'option'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getOptionKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__CustomOption__Group__0__Impl6787); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3150:1: rule__CustomOption__Group__1 : rule__CustomOption__Group__1__Impl rule__CustomOption__Group__2 ;
    public final void rule__CustomOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3154:1: ( rule__CustomOption__Group__1__Impl rule__CustomOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3155:2: rule__CustomOption__Group__1__Impl rule__CustomOption__Group__2
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__1__Impl_in_rule__CustomOption__Group__16818);
            rule__CustomOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomOption__Group__2_in_rule__CustomOption__Group__16821);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3162:1: rule__CustomOption__Group__1__Impl : ( ( rule__CustomOption__SourceAssignment_1 ) ) ;
    public final void rule__CustomOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3166:1: ( ( ( rule__CustomOption__SourceAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3167:1: ( ( rule__CustomOption__SourceAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3167:1: ( ( rule__CustomOption__SourceAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3168:1: ( rule__CustomOption__SourceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getSourceAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3169:1: ( rule__CustomOption__SourceAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3169:2: rule__CustomOption__SourceAssignment_1
            {
            pushFollow(FOLLOW_rule__CustomOption__SourceAssignment_1_in_rule__CustomOption__Group__1__Impl6848);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3179:1: rule__CustomOption__Group__2 : rule__CustomOption__Group__2__Impl rule__CustomOption__Group__3 ;
    public final void rule__CustomOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3183:1: ( rule__CustomOption__Group__2__Impl rule__CustomOption__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3184:2: rule__CustomOption__Group__2__Impl rule__CustomOption__Group__3
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__2__Impl_in_rule__CustomOption__Group__26878);
            rule__CustomOption__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomOption__Group__3_in_rule__CustomOption__Group__26881);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3191:1: rule__CustomOption__Group__2__Impl : ( '=' ) ;
    public final void rule__CustomOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3195:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3196:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3196:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3197:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getEqualsSignKeyword_2()); 
            }
            match(input,51,FOLLOW_51_in_rule__CustomOption__Group__2__Impl6909); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3210:1: rule__CustomOption__Group__3 : rule__CustomOption__Group__3__Impl rule__CustomOption__Group__4 ;
    public final void rule__CustomOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3214:1: ( rule__CustomOption__Group__3__Impl rule__CustomOption__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3215:2: rule__CustomOption__Group__3__Impl rule__CustomOption__Group__4
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__3__Impl_in_rule__CustomOption__Group__36940);
            rule__CustomOption__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomOption__Group__4_in_rule__CustomOption__Group__36943);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3222:1: rule__CustomOption__Group__3__Impl : ( ( rule__CustomOption__ValueAssignment_3 ) ) ;
    public final void rule__CustomOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3226:1: ( ( ( rule__CustomOption__ValueAssignment_3 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3227:1: ( ( rule__CustomOption__ValueAssignment_3 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3227:1: ( ( rule__CustomOption__ValueAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3228:1: ( rule__CustomOption__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getValueAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3229:1: ( rule__CustomOption__ValueAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3229:2: rule__CustomOption__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__CustomOption__ValueAssignment_3_in_rule__CustomOption__Group__3__Impl6970);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3239:1: rule__CustomOption__Group__4 : rule__CustomOption__Group__4__Impl ;
    public final void rule__CustomOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3243:1: ( rule__CustomOption__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3244:2: rule__CustomOption__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CustomOption__Group__4__Impl_in_rule__CustomOption__Group__47000);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3250:1: rule__CustomOption__Group__4__Impl : ( ';' ) ;
    public final void rule__CustomOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3254:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3255:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3255:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3256:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getSemicolonKeyword_4()); 
            }
            match(input,52,FOLLOW_52_in_rule__CustomOption__Group__4__Impl7028); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3279:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3283:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3284:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__07069);
            rule__Message__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__07072);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3291:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3295:1: ( ( 'message' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3296:1: ( 'message' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3296:1: ( 'message' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3297:1: 'message'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMessageKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Message__Group__0__Impl7100); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3310:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3314:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3315:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__17131);
            rule__Message__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__2_in_rule__Message__Group__17134);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3322:1: rule__Message__Group__1__Impl : ( ( rule__Message__NameAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3326:1: ( ( ( rule__Message__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3327:1: ( ( rule__Message__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3327:1: ( ( rule__Message__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3328:1: ( rule__Message__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3329:1: ( rule__Message__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3329:2: rule__Message__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Message__NameAssignment_1_in_rule__Message__Group__1__Impl7161);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3339:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3343:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3344:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__27191);
            rule__Message__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__3_in_rule__Message__Group__27194);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3351:1: rule__Message__Group__2__Impl : ( '{' ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3355:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3356:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3356:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3357:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__Message__Group__2__Impl7222); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3370:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3374:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3375:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__37253);
            rule__Message__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__4_in_rule__Message__Group__37256);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3382:1: rule__Message__Group__3__Impl : ( ( rule__Message__ElementsAssignment_3 )* ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3386:1: ( ( ( rule__Message__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3387:1: ( ( rule__Message__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3387:1: ( ( rule__Message__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3388:1: ( rule__Message__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3389:1: ( rule__Message__ElementsAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=17 && LA26_0<=25)||LA26_0==56) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3389:2: rule__Message__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Message__ElementsAssignment_3_in_rule__Message__Group__3__Impl7283);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3399:1: rule__Message__Group__4 : rule__Message__Group__4__Impl ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3403:1: ( rule__Message__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3404:2: rule__Message__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__47314);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3410:1: rule__Message__Group__4__Impl : ( '}' ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3414:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3415:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3415:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3416:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,55,FOLLOW_55_in_rule__Message__Group__4__Impl7342); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3439:1: rule__Oneof__Group__0 : rule__Oneof__Group__0__Impl rule__Oneof__Group__1 ;
    public final void rule__Oneof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3443:1: ( rule__Oneof__Group__0__Impl rule__Oneof__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3444:2: rule__Oneof__Group__0__Impl rule__Oneof__Group__1
            {
            pushFollow(FOLLOW_rule__Oneof__Group__0__Impl_in_rule__Oneof__Group__07383);
            rule__Oneof__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Oneof__Group__1_in_rule__Oneof__Group__07386);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3451:1: rule__Oneof__Group__0__Impl : ( 'oneof' ) ;
    public final void rule__Oneof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3455:1: ( ( 'oneof' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3456:1: ( 'oneof' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3456:1: ( 'oneof' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3457:1: 'oneof'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getOneofKeyword_0()); 
            }
            match(input,56,FOLLOW_56_in_rule__Oneof__Group__0__Impl7414); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3470:1: rule__Oneof__Group__1 : rule__Oneof__Group__1__Impl rule__Oneof__Group__2 ;
    public final void rule__Oneof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3474:1: ( rule__Oneof__Group__1__Impl rule__Oneof__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3475:2: rule__Oneof__Group__1__Impl rule__Oneof__Group__2
            {
            pushFollow(FOLLOW_rule__Oneof__Group__1__Impl_in_rule__Oneof__Group__17445);
            rule__Oneof__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Oneof__Group__2_in_rule__Oneof__Group__17448);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3482:1: rule__Oneof__Group__1__Impl : ( ( rule__Oneof__NameAssignment_1 ) ) ;
    public final void rule__Oneof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3486:1: ( ( ( rule__Oneof__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3487:1: ( ( rule__Oneof__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3487:1: ( ( rule__Oneof__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3488:1: ( rule__Oneof__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3489:1: ( rule__Oneof__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3489:2: rule__Oneof__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Oneof__NameAssignment_1_in_rule__Oneof__Group__1__Impl7475);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3499:1: rule__Oneof__Group__2 : rule__Oneof__Group__2__Impl rule__Oneof__Group__3 ;
    public final void rule__Oneof__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3503:1: ( rule__Oneof__Group__2__Impl rule__Oneof__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3504:2: rule__Oneof__Group__2__Impl rule__Oneof__Group__3
            {
            pushFollow(FOLLOW_rule__Oneof__Group__2__Impl_in_rule__Oneof__Group__27505);
            rule__Oneof__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Oneof__Group__3_in_rule__Oneof__Group__27508);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3511:1: rule__Oneof__Group__2__Impl : ( '{' ) ;
    public final void rule__Oneof__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3515:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3516:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3516:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3517:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__Oneof__Group__2__Impl7536); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3530:1: rule__Oneof__Group__3 : rule__Oneof__Group__3__Impl rule__Oneof__Group__4 ;
    public final void rule__Oneof__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3534:1: ( rule__Oneof__Group__3__Impl rule__Oneof__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3535:2: rule__Oneof__Group__3__Impl rule__Oneof__Group__4
            {
            pushFollow(FOLLOW_rule__Oneof__Group__3__Impl_in_rule__Oneof__Group__37567);
            rule__Oneof__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Oneof__Group__4_in_rule__Oneof__Group__37570);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3542:1: rule__Oneof__Group__3__Impl : ( ( rule__Oneof__FieldsAssignment_3 )* ) ;
    public final void rule__Oneof__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3546:1: ( ( ( rule__Oneof__FieldsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3547:1: ( ( rule__Oneof__FieldsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3547:1: ( ( rule__Oneof__FieldsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3548:1: ( rule__Oneof__FieldsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getFieldsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3549:1: ( rule__Oneof__FieldsAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||(LA27_0>=13 && LA27_0<=48)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3549:2: rule__Oneof__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Oneof__FieldsAssignment_3_in_rule__Oneof__Group__3__Impl7597);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3559:1: rule__Oneof__Group__4 : rule__Oneof__Group__4__Impl ;
    public final void rule__Oneof__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3563:1: ( rule__Oneof__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3564:2: rule__Oneof__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Oneof__Group__4__Impl_in_rule__Oneof__Group__47628);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3570:1: rule__Oneof__Group__4__Impl : ( '}' ) ;
    public final void rule__Oneof__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3574:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3575:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3575:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3576:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,55,FOLLOW_55_in_rule__Oneof__Group__4__Impl7656); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3599:1: rule__OneofField__Group__0 : rule__OneofField__Group__0__Impl rule__OneofField__Group__1 ;
    public final void rule__OneofField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3603:1: ( rule__OneofField__Group__0__Impl rule__OneofField__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3604:2: rule__OneofField__Group__0__Impl rule__OneofField__Group__1
            {
            pushFollow(FOLLOW_rule__OneofField__Group__0__Impl_in_rule__OneofField__Group__07697);
            rule__OneofField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OneofField__Group__1_in_rule__OneofField__Group__07700);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3611:1: rule__OneofField__Group__0__Impl : ( ( rule__OneofField__TypeAssignment_0 ) ) ;
    public final void rule__OneofField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3615:1: ( ( ( rule__OneofField__TypeAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3616:1: ( ( rule__OneofField__TypeAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3616:1: ( ( rule__OneofField__TypeAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3617:1: ( rule__OneofField__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getTypeAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3618:1: ( rule__OneofField__TypeAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3618:2: rule__OneofField__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__OneofField__TypeAssignment_0_in_rule__OneofField__Group__0__Impl7727);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3628:1: rule__OneofField__Group__1 : rule__OneofField__Group__1__Impl rule__OneofField__Group__2 ;
    public final void rule__OneofField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3632:1: ( rule__OneofField__Group__1__Impl rule__OneofField__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3633:2: rule__OneofField__Group__1__Impl rule__OneofField__Group__2
            {
            pushFollow(FOLLOW_rule__OneofField__Group__1__Impl_in_rule__OneofField__Group__17757);
            rule__OneofField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OneofField__Group__2_in_rule__OneofField__Group__17760);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3640:1: rule__OneofField__Group__1__Impl : ( ( rule__OneofField__NameAssignment_1 ) ) ;
    public final void rule__OneofField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3644:1: ( ( ( rule__OneofField__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3645:1: ( ( rule__OneofField__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3645:1: ( ( rule__OneofField__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3646:1: ( rule__OneofField__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3647:1: ( rule__OneofField__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3647:2: rule__OneofField__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OneofField__NameAssignment_1_in_rule__OneofField__Group__1__Impl7787);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3657:1: rule__OneofField__Group__2 : rule__OneofField__Group__2__Impl rule__OneofField__Group__3 ;
    public final void rule__OneofField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3661:1: ( rule__OneofField__Group__2__Impl rule__OneofField__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3662:2: rule__OneofField__Group__2__Impl rule__OneofField__Group__3
            {
            pushFollow(FOLLOW_rule__OneofField__Group__2__Impl_in_rule__OneofField__Group__27817);
            rule__OneofField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OneofField__Group__3_in_rule__OneofField__Group__27820);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3669:1: rule__OneofField__Group__2__Impl : ( '=' ) ;
    public final void rule__OneofField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3673:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3674:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3674:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3675:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getEqualsSignKeyword_2()); 
            }
            match(input,51,FOLLOW_51_in_rule__OneofField__Group__2__Impl7848); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3688:1: rule__OneofField__Group__3 : rule__OneofField__Group__3__Impl rule__OneofField__Group__4 ;
    public final void rule__OneofField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3692:1: ( rule__OneofField__Group__3__Impl rule__OneofField__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3693:2: rule__OneofField__Group__3__Impl rule__OneofField__Group__4
            {
            pushFollow(FOLLOW_rule__OneofField__Group__3__Impl_in_rule__OneofField__Group__37879);
            rule__OneofField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OneofField__Group__4_in_rule__OneofField__Group__37882);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3700:1: rule__OneofField__Group__3__Impl : ( ( rule__OneofField__IndexAssignment_3 ) ) ;
    public final void rule__OneofField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3704:1: ( ( ( rule__OneofField__IndexAssignment_3 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3705:1: ( ( rule__OneofField__IndexAssignment_3 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3705:1: ( ( rule__OneofField__IndexAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3706:1: ( rule__OneofField__IndexAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getIndexAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3707:1: ( rule__OneofField__IndexAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3707:2: rule__OneofField__IndexAssignment_3
            {
            pushFollow(FOLLOW_rule__OneofField__IndexAssignment_3_in_rule__OneofField__Group__3__Impl7909);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3717:1: rule__OneofField__Group__4 : rule__OneofField__Group__4__Impl rule__OneofField__Group__5 ;
    public final void rule__OneofField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3721:1: ( rule__OneofField__Group__4__Impl rule__OneofField__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3722:2: rule__OneofField__Group__4__Impl rule__OneofField__Group__5
            {
            pushFollow(FOLLOW_rule__OneofField__Group__4__Impl_in_rule__OneofField__Group__47939);
            rule__OneofField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OneofField__Group__5_in_rule__OneofField__Group__47942);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3729:1: rule__OneofField__Group__4__Impl : ( ( rule__OneofField__OptionsAssignment_4 )? ) ;
    public final void rule__OneofField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3733:1: ( ( ( rule__OneofField__OptionsAssignment_4 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3734:1: ( ( rule__OneofField__OptionsAssignment_4 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3734:1: ( ( rule__OneofField__OptionsAssignment_4 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3735:1: ( rule__OneofField__OptionsAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getOptionsAssignment_4()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3736:1: ( rule__OneofField__OptionsAssignment_4 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==58) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3736:2: rule__OneofField__OptionsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__OneofField__OptionsAssignment_4_in_rule__OneofField__Group__4__Impl7969);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3746:1: rule__OneofField__Group__5 : rule__OneofField__Group__5__Impl ;
    public final void rule__OneofField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3750:1: ( rule__OneofField__Group__5__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3751:2: rule__OneofField__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__OneofField__Group__5__Impl_in_rule__OneofField__Group__58000);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3757:1: rule__OneofField__Group__5__Impl : ( ';' ) ;
    public final void rule__OneofField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3761:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3762:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3762:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3763:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getSemicolonKeyword_5()); 
            }
            match(input,52,FOLLOW_52_in_rule__OneofField__Group__5__Impl8028); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3788:1: rule__ExtensionRange__Group__0 : rule__ExtensionRange__Group__0__Impl rule__ExtensionRange__Group__1 ;
    public final void rule__ExtensionRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3792:1: ( rule__ExtensionRange__Group__0__Impl rule__ExtensionRange__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3793:2: rule__ExtensionRange__Group__0__Impl rule__ExtensionRange__Group__1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__0__Impl_in_rule__ExtensionRange__Group__08071);
            rule__ExtensionRange__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group__1_in_rule__ExtensionRange__Group__08074);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3800:1: rule__ExtensionRange__Group__0__Impl : ( 'extensions' ) ;
    public final void rule__ExtensionRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3804:1: ( ( 'extensions' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3805:1: ( 'extensions' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3805:1: ( 'extensions' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3806:1: 'extensions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getExtensionsKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__ExtensionRange__Group__0__Impl8102); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3819:1: rule__ExtensionRange__Group__1 : rule__ExtensionRange__Group__1__Impl rule__ExtensionRange__Group__2 ;
    public final void rule__ExtensionRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3823:1: ( rule__ExtensionRange__Group__1__Impl rule__ExtensionRange__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3824:2: rule__ExtensionRange__Group__1__Impl rule__ExtensionRange__Group__2
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__1__Impl_in_rule__ExtensionRange__Group__18133);
            rule__ExtensionRange__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group__2_in_rule__ExtensionRange__Group__18136);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3831:1: rule__ExtensionRange__Group__1__Impl : ( ( rule__ExtensionRange__RangesAssignment_1 ) ) ;
    public final void rule__ExtensionRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3835:1: ( ( ( rule__ExtensionRange__RangesAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3836:1: ( ( rule__ExtensionRange__RangesAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3836:1: ( ( rule__ExtensionRange__RangesAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3837:1: ( rule__ExtensionRange__RangesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getRangesAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3838:1: ( rule__ExtensionRange__RangesAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3838:2: rule__ExtensionRange__RangesAssignment_1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__RangesAssignment_1_in_rule__ExtensionRange__Group__1__Impl8163);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3848:1: rule__ExtensionRange__Group__2 : rule__ExtensionRange__Group__2__Impl rule__ExtensionRange__Group__3 ;
    public final void rule__ExtensionRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3852:1: ( rule__ExtensionRange__Group__2__Impl rule__ExtensionRange__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3853:2: rule__ExtensionRange__Group__2__Impl rule__ExtensionRange__Group__3
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__2__Impl_in_rule__ExtensionRange__Group__28193);
            rule__ExtensionRange__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group__3_in_rule__ExtensionRange__Group__28196);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3860:1: rule__ExtensionRange__Group__2__Impl : ( ( rule__ExtensionRange__Group_2__0 )* ) ;
    public final void rule__ExtensionRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3864:1: ( ( ( rule__ExtensionRange__Group_2__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3865:1: ( ( rule__ExtensionRange__Group_2__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3865:1: ( ( rule__ExtensionRange__Group_2__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3866:1: ( rule__ExtensionRange__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getGroup_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3867:1: ( rule__ExtensionRange__Group_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==57) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3867:2: rule__ExtensionRange__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ExtensionRange__Group_2__0_in_rule__ExtensionRange__Group__2__Impl8223);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3877:1: rule__ExtensionRange__Group__3 : rule__ExtensionRange__Group__3__Impl ;
    public final void rule__ExtensionRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3881:1: ( rule__ExtensionRange__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3882:2: rule__ExtensionRange__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group__3__Impl_in_rule__ExtensionRange__Group__38254);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3888:1: rule__ExtensionRange__Group__3__Impl : ( ';' ) ;
    public final void rule__ExtensionRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3892:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3893:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3893:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3894:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getSemicolonKeyword_3()); 
            }
            match(input,52,FOLLOW_52_in_rule__ExtensionRange__Group__3__Impl8282); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3915:1: rule__ExtensionRange__Group_2__0 : rule__ExtensionRange__Group_2__0__Impl rule__ExtensionRange__Group_2__1 ;
    public final void rule__ExtensionRange__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3919:1: ( rule__ExtensionRange__Group_2__0__Impl rule__ExtensionRange__Group_2__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3920:2: rule__ExtensionRange__Group_2__0__Impl rule__ExtensionRange__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group_2__0__Impl_in_rule__ExtensionRange__Group_2__08321);
            rule__ExtensionRange__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtensionRange__Group_2__1_in_rule__ExtensionRange__Group_2__08324);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3927:1: rule__ExtensionRange__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ExtensionRange__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3931:1: ( ( ',' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3932:1: ( ',' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3932:1: ( ',' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3933:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getCommaKeyword_2_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__ExtensionRange__Group_2__0__Impl8352); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3946:1: rule__ExtensionRange__Group_2__1 : rule__ExtensionRange__Group_2__1__Impl ;
    public final void rule__ExtensionRange__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3950:1: ( rule__ExtensionRange__Group_2__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3951:2: rule__ExtensionRange__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtensionRange__Group_2__1__Impl_in_rule__ExtensionRange__Group_2__18383);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3957:1: rule__ExtensionRange__Group_2__1__Impl : ( ( rule__ExtensionRange__RangesAssignment_2_1 ) ) ;
    public final void rule__ExtensionRange__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3961:1: ( ( ( rule__ExtensionRange__RangesAssignment_2_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3962:1: ( ( rule__ExtensionRange__RangesAssignment_2_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3962:1: ( ( rule__ExtensionRange__RangesAssignment_2_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3963:1: ( rule__ExtensionRange__RangesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getRangesAssignment_2_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3964:1: ( rule__ExtensionRange__RangesAssignment_2_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3964:2: rule__ExtensionRange__RangesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExtensionRange__RangesAssignment_2_1_in_rule__ExtensionRange__Group_2__1__Impl8410);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3978:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3982:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3983:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__08444);
            rule__Range__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Range__Group__1_in_rule__Range__Group__08447);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3990:1: rule__Range__Group__0__Impl : ( ( rule__Range__FromAssignment_0 ) ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3994:1: ( ( ( rule__Range__FromAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3995:1: ( ( rule__Range__FromAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3995:1: ( ( rule__Range__FromAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3996:1: ( rule__Range__FromAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getFromAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3997:1: ( rule__Range__FromAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:3997:2: rule__Range__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Range__FromAssignment_0_in_rule__Range__Group__0__Impl8474);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4007:1: rule__Range__Group__1 : rule__Range__Group__1__Impl ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4011:1: ( rule__Range__Group__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4012:2: rule__Range__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__18504);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4018:1: rule__Range__Group__1__Impl : ( ( rule__Range__Group_1__0 )? ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4022:1: ( ( ( rule__Range__Group_1__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4023:1: ( ( rule__Range__Group_1__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4023:1: ( ( rule__Range__Group_1__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4024:1: ( rule__Range__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getGroup_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4025:1: ( rule__Range__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4025:2: rule__Range__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Range__Group_1__0_in_rule__Range__Group__1__Impl8531);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4039:1: rule__Range__Group_1__0 : rule__Range__Group_1__0__Impl rule__Range__Group_1__1 ;
    public final void rule__Range__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4043:1: ( rule__Range__Group_1__0__Impl rule__Range__Group_1__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4044:2: rule__Range__Group_1__0__Impl rule__Range__Group_1__1
            {
            pushFollow(FOLLOW_rule__Range__Group_1__0__Impl_in_rule__Range__Group_1__08566);
            rule__Range__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Range__Group_1__1_in_rule__Range__Group_1__08569);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4051:1: rule__Range__Group_1__0__Impl : ( 'to' ) ;
    public final void rule__Range__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4055:1: ( ( 'to' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4056:1: ( 'to' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4056:1: ( 'to' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4057:1: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getToKeyword_1_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__Range__Group_1__0__Impl8597); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4070:1: rule__Range__Group_1__1 : rule__Range__Group_1__1__Impl ;
    public final void rule__Range__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4074:1: ( rule__Range__Group_1__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4075:2: rule__Range__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Range__Group_1__1__Impl_in_rule__Range__Group_1__18628);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4081:1: rule__Range__Group_1__1__Impl : ( ( rule__Range__Alternatives_1_1 ) ) ;
    public final void rule__Range__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4085:1: ( ( ( rule__Range__Alternatives_1_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4086:1: ( ( rule__Range__Alternatives_1_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4086:1: ( ( rule__Range__Alternatives_1_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4087:1: ( rule__Range__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getAlternatives_1_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4088:1: ( rule__Range__Alternatives_1_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4088:2: rule__Range__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__Range__Alternatives_1_1_in_rule__Range__Group_1__1__Impl8655);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4102:1: rule__MessageField__Group__0 : rule__MessageField__Group__0__Impl rule__MessageField__Group__1 ;
    public final void rule__MessageField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4106:1: ( rule__MessageField__Group__0__Impl rule__MessageField__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4107:2: rule__MessageField__Group__0__Impl rule__MessageField__Group__1
            {
            pushFollow(FOLLOW_rule__MessageField__Group__0__Impl_in_rule__MessageField__Group__08689);
            rule__MessageField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__1_in_rule__MessageField__Group__08692);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4114:1: rule__MessageField__Group__0__Impl : ( ( rule__MessageField__ModifierAssignment_0 ) ) ;
    public final void rule__MessageField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4118:1: ( ( ( rule__MessageField__ModifierAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4119:1: ( ( rule__MessageField__ModifierAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4119:1: ( ( rule__MessageField__ModifierAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4120:1: ( rule__MessageField__ModifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getModifierAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4121:1: ( rule__MessageField__ModifierAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4121:2: rule__MessageField__ModifierAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageField__ModifierAssignment_0_in_rule__MessageField__Group__0__Impl8719);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4131:1: rule__MessageField__Group__1 : rule__MessageField__Group__1__Impl rule__MessageField__Group__2 ;
    public final void rule__MessageField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4135:1: ( rule__MessageField__Group__1__Impl rule__MessageField__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4136:2: rule__MessageField__Group__1__Impl rule__MessageField__Group__2
            {
            pushFollow(FOLLOW_rule__MessageField__Group__1__Impl_in_rule__MessageField__Group__18749);
            rule__MessageField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__2_in_rule__MessageField__Group__18752);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4143:1: rule__MessageField__Group__1__Impl : ( ( rule__MessageField__TypeAssignment_1 ) ) ;
    public final void rule__MessageField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4147:1: ( ( ( rule__MessageField__TypeAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4148:1: ( ( rule__MessageField__TypeAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4148:1: ( ( rule__MessageField__TypeAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4149:1: ( rule__MessageField__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getTypeAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4150:1: ( rule__MessageField__TypeAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4150:2: rule__MessageField__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MessageField__TypeAssignment_1_in_rule__MessageField__Group__1__Impl8779);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4160:1: rule__MessageField__Group__2 : rule__MessageField__Group__2__Impl rule__MessageField__Group__3 ;
    public final void rule__MessageField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4164:1: ( rule__MessageField__Group__2__Impl rule__MessageField__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4165:2: rule__MessageField__Group__2__Impl rule__MessageField__Group__3
            {
            pushFollow(FOLLOW_rule__MessageField__Group__2__Impl_in_rule__MessageField__Group__28809);
            rule__MessageField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__3_in_rule__MessageField__Group__28812);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4172:1: rule__MessageField__Group__2__Impl : ( ( rule__MessageField__NameAssignment_2 ) ) ;
    public final void rule__MessageField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4176:1: ( ( ( rule__MessageField__NameAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4177:1: ( ( rule__MessageField__NameAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4177:1: ( ( rule__MessageField__NameAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4178:1: ( rule__MessageField__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getNameAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4179:1: ( rule__MessageField__NameAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4179:2: rule__MessageField__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MessageField__NameAssignment_2_in_rule__MessageField__Group__2__Impl8839);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4189:1: rule__MessageField__Group__3 : rule__MessageField__Group__3__Impl rule__MessageField__Group__4 ;
    public final void rule__MessageField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4193:1: ( rule__MessageField__Group__3__Impl rule__MessageField__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4194:2: rule__MessageField__Group__3__Impl rule__MessageField__Group__4
            {
            pushFollow(FOLLOW_rule__MessageField__Group__3__Impl_in_rule__MessageField__Group__38869);
            rule__MessageField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__4_in_rule__MessageField__Group__38872);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4201:1: rule__MessageField__Group__3__Impl : ( '=' ) ;
    public final void rule__MessageField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4205:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4206:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4206:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4207:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getEqualsSignKeyword_3()); 
            }
            match(input,51,FOLLOW_51_in_rule__MessageField__Group__3__Impl8900); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4220:1: rule__MessageField__Group__4 : rule__MessageField__Group__4__Impl rule__MessageField__Group__5 ;
    public final void rule__MessageField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4224:1: ( rule__MessageField__Group__4__Impl rule__MessageField__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4225:2: rule__MessageField__Group__4__Impl rule__MessageField__Group__5
            {
            pushFollow(FOLLOW_rule__MessageField__Group__4__Impl_in_rule__MessageField__Group__48931);
            rule__MessageField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__5_in_rule__MessageField__Group__48934);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4232:1: rule__MessageField__Group__4__Impl : ( ( rule__MessageField__IndexAssignment_4 ) ) ;
    public final void rule__MessageField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4236:1: ( ( ( rule__MessageField__IndexAssignment_4 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4237:1: ( ( rule__MessageField__IndexAssignment_4 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4237:1: ( ( rule__MessageField__IndexAssignment_4 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4238:1: ( rule__MessageField__IndexAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getIndexAssignment_4()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4239:1: ( rule__MessageField__IndexAssignment_4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4239:2: rule__MessageField__IndexAssignment_4
            {
            pushFollow(FOLLOW_rule__MessageField__IndexAssignment_4_in_rule__MessageField__Group__4__Impl8961);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4249:1: rule__MessageField__Group__5 : rule__MessageField__Group__5__Impl rule__MessageField__Group__6 ;
    public final void rule__MessageField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4253:1: ( rule__MessageField__Group__5__Impl rule__MessageField__Group__6 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4254:2: rule__MessageField__Group__5__Impl rule__MessageField__Group__6
            {
            pushFollow(FOLLOW_rule__MessageField__Group__5__Impl_in_rule__MessageField__Group__58991);
            rule__MessageField__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageField__Group__6_in_rule__MessageField__Group__58994);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4261:1: rule__MessageField__Group__5__Impl : ( ( rule__MessageField__OptionsAssignment_5 )? ) ;
    public final void rule__MessageField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4265:1: ( ( ( rule__MessageField__OptionsAssignment_5 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4266:1: ( ( rule__MessageField__OptionsAssignment_5 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4266:1: ( ( rule__MessageField__OptionsAssignment_5 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4267:1: ( rule__MessageField__OptionsAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getOptionsAssignment_5()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4268:1: ( rule__MessageField__OptionsAssignment_5 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==58) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4268:2: rule__MessageField__OptionsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__MessageField__OptionsAssignment_5_in_rule__MessageField__Group__5__Impl9021);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4278:1: rule__MessageField__Group__6 : rule__MessageField__Group__6__Impl ;
    public final void rule__MessageField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4282:1: ( rule__MessageField__Group__6__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4283:2: rule__MessageField__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MessageField__Group__6__Impl_in_rule__MessageField__Group__69052);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4289:1: rule__MessageField__Group__6__Impl : ( ';' ) ;
    public final void rule__MessageField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4293:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4294:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4294:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4295:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getSemicolonKeyword_6()); 
            }
            match(input,52,FOLLOW_52_in_rule__MessageField__Group__6__Impl9080); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4322:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4326:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4327:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__09125);
            rule__Group__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__1_in_rule__Group__Group__09128);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4334:1: rule__Group__Group__0__Impl : ( ( rule__Group__ModifierAssignment_0 ) ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4338:1: ( ( ( rule__Group__ModifierAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4339:1: ( ( rule__Group__ModifierAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4339:1: ( ( rule__Group__ModifierAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4340:1: ( rule__Group__ModifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getModifierAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4341:1: ( rule__Group__ModifierAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4341:2: rule__Group__ModifierAssignment_0
            {
            pushFollow(FOLLOW_rule__Group__ModifierAssignment_0_in_rule__Group__Group__0__Impl9155);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4351:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4355:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4356:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__19185);
            rule__Group__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__2_in_rule__Group__Group__19188);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4363:1: rule__Group__Group__1__Impl : ( 'group' ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4367:1: ( ( 'group' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4368:1: ( 'group' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4368:1: ( 'group' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4369:1: 'group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getGroupKeyword_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Group__Group__1__Impl9216); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4382:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4386:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4387:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__29247);
            rule__Group__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__3_in_rule__Group__Group__29250);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4394:1: rule__Group__Group__2__Impl : ( ( rule__Group__NameAssignment_2 ) ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4398:1: ( ( ( rule__Group__NameAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4399:1: ( ( rule__Group__NameAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4399:1: ( ( rule__Group__NameAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4400:1: ( rule__Group__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getNameAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4401:1: ( rule__Group__NameAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4401:2: rule__Group__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl9277);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4411:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4415:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4416:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__39307);
            rule__Group__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__4_in_rule__Group__Group__39310);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4423:1: rule__Group__Group__3__Impl : ( '=' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4427:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4428:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4428:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4429:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getEqualsSignKeyword_3()); 
            }
            match(input,51,FOLLOW_51_in_rule__Group__Group__3__Impl9338); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4442:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4446:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4447:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__49369);
            rule__Group__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__5_in_rule__Group__Group__49372);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4454:1: rule__Group__Group__4__Impl : ( ( rule__Group__IndexAssignment_4 ) ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4458:1: ( ( ( rule__Group__IndexAssignment_4 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4459:1: ( ( rule__Group__IndexAssignment_4 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4459:1: ( ( rule__Group__IndexAssignment_4 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4460:1: ( rule__Group__IndexAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getIndexAssignment_4()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4461:1: ( rule__Group__IndexAssignment_4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4461:2: rule__Group__IndexAssignment_4
            {
            pushFollow(FOLLOW_rule__Group__IndexAssignment_4_in_rule__Group__Group__4__Impl9399);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4471:1: rule__Group__Group__5 : rule__Group__Group__5__Impl rule__Group__Group__6 ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4475:1: ( rule__Group__Group__5__Impl rule__Group__Group__6 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4476:2: rule__Group__Group__5__Impl rule__Group__Group__6
            {
            pushFollow(FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__59429);
            rule__Group__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__6_in_rule__Group__Group__59432);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4483:1: rule__Group__Group__5__Impl : ( '{' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4487:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4488:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4488:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4489:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,54,FOLLOW_54_in_rule__Group__Group__5__Impl9460); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4502:1: rule__Group__Group__6 : rule__Group__Group__6__Impl rule__Group__Group__7 ;
    public final void rule__Group__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4506:1: ( rule__Group__Group__6__Impl rule__Group__Group__7 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4507:2: rule__Group__Group__6__Impl rule__Group__Group__7
            {
            pushFollow(FOLLOW_rule__Group__Group__6__Impl_in_rule__Group__Group__69491);
            rule__Group__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Group__Group__7_in_rule__Group__Group__69494);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4514:1: rule__Group__Group__6__Impl : ( ( rule__Group__ElementsAssignment_6 )* ) ;
    public final void rule__Group__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4518:1: ( ( ( rule__Group__ElementsAssignment_6 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4519:1: ( ( rule__Group__ElementsAssignment_6 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4519:1: ( ( rule__Group__ElementsAssignment_6 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4520:1: ( rule__Group__ElementsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getElementsAssignment_6()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4521:1: ( rule__Group__ElementsAssignment_6 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=21 && LA32_0<=23)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4521:2: rule__Group__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Group__ElementsAssignment_6_in_rule__Group__Group__6__Impl9521);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4531:1: rule__Group__Group__7 : rule__Group__Group__7__Impl ;
    public final void rule__Group__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4535:1: ( rule__Group__Group__7__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4536:2: rule__Group__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Group__Group__7__Impl_in_rule__Group__Group__79552);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4542:1: rule__Group__Group__7__Impl : ( '}' ) ;
    public final void rule__Group__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4546:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4547:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4547:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4548:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,55,FOLLOW_55_in_rule__Group__Group__7__Impl9580); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4577:1: rule__FieldOptions__Group__0 : rule__FieldOptions__Group__0__Impl rule__FieldOptions__Group__1 ;
    public final void rule__FieldOptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4581:1: ( rule__FieldOptions__Group__0__Impl rule__FieldOptions__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4582:2: rule__FieldOptions__Group__0__Impl rule__FieldOptions__Group__1
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__0__Impl_in_rule__FieldOptions__Group__09627);
            rule__FieldOptions__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group__1_in_rule__FieldOptions__Group__09630);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4589:1: rule__FieldOptions__Group__0__Impl : ( '[' ) ;
    public final void rule__FieldOptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4593:1: ( ( '[' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4594:1: ( '[' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4594:1: ( '[' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4595:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,58,FOLLOW_58_in_rule__FieldOptions__Group__0__Impl9658); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4608:1: rule__FieldOptions__Group__1 : rule__FieldOptions__Group__1__Impl rule__FieldOptions__Group__2 ;
    public final void rule__FieldOptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4612:1: ( rule__FieldOptions__Group__1__Impl rule__FieldOptions__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4613:2: rule__FieldOptions__Group__1__Impl rule__FieldOptions__Group__2
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__1__Impl_in_rule__FieldOptions__Group__19689);
            rule__FieldOptions__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group__2_in_rule__FieldOptions__Group__19692);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4620:1: rule__FieldOptions__Group__1__Impl : ( ( rule__FieldOptions__OptionsAssignment_1 ) ) ;
    public final void rule__FieldOptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4624:1: ( ( ( rule__FieldOptions__OptionsAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4625:1: ( ( rule__FieldOptions__OptionsAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4625:1: ( ( rule__FieldOptions__OptionsAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4626:1: ( rule__FieldOptions__OptionsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4627:1: ( rule__FieldOptions__OptionsAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4627:2: rule__FieldOptions__OptionsAssignment_1
            {
            pushFollow(FOLLOW_rule__FieldOptions__OptionsAssignment_1_in_rule__FieldOptions__Group__1__Impl9719);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4637:1: rule__FieldOptions__Group__2 : rule__FieldOptions__Group__2__Impl rule__FieldOptions__Group__3 ;
    public final void rule__FieldOptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4641:1: ( rule__FieldOptions__Group__2__Impl rule__FieldOptions__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4642:2: rule__FieldOptions__Group__2__Impl rule__FieldOptions__Group__3
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__2__Impl_in_rule__FieldOptions__Group__29749);
            rule__FieldOptions__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group__3_in_rule__FieldOptions__Group__29752);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4649:1: rule__FieldOptions__Group__2__Impl : ( ( rule__FieldOptions__Group_2__0 )* ) ;
    public final void rule__FieldOptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4653:1: ( ( ( rule__FieldOptions__Group_2__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4654:1: ( ( rule__FieldOptions__Group_2__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4654:1: ( ( rule__FieldOptions__Group_2__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4655:1: ( rule__FieldOptions__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getGroup_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4656:1: ( rule__FieldOptions__Group_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==57) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4656:2: rule__FieldOptions__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FieldOptions__Group_2__0_in_rule__FieldOptions__Group__2__Impl9779);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4666:1: rule__FieldOptions__Group__3 : rule__FieldOptions__Group__3__Impl ;
    public final void rule__FieldOptions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4670:1: ( rule__FieldOptions__Group__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4671:2: rule__FieldOptions__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group__3__Impl_in_rule__FieldOptions__Group__39810);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4677:1: rule__FieldOptions__Group__3__Impl : ( ']' ) ;
    public final void rule__FieldOptions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4681:1: ( ( ']' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4682:1: ( ']' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4682:1: ( ']' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4683:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,59,FOLLOW_59_in_rule__FieldOptions__Group__3__Impl9838); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4704:1: rule__FieldOptions__Group_2__0 : rule__FieldOptions__Group_2__0__Impl rule__FieldOptions__Group_2__1 ;
    public final void rule__FieldOptions__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4708:1: ( rule__FieldOptions__Group_2__0__Impl rule__FieldOptions__Group_2__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4709:2: rule__FieldOptions__Group_2__0__Impl rule__FieldOptions__Group_2__1
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group_2__0__Impl_in_rule__FieldOptions__Group_2__09877);
            rule__FieldOptions__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldOptions__Group_2__1_in_rule__FieldOptions__Group_2__09880);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4716:1: rule__FieldOptions__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FieldOptions__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4720:1: ( ( ',' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4721:1: ( ',' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4721:1: ( ',' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4722:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getCommaKeyword_2_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__FieldOptions__Group_2__0__Impl9908); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4735:1: rule__FieldOptions__Group_2__1 : rule__FieldOptions__Group_2__1__Impl ;
    public final void rule__FieldOptions__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4739:1: ( rule__FieldOptions__Group_2__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4740:2: rule__FieldOptions__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldOptions__Group_2__1__Impl_in_rule__FieldOptions__Group_2__19939);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4746:1: rule__FieldOptions__Group_2__1__Impl : ( ( rule__FieldOptions__OptionsAssignment_2_1 ) ) ;
    public final void rule__FieldOptions__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4750:1: ( ( ( rule__FieldOptions__OptionsAssignment_2_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4751:1: ( ( rule__FieldOptions__OptionsAssignment_2_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4751:1: ( ( rule__FieldOptions__OptionsAssignment_2_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4752:1: ( rule__FieldOptions__OptionsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsAssignment_2_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4753:1: ( rule__FieldOptions__OptionsAssignment_2_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4753:2: rule__FieldOptions__OptionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FieldOptions__OptionsAssignment_2_1_in_rule__FieldOptions__Group_2__1__Impl9966);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4767:1: rule__PackedValueFieldOption__Group__0 : rule__PackedValueFieldOption__Group__0__Impl rule__PackedValueFieldOption__Group__1 ;
    public final void rule__PackedValueFieldOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4771:1: ( rule__PackedValueFieldOption__Group__0__Impl rule__PackedValueFieldOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4772:2: rule__PackedValueFieldOption__Group__0__Impl rule__PackedValueFieldOption__Group__1
            {
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__0__Impl_in_rule__PackedValueFieldOption__Group__010000);
            rule__PackedValueFieldOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__1_in_rule__PackedValueFieldOption__Group__010003);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4779:1: rule__PackedValueFieldOption__Group__0__Impl : ( ( 'packed' ) ) ;
    public final void rule__PackedValueFieldOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4783:1: ( ( ( 'packed' ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4784:1: ( ( 'packed' ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4784:1: ( ( 'packed' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4785:1: ( 'packed' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionAccess().getPackedKeyword_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4786:1: ( 'packed' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4787:2: 'packed'
            {
            match(input,48,FOLLOW_48_in_rule__PackedValueFieldOption__Group__0__Impl10032); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4798:1: rule__PackedValueFieldOption__Group__1 : rule__PackedValueFieldOption__Group__1__Impl rule__PackedValueFieldOption__Group__2 ;
    public final void rule__PackedValueFieldOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4802:1: ( rule__PackedValueFieldOption__Group__1__Impl rule__PackedValueFieldOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4803:2: rule__PackedValueFieldOption__Group__1__Impl rule__PackedValueFieldOption__Group__2
            {
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__1__Impl_in_rule__PackedValueFieldOption__Group__110064);
            rule__PackedValueFieldOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__2_in_rule__PackedValueFieldOption__Group__110067);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4810:1: rule__PackedValueFieldOption__Group__1__Impl : ( '=' ) ;
    public final void rule__PackedValueFieldOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4814:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4815:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4815:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4816:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,51,FOLLOW_51_in_rule__PackedValueFieldOption__Group__1__Impl10095); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4829:1: rule__PackedValueFieldOption__Group__2 : rule__PackedValueFieldOption__Group__2__Impl ;
    public final void rule__PackedValueFieldOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4833:1: ( rule__PackedValueFieldOption__Group__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4834:2: rule__PackedValueFieldOption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PackedValueFieldOption__Group__2__Impl_in_rule__PackedValueFieldOption__Group__210126);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4840:1: rule__PackedValueFieldOption__Group__2__Impl : ( ( rule__PackedValueFieldOption__ValueAssignment_2 ) ) ;
    public final void rule__PackedValueFieldOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4844:1: ( ( ( rule__PackedValueFieldOption__ValueAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4845:1: ( ( rule__PackedValueFieldOption__ValueAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4845:1: ( ( rule__PackedValueFieldOption__ValueAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4846:1: ( rule__PackedValueFieldOption__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionAccess().getValueAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4847:1: ( rule__PackedValueFieldOption__ValueAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4847:2: rule__PackedValueFieldOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__PackedValueFieldOption__ValueAssignment_2_in_rule__PackedValueFieldOption__Group__2__Impl10153);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4863:1: rule__DefaultValueFieldOption__Group__0 : rule__DefaultValueFieldOption__Group__0__Impl rule__DefaultValueFieldOption__Group__1 ;
    public final void rule__DefaultValueFieldOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4867:1: ( rule__DefaultValueFieldOption__Group__0__Impl rule__DefaultValueFieldOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4868:2: rule__DefaultValueFieldOption__Group__0__Impl rule__DefaultValueFieldOption__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__0__Impl_in_rule__DefaultValueFieldOption__Group__010189);
            rule__DefaultValueFieldOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__1_in_rule__DefaultValueFieldOption__Group__010192);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4875:1: rule__DefaultValueFieldOption__Group__0__Impl : ( ( 'default' ) ) ;
    public final void rule__DefaultValueFieldOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4879:1: ( ( ( 'default' ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4880:1: ( ( 'default' ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4880:1: ( ( 'default' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4881:1: ( 'default' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getDefaultKeyword_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4882:1: ( 'default' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4883:2: 'default'
            {
            match(input,44,FOLLOW_44_in_rule__DefaultValueFieldOption__Group__0__Impl10221); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4894:1: rule__DefaultValueFieldOption__Group__1 : rule__DefaultValueFieldOption__Group__1__Impl rule__DefaultValueFieldOption__Group__2 ;
    public final void rule__DefaultValueFieldOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4898:1: ( rule__DefaultValueFieldOption__Group__1__Impl rule__DefaultValueFieldOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4899:2: rule__DefaultValueFieldOption__Group__1__Impl rule__DefaultValueFieldOption__Group__2
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__1__Impl_in_rule__DefaultValueFieldOption__Group__110253);
            rule__DefaultValueFieldOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__2_in_rule__DefaultValueFieldOption__Group__110256);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4906:1: rule__DefaultValueFieldOption__Group__1__Impl : ( '=' ) ;
    public final void rule__DefaultValueFieldOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4910:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4911:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4911:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4912:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,51,FOLLOW_51_in_rule__DefaultValueFieldOption__Group__1__Impl10284); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4925:1: rule__DefaultValueFieldOption__Group__2 : rule__DefaultValueFieldOption__Group__2__Impl ;
    public final void rule__DefaultValueFieldOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4929:1: ( rule__DefaultValueFieldOption__Group__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4930:2: rule__DefaultValueFieldOption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__Group__2__Impl_in_rule__DefaultValueFieldOption__Group__210315);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4936:1: rule__DefaultValueFieldOption__Group__2__Impl : ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) ) ;
    public final void rule__DefaultValueFieldOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4940:1: ( ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4941:1: ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4941:1: ( ( rule__DefaultValueFieldOption__ValueAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4942:1: ( rule__DefaultValueFieldOption__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getValueAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4943:1: ( rule__DefaultValueFieldOption__ValueAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4943:2: rule__DefaultValueFieldOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__DefaultValueFieldOption__ValueAssignment_2_in_rule__DefaultValueFieldOption__Group__2__Impl10342);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4959:1: rule__NativeFieldOption__Group__0 : rule__NativeFieldOption__Group__0__Impl rule__NativeFieldOption__Group__1 ;
    public final void rule__NativeFieldOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4963:1: ( rule__NativeFieldOption__Group__0__Impl rule__NativeFieldOption__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4964:2: rule__NativeFieldOption__Group__0__Impl rule__NativeFieldOption__Group__1
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__0__Impl_in_rule__NativeFieldOption__Group__010378);
            rule__NativeFieldOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__1_in_rule__NativeFieldOption__Group__010381);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4971:1: rule__NativeFieldOption__Group__0__Impl : ( ( rule__NativeFieldOption__SourceAssignment_0 ) ) ;
    public final void rule__NativeFieldOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4975:1: ( ( ( rule__NativeFieldOption__SourceAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4976:1: ( ( rule__NativeFieldOption__SourceAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4976:1: ( ( rule__NativeFieldOption__SourceAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4977:1: ( rule__NativeFieldOption__SourceAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getSourceAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4978:1: ( rule__NativeFieldOption__SourceAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4978:2: rule__NativeFieldOption__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__SourceAssignment_0_in_rule__NativeFieldOption__Group__0__Impl10408);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4988:1: rule__NativeFieldOption__Group__1 : rule__NativeFieldOption__Group__1__Impl rule__NativeFieldOption__Group__2 ;
    public final void rule__NativeFieldOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4992:1: ( rule__NativeFieldOption__Group__1__Impl rule__NativeFieldOption__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:4993:2: rule__NativeFieldOption__Group__1__Impl rule__NativeFieldOption__Group__2
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__1__Impl_in_rule__NativeFieldOption__Group__110438);
            rule__NativeFieldOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__2_in_rule__NativeFieldOption__Group__110441);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5000:1: rule__NativeFieldOption__Group__1__Impl : ( '=' ) ;
    public final void rule__NativeFieldOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5004:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5005:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5005:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5006:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,51,FOLLOW_51_in_rule__NativeFieldOption__Group__1__Impl10469); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5019:1: rule__NativeFieldOption__Group__2 : rule__NativeFieldOption__Group__2__Impl ;
    public final void rule__NativeFieldOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5023:1: ( rule__NativeFieldOption__Group__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5024:2: rule__NativeFieldOption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__Group__2__Impl_in_rule__NativeFieldOption__Group__210500);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5030:1: rule__NativeFieldOption__Group__2__Impl : ( ( rule__NativeFieldOption__ValueAssignment_2 ) ) ;
    public final void rule__NativeFieldOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5034:1: ( ( ( rule__NativeFieldOption__ValueAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5035:1: ( ( rule__NativeFieldOption__ValueAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5035:1: ( ( rule__NativeFieldOption__ValueAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5036:1: ( rule__NativeFieldOption__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getValueAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5037:1: ( rule__NativeFieldOption__ValueAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5037:2: rule__NativeFieldOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__NativeFieldOption__ValueAssignment_2_in_rule__NativeFieldOption__Group__2__Impl10527);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5053:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5057:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5058:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__010563);
            rule__Enum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__010566);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5065:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5069:1: ( ( 'enum' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5070:1: ( 'enum' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5070:1: ( 'enum' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5071:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Enum__Group__0__Impl10594); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5084:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5088:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5089:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__110625);
            rule__Enum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__110628);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5096:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5100:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5101:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5101:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5102:1: ( rule__Enum__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5103:1: ( rule__Enum__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5103:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl10655);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5113:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5117:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5118:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__210685);
            rule__Enum__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__210688);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5125:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5129:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5130:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5130:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5131:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__Enum__Group__2__Impl10716); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5144:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5148:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5149:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__310747);
            rule__Enum__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__310750);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5156:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__ElementsAssignment_3 )* ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5160:1: ( ( ( rule__Enum__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5161:1: ( ( rule__Enum__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5161:1: ( ( rule__Enum__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5162:1: ( rule__Enum__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5163:1: ( rule__Enum__ElementsAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||LA34_0==17) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5163:2: rule__Enum__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enum__ElementsAssignment_3_in_rule__Enum__Group__3__Impl10777);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5173:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5177:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5178:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__410808);
            rule__Enum__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__410811);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5185:1: rule__Enum__Group__4__Impl : ( '}' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5189:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5190:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5190:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5191:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,55,FOLLOW_55_in_rule__Enum__Group__4__Impl10839); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5204:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5208:1: ( rule__Enum__Group__5__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5209:2: rule__Enum__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__510870);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5215:1: rule__Enum__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5219:1: ( ( ( ';' )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5220:1: ( ( ';' )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5220:1: ( ( ';' )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5221:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getSemicolonKeyword_5()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5222:1: ( ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5223:2: ';'
                    {
                    match(input,52,FOLLOW_52_in_rule__Enum__Group__5__Impl10899); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5246:1: rule__EnumField__Group__0 : rule__EnumField__Group__0__Impl rule__EnumField__Group__1 ;
    public final void rule__EnumField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5250:1: ( rule__EnumField__Group__0__Impl rule__EnumField__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5251:2: rule__EnumField__Group__0__Impl rule__EnumField__Group__1
            {
            pushFollow(FOLLOW_rule__EnumField__Group__0__Impl_in_rule__EnumField__Group__010944);
            rule__EnumField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__1_in_rule__EnumField__Group__010947);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5258:1: rule__EnumField__Group__0__Impl : ( ( rule__EnumField__NameAssignment_0 ) ) ;
    public final void rule__EnumField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5262:1: ( ( ( rule__EnumField__NameAssignment_0 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5263:1: ( ( rule__EnumField__NameAssignment_0 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5263:1: ( ( rule__EnumField__NameAssignment_0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5264:1: ( rule__EnumField__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getNameAssignment_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5265:1: ( rule__EnumField__NameAssignment_0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5265:2: rule__EnumField__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumField__NameAssignment_0_in_rule__EnumField__Group__0__Impl10974);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5275:1: rule__EnumField__Group__1 : rule__EnumField__Group__1__Impl rule__EnumField__Group__2 ;
    public final void rule__EnumField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5279:1: ( rule__EnumField__Group__1__Impl rule__EnumField__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5280:2: rule__EnumField__Group__1__Impl rule__EnumField__Group__2
            {
            pushFollow(FOLLOW_rule__EnumField__Group__1__Impl_in_rule__EnumField__Group__111004);
            rule__EnumField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__2_in_rule__EnumField__Group__111007);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5287:1: rule__EnumField__Group__1__Impl : ( '=' ) ;
    public final void rule__EnumField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5291:1: ( ( '=' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5292:1: ( '=' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5292:1: ( '=' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5293:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,51,FOLLOW_51_in_rule__EnumField__Group__1__Impl11035); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5306:1: rule__EnumField__Group__2 : rule__EnumField__Group__2__Impl rule__EnumField__Group__3 ;
    public final void rule__EnumField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5310:1: ( rule__EnumField__Group__2__Impl rule__EnumField__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5311:2: rule__EnumField__Group__2__Impl rule__EnumField__Group__3
            {
            pushFollow(FOLLOW_rule__EnumField__Group__2__Impl_in_rule__EnumField__Group__211066);
            rule__EnumField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__3_in_rule__EnumField__Group__211069);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5318:1: rule__EnumField__Group__2__Impl : ( ( rule__EnumField__IndexAssignment_2 ) ) ;
    public final void rule__EnumField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5322:1: ( ( ( rule__EnumField__IndexAssignment_2 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5323:1: ( ( rule__EnumField__IndexAssignment_2 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5323:1: ( ( rule__EnumField__IndexAssignment_2 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5324:1: ( rule__EnumField__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getIndexAssignment_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5325:1: ( rule__EnumField__IndexAssignment_2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5325:2: rule__EnumField__IndexAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumField__IndexAssignment_2_in_rule__EnumField__Group__2__Impl11096);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5335:1: rule__EnumField__Group__3 : rule__EnumField__Group__3__Impl rule__EnumField__Group__4 ;
    public final void rule__EnumField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5339:1: ( rule__EnumField__Group__3__Impl rule__EnumField__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5340:2: rule__EnumField__Group__3__Impl rule__EnumField__Group__4
            {
            pushFollow(FOLLOW_rule__EnumField__Group__3__Impl_in_rule__EnumField__Group__311126);
            rule__EnumField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__4_in_rule__EnumField__Group__311129);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5347:1: rule__EnumField__Group__3__Impl : ( ( rule__EnumField__Group_3__0 )? ) ;
    public final void rule__EnumField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5351:1: ( ( ( rule__EnumField__Group_3__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5352:1: ( ( rule__EnumField__Group_3__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5352:1: ( ( rule__EnumField__Group_3__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5353:1: ( rule__EnumField__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getGroup_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5354:1: ( rule__EnumField__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==58) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5354:2: rule__EnumField__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumField__Group_3__0_in_rule__EnumField__Group__3__Impl11156);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5364:1: rule__EnumField__Group__4 : rule__EnumField__Group__4__Impl ;
    public final void rule__EnumField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5368:1: ( rule__EnumField__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5369:2: rule__EnumField__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumField__Group__4__Impl_in_rule__EnumField__Group__411187);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5375:1: rule__EnumField__Group__4__Impl : ( ';' ) ;
    public final void rule__EnumField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5379:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5380:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5380:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5381:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getSemicolonKeyword_4()); 
            }
            match(input,52,FOLLOW_52_in_rule__EnumField__Group__4__Impl11215); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5404:1: rule__EnumField__Group_3__0 : rule__EnumField__Group_3__0__Impl rule__EnumField__Group_3__1 ;
    public final void rule__EnumField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5408:1: ( rule__EnumField__Group_3__0__Impl rule__EnumField__Group_3__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5409:2: rule__EnumField__Group_3__0__Impl rule__EnumField__Group_3__1
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__0__Impl_in_rule__EnumField__Group_3__011256);
            rule__EnumField__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3__1_in_rule__EnumField__Group_3__011259);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5416:1: rule__EnumField__Group_3__0__Impl : ( '[' ) ;
    public final void rule__EnumField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5420:1: ( ( '[' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5421:1: ( '[' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5421:1: ( '[' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5422:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getLeftSquareBracketKeyword_3_0()); 
            }
            match(input,58,FOLLOW_58_in_rule__EnumField__Group_3__0__Impl11287); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5435:1: rule__EnumField__Group_3__1 : rule__EnumField__Group_3__1__Impl rule__EnumField__Group_3__2 ;
    public final void rule__EnumField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5439:1: ( rule__EnumField__Group_3__1__Impl rule__EnumField__Group_3__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5440:2: rule__EnumField__Group_3__1__Impl rule__EnumField__Group_3__2
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__1__Impl_in_rule__EnumField__Group_3__111318);
            rule__EnumField__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3__2_in_rule__EnumField__Group_3__111321);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5447:1: rule__EnumField__Group_3__1__Impl : ( ( rule__EnumField__OptionsAssignment_3_1 ) ) ;
    public final void rule__EnumField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5451:1: ( ( ( rule__EnumField__OptionsAssignment_3_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5452:1: ( ( rule__EnumField__OptionsAssignment_3_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5452:1: ( ( rule__EnumField__OptionsAssignment_3_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5453:1: ( rule__EnumField__OptionsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsAssignment_3_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5454:1: ( rule__EnumField__OptionsAssignment_3_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5454:2: rule__EnumField__OptionsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumField__OptionsAssignment_3_1_in_rule__EnumField__Group_3__1__Impl11348);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5464:1: rule__EnumField__Group_3__2 : rule__EnumField__Group_3__2__Impl rule__EnumField__Group_3__3 ;
    public final void rule__EnumField__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5468:1: ( rule__EnumField__Group_3__2__Impl rule__EnumField__Group_3__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5469:2: rule__EnumField__Group_3__2__Impl rule__EnumField__Group_3__3
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__2__Impl_in_rule__EnumField__Group_3__211378);
            rule__EnumField__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3__3_in_rule__EnumField__Group_3__211381);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5476:1: rule__EnumField__Group_3__2__Impl : ( ( rule__EnumField__Group_3_2__0 )* ) ;
    public final void rule__EnumField__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5480:1: ( ( ( rule__EnumField__Group_3_2__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5481:1: ( ( rule__EnumField__Group_3_2__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5481:1: ( ( rule__EnumField__Group_3_2__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5482:1: ( rule__EnumField__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getGroup_3_2()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5483:1: ( rule__EnumField__Group_3_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==57) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5483:2: rule__EnumField__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumField__Group_3_2__0_in_rule__EnumField__Group_3__2__Impl11408);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5493:1: rule__EnumField__Group_3__3 : rule__EnumField__Group_3__3__Impl ;
    public final void rule__EnumField__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5497:1: ( rule__EnumField__Group_3__3__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5498:2: rule__EnumField__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3__3__Impl_in_rule__EnumField__Group_3__311439);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5504:1: rule__EnumField__Group_3__3__Impl : ( ']' ) ;
    public final void rule__EnumField__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5508:1: ( ( ']' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5509:1: ( ']' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5509:1: ( ']' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5510:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getRightSquareBracketKeyword_3_3()); 
            }
            match(input,59,FOLLOW_59_in_rule__EnumField__Group_3__3__Impl11467); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5531:1: rule__EnumField__Group_3_2__0 : rule__EnumField__Group_3_2__0__Impl rule__EnumField__Group_3_2__1 ;
    public final void rule__EnumField__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5535:1: ( rule__EnumField__Group_3_2__0__Impl rule__EnumField__Group_3_2__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5536:2: rule__EnumField__Group_3_2__0__Impl rule__EnumField__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3_2__0__Impl_in_rule__EnumField__Group_3_2__011506);
            rule__EnumField__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group_3_2__1_in_rule__EnumField__Group_3_2__011509);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5543:1: rule__EnumField__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__EnumField__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5547:1: ( ( ',' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5548:1: ( ',' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5548:1: ( ',' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5549:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__EnumField__Group_3_2__0__Impl11537); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5562:1: rule__EnumField__Group_3_2__1 : rule__EnumField__Group_3_2__1__Impl ;
    public final void rule__EnumField__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5566:1: ( rule__EnumField__Group_3_2__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5567:2: rule__EnumField__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumField__Group_3_2__1__Impl_in_rule__EnumField__Group_3_2__111568);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5573:1: rule__EnumField__Group_3_2__1__Impl : ( ( rule__EnumField__OptionsAssignment_3_2_1 ) ) ;
    public final void rule__EnumField__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5577:1: ( ( ( rule__EnumField__OptionsAssignment_3_2_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5578:1: ( ( rule__EnumField__OptionsAssignment_3_2_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5578:1: ( ( rule__EnumField__OptionsAssignment_3_2_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5579:1: ( rule__EnumField__OptionsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsAssignment_3_2_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5580:1: ( rule__EnumField__OptionsAssignment_3_2_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5580:2: rule__EnumField__OptionsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__EnumField__OptionsAssignment_3_2_1_in_rule__EnumField__Group_3_2__1__Impl11595);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5594:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5598:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5599:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__011629);
            rule__Service__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__011632);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5606:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5610:1: ( ( 'service' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5611:1: ( 'service' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5611:1: ( 'service' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5612:1: 'service'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Service__Group__0__Impl11660); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5625:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5629:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5630:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__111691);
            rule__Service__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__111694);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5637:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5641:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5642:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5642:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5643:1: ( rule__Service__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5644:1: ( rule__Service__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5644:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl11721);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5654:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5658:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5659:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__211751);
            rule__Service__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__211754);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5666:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5670:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5671:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5671:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5672:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__Service__Group__2__Impl11782); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5685:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5689:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5690:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__311813);
            rule__Service__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__311816);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5697:1: rule__Service__Group__3__Impl : ( ( rule__Service__ElementsAssignment_3 )* ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5701:1: ( ( ( rule__Service__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5702:1: ( ( rule__Service__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5702:1: ( ( rule__Service__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5703:1: ( rule__Service__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5704:1: ( rule__Service__ElementsAssignment_3 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==17||LA38_0==27) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5704:2: rule__Service__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Service__ElementsAssignment_3_in_rule__Service__Group__3__Impl11843);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5714:1: rule__Service__Group__4 : rule__Service__Group__4__Impl ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5718:1: ( rule__Service__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5719:2: rule__Service__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__411874);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5725:1: rule__Service__Group__4__Impl : ( '}' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5729:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5730:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5730:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5731:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,55,FOLLOW_55_in_rule__Service__Group__4__Impl11902); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5754:1: rule__Rpc__Group__0 : rule__Rpc__Group__0__Impl rule__Rpc__Group__1 ;
    public final void rule__Rpc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5758:1: ( rule__Rpc__Group__0__Impl rule__Rpc__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5759:2: rule__Rpc__Group__0__Impl rule__Rpc__Group__1
            {
            pushFollow(FOLLOW_rule__Rpc__Group__0__Impl_in_rule__Rpc__Group__011943);
            rule__Rpc__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__1_in_rule__Rpc__Group__011946);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5766:1: rule__Rpc__Group__0__Impl : ( ( 'rpc' ) ) ;
    public final void rule__Rpc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5770:1: ( ( ( 'rpc' ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5771:1: ( ( 'rpc' ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5771:1: ( ( 'rpc' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5772:1: ( 'rpc' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRpcKeyword_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5773:1: ( 'rpc' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5774:2: 'rpc'
            {
            match(input,27,FOLLOW_27_in_rule__Rpc__Group__0__Impl11975); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5785:1: rule__Rpc__Group__1 : rule__Rpc__Group__1__Impl rule__Rpc__Group__2 ;
    public final void rule__Rpc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5789:1: ( rule__Rpc__Group__1__Impl rule__Rpc__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5790:2: rule__Rpc__Group__1__Impl rule__Rpc__Group__2
            {
            pushFollow(FOLLOW_rule__Rpc__Group__1__Impl_in_rule__Rpc__Group__112007);
            rule__Rpc__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__2_in_rule__Rpc__Group__112010);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5797:1: rule__Rpc__Group__1__Impl : ( ( rule__Rpc__NameAssignment_1 ) ) ;
    public final void rule__Rpc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5801:1: ( ( ( rule__Rpc__NameAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5802:1: ( ( rule__Rpc__NameAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5802:1: ( ( rule__Rpc__NameAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5803:1: ( rule__Rpc__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getNameAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5804:1: ( rule__Rpc__NameAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5804:2: rule__Rpc__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rpc__NameAssignment_1_in_rule__Rpc__Group__1__Impl12037);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5814:1: rule__Rpc__Group__2 : rule__Rpc__Group__2__Impl rule__Rpc__Group__3 ;
    public final void rule__Rpc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5818:1: ( rule__Rpc__Group__2__Impl rule__Rpc__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5819:2: rule__Rpc__Group__2__Impl rule__Rpc__Group__3
            {
            pushFollow(FOLLOW_rule__Rpc__Group__2__Impl_in_rule__Rpc__Group__212067);
            rule__Rpc__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__3_in_rule__Rpc__Group__212070);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5826:1: rule__Rpc__Group__2__Impl : ( '(' ) ;
    public final void rule__Rpc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5830:1: ( ( '(' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5831:1: ( '(' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5831:1: ( '(' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5832:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,60,FOLLOW_60_in_rule__Rpc__Group__2__Impl12098); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5845:1: rule__Rpc__Group__3 : rule__Rpc__Group__3__Impl rule__Rpc__Group__4 ;
    public final void rule__Rpc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5849:1: ( rule__Rpc__Group__3__Impl rule__Rpc__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5850:2: rule__Rpc__Group__3__Impl rule__Rpc__Group__4
            {
            pushFollow(FOLLOW_rule__Rpc__Group__3__Impl_in_rule__Rpc__Group__312129);
            rule__Rpc__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__4_in_rule__Rpc__Group__312132);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5857:1: rule__Rpc__Group__3__Impl : ( ( rule__Rpc__ArgTypeAssignment_3 ) ) ;
    public final void rule__Rpc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5861:1: ( ( ( rule__Rpc__ArgTypeAssignment_3 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5862:1: ( ( rule__Rpc__ArgTypeAssignment_3 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5862:1: ( ( rule__Rpc__ArgTypeAssignment_3 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5863:1: ( rule__Rpc__ArgTypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getArgTypeAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5864:1: ( rule__Rpc__ArgTypeAssignment_3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5864:2: rule__Rpc__ArgTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Rpc__ArgTypeAssignment_3_in_rule__Rpc__Group__3__Impl12159);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5874:1: rule__Rpc__Group__4 : rule__Rpc__Group__4__Impl rule__Rpc__Group__5 ;
    public final void rule__Rpc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5878:1: ( rule__Rpc__Group__4__Impl rule__Rpc__Group__5 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5879:2: rule__Rpc__Group__4__Impl rule__Rpc__Group__5
            {
            pushFollow(FOLLOW_rule__Rpc__Group__4__Impl_in_rule__Rpc__Group__412189);
            rule__Rpc__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__5_in_rule__Rpc__Group__412192);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5886:1: rule__Rpc__Group__4__Impl : ( ')' ) ;
    public final void rule__Rpc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5890:1: ( ( ')' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5891:1: ( ')' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5891:1: ( ')' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5892:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,61,FOLLOW_61_in_rule__Rpc__Group__4__Impl12220); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5905:1: rule__Rpc__Group__5 : rule__Rpc__Group__5__Impl rule__Rpc__Group__6 ;
    public final void rule__Rpc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5909:1: ( rule__Rpc__Group__5__Impl rule__Rpc__Group__6 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5910:2: rule__Rpc__Group__5__Impl rule__Rpc__Group__6
            {
            pushFollow(FOLLOW_rule__Rpc__Group__5__Impl_in_rule__Rpc__Group__512251);
            rule__Rpc__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__6_in_rule__Rpc__Group__512254);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5917:1: rule__Rpc__Group__5__Impl : ( 'returns' ) ;
    public final void rule__Rpc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5921:1: ( ( 'returns' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5922:1: ( 'returns' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5922:1: ( 'returns' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5923:1: 'returns'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getReturnsKeyword_5()); 
            }
            match(input,28,FOLLOW_28_in_rule__Rpc__Group__5__Impl12282); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5936:1: rule__Rpc__Group__6 : rule__Rpc__Group__6__Impl rule__Rpc__Group__7 ;
    public final void rule__Rpc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5940:1: ( rule__Rpc__Group__6__Impl rule__Rpc__Group__7 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5941:2: rule__Rpc__Group__6__Impl rule__Rpc__Group__7
            {
            pushFollow(FOLLOW_rule__Rpc__Group__6__Impl_in_rule__Rpc__Group__612313);
            rule__Rpc__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__7_in_rule__Rpc__Group__612316);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5948:1: rule__Rpc__Group__6__Impl : ( '(' ) ;
    public final void rule__Rpc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5952:1: ( ( '(' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5953:1: ( '(' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5953:1: ( '(' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5954:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getLeftParenthesisKeyword_6()); 
            }
            match(input,60,FOLLOW_60_in_rule__Rpc__Group__6__Impl12344); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5967:1: rule__Rpc__Group__7 : rule__Rpc__Group__7__Impl rule__Rpc__Group__8 ;
    public final void rule__Rpc__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5971:1: ( rule__Rpc__Group__7__Impl rule__Rpc__Group__8 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5972:2: rule__Rpc__Group__7__Impl rule__Rpc__Group__8
            {
            pushFollow(FOLLOW_rule__Rpc__Group__7__Impl_in_rule__Rpc__Group__712375);
            rule__Rpc__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__8_in_rule__Rpc__Group__712378);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5979:1: rule__Rpc__Group__7__Impl : ( ( rule__Rpc__ReturnTypeAssignment_7 ) ) ;
    public final void rule__Rpc__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5983:1: ( ( ( rule__Rpc__ReturnTypeAssignment_7 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5984:1: ( ( rule__Rpc__ReturnTypeAssignment_7 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5984:1: ( ( rule__Rpc__ReturnTypeAssignment_7 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5985:1: ( rule__Rpc__ReturnTypeAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getReturnTypeAssignment_7()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5986:1: ( rule__Rpc__ReturnTypeAssignment_7 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5986:2: rule__Rpc__ReturnTypeAssignment_7
            {
            pushFollow(FOLLOW_rule__Rpc__ReturnTypeAssignment_7_in_rule__Rpc__Group__7__Impl12405);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:5996:1: rule__Rpc__Group__8 : rule__Rpc__Group__8__Impl rule__Rpc__Group__9 ;
    public final void rule__Rpc__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6000:1: ( rule__Rpc__Group__8__Impl rule__Rpc__Group__9 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6001:2: rule__Rpc__Group__8__Impl rule__Rpc__Group__9
            {
            pushFollow(FOLLOW_rule__Rpc__Group__8__Impl_in_rule__Rpc__Group__812435);
            rule__Rpc__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__9_in_rule__Rpc__Group__812438);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6008:1: rule__Rpc__Group__8__Impl : ( ')' ) ;
    public final void rule__Rpc__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6012:1: ( ( ')' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6013:1: ( ')' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6013:1: ( ')' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6014:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,61,FOLLOW_61_in_rule__Rpc__Group__8__Impl12466); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6027:1: rule__Rpc__Group__9 : rule__Rpc__Group__9__Impl rule__Rpc__Group__10 ;
    public final void rule__Rpc__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6031:1: ( rule__Rpc__Group__9__Impl rule__Rpc__Group__10 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6032:2: rule__Rpc__Group__9__Impl rule__Rpc__Group__10
            {
            pushFollow(FOLLOW_rule__Rpc__Group__9__Impl_in_rule__Rpc__Group__912497);
            rule__Rpc__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group__10_in_rule__Rpc__Group__912500);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6039:1: rule__Rpc__Group__9__Impl : ( ( rule__Rpc__Group_9__0 )? ) ;
    public final void rule__Rpc__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6043:1: ( ( ( rule__Rpc__Group_9__0 )? ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6044:1: ( ( rule__Rpc__Group_9__0 )? )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6044:1: ( ( rule__Rpc__Group_9__0 )? )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6045:1: ( rule__Rpc__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getGroup_9()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6046:1: ( rule__Rpc__Group_9__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6046:2: rule__Rpc__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Rpc__Group_9__0_in_rule__Rpc__Group__9__Impl12527);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6056:1: rule__Rpc__Group__10 : rule__Rpc__Group__10__Impl ;
    public final void rule__Rpc__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6060:1: ( rule__Rpc__Group__10__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6061:2: rule__Rpc__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Rpc__Group__10__Impl_in_rule__Rpc__Group__1012558);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6067:1: rule__Rpc__Group__10__Impl : ( ';' ) ;
    public final void rule__Rpc__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6071:1: ( ( ';' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6072:1: ( ';' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6072:1: ( ';' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6073:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getSemicolonKeyword_10()); 
            }
            match(input,52,FOLLOW_52_in_rule__Rpc__Group__10__Impl12586); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6108:1: rule__Rpc__Group_9__0 : rule__Rpc__Group_9__0__Impl rule__Rpc__Group_9__1 ;
    public final void rule__Rpc__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6112:1: ( rule__Rpc__Group_9__0__Impl rule__Rpc__Group_9__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6113:2: rule__Rpc__Group_9__0__Impl rule__Rpc__Group_9__1
            {
            pushFollow(FOLLOW_rule__Rpc__Group_9__0__Impl_in_rule__Rpc__Group_9__012639);
            rule__Rpc__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group_9__1_in_rule__Rpc__Group_9__012642);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6120:1: rule__Rpc__Group_9__0__Impl : ( '{' ) ;
    public final void rule__Rpc__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6124:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6125:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6125:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6126:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getLeftCurlyBracketKeyword_9_0()); 
            }
            match(input,54,FOLLOW_54_in_rule__Rpc__Group_9__0__Impl12670); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6139:1: rule__Rpc__Group_9__1 : rule__Rpc__Group_9__1__Impl rule__Rpc__Group_9__2 ;
    public final void rule__Rpc__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6143:1: ( rule__Rpc__Group_9__1__Impl rule__Rpc__Group_9__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6144:2: rule__Rpc__Group_9__1__Impl rule__Rpc__Group_9__2
            {
            pushFollow(FOLLOW_rule__Rpc__Group_9__1__Impl_in_rule__Rpc__Group_9__112701);
            rule__Rpc__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rpc__Group_9__2_in_rule__Rpc__Group_9__112704);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6151:1: rule__Rpc__Group_9__1__Impl : ( ( rule__Rpc__OptionsAssignment_9_1 )* ) ;
    public final void rule__Rpc__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6155:1: ( ( ( rule__Rpc__OptionsAssignment_9_1 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6156:1: ( ( rule__Rpc__OptionsAssignment_9_1 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6156:1: ( ( rule__Rpc__OptionsAssignment_9_1 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6157:1: ( rule__Rpc__OptionsAssignment_9_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getOptionsAssignment_9_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6158:1: ( rule__Rpc__OptionsAssignment_9_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==17) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6158:2: rule__Rpc__OptionsAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_rule__Rpc__OptionsAssignment_9_1_in_rule__Rpc__Group_9__1__Impl12731);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6168:1: rule__Rpc__Group_9__2 : rule__Rpc__Group_9__2__Impl ;
    public final void rule__Rpc__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6172:1: ( rule__Rpc__Group_9__2__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6173:2: rule__Rpc__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Rpc__Group_9__2__Impl_in_rule__Rpc__Group_9__212762);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6179:1: rule__Rpc__Group_9__2__Impl : ( '}' ) ;
    public final void rule__Rpc__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6183:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6184:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6184:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6185:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getRightCurlyBracketKeyword_9_2()); 
            }
            match(input,55,FOLLOW_55_in_rule__Rpc__Group_9__2__Impl12790); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6204:1: rule__Extend__Group__0 : rule__Extend__Group__0__Impl rule__Extend__Group__1 ;
    public final void rule__Extend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6208:1: ( rule__Extend__Group__0__Impl rule__Extend__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6209:2: rule__Extend__Group__0__Impl rule__Extend__Group__1
            {
            pushFollow(FOLLOW_rule__Extend__Group__0__Impl_in_rule__Extend__Group__012827);
            rule__Extend__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__1_in_rule__Extend__Group__012830);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6216:1: rule__Extend__Group__0__Impl : ( ( 'extend' ) ) ;
    public final void rule__Extend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6220:1: ( ( ( 'extend' ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6221:1: ( ( 'extend' ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6221:1: ( ( 'extend' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6222:1: ( 'extend' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getExtendKeyword_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6223:1: ( 'extend' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6224:2: 'extend'
            {
            match(input,25,FOLLOW_25_in_rule__Extend__Group__0__Impl12859); if (state.failed) return ;

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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6235:1: rule__Extend__Group__1 : rule__Extend__Group__1__Impl rule__Extend__Group__2 ;
    public final void rule__Extend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6239:1: ( rule__Extend__Group__1__Impl rule__Extend__Group__2 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6240:2: rule__Extend__Group__1__Impl rule__Extend__Group__2
            {
            pushFollow(FOLLOW_rule__Extend__Group__1__Impl_in_rule__Extend__Group__112891);
            rule__Extend__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__2_in_rule__Extend__Group__112894);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6247:1: rule__Extend__Group__1__Impl : ( ( rule__Extend__TypeAssignment_1 ) ) ;
    public final void rule__Extend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6251:1: ( ( ( rule__Extend__TypeAssignment_1 ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6252:1: ( ( rule__Extend__TypeAssignment_1 ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6252:1: ( ( rule__Extend__TypeAssignment_1 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6253:1: ( rule__Extend__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getTypeAssignment_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6254:1: ( rule__Extend__TypeAssignment_1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6254:2: rule__Extend__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Extend__TypeAssignment_1_in_rule__Extend__Group__1__Impl12921);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6264:1: rule__Extend__Group__2 : rule__Extend__Group__2__Impl rule__Extend__Group__3 ;
    public final void rule__Extend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6268:1: ( rule__Extend__Group__2__Impl rule__Extend__Group__3 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6269:2: rule__Extend__Group__2__Impl rule__Extend__Group__3
            {
            pushFollow(FOLLOW_rule__Extend__Group__2__Impl_in_rule__Extend__Group__212951);
            rule__Extend__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__3_in_rule__Extend__Group__212954);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6276:1: rule__Extend__Group__2__Impl : ( '{' ) ;
    public final void rule__Extend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6280:1: ( ( '{' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6281:1: ( '{' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6281:1: ( '{' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6282:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__Extend__Group__2__Impl12982); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6295:1: rule__Extend__Group__3 : rule__Extend__Group__3__Impl rule__Extend__Group__4 ;
    public final void rule__Extend__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6299:1: ( rule__Extend__Group__3__Impl rule__Extend__Group__4 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6300:2: rule__Extend__Group__3__Impl rule__Extend__Group__4
            {
            pushFollow(FOLLOW_rule__Extend__Group__3__Impl_in_rule__Extend__Group__313013);
            rule__Extend__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Extend__Group__4_in_rule__Extend__Group__313016);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6307:1: rule__Extend__Group__3__Impl : ( ( rule__Extend__ElementsAssignment_3 )* ) ;
    public final void rule__Extend__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6311:1: ( ( ( rule__Extend__ElementsAssignment_3 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6312:1: ( ( rule__Extend__ElementsAssignment_3 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6312:1: ( ( rule__Extend__ElementsAssignment_3 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6313:1: ( rule__Extend__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getElementsAssignment_3()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6314:1: ( rule__Extend__ElementsAssignment_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=17 && LA41_0<=25)||LA41_0==56) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6314:2: rule__Extend__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Extend__ElementsAssignment_3_in_rule__Extend__Group__3__Impl13043);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6324:1: rule__Extend__Group__4 : rule__Extend__Group__4__Impl ;
    public final void rule__Extend__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6328:1: ( rule__Extend__Group__4__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6329:2: rule__Extend__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Extend__Group__4__Impl_in_rule__Extend__Group__413074);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6335:1: rule__Extend__Group__4__Impl : ( '}' ) ;
    public final void rule__Extend__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6339:1: ( ( '}' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6340:1: ( '}' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6340:1: ( '}' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6341:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,55,FOLLOW_55_in_rule__Extend__Group__4__Impl13102); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6364:1: rule__FULL_ID__Group__0 : rule__FULL_ID__Group__0__Impl rule__FULL_ID__Group__1 ;
    public final void rule__FULL_ID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6368:1: ( rule__FULL_ID__Group__0__Impl rule__FULL_ID__Group__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6369:2: rule__FULL_ID__Group__0__Impl rule__FULL_ID__Group__1
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group__0__Impl_in_rule__FULL_ID__Group__013143);
            rule__FULL_ID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FULL_ID__Group__1_in_rule__FULL_ID__Group__013146);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6376:1: rule__FULL_ID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FULL_ID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6380:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6381:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6381:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6382:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FULL_ID__Group__0__Impl13173); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6393:1: rule__FULL_ID__Group__1 : rule__FULL_ID__Group__1__Impl ;
    public final void rule__FULL_ID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6397:1: ( rule__FULL_ID__Group__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6398:2: rule__FULL_ID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group__1__Impl_in_rule__FULL_ID__Group__113202);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6404:1: rule__FULL_ID__Group__1__Impl : ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) ) ;
    public final void rule__FULL_ID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6408:1: ( ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6409:1: ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6409:1: ( ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6410:1: ( ( rule__FULL_ID__Group_1__0 ) ) ( ( rule__FULL_ID__Group_1__0 )* )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6410:1: ( ( rule__FULL_ID__Group_1__0 ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6411:1: ( rule__FULL_ID__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getGroup_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6412:1: ( rule__FULL_ID__Group_1__0 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6412:2: rule__FULL_ID__Group_1__0
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl13231);
            rule__FULL_ID__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFULL_IDAccess().getGroup_1()); 
            }

            }

            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6415:1: ( ( rule__FULL_ID__Group_1__0 )* )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6416:1: ( rule__FULL_ID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getGroup_1()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6417:1: ( rule__FULL_ID__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==62) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6417:2: rule__FULL_ID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl13243);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6432:1: rule__FULL_ID__Group_1__0 : rule__FULL_ID__Group_1__0__Impl rule__FULL_ID__Group_1__1 ;
    public final void rule__FULL_ID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6436:1: ( rule__FULL_ID__Group_1__0__Impl rule__FULL_ID__Group_1__1 )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6437:2: rule__FULL_ID__Group_1__0__Impl rule__FULL_ID__Group_1__1
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__0__Impl_in_rule__FULL_ID__Group_1__013280);
            rule__FULL_ID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__1_in_rule__FULL_ID__Group_1__013283);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6444:1: rule__FULL_ID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FULL_ID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6448:1: ( ( '.' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6449:1: ( '.' )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6449:1: ( '.' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6450:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,62,FOLLOW_62_in_rule__FULL_ID__Group_1__0__Impl13311); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6463:1: rule__FULL_ID__Group_1__1 : rule__FULL_ID__Group_1__1__Impl ;
    public final void rule__FULL_ID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6467:1: ( rule__FULL_ID__Group_1__1__Impl )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6468:2: rule__FULL_ID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FULL_ID__Group_1__1__Impl_in_rule__FULL_ID__Group_1__113342);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6474:1: rule__FULL_ID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FULL_ID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6478:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6479:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6479:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6480:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FULL_ID__Group_1__1__Impl13369); if (state.failed) return ;
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


    // $ANTLR start "rule__Proto__SyntaxAssignment_0_2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6497:1: rule__Proto__SyntaxAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__Proto__SyntaxAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6501:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6502:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6502:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6503:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getSyntaxSTRINGTerminalRuleCall_0_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Proto__SyntaxAssignment_0_213408); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtoAccess().getSyntaxSTRINGTerminalRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proto__SyntaxAssignment_0_2"


    // $ANTLR start "rule__Proto__ImportsAssignment_1"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6512:1: rule__Proto__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__Proto__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6516:1: ( ( ruleImport ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6517:1: ( ruleImport )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6517:1: ( ruleImport )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6518:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getImportsImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Proto__ImportsAssignment_113439);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6527:1: rule__Proto__NameAssignment_2_1 : ( ruleVar_full ) ;
    public final void rule__Proto__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6531:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6532:1: ( ruleVar_full )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6532:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6533:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getNameVar_fullParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__Proto__NameAssignment_2_113470);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6542:1: rule__Proto__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Proto__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6546:1: ( ( ruleStatement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6547:1: ( ruleStatement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6547:1: ( ruleStatement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6548:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtoAccess().getStatementsStatementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Proto__StatementsAssignment_313501);
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


    // $ANTLR start "rule__PublicImport__ImportURIAssignment_2"
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6557:1: rule__PublicImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PublicImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6561:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6562:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6562:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6563:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublicImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PublicImport__ImportURIAssignment_213532); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6572:1: rule__WeakImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__WeakImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6576:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6577:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6577:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6578:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeakImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__WeakImport__ImportURIAssignment_213563); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6587:1: rule__NativeOption__SourceAssignment_1 : ( ( ruleVar_full ) ) ;
    public final void rule__NativeOption__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6591:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6592:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6592:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6593:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getSourceMessageFieldCrossReference_1_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6594:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6595:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getSourceMessageFieldVar_fullParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__NativeOption__SourceAssignment_113598);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6606:1: rule__NativeOption__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__NativeOption__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6610:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6611:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6611:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6612:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeOptionAccess().getValueValueParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__NativeOption__ValueAssignment_313633);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6621:1: rule__CustomOption__SourceAssignment_1 : ( RULE_ID ) ;
    public final void rule__CustomOption__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6625:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6626:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6626:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6627:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getSourceIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomOption__SourceAssignment_113664); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6636:1: rule__CustomOption__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__CustomOption__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6640:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6641:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6641:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6642:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomOptionAccess().getValueValueParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__CustomOption__ValueAssignment_313695);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6651:1: rule__CustomIdLink__TargetAssignment : ( RULE_ID ) ;
    public final void rule__CustomIdLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6655:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6656:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6656:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6657:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomIdLinkAccess().getTargetIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomIdLink__TargetAssignment13726); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6666:1: rule__StringLink__TargetAssignment : ( RULE_STRING ) ;
    public final void rule__StringLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6670:1: ( ( RULE_STRING ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6671:1: ( RULE_STRING )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6671:1: ( RULE_STRING )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6672:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLinkAccess().getTargetSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLink__TargetAssignment13757); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6681:1: rule__BooleanLink__TargetAssignment : ( ruleBOOL ) ;
    public final void rule__BooleanLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6685:1: ( ( ruleBOOL ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6686:1: ( ruleBOOL )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6686:1: ( ruleBOOL )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6687:1: ruleBOOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLinkAccess().getTargetBOOLEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_rule__BooleanLink__TargetAssignment13788);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6696:1: rule__IntLink__TargetAssignment : ( RULE_NUMINT ) ;
    public final void rule__IntLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6700:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6701:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6701:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6702:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLinkAccess().getTargetNUMINTTerminalRuleCall_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__IntLink__TargetAssignment13819); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6711:1: rule__DoubleLink__TargetAssignment : ( RULE_NUMDOUBLE ) ;
    public final void rule__DoubleLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6715:1: ( ( RULE_NUMDOUBLE ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6716:1: ( RULE_NUMDOUBLE )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6716:1: ( RULE_NUMDOUBLE )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6717:1: RULE_NUMDOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLinkAccess().getTargetNUMDOUBLETerminalRuleCall_0()); 
            }
            match(input,RULE_NUMDOUBLE,FOLLOW_RULE_NUMDOUBLE_in_rule__DoubleLink__TargetAssignment13850); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6726:1: rule__Message__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6730:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6731:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6731:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6732:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__NameAssignment_113881); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6741:1: rule__Message__ElementsAssignment_3 : ( ruleMessageElement ) ;
    public final void rule__Message__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6745:1: ( ( ruleMessageElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6746:1: ( ruleMessageElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6746:1: ( ruleMessageElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6747:1: ruleMessageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getElementsMessageElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_rule__Message__ElementsAssignment_313912);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6756:1: rule__Oneof__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Oneof__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6760:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6761:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6761:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6762:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Oneof__NameAssignment_113943); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6771:1: rule__Oneof__FieldsAssignment_3 : ( ruleOneofField ) ;
    public final void rule__Oneof__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6775:1: ( ( ruleOneofField ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6776:1: ( ruleOneofField )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6776:1: ( ruleOneofField )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6777:1: ruleOneofField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofAccess().getFieldsOneofFieldParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleOneofField_in_rule__Oneof__FieldsAssignment_313974);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6786:1: rule__OneofField__TypeAssignment_0 : ( ruleTypeLink ) ;
    public final void rule__OneofField__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6790:1: ( ( ruleTypeLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6791:1: ( ruleTypeLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6791:1: ( ruleTypeLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6792:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getTypeTypeLinkParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__OneofField__TypeAssignment_014005);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6801:1: rule__OneofField__NameAssignment_1 : ( ruleVar ) ;
    public final void rule__OneofField__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6805:1: ( ( ruleVar ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6806:1: ( ruleVar )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6806:1: ( ruleVar )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6807:1: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getNameVarParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleVar_in_rule__OneofField__NameAssignment_114036);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6816:1: rule__OneofField__IndexAssignment_3 : ( RULE_NUMINT ) ;
    public final void rule__OneofField__IndexAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6820:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6821:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6821:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6822:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getIndexNUMINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__OneofField__IndexAssignment_314067); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6831:1: rule__OneofField__OptionsAssignment_4 : ( ruleFieldOptions ) ;
    public final void rule__OneofField__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6835:1: ( ( ruleFieldOptions ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6836:1: ( ruleFieldOptions )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6836:1: ( ruleFieldOptions )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6837:1: ruleFieldOptions
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneofFieldAccess().getOptionsFieldOptionsParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_rule__OneofField__OptionsAssignment_414098);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6846:1: rule__ExtensionRange__RangesAssignment_1 : ( ruleRange ) ;
    public final void rule__ExtensionRange__RangesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6850:1: ( ( ruleRange ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6851:1: ( ruleRange )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6851:1: ( ruleRange )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6852:1: ruleRange
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getRangesRangeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleRange_in_rule__ExtensionRange__RangesAssignment_114129);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6861:1: rule__ExtensionRange__RangesAssignment_2_1 : ( ruleRange ) ;
    public final void rule__ExtensionRange__RangesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6865:1: ( ( ruleRange ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6866:1: ( ruleRange )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6866:1: ( ruleRange )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6867:1: ruleRange
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionRangeAccess().getRangesRangeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleRange_in_rule__ExtensionRange__RangesAssignment_2_114160);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6876:1: rule__Range__FromAssignment_0 : ( RULE_NUMINT ) ;
    public final void rule__Range__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6880:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6881:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6881:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6882:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getFromNUMINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__Range__FromAssignment_014191); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6891:1: rule__Range__ToAssignment_1_1_0 : ( RULE_NUMINT ) ;
    public final void rule__Range__ToAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6895:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6896:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6896:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6897:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getToNUMINTTerminalRuleCall_1_1_0_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__Range__ToAssignment_1_1_014222); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6906:1: rule__Range__MaxAssignment_1_1_1 : ( ( 'max' ) ) ;
    public final void rule__Range__MaxAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6910:1: ( ( ( 'max' ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6911:1: ( ( 'max' ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6911:1: ( ( 'max' ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6912:1: ( 'max' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getMaxMaxKeyword_1_1_1_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6913:1: ( 'max' )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6914:1: 'max'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getMaxMaxKeyword_1_1_1_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Range__MaxAssignment_1_1_114258); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6929:1: rule__MessageField__ModifierAssignment_0 : ( ruleModifier ) ;
    public final void rule__MessageField__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6933:1: ( ( ruleModifier ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6934:1: ( ruleModifier )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6934:1: ( ruleModifier )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6935:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getModifierModifierEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__MessageField__ModifierAssignment_014297);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6944:1: rule__MessageField__TypeAssignment_1 : ( ruleTypeLink ) ;
    public final void rule__MessageField__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6948:1: ( ( ruleTypeLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6949:1: ( ruleTypeLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6949:1: ( ruleTypeLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6950:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getTypeTypeLinkParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__MessageField__TypeAssignment_114328);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6959:1: rule__MessageField__NameAssignment_2 : ( ruleVar ) ;
    public final void rule__MessageField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6963:1: ( ( ruleVar ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6964:1: ( ruleVar )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6964:1: ( ruleVar )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6965:1: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getNameVarParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVar_in_rule__MessageField__NameAssignment_214359);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6974:1: rule__MessageField__IndexAssignment_4 : ( RULE_NUMINT ) ;
    public final void rule__MessageField__IndexAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6978:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6979:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6979:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6980:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getIndexNUMINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__MessageField__IndexAssignment_414390); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6989:1: rule__MessageField__OptionsAssignment_5 : ( ruleFieldOptions ) ;
    public final void rule__MessageField__OptionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6993:1: ( ( ruleFieldOptions ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6994:1: ( ruleFieldOptions )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6994:1: ( ruleFieldOptions )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:6995:1: ruleFieldOptions
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageFieldAccess().getOptionsFieldOptionsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_rule__MessageField__OptionsAssignment_514421);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7004:1: rule__Group__ModifierAssignment_0 : ( ruleModifier ) ;
    public final void rule__Group__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7008:1: ( ( ruleModifier ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7009:1: ( ruleModifier )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7009:1: ( ruleModifier )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7010:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getModifierModifierEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Group__ModifierAssignment_014452);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7019:1: rule__Group__NameAssignment_2 : ( ruleVar ) ;
    public final void rule__Group__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7023:1: ( ( ruleVar ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7024:1: ( ruleVar )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7024:1: ( ruleVar )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7025:1: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getNameVarParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVar_in_rule__Group__NameAssignment_214483);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7034:1: rule__Group__IndexAssignment_4 : ( RULE_NUMINT ) ;
    public final void rule__Group__IndexAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7038:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7039:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7039:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7040:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getIndexNUMINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__Group__IndexAssignment_414514); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7049:1: rule__Group__ElementsAssignment_6 : ( ruleMessageField ) ;
    public final void rule__Group__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7053:1: ( ( ruleMessageField ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7054:1: ( ruleMessageField )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7054:1: ( ruleMessageField )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7055:1: ruleMessageField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getElementsMessageFieldParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleMessageField_in_rule__Group__ElementsAssignment_614545);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7064:1: rule__ComplexTypeLink__TargetAssignment : ( ( ruleVar_full ) ) ;
    public final void rule__ComplexTypeLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7068:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7069:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7069:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7070:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeCrossReference_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7071:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7072:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeVar_fullParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__ComplexTypeLink__TargetAssignment14580);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7083:1: rule__ScalarTypeLink__TargetAssignment : ( ruleScalarType ) ;
    public final void rule__ScalarTypeLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7087:1: ( ( ruleScalarType ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7088:1: ( ruleScalarType )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7088:1: ( ruleScalarType )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7089:1: ruleScalarType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarTypeLinkAccess().getTargetScalarTypeEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleScalarType_in_rule__ScalarTypeLink__TargetAssignment14615);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7098:1: rule__FieldOptions__OptionsAssignment_1 : ( ruleFieldOption ) ;
    public final void rule__FieldOptions__OptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7102:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7103:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7103:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7104:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_114646);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7113:1: rule__FieldOptions__OptionsAssignment_2_1 : ( ruleFieldOption ) ;
    public final void rule__FieldOptions__OptionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7117:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7118:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7118:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7119:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_2_114677);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7128:1: rule__PackedValueFieldOption__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__PackedValueFieldOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7132:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7133:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7133:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7134:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackedValueFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__PackedValueFieldOption__ValueAssignment_214708);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7143:1: rule__DefaultValueFieldOption__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__DefaultValueFieldOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7147:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7148:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7148:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7149:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultValueFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__DefaultValueFieldOption__ValueAssignment_214739);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7158:1: rule__NativeFieldOption__SourceAssignment_0 : ( ruleOptionSource ) ;
    public final void rule__NativeFieldOption__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7162:1: ( ( ruleOptionSource ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7163:1: ( ruleOptionSource )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7163:1: ( ruleOptionSource )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7164:1: ruleOptionSource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getSourceOptionSourceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleOptionSource_in_rule__NativeFieldOption__SourceAssignment_014770);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7173:1: rule__NativeFieldOption__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__NativeFieldOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7177:1: ( ( ruleValue ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7178:1: ( ruleValue )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7178:1: ( ruleValue )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7179:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__NativeFieldOption__ValueAssignment_214801);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7188:1: rule__OptionSource__TargetAssignment : ( ( ruleVar_full ) ) ;
    public final void rule__OptionSource__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7192:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7193:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7193:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7194:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceAccess().getTargetIndexedElementCrossReference_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7195:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7196:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionSourceAccess().getTargetIndexedElementVar_fullParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__OptionSource__TargetAssignment14836);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7207:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7211:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7212:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7212:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7213:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_114871); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7222:1: rule__Enum__ElementsAssignment_3 : ( ruleEnumElement ) ;
    public final void rule__Enum__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7226:1: ( ( ruleEnumElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7227:1: ( ruleEnumElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7227:1: ( ruleEnumElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7228:1: ruleEnumElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleEnumElement_in_rule__Enum__ElementsAssignment_314902);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7237:1: rule__EnumField__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7241:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7242:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7242:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7243:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumField__NameAssignment_014933); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7252:1: rule__EnumField__IndexAssignment_2 : ( RULE_NUMINT ) ;
    public final void rule__EnumField__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7256:1: ( ( RULE_NUMINT ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7257:1: ( RULE_NUMINT )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7257:1: ( RULE_NUMINT )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7258:1: RULE_NUMINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getIndexNUMINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_rule__EnumField__IndexAssignment_214964); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7267:1: rule__EnumField__OptionsAssignment_3_1 : ( ruleFieldOption ) ;
    public final void rule__EnumField__OptionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7271:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7272:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7272:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7273:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_114995);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7282:1: rule__EnumField__OptionsAssignment_3_2_1 : ( ruleFieldOption ) ;
    public final void rule__EnumField__OptionsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7286:1: ( ( ruleFieldOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7287:1: ( ruleFieldOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7287:1: ( ruleFieldOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7288:1: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_2_115026);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7297:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7301:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7302:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7302:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7303:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_115057); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7312:1: rule__Service__ElementsAssignment_3 : ( ruleServiceElement ) ;
    public final void rule__Service__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7316:1: ( ( ruleServiceElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7317:1: ( ruleServiceElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7317:1: ( ruleServiceElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7318:1: ruleServiceElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getElementsServiceElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleServiceElement_in_rule__Service__ElementsAssignment_315088);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7327:1: rule__Rpc__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rpc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7331:1: ( ( RULE_ID ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7332:1: ( RULE_ID )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7332:1: ( RULE_ID )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7333:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rpc__NameAssignment_115119); if (state.failed) return ;
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7342:1: rule__Rpc__ArgTypeAssignment_3 : ( ruleMessageLink ) ;
    public final void rule__Rpc__ArgTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7346:1: ( ( ruleMessageLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7347:1: ( ruleMessageLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7347:1: ( ruleMessageLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7348:1: ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getArgTypeMessageLinkParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_rule__Rpc__ArgTypeAssignment_315150);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7357:1: rule__Rpc__ReturnTypeAssignment_7 : ( ruleMessageLink ) ;
    public final void rule__Rpc__ReturnTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7361:1: ( ( ruleMessageLink ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7362:1: ( ruleMessageLink )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7362:1: ( ruleMessageLink )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7363:1: ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getReturnTypeMessageLinkParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_rule__Rpc__ReturnTypeAssignment_715181);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7372:1: rule__Rpc__OptionsAssignment_9_1 : ( ruleOption ) ;
    public final void rule__Rpc__OptionsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7376:1: ( ( ruleOption ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7377:1: ( ruleOption )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7377:1: ( ruleOption )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7378:1: ruleOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRpcAccess().getOptionsOptionParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_ruleOption_in_rule__Rpc__OptionsAssignment_9_115212);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7387:1: rule__MessageLink__TargetAssignment : ( ( ruleVar_full ) ) ;
    public final void rule__MessageLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7391:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7392:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7392:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7393:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkAccess().getTargetMessageCrossReference_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7394:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7395:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageLinkAccess().getTargetMessageVar_fullParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__MessageLink__TargetAssignment15247);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7406:1: rule__Extend__TypeAssignment_1 : ( ( ruleVar_full ) ) ;
    public final void rule__Extend__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7410:1: ( ( ( ruleVar_full ) ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7411:1: ( ( ruleVar_full ) )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7411:1: ( ( ruleVar_full ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7412:1: ( ruleVar_full )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getTypeMessageCrossReference_1_0()); 
            }
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7413:1: ( ruleVar_full )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7414:1: ruleVar_full
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getTypeMessageVar_fullParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_rule__Extend__TypeAssignment_115286);
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
    // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7425:1: rule__Extend__ElementsAssignment_3 : ( ruleMessageElement ) ;
    public final void rule__Extend__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7429:1: ( ( ruleMessageElement ) )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7430:1: ( ruleMessageElement )
            {
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7430:1: ( ruleMessageElement )
            // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:7431:1: ruleMessageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getElementsMessageElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_rule__Extend__ElementsAssignment_315321);
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
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1525:1: ( ( ( ruleNativeOption ) ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1525:1: ( ( ruleNativeOption ) )
        {
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1525:1: ( ( ruleNativeOption ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1526:1: ( ruleNativeOption )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getOptionAccess().getNativeOptionParserRuleCall_0()); 
        }
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1527:1: ( ruleNativeOption )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1527:3: ruleNativeOption
        {
        pushFollow(FOLLOW_ruleNativeOption_in_synpred5_InternalProtobuf3200);
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
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1749:1: ( ( ( ruleScalarTypeLink ) ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1749:1: ( ( ruleScalarTypeLink ) )
        {
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1749:1: ( ( ruleScalarTypeLink ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1750:1: ( ruleScalarTypeLink )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTypeLinkAccess().getScalarTypeLinkParserRuleCall_0()); 
        }
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1751:1: ( ruleScalarTypeLink )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1751:3: ruleScalarTypeLink
        {
        pushFollow(FOLLOW_ruleScalarTypeLink_in_synpred21_InternalProtobuf3734);
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
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1771:1: ( ( ( rulePackedValueFieldOption ) ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1771:1: ( ( rulePackedValueFieldOption ) )
        {
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1771:1: ( ( rulePackedValueFieldOption ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1772:1: ( rulePackedValueFieldOption )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getFieldOptionAccess().getPackedValueFieldOptionParserRuleCall_0()); 
        }
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1773:1: ( rulePackedValueFieldOption )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1773:3: rulePackedValueFieldOption
        {
        pushFollow(FOLLOW_rulePackedValueFieldOption_in_synpred22_InternalProtobuf3785);
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
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1777:6: ( ( ( ruleDefaultValueFieldOption ) ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1777:6: ( ( ruleDefaultValueFieldOption ) )
        {
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1777:6: ( ( ruleDefaultValueFieldOption ) )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1778:1: ( ruleDefaultValueFieldOption )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getFieldOptionAccess().getDefaultValueFieldOptionParserRuleCall_1()); 
        }
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1779:1: ( ruleDefaultValueFieldOption )
        // ../protolipse.ui/src-gen/protolipse/ui/contentassist/antlr/internal/InternalProtobuf.g:1779:3: ruleDefaultValueFieldOption
        {
        pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_synpred23_InternalProtobuf3804);
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
            return "1520:1: rule__Option__Alternatives : ( ( ( ruleNativeOption ) ) | ( ruleCustomOption ) );";
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
        "\1\25\4\4\1\uffff\45\63\1\6\1\64\1\uffff";
    static final String DFA9_maxS =
        "\1\27\4\60\1\uffff\45\63\1\6\1\72\1\uffff";
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
            "\1\5\1\uffff\1\55\3\uffff\1\5",
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
            return "1700:1: rule__IndexedElement__Alternatives : ( ( ruleMessageField ) | ( ruleGroup ) );";
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
        "\1\uffff\1\0\1\7\1\13\1\12\1\15\1\3\1\6\1\5\1\10\1\16\1\2\1\1\1\4\1\14\1\11\2\uffff}>";
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
            return "1744:1: rule__TypeLink__Alternatives : ( ( ( ruleScalarTypeLink ) ) | ( ruleComplexTypeLink ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_12 = input.LA(1);

                         
                        int index11_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_11 = input.LA(1);

                         
                        int index11_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_13 = input.LA(1);

                         
                        int index11_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_13);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_15 = input.LA(1);

                         
                        int index11_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_15);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA11_14 = input.LA(1);

                         
                        int index11_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index11_10);
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
        "\6\uffff\1\11\1\4\1\5\1\6\1\10\1\2\1\1\1\7\1\12\1\13\1\0\1\3\2\uffff}>";
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
            return "1766:1: rule__FieldOption__Alternatives : ( ( ( rulePackedValueFieldOption ) ) | ( ( ruleDefaultValueFieldOption ) ) | ( ruleNativeFieldOption ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_16 = input.LA(1);

                         
                        int index12_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_12 = input.LA(1);

                         
                        int index12_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_11 = input.LA(1);

                         
                        int index12_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_17 = input.LA(1);

                         
                        int index12_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_17);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_13 = input.LA(1);

                         
                        int index12_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_10 = input.LA(1);

                         
                        int index12_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_14 = input.LA(1);

                         
                        int index12_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_14);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_15 = input.LA(1);

                         
                        int index12_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_15);
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
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Alternatives_in_ruleImport220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicImport_in_entryRulePublicImport247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePublicImport254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__0_in_rulePublicImport280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakImport_in_entryRuleWeakImport307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeakImport314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__0_in_ruleWeakImport340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Alternatives_in_ruleOption400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeOption_in_entryRuleNativeOption427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeOption434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__0_in_ruleNativeOption460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_entryRuleCustomOption487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomOption494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__0_in_ruleCustomOption520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_ruleValue580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_entryRuleSimpleValueLink606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValueLink613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleValueLink__Alternatives_in_ruleSimpleValueLink639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomIdLink_in_entryRuleCustomIdLink666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomIdLink673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomIdLink__TargetAssignment_in_ruleCustomIdLink699 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleOneof_in_entryRuleOneof1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneof1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__Group__0_in_ruleOneof1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneofField_in_entryRuleOneofField1326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneofField1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__0_in_ruleOneofField1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement1386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedElement1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexedElement__Alternatives_in_ruleIndexedElement1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange1446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionRange1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__0_in_ruleExtensionRange1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0_in_ruleRange1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_entryRuleMessageField1566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageField1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__0_in_ruleMessageField1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0_in_ruleGroup1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_entryRuleTypeLink1686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLink1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeLink__Alternatives_in_ruleTypeLink1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink1746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLink1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLink__TargetAssignment_in_ruleComplexTypeLink1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink1806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarTypeLink1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScalarTypeLink__TargetAssignment_in_ruleScalarTypeLink1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions1866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOptions1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__0_in_ruleFieldOptions1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_entryRuleFieldOption1926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOption1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOption__Alternatives_in_ruleFieldOption1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackedValueFieldOption_in_entryRulePackedValueFieldOption1986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackedValueFieldOption1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__0_in_rulePackedValueFieldOption2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption2046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValueFieldOption2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__0_in_ruleDefaultValueFieldOption2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption2106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeFieldOption2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__0_in_ruleNativeFieldOption2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_entryRuleOptionSource2166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionSource2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionSource__TargetAssignment_in_ruleOptionSource2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum2226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_entryRuleEnumElement2286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumElement2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumElement__Alternatives_in_ruleEnumElement2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_entryRuleEnumField2346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumField2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__0_in_ruleEnumField2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService2406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceElement_in_entryRuleServiceElement2466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceElement2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceElement__Alternatives_in_ruleServiceElement2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_entryRuleRpc2526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRpc2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__0_in_ruleRpc2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_entryRuleMessageLink2586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageLink2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageLink__TargetAssignment_in_ruleMessageLink2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_entryRuleExtend2646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtend2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__0_in_ruleExtend2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_entryRuleVar_full2706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar_full2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var_full__Alternatives_in_ruleVar_full2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar2766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Alternatives_in_ruleVar2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID2826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFULL_ID2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__0_in_ruleFULL_ID2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_entryRuleVarReserved2886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarReserved2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarReserved__Alternatives_in_ruleVarReserved2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__Alternatives_in_ruleModifier2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScalarType__Alternatives_in_ruleScalarType3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_rule__Statement__Alternatives3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_rule__Statement__Alternatives3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Statement__Alternatives3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_rule__Statement__Alternatives3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicImport_in_rule__Import__Alternatives3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakImport_in_rule__Import__Alternatives3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeOption_in_rule__Option__Alternatives3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_rule__Option__Alternatives3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_rule__SimpleValueLink__Alternatives3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_rule__SimpleValueLink__Alternatives3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_rule__SimpleValueLink__Alternatives3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomIdLink_in_rule__SimpleValueLink__Alternatives3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_rule__NumberLink__Alternatives3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_rule__NumberLink__Alternatives3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__ComplexType__Alternatives3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_rule__ComplexType__Alternatives3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__ExtensibleType__Alternatives3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__ExtensibleType__Alternatives3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__MessageElement__Alternatives3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_rule__MessageElement__Alternatives3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneof_in_rule__MessageElement__Alternatives3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__MessageElement__Alternatives3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__MessageElement__Alternatives3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_rule__MessageElement__Alternatives3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_rule__MessageElement__Alternatives3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__MessageElement__Alternatives3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_rule__IndexedElement__Alternatives3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__IndexedElement__Alternatives3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__ToAssignment_1_1_0_in_rule__Range__Alternatives_1_13682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__MaxAssignment_1_1_1_in_rule__Range__Alternatives_1_13700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_rule__TypeLink__Alternatives3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_rule__TypeLink__Alternatives3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackedValueFieldOption_in_rule__FieldOption__Alternatives3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_rule__FieldOption__Alternatives3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_rule__FieldOption__Alternatives3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_rule__EnumElement__Alternatives3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_rule__EnumElement__Alternatives3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_rule__ServiceElement__Alternatives3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__ServiceElement__Alternatives3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_rule__Var_full__Alternatives3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Var_full__Alternatives3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Var__Alternatives4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_rule__Var__Alternatives4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VarReserved__Alternatives4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__VarReserved__Alternatives4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__VarReserved__Alternatives4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VarReserved__Alternatives4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VarReserved__Alternatives4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__VarReserved__Alternatives4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VarReserved__Alternatives4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VarReserved__Alternatives4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VarReserved__Alternatives4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VarReserved__Alternatives4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VarReserved__Alternatives4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__VarReserved__Alternatives4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__VarReserved__Alternatives4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__VarReserved__Alternatives4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__VarReserved__Alternatives4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__VarReserved__Alternatives4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VarReserved__Alternatives4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__VarReserved__Alternatives4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__VarReserved__Alternatives4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__VarReserved__Alternatives4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__VarReserved__Alternatives4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__VarReserved__Alternatives4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__VarReserved__Alternatives4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__VarReserved__Alternatives4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__VarReserved__Alternatives4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__VarReserved__Alternatives4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__VarReserved__Alternatives4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__VarReserved__Alternatives4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__VarReserved__Alternatives4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__VarReserved__Alternatives4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__VarReserved__Alternatives4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__VarReserved__Alternatives4673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__VarReserved__Alternatives4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__VarReserved__Alternatives4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__VarReserved__Alternatives4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__VarReserved__Alternatives4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__BOOL__Alternatives4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__BOOL__Alternatives4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Modifier__Alternatives4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Modifier__Alternatives4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Modifier__Alternatives4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ScalarType__Alternatives4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ScalarType__Alternatives4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ScalarType__Alternatives4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ScalarType__Alternatives4987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ScalarType__Alternatives5008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ScalarType__Alternatives5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ScalarType__Alternatives5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ScalarType__Alternatives5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ScalarType__Alternatives5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ScalarType__Alternatives5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ScalarType__Alternatives5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ScalarType__Alternatives5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ScalarType__Alternatives5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ScalarType__Alternatives5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ScalarType__Alternatives5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group__0__Impl_in_rule__Proto__Group__05251 = new BitSet(new long[]{0x0000000002FF4000L});
    public static final BitSet FOLLOW_rule__Proto__Group__1_in_rule__Proto__Group__05254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group_0__0_in_rule__Proto__Group__0__Impl5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group__1__Impl_in_rule__Proto__Group__15312 = new BitSet(new long[]{0x0000000002FF4000L});
    public static final BitSet FOLLOW_rule__Proto__Group__2_in_rule__Proto__Group__15315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__ImportsAssignment_1_in_rule__Proto__Group__1__Impl5342 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Proto__Group__2__Impl_in_rule__Proto__Group__25373 = new BitSet(new long[]{0x0000000002FF4000L});
    public static final BitSet FOLLOW_rule__Proto__Group__3_in_rule__Proto__Group__25376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group_2__0_in_rule__Proto__Group__2__Impl5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group__3__Impl_in_rule__Proto__Group__35434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__StatementsAssignment_3_in_rule__Proto__Group__3__Impl5461 = new BitSet(new long[]{0x0000000002FE0002L});
    public static final BitSet FOLLOW_rule__Proto__Group_0__0__Impl_in_rule__Proto__Group_0__05500 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Proto__Group_0__1_in_rule__Proto__Group_0__05503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Proto__Group_0__0__Impl5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group_0__1__Impl_in_rule__Proto__Group_0__15562 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Proto__Group_0__2_in_rule__Proto__Group_0__15565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Proto__Group_0__1__Impl5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group_0__2__Impl_in_rule__Proto__Group_0__25624 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Proto__Group_0__3_in_rule__Proto__Group_0__25627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__SyntaxAssignment_0_2_in_rule__Proto__Group_0__2__Impl5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group_0__3__Impl_in_rule__Proto__Group_0__35684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Proto__Group_0__3__Impl5712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group_2__0__Impl_in_rule__Proto__Group_2__05751 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Proto__Group_2__1_in_rule__Proto__Group_2__05754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Proto__Group_2__0__Impl5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group_2__1__Impl_in_rule__Proto__Group_2__15813 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Proto__Group_2__2_in_rule__Proto__Group_2__15816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__NameAssignment_2_1_in_rule__Proto__Group_2__1__Impl5843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proto__Group_2__2__Impl_in_rule__Proto__Group_2__25873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Proto__Group_2__2__Impl5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__0__Impl_in_rule__PublicImport__Group__05938 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__1_in_rule__PublicImport__Group__05941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PublicImport__Group__0__Impl5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__1__Impl_in_rule__PublicImport__Group__16000 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__2_in_rule__PublicImport__Group__16003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__PublicImport__Group__1__Impl6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__2__Impl_in_rule__PublicImport__Group__26062 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__3_in_rule__PublicImport__Group__26065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__ImportURIAssignment_2_in_rule__PublicImport__Group__2__Impl6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicImport__Group__3__Impl_in_rule__PublicImport__Group__36122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__PublicImport__Group__3__Impl6150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__0__Impl_in_rule__WeakImport__Group__06189 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__1_in_rule__WeakImport__Group__06192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WeakImport__Group__0__Impl6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__1__Impl_in_rule__WeakImport__Group__16251 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__2_in_rule__WeakImport__Group__16254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__WeakImport__Group__1__Impl6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__2__Impl_in_rule__WeakImport__Group__26316 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__3_in_rule__WeakImport__Group__26319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__ImportURIAssignment_2_in_rule__WeakImport__Group__2__Impl6346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeakImport__Group__3__Impl_in_rule__WeakImport__Group__36376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__WeakImport__Group__3__Impl6404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__0__Impl_in_rule__NativeOption__Group__06443 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__1_in_rule__NativeOption__Group__06446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NativeOption__Group__0__Impl6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__1__Impl_in_rule__NativeOption__Group__16505 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__2_in_rule__NativeOption__Group__16508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__SourceAssignment_1_in_rule__NativeOption__Group__1__Impl6535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__2__Impl_in_rule__NativeOption__Group__26565 = new BitSet(new long[]{0x00060000000000F0L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__3_in_rule__NativeOption__Group__26568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__NativeOption__Group__2__Impl6596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__3__Impl_in_rule__NativeOption__Group__36627 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__4_in_rule__NativeOption__Group__36630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__ValueAssignment_3_in_rule__NativeOption__Group__3__Impl6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeOption__Group__4__Impl_in_rule__NativeOption__Group__46687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__NativeOption__Group__4__Impl6715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__0__Impl_in_rule__CustomOption__Group__06756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__1_in_rule__CustomOption__Group__06759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CustomOption__Group__0__Impl6787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__1__Impl_in_rule__CustomOption__Group__16818 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__2_in_rule__CustomOption__Group__16821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__SourceAssignment_1_in_rule__CustomOption__Group__1__Impl6848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__2__Impl_in_rule__CustomOption__Group__26878 = new BitSet(new long[]{0x00060000000000F0L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__3_in_rule__CustomOption__Group__26881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__CustomOption__Group__2__Impl6909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__3__Impl_in_rule__CustomOption__Group__36940 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__4_in_rule__CustomOption__Group__36943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__ValueAssignment_3_in_rule__CustomOption__Group__3__Impl6970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomOption__Group__4__Impl_in_rule__CustomOption__Group__47000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__CustomOption__Group__4__Impl7028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__07069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__07072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Message__Group__0__Impl7100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__17131 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Message__Group__2_in_rule__Message__Group__17134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__NameAssignment_1_in_rule__Message__Group__1__Impl7161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__27191 = new BitSet(new long[]{0x0180000003FE0000L});
    public static final BitSet FOLLOW_rule__Message__Group__3_in_rule__Message__Group__27194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Message__Group__2__Impl7222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__37253 = new BitSet(new long[]{0x0180000003FE0000L});
    public static final BitSet FOLLOW_rule__Message__Group__4_in_rule__Message__Group__37256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__ElementsAssignment_3_in_rule__Message__Group__3__Impl7283 = new BitSet(new long[]{0x0100000003FE0002L});
    public static final BitSet FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__47314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Message__Group__4__Impl7342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__Group__0__Impl_in_rule__Oneof__Group__07383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Oneof__Group__1_in_rule__Oneof__Group__07386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Oneof__Group__0__Impl7414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__Group__1__Impl_in_rule__Oneof__Group__17445 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Oneof__Group__2_in_rule__Oneof__Group__17448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__NameAssignment_1_in_rule__Oneof__Group__1__Impl7475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__Group__2__Impl_in_rule__Oneof__Group__27505 = new BitSet(new long[]{0x0081FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Oneof__Group__3_in_rule__Oneof__Group__27508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Oneof__Group__2__Impl7536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__Group__3__Impl_in_rule__Oneof__Group__37567 = new BitSet(new long[]{0x0081FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Oneof__Group__4_in_rule__Oneof__Group__37570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oneof__FieldsAssignment_3_in_rule__Oneof__Group__3__Impl7597 = new BitSet(new long[]{0x0001FFFFFFFFE012L});
    public static final BitSet FOLLOW_rule__Oneof__Group__4__Impl_in_rule__Oneof__Group__47628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Oneof__Group__4__Impl7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__0__Impl_in_rule__OneofField__Group__07697 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__OneofField__Group__1_in_rule__OneofField__Group__07700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__TypeAssignment_0_in_rule__OneofField__Group__0__Impl7727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__1__Impl_in_rule__OneofField__Group__17757 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__OneofField__Group__2_in_rule__OneofField__Group__17760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__NameAssignment_1_in_rule__OneofField__Group__1__Impl7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__2__Impl_in_rule__OneofField__Group__27817 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__OneofField__Group__3_in_rule__OneofField__Group__27820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__OneofField__Group__2__Impl7848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__3__Impl_in_rule__OneofField__Group__37879 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_rule__OneofField__Group__4_in_rule__OneofField__Group__37882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__IndexAssignment_3_in_rule__OneofField__Group__3__Impl7909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__4__Impl_in_rule__OneofField__Group__47939 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_rule__OneofField__Group__5_in_rule__OneofField__Group__47942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__OptionsAssignment_4_in_rule__OneofField__Group__4__Impl7969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneofField__Group__5__Impl_in_rule__OneofField__Group__58000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__OneofField__Group__5__Impl8028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__0__Impl_in_rule__ExtensionRange__Group__08071 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__1_in_rule__ExtensionRange__Group__08074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ExtensionRange__Group__0__Impl8102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__1__Impl_in_rule__ExtensionRange__Group__18133 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__2_in_rule__ExtensionRange__Group__18136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__RangesAssignment_1_in_rule__ExtensionRange__Group__1__Impl8163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__2__Impl_in_rule__ExtensionRange__Group__28193 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__3_in_rule__ExtensionRange__Group__28196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__0_in_rule__ExtensionRange__Group__2__Impl8223 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group__3__Impl_in_rule__ExtensionRange__Group__38254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ExtensionRange__Group__3__Impl8282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__0__Impl_in_rule__ExtensionRange__Group_2__08321 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__1_in_rule__ExtensionRange__Group_2__08324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ExtensionRange__Group_2__0__Impl8352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__Group_2__1__Impl_in_rule__ExtensionRange__Group_2__18383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionRange__RangesAssignment_2_1_in_rule__ExtensionRange__Group_2__1__Impl8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__08444 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Range__Group__1_in_rule__Range__Group__08447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__FromAssignment_0_in_rule__Range__Group__0__Impl8474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__18504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group_1__0_in_rule__Range__Group__1__Impl8531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group_1__0__Impl_in_rule__Range__Group_1__08566 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_rule__Range__Group_1__1_in_rule__Range__Group_1__08569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Range__Group_1__0__Impl8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group_1__1__Impl_in_rule__Range__Group_1__18628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Alternatives_1_1_in_rule__Range__Group_1__1__Impl8655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__0__Impl_in_rule__MessageField__Group__08689 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__MessageField__Group__1_in_rule__MessageField__Group__08692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__ModifierAssignment_0_in_rule__MessageField__Group__0__Impl8719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__1__Impl_in_rule__MessageField__Group__18749 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__MessageField__Group__2_in_rule__MessageField__Group__18752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__TypeAssignment_1_in_rule__MessageField__Group__1__Impl8779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__2__Impl_in_rule__MessageField__Group__28809 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__MessageField__Group__3_in_rule__MessageField__Group__28812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__NameAssignment_2_in_rule__MessageField__Group__2__Impl8839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__3__Impl_in_rule__MessageField__Group__38869 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MessageField__Group__4_in_rule__MessageField__Group__38872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__MessageField__Group__3__Impl8900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__4__Impl_in_rule__MessageField__Group__48931 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_rule__MessageField__Group__5_in_rule__MessageField__Group__48934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__IndexAssignment_4_in_rule__MessageField__Group__4__Impl8961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__5__Impl_in_rule__MessageField__Group__58991 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_rule__MessageField__Group__6_in_rule__MessageField__Group__58994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__OptionsAssignment_5_in_rule__MessageField__Group__5__Impl9021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Group__6__Impl_in_rule__MessageField__Group__69052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__MessageField__Group__6__Impl9080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__09125 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__09128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__ModifierAssignment_0_in_rule__Group__Group__0__Impl9155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__19185 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__19188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Group__Group__1__Impl9216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__29247 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__29250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl9277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__39307 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__39310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Group__Group__3__Impl9338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__49369 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Group__Group__5_in_rule__Group__Group__49372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__IndexAssignment_4_in_rule__Group__Group__4__Impl9399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__59429 = new BitSet(new long[]{0x0080000000F40000L});
    public static final BitSet FOLLOW_rule__Group__Group__6_in_rule__Group__Group__59432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Group__Group__5__Impl9460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__6__Impl_in_rule__Group__Group__69491 = new BitSet(new long[]{0x0080000000F40000L});
    public static final BitSet FOLLOW_rule__Group__Group__7_in_rule__Group__Group__69494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__ElementsAssignment_6_in_rule__Group__Group__6__Impl9521 = new BitSet(new long[]{0x0000000000F40002L});
    public static final BitSet FOLLOW_rule__Group__Group__7__Impl_in_rule__Group__Group__79552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Group__Group__7__Impl9580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__0__Impl_in_rule__FieldOptions__Group__09627 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__1_in_rule__FieldOptions__Group__09630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__FieldOptions__Group__0__Impl9658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__1__Impl_in_rule__FieldOptions__Group__19689 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__2_in_rule__FieldOptions__Group__19692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__OptionsAssignment_1_in_rule__FieldOptions__Group__1__Impl9719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__2__Impl_in_rule__FieldOptions__Group__29749 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__3_in_rule__FieldOptions__Group__29752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__0_in_rule__FieldOptions__Group__2__Impl9779 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group__3__Impl_in_rule__FieldOptions__Group__39810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__FieldOptions__Group__3__Impl9838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__0__Impl_in_rule__FieldOptions__Group_2__09877 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__1_in_rule__FieldOptions__Group_2__09880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__FieldOptions__Group_2__0__Impl9908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__Group_2__1__Impl_in_rule__FieldOptions__Group_2__19939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOptions__OptionsAssignment_2_1_in_rule__FieldOptions__Group_2__1__Impl9966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__0__Impl_in_rule__PackedValueFieldOption__Group__010000 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__1_in_rule__PackedValueFieldOption__Group__010003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__PackedValueFieldOption__Group__0__Impl10032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__1__Impl_in_rule__PackedValueFieldOption__Group__110064 = new BitSet(new long[]{0x00060000000000F0L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__2_in_rule__PackedValueFieldOption__Group__110067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__PackedValueFieldOption__Group__1__Impl10095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__Group__2__Impl_in_rule__PackedValueFieldOption__Group__210126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackedValueFieldOption__ValueAssignment_2_in_rule__PackedValueFieldOption__Group__2__Impl10153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__0__Impl_in_rule__DefaultValueFieldOption__Group__010189 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__1_in_rule__DefaultValueFieldOption__Group__010192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DefaultValueFieldOption__Group__0__Impl10221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__1__Impl_in_rule__DefaultValueFieldOption__Group__110253 = new BitSet(new long[]{0x00060000000000F0L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__2_in_rule__DefaultValueFieldOption__Group__110256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__DefaultValueFieldOption__Group__1__Impl10284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__Group__2__Impl_in_rule__DefaultValueFieldOption__Group__210315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueFieldOption__ValueAssignment_2_in_rule__DefaultValueFieldOption__Group__2__Impl10342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__0__Impl_in_rule__NativeFieldOption__Group__010378 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__1_in_rule__NativeFieldOption__Group__010381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__SourceAssignment_0_in_rule__NativeFieldOption__Group__0__Impl10408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__1__Impl_in_rule__NativeFieldOption__Group__110438 = new BitSet(new long[]{0x00060000000000F0L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__2_in_rule__NativeFieldOption__Group__110441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__NativeFieldOption__Group__1__Impl10469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__Group__2__Impl_in_rule__NativeFieldOption__Group__210500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeFieldOption__ValueAssignment_2_in_rule__NativeFieldOption__Group__2__Impl10527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__010563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__010566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Enum__Group__0__Impl10594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__110625 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__110628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl10655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__210685 = new BitSet(new long[]{0x0080000002FE0010L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__210688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Enum__Group__2__Impl10716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__310747 = new BitSet(new long[]{0x0080000002FE0010L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__310750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__ElementsAssignment_3_in_rule__Enum__Group__3__Impl10777 = new BitSet(new long[]{0x0000000002FE0012L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__410808 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__410811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Enum__Group__4__Impl10839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__510870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Enum__Group__5__Impl10899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__0__Impl_in_rule__EnumField__Group__010944 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__1_in_rule__EnumField__Group__010947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__NameAssignment_0_in_rule__EnumField__Group__0__Impl10974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__1__Impl_in_rule__EnumField__Group__111004 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumField__Group__2_in_rule__EnumField__Group__111007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__EnumField__Group__1__Impl11035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__2__Impl_in_rule__EnumField__Group__211066 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__3_in_rule__EnumField__Group__211069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__IndexAssignment_2_in_rule__EnumField__Group__2__Impl11096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__3__Impl_in_rule__EnumField__Group__311126 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__4_in_rule__EnumField__Group__311129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__0_in_rule__EnumField__Group__3__Impl11156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__4__Impl_in_rule__EnumField__Group__411187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__EnumField__Group__4__Impl11215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__0__Impl_in_rule__EnumField__Group_3__011256 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__1_in_rule__EnumField__Group_3__011259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__EnumField__Group_3__0__Impl11287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__1__Impl_in_rule__EnumField__Group_3__111318 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__2_in_rule__EnumField__Group_3__111321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__OptionsAssignment_3_1_in_rule__EnumField__Group_3__1__Impl11348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__2__Impl_in_rule__EnumField__Group_3__211378 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__3_in_rule__EnumField__Group_3__211381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__0_in_rule__EnumField__Group_3__2__Impl11408 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3__3__Impl_in_rule__EnumField__Group_3__311439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__EnumField__Group_3__3__Impl11467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__0__Impl_in_rule__EnumField__Group_3_2__011506 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__1_in_rule__EnumField__Group_3_2__011509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__EnumField__Group_3_2__0__Impl11537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group_3_2__1__Impl_in_rule__EnumField__Group_3_2__111568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__OptionsAssignment_3_2_1_in_rule__EnumField__Group_3_2__1__Impl11595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__011629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__011632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Service__Group__0__Impl11660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__111691 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__111694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl11721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__211751 = new BitSet(new long[]{0x018000000BFE0000L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__211754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Service__Group__2__Impl11782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__311813 = new BitSet(new long[]{0x018000000BFE0000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__311816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__ElementsAssignment_3_in_rule__Service__Group__3__Impl11843 = new BitSet(new long[]{0x010000000BFE0002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__411874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Service__Group__4__Impl11902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__0__Impl_in_rule__Rpc__Group__011943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rpc__Group__1_in_rule__Rpc__Group__011946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Rpc__Group__0__Impl11975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__1__Impl_in_rule__Rpc__Group__112007 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__2_in_rule__Rpc__Group__112010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__NameAssignment_1_in_rule__Rpc__Group__1__Impl12037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__2__Impl_in_rule__Rpc__Group__212067 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Rpc__Group__3_in_rule__Rpc__Group__212070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Rpc__Group__2__Impl12098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__3__Impl_in_rule__Rpc__Group__312129 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__4_in_rule__Rpc__Group__312132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__ArgTypeAssignment_3_in_rule__Rpc__Group__3__Impl12159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__4__Impl_in_rule__Rpc__Group__412189 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__5_in_rule__Rpc__Group__412192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Rpc__Group__4__Impl12220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__5__Impl_in_rule__Rpc__Group__512251 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__6_in_rule__Rpc__Group__512254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Rpc__Group__5__Impl12282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__6__Impl_in_rule__Rpc__Group__612313 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Rpc__Group__7_in_rule__Rpc__Group__612316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Rpc__Group__6__Impl12344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__7__Impl_in_rule__Rpc__Group__712375 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__8_in_rule__Rpc__Group__712378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__ReturnTypeAssignment_7_in_rule__Rpc__Group__7__Impl12405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__8__Impl_in_rule__Rpc__Group__812435 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__9_in_rule__Rpc__Group__812438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Rpc__Group__8__Impl12466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__9__Impl_in_rule__Rpc__Group__912497 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_rule__Rpc__Group__10_in_rule__Rpc__Group__912500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__0_in_rule__Rpc__Group__9__Impl12527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group__10__Impl_in_rule__Rpc__Group__1012558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Rpc__Group__10__Impl12586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__0__Impl_in_rule__Rpc__Group_9__012639 = new BitSet(new long[]{0x0180000003FE0000L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__1_in_rule__Rpc__Group_9__012642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Rpc__Group_9__0__Impl12670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__1__Impl_in_rule__Rpc__Group_9__112701 = new BitSet(new long[]{0x0180000003FE0000L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__2_in_rule__Rpc__Group_9__112704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rpc__OptionsAssignment_9_1_in_rule__Rpc__Group_9__1__Impl12731 = new BitSet(new long[]{0x0100000003FE0002L});
    public static final BitSet FOLLOW_rule__Rpc__Group_9__2__Impl_in_rule__Rpc__Group_9__212762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Rpc__Group_9__2__Impl12790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__0__Impl_in_rule__Extend__Group__012827 = new BitSet(new long[]{0x0001FFFFFFFFE010L});
    public static final BitSet FOLLOW_rule__Extend__Group__1_in_rule__Extend__Group__012830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Extend__Group__0__Impl12859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__1__Impl_in_rule__Extend__Group__112891 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Extend__Group__2_in_rule__Extend__Group__112894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__TypeAssignment_1_in_rule__Extend__Group__1__Impl12921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__2__Impl_in_rule__Extend__Group__212951 = new BitSet(new long[]{0x0180000003FE0000L});
    public static final BitSet FOLLOW_rule__Extend__Group__3_in_rule__Extend__Group__212954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Extend__Group__2__Impl12982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__Group__3__Impl_in_rule__Extend__Group__313013 = new BitSet(new long[]{0x0180000003FE0000L});
    public static final BitSet FOLLOW_rule__Extend__Group__4_in_rule__Extend__Group__313016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extend__ElementsAssignment_3_in_rule__Extend__Group__3__Impl13043 = new BitSet(new long[]{0x0100000003FE0002L});
    public static final BitSet FOLLOW_rule__Extend__Group__4__Impl_in_rule__Extend__Group__413074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Extend__Group__4__Impl13102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__0__Impl_in_rule__FULL_ID__Group__013143 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__1_in_rule__FULL_ID__Group__013146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FULL_ID__Group__0__Impl13173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group__1__Impl_in_rule__FULL_ID__Group__113202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl13231 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__0_in_rule__FULL_ID__Group__1__Impl13243 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__0__Impl_in_rule__FULL_ID__Group_1__013280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__1_in_rule__FULL_ID__Group_1__013283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__FULL_ID__Group_1__0__Impl13311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FULL_ID__Group_1__1__Impl_in_rule__FULL_ID__Group_1__113342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FULL_ID__Group_1__1__Impl13369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Proto__SyntaxAssignment_0_213408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Proto__ImportsAssignment_113439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__Proto__NameAssignment_2_113470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Proto__StatementsAssignment_313501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PublicImport__ImportURIAssignment_213532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__WeakImport__ImportURIAssignment_213563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__NativeOption__SourceAssignment_113598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__NativeOption__ValueAssignment_313633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomOption__SourceAssignment_113664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__CustomOption__ValueAssignment_313695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomIdLink__TargetAssignment13726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLink__TargetAssignment13757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__BooleanLink__TargetAssignment13788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__IntLink__TargetAssignment13819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMDOUBLE_in_rule__DoubleLink__TargetAssignment13850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__NameAssignment_113881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_rule__Message__ElementsAssignment_313912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Oneof__NameAssignment_113943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneofField_in_rule__Oneof__FieldsAssignment_313974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__OneofField__TypeAssignment_014005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__OneofField__NameAssignment_114036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__OneofField__IndexAssignment_314067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_rule__OneofField__OptionsAssignment_414098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_rule__ExtensionRange__RangesAssignment_114129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_rule__ExtensionRange__RangesAssignment_2_114160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__Range__FromAssignment_014191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__Range__ToAssignment_1_1_014222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Range__MaxAssignment_1_1_114258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__MessageField__ModifierAssignment_014297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__MessageField__TypeAssignment_114328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__MessageField__NameAssignment_214359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__MessageField__IndexAssignment_414390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_rule__MessageField__OptionsAssignment_514421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Group__ModifierAssignment_014452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Group__NameAssignment_214483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__Group__IndexAssignment_414514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_rule__Group__ElementsAssignment_614545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__ComplexTypeLink__TargetAssignment14580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarType_in_rule__ScalarTypeLink__TargetAssignment14615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_114646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__FieldOptions__OptionsAssignment_2_114677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__PackedValueFieldOption__ValueAssignment_214708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__DefaultValueFieldOption__ValueAssignment_214739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_rule__NativeFieldOption__SourceAssignment_014770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__NativeFieldOption__ValueAssignment_214801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__OptionSource__TargetAssignment14836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_114871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_rule__Enum__ElementsAssignment_314902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumField__NameAssignment_014933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_rule__EnumField__IndexAssignment_214964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_114995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_rule__EnumField__OptionsAssignment_3_2_115026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_115057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceElement_in_rule__Service__ElementsAssignment_315088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rpc__NameAssignment_115119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_rule__Rpc__ArgTypeAssignment_315150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_rule__Rpc__ReturnTypeAssignment_715181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Rpc__OptionsAssignment_9_115212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__MessageLink__TargetAssignment15247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_rule__Extend__TypeAssignment_115286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_rule__Extend__ElementsAssignment_315321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeOption_in_synpred5_InternalProtobuf3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_synpred21_InternalProtobuf3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackedValueFieldOption_in_synpred22_InternalProtobuf3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_synpred23_InternalProtobuf3804 = new BitSet(new long[]{0x0000000000000002L});

}