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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_NUMINT", "RULE_NUMDOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'syntax'", "'='", "';'", "'package'", "'import'", "'option'", "'message'", "'{'", "'}'", "'extensions'", "'to'", "'group'", "'['", "','", "']'", "'default'", "'enum'", "'service'", "'rpc'", "'('", "')'", "'returns'", "'extend'", "'.'", "'required'", "'optional'", "'repeated'", "'int32'", "'int64'", "'uint32'", "'uint64'", "'sint32'", "'sint64'", "'fixed32'", "'fixed64'", "'sfixed32'", "'sfixed64'", "'float'", "'double'", "'bool'", "'string'", "'bytes'", "'max'", "'void'", "'true'", "'false'"
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

                if ( ((LA2_0>=16 && LA2_0<=19)||(LA2_0>=29 && LA2_0<=30)||LA2_0==35||(LA2_0>=37 && LA2_0<=39)) ) {
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:134:1: ruleStatement returns [EObject current=null] : (this_Package_0= rulePackage | this_Import_1= ruleImport | this_ComplexType_2= ruleComplexType | this_Extend_3= ruleExtend | this_Service_4= ruleService | this_Option_5= ruleOption ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:137:28: ( (this_Package_0= rulePackage | this_Import_1= ruleImport | this_ComplexType_2= ruleComplexType | this_Extend_3= ruleExtend | this_Service_4= ruleService | this_Option_5= ruleOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:138:1: (this_Package_0= rulePackage | this_Import_1= ruleImport | this_ComplexType_2= ruleComplexType | this_Extend_3= ruleExtend | this_Service_4= ruleService | this_Option_5= ruleOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:138:1: (this_Package_0= rulePackage | this_Import_1= ruleImport | this_ComplexType_2= ruleComplexType | this_Extend_3= ruleExtend | this_Service_4= ruleService | this_Option_5= ruleOption )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 19:
            case 29:
            case 37:
            case 38:
            case 39:
                {
                alt3=3;
                }
                break;
            case 35:
                {
                alt3=4;
                }
                break;
            case 30:
                {
                alt3=5;
                }
                break;
            case 18:
                {
                alt3=6;
                }
                break;
            default:
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:169:5: this_Extend_3= ruleExtend
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExtendParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtend_in_ruleStatement328);
                    this_Extend_3=ruleExtend();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Extend_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:179:5: this_Service_4= ruleService
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getServiceParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleService_in_ruleStatement355);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:189:5: this_Option_5= ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getOptionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOption_in_ruleStatement382);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:205:1: entryRuleSyntax returns [EObject current=null] : iv_ruleSyntax= ruleSyntax EOF ;
    public final EObject entryRuleSyntax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSyntax = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:206:2: (iv_ruleSyntax= ruleSyntax EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:207:2: iv_ruleSyntax= ruleSyntax EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSyntaxRule()); 
            }
            pushFollow(FOLLOW_ruleSyntax_in_entryRuleSyntax417);
            iv_ruleSyntax=ruleSyntax();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSyntax; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyntax427); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:214:1: ruleSyntax returns [EObject current=null] : (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleSyntax() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:217:28: ( (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:218:1: (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:218:1: (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:218:3: otherlv_0= 'syntax' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleSyntax464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSyntaxAccess().getSyntaxKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSyntax476); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSyntaxAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:226:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:227:1: (lv_name_2_0= RULE_STRING )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:227:1: (lv_name_2_0= RULE_STRING )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:228:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSyntax493); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSyntax510); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:256:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:257:2: (iv_rulePackage= rulePackage EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:258:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage546);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage556); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:265:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleVar_full ) ) otherlv_2= ';' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:268:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleVar_full ) ) otherlv_2= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:269:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleVar_full ) ) otherlv_2= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:269:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleVar_full ) ) otherlv_2= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:269:3: otherlv_0= 'package' ( (lv_name_1_0= ruleVar_full ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePackage593); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:273:1: ( (lv_name_1_0= ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:274:1: (lv_name_1_0= ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:274:1: (lv_name_1_0= ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:275:3: lv_name_1_0= ruleVar_full
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageAccess().getNameVar_fullParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_rulePackage614);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePackage626); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:303:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:304:2: (iv_ruleImport= ruleImport EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:305:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport662);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport672); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:312:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:315:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:316:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:316:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:316:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleImport709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:320:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:321:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:321:1: (lv_importURI_1_0= RULE_STRING )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:322:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleImport743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
                  
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleOption"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:350:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:351:2: (iv_ruleOption= ruleOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:352:2: iv_ruleOption= ruleOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionRule()); 
            }
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption779);
            iv_ruleOption=ruleOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption789); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:359:1: ruleOption returns [EObject current=null] : (otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:362:28: ( (otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:363:1: (otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:363:1: (otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:363:3: otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleOption826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOptionAccess().getOptionKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:367:1: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:368:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:368:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:369:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOptionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionAccess().getSourceMessageFieldCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleOption849);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleOption861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOptionAccess().getEqualsSignKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:386:1: ( (lv_value_3_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:387:1: (lv_value_3_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:387:1: (lv_value_3_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:388:3: lv_value_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionAccess().getValueValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleOption882);
            lv_value_3_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOptionRule());
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleOption894); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getOptionAccess().getSemicolonKeyword_4());
                  
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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleValue"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:416:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:417:2: (iv_ruleValue= ruleValue EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:418:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue930);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue940); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:425:1: ruleValue returns [EObject current=null] : this_SimpleValueLink_0= ruleSimpleValueLink ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValueLink_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:428:28: (this_SimpleValueLink_0= ruleSimpleValueLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:430:5: this_SimpleValueLink_0= ruleSimpleValueLink
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValueAccess().getSimpleValueLinkParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleSimpleValueLink_in_ruleValue986);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:446:1: entryRuleSimpleValueLink returns [EObject current=null] : iv_ruleSimpleValueLink= ruleSimpleValueLink EOF ;
    public final EObject entryRuleSimpleValueLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValueLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:447:2: (iv_ruleSimpleValueLink= ruleSimpleValueLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:448:2: iv_ruleSimpleValueLink= ruleSimpleValueLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleValueLinkRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleValueLink_in_entryRuleSimpleValueLink1020);
            iv_ruleSimpleValueLink=ruleSimpleValueLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleValueLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleValueLink1030); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:455:1: ruleSimpleValueLink returns [EObject current=null] : (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_EnumLink_3= ruleEnumLink ) ;
    public final EObject ruleSimpleValueLink() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLink_0 = null;

        EObject this_BooleanLink_1 = null;

        EObject this_StringLink_2 = null;

        EObject this_EnumLink_3 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:458:28: ( (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_EnumLink_3= ruleEnumLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:459:1: (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_EnumLink_3= ruleEnumLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:459:1: (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_EnumLink_3= ruleEnumLink )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_NUMINT:
            case RULE_NUMDOUBLE:
                {
                alt4=1;
                }
                break;
            case 57:
            case 58:
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:460:5: this_NumberLink_0= ruleNumberLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleValueLinkAccess().getNumberLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLink_in_ruleSimpleValueLink1077);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:470:5: this_BooleanLink_1= ruleBooleanLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleValueLinkAccess().getBooleanLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLink_in_ruleSimpleValueLink1104);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:480:5: this_StringLink_2= ruleStringLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleValueLinkAccess().getStringLinkParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLink_in_ruleSimpleValueLink1131);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:490:5: this_EnumLink_3= ruleEnumLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleValueLinkAccess().getEnumLinkParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumLink_in_ruleSimpleValueLink1158);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:506:1: entryRuleEnumLink returns [EObject current=null] : iv_ruleEnumLink= ruleEnumLink EOF ;
    public final EObject entryRuleEnumLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:507:2: (iv_ruleEnumLink= ruleEnumLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:508:2: iv_ruleEnumLink= ruleEnumLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumLinkRule()); 
            }
            pushFollow(FOLLOW_ruleEnumLink_in_entryRuleEnumLink1193);
            iv_ruleEnumLink=ruleEnumLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLink1203); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:515:1: ruleEnumLink returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEnumLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:518:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:519:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:519:1: ( (otherlv_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:520:1: (otherlv_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:520:1: (otherlv_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:521:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumLinkRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumLink1247); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:540:1: entryRuleStringLink returns [EObject current=null] : iv_ruleStringLink= ruleStringLink EOF ;
    public final EObject entryRuleStringLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:541:2: (iv_ruleStringLink= ruleStringLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:542:2: iv_ruleStringLink= ruleStringLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLinkRule()); 
            }
            pushFollow(FOLLOW_ruleStringLink_in_entryRuleStringLink1282);
            iv_ruleStringLink=ruleStringLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLink1292); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:549:1: ruleStringLink returns [EObject current=null] : ( (lv_target_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:552:28: ( ( (lv_target_0_0= RULE_STRING ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:553:1: ( (lv_target_0_0= RULE_STRING ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:553:1: ( (lv_target_0_0= RULE_STRING ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:554:1: (lv_target_0_0= RULE_STRING )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:554:1: (lv_target_0_0= RULE_STRING )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:555:3: lv_target_0_0= RULE_STRING
            {
            lv_target_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLink1333); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:579:1: entryRuleBooleanLink returns [EObject current=null] : iv_ruleBooleanLink= ruleBooleanLink EOF ;
    public final EObject entryRuleBooleanLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:580:2: (iv_ruleBooleanLink= ruleBooleanLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:581:2: iv_ruleBooleanLink= ruleBooleanLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLinkRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink1373);
            iv_ruleBooleanLink=ruleBooleanLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLink1383); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:588:1: ruleBooleanLink returns [EObject current=null] : ( (lv_target_0_0= ruleBOOL ) ) ;
    public final EObject ruleBooleanLink() throws RecognitionException {
        EObject current = null;

        Enumerator lv_target_0_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:591:28: ( ( (lv_target_0_0= ruleBOOL ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:592:1: ( (lv_target_0_0= ruleBOOL ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:592:1: ( (lv_target_0_0= ruleBOOL ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:593:1: (lv_target_0_0= ruleBOOL )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:593:1: (lv_target_0_0= ruleBOOL )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:594:3: lv_target_0_0= ruleBOOL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBooleanLinkAccess().getTargetBOOLEnumRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBOOL_in_ruleBooleanLink1428);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:618:1: entryRuleNumberLink returns [EObject current=null] : iv_ruleNumberLink= ruleNumberLink EOF ;
    public final EObject entryRuleNumberLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:619:2: (iv_ruleNumberLink= ruleNumberLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:620:2: iv_ruleNumberLink= ruleNumberLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLinkRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLink_in_entryRuleNumberLink1463);
            iv_ruleNumberLink=ruleNumberLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLink1473); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:627:1: ruleNumberLink returns [EObject current=null] : (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink ) ;
    public final EObject ruleNumberLink() throws RecognitionException {
        EObject current = null;

        EObject this_IntLink_0 = null;

        EObject this_DoubleLink_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:630:28: ( (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:631:1: (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:631:1: (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NUMINT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_NUMDOUBLE) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:632:5: this_IntLink_0= ruleIntLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberLinkAccess().getIntLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLink_in_ruleNumberLink1520);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:642:5: this_DoubleLink_1= ruleDoubleLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberLinkAccess().getDoubleLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoubleLink_in_ruleNumberLink1547);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:658:1: entryRuleIntLink returns [EObject current=null] : iv_ruleIntLink= ruleIntLink EOF ;
    public final EObject entryRuleIntLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:659:2: (iv_ruleIntLink= ruleIntLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:660:2: iv_ruleIntLink= ruleIntLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLinkRule()); 
            }
            pushFollow(FOLLOW_ruleIntLink_in_entryRuleIntLink1582);
            iv_ruleIntLink=ruleIntLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLink1592); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:667:1: ruleIntLink returns [EObject current=null] : ( (lv_target_0_0= RULE_NUMINT ) ) ;
    public final EObject ruleIntLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:670:28: ( ( (lv_target_0_0= RULE_NUMINT ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:671:1: ( (lv_target_0_0= RULE_NUMINT ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:671:1: ( (lv_target_0_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:672:1: (lv_target_0_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:672:1: (lv_target_0_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:673:3: lv_target_0_0= RULE_NUMINT
            {
            lv_target_0_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleIntLink1633); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:697:1: entryRuleDoubleLink returns [EObject current=null] : iv_ruleDoubleLink= ruleDoubleLink EOF ;
    public final EObject entryRuleDoubleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:698:2: (iv_ruleDoubleLink= ruleDoubleLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:699:2: iv_ruleDoubleLink= ruleDoubleLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleLinkRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink1673);
            iv_ruleDoubleLink=ruleDoubleLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoubleLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLink1683); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:706:1: ruleDoubleLink returns [EObject current=null] : ( (lv_target_0_0= RULE_NUMDOUBLE ) ) ;
    public final EObject ruleDoubleLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:709:28: ( ( (lv_target_0_0= RULE_NUMDOUBLE ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:710:1: ( (lv_target_0_0= RULE_NUMDOUBLE ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:710:1: ( (lv_target_0_0= RULE_NUMDOUBLE ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:711:1: (lv_target_0_0= RULE_NUMDOUBLE )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:711:1: (lv_target_0_0= RULE_NUMDOUBLE )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:712:3: lv_target_0_0= RULE_NUMDOUBLE
            {
            lv_target_0_0=(Token)match(input,RULE_NUMDOUBLE,FOLLOW_RULE_NUMDOUBLE_in_ruleDoubleLink1724); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:736:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:737:2: (iv_ruleComplexType= ruleComplexType EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:738:2: iv_ruleComplexType= ruleComplexType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexTypeRule()); 
            }
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType1764);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType1774); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:745:1: ruleComplexType returns [EObject current=null] : (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        EObject this_Enum_0 = null;

        EObject this_ExtensibleType_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:748:28: ( (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:749:1: (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:749:1: (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==19||(LA6_0>=37 && LA6_0<=39)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:750:5: this_Enum_0= ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexTypeAccess().getEnumParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnum_in_ruleComplexType1821);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:760:5: this_ExtensibleType_1= ruleExtensibleType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexTypeAccess().getExtensibleTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtensibleType_in_ruleComplexType1848);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:776:1: entryRuleExtensibleType returns [EObject current=null] : iv_ruleExtensibleType= ruleExtensibleType EOF ;
    public final EObject entryRuleExtensibleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensibleType = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:777:2: (iv_ruleExtensibleType= ruleExtensibleType EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:778:2: iv_ruleExtensibleType= ruleExtensibleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtensibleTypeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType1883);
            iv_ruleExtensibleType=ruleExtensibleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtensibleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensibleType1893); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:785:1: ruleExtensibleType returns [EObject current=null] : (this_Message_0= ruleMessage | this_Group_1= ruleGroup ) ;
    public final EObject ruleExtensibleType() throws RecognitionException {
        EObject current = null;

        EObject this_Message_0 = null;

        EObject this_Group_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:788:28: ( (this_Message_0= ruleMessage | this_Group_1= ruleGroup ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:789:1: (this_Message_0= ruleMessage | this_Group_1= ruleGroup )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:789:1: (this_Message_0= ruleMessage | this_Group_1= ruleGroup )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=37 && LA7_0<=39)) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:790:5: this_Message_0= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensibleTypeAccess().getMessageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleExtensibleType1940);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:800:5: this_Group_1= ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensibleTypeAccess().getGroupParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroup_in_ruleExtensibleType1967);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:816:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:817:2: (iv_ruleMessage= ruleMessage EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:818:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage2002);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage2012); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:825:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:828:28: ( (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:829:1: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:829:1: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:829:3: otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleMessage2049); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:833:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:834:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:834:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:835:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage2066); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMessage2083); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:855:1: ( (lv_elements_3_0= ruleMessageElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=18 && LA8_0<=19)||LA8_0==22||(LA8_0>=29 && LA8_0<=30)||LA8_0==35||(LA8_0>=37 && LA8_0<=39)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:856:1: (lv_elements_3_0= ruleMessageElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:856:1: (lv_elements_3_0= ruleMessageElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:857:3: lv_elements_3_0= ruleMessageElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMessageAccess().getElementsMessageElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMessageElement_in_ruleMessage2104);
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
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleMessage2117); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:885:1: entryRuleMessageElement returns [EObject current=null] : iv_ruleMessageElement= ruleMessageElement EOF ;
    public final EObject entryRuleMessageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:886:2: (iv_ruleMessageElement= ruleMessageElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:887:2: iv_ruleMessageElement= ruleMessageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageElementRule()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_entryRuleMessageElement2153);
            iv_ruleMessageElement=ruleMessageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageElement2163); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:894:1: ruleMessageElement returns [EObject current=null] : (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Enum_2= ruleEnum | this_Service_3= ruleService | this_Extend_4= ruleExtend | this_ExtensionRange_5= ruleExtensionRange | this_Option_6= ruleOption ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:897:28: ( (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Enum_2= ruleEnum | this_Service_3= ruleService | this_Extend_4= ruleExtend | this_ExtensionRange_5= ruleExtensionRange | this_Option_6= ruleOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:898:1: (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Enum_2= ruleEnum | this_Service_3= ruleService | this_Extend_4= ruleExtend | this_ExtensionRange_5= ruleExtensionRange | this_Option_6= ruleOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:898:1: (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Enum_2= ruleEnum | this_Service_3= ruleService | this_Extend_4= ruleExtend | this_ExtensionRange_5= ruleExtensionRange | this_Option_6= ruleOption )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 37:
            case 38:
            case 39:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            case 30:
                {
                alt9=4;
                }
                break;
            case 35:
                {
                alt9=5;
                }
                break;
            case 22:
                {
                alt9=6;
                }
                break;
            case 18:
                {
                alt9=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:899:5: this_Message_0= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getMessageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleMessageElement2210);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:909:5: this_IndexedElement_1= ruleIndexedElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getIndexedElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIndexedElement_in_ruleMessageElement2237);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:919:5: this_Enum_2= ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getEnumParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnum_in_ruleMessageElement2264);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:929:5: this_Service_3= ruleService
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getServiceParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleService_in_ruleMessageElement2291);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:939:5: this_Extend_4= ruleExtend
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getExtendParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtend_in_ruleMessageElement2318);
                    this_Extend_4=ruleExtend();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Extend_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:949:5: this_ExtensionRange_5= ruleExtensionRange
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getExtensionRangeParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtensionRange_in_ruleMessageElement2345);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:959:5: this_Option_6= ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getOptionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOption_in_ruleMessageElement2372);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:975:1: entryRuleIndexedElement returns [EObject current=null] : iv_ruleIndexedElement= ruleIndexedElement EOF ;
    public final EObject entryRuleIndexedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:976:2: (iv_ruleIndexedElement= ruleIndexedElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:977:2: iv_ruleIndexedElement= ruleIndexedElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedElementRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement2407);
            iv_ruleIndexedElement=ruleIndexedElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedElement2417); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:984:1: ruleIndexedElement returns [EObject current=null] : (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup ) ;
    public final EObject ruleIndexedElement() throws RecognitionException {
        EObject current = null;

        EObject this_MessageField_0 = null;

        EObject this_Group_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:987:28: ( (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:988:1: (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:988:1: (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:989:5: this_MessageField_0= ruleMessageField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIndexedElementAccess().getMessageFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessageField_in_ruleIndexedElement2464);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:999:5: this_Group_1= ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIndexedElementAccess().getGroupParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroup_in_ruleIndexedElement2491);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1015:1: entryRuleExtensionRange returns [EObject current=null] : iv_ruleExtensionRange= ruleExtensionRange EOF ;
    public final EObject entryRuleExtensionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionRange = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1016:2: (iv_ruleExtensionRange= ruleExtensionRange EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1017:2: iv_ruleExtensionRange= ruleExtensionRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtensionRangeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange2526);
            iv_ruleExtensionRange=ruleExtensionRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtensionRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionRange2536); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1024:1: ruleExtensionRange returns [EObject current=null] : (otherlv_0= 'extensions' ( (lv_from_1_0= RULE_NUMINT ) ) (otherlv_2= 'to' ( (lv_to_3_0= RULE_NUMINT ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleExtensionRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_from_1_0=null;
        Token otherlv_2=null;
        Token lv_to_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1027:28: ( (otherlv_0= 'extensions' ( (lv_from_1_0= RULE_NUMINT ) ) (otherlv_2= 'to' ( (lv_to_3_0= RULE_NUMINT ) ) )? otherlv_4= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1028:1: (otherlv_0= 'extensions' ( (lv_from_1_0= RULE_NUMINT ) ) (otherlv_2= 'to' ( (lv_to_3_0= RULE_NUMINT ) ) )? otherlv_4= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1028:1: (otherlv_0= 'extensions' ( (lv_from_1_0= RULE_NUMINT ) ) (otherlv_2= 'to' ( (lv_to_3_0= RULE_NUMINT ) ) )? otherlv_4= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1028:3: otherlv_0= 'extensions' ( (lv_from_1_0= RULE_NUMINT ) ) (otherlv_2= 'to' ( (lv_to_3_0= RULE_NUMINT ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleExtensionRange2573); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExtensionRangeAccess().getExtensionsKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1032:1: ( (lv_from_1_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1033:1: (lv_from_1_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1033:1: (lv_from_1_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1034:3: lv_from_1_0= RULE_NUMINT
            {
            lv_from_1_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleExtensionRange2590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_from_1_0, grammarAccess.getExtensionRangeAccess().getFromNUMINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExtensionRangeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"from",
                      		lv_from_1_0, 
                      		"NUMINT");
              	    
            }

            }


            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1050:2: (otherlv_2= 'to' ( (lv_to_3_0= RULE_NUMINT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1050:4: otherlv_2= 'to' ( (lv_to_3_0= RULE_NUMINT ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleExtensionRange2608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExtensionRangeAccess().getToKeyword_2_0());
                          
                    }
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1054:1: ( (lv_to_3_0= RULE_NUMINT ) )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1055:1: (lv_to_3_0= RULE_NUMINT )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1055:1: (lv_to_3_0= RULE_NUMINT )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1056:3: lv_to_3_0= RULE_NUMINT
                    {
                    lv_to_3_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleExtensionRange2625); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_to_3_0, grammarAccess.getExtensionRangeAccess().getToNUMINTTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExtensionRangeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"to",
                              		lv_to_3_0, 
                              		"NUMINT");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleExtensionRange2644); if (state.failed) return current;
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


    // $ANTLR start "entryRuleMessageField"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1084:1: entryRuleMessageField returns [EObject current=null] : iv_ruleMessageField= ruleMessageField EOF ;
    public final EObject entryRuleMessageField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageField = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1085:2: (iv_ruleMessageField= ruleMessageField EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1086:2: iv_ruleMessageField= ruleMessageField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageFieldRule()); 
            }
            pushFollow(FOLLOW_ruleMessageField_in_entryRuleMessageField2680);
            iv_ruleMessageField=ruleMessageField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageField2690); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1093:1: ruleMessageField returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1096:28: ( ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1097:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1097:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1097:2: ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1097:2: ( (lv_modifier_0_0= ruleModifier ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1098:1: (lv_modifier_0_0= ruleModifier )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1098:1: (lv_modifier_0_0= ruleModifier )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1099:3: lv_modifier_0_0= ruleModifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageFieldAccess().getModifierModifierEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleModifier_in_ruleMessageField2736);
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1115:2: ( (lv_type_1_0= ruleTypeLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1116:1: (lv_type_1_0= ruleTypeLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1116:1: (lv_type_1_0= ruleTypeLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1117:3: lv_type_1_0= ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageFieldAccess().getTypeTypeLinkParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeLink_in_ruleMessageField2757);
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1133:2: ( (lv_name_2_0= ruleVar ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1134:1: (lv_name_2_0= ruleVar )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1134:1: (lv_name_2_0= ruleVar )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1135:3: lv_name_2_0= ruleVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageFieldAccess().getNameVarParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_in_ruleMessageField2778);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleMessageField2790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMessageFieldAccess().getEqualsSignKeyword_3());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1155:1: ( (lv_index_4_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1156:1: (lv_index_4_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1156:1: (lv_index_4_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1157:3: lv_index_4_0= RULE_NUMINT
            {
            lv_index_4_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleMessageField2807); if (state.failed) return current;
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1173:2: ( (lv_options_5_0= ruleFieldOptions ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1174:1: (lv_options_5_0= ruleFieldOptions )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1174:1: (lv_options_5_0= ruleFieldOptions )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1175:3: lv_options_5_0= ruleFieldOptions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMessageFieldAccess().getOptionsFieldOptionsParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldOptions_in_ruleMessageField2833);
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleMessageField2846); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1203:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1204:2: (iv_ruleGroup= ruleGroup EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1205:2: iv_ruleGroup= ruleGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupRule()); 
            }
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup2882);
            iv_ruleGroup=ruleGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup2892); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1212:1: ruleGroup returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1215:28: ( ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1216:1: ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1216:1: ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1216:2: ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1216:2: ( (lv_modifier_0_0= ruleModifier ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1217:1: (lv_modifier_0_0= ruleModifier )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1217:1: (lv_modifier_0_0= ruleModifier )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1218:3: lv_modifier_0_0= ruleModifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupAccess().getModifierModifierEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleModifier_in_ruleGroup2938);
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

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleGroup2950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getGroupKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1238:1: ( (lv_name_2_0= ruleVar ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1239:1: (lv_name_2_0= ruleVar )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1239:1: (lv_name_2_0= ruleVar )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1240:3: lv_name_2_0= ruleVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupAccess().getNameVarParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_in_ruleGroup2971);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleGroup2983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getEqualsSignKeyword_3());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1260:1: ( (lv_index_4_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1261:1: (lv_index_4_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1261:1: (lv_index_4_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1262:3: lv_index_4_0= RULE_NUMINT
            {
            lv_index_4_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleGroup3000); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleGroup3017); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1282:1: ( (lv_elements_6_0= ruleMessageField ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=37 && LA13_0<=39)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1283:1: (lv_elements_6_0= ruleMessageField )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1283:1: (lv_elements_6_0= ruleMessageField )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1284:3: lv_elements_6_0= ruleMessageField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupAccess().getElementsMessageFieldParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMessageField_in_ruleGroup3038);
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
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleGroup3051); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1312:1: entryRuleTypeLink returns [EObject current=null] : iv_ruleTypeLink= ruleTypeLink EOF ;
    public final EObject entryRuleTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1313:2: (iv_ruleTypeLink= ruleTypeLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1314:2: iv_ruleTypeLink= ruleTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_entryRuleTypeLink3087);
            iv_ruleTypeLink=ruleTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLink3097); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1321:1: ruleTypeLink returns [EObject current=null] : ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink ) ;
    public final EObject ruleTypeLink() throws RecognitionException {
        EObject current = null;

        EObject this_ScalarTypeLink_0 = null;

        EObject this_ComplexTypeLink_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1324:28: ( ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1325:1: ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1325:1: ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1325:2: ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1325:2: ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1325:3: ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLinkAccess().getScalarTypeLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleScalarTypeLink_in_ruleTypeLink3150);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1336:5: this_ComplexTypeLink_1= ruleComplexTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLinkAccess().getComplexTypeLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComplexTypeLink_in_ruleTypeLink3178);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1352:1: entryRuleComplexTypeLink returns [EObject current=null] : iv_ruleComplexTypeLink= ruleComplexTypeLink EOF ;
    public final EObject entryRuleComplexTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTypeLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1353:2: (iv_ruleComplexTypeLink= ruleComplexTypeLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1354:2: iv_ruleComplexTypeLink= ruleComplexTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink3213);
            iv_ruleComplexTypeLink=ruleComplexTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLink3223); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1361:1: ruleComplexTypeLink returns [EObject current=null] : ( ( ruleVar_full ) ) ;
    public final EObject ruleComplexTypeLink() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1364:28: ( ( ( ruleVar_full ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1365:1: ( ( ruleVar_full ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1365:1: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1366:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1366:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1367:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComplexTypeLinkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleComplexTypeLink3270);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1388:1: entryRuleScalarTypeLink returns [EObject current=null] : iv_ruleScalarTypeLink= ruleScalarTypeLink EOF ;
    public final EObject entryRuleScalarTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarTypeLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1389:2: (iv_ruleScalarTypeLink= ruleScalarTypeLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1390:2: iv_ruleScalarTypeLink= ruleScalarTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScalarTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink3305);
            iv_ruleScalarTypeLink=ruleScalarTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScalarTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarTypeLink3315); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1397:1: ruleScalarTypeLink returns [EObject current=null] : ( (lv_target_0_0= ruleScalarType ) ) ;
    public final EObject ruleScalarTypeLink() throws RecognitionException {
        EObject current = null;

        Enumerator lv_target_0_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1400:28: ( ( (lv_target_0_0= ruleScalarType ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1401:1: ( (lv_target_0_0= ruleScalarType ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1401:1: ( (lv_target_0_0= ruleScalarType ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1402:1: (lv_target_0_0= ruleScalarType )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1402:1: (lv_target_0_0= ruleScalarType )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1403:3: lv_target_0_0= ruleScalarType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScalarTypeLinkAccess().getTargetScalarTypeEnumRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleScalarType_in_ruleScalarTypeLink3360);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1427:1: entryRuleFieldOptions returns [EObject current=null] : iv_ruleFieldOptions= ruleFieldOptions EOF ;
    public final EObject entryRuleFieldOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOptions = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1428:2: (iv_ruleFieldOptions= ruleFieldOptions EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1429:2: iv_ruleFieldOptions= ruleFieldOptions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldOptionsRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions3395);
            iv_ruleFieldOptions=ruleFieldOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldOptions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOptions3405); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1436:1: ruleFieldOptions returns [EObject current=null] : (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleFieldOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_options_1_0 = null;

        EObject lv_options_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1439:28: ( (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1440:1: (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1440:1: (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1440:3: otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleFieldOptions3442); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFieldOptionsAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1444:1: ( (lv_options_1_0= ruleFieldOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1445:1: (lv_options_1_0= ruleFieldOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1445:1: (lv_options_1_0= ruleFieldOption )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1446:3: lv_options_1_0= ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFieldOption_in_ruleFieldOptions3463);
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1462:2: (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1462:4: otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleFieldOptions3476); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFieldOptionsAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1466:1: ( (lv_options_3_0= ruleFieldOption ) )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1467:1: (lv_options_3_0= ruleFieldOption )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1467:1: (lv_options_3_0= ruleFieldOption )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1468:3: lv_options_3_0= ruleFieldOption
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFieldOption_in_ruleFieldOptions3497);
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
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleFieldOptions3511); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1496:1: entryRuleFieldOption returns [EObject current=null] : iv_ruleFieldOption= ruleFieldOption EOF ;
    public final EObject entryRuleFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1497:2: (iv_ruleFieldOption= ruleFieldOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1498:2: iv_ruleFieldOption= ruleFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_entryRuleFieldOption3547);
            iv_ruleFieldOption=ruleFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOption3557); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1505:1: ruleFieldOption returns [EObject current=null] : ( ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption ) | this_NativeFieldOption_1= ruleNativeFieldOption ) ;
    public final EObject ruleFieldOption() throws RecognitionException {
        EObject current = null;

        EObject this_DefaultValueFieldOption_0 = null;

        EObject this_NativeFieldOption_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1508:28: ( ( ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption ) | this_NativeFieldOption_1= ruleNativeFieldOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1509:1: ( ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption ) | this_NativeFieldOption_1= ruleNativeFieldOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1509:1: ( ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption ) | this_NativeFieldOption_1= ruleNativeFieldOption )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1509:2: ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1509:2: ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1509:3: ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldOptionAccess().getDefaultValueFieldOptionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_ruleFieldOption3612);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1521:5: this_NativeFieldOption_1= ruleNativeFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldOptionAccess().getNativeFieldOptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNativeFieldOption_in_ruleFieldOption3640);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1537:1: entryRuleDefaultValueFieldOption returns [EObject current=null] : iv_ruleDefaultValueFieldOption= ruleDefaultValueFieldOption EOF ;
    public final EObject entryRuleDefaultValueFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValueFieldOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1538:2: (iv_ruleDefaultValueFieldOption= ruleDefaultValueFieldOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1539:2: iv_ruleDefaultValueFieldOption= ruleDefaultValueFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultValueFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption3675);
            iv_ruleDefaultValueFieldOption=ruleDefaultValueFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultValueFieldOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValueFieldOption3685); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1546:1: ruleDefaultValueFieldOption returns [EObject current=null] : ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleDefaultValueFieldOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1549:28: ( ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1550:1: ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1550:1: ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1550:2: ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1550:2: ( ( 'default' )=>otherlv_0= 'default' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1550:3: ( 'default' )=>otherlv_0= 'default'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleDefaultValueFieldOption3730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDefaultValueFieldOptionAccess().getDefaultKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDefaultValueFieldOption3743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefaultValueFieldOptionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1559:1: ( (lv_value_2_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1560:1: (lv_value_2_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1560:1: (lv_value_2_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1561:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefaultValueFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleDefaultValueFieldOption3764);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1585:1: entryRuleNativeFieldOption returns [EObject current=null] : iv_ruleNativeFieldOption= ruleNativeFieldOption EOF ;
    public final EObject entryRuleNativeFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeFieldOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1586:2: (iv_ruleNativeFieldOption= ruleNativeFieldOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1587:2: iv_ruleNativeFieldOption= ruleNativeFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNativeFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption3800);
            iv_ruleNativeFieldOption=ruleNativeFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNativeFieldOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeFieldOption3810); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1594:1: ruleNativeFieldOption returns [EObject current=null] : ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleNativeFieldOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_source_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1597:28: ( ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1598:1: ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1598:1: ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1598:2: ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1598:2: ( (lv_source_0_0= ruleOptionSource ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1599:1: (lv_source_0_0= ruleOptionSource )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1599:1: (lv_source_0_0= ruleOptionSource )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1600:3: lv_source_0_0= ruleOptionSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNativeFieldOptionAccess().getSourceOptionSourceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOptionSource_in_ruleNativeFieldOption3856);
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleNativeFieldOption3868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNativeFieldOptionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1620:1: ( (lv_value_2_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1621:1: (lv_value_2_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1621:1: (lv_value_2_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1622:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNativeFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleNativeFieldOption3889);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1646:1: entryRuleOptionSource returns [EObject current=null] : iv_ruleOptionSource= ruleOptionSource EOF ;
    public final EObject entryRuleOptionSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionSource = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1647:2: (iv_ruleOptionSource= ruleOptionSource EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1648:2: iv_ruleOptionSource= ruleOptionSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionSourceRule()); 
            }
            pushFollow(FOLLOW_ruleOptionSource_in_entryRuleOptionSource3925);
            iv_ruleOptionSource=ruleOptionSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionSource3935); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1655:1: ruleOptionSource returns [EObject current=null] : ( ( ruleVar_full ) ) ;
    public final EObject ruleOptionSource() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1658:28: ( ( ( ruleVar_full ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1659:1: ( ( ruleVar_full ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1659:1: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1660:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1660:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1661:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOptionSourceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionSourceAccess().getTargetIndexedElementCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleOptionSource3982);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1682:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1683:2: (iv_ruleEnum= ruleEnum EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1684:2: iv_ruleEnum= ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum4017);
            iv_ruleEnum=ruleEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum4027); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1691:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1694:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1695:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1695:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1695:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleEnum4064); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1699:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1700:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1700:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1701:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum4081); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleEnum4098); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1721:1: ( (lv_elements_3_0= ruleEnumElement ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1722:1: (lv_elements_3_0= ruleEnumElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1722:1: (lv_elements_3_0= ruleEnumElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1723:3: lv_elements_3_0= ruleEnumElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumElement_in_ruleEnum4119);
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
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleEnum4132); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1751:1: entryRuleEnumElement returns [EObject current=null] : iv_ruleEnumElement= ruleEnumElement EOF ;
    public final EObject entryRuleEnumElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1752:2: (iv_ruleEnumElement= ruleEnumElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1753:2: iv_ruleEnumElement= ruleEnumElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumElementRule()); 
            }
            pushFollow(FOLLOW_ruleEnumElement_in_entryRuleEnumElement4168);
            iv_ruleEnumElement=ruleEnumElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumElement4178); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1760:1: ruleEnumElement returns [EObject current=null] : (this_EnumField_0= ruleEnumField | this_Option_1= ruleOption ) ;
    public final EObject ruleEnumElement() throws RecognitionException {
        EObject current = null;

        EObject this_EnumField_0 = null;

        EObject this_Option_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1763:28: ( (this_EnumField_0= ruleEnumField | this_Option_1= ruleOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1764:1: (this_EnumField_0= ruleEnumField | this_Option_1= ruleOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1764:1: (this_EnumField_0= ruleEnumField | this_Option_1= ruleOption )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==18) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1765:5: this_EnumField_0= ruleEnumField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumElementAccess().getEnumFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumField_in_ruleEnumElement4225);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1775:5: this_Option_1= ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumElementAccess().getOptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOption_in_ruleEnumElement4252);
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
    // $ANTLR end "ruleEnumElement"


    // $ANTLR start "entryRuleEnumField"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1791:1: entryRuleEnumField returns [EObject current=null] : iv_ruleEnumField= ruleEnumField EOF ;
    public final EObject entryRuleEnumField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumField = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1792:2: (iv_ruleEnumField= ruleEnumField EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1793:2: iv_ruleEnumField= ruleEnumField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumFieldRule()); 
            }
            pushFollow(FOLLOW_ruleEnumField_in_entryRuleEnumField4287);
            iv_ruleEnumField=ruleEnumField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumField4297); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1800:1: ruleEnumField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1803:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1804:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1804:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1804:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1804:2: ( (lv_name_0_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1805:1: (lv_name_0_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1805:1: (lv_name_0_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1806:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumField4339); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleEnumField4356); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumFieldAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1826:1: ( (lv_index_2_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1827:1: (lv_index_2_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1827:1: (lv_index_2_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1828:3: lv_index_2_0= RULE_NUMINT
            {
            lv_index_2_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleEnumField4373); if (state.failed) return current;
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1844:2: (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1844:4: otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleEnumField4391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEnumFieldAccess().getLeftSquareBracketKeyword_3_0());
                          
                    }
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1848:1: ( (lv_options_4_0= ruleFieldOption ) )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1849:1: (lv_options_4_0= ruleFieldOption )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1849:1: (lv_options_4_0= ruleFieldOption )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1850:3: lv_options_4_0= ruleFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldOption_in_ruleEnumField4412);
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

                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1866:2: (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==26) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1866:4: otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) )
                    	    {
                    	    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleEnumField4425); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEnumFieldAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1870:1: ( (lv_options_6_0= ruleFieldOption ) )
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1871:1: (lv_options_6_0= ruleFieldOption )
                    	    {
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1871:1: (lv_options_6_0= ruleFieldOption )
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1872:3: lv_options_6_0= ruleFieldOption
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFieldOption_in_ruleEnumField4446);
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
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleEnumField4460); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEnumFieldAccess().getRightSquareBracketKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleEnumField4474); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1904:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1905:2: (iv_ruleService= ruleService EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1906:2: iv_ruleService= ruleService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService4510);
            iv_ruleService=ruleService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleService; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService4520); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1913:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )+ otherlv_4= '}' (otherlv_5= ';' )? ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1916:28: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )+ otherlv_4= '}' (otherlv_5= ';' )? ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1917:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )+ otherlv_4= '}' (otherlv_5= ';' )? )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1917:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )+ otherlv_4= '}' (otherlv_5= ';' )? )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1917:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )+ otherlv_4= '}' (otherlv_5= ';' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleService4557); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1921:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1922:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1922:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1923:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService4574); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleService4591); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1943:1: ( (lv_elements_3_0= ruleServiceElement ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==18||LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1944:1: (lv_elements_3_0= ruleServiceElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1944:1: (lv_elements_3_0= ruleServiceElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1945:3: lv_elements_3_0= ruleServiceElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceAccess().getElementsServiceElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleServiceElement_in_ruleService4612);
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
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleService4625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1965:1: (otherlv_5= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==15) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1965:3: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleService4638); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1977:1: entryRuleServiceElement returns [EObject current=null] : iv_ruleServiceElement= ruleServiceElement EOF ;
    public final EObject entryRuleServiceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1978:2: (iv_ruleServiceElement= ruleServiceElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1979:2: iv_ruleServiceElement= ruleServiceElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceElementRule()); 
            }
            pushFollow(FOLLOW_ruleServiceElement_in_entryRuleServiceElement4676);
            iv_ruleServiceElement=ruleServiceElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleServiceElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceElement4686); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1986:1: ruleServiceElement returns [EObject current=null] : (this_Rpc_0= ruleRpc | this_Option_1= ruleOption ) ;
    public final EObject ruleServiceElement() throws RecognitionException {
        EObject current = null;

        EObject this_Rpc_0 = null;

        EObject this_Option_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1989:28: ( (this_Rpc_0= ruleRpc | this_Option_1= ruleOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1990:1: (this_Rpc_0= ruleRpc | this_Option_1= ruleOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1990:1: (this_Rpc_0= ruleRpc | this_Option_1= ruleOption )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            else if ( (LA23_0==18) ) {
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1991:5: this_Rpc_0= ruleRpc
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getServiceElementAccess().getRpcParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRpc_in_ruleServiceElement4733);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2001:5: this_Option_1= ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getServiceElementAccess().getOptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOption_in_ruleServiceElement4760);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2017:1: entryRuleRpc returns [EObject current=null] : iv_ruleRpc= ruleRpc EOF ;
    public final EObject entryRuleRpc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRpc = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2018:2: (iv_ruleRpc= ruleRpc EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2019:2: iv_ruleRpc= ruleRpc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRpcRule()); 
            }
            pushFollow(FOLLOW_ruleRpc_in_entryRuleRpc4795);
            iv_ruleRpc=ruleRpc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRpc; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRpc4805); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2026:1: ruleRpc returns [EObject current=null] : (otherlv_0= 'rpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? (otherlv_12= ';' )+ ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2029:28: ( (otherlv_0= 'rpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? (otherlv_12= ';' )+ ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2030:1: (otherlv_0= 'rpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? (otherlv_12= ';' )+ )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2030:1: (otherlv_0= 'rpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? (otherlv_12= ';' )+ )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2030:3: otherlv_0= 'rpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? (otherlv_12= ';' )+
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleRpc4842); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRpcAccess().getRpcKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2034:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2035:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2035:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2036:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRpc4859); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleRpc4876); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRpcAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2056:1: ( (lv_argType_3_0= ruleMessageLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2057:1: (lv_argType_3_0= ruleMessageLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2057:1: (lv_argType_3_0= ruleMessageLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2058:3: lv_argType_3_0= ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRpcAccess().getArgTypeMessageLinkParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMessageLink_in_ruleRpc4897);
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

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleRpc4909); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRpcAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleRpc4921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRpcAccess().getReturnsKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleRpc4933); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getRpcAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2086:1: ( (lv_returnType_7_0= ruleMessageLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2087:1: (lv_returnType_7_0= ruleMessageLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2087:1: (lv_returnType_7_0= ruleMessageLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2088:3: lv_returnType_7_0= ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRpcAccess().getReturnTypeMessageLinkParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMessageLink_in_ruleRpc4954);
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

            otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleRpc4966); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRpcAccess().getRightParenthesisKeyword_8());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2108:1: (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2108:3: otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleRpc4979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getRpcAccess().getLeftCurlyBracketKeyword_9_0());
                          
                    }
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2112:1: ( (lv_options_10_0= ruleOption ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==18) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2113:1: (lv_options_10_0= ruleOption )
                    	    {
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2113:1: (lv_options_10_0= ruleOption )
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2114:3: lv_options_10_0= ruleOption
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRpcAccess().getOptionsOptionParserRuleCall_9_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOption_in_ruleRpc5000);
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
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleRpc5013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getRpcAccess().getRightCurlyBracketKeyword_9_2());
                          
                    }

                    }
                    break;

            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2134:3: (otherlv_12= ';' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==15) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2134:5: otherlv_12= ';'
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleRpc5028); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getRpcAccess().getSemicolonKeyword_10());
            	          
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2146:1: entryRuleMessageLink returns [EObject current=null] : iv_ruleMessageLink= ruleMessageLink EOF ;
    public final EObject entryRuleMessageLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2147:2: (iv_ruleMessageLink= ruleMessageLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2148:2: iv_ruleMessageLink= ruleMessageLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageLinkRule()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_entryRuleMessageLink5066);
            iv_ruleMessageLink=ruleMessageLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageLink5076); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2155:1: ruleMessageLink returns [EObject current=null] : ( ( ruleFULL_ID ) ) ;
    public final EObject ruleMessageLink() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2158:28: ( ( ( ruleFULL_ID ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2159:1: ( ( ruleFULL_ID ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2159:1: ( ( ruleFULL_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2160:1: ( ruleFULL_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2160:1: ( ruleFULL_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2161:3: ruleFULL_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMessageLinkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageLinkAccess().getTargetMessageCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_ruleMessageLink5123);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2182:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2183:2: (iv_ruleExtend= ruleExtend EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2184:2: iv_ruleExtend= ruleExtend EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendRule()); 
            }
            pushFollow(FOLLOW_ruleExtend_in_entryRuleExtend5158);
            iv_ruleExtend=ruleExtend();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtend; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtend5168); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2191:1: ruleExtend returns [EObject current=null] : (otherlv_0= 'extend' ( ( ruleFULL_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2194:28: ( (otherlv_0= 'extend' ( ( ruleFULL_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2195:1: (otherlv_0= 'extend' ( ( ruleFULL_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' (otherlv_5= ';' )? )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2195:1: (otherlv_0= 'extend' ( ( ruleFULL_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' (otherlv_5= ';' )? )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2195:3: otherlv_0= 'extend' ( ( ruleFULL_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' (otherlv_5= ';' )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleExtend5205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtendKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2199:1: ( ( ruleFULL_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2200:1: ( ruleFULL_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2200:1: ( ruleFULL_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2201:3: ruleFULL_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExtendRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExtendAccess().getTypeMessageCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_ruleExtend5228);
            ruleFULL_ID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleExtend5240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2218:1: ( (lv_elements_3_0= ruleMessageElement ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=18 && LA27_0<=19)||LA27_0==22||(LA27_0>=29 && LA27_0<=30)||LA27_0==35||(LA27_0>=37 && LA27_0<=39)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2219:1: (lv_elements_3_0= ruleMessageElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2219:1: (lv_elements_3_0= ruleMessageElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2220:3: lv_elements_3_0= ruleMessageElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExtendAccess().getElementsMessageElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMessageElement_in_ruleExtend5261);
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
            	    break loop27;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleExtend5274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_4());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2240:1: (otherlv_5= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==15) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2240:3: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleExtend5287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getExtendAccess().getSemicolonKeyword_5());
                          
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
    // $ANTLR end "ruleExtend"


    // $ANTLR start "entryRuleVar_full"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2252:1: entryRuleVar_full returns [String current=null] : iv_ruleVar_full= ruleVar_full EOF ;
    public final String entryRuleVar_full() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVar_full = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2253:2: (iv_ruleVar_full= ruleVar_full EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2254:2: iv_ruleVar_full= ruleVar_full EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVar_fullRule()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_entryRuleVar_full5326);
            iv_ruleVar_full=ruleVar_full();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar_full.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar_full5337); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2261:1: ruleVar_full returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar ) ;
    public final AntlrDatatypeRuleToken ruleVar_full() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FULL_ID_0 = null;

        AntlrDatatypeRuleToken this_Var_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2264:28: ( (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2265:1: (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2265:1: (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==EOF||LA29_1==RULE_ID||(LA29_1>=13 && LA29_1<=19)||(LA29_1>=22 && LA29_1<=24)||(LA29_1>=28 && LA29_1<=31)||(LA29_1>=34 && LA29_1<=35)||(LA29_1>=37 && LA29_1<=56)) ) {
                    alt29=2;
                }
                else if ( (LA29_1==36) ) {
                    alt29=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA29_0==13||(LA29_0>=16 && LA29_0<=19)||(LA29_0>=22 && LA29_0<=24)||(LA29_0>=28 && LA29_0<=31)||(LA29_0>=34 && LA29_0<=35)||(LA29_0>=37 && LA29_0<=56)) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2266:5: this_FULL_ID_0= ruleFULL_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVar_fullAccess().getFULL_IDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFULL_ID_in_ruleVar_full5384);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2278:5: this_Var_1= ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVar_fullAccess().getVarParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVar_in_ruleVar_full5417);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2296:1: entryRuleVar returns [String current=null] : iv_ruleVar= ruleVar EOF ;
    public final String entryRuleVar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVar = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2297:2: (iv_ruleVar= ruleVar EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2298:2: iv_ruleVar= ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar5463);
            iv_ruleVar=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar5474); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2305:1: ruleVar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved ) ;
    public final AntlrDatatypeRuleToken ruleVar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_VarReserved_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2308:28: ( (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2309:1: (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2309:1: (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( (LA30_0==13||(LA30_0>=16 && LA30_0<=19)||(LA30_0>=22 && LA30_0<=24)||(LA30_0>=28 && LA30_0<=31)||(LA30_0>=34 && LA30_0<=35)||(LA30_0>=37 && LA30_0<=56)) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2309:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVar5514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getVarAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2318:5: this_VarReserved_1= ruleVarReserved
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarAccess().getVarReservedParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarReserved_in_ruleVar5547);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2336:1: entryRuleFULL_ID returns [String current=null] : iv_ruleFULL_ID= ruleFULL_ID EOF ;
    public final String entryRuleFULL_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFULL_ID = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2337:2: (iv_ruleFULL_ID= ruleFULL_ID EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2338:2: iv_ruleFULL_ID= ruleFULL_ID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFULL_IDRule()); 
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID5593);
            iv_ruleFULL_ID=ruleFULL_ID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFULL_ID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFULL_ID5604); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2345:1: ruleFULL_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleFULL_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2348:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2349:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2349:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2349:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFULL_ID5644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2356:1: (kw= '.' this_ID_2= RULE_ID )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==36) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2357:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FOLLOW_36_in_ruleFULL_ID5663); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFULL_IDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFULL_ID5678); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2377:1: entryRuleVarReserved returns [String current=null] : iv_ruleVarReserved= ruleVarReserved EOF ;
    public final String entryRuleVarReserved() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarReserved = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2378:2: (iv_ruleVarReserved= ruleVarReserved EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2379:2: iv_ruleVarReserved= ruleVarReserved EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarReservedRule()); 
            }
            pushFollow(FOLLOW_ruleVarReserved_in_entryRuleVarReserved5726);
            iv_ruleVarReserved=ruleVarReserved();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarReserved.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarReserved5737); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2386:1: ruleVarReserved returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' ) ;
    public final AntlrDatatypeRuleToken ruleVarReserved() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2389:28: ( (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2390:1: (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2390:1: (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' )
            int alt32=34;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt32=1;
                }
                break;
            case 16:
                {
                alt32=2;
                }
                break;
            case 13:
                {
                alt32=3;
                }
                break;
            case 17:
                {
                alt32=4;
                }
                break;
            case 18:
                {
                alt32=5;
                }
                break;
            case 19:
                {
                alt32=6;
                }
                break;
            case 30:
                {
                alt32=7;
                }
                break;
            case 29:
                {
                alt32=8;
                }
                break;
            case 37:
                {
                alt32=9;
                }
                break;
            case 38:
                {
                alt32=10;
                }
                break;
            case 39:
                {
                alt32=11;
                }
                break;
            case 22:
                {
                alt32=12;
                }
                break;
            case 35:
                {
                alt32=13;
                }
                break;
            case 24:
                {
                alt32=14;
                }
                break;
            case 31:
                {
                alt32=15;
                }
                break;
            case 34:
                {
                alt32=16;
                }
                break;
            case 40:
                {
                alt32=17;
                }
                break;
            case 41:
                {
                alt32=18;
                }
                break;
            case 42:
                {
                alt32=19;
                }
                break;
            case 43:
                {
                alt32=20;
                }
                break;
            case 44:
                {
                alt32=21;
                }
                break;
            case 45:
                {
                alt32=22;
                }
                break;
            case 46:
                {
                alt32=23;
                }
                break;
            case 47:
                {
                alt32=24;
                }
                break;
            case 48:
                {
                alt32=25;
                }
                break;
            case 49:
                {
                alt32=26;
                }
                break;
            case 50:
                {
                alt32=27;
                }
                break;
            case 51:
                {
                alt32=28;
                }
                break;
            case 52:
                {
                alt32=29;
                }
                break;
            case 53:
                {
                alt32=30;
                }
                break;
            case 54:
                {
                alt32=31;
                }
                break;
            case 28:
                {
                alt32=32;
                }
                break;
            case 55:
                {
                alt32=33;
                }
                break;
            case 56:
                {
                alt32=34;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2391:2: kw= 'to'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleVarReserved5775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getToKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2398:2: kw= 'package'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleVarReserved5794); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getPackageKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2405:2: kw= 'syntax'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleVarReserved5813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSyntaxKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2412:2: kw= 'import'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleVarReserved5832); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getImportKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2419:2: kw= 'option'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleVarReserved5851); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getOptionKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2426:2: kw= 'message'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleVarReserved5870); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getMessageKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2433:2: kw= 'service'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleVarReserved5889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getServiceKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2440:2: kw= 'enum'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleVarReserved5908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getEnumKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2447:2: kw= 'required'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleVarReserved5927); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getRequiredKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2454:2: kw= 'optional'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleVarReserved5946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getOptionalKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2461:2: kw= 'repeated'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleVarReserved5965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getRepeatedKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2468:2: kw= 'extensions'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleVarReserved5984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getExtensionsKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2475:2: kw= 'extend'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleVarReserved6003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getExtendKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2482:2: kw= 'group'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleVarReserved6022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getGroupKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2489:2: kw= 'rpc'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleVarReserved6041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getRpcKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2496:2: kw= 'returns'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleVarReserved6060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getReturnsKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2503:2: kw= 'int32'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleVarReserved6079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getInt32Keyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2510:2: kw= 'int64'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleVarReserved6098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getInt64Keyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2517:2: kw= 'uint32'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleVarReserved6117); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getUint32Keyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2524:2: kw= 'uint64'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleVarReserved6136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getUint64Keyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2531:2: kw= 'sint32'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleVarReserved6155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSint32Keyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2538:2: kw= 'sint64'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleVarReserved6174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSint64Keyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2545:2: kw= 'fixed32'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleVarReserved6193); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getFixed32Keyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2552:2: kw= 'fixed64'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleVarReserved6212); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getFixed64Keyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2559:2: kw= 'sfixed32'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleVarReserved6231); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSfixed32Keyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2566:2: kw= 'sfixed64'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleVarReserved6250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSfixed64Keyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2573:2: kw= 'float'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleVarReserved6269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getFloatKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2580:2: kw= 'double'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleVarReserved6288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getDoubleKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2587:2: kw= 'bool'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleVarReserved6307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getBoolKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2594:2: kw= 'string'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleVarReserved6326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getStringKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2601:2: kw= 'bytes'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleVarReserved6345); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getBytesKeyword_30()); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2608:2: kw= 'default'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleVarReserved6364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getDefaultKeyword_31()); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2615:2: kw= 'max'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleVarReserved6383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getMaxKeyword_32()); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2622:2: kw= 'void'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleVarReserved6402); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2637:1: ruleBOOL returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBOOL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2639:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2640:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2640:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==57) ) {
                alt33=1;
            }
            else if ( (LA33_0==58) ) {
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2640:2: (enumLiteral_0= 'true' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2640:2: (enumLiteral_0= 'true' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2640:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleBOOL6458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2646:6: (enumLiteral_1= 'false' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2646:6: (enumLiteral_1= 'false' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2646:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleBOOL6475); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2656:1: ruleModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) ) ;
    public final Enumerator ruleModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2658:28: ( ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2659:1: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2659:1: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt34=1;
                }
                break;
            case 37:
                {
                alt34=2;
                }
                break;
            case 39:
                {
                alt34=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2659:2: (enumLiteral_0= 'optional' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2659:2: (enumLiteral_0= 'optional' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2659:4: enumLiteral_0= 'optional'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_38_in_ruleModifier6520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2665:6: (enumLiteral_1= 'required' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2665:6: (enumLiteral_1= 'required' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2665:8: enumLiteral_1= 'required'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_37_in_ruleModifier6537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2671:6: (enumLiteral_2= 'repeated' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2671:6: (enumLiteral_2= 'repeated' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2671:8: enumLiteral_2= 'repeated'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleModifier6554); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2681:1: ruleScalarType returns [Enumerator current=null] : ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2683:28: ( ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2684:1: ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2684:1: ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) )
            int alt35=15;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt35=1;
                }
                break;
            case 41:
                {
                alt35=2;
                }
                break;
            case 42:
                {
                alt35=3;
                }
                break;
            case 43:
                {
                alt35=4;
                }
                break;
            case 44:
                {
                alt35=5;
                }
                break;
            case 45:
                {
                alt35=6;
                }
                break;
            case 46:
                {
                alt35=7;
                }
                break;
            case 47:
                {
                alt35=8;
                }
                break;
            case 48:
                {
                alt35=9;
                }
                break;
            case 49:
                {
                alt35=10;
                }
                break;
            case 50:
                {
                alt35=11;
                }
                break;
            case 51:
                {
                alt35=12;
                }
                break;
            case 52:
                {
                alt35=13;
                }
                break;
            case 53:
                {
                alt35=14;
                }
                break;
            case 54:
                {
                alt35=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2684:2: (enumLiteral_0= 'int32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2684:2: (enumLiteral_0= 'int32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2684:4: enumLiteral_0= 'int32'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleScalarType6599); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2690:6: (enumLiteral_1= 'int64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2690:6: (enumLiteral_1= 'int64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2690:8: enumLiteral_1= 'int64'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleScalarType6616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2696:6: (enumLiteral_2= 'uint32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2696:6: (enumLiteral_2= 'uint32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2696:8: enumLiteral_2= 'uint32'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleScalarType6633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2702:6: (enumLiteral_3= 'uint64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2702:6: (enumLiteral_3= 'uint64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2702:8: enumLiteral_3= 'uint64'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_43_in_ruleScalarType6650); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2708:6: (enumLiteral_4= 'sint32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2708:6: (enumLiteral_4= 'sint32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2708:8: enumLiteral_4= 'sint32'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_44_in_ruleScalarType6667); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2714:6: (enumLiteral_5= 'sint64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2714:6: (enumLiteral_5= 'sint64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2714:8: enumLiteral_5= 'sint64'
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_45_in_ruleScalarType6684); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2720:6: (enumLiteral_6= 'fixed32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2720:6: (enumLiteral_6= 'fixed32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2720:8: enumLiteral_6= 'fixed32'
                    {
                    enumLiteral_6=(Token)match(input,46,FOLLOW_46_in_ruleScalarType6701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2726:6: (enumLiteral_7= 'fixed64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2726:6: (enumLiteral_7= 'fixed64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2726:8: enumLiteral_7= 'fixed64'
                    {
                    enumLiteral_7=(Token)match(input,47,FOLLOW_47_in_ruleScalarType6718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2732:6: (enumLiteral_8= 'sfixed32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2732:6: (enumLiteral_8= 'sfixed32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2732:8: enumLiteral_8= 'sfixed32'
                    {
                    enumLiteral_8=(Token)match(input,48,FOLLOW_48_in_ruleScalarType6735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2738:6: (enumLiteral_9= 'sfixed64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2738:6: (enumLiteral_9= 'sfixed64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2738:8: enumLiteral_9= 'sfixed64'
                    {
                    enumLiteral_9=(Token)match(input,49,FOLLOW_49_in_ruleScalarType6752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2744:6: (enumLiteral_10= 'float' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2744:6: (enumLiteral_10= 'float' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2744:8: enumLiteral_10= 'float'
                    {
                    enumLiteral_10=(Token)match(input,50,FOLLOW_50_in_ruleScalarType6769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2750:6: (enumLiteral_11= 'double' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2750:6: (enumLiteral_11= 'double' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2750:8: enumLiteral_11= 'double'
                    {
                    enumLiteral_11=(Token)match(input,51,FOLLOW_51_in_ruleScalarType6786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2756:6: (enumLiteral_12= 'bool' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2756:6: (enumLiteral_12= 'bool' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2756:8: enumLiteral_12= 'bool'
                    {
                    enumLiteral_12=(Token)match(input,52,FOLLOW_52_in_ruleScalarType6803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2762:6: (enumLiteral_13= 'string' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2762:6: (enumLiteral_13= 'string' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2762:8: enumLiteral_13= 'string'
                    {
                    enumLiteral_13=(Token)match(input,53,FOLLOW_53_in_ruleScalarType6820); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2768:6: (enumLiteral_14= 'bytes' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2768:6: (enumLiteral_14= 'bytes' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2768:8: enumLiteral_14= 'bytes'
                    {
                    enumLiteral_14=(Token)match(input,54,FOLLOW_54_in_ruleScalarType6837); if (state.failed) return current;
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
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1325:3: ( ruleScalarTypeLink )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1325:5: ruleScalarTypeLink
        {
        pushFollow(FOLLOW_ruleScalarTypeLink_in_synpred1_InternalProtobuf3134);
        ruleScalarTypeLink();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalProtobuf

    // $ANTLR start synpred2_InternalProtobuf
    public final void synpred2_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1509:3: ( 'default' )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1509:5: 'default'
        {
        match(input,28,FOLLOW_28_in_synpred2_InternalProtobuf3594); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalProtobuf

    // Delegated rules

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


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA10_eotS =
        "\54\uffff";
    static final String DFA10_eofS =
        "\54\uffff";
    static final String DFA10_minS =
        "\1\45\4\5\1\uffff\43\16\1\6\1\17\1\uffff";
    static final String DFA10_maxS =
        "\1\47\4\70\1\uffff\43\16\1\6\1\31\1\uffff";
    static final String DFA10_acceptS =
        "\5\uffff\1\1\45\uffff\1\2";
    static final String DFA10_specialS =
        "\54\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\1\1\3",
            "\1\5\7\uffff\1\5\2\uffff\4\5\2\uffff\2\5\1\4\3\uffff\4\5\2\uffff\2\5\1\uffff\24\5",
            "\1\5\7\uffff\1\5\2\uffff\4\5\2\uffff\2\5\1\4\3\uffff\4\5\2\uffff\2\5\1\uffff\24\5",
            "\1\5\7\uffff\1\5\2\uffff\4\5\2\uffff\2\5\1\4\3\uffff\4\5\2\uffff\2\5\1\uffff\24\5",
            "\1\6\7\uffff\1\11\2\uffff\1\10\1\12\1\13\1\14\2\uffff\1\22\1\7\1\24\3\uffff\1\46\1\16\1\15\1\25\2\uffff\1\26\1\23\1\uffff\1\17\1\20\1\21\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\47\1\50",
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
            "\1\5\4\uffff\1\53\4\uffff\1\5",
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
            return "988:1: (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup )";
        }
    }
    static final String DFA14_eotS =
        "\22\uffff";
    static final String DFA14_eofS =
        "\22\uffff";
    static final String DFA14_minS =
        "\1\5\17\0\2\uffff";
    static final String DFA14_maxS =
        "\1\70\17\0\2\uffff";
    static final String DFA14_acceptS =
        "\20\uffff\1\2\1\1";
    static final String DFA14_specialS =
        "\1\uffff\1\0\1\11\1\6\1\16\1\4\1\14\1\12\1\3\1\10\1\1\1\15\1\7\1\13\1\5\1\2\2\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\20\7\uffff\1\20\2\uffff\4\20\2\uffff\3\20\3\uffff\4\20\2\uffff\2\20\1\uffff\3\20\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\2\20",
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1325:1: ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_1 = input.LA(1);

                         
                        int index14_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_10 = input.LA(1);

                         
                        int index14_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_15 = input.LA(1);

                         
                        int index14_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_15);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_8 = input.LA(1);

                         
                        int index14_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_14 = input.LA(1);

                         
                        int index14_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_14);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_12 = input.LA(1);

                         
                        int index14_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_9 = input.LA(1);

                         
                        int index14_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA14_13 = input.LA(1);

                         
                        int index14_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA14_6 = input.LA(1);

                         
                        int index14_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_6);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA14_11 = input.LA(1);

                         
                        int index14_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_11);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA16_eotS =
        "\13\uffff";
    static final String DFA16_eofS =
        "\13\uffff";
    static final String DFA16_minS =
        "\1\5\1\16\1\uffff\1\4\6\0\1\uffff";
    static final String DFA16_maxS =
        "\1\70\1\16\1\uffff\1\72\6\0\1\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\7\uffff\1\1";
    static final String DFA16_specialS =
        "\4\uffff\1\2\1\4\1\5\1\0\1\3\1\1\1\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\7\uffff\1\2\2\uffff\4\2\2\uffff\3\2\3\uffff\1\1\3\2\2\uffff\2\2\1\uffff\24\2",
            "\1\3",
            "",
            "\1\10\1\11\1\4\1\5\61\uffff\1\6\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1509:1: ( ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption ) | this_NativeFieldOption_1= ruleNativeFieldOption )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_7 = input.LA(1);

                         
                        int index16_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index16_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_9 = input.LA(1);

                         
                        int index16_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index16_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_4 = input.LA(1);

                         
                        int index16_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index16_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_8 = input.LA(1);

                         
                        int index16_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index16_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_5 = input.LA(1);

                         
                        int index16_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index16_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index16_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleProto_in_entryRuleProto75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProto85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_ruleProto131 = new BitSet(new long[]{0x000000E8600F0002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProto153 = new BitSet(new long[]{0x000000E8600F0002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleStatement247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleStatement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_ruleStatement301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_ruleStatement328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleStatement355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_ruleStatement382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_entryRuleSyntax417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntax427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSyntax464 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSyntax476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSyntax493 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSyntax510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePackage593 = new BitSet(new long[]{0x01FFFFECF1CF2020L});
    public static final BitSet FOLLOW_ruleVar_full_in_rulePackage614 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePackage626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleImport709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport726 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImport743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOption826 = new BitSet(new long[]{0x01FFFFECF1CF2020L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleOption849 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleOption861 = new BitSet(new long[]{0x06000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleOption882 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOption894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_ruleValue986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_entryRuleSimpleValueLink1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValueLink1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_ruleSimpleValueLink1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_ruleSimpleValueLink1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_ruleSimpleValueLink1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLink_in_ruleSimpleValueLink1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLink_in_entryRuleEnumLink1193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLink1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLink1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_entryRuleStringLink1282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLink1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLink1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink1373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLink1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleBooleanLink1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_entryRuleNumberLink1463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLink1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_ruleNumberLink1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_ruleNumberLink1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_entryRuleIntLink1582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLink1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleIntLink1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink1673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLink1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMDOUBLE_in_ruleDoubleLink1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType1764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleComplexType1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_ruleComplexType1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType1883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensibleType1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleExtensibleType1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleExtensibleType1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage2002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMessage2049 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage2066 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMessage2083 = new BitSet(new long[]{0x000000E8606F0000L});
    public static final BitSet FOLLOW_ruleMessageElement_in_ruleMessage2104 = new BitSet(new long[]{0x000000E8606F0000L});
    public static final BitSet FOLLOW_21_in_ruleMessage2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_entryRuleMessageElement2153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageElement2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleMessageElement2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_ruleMessageElement2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleMessageElement2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleMessageElement2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_ruleMessageElement2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_ruleMessageElement2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_ruleMessageElement2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement2407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedElement2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_ruleIndexedElement2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleIndexedElement2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange2526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionRange2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleExtensionRange2573 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleExtensionRange2590 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleExtensionRange2608 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleExtensionRange2625 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExtensionRange2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_entryRuleMessageField2680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageField2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleMessageField2736 = new BitSet(new long[]{0x01FFFFECF1CF2020L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleMessageField2757 = new BitSet(new long[]{0x01FFFFECF1CF2020L});
    public static final BitSet FOLLOW_ruleVar_in_ruleMessageField2778 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMessageField2790 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleMessageField2807 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_ruleMessageField2833 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMessageField2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup2882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleGroup2938 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleGroup2950 = new BitSet(new long[]{0x01FFFFECF1CF2020L});
    public static final BitSet FOLLOW_ruleVar_in_ruleGroup2971 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGroup2983 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleGroup3000 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGroup3017 = new BitSet(new long[]{0x000000E020280000L});
    public static final BitSet FOLLOW_ruleMessageField_in_ruleGroup3038 = new BitSet(new long[]{0x000000E020280000L});
    public static final BitSet FOLLOW_21_in_ruleGroup3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_entryRuleTypeLink3087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLink3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_ruleTypeLink3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_ruleTypeLink3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink3213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLink3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleComplexTypeLink3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink3305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarTypeLink3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarType_in_ruleScalarTypeLink3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions3395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOptions3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFieldOptions3442 = new BitSet(new long[]{0x01FFFFECF1CF2020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleFieldOptions3463 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleFieldOptions3476 = new BitSet(new long[]{0x01FFFFECF1CF2020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleFieldOptions3497 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27_in_ruleFieldOptions3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_entryRuleFieldOption3547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOption3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_ruleFieldOption3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_ruleFieldOption3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption3675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValueFieldOption3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDefaultValueFieldOption3730 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDefaultValueFieldOption3743 = new BitSet(new long[]{0x06000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleDefaultValueFieldOption3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption3800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeFieldOption3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_ruleNativeFieldOption3856 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNativeFieldOption3868 = new BitSet(new long[]{0x06000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleNativeFieldOption3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_entryRuleOptionSource3925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionSource3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleOptionSource3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum4017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleEnum4064 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum4081 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEnum4098 = new BitSet(new long[]{0x000000E8602F0020L});
    public static final BitSet FOLLOW_ruleEnumElement_in_ruleEnum4119 = new BitSet(new long[]{0x000000E8602F0020L});
    public static final BitSet FOLLOW_21_in_ruleEnum4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_entryRuleEnumElement4168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumElement4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_ruleEnumElement4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_ruleEnumElement4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_entryRuleEnumField4287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumField4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumField4339 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumField4356 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleEnumField4373 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_25_in_ruleEnumField4391 = new BitSet(new long[]{0x01FFFFECF1CF2020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleEnumField4412 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleEnumField4425 = new BitSet(new long[]{0x01FFFFECF1CF2020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleEnumField4446 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27_in_ruleEnumField4460 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEnumField4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService4510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleService4557 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService4574 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleService4591 = new BitSet(new long[]{0x000000E8E00F0000L});
    public static final BitSet FOLLOW_ruleServiceElement_in_ruleService4612 = new BitSet(new long[]{0x000000E8E02F0000L});
    public static final BitSet FOLLOW_21_in_ruleService4625 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleService4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceElement_in_entryRuleServiceElement4676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceElement4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_ruleServiceElement4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_ruleServiceElement4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_entryRuleRpc4795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRpc4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRpc4842 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRpc4859 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRpc4876 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMessageLink_in_ruleRpc4897 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleRpc4909 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleRpc4921 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRpc4933 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMessageLink_in_ruleRpc4954 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleRpc4966 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_20_in_ruleRpc4979 = new BitSet(new long[]{0x000000E8602F0000L});
    public static final BitSet FOLLOW_ruleOption_in_ruleRpc5000 = new BitSet(new long[]{0x000000E8602F0000L});
    public static final BitSet FOLLOW_21_in_ruleRpc5013 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRpc5028 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_entryRuleMessageLink5066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageLink5076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_ruleMessageLink5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_entryRuleExtend5158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtend5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleExtend5205 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_ruleExtend5228 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExtend5240 = new BitSet(new long[]{0x000000E8606F0000L});
    public static final BitSet FOLLOW_ruleMessageElement_in_ruleExtend5261 = new BitSet(new long[]{0x000000E8606F0000L});
    public static final BitSet FOLLOW_21_in_ruleExtend5274 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleExtend5287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_entryRuleVar_full5326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar_full5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_ruleVar_full5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleVar_full5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar5463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar5474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVar5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_ruleVar5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID5593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFULL_ID5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFULL_ID5644 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleFULL_ID5663 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFULL_ID5678 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_entryRuleVarReserved5726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarReserved5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleVarReserved5775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleVarReserved5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleVarReserved5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVarReserved5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleVarReserved5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleVarReserved5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleVarReserved5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleVarReserved5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleVarReserved5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleVarReserved5946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleVarReserved5965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleVarReserved5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleVarReserved6003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleVarReserved6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleVarReserved6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleVarReserved6060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleVarReserved6079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleVarReserved6098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleVarReserved6117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleVarReserved6136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleVarReserved6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVarReserved6174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVarReserved6193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVarReserved6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleVarReserved6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleVarReserved6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleVarReserved6269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleVarReserved6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleVarReserved6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleVarReserved6326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleVarReserved6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleVarReserved6364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleVarReserved6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleVarReserved6402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBOOL6458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleBOOL6475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleModifier6520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleModifier6537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleModifier6554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleScalarType6599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleScalarType6616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleScalarType6633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleScalarType6650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleScalarType6667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleScalarType6684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleScalarType6701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleScalarType6718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleScalarType6735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleScalarType6752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleScalarType6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleScalarType6786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleScalarType6803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleScalarType6820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleScalarType6837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_synpred1_InternalProtobuf3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred2_InternalProtobuf3594 = new BitSet(new long[]{0x0000000000000002L});

}