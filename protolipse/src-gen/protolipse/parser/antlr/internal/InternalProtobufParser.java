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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:77:1: ruleProto returns [EObject current=null] : ( (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_syntax_2_0= RULE_STRING ) ) otherlv_3= ';' )? ( (lv_imports_4_0= ruleImport ) )* (otherlv_5= 'package' ( (lv_name_6_0= ruleVar_full ) ) otherlv_7= ';' )? ( (lv_statements_8_0= ruleStatement ) )* ) ;
    public final EObject ruleProto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_syntax_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_imports_4_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_statements_8_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:80:28: ( ( (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_syntax_2_0= RULE_STRING ) ) otherlv_3= ';' )? ( (lv_imports_4_0= ruleImport ) )* (otherlv_5= 'package' ( (lv_name_6_0= ruleVar_full ) ) otherlv_7= ';' )? ( (lv_statements_8_0= ruleStatement ) )* ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:81:1: ( (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_syntax_2_0= RULE_STRING ) ) otherlv_3= ';' )? ( (lv_imports_4_0= ruleImport ) )* (otherlv_5= 'package' ( (lv_name_6_0= ruleVar_full ) ) otherlv_7= ';' )? ( (lv_statements_8_0= ruleStatement ) )* )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:81:1: ( (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_syntax_2_0= RULE_STRING ) ) otherlv_3= ';' )? ( (lv_imports_4_0= ruleImport ) )* (otherlv_5= 'package' ( (lv_name_6_0= ruleVar_full ) ) otherlv_7= ';' )? ( (lv_statements_8_0= ruleStatement ) )* )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:81:2: (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_syntax_2_0= RULE_STRING ) ) otherlv_3= ';' )? ( (lv_imports_4_0= ruleImport ) )* (otherlv_5= 'package' ( (lv_name_6_0= ruleVar_full ) ) otherlv_7= ';' )? ( (lv_statements_8_0= ruleStatement ) )*
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:81:2: (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_syntax_2_0= RULE_STRING ) ) otherlv_3= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:81:4: otherlv_0= 'syntax' otherlv_1= '=' ( (lv_syntax_2_0= RULE_STRING ) ) otherlv_3= ';'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleProto123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getProtoAccess().getSyntaxKeyword_0_0());
                          
                    }
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleProto135); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getProtoAccess().getEqualsSignKeyword_0_1());
                          
                    }
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:89:1: ( (lv_syntax_2_0= RULE_STRING ) )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:90:1: (lv_syntax_2_0= RULE_STRING )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:90:1: (lv_syntax_2_0= RULE_STRING )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:91:3: lv_syntax_2_0= RULE_STRING
                    {
                    lv_syntax_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProto152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_syntax_2_0, grammarAccess.getProtoAccess().getSyntaxSTRINGTerminalRuleCall_0_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getProtoRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"syntax",
                              		lv_syntax_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleProto169); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getProtoAccess().getSemicolonKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:111:3: ( (lv_imports_4_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:112:1: (lv_imports_4_0= ruleImport )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:112:1: (lv_imports_4_0= ruleImport )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:113:3: lv_imports_4_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProtoAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleProto192);
            	    lv_imports_4_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProtoRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_4_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:129:3: (otherlv_5= 'package' ( (lv_name_6_0= ruleVar_full ) ) otherlv_7= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:129:5: otherlv_5= 'package' ( (lv_name_6_0= ruleVar_full ) ) otherlv_7= ';'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleProto206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getProtoAccess().getPackageKeyword_2_0());
                          
                    }
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:133:1: ( (lv_name_6_0= ruleVar_full ) )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:134:1: (lv_name_6_0= ruleVar_full )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:134:1: (lv_name_6_0= ruleVar_full )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:135:3: lv_name_6_0= ruleVar_full
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProtoAccess().getNameVar_fullParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVar_full_in_ruleProto227);
                    lv_name_6_0=ruleVar_full();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProtoRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_6_0, 
                              		"Var_full");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleProto239); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getProtoAccess().getSemicolonKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:155:3: ( (lv_statements_8_0= ruleStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=20 && LA4_0<=21)||(LA4_0>=34 && LA4_0<=35)||LA4_0==40||(LA4_0>=42 && LA4_0<=44)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:156:1: (lv_statements_8_0= ruleStatement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:156:1: (lv_statements_8_0= ruleStatement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:157:3: lv_statements_8_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProtoAccess().getStatementsStatementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleProto262);
            	    lv_statements_8_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProtoRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_8_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:181:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:182:2: (iv_ruleStatement= ruleStatement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:183:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement299);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement309); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:190:1: ruleStatement returns [EObject current=null] : (this_ComplexType_0= ruleComplexType | ( ( 'extend' )=>this_Extend_1= ruleExtend ) | this_Service_2= ruleService | this_CustomOption_3= ruleCustomOption ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ComplexType_0 = null;

        EObject this_Extend_1 = null;

        EObject this_Service_2 = null;

        EObject this_CustomOption_3 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:193:28: ( (this_ComplexType_0= ruleComplexType | ( ( 'extend' )=>this_Extend_1= ruleExtend ) | this_Service_2= ruleService | this_CustomOption_3= ruleCustomOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:194:1: (this_ComplexType_0= ruleComplexType | ( ( 'extend' )=>this_Extend_1= ruleExtend ) | this_Service_2= ruleService | this_CustomOption_3= ruleCustomOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:194:1: (this_ComplexType_0= ruleComplexType | ( ( 'extend' )=>this_Extend_1= ruleExtend ) | this_Service_2= ruleService | this_CustomOption_3= ruleCustomOption )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21||LA5_0==34||(LA5_0>=42 && LA5_0<=44)) ) {
                alt5=1;
            }
            else if ( (LA5_0==40) && (synpred1_InternalProtobuf())) {
                alt5=2;
            }
            else if ( (LA5_0==35) ) {
                alt5=3;
            }
            else if ( (LA5_0==20) ) {
                alt5=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:195:5: this_ComplexType_0= ruleComplexType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getComplexTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComplexType_in_ruleStatement356);
                    this_ComplexType_0=ruleComplexType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ComplexType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:204:6: ( ( 'extend' )=>this_Extend_1= ruleExtend )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:204:6: ( ( 'extend' )=>this_Extend_1= ruleExtend )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:204:7: ( 'extend' )=>this_Extend_1= ruleExtend
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExtendParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtend_in_ruleStatement391);
                    this_Extend_1=ruleExtend();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Extend_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:216:5: this_Service_2= ruleService
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getServiceParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleService_in_ruleStatement419);
                    this_Service_2=ruleService();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Service_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:226:5: this_CustomOption_3= ruleCustomOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getCustomOptionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCustomOption_in_ruleStatement446);
                    this_CustomOption_3=ruleCustomOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CustomOption_3; 
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


    // $ANTLR start "entryRuleImport"
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:242:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:243:2: (iv_ruleImport= ruleImport EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:244:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport481);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport491); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:251:1: ruleImport returns [EObject current=null] : (this_PublicImport_0= rulePublicImport | this_WeakImport_1= ruleWeakImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_PublicImport_0 = null;

        EObject this_WeakImport_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:254:28: ( (this_PublicImport_0= rulePublicImport | this_WeakImport_1= ruleWeakImport ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:255:1: (this_PublicImport_0= rulePublicImport | this_WeakImport_1= ruleWeakImport )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:255:1: (this_PublicImport_0= rulePublicImport | this_WeakImport_1= ruleWeakImport )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==18) ) {
                    alt6=1;
                }
                else if ( (LA6_1==RULE_STRING||LA6_1==19) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:256:5: this_PublicImport_0= rulePublicImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImportAccess().getPublicImportParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePublicImport_in_ruleImport538);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:266:5: this_WeakImport_1= ruleWeakImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImportAccess().getWeakImportParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWeakImport_in_ruleImport565);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:282:1: entryRulePublicImport returns [EObject current=null] : iv_rulePublicImport= rulePublicImport EOF ;
    public final EObject entryRulePublicImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublicImport = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:283:2: (iv_rulePublicImport= rulePublicImport EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:284:2: iv_rulePublicImport= rulePublicImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPublicImportRule()); 
            }
            pushFollow(FOLLOW_rulePublicImport_in_entryRulePublicImport600);
            iv_rulePublicImport=rulePublicImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePublicImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePublicImport610); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:291:1: rulePublicImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= 'public' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject rulePublicImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:294:28: ( (otherlv_0= 'import' otherlv_1= 'public' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:295:1: (otherlv_0= 'import' otherlv_1= 'public' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:295:1: (otherlv_0= 'import' otherlv_1= 'public' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:295:3: otherlv_0= 'import' otherlv_1= 'public' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulePublicImport647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPublicImportAccess().getImportKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePublicImport659); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPublicImportAccess().getPublicKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:303:1: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:304:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:304:1: (lv_importURI_2_0= RULE_STRING )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:305:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePublicImport676); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePublicImport693); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:333:1: entryRuleWeakImport returns [EObject current=null] : iv_ruleWeakImport= ruleWeakImport EOF ;
    public final EObject entryRuleWeakImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeakImport = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:334:2: (iv_ruleWeakImport= ruleWeakImport EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:335:2: iv_ruleWeakImport= ruleWeakImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWeakImportRule()); 
            }
            pushFollow(FOLLOW_ruleWeakImport_in_entryRuleWeakImport729);
            iv_ruleWeakImport=ruleWeakImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWeakImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeakImport739); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:342:1: ruleWeakImport returns [EObject current=null] : (otherlv_0= 'import' (otherlv_1= 'weak' )? ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleWeakImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:345:28: ( (otherlv_0= 'import' (otherlv_1= 'weak' )? ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:346:1: (otherlv_0= 'import' (otherlv_1= 'weak' )? ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:346:1: (otherlv_0= 'import' (otherlv_1= 'weak' )? ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:346:3: otherlv_0= 'import' (otherlv_1= 'weak' )? ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleWeakImport776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWeakImportAccess().getImportKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:350:1: (otherlv_1= 'weak' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:350:3: otherlv_1= 'weak'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleWeakImport789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getWeakImportAccess().getWeakKeyword_1());
                          
                    }

                    }
                    break;

            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:354:3: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:355:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:355:1: (lv_importURI_2_0= RULE_STRING )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:356:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWeakImport808); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleWeakImport825); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:384:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:385:2: (iv_ruleOption= ruleOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:386:2: iv_ruleOption= ruleOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionRule()); 
            }
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption861);
            iv_ruleOption=ruleOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption871); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:393:1: ruleOption returns [EObject current=null] : ( ( ( ruleNativeOption )=>this_NativeOption_0= ruleNativeOption ) | this_CustomOption_1= ruleCustomOption ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_NativeOption_0 = null;

        EObject this_CustomOption_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:396:28: ( ( ( ( ruleNativeOption )=>this_NativeOption_0= ruleNativeOption ) | this_CustomOption_1= ruleCustomOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:397:1: ( ( ( ruleNativeOption )=>this_NativeOption_0= ruleNativeOption ) | this_CustomOption_1= ruleCustomOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:397:1: ( ( ( ruleNativeOption )=>this_NativeOption_0= ruleNativeOption ) | this_CustomOption_1= ruleCustomOption )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:397:2: ( ( ruleNativeOption )=>this_NativeOption_0= ruleNativeOption )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:397:2: ( ( ruleNativeOption )=>this_NativeOption_0= ruleNativeOption )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:397:3: ( ruleNativeOption )=>this_NativeOption_0= ruleNativeOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOptionAccess().getNativeOptionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNativeOption_in_ruleOption924);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:408:5: this_CustomOption_1= ruleCustomOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOptionAccess().getCustomOptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCustomOption_in_ruleOption952);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:424:1: entryRuleNativeOption returns [EObject current=null] : iv_ruleNativeOption= ruleNativeOption EOF ;
    public final EObject entryRuleNativeOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:425:2: (iv_ruleNativeOption= ruleNativeOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:426:2: iv_ruleNativeOption= ruleNativeOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNativeOptionRule()); 
            }
            pushFollow(FOLLOW_ruleNativeOption_in_entryRuleNativeOption987);
            iv_ruleNativeOption=ruleNativeOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNativeOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeOption997); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:433:1: ruleNativeOption returns [EObject current=null] : (otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' ) ;
    public final EObject ruleNativeOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:436:28: ( (otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:437:1: (otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:437:1: (otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:437:3: otherlv_0= 'option' ( ( ruleVar_full ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleNativeOption1034); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNativeOptionAccess().getOptionKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:441:1: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:442:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:442:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:443:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNativeOptionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNativeOptionAccess().getSourceMessageFieldCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleNativeOption1057);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleNativeOption1069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNativeOptionAccess().getEqualsSignKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:460:1: ( (lv_value_3_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:461:1: (lv_value_3_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:461:1: (lv_value_3_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:462:3: lv_value_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNativeOptionAccess().getValueValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleNativeOption1090);
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleNativeOption1102); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:490:1: entryRuleCustomOption returns [EObject current=null] : iv_ruleCustomOption= ruleCustomOption EOF ;
    public final EObject entryRuleCustomOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:491:2: (iv_ruleCustomOption= ruleCustomOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:492:2: iv_ruleCustomOption= ruleCustomOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCustomOptionRule()); 
            }
            pushFollow(FOLLOW_ruleCustomOption_in_entryRuleCustomOption1138);
            iv_ruleCustomOption=ruleCustomOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCustomOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomOption1148); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:499:1: ruleCustomOption returns [EObject current=null] : (otherlv_0= 'option' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' ) ;
    public final EObject ruleCustomOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_source_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:502:28: ( (otherlv_0= 'option' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:503:1: (otherlv_0= 'option' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:503:1: (otherlv_0= 'option' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:503:3: otherlv_0= 'option' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleCustomOption1185); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCustomOptionAccess().getOptionKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:507:1: ( (lv_source_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:508:1: (lv_source_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:508:1: (lv_source_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:509:3: lv_source_1_0= RULE_ID
            {
            lv_source_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomOption1202); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleCustomOption1219); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCustomOptionAccess().getEqualsSignKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:529:1: ( (lv_value_3_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:530:1: (lv_value_3_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:530:1: (lv_value_3_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:531:3: lv_value_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCustomOptionAccess().getValueValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleCustomOption1240);
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleCustomOption1252); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:559:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:560:2: (iv_ruleValue= ruleValue EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:561:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1288);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1298); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:568:1: ruleValue returns [EObject current=null] : this_SimpleValueLink_0= ruleSimpleValueLink ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValueLink_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:571:28: (this_SimpleValueLink_0= ruleSimpleValueLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:573:5: this_SimpleValueLink_0= ruleSimpleValueLink
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValueAccess().getSimpleValueLinkParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleSimpleValueLink_in_ruleValue1344);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:589:1: entryRuleSimpleValueLink returns [EObject current=null] : iv_ruleSimpleValueLink= ruleSimpleValueLink EOF ;
    public final EObject entryRuleSimpleValueLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValueLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:590:2: (iv_ruleSimpleValueLink= ruleSimpleValueLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:591:2: iv_ruleSimpleValueLink= ruleSimpleValueLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleValueLinkRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleValueLink_in_entryRuleSimpleValueLink1378);
            iv_ruleSimpleValueLink=ruleSimpleValueLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleValueLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleValueLink1388); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:598:1: ruleSimpleValueLink returns [EObject current=null] : (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_CustomIdLink_3= ruleCustomIdLink ) ;
    public final EObject ruleSimpleValueLink() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLink_0 = null;

        EObject this_BooleanLink_1 = null;

        EObject this_StringLink_2 = null;

        EObject this_CustomIdLink_3 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:601:28: ( (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_CustomIdLink_3= ruleCustomIdLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:602:1: (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_CustomIdLink_3= ruleCustomIdLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:602:1: (this_NumberLink_0= ruleNumberLink | this_BooleanLink_1= ruleBooleanLink | this_StringLink_2= ruleStringLink | this_CustomIdLink_3= ruleCustomIdLink )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_NUMINT:
            case RULE_NUMDOUBLE:
                {
                alt9=1;
                }
                break;
            case 61:
            case 62:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
                {
                alt9=3;
                }
                break;
            case RULE_ID:
                {
                alt9=4;
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:603:5: this_NumberLink_0= ruleNumberLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleValueLinkAccess().getNumberLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLink_in_ruleSimpleValueLink1435);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:613:5: this_BooleanLink_1= ruleBooleanLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleValueLinkAccess().getBooleanLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLink_in_ruleSimpleValueLink1462);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:623:5: this_StringLink_2= ruleStringLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleValueLinkAccess().getStringLinkParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLink_in_ruleSimpleValueLink1489);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:633:5: this_CustomIdLink_3= ruleCustomIdLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleValueLinkAccess().getCustomIdLinkParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCustomIdLink_in_ruleSimpleValueLink1516);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:649:1: entryRuleCustomIdLink returns [EObject current=null] : iv_ruleCustomIdLink= ruleCustomIdLink EOF ;
    public final EObject entryRuleCustomIdLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomIdLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:650:2: (iv_ruleCustomIdLink= ruleCustomIdLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:651:2: iv_ruleCustomIdLink= ruleCustomIdLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCustomIdLinkRule()); 
            }
            pushFollow(FOLLOW_ruleCustomIdLink_in_entryRuleCustomIdLink1551);
            iv_ruleCustomIdLink=ruleCustomIdLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCustomIdLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomIdLink1561); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:658:1: ruleCustomIdLink returns [EObject current=null] : ( (lv_target_0_0= RULE_ID ) ) ;
    public final EObject ruleCustomIdLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:661:28: ( ( (lv_target_0_0= RULE_ID ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:662:1: ( (lv_target_0_0= RULE_ID ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:662:1: ( (lv_target_0_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:663:1: (lv_target_0_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:663:1: (lv_target_0_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:664:3: lv_target_0_0= RULE_ID
            {
            lv_target_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomIdLink1602); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:688:1: entryRuleStringLink returns [EObject current=null] : iv_ruleStringLink= ruleStringLink EOF ;
    public final EObject entryRuleStringLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:689:2: (iv_ruleStringLink= ruleStringLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:690:2: iv_ruleStringLink= ruleStringLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLinkRule()); 
            }
            pushFollow(FOLLOW_ruleStringLink_in_entryRuleStringLink1642);
            iv_ruleStringLink=ruleStringLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLink1652); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:697:1: ruleStringLink returns [EObject current=null] : ( (lv_target_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:700:28: ( ( (lv_target_0_0= RULE_STRING ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:701:1: ( (lv_target_0_0= RULE_STRING ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:701:1: ( (lv_target_0_0= RULE_STRING ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:702:1: (lv_target_0_0= RULE_STRING )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:702:1: (lv_target_0_0= RULE_STRING )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:703:3: lv_target_0_0= RULE_STRING
            {
            lv_target_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLink1693); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:727:1: entryRuleBooleanLink returns [EObject current=null] : iv_ruleBooleanLink= ruleBooleanLink EOF ;
    public final EObject entryRuleBooleanLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:728:2: (iv_ruleBooleanLink= ruleBooleanLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:729:2: iv_ruleBooleanLink= ruleBooleanLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLinkRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink1733);
            iv_ruleBooleanLink=ruleBooleanLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLink1743); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:736:1: ruleBooleanLink returns [EObject current=null] : ( (lv_target_0_0= ruleBOOL ) ) ;
    public final EObject ruleBooleanLink() throws RecognitionException {
        EObject current = null;

        Enumerator lv_target_0_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:739:28: ( ( (lv_target_0_0= ruleBOOL ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:740:1: ( (lv_target_0_0= ruleBOOL ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:740:1: ( (lv_target_0_0= ruleBOOL ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:741:1: (lv_target_0_0= ruleBOOL )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:741:1: (lv_target_0_0= ruleBOOL )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:742:3: lv_target_0_0= ruleBOOL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBooleanLinkAccess().getTargetBOOLEnumRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBOOL_in_ruleBooleanLink1788);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:766:1: entryRuleNumberLink returns [EObject current=null] : iv_ruleNumberLink= ruleNumberLink EOF ;
    public final EObject entryRuleNumberLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:767:2: (iv_ruleNumberLink= ruleNumberLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:768:2: iv_ruleNumberLink= ruleNumberLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLinkRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLink_in_entryRuleNumberLink1823);
            iv_ruleNumberLink=ruleNumberLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLink1833); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:775:1: ruleNumberLink returns [EObject current=null] : (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink ) ;
    public final EObject ruleNumberLink() throws RecognitionException {
        EObject current = null;

        EObject this_IntLink_0 = null;

        EObject this_DoubleLink_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:778:28: ( (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:779:1: (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:779:1: (this_IntLink_0= ruleIntLink | this_DoubleLink_1= ruleDoubleLink )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_NUMINT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_NUMDOUBLE) ) {
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:780:5: this_IntLink_0= ruleIntLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberLinkAccess().getIntLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLink_in_ruleNumberLink1880);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:790:5: this_DoubleLink_1= ruleDoubleLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberLinkAccess().getDoubleLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoubleLink_in_ruleNumberLink1907);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:806:1: entryRuleIntLink returns [EObject current=null] : iv_ruleIntLink= ruleIntLink EOF ;
    public final EObject entryRuleIntLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:807:2: (iv_ruleIntLink= ruleIntLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:808:2: iv_ruleIntLink= ruleIntLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLinkRule()); 
            }
            pushFollow(FOLLOW_ruleIntLink_in_entryRuleIntLink1942);
            iv_ruleIntLink=ruleIntLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLink1952); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:815:1: ruleIntLink returns [EObject current=null] : ( (lv_target_0_0= RULE_NUMINT ) ) ;
    public final EObject ruleIntLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:818:28: ( ( (lv_target_0_0= RULE_NUMINT ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:819:1: ( (lv_target_0_0= RULE_NUMINT ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:819:1: ( (lv_target_0_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:820:1: (lv_target_0_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:820:1: (lv_target_0_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:821:3: lv_target_0_0= RULE_NUMINT
            {
            lv_target_0_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleIntLink1993); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:845:1: entryRuleDoubleLink returns [EObject current=null] : iv_ruleDoubleLink= ruleDoubleLink EOF ;
    public final EObject entryRuleDoubleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:846:2: (iv_ruleDoubleLink= ruleDoubleLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:847:2: iv_ruleDoubleLink= ruleDoubleLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleLinkRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink2033);
            iv_ruleDoubleLink=ruleDoubleLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoubleLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLink2043); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:854:1: ruleDoubleLink returns [EObject current=null] : ( (lv_target_0_0= RULE_NUMDOUBLE ) ) ;
    public final EObject ruleDoubleLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:857:28: ( ( (lv_target_0_0= RULE_NUMDOUBLE ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:858:1: ( (lv_target_0_0= RULE_NUMDOUBLE ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:858:1: ( (lv_target_0_0= RULE_NUMDOUBLE ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:859:1: (lv_target_0_0= RULE_NUMDOUBLE )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:859:1: (lv_target_0_0= RULE_NUMDOUBLE )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:860:3: lv_target_0_0= RULE_NUMDOUBLE
            {
            lv_target_0_0=(Token)match(input,RULE_NUMDOUBLE,FOLLOW_RULE_NUMDOUBLE_in_ruleDoubleLink2084); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:884:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:885:2: (iv_ruleComplexType= ruleComplexType EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:886:2: iv_ruleComplexType= ruleComplexType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexTypeRule()); 
            }
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType2124);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType2134); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:893:1: ruleComplexType returns [EObject current=null] : (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        EObject this_Enum_0 = null;

        EObject this_ExtensibleType_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:896:28: ( (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:897:1: (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:897:1: (this_Enum_0= ruleEnum | this_ExtensibleType_1= ruleExtensibleType )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            else if ( (LA11_0==21||(LA11_0>=42 && LA11_0<=44)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:898:5: this_Enum_0= ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexTypeAccess().getEnumParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnum_in_ruleComplexType2181);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:908:5: this_ExtensibleType_1= ruleExtensibleType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexTypeAccess().getExtensibleTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtensibleType_in_ruleComplexType2208);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:924:1: entryRuleExtensibleType returns [EObject current=null] : iv_ruleExtensibleType= ruleExtensibleType EOF ;
    public final EObject entryRuleExtensibleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensibleType = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:925:2: (iv_ruleExtensibleType= ruleExtensibleType EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:926:2: iv_ruleExtensibleType= ruleExtensibleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtensibleTypeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType2243);
            iv_ruleExtensibleType=ruleExtensibleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtensibleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensibleType2253); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:933:1: ruleExtensibleType returns [EObject current=null] : (this_Message_0= ruleMessage | this_Group_1= ruleGroup ) ;
    public final EObject ruleExtensibleType() throws RecognitionException {
        EObject current = null;

        EObject this_Message_0 = null;

        EObject this_Group_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:936:28: ( (this_Message_0= ruleMessage | this_Group_1= ruleGroup ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:937:1: (this_Message_0= ruleMessage | this_Group_1= ruleGroup )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:937:1: (this_Message_0= ruleMessage | this_Group_1= ruleGroup )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=42 && LA12_0<=44)) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:938:5: this_Message_0= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensibleTypeAccess().getMessageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleExtensibleType2300);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:948:5: this_Group_1= ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensibleTypeAccess().getGroupParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroup_in_ruleExtensibleType2327);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:964:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:965:2: (iv_ruleMessage= ruleMessage EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:966:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage2362);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage2372); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:973:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:976:28: ( (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:977:1: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:977:1: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:977:3: otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleMessage2409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:981:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:982:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:982:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:983:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage2426); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleMessage2443); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1003:1: ( (lv_elements_3_0= ruleMessageElement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=20 && LA13_0<=21)||(LA13_0>=24 && LA13_0<=25)||(LA13_0>=34 && LA13_0<=35)||LA13_0==40||(LA13_0>=42 && LA13_0<=44)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1004:1: (lv_elements_3_0= ruleMessageElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1004:1: (lv_elements_3_0= ruleMessageElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1005:3: lv_elements_3_0= ruleMessageElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMessageAccess().getElementsMessageElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMessageElement_in_ruleMessage2464);
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
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleMessage2477); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1033:1: entryRuleMessageElement returns [EObject current=null] : iv_ruleMessageElement= ruleMessageElement EOF ;
    public final EObject entryRuleMessageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1034:2: (iv_ruleMessageElement= ruleMessageElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1035:2: iv_ruleMessageElement= ruleMessageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageElementRule()); 
            }
            pushFollow(FOLLOW_ruleMessageElement_in_entryRuleMessageElement2513);
            iv_ruleMessageElement=ruleMessageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageElement2523); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1042:1: ruleMessageElement returns [EObject current=null] : (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Oneof_2= ruleOneof | this_Enum_3= ruleEnum | this_Service_4= ruleService | ( ( 'extend' )=>this_Extend_5= ruleExtend ) | this_ExtensionRange_6= ruleExtensionRange | this_Option_7= ruleOption ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1045:28: ( (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Oneof_2= ruleOneof | this_Enum_3= ruleEnum | this_Service_4= ruleService | ( ( 'extend' )=>this_Extend_5= ruleExtend ) | this_ExtensionRange_6= ruleExtensionRange | this_Option_7= ruleOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1046:1: (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Oneof_2= ruleOneof | this_Enum_3= ruleEnum | this_Service_4= ruleService | ( ( 'extend' )=>this_Extend_5= ruleExtend ) | this_ExtensionRange_6= ruleExtensionRange | this_Option_7= ruleOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1046:1: (this_Message_0= ruleMessage | this_IndexedElement_1= ruleIndexedElement | this_Oneof_2= ruleOneof | this_Enum_3= ruleEnum | this_Service_4= ruleService | ( ( 'extend' )=>this_Extend_5= ruleExtend ) | this_ExtensionRange_6= ruleExtensionRange | this_Option_7= ruleOption )
            int alt14=8;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=42 && LA14_0<=44)) ) {
                alt14=2;
            }
            else if ( (LA14_0==24) ) {
                alt14=3;
            }
            else if ( (LA14_0==34) ) {
                alt14=4;
            }
            else if ( (LA14_0==35) ) {
                alt14=5;
            }
            else if ( (LA14_0==40) && (synpred3_InternalProtobuf())) {
                alt14=6;
            }
            else if ( (LA14_0==25) ) {
                alt14=7;
            }
            else if ( (LA14_0==20) ) {
                alt14=8;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1047:5: this_Message_0= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getMessageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleMessageElement2570);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1057:5: this_IndexedElement_1= ruleIndexedElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getIndexedElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIndexedElement_in_ruleMessageElement2597);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1067:5: this_Oneof_2= ruleOneof
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getOneofParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOneof_in_ruleMessageElement2624);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1077:5: this_Enum_3= ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getEnumParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnum_in_ruleMessageElement2651);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1087:5: this_Service_4= ruleService
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getServiceParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleService_in_ruleMessageElement2678);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1096:6: ( ( 'extend' )=>this_Extend_5= ruleExtend )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1096:6: ( ( 'extend' )=>this_Extend_5= ruleExtend )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1096:7: ( 'extend' )=>this_Extend_5= ruleExtend
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getExtendParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtend_in_ruleMessageElement2713);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1108:5: this_ExtensionRange_6= ruleExtensionRange
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getExtensionRangeParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtensionRange_in_ruleMessageElement2741);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1118:5: this_Option_7= ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageElementAccess().getOptionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOption_in_ruleMessageElement2768);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1134:1: entryRuleOneof returns [EObject current=null] : iv_ruleOneof= ruleOneof EOF ;
    public final EObject entryRuleOneof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneof = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1135:2: (iv_ruleOneof= ruleOneof EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1136:2: iv_ruleOneof= ruleOneof EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOneofRule()); 
            }
            pushFollow(FOLLOW_ruleOneof_in_entryRuleOneof2803);
            iv_ruleOneof=ruleOneof();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOneof; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneof2813); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1143:1: ruleOneof returns [EObject current=null] : (otherlv_0= 'oneof' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleOneofField ) )* otherlv_4= '}' ) ;
    public final EObject ruleOneof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1146:28: ( (otherlv_0= 'oneof' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleOneofField ) )* otherlv_4= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1147:1: (otherlv_0= 'oneof' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleOneofField ) )* otherlv_4= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1147:1: (otherlv_0= 'oneof' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleOneofField ) )* otherlv_4= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1147:3: otherlv_0= 'oneof' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleOneofField ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleOneof2850); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOneofAccess().getOneofKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1151:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1152:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1152:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1153:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOneof2867); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleOneof2884); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOneofAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1173:1: ( (lv_fields_3_0= ruleOneofField ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==13||(LA15_0>=16 && LA15_0<=17)||(LA15_0>=19 && LA15_0<=21)||LA15_0==25||(LA15_0>=27 && LA15_0<=29)||(LA15_0>=32 && LA15_0<=36)||(LA15_0>=39 && LA15_0<=40)||(LA15_0>=42 && LA15_0<=60)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1174:1: (lv_fields_3_0= ruleOneofField )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1174:1: (lv_fields_3_0= ruleOneofField )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1175:3: lv_fields_3_0= ruleOneofField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOneofAccess().getFieldsOneofFieldParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOneofField_in_ruleOneof2905);
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
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleOneof2918); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1203:1: entryRuleOneofField returns [EObject current=null] : iv_ruleOneofField= ruleOneofField EOF ;
    public final EObject entryRuleOneofField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneofField = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1204:2: (iv_ruleOneofField= ruleOneofField EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1205:2: iv_ruleOneofField= ruleOneofField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOneofFieldRule()); 
            }
            pushFollow(FOLLOW_ruleOneofField_in_entryRuleOneofField2954);
            iv_ruleOneofField=ruleOneofField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOneofField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneofField2964); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1212:1: ruleOneofField returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_index_3_0= RULE_NUMINT ) ) ( (lv_options_4_0= ruleFieldOptions ) )? otherlv_5= ';' ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1215:28: ( ( ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_index_3_0= RULE_NUMINT ) ) ( (lv_options_4_0= ruleFieldOptions ) )? otherlv_5= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1216:1: ( ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_index_3_0= RULE_NUMINT ) ) ( (lv_options_4_0= ruleFieldOptions ) )? otherlv_5= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1216:1: ( ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_index_3_0= RULE_NUMINT ) ) ( (lv_options_4_0= ruleFieldOptions ) )? otherlv_5= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1216:2: ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_index_3_0= RULE_NUMINT ) ) ( (lv_options_4_0= ruleFieldOptions ) )? otherlv_5= ';'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1216:2: ( (lv_type_0_0= ruleTypeLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1217:1: (lv_type_0_0= ruleTypeLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1217:1: (lv_type_0_0= ruleTypeLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1218:3: lv_type_0_0= ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOneofFieldAccess().getTypeTypeLinkParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeLink_in_ruleOneofField3010);
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1234:2: ( (lv_name_1_0= ruleVar ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1235:1: (lv_name_1_0= ruleVar )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1235:1: (lv_name_1_0= ruleVar )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1236:3: lv_name_1_0= ruleVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOneofFieldAccess().getNameVarParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_in_ruleOneofField3031);
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleOneofField3043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOneofFieldAccess().getEqualsSignKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1256:1: ( (lv_index_3_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1257:1: (lv_index_3_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1257:1: (lv_index_3_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1258:3: lv_index_3_0= RULE_NUMINT
            {
            lv_index_3_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleOneofField3060); if (state.failed) return current;
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1274:2: ( (lv_options_4_0= ruleFieldOptions ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1275:1: (lv_options_4_0= ruleFieldOptions )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1275:1: (lv_options_4_0= ruleFieldOptions )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1276:3: lv_options_4_0= ruleFieldOptions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOneofFieldAccess().getOptionsFieldOptionsParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldOptions_in_ruleOneofField3086);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleOneofField3099); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1304:1: entryRuleIndexedElement returns [EObject current=null] : iv_ruleIndexedElement= ruleIndexedElement EOF ;
    public final EObject entryRuleIndexedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1305:2: (iv_ruleIndexedElement= ruleIndexedElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1306:2: iv_ruleIndexedElement= ruleIndexedElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedElementRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement3135);
            iv_ruleIndexedElement=ruleIndexedElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedElement3145); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1313:1: ruleIndexedElement returns [EObject current=null] : (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup ) ;
    public final EObject ruleIndexedElement() throws RecognitionException {
        EObject current = null;

        EObject this_MessageField_0 = null;

        EObject this_Group_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1316:28: ( (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1317:1: (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1317:1: (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1318:5: this_MessageField_0= ruleMessageField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIndexedElementAccess().getMessageFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessageField_in_ruleIndexedElement3192);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1328:5: this_Group_1= ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIndexedElementAccess().getGroupParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroup_in_ruleIndexedElement3219);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1344:1: entryRuleExtensionRange returns [EObject current=null] : iv_ruleExtensionRange= ruleExtensionRange EOF ;
    public final EObject entryRuleExtensionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionRange = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1345:2: (iv_ruleExtensionRange= ruleExtensionRange EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1346:2: iv_ruleExtensionRange= ruleExtensionRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtensionRangeRule()); 
            }
            pushFollow(FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange3254);
            iv_ruleExtensionRange=ruleExtensionRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtensionRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionRange3264); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1353:1: ruleExtensionRange returns [EObject current=null] : (otherlv_0= 'extensions' ( (lv_ranges_1_0= ruleRange ) ) (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleExtensionRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ranges_1_0 = null;

        EObject lv_ranges_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1356:28: ( (otherlv_0= 'extensions' ( (lv_ranges_1_0= ruleRange ) ) (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )* otherlv_4= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1357:1: (otherlv_0= 'extensions' ( (lv_ranges_1_0= ruleRange ) ) (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )* otherlv_4= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1357:1: (otherlv_0= 'extensions' ( (lv_ranges_1_0= ruleRange ) ) (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )* otherlv_4= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1357:3: otherlv_0= 'extensions' ( (lv_ranges_1_0= ruleRange ) ) (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleExtensionRange3301); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExtensionRangeAccess().getExtensionsKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1361:1: ( (lv_ranges_1_0= ruleRange ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1362:1: (lv_ranges_1_0= ruleRange )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1362:1: (lv_ranges_1_0= ruleRange )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1363:3: lv_ranges_1_0= ruleRange
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExtensionRangeAccess().getRangesRangeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRange_in_ruleExtensionRange3322);
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1379:2: (otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1379:4: otherlv_2= ',' ( (lv_ranges_3_0= ruleRange ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleExtensionRange3335); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getExtensionRangeAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1383:1: ( (lv_ranges_3_0= ruleRange ) )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1384:1: (lv_ranges_3_0= ruleRange )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1384:1: (lv_ranges_3_0= ruleRange )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1385:3: lv_ranges_3_0= ruleRange
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExtensionRangeAccess().getRangesRangeParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRange_in_ruleExtensionRange3356);
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
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleExtensionRange3370); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1413:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1414:2: (iv_ruleRange= ruleRange EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1415:2: iv_ruleRange= ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange3406);
            iv_ruleRange=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange3416); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1422:1: ruleRange returns [EObject current=null] : ( ( (lv_from_0_0= RULE_NUMINT ) ) (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )? ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token lv_from_0_0=null;
        Token otherlv_1=null;
        Token lv_to_2_0=null;
        Token lv_max_3_0=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1425:28: ( ( ( (lv_from_0_0= RULE_NUMINT ) ) (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )? ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1426:1: ( ( (lv_from_0_0= RULE_NUMINT ) ) (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )? )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1426:1: ( ( (lv_from_0_0= RULE_NUMINT ) ) (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )? )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1426:2: ( (lv_from_0_0= RULE_NUMINT ) ) (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )?
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1426:2: ( (lv_from_0_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1427:1: (lv_from_0_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1427:1: (lv_from_0_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1428:3: lv_from_0_0= RULE_NUMINT
            {
            lv_from_0_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleRange3458); if (state.failed) return current;
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1444:2: (otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1444:4: otherlv_1= 'to' ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) )
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleRange3476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getRangeAccess().getToKeyword_1_0());
                          
                    }
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1448:1: ( ( (lv_to_2_0= RULE_NUMINT ) ) | ( (lv_max_3_0= 'max' ) ) )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_NUMINT) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==28) ) {
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
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1448:2: ( (lv_to_2_0= RULE_NUMINT ) )
                            {
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1448:2: ( (lv_to_2_0= RULE_NUMINT ) )
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1449:1: (lv_to_2_0= RULE_NUMINT )
                            {
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1449:1: (lv_to_2_0= RULE_NUMINT )
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1450:3: lv_to_2_0= RULE_NUMINT
                            {
                            lv_to_2_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleRange3494); if (state.failed) return current;
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
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1467:6: ( (lv_max_3_0= 'max' ) )
                            {
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1467:6: ( (lv_max_3_0= 'max' ) )
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1468:1: (lv_max_3_0= 'max' )
                            {
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1468:1: (lv_max_3_0= 'max' )
                            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1469:3: lv_max_3_0= 'max'
                            {
                            lv_max_3_0=(Token)match(input,28,FOLLOW_28_in_ruleRange3523); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1490:1: entryRuleMessageField returns [EObject current=null] : iv_ruleMessageField= ruleMessageField EOF ;
    public final EObject entryRuleMessageField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageField = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1491:2: (iv_ruleMessageField= ruleMessageField EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1492:2: iv_ruleMessageField= ruleMessageField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageFieldRule()); 
            }
            pushFollow(FOLLOW_ruleMessageField_in_entryRuleMessageField3575);
            iv_ruleMessageField=ruleMessageField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageField3585); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1499:1: ruleMessageField returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1502:28: ( ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1503:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1503:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1503:2: ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_type_1_0= ruleTypeLink ) ) ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) ( (lv_options_5_0= ruleFieldOptions ) )? otherlv_6= ';'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1503:2: ( (lv_modifier_0_0= ruleModifier ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1504:1: (lv_modifier_0_0= ruleModifier )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1504:1: (lv_modifier_0_0= ruleModifier )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1505:3: lv_modifier_0_0= ruleModifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageFieldAccess().getModifierModifierEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleModifier_in_ruleMessageField3631);
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1521:2: ( (lv_type_1_0= ruleTypeLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1522:1: (lv_type_1_0= ruleTypeLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1522:1: (lv_type_1_0= ruleTypeLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1523:3: lv_type_1_0= ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageFieldAccess().getTypeTypeLinkParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeLink_in_ruleMessageField3652);
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1539:2: ( (lv_name_2_0= ruleVar ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1540:1: (lv_name_2_0= ruleVar )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1540:1: (lv_name_2_0= ruleVar )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1541:3: lv_name_2_0= ruleVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageFieldAccess().getNameVarParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_in_ruleMessageField3673);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleMessageField3685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMessageFieldAccess().getEqualsSignKeyword_3());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1561:1: ( (lv_index_4_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1562:1: (lv_index_4_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1562:1: (lv_index_4_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1563:3: lv_index_4_0= RULE_NUMINT
            {
            lv_index_4_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleMessageField3702); if (state.failed) return current;
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1579:2: ( (lv_options_5_0= ruleFieldOptions ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1580:1: (lv_options_5_0= ruleFieldOptions )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1580:1: (lv_options_5_0= ruleFieldOptions )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1581:3: lv_options_5_0= ruleFieldOptions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMessageFieldAccess().getOptionsFieldOptionsParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldOptions_in_ruleMessageField3728);
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleMessageField3741); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1609:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1610:2: (iv_ruleGroup= ruleGroup EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1611:2: iv_ruleGroup= ruleGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupRule()); 
            }
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup3777);
            iv_ruleGroup=ruleGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup3787); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1618:1: ruleGroup returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1621:28: ( ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1622:1: ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1622:1: ( ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1622:2: ( (lv_modifier_0_0= ruleModifier ) ) otherlv_1= 'group' ( (lv_name_2_0= ruleVar ) ) otherlv_3= '=' ( (lv_index_4_0= RULE_NUMINT ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleMessageField ) )* otherlv_7= '}'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1622:2: ( (lv_modifier_0_0= ruleModifier ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1623:1: (lv_modifier_0_0= ruleModifier )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1623:1: (lv_modifier_0_0= ruleModifier )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1624:3: lv_modifier_0_0= ruleModifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupAccess().getModifierModifierEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleModifier_in_ruleGroup3833);
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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleGroup3845); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getGroupKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1644:1: ( (lv_name_2_0= ruleVar ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1645:1: (lv_name_2_0= ruleVar )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1645:1: (lv_name_2_0= ruleVar )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1646:3: lv_name_2_0= ruleVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupAccess().getNameVarParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_in_ruleGroup3866);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleGroup3878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getEqualsSignKeyword_3());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1666:1: ( (lv_index_4_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1667:1: (lv_index_4_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1667:1: (lv_index_4_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1668:3: lv_index_4_0= RULE_NUMINT
            {
            lv_index_4_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleGroup3895); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleGroup3912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1688:1: ( (lv_elements_6_0= ruleMessageField ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=42 && LA22_0<=44)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1689:1: (lv_elements_6_0= ruleMessageField )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1689:1: (lv_elements_6_0= ruleMessageField )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1690:3: lv_elements_6_0= ruleMessageField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupAccess().getElementsMessageFieldParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMessageField_in_ruleGroup3933);
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
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleGroup3946); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1718:1: entryRuleTypeLink returns [EObject current=null] : iv_ruleTypeLink= ruleTypeLink EOF ;
    public final EObject entryRuleTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1719:2: (iv_ruleTypeLink= ruleTypeLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1720:2: iv_ruleTypeLink= ruleTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_entryRuleTypeLink3982);
            iv_ruleTypeLink=ruleTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLink3992); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1727:1: ruleTypeLink returns [EObject current=null] : ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink ) ;
    public final EObject ruleTypeLink() throws RecognitionException {
        EObject current = null;

        EObject this_ScalarTypeLink_0 = null;

        EObject this_ComplexTypeLink_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1730:28: ( ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1731:1: ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1731:1: ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1731:2: ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1731:2: ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1731:3: ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLinkAccess().getScalarTypeLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleScalarTypeLink_in_ruleTypeLink4045);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1742:5: this_ComplexTypeLink_1= ruleComplexTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLinkAccess().getComplexTypeLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComplexTypeLink_in_ruleTypeLink4073);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1758:1: entryRuleComplexTypeLink returns [EObject current=null] : iv_ruleComplexTypeLink= ruleComplexTypeLink EOF ;
    public final EObject entryRuleComplexTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTypeLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1759:2: (iv_ruleComplexTypeLink= ruleComplexTypeLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1760:2: iv_ruleComplexTypeLink= ruleComplexTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink4108);
            iv_ruleComplexTypeLink=ruleComplexTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLink4118); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1767:1: ruleComplexTypeLink returns [EObject current=null] : ( ( ruleVar_full ) ) ;
    public final EObject ruleComplexTypeLink() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1770:28: ( ( ( ruleVar_full ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1771:1: ( ( ruleVar_full ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1771:1: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1772:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1772:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1773:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComplexTypeLinkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleComplexTypeLink4165);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1794:1: entryRuleScalarTypeLink returns [EObject current=null] : iv_ruleScalarTypeLink= ruleScalarTypeLink EOF ;
    public final EObject entryRuleScalarTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarTypeLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1795:2: (iv_ruleScalarTypeLink= ruleScalarTypeLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1796:2: iv_ruleScalarTypeLink= ruleScalarTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScalarTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink4200);
            iv_ruleScalarTypeLink=ruleScalarTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScalarTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarTypeLink4210); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1803:1: ruleScalarTypeLink returns [EObject current=null] : ( (lv_target_0_0= ruleScalarType ) ) ;
    public final EObject ruleScalarTypeLink() throws RecognitionException {
        EObject current = null;

        Enumerator lv_target_0_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1806:28: ( ( (lv_target_0_0= ruleScalarType ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1807:1: ( (lv_target_0_0= ruleScalarType ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1807:1: ( (lv_target_0_0= ruleScalarType ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1808:1: (lv_target_0_0= ruleScalarType )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1808:1: (lv_target_0_0= ruleScalarType )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1809:3: lv_target_0_0= ruleScalarType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScalarTypeLinkAccess().getTargetScalarTypeEnumRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleScalarType_in_ruleScalarTypeLink4255);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1833:1: entryRuleFieldOptions returns [EObject current=null] : iv_ruleFieldOptions= ruleFieldOptions EOF ;
    public final EObject entryRuleFieldOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOptions = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1834:2: (iv_ruleFieldOptions= ruleFieldOptions EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1835:2: iv_ruleFieldOptions= ruleFieldOptions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldOptionsRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions4290);
            iv_ruleFieldOptions=ruleFieldOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldOptions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOptions4300); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1842:1: ruleFieldOptions returns [EObject current=null] : (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleFieldOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_options_1_0 = null;

        EObject lv_options_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1845:28: ( (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1846:1: (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1846:1: (otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1846:3: otherlv_0= '[' ( (lv_options_1_0= ruleFieldOption ) ) (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleFieldOptions4337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFieldOptionsAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1850:1: ( (lv_options_1_0= ruleFieldOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1851:1: (lv_options_1_0= ruleFieldOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1851:1: (lv_options_1_0= ruleFieldOption )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1852:3: lv_options_1_0= ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFieldOption_in_ruleFieldOptions4358);
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1868:2: (otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==26) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1868:4: otherlv_2= ',' ( (lv_options_3_0= ruleFieldOption ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleFieldOptions4371); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFieldOptionsAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1872:1: ( (lv_options_3_0= ruleFieldOption ) )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1873:1: (lv_options_3_0= ruleFieldOption )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1873:1: (lv_options_3_0= ruleFieldOption )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1874:3: lv_options_3_0= ruleFieldOption
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFieldOptionsAccess().getOptionsFieldOptionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFieldOption_in_ruleFieldOptions4392);
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
            	    break loop24;
                }
            } while (true);

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleFieldOptions4406); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1902:1: entryRuleFieldOption returns [EObject current=null] : iv_ruleFieldOption= ruleFieldOption EOF ;
    public final EObject entryRuleFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1903:2: (iv_ruleFieldOption= ruleFieldOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1904:2: iv_ruleFieldOption= ruleFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOption_in_entryRuleFieldOption4442);
            iv_ruleFieldOption=ruleFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOption4452); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1911:1: ruleFieldOption returns [EObject current=null] : ( ( ( 'packed' )=>this_PackedValueFieldOption_0= rulePackedValueFieldOption ) | ( ( 'default' )=>this_DefaultValueFieldOption_1= ruleDefaultValueFieldOption ) | this_NativeFieldOption_2= ruleNativeFieldOption ) ;
    public final EObject ruleFieldOption() throws RecognitionException {
        EObject current = null;

        EObject this_PackedValueFieldOption_0 = null;

        EObject this_DefaultValueFieldOption_1 = null;

        EObject this_NativeFieldOption_2 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1914:28: ( ( ( ( 'packed' )=>this_PackedValueFieldOption_0= rulePackedValueFieldOption ) | ( ( 'default' )=>this_DefaultValueFieldOption_1= ruleDefaultValueFieldOption ) | this_NativeFieldOption_2= ruleNativeFieldOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1915:1: ( ( ( 'packed' )=>this_PackedValueFieldOption_0= rulePackedValueFieldOption ) | ( ( 'default' )=>this_DefaultValueFieldOption_1= ruleDefaultValueFieldOption ) | this_NativeFieldOption_2= ruleNativeFieldOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1915:1: ( ( ( 'packed' )=>this_PackedValueFieldOption_0= rulePackedValueFieldOption ) | ( ( 'default' )=>this_DefaultValueFieldOption_1= ruleDefaultValueFieldOption ) | this_NativeFieldOption_2= ruleNativeFieldOption )
            int alt25=3;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1915:2: ( ( 'packed' )=>this_PackedValueFieldOption_0= rulePackedValueFieldOption )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1915:2: ( ( 'packed' )=>this_PackedValueFieldOption_0= rulePackedValueFieldOption )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1915:3: ( 'packed' )=>this_PackedValueFieldOption_0= rulePackedValueFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldOptionAccess().getPackedValueFieldOptionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePackedValueFieldOption_in_ruleFieldOption4507);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1926:6: ( ( 'default' )=>this_DefaultValueFieldOption_1= ruleDefaultValueFieldOption )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1926:6: ( ( 'default' )=>this_DefaultValueFieldOption_1= ruleDefaultValueFieldOption )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1926:7: ( 'default' )=>this_DefaultValueFieldOption_1= ruleDefaultValueFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldOptionAccess().getDefaultValueFieldOptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_ruleFieldOption4543);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1938:5: this_NativeFieldOption_2= ruleNativeFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldOptionAccess().getNativeFieldOptionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNativeFieldOption_in_ruleFieldOption4571);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1954:1: entryRulePackedValueFieldOption returns [EObject current=null] : iv_rulePackedValueFieldOption= rulePackedValueFieldOption EOF ;
    public final EObject entryRulePackedValueFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackedValueFieldOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1955:2: (iv_rulePackedValueFieldOption= rulePackedValueFieldOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1956:2: iv_rulePackedValueFieldOption= rulePackedValueFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackedValueFieldOptionRule()); 
            }
            pushFollow(FOLLOW_rulePackedValueFieldOption_in_entryRulePackedValueFieldOption4606);
            iv_rulePackedValueFieldOption=rulePackedValueFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackedValueFieldOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackedValueFieldOption4616); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1963:1: rulePackedValueFieldOption returns [EObject current=null] : ( ( ( 'packed' )=>otherlv_0= 'packed' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject rulePackedValueFieldOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1966:28: ( ( ( ( 'packed' )=>otherlv_0= 'packed' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1967:1: ( ( ( 'packed' )=>otherlv_0= 'packed' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1967:1: ( ( ( 'packed' )=>otherlv_0= 'packed' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1967:2: ( ( 'packed' )=>otherlv_0= 'packed' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1967:2: ( ( 'packed' )=>otherlv_0= 'packed' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1967:3: ( 'packed' )=>otherlv_0= 'packed'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_rulePackedValueFieldOption4661); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackedValueFieldOptionAccess().getPackedKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_rulePackedValueFieldOption4674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPackedValueFieldOptionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1976:1: ( (lv_value_2_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1977:1: (lv_value_2_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1977:1: (lv_value_2_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1978:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackedValueFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_rulePackedValueFieldOption4695);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2002:1: entryRuleDefaultValueFieldOption returns [EObject current=null] : iv_ruleDefaultValueFieldOption= ruleDefaultValueFieldOption EOF ;
    public final EObject entryRuleDefaultValueFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValueFieldOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2003:2: (iv_ruleDefaultValueFieldOption= ruleDefaultValueFieldOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2004:2: iv_ruleDefaultValueFieldOption= ruleDefaultValueFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultValueFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption4731);
            iv_ruleDefaultValueFieldOption=ruleDefaultValueFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultValueFieldOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValueFieldOption4741); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2011:1: ruleDefaultValueFieldOption returns [EObject current=null] : ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleDefaultValueFieldOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2014:28: ( ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2015:1: ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2015:1: ( ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2015:2: ( ( 'default' )=>otherlv_0= 'default' ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2015:2: ( ( 'default' )=>otherlv_0= 'default' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2015:3: ( 'default' )=>otherlv_0= 'default'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleDefaultValueFieldOption4786); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDefaultValueFieldOptionAccess().getDefaultKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDefaultValueFieldOption4799); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefaultValueFieldOptionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2024:1: ( (lv_value_2_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2025:1: (lv_value_2_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2025:1: (lv_value_2_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2026:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefaultValueFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleDefaultValueFieldOption4820);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2050:1: entryRuleNativeFieldOption returns [EObject current=null] : iv_ruleNativeFieldOption= ruleNativeFieldOption EOF ;
    public final EObject entryRuleNativeFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeFieldOption = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2051:2: (iv_ruleNativeFieldOption= ruleNativeFieldOption EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2052:2: iv_ruleNativeFieldOption= ruleNativeFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNativeFieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption4856);
            iv_ruleNativeFieldOption=ruleNativeFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNativeFieldOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeFieldOption4866); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2059:1: ruleNativeFieldOption returns [EObject current=null] : ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleNativeFieldOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_source_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2062:28: ( ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2063:1: ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2063:1: ( ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2063:2: ( (lv_source_0_0= ruleOptionSource ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2063:2: ( (lv_source_0_0= ruleOptionSource ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2064:1: (lv_source_0_0= ruleOptionSource )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2064:1: (lv_source_0_0= ruleOptionSource )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2065:3: lv_source_0_0= ruleOptionSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNativeFieldOptionAccess().getSourceOptionSourceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOptionSource_in_ruleNativeFieldOption4912);
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleNativeFieldOption4924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNativeFieldOptionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2085:1: ( (lv_value_2_0= ruleValue ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2086:1: (lv_value_2_0= ruleValue )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2086:1: (lv_value_2_0= ruleValue )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2087:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNativeFieldOptionAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleNativeFieldOption4945);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2111:1: entryRuleOptionSource returns [EObject current=null] : iv_ruleOptionSource= ruleOptionSource EOF ;
    public final EObject entryRuleOptionSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionSource = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2112:2: (iv_ruleOptionSource= ruleOptionSource EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2113:2: iv_ruleOptionSource= ruleOptionSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionSourceRule()); 
            }
            pushFollow(FOLLOW_ruleOptionSource_in_entryRuleOptionSource4981);
            iv_ruleOptionSource=ruleOptionSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionSource4991); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2120:1: ruleOptionSource returns [EObject current=null] : ( ( ruleVar_full ) ) ;
    public final EObject ruleOptionSource() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2123:28: ( ( ( ruleVar_full ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2124:1: ( ( ruleVar_full ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2124:1: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2125:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2125:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2126:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOptionSourceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionSourceAccess().getTargetIndexedElementCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleOptionSource5038);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2147:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2148:2: (iv_ruleEnum= ruleEnum EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2149:2: iv_ruleEnum= ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum5073);
            iv_ruleEnum=ruleEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum5083); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2156:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2159:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2160:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' (otherlv_5= ';' )? )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2160:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' (otherlv_5= ';' )? )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2160:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )* otherlv_4= '}' (otherlv_5= ';' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleEnum5120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2164:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2165:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2165:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2166:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum5137); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleEnum5154); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2186:1: ( (lv_elements_3_0= ruleEnumElement ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==20) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2187:1: (lv_elements_3_0= ruleEnumElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2187:1: (lv_elements_3_0= ruleEnumElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2188:3: lv_elements_3_0= ruleEnumElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumElement_in_ruleEnum5175);
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
            	    break loop26;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleEnum5188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2208:1: (otherlv_5= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==15) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2208:3: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleEnum5201); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2220:1: entryRuleEnumElement returns [EObject current=null] : iv_ruleEnumElement= ruleEnumElement EOF ;
    public final EObject entryRuleEnumElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2221:2: (iv_ruleEnumElement= ruleEnumElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2222:2: iv_ruleEnumElement= ruleEnumElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumElementRule()); 
            }
            pushFollow(FOLLOW_ruleEnumElement_in_entryRuleEnumElement5239);
            iv_ruleEnumElement=ruleEnumElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumElement5249); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2229:1: ruleEnumElement returns [EObject current=null] : (this_EnumField_0= ruleEnumField | this_CustomOption_1= ruleCustomOption ) ;
    public final EObject ruleEnumElement() throws RecognitionException {
        EObject current = null;

        EObject this_EnumField_0 = null;

        EObject this_CustomOption_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2232:28: ( (this_EnumField_0= ruleEnumField | this_CustomOption_1= ruleCustomOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2233:1: (this_EnumField_0= ruleEnumField | this_CustomOption_1= ruleCustomOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2233:1: (this_EnumField_0= ruleEnumField | this_CustomOption_1= ruleCustomOption )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2234:5: this_EnumField_0= ruleEnumField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumElementAccess().getEnumFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumField_in_ruleEnumElement5296);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2244:5: this_CustomOption_1= ruleCustomOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumElementAccess().getCustomOptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCustomOption_in_ruleEnumElement5323);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2260:1: entryRuleEnumField returns [EObject current=null] : iv_ruleEnumField= ruleEnumField EOF ;
    public final EObject entryRuleEnumField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumField = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2261:2: (iv_ruleEnumField= ruleEnumField EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2262:2: iv_ruleEnumField= ruleEnumField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumFieldRule()); 
            }
            pushFollow(FOLLOW_ruleEnumField_in_entryRuleEnumField5358);
            iv_ruleEnumField=ruleEnumField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumField5368); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2269:1: ruleEnumField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2272:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2273:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2273:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2273:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_index_2_0= RULE_NUMINT ) ) (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )? otherlv_8= ';'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2273:2: ( (lv_name_0_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2274:1: (lv_name_0_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2274:1: (lv_name_0_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2275:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumField5410); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleEnumField5427); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumFieldAccess().getEqualsSignKeyword_1());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2295:1: ( (lv_index_2_0= RULE_NUMINT ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2296:1: (lv_index_2_0= RULE_NUMINT )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2296:1: (lv_index_2_0= RULE_NUMINT )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2297:3: lv_index_2_0= RULE_NUMINT
            {
            lv_index_2_0=(Token)match(input,RULE_NUMINT,FOLLOW_RULE_NUMINT_in_ruleEnumField5444); if (state.failed) return current;
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

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2313:2: (otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2313:4: otherlv_3= '[' ( (lv_options_4_0= ruleFieldOption ) ) (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )* otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleEnumField5462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEnumFieldAccess().getLeftSquareBracketKeyword_3_0());
                          
                    }
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2317:1: ( (lv_options_4_0= ruleFieldOption ) )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2318:1: (lv_options_4_0= ruleFieldOption )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2318:1: (lv_options_4_0= ruleFieldOption )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2319:3: lv_options_4_0= ruleFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldOption_in_ruleEnumField5483);
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

                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2335:2: (otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==26) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2335:4: otherlv_5= ',' ( (lv_options_6_0= ruleFieldOption ) )
                    	    {
                    	    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleEnumField5496); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEnumFieldAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2339:1: ( (lv_options_6_0= ruleFieldOption ) )
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2340:1: (lv_options_6_0= ruleFieldOption )
                    	    {
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2340:1: (lv_options_6_0= ruleFieldOption )
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2341:3: lv_options_6_0= ruleFieldOption
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEnumFieldAccess().getOptionsFieldOptionParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFieldOption_in_ruleEnumField5517);
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
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleEnumField5531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEnumFieldAccess().getRightSquareBracketKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleEnumField5545); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2373:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2374:2: (iv_ruleService= ruleService EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2375:2: iv_ruleService= ruleService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService5581);
            iv_ruleService=ruleService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleService; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService5591); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2382:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2385:28: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )* otherlv_4= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2386:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )* otherlv_4= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2386:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )* otherlv_4= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2386:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleServiceElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleService5628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2390:1: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2391:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2391:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2392:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService5645); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleService5662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2412:1: ( (lv_elements_3_0= ruleServiceElement ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20||LA31_0==36) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2413:1: (lv_elements_3_0= ruleServiceElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2413:1: (lv_elements_3_0= ruleServiceElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2414:3: lv_elements_3_0= ruleServiceElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceAccess().getElementsServiceElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleServiceElement_in_ruleService5683);
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
            	    break loop31;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleService5696); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2442:1: entryRuleServiceElement returns [EObject current=null] : iv_ruleServiceElement= ruleServiceElement EOF ;
    public final EObject entryRuleServiceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceElement = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2443:2: (iv_ruleServiceElement= ruleServiceElement EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2444:2: iv_ruleServiceElement= ruleServiceElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceElementRule()); 
            }
            pushFollow(FOLLOW_ruleServiceElement_in_entryRuleServiceElement5732);
            iv_ruleServiceElement=ruleServiceElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleServiceElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceElement5742); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2451:1: ruleServiceElement returns [EObject current=null] : ( ( ( 'rpc' )=>this_Rpc_0= ruleRpc ) | this_Option_1= ruleOption ) ;
    public final EObject ruleServiceElement() throws RecognitionException {
        EObject current = null;

        EObject this_Rpc_0 = null;

        EObject this_Option_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2454:28: ( ( ( ( 'rpc' )=>this_Rpc_0= ruleRpc ) | this_Option_1= ruleOption ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2455:1: ( ( ( 'rpc' )=>this_Rpc_0= ruleRpc ) | this_Option_1= ruleOption )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2455:1: ( ( ( 'rpc' )=>this_Rpc_0= ruleRpc ) | this_Option_1= ruleOption )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) && (synpred9_InternalProtobuf())) {
                alt32=1;
            }
            else if ( (LA32_0==20) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2455:2: ( ( 'rpc' )=>this_Rpc_0= ruleRpc )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2455:2: ( ( 'rpc' )=>this_Rpc_0= ruleRpc )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2455:3: ( 'rpc' )=>this_Rpc_0= ruleRpc
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getServiceElementAccess().getRpcParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRpc_in_ruleServiceElement5797);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2467:5: this_Option_1= ruleOption
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getServiceElementAccess().getOptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOption_in_ruleServiceElement5825);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2483:1: entryRuleRpc returns [EObject current=null] : iv_ruleRpc= ruleRpc EOF ;
    public final EObject entryRuleRpc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRpc = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2484:2: (iv_ruleRpc= ruleRpc EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2485:2: iv_ruleRpc= ruleRpc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRpcRule()); 
            }
            pushFollow(FOLLOW_ruleRpc_in_entryRuleRpc5860);
            iv_ruleRpc=ruleRpc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRpc; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRpc5870); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2492:1: ruleRpc returns [EObject current=null] : ( ( ( 'rpc' )=>otherlv_0= 'rpc' ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? otherlv_12= ';' ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2495:28: ( ( ( ( 'rpc' )=>otherlv_0= 'rpc' ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? otherlv_12= ';' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2496:1: ( ( ( 'rpc' )=>otherlv_0= 'rpc' ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? otherlv_12= ';' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2496:1: ( ( ( 'rpc' )=>otherlv_0= 'rpc' ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? otherlv_12= ';' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2496:2: ( ( 'rpc' )=>otherlv_0= 'rpc' ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argType_3_0= ruleMessageLink ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_returnType_7_0= ruleMessageLink ) ) otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )? otherlv_12= ';'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2496:2: ( ( 'rpc' )=>otherlv_0= 'rpc' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2496:3: ( 'rpc' )=>otherlv_0= 'rpc'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleRpc5915); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRpcAccess().getRpcKeyword_0());
                  
            }

            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2501:2: ( (lv_name_1_0= RULE_ID ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2502:1: (lv_name_1_0= RULE_ID )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2502:1: (lv_name_1_0= RULE_ID )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2503:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRpc5933); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleRpc5950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRpcAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2523:1: ( (lv_argType_3_0= ruleMessageLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2524:1: (lv_argType_3_0= ruleMessageLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2524:1: (lv_argType_3_0= ruleMessageLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2525:3: lv_argType_3_0= ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRpcAccess().getArgTypeMessageLinkParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMessageLink_in_ruleRpc5971);
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

            otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleRpc5983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRpcAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleRpc5995); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRpcAccess().getReturnsKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleRpc6007); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getRpcAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2553:1: ( (lv_returnType_7_0= ruleMessageLink ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2554:1: (lv_returnType_7_0= ruleMessageLink )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2554:1: (lv_returnType_7_0= ruleMessageLink )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2555:3: lv_returnType_7_0= ruleMessageLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRpcAccess().getReturnTypeMessageLinkParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMessageLink_in_ruleRpc6028);
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

            otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleRpc6040); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRpcAccess().getRightParenthesisKeyword_8());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2575:1: (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==22) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2575:3: otherlv_9= '{' ( (lv_options_10_0= ruleOption ) )* otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleRpc6053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getRpcAccess().getLeftCurlyBracketKeyword_9_0());
                          
                    }
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2579:1: ( (lv_options_10_0= ruleOption ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==20) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2580:1: (lv_options_10_0= ruleOption )
                    	    {
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2580:1: (lv_options_10_0= ruleOption )
                    	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2581:3: lv_options_10_0= ruleOption
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRpcAccess().getOptionsOptionParserRuleCall_9_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOption_in_ruleRpc6074);
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
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleRpc6087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getRpcAccess().getRightCurlyBracketKeyword_9_2());
                          
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleRpc6101); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2613:1: entryRuleMessageLink returns [EObject current=null] : iv_ruleMessageLink= ruleMessageLink EOF ;
    public final EObject entryRuleMessageLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageLink = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2614:2: (iv_ruleMessageLink= ruleMessageLink EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2615:2: iv_ruleMessageLink= ruleMessageLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageLinkRule()); 
            }
            pushFollow(FOLLOW_ruleMessageLink_in_entryRuleMessageLink6137);
            iv_ruleMessageLink=ruleMessageLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageLink6147); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2622:1: ruleMessageLink returns [EObject current=null] : ( ( ruleVar_full ) ) ;
    public final EObject ruleMessageLink() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2625:28: ( ( ( ruleVar_full ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2626:1: ( ( ruleVar_full ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2626:1: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2627:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2627:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2628:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMessageLinkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageLinkAccess().getTargetMessageCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleMessageLink6194);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2649:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2650:2: (iv_ruleExtend= ruleExtend EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2651:2: iv_ruleExtend= ruleExtend EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendRule()); 
            }
            pushFollow(FOLLOW_ruleExtend_in_entryRuleExtend6229);
            iv_ruleExtend=ruleExtend();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtend; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtend6239); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2658:1: ruleExtend returns [EObject current=null] : ( ( ( 'extend' )=>otherlv_0= 'extend' ) ( ( ruleVar_full ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2661:28: ( ( ( ( 'extend' )=>otherlv_0= 'extend' ) ( ( ruleVar_full ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2662:1: ( ( ( 'extend' )=>otherlv_0= 'extend' ) ( ( ruleVar_full ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2662:1: ( ( ( 'extend' )=>otherlv_0= 'extend' ) ( ( ruleVar_full ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2662:2: ( ( 'extend' )=>otherlv_0= 'extend' ) ( ( ruleVar_full ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMessageElement ) )* otherlv_4= '}'
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2662:2: ( ( 'extend' )=>otherlv_0= 'extend' )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2662:3: ( 'extend' )=>otherlv_0= 'extend'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleExtend6284); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtendKeyword_0());
                  
            }

            }

            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2667:2: ( ( ruleVar_full ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2668:1: ( ruleVar_full )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2668:1: ( ruleVar_full )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2669:3: ruleVar_full
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExtendRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExtendAccess().getTypeMessageCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVar_full_in_ruleExtend6308);
            ruleVar_full();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleExtend6320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2686:1: ( (lv_elements_3_0= ruleMessageElement ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=20 && LA35_0<=21)||(LA35_0>=24 && LA35_0<=25)||(LA35_0>=34 && LA35_0<=35)||LA35_0==40||(LA35_0>=42 && LA35_0<=44)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2687:1: (lv_elements_3_0= ruleMessageElement )
            	    {
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2687:1: (lv_elements_3_0= ruleMessageElement )
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2688:3: lv_elements_3_0= ruleMessageElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExtendAccess().getElementsMessageElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMessageElement_in_ruleExtend6341);
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
            	    break loop35;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleExtend6354); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2716:1: entryRuleVar_full returns [String current=null] : iv_ruleVar_full= ruleVar_full EOF ;
    public final String entryRuleVar_full() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVar_full = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2717:2: (iv_ruleVar_full= ruleVar_full EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2718:2: iv_ruleVar_full= ruleVar_full EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVar_fullRule()); 
            }
            pushFollow(FOLLOW_ruleVar_full_in_entryRuleVar_full6391);
            iv_ruleVar_full=ruleVar_full();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar_full.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar_full6402); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2725:1: ruleVar_full returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar ) ;
    public final AntlrDatatypeRuleToken ruleVar_full() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FULL_ID_0 = null;

        AntlrDatatypeRuleToken this_Var_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2728:28: ( (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2729:1: (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2729:1: (this_FULL_ID_0= ruleFULL_ID | this_Var_1= ruleVar )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==EOF||LA36_1==RULE_ID||(LA36_1>=13 && LA36_1<=17)||(LA36_1>=19 && LA36_1<=22)||LA36_1==25||(LA36_1>=27 && LA36_1<=29)||(LA36_1>=32 && LA36_1<=36)||(LA36_1>=38 && LA36_1<=40)||(LA36_1>=42 && LA36_1<=60)) ) {
                    alt36=2;
                }
                else if ( (LA36_1==41) ) {
                    alt36=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA36_0==13||(LA36_0>=16 && LA36_0<=17)||(LA36_0>=19 && LA36_0<=21)||LA36_0==25||(LA36_0>=27 && LA36_0<=29)||(LA36_0>=32 && LA36_0<=36)||(LA36_0>=39 && LA36_0<=40)||(LA36_0>=42 && LA36_0<=60)) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2730:5: this_FULL_ID_0= ruleFULL_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVar_fullAccess().getFULL_IDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFULL_ID_in_ruleVar_full6449);
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2742:5: this_Var_1= ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVar_fullAccess().getVarParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVar_in_ruleVar_full6482);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2760:1: entryRuleVar returns [String current=null] : iv_ruleVar= ruleVar EOF ;
    public final String entryRuleVar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVar = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2761:2: (iv_ruleVar= ruleVar EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2762:2: iv_ruleVar= ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar6528);
            iv_ruleVar=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar6539); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2769:1: ruleVar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved ) ;
    public final AntlrDatatypeRuleToken ruleVar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_VarReserved_1 = null;


         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2772:28: ( (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2773:1: (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2773:1: (this_ID_0= RULE_ID | this_VarReserved_1= ruleVarReserved )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            else if ( (LA37_0==13||(LA37_0>=16 && LA37_0<=17)||(LA37_0>=19 && LA37_0<=21)||LA37_0==25||(LA37_0>=27 && LA37_0<=29)||(LA37_0>=32 && LA37_0<=36)||(LA37_0>=39 && LA37_0<=40)||(LA37_0>=42 && LA37_0<=60)) ) {
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2773:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVar6579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getVarAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2782:5: this_VarReserved_1= ruleVarReserved
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarAccess().getVarReservedParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarReserved_in_ruleVar6612);
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2800:1: entryRuleFULL_ID returns [String current=null] : iv_ruleFULL_ID= ruleFULL_ID EOF ;
    public final String entryRuleFULL_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFULL_ID = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2801:2: (iv_ruleFULL_ID= ruleFULL_ID EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2802:2: iv_ruleFULL_ID= ruleFULL_ID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFULL_IDRule()); 
            }
            pushFollow(FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID6658);
            iv_ruleFULL_ID=ruleFULL_ID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFULL_ID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFULL_ID6669); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2809:1: ruleFULL_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleFULL_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2812:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2813:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2813:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2813:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFULL_ID6709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2820:1: (kw= '.' this_ID_2= RULE_ID )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==41) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2821:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,41,FOLLOW_41_in_ruleFULL_ID6728); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFULL_IDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFULL_ID6743); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFULL_IDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2841:1: entryRuleVarReserved returns [String current=null] : iv_ruleVarReserved= ruleVarReserved EOF ;
    public final String entryRuleVarReserved() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarReserved = null;


        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2842:2: (iv_ruleVarReserved= ruleVarReserved EOF )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2843:2: iv_ruleVarReserved= ruleVarReserved EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarReservedRule()); 
            }
            pushFollow(FOLLOW_ruleVarReserved_in_entryRuleVarReserved6791);
            iv_ruleVarReserved=ruleVarReserved();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarReserved.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarReserved6802); if (state.failed) return current;

            }

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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2850:1: ruleVarReserved returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' | kw= 'weak' | kw= 'packed' ) ;
    public final AntlrDatatypeRuleToken ruleVarReserved() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2853:28: ( (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' | kw= 'weak' | kw= 'packed' ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2854:1: (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' | kw= 'weak' | kw= 'packed' )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2854:1: (kw= 'to' | kw= 'package' | kw= 'syntax' | kw= 'import' | kw= 'option' | kw= 'message' | kw= 'service' | kw= 'enum' | kw= 'required' | kw= 'optional' | kw= 'repeated' | kw= 'extensions' | kw= 'extend' | kw= 'group' | kw= 'rpc' | kw= 'returns' | kw= 'int32' | kw= 'int64' | kw= 'uint32' | kw= 'uint64' | kw= 'sint32' | kw= 'sint64' | kw= 'fixed32' | kw= 'fixed64' | kw= 'sfixed32' | kw= 'sfixed64' | kw= 'float' | kw= 'double' | kw= 'bool' | kw= 'string' | kw= 'bytes' | kw= 'default' | kw= 'max' | kw= 'void' | kw= 'weak' | kw= 'packed' )
            int alt39=36;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt39=1;
                }
                break;
            case 16:
                {
                alt39=2;
                }
                break;
            case 13:
                {
                alt39=3;
                }
                break;
            case 17:
                {
                alt39=4;
                }
                break;
            case 20:
                {
                alt39=5;
                }
                break;
            case 21:
                {
                alt39=6;
                }
                break;
            case 35:
                {
                alt39=7;
                }
                break;
            case 34:
                {
                alt39=8;
                }
                break;
            case 42:
                {
                alt39=9;
                }
                break;
            case 43:
                {
                alt39=10;
                }
                break;
            case 44:
                {
                alt39=11;
                }
                break;
            case 25:
                {
                alt39=12;
                }
                break;
            case 40:
                {
                alt39=13;
                }
                break;
            case 29:
                {
                alt39=14;
                }
                break;
            case 36:
                {
                alt39=15;
                }
                break;
            case 39:
                {
                alt39=16;
                }
                break;
            case 45:
                {
                alt39=17;
                }
                break;
            case 46:
                {
                alt39=18;
                }
                break;
            case 47:
                {
                alt39=19;
                }
                break;
            case 48:
                {
                alt39=20;
                }
                break;
            case 49:
                {
                alt39=21;
                }
                break;
            case 50:
                {
                alt39=22;
                }
                break;
            case 51:
                {
                alt39=23;
                }
                break;
            case 52:
                {
                alt39=24;
                }
                break;
            case 53:
                {
                alt39=25;
                }
                break;
            case 54:
                {
                alt39=26;
                }
                break;
            case 55:
                {
                alt39=27;
                }
                break;
            case 56:
                {
                alt39=28;
                }
                break;
            case 57:
                {
                alt39=29;
                }
                break;
            case 58:
                {
                alt39=30;
                }
                break;
            case 59:
                {
                alt39=31;
                }
                break;
            case 33:
                {
                alt39=32;
                }
                break;
            case 28:
                {
                alt39=33;
                }
                break;
            case 60:
                {
                alt39=34;
                }
                break;
            case 19:
                {
                alt39=35;
                }
                break;
            case 32:
                {
                alt39=36;
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
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2855:2: kw= 'to'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleVarReserved6840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getToKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2862:2: kw= 'package'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleVarReserved6859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getPackageKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2869:2: kw= 'syntax'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleVarReserved6878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSyntaxKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2876:2: kw= 'import'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleVarReserved6897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getImportKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2883:2: kw= 'option'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleVarReserved6916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getOptionKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2890:2: kw= 'message'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleVarReserved6935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getMessageKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2897:2: kw= 'service'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleVarReserved6954); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getServiceKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2904:2: kw= 'enum'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleVarReserved6973); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getEnumKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2911:2: kw= 'required'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleVarReserved6992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getRequiredKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2918:2: kw= 'optional'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleVarReserved7011); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getOptionalKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2925:2: kw= 'repeated'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleVarReserved7030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getRepeatedKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2932:2: kw= 'extensions'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleVarReserved7049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getExtensionsKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2939:2: kw= 'extend'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleVarReserved7068); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getExtendKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2946:2: kw= 'group'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleVarReserved7087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getGroupKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2953:2: kw= 'rpc'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleVarReserved7106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getRpcKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2960:2: kw= 'returns'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleVarReserved7125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getReturnsKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2967:2: kw= 'int32'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleVarReserved7144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getInt32Keyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2974:2: kw= 'int64'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleVarReserved7163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getInt64Keyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2981:2: kw= 'uint32'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleVarReserved7182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getUint32Keyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2988:2: kw= 'uint64'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleVarReserved7201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getUint64Keyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2995:2: kw= 'sint32'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleVarReserved7220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSint32Keyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3002:2: kw= 'sint64'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleVarReserved7239); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSint64Keyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3009:2: kw= 'fixed32'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleVarReserved7258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getFixed32Keyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3016:2: kw= 'fixed64'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleVarReserved7277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getFixed64Keyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3023:2: kw= 'sfixed32'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleVarReserved7296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSfixed32Keyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3030:2: kw= 'sfixed64'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleVarReserved7315); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getSfixed64Keyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3037:2: kw= 'float'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleVarReserved7334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getFloatKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3044:2: kw= 'double'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleVarReserved7353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getDoubleKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3051:2: kw= 'bool'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleVarReserved7372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getBoolKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3058:2: kw= 'string'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleVarReserved7391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getStringKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3065:2: kw= 'bytes'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleVarReserved7410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getBytesKeyword_30()); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3072:2: kw= 'default'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleVarReserved7429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getDefaultKeyword_31()); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3079:2: kw= 'max'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleVarReserved7448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getMaxKeyword_32()); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3086:2: kw= 'void'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleVarReserved7467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getVoidKeyword_33()); 
                          
                    }

                    }
                    break;
                case 35 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3093:2: kw= 'weak'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleVarReserved7486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarReservedAccess().getWeakKeyword_34()); 
                          
                    }

                    }
                    break;
                case 36 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3100:2: kw= 'packed'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleVarReserved7505); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3115:1: ruleBOOL returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBOOL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3117:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3118:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3118:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==61) ) {
                alt40=1;
            }
            else if ( (LA40_0==62) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3118:2: (enumLiteral_0= 'true' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3118:2: (enumLiteral_0= 'true' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3118:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_61_in_ruleBOOL7561); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBOOLAccess().getTrueEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3124:6: (enumLiteral_1= 'false' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3124:6: (enumLiteral_1= 'false' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3124:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_62_in_ruleBOOL7578); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3134:1: ruleModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) ) ;
    public final Enumerator ruleModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3136:28: ( ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3137:1: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3137:1: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'required' ) | (enumLiteral_2= 'repeated' ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt41=1;
                }
                break;
            case 42:
                {
                alt41=2;
                }
                break;
            case 44:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3137:2: (enumLiteral_0= 'optional' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3137:2: (enumLiteral_0= 'optional' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3137:4: enumLiteral_0= 'optional'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleModifier7623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3143:6: (enumLiteral_1= 'required' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3143:6: (enumLiteral_1= 'required' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3143:8: enumLiteral_1= 'required'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_42_in_ruleModifier7640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3149:6: (enumLiteral_2= 'repeated' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3149:6: (enumLiteral_2= 'repeated' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3149:8: enumLiteral_2= 'repeated'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_44_in_ruleModifier7657); if (state.failed) return current;
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
    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3159:1: ruleScalarType returns [Enumerator current=null] : ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) ) ;
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
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3161:28: ( ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) ) )
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3162:1: ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) )
            {
            // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3162:1: ( (enumLiteral_0= 'int32' ) | (enumLiteral_1= 'int64' ) | (enumLiteral_2= 'uint32' ) | (enumLiteral_3= 'uint64' ) | (enumLiteral_4= 'sint32' ) | (enumLiteral_5= 'sint64' ) | (enumLiteral_6= 'fixed32' ) | (enumLiteral_7= 'fixed64' ) | (enumLiteral_8= 'sfixed32' ) | (enumLiteral_9= 'sfixed64' ) | (enumLiteral_10= 'float' ) | (enumLiteral_11= 'double' ) | (enumLiteral_12= 'bool' ) | (enumLiteral_13= 'string' ) | (enumLiteral_14= 'bytes' ) )
            int alt42=15;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt42=1;
                }
                break;
            case 46:
                {
                alt42=2;
                }
                break;
            case 47:
                {
                alt42=3;
                }
                break;
            case 48:
                {
                alt42=4;
                }
                break;
            case 49:
                {
                alt42=5;
                }
                break;
            case 50:
                {
                alt42=6;
                }
                break;
            case 51:
                {
                alt42=7;
                }
                break;
            case 52:
                {
                alt42=8;
                }
                break;
            case 53:
                {
                alt42=9;
                }
                break;
            case 54:
                {
                alt42=10;
                }
                break;
            case 55:
                {
                alt42=11;
                }
                break;
            case 56:
                {
                alt42=12;
                }
                break;
            case 57:
                {
                alt42=13;
                }
                break;
            case 58:
                {
                alt42=14;
                }
                break;
            case 59:
                {
                alt42=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3162:2: (enumLiteral_0= 'int32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3162:2: (enumLiteral_0= 'int32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3162:4: enumLiteral_0= 'int32'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_45_in_ruleScalarType7702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getScalarTypeAccess().getInt32EnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3168:6: (enumLiteral_1= 'int64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3168:6: (enumLiteral_1= 'int64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3168:8: enumLiteral_1= 'int64'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_46_in_ruleScalarType7719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getScalarTypeAccess().getInt64EnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3174:6: (enumLiteral_2= 'uint32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3174:6: (enumLiteral_2= 'uint32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3174:8: enumLiteral_2= 'uint32'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_47_in_ruleScalarType7736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getScalarTypeAccess().getUint32EnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3180:6: (enumLiteral_3= 'uint64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3180:6: (enumLiteral_3= 'uint64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3180:8: enumLiteral_3= 'uint64'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_48_in_ruleScalarType7753); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getScalarTypeAccess().getUint64EnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3186:6: (enumLiteral_4= 'sint32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3186:6: (enumLiteral_4= 'sint32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3186:8: enumLiteral_4= 'sint32'
                    {
                    enumLiteral_4=(Token)match(input,49,FOLLOW_49_in_ruleScalarType7770); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getScalarTypeAccess().getSint32EnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3192:6: (enumLiteral_5= 'sint64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3192:6: (enumLiteral_5= 'sint64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3192:8: enumLiteral_5= 'sint64'
                    {
                    enumLiteral_5=(Token)match(input,50,FOLLOW_50_in_ruleScalarType7787); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getScalarTypeAccess().getSint64EnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3198:6: (enumLiteral_6= 'fixed32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3198:6: (enumLiteral_6= 'fixed32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3198:8: enumLiteral_6= 'fixed32'
                    {
                    enumLiteral_6=(Token)match(input,51,FOLLOW_51_in_ruleScalarType7804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getScalarTypeAccess().getFixed32EnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3204:6: (enumLiteral_7= 'fixed64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3204:6: (enumLiteral_7= 'fixed64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3204:8: enumLiteral_7= 'fixed64'
                    {
                    enumLiteral_7=(Token)match(input,52,FOLLOW_52_in_ruleScalarType7821); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getScalarTypeAccess().getFixed64EnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3210:6: (enumLiteral_8= 'sfixed32' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3210:6: (enumLiteral_8= 'sfixed32' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3210:8: enumLiteral_8= 'sfixed32'
                    {
                    enumLiteral_8=(Token)match(input,53,FOLLOW_53_in_ruleScalarType7838); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getScalarTypeAccess().getSfixed32EnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3216:6: (enumLiteral_9= 'sfixed64' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3216:6: (enumLiteral_9= 'sfixed64' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3216:8: enumLiteral_9= 'sfixed64'
                    {
                    enumLiteral_9=(Token)match(input,54,FOLLOW_54_in_ruleScalarType7855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getScalarTypeAccess().getSfixed64EnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3222:6: (enumLiteral_10= 'float' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3222:6: (enumLiteral_10= 'float' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3222:8: enumLiteral_10= 'float'
                    {
                    enumLiteral_10=(Token)match(input,55,FOLLOW_55_in_ruleScalarType7872); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getScalarTypeAccess().getFloatEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3228:6: (enumLiteral_11= 'double' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3228:6: (enumLiteral_11= 'double' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3228:8: enumLiteral_11= 'double'
                    {
                    enumLiteral_11=(Token)match(input,56,FOLLOW_56_in_ruleScalarType7889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getScalarTypeAccess().getDoubleEnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3234:6: (enumLiteral_12= 'bool' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3234:6: (enumLiteral_12= 'bool' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3234:8: enumLiteral_12= 'bool'
                    {
                    enumLiteral_12=(Token)match(input,57,FOLLOW_57_in_ruleScalarType7906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getScalarTypeAccess().getBoolEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3240:6: (enumLiteral_13= 'string' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3240:6: (enumLiteral_13= 'string' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3240:8: enumLiteral_13= 'string'
                    {
                    enumLiteral_13=(Token)match(input,58,FOLLOW_58_in_ruleScalarType7923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getScalarTypeAccess().getStringEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3246:6: (enumLiteral_14= 'bytes' )
                    {
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3246:6: (enumLiteral_14= 'bytes' )
                    // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:3246:8: enumLiteral_14= 'bytes'
                    {
                    enumLiteral_14=(Token)match(input,59,FOLLOW_59_in_ruleScalarType7940); if (state.failed) return current;
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
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:204:7: ( 'extend' )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:204:9: 'extend'
        {
        match(input,40,FOLLOW_40_in_synpred1_InternalProtobuf373); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalProtobuf

    // $ANTLR start synpred2_InternalProtobuf
    public final void synpred2_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:397:3: ( ruleNativeOption )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:397:5: ruleNativeOption
        {
        pushFollow(FOLLOW_ruleNativeOption_in_synpred2_InternalProtobuf908);
        ruleNativeOption();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalProtobuf

    // $ANTLR start synpred3_InternalProtobuf
    public final void synpred3_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1096:7: ( 'extend' )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1096:9: 'extend'
        {
        match(input,40,FOLLOW_40_in_synpred3_InternalProtobuf2695); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalProtobuf

    // $ANTLR start synpred4_InternalProtobuf
    public final void synpred4_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1731:3: ( ruleScalarTypeLink )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1731:5: ruleScalarTypeLink
        {
        pushFollow(FOLLOW_ruleScalarTypeLink_in_synpred4_InternalProtobuf4029);
        ruleScalarTypeLink();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalProtobuf

    // $ANTLR start synpred5_InternalProtobuf
    public final void synpred5_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1915:3: ( 'packed' )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1915:5: 'packed'
        {
        match(input,32,FOLLOW_32_in_synpred5_InternalProtobuf4489); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalProtobuf

    // $ANTLR start synpred6_InternalProtobuf
    public final void synpred6_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1926:7: ( 'default' )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:1926:9: 'default'
        {
        match(input,33,FOLLOW_33_in_synpred6_InternalProtobuf4525); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalProtobuf

    // $ANTLR start synpred9_InternalProtobuf
    public final void synpred9_InternalProtobuf_fragment() throws RecognitionException {   
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2455:3: ( 'rpc' )
        // ../protolipse/src-gen/protolipse/parser/antlr/internal/InternalProtobuf.g:2455:5: 'rpc'
        {
        match(input,36,FOLLOW_36_in_synpred9_InternalProtobuf5779); if (state.failed) return ;

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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA8_eotS =
        "\61\uffff";
    static final String DFA8_eofS =
        "\61\uffff";
    static final String DFA8_minS =
        "\1\24\1\5\1\16\44\uffff\1\4\1\uffff\6\17\1\0\1\uffff";
    static final String DFA8_maxS =
        "\1\24\1\74\1\51\44\uffff\1\76\1\uffff\6\17\1\0\1\uffff";
    static final String DFA8_acceptS =
        "\3\uffff\44\1\1\uffff\1\1\7\uffff\1\2";
    static final String DFA8_specialS =
        "\1\uffff\1\0\1\2\54\uffff\1\1\1\uffff}>";
    static final String[] DFA8_transitionS = {
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
            return "397:1: ( ( ( ruleNativeOption )=>this_NativeOption_0= ruleNativeOption ) | this_CustomOption_1= ruleCustomOption )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_1==RULE_ID) ) {s = 2;}

                        else if ( (LA8_1==27) && (synpred2_InternalProtobuf())) {s = 3;}

                        else if ( (LA8_1==16) && (synpred2_InternalProtobuf())) {s = 4;}

                        else if ( (LA8_1==13) && (synpred2_InternalProtobuf())) {s = 5;}

                        else if ( (LA8_1==17) && (synpred2_InternalProtobuf())) {s = 6;}

                        else if ( (LA8_1==20) && (synpred2_InternalProtobuf())) {s = 7;}

                        else if ( (LA8_1==21) && (synpred2_InternalProtobuf())) {s = 8;}

                        else if ( (LA8_1==35) && (synpred2_InternalProtobuf())) {s = 9;}

                        else if ( (LA8_1==34) && (synpred2_InternalProtobuf())) {s = 10;}

                        else if ( (LA8_1==42) && (synpred2_InternalProtobuf())) {s = 11;}

                        else if ( (LA8_1==43) && (synpred2_InternalProtobuf())) {s = 12;}

                        else if ( (LA8_1==44) && (synpred2_InternalProtobuf())) {s = 13;}

                        else if ( (LA8_1==25) && (synpred2_InternalProtobuf())) {s = 14;}

                        else if ( (LA8_1==40) && (synpred2_InternalProtobuf())) {s = 15;}

                        else if ( (LA8_1==29) && (synpred2_InternalProtobuf())) {s = 16;}

                        else if ( (LA8_1==36) && (synpred2_InternalProtobuf())) {s = 17;}

                        else if ( (LA8_1==39) && (synpred2_InternalProtobuf())) {s = 18;}

                        else if ( (LA8_1==45) && (synpred2_InternalProtobuf())) {s = 19;}

                        else if ( (LA8_1==46) && (synpred2_InternalProtobuf())) {s = 20;}

                        else if ( (LA8_1==47) && (synpred2_InternalProtobuf())) {s = 21;}

                        else if ( (LA8_1==48) && (synpred2_InternalProtobuf())) {s = 22;}

                        else if ( (LA8_1==49) && (synpred2_InternalProtobuf())) {s = 23;}

                        else if ( (LA8_1==50) && (synpred2_InternalProtobuf())) {s = 24;}

                        else if ( (LA8_1==51) && (synpred2_InternalProtobuf())) {s = 25;}

                        else if ( (LA8_1==52) && (synpred2_InternalProtobuf())) {s = 26;}

                        else if ( (LA8_1==53) && (synpred2_InternalProtobuf())) {s = 27;}

                        else if ( (LA8_1==54) && (synpred2_InternalProtobuf())) {s = 28;}

                        else if ( (LA8_1==55) && (synpred2_InternalProtobuf())) {s = 29;}

                        else if ( (LA8_1==56) && (synpred2_InternalProtobuf())) {s = 30;}

                        else if ( (LA8_1==57) && (synpred2_InternalProtobuf())) {s = 31;}

                        else if ( (LA8_1==58) && (synpred2_InternalProtobuf())) {s = 32;}

                        else if ( (LA8_1==59) && (synpred2_InternalProtobuf())) {s = 33;}

                        else if ( (LA8_1==33) && (synpred2_InternalProtobuf())) {s = 34;}

                        else if ( (LA8_1==28) && (synpred2_InternalProtobuf())) {s = 35;}

                        else if ( (LA8_1==60) && (synpred2_InternalProtobuf())) {s = 36;}

                        else if ( (LA8_1==19) && (synpred2_InternalProtobuf())) {s = 37;}

                        else if ( (LA8_1==32) && (synpred2_InternalProtobuf())) {s = 38;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_47 = input.LA(1);

                         
                        int index8_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProtobuf()) ) {s = 40;}

                        else if ( (true) ) {s = 48;}

                         
                        input.seek(index8_47);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_2==14) ) {s = 39;}

                        else if ( (LA8_2==41) && (synpred2_InternalProtobuf())) {s = 40;}

                         
                        input.seek(index8_2);
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
    static final String DFA17_eotS =
        "\56\uffff";
    static final String DFA17_eofS =
        "\56\uffff";
    static final String DFA17_minS =
        "\1\52\4\5\1\uffff\45\16\1\6\1\17\1\uffff";
    static final String DFA17_maxS =
        "\1\54\4\74\1\uffff\45\16\1\6\1\36\1\uffff";
    static final String DFA17_acceptS =
        "\5\uffff\1\1\47\uffff\1\2";
    static final String DFA17_specialS =
        "\56\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\1\1\1\3",
            "\1\5\7\uffff\1\5\2\uffff\2\5\1\uffff\3\5\3\uffff\1\5\1\uffff\2\5\1\4\2\uffff\5\5\2\uffff\2\5\1\uffff\23\5",
            "\1\5\7\uffff\1\5\2\uffff\2\5\1\uffff\3\5\3\uffff\1\5\1\uffff\2\5\1\4\2\uffff\5\5\2\uffff\2\5\1\uffff\23\5",
            "\1\5\7\uffff\1\5\2\uffff\2\5\1\uffff\3\5\3\uffff\1\5\1\uffff\2\5\1\4\2\uffff\5\5\2\uffff\2\5\1\uffff\23\5",
            "\1\6\7\uffff\1\11\2\uffff\1\10\1\12\1\uffff\1\51\1\13\1\14\3\uffff\1\22\1\uffff\1\7\1\47\1\24\2\uffff\1\52\1\46\1\16\1\15\1\25\2\uffff\1\26\1\23\1\uffff\1\17\1\20\1\21\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\50",
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
            "\1\5\6\uffff\1\55\7\uffff\1\5",
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
            return "1317:1: (this_MessageField_0= ruleMessageField | this_Group_1= ruleGroup )";
        }
    }
    static final String DFA23_eotS =
        "\22\uffff";
    static final String DFA23_eofS =
        "\22\uffff";
    static final String DFA23_minS =
        "\1\5\17\0\2\uffff";
    static final String DFA23_maxS =
        "\1\74\17\0\2\uffff";
    static final String DFA23_acceptS =
        "\20\uffff\1\2\1\1";
    static final String DFA23_specialS =
        "\1\uffff\1\6\1\11\1\0\1\13\1\2\1\5\1\14\1\7\1\16\1\1\1\10\1\3\1\12\1\15\1\4\2\uffff}>";
    static final String[] DFA23_transitionS = {
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
            return "1731:1: ( ( ( ruleScalarTypeLink )=>this_ScalarTypeLink_0= ruleScalarTypeLink ) | this_ComplexTypeLink_1= ruleComplexTypeLink )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_3 = input.LA(1);

                         
                        int index23_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index23_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_10 = input.LA(1);

                         
                        int index23_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index23_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_5 = input.LA(1);

                         
                        int index23_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index23_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_12 = input.LA(1);

                         
                        int index23_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index23_12);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_15 = input.LA(1);

                         
                        int index23_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index23_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA23_6 = input.LA(1);

                         
                        int index23_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index23_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA23_8 = input.LA(1);

                         
                        int index23_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index23_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA23_11 = input.LA(1);

                         
                        int index23_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index23_11);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA23_2 = input.LA(1);

                         
                        int index23_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index23_2);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA23_13 = input.LA(1);

                         
                        int index23_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index23_13);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA23_4 = input.LA(1);

                         
                        int index23_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index23_4);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA23_7 = input.LA(1);

                         
                        int index23_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index23_7);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA23_14 = input.LA(1);

                         
                        int index23_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index23_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA23_9 = input.LA(1);

                         
                        int index23_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProtobuf()) ) {s = 17;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index23_9);
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
    static final String DFA25_eotS =
        "\24\uffff";
    static final String DFA25_eofS =
        "\24\uffff";
    static final String DFA25_minS =
        "\1\5\2\16\1\uffff\2\4\14\0\2\uffff";
    static final String DFA25_maxS =
        "\1\74\2\16\1\uffff\2\76\14\0\2\uffff";
    static final String DFA25_acceptS =
        "\3\uffff\1\3\16\uffff\1\1\1\2";
    static final String DFA25_specialS =
        "\6\uffff\1\12\1\6\1\10\1\4\1\2\1\0\1\13\1\7\1\11\1\5\1\3\1\1\2\uffff}>";
    static final String[] DFA25_transitionS = {
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

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1915:1: ( ( ( 'packed' )=>this_PackedValueFieldOption_0= rulePackedValueFieldOption ) | ( ( 'default' )=>this_DefaultValueFieldOption_1= ruleDefaultValueFieldOption ) | this_NativeFieldOption_2= ruleNativeFieldOption )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_11 = input.LA(1);

                         
                        int index25_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index25_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_17 = input.LA(1);

                         
                        int index25_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index25_17);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_10 = input.LA(1);

                         
                        int index25_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index25_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA25_16 = input.LA(1);

                         
                        int index25_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index25_16);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA25_9 = input.LA(1);

                         
                        int index25_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index25_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA25_15 = input.LA(1);

                         
                        int index25_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index25_15);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA25_7 = input.LA(1);

                         
                        int index25_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index25_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA25_13 = input.LA(1);

                         
                        int index25_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index25_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA25_8 = input.LA(1);

                         
                        int index25_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index25_8);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA25_14 = input.LA(1);

                         
                        int index25_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index25_14);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA25_6 = input.LA(1);

                         
                        int index25_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalProtobuf()) ) {s = 18;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index25_6);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA25_12 = input.LA(1);

                         
                        int index25_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalProtobuf()) ) {s = 19;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index25_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleProto_in_entryRuleProto75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProto85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleProto123 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProto135 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProto152 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProto169 = new BitSet(new long[]{0x00001D0C00330002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleProto192 = new BitSet(new long[]{0x00001D0C00330002L});
    public static final BitSet FOLLOW_16_in_ruleProto206 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleProto227 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProto239 = new BitSet(new long[]{0x00001D0C00300002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProto262 = new BitSet(new long[]{0x00001D0C00300002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_ruleStatement356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_ruleStatement391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleStatement419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_ruleStatement446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicImport_in_ruleImport538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakImport_in_ruleImport565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicImport_in_entryRulePublicImport600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePublicImport610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePublicImport647 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePublicImport659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePublicImport676 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePublicImport693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakImport_in_entryRuleWeakImport729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeakImport739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleWeakImport776 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleWeakImport789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWeakImport808 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleWeakImport825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeOption_in_ruleOption924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_ruleOption952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeOption_in_entryRuleNativeOption987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeOption997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNativeOption1034 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleNativeOption1057 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNativeOption1069 = new BitSet(new long[]{0x60000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleNativeOption1090 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNativeOption1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_entryRuleCustomOption1138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomOption1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCustomOption1185 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomOption1202 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCustomOption1219 = new BitSet(new long[]{0x60000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCustomOption1240 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCustomOption1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_ruleValue1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueLink_in_entryRuleSimpleValueLink1378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValueLink1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_ruleSimpleValueLink1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_ruleSimpleValueLink1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_ruleSimpleValueLink1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomIdLink_in_ruleSimpleValueLink1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomIdLink_in_entryRuleCustomIdLink1551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomIdLink1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomIdLink1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLink_in_entryRuleStringLink1642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLink1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLink1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLink_in_entryRuleBooleanLink1733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLink1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleBooleanLink1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLink_in_entryRuleNumberLink1823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLink1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_ruleNumberLink1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_ruleNumberLink1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLink_in_entryRuleIntLink1942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLink1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleIntLink1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLink_in_entryRuleDoubleLink2033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLink2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMDOUBLE_in_ruleDoubleLink2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType2124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleComplexType2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_ruleComplexType2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensibleType_in_entryRuleExtensibleType2243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensibleType2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleExtensibleType2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleExtensibleType2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage2362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMessage2409 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage2426 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMessage2443 = new BitSet(new long[]{0x00001D0C03B00000L});
    public static final BitSet FOLLOW_ruleMessageElement_in_ruleMessage2464 = new BitSet(new long[]{0x00001D0C03B00000L});
    public static final BitSet FOLLOW_23_in_ruleMessage2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_entryRuleMessageElement2513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageElement2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleMessageElement2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_ruleMessageElement2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneof_in_ruleMessageElement2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleMessageElement2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleMessageElement2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_ruleMessageElement2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_ruleMessageElement2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_ruleMessageElement2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneof_in_entryRuleOneof2803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneof2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOneof2850 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOneof2867 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOneof2884 = new BitSet(new long[]{0x1FFFFD9F3ABB2020L});
    public static final BitSet FOLLOW_ruleOneofField_in_ruleOneof2905 = new BitSet(new long[]{0x1FFFFD9F3ABB2020L});
    public static final BitSet FOLLOW_23_in_ruleOneof2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneofField_in_entryRuleOneofField2954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneofField2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleOneofField3010 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleVar_in_ruleOneofField3031 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleOneofField3043 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleOneofField3060 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_ruleOneofField3086 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOneofField3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedElement_in_entryRuleIndexedElement3135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedElement3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_ruleIndexedElement3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleIndexedElement3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionRange_in_entryRuleExtensionRange3254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionRange3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleExtensionRange3301 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleRange_in_ruleExtensionRange3322 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_ruleExtensionRange3335 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleRange_in_ruleExtensionRange3356 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_15_in_ruleExtensionRange3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange3406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleRange3458 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleRange3476 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleRange3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRange3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_entryRuleMessageField3575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageField3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleMessageField3631 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleMessageField3652 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleVar_in_ruleMessageField3673 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMessageField3685 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleMessageField3702 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_ruleMessageField3728 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMessageField3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup3777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleGroup3833 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleGroup3845 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleVar_in_ruleGroup3866 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGroup3878 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleGroup3895 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleGroup3912 = new BitSet(new long[]{0x00001C0400A00000L});
    public static final BitSet FOLLOW_ruleMessageField_in_ruleGroup3933 = new BitSet(new long[]{0x00001C0400A00000L});
    public static final BitSet FOLLOW_23_in_ruleGroup3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_entryRuleTypeLink3982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLink3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_ruleTypeLink4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_ruleTypeLink4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLink_in_entryRuleComplexTypeLink4108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLink4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleComplexTypeLink4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_entryRuleScalarTypeLink4200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarTypeLink4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarType_in_ruleScalarTypeLink4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOptions_in_entryRuleFieldOptions4290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOptions4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFieldOptions4337 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleFieldOptions4358 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_26_in_ruleFieldOptions4371 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleFieldOptions4392 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_31_in_ruleFieldOptions4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOption_in_entryRuleFieldOption4442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOption4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackedValueFieldOption_in_ruleFieldOption4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_ruleFieldOption4543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_ruleFieldOption4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackedValueFieldOption_in_entryRulePackedValueFieldOption4606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackedValueFieldOption4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePackedValueFieldOption4661 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePackedValueFieldOption4674 = new BitSet(new long[]{0x60000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_rulePackedValueFieldOption4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueFieldOption_in_entryRuleDefaultValueFieldOption4731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValueFieldOption4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDefaultValueFieldOption4786 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDefaultValueFieldOption4799 = new BitSet(new long[]{0x60000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleDefaultValueFieldOption4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeFieldOption_in_entryRuleNativeFieldOption4856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeFieldOption4866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_ruleNativeFieldOption4912 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNativeFieldOption4924 = new BitSet(new long[]{0x60000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleNativeFieldOption4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSource_in_entryRuleOptionSource4981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionSource4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleOptionSource5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum5073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleEnum5120 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum5137 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEnum5154 = new BitSet(new long[]{0x00001D0C00B00020L});
    public static final BitSet FOLLOW_ruleEnumElement_in_ruleEnum5175 = new BitSet(new long[]{0x00001D0C00B00020L});
    public static final BitSet FOLLOW_23_in_ruleEnum5188 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEnum5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_entryRuleEnumElement5239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumElement5249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_ruleEnumElement5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomOption_in_ruleEnumElement5323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_entryRuleEnumField5358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumField5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumField5410 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumField5427 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMINT_in_ruleEnumField5444 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_30_in_ruleEnumField5462 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleEnumField5483 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_26_in_ruleEnumField5496 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleFieldOption_in_ruleEnumField5517 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_31_in_ruleEnumField5531 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEnumField5545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService5581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService5591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleService5628 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService5645 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleService5662 = new BitSet(new long[]{0x00001D1C03B00000L});
    public static final BitSet FOLLOW_ruleServiceElement_in_ruleService5683 = new BitSet(new long[]{0x00001D1C03B00000L});
    public static final BitSet FOLLOW_23_in_ruleService5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceElement_in_entryRuleServiceElement5732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceElement5742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_ruleServiceElement5797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_ruleServiceElement5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRpc_in_entryRuleRpc5860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRpc5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleRpc5915 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRpc5933 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleRpc5950 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleMessageLink_in_ruleRpc5971 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRpc5983 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleRpc5995 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleRpc6007 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleMessageLink_in_ruleRpc6028 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRpc6040 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_22_in_ruleRpc6053 = new BitSet(new long[]{0x00001D0C03B00000L});
    public static final BitSet FOLLOW_ruleOption_in_ruleRpc6074 = new BitSet(new long[]{0x00001D0C03B00000L});
    public static final BitSet FOLLOW_23_in_ruleRpc6087 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRpc6101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageLink_in_entryRuleMessageLink6137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageLink6147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleMessageLink6194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_entryRuleExtend6229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtend6239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleExtend6284 = new BitSet(new long[]{0x1FFFFD9F3A3B2020L});
    public static final BitSet FOLLOW_ruleVar_full_in_ruleExtend6308 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExtend6320 = new BitSet(new long[]{0x00001D0C03B00000L});
    public static final BitSet FOLLOW_ruleMessageElement_in_ruleExtend6341 = new BitSet(new long[]{0x00001D0C03B00000L});
    public static final BitSet FOLLOW_23_in_ruleExtend6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_full_in_entryRuleVar_full6391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar_full6402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_ruleVar_full6449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleVar_full6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar6528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVar6579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_ruleVar6612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULL_ID_in_entryRuleFULL_ID6658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFULL_ID6669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFULL_ID6709 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleFULL_ID6728 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFULL_ID6743 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleVarReserved_in_entryRuleVarReserved6791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarReserved6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleVarReserved6840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleVarReserved6859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleVarReserved6878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVarReserved6897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleVarReserved6916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleVarReserved6935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleVarReserved6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleVarReserved6973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleVarReserved6992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleVarReserved7011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleVarReserved7030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleVarReserved7049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleVarReserved7068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleVarReserved7087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleVarReserved7106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleVarReserved7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVarReserved7144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVarReserved7163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVarReserved7182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleVarReserved7201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleVarReserved7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleVarReserved7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleVarReserved7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleVarReserved7277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleVarReserved7296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleVarReserved7315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleVarReserved7334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleVarReserved7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleVarReserved7372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleVarReserved7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleVarReserved7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleVarReserved7429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleVarReserved7448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleVarReserved7467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleVarReserved7486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleVarReserved7505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBOOL7561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBOOL7578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleModifier7623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleModifier7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleModifier7657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleScalarType7702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleScalarType7719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleScalarType7736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleScalarType7753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleScalarType7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleScalarType7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleScalarType7804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleScalarType7821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleScalarType7838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleScalarType7855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleScalarType7872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleScalarType7889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleScalarType7906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleScalarType7923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleScalarType7940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred1_InternalProtobuf373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeOption_in_synpred2_InternalProtobuf908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred3_InternalProtobuf2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarTypeLink_in_synpred4_InternalProtobuf4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred5_InternalProtobuf4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred6_InternalProtobuf4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred9_InternalProtobuf5779 = new BitSet(new long[]{0x0000000000000002L});

}