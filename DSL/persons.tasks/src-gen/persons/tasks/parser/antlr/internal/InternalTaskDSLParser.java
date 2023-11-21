package persons.tasks.parser.antlr.internal;

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
import persons.tasks.services.TaskDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTaskDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOL_LITERAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Planning'", "'anonymous'", "'Person:'", "'Task:'", "'persons:'", "'priority:'", "'duration:'", "'defineProjects:'", "'useProjects:'", "'extends'", "'Lunch'", "'Meeting'", "'Report'", "'If'", "'Pay'", "'euro'", "'+'", "'-'", "'*'", "'/'", "'max'", "'min'", "'mod'", "'^'", "'('", "')'", "'NOT'", "'hour'", "'day'", "'week'", "'balance'", "'AND'", "'OR'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_BOOL_LITERAL=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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


        public InternalTaskDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTaskDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTaskDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTaskDSL.g"; }



     	private TaskDSLGrammarAccess grammarAccess;

        public InternalTaskDSLParser(TokenStream input, TaskDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Planning";
       	}

       	@Override
       	protected TaskDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePlanning"
    // InternalTaskDSL.g:65:1: entryRulePlanning returns [EObject current=null] : iv_rulePlanning= rulePlanning EOF ;
    public final EObject entryRulePlanning() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlanning = null;


        try {
            // InternalTaskDSL.g:65:49: (iv_rulePlanning= rulePlanning EOF )
            // InternalTaskDSL.g:66:2: iv_rulePlanning= rulePlanning EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlanningRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlanning=rulePlanning();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlanning; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlanning"


    // $ANTLR start "rulePlanning"
    // InternalTaskDSL.g:72:1: rulePlanning returns [EObject current=null] : (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( (lv_anonymous_2_0= 'anonymous' ) )? ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) )* ) ;
    public final EObject rulePlanning() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_anonymous_2_0=null;
        EObject lv_persons_3_0 = null;

        EObject lv_tasks_4_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:78:2: ( (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( (lv_anonymous_2_0= 'anonymous' ) )? ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) )* ) )
            // InternalTaskDSL.g:79:2: (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( (lv_anonymous_2_0= 'anonymous' ) )? ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) )* )
            {
            // InternalTaskDSL.g:79:2: (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( (lv_anonymous_2_0= 'anonymous' ) )? ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) )* )
            // InternalTaskDSL.g:80:3: otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( (lv_anonymous_2_0= 'anonymous' ) )? ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPlanningAccess().getPlanningKeyword_0());
              		
            }
            // InternalTaskDSL.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDSL.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDSL.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPlanningAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPlanningRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalTaskDSL.g:102:3: ( (lv_anonymous_2_0= 'anonymous' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTaskDSL.g:103:4: (lv_anonymous_2_0= 'anonymous' )
                    {
                    // InternalTaskDSL.g:103:4: (lv_anonymous_2_0= 'anonymous' )
                    // InternalTaskDSL.g:104:5: lv_anonymous_2_0= 'anonymous'
                    {
                    lv_anonymous_2_0=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_anonymous_2_0, grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPlanningRule());
                      					}
                      					setWithLastConsumed(current, "anonymous", lv_anonymous_2_0 != null, "anonymous");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTaskDSL.g:116:3: ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }
                else if ( (LA2_0==15) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTaskDSL.g:117:4: ( (lv_persons_3_0= rulePerson ) )
            	    {
            	    // InternalTaskDSL.g:117:4: ( (lv_persons_3_0= rulePerson ) )
            	    // InternalTaskDSL.g:118:5: (lv_persons_3_0= rulePerson )
            	    {
            	    // InternalTaskDSL.g:118:5: (lv_persons_3_0= rulePerson )
            	    // InternalTaskDSL.g:119:6: lv_persons_3_0= rulePerson
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_persons_3_0=rulePerson();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlanningRule());
            	      						}
            	      						add(
            	      							current,
            	      							"persons",
            	      							lv_persons_3_0,
            	      							"persons.tasks.TaskDSL.Person");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTaskDSL.g:137:4: ( (lv_tasks_4_0= ruleTask ) )
            	    {
            	    // InternalTaskDSL.g:137:4: ( (lv_tasks_4_0= ruleTask ) )
            	    // InternalTaskDSL.g:138:5: (lv_tasks_4_0= ruleTask )
            	    {
            	    // InternalTaskDSL.g:138:5: (lv_tasks_4_0= ruleTask )
            	    // InternalTaskDSL.g:139:6: lv_tasks_4_0= ruleTask
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_tasks_4_0=ruleTask();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlanningRule());
            	      						}
            	      						add(
            	      							current,
            	      							"tasks",
            	      							lv_tasks_4_0,
            	      							"persons.tasks.TaskDSL.Task");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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
    // $ANTLR end "rulePlanning"


    // $ANTLR start "entryRulePerson"
    // InternalTaskDSL.g:161:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalTaskDSL.g:161:47: (iv_rulePerson= rulePerson EOF )
            // InternalTaskDSL.g:162:2: iv_rulePerson= rulePerson EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPersonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePerson; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalTaskDSL.g:168:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:174:2: ( (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalTaskDSL.g:175:2: (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalTaskDSL.g:175:2: (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalTaskDSL.g:176:3: otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
              		
            }
            // InternalTaskDSL.g:180:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDSL.g:181:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:181:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDSL.g:182:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPersonRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleTask"
    // InternalTaskDSL.g:202:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalTaskDSL.g:202:45: (iv_ruleTask= ruleTask EOF )
            // InternalTaskDSL.g:203:2: iv_ruleTask= ruleTask EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTaskRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTask; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalTaskDSL.g:209:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_action_2_0= ruleAction ) ) otherlv_3= 'persons:' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'priority:' ( (lv_prio_6_0= RULE_INT ) ) (otherlv_7= 'duration:' ( (lv_duration_8_0= ruleDuration ) ) )? otherlv_9= 'defineProjects:' ( (lv_projects_10_0= ruleProject ) )* otherlv_11= 'useProjects:' ( (lv_use_12_0= ruleProjectUse ) )* (otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) ) )? ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_prio_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_action_2_0 = null;

        EObject lv_duration_8_0 = null;

        EObject lv_projects_10_0 = null;

        EObject lv_use_12_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:215:2: ( (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_action_2_0= ruleAction ) ) otherlv_3= 'persons:' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'priority:' ( (lv_prio_6_0= RULE_INT ) ) (otherlv_7= 'duration:' ( (lv_duration_8_0= ruleDuration ) ) )? otherlv_9= 'defineProjects:' ( (lv_projects_10_0= ruleProject ) )* otherlv_11= 'useProjects:' ( (lv_use_12_0= ruleProjectUse ) )* (otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) ) )? ) )
            // InternalTaskDSL.g:216:2: (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_action_2_0= ruleAction ) ) otherlv_3= 'persons:' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'priority:' ( (lv_prio_6_0= RULE_INT ) ) (otherlv_7= 'duration:' ( (lv_duration_8_0= ruleDuration ) ) )? otherlv_9= 'defineProjects:' ( (lv_projects_10_0= ruleProject ) )* otherlv_11= 'useProjects:' ( (lv_use_12_0= ruleProjectUse ) )* (otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) ) )? )
            {
            // InternalTaskDSL.g:216:2: (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_action_2_0= ruleAction ) ) otherlv_3= 'persons:' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'priority:' ( (lv_prio_6_0= RULE_INT ) ) (otherlv_7= 'duration:' ( (lv_duration_8_0= ruleDuration ) ) )? otherlv_9= 'defineProjects:' ( (lv_projects_10_0= ruleProject ) )* otherlv_11= 'useProjects:' ( (lv_use_12_0= ruleProjectUse ) )* (otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) ) )? )
            // InternalTaskDSL.g:217:3: otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_action_2_0= ruleAction ) ) otherlv_3= 'persons:' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'priority:' ( (lv_prio_6_0= RULE_INT ) ) (otherlv_7= 'duration:' ( (lv_duration_8_0= ruleDuration ) ) )? otherlv_9= 'defineProjects:' ( (lv_projects_10_0= ruleProject ) )* otherlv_11= 'useProjects:' ( (lv_use_12_0= ruleProjectUse ) )* (otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
              		
            }
            // InternalTaskDSL.g:221:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDSL.g:222:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:222:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDSL.g:223:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTaskRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalTaskDSL.g:239:3: ( (lv_action_2_0= ruleAction ) )
            // InternalTaskDSL.g:240:4: (lv_action_2_0= ruleAction )
            {
            // InternalTaskDSL.g:240:4: (lv_action_2_0= ruleAction )
            // InternalTaskDSL.g:241:5: lv_action_2_0= ruleAction
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTaskAccess().getActionActionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_action_2_0=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTaskRule());
              					}
              					set(
              						current,
              						"action",
              						lv_action_2_0,
              						"persons.tasks.TaskDSL.Action");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getPersonsKeyword_3());
              		
            }
            // InternalTaskDSL.g:262:3: ( (otherlv_4= RULE_ID ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTaskDSL.g:263:4: (otherlv_4= RULE_ID )
            	    {
            	    // InternalTaskDSL.g:263:4: (otherlv_4= RULE_ID )
            	    // InternalTaskDSL.g:264:5: otherlv_4= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getTaskRule());
            	      					}
            	      				
            	    }
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getPersonsPersonCrossReference_4_0());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getPriorityKeyword_5());
              		
            }
            // InternalTaskDSL.g:279:3: ( (lv_prio_6_0= RULE_INT ) )
            // InternalTaskDSL.g:280:4: (lv_prio_6_0= RULE_INT )
            {
            // InternalTaskDSL.g:280:4: (lv_prio_6_0= RULE_INT )
            // InternalTaskDSL.g:281:5: lv_prio_6_0= RULE_INT
            {
            lv_prio_6_0=(Token)match(input,RULE_INT,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_prio_6_0, grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTaskRule());
              					}
              					setWithLastConsumed(
              						current,
              						"prio",
              						lv_prio_6_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            // InternalTaskDSL.g:297:3: (otherlv_7= 'duration:' ( (lv_duration_8_0= ruleDuration ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTaskDSL.g:298:4: otherlv_7= 'duration:' ( (lv_duration_8_0= ruleDuration ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getDurationKeyword_7_0());
                      			
                    }
                    // InternalTaskDSL.g:302:4: ( (lv_duration_8_0= ruleDuration ) )
                    // InternalTaskDSL.g:303:5: (lv_duration_8_0= ruleDuration )
                    {
                    // InternalTaskDSL.g:303:5: (lv_duration_8_0= ruleDuration )
                    // InternalTaskDSL.g:304:6: lv_duration_8_0= ruleDuration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTaskAccess().getDurationDurationParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_duration_8_0=ruleDuration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTaskRule());
                      						}
                      						set(
                      							current,
                      							"duration",
                      							lv_duration_8_0,
                      							"persons.tasks.TaskDSL.Duration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getDefineProjectsKeyword_8());
              		
            }
            // InternalTaskDSL.g:326:3: ( (lv_projects_10_0= ruleProject ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTaskDSL.g:327:4: (lv_projects_10_0= ruleProject )
            	    {
            	    // InternalTaskDSL.g:327:4: (lv_projects_10_0= ruleProject )
            	    // InternalTaskDSL.g:328:5: lv_projects_10_0= ruleProject
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTaskAccess().getProjectsProjectParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_projects_10_0=ruleProject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTaskRule());
            	      					}
            	      					add(
            	      						current,
            	      						"projects",
            	      						lv_projects_10_0,
            	      						"persons.tasks.TaskDSL.Project");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_11=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getUseProjectsKeyword_10());
              		
            }
            // InternalTaskDSL.g:349:3: ( (lv_use_12_0= ruleProjectUse ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTaskDSL.g:350:4: (lv_use_12_0= ruleProjectUse )
            	    {
            	    // InternalTaskDSL.g:350:4: (lv_use_12_0= ruleProjectUse )
            	    // InternalTaskDSL.g:351:5: lv_use_12_0= ruleProjectUse
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTaskAccess().getUseProjectUseParserRuleCall_11_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_use_12_0=ruleProjectUse();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTaskRule());
            	      					}
            	      					add(
            	      						current,
            	      						"use",
            	      						lv_use_12_0,
            	      						"persons.tasks.TaskDSL.ProjectUse");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalTaskDSL.g:368:3: (otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTaskDSL.g:369:4: otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getExtendsKeyword_12_0());
                      			
                    }
                    // InternalTaskDSL.g:373:4: ( (otherlv_14= RULE_ID ) )
                    // InternalTaskDSL.g:374:5: (otherlv_14= RULE_ID )
                    {
                    // InternalTaskDSL.g:374:5: (otherlv_14= RULE_ID )
                    // InternalTaskDSL.g:375:6: otherlv_14= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTaskRule());
                      						}
                      					
                    }
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_14, grammarAccess.getTaskAccess().getExtendsTaskCrossReference_12_1_0());
                      					
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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleProject"
    // InternalTaskDSL.g:391:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalTaskDSL.g:391:48: (iv_ruleProject= ruleProject EOF )
            // InternalTaskDSL.g:392:2: iv_ruleProject= ruleProject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalTaskDSL.g:398:1: ruleProject returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:404:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTaskDSL.g:405:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTaskDSL.g:405:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTaskDSL.g:406:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTaskDSL.g:406:3: (lv_name_0_0= RULE_ID )
            // InternalTaskDSL.g:407:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getProjectRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleProjectUse"
    // InternalTaskDSL.g:426:1: entryRuleProjectUse returns [EObject current=null] : iv_ruleProjectUse= ruleProjectUse EOF ;
    public final EObject entryRuleProjectUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectUse = null;


        try {
            // InternalTaskDSL.g:426:51: (iv_ruleProjectUse= ruleProjectUse EOF )
            // InternalTaskDSL.g:427:2: iv_ruleProjectUse= ruleProjectUse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProjectUseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProjectUse=ruleProjectUse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProjectUse; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProjectUse"


    // $ANTLR start "ruleProjectUse"
    // InternalTaskDSL.g:433:1: ruleProjectUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleProjectUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:439:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalTaskDSL.g:440:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalTaskDSL.g:440:2: ( (otherlv_0= RULE_ID ) )
            // InternalTaskDSL.g:441:3: (otherlv_0= RULE_ID )
            {
            // InternalTaskDSL.g:441:3: (otherlv_0= RULE_ID )
            // InternalTaskDSL.g:442:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getProjectUseRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getProjectUseAccess().getProjectProjectCrossReference_0());
              			
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
    // $ANTLR end "ruleProjectUse"


    // $ANTLR start "entryRuleDuration"
    // InternalTaskDSL.g:456:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // InternalTaskDSL.g:456:49: (iv_ruleDuration= ruleDuration EOF )
            // InternalTaskDSL.g:457:2: iv_ruleDuration= ruleDuration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDuration=ruleDuration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDuration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // InternalTaskDSL.g:463:1: ruleDuration returns [EObject current=null] : ( ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        Token lv_dl_0_0=null;
        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:469:2: ( ( ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) )
            // InternalTaskDSL.g:470:2: ( ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            {
            // InternalTaskDSL.g:470:2: ( ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            // InternalTaskDSL.g:471:3: ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) )
            {
            // InternalTaskDSL.g:471:3: ( (lv_dl_0_0= RULE_INT ) )
            // InternalTaskDSL.g:472:4: (lv_dl_0_0= RULE_INT )
            {
            // InternalTaskDSL.g:472:4: (lv_dl_0_0= RULE_INT )
            // InternalTaskDSL.g:473:5: lv_dl_0_0= RULE_INT
            {
            lv_dl_0_0=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_dl_0_0, grammarAccess.getDurationAccess().getDlINTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDurationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"dl",
              						lv_dl_0_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            // InternalTaskDSL.g:489:3: ( (lv_unit_1_0= ruleTimeUnit ) )
            // InternalTaskDSL.g:490:4: (lv_unit_1_0= ruleTimeUnit )
            {
            // InternalTaskDSL.g:490:4: (lv_unit_1_0= ruleTimeUnit )
            // InternalTaskDSL.g:491:5: lv_unit_1_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDurationAccess().getUnitTimeUnitEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_unit_1_0=ruleTimeUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDurationRule());
              					}
              					set(
              						current,
              						"unit",
              						lv_unit_1_0,
              						"persons.tasks.TaskDSL.TimeUnit");
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
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleAction"
    // InternalTaskDSL.g:512:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalTaskDSL.g:512:47: (iv_ruleAction= ruleAction EOF )
            // InternalTaskDSL.g:513:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalTaskDSL.g:519:1: ruleAction returns [EObject current=null] : (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_LunchAction_0 = null;

        EObject this_MeetingAction_1 = null;

        EObject this_PaperAction_2 = null;

        EObject this_PaymentAction_3 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:525:2: ( (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction ) )
            // InternalTaskDSL.g:526:2: (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction )
            {
            // InternalTaskDSL.g:526:2: (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 25:
            case 26:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalTaskDSL.g:527:3: this_LunchAction_0= ruleLunchAction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LunchAction_0=ruleLunchAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LunchAction_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:536:3: this_MeetingAction_1= ruleMeetingAction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MeetingAction_1=ruleMeetingAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MeetingAction_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:545:3: this_PaperAction_2= rulePaperAction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PaperAction_2=rulePaperAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PaperAction_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:554:3: this_PaymentAction_3= rulePaymentAction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PaymentAction_3=rulePaymentAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PaymentAction_3;
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


    // $ANTLR start "entryRuleLunchAction"
    // InternalTaskDSL.g:566:1: entryRuleLunchAction returns [EObject current=null] : iv_ruleLunchAction= ruleLunchAction EOF ;
    public final EObject entryRuleLunchAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLunchAction = null;


        try {
            // InternalTaskDSL.g:566:52: (iv_ruleLunchAction= ruleLunchAction EOF )
            // InternalTaskDSL.g:567:2: iv_ruleLunchAction= ruleLunchAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLunchActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLunchAction=ruleLunchAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLunchAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLunchAction"


    // $ANTLR start "ruleLunchAction"
    // InternalTaskDSL.g:573:1: ruleLunchAction returns [EObject current=null] : (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLunchAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_location_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:579:2: ( (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) ) )
            // InternalTaskDSL.g:580:2: (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) )
            {
            // InternalTaskDSL.g:580:2: (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) )
            // InternalTaskDSL.g:581:3: otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLunchActionAccess().getLunchKeyword_0());
              		
            }
            // InternalTaskDSL.g:585:3: ( (lv_location_1_0= RULE_ID ) )
            // InternalTaskDSL.g:586:4: (lv_location_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:586:4: (lv_location_1_0= RULE_ID )
            // InternalTaskDSL.g:587:5: lv_location_1_0= RULE_ID
            {
            lv_location_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_location_1_0, grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLunchActionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"location",
              						lv_location_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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
    // $ANTLR end "ruleLunchAction"


    // $ANTLR start "entryRuleMeetingAction"
    // InternalTaskDSL.g:607:1: entryRuleMeetingAction returns [EObject current=null] : iv_ruleMeetingAction= ruleMeetingAction EOF ;
    public final EObject entryRuleMeetingAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeetingAction = null;


        try {
            // InternalTaskDSL.g:607:54: (iv_ruleMeetingAction= ruleMeetingAction EOF )
            // InternalTaskDSL.g:608:2: iv_ruleMeetingAction= ruleMeetingAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMeetingActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMeetingAction=ruleMeetingAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMeetingAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeetingAction"


    // $ANTLR start "ruleMeetingAction"
    // InternalTaskDSL.g:614:1: ruleMeetingAction returns [EObject current=null] : (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMeetingAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_topic_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:620:2: ( (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) ) )
            // InternalTaskDSL.g:621:2: (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) )
            {
            // InternalTaskDSL.g:621:2: (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) )
            // InternalTaskDSL.g:622:3: otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMeetingActionAccess().getMeetingKeyword_0());
              		
            }
            // InternalTaskDSL.g:626:3: ( (lv_topic_1_0= RULE_STRING ) )
            // InternalTaskDSL.g:627:4: (lv_topic_1_0= RULE_STRING )
            {
            // InternalTaskDSL.g:627:4: (lv_topic_1_0= RULE_STRING )
            // InternalTaskDSL.g:628:5: lv_topic_1_0= RULE_STRING
            {
            lv_topic_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_topic_1_0, grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMeetingActionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"topic",
              						lv_topic_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
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
    // $ANTLR end "ruleMeetingAction"


    // $ANTLR start "entryRulePaperAction"
    // InternalTaskDSL.g:648:1: entryRulePaperAction returns [EObject current=null] : iv_rulePaperAction= rulePaperAction EOF ;
    public final EObject entryRulePaperAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaperAction = null;


        try {
            // InternalTaskDSL.g:648:52: (iv_rulePaperAction= rulePaperAction EOF )
            // InternalTaskDSL.g:649:2: iv_rulePaperAction= rulePaperAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPaperActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePaperAction=rulePaperAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePaperAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePaperAction"


    // $ANTLR start "rulePaperAction"
    // InternalTaskDSL.g:655:1: rulePaperAction returns [EObject current=null] : (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) ) ;
    public final EObject rulePaperAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_report_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:661:2: ( (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) ) )
            // InternalTaskDSL.g:662:2: (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) )
            {
            // InternalTaskDSL.g:662:2: (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) )
            // InternalTaskDSL.g:663:3: otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPaperActionAccess().getReportKeyword_0());
              		
            }
            // InternalTaskDSL.g:667:3: ( (lv_report_1_0= RULE_ID ) )
            // InternalTaskDSL.g:668:4: (lv_report_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:668:4: (lv_report_1_0= RULE_ID )
            // InternalTaskDSL.g:669:5: lv_report_1_0= RULE_ID
            {
            lv_report_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_report_1_0, grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPaperActionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"report",
              						lv_report_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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
    // $ANTLR end "rulePaperAction"


    // $ANTLR start "entryRulePaymentAction"
    // InternalTaskDSL.g:689:1: entryRulePaymentAction returns [EObject current=null] : iv_rulePaymentAction= rulePaymentAction EOF ;
    public final EObject entryRulePaymentAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaymentAction = null;


        try {
            // InternalTaskDSL.g:689:54: (iv_rulePaymentAction= rulePaymentAction EOF )
            // InternalTaskDSL.g:690:2: iv_rulePaymentAction= rulePaymentAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPaymentActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePaymentAction=rulePaymentAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePaymentAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePaymentAction"


    // $ANTLR start "rulePaymentAction"
    // InternalTaskDSL.g:696:1: rulePaymentAction returns [EObject current=null] : ( (otherlv_0= 'If' ( (lv_condition_1_0= ruleBooleanExpression ) ) )? otherlv_2= 'Pay' ( (lv_amount_3_0= ruleIntExpression ) ) otherlv_4= 'euro' ) ;
    public final EObject rulePaymentAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_amount_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:702:2: ( ( (otherlv_0= 'If' ( (lv_condition_1_0= ruleBooleanExpression ) ) )? otherlv_2= 'Pay' ( (lv_amount_3_0= ruleIntExpression ) ) otherlv_4= 'euro' ) )
            // InternalTaskDSL.g:703:2: ( (otherlv_0= 'If' ( (lv_condition_1_0= ruleBooleanExpression ) ) )? otherlv_2= 'Pay' ( (lv_amount_3_0= ruleIntExpression ) ) otherlv_4= 'euro' )
            {
            // InternalTaskDSL.g:703:2: ( (otherlv_0= 'If' ( (lv_condition_1_0= ruleBooleanExpression ) ) )? otherlv_2= 'Pay' ( (lv_amount_3_0= ruleIntExpression ) ) otherlv_4= 'euro' )
            // InternalTaskDSL.g:704:3: (otherlv_0= 'If' ( (lv_condition_1_0= ruleBooleanExpression ) ) )? otherlv_2= 'Pay' ( (lv_amount_3_0= ruleIntExpression ) ) otherlv_4= 'euro'
            {
            // InternalTaskDSL.g:704:3: (otherlv_0= 'If' ( (lv_condition_1_0= ruleBooleanExpression ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTaskDSL.g:705:4: otherlv_0= 'If' ( (lv_condition_1_0= ruleBooleanExpression ) )
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPaymentActionAccess().getIfKeyword_0_0());
                      			
                    }
                    // InternalTaskDSL.g:709:4: ( (lv_condition_1_0= ruleBooleanExpression ) )
                    // InternalTaskDSL.g:710:5: (lv_condition_1_0= ruleBooleanExpression )
                    {
                    // InternalTaskDSL.g:710:5: (lv_condition_1_0= ruleBooleanExpression )
                    // InternalTaskDSL.g:711:6: lv_condition_1_0= ruleBooleanExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPaymentActionAccess().getConditionBooleanExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_condition_1_0=ruleBooleanExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPaymentActionRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_1_0,
                      							"persons.tasks.TaskDSL.BooleanExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,26,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPaymentActionAccess().getPayKeyword_1());
              		
            }
            // InternalTaskDSL.g:733:3: ( (lv_amount_3_0= ruleIntExpression ) )
            // InternalTaskDSL.g:734:4: (lv_amount_3_0= ruleIntExpression )
            {
            // InternalTaskDSL.g:734:4: (lv_amount_3_0= ruleIntExpression )
            // InternalTaskDSL.g:735:5: lv_amount_3_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPaymentActionAccess().getAmountIntExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_amount_3_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPaymentActionRule());
              					}
              					set(
              						current,
              						"amount",
              						lv_amount_3_0,
              						"persons.tasks.TaskDSL.IntExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPaymentActionAccess().getEuroKeyword_3());
              		
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
    // $ANTLR end "rulePaymentAction"


    // $ANTLR start "entryRuleIntExpression"
    // InternalTaskDSL.g:760:1: entryRuleIntExpression returns [EObject current=null] : iv_ruleIntExpression= ruleIntExpression EOF ;
    public final EObject entryRuleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExpression = null;


        try {
            // InternalTaskDSL.g:760:54: (iv_ruleIntExpression= ruleIntExpression EOF )
            // InternalTaskDSL.g:761:2: iv_ruleIntExpression= ruleIntExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntExpression=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntExpression"


    // $ANTLR start "ruleIntExpression"
    // InternalTaskDSL.g:767:1: ruleIntExpression returns [EObject current=null] : this_ExpressionLevel1_0= ruleExpressionLevel1 ;
    public final EObject ruleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionLevel1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:773:2: (this_ExpressionLevel1_0= ruleExpressionLevel1 )
            // InternalTaskDSL.g:774:2: this_ExpressionLevel1_0= ruleExpressionLevel1
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getIntExpressionAccess().getExpressionLevel1ParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ExpressionLevel1_0=ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ExpressionLevel1_0;
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
    // $ANTLR end "ruleIntExpression"


    // $ANTLR start "entryRuleExpressionLevel1"
    // InternalTaskDSL.g:785:1: entryRuleExpressionLevel1 returns [EObject current=null] : iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF ;
    public final EObject entryRuleExpressionLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel1 = null;


        try {
            // InternalTaskDSL.g:785:57: (iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF )
            // InternalTaskDSL.g:786:2: iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel1=ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel1; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionLevel1"


    // $ANTLR start "ruleExpressionLevel1"
    // InternalTaskDSL.g:792:1: ruleExpressionLevel1 returns [EObject current=null] : (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ExpressionLevel2_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:798:2: ( (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* ) )
            // InternalTaskDSL.g:799:2: (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* )
            {
            // InternalTaskDSL.g:799:2: (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* )
            // InternalTaskDSL.g:800:3: this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_ExpressionLevel2_0=ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLevel2_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTaskDSL.g:808:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }
                else if ( (LA10_0==29) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTaskDSL.g:809:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) )
            	    {
            	    // InternalTaskDSL.g:809:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) )
            	    // InternalTaskDSL.g:810:5: () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) )
            	    {
            	    // InternalTaskDSL.g:810:5: ()
            	    // InternalTaskDSL.g:811:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel1Access().getExpressionAdditionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel1Access().getPlusSignKeyword_1_0_1());
            	      				
            	    }
            	    // InternalTaskDSL.g:821:5: ( (lv_right_3_0= ruleExpressionLevel2 ) )
            	    // InternalTaskDSL.g:822:6: (lv_right_3_0= ruleExpressionLevel2 )
            	    {
            	    // InternalTaskDSL.g:822:6: (lv_right_3_0= ruleExpressionLevel2 )
            	    // InternalTaskDSL.g:823:7: lv_right_3_0= ruleExpressionLevel2
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleExpressionLevel2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel1Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"persons.tasks.TaskDSL.ExpressionLevel2");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTaskDSL.g:842:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) )
            	    {
            	    // InternalTaskDSL.g:842:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) )
            	    // InternalTaskDSL.g:843:5: () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) )
            	    {
            	    // InternalTaskDSL.g:843:5: ()
            	    // InternalTaskDSL.g:844:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel1Access().getExpressionSubtractionLeftAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,29,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel1Access().getHyphenMinusKeyword_1_1_1());
            	      				
            	    }
            	    // InternalTaskDSL.g:854:5: ( (lv_right_6_0= ruleExpressionLevel2 ) )
            	    // InternalTaskDSL.g:855:6: (lv_right_6_0= ruleExpressionLevel2 )
            	    {
            	    // InternalTaskDSL.g:855:6: (lv_right_6_0= ruleExpressionLevel2 )
            	    // InternalTaskDSL.g:856:7: lv_right_6_0= ruleExpressionLevel2
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_right_6_0=ruleExpressionLevel2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel1Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_6_0,
            	      								"persons.tasks.TaskDSL.ExpressionLevel2");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleExpressionLevel1"


    // $ANTLR start "entryRuleExpressionLevel2"
    // InternalTaskDSL.g:879:1: entryRuleExpressionLevel2 returns [EObject current=null] : iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF ;
    public final EObject entryRuleExpressionLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel2 = null;


        try {
            // InternalTaskDSL.g:879:57: (iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF )
            // InternalTaskDSL.g:880:2: iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel2=ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel2; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionLevel2"


    // $ANTLR start "ruleExpressionLevel2"
    // InternalTaskDSL.g:886:1: ruleExpressionLevel2 returns [EObject current=null] : (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject this_ExpressionLevel3_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;

        EObject lv_right_15_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:892:2: ( (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* ) )
            // InternalTaskDSL.g:893:2: (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* )
            {
            // InternalTaskDSL.g:893:2: (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* )
            // InternalTaskDSL.g:894:3: this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_21);
            this_ExpressionLevel3_0=ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLevel3_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTaskDSL.g:902:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )*
            loop11:
            do {
                int alt11=6;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    alt11=1;
                    }
                    break;
                case 31:
                    {
                    alt11=2;
                    }
                    break;
                case 32:
                    {
                    alt11=3;
                    }
                    break;
                case 33:
                    {
                    alt11=4;
                    }
                    break;
                case 34:
                    {
                    alt11=5;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // InternalTaskDSL.g:903:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalTaskDSL.g:903:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )
            	    // InternalTaskDSL.g:904:5: () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalTaskDSL.g:904:5: ()
            	    // InternalTaskDSL.g:905:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionMultiplyLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,30,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel2Access().getAsteriskKeyword_1_0_1());
            	      				
            	    }
            	    // InternalTaskDSL.g:915:5: ( (lv_right_3_0= ruleExpressionLevel3 ) )
            	    // InternalTaskDSL.g:916:6: (lv_right_3_0= ruleExpressionLevel3 )
            	    {
            	    // InternalTaskDSL.g:916:6: (lv_right_3_0= ruleExpressionLevel3 )
            	    // InternalTaskDSL.g:917:7: lv_right_3_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"persons.tasks.TaskDSL.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTaskDSL.g:936:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalTaskDSL.g:936:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) )
            	    // InternalTaskDSL.g:937:5: () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalTaskDSL.g:937:5: ()
            	    // InternalTaskDSL.g:938:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionDivisionLeftAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel2Access().getSolidusKeyword_1_1_1());
            	      				
            	    }
            	    // InternalTaskDSL.g:948:5: ( (lv_right_6_0= ruleExpressionLevel3 ) )
            	    // InternalTaskDSL.g:949:6: (lv_right_6_0= ruleExpressionLevel3 )
            	    {
            	    // InternalTaskDSL.g:949:6: (lv_right_6_0= ruleExpressionLevel3 )
            	    // InternalTaskDSL.g:950:7: lv_right_6_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_right_6_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_6_0,
            	      								"persons.tasks.TaskDSL.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTaskDSL.g:969:4: ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalTaskDSL.g:969:4: ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) )
            	    // InternalTaskDSL.g:970:5: () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalTaskDSL.g:970:5: ()
            	    // InternalTaskDSL.g:971:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionMaximumLeftAction_1_2_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_8=(Token)match(input,32,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_8, grammarAccess.getExpressionLevel2Access().getMaxKeyword_1_2_1());
            	      				
            	    }
            	    // InternalTaskDSL.g:981:5: ( (lv_right_9_0= ruleExpressionLevel3 ) )
            	    // InternalTaskDSL.g:982:6: (lv_right_9_0= ruleExpressionLevel3 )
            	    {
            	    // InternalTaskDSL.g:982:6: (lv_right_9_0= ruleExpressionLevel3 )
            	    // InternalTaskDSL.g:983:7: lv_right_9_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_2_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_right_9_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_9_0,
            	      								"persons.tasks.TaskDSL.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalTaskDSL.g:1002:4: ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalTaskDSL.g:1002:4: ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) )
            	    // InternalTaskDSL.g:1003:5: () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalTaskDSL.g:1003:5: ()
            	    // InternalTaskDSL.g:1004:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionMinimumLeftAction_1_3_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_11=(Token)match(input,33,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_11, grammarAccess.getExpressionLevel2Access().getMinKeyword_1_3_1());
            	      				
            	    }
            	    // InternalTaskDSL.g:1014:5: ( (lv_right_12_0= ruleExpressionLevel3 ) )
            	    // InternalTaskDSL.g:1015:6: (lv_right_12_0= ruleExpressionLevel3 )
            	    {
            	    // InternalTaskDSL.g:1015:6: (lv_right_12_0= ruleExpressionLevel3 )
            	    // InternalTaskDSL.g:1016:7: lv_right_12_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_3_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_right_12_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_12_0,
            	      								"persons.tasks.TaskDSL.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalTaskDSL.g:1035:4: ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalTaskDSL.g:1035:4: ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) )
            	    // InternalTaskDSL.g:1036:5: () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalTaskDSL.g:1036:5: ()
            	    // InternalTaskDSL.g:1037:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionModuloLeftAction_1_4_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_14=(Token)match(input,34,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_14, grammarAccess.getExpressionLevel2Access().getModKeyword_1_4_1());
            	      				
            	    }
            	    // InternalTaskDSL.g:1047:5: ( (lv_right_15_0= ruleExpressionLevel3 ) )
            	    // InternalTaskDSL.g:1048:6: (lv_right_15_0= ruleExpressionLevel3 )
            	    {
            	    // InternalTaskDSL.g:1048:6: (lv_right_15_0= ruleExpressionLevel3 )
            	    // InternalTaskDSL.g:1049:7: lv_right_15_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_4_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_right_15_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_15_0,
            	      								"persons.tasks.TaskDSL.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

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
    // $ANTLR end "ruleExpressionLevel2"


    // $ANTLR start "entryRuleExpressionLevel3"
    // InternalTaskDSL.g:1072:1: entryRuleExpressionLevel3 returns [EObject current=null] : iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF ;
    public final EObject entryRuleExpressionLevel3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel3 = null;


        try {
            // InternalTaskDSL.g:1072:57: (iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF )
            // InternalTaskDSL.g:1073:2: iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel3=ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel3; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionLevel3"


    // $ANTLR start "ruleExpressionLevel3"
    // InternalTaskDSL.g:1079:1: ruleExpressionLevel3 returns [EObject current=null] : (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? ) ;
    public final EObject ruleExpressionLevel3() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ExpressionLevel4_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1085:2: ( (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? ) )
            // InternalTaskDSL.g:1086:2: (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? )
            {
            // InternalTaskDSL.g:1086:2: (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? )
            // InternalTaskDSL.g:1087:3: this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            this_ExpressionLevel4_0=ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLevel4_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTaskDSL.g:1095:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTaskDSL.g:1096:4: () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) )
                    {
                    // InternalTaskDSL.g:1096:4: ()
                    // InternalTaskDSL.g:1097:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExpressionLevel3Access().getExpressionPowerLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,35,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getExpressionLevel3Access().getCircumflexAccentKeyword_1_1());
                      			
                    }
                    // InternalTaskDSL.g:1107:4: ( (lv_right_3_0= ruleExpressionLevel3 ) )
                    // InternalTaskDSL.g:1108:5: (lv_right_3_0= ruleExpressionLevel3 )
                    {
                    // InternalTaskDSL.g:1108:5: (lv_right_3_0= ruleExpressionLevel3 )
                    // InternalTaskDSL.g:1109:6: lv_right_3_0= ruleExpressionLevel3
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel3ParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpressionLevel3();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionLevel3Rule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"persons.tasks.TaskDSL.ExpressionLevel3");
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
    // $ANTLR end "ruleExpressionLevel3"


    // $ANTLR start "entryRuleExpressionLevel4"
    // InternalTaskDSL.g:1131:1: entryRuleExpressionLevel4 returns [EObject current=null] : iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF ;
    public final EObject entryRuleExpressionLevel4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel4 = null;


        try {
            // InternalTaskDSL.g:1131:57: (iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF )
            // InternalTaskDSL.g:1132:2: iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel4Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel4=ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel4; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionLevel4"


    // $ANTLR start "ruleExpressionLevel4"
    // InternalTaskDSL.g:1138:1: ruleExpressionLevel4 returns [EObject current=null] : (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 ) ;
    public final EObject ruleExpressionLevel4() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionMinus_0 = null;

        EObject this_ExpressionPlus_1 = null;

        EObject this_ExpressionLevel5_2 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1144:2: ( (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 ) )
            // InternalTaskDSL.g:1145:2: (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 )
            {
            // InternalTaskDSL.g:1145:2: (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt13=1;
                }
                break;
            case 28:
                {
                alt13=2;
                }
                break;
            case RULE_INT:
            case 36:
            case 42:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalTaskDSL.g:1146:3: this_ExpressionMinus_0= ruleExpressionMinus
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionMinusParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionMinus_0=ruleExpressionMinus();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionMinus_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1155:3: this_ExpressionPlus_1= ruleExpressionPlus
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionPlusParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionPlus_1=ruleExpressionPlus();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionPlus_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1164:3: this_ExpressionLevel5_2= ruleExpressionLevel5
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionLevel5_2=ruleExpressionLevel5();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionLevel5_2;
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
    // $ANTLR end "ruleExpressionLevel4"


    // $ANTLR start "entryRuleExpressionMinus"
    // InternalTaskDSL.g:1176:1: entryRuleExpressionMinus returns [EObject current=null] : iv_ruleExpressionMinus= ruleExpressionMinus EOF ;
    public final EObject entryRuleExpressionMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionMinus = null;


        try {
            // InternalTaskDSL.g:1176:56: (iv_ruleExpressionMinus= ruleExpressionMinus EOF )
            // InternalTaskDSL.g:1177:2: iv_ruleExpressionMinus= ruleExpressionMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionMinus=ruleExpressionMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionMinus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionMinus"


    // $ANTLR start "ruleExpressionMinus"
    // InternalTaskDSL.g:1183:1: ruleExpressionMinus returns [EObject current=null] : (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) ;
    public final EObject ruleExpressionMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1189:2: ( (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) )
            // InternalTaskDSL.g:1190:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            {
            // InternalTaskDSL.g:1190:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            // InternalTaskDSL.g:1191:3: otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0());
              		
            }
            // InternalTaskDSL.g:1195:3: ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            // InternalTaskDSL.g:1196:4: (lv_sub_1_0= ruleExpressionLevel5 )
            {
            // InternalTaskDSL.g:1196:4: (lv_sub_1_0= ruleExpressionLevel5 )
            // InternalTaskDSL.g:1197:5: lv_sub_1_0= ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel5ParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionMinusRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"persons.tasks.TaskDSL.ExpressionLevel5");
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
    // $ANTLR end "ruleExpressionMinus"


    // $ANTLR start "entryRuleExpressionPlus"
    // InternalTaskDSL.g:1218:1: entryRuleExpressionPlus returns [EObject current=null] : iv_ruleExpressionPlus= ruleExpressionPlus EOF ;
    public final EObject entryRuleExpressionPlus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionPlus = null;


        try {
            // InternalTaskDSL.g:1218:55: (iv_ruleExpressionPlus= ruleExpressionPlus EOF )
            // InternalTaskDSL.g:1219:2: iv_ruleExpressionPlus= ruleExpressionPlus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionPlusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionPlus=ruleExpressionPlus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionPlus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionPlus"


    // $ANTLR start "ruleExpressionPlus"
    // InternalTaskDSL.g:1225:1: ruleExpressionPlus returns [EObject current=null] : (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) ;
    public final EObject ruleExpressionPlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1231:2: ( (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) )
            // InternalTaskDSL.g:1232:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            {
            // InternalTaskDSL.g:1232:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            // InternalTaskDSL.g:1233:3: otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0());
              		
            }
            // InternalTaskDSL.g:1237:3: ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            // InternalTaskDSL.g:1238:4: (lv_sub_1_0= ruleExpressionLevel5 )
            {
            // InternalTaskDSL.g:1238:4: (lv_sub_1_0= ruleExpressionLevel5 )
            // InternalTaskDSL.g:1239:5: lv_sub_1_0= ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel5ParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionPlusRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"persons.tasks.TaskDSL.ExpressionLevel5");
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
    // $ANTLR end "ruleExpressionPlus"


    // $ANTLR start "entryRuleExpressionLevel5"
    // InternalTaskDSL.g:1260:1: entryRuleExpressionLevel5 returns [EObject current=null] : iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF ;
    public final EObject entryRuleExpressionLevel5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel5 = null;


        try {
            // InternalTaskDSL.g:1260:57: (iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF )
            // InternalTaskDSL.g:1261:2: iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel5Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel5=ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel5; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionLevel5"


    // $ANTLR start "ruleExpressionLevel5"
    // InternalTaskDSL.g:1267:1: ruleExpressionLevel5 returns [EObject current=null] : (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt | this_ExpressionBalance_2= ruleExpressionBalance ) ;
    public final EObject ruleExpressionLevel5() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionBracket_0 = null;

        EObject this_ExpressionConstantInt_1 = null;

        EObject this_ExpressionBalance_2 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1273:2: ( (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt | this_ExpressionBalance_2= ruleExpressionBalance ) )
            // InternalTaskDSL.g:1274:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt | this_ExpressionBalance_2= ruleExpressionBalance )
            {
            // InternalTaskDSL.g:1274:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt | this_ExpressionBalance_2= ruleExpressionBalance )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt14=1;
                }
                break;
            case RULE_INT:
                {
                alt14=2;
                }
                break;
            case 42:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalTaskDSL.g:1275:3: this_ExpressionBracket_0= ruleExpressionBracket
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel5Access().getExpressionBracketParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionBracket_0=ruleExpressionBracket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionBracket_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1284:3: this_ExpressionConstantInt_1= ruleExpressionConstantInt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel5Access().getExpressionConstantIntParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionConstantInt_1=ruleExpressionConstantInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionConstantInt_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1293:3: this_ExpressionBalance_2= ruleExpressionBalance
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel5Access().getExpressionBalanceParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionBalance_2=ruleExpressionBalance();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionBalance_2;
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
    // $ANTLR end "ruleExpressionLevel5"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalTaskDSL.g:1305:1: entryRuleExpressionBracket returns [EObject current=null] : iv_ruleExpressionBracket= ruleExpressionBracket EOF ;
    public final EObject entryRuleExpressionBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBracket = null;


        try {
            // InternalTaskDSL.g:1305:58: (iv_ruleExpressionBracket= ruleExpressionBracket EOF )
            // InternalTaskDSL.g:1306:2: iv_ruleExpressionBracket= ruleExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBracket=ruleExpressionBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionBracket; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionBracket"


    // $ANTLR start "ruleExpressionBracket"
    // InternalTaskDSL.g:1312:1: ruleExpressionBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleExpressionBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1318:2: ( (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' ) )
            // InternalTaskDSL.g:1319:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' )
            {
            // InternalTaskDSL.g:1319:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' )
            // InternalTaskDSL.g:1320:3: otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalTaskDSL.g:1324:3: ( (lv_sub_1_0= ruleIntExpression ) )
            // InternalTaskDSL.g:1325:4: (lv_sub_1_0= ruleIntExpression )
            {
            // InternalTaskDSL.g:1325:4: (lv_sub_1_0= ruleIntExpression )
            // InternalTaskDSL.g:1326:5: lv_sub_1_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionBracketAccess().getSubIntExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_sub_1_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionBracketRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"persons.tasks.TaskDSL.IntExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleExpressionConstantInt"
    // InternalTaskDSL.g:1351:1: entryRuleExpressionConstantInt returns [EObject current=null] : iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF ;
    public final EObject entryRuleExpressionConstantInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstantInt = null;


        try {
            // InternalTaskDSL.g:1351:62: (iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF )
            // InternalTaskDSL.g:1352:2: iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionConstantIntRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionConstantInt=ruleExpressionConstantInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionConstantInt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionConstantInt"


    // $ANTLR start "ruleExpressionConstantInt"
    // InternalTaskDSL.g:1358:1: ruleExpressionConstantInt returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleExpressionConstantInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:1364:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalTaskDSL.g:1365:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalTaskDSL.g:1365:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalTaskDSL.g:1366:3: (lv_value_0_0= RULE_INT )
            {
            // InternalTaskDSL.g:1366:3: (lv_value_0_0= RULE_INT )
            // InternalTaskDSL.g:1367:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getExpressionConstantIntRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
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
    // $ANTLR end "ruleExpressionConstantInt"


    // $ANTLR start "entryRuleExpressionBalance"
    // InternalTaskDSL.g:1386:1: entryRuleExpressionBalance returns [EObject current=null] : iv_ruleExpressionBalance= ruleExpressionBalance EOF ;
    public final EObject entryRuleExpressionBalance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBalance = null;


        try {
            // InternalTaskDSL.g:1386:58: (iv_ruleExpressionBalance= ruleExpressionBalance EOF )
            // InternalTaskDSL.g:1387:2: iv_ruleExpressionBalance= ruleExpressionBalance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionBalanceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBalance=ruleExpressionBalance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionBalance; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionBalance"


    // $ANTLR start "ruleExpressionBalance"
    // InternalTaskDSL.g:1393:1: ruleExpressionBalance returns [EObject current=null] : ( (lv_value_0_0= ruleBalance ) ) ;
    public final EObject ruleExpressionBalance() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1399:2: ( ( (lv_value_0_0= ruleBalance ) ) )
            // InternalTaskDSL.g:1400:2: ( (lv_value_0_0= ruleBalance ) )
            {
            // InternalTaskDSL.g:1400:2: ( (lv_value_0_0= ruleBalance ) )
            // InternalTaskDSL.g:1401:3: (lv_value_0_0= ruleBalance )
            {
            // InternalTaskDSL.g:1401:3: (lv_value_0_0= ruleBalance )
            // InternalTaskDSL.g:1402:4: lv_value_0_0= ruleBalance
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getExpressionBalanceAccess().getValueBalanceEnumRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBalance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getExpressionBalanceRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"persons.tasks.TaskDSL.Balance");
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
    // $ANTLR end "ruleExpressionBalance"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalTaskDSL.g:1422:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalTaskDSL.g:1422:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalTaskDSL.g:1423:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalTaskDSL.g:1429:1: ruleBooleanExpression returns [EObject current=null] : this_BooleanExpressionLevel1_0= ruleBooleanExpressionLevel1 ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpressionLevel1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1435:2: (this_BooleanExpressionLevel1_0= ruleBooleanExpressionLevel1 )
            // InternalTaskDSL.g:1436:2: this_BooleanExpressionLevel1_0= ruleBooleanExpressionLevel1
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionLevel1ParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_BooleanExpressionLevel1_0=ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_BooleanExpressionLevel1_0;
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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel1"
    // InternalTaskDSL.g:1447:1: entryRuleBooleanExpressionLevel1 returns [EObject current=null] : iv_ruleBooleanExpressionLevel1= ruleBooleanExpressionLevel1 EOF ;
    public final EObject entryRuleBooleanExpressionLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionLevel1 = null;


        try {
            // InternalTaskDSL.g:1447:64: (iv_ruleBooleanExpressionLevel1= ruleBooleanExpressionLevel1 EOF )
            // InternalTaskDSL.g:1448:2: iv_ruleBooleanExpressionLevel1= ruleBooleanExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionLevel1=ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionLevel1; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExpressionLevel1"


    // $ANTLR start "ruleBooleanExpressionLevel1"
    // InternalTaskDSL.g:1454:1: ruleBooleanExpressionLevel1 returns [EObject current=null] : (this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )* ) ;
    public final EObject ruleBooleanExpressionLevel1() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpressionLevel2_0 = null;

        Enumerator lv_bop_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1460:2: ( (this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )* ) )
            // InternalTaskDSL.g:1461:2: (this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )* )
            {
            // InternalTaskDSL.g:1461:2: (this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )* )
            // InternalTaskDSL.g:1462:3: this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBooleanExpressionLevel1Access().getBooleanExpressionLevel2ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_BooleanExpressionLevel2_0=ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BooleanExpressionLevel2_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTaskDSL.g:1470:3: ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=43 && LA15_0<=44)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTaskDSL.g:1471:4: () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) )
            	    {
            	    // InternalTaskDSL.g:1471:4: ()
            	    // InternalTaskDSL.g:1472:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBooleanExpressionLevel1Access().getExpressionBinOpLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTaskDSL.g:1478:4: ( (lv_bop_2_0= ruleBinaryBooleanOperator ) )
            	    // InternalTaskDSL.g:1479:5: (lv_bop_2_0= ruleBinaryBooleanOperator )
            	    {
            	    // InternalTaskDSL.g:1479:5: (lv_bop_2_0= ruleBinaryBooleanOperator )
            	    // InternalTaskDSL.g:1480:6: lv_bop_2_0= ruleBinaryBooleanOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBooleanExpressionLevel1Access().getBopBinaryBooleanOperatorEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_bop_2_0=ruleBinaryBooleanOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBooleanExpressionLevel1Rule());
            	      						}
            	      						set(
            	      							current,
            	      							"bop",
            	      							lv_bop_2_0,
            	      							"persons.tasks.TaskDSL.BinaryBooleanOperator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalTaskDSL.g:1497:4: ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) )
            	    // InternalTaskDSL.g:1498:5: (lv_right_3_0= ruleBooleanExpressionLevel2 )
            	    {
            	    // InternalTaskDSL.g:1498:5: (lv_right_3_0= ruleBooleanExpressionLevel2 )
            	    // InternalTaskDSL.g:1499:6: lv_right_3_0= ruleBooleanExpressionLevel2
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBooleanExpressionLevel1Access().getRightBooleanExpressionLevel2ParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleBooleanExpressionLevel2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBooleanExpressionLevel1Rule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"persons.tasks.TaskDSL.BooleanExpressionLevel2");
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExpressionLevel1"


    // $ANTLR start "entryRuleBooleanExpressionLevel2"
    // InternalTaskDSL.g:1521:1: entryRuleBooleanExpressionLevel2 returns [EObject current=null] : iv_ruleBooleanExpressionLevel2= ruleBooleanExpressionLevel2 EOF ;
    public final EObject entryRuleBooleanExpressionLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionLevel2 = null;


        try {
            // InternalTaskDSL.g:1521:64: (iv_ruleBooleanExpressionLevel2= ruleBooleanExpressionLevel2 EOF )
            // InternalTaskDSL.g:1522:2: iv_ruleBooleanExpressionLevel2= ruleBooleanExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionLevel2=ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionLevel2; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExpressionLevel2"


    // $ANTLR start "ruleBooleanExpressionLevel2"
    // InternalTaskDSL.g:1528:1: ruleBooleanExpressionLevel2 returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression | this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3 ) ;
    public final EObject ruleBooleanExpressionLevel2() throws RecognitionException {
        EObject current = null;

        EObject this_NotExpression_0 = null;

        EObject this_BooleanExpressionLevel3_1 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1534:2: ( (this_NotExpression_0= ruleNotExpression | this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3 ) )
            // InternalTaskDSL.g:1535:2: (this_NotExpression_0= ruleNotExpression | this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3 )
            {
            // InternalTaskDSL.g:1535:2: (this_NotExpression_0= ruleNotExpression | this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3 )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_INT||LA16_0==RULE_BOOL_LITERAL||(LA16_0>=28 && LA16_0<=29)||LA16_0==36||LA16_0==42) ) {
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
                    // InternalTaskDSL.g:1536:3: this_NotExpression_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionLevel2Access().getNotExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NotExpression_0=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NotExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1545:3: this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionLevel2Access().getBooleanExpressionLevel3ParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanExpressionLevel3_1=ruleBooleanExpressionLevel3();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanExpressionLevel3_1;
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
    // $ANTLR end "ruleBooleanExpressionLevel2"


    // $ANTLR start "entryRuleNotExpression"
    // InternalTaskDSL.g:1557:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalTaskDSL.g:1557:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalTaskDSL.g:1558:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalTaskDSL.g:1564:1: ruleNotExpression returns [EObject current=null] : (otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1570:2: ( (otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) ) ) )
            // InternalTaskDSL.g:1571:2: (otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) ) )
            {
            // InternalTaskDSL.g:1571:2: (otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) ) )
            // InternalTaskDSL.g:1572:3: otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNotExpressionAccess().getNOTKeyword_0());
              		
            }
            // InternalTaskDSL.g:1576:3: ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) )
            // InternalTaskDSL.g:1577:4: (lv_sub_1_0= ruleBooleanExpressionLevel3 )
            {
            // InternalTaskDSL.g:1577:4: (lv_sub_1_0= ruleBooleanExpressionLevel3 )
            // InternalTaskDSL.g:1578:5: lv_sub_1_0= ruleBooleanExpressionLevel3
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNotExpressionAccess().getSubBooleanExpressionLevel3ParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNotExpressionRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"persons.tasks.TaskDSL.BooleanExpressionLevel3");
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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel3"
    // InternalTaskDSL.g:1599:1: entryRuleBooleanExpressionLevel3 returns [EObject current=null] : iv_ruleBooleanExpressionLevel3= ruleBooleanExpressionLevel3 EOF ;
    public final EObject entryRuleBooleanExpressionLevel3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionLevel3 = null;


        try {
            // InternalTaskDSL.g:1599:64: (iv_ruleBooleanExpressionLevel3= ruleBooleanExpressionLevel3 EOF )
            // InternalTaskDSL.g:1600:2: iv_ruleBooleanExpressionLevel3= ruleBooleanExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionLevel3=ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionLevel3; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExpressionLevel3"


    // $ANTLR start "ruleBooleanExpressionLevel3"
    // InternalTaskDSL.g:1606:1: ruleBooleanExpressionLevel3 returns [EObject current=null] : ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket | this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant ) ;
    public final EObject ruleBooleanExpressionLevel3() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        EObject this_BooleanExpressionBracket_1 = null;

        EObject this_BooleanExpressionConstant_2 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1612:2: ( ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket | this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant ) )
            // InternalTaskDSL.g:1613:2: ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket | this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant )
            {
            // InternalTaskDSL.g:1613:2: ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket | this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) && (synpred1_InternalTaskDSL())) {
                alt17=1;
            }
            else if ( (LA17_0==28) && (synpred1_InternalTaskDSL())) {
                alt17=1;
            }
            else if ( (LA17_0==36) ) {
                int LA17_3 = input.LA(2);

                if ( (synpred1_InternalTaskDSL()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 3, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0==RULE_INT) && (synpred1_InternalTaskDSL())) {
                alt17=1;
            }
            else if ( (LA17_0==42) && (synpred1_InternalTaskDSL())) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_BOOL_LITERAL) ) {
                alt17=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalTaskDSL.g:1614:3: ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
                    {
                    // InternalTaskDSL.g:1614:3: ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
                    // InternalTaskDSL.g:1615:4: ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ComparisonExpression_0=ruleComparisonExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ComparisonExpression_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1626:3: this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanExpressionBracket_1=ruleBooleanExpressionBracket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanExpressionBracket_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1635:3: this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionConstantParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanExpressionConstant_2=ruleBooleanExpressionConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanExpressionConstant_2;
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
    // $ANTLR end "ruleBooleanExpressionLevel3"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalTaskDSL.g:1647:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalTaskDSL.g:1647:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalTaskDSL.g:1648:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalTaskDSL.g:1654:1: ruleComparisonExpression returns [EObject current=null] : ( () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) ) ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1660:2: ( ( () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) ) ) )
            // InternalTaskDSL.g:1661:2: ( () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) ) )
            {
            // InternalTaskDSL.g:1661:2: ( () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) ) )
            // InternalTaskDSL.g:1662:3: () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) )
            {
            // InternalTaskDSL.g:1662:3: ()
            // InternalTaskDSL.g:1663:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getComparisonExpressionAccess().getExpressionCompOpAction_0(),
              					current);
              			
            }

            }

            // InternalTaskDSL.g:1669:3: ( (lv_left_1_0= ruleIntExpression ) )
            // InternalTaskDSL.g:1670:4: (lv_left_1_0= ruleIntExpression )
            {
            // InternalTaskDSL.g:1670:4: (lv_left_1_0= ruleIntExpression )
            // InternalTaskDSL.g:1671:5: lv_left_1_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonExpressionAccess().getLeftIntExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_left_1_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"persons.tasks.TaskDSL.IntExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTaskDSL.g:1688:3: ( (lv_op_2_0= ruleCompareOperator ) )
            // InternalTaskDSL.g:1689:4: (lv_op_2_0= ruleCompareOperator )
            {
            // InternalTaskDSL.g:1689:4: (lv_op_2_0= ruleCompareOperator )
            // InternalTaskDSL.g:1690:5: lv_op_2_0= ruleCompareOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOpCompareOperatorEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_op_2_0=ruleCompareOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_2_0,
              						"persons.tasks.TaskDSL.CompareOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTaskDSL.g:1707:3: ( (lv_right_3_0= ruleIntExpression ) )
            // InternalTaskDSL.g:1708:4: (lv_right_3_0= ruleIntExpression )
            {
            // InternalTaskDSL.g:1708:4: (lv_right_3_0= ruleIntExpression )
            // InternalTaskDSL.g:1709:5: lv_right_3_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightIntExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_3_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"persons.tasks.TaskDSL.IntExpression");
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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleBooleanExpressionBracket"
    // InternalTaskDSL.g:1730:1: entryRuleBooleanExpressionBracket returns [EObject current=null] : iv_ruleBooleanExpressionBracket= ruleBooleanExpressionBracket EOF ;
    public final EObject entryRuleBooleanExpressionBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionBracket = null;


        try {
            // InternalTaskDSL.g:1730:65: (iv_ruleBooleanExpressionBracket= ruleBooleanExpressionBracket EOF )
            // InternalTaskDSL.g:1731:2: iv_ruleBooleanExpressionBracket= ruleBooleanExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionBracket=ruleBooleanExpressionBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionBracket; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExpressionBracket"


    // $ANTLR start "ruleBooleanExpressionBracket"
    // InternalTaskDSL.g:1737:1: ruleBooleanExpressionBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBooleanExpressionBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1743:2: ( (otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')' ) )
            // InternalTaskDSL.g:1744:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')' )
            {
            // InternalTaskDSL.g:1744:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')' )
            // InternalTaskDSL.g:1745:3: otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBooleanExpressionBracketAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalTaskDSL.g:1749:3: ( (lv_sub_1_0= ruleBooleanExpression ) )
            // InternalTaskDSL.g:1750:4: (lv_sub_1_0= ruleBooleanExpression )
            {
            // InternalTaskDSL.g:1750:4: (lv_sub_1_0= ruleBooleanExpression )
            // InternalTaskDSL.g:1751:5: lv_sub_1_0= ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBooleanExpressionBracketAccess().getSubBooleanExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_sub_1_0=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBooleanExpressionBracketRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"persons.tasks.TaskDSL.BooleanExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBooleanExpressionBracketAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "ruleBooleanExpressionBracket"


    // $ANTLR start "entryRuleBooleanExpressionConstant"
    // InternalTaskDSL.g:1776:1: entryRuleBooleanExpressionConstant returns [EObject current=null] : iv_ruleBooleanExpressionConstant= ruleBooleanExpressionConstant EOF ;
    public final EObject entryRuleBooleanExpressionConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionConstant = null;


        try {
            // InternalTaskDSL.g:1776:66: (iv_ruleBooleanExpressionConstant= ruleBooleanExpressionConstant EOF )
            // InternalTaskDSL.g:1777:2: iv_ruleBooleanExpressionConstant= ruleBooleanExpressionConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionConstant=ruleBooleanExpressionConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExpressionConstant"


    // $ANTLR start "ruleBooleanExpressionConstant"
    // InternalTaskDSL.g:1783:1: ruleBooleanExpressionConstant returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL_LITERAL ) ) ;
    public final EObject ruleBooleanExpressionConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:1789:2: ( ( (lv_value_0_0= RULE_BOOL_LITERAL ) ) )
            // InternalTaskDSL.g:1790:2: ( (lv_value_0_0= RULE_BOOL_LITERAL ) )
            {
            // InternalTaskDSL.g:1790:2: ( (lv_value_0_0= RULE_BOOL_LITERAL ) )
            // InternalTaskDSL.g:1791:3: (lv_value_0_0= RULE_BOOL_LITERAL )
            {
            // InternalTaskDSL.g:1791:3: (lv_value_0_0= RULE_BOOL_LITERAL )
            // InternalTaskDSL.g:1792:4: lv_value_0_0= RULE_BOOL_LITERAL
            {
            lv_value_0_0=(Token)match(input,RULE_BOOL_LITERAL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getBooleanExpressionConstantAccess().getValueBOOL_LITERALTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getBooleanExpressionConstantRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"persons.tasks.TaskDSL.BOOL_LITERAL");
              			
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
    // $ANTLR end "ruleBooleanExpressionConstant"


    // $ANTLR start "ruleTimeUnit"
    // InternalTaskDSL.g:1811:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:1817:2: ( ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) ) )
            // InternalTaskDSL.g:1818:2: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) )
            {
            // InternalTaskDSL.g:1818:2: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt18=1;
                }
                break;
            case 39:
                {
                alt18=2;
                }
                break;
            case 40:
                {
                alt18=3;
                }
                break;
            case 41:
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
                    // InternalTaskDSL.g:1819:3: (enumLiteral_0= 'min' )
                    {
                    // InternalTaskDSL.g:1819:3: (enumLiteral_0= 'min' )
                    // InternalTaskDSL.g:1820:4: enumLiteral_0= 'min'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1827:3: (enumLiteral_1= 'hour' )
                    {
                    // InternalTaskDSL.g:1827:3: (enumLiteral_1= 'hour' )
                    // InternalTaskDSL.g:1828:4: enumLiteral_1= 'hour'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1835:3: (enumLiteral_2= 'day' )
                    {
                    // InternalTaskDSL.g:1835:3: (enumLiteral_2= 'day' )
                    // InternalTaskDSL.g:1836:4: enumLiteral_2= 'day'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:1843:3: (enumLiteral_3= 'week' )
                    {
                    // InternalTaskDSL.g:1843:3: (enumLiteral_3= 'week' )
                    // InternalTaskDSL.g:1844:4: enumLiteral_3= 'week'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3());
                      			
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
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleBalance"
    // InternalTaskDSL.g:1854:1: ruleBalance returns [Enumerator current=null] : (enumLiteral_0= 'balance' ) ;
    public final Enumerator ruleBalance() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:1860:2: ( (enumLiteral_0= 'balance' ) )
            // InternalTaskDSL.g:1861:2: (enumLiteral_0= 'balance' )
            {
            // InternalTaskDSL.g:1861:2: (enumLiteral_0= 'balance' )
            // InternalTaskDSL.g:1862:3: enumLiteral_0= 'balance'
            {
            enumLiteral_0=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getBalanceAccess().getBALANCEEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getBalanceAccess().getBALANCEEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleBalance"


    // $ANTLR start "ruleBinaryBooleanOperator"
    // InternalTaskDSL.g:1871:1: ruleBinaryBooleanOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleBinaryBooleanOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:1877:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalTaskDSL.g:1878:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalTaskDSL.g:1878:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            else if ( (LA19_0==44) ) {
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
                    // InternalTaskDSL.g:1879:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalTaskDSL.g:1879:3: (enumLiteral_0= 'AND' )
                    // InternalTaskDSL.g:1880:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1887:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalTaskDSL.g:1887:3: (enumLiteral_1= 'OR' )
                    // InternalTaskDSL.g:1888:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleBinaryBooleanOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalTaskDSL.g:1898:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:1904:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) )
            // InternalTaskDSL.g:1905:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            {
            // InternalTaskDSL.g:1905:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt20=1;
                }
                break;
            case 46:
                {
                alt20=2;
                }
                break;
            case 47:
                {
                alt20=3;
                }
                break;
            case 48:
                {
                alt20=4;
                }
                break;
            case 49:
                {
                alt20=5;
                }
                break;
            case 50:
                {
                alt20=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalTaskDSL.g:1906:3: (enumLiteral_0= '==' )
                    {
                    // InternalTaskDSL.g:1906:3: (enumLiteral_0= '==' )
                    // InternalTaskDSL.g:1907:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1914:3: (enumLiteral_1= '!=' )
                    {
                    // InternalTaskDSL.g:1914:3: (enumLiteral_1= '!=' )
                    // InternalTaskDSL.g:1915:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1922:3: (enumLiteral_2= '>=' )
                    {
                    // InternalTaskDSL.g:1922:3: (enumLiteral_2= '>=' )
                    // InternalTaskDSL.g:1923:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:1930:3: (enumLiteral_3= '>' )
                    {
                    // InternalTaskDSL.g:1930:3: (enumLiteral_3= '>' )
                    // InternalTaskDSL.g:1931:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTaskDSL.g:1938:3: (enumLiteral_4= '<=' )
                    {
                    // InternalTaskDSL.g:1938:3: (enumLiteral_4= '<=' )
                    // InternalTaskDSL.g:1939:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTaskDSL.g:1946:3: (enumLiteral_5= '<' )
                    {
                    // InternalTaskDSL.g:1946:3: (enumLiteral_5= '<' )
                    // InternalTaskDSL.g:1947:4: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5());
                      			
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
    // $ANTLR end "ruleCompareOperator"

    // $ANTLR start synpred1_InternalTaskDSL
    public final void synpred1_InternalTaskDSL_fragment() throws RecognitionException {   
        // InternalTaskDSL.g:1615:4: ( ruleComparisonExpression )
        // InternalTaskDSL.g:1615:5: ruleComparisonExpression
        {
        pushFollow(FOLLOW_2);
        ruleComparisonExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalTaskDSL

    // Delegated rules

    public final boolean synpred1_InternalTaskDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTaskDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000038200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000450300000A0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000041030000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000007C0000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0007E00000000000L});

}