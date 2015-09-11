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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_NUMINT", "RULE_NUMDOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'syntax'", "'='", "';'", "'package'", "'import'", "'public'", "'weak'", "'option'", "'message'", "'{'", "'}'", "'oneof'", "'extensions'", "','", "'to'", "'max'", "'group'", "'['", "']'", "'packed'", "'default'", "'enum'", "'service'", "'rpc'", "'('", "')'", "'returns'", "'extend'", "'.'", "'required'", "'optional'", "'repeated'", "'int32'", "'int64'", "'uint32'", "'uint64'", "'sint32'", "'sint64'", "'fixed32'", "'fixed64'", "'sfixed32'", "'sfixed64'", "'float'", "'double'", "'bool'", "'string'", "'bytes'", "'void'", "'true'", "'false'"
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
    public static final int T__62=62;
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

                if ( ((LA2_0>=16 && LA2_0<=17)||(LA2_0>=20 && LA2_0<=21)||(LA2_0>=34 && LA2_0<=35)||LA2_0==40||(LA2_0>=42 && LA2_0<=44)) ) {
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:134:1: ruleStatement returns [EObject current=null] : (this_Package_0= rulePackage | this_Import_1= ruleImport | this_ComplexType_2= ruleComplexType | ( ( 'extend' )=>this_Extend_3= ruleExtend ) | this_Service_4= ruleService | this_CustomOption_5= ruleCustomOption ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_Import_1 = null;

        EObject this_ComplexType_2 = null;

        EObject this_Extend_3 = null;

        EObject this_Service_4 = null;

        EObject this_CustomOption_5 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:137:28: ( (this_Package_0= rulePackage | this_Import_1= ruleImport | this_ComplexType_2= ruleComplexType | ( ( 'extend' )=>this_Extend_3= ruleExtend ) | this_Service_4= ruleService | this_CustomOption_5= ruleCustomOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:138:1: (this_Package_0= rulePackage | this_Import_1= ruleImport | this_ComplexType_2= ruleComplexType | ( ( 'extend' )=>this_Extend_3= ruleExtend ) | this_Service_4= ruleService | this_CustomOption_5= ruleCustomOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:138:1: (this_Package_0= rulePackage | this_Import_1= ruleImport | this_ComplexType_2= ruleComplexType | ( ( 'extend' )=>this_Extend_3= ruleExtend ) | this_Service_4= ruleService | this_CustomOption_5= ruleCustomOption )
            int alt3=6;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else if ( (LA3_0==21||LA3_0==34||(LA3_0>=42 && LA3_0<=44)) ) {
                alt3=3;
            }
            else if ( (LA3_0==40) && (synpred1_InternalProtobuf())) {
                alt3=4;
            }
            else if ( (LA3_0==35) ) {
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:190:5: this_CustomOption_5= ruleCustomOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getCustomOptionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCustomOption_in_ruleStatement391);
                    this_CustomOption_5=ruleCustomOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CustomOption_5; 
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

                if ( (LA4_1==18) ) {
                    alt4=1;
                }
                else if ( (LA4_1==RULE_STRING||LA4_1==19) ) {
                    alt4=2;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:660:1: ruleSimpleValueLink returns [EObject current=null] : (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_CustomIdLink_3= ruleCustomIdLink ) ;
    public final EObject ruleSimpleValueLink() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLink_0 = null;

        EObject this_BooleanLink_1 = null;

        EObject this_StringLink_2 = null;

        EObject this_CustomIdLink_3 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:663:28: ( (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_CustomIdLink_3= ruleCustomIdLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:664:1: (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_CustomIdLink_3= ruleCustomIdLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:664:1: (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_CustomIdLink_3= ruleCustomIdLink )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_NUMINT:
            case RULE_NUMDOUBLE:
                {
                alt7=1;
                }
                break;
            case 61:
            case 62:
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:695:5: this_CustomIdLink_3= ruleCustomIdLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleValueLinkAccess().getCustomIdLinkParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCustomIdLink_in_ruleSimpleValueLink1706);
                    this_CustomIdLink_3=ruleCustomIdLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CustomIdLink_3; 
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


    // $ANTLR start "entryRuleCustomIdLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:711:1: entryRuleCustomIdLink returns [EObject current=null] : iv_ruleCustomIdLink= ruleCustomIdLink EOF ;
    public final EObject entryRuleCustomIdLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomIdLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:712:2: (iv_ruleCustomIdLink= ruleCustomIdLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:713:2: iv_ruleCustomIdLink= ruleCustomIdLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCustomIdLinkRule()); 
            }
            pushFollow(FOLLOW_ruleCustomIdLink_in_entryRuleCustomIdLink1741);
            iv_ruleCustomIdLink=ruleCustomIdLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCustomIdLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomIdLink1751); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomIdLink"


    // $ANTLR start "ruleCustomIdLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:720:1: ruleCustomIdLink returns [EObject current=null] : ( (lv_target_0_0= RULE_ID ) ) ;
    public final EObject ruleCustomIdLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:723:28: ( ( (lv_target_0_0= RULE_ID ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:724:1: ( (lv_target_0_0= RULE_ID ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:724:1: ( (lv_target_0_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:725:1: (lv_target_0_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:725:1: (lv_target_0_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:726:3: lv_target_0_0= RULE_ID
            {
            lv_target_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomIdLink1792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_target_0_0, grammarAccess.getCustomIdLinkAccess().getTargetIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCustomIdLinkRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"target",
                      		lv_target_0_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleCustomIdLink"


    // $ANTLR start "entryRuleStringLink"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:750:1: entryRuleStringLink returns [EObject current=null] : iv_ruleStringLink= ruleStringLink EOF ;
    public final EObject entryRuleStringLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:751:2: (iv_ruleStringLink= ruleStringLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:752:2: iv_ruleStringLink= ruleStringLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLinkRule()); 
            }
            pushFollow(FOLLOW_ruleStringLink_in_entryRuleStringLink1832);
            iv_ruleStringLink=ruleStringLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLink1842); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:759:1: ruleStringLink returns [EObject current=null] : ( (lv_target_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:762:28: ( ( (lv_target_0_0= RULE_STRING ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:763:1: ( (lv_target_0_0= RULE_STRING ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:763:1: ( (lv_target_0_0= RULE_STRING ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:764:1: (lv_target_0_0= RULE_STRING )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:764:1: (lv_target_0_0= RULE_STRING )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:765:3: lv_target_0_0= RULE_STRING
            {
            lv_target_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLink1883); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:789:1: entryRuleBooleanLink returns [EObject current=null] : iv_ruleBooleanLink= ruleBooleanLink EOF ;
    public final EObject entryRuleBooleanLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:790:2: (iv_ruleBooleanLink= ruleBooleanLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:791:2: iv_ruleBooleanLink= ruleBooleanLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLinkRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink1923);
            iv_ruleBooleanLink=ruleBooleanLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLink1933); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:798:1: ruleBooleanLink returns [EObject current=null] : ( (lv_target_0_0= ruleBOOL ) ) ;
    public final EObject ruleBooleanLink() throws RecognitionException {
        EObject current = null;

        Enumerator lv_target_0_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:801:28: ( ( (lv_target_0_0= ruleBOOL ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:802:1: ( (lv_target_0_0= ruleBOOL ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:802:1: ( (lv_target_0_0= ruleBOOL ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:803:1: (lv_target_0_0= ruleBOOL )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:803:1: (lv_target_0_0= ruleBOOL )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:804:3: lv_target_0_0= ruleBOOL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBooleanLinkAccess().getTargetBOOLEnumRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBOOL_in_ruleBooleanLink1978);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:828:1: entryRuleNumberLink returns [EObject current=null] : iv_ruleNumberLink= ruleNumberLink EOF ;
    public final EObject entryRuleNumberLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:829:2: (iv_ruleNumberLink= ruleNumberLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:830:2: iv_ruleNumberLink= ruleNumberLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLinkRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLink_in_entryRuleNumberLink2013);
            iv_ruleNumberLink=ruleNumberLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLink2023); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:837:1: ruleNumberLink returns [EObject current=null] : (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink ) ;
    public final EObject ruleNumberLink() throws RecognitionException {
        EObject current = null;

        EObject this_IntLink_0 = null;

        EObject this_DoubleLink_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:840:28: ( (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:841:1: (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:841:1: (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink )
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:842:5: this_IntLink_0= ruleIntLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberLinkAccess().getIntLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLink_in_ruleNumberLink2070);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:852:5: this_DoubleLink_1= ruleDoubleLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberLinkAccess().getDoubleLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoubleLink_in_ruleNumberLink2097);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:868:1: entryRuleIntLink returns [EObject current=null] : iv_ruleIntLink= ruleIntLink EOF ;
    public final EObject entryRuleIntLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:869:2: (iv_ruleIntLink= ruleIntLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:870:2: iv_ruleIntLink= ruleIntLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLinkRule()); 
            }
            pushFollow(FOLLOW_ruleIntLink_in_entryRuleIntLink2132);
            iv_ruleIntLink=ruleIntLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLink2142); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:877:1: ruleIntLink returns [EObject current=null] : ( (lv_target_0_0= RULE_NUMINT ) ) ;
    public final EObject ruleIntLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:880:28: ( ( (lv_target_0_0= RULE_NUMINT ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:881:1: ( (lv_target_0_0= RULE_NUMINT ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:881:1: ( (lv_target_0_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:882:1: (lv_target_0_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:882:1: (lv_target_0_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:883:3: lv_target_0_0= RULE_NUMINT
            {
            lv_target_0_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleIntLink2183); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:907:1: entryRuleDoubleLink returns [EObject current=null] : iv_ruleDoubleLink= ruleDoubleLink EOF ;
    public final EObject entryRuleDoubleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:908:2: (iv_ruleDoubleLink= ruleDoubleLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:909:2: iv_ruleDoubleLink= ruleDoubleLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleLinkRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink2223);
            iv_ruleDoubleLink=ruleDoubleLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoubleLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLink2233); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:916:1: ruleDoubleLink returns [EObject current=null] : ( (lv_target_0_0= RULE_NUMDOUBLE ) ) ;
    public final EObject ruleDoubleLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:919:28: ( ( (lv_target_0_0= RULE_NUMDOUBLE ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:920:1: ( (lv_target_0_0= RULE_NUMDOUBLE ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:920:1: ( (lv_target_0_0= RULE_NUMDOUBLE ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:921:1: (lv_target_0_0= RULE_NUMDOUBLE )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:921:1: (lv_target_0_0= RULE_NUMDOUBLE )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:922:3: lv_target_0_0= RULE_NUMDOUBLE
            {
            lv_target_0_0=(Token)match(input,RULE_NUMDOUBLE,FOLLOW_RULE_NUMDOUBLE_in_ruleDoubleLink2274); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:946:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:947:2: (iv_ruleComplexType= ruleComplexType EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:948:2: iv_ruleComplexType= ruleComplexType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexTypeRule()); 
            }
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType2314);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType2324); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:955:1: ruleComplexType returns [EObject current=null] : (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        EObject this_Enum_0 = null;

        EObject this_ExtensibleType_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:958:28: ( (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:959:1: (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:959:1: (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            else if ( (LA9_0==21||(LA9_0>=42 && LA9_0<=44)) ) {
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:960:5: this_Enum_0= ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexTypeAccess().getEnumParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnum_in_ruleComplexType2371);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:970:5: this_ExtensibleType_1= ruleExtensibleType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexTypeAccess().getExtensibleTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtensibleType_in_ruleComplexType2398);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:986:1: entryRuleExtensibleType returns [EObject current=null] : iv_ruleExtensibleType= ruleExtensibleType EOF ;
    public final EObject entryRuleExtensibleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensibleType = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:987:2: (iv_ruleExtensibleType= ruleExtensibleType EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:988:2: iv_ruleExtensibleType= ruleExtensibleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtensibleTypeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType2433);
            iv_ruleExtensibleType=ruleExtensibleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtensibleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensibleType2443); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:995:1: ruleExtensibleType returns [EObject current=null] : (this_Message_0= ruleMessage | this_Group_1= ruleGroup ) ;
    public final EObject ruleExtensibleType() throws RecognitionException {
        EObject current = null;

        EObject this_Message_0 = null;

        EObject this_Group_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:998:28: ( (this_Message_0= ruleMessage | this_Group_1= ruleGroup ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:999:1: (this_Message_0= ruleMessage | this_Group_1= ruleGroup )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:999:1: (this_Message_0= ruleMessage | this_Group_1= ruleGroup )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=42 && LA10_0<=44)) ) {
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1000:5: this_Message_0= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensibleTypeAccess().getMessageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleExtensibleType2490);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1010:5: this_Group_1= ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensibleTypeAccess().getGroupParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroup_in_ruleExtensibleType2517);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1026:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1027:2: (iv_ruleMessage= ruleMessage EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1028:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage2552);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage2562); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1035:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1038:28: ( (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1039:1: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1039:1: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1039:3: otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleMessage2599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1043:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1044:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1044:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1045:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage2616); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleMessage2633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1065:1: ( (lv_elements_3_0= ruleMessageElement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=20 && LA11_0<=21)||(LA11_0>=24 && LA11_0<=25)||(LA11_0>=34 && LA11_0<=35)||LA11_0==40||(LA11_0>=42 && LA11_0<=44)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1066:1: (lv_elements_3_0= ruleMessageElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1066:1: (lv_elements_3_0= ruleMessageElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1067:3: lv_elements_3_0= ruleMessageElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMessageAccess().getElementsMessageElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMessageElement_in_ruleMessage2654);
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleMessage2667); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1095:1: entryRuleMessageElement returns [EObject current=null] : iv_ruleMessageElement= ruleMessageElement EOF ;
    public final EObject entryRuleMessageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1096:2: (iv_ruleMessageElement= ruleMessageElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1097:2: iv_ruleMessageElement= ruleMessageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageElementRule()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_entryRuleMessageElement2703);
            iv_ruleMessageElement=ruleMessageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageElement2713); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1104:1: ruleMessageElement returns [EObject current=null] : (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Oneof_2= ruleOneof | this_Enum_3= ruleEnum | this_Service_4= ruleService | ( ( 'extend' )=>this_Extend_5= ruleExtend ) | this_ExtensionRange_6= ruleExtensionRange | this_Option_7= ruleOption ) ;
    public final EObject ruleMessageElement() throws RecognitionException {
        EObject current = null;

        EObject this_Message_0 = null;

        EObject this_IndexedElement_1 = null;

        EObject this_Oneof_2 = null;

        EObject this_Enum_3 = null;

        EObject this_Service_4 = null;

        EObject this_Extend_5 = null;

        EObject this_ExtensionRange_6 = null;

        EObject this_Option_7 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1107:28: ( (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Oneof_2= ruleOneof | this_Enum_3= ruleEnum | this_Service_4= ruleService | ( ( 'extend' )=>this_Extend_5= ruleExtend ) | this_ExtensionRange_6= ruleExtensionRange | this_Option_7= ruleOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1108:1: (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Oneof_2= ruleOneof | this_Enum_3= ruleEnum | this_Service_4= ruleService | ( ( 'extend' )=>this_Extend_5= ruleExtend ) | this_ExtensionRange_6= ruleExtensionRange | this_Option_7= ruleOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1108:1: (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Oneof_2= ruleOneof | this_Enum_3= ruleEnum | this_Service_4= ruleService | ( ( 'extend' )=>this_Extend_5= ruleExtend ) | this_ExtensionRange_6= ruleExtensionRange | this_Option_7= ruleOption )
            int alt12=8;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=42 && LA12_0<=44)) ) {
                alt12=2;
            }
            else if ( (LA12_0==24) ) {
                alt12=3;
            }
            else if ( (LA12_0==34) ) {
                alt12=4;
            }
            else if ( (LA12_0==35) ) {
                alt12=5;
            }
            else if ( (LA12_0==40) && (synpred3_InternalProtobuf())) {
                alt12=6;
            }
            else if ( (LA12_0==25) ) {
                alt12=7;
            }
            else if ( (LA12_0==20) ) {
                alt12=8;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1109:5: this_Message_0= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getMessageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleMessageElement2760);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1119:5: this_IndexedElement_1= ruleIndexedElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getIndexedElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIndexedElement_in_ruleMessageElement2787);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1129:5: this_Oneof_2= ruleOneof
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getOneofParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOneof_in_ruleMessageElement2814);
                    this_Oneof_2=ruleOneof();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Oneof_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1139:5: this_Enum_3= ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getEnumParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnum_in_ruleMessageElement2841);
                    this_Enum_3=ruleEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Enum_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1149:5: this_Service_4= ruleService
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getServiceParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleService_in_ruleMessageElement2868);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1158:6: ( ( 'extend' )=>this_Extend_5= ruleExtend )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1158:6: ( ( 'extend' )=>this_Extend_5= ruleExtend )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1158:7: ( 'extend' )=>this_Extend_5= ruleExtend
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getExtendParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtend_in_ruleMessageElement2903);
                    this_Extend_5=ruleExtend();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Extend_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1170:5: this_ExtensionRange_6= ruleExtensionRange
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getExtensionRangeParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtensionRange_in_ruleMessageElement2931);
                    this_ExtensionRange_6=ruleExtensionRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExtensionRange_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1180:5: this_Option_7= ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getOptionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOption_in_ruleMessageElement2958);
                    this_Option_7=ruleOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Option_7; 
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


    // $ANTLR start "entryRuleOneof"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1196:1: entryRuleOneof returns [EObject current=null] : iv_ruleOneof= ruleOneof EOF ;
    public final EObject entryRuleOneof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneof = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1197:2: (iv_ruleOneof= ruleOneof EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1198:2: iv_ruleOneof= ruleOneof EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOneofRule()); 
            }
            pushFollow(FOLLOW_ruleOneof_in_entryRuleOneof2993);
            iv_ruleOneof=ruleOneof();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOneof; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneof3003); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOneof"


    // $ANTLR start "ruleOneof"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1205:1: ruleOneof returns [EObject current=null] : (otherlv_0= 'oneof' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleOneofField ) )* otherlv_4= '}' ) ;
    public final EObject ruleOneof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1208:28: ( (otherlv_0= 'oneof' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleOneofField ) )* otherlv_4= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1209:1: (otherlv_0= 'oneof' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleOneofField ) )* otherlv_4= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1209:1: (otherlv_0= 'oneof' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleOneofField ) )* otherlv_4= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1209:3: otherlv_0= 'oneof' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleOneofField ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleOneof3040); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOneofAccess().getOneofKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1213:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1214:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1214:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1215:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOneof3057); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getOneofAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOneofRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleOneof3074); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOneofAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1235:1: ( (lv_fields_3_0= ruleOneofField ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==13||(LA13_0>=16 && LA13_0<=17)||(LA13_0>=19 && LA13_0<=21)||LA13_0==25||(LA13_0>=27 && LA13_0<=29)||(LA13_0>=32 && LA13_0<=36)||(LA13_0>=39 && LA13_0<=40)||(LA13_0>=42 && LA13_0<=60)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1236:1: (lv_fields_3_0= ruleOneofField )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1236:1: (lv_fields_3_0= ruleOneofField )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1237:3: lv_fields_3_0= ruleOneofField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOneofAccess().getFieldsOneofFieldParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOneofField_in_ruleOneof3095);
            	    lv_fields_3_0=ruleOneofField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOneofRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fields",
            	              		lv_fields_3_0, 
            	              		"OneofField");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleOneof3108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getOneofAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleOneof"


    // $ANTLR start "entryRuleOneofField"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1265:1: entryRuleOneofField returns [EObject current=null] : iv_ruleOneofField= ruleOneofField EOF ;
    public final EObject entryRuleOneofField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneofField = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1266:2: (iv_ruleOneofField= ruleOneofField EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1267:2: iv_ruleOneofField= ruleOneofField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOneofFieldRule()); 
            }
            pushFollow(FOLLOW_ruleOneofField_in_entryRuleOneofField3144);
            iv_ruleOneofField=ruleOneofField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOneofField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneofField3154); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOneofField"


    // $ANTLR start "ruleOneofField"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1274:1: ruleOneofField returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_index_3_0= RULE_NUMINT ) ) ( (lv_options_4_0= ruleFieldOptions ) )? otherlv_5= ';' ) ;
    public final EObject ruleOneofField() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_index_3_0=null;
        Token otherlv_5=null;
        EObject lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_options_4_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1277:28: ( ( ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_index_3_0= RULE_NUMINT ) ) ( (lv_options_4_0= ruleFieldOptions ) )? otherlv_5= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1278:1: ( ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_index_3_0= RULE_NUMINT ) ) ( (lv_options_4_0= ruleFieldOptions ) )? otherlv_5= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1278:1: ( ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_index_3_0= RULE_NUMINT ) ) ( (lv_options_4_0= ruleFieldOptions ) )? otherlv_5= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1278:2: ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_index_3_0= RULE_NUMINT ) ) ( (lv_options_4_0= ruleFieldOptions ) )? otherlv_5= ';'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1278:2: ( (lv_type_0_0= ruleTypeLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1279:1: (lv_type_0_0= ruleTypeLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1279:1: (lv_type_0_0= ruleTypeLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1280:3: lv_type_0_0= ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOneofFieldAccess().getTypeTypeLinkParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeLink_in_ruleOneofField3200);
            lv_type_0_0=ruleTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOneofFieldRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"TypeLink");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1296:2: ( (lv_name_1_0= ruleVar ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1297:1: (lv_name_1_0= ruleVar )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1297:1: (lv_name_1_0= ruleVar )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1298:3: lv_name_1_0= ruleVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOneofFieldAccess().getNameVarParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_in_ruleOneofField3221);
            lv_name_1_0=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOneofFieldRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"Var");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleOneofField3233); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOneofFieldAccess().getEqualsSignKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1318:1: ( (lv_index_3_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1319:1: (lv_index_3_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1319:1: (lv_index_3_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1320:3: lv_index_3_0= RULE_NUMINT
            {
            lv_index_3_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleOneofField3250); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_index_3_0, grammarAccess.getOneofFieldAccess().getIndexNUMINTTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOneofFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"index",
                      		lv_index_3_0, 
                      		"NUMINT");
              	    
            }

            }


            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1336:2: ( (lv_options_4_0= ruleFieldOptions ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1337:1: (lv_options_4_0= ruleFieldOptions )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1337:1: (lv_options_4_0= ruleFieldOptions )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1338:3: lv_options_4_0= ruleFieldOptions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOneofFieldAccess().getOptionsFieldOptionsParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldOptions_in_ruleOneofField3276);
                    lv_options_4_0=ruleFieldOptions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOneofFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"options",
                              		lv_options_4_0, 
                              		"FieldOptions");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleOneofField3289); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getOneofFieldAccess().getSemicolonKeyword_5());
                  
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
    // $ANTLR end "ruleOneofField"


    // $ANTLR start "entryRuleIndexedElement"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1366:1: entryRuleIndexedElement returns [EObject current=null] : iv_ruleIndexedElement= ruleIndexedElement EOF ;
    public final EObject entryRuleIndexedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1367:2: (iv_ruleIndexedElement= ruleIndexedElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1368:2: iv_ruleIndexedElement= ruleIndexedElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedElementRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement3325);
            iv_ruleIndexedElement=ruleIndexedElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedElement3335); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1375:1: ruleIndexedElement returns [EObject current=null] : (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup ) ;
    public final EObject ruleIndexedElement() throws RecognitionException {
        EObject current = null;

        EObject this_MessageField_0 = null;

        EObject this_Group_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1378:28: ( (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1379:1: (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1379:1: (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1380:5: this_MessageField_0= ruleMessageField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIndexedElementAccess().getMessageFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessageField_in_ruleIndexedElement3382);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1390:5: this_Group_1= ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIndexedElementAccess().getGroupParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroup_in_ruleIndexedElement3409);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1406:1: entryRuleExtensionRange returns [EObject current=null] : iv_ruleExtensionRange= ruleExtensionRange EOF ;
    public final EObject entryRuleExtensionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionRange = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1407:2: (iv_ruleExtensionRange= ruleExtensionRange EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1408:2: iv_ruleExtensionRange= ruleExtensionRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtensionRangeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange3444);
            iv_ruleExtensionRange=ruleExtensionRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtensionRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionRange3454); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1415:1: ruleExtensionRange returns [EObject current=null] : (otherlv_0= 'extensions' ( (lv_ranges_1_0= ruleRange ) ) (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleExtensionRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ranges_1_0 = null;

        EObject lv_ranges_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1418:28: ( (otherlv_0= 'extensions' ( (lv_ranges_1_0= ruleRange ) ) (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )* otherlv_4= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1419:1: (otherlv_0= 'extensions' ( (lv_ranges_1_0= ruleRange ) ) (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )* otherlv_4= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1419:1: (otherlv_0= 'extensions' ( (lv_ranges_1_0= ruleRange ) ) (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )* otherlv_4= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1419:3: otherlv_0= 'extensions' ( (lv_ranges_1_0= ruleRange ) ) (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleExtensionRange3491); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExtensionRangeAccess().getExtensionsKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1423:1: ( (lv_ranges_1_0= ruleRange ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1424:1: (lv_ranges_1_0= ruleRange )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1424:1: (lv_ranges_1_0= ruleRange )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1425:3: lv_ranges_1_0= ruleRange
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExtensionRangeAccess().getRangesRangeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRange_in_ruleExtensionRange3512);
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1441:2: (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1441:4: otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleExtensionRange3525); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getExtensionRangeAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1445:1: ( (lv_ranges_3_0= ruleRange ) )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1446:1: (lv_ranges_3_0= ruleRange )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1446:1: (lv_ranges_3_0= ruleRange )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1447:3: lv_ranges_3_0= ruleRange
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExtensionRangeAccess().getRangesRangeParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRange_in_ruleExtensionRange3546);
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
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleExtensionRange3560); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1475:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1476:2: (iv_ruleRange= ruleRange EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1477:2: iv_ruleRange= ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange3596);
            iv_ruleRange=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange3606); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1484:1: ruleRange returns [EObject current=null] : ( ( (lv_from_0_0= RULE_NUMINT ) ) (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )? ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token lv_from_0_0=null;
        Token otherlv_1=null;
        Token lv_to_2_0=null;
        Token lv_max_3_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1487:28: ( ( ( (lv_from_0_0= RULE_NUMINT ) ) (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )? ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1488:1: ( ( (lv_from_0_0= RULE_NUMINT ) ) (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )? )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1488:1: ( ( (lv_from_0_0= RULE_NUMINT ) ) (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )? )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1488:2: ( (lv_from_0_0= RULE_NUMINT ) ) (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )?
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1488:2: ( (lv_from_0_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1489:1: (lv_from_0_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1489:1: (lv_from_0_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1490:3: lv_from_0_0= RULE_NUMINT
            {
            lv_from_0_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleRange3648); if (state.failed) return current;
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1506:2: (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1506:4: otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) )
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleRange3666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getRangeAccess().getToKeyword_1_0());
                          
                    }
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1510:1: ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_NUMINT) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==28) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1510:2: ( (lv_to_2_0= RULE_NUMINT ) )
                            {
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1510:2: ( (lv_to_2_0= RULE_NUMINT ) )
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1511:1: (lv_to_2_0= RULE_NUMINT )
                            {
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1511:1: (lv_to_2_0= RULE_NUMINT )
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1512:3: lv_to_2_0= RULE_NUMINT
                            {
                            lv_to_2_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleRange3684); if (state.failed) return current;
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
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1529:6: ( (lv_max_3_0= 'max' ) )
                            {
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1529:6: ( (lv_max_3_0= 'max' ) )
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1530:1: (lv_max_3_0= 'max' )
                            {
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1530:1: (lv_max_3_0= 'max' )
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1531:3: lv_max_3_0= 'max'
                            {
                            lv_max_3_0=(Token)match(input,28,FOLLOW_28_in_ruleRange3713); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1552:1: entryRuleMessageField returns [EObject current=null] : iv_ruleMessageField= ruleMessageField EOF ;
    public final EObject entryRuleMessageField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageField = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1553:2: (iv_ruleMessageField= ruleMessageField EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1554:2: iv_ruleMessageField= ruleMessageField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageFieldRule()); 
            }
            pushFollow(FOLLOW_ruleMessageField_in_entryRuleMessageField3765);
            iv_ruleMessageField=ruleMessageField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageField3775); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1561:1: ruleMessageField returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1564:28: ( ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1565:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1565:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1565:2: ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1565:2: ( (lv_modifier_0_0= ruleModifier ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1566:1: (lv_modifier_0_0= ruleModifier )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1566:1: (lv_modifier_0_0= ruleModifier )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1567:3: lv_modifier_0_0= ruleModifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageFieldAccess().getModifierModifierEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleModifier_in_ruleMessageField3821);
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1583:2: ( (lv_type_1_0= ruleTypeLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1584:1: (lv_type_1_0= ruleTypeLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1584:1: (lv_type_1_0= ruleTypeLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1585:3: lv_type_1_0= ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageFieldAccess().getTypeTypeLinkParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeLink_in_ruleMessageField3842);
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1601:2: ( (lv_name_2_0= ruleVar ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1602:1: (lv_name_2_0= ruleVar )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1602:1: (lv_name_2_0= ruleVar )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1603:3: lv_name_2_0= ruleVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageFieldAccess().getNameVarParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_in_ruleMessageField3863);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleMessageField3875); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMessageFieldAccess().getEqualsSignKeyword_3());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1623:1: ( (lv_index_4_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1624:1: (lv_index_4_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1624:1: (lv_index_4_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1625:3: lv_index_4_0= RULE_NUMINT
            {
            lv_index_4_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleMessageField3892); if (state.failed) return current;
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1641:2: ( (lv_options_5_0= ruleFieldOptions ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1642:1: (lv_options_5_0= ruleFieldOptions )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1642:1: (lv_options_5_0= ruleFieldOptions )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1643:3: lv_options_5_0= ruleFieldOptions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMessageFieldAccess().getOptionsFieldOptionsParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldOptions_in_ruleMessageField3918);
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleMessageField3931); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1671:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1672:2: (iv_ruleGroup= ruleGroup EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1673:2: iv_ruleGroup= ruleGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupRule()); 
            }
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup3967);
            iv_ruleGroup=ruleGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup3977); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1680:1: ruleGroup returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1683:28: ( ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1684:1: ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1684:1: ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1684:2: ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1684:2: ( (lv_modifier_0_0= ruleModifier ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1685:1: (lv_modifier_0_0= ruleModifier )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1685:1: (lv_modifier_0_0= ruleModifier )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1686:3: lv_modifier_0_0= ruleModifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupAccess().getModifierModifierEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleModifier_in_ruleGroup4023);
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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleGroup4035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getGroupKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1706:1: ( (lv_name_2_0= ruleVar ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1707:1: (lv_name_2_0= ruleVar )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1707:1: (lv_name_2_0= ruleVar )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1708:3: lv_name_2_0= ruleVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupAccess().getNameVarParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_in_ruleGroup4056);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleGroup4068); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getEqualsSignKeyword_3());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1728:1: ( (lv_index_4_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1729:1: (lv_index_4_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1729:1: (lv_index_4_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1730:3: lv_index_4_0= RULE_NUMINT
            {
            lv_index_4_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleGroup4085); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleGroup4102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1750:1: ( (lv_elements_6_0= ruleMessageField ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=42 && LA20_0<=44)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1751:1: (lv_elements_6_0= ruleMessageField )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1751:1: (lv_elements_6_0= ruleMessageField )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1752:3: lv_elements_6_0= ruleMessageField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupAccess().getElementsMessageFieldParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMessageField_in_ruleGroup4123);
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
            	    break loop20;
                }
            } while (true);

            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleGroup4136); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1780:1: entryRuleTypeLink returns [EObject current=null] : iv_ruleTypeLink= ruleTypeLink EOF ;
    public final EObject entryRuleTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1781:2: (iv_ruleTypeLink= ruleTypeLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1782:2: iv_ruleTypeLink= ruleTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_entryRuleTypeLink4172);
            iv_ruleTypeLink=ruleTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLink4182); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1789:1: ruleTypeLink returns [EObject current=null] : ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink ) ;
    public final EObject ruleTypeLink() throws RecognitionException {
        EObject current = null;

        EObject this_ScalarTypeLink_0 = null;

        EObject this_ComplexTypeLink_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1792:28: ( ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1793:1: ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1793:1: ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink )
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1793:2: ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1793:2: ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1793:3: ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLinkAccess().getScalarTypeLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleScalarTypeLink_in_ruleTypeLink4235);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1804:5: this_ComplexTypeLink_1= ruleComplexTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLinkAccess().getComplexTypeLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComplexTypeLink_in_ruleTypeLink4263);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1820:1: entryRuleComplexTypeLink returns [EObject current=null] : iv_ruleComplexTypeLink= ruleComplexTypeLink EOF ;
    public final EObject entryRuleComplexTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTypeLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1821:2: (iv_ruleComplexTypeLink= ruleComplexTypeLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1822:2: iv_ruleComplexTypeLink= ruleComplexTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink4298);
            iv_ruleComplexTypeLink=ruleComplexTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLink4308); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1829:1: ruleComplexTypeLink returns [EObject current=null] : ( ( ruleVar_full ) ) ;
    public final EObject ruleComplexTypeLink() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1832:28: ( ( ( ruleVar_full ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1833:1: ( ( ruleVar_full ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1833:1: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1834:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1834:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1835:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComplexTypeLinkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleComplexTypeLink4355);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1856:1: entryRuleScalarTypeLink returns [EObject current=null] : iv_ruleScalarTypeLink= ruleScalarTypeLink EOF ;
    public final EObject entryRuleScalarTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarTypeLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1857:2: (iv_ruleScalarTypeLink= ruleScalarTypeLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1858:2: iv_ruleScalarTypeLink= ruleScalarTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScalarTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink4390);
            iv_ruleScalarTypeLink=ruleScalarTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScalarTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarTypeLink4400); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1865:1: ruleScalarTypeLink returns [EObject current=null] : ( (lv_target_0_0= ruleScalarType ) ) ;
    public final EObject ruleScalarTypeLink() throws RecognitionException {
        EObject current = null;

        Enumerator lv_target_0_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1868:28: ( ( (lv_target_0_0= ruleScalarType ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1869:1: ( (lv_target_0_0= ruleScalarType ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1869:1: ( (lv_target_0_0= ruleScalarType ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1870:1: (lv_target_0_0= ruleScalarType )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1870:1: (lv_target_0_0= ruleScalarType )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1871:3: lv_target_0_0= ruleScalarType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScalarTypeLinkAccess().getTargetScalarTypeEnumRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleScalarType_in_ruleScalarTypeLink4445);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1895:1: entryRuleFieldOptions returns [EObject current=null] : iv_ruleFieldOptions= ruleFieldOptions EOF ;
    public final EObject entryRuleFieldOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOptions = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1896:2: (iv_ruleFieldOptions= ruleFieldOptions EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1897:2: iv_ruleFieldOptions= ruleFieldOptions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldOptionsRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions4480);
            iv_ruleFieldOptions=ruleFieldOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldOptions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOptions4490); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1904:1: ruleFieldOptions returns [EObject current=null] : (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleFieldOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_options_1_0 = null;

        EObject lv_options_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1907:28: ( (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1908:1: (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1908:1: (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1908:3: otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleFieldOptions4527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFieldOptionsAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1912:1: ( (lv_options_1_0= ruleFieldOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1913:1: (lv_options_1_0= ruleFieldOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1913:1: (lv_options_1_0= ruleFieldOption )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1914:3: lv_options_1_0= ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFieldOption_in_ruleFieldOptions4548);
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1930:2: (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1930:4: otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleFieldOptions4561); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFieldOptionsAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1934:1: ( (lv_options_3_0= ruleFieldOption ) )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1935:1: (lv_options_3_0= ruleFieldOption )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1935:1: (lv_options_3_0= ruleFieldOption )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1936:3: lv_options_3_0= ruleFieldOption
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFieldOption_in_ruleFieldOptions4582);
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
            	    break loop22;
                }
            } while (true);

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleFieldOptions4596); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1964:1: entryRuleFieldOption returns [EObject current=null] : iv_ruleFieldOption= ruleFieldOption EOF ;
    public final EObject entryRuleFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1965:2: (iv_ruleFieldOption= ruleFieldOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1966:2: iv_ruleFieldOption= ruleFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_entryRuleFieldOption4632);
            iv_ruleFieldOption=ruleFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOption4642); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1973:1: ruleFieldOption returns [EObject current=null] : ( ( ( 'packed' )=>this_PackedValueFieldOption_0= rulePackedValueFieldOption ) | ( ( 'default' )=>this_DefaultValueFieldOption_1= ruleDefaultValueFieldOption ) | this_NativeFieldOption_2= ruleNativeFieldOption ) ;
    public final EObject ruleFieldOption() throws RecognitionException {
        EObject current = null;

        EObject this_PackedValueFieldOption_0 = null;

        EObject this_DefaultValueFieldOption_1 = null;

        EObject this_NativeFieldOption_2 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1976:28: ( ( ( ( 'packed' )=>this_PackedValueFieldOption_0= rulePackedValueFieldOption ) | ( ( 'default' )=>this_DefaultValueFieldOption_1= ruleDefaultValueFieldOption ) | this_NativeFieldOption_2= ruleNativeFieldOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1977:1: ( ( ( 'packed' )=>this_PackedValueFieldOption_0= rulePackedValueFieldOption ) | ( ( 'default' )=>this_DefaultValueFieldOption_1= ruleDefaultValueFieldOption ) | this_NativeFieldOption_2= ruleNativeFieldOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1977:1: ( ( ( 'packed' )=>this_PackedValueFieldOption_0= rulePackedValueFieldOption ) | ( ( 'default' )=>this_DefaultValueFieldOption_1= ruleDefaultValueFieldOption ) | this_NativeFieldOption_2= ruleNativeFieldOption )
            int alt23=3;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1977:2: ( ( 'packed' )=>this_PackedValueFieldOption_0= rulePackedValueFieldOption )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1977:2: ( ( 'packed' )=>this_PackedValueFieldOption_0= rulePackedValueFieldOption )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1977:3: ( 'packed' )=>this_PackedValueFieldOption_0= rulePackedValueFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldOptionAccess().getPackedValueFieldOptionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePackedValueFieldOption_in_ruleFieldOption4697);
                    this_PackedValueFieldOption_0=rulePackedValueFieldOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PackedValueFieldOption_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1988:6: ( ( 'default' )=>this_DefaultValueFieldOption_1= ruleDefaultValueFieldOption )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1988:6: ( ( 'default' )=>this_DefaultValueFieldOption_1= ruleDefaultValueFieldOption )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1988:7: ( 'default' )=>this_DefaultValueFieldOption_1= ruleDefaultValueFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldOptionAccess().getDefaultValueFieldOptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_ruleFieldOption4733);
                    this_DefaultValueFieldOption_1=ruleDefaultValueFieldOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DefaultValueFieldOption_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2000:5: this_NativeFieldOption_2= ruleNativeFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldOptionAccess().getNativeFieldOptionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNativeFieldOption_in_ruleFieldOption4761);
                    this_NativeFieldOption_2=ruleNativeFieldOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NativeFieldOption_2; 
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


    // $ANTLR start "entryRulePackedValueFieldOption"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2016:1: entryRulePackedValueFieldOption returns [EObject current=null] : iv_rulePackedValueFieldOption= rulePackedValueFieldOption EOF ;
    public final EObject entryRulePackedValueFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackedValueFieldOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2017:2: (iv_rulePackedValueFieldOption= rulePackedValueFieldOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2018:2: iv_rulePackedValueFieldOption= rulePackedValueFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackedValueFieldOptionRule()); 
            }
            pushFollow(FOLLOW_rulePackedValueFieldOption_in_entryRulePackedValueFieldOption4796);
            iv_rulePackedValueFieldOption=rulePackedValueFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackedValueFieldOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackedValueFieldOption4806); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackedValueFieldOption"


    // $ANTLR start "rulePackedValueFieldOption"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2025:1: rulePackedValueFieldOption returns [EObject current=null] : ( ( ( 'packed' )=>otherlv_0= 'packed' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject rulePackedValueFieldOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2028:28: ( ( ( ( 'packed' )=>otherlv_0= 'packed' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2029:1: ( ( ( 'packed' )=>otherlv_0= 'packed' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2029:1: ( ( ( 'packed' )=>otherlv_0= 'packed' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2029:2: ( ( 'packed' )=>otherlv_0= 'packed' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2029:2: ( ( 'packed' )=>otherlv_0= 'packed' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2029:3: ( 'packed' )=>otherlv_0= 'packed'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_rulePackedValueFieldOption4851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackedValueFieldOptionAccess().getPackedKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_rulePackedValueFieldOption4864); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPackedValueFieldOptionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2038:1: ( (lv_value_2_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2039:1: (lv_value_2_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2039:1: (lv_value_2_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2040:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackedValueFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_rulePackedValueFieldOption4885);
            lv_value_2_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackedValueFieldOptionRule());
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
    // $ANTLR end "rulePackedValueFieldOption"


    // $ANTLR start "entryRuleDefaultValueFieldOption"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2064:1: entryRuleDefaultValueFieldOption returns [EObject current=null] : iv_ruleDefaultValueFieldOption= ruleDefaultValueFieldOption EOF ;
    public final EObject entryRuleDefaultValueFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValueFieldOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2065:2: (iv_ruleDefaultValueFieldOption= ruleDefaultValueFieldOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2066:2: iv_ruleDefaultValueFieldOption= ruleDefaultValueFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultValueFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption4921);
            iv_ruleDefaultValueFieldOption=ruleDefaultValueFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultValueFieldOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValueFieldOption4931); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2073:1: ruleDefaultValueFieldOption returns [EObject current=null] : ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleDefaultValueFieldOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2076:28: ( ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2077:1: ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2077:1: ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2077:2: ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2077:2: ( ( 'default' )=>otherlv_0= 'default' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2077:3: ( 'default' )=>otherlv_0= 'default'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleDefaultValueFieldOption4976); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDefaultValueFieldOptionAccess().getDefaultKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDefaultValueFieldOption4989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefaultValueFieldOptionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2086:1: ( (lv_value_2_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2087:1: (lv_value_2_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2087:1: (lv_value_2_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2088:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefaultValueFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleDefaultValueFieldOption5010);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2112:1: entryRuleNativeFieldOption returns [EObject current=null] : iv_ruleNativeFieldOption= ruleNativeFieldOption EOF ;
    public final EObject entryRuleNativeFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeFieldOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2113:2: (iv_ruleNativeFieldOption= ruleNativeFieldOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2114:2: iv_ruleNativeFieldOption= ruleNativeFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNativeFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption5046);
            iv_ruleNativeFieldOption=ruleNativeFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNativeFieldOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeFieldOption5056); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2121:1: ruleNativeFieldOption returns [EObject current=null] : ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleNativeFieldOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_source_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2124:28: ( ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2125:1: ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2125:1: ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2125:2: ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2125:2: ( (lv_source_0_0= ruleOptionSource ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2126:1: (lv_source_0_0= ruleOptionSource )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2126:1: (lv_source_0_0= ruleOptionSource )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2127:3: lv_source_0_0= ruleOptionSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNativeFieldOptionAccess().getSourceOptionSourceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOptionSource_in_ruleNativeFieldOption5102);
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleNativeFieldOption5114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNativeFieldOptionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2147:1: ( (lv_value_2_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2148:1: (lv_value_2_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2148:1: (lv_value_2_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2149:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNativeFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleNativeFieldOption5135);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2173:1: entryRuleOptionSource returns [EObject current=null] : iv_ruleOptionSource= ruleOptionSource EOF ;
    public final EObject entryRuleOptionSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionSource = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2174:2: (iv_ruleOptionSource= ruleOptionSource EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2175:2: iv_ruleOptionSource= ruleOptionSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionSourceRule()); 
            }
            pushFollow(FOLLOW_ruleOptionSource_in_entryRuleOptionSource5171);
            iv_ruleOptionSource=ruleOptionSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionSource5181); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2182:1: ruleOptionSource returns [EObject current=null] : ( ( ruleVar_full ) ) ;
    public final EObject ruleOptionSource() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2185:28: ( ( ( ruleVar_full ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2186:1: ( ( ruleVar_full ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2186:1: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2187:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2187:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2188:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOptionSourceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionSourceAccess().getTargetIndexedElementCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleOptionSource5228);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2209:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2210:2: (iv_ruleEnum= ruleEnum EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2211:2: iv_ruleEnum= ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum5263);
            iv_ruleEnum=ruleEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum5273); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2218:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2221:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2222:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' (otherlv_5= ';' )? )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2222:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' (otherlv_5= ';' )? )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2222:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' (otherlv_5= ';' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleEnum5310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2226:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2227:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2227:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2228:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum5327); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleEnum5344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2248:1: ( (lv_elements_3_0= ruleEnumElement ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||LA24_0==20) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2249:1: (lv_elements_3_0= ruleEnumElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2249:1: (lv_elements_3_0= ruleEnumElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2250:3: lv_elements_3_0= ruleEnumElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumElement_in_ruleEnum5365);
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
            	    break loop24;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleEnum5378); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2270:1: (otherlv_5= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==15) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2270:3: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleEnum5391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEnumAccess().getSemicolonKeyword_5());
                          
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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumElement"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2282:1: entryRuleEnumElement returns [EObject current=null] : iv_ruleEnumElement= ruleEnumElement EOF ;
    public final EObject entryRuleEnumElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2283:2: (iv_ruleEnumElement= ruleEnumElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2284:2: iv_ruleEnumElement= ruleEnumElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumElementRule()); 
            }
            pushFollow(FOLLOW_ruleEnumElement_in_entryRuleEnumElement5429);
            iv_ruleEnumElement=ruleEnumElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumElement5439); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2291:1: ruleEnumElement returns [EObject current=null] : (this_EnumField_0= ruleEnumField | this_CustomOption_1= ruleCustomOption ) ;
    public final EObject ruleEnumElement() throws RecognitionException {
        EObject current = null;

        EObject this_EnumField_0 = null;

        EObject this_CustomOption_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2294:28: ( (this_EnumField_0= ruleEnumField | this_CustomOption_1= ruleCustomOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2295:1: (this_EnumField_0= ruleEnumField | this_CustomOption_1= ruleCustomOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2295:1: (this_EnumField_0= ruleEnumField | this_CustomOption_1= ruleCustomOption )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==20) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2296:5: this_EnumField_0= ruleEnumField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumElementAccess().getEnumFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumField_in_ruleEnumElement5486);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2306:5: this_CustomOption_1= ruleCustomOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumElementAccess().getCustomOptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCustomOption_in_ruleEnumElement5513);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2322:1: entryRuleEnumField returns [EObject current=null] : iv_ruleEnumField= ruleEnumField EOF ;
    public final EObject entryRuleEnumField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumField = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2323:2: (iv_ruleEnumField= ruleEnumField EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2324:2: iv_ruleEnumField= ruleEnumField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumFieldRule()); 
            }
            pushFollow(FOLLOW_ruleEnumField_in_entryRuleEnumField5548);
            iv_ruleEnumField=ruleEnumField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumField5558); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2331:1: ruleEnumField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2334:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2335:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2335:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2335:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2335:2: ( (lv_name_0_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2336:1: (lv_name_0_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2336:1: (lv_name_0_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2337:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumField5600); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleEnumField5617); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumFieldAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2357:1: ( (lv_index_2_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2358:1: (lv_index_2_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2358:1: (lv_index_2_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2359:3: lv_index_2_0= RULE_NUMINT
            {
            lv_index_2_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleEnumField5634); if (state.failed) return current;
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2375:2: (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2375:4: otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleEnumField5652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEnumFieldAccess().getLeftSquareBracketKeyword_3_0());
                          
                    }
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2379:1: ( (lv_options_4_0= ruleFieldOption ) )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2380:1: (lv_options_4_0= ruleFieldOption )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2380:1: (lv_options_4_0= ruleFieldOption )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2381:3: lv_options_4_0= ruleFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldOption_in_ruleEnumField5673);
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

                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2397:2: (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==26) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2397:4: otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) )
                    	    {
                    	    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleEnumField5686); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEnumFieldAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2401:1: ( (lv_options_6_0= ruleFieldOption ) )
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2402:1: (lv_options_6_0= ruleFieldOption )
                    	    {
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2402:1: (lv_options_6_0= ruleFieldOption )
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2403:3: lv_options_6_0= ruleFieldOption
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFieldOption_in_ruleEnumField5707);
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
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleEnumField5721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEnumFieldAccess().getRightSquareBracketKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleEnumField5735); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2435:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2436:2: (iv_ruleService= ruleService EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2437:2: iv_ruleService= ruleService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService5771);
            iv_ruleService=ruleService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleService; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService5781); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2444:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2447:28: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )* otherlv_4= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2448:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )* otherlv_4= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2448:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )* otherlv_4= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2448:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleService5818); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2452:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2453:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2453:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2454:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService5835); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleService5852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2474:1: ( (lv_elements_3_0= ruleServiceElement ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==20||LA29_0==36) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2475:1: (lv_elements_3_0= ruleServiceElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2475:1: (lv_elements_3_0= ruleServiceElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2476:3: lv_elements_3_0= ruleServiceElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceAccess().getElementsServiceElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleServiceElement_in_ruleService5873);
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
            	    break loop29;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleService5886); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4());
                  
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2504:1: entryRuleServiceElement returns [EObject current=null] : iv_ruleServiceElement= ruleServiceElement EOF ;
    public final EObject entryRuleServiceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2505:2: (iv_ruleServiceElement= ruleServiceElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2506:2: iv_ruleServiceElement= ruleServiceElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceElementRule()); 
            }
            pushFollow(FOLLOW_ruleServiceElement_in_entryRuleServiceElement5922);
            iv_ruleServiceElement=ruleServiceElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleServiceElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceElement5932); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2513:1: ruleServiceElement returns [EObject current=null] : ( ( ( 'rpc' )=>this_Rpc_0= ruleRpc ) | this_Option_1= ruleOption ) ;
    public final EObject ruleServiceElement() throws RecognitionException {
        EObject current = null;

        EObject this_Rpc_0 = null;

        EObject this_Option_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2516:28: ( ( ( ( 'rpc' )=>this_Rpc_0= ruleRpc ) | this_Option_1= ruleOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2517:1: ( ( ( 'rpc' )=>this_Rpc_0= ruleRpc ) | this_Option_1= ruleOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2517:1: ( ( ( 'rpc' )=>this_Rpc_0= ruleRpc ) | this_Option_1= ruleOption )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) && (synpred9_InternalProtobuf())) {
                alt30=1;
            }
            else if ( (LA30_0==20) ) {
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2517:2: ( ( 'rpc' )=>this_Rpc_0= ruleRpc )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2517:2: ( ( 'rpc' )=>this_Rpc_0= ruleRpc )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2517:3: ( 'rpc' )=>this_Rpc_0= ruleRpc
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getServiceElementAccess().getRpcParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRpc_in_ruleServiceElement5987);
                    this_Rpc_0=ruleRpc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Rpc_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2529:5: this_Option_1= ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getServiceElementAccess().getOptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOption_in_ruleServiceElement6015);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2545:1: entryRuleRpc returns [EObject current=null] : iv_ruleRpc= ruleRpc EOF ;
    public final EObject entryRuleRpc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRpc = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2546:2: (iv_ruleRpc= ruleRpc EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2547:2: iv_ruleRpc= ruleRpc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRpcRule()); 
            }
            pushFollow(FOLLOW_ruleRpc_in_entryRuleRpc6050);
            iv_ruleRpc=ruleRpc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRpc; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRpc6060); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2554:1: ruleRpc returns [EObject current=null] : ( ( ( 'rpc' )=>otherlv_0= 'rpc' ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? otherlv_12= ';' ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2557:28: ( ( ( ( 'rpc' )=>otherlv_0= 'rpc' ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? otherlv_12= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2558:1: ( ( ( 'rpc' )=>otherlv_0= 'rpc' ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? otherlv_12= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2558:1: ( ( ( 'rpc' )=>otherlv_0= 'rpc' ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? otherlv_12= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2558:2: ( ( 'rpc' )=>otherlv_0= 'rpc' ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? otherlv_12= ';'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2558:2: ( ( 'rpc' )=>otherlv_0= 'rpc' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2558:3: ( 'rpc' )=>otherlv_0= 'rpc'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleRpc6105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRpcAccess().getRpcKeyword_0());
                  
            }

            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2563:2: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2564:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2564:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2565:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRpc6123); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleRpc6140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRpcAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2585:1: ( (lv_argType_3_0= ruleMessageLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2586:1: (lv_argType_3_0= ruleMessageLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2586:1: (lv_argType_3_0= ruleMessageLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2587:3: lv_argType_3_0= ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRpcAccess().getArgTypeMessageLinkParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMessageLink_in_ruleRpc6161);
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

            otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleRpc6173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRpcAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleRpc6185); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRpcAccess().getReturnsKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleRpc6197); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getRpcAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2615:1: ( (lv_returnType_7_0= ruleMessageLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2616:1: (lv_returnType_7_0= ruleMessageLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2616:1: (lv_returnType_7_0= ruleMessageLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2617:3: lv_returnType_7_0= ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRpcAccess().getReturnTypeMessageLinkParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMessageLink_in_ruleRpc6218);
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

            otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleRpc6230); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRpcAccess().getRightParenthesisKeyword_8());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2637:1: (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==22) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2637:3: otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleRpc6243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getRpcAccess().getLeftCurlyBracketKeyword_9_0());
                          
                    }
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2641:1: ( (lv_options_10_0= ruleOption ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==20) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2642:1: (lv_options_10_0= ruleOption )
                    	    {
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2642:1: (lv_options_10_0= ruleOption )
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2643:3: lv_options_10_0= ruleOption
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRpcAccess().getOptionsOptionParserRuleCall_9_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOption_in_ruleRpc6264);
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
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleRpc6277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getRpcAccess().getRightCurlyBracketKeyword_9_2());
                          
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleRpc6291); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2675:1: entryRuleMessageLink returns [EObject current=null] : iv_ruleMessageLink= ruleMessageLink EOF ;
    public final EObject entryRuleMessageLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2676:2: (iv_ruleMessageLink= ruleMessageLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2677:2: iv_ruleMessageLink= ruleMessageLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageLinkRule()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_entryRuleMessageLink6327);
            iv_ruleMessageLink=ruleMessageLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageLink6337); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2684:1: ruleMessageLink returns [EObject current=null] : ( ( ruleVar_full ) ) ;
    public final EObject ruleMessageLink() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2687:28: ( ( ( ruleVar_full ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2688:1: ( ( ruleVar_full ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2688:1: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2689:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2689:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2690:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMessageLinkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageLinkAccess().getTargetMessageCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleMessageLink6384);
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
    // $ANTLR end "ruleMessageLink"


    // $ANTLR start "entryRuleExtend"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2711:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2712:2: (iv_ruleExtend= ruleExtend EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2713:2: iv_ruleExtend= ruleExtend EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendRule()); 
            }
            pushFollow(FOLLOW_ruleExtend_in_entryRuleExtend6419);
            iv_ruleExtend=ruleExtend();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtend; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtend6429); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2720:1: ruleExtend returns [EObject current=null] : ( ( ( 'extend' )=>otherlv_0= 'extend' ) ( ( ruleVar_full ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2723:28: ( ( ( ( 'extend' )=>otherlv_0= 'extend' ) ( ( ruleVar_full ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2724:1: ( ( ( 'extend' )=>otherlv_0= 'extend' ) ( ( ruleVar_full ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2724:1: ( ( ( 'extend' )=>otherlv_0= 'extend' ) ( ( ruleVar_full ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2724:2: ( ( 'extend' )=>otherlv_0= 'extend' ) ( ( ruleVar_full ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2724:2: ( ( 'extend' )=>otherlv_0= 'extend' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2724:3: ( 'extend' )=>otherlv_0= 'extend'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleExtend6474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtendKeyword_0());
                  
            }

            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2729:2: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2730:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2730:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2731:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExtendRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExtendAccess().getTypeMessageCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleExtend6498);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleExtend6510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2748:1: ( (lv_elements_3_0= ruleMessageElement ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=20 && LA33_0<=21)||(LA33_0>=24 && LA33_0<=25)||(LA33_0>=34 && LA33_0<=35)||LA33_0==40||(LA33_0>=42 && LA33_0<=44)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2749:1: (lv_elements_3_0= ruleMessageElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2749:1: (lv_elements_3_0= ruleMessageElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2750:3: lv_elements_3_0= ruleMessageElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExtendAccess().getElementsMessageElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMessageElement_in_ruleExtend6531);
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
            	    break loop33;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleExtend6544); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2778:1: entryRuleVar_full returns [String current=null] : iv_ruleVar_full= ruleVar_full EOF ;
    public final String entryRuleVar_full() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVar_full = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2779:2: (iv_ruleVar_full= ruleVar_full EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2780:2: iv_ruleVar_full= ruleVar_full EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVar_fullRule()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_entryRuleVar_full6581);
            iv_ruleVar_full=ruleVar_full();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar_full.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar_full6592); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2787:1: ruleVar_full returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar ) ;
    public final AntlrDatatypeRuleToken ruleVar_full() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FULL_ID_0 = null;

        AntlrDatatypeRuleToken this_Var_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2790:28: ( (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2791:1: (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2791:1: (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==EOF||LA34_1==RULE_ID||(LA34_1>=13 && LA34_1<=17)||(LA34_1>=19 && LA34_1<=22)||LA34_1==25||(LA34_1>=27 && LA34_1<=29)||(LA34_1>=32 && LA34_1<=36)||(LA34_1>=38 && LA34_1<=40)||(LA34_1>=42 && LA34_1<=60)) ) {
                    alt34=2;
                }
                else if ( (LA34_1==41) ) {
                    alt34=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA34_0==13||(LA34_0>=16 && LA34_0<=17)||(LA34_0>=19 && LA34_0<=21)||LA34_0==25||(LA34_0>=27 && LA34_0<=29)||(LA34_0>=32 && LA34_0<=36)||(LA34_0>=39 && LA34_0<=40)||(LA34_0>=42 && LA34_0<=60)) ) {
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2792:5: this_FULL_ID_0= ruleFULL_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVar_fullAccess().getFULL_IDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFULL_ID_in_ruleVar_full6639);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2804:5: this_Var_1= ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVar_fullAccess().getVarParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVar_in_ruleVar_full6672);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2822:1: entryRuleVar returns [String current=null] : iv_ruleVar= ruleVar EOF ;
    public final String entryRuleVar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVar = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2823:2: (iv_ruleVar= ruleVar EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2824:2: iv_ruleVar= ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar6718);
            iv_ruleVar=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar6729); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2831:1: ruleVar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved ) ;
    public final AntlrDatatypeRuleToken ruleVar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_VarReserved_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2834:28: ( (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2835:1: (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2835:1: (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            else if ( (LA35_0==13||(LA35_0>=16 && LA35_0<=17)||(LA35_0>=19 && LA35_0<=21)||LA35_0==25||(LA35_0>=27 && LA35_0<=29)||(LA35_0>=32 && LA35_0<=36)||(LA35_0>=39 && LA35_0<=40)||(LA35_0>=42 && LA35_0<=60)) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2835:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVar6769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getVarAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2844:5: this_VarReserved_1= ruleVarReserved
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarAccess().getVarReservedParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarReserved_in_ruleVar6802);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2862:1: entryRuleFULL_ID returns [String current=null] : iv_ruleFULL_ID= ruleFULL_ID EOF ;
    public final String entryRuleFULL_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFULL_ID = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2863:2: (iv_ruleFULL_ID= ruleFULL_ID EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2864:2: iv_ruleFULL_ID= ruleFULL_ID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFULL_IDRule()); 
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID6848);
            iv_ruleFULL_ID=ruleFULL_ID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFULL_ID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFULL_ID6859); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2871:1: ruleFULL_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleFULL_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2874:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2875:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2875:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2875:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFULL_ID6899); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2882:1: (kw= '.' this_ID_2= RULE_ID )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==41) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2883:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,41,FOLLOW_41_in_ruleFULL_ID6918); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFULL_IDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFULL_ID6933); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2903:1: entryRuleVarReserved returns [String current=null] : iv_ruleVarReserved= ruleVarReserved EOF ;
    public final String entryRuleVarReserved() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarReserved = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2904:2: (iv_ruleVarReserved= ruleVarReserved EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2905:2: iv_ruleVarReserved= ruleVarReserved EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarReservedRule()); 
            }
            pushFollow(FOLLOW_ruleVarReserved_in_entryRuleVarReserved6981);
            iv_ruleVarReserved=ruleVarReserved();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarReserved.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarReserved6992); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2912:1: ruleVarReserved returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' | kw= 'weak' | kw= 'packed' ) ;
    public final AntlrDatatypeRuleToken ruleVarReserved() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2915:28: ( (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' | kw= 'weak' | kw= 'packed' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2916:1: (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' | kw= 'weak' | kw= 'packed' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2916:1: (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' | kw= 'weak' | kw= 'packed' )
            int alt37=36;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt37=1;
                }
                break;
            case 16:
                {
                alt37=2;
                }
                break;
            case 13:
                {
                alt37=3;
                }
                break;
            case 17:
                {
                alt37=4;
                }
                break;
            case 20:
                {
                alt37=5;
                }
                break;
            case 21:
                {
                alt37=6;
                }
                break;
            case 35:
                {
                alt37=7;
                }
                break;
            case 34:
                {
                alt37=8;
                }
                break;
            case 42:
                {
                alt37=9;
                }
                break;
            case 43:
                {
                alt37=10;
                }
                break;
            case 44:
                {
                alt37=11;
                }
                break;
            case 25:
                {
                alt37=12;
                }
                break;
            case 40:
                {
                alt37=13;
                }
                break;
            case 29:
                {
                alt37=14;
                }
                break;
            case 36:
                {
                alt37=15;
                }
                break;
            case 39:
                {
                alt37=16;
                }
                break;
            case 45:
                {
                alt37=17;
                }
                break;
            case 46:
                {
                alt37=18;
                }
                break;
            case 47:
                {
                alt37=19;
                }
                break;
            case 48:
                {
                alt37=20;
                }
                break;
            case 49:
                {
                alt37=21;
                }
                break;
            case 50:
                {
                alt37=22;
                }
                break;
            case 51:
                {
                alt37=23;
                }
                break;
            case 52:
                {
                alt37=24;
                }
                break;
            case 53:
                {
                alt37=25;
                }
                break;
            case 54:
                {
                alt37=26;
                }
                break;
            case 55:
                {
                alt37=27;
                }
                break;
            case 56:
                {
                alt37=28;
                }
                break;
            case 57:
                {
                alt37=29;
                }
                break;
            case 58:
                {
                alt37=30;
                }
                break;
            case 59:
                {
                alt37=31;
                }
                break;
            case 33:
                {
                alt37=32;
                }
                break;
            case 28:
                {
                alt37=33;
                }
                break;
            case 60:
                {
                alt37=34;
                }
                break;
            case 19:
                {
                alt37=35;
                }
                break;
            case 32:
                {
                alt37=36;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2917:2: kw= 'to'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleVarReserved7030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getToKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2924:2: kw= 'package'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleVarReserved7049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getPackageKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2931:2: kw= 'syntax'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleVarReserved7068); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSyntaxKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2938:2: kw= 'import'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleVarReserved7087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getImportKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2945:2: kw= 'option'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleVarReserved7106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getOptionKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2952:2: kw= 'message'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleVarReserved7125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getMessageKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2959:2: kw= 'service'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleVarReserved7144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getServiceKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2966:2: kw= 'enum'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleVarReserved7163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getEnumKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2973:2: kw= 'required'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleVarReserved7182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getRequiredKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2980:2: kw= 'optional'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleVarReserved7201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getOptionalKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2987:2: kw= 'repeated'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleVarReserved7220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getRepeatedKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2994:2: kw= 'extensions'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleVarReserved7239); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getExtensionsKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3001:2: kw= 'extend'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleVarReserved7258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getExtendKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3008:2: kw= 'group'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleVarReserved7277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getGroupKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3015:2: kw= 'rpc'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleVarReserved7296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getRpcKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3022:2: kw= 'returns'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleVarReserved7315); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getReturnsKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3029:2: kw= 'int32'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleVarReserved7334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getInt32Keyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3036:2: kw= 'int64'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleVarReserved7353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getInt64Keyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3043:2: kw= 'uint32'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleVarReserved7372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getUint32Keyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3050:2: kw= 'uint64'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleVarReserved7391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getUint64Keyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3057:2: kw= 'sint32'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleVarReserved7410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSint32Keyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3064:2: kw= 'sint64'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleVarReserved7429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSint64Keyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3071:2: kw= 'fixed32'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleVarReserved7448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getFixed32Keyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3078:2: kw= 'fixed64'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleVarReserved7467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getFixed64Keyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3085:2: kw= 'sfixed32'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleVarReserved7486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSfixed32Keyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3092:2: kw= 'sfixed64'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleVarReserved7505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSfixed64Keyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3099:2: kw= 'float'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleVarReserved7524); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getFloatKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3106:2: kw= 'double'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleVarReserved7543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getDoubleKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3113:2: kw= 'bool'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleVarReserved7562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getBoolKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3120:2: kw= 'string'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleVarReserved7581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getStringKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3127:2: kw= 'bytes'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleVarReserved7600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getBytesKeyword_30()); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3134:2: kw= 'default'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleVarReserved7619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getDefaultKeyword_31()); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3141:2: kw= 'max'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleVarReserved7638); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getMaxKeyword_32()); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3148:2: kw= 'void'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleVarReserved7657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getVoidKeyword_33()); 
                          
                    }

                    }
                    break;
                case 35 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3155:2: kw= 'weak'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleVarReserved7676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getWeakKeyword_34()); 
                          
                    }

                    }
                    break;
                case 36 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3162:2: kw= 'packed'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleVarReserved7695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getPackedKeyword_35()); 
                          
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3177:1: ruleBOOL returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBOOL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3179:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3180:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3180:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==61) ) {
                alt38=1;
            }
            else if ( (LA38_0==62) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3180:2: (enumLiteral_0= 'true' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3180:2: (enumLiteral_0= 'true' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3180:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_61_in_ruleBOOL7751); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3186:6: (enumLiteral_1= 'false' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3186:6: (enumLiteral_1= 'false' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3186:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_62_in_ruleBOOL7768); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3196:1: ruleModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) ) ;
    public final Enumerator ruleModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3198:28: ( ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3199:1: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3199:1: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt39=1;
                }
                break;
            case 42:
                {
                alt39=2;
                }
                break;
            case 44:
                {
                alt39=3;
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3199:2: (enumLiteral_0= 'optional' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3199:2: (enumLiteral_0= 'optional' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3199:4: enumLiteral_0= 'optional'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleModifier7813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3205:6: (enumLiteral_1= 'required' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3205:6: (enumLiteral_1= 'required' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3205:8: enumLiteral_1= 'required'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_42_in_ruleModifier7830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3211:6: (enumLiteral_2= 'repeated' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3211:6: (enumLiteral_2= 'repeated' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3211:8: enumLiteral_2= 'repeated'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_44_in_ruleModifier7847); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3221:1: ruleScalarType returns [Enumerator current=null] : ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3223:28: ( ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3224:1: ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3224:1: ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) )
            int alt40=15;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt40=1;
                }
                break;
            case 46:
                {
                alt40=2;
                }
                break;
            case 47:
                {
                alt40=3;
                }
                break;
            case 48:
                {
                alt40=4;
                }
                break;
            case 49:
                {
                alt40=5;
                }
                break;
            case 50:
                {
                alt40=6;
                }
                break;
            case 51:
                {
                alt40=7;
                }
                break;
            case 52:
                {
                alt40=8;
                }
                break;
            case 53:
                {
                alt40=9;
                }
                break;
            case 54:
                {
                alt40=10;
                }
                break;
            case 55:
                {
                alt40=11;
                }
                break;
            case 56:
                {
                alt40=12;
                }
                break;
            case 57:
                {
                alt40=13;
                }
                break;
            case 58:
                {
                alt40=14;
                }
                break;
            case 59:
                {
                alt40=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3224:2: (enumLiteral_0= 'int32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3224:2: (enumLiteral_0= 'int32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3224:4: enumLiteral_0= 'int32'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_45_in_ruleScalarType7892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3230:6: (enumLiteral_1= 'int64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3230:6: (enumLiteral_1= 'int64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3230:8: enumLiteral_1= 'int64'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_46_in_ruleScalarType7909); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3236:6: (enumLiteral_2= 'uint32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3236:6: (enumLiteral_2= 'uint32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3236:8: enumLiteral_2= 'uint32'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_47_in_ruleScalarType7926); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3242:6: (enumLiteral_3= 'uint64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3242:6: (enumLiteral_3= 'uint64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3242:8: enumLiteral_3= 'uint64'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_48_in_ruleScalarType7943); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3248:6: (enumLiteral_4= 'sint32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3248:6: (enumLiteral_4= 'sint32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3248:8: enumLiteral_4= 'sint32'
                    {
                    enumLiteral_4=(Token)match(input,49,FOLLOW_49_in_ruleScalarType7960); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3254:6: (enumLiteral_5= 'sint64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3254:6: (enumLiteral_5= 'sint64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3254:8: enumLiteral_5= 'sint64'
                    {
                    enumLiteral_5=(Token)match(input,50,FOLLOW_50_in_ruleScalarType7977); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3260:6: (enumLiteral_6= 'fixed32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3260:6: (enumLiteral_6= 'fixed32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3260:8: enumLiteral_6= 'fixed32'
                    {
                    enumLiteral_6=(Token)match(input,51,FOLLOW_51_in_ruleScalarType7994); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3266:6: (enumLiteral_7= 'fixed64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3266:6: (enumLiteral_7= 'fixed64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3266:8: enumLiteral_7= 'fixed64'
                    {
                    enumLiteral_7=(Token)match(input,52,FOLLOW_52_in_ruleScalarType8011); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3272:6: (enumLiteral_8= 'sfixed32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3272:6: (enumLiteral_8= 'sfixed32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3272:8: enumLiteral_8= 'sfixed32'
                    {
                    enumLiteral_8=(Token)match(input,53,FOLLOW_53_in_ruleScalarType8028); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3278:6: (enumLiteral_9= 'sfixed64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3278:6: (enumLiteral_9= 'sfixed64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3278:8: enumLiteral_9= 'sfixed64'
                    {
                    enumLiteral_9=(Token)match(input,54,FOLLOW_54_in_ruleScalarType8045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3284:6: (enumLiteral_10= 'float' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3284:6: (enumLiteral_10= 'float' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3284:8: enumLiteral_10= 'float'
                    {
                    enumLiteral_10=(Token)match(input,55,FOLLOW_55_in_ruleScalarType8062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3290:6: (enumLiteral_11= 'double' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3290:6: (enumLiteral_11= 'double' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3290:8: enumLiteral_11= 'double'
                    {
                    enumLiteral_11=(Token)match(input,56,FOLLOW_56_in_ruleScalarType8079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3296:6: (enumLiteral_12= 'bool' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3296:6: (enumLiteral_12= 'bool' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3296:8: enumLiteral_12= 'bool'
                    {
                    enumLiteral_12=(Token)match(input,57,FOLLOW_57_in_ruleScalarType8096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3302:6: (enumLiteral_13= 'string' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3302:6: (enumLiteral_13= 'string' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3302:8: enumLiteral_13= 'string'
                    {
                    enumLiteral_13=(Token)match(input,58,FOLLOW_58_in_ruleScalarType8113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3308:6: (enumLiteral_14= 'bytes' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3308:6: (enumLiteral_14= 'bytes' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3308:8: enumLiteral_14= 'bytes'
                    {
                    enumLiteral_14=(Token)match(input,59,FOLLOW_59_in_ruleScalarType8130); if (state.failed) return current;
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
        match(input,40,FOLLOW_40_in_synpred1_InternalProtobuf318); if (state.failed) return ;

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
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1158:7: ( 'extend' )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1158:9: 'extend'
        {
        match(input,40,FOLLOW_40_in_synpred3_InternalProtobuf2885); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalProtobuf

    // $ANTLR start synpred4_InternalProtobuf
    public final void synpred4_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1793:3: ( ruleScalarTypeLink )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1793:5: ruleScalarTypeLink
        {
        pushFollow(FOLLOW_ruleScalarTypeLink_in_synpred4_InternalProtobuf4219);
        ruleScalarTypeLink();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalProtobuf

    // $ANTLR start synpred5_InternalProtobuf
    public final void synpred5_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1977:3: ( 'packed' )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1977:5: 'packed'
        {
        match(input,32,FOLLOW_32_in_synpred5_InternalProtobuf4679); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalProtobuf

    // $ANTLR start synpred6_InternalProtobuf
    public final void synpred6_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1988:7: ( 'default' )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1988:9: 'default'
        {
        match(input,33,FOLLOW_33_in_synpred6_InternalProtobuf4715); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalProtobuf

    // $ANTLR start synpred9_InternalProtobuf
    public final void synpred9_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2517:3: ( 'rpc' )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2517:5: 'rpc'
        {
        match(input,36,FOLLOW_36_in_synpred9_InternalProtobuf5969); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalProtobuf

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
    public final boolean synpred9_InternalProtobuf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalProtobuf_fragment(); // can never throw exception
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
    public final boolean synpred6_InternalProtobuf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalProtobuf_fragment(); // can never throw exception
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
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA6_eotS =
        "\61\uffff";
    static final String DFA6_eofS =
        "\61\uffff";
    static final String DFA6_minS =
        "\1\24\1\5\1\16\44\uffff\1\4\1\uffff\6\17\1\0\1\uffff";
    static final String DFA6_maxS =
        "\1\24\1\74\1\51\44\uffff\1\76\1\uffff\6\17\1\0\1\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\44\1\1\uffff\1\1\7\uffff\1\2";
    static final String DFA6_specialS =
        "\1\uffff\1\2\1\0\54\uffff\1\1\1\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\2\7\uffff\1\5\2\uffff\1\4\1\6\1\uffff\1\45\1\7\1\10\3\uffff\1\16\1\uffff\1\3\1\43\1\20\2\uffff\1\46\1\42\1\12\1\11\1\21\2\uffff\1\22\1\17\1\uffff\1\13\1\14\1\15\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\44",
            "\1\47\32\uffff\1\50",
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
            "",
            "",
            "\1\55\1\56\1\51\1\52\65\uffff\1\53\1\54",
            "",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
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
                        int LA6_2 = input.LA(1);

                         
                        int index6_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_2==14) ) {s = 39;}

                        else if ( (LA6_2==41) && (synpred2_InternalProtobuf())) {s = 40;}

                         
                        input.seek(index6_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_47 = input.LA(1);

                         
                        int index6_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProtobuf()) ) {s = 40;}

                        else if ( (true) ) {s = 48;}

                         
                        input.seek(index6_47);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_1 = input.LA(1);

                         
                        int index6_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_1==RULE_ID) ) {s = 2;}

                        else if ( (LA6_1==27) && (synpred2_InternalProtobuf())) {s = 3;}

                        else if ( (LA6_1==16) && (synpred2_InternalProtobuf())) {s = 4;}

                        else if ( (LA6_1==13) && (synpred2_InternalProtobuf())) {s = 5;}

                        else if ( (LA6_1==17) && (synpred2_InternalProtobuf())) {s = 6;}

                        else if ( (LA6_1==20) && (synpred2_InternalProtobuf())) {s = 7;}

                        else if ( (LA6_1==21) && (synpred2_InternalProtobuf())) {s = 8;}

                        else if ( (LA6_1==35) && (synpred2_InternalProtobuf())) {s = 9;}

                        else if ( (LA6_1==34) && (synpred2_InternalProtobuf())) {s = 10;}

                        else if ( (LA6_1==42) && (synpred2_InternalProtobuf())) {s = 11;}

                        else if ( (LA6_1==43) && (synpred2_InternalProtobuf())) {s = 12;}

                        else if ( (LA6_1==44) && (synpred2_InternalProtobuf())) {s = 13;}

                        else if ( (LA6_1==25) && (synpred2_InternalProtobuf())) {s = 14;}

                        else if ( (LA6_1==40) && (synpred2_InternalProtobuf())) {s = 15;}

                        else if ( (LA6_1==29) && (synpred2_InternalProtobuf())) {s = 16;}

                        else if ( (LA6_1==36) && (synpred2_InternalProtobuf())) {s = 17;}

                        else if ( (LA6_1==39) && (synpred2_InternalProtobuf())) {s = 18;}

                        else if ( (LA6_1==45) && (synpred2_InternalProtobuf())) {s = 19;}

                        else if ( (LA6_1==46) && (synpred2_InternalProtobuf())) {s = 20;}

                        else if ( (LA6_1==47) && (synpred2_InternalProtobuf())) {s = 21;}

                        else if ( (LA6_1==48) && (synpred2_InternalProtobuf())) {s = 22;}

                        else if ( (LA6_1==49) && (synpred2_InternalProtobuf())) {s = 23;}

                        else if ( (LA6_1==50) && (synpred2_InternalProtobuf())) {s = 24;}

                        else if ( (LA6_1==51) && (synpred2_InternalProtobuf())) {s = 25;}

                        else if ( (LA6_1==52) && (synpred2_InternalProtobuf())) {s = 26;}

                        else if ( (LA6_1==53) && (synpred2_InternalProtobuf())) {s = 27;}

                        else if ( (LA6_1==54) && (synpred2_InternalProtobuf())) {s = 28;}

                        else if ( (LA6_1==55) && (synpred2_InternalProtobuf())) {s = 29;}

                        else if ( (LA6_1==56) && (synpred2_InternalProtobuf())) {s = 30;}

                        else if ( (LA6_1==57) && (synpred2_InternalProtobuf())) {s = 31;}

                        else if ( (LA6_1==58) && (synpred2_InternalProtobuf())) {s = 32;}

                        else if ( (LA6_1==59) && (synpred2_InternalProtobuf())) {s = 33;}

                        else if ( (LA6_1==33) && (synpred2_InternalProtobuf())) {s = 34;}

                        else if ( (LA6_1==28) && (synpred2_InternalProtobuf())) {s = 35;}

                        else if ( (LA6_1==60) && (synpred2_InternalProtobuf())) {s = 36;}

                        else if ( (LA6_1==19) && (synpred2_InternalProtobuf())) {s = 37;}

                        else if ( (LA6_1==32) && (synpred2_InternalProtobuf())) {s = 38;}

                         
                        input.seek(index6_1);
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
    static final String DFA15_eotS =
        "\56\uffff";
    static final String DFA15_eofS =
        "\56\uffff";
    static final String DFA15_minS =
        "\1\52\3\5\1\uffff\1\5\45\16\1\6\1\17\1\uffff";
    static final String DFA15_maxS =
        "\1\54\3\74\1\uffff\1\74\45\16\1\6\1\36\1\uffff";
    static final String DFA15_acceptS =
        "\4\uffff\1\1\50\uffff\1\2";
    static final String DFA15_specialS =
        "\56\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\1\1\3",
            "\1\4\7\uffff\1\4\2\uffff\2\4\1\uffff\3\4\3\uffff\1\4\1\uffff\2\4\1\5\2\uffff\5\4\2\uffff\2\4\1\uffff\23\4",
            "\1\4\7\uffff\1\4\2\uffff\2\4\1\uffff\3\4\3\uffff\1\4\1\uffff\2\4\1\5\2\uffff\5\4\2\uffff\2\4\1\uffff\23\4",
            "\1\4\7\uffff\1\4\2\uffff\2\4\1\uffff\3\4\3\uffff\1\4\1\uffff\2\4\1\5\2\uffff\5\4\2\uffff\2\4\1\uffff\23\4",
            "",
            "\1\6\7\uffff\1\11\2\uffff\1\10\1\12\1\uffff\1\51\1\13\1\14\3\uffff\1\22\1\uffff\1\7\1\47\1\24\2\uffff\1\52\1\46\1\16\1\15\1\25\2\uffff\1\26\1\23\1\uffff\1\17\1\20\1\21\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\50",
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
            "\1\4\6\uffff\1\55\7\uffff\1\4",
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
            return "1379:1: (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup )";
        }
    }
    static final String DFA21_eotS =
        "\22\uffff";
    static final String DFA21_eofS =
        "\22\uffff";
    static final String DFA21_minS =
        "\1\5\17\0\2\uffff";
    static final String DFA21_maxS =
        "\1\74\17\0\2\uffff";
    static final String DFA21_acceptS =
        "\20\uffff\1\2\1\1";
    static final String DFA21_specialS =
        "\1\uffff\1\11\1\14\1\3\1\16\1\5\1\10\1\0\1\12\1\2\1\4\1\13\1\6\1\15\1\1\1\7\2\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\20\7\uffff\1\20\2\uffff\2\20\1\uffff\3\20\3\uffff\1\20\1\uffff\3\20\2\uffff\5\20\2\uffff\2\20\1\uffff\3\20\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
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
            return "1793:1: ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_7 = input.LA(1);

                         
                        int index21_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index21_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_14 = input.LA(1);

                         
                        int index21_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index21_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_9 = input.LA(1);

                         
                        int index21_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index21_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_3 = input.LA(1);

                         
                        int index21_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index21_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_10 = input.LA(1);

                         
                        int index21_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index21_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_5 = input.LA(1);

                         
                        int index21_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index21_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_12 = input.LA(1);

                         
                        int index21_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index21_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA21_15 = input.LA(1);

                         
                        int index21_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index21_15);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA21_6 = input.LA(1);

                         
                        int index21_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index21_6);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA21_1 = input.LA(1);

                         
                        int index21_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA21_8 = input.LA(1);

                         
                        int index21_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index21_8);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA21_11 = input.LA(1);

                         
                        int index21_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index21_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA21_2 = input.LA(1);

                         
                        int index21_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index21_2);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA21_13 = input.LA(1);

                         
                        int index21_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index21_13);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA21_4 = input.LA(1);

                         
                        int index21_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index21_4);
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
    static final String DFA23_eotS =
        "\24\uffff";
    static final String DFA23_eofS =
        "\24\uffff";
    static final String DFA23_minS =
        "\1\5\2\16\1\uffff\2\4\14\0\2\uffff";
    static final String DFA23_maxS =
        "\1\74\2\16\1\uffff\2\76\14\0\2\uffff";
    static final String DFA23_acceptS =
        "\3\uffff\1\3\16\uffff\1\1\1\2";
    static final String DFA23_specialS =
        "\6\uffff\1\1\1\13\1\5\1\2\1\11\1\7\1\4\1\0\1\6\1\3\1\12\1\10\2\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\3\7\uffff\1\3\2\uffff\2\3\1\uffff\3\3\3\uffff\1\3\1\uffff\3\3\2\uffff\1\1\1\2\3\3\2\uffff\2\3\1\uffff\23\3",
            "\1\4",
            "\1\5",
            "",
            "\1\12\1\13\1\6\1\7\65\uffff\1\10\1\11",
            "\1\20\1\21\1\14\1\15\65\uffff\1\16\1\17",
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

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1977:1: ( ( ( 'packed' )=>this_PackedValueFieldOption_0= rulePackedValueFieldOption ) | ( ( 'default' )=>this_DefaultValueFieldOption_1= ruleDefaultValueFieldOption ) | this_NativeFieldOption_2= ruleNativeFieldOption )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_13 = input.LA(1);

                         
                        int index23_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_6 = input.LA(1);

                         
                        int index23_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_9 = input.LA(1);

                         
                        int index23_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_15 = input.LA(1);

                         
                        int index23_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_12 = input.LA(1);

                         
                        int index23_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA23_8 = input.LA(1);

                         
                        int index23_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA23_14 = input.LA(1);

                         
                        int index23_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA23_11 = input.LA(1);

                         
                        int index23_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_11);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA23_17 = input.LA(1);

                         
                        int index23_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_17);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA23_10 = input.LA(1);

                         
                        int index23_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA23_16 = input.LA(1);

                         
                        int index23_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_16);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA23_7 = input.LA(1);

                         
                        int index23_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleProto_in_entryRuleProto75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProto85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_ruleProto131 = new BitSet(new long[]{0x00001D0C00330002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProto153 = new BitSet(new long[]{0x00001D0C00330002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleStatement247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleStatement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_ruleStatement301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_ruleStatement336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleStatement364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_ruleStatement391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_entryRuleSyntax426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntax436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSyntax473 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSyntax485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSyntax502 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSyntax519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePackage602 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
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
    public static final BitSet FOLLOW_20_in_ruleNativeOption1224 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleNativeOption1247 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNativeOption1259 = new BitSet(new long[]{0x60000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleNativeOption1280 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNativeOption1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_entryRuleCustomOption1328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomOption1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCustomOption1375 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomOption1392 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCustomOption1409 = new BitSet(new long[]{0x60000000000000F0L});
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
    public static final BitSet FOLLOW_ruleCustomIdLink_in_ruleSimpleValueLink1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomIdLink_in_entryRuleCustomIdLink1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomIdLink1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomIdLink1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_entryRuleStringLink1832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLink1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLink1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLink1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleBooleanLink1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_entryRuleNumberLink2013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLink2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_ruleNumberLink2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_ruleNumberLink2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_entryRuleIntLink2132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLink2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleIntLink2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink2223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLink2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMDOUBLE_in_ruleDoubleLink2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType2314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleComplexType2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_ruleComplexType2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType2433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensibleType2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleExtensibleType2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleExtensibleType2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage2552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMessage2599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage2616 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMessage2633 = new BitSet(new long[]{0x00001D0C03B30000L});
    public static final BitSet FOLLOW_ruleMessageElement_in_ruleMessage2654 = new BitSet(new long[]{0x00001D0C03B30000L});
    public static final BitSet FOLLOW_23_in_ruleMessage2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_entryRuleMessageElement2703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageElement2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleMessageElement2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_ruleMessageElement2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneof_in_ruleMessageElement2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleMessageElement2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleMessageElement2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_ruleMessageElement2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_ruleMessageElement2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_ruleMessageElement2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneof_in_entryRuleOneof2993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneof3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOneof3040 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOneof3057 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOneof3074 = new BitSet(new long[]{0x1FFFFD9F3ABB2020L});
    public static final BitSet FOLLOW_ruleOneofField_in_ruleOneof3095 = new BitSet(new long[]{0x1FFFFD9F3ABB2020L});
    public static final BitSet FOLLOW_23_in_ruleOneof3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneofField_in_entryRuleOneofField3144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneofField3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleOneofField3200 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleVar_in_ruleOneofField3221 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleOneofField3233 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleOneofField3250 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_ruleOneofField3276 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOneofField3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement3325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedElement3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_ruleIndexedElement3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleIndexedElement3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange3444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionRange3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleExtensionRange3491 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleRange_in_ruleExtensionRange3512 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_ruleExtensionRange3525 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleRange_in_ruleExtensionRange3546 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_15_in_ruleExtensionRange3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange3596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleRange3648 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleRange3666 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleRange3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRange3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_entryRuleMessageField3765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageField3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleMessageField3821 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleMessageField3842 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleVar_in_ruleMessageField3863 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMessageField3875 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleMessageField3892 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_ruleMessageField3918 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMessageField3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup3967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleGroup4023 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleGroup4035 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleVar_in_ruleGroup4056 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGroup4068 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleGroup4085 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleGroup4102 = new BitSet(new long[]{0x00001C0400A00000L});
    public static final BitSet FOLLOW_ruleMessageField_in_ruleGroup4123 = new BitSet(new long[]{0x00001C0400A00000L});
    public static final BitSet FOLLOW_23_in_ruleGroup4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_entryRuleTypeLink4172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLink4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_ruleTypeLink4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_ruleTypeLink4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink4298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLink4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleComplexTypeLink4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink4390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarTypeLink4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarType_in_ruleScalarTypeLink4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions4480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOptions4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFieldOptions4527 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleFieldOptions4548 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_26_in_ruleFieldOptions4561 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleFieldOptions4582 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_31_in_ruleFieldOptions4596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_entryRuleFieldOption4632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOption4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackedValueFieldOption_in_ruleFieldOption4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_ruleFieldOption4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_ruleFieldOption4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackedValueFieldOption_in_entryRulePackedValueFieldOption4796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackedValueFieldOption4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePackedValueFieldOption4851 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePackedValueFieldOption4864 = new BitSet(new long[]{0x60000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_rulePackedValueFieldOption4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption4921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValueFieldOption4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDefaultValueFieldOption4976 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDefaultValueFieldOption4989 = new BitSet(new long[]{0x60000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleDefaultValueFieldOption5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption5046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeFieldOption5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_ruleNativeFieldOption5102 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNativeFieldOption5114 = new BitSet(new long[]{0x60000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleNativeFieldOption5135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_entryRuleOptionSource5171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionSource5181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleOptionSource5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum5263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleEnum5310 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum5327 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEnum5344 = new BitSet(new long[]{0x00001D0C00B30020L});
    public static final BitSet FOLLOW_ruleEnumElement_in_ruleEnum5365 = new BitSet(new long[]{0x00001D0C00B30020L});
    public static final BitSet FOLLOW_23_in_ruleEnum5378 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEnum5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_entryRuleEnumElement5429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumElement5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_ruleEnumElement5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_ruleEnumElement5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_entryRuleEnumField5548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumField5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumField5600 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumField5617 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleEnumField5634 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_30_in_ruleEnumField5652 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleEnumField5673 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_26_in_ruleEnumField5686 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleEnumField5707 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_31_in_ruleEnumField5721 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEnumField5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService5771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleService5818 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService5835 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleService5852 = new BitSet(new long[]{0x00001D1C03B30000L});
    public static final BitSet FOLLOW_ruleServiceElement_in_ruleService5873 = new BitSet(new long[]{0x00001D1C03B30000L});
    public static final BitSet FOLLOW_23_in_ruleService5886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceElement_in_entryRuleServiceElement5922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceElement5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_ruleServiceElement5987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_ruleServiceElement6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_entryRuleRpc6050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRpc6060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleRpc6105 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRpc6123 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleRpc6140 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleMessageLink_in_ruleRpc6161 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRpc6173 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleRpc6185 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleRpc6197 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleMessageLink_in_ruleRpc6218 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRpc6230 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_22_in_ruleRpc6243 = new BitSet(new long[]{0x00001D0C03B30000L});
    public static final BitSet FOLLOW_ruleOption_in_ruleRpc6264 = new BitSet(new long[]{0x00001D0C03B30000L});
    public static final BitSet FOLLOW_23_in_ruleRpc6277 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRpc6291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_entryRuleMessageLink6327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageLink6337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleMessageLink6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_entryRuleExtend6419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtend6429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleExtend6474 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleExtend6498 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExtend6510 = new BitSet(new long[]{0x00001D0C03B30000L});
    public static final BitSet FOLLOW_ruleMessageElement_in_ruleExtend6531 = new BitSet(new long[]{0x00001D0C03B30000L});
    public static final BitSet FOLLOW_23_in_ruleExtend6544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_entryRuleVar_full6581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar_full6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_ruleVar_full6639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleVar_full6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar6718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVar6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_ruleVar6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID6848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFULL_ID6859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFULL_ID6899 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleFULL_ID6918 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFULL_ID6933 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_entryRuleVarReserved6981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarReserved6992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleVarReserved7030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleVarReserved7049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleVarReserved7068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVarReserved7087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleVarReserved7106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleVarReserved7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleVarReserved7144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleVarReserved7163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleVarReserved7182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleVarReserved7201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleVarReserved7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleVarReserved7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleVarReserved7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleVarReserved7277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleVarReserved7296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleVarReserved7315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVarReserved7334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVarReserved7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVarReserved7372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleVarReserved7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleVarReserved7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleVarReserved7429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleVarReserved7448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleVarReserved7467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleVarReserved7486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleVarReserved7505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleVarReserved7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleVarReserved7543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleVarReserved7562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleVarReserved7581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleVarReserved7600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleVarReserved7619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleVarReserved7638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleVarReserved7657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleVarReserved7676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleVarReserved7695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBOOL7751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBOOL7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleModifier7813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleModifier7830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleModifier7847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleScalarType7892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleScalarType7909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleScalarType7926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleScalarType7943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleScalarType7960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleScalarType7977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleScalarType7994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleScalarType8011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleScalarType8028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleScalarType8045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleScalarType8062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleScalarType8079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleScalarType8096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleScalarType8113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleScalarType8130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred1_InternalProtobuf318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeOption_in_synpred2_InternalProtobuf1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred3_InternalProtobuf2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_synpred4_InternalProtobuf4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred5_InternalProtobuf4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred6_InternalProtobuf4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred9_InternalProtobuf5969 = new BitSet(new long[]{0x0000000000000002L});

}