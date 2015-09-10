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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_NUMINT", "RULE_NUMDOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'syntax'", "'='", "';'", "'package'", "'import'", "'public'", "'weak'", "'option'", "'message'", "'{'", "'}'", "'extensions'", "'to'", "'group'", "'['", "','", "']'", "'default'", "'enum'", "'service'", "'rpc'", "'('", "')'", "'returns'", "'extend'", "'.'", "'required'", "'optional'", "'repeated'", "'int32'", "'int64'", "'uint32'", "'uint64'", "'sint32'", "'sint64'", "'fixed32'", "'fixed64'", "'sfixed32'", "'sfixed64'", "'float'", "'double'", "'bool'", "'string'", "'bytes'", "'max'", "'void'", "'true'", "'false'"
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

                if ( ((LA2_0>=16 && LA2_0<=17)||(LA2_0>=20 && LA2_0<=21)||(LA2_0>=31 && LA2_0<=32)||LA2_0==37||(LA2_0>=39 && LA2_0<=41)) ) {
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
            case 21:
            case 31:
            case 39:
            case 40:
            case 41:
                {
                alt3=3;
                }
                break;
            case 37:
                {
                alt3=4;
                }
                break;
            case 32:
                {
                alt3=5;
                }
                break;
            case 20:
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:312:1: ruleImport returns [EObject current=null] : (this_PublicImport_0= rulePublicImport | this_WeakImport_1= ruleWeakImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_PublicImport_0 = null;

        EObject this_WeakImport_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:315:28: ( (this_PublicImport_0= rulePublicImport | this_WeakImport_1= ruleWeakImport ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:316:1: (this_PublicImport_0= rulePublicImport | this_WeakImport_1= ruleWeakImport )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:316:1: (this_PublicImport_0= rulePublicImport | this_WeakImport_1= ruleWeakImport )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==19) ) {
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:317:5: this_PublicImport_0= rulePublicImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImportAccess().getPublicImportParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePublicImport_in_ruleImport719);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:327:5: this_WeakImport_1= ruleWeakImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImportAccess().getWeakImportParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWeakImport_in_ruleImport746);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:343:1: entryRulePublicImport returns [EObject current=null] : iv_rulePublicImport= rulePublicImport EOF ;
    public final EObject entryRulePublicImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublicImport = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:344:2: (iv_rulePublicImport= rulePublicImport EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:345:2: iv_rulePublicImport= rulePublicImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPublicImportRule()); 
            }
            pushFollow(FOLLOW_rulePublicImport_in_entryRulePublicImport781);
            iv_rulePublicImport=rulePublicImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePublicImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePublicImport791); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:352:1: rulePublicImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= 'public' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject rulePublicImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:355:28: ( (otherlv_0= 'import' otherlv_1= 'public' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:356:1: (otherlv_0= 'import' otherlv_1= 'public' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:356:1: (otherlv_0= 'import' otherlv_1= 'public' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:356:3: otherlv_0= 'import' otherlv_1= 'public' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulePublicImport828); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPublicImportAccess().getImportKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePublicImport840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPublicImportAccess().getPublicKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:364:1: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:365:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:365:1: (lv_importURI_2_0= RULE_STRING )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:366:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePublicImport857); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePublicImport874); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:394:1: entryRuleWeakImport returns [EObject current=null] : iv_ruleWeakImport= ruleWeakImport EOF ;
    public final EObject entryRuleWeakImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeakImport = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:395:2: (iv_ruleWeakImport= ruleWeakImport EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:396:2: iv_ruleWeakImport= ruleWeakImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWeakImportRule()); 
            }
            pushFollow(FOLLOW_ruleWeakImport_in_entryRuleWeakImport910);
            iv_ruleWeakImport=ruleWeakImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWeakImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeakImport920); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:403:1: ruleWeakImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= 'weak' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleWeakImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:406:28: ( (otherlv_0= 'import' otherlv_1= 'weak' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:407:1: (otherlv_0= 'import' otherlv_1= 'weak' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:407:1: (otherlv_0= 'import' otherlv_1= 'weak' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:407:3: otherlv_0= 'import' otherlv_1= 'weak' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleWeakImport957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWeakImportAccess().getImportKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleWeakImport969); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWeakImportAccess().getWeakKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:415:1: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:416:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:416:1: (lv_importURI_2_0= RULE_STRING )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:417:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWeakImport986); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleWeakImport1003); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:445:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:446:2: (iv_ruleOption= ruleOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:447:2: iv_ruleOption= ruleOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionRule()); 
            }
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption1039);
            iv_ruleOption=ruleOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption1049); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:454:1: ruleOption returns [EObject current=null] : (otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:457:28: ( (otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:458:1: (otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:458:1: (otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:458:3: otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleOption1086); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOptionAccess().getOptionKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:462:1: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:463:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:463:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:464:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOptionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionAccess().getSourceMessageFieldCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleOption1109);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleOption1121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOptionAccess().getEqualsSignKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:481:1: ( (lv_value_3_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:482:1: (lv_value_3_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:482:1: (lv_value_3_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:483:3: lv_value_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionAccess().getValueValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleOption1142);
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleOption1154); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:511:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:512:2: (iv_ruleValue= ruleValue EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:513:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1190);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1200); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:520:1: ruleValue returns [EObject current=null] : this_SimpleValueLink_0= ruleSimpleValueLink ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValueLink_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:523:28: (this_SimpleValueLink_0= ruleSimpleValueLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:525:5: this_SimpleValueLink_0= ruleSimpleValueLink
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValueAccess().getSimpleValueLinkParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleSimpleValueLink_in_ruleValue1246);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:541:1: entryRuleSimpleValueLink returns [EObject current=null] : iv_ruleSimpleValueLink= ruleSimpleValueLink EOF ;
    public final EObject entryRuleSimpleValueLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValueLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:542:2: (iv_ruleSimpleValueLink= ruleSimpleValueLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:543:2: iv_ruleSimpleValueLink= ruleSimpleValueLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleValueLinkRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleValueLink_in_entryRuleSimpleValueLink1280);
            iv_ruleSimpleValueLink=ruleSimpleValueLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleValueLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleValueLink1290); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:550:1: ruleSimpleValueLink returns [EObject current=null] : (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_EnumLink_3= ruleEnumLink ) ;
    public final EObject ruleSimpleValueLink() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLink_0 = null;

        EObject this_BooleanLink_1 = null;

        EObject this_StringLink_2 = null;

        EObject this_EnumLink_3 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:553:28: ( (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_EnumLink_3= ruleEnumLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:554:1: (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_EnumLink_3= ruleEnumLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:554:1: (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_EnumLink_3= ruleEnumLink )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_NUMINT:
            case RULE_NUMDOUBLE:
                {
                alt5=1;
                }
                break;
            case 59:
            case 60:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            case RULE_ID:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:555:5: this_NumberLink_0= ruleNumberLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleValueLinkAccess().getNumberLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLink_in_ruleSimpleValueLink1337);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:565:5: this_BooleanLink_1= ruleBooleanLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleValueLinkAccess().getBooleanLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLink_in_ruleSimpleValueLink1364);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:575:5: this_StringLink_2= ruleStringLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleValueLinkAccess().getStringLinkParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLink_in_ruleSimpleValueLink1391);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:585:5: this_EnumLink_3= ruleEnumLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleValueLinkAccess().getEnumLinkParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumLink_in_ruleSimpleValueLink1418);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:601:1: entryRuleEnumLink returns [EObject current=null] : iv_ruleEnumLink= ruleEnumLink EOF ;
    public final EObject entryRuleEnumLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:602:2: (iv_ruleEnumLink= ruleEnumLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:603:2: iv_ruleEnumLink= ruleEnumLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumLinkRule()); 
            }
            pushFollow(FOLLOW_ruleEnumLink_in_entryRuleEnumLink1453);
            iv_ruleEnumLink=ruleEnumLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLink1463); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:610:1: ruleEnumLink returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEnumLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:613:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:614:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:614:1: ( (otherlv_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:615:1: (otherlv_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:615:1: (otherlv_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:616:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumLinkRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumLink1507); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:635:1: entryRuleStringLink returns [EObject current=null] : iv_ruleStringLink= ruleStringLink EOF ;
    public final EObject entryRuleStringLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:636:2: (iv_ruleStringLink= ruleStringLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:637:2: iv_ruleStringLink= ruleStringLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLinkRule()); 
            }
            pushFollow(FOLLOW_ruleStringLink_in_entryRuleStringLink1542);
            iv_ruleStringLink=ruleStringLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLink1552); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:644:1: ruleStringLink returns [EObject current=null] : ( (lv_target_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:647:28: ( ( (lv_target_0_0= RULE_STRING ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:648:1: ( (lv_target_0_0= RULE_STRING ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:648:1: ( (lv_target_0_0= RULE_STRING ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:649:1: (lv_target_0_0= RULE_STRING )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:649:1: (lv_target_0_0= RULE_STRING )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:650:3: lv_target_0_0= RULE_STRING
            {
            lv_target_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLink1593); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:674:1: entryRuleBooleanLink returns [EObject current=null] : iv_ruleBooleanLink= ruleBooleanLink EOF ;
    public final EObject entryRuleBooleanLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:675:2: (iv_ruleBooleanLink= ruleBooleanLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:676:2: iv_ruleBooleanLink= ruleBooleanLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLinkRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink1633);
            iv_ruleBooleanLink=ruleBooleanLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLink1643); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:683:1: ruleBooleanLink returns [EObject current=null] : ( (lv_target_0_0= ruleBOOL ) ) ;
    public final EObject ruleBooleanLink() throws RecognitionException {
        EObject current = null;

        Enumerator lv_target_0_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:686:28: ( ( (lv_target_0_0= ruleBOOL ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:687:1: ( (lv_target_0_0= ruleBOOL ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:687:1: ( (lv_target_0_0= ruleBOOL ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:688:1: (lv_target_0_0= ruleBOOL )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:688:1: (lv_target_0_0= ruleBOOL )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:689:3: lv_target_0_0= ruleBOOL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBooleanLinkAccess().getTargetBOOLEnumRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBOOL_in_ruleBooleanLink1688);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:713:1: entryRuleNumberLink returns [EObject current=null] : iv_ruleNumberLink= ruleNumberLink EOF ;
    public final EObject entryRuleNumberLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:714:2: (iv_ruleNumberLink= ruleNumberLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:715:2: iv_ruleNumberLink= ruleNumberLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLinkRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLink_in_entryRuleNumberLink1723);
            iv_ruleNumberLink=ruleNumberLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLink1733); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:722:1: ruleNumberLink returns [EObject current=null] : (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink ) ;
    public final EObject ruleNumberLink() throws RecognitionException {
        EObject current = null;

        EObject this_IntLink_0 = null;

        EObject this_DoubleLink_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:725:28: ( (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:726:1: (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:726:1: (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_NUMINT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_NUMDOUBLE) ) {
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:727:5: this_IntLink_0= ruleIntLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberLinkAccess().getIntLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLink_in_ruleNumberLink1780);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:737:5: this_DoubleLink_1= ruleDoubleLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberLinkAccess().getDoubleLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoubleLink_in_ruleNumberLink1807);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:753:1: entryRuleIntLink returns [EObject current=null] : iv_ruleIntLink= ruleIntLink EOF ;
    public final EObject entryRuleIntLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:754:2: (iv_ruleIntLink= ruleIntLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:755:2: iv_ruleIntLink= ruleIntLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLinkRule()); 
            }
            pushFollow(FOLLOW_ruleIntLink_in_entryRuleIntLink1842);
            iv_ruleIntLink=ruleIntLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLink1852); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:762:1: ruleIntLink returns [EObject current=null] : ( (lv_target_0_0= RULE_NUMINT ) ) ;
    public final EObject ruleIntLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:765:28: ( ( (lv_target_0_0= RULE_NUMINT ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:766:1: ( (lv_target_0_0= RULE_NUMINT ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:766:1: ( (lv_target_0_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:767:1: (lv_target_0_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:767:1: (lv_target_0_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:768:3: lv_target_0_0= RULE_NUMINT
            {
            lv_target_0_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleIntLink1893); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:792:1: entryRuleDoubleLink returns [EObject current=null] : iv_ruleDoubleLink= ruleDoubleLink EOF ;
    public final EObject entryRuleDoubleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:793:2: (iv_ruleDoubleLink= ruleDoubleLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:794:2: iv_ruleDoubleLink= ruleDoubleLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleLinkRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink1933);
            iv_ruleDoubleLink=ruleDoubleLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoubleLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLink1943); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:801:1: ruleDoubleLink returns [EObject current=null] : ( (lv_target_0_0= RULE_NUMDOUBLE ) ) ;
    public final EObject ruleDoubleLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:804:28: ( ( (lv_target_0_0= RULE_NUMDOUBLE ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:805:1: ( (lv_target_0_0= RULE_NUMDOUBLE ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:805:1: ( (lv_target_0_0= RULE_NUMDOUBLE ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:806:1: (lv_target_0_0= RULE_NUMDOUBLE )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:806:1: (lv_target_0_0= RULE_NUMDOUBLE )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:807:3: lv_target_0_0= RULE_NUMDOUBLE
            {
            lv_target_0_0=(Token)match(input,RULE_NUMDOUBLE,FOLLOW_RULE_NUMDOUBLE_in_ruleDoubleLink1984); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:831:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:832:2: (iv_ruleComplexType= ruleComplexType EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:833:2: iv_ruleComplexType= ruleComplexType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexTypeRule()); 
            }
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType2024);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType2034); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:840:1: ruleComplexType returns [EObject current=null] : (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        EObject this_Enum_0 = null;

        EObject this_ExtensibleType_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:843:28: ( (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:844:1: (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:844:1: (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            else if ( (LA7_0==21||(LA7_0>=39 && LA7_0<=41)) ) {
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:845:5: this_Enum_0= ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexTypeAccess().getEnumParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnum_in_ruleComplexType2081);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:855:5: this_ExtensibleType_1= ruleExtensibleType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexTypeAccess().getExtensibleTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtensibleType_in_ruleComplexType2108);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:871:1: entryRuleExtensibleType returns [EObject current=null] : iv_ruleExtensibleType= ruleExtensibleType EOF ;
    public final EObject entryRuleExtensibleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensibleType = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:872:2: (iv_ruleExtensibleType= ruleExtensibleType EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:873:2: iv_ruleExtensibleType= ruleExtensibleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtensibleTypeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType2143);
            iv_ruleExtensibleType=ruleExtensibleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtensibleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensibleType2153); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:880:1: ruleExtensibleType returns [EObject current=null] : (this_Message_0= ruleMessage | this_Group_1= ruleGroup ) ;
    public final EObject ruleExtensibleType() throws RecognitionException {
        EObject current = null;

        EObject this_Message_0 = null;

        EObject this_Group_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:883:28: ( (this_Message_0= ruleMessage | this_Group_1= ruleGroup ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:884:1: (this_Message_0= ruleMessage | this_Group_1= ruleGroup )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:884:1: (this_Message_0= ruleMessage | this_Group_1= ruleGroup )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=39 && LA8_0<=41)) ) {
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:885:5: this_Message_0= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensibleTypeAccess().getMessageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleExtensibleType2200);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:895:5: this_Group_1= ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensibleTypeAccess().getGroupParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroup_in_ruleExtensibleType2227);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:911:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:912:2: (iv_ruleMessage= ruleMessage EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:913:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage2262);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage2272); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:920:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:923:28: ( (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:924:1: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:924:1: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:924:3: otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleMessage2309); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:928:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:929:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:929:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:930:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage2326); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleMessage2343); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:950:1: ( (lv_elements_3_0= ruleMessageElement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=20 && LA9_0<=21)||LA9_0==24||(LA9_0>=31 && LA9_0<=32)||LA9_0==37||(LA9_0>=39 && LA9_0<=41)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:951:1: (lv_elements_3_0= ruleMessageElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:951:1: (lv_elements_3_0= ruleMessageElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:952:3: lv_elements_3_0= ruleMessageElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMessageAccess().getElementsMessageElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMessageElement_in_ruleMessage2364);
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
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleMessage2377); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:980:1: entryRuleMessageElement returns [EObject current=null] : iv_ruleMessageElement= ruleMessageElement EOF ;
    public final EObject entryRuleMessageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:981:2: (iv_ruleMessageElement= ruleMessageElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:982:2: iv_ruleMessageElement= ruleMessageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageElementRule()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_entryRuleMessageElement2413);
            iv_ruleMessageElement=ruleMessageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageElement2423); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:989:1: ruleMessageElement returns [EObject current=null] : (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Enum_2= ruleEnum | this_Service_3= ruleService | this_Extend_4= ruleExtend | this_ExtensionRange_5= ruleExtensionRange | this_Option_6= ruleOption ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:992:28: ( (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Enum_2= ruleEnum | this_Service_3= ruleService | this_Extend_4= ruleExtend | this_ExtensionRange_5= ruleExtensionRange | this_Option_6= ruleOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:993:1: (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Enum_2= ruleEnum | this_Service_3= ruleService | this_Extend_4= ruleExtend | this_ExtensionRange_5= ruleExtensionRange | this_Option_6= ruleOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:993:1: (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Enum_2= ruleEnum | this_Service_3= ruleService | this_Extend_4= ruleExtend | this_ExtensionRange_5= ruleExtensionRange | this_Option_6= ruleOption )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 39:
            case 40:
            case 41:
                {
                alt10=2;
                }
                break;
            case 31:
                {
                alt10=3;
                }
                break;
            case 32:
                {
                alt10=4;
                }
                break;
            case 37:
                {
                alt10=5;
                }
                break;
            case 24:
                {
                alt10=6;
                }
                break;
            case 20:
                {
                alt10=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:994:5: this_Message_0= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getMessageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleMessageElement2470);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1004:5: this_IndexedElement_1= ruleIndexedElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getIndexedElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIndexedElement_in_ruleMessageElement2497);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1014:5: this_Enum_2= ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getEnumParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnum_in_ruleMessageElement2524);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1024:5: this_Service_3= ruleService
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getServiceParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleService_in_ruleMessageElement2551);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1034:5: this_Extend_4= ruleExtend
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getExtendParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtend_in_ruleMessageElement2578);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1044:5: this_ExtensionRange_5= ruleExtensionRange
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getExtensionRangeParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtensionRange_in_ruleMessageElement2605);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1054:5: this_Option_6= ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getOptionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOption_in_ruleMessageElement2632);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1070:1: entryRuleIndexedElement returns [EObject current=null] : iv_ruleIndexedElement= ruleIndexedElement EOF ;
    public final EObject entryRuleIndexedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1071:2: (iv_ruleIndexedElement= ruleIndexedElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1072:2: iv_ruleIndexedElement= ruleIndexedElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedElementRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement2667);
            iv_ruleIndexedElement=ruleIndexedElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedElement2677); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1079:1: ruleIndexedElement returns [EObject current=null] : (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup ) ;
    public final EObject ruleIndexedElement() throws RecognitionException {
        EObject current = null;

        EObject this_MessageField_0 = null;

        EObject this_Group_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1082:28: ( (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1083:1: (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1083:1: (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1084:5: this_MessageField_0= ruleMessageField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIndexedElementAccess().getMessageFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessageField_in_ruleIndexedElement2724);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1094:5: this_Group_1= ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIndexedElementAccess().getGroupParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroup_in_ruleIndexedElement2751);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1110:1: entryRuleExtensionRange returns [EObject current=null] : iv_ruleExtensionRange= ruleExtensionRange EOF ;
    public final EObject entryRuleExtensionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionRange = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1111:2: (iv_ruleExtensionRange= ruleExtensionRange EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1112:2: iv_ruleExtensionRange= ruleExtensionRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtensionRangeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange2786);
            iv_ruleExtensionRange=ruleExtensionRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtensionRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionRange2796); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1119:1: ruleExtensionRange returns [EObject current=null] : (otherlv_0= 'extensions' ( (lv_from_1_0= RULE_NUMINT ) ) (otherlv_2= 'to' ( (lv_to_3_0= RULE_NUMINT ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleExtensionRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_from_1_0=null;
        Token otherlv_2=null;
        Token lv_to_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1122:28: ( (otherlv_0= 'extensions' ( (lv_from_1_0= RULE_NUMINT ) ) (otherlv_2= 'to' ( (lv_to_3_0= RULE_NUMINT ) ) )? otherlv_4= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1123:1: (otherlv_0= 'extensions' ( (lv_from_1_0= RULE_NUMINT ) ) (otherlv_2= 'to' ( (lv_to_3_0= RULE_NUMINT ) ) )? otherlv_4= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1123:1: (otherlv_0= 'extensions' ( (lv_from_1_0= RULE_NUMINT ) ) (otherlv_2= 'to' ( (lv_to_3_0= RULE_NUMINT ) ) )? otherlv_4= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1123:3: otherlv_0= 'extensions' ( (lv_from_1_0= RULE_NUMINT ) ) (otherlv_2= 'to' ( (lv_to_3_0= RULE_NUMINT ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleExtensionRange2833); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExtensionRangeAccess().getExtensionsKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1127:1: ( (lv_from_1_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1128:1: (lv_from_1_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1128:1: (lv_from_1_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1129:3: lv_from_1_0= RULE_NUMINT
            {
            lv_from_1_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleExtensionRange2850); if (state.failed) return current;
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1145:2: (otherlv_2= 'to' ( (lv_to_3_0= RULE_NUMINT ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1145:4: otherlv_2= 'to' ( (lv_to_3_0= RULE_NUMINT ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleExtensionRange2868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExtensionRangeAccess().getToKeyword_2_0());
                          
                    }
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1149:1: ( (lv_to_3_0= RULE_NUMINT ) )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1150:1: (lv_to_3_0= RULE_NUMINT )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1150:1: (lv_to_3_0= RULE_NUMINT )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1151:3: lv_to_3_0= RULE_NUMINT
                    {
                    lv_to_3_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleExtensionRange2885); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleExtensionRange2904); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1179:1: entryRuleMessageField returns [EObject current=null] : iv_ruleMessageField= ruleMessageField EOF ;
    public final EObject entryRuleMessageField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageField = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1180:2: (iv_ruleMessageField= ruleMessageField EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1181:2: iv_ruleMessageField= ruleMessageField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageFieldRule()); 
            }
            pushFollow(FOLLOW_ruleMessageField_in_entryRuleMessageField2940);
            iv_ruleMessageField=ruleMessageField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageField2950); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1188:1: ruleMessageField returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1191:28: ( ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1192:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1192:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1192:2: ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1192:2: ( (lv_modifier_0_0= ruleModifier ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1193:1: (lv_modifier_0_0= ruleModifier )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1193:1: (lv_modifier_0_0= ruleModifier )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1194:3: lv_modifier_0_0= ruleModifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageFieldAccess().getModifierModifierEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleModifier_in_ruleMessageField2996);
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1210:2: ( (lv_type_1_0= ruleTypeLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1211:1: (lv_type_1_0= ruleTypeLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1211:1: (lv_type_1_0= ruleTypeLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1212:3: lv_type_1_0= ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageFieldAccess().getTypeTypeLinkParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeLink_in_ruleMessageField3017);
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1228:2: ( (lv_name_2_0= ruleVar ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1229:1: (lv_name_2_0= ruleVar )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1229:1: (lv_name_2_0= ruleVar )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1230:3: lv_name_2_0= ruleVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageFieldAccess().getNameVarParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_in_ruleMessageField3038);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleMessageField3050); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMessageFieldAccess().getEqualsSignKeyword_3());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1250:1: ( (lv_index_4_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1251:1: (lv_index_4_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1251:1: (lv_index_4_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1252:3: lv_index_4_0= RULE_NUMINT
            {
            lv_index_4_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleMessageField3067); if (state.failed) return current;
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1268:2: ( (lv_options_5_0= ruleFieldOptions ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1269:1: (lv_options_5_0= ruleFieldOptions )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1269:1: (lv_options_5_0= ruleFieldOptions )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1270:3: lv_options_5_0= ruleFieldOptions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMessageFieldAccess().getOptionsFieldOptionsParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldOptions_in_ruleMessageField3093);
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleMessageField3106); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1298:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1299:2: (iv_ruleGroup= ruleGroup EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1300:2: iv_ruleGroup= ruleGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupRule()); 
            }
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup3142);
            iv_ruleGroup=ruleGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup3152); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1307:1: ruleGroup returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1310:28: ( ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1311:1: ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1311:1: ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1311:2: ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1311:2: ( (lv_modifier_0_0= ruleModifier ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1312:1: (lv_modifier_0_0= ruleModifier )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1312:1: (lv_modifier_0_0= ruleModifier )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1313:3: lv_modifier_0_0= ruleModifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupAccess().getModifierModifierEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleModifier_in_ruleGroup3198);
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

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleGroup3210); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getGroupKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1333:1: ( (lv_name_2_0= ruleVar ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1334:1: (lv_name_2_0= ruleVar )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1334:1: (lv_name_2_0= ruleVar )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1335:3: lv_name_2_0= ruleVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupAccess().getNameVarParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_in_ruleGroup3231);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleGroup3243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getEqualsSignKeyword_3());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1355:1: ( (lv_index_4_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1356:1: (lv_index_4_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1356:1: (lv_index_4_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1357:3: lv_index_4_0= RULE_NUMINT
            {
            lv_index_4_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleGroup3260); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleGroup3277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1377:1: ( (lv_elements_6_0= ruleMessageField ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=39 && LA14_0<=41)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1378:1: (lv_elements_6_0= ruleMessageField )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1378:1: (lv_elements_6_0= ruleMessageField )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1379:3: lv_elements_6_0= ruleMessageField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupAccess().getElementsMessageFieldParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMessageField_in_ruleGroup3298);
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
            	    break loop14;
                }
            } while (true);

            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleGroup3311); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1407:1: entryRuleTypeLink returns [EObject current=null] : iv_ruleTypeLink= ruleTypeLink EOF ;
    public final EObject entryRuleTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1408:2: (iv_ruleTypeLink= ruleTypeLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1409:2: iv_ruleTypeLink= ruleTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_entryRuleTypeLink3347);
            iv_ruleTypeLink=ruleTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLink3357); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1416:1: ruleTypeLink returns [EObject current=null] : ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink ) ;
    public final EObject ruleTypeLink() throws RecognitionException {
        EObject current = null;

        EObject this_ScalarTypeLink_0 = null;

        EObject this_ComplexTypeLink_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1419:28: ( ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1420:1: ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1420:1: ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1420:2: ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1420:2: ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1420:3: ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLinkAccess().getScalarTypeLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleScalarTypeLink_in_ruleTypeLink3410);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1431:5: this_ComplexTypeLink_1= ruleComplexTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLinkAccess().getComplexTypeLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComplexTypeLink_in_ruleTypeLink3438);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1447:1: entryRuleComplexTypeLink returns [EObject current=null] : iv_ruleComplexTypeLink= ruleComplexTypeLink EOF ;
    public final EObject entryRuleComplexTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTypeLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1448:2: (iv_ruleComplexTypeLink= ruleComplexTypeLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1449:2: iv_ruleComplexTypeLink= ruleComplexTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink3473);
            iv_ruleComplexTypeLink=ruleComplexTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLink3483); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1456:1: ruleComplexTypeLink returns [EObject current=null] : ( ( ruleVar_full ) ) ;
    public final EObject ruleComplexTypeLink() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1459:28: ( ( ( ruleVar_full ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1460:1: ( ( ruleVar_full ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1460:1: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1461:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1461:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1462:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComplexTypeLinkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleComplexTypeLink3530);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1483:1: entryRuleScalarTypeLink returns [EObject current=null] : iv_ruleScalarTypeLink= ruleScalarTypeLink EOF ;
    public final EObject entryRuleScalarTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarTypeLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1484:2: (iv_ruleScalarTypeLink= ruleScalarTypeLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1485:2: iv_ruleScalarTypeLink= ruleScalarTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScalarTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink3565);
            iv_ruleScalarTypeLink=ruleScalarTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScalarTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarTypeLink3575); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1492:1: ruleScalarTypeLink returns [EObject current=null] : ( (lv_target_0_0= ruleScalarType ) ) ;
    public final EObject ruleScalarTypeLink() throws RecognitionException {
        EObject current = null;

        Enumerator lv_target_0_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1495:28: ( ( (lv_target_0_0= ruleScalarType ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1496:1: ( (lv_target_0_0= ruleScalarType ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1496:1: ( (lv_target_0_0= ruleScalarType ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1497:1: (lv_target_0_0= ruleScalarType )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1497:1: (lv_target_0_0= ruleScalarType )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1498:3: lv_target_0_0= ruleScalarType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScalarTypeLinkAccess().getTargetScalarTypeEnumRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleScalarType_in_ruleScalarTypeLink3620);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1522:1: entryRuleFieldOptions returns [EObject current=null] : iv_ruleFieldOptions= ruleFieldOptions EOF ;
    public final EObject entryRuleFieldOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOptions = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1523:2: (iv_ruleFieldOptions= ruleFieldOptions EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1524:2: iv_ruleFieldOptions= ruleFieldOptions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldOptionsRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions3655);
            iv_ruleFieldOptions=ruleFieldOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldOptions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOptions3665); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1531:1: ruleFieldOptions returns [EObject current=null] : (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleFieldOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_options_1_0 = null;

        EObject lv_options_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1534:28: ( (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1535:1: (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1535:1: (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1535:3: otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleFieldOptions3702); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFieldOptionsAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1539:1: ( (lv_options_1_0= ruleFieldOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1540:1: (lv_options_1_0= ruleFieldOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1540:1: (lv_options_1_0= ruleFieldOption )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1541:3: lv_options_1_0= ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFieldOption_in_ruleFieldOptions3723);
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1557:2: (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1557:4: otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleFieldOptions3736); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFieldOptionsAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1561:1: ( (lv_options_3_0= ruleFieldOption ) )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1562:1: (lv_options_3_0= ruleFieldOption )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1562:1: (lv_options_3_0= ruleFieldOption )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1563:3: lv_options_3_0= ruleFieldOption
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFieldOption_in_ruleFieldOptions3757);
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
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleFieldOptions3771); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1591:1: entryRuleFieldOption returns [EObject current=null] : iv_ruleFieldOption= ruleFieldOption EOF ;
    public final EObject entryRuleFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1592:2: (iv_ruleFieldOption= ruleFieldOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1593:2: iv_ruleFieldOption= ruleFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_entryRuleFieldOption3807);
            iv_ruleFieldOption=ruleFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOption3817); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1600:1: ruleFieldOption returns [EObject current=null] : ( ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption ) | this_NativeFieldOption_1= ruleNativeFieldOption ) ;
    public final EObject ruleFieldOption() throws RecognitionException {
        EObject current = null;

        EObject this_DefaultValueFieldOption_0 = null;

        EObject this_NativeFieldOption_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1603:28: ( ( ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption ) | this_NativeFieldOption_1= ruleNativeFieldOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1604:1: ( ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption ) | this_NativeFieldOption_1= ruleNativeFieldOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1604:1: ( ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption ) | this_NativeFieldOption_1= ruleNativeFieldOption )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1604:2: ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1604:2: ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1604:3: ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldOptionAccess().getDefaultValueFieldOptionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_ruleFieldOption3872);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1616:5: this_NativeFieldOption_1= ruleNativeFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldOptionAccess().getNativeFieldOptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNativeFieldOption_in_ruleFieldOption3900);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1632:1: entryRuleDefaultValueFieldOption returns [EObject current=null] : iv_ruleDefaultValueFieldOption= ruleDefaultValueFieldOption EOF ;
    public final EObject entryRuleDefaultValueFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValueFieldOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1633:2: (iv_ruleDefaultValueFieldOption= ruleDefaultValueFieldOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1634:2: iv_ruleDefaultValueFieldOption= ruleDefaultValueFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultValueFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption3935);
            iv_ruleDefaultValueFieldOption=ruleDefaultValueFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultValueFieldOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValueFieldOption3945); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1641:1: ruleDefaultValueFieldOption returns [EObject current=null] : ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleDefaultValueFieldOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1644:28: ( ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1645:1: ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1645:1: ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1645:2: ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1645:2: ( ( 'default' )=>otherlv_0= 'default' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1645:3: ( 'default' )=>otherlv_0= 'default'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleDefaultValueFieldOption3990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDefaultValueFieldOptionAccess().getDefaultKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDefaultValueFieldOption4003); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefaultValueFieldOptionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1654:1: ( (lv_value_2_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1655:1: (lv_value_2_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1655:1: (lv_value_2_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1656:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefaultValueFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleDefaultValueFieldOption4024);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1680:1: entryRuleNativeFieldOption returns [EObject current=null] : iv_ruleNativeFieldOption= ruleNativeFieldOption EOF ;
    public final EObject entryRuleNativeFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeFieldOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1681:2: (iv_ruleNativeFieldOption= ruleNativeFieldOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1682:2: iv_ruleNativeFieldOption= ruleNativeFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNativeFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption4060);
            iv_ruleNativeFieldOption=ruleNativeFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNativeFieldOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeFieldOption4070); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1689:1: ruleNativeFieldOption returns [EObject current=null] : ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleNativeFieldOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_source_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1692:28: ( ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1693:1: ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1693:1: ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1693:2: ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1693:2: ( (lv_source_0_0= ruleOptionSource ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1694:1: (lv_source_0_0= ruleOptionSource )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1694:1: (lv_source_0_0= ruleOptionSource )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1695:3: lv_source_0_0= ruleOptionSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNativeFieldOptionAccess().getSourceOptionSourceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOptionSource_in_ruleNativeFieldOption4116);
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleNativeFieldOption4128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNativeFieldOptionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1715:1: ( (lv_value_2_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1716:1: (lv_value_2_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1716:1: (lv_value_2_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1717:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNativeFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleNativeFieldOption4149);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1741:1: entryRuleOptionSource returns [EObject current=null] : iv_ruleOptionSource= ruleOptionSource EOF ;
    public final EObject entryRuleOptionSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionSource = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1742:2: (iv_ruleOptionSource= ruleOptionSource EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1743:2: iv_ruleOptionSource= ruleOptionSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionSourceRule()); 
            }
            pushFollow(FOLLOW_ruleOptionSource_in_entryRuleOptionSource4185);
            iv_ruleOptionSource=ruleOptionSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionSource4195); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1750:1: ruleOptionSource returns [EObject current=null] : ( ( ruleVar_full ) ) ;
    public final EObject ruleOptionSource() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1753:28: ( ( ( ruleVar_full ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1754:1: ( ( ruleVar_full ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1754:1: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1755:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1755:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1756:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOptionSourceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionSourceAccess().getTargetIndexedElementCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleOptionSource4242);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1777:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1778:2: (iv_ruleEnum= ruleEnum EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1779:2: iv_ruleEnum= ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum4277);
            iv_ruleEnum=ruleEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum4287); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1786:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1789:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1790:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1790:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1790:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleEnum4324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1794:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1795:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1795:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1796:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum4341); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleEnum4358); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1816:1: ( (lv_elements_3_0= ruleEnumElement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1817:1: (lv_elements_3_0= ruleEnumElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1817:1: (lv_elements_3_0= ruleEnumElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1818:3: lv_elements_3_0= ruleEnumElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumElement_in_ruleEnum4379);
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
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleEnum4392); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1846:1: entryRuleEnumElement returns [EObject current=null] : iv_ruleEnumElement= ruleEnumElement EOF ;
    public final EObject entryRuleEnumElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1847:2: (iv_ruleEnumElement= ruleEnumElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1848:2: iv_ruleEnumElement= ruleEnumElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumElementRule()); 
            }
            pushFollow(FOLLOW_ruleEnumElement_in_entryRuleEnumElement4428);
            iv_ruleEnumElement=ruleEnumElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumElement4438); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1855:1: ruleEnumElement returns [EObject current=null] : (this_EnumField_0= ruleEnumField | this_Option_1= ruleOption ) ;
    public final EObject ruleEnumElement() throws RecognitionException {
        EObject current = null;

        EObject this_EnumField_0 = null;

        EObject this_Option_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1858:28: ( (this_EnumField_0= ruleEnumField | this_Option_1= ruleOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1859:1: (this_EnumField_0= ruleEnumField | this_Option_1= ruleOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1859:1: (this_EnumField_0= ruleEnumField | this_Option_1= ruleOption )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==20) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1860:5: this_EnumField_0= ruleEnumField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumElementAccess().getEnumFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumField_in_ruleEnumElement4485);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1870:5: this_Option_1= ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumElementAccess().getOptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOption_in_ruleEnumElement4512);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1886:1: entryRuleEnumField returns [EObject current=null] : iv_ruleEnumField= ruleEnumField EOF ;
    public final EObject entryRuleEnumField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumField = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1887:2: (iv_ruleEnumField= ruleEnumField EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1888:2: iv_ruleEnumField= ruleEnumField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumFieldRule()); 
            }
            pushFollow(FOLLOW_ruleEnumField_in_entryRuleEnumField4547);
            iv_ruleEnumField=ruleEnumField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumField4557); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1895:1: ruleEnumField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1898:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1899:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1899:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1899:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1899:2: ( (lv_name_0_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1900:1: (lv_name_0_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1900:1: (lv_name_0_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1901:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumField4599); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleEnumField4616); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumFieldAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1921:1: ( (lv_index_2_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1922:1: (lv_index_2_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1922:1: (lv_index_2_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1923:3: lv_index_2_0= RULE_NUMINT
            {
            lv_index_2_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleEnumField4633); if (state.failed) return current;
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1939:2: (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1939:4: otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleEnumField4651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEnumFieldAccess().getLeftSquareBracketKeyword_3_0());
                          
                    }
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1943:1: ( (lv_options_4_0= ruleFieldOption ) )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1944:1: (lv_options_4_0= ruleFieldOption )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1944:1: (lv_options_4_0= ruleFieldOption )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1945:3: lv_options_4_0= ruleFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldOption_in_ruleEnumField4672);
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

                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1961:2: (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==28) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1961:4: otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) )
                    	    {
                    	    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleEnumField4685); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEnumFieldAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1965:1: ( (lv_options_6_0= ruleFieldOption ) )
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1966:1: (lv_options_6_0= ruleFieldOption )
                    	    {
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1966:1: (lv_options_6_0= ruleFieldOption )
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1967:3: lv_options_6_0= ruleFieldOption
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFieldOption_in_ruleEnumField4706);
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
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleEnumField4720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEnumFieldAccess().getRightSquareBracketKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleEnumField4734); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1999:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2000:2: (iv_ruleService= ruleService EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2001:2: iv_ruleService= ruleService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService4770);
            iv_ruleService=ruleService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleService; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService4780); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2008:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )+ otherlv_4= '}' (otherlv_5= ';' )? ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2011:28: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )+ otherlv_4= '}' (otherlv_5= ';' )? ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2012:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )+ otherlv_4= '}' (otherlv_5= ';' )? )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2012:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )+ otherlv_4= '}' (otherlv_5= ';' )? )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2012:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )+ otherlv_4= '}' (otherlv_5= ';' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleService4817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2016:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2017:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2017:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2018:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService4834); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleService4851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2038:1: ( (lv_elements_3_0= ruleServiceElement ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20||LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2039:1: (lv_elements_3_0= ruleServiceElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2039:1: (lv_elements_3_0= ruleServiceElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2040:3: lv_elements_3_0= ruleServiceElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceAccess().getElementsServiceElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleServiceElement_in_ruleService4872);
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
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleService4885); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2060:1: (otherlv_5= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==15) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2060:3: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleService4898); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2072:1: entryRuleServiceElement returns [EObject current=null] : iv_ruleServiceElement= ruleServiceElement EOF ;
    public final EObject entryRuleServiceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2073:2: (iv_ruleServiceElement= ruleServiceElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2074:2: iv_ruleServiceElement= ruleServiceElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceElementRule()); 
            }
            pushFollow(FOLLOW_ruleServiceElement_in_entryRuleServiceElement4936);
            iv_ruleServiceElement=ruleServiceElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleServiceElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceElement4946); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2081:1: ruleServiceElement returns [EObject current=null] : (this_Rpc_0= ruleRpc | this_Option_1= ruleOption ) ;
    public final EObject ruleServiceElement() throws RecognitionException {
        EObject current = null;

        EObject this_Rpc_0 = null;

        EObject this_Option_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2084:28: ( (this_Rpc_0= ruleRpc | this_Option_1= ruleOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2085:1: (this_Rpc_0= ruleRpc | this_Option_1= ruleOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2085:1: (this_Rpc_0= ruleRpc | this_Option_1= ruleOption )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            else if ( (LA24_0==20) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2086:5: this_Rpc_0= ruleRpc
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getServiceElementAccess().getRpcParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRpc_in_ruleServiceElement4993);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2096:5: this_Option_1= ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getServiceElementAccess().getOptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOption_in_ruleServiceElement5020);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2112:1: entryRuleRpc returns [EObject current=null] : iv_ruleRpc= ruleRpc EOF ;
    public final EObject entryRuleRpc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRpc = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2113:2: (iv_ruleRpc= ruleRpc EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2114:2: iv_ruleRpc= ruleRpc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRpcRule()); 
            }
            pushFollow(FOLLOW_ruleRpc_in_entryRuleRpc5055);
            iv_ruleRpc=ruleRpc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRpc; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRpc5065); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2121:1: ruleRpc returns [EObject current=null] : (otherlv_0= 'rpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? (otherlv_12= ';' )+ ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2124:28: ( (otherlv_0= 'rpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? (otherlv_12= ';' )+ ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2125:1: (otherlv_0= 'rpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? (otherlv_12= ';' )+ )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2125:1: (otherlv_0= 'rpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? (otherlv_12= ';' )+ )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2125:3: otherlv_0= 'rpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? (otherlv_12= ';' )+
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleRpc5102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRpcAccess().getRpcKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2129:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2130:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2130:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2131:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRpc5119); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleRpc5136); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRpcAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2151:1: ( (lv_argType_3_0= ruleMessageLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2152:1: (lv_argType_3_0= ruleMessageLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2152:1: (lv_argType_3_0= ruleMessageLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2153:3: lv_argType_3_0= ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRpcAccess().getArgTypeMessageLinkParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMessageLink_in_ruleRpc5157);
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

            otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleRpc5169); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRpcAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleRpc5181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRpcAccess().getReturnsKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleRpc5193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getRpcAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2181:1: ( (lv_returnType_7_0= ruleMessageLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2182:1: (lv_returnType_7_0= ruleMessageLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2182:1: (lv_returnType_7_0= ruleMessageLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2183:3: lv_returnType_7_0= ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRpcAccess().getReturnTypeMessageLinkParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMessageLink_in_ruleRpc5214);
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

            otherlv_8=(Token)match(input,35,FOLLOW_35_in_ruleRpc5226); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRpcAccess().getRightParenthesisKeyword_8());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2203:1: (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2203:3: otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleRpc5239); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getRpcAccess().getLeftCurlyBracketKeyword_9_0());
                          
                    }
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2207:1: ( (lv_options_10_0= ruleOption ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==20) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2208:1: (lv_options_10_0= ruleOption )
                    	    {
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2208:1: (lv_options_10_0= ruleOption )
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2209:3: lv_options_10_0= ruleOption
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRpcAccess().getOptionsOptionParserRuleCall_9_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOption_in_ruleRpc5260);
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
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleRpc5273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getRpcAccess().getRightCurlyBracketKeyword_9_2());
                          
                    }

                    }
                    break;

            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2229:3: (otherlv_12= ';' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==15) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2229:5: otherlv_12= ';'
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleRpc5288); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getRpcAccess().getSemicolonKeyword_10());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2241:1: entryRuleMessageLink returns [EObject current=null] : iv_ruleMessageLink= ruleMessageLink EOF ;
    public final EObject entryRuleMessageLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2242:2: (iv_ruleMessageLink= ruleMessageLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2243:2: iv_ruleMessageLink= ruleMessageLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageLinkRule()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_entryRuleMessageLink5326);
            iv_ruleMessageLink=ruleMessageLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageLink5336); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2250:1: ruleMessageLink returns [EObject current=null] : ( ( ruleFULL_ID ) ) ;
    public final EObject ruleMessageLink() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2253:28: ( ( ( ruleFULL_ID ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2254:1: ( ( ruleFULL_ID ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2254:1: ( ( ruleFULL_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2255:1: ( ruleFULL_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2255:1: ( ruleFULL_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2256:3: ruleFULL_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMessageLinkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageLinkAccess().getTargetMessageCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_ruleMessageLink5383);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2277:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2278:2: (iv_ruleExtend= ruleExtend EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2279:2: iv_ruleExtend= ruleExtend EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendRule()); 
            }
            pushFollow(FOLLOW_ruleExtend_in_entryRuleExtend5418);
            iv_ruleExtend=ruleExtend();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtend; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtend5428); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2286:1: ruleExtend returns [EObject current=null] : (otherlv_0= 'extend' ( ( ruleFULL_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2289:28: ( (otherlv_0= 'extend' ( ( ruleFULL_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2290:1: (otherlv_0= 'extend' ( ( ruleFULL_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' (otherlv_5= ';' )? )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2290:1: (otherlv_0= 'extend' ( ( ruleFULL_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' (otherlv_5= ';' )? )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2290:3: otherlv_0= 'extend' ( ( ruleFULL_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' (otherlv_5= ';' )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleExtend5465); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtendKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2294:1: ( ( ruleFULL_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2295:1: ( ruleFULL_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2295:1: ( ruleFULL_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2296:3: ruleFULL_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExtendRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExtendAccess().getTypeMessageCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_ruleExtend5488);
            ruleFULL_ID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleExtend5500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2313:1: ( (lv_elements_3_0= ruleMessageElement ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=20 && LA28_0<=21)||LA28_0==24||(LA28_0>=31 && LA28_0<=32)||LA28_0==37||(LA28_0>=39 && LA28_0<=41)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2314:1: (lv_elements_3_0= ruleMessageElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2314:1: (lv_elements_3_0= ruleMessageElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2315:3: lv_elements_3_0= ruleMessageElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExtendAccess().getElementsMessageElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMessageElement_in_ruleExtend5521);
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
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleExtend5534); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_4());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2335:1: (otherlv_5= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==15) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2335:3: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleExtend5547); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2347:1: entryRuleVar_full returns [String current=null] : iv_ruleVar_full= ruleVar_full EOF ;
    public final String entryRuleVar_full() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVar_full = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2348:2: (iv_ruleVar_full= ruleVar_full EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2349:2: iv_ruleVar_full= ruleVar_full EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVar_fullRule()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_entryRuleVar_full5586);
            iv_ruleVar_full=ruleVar_full();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar_full.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar_full5597); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2356:1: ruleVar_full returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar ) ;
    public final AntlrDatatypeRuleToken ruleVar_full() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FULL_ID_0 = null;

        AntlrDatatypeRuleToken this_Var_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2359:28: ( (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2360:1: (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2360:1: (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==EOF||LA30_1==RULE_ID||(LA30_1>=13 && LA30_1<=17)||(LA30_1>=20 && LA30_1<=21)||(LA30_1>=24 && LA30_1<=26)||(LA30_1>=30 && LA30_1<=33)||(LA30_1>=36 && LA30_1<=37)||(LA30_1>=39 && LA30_1<=58)) ) {
                    alt30=2;
                }
                else if ( (LA30_1==38) ) {
                    alt30=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA30_0==13||(LA30_0>=16 && LA30_0<=17)||(LA30_0>=20 && LA30_0<=21)||(LA30_0>=24 && LA30_0<=26)||(LA30_0>=30 && LA30_0<=33)||(LA30_0>=36 && LA30_0<=37)||(LA30_0>=39 && LA30_0<=58)) ) {
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2361:5: this_FULL_ID_0= ruleFULL_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVar_fullAccess().getFULL_IDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFULL_ID_in_ruleVar_full5644);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2373:5: this_Var_1= ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVar_fullAccess().getVarParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVar_in_ruleVar_full5677);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2391:1: entryRuleVar returns [String current=null] : iv_ruleVar= ruleVar EOF ;
    public final String entryRuleVar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVar = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2392:2: (iv_ruleVar= ruleVar EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2393:2: iv_ruleVar= ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar5723);
            iv_ruleVar=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar5734); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2400:1: ruleVar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved ) ;
    public final AntlrDatatypeRuleToken ruleVar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_VarReserved_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2403:28: ( (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2404:1: (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2404:1: (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            else if ( (LA31_0==13||(LA31_0>=16 && LA31_0<=17)||(LA31_0>=20 && LA31_0<=21)||(LA31_0>=24 && LA31_0<=26)||(LA31_0>=30 && LA31_0<=33)||(LA31_0>=36 && LA31_0<=37)||(LA31_0>=39 && LA31_0<=58)) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2404:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVar5774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getVarAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2413:5: this_VarReserved_1= ruleVarReserved
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarAccess().getVarReservedParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarReserved_in_ruleVar5807);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2431:1: entryRuleFULL_ID returns [String current=null] : iv_ruleFULL_ID= ruleFULL_ID EOF ;
    public final String entryRuleFULL_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFULL_ID = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2432:2: (iv_ruleFULL_ID= ruleFULL_ID EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2433:2: iv_ruleFULL_ID= ruleFULL_ID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFULL_IDRule()); 
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID5853);
            iv_ruleFULL_ID=ruleFULL_ID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFULL_ID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFULL_ID5864); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2440:1: ruleFULL_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleFULL_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2443:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2444:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2444:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2444:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFULL_ID5904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2451:1: (kw= '.' this_ID_2= RULE_ID )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==38) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2452:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,38,FOLLOW_38_in_ruleFULL_ID5923); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFULL_IDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFULL_ID5938); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2472:1: entryRuleVarReserved returns [String current=null] : iv_ruleVarReserved= ruleVarReserved EOF ;
    public final String entryRuleVarReserved() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarReserved = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2473:2: (iv_ruleVarReserved= ruleVarReserved EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2474:2: iv_ruleVarReserved= ruleVarReserved EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarReservedRule()); 
            }
            pushFollow(FOLLOW_ruleVarReserved_in_entryRuleVarReserved5986);
            iv_ruleVarReserved=ruleVarReserved();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarReserved.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarReserved5997); if (state.failed) return current;

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2481:1: ruleVarReserved returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' ) ;
    public final AntlrDatatypeRuleToken ruleVarReserved() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2484:28: ( (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2485:1: (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2485:1: (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' )
            int alt33=34;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt33=1;
                }
                break;
            case 16:
                {
                alt33=2;
                }
                break;
            case 13:
                {
                alt33=3;
                }
                break;
            case 17:
                {
                alt33=4;
                }
                break;
            case 20:
                {
                alt33=5;
                }
                break;
            case 21:
                {
                alt33=6;
                }
                break;
            case 32:
                {
                alt33=7;
                }
                break;
            case 31:
                {
                alt33=8;
                }
                break;
            case 39:
                {
                alt33=9;
                }
                break;
            case 40:
                {
                alt33=10;
                }
                break;
            case 41:
                {
                alt33=11;
                }
                break;
            case 24:
                {
                alt33=12;
                }
                break;
            case 37:
                {
                alt33=13;
                }
                break;
            case 26:
                {
                alt33=14;
                }
                break;
            case 33:
                {
                alt33=15;
                }
                break;
            case 36:
                {
                alt33=16;
                }
                break;
            case 42:
                {
                alt33=17;
                }
                break;
            case 43:
                {
                alt33=18;
                }
                break;
            case 44:
                {
                alt33=19;
                }
                break;
            case 45:
                {
                alt33=20;
                }
                break;
            case 46:
                {
                alt33=21;
                }
                break;
            case 47:
                {
                alt33=22;
                }
                break;
            case 48:
                {
                alt33=23;
                }
                break;
            case 49:
                {
                alt33=24;
                }
                break;
            case 50:
                {
                alt33=25;
                }
                break;
            case 51:
                {
                alt33=26;
                }
                break;
            case 52:
                {
                alt33=27;
                }
                break;
            case 53:
                {
                alt33=28;
                }
                break;
            case 54:
                {
                alt33=29;
                }
                break;
            case 55:
                {
                alt33=30;
                }
                break;
            case 56:
                {
                alt33=31;
                }
                break;
            case 30:
                {
                alt33=32;
                }
                break;
            case 57:
                {
                alt33=33;
                }
                break;
            case 58:
                {
                alt33=34;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2486:2: kw= 'to'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleVarReserved6035); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getToKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2493:2: kw= 'package'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleVarReserved6054); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getPackageKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2500:2: kw= 'syntax'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleVarReserved6073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSyntaxKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2507:2: kw= 'import'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleVarReserved6092); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getImportKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2514:2: kw= 'option'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleVarReserved6111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getOptionKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2521:2: kw= 'message'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleVarReserved6130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getMessageKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2528:2: kw= 'service'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleVarReserved6149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getServiceKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2535:2: kw= 'enum'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleVarReserved6168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getEnumKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2542:2: kw= 'required'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleVarReserved6187); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getRequiredKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2549:2: kw= 'optional'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleVarReserved6206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getOptionalKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2556:2: kw= 'repeated'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleVarReserved6225); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getRepeatedKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2563:2: kw= 'extensions'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleVarReserved6244); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getExtensionsKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2570:2: kw= 'extend'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleVarReserved6263); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getExtendKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2577:2: kw= 'group'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleVarReserved6282); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getGroupKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2584:2: kw= 'rpc'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleVarReserved6301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getRpcKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2591:2: kw= 'returns'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleVarReserved6320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getReturnsKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2598:2: kw= 'int32'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleVarReserved6339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getInt32Keyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2605:2: kw= 'int64'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleVarReserved6358); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getInt64Keyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2612:2: kw= 'uint32'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleVarReserved6377); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getUint32Keyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2619:2: kw= 'uint64'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleVarReserved6396); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getUint64Keyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2626:2: kw= 'sint32'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleVarReserved6415); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSint32Keyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2633:2: kw= 'sint64'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleVarReserved6434); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSint64Keyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2640:2: kw= 'fixed32'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleVarReserved6453); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getFixed32Keyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2647:2: kw= 'fixed64'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleVarReserved6472); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getFixed64Keyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2654:2: kw= 'sfixed32'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleVarReserved6491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSfixed32Keyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2661:2: kw= 'sfixed64'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleVarReserved6510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSfixed64Keyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2668:2: kw= 'float'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleVarReserved6529); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getFloatKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2675:2: kw= 'double'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleVarReserved6548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getDoubleKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2682:2: kw= 'bool'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleVarReserved6567); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getBoolKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2689:2: kw= 'string'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleVarReserved6586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getStringKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2696:2: kw= 'bytes'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleVarReserved6605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getBytesKeyword_30()); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2703:2: kw= 'default'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleVarReserved6624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getDefaultKeyword_31()); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2710:2: kw= 'max'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleVarReserved6643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getMaxKeyword_32()); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2717:2: kw= 'void'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleVarReserved6662); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2732:1: ruleBOOL returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBOOL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2734:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2735:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2735:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==59) ) {
                alt34=1;
            }
            else if ( (LA34_0==60) ) {
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2735:2: (enumLiteral_0= 'true' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2735:2: (enumLiteral_0= 'true' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2735:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_59_in_ruleBOOL6718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2741:6: (enumLiteral_1= 'false' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2741:6: (enumLiteral_1= 'false' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2741:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_60_in_ruleBOOL6735); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2751:1: ruleModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) ) ;
    public final Enumerator ruleModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2753:28: ( ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2754:1: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2754:1: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt35=1;
                }
                break;
            case 39:
                {
                alt35=2;
                }
                break;
            case 41:
                {
                alt35=3;
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2754:2: (enumLiteral_0= 'optional' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2754:2: (enumLiteral_0= 'optional' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2754:4: enumLiteral_0= 'optional'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleModifier6780); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2760:6: (enumLiteral_1= 'required' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2760:6: (enumLiteral_1= 'required' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2760:8: enumLiteral_1= 'required'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_39_in_ruleModifier6797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2766:6: (enumLiteral_2= 'repeated' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2766:6: (enumLiteral_2= 'repeated' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2766:8: enumLiteral_2= 'repeated'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_41_in_ruleModifier6814); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2776:1: ruleScalarType returns [Enumerator current=null] : ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2778:28: ( ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2779:1: ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2779:1: ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) )
            int alt36=15;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt36=1;
                }
                break;
            case 43:
                {
                alt36=2;
                }
                break;
            case 44:
                {
                alt36=3;
                }
                break;
            case 45:
                {
                alt36=4;
                }
                break;
            case 46:
                {
                alt36=5;
                }
                break;
            case 47:
                {
                alt36=6;
                }
                break;
            case 48:
                {
                alt36=7;
                }
                break;
            case 49:
                {
                alt36=8;
                }
                break;
            case 50:
                {
                alt36=9;
                }
                break;
            case 51:
                {
                alt36=10;
                }
                break;
            case 52:
                {
                alt36=11;
                }
                break;
            case 53:
                {
                alt36=12;
                }
                break;
            case 54:
                {
                alt36=13;
                }
                break;
            case 55:
                {
                alt36=14;
                }
                break;
            case 56:
                {
                alt36=15;
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2779:2: (enumLiteral_0= 'int32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2779:2: (enumLiteral_0= 'int32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2779:4: enumLiteral_0= 'int32'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleScalarType6859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2785:6: (enumLiteral_1= 'int64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2785:6: (enumLiteral_1= 'int64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2785:8: enumLiteral_1= 'int64'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleScalarType6876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2791:6: (enumLiteral_2= 'uint32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2791:6: (enumLiteral_2= 'uint32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2791:8: enumLiteral_2= 'uint32'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_44_in_ruleScalarType6893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2797:6: (enumLiteral_3= 'uint64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2797:6: (enumLiteral_3= 'uint64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2797:8: enumLiteral_3= 'uint64'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_45_in_ruleScalarType6910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2803:6: (enumLiteral_4= 'sint32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2803:6: (enumLiteral_4= 'sint32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2803:8: enumLiteral_4= 'sint32'
                    {
                    enumLiteral_4=(Token)match(input,46,FOLLOW_46_in_ruleScalarType6927); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2809:6: (enumLiteral_5= 'sint64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2809:6: (enumLiteral_5= 'sint64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2809:8: enumLiteral_5= 'sint64'
                    {
                    enumLiteral_5=(Token)match(input,47,FOLLOW_47_in_ruleScalarType6944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2815:6: (enumLiteral_6= 'fixed32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2815:6: (enumLiteral_6= 'fixed32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2815:8: enumLiteral_6= 'fixed32'
                    {
                    enumLiteral_6=(Token)match(input,48,FOLLOW_48_in_ruleScalarType6961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2821:6: (enumLiteral_7= 'fixed64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2821:6: (enumLiteral_7= 'fixed64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2821:8: enumLiteral_7= 'fixed64'
                    {
                    enumLiteral_7=(Token)match(input,49,FOLLOW_49_in_ruleScalarType6978); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2827:6: (enumLiteral_8= 'sfixed32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2827:6: (enumLiteral_8= 'sfixed32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2827:8: enumLiteral_8= 'sfixed32'
                    {
                    enumLiteral_8=(Token)match(input,50,FOLLOW_50_in_ruleScalarType6995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2833:6: (enumLiteral_9= 'sfixed64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2833:6: (enumLiteral_9= 'sfixed64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2833:8: enumLiteral_9= 'sfixed64'
                    {
                    enumLiteral_9=(Token)match(input,51,FOLLOW_51_in_ruleScalarType7012); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2839:6: (enumLiteral_10= 'float' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2839:6: (enumLiteral_10= 'float' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2839:8: enumLiteral_10= 'float'
                    {
                    enumLiteral_10=(Token)match(input,52,FOLLOW_52_in_ruleScalarType7029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2845:6: (enumLiteral_11= 'double' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2845:6: (enumLiteral_11= 'double' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2845:8: enumLiteral_11= 'double'
                    {
                    enumLiteral_11=(Token)match(input,53,FOLLOW_53_in_ruleScalarType7046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2851:6: (enumLiteral_12= 'bool' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2851:6: (enumLiteral_12= 'bool' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2851:8: enumLiteral_12= 'bool'
                    {
                    enumLiteral_12=(Token)match(input,54,FOLLOW_54_in_ruleScalarType7063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2857:6: (enumLiteral_13= 'string' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2857:6: (enumLiteral_13= 'string' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2857:8: enumLiteral_13= 'string'
                    {
                    enumLiteral_13=(Token)match(input,55,FOLLOW_55_in_ruleScalarType7080); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2863:6: (enumLiteral_14= 'bytes' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2863:6: (enumLiteral_14= 'bytes' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2863:8: enumLiteral_14= 'bytes'
                    {
                    enumLiteral_14=(Token)match(input,56,FOLLOW_56_in_ruleScalarType7097); if (state.failed) return current;
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
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1420:3: ( ruleScalarTypeLink )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1420:5: ruleScalarTypeLink
        {
        pushFollow(FOLLOW_ruleScalarTypeLink_in_synpred1_InternalProtobuf3394);
        ruleScalarTypeLink();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalProtobuf

    // $ANTLR start synpred2_InternalProtobuf
    public final void synpred2_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1604:3: ( 'default' )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1604:5: 'default'
        {
        match(input,30,FOLLOW_30_in_synpred2_InternalProtobuf3854); if (state.failed) return ;

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


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA11_eotS =
        "\54\uffff";
    static final String DFA11_eofS =
        "\54\uffff";
    static final String DFA11_minS =
        "\1\47\4\5\1\uffff\43\16\1\6\1\17\1\uffff";
    static final String DFA11_maxS =
        "\1\51\4\72\1\uffff\43\16\1\6\1\33\1\uffff";
    static final String DFA11_acceptS =
        "\5\uffff\1\1\45\uffff\1\2";
    static final String DFA11_specialS =
        "\54\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\1\1\3",
            "\1\5\7\uffff\1\5\2\uffff\2\5\2\uffff\2\5\2\uffff\2\5\1\4\3\uffff\4\5\2\uffff\2\5\1\uffff\24\5",
            "\1\5\7\uffff\1\5\2\uffff\2\5\2\uffff\2\5\2\uffff\2\5\1\4\3\uffff\4\5\2\uffff\2\5\1\uffff\24\5",
            "\1\5\7\uffff\1\5\2\uffff\2\5\2\uffff\2\5\2\uffff\2\5\1\4\3\uffff\4\5\2\uffff\2\5\1\uffff\24\5",
            "\1\6\7\uffff\1\11\2\uffff\1\10\1\12\2\uffff\1\13\1\14\2\uffff\1\22\1\7\1\24\3\uffff\1\46\1\16\1\15\1\25\2\uffff\1\26\1\23\1\uffff\1\17\1\20\1\21\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\47\1\50",
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
            "\1\5\6\uffff\1\53\4\uffff\1\5",
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
            return "1083:1: (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup )";
        }
    }
    static final String DFA15_eotS =
        "\22\uffff";
    static final String DFA15_eofS =
        "\22\uffff";
    static final String DFA15_minS =
        "\1\5\17\0\2\uffff";
    static final String DFA15_maxS =
        "\1\72\17\0\2\uffff";
    static final String DFA15_acceptS =
        "\20\uffff\1\2\1\1";
    static final String DFA15_specialS =
        "\1\uffff\1\2\1\12\1\0\1\10\1\5\1\16\1\4\1\14\1\11\1\3\1\7\1\1\1\15\1\6\1\13\2\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\20\7\uffff\1\20\2\uffff\2\20\2\uffff\2\20\2\uffff\3\20\3\uffff\4\20\2\uffff\2\20\1\uffff\3\20\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\2\20",
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1420:1: ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_12 = input.LA(1);

                         
                        int index15_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index15_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_10 = input.LA(1);

                         
                        int index15_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index15_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_14 = input.LA(1);

                         
                        int index15_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index15_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_11 = input.LA(1);

                         
                        int index15_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index15_11);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA15_9 = input.LA(1);

                         
                        int index15_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index15_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA15_15 = input.LA(1);

                         
                        int index15_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index15_15);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA15_8 = input.LA(1);

                         
                        int index15_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index15_8);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA15_13 = input.LA(1);

                         
                        int index15_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index15_13);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\13\uffff";
    static final String DFA17_eofS =
        "\13\uffff";
    static final String DFA17_minS =
        "\1\5\1\16\1\uffff\1\4\6\0\1\uffff";
    static final String DFA17_maxS =
        "\1\72\1\16\1\uffff\1\74\6\0\1\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\7\uffff\1\1";
    static final String DFA17_specialS =
        "\4\uffff\1\4\1\5\1\0\1\2\1\3\1\1\1\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\7\uffff\1\2\2\uffff\2\2\2\uffff\2\2\2\uffff\3\2\3\uffff\1\1\3\2\2\uffff\2\2\1\uffff\24\2",
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1604:1: ( ( ( 'default' )=>this_DefaultValueFieldOption_0= ruleDefaultValueFieldOption ) | this_NativeFieldOption_1= ruleNativeFieldOption )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_9 = input.LA(1);

                         
                        int index17_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index17_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_8 = input.LA(1);

                         
                        int index17_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index17_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProtobuf()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleProto_in_entryRuleProto75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProto85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_ruleProto131 = new BitSet(new long[]{0x000003A180330002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProto153 = new BitSet(new long[]{0x000003A180330002L});
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
    public static final BitSet FOLLOW_16_in_rulePackage593 = new BitSet(new long[]{0x07FFFFB3C7332020L});
    public static final BitSet FOLLOW_ruleVar_full_in_rulePackage614 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePackage626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicImport_in_ruleImport719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakImport_in_ruleImport746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicImport_in_entryRulePublicImport781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePublicImport791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePublicImport828 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePublicImport840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePublicImport857 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePublicImport874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakImport_in_entryRuleWeakImport910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeakImport920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleWeakImport957 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleWeakImport969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWeakImport986 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleWeakImport1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption1039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOption1086 = new BitSet(new long[]{0x07FFFFB3C7332020L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleOption1109 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleOption1121 = new BitSet(new long[]{0x18000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleOption1142 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOption1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_ruleValue1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_entryRuleSimpleValueLink1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValueLink1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_ruleSimpleValueLink1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_ruleSimpleValueLink1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_ruleSimpleValueLink1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLink_in_ruleSimpleValueLink1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLink_in_entryRuleEnumLink1453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLink1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLink1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_entryRuleStringLink1542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLink1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLink1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink1633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLink1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleBooleanLink1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_entryRuleNumberLink1723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLink1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_ruleNumberLink1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_ruleNumberLink1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_entryRuleIntLink1842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLink1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleIntLink1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink1933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLink1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMDOUBLE_in_ruleDoubleLink1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType2024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleComplexType2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_ruleComplexType2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType2143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensibleType2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleExtensibleType2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleExtensibleType2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage2262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMessage2309 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage2326 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMessage2343 = new BitSet(new long[]{0x000003A181B30000L});
    public static final BitSet FOLLOW_ruleMessageElement_in_ruleMessage2364 = new BitSet(new long[]{0x000003A181B30000L});
    public static final BitSet FOLLOW_23_in_ruleMessage2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_entryRuleMessageElement2413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageElement2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleMessageElement2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_ruleMessageElement2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleMessageElement2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleMessageElement2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_ruleMessageElement2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_ruleMessageElement2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_ruleMessageElement2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement2667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedElement2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_ruleIndexedElement2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleIndexedElement2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange2786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionRange2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleExtensionRange2833 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleExtensionRange2850 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_25_in_ruleExtensionRange2868 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleExtensionRange2885 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExtensionRange2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_entryRuleMessageField2940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageField2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleMessageField2996 = new BitSet(new long[]{0x07FFFFB3C7332020L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleMessageField3017 = new BitSet(new long[]{0x07FFFFB3C7332020L});
    public static final BitSet FOLLOW_ruleVar_in_ruleMessageField3038 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMessageField3050 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleMessageField3067 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_ruleMessageField3093 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMessageField3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup3142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleGroup3198 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleGroup3210 = new BitSet(new long[]{0x07FFFFB3C7332020L});
    public static final BitSet FOLLOW_ruleVar_in_ruleGroup3231 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGroup3243 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleGroup3260 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleGroup3277 = new BitSet(new long[]{0x0000038080A00000L});
    public static final BitSet FOLLOW_ruleMessageField_in_ruleGroup3298 = new BitSet(new long[]{0x0000038080A00000L});
    public static final BitSet FOLLOW_23_in_ruleGroup3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_entryRuleTypeLink3347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLink3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_ruleTypeLink3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_ruleTypeLink3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink3473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLink3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleComplexTypeLink3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink3565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarTypeLink3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarType_in_ruleScalarTypeLink3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions3655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOptions3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFieldOptions3702 = new BitSet(new long[]{0x07FFFFB3C7332020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleFieldOptions3723 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleFieldOptions3736 = new BitSet(new long[]{0x07FFFFB3C7332020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleFieldOptions3757 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleFieldOptions3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_entryRuleFieldOption3807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOption3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_ruleFieldOption3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_ruleFieldOption3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption3935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValueFieldOption3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDefaultValueFieldOption3990 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDefaultValueFieldOption4003 = new BitSet(new long[]{0x18000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleDefaultValueFieldOption4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption4060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeFieldOption4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_ruleNativeFieldOption4116 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNativeFieldOption4128 = new BitSet(new long[]{0x18000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleNativeFieldOption4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_entryRuleOptionSource4185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionSource4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleOptionSource4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum4277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEnum4324 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum4341 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEnum4358 = new BitSet(new long[]{0x000003A180B30020L});
    public static final BitSet FOLLOW_ruleEnumElement_in_ruleEnum4379 = new BitSet(new long[]{0x000003A180B30020L});
    public static final BitSet FOLLOW_23_in_ruleEnum4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_entryRuleEnumElement4428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumElement4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_ruleEnumElement4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_ruleEnumElement4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_entryRuleEnumField4547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumField4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumField4599 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumField4616 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleEnumField4633 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_27_in_ruleEnumField4651 = new BitSet(new long[]{0x07FFFFB3C7332020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleEnumField4672 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleEnumField4685 = new BitSet(new long[]{0x07FFFFB3C7332020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleEnumField4706 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleEnumField4720 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEnumField4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService4770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleService4817 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService4834 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleService4851 = new BitSet(new long[]{0x000003A380330000L});
    public static final BitSet FOLLOW_ruleServiceElement_in_ruleService4872 = new BitSet(new long[]{0x000003A380B30000L});
    public static final BitSet FOLLOW_23_in_ruleService4885 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleService4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceElement_in_entryRuleServiceElement4936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceElement4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_ruleServiceElement4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_ruleServiceElement5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_entryRuleRpc5055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRpc5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRpc5102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRpc5119 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleRpc5136 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMessageLink_in_ruleRpc5157 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleRpc5169 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleRpc5181 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleRpc5193 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMessageLink_in_ruleRpc5214 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleRpc5226 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_22_in_ruleRpc5239 = new BitSet(new long[]{0x000003A180B30000L});
    public static final BitSet FOLLOW_ruleOption_in_ruleRpc5260 = new BitSet(new long[]{0x000003A180B30000L});
    public static final BitSet FOLLOW_23_in_ruleRpc5273 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRpc5288 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_entryRuleMessageLink5326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageLink5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_ruleMessageLink5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_entryRuleExtend5418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtend5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleExtend5465 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_ruleExtend5488 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExtend5500 = new BitSet(new long[]{0x000003A181B30000L});
    public static final BitSet FOLLOW_ruleMessageElement_in_ruleExtend5521 = new BitSet(new long[]{0x000003A181B30000L});
    public static final BitSet FOLLOW_23_in_ruleExtend5534 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleExtend5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_entryRuleVar_full5586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar_full5597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_ruleVar_full5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleVar_full5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar5723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVar5774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_ruleVar5807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID5853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFULL_ID5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFULL_ID5904 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleFULL_ID5923 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFULL_ID5938 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_entryRuleVarReserved5986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarReserved5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleVarReserved6035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleVarReserved6054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleVarReserved6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVarReserved6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleVarReserved6111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleVarReserved6130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleVarReserved6149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleVarReserved6168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleVarReserved6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleVarReserved6206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleVarReserved6225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleVarReserved6244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleVarReserved6263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleVarReserved6282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleVarReserved6301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleVarReserved6320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleVarReserved6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleVarReserved6358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleVarReserved6377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVarReserved6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVarReserved6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVarReserved6434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleVarReserved6453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleVarReserved6472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleVarReserved6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleVarReserved6510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleVarReserved6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleVarReserved6548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleVarReserved6567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleVarReserved6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleVarReserved6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleVarReserved6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleVarReserved6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleVarReserved6662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBOOL6718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleBOOL6735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleModifier6780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleModifier6797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleModifier6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleScalarType6859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleScalarType6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleScalarType6893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleScalarType6910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleScalarType6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleScalarType6944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleScalarType6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleScalarType6978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleScalarType6995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleScalarType7012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleScalarType7029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleScalarType7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleScalarType7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleScalarType7080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleScalarType7097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_synpred1_InternalProtobuf3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred2_InternalProtobuf3854 = new BitSet(new long[]{0x0000000000000002L});

}