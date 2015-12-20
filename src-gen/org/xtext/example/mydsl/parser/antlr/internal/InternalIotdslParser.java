package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.IotdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalIotdslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'device'", "'extends'", "'events'", "'end'", "'name'", "'='", "'event'", "'state'", "'transition'", "'=>'", "'||'", "'&&'", "'if'", "'('", "')'", "'else'", "'{'", "'}'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'!'", "'true'", "'false'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalIotdslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIotdslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIotdslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g"; }



     	private IotdslGrammarAccess grammarAccess;
     	
        public InternalIotdslParser(TokenStream input, IotdslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Iot";	
       	}
       	
       	@Override
       	protected IotdslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleIot"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:67:1: entryRuleIot returns [EObject current=null] : iv_ruleIot= ruleIot EOF ;
    public final EObject entryRuleIot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIot = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:68:2: (iv_ruleIot= ruleIot EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:69:2: iv_ruleIot= ruleIot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIotRule()); 
            }
            pushFollow(FOLLOW_ruleIot_in_entryRuleIot75);
            iv_ruleIot=ruleIot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIot85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIot"


    // $ANTLR start "ruleIot"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:76:1: ruleIot returns [EObject current=null] : ( (lv_devices_0_0= ruleDevice ) )* ;
    public final EObject ruleIot() throws RecognitionException {
        EObject current = null;

        EObject lv_devices_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:79:28: ( ( (lv_devices_0_0= ruleDevice ) )* )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:80:1: ( (lv_devices_0_0= ruleDevice ) )*
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:80:1: ( (lv_devices_0_0= ruleDevice ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:81:1: (lv_devices_0_0= ruleDevice )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:81:1: (lv_devices_0_0= ruleDevice )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:82:3: lv_devices_0_0= ruleDevice
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIotAccess().getDevicesDeviceParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDevice_in_ruleIot130);
            	    lv_devices_0_0=ruleDevice();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIotRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"devices",
            	              		lv_devices_0_0, 
            	              		"Device");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleIot"


    // $ANTLR start "entryRuleDevice"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:106:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:107:2: (iv_ruleDevice= ruleDevice EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:108:2: iv_ruleDevice= ruleDevice EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeviceRule()); 
            }
            pushFollow(FOLLOW_ruleDevice_in_entryRuleDevice166);
            iv_ruleDevice=ruleDevice();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDevice; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDevice176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:115:1: ruleDevice returns [EObject current=null] : (otherlv_0= 'device' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_attributes_4_0= ruleAttribute ) ) ( (lv_states_5_0= ruleState ) )* (otherlv_6= 'events' ( (lv_events_7_0= ruleEvent ) )+ otherlv_8= 'end' )? ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= 'end' ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_attributes_4_0 = null;

        EObject lv_states_5_0 = null;

        EObject lv_events_7_0 = null;

        EObject lv_transitions_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:118:28: ( (otherlv_0= 'device' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_attributes_4_0= ruleAttribute ) ) ( (lv_states_5_0= ruleState ) )* (otherlv_6= 'events' ( (lv_events_7_0= ruleEvent ) )+ otherlv_8= 'end' )? ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= 'end' ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:119:1: (otherlv_0= 'device' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_attributes_4_0= ruleAttribute ) ) ( (lv_states_5_0= ruleState ) )* (otherlv_6= 'events' ( (lv_events_7_0= ruleEvent ) )+ otherlv_8= 'end' )? ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= 'end' )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:119:1: (otherlv_0= 'device' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_attributes_4_0= ruleAttribute ) ) ( (lv_states_5_0= ruleState ) )* (otherlv_6= 'events' ( (lv_events_7_0= ruleEvent ) )+ otherlv_8= 'end' )? ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= 'end' )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:119:3: otherlv_0= 'device' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_attributes_4_0= ruleAttribute ) ) ( (lv_states_5_0= ruleState ) )* (otherlv_6= 'events' ( (lv_events_7_0= ruleEvent ) )+ otherlv_8= 'end' )? ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDevice213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDeviceKeyword_0());
                  
            }
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDevice230); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDeviceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:141:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:141:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDevice248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:145:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:146:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:146:1: (otherlv_3= RULE_ID )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:147:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeviceRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDevice268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getDeviceAccess().getSuperTypeDeviceCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:158:4: ( (lv_attributes_4_0= ruleAttribute ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:159:1: (lv_attributes_4_0= ruleAttribute )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:159:1: (lv_attributes_4_0= ruleAttribute )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:160:3: lv_attributes_4_0= ruleAttribute
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeviceAccess().getAttributesAttributeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAttribute_in_ruleDevice291);
            lv_attributes_4_0=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeviceRule());
              	        }
                     		set(
                     			current, 
                     			"attributes",
                      		lv_attributes_4_0, 
                      		"Attribute");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:176:2: ( (lv_states_5_0= ruleState ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:177:1: (lv_states_5_0= ruleState )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:177:1: (lv_states_5_0= ruleState )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:178:3: lv_states_5_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeviceAccess().getStatesStateParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleState_in_ruleDevice312);
            	    lv_states_5_0=ruleState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDeviceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"states",
            	              		lv_states_5_0, 
            	              		"State");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:194:3: (otherlv_6= 'events' ( (lv_events_7_0= ruleEvent ) )+ otherlv_8= 'end' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:194:5: otherlv_6= 'events' ( (lv_events_7_0= ruleEvent ) )+ otherlv_8= 'end'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleDevice326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getDeviceAccess().getEventsKeyword_5_0());
                          
                    }
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:198:1: ( (lv_events_7_0= ruleEvent ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:199:1: (lv_events_7_0= ruleEvent )
                    	    {
                    	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:199:1: (lv_events_7_0= ruleEvent )
                    	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:200:3: lv_events_7_0= ruleEvent
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDeviceAccess().getEventsEventParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEvent_in_ruleDevice347);
                    	    lv_events_7_0=ruleEvent();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDeviceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"events",
                    	              		lv_events_7_0, 
                    	              		"Event");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleDevice360); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getDeviceAccess().getEndKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:220:3: ( (lv_transitions_9_0= ruleTransition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:221:1: (lv_transitions_9_0= ruleTransition )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:221:1: (lv_transitions_9_0= ruleTransition )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:222:3: lv_transitions_9_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeviceAccess().getTransitionsTransitionParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleDevice383);
            	    lv_transitions_9_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDeviceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"transitions",
            	              		lv_transitions_9_0, 
            	              		"Transition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleDevice396); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getDeviceAccess().getEndKeyword_7());
                  
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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleAttribute"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:250:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:251:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:252:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute432);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute442); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:259:1: ruleAttribute returns [EObject current=null] : ( ( (lv_typeName_0_0= 'name' ) ) ( (lv_tag_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_0=null;
        Token lv_tag_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:262:28: ( ( ( (lv_typeName_0_0= 'name' ) ) ( (lv_tag_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )? ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:263:1: ( ( (lv_typeName_0_0= 'name' ) ) ( (lv_tag_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )? )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:263:1: ( ( (lv_typeName_0_0= 'name' ) ) ( (lv_tag_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )? )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:263:2: ( (lv_typeName_0_0= 'name' ) ) ( (lv_tag_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )?
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:263:2: ( (lv_typeName_0_0= 'name' ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:264:1: (lv_typeName_0_0= 'name' )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:264:1: (lv_typeName_0_0= 'name' )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:265:3: lv_typeName_0_0= 'name'
            {
            lv_typeName_0_0=(Token)match(input,15,FOLLOW_15_in_ruleAttribute485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_typeName_0_0, grammarAccess.getAttributeAccess().getTypeNameNameKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeRule());
              	        }
                     		setWithLastConsumed(current, "typeName", lv_typeName_0_0, "name");
              	    
            }

            }


            }

            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:278:2: ( (lv_tag_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:279:1: (lv_tag_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:279:1: (lv_tag_1_0= RULE_ID )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:280:3: lv_tag_1_0= RULE_ID
            {
            lv_tag_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_tag_1_0, grammarAccess.getAttributeAccess().getTagIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"tag",
                      		lv_tag_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:296:2: (otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:296:4: otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleAttribute533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:300:1: ( (lv_value_3_0= RULE_STRING ) )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:301:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:301:1: (lv_value_3_0= RULE_STRING )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:302:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute550); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_3_0, grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"STRING");
                      	    
                    }

                    }


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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEvent"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:326:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:327:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:328:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent593);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent603); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:335:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:338:28: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:339:1: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:339:1: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:339:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEvent640); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
                  
            }
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:343:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:344:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:344:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:345:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEventRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleState"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:369:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:370:2: (iv_ruleState= ruleState EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:371:2: iv_ruleState= ruleState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRule()); 
            }
            pushFollow(FOLLOW_ruleState_in_entryRuleState698);
            iv_ruleState=ruleState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleState708); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:378:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAction ) )* otherlv_3= 'end' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:381:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAction ) )* otherlv_3= 'end' ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:382:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAction ) )* otherlv_3= 'end' )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:382:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAction ) )* otherlv_3= 'end' )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:382:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAction ) )* otherlv_3= 'end'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleState745); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                  
            }
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:386:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:387:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:387:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:388:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState762); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStateRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:404:2: ( (lv_elements_2_0= ruleAction ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)||(LA8_0>=23 && LA8_0<=24)||(LA8_0>=39 && LA8_0<=41)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:405:1: (lv_elements_2_0= ruleAction )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:405:1: (lv_elements_2_0= ruleAction )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:406:3: lv_elements_2_0= ruleAction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getElementsActionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAction_in_ruleState788);
            	    lv_elements_2_0=ruleAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_2_0, 
            	              		"Action");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleState801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getEndKeyword_3());
                  
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:434:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:435:2: (iv_ruleTransition= ruleTransition EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:436:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition837);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition847); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:443:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '=>' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'end' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:446:28: ( (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '=>' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'end' ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:447:1: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '=>' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'end' )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:447:1: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '=>' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'end' )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:447:3: otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '=>' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'end'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTransition884); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
                  
            }
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:451:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:452:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:452:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:453:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition901); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:469:2: ( (otherlv_2= RULE_ID ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:470:1: (otherlv_2= RULE_ID )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:470:1: (otherlv_2= RULE_ID )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:471:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getEventEventCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleTransition938); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_3());
                  
            }
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:486:1: ( (otherlv_4= RULE_ID ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:487:1: (otherlv_4= RULE_ID )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:487:1: (otherlv_4= RULE_ID )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:488:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getStateStateCrossReference_4_0()); 
              	
            }

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleTransition970); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getEndKeyword_5());
                  
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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleAction"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:511:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:512:2: (iv_ruleAction= ruleAction EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:513:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1006);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1016); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:520:1: ruleAction returns [EObject current=null] : (this_Expression_0= ruleExpression | this_Variable_1= ruleVariable ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_Variable_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:523:28: ( (this_Expression_0= ruleExpression | this_Variable_1= ruleVariable ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:524:1: (this_Expression_0= ruleExpression | this_Variable_1= ruleVariable )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:524:1: (this_Expression_0= ruleExpression | this_Variable_1= ruleVariable )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_INT)||(LA9_0>=23 && LA9_0<=24)||(LA9_0>=39 && LA9_0<=41)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==EOF||(LA9_2>=RULE_ID && LA9_2<=RULE_INT)||LA9_2==14||(LA9_2>=21 && LA9_2<=26)||(LA9_2>=28 && LA9_2<=41)) ) {
                    alt9=1;
                }
                else if ( (LA9_2==16) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:525:5: this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionAccess().getExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAction1063);
                    this_Expression_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:535:5: this_Variable_1= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionAccess().getVariableParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleAction1090);
                    this_Variable_1=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_1; 
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleVariable"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:551:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:552:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:553:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1125);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1135); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:560:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:563:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:564:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:564:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:564:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:564:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:565:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:565:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:566:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable1177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleVariable1194); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:586:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:587:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:587:1: (lv_expression_2_0= ruleExpression )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:588:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleVariable1215);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:612:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:613:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:614:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1251);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1261); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:621:1: ruleExpression returns [EObject current=null] : (this_Or_0= ruleOr | this_IfStatement_1= ruleIfStatement ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;

        EObject this_IfStatement_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:624:28: ( (this_Or_0= ruleOr | this_IfStatement_1= ruleIfStatement ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:625:1: (this_Or_0= ruleOr | this_IfStatement_1= ruleIfStatement )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:625:1: (this_Or_0= ruleOr | this_IfStatement_1= ruleIfStatement )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||LA10_0==24||(LA10_0>=39 && LA10_0<=41)) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
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
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:626:5: this_Or_0= ruleOr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOr_in_ruleExpression1308);
                    this_Or_0=ruleOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Or_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:636:5: this_IfStatement_1= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getIfStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfStatement_in_ruleExpression1335);
                    this_IfStatement_1=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfStatement_1; 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:652:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:653:2: (iv_ruleOr= ruleOr EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:654:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr1370);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr1380); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:661:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:664:28: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:665:1: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:665:1: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:666:5: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAnd_in_ruleOr1427);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_And_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:674:1: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:674:2: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:674:2: ()
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:675:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleOr1448); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:684:1: ( (lv_right_3_0= ruleAnd ) )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:685:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:685:1: (lv_right_3_0= ruleAnd )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:686:3: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr1469);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"And");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:710:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:711:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:712:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd1507);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd1517); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:719:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:722:28: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:723:1: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:723:1: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:724:5: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEquality_in_ruleAnd1564);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Equality_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:732:1: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:732:2: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:732:2: ()
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:733:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAnd1585); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:742:1: ( (lv_right_3_0= ruleEquality ) )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:743:1: (lv_right_3_0= ruleEquality )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:743:1: (lv_right_3_0= ruleEquality )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:744:3: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEquality_in_ruleAnd1606);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Equality");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleIfStatement"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:768:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:769:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:770:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement1644);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement1654); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:777:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_thenBlock_4_0 = null;

        EObject lv_elseBlock_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:780:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:781:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:781:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:781:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleIfStatement1691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleIfStatement1703); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:789:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:790:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:790:1: (lv_expression_2_0= ruleExpression )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:791:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfStatement1724);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleIfStatement1736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:811:1: ( (lv_thenBlock_4_0= ruleIfBlock ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:812:1: (lv_thenBlock_4_0= ruleIfBlock )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:812:1: (lv_thenBlock_4_0= ruleIfBlock )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:813:3: lv_thenBlock_4_0= ruleIfBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getThenBlockIfBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIfBlock_in_ruleIfStatement1757);
            lv_thenBlock_4_0=ruleIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"thenBlock",
                      		lv_thenBlock_4_0, 
                      		"IfBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:829:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred1_InternalIotdsl()) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:829:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:829:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:829:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleIfStatement1778); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:834:2: ( (lv_elseBlock_6_0= ruleIfBlock ) )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:835:1: (lv_elseBlock_6_0= ruleIfBlock )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:835:1: (lv_elseBlock_6_0= ruleIfBlock )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:836:3: lv_elseBlock_6_0= ruleIfBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockIfBlockParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfBlock_in_ruleIfStatement1800);
                    lv_elseBlock_6_0=ruleIfBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"elseBlock",
                              		lv_elseBlock_6_0, 
                              		"IfBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleIfBlock"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:860:1: entryRuleIfBlock returns [EObject current=null] : iv_ruleIfBlock= ruleIfBlock EOF ;
    public final EObject entryRuleIfBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfBlock = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:861:2: (iv_ruleIfBlock= ruleIfBlock EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:862:2: iv_ruleIfBlock= ruleIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfBlockRule()); 
            }
            pushFollow(FOLLOW_ruleIfBlock_in_entryRuleIfBlock1838);
            iv_ruleIfBlock=ruleIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfBlock1848); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfBlock"


    // $ANTLR start "ruleIfBlock"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:869:1: ruleIfBlock returns [EObject current=null] : ( ( (lv_statements_0_0= ruleAction ) ) | (otherlv_1= '{' ( (lv_statements_2_0= ruleAction ) )+ otherlv_3= '}' ) ) ;
    public final EObject ruleIfBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:872:28: ( ( ( (lv_statements_0_0= ruleAction ) ) | (otherlv_1= '{' ( (lv_statements_2_0= ruleAction ) )+ otherlv_3= '}' ) ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:873:1: ( ( (lv_statements_0_0= ruleAction ) ) | (otherlv_1= '{' ( (lv_statements_2_0= ruleAction ) )+ otherlv_3= '}' ) )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:873:1: ( ( (lv_statements_0_0= ruleAction ) ) | (otherlv_1= '{' ( (lv_statements_2_0= ruleAction ) )+ otherlv_3= '}' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_INT)||(LA15_0>=23 && LA15_0<=24)||(LA15_0>=39 && LA15_0<=41)) ) {
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
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:873:2: ( (lv_statements_0_0= ruleAction ) )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:873:2: ( (lv_statements_0_0= ruleAction ) )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:874:1: (lv_statements_0_0= ruleAction )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:874:1: (lv_statements_0_0= ruleAction )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:875:3: lv_statements_0_0= ruleAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfBlockAccess().getStatementsActionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAction_in_ruleIfBlock1894);
                    lv_statements_0_0=ruleAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfBlockRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_0_0, 
                              		"Action");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:892:6: (otherlv_1= '{' ( (lv_statements_2_0= ruleAction ) )+ otherlv_3= '}' )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:892:6: (otherlv_1= '{' ( (lv_statements_2_0= ruleAction ) )+ otherlv_3= '}' )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:892:8: otherlv_1= '{' ( (lv_statements_2_0= ruleAction ) )+ otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleIfBlock1913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getIfBlockAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:896:1: ( (lv_statements_2_0= ruleAction ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||(LA14_0>=23 && LA14_0<=24)||(LA14_0>=39 && LA14_0<=41)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:897:1: (lv_statements_2_0= ruleAction )
                    	    {
                    	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:897:1: (lv_statements_2_0= ruleAction )
                    	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:898:3: lv_statements_2_0= ruleAction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfBlockAccess().getStatementsActionParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleIfBlock1934);
                    	    lv_statements_2_0=ruleAction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getIfBlockRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_2_0, 
                    	              		"Action");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleIfBlock1947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIfBlockAccess().getRightCurlyBracketKeyword_1_2());
                          
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
    // $ANTLR end "ruleIfBlock"


    // $ANTLR start "entryRuleEquality"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:926:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:927:2: (iv_ruleEquality= ruleEquality EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:928:2: iv_ruleEquality= ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality1984);
            iv_ruleEquality=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquality; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality1994); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:935:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:938:28: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:939:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:939:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:940:5: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleEquality2041);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:948:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=29 && LA17_0<=30)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:948:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:948:2: ()
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:949:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:954:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:955:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:955:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:956:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:956:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==29) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==30) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:957:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,29,FOLLOW_29_in_ruleEquality2070); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getEqualityRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:969:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,30,FOLLOW_30_in_ruleEquality2099); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getEqualityRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:984:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:985:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:985:1: (lv_right_3_0= ruleComparison )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:986:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparison_in_ruleEquality2136);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Comparison");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1010:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1011:2: (iv_ruleComparison= ruleComparison EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1012:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison2174);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison2184); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1019:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1022:28: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1023:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1023:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1024:5: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison2231);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PlusOrMinus_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1032:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=31 && LA19_0<=34)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1032:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1032:2: ()
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1033:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1038:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1039:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1039:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1040:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1040:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt18=4;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt18=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1041:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,31,FOLLOW_31_in_ruleComparison2260); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComparisonRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1053:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,32,FOLLOW_32_in_ruleComparison2289); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComparisonRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1065:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,33,FOLLOW_33_in_ruleComparison2318); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComparisonRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1077:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,34,FOLLOW_34_in_ruleComparison2347); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComparisonRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1092:2: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1093:1: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1093:1: (lv_right_3_0= rulePlusOrMinus )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1094:3: lv_right_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison2384);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"PlusOrMinus");
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1118:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1119:2: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1120:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus2422);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOrMinus; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus2432); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1127:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1130:28: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1131:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1131:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1132:5: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2479);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MulOrDiv_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1140:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=35 && LA21_0<=36)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1140:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1140:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==35) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==36) ) {
            	        alt20=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1140:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1140:3: ( () otherlv_2= '+' )
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1140:4: () otherlv_2= '+'
            	            {
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1140:4: ()
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1141:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,35,FOLLOW_35_in_rulePlusOrMinus2502); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1151:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1151:6: ( () otherlv_4= '-' )
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1151:7: () otherlv_4= '-'
            	            {
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1151:7: ()
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1152:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,36,FOLLOW_36_in_rulePlusOrMinus2531); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1161:3: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1162:1: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1162:1: (lv_right_5_0= ruleMulOrDiv )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1163:3: lv_right_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2554);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_5_0, 
            	              		"MulOrDiv");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1187:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1188:2: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1189:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv2592);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOrDiv; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv2602); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1196:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1199:28: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1200:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1200:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1201:5: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv2649);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Primary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1209:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=37 && LA23_0<=38)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1209:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1209:2: ()
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1210:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1215:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1216:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1216:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1217:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1217:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==37) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==38) ) {
            	        alt22=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1218:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,37,FOLLOW_37_in_ruleMulOrDiv2678); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1230:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,38,FOLLOW_38_in_ruleMulOrDiv2707); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1245:2: ( (lv_right_3_0= rulePrimary ) )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1246:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1246:1: (lv_right_3_0= rulePrimary )
            	    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1247:3: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv2744);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Primary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1271:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1272:2: (iv_rulePrimary= rulePrimary EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1273:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary2782);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary2792); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1280:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atomic_6 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1283:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1284:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1284:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt24=1;
                }
                break;
            case 39:
                {
                alt24=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 40:
            case 41:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1284:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1284:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1284:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_rulePrimary2830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimary2852);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_rulePrimary2863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1302:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1302:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1302:7: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1302:7: ()
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1303:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_rulePrimary2892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1312:1: ( (lv_expression_5_0= rulePrimary ) )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1313:1: (lv_expression_5_0= rulePrimary )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1313:1: (lv_expression_5_0= rulePrimary )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1314:3: lv_expression_5_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimary_in_rulePrimary2913);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_5_0, 
                              		"Primary");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1332:5: this_Atomic_6= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimary2942);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Atomic_6; 
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1348:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1349:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1350:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic2977);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic2987); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1357:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1360:28: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) )
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1361:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            {
            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1361:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt26=1;
                }
                break;
            case RULE_STRING:
                {
                alt26=2;
                }
                break;
            case 40:
            case 41:
                {
                alt26=3;
                }
                break;
            case RULE_ID:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1361:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1361:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1361:3: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1361:3: ()
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1362:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1367:2: ( (lv_value_1_0= RULE_INT ) )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1368:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1368:1: (lv_value_1_0= RULE_INT )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1369:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomic3039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1386:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1386:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1386:7: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1386:7: ()
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1387:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1392:2: ( (lv_value_3_0= RULE_STRING ) )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1393:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1393:1: (lv_value_3_0= RULE_STRING )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1394:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic3078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1411:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1411:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1411:7: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1411:7: ()
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1412:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1417:2: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1418:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1418:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1419:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1419:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==40) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==41) ) {
                        alt25=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1420:3: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,40,FOLLOW_40_in_ruleAtomic3120); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAtomicRule());
                              	        }
                                     		setWithLastConsumed(current, "value", lv_value_5_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1432:8: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,41,FOLLOW_41_in_ruleAtomic3149); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAtomicRule());
                              	        }
                                     		setWithLastConsumed(current, "value", lv_value_5_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1448:6: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1448:6: ( () ( (otherlv_7= RULE_ID ) ) )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1448:7: () ( (otherlv_7= RULE_ID ) )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1448:7: ()
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1449:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getVariableRefAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1454:2: ( (otherlv_7= RULE_ID ) )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1455:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1455:1: (otherlv_7= RULE_ID )
                    // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:1456:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic3202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getVariableVariableCrossReference_3_1_0()); 
                      	
                    }

                    }


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
    // $ANTLR end "ruleAtomic"

    // $ANTLR start synpred1_InternalIotdsl
    public final void synpred1_InternalIotdsl_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:829:4: ( 'else' )
        // ../org.eclipse.xtext.example.iotdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalIotdsl.g:829:6: 'else'
        {
        match(input,26,FOLLOW_26_in_synpred1_InternalIotdsl1770); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalIotdsl

    // Delegated rules

    public final boolean synpred1_InternalIotdsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalIotdsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleIot_in_entryRuleIot75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIot85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevice_in_ruleIot130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleDevice_in_entryRuleDevice166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDevice176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDevice213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDevice230 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleDevice248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDevice268 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleDevice291 = new BitSet(new long[]{0x00000000000C6000L});
    public static final BitSet FOLLOW_ruleState_in_ruleDevice312 = new BitSet(new long[]{0x00000000000C6000L});
    public static final BitSet FOLLOW_13_in_ruleDevice326 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleDevice347 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleDevice360 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleDevice383 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_14_in_ruleDevice396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleAttribute485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute515 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAttribute533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEvent640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleState745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState762 = new BitSet(new long[]{0x0000038001804070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState788 = new BitSet(new long[]{0x0000038001804070L});
    public static final BitSet FOLLOW_14_in_ruleState801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTransition884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition901 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition926 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTransition938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition958 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTransition970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAction1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAction1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable1177 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVariable1194 = new BitSet(new long[]{0x0000038001800070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariable1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_ruleExpression1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr1370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr1427 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleOr1448 = new BitSet(new long[]{0x0000038001000070L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr1469 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd1564 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAnd1585 = new BitSet(new long[]{0x0000038001000070L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd1606 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement1644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleIfStatement1691 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIfStatement1703 = new BitSet(new long[]{0x0000038001800070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement1724 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleIfStatement1736 = new BitSet(new long[]{0x0000038009800070L});
    public static final BitSet FOLLOW_ruleIfBlock_in_ruleIfStatement1757 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleIfStatement1778 = new BitSet(new long[]{0x0000038009800070L});
    public static final BitSet FOLLOW_ruleIfBlock_in_ruleIfStatement1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfBlock_in_entryRuleIfBlock1838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfBlock1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleIfBlock1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleIfBlock1913 = new BitSet(new long[]{0x0000038001800070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleIfBlock1934 = new BitSet(new long[]{0x0000038011800070L});
    public static final BitSet FOLLOW_28_in_ruleIfBlock1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality1984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality2041 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_29_in_ruleEquality2070 = new BitSet(new long[]{0x0000038001000070L});
    public static final BitSet FOLLOW_30_in_ruleEquality2099 = new BitSet(new long[]{0x0000038001000070L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality2136 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison2174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison2231 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_31_in_ruleComparison2260 = new BitSet(new long[]{0x0000038001000070L});
    public static final BitSet FOLLOW_32_in_ruleComparison2289 = new BitSet(new long[]{0x0000038001000070L});
    public static final BitSet FOLLOW_33_in_ruleComparison2318 = new BitSet(new long[]{0x0000038001000070L});
    public static final BitSet FOLLOW_34_in_ruleComparison2347 = new BitSet(new long[]{0x0000038001000070L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison2384 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus2422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2479 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_35_in_rulePlusOrMinus2502 = new BitSet(new long[]{0x0000038001000070L});
    public static final BitSet FOLLOW_36_in_rulePlusOrMinus2531 = new BitSet(new long[]{0x0000038001000070L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2554 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv2592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv2649 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_37_in_ruleMulOrDiv2678 = new BitSet(new long[]{0x0000038001000070L});
    public static final BitSet FOLLOW_38_in_ruleMulOrDiv2707 = new BitSet(new long[]{0x0000038001000070L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv2744 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary2782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePrimary2830 = new BitSet(new long[]{0x0000038001800070L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimary2852 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePrimary2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePrimary2892 = new BitSet(new long[]{0x0000038001000070L});
    public static final BitSet FOLLOW_rulePrimary_in_rulePrimary2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimary2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic2977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomic3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAtomic3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAtomic3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred1_InternalIotdsl1770 = new BitSet(new long[]{0x0000000000000002L});

}