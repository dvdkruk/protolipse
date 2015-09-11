package protolipse.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import protolipse.services.ProtobufGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalProtobufParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_NUMINT", "RULE_NUMDOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'syntax'", "'='", "';'", "'package'", "'import'", "'public'", "'weak'", "'option'", "'message'", "'{'", "'}'", "'extensions'", "','", "'to'", "'max'", "'group'", "'['", "']'", "'default'", "'enum'", "'service'", "'rpc'", "'('", "')'", "'returns'", "'extend'", "'.'", "'required'", "'optional'", "'repeated'", "'int32'", "'int64'", "'uint32'", "'uint64'", "'sint32'", "'sint64'", "'fixed32'", "'fixed64'", "'sfixed32'", "'sfixed64'", "'float'", "'double'", "'bool'", "'string'", "'bytes'", "'void'", "'true'", "'false'"
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g"; }



     	private ProtobufGrammarAccess grammarAccess;
     	
        public InternalProtobufParser(TokenStream input, ProtobufGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Proto";	
       	}
       	
       	@Override
       	protected ProtobufGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProto"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:68:1: entryRuleProto returns [EObject current=null] : iv_ruleProto= ruleProto EOF ;
    public final EObject entryRuleProto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProto = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:69:2: (iv_ruleProto= ruleProto EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:70:2: iv_ruleProto= ruleProto EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoRule()); 
            }
            pushFollow(FOLLOW_ruleProto_in_entryRuleProto75);
            iv_ruleProto=ruleProto();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProto; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProto85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProto"


    // $ANTLR start "ruleProto"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:77:1: ruleProto returns [EObject current=null] : ( ( (lv_syntax_0_0= ruleSyntax ) )? ( (lv_statements_1_0= ruleStatement ) )* ) ;
    public final EObject ruleProto() throws RecognitionException {
        EObject current = null;

        EObject lv_syntax_0_0 = null;

        EObject lv_statements_1_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:80:28: ( ( ( (lv_syntax_0_0= ruleSyntax ) )? ( (lv_statements_1_0= ruleStatement ) )* ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:81:1: ( ( (lv_syntax_0_0= ruleSyntax ) )? ( (lv_statements_1_0= ruleStatement ) )* )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:81:1: ( ( (lv_syntax_0_0= ruleSyntax ) )? ( (lv_statements_1_0= ruleStatement ) )* )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:81:2: ( (lv_syntax_0_0= ruleSyntax ) )? ( (lv_statements_1_0= ruleStatement ) )*
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:81:2: ( (lv_syntax_0_0= ruleSyntax ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:82:1: (lv_syntax_0_0= ruleSyntax )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:82:1: (lv_syntax_0_0= ruleSyntax )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:83:3: lv_syntax_0_0= ruleSyntax
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProtoAccess().getSyntaxSyntaxParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSyntax_in_ruleProto131);
                    lv_syntax_0_0=ruleSyntax();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProtoRule());
                      	        }
                             		set(
                             			current, 
                             			"syntax",
                              		lv_syntax_0_0, 
                              		"Syntax");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:99:3: ( (lv_statements_1_0= ruleStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=16 && LA2_0<=17)||(LA2_0>=20 && LA2_0<=21)||(LA2_0>=32 && LA2_0<=33)||LA2_0==38||(LA2_0>=40 && LA2_0<=42)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:100:1: (lv_statements_1_0= ruleStatement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:100:1: (lv_statements_1_0= ruleStatement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:101:3: lv_statements_1_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProtoAccess().getStatementsStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleProto153);
            	    lv_statements_1_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProtoRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_1_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProto"


    // $ANTLR start "entryRuleStatement"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:125:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:126:2: (iv_ruleStatement= ruleStatement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:127:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement190);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement200); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:134:1: ruleStatement returns [EObject current=null] : (this_Package_0= rulePackage | this_Import_1= ruleImport | this_ComplexType_2= ruleComplexType | ( ( 'extend' )=>this_Extend_3= ruleExtend ) | this_Service_4= ruleService | this_Option_5= ruleOption ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_Import_1 = null;

        EObject this_ComplexType_2 = null;

        EObject this_Extend_3 = null;

        EObject this_Service_4 = null;

        EObject this_Option_5 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:137:28: ( (this_Package_0= rulePackage | this_Import_1= ruleImport | this_ComplexType_2= ruleComplexType | ( ( 'extend' )=>this_Extend_3= ruleExtend ) | this_Service_4= ruleService | this_Option_5= ruleOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:138:1: (this_Package_0= rulePackage | this_Import_1= ruleImport | this_ComplexType_2= ruleComplexType | ( ( 'extend' )=>this_Extend_3= ruleExtend ) | this_Service_4= ruleService | this_Option_5= ruleOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:138:1: (this_Package_0= rulePackage | this_Import_1= ruleImport | this_ComplexType_2= ruleComplexType | ( ( 'extend' )=>this_Extend_3= ruleExtend ) | this_Service_4= ruleService | this_Option_5= ruleOption )
            int alt3=6;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else if ( (LA3_0==21||LA3_0==32||(LA3_0>=40 && LA3_0<=42)) ) {
                alt3=3;
            }
            else if ( (LA3_0==38) && (synpred1_InternalProtobuf())) {
                alt3=4;
            }
            else if ( (LA3_0==33) ) {
                alt3=5;
            }
            else if ( (LA3_0==20) ) {
                alt3=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:139:5: this_Package_0= rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getPackageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePackage_in_ruleStatement247);
                    this_Package_0=rulePackage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Package_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:149:5: this_Import_1= ruleImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getImportParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImport_in_ruleStatement274);
                    this_Import_1=ruleImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Import_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:159:5: this_ComplexType_2= ruleComplexType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getComplexTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComplexType_in_ruleStatement301);
                    this_ComplexType_2=ruleComplexType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ComplexType_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:168:6: ( ( 'extend' )=>this_Extend_3= ruleExtend )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:168:6: ( ( 'extend' )=>this_Extend_3= ruleExtend )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:168:7: ( 'extend' )=>this_Extend_3= ruleExtend
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExtendParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtend_in_ruleStatement336);
                    this_Extend_3=ruleExtend();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Extend_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:180:5: this_Service_4= ruleService
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getServiceParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleService_in_ruleStatement364);
                    this_Service_4=ruleService();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Service_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:190:5: this_Option_5= ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getOptionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOption_in_ruleStatement391);
                    this_Option_5=ruleOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Option_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSyntax"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:206:1: entryRuleSyntax returns [EObject current=null] : iv_ruleSyntax= ruleSyntax EOF ;
    public final EObject entryRuleSyntax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSyntax = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:207:2: (iv_ruleSyntax= ruleSyntax EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:208:2: iv_ruleSyntax= ruleSyntax EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSyntaxRule()); 
            }
            pushFollow(FOLLOW_ruleSyntax_in_entryRuleSyntax426);
            iv_ruleSyntax=ruleSyntax();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSyntax; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyntax436); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSyntax"


    // $ANTLR start "ruleSyntax"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:215:1: ruleSyntax returns [EObject current=null] : (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleSyntax() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:218:28: ( (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:219:1: (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:219:1: (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:219:3: otherlv_0= 'syntax' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleSyntax473); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSyntaxAccess().getSyntaxKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSyntax485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSyntaxAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:227:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:228:1: (lv_name_2_0= RULE_STRING )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:228:1: (lv_name_2_0= RULE_STRING )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:229:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSyntax502); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getSyntaxAccess().getNameSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSyntaxRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSyntax519); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSyntaxAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSyntax"


    // $ANTLR start "entryRulePackage"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:257:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:258:2: (iv_rulePackage= rulePackage EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:259:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage555);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage565); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:266:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleVar_full ) ) otherlv_2= ';' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:269:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleVar_full ) ) otherlv_2= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:270:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleVar_full ) ) otherlv_2= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:270:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleVar_full ) ) otherlv_2= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:270:3: otherlv_0= 'package' ( (lv_name_1_0= ruleVar_full ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePackage602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:274:1: ( (lv_name_1_0= ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:275:1: (lv_name_1_0= ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:275:1: (lv_name_1_0= ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:276:3: lv_name_1_0= ruleVar_full
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageAccess().getNameVar_fullParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_rulePackage623);
            lv_name_1_0=ruleVar_full();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackageRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"Var_full");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePackage635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleImport"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:304:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:305:2: (iv_ruleImport= ruleImport EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:306:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport671);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport681); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:313:1: ruleImport returns [EObject current=null] : (this_PublicImport_0= rulePublicImport | this_WeakImport_1= ruleWeakImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_PublicImport_0 = null;

        EObject this_WeakImport_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:316:28: ( (this_PublicImport_0= rulePublicImport | this_WeakImport_1= ruleWeakImport ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:317:1: (this_PublicImport_0= rulePublicImport | this_WeakImport_1= ruleWeakImport )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:317:1: (this_PublicImport_0= rulePublicImport | this_WeakImport_1= ruleWeakImport )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_STRING||LA4_1==19) ) {
                    alt4=2;
                }
                else if ( (LA4_1==18) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:318:5: this_PublicImport_0= rulePublicImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImportAccess().getPublicImportParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePublicImport_in_ruleImport728);
                    this_PublicImport_0=rulePublicImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PublicImport_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:328:5: this_WeakImport_1= ruleWeakImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImportAccess().getWeakImportParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWeakImport_in_ruleImport755);
                    this_WeakImport_1=ruleWeakImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WeakImport_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePublicImport"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:344:1: entryRulePublicImport returns [EObject current=null] : iv_rulePublicImport= rulePublicImport EOF ;
    public final EObject entryRulePublicImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublicImport = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:345:2: (iv_rulePublicImport= rulePublicImport EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:346:2: iv_rulePublicImport= rulePublicImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPublicImportRule()); 
            }
            pushFollow(FOLLOW_rulePublicImport_in_entryRulePublicImport790);
            iv_rulePublicImport=rulePublicImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePublicImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePublicImport800); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePublicImport"


    // $ANTLR start "rulePublicImport"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:353:1: rulePublicImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= 'public' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject rulePublicImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:356:28: ( (otherlv_0= 'import' otherlv_1= 'public' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:357:1: (otherlv_0= 'import' otherlv_1= 'public' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:357:1: (otherlv_0= 'import' otherlv_1= 'public' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:357:3: otherlv_0= 'import' otherlv_1= 'public' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulePublicImport837); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPublicImportAccess().getImportKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePublicImport849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPublicImportAccess().getPublicKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:365:1: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:366:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:366:1: (lv_importURI_2_0= RULE_STRING )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:367:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePublicImport866); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_2_0, grammarAccess.getPublicImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPublicImportRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePublicImport883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPublicImportAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePublicImport"


    // $ANTLR start "entryRuleWeakImport"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:395:1: entryRuleWeakImport returns [EObject current=null] : iv_ruleWeakImport= ruleWeakImport EOF ;
    public final EObject entryRuleWeakImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeakImport = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:396:2: (iv_ruleWeakImport= ruleWeakImport EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:397:2: iv_ruleWeakImport= ruleWeakImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWeakImportRule()); 
            }
            pushFollow(FOLLOW_ruleWeakImport_in_entryRuleWeakImport919);
            iv_ruleWeakImport=ruleWeakImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWeakImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeakImport929); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWeakImport"


    // $ANTLR start "ruleWeakImport"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:404:1: ruleWeakImport returns [EObject current=null] : (otherlv_0= 'import' (otherlv_1= 'weak' )? ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleWeakImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:407:28: ( (otherlv_0= 'import' (otherlv_1= 'weak' )? ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:408:1: (otherlv_0= 'import' (otherlv_1= 'weak' )? ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:408:1: (otherlv_0= 'import' (otherlv_1= 'weak' )? ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:408:3: otherlv_0= 'import' (otherlv_1= 'weak' )? ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleWeakImport966); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWeakImportAccess().getImportKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:412:1: (otherlv_1= 'weak' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:412:3: otherlv_1= 'weak'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleWeakImport979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getWeakImportAccess().getWeakKeyword_1());
                          
                    }

                    }
                    break;

            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:416:3: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:417:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:417:1: (lv_importURI_2_0= RULE_STRING )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:418:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWeakImport998); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_2_0, grammarAccess.getWeakImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getWeakImportRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleWeakImport1015); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWeakImportAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWeakImport"


    // $ANTLR start "entryRuleOption"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:446:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:447:2: (iv_ruleOption= ruleOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:448:2: iv_ruleOption= ruleOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionRule()); 
            }
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption1051);
            iv_ruleOption=ruleOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption1061); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:455:1: ruleOption returns [EObject current=null] : ( ( ( ruleNativeOption )=>this_NativeOption_0= ruleNativeOption ) | this_CustomOption_1= ruleCustomOption ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_NativeOption_0 = null;

        EObject this_CustomOption_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:458:28: ( ( ( ( ruleNativeOption )=>this_NativeOption_0= ruleNativeOption ) | this_CustomOption_1= ruleCustomOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:459:1: ( ( ( ruleNativeOption )=>this_NativeOption_0= ruleNativeOption ) | this_CustomOption_1= ruleCustomOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:459:1: ( ( ( ruleNativeOption )=>this_NativeOption_0= ruleNativeOption ) | this_CustomOption_1= ruleCustomOption )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:459:2: ( ( ruleNativeOption )=>this_NativeOption_0= ruleNativeOption )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:459:2: ( ( ruleNativeOption )=>this_NativeOption_0= ruleNativeOption )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:459:3: ( ruleNativeOption )=>this_NativeOption_0= ruleNativeOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOptionAccess().getNativeOptionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNativeOption_in_ruleOption1114);
                    this_NativeOption_0=ruleNativeOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NativeOption_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:470:5: this_CustomOption_1= ruleCustomOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOptionAccess().getCustomOptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCustomOption_in_ruleOption1142);
                    this_CustomOption_1=ruleCustomOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CustomOption_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleNativeOption"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:486:1: entryRuleNativeOption returns [EObject current=null] : iv_ruleNativeOption= ruleNativeOption EOF ;
    public final EObject entryRuleNativeOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:487:2: (iv_ruleNativeOption= ruleNativeOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:488:2: iv_ruleNativeOption= ruleNativeOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNativeOptionRule()); 
            }
            pushFollow(FOLLOW_ruleNativeOption_in_entryRuleNativeOption1177);
            iv_ruleNativeOption=ruleNativeOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNativeOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeOption1187); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNativeOption"


    // $ANTLR start "ruleNativeOption"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:495:1: ruleNativeOption returns [EObject current=null] : (otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' ) ;
    public final EObject ruleNativeOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:498:28: ( (otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:499:1: (otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:499:1: (otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:499:3: otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleNativeOption1224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNativeOptionAccess().getOptionKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:503:1: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:504:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:504:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:505:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNativeOptionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNativeOptionAccess().getSourceMessageFieldCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleNativeOption1247);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleNativeOption1259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNativeOptionAccess().getEqualsSignKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:522:1: ( (lv_value_3_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:523:1: (lv_value_3_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:523:1: (lv_value_3_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:524:3: lv_value_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNativeOptionAccess().getValueValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleNativeOption1280);
            lv_value_3_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNativeOptionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleNativeOption1292); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getNativeOptionAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNativeOption"


    // $ANTLR start "entryRuleCustomOption"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:552:1: entryRuleCustomOption returns [EObject current=null] : iv_ruleCustomOption= ruleCustomOption EOF ;
    public final EObject entryRuleCustomOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:553:2: (iv_ruleCustomOption= ruleCustomOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:554:2: iv_ruleCustomOption= ruleCustomOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCustomOptionRule()); 
            }
            pushFollow(FOLLOW_ruleCustomOption_in_entryRuleCustomOption1328);
            iv_ruleCustomOption=ruleCustomOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCustomOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomOption1338); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomOption"


    // $ANTLR start "ruleCustomOption"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:561:1: ruleCustomOption returns [EObject current=null] : (otherlv_0= 'option' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' ) ;
    public final EObject ruleCustomOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_source_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:564:28: ( (otherlv_0= 'option' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:565:1: (otherlv_0= 'option' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:565:1: (otherlv_0= 'option' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:565:3: otherlv_0= 'option' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleCustomOption1375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCustomOptionAccess().getOptionKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:569:1: ( (lv_source_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:570:1: (lv_source_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:570:1: (lv_source_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:571:3: lv_source_1_0= RULE_ID
            {
            lv_source_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomOption1392); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_source_1_0, grammarAccess.getCustomOptionAccess().getSourceIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCustomOptionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"source",
                      		lv_source_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleCustomOption1409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCustomOptionAccess().getEqualsSignKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:591:1: ( (lv_value_3_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:592:1: (lv_value_3_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:592:1: (lv_value_3_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:593:3: lv_value_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCustomOptionAccess().getValueValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleCustomOption1430);
            lv_value_3_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCustomOptionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleCustomOption1442); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCustomOptionAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomOption"


    // $ANTLR start "entryRuleValue"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:621:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:622:2: (iv_ruleValue= ruleValue EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:623:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1478);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1488); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:630:1: ruleValue returns [EObject current=null] : this_SimpleValueLink_0= ruleSimpleValueLink ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValueLink_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:633:28: (this_SimpleValueLink_0= ruleSimpleValueLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:635:5: this_SimpleValueLink_0= ruleSimpleValueLink
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValueAccess().getSimpleValueLinkParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleSimpleValueLink_in_ruleValue1534);
            this_SimpleValueLink_0=ruleSimpleValueLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SimpleValueLink_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleSimpleValueLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:651:1: entryRuleSimpleValueLink returns [EObject current=null] : iv_ruleSimpleValueLink= ruleSimpleValueLink EOF ;
    public final EObject entryRuleSimpleValueLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValueLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:652:2: (iv_ruleSimpleValueLink= ruleSimpleValueLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:653:2: iv_ruleSimpleValueLink= ruleSimpleValueLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleValueLinkRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleValueLink_in_entryRuleSimpleValueLink1568);
            iv_ruleSimpleValueLink=ruleSimpleValueLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleValueLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleValueLink1578); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleValueLink"


    // $ANTLR start "ruleSimpleValueLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:660:1: ruleSimpleValueLink returns [EObject current=null] : (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_EnumLink_3= ruleEnumLink ) ;
    public final EObject ruleSimpleValueLink() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLink_0 = null;

        EObject this_BooleanLink_1 = null;

        EObject this_StringLink_2 = null;

        EObject this_EnumLink_3 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:663:28: ( (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_EnumLink_3= ruleEnumLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:664:1: (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_EnumLink_3= ruleEnumLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:664:1: (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_EnumLink_3= ruleEnumLink )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_NUMINT:
            case RULE_NUMDOUBLE:
                {
                alt7=1;
                }
                break;
            case 59:
            case 60:
                {
                alt7=2;
                }
                break;
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:665:5: this_NumberLink_0= ruleNumberLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleValueLinkAccess().getNumberLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLink_in_ruleSimpleValueLink1625);
                    this_NumberLink_0=ruleNumberLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberLink_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:675:5: this_BooleanLink_1= ruleBooleanLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleValueLinkAccess().getBooleanLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLink_in_ruleSimpleValueLink1652);
                    this_BooleanLink_1=ruleBooleanLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLink_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:685:5: this_StringLink_2= ruleStringLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleValueLinkAccess().getStringLinkParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLink_in_ruleSimpleValueLink1679);
                    this_StringLink_2=ruleStringLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLink_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:695:5: this_EnumLink_3= ruleEnumLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleValueLinkAccess().getEnumLinkParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumLink_in_ruleSimpleValueLink1706);
                    this_EnumLink_3=ruleEnumLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumLink_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleValueLink"


    // $ANTLR start "entryRuleEnumLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:711:1: entryRuleEnumLink returns [EObject current=null] : iv_ruleEnumLink= ruleEnumLink EOF ;
    public final EObject entryRuleEnumLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:712:2: (iv_ruleEnumLink= ruleEnumLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:713:2: iv_ruleEnumLink= ruleEnumLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumLinkRule()); 
            }
            pushFollow(FOLLOW_ruleEnumLink_in_entryRuleEnumLink1741);
            iv_ruleEnumLink=ruleEnumLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLink1751); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumLink"


    // $ANTLR start "ruleEnumLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:720:1: ruleEnumLink returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEnumLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:723:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:724:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:724:1: ( (otherlv_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:725:1: (otherlv_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:725:1: (otherlv_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:726:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumLinkRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumLink1795); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEnumLinkAccess().getTargetEnumFieldCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumLink"


    // $ANTLR start "entryRuleStringLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:745:1: entryRuleStringLink returns [EObject current=null] : iv_ruleStringLink= ruleStringLink EOF ;
    public final EObject entryRuleStringLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:746:2: (iv_ruleStringLink= ruleStringLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:747:2: iv_ruleStringLink= ruleStringLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLinkRule()); 
            }
            pushFollow(FOLLOW_ruleStringLink_in_entryRuleStringLink1830);
            iv_ruleStringLink=ruleStringLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLink1840); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLink"


    // $ANTLR start "ruleStringLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:754:1: ruleStringLink returns [EObject current=null] : ( (lv_target_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:757:28: ( ( (lv_target_0_0= RULE_STRING ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:758:1: ( (lv_target_0_0= RULE_STRING ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:758:1: ( (lv_target_0_0= RULE_STRING ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:759:1: (lv_target_0_0= RULE_STRING )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:759:1: (lv_target_0_0= RULE_STRING )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:760:3: lv_target_0_0= RULE_STRING
            {
            lv_target_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLink1881); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_target_0_0, grammarAccess.getStringLinkAccess().getTargetSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLinkRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"target",
                      		lv_target_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLink"


    // $ANTLR start "entryRuleBooleanLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:784:1: entryRuleBooleanLink returns [EObject current=null] : iv_ruleBooleanLink= ruleBooleanLink EOF ;
    public final EObject entryRuleBooleanLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:785:2: (iv_ruleBooleanLink= ruleBooleanLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:786:2: iv_ruleBooleanLink= ruleBooleanLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLinkRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink1921);
            iv_ruleBooleanLink=ruleBooleanLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLink1931); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLink"


    // $ANTLR start "ruleBooleanLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:793:1: ruleBooleanLink returns [EObject current=null] : ( (lv_target_0_0= ruleBOOL ) ) ;
    public final EObject ruleBooleanLink() throws RecognitionException {
        EObject current = null;

        Enumerator lv_target_0_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:796:28: ( ( (lv_target_0_0= ruleBOOL ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:797:1: ( (lv_target_0_0= ruleBOOL ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:797:1: ( (lv_target_0_0= ruleBOOL ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:798:1: (lv_target_0_0= ruleBOOL )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:798:1: (lv_target_0_0= ruleBOOL )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:799:3: lv_target_0_0= ruleBOOL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBooleanLinkAccess().getTargetBOOLEnumRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBOOL_in_ruleBooleanLink1976);
            lv_target_0_0=ruleBOOL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBooleanLinkRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_0_0, 
                      		"BOOL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLink"


    // $ANTLR start "entryRuleNumberLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:823:1: entryRuleNumberLink returns [EObject current=null] : iv_ruleNumberLink= ruleNumberLink EOF ;
    public final EObject entryRuleNumberLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:824:2: (iv_ruleNumberLink= ruleNumberLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:825:2: iv_ruleNumberLink= ruleNumberLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLinkRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLink_in_entryRuleNumberLink2011);
            iv_ruleNumberLink=ruleNumberLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLink2021); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLink"


    // $ANTLR start "ruleNumberLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:832:1: ruleNumberLink returns [EObject current=null] : (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink ) ;
    public final EObject ruleNumberLink() throws RecognitionException {
        EObject current = null;

        EObject this_IntLink_0 = null;

        EObject this_DoubleLink_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:835:28: ( (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:836:1: (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:836:1: (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_NUMINT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_NUMDOUBLE) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:837:5: this_IntLink_0= ruleIntLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberLinkAccess().getIntLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLink_in_ruleNumberLink2068);
                    this_IntLink_0=ruleIntLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntLink_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:847:5: this_DoubleLink_1= ruleDoubleLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberLinkAccess().getDoubleLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoubleLink_in_ruleNumberLink2095);
                    this_DoubleLink_1=ruleDoubleLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DoubleLink_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLink"


    // $ANTLR start "entryRuleIntLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:863:1: entryRuleIntLink returns [EObject current=null] : iv_ruleIntLink= ruleIntLink EOF ;
    public final EObject entryRuleIntLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:864:2: (iv_ruleIntLink= ruleIntLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:865:2: iv_ruleIntLink= ruleIntLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLinkRule()); 
            }
            pushFollow(FOLLOW_ruleIntLink_in_entryRuleIntLink2130);
            iv_ruleIntLink=ruleIntLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLink2140); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLink"


    // $ANTLR start "ruleIntLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:872:1: ruleIntLink returns [EObject current=null] : ( (lv_target_0_0= RULE_NUMINT ) ) ;
    public final EObject ruleIntLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:875:28: ( ( (lv_target_0_0= RULE_NUMINT ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:876:1: ( (lv_target_0_0= RULE_NUMINT ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:876:1: ( (lv_target_0_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:877:1: (lv_target_0_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:877:1: (lv_target_0_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:878:3: lv_target_0_0= RULE_NUMINT
            {
            lv_target_0_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleIntLink2181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_target_0_0, grammarAccess.getIntLinkAccess().getTargetNUMINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntLinkRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"target",
                      		lv_target_0_0, 
                      		"NUMINT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntLink"


    // $ANTLR start "entryRuleDoubleLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:902:1: entryRuleDoubleLink returns [EObject current=null] : iv_ruleDoubleLink= ruleDoubleLink EOF ;
    public final EObject entryRuleDoubleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:903:2: (iv_ruleDoubleLink= ruleDoubleLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:904:2: iv_ruleDoubleLink= ruleDoubleLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleLinkRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink2221);
            iv_ruleDoubleLink=ruleDoubleLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoubleLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLink2231); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleLink"


    // $ANTLR start "ruleDoubleLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:911:1: ruleDoubleLink returns [EObject current=null] : ( (lv_target_0_0= RULE_NUMDOUBLE ) ) ;
    public final EObject ruleDoubleLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:914:28: ( ( (lv_target_0_0= RULE_NUMDOUBLE ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:915:1: ( (lv_target_0_0= RULE_NUMDOUBLE ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:915:1: ( (lv_target_0_0= RULE_NUMDOUBLE ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:916:1: (lv_target_0_0= RULE_NUMDOUBLE )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:916:1: (lv_target_0_0= RULE_NUMDOUBLE )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:917:3: lv_target_0_0= RULE_NUMDOUBLE
            {
            lv_target_0_0=(Token)match(input,RULE_NUMDOUBLE,FOLLOW_RULE_NUMDOUBLE_in_ruleDoubleLink2272); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_target_0_0, grammarAccess.getDoubleLinkAccess().getTargetNUMDOUBLETerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDoubleLinkRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"target",
                      		lv_target_0_0, 
                      		"NUMDOUBLE");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoubleLink"


    // $ANTLR start "entryRuleComplexType"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:941:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:942:2: (iv_ruleComplexType= ruleComplexType EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:943:2: iv_ruleComplexType= ruleComplexType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexTypeRule()); 
            }
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType2312);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType2322); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:950:1: ruleComplexType returns [EObject current=null] : (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        EObject this_Enum_0 = null;

        EObject this_ExtensibleType_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:953:28: ( (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:954:1: (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:954:1: (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            else if ( (LA9_0==21||(LA9_0>=40 && LA9_0<=42)) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:955:5: this_Enum_0= ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexTypeAccess().getEnumParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnum_in_ruleComplexType2369);
                    this_Enum_0=ruleEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Enum_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:965:5: this_ExtensibleType_1= ruleExtensibleType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexTypeAccess().getExtensibleTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtensibleType_in_ruleComplexType2396);
                    this_ExtensibleType_1=ruleExtensibleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExtensibleType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleExtensibleType"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:981:1: entryRuleExtensibleType returns [EObject current=null] : iv_ruleExtensibleType= ruleExtensibleType EOF ;
    public final EObject entryRuleExtensibleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensibleType = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:982:2: (iv_ruleExtensibleType= ruleExtensibleType EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:983:2: iv_ruleExtensibleType= ruleExtensibleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtensibleTypeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType2431);
            iv_ruleExtensibleType=ruleExtensibleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtensibleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensibleType2441); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtensibleType"


    // $ANTLR start "ruleExtensibleType"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:990:1: ruleExtensibleType returns [EObject current=null] : (this_Message_0= ruleMessage | this_Group_1= ruleGroup ) ;
    public final EObject ruleExtensibleType() throws RecognitionException {
        EObject current = null;

        EObject this_Message_0 = null;

        EObject this_Group_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:993:28: ( (this_Message_0= ruleMessage | this_Group_1= ruleGroup ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:994:1: (this_Message_0= ruleMessage | this_Group_1= ruleGroup )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:994:1: (this_Message_0= ruleMessage | this_Group_1= ruleGroup )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=40 && LA10_0<=42)) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:995:5: this_Message_0= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensibleTypeAccess().getMessageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleExtensibleType2488);
                    this_Message_0=ruleMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Message_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1005:5: this_Group_1= ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensibleTypeAccess().getGroupParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroup_in_ruleExtensibleType2515);
                    this_Group_1=ruleGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Group_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtensibleType"


    // $ANTLR start "entryRuleMessage"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1021:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1022:2: (iv_ruleMessage= ruleMessage EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1023:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage2550);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage2560); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1030:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1033:28: ( (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1034:1: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1034:1: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1034:3: otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleMessage2597); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1038:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1039:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1039:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1040:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage2614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleMessage2631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1060:1: ( (lv_elements_3_0= ruleMessageElement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=20 && LA11_0<=21)||LA11_0==24||(LA11_0>=32 && LA11_0<=33)||LA11_0==38||(LA11_0>=40 && LA11_0<=42)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1061:1: (lv_elements_3_0= ruleMessageElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1061:1: (lv_elements_3_0= ruleMessageElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1062:3: lv_elements_3_0= ruleMessageElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMessageAccess().getElementsMessageElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMessageElement_in_ruleMessage2652);
            	    lv_elements_3_0=ruleMessageElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMessageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"MessageElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleMessage2665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMessageElement"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1090:1: entryRuleMessageElement returns [EObject current=null] : iv_ruleMessageElement= ruleMessageElement EOF ;
    public final EObject entryRuleMessageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1091:2: (iv_ruleMessageElement= ruleMessageElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1092:2: iv_ruleMessageElement= ruleMessageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageElementRule()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_entryRuleMessageElement2701);
            iv_ruleMessageElement=ruleMessageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageElement2711); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageElement"


    // $ANTLR start "ruleMessageElement"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1099:1: ruleMessageElement returns [EObject current=null] : (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Enum_2= ruleEnum | this_Service_3= ruleService | ( ( 'extend' )=>this_Extend_4= ruleExtend ) | this_ExtensionRange_5= ruleExtensionRange | this_Option_6= ruleOption ) ;
    public final EObject ruleMessageElement() throws RecognitionException {
        EObject current = null;

        EObject this_Message_0 = null;

        EObject this_IndexedElement_1 = null;

        EObject this_Enum_2 = null;

        EObject this_Service_3 = null;

        EObject this_Extend_4 = null;

        EObject this_ExtensionRange_5 = null;

        EObject this_Option_6 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1102:28: ( (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Enum_2= ruleEnum | this_Service_3= ruleService | ( ( 'extend' )=>this_Extend_4= ruleExtend ) | this_ExtensionRange_5= ruleExtensionRange | this_Option_6= ruleOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1103:1: (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Enum_2= ruleEnum | this_Service_3= ruleService | ( ( 'extend' )=>this_Extend_4= ruleExtend ) | this_ExtensionRange_5= ruleExtensionRange | this_Option_6= ruleOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1103:1: (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Enum_2= ruleEnum | this_Service_3= ruleService | ( ( 'extend' )=>this_Extend_4= ruleExtend ) | this_ExtensionRange_5= ruleExtensionRange | this_Option_6= ruleOption )
            int alt12=7;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=40 && LA12_0<=42)) ) {
                alt12=2;
            }
            else if ( (LA12_0==32) ) {
                alt12=3;
            }
            else if ( (LA12_0==33) ) {
                alt12=4;
            }
            else if ( (LA12_0==38) && (synpred3_InternalProtobuf())) {
                alt12=5;
            }
            else if ( (LA12_0==24) ) {
                alt12=6;
            }
            else if ( (LA12_0==20) ) {
                alt12=7;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1104:5: this_Message_0= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getMessageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleMessageElement2758);
                    this_Message_0=ruleMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Message_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1114:5: this_IndexedElement_1= ruleIndexedElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getIndexedElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIndexedElement_in_ruleMessageElement2785);
                    this_IndexedElement_1=ruleIndexedElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IndexedElement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1124:5: this_Enum_2= ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getEnumParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnum_in_ruleMessageElement2812);
                    this_Enum_2=ruleEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Enum_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1134:5: this_Service_3= ruleService
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getServiceParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleService_in_ruleMessageElement2839);
                    this_Service_3=ruleService();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Service_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1143:6: ( ( 'extend' )=>this_Extend_4= ruleExtend )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1143:6: ( ( 'extend' )=>this_Extend_4= ruleExtend )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1143:7: ( 'extend' )=>this_Extend_4= ruleExtend
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getExtendParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtend_in_ruleMessageElement2874);
                    this_Extend_4=ruleExtend();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Extend_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1155:5: this_ExtensionRange_5= ruleExtensionRange
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getExtensionRangeParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtensionRange_in_ruleMessageElement2902);
                    this_ExtensionRange_5=ruleExtensionRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExtensionRange_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1165:5: this_Option_6= ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getOptionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOption_in_ruleMessageElement2929);
                    this_Option_6=ruleOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Option_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageElement"


    // $ANTLR start "entryRuleIndexedElement"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1181:1: entryRuleIndexedElement returns [EObject current=null] : iv_ruleIndexedElement= ruleIndexedElement EOF ;
    public final EObject entryRuleIndexedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1182:2: (iv_ruleIndexedElement= ruleIndexedElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1183:2: iv_ruleIndexedElement= ruleIndexedElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedElementRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement2964);
            iv_ruleIndexedElement=ruleIndexedElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedElement2974); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndexedElement"


    // $ANTLR start "ruleIndexedElement"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1190:1: ruleIndexedElement returns [EObject current=null] : (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup ) ;
    public final EObject ruleIndexedElement() throws RecognitionException {
        EObject current = null;

        EObject this_MessageField_0 = null;

        EObject this_Group_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1193:28: ( (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1194:1: (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1194:1: (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1195:5: this_MessageField_0= ruleMessageField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIndexedElementAccess().getMessageFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessageField_in_ruleIndexedElement3021);
                    this_MessageField_0=ruleMessageField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MessageField_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1205:5: this_Group_1= ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIndexedElementAccess().getGroupParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroup_in_ruleIndexedElement3048);
                    this_Group_1=ruleGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Group_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndexedElement"


    // $ANTLR start "entryRuleExtensionRange"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1221:1: entryRuleExtensionRange returns [EObject current=null] : iv_ruleExtensionRange= ruleExtensionRange EOF ;
    public final EObject entryRuleExtensionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionRange = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1222:2: (iv_ruleExtensionRange= ruleExtensionRange EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1223:2: iv_ruleExtensionRange= ruleExtensionRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtensionRangeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange3083);
            iv_ruleExtensionRange=ruleExtensionRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtensionRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionRange3093); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtensionRange"


    // $ANTLR start "ruleExtensionRange"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1230:1: ruleExtensionRange returns [EObject current=null] : (otherlv_0= 'extensions' ( (lv_ranges_1_0= ruleRange ) ) (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleExtensionRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ranges_1_0 = null;

        EObject lv_ranges_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1233:28: ( (otherlv_0= 'extensions' ( (lv_ranges_1_0= ruleRange ) ) (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )* otherlv_4= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1234:1: (otherlv_0= 'extensions' ( (lv_ranges_1_0= ruleRange ) ) (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )* otherlv_4= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1234:1: (otherlv_0= 'extensions' ( (lv_ranges_1_0= ruleRange ) ) (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )* otherlv_4= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1234:3: otherlv_0= 'extensions' ( (lv_ranges_1_0= ruleRange ) ) (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleExtensionRange3130); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExtensionRangeAccess().getExtensionsKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1238:1: ( (lv_ranges_1_0= ruleRange ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1239:1: (lv_ranges_1_0= ruleRange )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1239:1: (lv_ranges_1_0= ruleRange )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1240:3: lv_ranges_1_0= ruleRange
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExtensionRangeAccess().getRangesRangeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRange_in_ruleExtensionRange3151);
            lv_ranges_1_0=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExtensionRangeRule());
              	        }
                     		add(
                     			current, 
                     			"ranges",
                      		lv_ranges_1_0, 
                      		"Range");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1256:2: (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1256:4: otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleExtensionRange3164); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getExtensionRangeAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1260:1: ( (lv_ranges_3_0= ruleRange ) )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1261:1: (lv_ranges_3_0= ruleRange )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1261:1: (lv_ranges_3_0= ruleRange )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1262:3: lv_ranges_3_0= ruleRange
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExtensionRangeAccess().getRangesRangeParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRange_in_ruleExtensionRange3185);
            	    lv_ranges_3_0=ruleRange();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExtensionRangeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ranges",
            	              		lv_ranges_3_0, 
            	              		"Range");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleExtensionRange3199); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getExtensionRangeAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtensionRange"


    // $ANTLR start "entryRuleRange"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1290:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1291:2: (iv_ruleRange= ruleRange EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1292:2: iv_ruleRange= ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange3235);
            iv_ruleRange=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange3245); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1299:1: ruleRange returns [EObject current=null] : ( ( (lv_from_0_0= RULE_NUMINT ) ) (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )? ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token lv_from_0_0=null;
        Token otherlv_1=null;
        Token lv_to_2_0=null;
        Token lv_max_3_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1302:28: ( ( ( (lv_from_0_0= RULE_NUMINT ) ) (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )? ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1303:1: ( ( (lv_from_0_0= RULE_NUMINT ) ) (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )? )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1303:1: ( ( (lv_from_0_0= RULE_NUMINT ) ) (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )? )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1303:2: ( (lv_from_0_0= RULE_NUMINT ) ) (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )?
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1303:2: ( (lv_from_0_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1304:1: (lv_from_0_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1304:1: (lv_from_0_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1305:3: lv_from_0_0= RULE_NUMINT
            {
            lv_from_0_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleRange3287); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_from_0_0, grammarAccess.getRangeAccess().getFromNUMINTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRangeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"from",
                      		lv_from_0_0, 
                      		"NUMINT");
              	    
            }

            }


            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1321:2: (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1321:4: otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleRange3305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getRangeAccess().getToKeyword_1_0());
                          
                    }
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1325:1: ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_NUMINT) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==27) ) {
                        alt15=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1325:2: ( (lv_to_2_0= RULE_NUMINT ) )
                            {
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1325:2: ( (lv_to_2_0= RULE_NUMINT ) )
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1326:1: (lv_to_2_0= RULE_NUMINT )
                            {
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1326:1: (lv_to_2_0= RULE_NUMINT )
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1327:3: lv_to_2_0= RULE_NUMINT
                            {
                            lv_to_2_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleRange3323); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_to_2_0, grammarAccess.getRangeAccess().getToNUMINTTerminalRuleCall_1_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRangeRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"to",
                                      		lv_to_2_0, 
                                      		"NUMINT");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1344:6: ( (lv_max_3_0= 'max' ) )
                            {
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1344:6: ( (lv_max_3_0= 'max' ) )
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1345:1: (lv_max_3_0= 'max' )
                            {
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1345:1: (lv_max_3_0= 'max' )
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1346:3: lv_max_3_0= 'max'
                            {
                            lv_max_3_0=(Token)match(input,27,FOLLOW_27_in_ruleRange3352); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_max_3_0, grammarAccess.getRangeAccess().getMaxMaxKeyword_1_1_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRangeRule());
                              	        }
                                     		setWithLastConsumed(current, "max", true, "max");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleMessageField"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1367:1: entryRuleMessageField returns [EObject current=null] : iv_ruleMessageField= ruleMessageField EOF ;
    public final EObject entryRuleMessageField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageField = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1368:2: (iv_ruleMessageField= ruleMessageField EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1369:2: iv_ruleMessageField= ruleMessageField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageFieldRule()); 
            }
            pushFollow(FOLLOW_ruleMessageField_in_entryRuleMessageField3404);
            iv_ruleMessageField=ruleMessageField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageField3414); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageField"


    // $ANTLR start "ruleMessageField"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1376:1: ruleMessageField returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' ) ;
    public final EObject ruleMessageField() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_index_4_0=null;
        Token otherlv_6=null;
        Enumerator lv_modifier_0_0 = null;

        EObject lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_options_5_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1379:28: ( ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1380:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1380:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1380:2: ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1380:2: ( (lv_modifier_0_0= ruleModifier ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1381:1: (lv_modifier_0_0= ruleModifier )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1381:1: (lv_modifier_0_0= ruleModifier )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1382:3: lv_modifier_0_0= ruleModifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageFieldAccess().getModifierModifierEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleModifier_in_ruleMessageField3460);
            lv_modifier_0_0=ruleModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMessageFieldRule());
              	        }
                     		set(
                     			current, 
                     			"modifier",
                      		lv_modifier_0_0, 
                      		"Modifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1398:2: ( (lv_type_1_0= ruleTypeLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1399:1: (lv_type_1_0= ruleTypeLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1399:1: (lv_type_1_0= ruleTypeLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1400:3: lv_type_1_0= ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageFieldAccess().getTypeTypeLinkParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeLink_in_ruleMessageField3481);
            lv_type_1_0=ruleTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMessageFieldRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"TypeLink");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1416:2: ( (lv_name_2_0= ruleVar ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1417:1: (lv_name_2_0= ruleVar )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1417:1: (lv_name_2_0= ruleVar )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1418:3: lv_name_2_0= ruleVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageFieldAccess().getNameVarParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_in_ruleMessageField3502);
            lv_name_2_0=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMessageFieldRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"Var");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleMessageField3514); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMessageFieldAccess().getEqualsSignKeyword_3());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1438:1: ( (lv_index_4_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1439:1: (lv_index_4_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1439:1: (lv_index_4_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1440:3: lv_index_4_0= RULE_NUMINT
            {
            lv_index_4_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleMessageField3531); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_index_4_0, grammarAccess.getMessageFieldAccess().getIndexNUMINTTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMessageFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"index",
                      		lv_index_4_0, 
                      		"NUMINT");
              	    
            }

            }


            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1456:2: ( (lv_options_5_0= ruleFieldOptions ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1457:1: (lv_options_5_0= ruleFieldOptions )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1457:1: (lv_options_5_0= ruleFieldOptions )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1458:3: lv_options_5_0= ruleFieldOptions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMessageFieldAccess().getOptionsFieldOptionsParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldOptions_in_ruleMessageField3557);
                    lv_options_5_0=ruleFieldOptions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMessageFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"options",
                              		lv_options_5_0, 
                              		"FieldOptions");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleMessageField3570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMessageFieldAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageField"


    // $ANTLR start "entryRuleGroup"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1486:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1487:2: (iv_ruleGroup= ruleGroup EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1488:2: iv_ruleGroup= ruleGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupRule()); 
            }
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup3606);
            iv_ruleGroup=ruleGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup3616); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1495:1: ruleGroup returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_index_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_modifier_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elements_6_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1498:28: ( ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1499:1: ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1499:1: ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1499:2: ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1499:2: ( (lv_modifier_0_0= ruleModifier ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1500:1: (lv_modifier_0_0= ruleModifier )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1500:1: (lv_modifier_0_0= ruleModifier )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1501:3: lv_modifier_0_0= ruleModifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupAccess().getModifierModifierEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleModifier_in_ruleGroup3662);
            lv_modifier_0_0=ruleModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGroupRule());
              	        }
                     		set(
                     			current, 
                     			"modifier",
                      		lv_modifier_0_0, 
                      		"Modifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleGroup3674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getGroupKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1521:1: ( (lv_name_2_0= ruleVar ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1522:1: (lv_name_2_0= ruleVar )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1522:1: (lv_name_2_0= ruleVar )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1523:3: lv_name_2_0= ruleVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupAccess().getNameVarParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_in_ruleGroup3695);
            lv_name_2_0=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGroupRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"Var");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleGroup3707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getEqualsSignKeyword_3());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1543:1: ( (lv_index_4_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1544:1: (lv_index_4_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1544:1: (lv_index_4_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1545:3: lv_index_4_0= RULE_NUMINT
            {
            lv_index_4_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleGroup3724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_index_4_0, grammarAccess.getGroupAccess().getIndexNUMINTTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGroupRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"index",
                      		lv_index_4_0, 
                      		"NUMINT");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleGroup3741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1565:1: ( (lv_elements_6_0= ruleMessageField ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=40 && LA18_0<=42)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1566:1: (lv_elements_6_0= ruleMessageField )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1566:1: (lv_elements_6_0= ruleMessageField )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1567:3: lv_elements_6_0= ruleMessageField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupAccess().getElementsMessageFieldParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMessageField_in_ruleGroup3762);
            	    lv_elements_6_0=ruleMessageField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_6_0, 
            	              		"MessageField");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleGroup3775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleTypeLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1595:1: entryRuleTypeLink returns [EObject current=null] : iv_ruleTypeLink= ruleTypeLink EOF ;
    public final EObject entryRuleTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1596:2: (iv_ruleTypeLink= ruleTypeLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1597:2: iv_ruleTypeLink= ruleTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_entryRuleTypeLink3811);
            iv_ruleTypeLink=ruleTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLink3821); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLink"


    // $ANTLR start "ruleTypeLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1604:1: ruleTypeLink returns [EObject current=null] : ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink ) ;
    public final EObject ruleTypeLink() throws RecognitionException {
        EObject current = null;

        EObject this_ScalarTypeLink_0 = null;

        EObject this_ComplexTypeLink_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1607:28: ( ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1608:1: ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1608:1: ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1608:2: ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1608:2: ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1608:3: ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLinkAccess().getScalarTypeLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleScalarTypeLink_in_ruleTypeLink3874);
                    this_ScalarTypeLink_0=ruleScalarTypeLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ScalarTypeLink_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1619:5: this_ComplexTypeLink_1= ruleComplexTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLinkAccess().getComplexTypeLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComplexTypeLink_in_ruleTypeLink3902);
                    this_ComplexTypeLink_1=ruleComplexTypeLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ComplexTypeLink_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLink"


    // $ANTLR start "entryRuleComplexTypeLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1635:1: entryRuleComplexTypeLink returns [EObject current=null] : iv_ruleComplexTypeLink= ruleComplexTypeLink EOF ;
    public final EObject entryRuleComplexTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTypeLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1636:2: (iv_ruleComplexTypeLink= ruleComplexTypeLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1637:2: iv_ruleComplexTypeLink= ruleComplexTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink3937);
            iv_ruleComplexTypeLink=ruleComplexTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLink3947); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexTypeLink"


    // $ANTLR start "ruleComplexTypeLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1644:1: ruleComplexTypeLink returns [EObject current=null] : ( ( ruleVar_full ) ) ;
    public final EObject ruleComplexTypeLink() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1647:28: ( ( ( ruleVar_full ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1648:1: ( ( ruleVar_full ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1648:1: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1649:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1649:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1650:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComplexTypeLinkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleComplexTypeLink3994);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexTypeLink"


    // $ANTLR start "entryRuleScalarTypeLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1671:1: entryRuleScalarTypeLink returns [EObject current=null] : iv_ruleScalarTypeLink= ruleScalarTypeLink EOF ;
    public final EObject entryRuleScalarTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarTypeLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1672:2: (iv_ruleScalarTypeLink= ruleScalarTypeLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1673:2: iv_ruleScalarTypeLink= ruleScalarTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScalarTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink4029);
            iv_ruleScalarTypeLink=ruleScalarTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScalarTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarTypeLink4039); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarTypeLink"


    // $ANTLR start "ruleScalarTypeLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1680:1: ruleScalarTypeLink returns [EObject current=null] : ( (lv_target_0_0= ruleScalarType ) ) ;
    public final EObject ruleScalarTypeLink() throws RecognitionException {
        EObject current = null;

        Enumerator lv_target_0_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1683:28: ( ( (lv_target_0_0= ruleScalarType ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1684:1: ( (lv_target_0_0= ruleScalarType ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1684:1: ( (lv_target_0_0= ruleScalarType ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1685:1: (lv_target_0_0= ruleScalarType )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1685:1: (lv_target_0_0= ruleScalarType )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1686:3: lv_target_0_0= ruleScalarType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScalarTypeLinkAccess().getTargetScalarTypeEnumRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleScalarType_in_ruleScalarTypeLink4084);
            lv_target_0_0=ruleScalarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScalarTypeLinkRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_0_0, 
                      		"ScalarType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarTypeLink"


    // $ANTLR start "entryRuleFieldOptions"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1710:1: entryRuleFieldOptions returns [EObject current=null] : iv_ruleFieldOptions= ruleFieldOptions EOF ;
    public final EObject entryRuleFieldOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOptions = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1711:2: (iv_ruleFieldOptions= ruleFieldOptions EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1712:2: iv_ruleFieldOptions= ruleFieldOptions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldOptionsRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions4119);
            iv_ruleFieldOptions=ruleFieldOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldOptions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOptions4129); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldOptions"


    // $ANTLR start "ruleFieldOptions"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1719:1: ruleFieldOptions returns [EObject current=null] : (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleFieldOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_options_1_0 = null;

        EObject lv_options_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1722:28: ( (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1723:1: (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1723:1: (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1723:3: otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleFieldOptions4166); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFieldOptionsAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1727:1: ( (lv_options_1_0= ruleFieldOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1728:1: (lv_options_1_0= ruleFieldOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1728:1: (lv_options_1_0= ruleFieldOption )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1729:3: lv_options_1_0= ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFieldOption_in_ruleFieldOptions4187);
            lv_options_1_0=ruleFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldOptionsRule());
              	        }
                     		add(
                     			current, 
                     			"options",
                      		lv_options_1_0, 
                      		"FieldOption");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1745:2: (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==25) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1745:4: otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleFieldOptions4200); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFieldOptionsAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1749:1: ( (lv_options_3_0= ruleFieldOption ) )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1750:1: (lv_options_3_0= ruleFieldOption )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1750:1: (lv_options_3_0= ruleFieldOption )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1751:3: lv_options_3_0= ruleFieldOption
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFieldOption_in_ruleFieldOptions4221);
            	    lv_options_3_0=ruleFieldOption();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFieldOptionsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"options",
            	              		lv_options_3_0, 
            	              		"FieldOption");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleFieldOptions4235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFieldOptionsAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldOptions"


    // $ANTLR start "entryRuleFieldOption"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1779:1: entryRuleFieldOption returns [EObject current=null] : iv_ruleFieldOption= ruleFieldOption EOF ;
    public final EObject entryRuleFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1780:2: (iv_ruleFieldOption= ruleFieldOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1781:2: iv_ruleFieldOption= ruleFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_entryRuleFieldOption4271);
            iv_ruleFieldOption=ruleFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOption4281); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldOption"


    // $ANTLR start "ruleFieldOption"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1788:1: ruleFieldOption returns [EObject current=null] : ( ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption ) | this_NativeFieldOption_1= ruleNativeFieldOption ) ;
    public final EObject ruleFieldOption() throws RecognitionException {
        EObject current = null;

        EObject this_DefaultValueFieldOption_0 = null;

        EObject this_NativeFieldOption_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1791:28: ( ( ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption ) | this_NativeFieldOption_1= ruleNativeFieldOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1792:1: ( ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption ) | this_NativeFieldOption_1= ruleNativeFieldOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1792:1: ( ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption ) | this_NativeFieldOption_1= ruleNativeFieldOption )
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1792:2: ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1792:2: ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1792:3: ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldOptionAccess().getDefaultValueFieldOptionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_ruleFieldOption4336);
                    this_DefaultValueFieldOption_0=ruleDefaultValueFieldOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DefaultValueFieldOption_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1804:5: this_NativeFieldOption_1= ruleNativeFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldOptionAccess().getNativeFieldOptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNativeFieldOption_in_ruleFieldOption4364);
                    this_NativeFieldOption_1=ruleNativeFieldOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NativeFieldOption_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldOption"


    // $ANTLR start "entryRuleDefaultValueFieldOption"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1820:1: entryRuleDefaultValueFieldOption returns [EObject current=null] : iv_ruleDefaultValueFieldOption= ruleDefaultValueFieldOption EOF ;
    public final EObject entryRuleDefaultValueFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValueFieldOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1821:2: (iv_ruleDefaultValueFieldOption= ruleDefaultValueFieldOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1822:2: iv_ruleDefaultValueFieldOption= ruleDefaultValueFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultValueFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption4399);
            iv_ruleDefaultValueFieldOption=ruleDefaultValueFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultValueFieldOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValueFieldOption4409); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultValueFieldOption"


    // $ANTLR start "ruleDefaultValueFieldOption"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1829:1: ruleDefaultValueFieldOption returns [EObject current=null] : ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleDefaultValueFieldOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1832:28: ( ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1833:1: ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1833:1: ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1833:2: ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1833:2: ( ( 'default' )=>otherlv_0= 'default' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1833:3: ( 'default' )=>otherlv_0= 'default'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleDefaultValueFieldOption4454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDefaultValueFieldOptionAccess().getDefaultKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDefaultValueFieldOption4467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefaultValueFieldOptionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1842:1: ( (lv_value_2_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1843:1: (lv_value_2_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1843:1: (lv_value_2_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1844:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefaultValueFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleDefaultValueFieldOption4488);
            lv_value_2_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefaultValueFieldOptionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultValueFieldOption"


    // $ANTLR start "entryRuleNativeFieldOption"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1868:1: entryRuleNativeFieldOption returns [EObject current=null] : iv_ruleNativeFieldOption= ruleNativeFieldOption EOF ;
    public final EObject entryRuleNativeFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeFieldOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1869:2: (iv_ruleNativeFieldOption= ruleNativeFieldOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1870:2: iv_ruleNativeFieldOption= ruleNativeFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNativeFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption4524);
            iv_ruleNativeFieldOption=ruleNativeFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNativeFieldOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeFieldOption4534); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNativeFieldOption"


    // $ANTLR start "ruleNativeFieldOption"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1877:1: ruleNativeFieldOption returns [EObject current=null] : ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleNativeFieldOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_source_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1880:28: ( ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1881:1: ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1881:1: ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1881:2: ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1881:2: ( (lv_source_0_0= ruleOptionSource ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1882:1: (lv_source_0_0= ruleOptionSource )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1882:1: (lv_source_0_0= ruleOptionSource )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1883:3: lv_source_0_0= ruleOptionSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNativeFieldOptionAccess().getSourceOptionSourceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOptionSource_in_ruleNativeFieldOption4580);
            lv_source_0_0=ruleOptionSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNativeFieldOptionRule());
              	        }
                     		set(
                     			current, 
                     			"source",
                      		lv_source_0_0, 
                      		"OptionSource");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleNativeFieldOption4592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNativeFieldOptionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1903:1: ( (lv_value_2_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1904:1: (lv_value_2_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1904:1: (lv_value_2_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1905:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNativeFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleNativeFieldOption4613);
            lv_value_2_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNativeFieldOptionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNativeFieldOption"


    // $ANTLR start "entryRuleOptionSource"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1929:1: entryRuleOptionSource returns [EObject current=null] : iv_ruleOptionSource= ruleOptionSource EOF ;
    public final EObject entryRuleOptionSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionSource = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1930:2: (iv_ruleOptionSource= ruleOptionSource EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1931:2: iv_ruleOptionSource= ruleOptionSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionSourceRule()); 
            }
            pushFollow(FOLLOW_ruleOptionSource_in_entryRuleOptionSource4649);
            iv_ruleOptionSource=ruleOptionSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionSource4659); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionSource"


    // $ANTLR start "ruleOptionSource"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1938:1: ruleOptionSource returns [EObject current=null] : ( ( ruleVar_full ) ) ;
    public final EObject ruleOptionSource() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1941:28: ( ( ( ruleVar_full ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1942:1: ( ( ruleVar_full ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1942:1: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1943:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1943:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1944:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOptionSourceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionSourceAccess().getTargetIndexedElementCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleOptionSource4706);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionSource"


    // $ANTLR start "entryRuleEnum"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1965:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1966:2: (iv_ruleEnum= ruleEnum EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1967:2: iv_ruleEnum= ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum4741);
            iv_ruleEnum=ruleEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum4751); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1974:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1977:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1978:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1978:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1978:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleEnum4788); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1982:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1983:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1983:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1984:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum4805); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleEnum4822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2004:1: ( (lv_elements_3_0= ruleEnumElement ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2005:1: (lv_elements_3_0= ruleEnumElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2005:1: (lv_elements_3_0= ruleEnumElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2006:3: lv_elements_3_0= ruleEnumElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumElement_in_ruleEnum4843);
            	    lv_elements_3_0=ruleEnumElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"EnumElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleEnum4856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumElement"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2034:1: entryRuleEnumElement returns [EObject current=null] : iv_ruleEnumElement= ruleEnumElement EOF ;
    public final EObject entryRuleEnumElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2035:2: (iv_ruleEnumElement= ruleEnumElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2036:2: iv_ruleEnumElement= ruleEnumElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumElementRule()); 
            }
            pushFollow(FOLLOW_ruleEnumElement_in_entryRuleEnumElement4892);
            iv_ruleEnumElement=ruleEnumElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumElement4902); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumElement"


    // $ANTLR start "ruleEnumElement"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2043:1: ruleEnumElement returns [EObject current=null] : (this_EnumField_0= ruleEnumField | this_CustomOption_1= ruleCustomOption ) ;
    public final EObject ruleEnumElement() throws RecognitionException {
        EObject current = null;

        EObject this_EnumField_0 = null;

        EObject this_CustomOption_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2046:28: ( (this_EnumField_0= ruleEnumField | this_CustomOption_1= ruleCustomOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2047:1: (this_EnumField_0= ruleEnumField | this_CustomOption_1= ruleCustomOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2047:1: (this_EnumField_0= ruleEnumField | this_CustomOption_1= ruleCustomOption )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==20) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2048:5: this_EnumField_0= ruleEnumField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumElementAccess().getEnumFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumField_in_ruleEnumElement4949);
                    this_EnumField_0=ruleEnumField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumField_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2058:5: this_CustomOption_1= ruleCustomOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumElementAccess().getCustomOptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCustomOption_in_ruleEnumElement4976);
                    this_CustomOption_1=ruleCustomOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CustomOption_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumElement"


    // $ANTLR start "entryRuleEnumField"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2074:1: entryRuleEnumField returns [EObject current=null] : iv_ruleEnumField= ruleEnumField EOF ;
    public final EObject entryRuleEnumField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumField = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2075:2: (iv_ruleEnumField= ruleEnumField EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2076:2: iv_ruleEnumField= ruleEnumField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumFieldRule()); 
            }
            pushFollow(FOLLOW_ruleEnumField_in_entryRuleEnumField5011);
            iv_ruleEnumField=ruleEnumField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumField5021); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumField"


    // $ANTLR start "ruleEnumField"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2083:1: ruleEnumField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' ) ;
    public final EObject ruleEnumField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_options_4_0 = null;

        EObject lv_options_6_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2086:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2087:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2087:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2087:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2087:2: ( (lv_name_0_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2088:1: (lv_name_0_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2088:1: (lv_name_0_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2089:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumField5063); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getEnumFieldAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleEnumField5080); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumFieldAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2109:1: ( (lv_index_2_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2110:1: (lv_index_2_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2110:1: (lv_index_2_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2111:3: lv_index_2_0= RULE_NUMINT
            {
            lv_index_2_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleEnumField5097); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_index_2_0, grammarAccess.getEnumFieldAccess().getIndexNUMINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"index",
                      		lv_index_2_0, 
                      		"NUMINT");
              	    
            }

            }


            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2127:2: (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2127:4: otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleEnumField5115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEnumFieldAccess().getLeftSquareBracketKeyword_3_0());
                          
                    }
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2131:1: ( (lv_options_4_0= ruleFieldOption ) )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2132:1: (lv_options_4_0= ruleFieldOption )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2132:1: (lv_options_4_0= ruleFieldOption )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2133:3: lv_options_4_0= ruleFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldOption_in_ruleEnumField5136);
                    lv_options_4_0=ruleFieldOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnumFieldRule());
                      	        }
                             		add(
                             			current, 
                             			"options",
                              		lv_options_4_0, 
                              		"FieldOption");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2149:2: (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==25) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2149:4: otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) )
                    	    {
                    	    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleEnumField5149); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEnumFieldAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2153:1: ( (lv_options_6_0= ruleFieldOption ) )
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2154:1: (lv_options_6_0= ruleFieldOption )
                    	    {
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2154:1: (lv_options_6_0= ruleFieldOption )
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2155:3: lv_options_6_0= ruleFieldOption
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFieldOption_in_ruleEnumField5170);
                    	    lv_options_6_0=ruleFieldOption();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEnumFieldRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"options",
                    	              		lv_options_6_0, 
                    	              		"FieldOption");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleEnumField5184); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEnumFieldAccess().getRightSquareBracketKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleEnumField5198); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getEnumFieldAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumField"


    // $ANTLR start "entryRuleService"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2187:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2188:2: (iv_ruleService= ruleService EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2189:2: iv_ruleService= ruleService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService5234);
            iv_ruleService=ruleService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleService; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService5244); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2196:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )+ otherlv_4= '}' (otherlv_5= ';' )? ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2199:28: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )+ otherlv_4= '}' (otherlv_5= ';' )? ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2200:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )+ otherlv_4= '}' (otherlv_5= ';' )? )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2200:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )+ otherlv_4= '}' (otherlv_5= ';' )? )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2200:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )+ otherlv_4= '}' (otherlv_5= ';' )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleService5281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2204:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2205:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2205:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2206:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService5298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getServiceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleService5315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2226:1: ( (lv_elements_3_0= ruleServiceElement ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==20||LA26_0==34) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2227:1: (lv_elements_3_0= ruleServiceElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2227:1: (lv_elements_3_0= ruleServiceElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2228:3: lv_elements_3_0= ruleServiceElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceAccess().getElementsServiceElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleServiceElement_in_ruleService5336);
            	    lv_elements_3_0=ruleServiceElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"ServiceElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleService5349); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2248:1: (otherlv_5= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==15) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2248:3: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleService5362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getSemicolonKeyword_5());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleServiceElement"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2260:1: entryRuleServiceElement returns [EObject current=null] : iv_ruleServiceElement= ruleServiceElement EOF ;
    public final EObject entryRuleServiceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2261:2: (iv_ruleServiceElement= ruleServiceElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2262:2: iv_ruleServiceElement= ruleServiceElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceElementRule()); 
            }
            pushFollow(FOLLOW_ruleServiceElement_in_entryRuleServiceElement5400);
            iv_ruleServiceElement=ruleServiceElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleServiceElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceElement5410); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceElement"


    // $ANTLR start "ruleServiceElement"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2269:1: ruleServiceElement returns [EObject current=null] : (this_Rpc_0= ruleRpc | this_Option_1= ruleOption ) ;
    public final EObject ruleServiceElement() throws RecognitionException {
        EObject current = null;

        EObject this_Rpc_0 = null;

        EObject this_Option_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2272:28: ( (this_Rpc_0= ruleRpc | this_Option_1= ruleOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2273:1: (this_Rpc_0= ruleRpc | this_Option_1= ruleOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2273:1: (this_Rpc_0= ruleRpc | this_Option_1= ruleOption )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            else if ( (LA28_0==20) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2274:5: this_Rpc_0= ruleRpc
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getServiceElementAccess().getRpcParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRpc_in_ruleServiceElement5457);
                    this_Rpc_0=ruleRpc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Rpc_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2284:5: this_Option_1= ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getServiceElementAccess().getOptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOption_in_ruleServiceElement5484);
                    this_Option_1=ruleOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Option_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceElement"


    // $ANTLR start "entryRuleRpc"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2300:1: entryRuleRpc returns [EObject current=null] : iv_ruleRpc= ruleRpc EOF ;
    public final EObject entryRuleRpc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRpc = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2301:2: (iv_ruleRpc= ruleRpc EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2302:2: iv_ruleRpc= ruleRpc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRpcRule()); 
            }
            pushFollow(FOLLOW_ruleRpc_in_entryRuleRpc5519);
            iv_ruleRpc=ruleRpc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRpc; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRpc5529); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRpc"


    // $ANTLR start "ruleRpc"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2309:1: ruleRpc returns [EObject current=null] : (otherlv_0= 'rpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? otherlv_12= ';' ) ;
    public final EObject ruleRpc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_argType_3_0 = null;

        EObject lv_returnType_7_0 = null;

        EObject lv_options_10_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2312:28: ( (otherlv_0= 'rpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? otherlv_12= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2313:1: (otherlv_0= 'rpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? otherlv_12= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2313:1: (otherlv_0= 'rpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? otherlv_12= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2313:3: otherlv_0= 'rpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleRpc5566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRpcAccess().getRpcKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2317:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2318:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2318:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2319:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRpc5583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRpcAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRpcRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleRpc5600); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRpcAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2339:1: ( (lv_argType_3_0= ruleMessageLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2340:1: (lv_argType_3_0= ruleMessageLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2340:1: (lv_argType_3_0= ruleMessageLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2341:3: lv_argType_3_0= ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRpcAccess().getArgTypeMessageLinkParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMessageLink_in_ruleRpc5621);
            lv_argType_3_0=ruleMessageLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRpcRule());
              	        }
                     		set(
                     			current, 
                     			"argType",
                      		lv_argType_3_0, 
                      		"MessageLink");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleRpc5633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRpcAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleRpc5645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRpcAccess().getReturnsKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleRpc5657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getRpcAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2369:1: ( (lv_returnType_7_0= ruleMessageLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2370:1: (lv_returnType_7_0= ruleMessageLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2370:1: (lv_returnType_7_0= ruleMessageLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2371:3: lv_returnType_7_0= ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRpcAccess().getReturnTypeMessageLinkParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMessageLink_in_ruleRpc5678);
            lv_returnType_7_0=ruleMessageLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRpcRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_7_0, 
                      		"MessageLink");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleRpc5690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRpcAccess().getRightParenthesisKeyword_8());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2391:1: (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2391:3: otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleRpc5703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getRpcAccess().getLeftCurlyBracketKeyword_9_0());
                          
                    }
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2395:1: ( (lv_options_10_0= ruleOption ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==20) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2396:1: (lv_options_10_0= ruleOption )
                    	    {
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2396:1: (lv_options_10_0= ruleOption )
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2397:3: lv_options_10_0= ruleOption
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRpcAccess().getOptionsOptionParserRuleCall_9_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOption_in_ruleRpc5724);
                    	    lv_options_10_0=ruleOption();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRpcRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"options",
                    	              		lv_options_10_0, 
                    	              		"Option");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleRpc5737); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getRpcAccess().getRightCurlyBracketKeyword_9_2());
                          
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleRpc5751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getRpcAccess().getSemicolonKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRpc"


    // $ANTLR start "entryRuleMessageLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2429:1: entryRuleMessageLink returns [EObject current=null] : iv_ruleMessageLink= ruleMessageLink EOF ;
    public final EObject entryRuleMessageLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2430:2: (iv_ruleMessageLink= ruleMessageLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2431:2: iv_ruleMessageLink= ruleMessageLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageLinkRule()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_entryRuleMessageLink5787);
            iv_ruleMessageLink=ruleMessageLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageLink5797); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageLink"


    // $ANTLR start "ruleMessageLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2438:1: ruleMessageLink returns [EObject current=null] : ( ( ruleFULL_ID ) ) ;
    public final EObject ruleMessageLink() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2441:28: ( ( ( ruleFULL_ID ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2442:1: ( ( ruleFULL_ID ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2442:1: ( ( ruleFULL_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2443:1: ( ruleFULL_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2443:1: ( ruleFULL_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2444:3: ruleFULL_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMessageLinkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageLinkAccess().getTargetMessageCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_ruleMessageLink5844);
            ruleFULL_ID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageLink"


    // $ANTLR start "entryRuleExtend"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2465:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2466:2: (iv_ruleExtend= ruleExtend EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2467:2: iv_ruleExtend= ruleExtend EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendRule()); 
            }
            pushFollow(FOLLOW_ruleExtend_in_entryRuleExtend5879);
            iv_ruleExtend=ruleExtend();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtend; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtend5889); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtend"


    // $ANTLR start "ruleExtend"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2474:1: ruleExtend returns [EObject current=null] : ( ( ( 'extend' )=>otherlv_0= 'extend' ) ( ( (otherlv_1= RULE_ID | ruleFULL_ID ) ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2477:28: ( ( ( ( 'extend' )=>otherlv_0= 'extend' ) ( ( (otherlv_1= RULE_ID | ruleFULL_ID ) ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2478:1: ( ( ( 'extend' )=>otherlv_0= 'extend' ) ( ( (otherlv_1= RULE_ID | ruleFULL_ID ) ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2478:1: ( ( ( 'extend' )=>otherlv_0= 'extend' ) ( ( (otherlv_1= RULE_ID | ruleFULL_ID ) ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2478:2: ( ( 'extend' )=>otherlv_0= 'extend' ) ( ( (otherlv_1= RULE_ID | ruleFULL_ID ) ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2478:2: ( ( 'extend' )=>otherlv_0= 'extend' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2478:3: ( 'extend' )=>otherlv_0= 'extend'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleExtend5934); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtendKeyword_0());
                  
            }

            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2483:2: ( ( (otherlv_1= RULE_ID | ruleFULL_ID ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2484:1: ( (otherlv_1= RULE_ID | ruleFULL_ID ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2484:1: ( (otherlv_1= RULE_ID | ruleFULL_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2485:1: (otherlv_1= RULE_ID | ruleFULL_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2485:1: (otherlv_1= RULE_ID | ruleFULL_ID )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==22) ) {
                    alt31=1;
                }
                else if ( (LA31_1==39) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2486:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getExtendRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtend5957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getExtendAccess().getTypeMessageCrossReference_1_0_0()); 
                      	
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2496:8: ruleFULL_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getExtendRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExtendAccess().getTypeMessageCrossReference_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFULL_ID_in_ruleExtend5978);
                    ruleFULL_ID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleExtend5993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2515:1: ( (lv_elements_3_0= ruleMessageElement ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=20 && LA32_0<=21)||LA32_0==24||(LA32_0>=32 && LA32_0<=33)||LA32_0==38||(LA32_0>=40 && LA32_0<=42)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2516:1: (lv_elements_3_0= ruleMessageElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2516:1: (lv_elements_3_0= ruleMessageElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2517:3: lv_elements_3_0= ruleMessageElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExtendAccess().getElementsMessageElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMessageElement_in_ruleExtend6014);
            	    lv_elements_3_0=ruleMessageElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExtendRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"MessageElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleExtend6027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtend"


    // $ANTLR start "entryRuleVar_full"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2545:1: entryRuleVar_full returns [String current=null] : iv_ruleVar_full= ruleVar_full EOF ;
    public final String entryRuleVar_full() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVar_full = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2546:2: (iv_ruleVar_full= ruleVar_full EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2547:2: iv_ruleVar_full= ruleVar_full EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVar_fullRule()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_entryRuleVar_full6064);
            iv_ruleVar_full=ruleVar_full();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar_full.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar_full6075); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar_full"


    // $ANTLR start "ruleVar_full"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2554:1: ruleVar_full returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar ) ;
    public final AntlrDatatypeRuleToken ruleVar_full() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FULL_ID_0 = null;

        AntlrDatatypeRuleToken this_Var_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2557:28: ( (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2558:1: (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2558:1: (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==EOF||LA33_1==RULE_ID||(LA33_1>=13 && LA33_1<=17)||(LA33_1>=20 && LA33_1<=21)||LA33_1==24||(LA33_1>=26 && LA33_1<=28)||(LA33_1>=31 && LA33_1<=34)||(LA33_1>=37 && LA33_1<=38)||(LA33_1>=40 && LA33_1<=58)) ) {
                    alt33=2;
                }
                else if ( (LA33_1==39) ) {
                    alt33=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0==13||(LA33_0>=16 && LA33_0<=17)||(LA33_0>=20 && LA33_0<=21)||LA33_0==24||(LA33_0>=26 && LA33_0<=28)||(LA33_0>=31 && LA33_0<=34)||(LA33_0>=37 && LA33_0<=38)||(LA33_0>=40 && LA33_0<=58)) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2559:5: this_FULL_ID_0= ruleFULL_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVar_fullAccess().getFULL_IDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFULL_ID_in_ruleVar_full6122);
                    this_FULL_ID_0=ruleFULL_ID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FULL_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2571:5: this_Var_1= ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVar_fullAccess().getVarParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVar_in_ruleVar_full6155);
                    this_Var_1=ruleVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Var_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar_full"


    // $ANTLR start "entryRuleVar"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2589:1: entryRuleVar returns [String current=null] : iv_ruleVar= ruleVar EOF ;
    public final String entryRuleVar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVar = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2590:2: (iv_ruleVar= ruleVar EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2591:2: iv_ruleVar= ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar6201);
            iv_ruleVar=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar6212); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2598:1: ruleVar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved ) ;
    public final AntlrDatatypeRuleToken ruleVar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_VarReserved_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2601:28: ( (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2602:1: (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2602:1: (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            else if ( (LA34_0==13||(LA34_0>=16 && LA34_0<=17)||(LA34_0>=20 && LA34_0<=21)||LA34_0==24||(LA34_0>=26 && LA34_0<=28)||(LA34_0>=31 && LA34_0<=34)||(LA34_0>=37 && LA34_0<=38)||(LA34_0>=40 && LA34_0<=58)) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2602:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVar6252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getVarAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2611:5: this_VarReserved_1= ruleVarReserved
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarAccess().getVarReservedParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarReserved_in_ruleVar6285);
                    this_VarReserved_1=ruleVarReserved();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_VarReserved_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleFULL_ID"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2629:1: entryRuleFULL_ID returns [String current=null] : iv_ruleFULL_ID= ruleFULL_ID EOF ;
    public final String entryRuleFULL_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFULL_ID = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2630:2: (iv_ruleFULL_ID= ruleFULL_ID EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2631:2: iv_ruleFULL_ID= ruleFULL_ID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFULL_IDRule()); 
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID6331);
            iv_ruleFULL_ID=ruleFULL_ID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFULL_ID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFULL_ID6342); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFULL_ID"


    // $ANTLR start "ruleFULL_ID"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2638:1: ruleFULL_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleFULL_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2641:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2642:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2642:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2642:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFULL_ID6382); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2649:1: (kw= '.' this_ID_2= RULE_ID )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==39) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2650:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,39,FOLLOW_39_in_ruleFULL_ID6401); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFULL_IDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFULL_ID6416); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFULL_ID"


    // $ANTLR start "entryRuleVarReserved"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2670:1: entryRuleVarReserved returns [String current=null] : iv_ruleVarReserved= ruleVarReserved EOF ;
    public final String entryRuleVarReserved() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarReserved = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2671:2: (iv_ruleVarReserved= ruleVarReserved EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2672:2: iv_ruleVarReserved= ruleVarReserved EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarReservedRule()); 
            }
            pushFollow(FOLLOW_ruleVarReserved_in_entryRuleVarReserved6464);
            iv_ruleVarReserved=ruleVarReserved();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarReserved.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarReserved6475); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarReserved"


    // $ANTLR start "ruleVarReserved"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2679:1: ruleVarReserved returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' ) ;
    public final AntlrDatatypeRuleToken ruleVarReserved() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2682:28: ( (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2683:1: (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2683:1: (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' )
            int alt36=34;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt36=1;
                }
                break;
            case 16:
                {
                alt36=2;
                }
                break;
            case 13:
                {
                alt36=3;
                }
                break;
            case 17:
                {
                alt36=4;
                }
                break;
            case 20:
                {
                alt36=5;
                }
                break;
            case 21:
                {
                alt36=6;
                }
                break;
            case 33:
                {
                alt36=7;
                }
                break;
            case 32:
                {
                alt36=8;
                }
                break;
            case 40:
                {
                alt36=9;
                }
                break;
            case 41:
                {
                alt36=10;
                }
                break;
            case 42:
                {
                alt36=11;
                }
                break;
            case 24:
                {
                alt36=12;
                }
                break;
            case 38:
                {
                alt36=13;
                }
                break;
            case 28:
                {
                alt36=14;
                }
                break;
            case 34:
                {
                alt36=15;
                }
                break;
            case 37:
                {
                alt36=16;
                }
                break;
            case 43:
                {
                alt36=17;
                }
                break;
            case 44:
                {
                alt36=18;
                }
                break;
            case 45:
                {
                alt36=19;
                }
                break;
            case 46:
                {
                alt36=20;
                }
                break;
            case 47:
                {
                alt36=21;
                }
                break;
            case 48:
                {
                alt36=22;
                }
                break;
            case 49:
                {
                alt36=23;
                }
                break;
            case 50:
                {
                alt36=24;
                }
                break;
            case 51:
                {
                alt36=25;
                }
                break;
            case 52:
                {
                alt36=26;
                }
                break;
            case 53:
                {
                alt36=27;
                }
                break;
            case 54:
                {
                alt36=28;
                }
                break;
            case 55:
                {
                alt36=29;
                }
                break;
            case 56:
                {
                alt36=30;
                }
                break;
            case 57:
                {
                alt36=31;
                }
                break;
            case 31:
                {
                alt36=32;
                }
                break;
            case 27:
                {
                alt36=33;
                }
                break;
            case 58:
                {
                alt36=34;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2684:2: kw= 'to'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleVarReserved6513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getToKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2691:2: kw= 'package'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleVarReserved6532); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getPackageKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2698:2: kw= 'syntax'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleVarReserved6551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSyntaxKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2705:2: kw= 'import'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleVarReserved6570); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getImportKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2712:2: kw= 'option'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleVarReserved6589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getOptionKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2719:2: kw= 'message'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleVarReserved6608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getMessageKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2726:2: kw= 'service'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleVarReserved6627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getServiceKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2733:2: kw= 'enum'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleVarReserved6646); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getEnumKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2740:2: kw= 'required'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleVarReserved6665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getRequiredKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2747:2: kw= 'optional'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleVarReserved6684); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getOptionalKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2754:2: kw= 'repeated'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleVarReserved6703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getRepeatedKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2761:2: kw= 'extensions'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleVarReserved6722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getExtensionsKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2768:2: kw= 'extend'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleVarReserved6741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getExtendKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2775:2: kw= 'group'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleVarReserved6760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getGroupKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2782:2: kw= 'rpc'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleVarReserved6779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getRpcKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2789:2: kw= 'returns'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleVarReserved6798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getReturnsKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2796:2: kw= 'int32'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleVarReserved6817); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getInt32Keyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2803:2: kw= 'int64'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleVarReserved6836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getInt64Keyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2810:2: kw= 'uint32'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleVarReserved6855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getUint32Keyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2817:2: kw= 'uint64'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleVarReserved6874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getUint64Keyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2824:2: kw= 'sint32'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleVarReserved6893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSint32Keyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2831:2: kw= 'sint64'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleVarReserved6912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSint64Keyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2838:2: kw= 'fixed32'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleVarReserved6931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getFixed32Keyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2845:2: kw= 'fixed64'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleVarReserved6950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getFixed64Keyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2852:2: kw= 'sfixed32'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleVarReserved6969); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSfixed32Keyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2859:2: kw= 'sfixed64'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleVarReserved6988); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSfixed64Keyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2866:2: kw= 'float'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleVarReserved7007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getFloatKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2873:2: kw= 'double'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleVarReserved7026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getDoubleKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2880:2: kw= 'bool'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleVarReserved7045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getBoolKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2887:2: kw= 'string'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleVarReserved7064); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getStringKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2894:2: kw= 'bytes'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleVarReserved7083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getBytesKeyword_30()); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2901:2: kw= 'default'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleVarReserved7102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getDefaultKeyword_31()); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2908:2: kw= 'max'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleVarReserved7121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getMaxKeyword_32()); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2915:2: kw= 'void'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleVarReserved7140); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getVoidKeyword_33()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarReserved"


    // $ANTLR start "ruleBOOL"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2930:1: ruleBOOL returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBOOL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2932:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2933:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2933:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==59) ) {
                alt37=1;
            }
            else if ( (LA37_0==60) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2933:2: (enumLiteral_0= 'true' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2933:2: (enumLiteral_0= 'true' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2933:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_59_in_ruleBOOL7196); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2939:6: (enumLiteral_1= 'false' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2939:6: (enumLiteral_1= 'false' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2939:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_60_in_ruleBOOL7213); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBOOLAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBOOLAccess().getFalseEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "ruleModifier"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2949:1: ruleModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) ) ;
    public final Enumerator ruleModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2951:28: ( ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2952:1: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2952:1: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt38=1;
                }
                break;
            case 40:
                {
                alt38=2;
                }
                break;
            case 42:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2952:2: (enumLiteral_0= 'optional' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2952:2: (enumLiteral_0= 'optional' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2952:4: enumLiteral_0= 'optional'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_ruleModifier7258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2958:6: (enumLiteral_1= 'required' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2958:6: (enumLiteral_1= 'required' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2958:8: enumLiteral_1= 'required'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleModifier7275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2964:6: (enumLiteral_2= 'repeated' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2964:6: (enumLiteral_2= 'repeated' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2964:8: enumLiteral_2= 'repeated'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleModifier7292); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getModifierAccess().getRepeatedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getModifierAccess().getRepeatedEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModifier"


    // $ANTLR start "ruleScalarType"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2974:1: ruleScalarType returns [Enumerator current=null] : ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) ) ;
    public final Enumerator ruleScalarType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;

         enterRule(); 
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2976:28: ( ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2977:1: ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2977:1: ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) )
            int alt39=15;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt39=1;
                }
                break;
            case 44:
                {
                alt39=2;
                }
                break;
            case 45:
                {
                alt39=3;
                }
                break;
            case 46:
                {
                alt39=4;
                }
                break;
            case 47:
                {
                alt39=5;
                }
                break;
            case 48:
                {
                alt39=6;
                }
                break;
            case 49:
                {
                alt39=7;
                }
                break;
            case 50:
                {
                alt39=8;
                }
                break;
            case 51:
                {
                alt39=9;
                }
                break;
            case 52:
                {
                alt39=10;
                }
                break;
            case 53:
                {
                alt39=11;
                }
                break;
            case 54:
                {
                alt39=12;
                }
                break;
            case 55:
                {
                alt39=13;
                }
                break;
            case 56:
                {
                alt39=14;
                }
                break;
            case 57:
                {
                alt39=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2977:2: (enumLiteral_0= 'int32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2977:2: (enumLiteral_0= 'int32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2977:4: enumLiteral_0= 'int32'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleScalarType7337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2983:6: (enumLiteral_1= 'int64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2983:6: (enumLiteral_1= 'int64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2983:8: enumLiteral_1= 'int64'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleScalarType7354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2989:6: (enumLiteral_2= 'uint32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2989:6: (enumLiteral_2= 'uint32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2989:8: enumLiteral_2= 'uint32'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_45_in_ruleScalarType7371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2995:6: (enumLiteral_3= 'uint64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2995:6: (enumLiteral_3= 'uint64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2995:8: enumLiteral_3= 'uint64'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_46_in_ruleScalarType7388); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3001:6: (enumLiteral_4= 'sint32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3001:6: (enumLiteral_4= 'sint32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3001:8: enumLiteral_4= 'sint32'
                    {
                    enumLiteral_4=(Token)match(input,47,FOLLOW_47_in_ruleScalarType7405); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3007:6: (enumLiteral_5= 'sint64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3007:6: (enumLiteral_5= 'sint64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3007:8: enumLiteral_5= 'sint64'
                    {
                    enumLiteral_5=(Token)match(input,48,FOLLOW_48_in_ruleScalarType7422); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3013:6: (enumLiteral_6= 'fixed32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3013:6: (enumLiteral_6= 'fixed32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3013:8: enumLiteral_6= 'fixed32'
                    {
                    enumLiteral_6=(Token)match(input,49,FOLLOW_49_in_ruleScalarType7439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3019:6: (enumLiteral_7= 'fixed64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3019:6: (enumLiteral_7= 'fixed64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3019:8: enumLiteral_7= 'fixed64'
                    {
                    enumLiteral_7=(Token)match(input,50,FOLLOW_50_in_ruleScalarType7456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3025:6: (enumLiteral_8= 'sfixed32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3025:6: (enumLiteral_8= 'sfixed32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3025:8: enumLiteral_8= 'sfixed32'
                    {
                    enumLiteral_8=(Token)match(input,51,FOLLOW_51_in_ruleScalarType7473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3031:6: (enumLiteral_9= 'sfixed64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3031:6: (enumLiteral_9= 'sfixed64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3031:8: enumLiteral_9= 'sfixed64'
                    {
                    enumLiteral_9=(Token)match(input,52,FOLLOW_52_in_ruleScalarType7490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3037:6: (enumLiteral_10= 'float' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3037:6: (enumLiteral_10= 'float' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3037:8: enumLiteral_10= 'float'
                    {
                    enumLiteral_10=(Token)match(input,53,FOLLOW_53_in_ruleScalarType7507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3043:6: (enumLiteral_11= 'double' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3043:6: (enumLiteral_11= 'double' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3043:8: enumLiteral_11= 'double'
                    {
                    enumLiteral_11=(Token)match(input,54,FOLLOW_54_in_ruleScalarType7524); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3049:6: (enumLiteral_12= 'bool' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3049:6: (enumLiteral_12= 'bool' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3049:8: enumLiteral_12= 'bool'
                    {
                    enumLiteral_12=(Token)match(input,55,FOLLOW_55_in_ruleScalarType7541); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3055:6: (enumLiteral_13= 'string' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3055:6: (enumLiteral_13= 'string' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3055:8: enumLiteral_13= 'string'
                    {
                    enumLiteral_13=(Token)match(input,56,FOLLOW_56_in_ruleScalarType7558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3061:6: (enumLiteral_14= 'bytes' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3061:6: (enumLiteral_14= 'bytes' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3061:8: enumLiteral_14= 'bytes'
                    {
                    enumLiteral_14=(Token)match(input,57,FOLLOW_57_in_ruleScalarType7575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getBytesEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getScalarTypeAccess().getBytesEnumLiteralDeclaration_14()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarType"

    // $ANTLR start synpred1_InternalProtobuf
    public final void synpred1_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:168:7: ( 'extend' )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:168:9: 'extend'
        {
        match(input,38,FOLLOW_38_in_synpred1_InternalProtobuf318); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalProtobuf

    // $ANTLR start synpred2_InternalProtobuf
    public final void synpred2_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:459:3: ( ruleNativeOption )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:459:5: ruleNativeOption
        {
        pushFollow(FOLLOW_ruleNativeOption_in_synpred2_InternalProtobuf1098);
        ruleNativeOption();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalProtobuf

    // $ANTLR start synpred3_InternalProtobuf
    public final void synpred3_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1143:7: ( 'extend' )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1143:9: 'extend'
        {
        match(input,38,FOLLOW_38_in_synpred3_InternalProtobuf2856); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalProtobuf

    // $ANTLR start synpred4_InternalProtobuf
    public final void synpred4_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1608:3: ( ruleScalarTypeLink )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1608:5: ruleScalarTypeLink
        {
        pushFollow(FOLLOW_ruleScalarTypeLink_in_synpred4_InternalProtobuf3858);
        ruleScalarTypeLink();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalProtobuf

    // $ANTLR start synpred5_InternalProtobuf
    public final void synpred5_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1792:3: ( 'default' )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1792:5: 'default'
        {
        match(input,31,FOLLOW_31_in_synpred5_InternalProtobuf4318); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalProtobuf

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
    public final boolean synpred3_InternalProtobuf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalProtobuf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalProtobuf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalProtobuf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalProtobuf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalProtobuf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalProtobuf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalProtobuf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA6_eotS =
        "\57\uffff";
    static final String DFA6_eofS =
        "\57\uffff";
    static final String DFA6_minS =
        "\1\24\1\5\1\16\42\uffff\1\4\1\uffff\6\17\1\0\1\uffff";
    static final String DFA6_maxS =
        "\1\24\1\72\1\47\42\uffff\1\74\1\uffff\6\17\1\0\1\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\42\1\1\uffff\1\1\7\uffff\1\2";
    static final String DFA6_specialS =
        "\1\uffff\1\0\1\2\52\uffff\1\1\1\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\2\7\uffff\1\5\2\uffff\1\4\1\6\2\uffff\1\7\1\10\2\uffff\1\16\1\uffff\1\3\1\43\1\20\2\uffff\1\42\1\12\1\11\1\21\2\uffff\1\22\1\17\1\uffff\1\13\1\14\1\15\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\44",
            "\1\45\30\uffff\1\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\1\54\1\47\1\50\63\uffff\1\51\1\52",
            "",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\uffff",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "459:1: ( ( ( ruleNativeOption )=>this_NativeOption_0= ruleNativeOption ) | this_CustomOption_1= ruleCustomOption )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_1 = input.LA(1);

                         
                        int index6_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_1==RULE_ID) ) {s = 2;}

                        else if ( (LA6_1==26) && (synpred2_InternalProtobuf())) {s = 3;}

                        else if ( (LA6_1==16) && (synpred2_InternalProtobuf())) {s = 4;}

                        else if ( (LA6_1==13) && (synpred2_InternalProtobuf())) {s = 5;}

                        else if ( (LA6_1==17) && (synpred2_InternalProtobuf())) {s = 6;}

                        else if ( (LA6_1==20) && (synpred2_InternalProtobuf())) {s = 7;}

                        else if ( (LA6_1==21) && (synpred2_InternalProtobuf())) {s = 8;}

                        else if ( (LA6_1==33) && (synpred2_InternalProtobuf())) {s = 9;}

                        else if ( (LA6_1==32) && (synpred2_InternalProtobuf())) {s = 10;}

                        else if ( (LA6_1==40) && (synpred2_InternalProtobuf())) {s = 11;}

                        else if ( (LA6_1==41) && (synpred2_InternalProtobuf())) {s = 12;}

                        else if ( (LA6_1==42) && (synpred2_InternalProtobuf())) {s = 13;}

                        else if ( (LA6_1==24) && (synpred2_InternalProtobuf())) {s = 14;}

                        else if ( (LA6_1==38) && (synpred2_InternalProtobuf())) {s = 15;}

                        else if ( (LA6_1==28) && (synpred2_InternalProtobuf())) {s = 16;}

                        else if ( (LA6_1==34) && (synpred2_InternalProtobuf())) {s = 17;}

                        else if ( (LA6_1==37) && (synpred2_InternalProtobuf())) {s = 18;}

                        else if ( (LA6_1==43) && (synpred2_InternalProtobuf())) {s = 19;}

                        else if ( (LA6_1==44) && (synpred2_InternalProtobuf())) {s = 20;}

                        else if ( (LA6_1==45) && (synpred2_InternalProtobuf())) {s = 21;}

                        else if ( (LA6_1==46) && (synpred2_InternalProtobuf())) {s = 22;}

                        else if ( (LA6_1==47) && (synpred2_InternalProtobuf())) {s = 23;}

                        else if ( (LA6_1==48) && (synpred2_InternalProtobuf())) {s = 24;}

                        else if ( (LA6_1==49) && (synpred2_InternalProtobuf())) {s = 25;}

                        else if ( (LA6_1==50) && (synpred2_InternalProtobuf())) {s = 26;}

                        else if ( (LA6_1==51) && (synpred2_InternalProtobuf())) {s = 27;}

                        else if ( (LA6_1==52) && (synpred2_InternalProtobuf())) {s = 28;}

                        else if ( (LA6_1==53) && (synpred2_InternalProtobuf())) {s = 29;}

                        else if ( (LA6_1==54) && (synpred2_InternalProtobuf())) {s = 30;}

                        else if ( (LA6_1==55) && (synpred2_InternalProtobuf())) {s = 31;}

                        else if ( (LA6_1==56) && (synpred2_InternalProtobuf())) {s = 32;}

                        else if ( (LA6_1==57) && (synpred2_InternalProtobuf())) {s = 33;}

                        else if ( (LA6_1==31) && (synpred2_InternalProtobuf())) {s = 34;}

                        else if ( (LA6_1==27) && (synpred2_InternalProtobuf())) {s = 35;}

                        else if ( (LA6_1==58) && (synpred2_InternalProtobuf())) {s = 36;}

                         
                        input.seek(index6_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_45 = input.LA(1);

                         
                        int index6_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProtobuf()) ) {s = 38;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index6_45);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_2 = input.LA(1);

                         
                        int index6_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_2==14) ) {s = 37;}

                        else if ( (LA6_2==39) && (synpred2_InternalProtobuf())) {s = 38;}

                         
                        input.seek(index6_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA13_eotS =
        "\54\uffff";
    static final String DFA13_eofS =
        "\54\uffff";
    static final String DFA13_minS =
        "\1\50\3\5\1\uffff\1\5\43\16\1\6\1\17\1\uffff";
    static final String DFA13_maxS =
        "\1\52\3\72\1\uffff\1\72\43\16\1\6\1\35\1\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\1\46\uffff\1\2";
    static final String DFA13_specialS =
        "\54\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\1\1\1\3",
            "\1\4\7\uffff\1\4\2\uffff\2\4\2\uffff\2\4\2\uffff\1\4\1\uffff\2\4\1\5\2\uffff\4\4\2\uffff\2\4\1\uffff\23\4",
            "\1\4\7\uffff\1\4\2\uffff\2\4\2\uffff\2\4\2\uffff\1\4\1\uffff\2\4\1\5\2\uffff\4\4\2\uffff\2\4\1\uffff\23\4",
            "\1\4\7\uffff\1\4\2\uffff\2\4\2\uffff\2\4\2\uffff\1\4\1\uffff\2\4\1\5\2\uffff\4\4\2\uffff\2\4\1\uffff\23\4",
            "",
            "\1\6\7\uffff\1\11\2\uffff\1\10\1\12\2\uffff\1\13\1\14\2\uffff\1\22\1\uffff\1\7\1\47\1\24\2\uffff\1\46\1\16\1\15\1\25\2\uffff\1\26\1\23\1\uffff\1\17\1\20\1\21\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\50",
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
            "\1\4\6\uffff\1\53\6\uffff\1\4",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1194:1: (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup )";
        }
    }
    static final String DFA19_eotS =
        "\22\uffff";
    static final String DFA19_eofS =
        "\22\uffff";
    static final String DFA19_minS =
        "\1\5\17\0\2\uffff";
    static final String DFA19_maxS =
        "\1\72\17\0\2\uffff";
    static final String DFA19_acceptS =
        "\20\uffff\1\2\1\1";
    static final String DFA19_specialS =
        "\1\uffff\1\1\1\15\1\7\1\13\1\5\1\2\1\12\1\0\1\10\1\6\1\16\1\4\1\14\1\11\1\3\2\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\20\7\uffff\1\20\2\uffff\2\20\2\uffff\2\20\2\uffff\1\20\1\uffff\3\20\2\uffff\4\20\2\uffff\2\20\1\uffff\3\20\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
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

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1608:1: ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_8 = input.LA(1);

                         
                        int index19_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_1 = input.LA(1);

                         
                        int index19_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_6 = input.LA(1);

                         
                        int index19_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_15 = input.LA(1);

                         
                        int index19_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_12 = input.LA(1);

                         
                        int index19_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_5 = input.LA(1);

                         
                        int index19_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_10 = input.LA(1);

                         
                        int index19_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA19_3 = input.LA(1);

                         
                        int index19_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_3);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA19_9 = input.LA(1);

                         
                        int index19_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA19_14 = input.LA(1);

                         
                        int index19_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_14);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA19_7 = input.LA(1);

                         
                        int index19_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_7);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA19_4 = input.LA(1);

                         
                        int index19_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_4);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA19_13 = input.LA(1);

                         
                        int index19_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA19_2 = input.LA(1);

                         
                        int index19_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_2);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA19_11 = input.LA(1);

                         
                        int index19_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA21_eotS =
        "\13\uffff";
    static final String DFA21_eofS =
        "\13\uffff";
    static final String DFA21_minS =
        "\1\5\1\16\1\uffff\1\4\6\0\1\uffff";
    static final String DFA21_maxS =
        "\1\72\1\16\1\uffff\1\74\6\0\1\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\7\uffff\1\1";
    static final String DFA21_specialS =
        "\4\uffff\1\3\1\5\1\2\1\4\1\1\1\0\1\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\7\uffff\1\2\2\uffff\2\2\2\uffff\2\2\2\uffff\1\2\1\uffff\3\2\2\uffff\1\1\3\2\2\uffff\2\2\1\uffff\23\2",
            "\1\3",
            "",
            "\1\10\1\11\1\4\1\5\63\uffff\1\6\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1792:1: ( ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption ) | this_NativeFieldOption_1= ruleNativeFieldOption )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_9 = input.LA(1);

                         
                        int index21_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index21_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_8 = input.LA(1);

                         
                        int index21_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index21_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_6 = input.LA(1);

                         
                        int index21_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index21_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_4 = input.LA(1);

                         
                        int index21_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index21_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_7 = input.LA(1);

                         
                        int index21_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index21_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_5 = input.LA(1);

                         
                        int index21_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index21_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleProto_in_entryRuleProto75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProto85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_ruleProto131 = new BitSet(new long[]{0x0000074300330002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProto153 = new BitSet(new long[]{0x0000074300330002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleStatement247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleStatement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_ruleStatement301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_ruleStatement336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleStatement364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_ruleStatement391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_entryRuleSyntax426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntax436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSyntax473 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSyntax485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSyntax502 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSyntax519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePackage602 = new BitSet(new long[]{0x07FFFF679D332020L});
    public static final BitSet FOLLOW_ruleVar_full_in_rulePackage623 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePackage635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicImport_in_ruleImport728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakImport_in_ruleImport755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicImport_in_entryRulePublicImport790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePublicImport800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePublicImport837 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePublicImport849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePublicImport866 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePublicImport883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakImport_in_entryRuleWeakImport919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeakImport929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleWeakImport966 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleWeakImport979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWeakImport998 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleWeakImport1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption1051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeOption_in_ruleOption1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_ruleOption1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeOption_in_entryRuleNativeOption1177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeOption1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNativeOption1224 = new BitSet(new long[]{0x07FFFF679D332020L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleNativeOption1247 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNativeOption1259 = new BitSet(new long[]{0x18000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleNativeOption1280 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNativeOption1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_entryRuleCustomOption1328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomOption1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCustomOption1375 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomOption1392 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCustomOption1409 = new BitSet(new long[]{0x18000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCustomOption1430 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCustomOption1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_ruleValue1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_entryRuleSimpleValueLink1568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValueLink1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_ruleSimpleValueLink1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_ruleSimpleValueLink1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_ruleSimpleValueLink1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLink_in_ruleSimpleValueLink1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLink_in_entryRuleEnumLink1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLink1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLink1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_entryRuleStringLink1830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLink1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLink1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLink1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleBooleanLink1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_entryRuleNumberLink2011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLink2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_ruleNumberLink2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_ruleNumberLink2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_entryRuleIntLink2130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLink2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleIntLink2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLink2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMDOUBLE_in_ruleDoubleLink2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType2312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleComplexType2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_ruleComplexType2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType2431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensibleType2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleExtensibleType2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleExtensibleType2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage2550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMessage2597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage2614 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMessage2631 = new BitSet(new long[]{0x0000074301B30000L});
    public static final BitSet FOLLOW_ruleMessageElement_in_ruleMessage2652 = new BitSet(new long[]{0x0000074301B30000L});
    public static final BitSet FOLLOW_23_in_ruleMessage2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_entryRuleMessageElement2701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageElement2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleMessageElement2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_ruleMessageElement2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleMessageElement2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleMessageElement2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_ruleMessageElement2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_ruleMessageElement2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_ruleMessageElement2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement2964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedElement2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_ruleIndexedElement3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleIndexedElement3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange3083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionRange3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleExtensionRange3130 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleRange_in_ruleExtensionRange3151 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_25_in_ruleExtensionRange3164 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleRange_in_ruleExtensionRange3185 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_15_in_ruleExtensionRange3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange3235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleRange3287 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleRange3305 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleRange3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRange3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_entryRuleMessageField3404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageField3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleMessageField3460 = new BitSet(new long[]{0x07FFFF679D332020L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleMessageField3481 = new BitSet(new long[]{0x07FFFF679D332020L});
    public static final BitSet FOLLOW_ruleVar_in_ruleMessageField3502 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMessageField3514 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleMessageField3531 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_ruleMessageField3557 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMessageField3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup3606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleGroup3662 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleGroup3674 = new BitSet(new long[]{0x07FFFF679D332020L});
    public static final BitSet FOLLOW_ruleVar_in_ruleGroup3695 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGroup3707 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleGroup3724 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleGroup3741 = new BitSet(new long[]{0x0000070100A00000L});
    public static final BitSet FOLLOW_ruleMessageField_in_ruleGroup3762 = new BitSet(new long[]{0x0000070100A00000L});
    public static final BitSet FOLLOW_23_in_ruleGroup3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_entryRuleTypeLink3811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLink3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_ruleTypeLink3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_ruleTypeLink3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink3937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLink3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleComplexTypeLink3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink4029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarTypeLink4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarType_in_ruleScalarTypeLink4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions4119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOptions4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFieldOptions4166 = new BitSet(new long[]{0x07FFFF679D332020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleFieldOptions4187 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_25_in_ruleFieldOptions4200 = new BitSet(new long[]{0x07FFFF679D332020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleFieldOptions4221 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_30_in_ruleFieldOptions4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_entryRuleFieldOption4271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOption4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_ruleFieldOption4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_ruleFieldOption4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption4399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValueFieldOption4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDefaultValueFieldOption4454 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDefaultValueFieldOption4467 = new BitSet(new long[]{0x18000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleDefaultValueFieldOption4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption4524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeFieldOption4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_ruleNativeFieldOption4580 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNativeFieldOption4592 = new BitSet(new long[]{0x18000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleNativeFieldOption4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_entryRuleOptionSource4649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionSource4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleOptionSource4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum4741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEnum4788 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum4805 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEnum4822 = new BitSet(new long[]{0x0000074300B30020L});
    public static final BitSet FOLLOW_ruleEnumElement_in_ruleEnum4843 = new BitSet(new long[]{0x0000074300B30020L});
    public static final BitSet FOLLOW_23_in_ruleEnum4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_entryRuleEnumElement4892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumElement4902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_ruleEnumElement4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_ruleEnumElement4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_entryRuleEnumField5011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumField5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumField5063 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumField5080 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleEnumField5097 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_29_in_ruleEnumField5115 = new BitSet(new long[]{0x07FFFF679D332020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleEnumField5136 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_25_in_ruleEnumField5149 = new BitSet(new long[]{0x07FFFF679D332020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleEnumField5170 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_30_in_ruleEnumField5184 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEnumField5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService5234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleService5281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService5298 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleService5315 = new BitSet(new long[]{0x0000074700330000L});
    public static final BitSet FOLLOW_ruleServiceElement_in_ruleService5336 = new BitSet(new long[]{0x0000074700B30000L});
    public static final BitSet FOLLOW_23_in_ruleService5349 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleService5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceElement_in_entryRuleServiceElement5400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceElement5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_ruleServiceElement5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_ruleServiceElement5484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_entryRuleRpc5519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRpc5529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRpc5566 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRpc5583 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleRpc5600 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMessageLink_in_ruleRpc5621 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleRpc5633 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleRpc5645 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleRpc5657 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMessageLink_in_ruleRpc5678 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleRpc5690 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_22_in_ruleRpc5703 = new BitSet(new long[]{0x0000074300B30000L});
    public static final BitSet FOLLOW_ruleOption_in_ruleRpc5724 = new BitSet(new long[]{0x0000074300B30000L});
    public static final BitSet FOLLOW_23_in_ruleRpc5737 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRpc5751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_entryRuleMessageLink5787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageLink5797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_ruleMessageLink5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_entryRuleExtend5879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtend5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleExtend5934 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtend5957 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_ruleExtend5978 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExtend5993 = new BitSet(new long[]{0x0000074301B30000L});
    public static final BitSet FOLLOW_ruleMessageElement_in_ruleExtend6014 = new BitSet(new long[]{0x0000074301B30000L});
    public static final BitSet FOLLOW_23_in_ruleExtend6027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_entryRuleVar_full6064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar_full6075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_ruleVar_full6122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleVar_full6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar6201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVar6252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_ruleVar6285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID6331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFULL_ID6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFULL_ID6382 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleFULL_ID6401 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFULL_ID6416 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_entryRuleVarReserved6464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarReserved6475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleVarReserved6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleVarReserved6532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleVarReserved6551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVarReserved6570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleVarReserved6589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleVarReserved6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleVarReserved6627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleVarReserved6646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleVarReserved6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleVarReserved6684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleVarReserved6703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleVarReserved6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleVarReserved6741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleVarReserved6760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleVarReserved6779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleVarReserved6798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleVarReserved6817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleVarReserved6836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVarReserved6855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVarReserved6874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVarReserved6893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleVarReserved6912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleVarReserved6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleVarReserved6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleVarReserved6969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleVarReserved6988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleVarReserved7007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleVarReserved7026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleVarReserved7045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleVarReserved7064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleVarReserved7083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleVarReserved7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleVarReserved7121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleVarReserved7140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBOOL7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleBOOL7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleModifier7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleModifier7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleModifier7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleScalarType7337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleScalarType7354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleScalarType7371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleScalarType7388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleScalarType7405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleScalarType7422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleScalarType7439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleScalarType7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleScalarType7473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleScalarType7490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleScalarType7507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleScalarType7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleScalarType7541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleScalarType7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleScalarType7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred1_InternalProtobuf318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeOption_in_synpred2_InternalProtobuf1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred3_InternalProtobuf2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_synpred4_InternalProtobuf3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred5_InternalProtobuf4318 = new BitSet(new long[]{0x0000000000000002L});

}