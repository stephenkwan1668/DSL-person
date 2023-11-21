package persons.tasks.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import persons.tasks.services.TaskDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTaskDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOL_LITERAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'balance'", "'min'", "'hour'", "'day'", "'week'", "'AND'", "'OR'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'", "'Planning'", "'Person:'", "'Task:'", "'persons:'", "'priority:'", "'defineProjects:'", "'useProjects:'", "'duration:'", "'extends'", "'Lunch'", "'Meeting'", "'Report'", "'Pay'", "'euro'", "'If'", "'+'", "'-'", "'*'", "'/'", "'max'", "'mod'", "'^'", "'('", "')'", "'NOT'", "'anonymous'"
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

    	public void setGrammarAccess(TaskDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePlanning"
    // InternalTaskDSL.g:54:1: entryRulePlanning : rulePlanning EOF ;
    public final void entryRulePlanning() throws RecognitionException {
        try {
            // InternalTaskDSL.g:55:1: ( rulePlanning EOF )
            // InternalTaskDSL.g:56:1: rulePlanning EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePlanning();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePlanning"


    // $ANTLR start "rulePlanning"
    // InternalTaskDSL.g:63:1: rulePlanning : ( ( rule__Planning__Group__0 ) ) ;
    public final void rulePlanning() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:67:2: ( ( ( rule__Planning__Group__0 ) ) )
            // InternalTaskDSL.g:68:2: ( ( rule__Planning__Group__0 ) )
            {
            // InternalTaskDSL.g:68:2: ( ( rule__Planning__Group__0 ) )
            // InternalTaskDSL.g:69:3: ( rule__Planning__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getGroup()); 
            }
            // InternalTaskDSL.g:70:3: ( rule__Planning__Group__0 )
            // InternalTaskDSL.g:70:4: rule__Planning__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Planning__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlanning"


    // $ANTLR start "entryRulePerson"
    // InternalTaskDSL.g:79:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalTaskDSL.g:80:1: ( rulePerson EOF )
            // InternalTaskDSL.g:81:1: rulePerson EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersonRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersonRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalTaskDSL.g:88:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:92:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalTaskDSL.g:93:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalTaskDSL.g:93:2: ( ( rule__Person__Group__0 ) )
            // InternalTaskDSL.g:94:3: ( rule__Person__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersonAccess().getGroup()); 
            }
            // InternalTaskDSL.g:95:3: ( rule__Person__Group__0 )
            // InternalTaskDSL.g:95:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersonAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleTask"
    // InternalTaskDSL.g:104:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalTaskDSL.g:105:1: ( ruleTask EOF )
            // InternalTaskDSL.g:106:1: ruleTask EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalTaskDSL.g:113:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:117:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalTaskDSL.g:118:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalTaskDSL.g:118:2: ( ( rule__Task__Group__0 ) )
            // InternalTaskDSL.g:119:3: ( rule__Task__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getGroup()); 
            }
            // InternalTaskDSL.g:120:3: ( rule__Task__Group__0 )
            // InternalTaskDSL.g:120:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleProject"
    // InternalTaskDSL.g:129:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalTaskDSL.g:130:1: ( ruleProject EOF )
            // InternalTaskDSL.g:131:1: ruleProject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalTaskDSL.g:138:1: ruleProject : ( ( rule__Project__NameAssignment ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:142:2: ( ( ( rule__Project__NameAssignment ) ) )
            // InternalTaskDSL.g:143:2: ( ( rule__Project__NameAssignment ) )
            {
            // InternalTaskDSL.g:143:2: ( ( rule__Project__NameAssignment ) )
            // InternalTaskDSL.g:144:3: ( rule__Project__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getNameAssignment()); 
            }
            // InternalTaskDSL.g:145:3: ( rule__Project__NameAssignment )
            // InternalTaskDSL.g:145:4: rule__Project__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Project__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleProjectUse"
    // InternalTaskDSL.g:154:1: entryRuleProjectUse : ruleProjectUse EOF ;
    public final void entryRuleProjectUse() throws RecognitionException {
        try {
            // InternalTaskDSL.g:155:1: ( ruleProjectUse EOF )
            // InternalTaskDSL.g:156:1: ruleProjectUse EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectUseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProjectUse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectUseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProjectUse"


    // $ANTLR start "ruleProjectUse"
    // InternalTaskDSL.g:163:1: ruleProjectUse : ( ( rule__ProjectUse__ProjectAssignment ) ) ;
    public final void ruleProjectUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:167:2: ( ( ( rule__ProjectUse__ProjectAssignment ) ) )
            // InternalTaskDSL.g:168:2: ( ( rule__ProjectUse__ProjectAssignment ) )
            {
            // InternalTaskDSL.g:168:2: ( ( rule__ProjectUse__ProjectAssignment ) )
            // InternalTaskDSL.g:169:3: ( rule__ProjectUse__ProjectAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectUseAccess().getProjectAssignment()); 
            }
            // InternalTaskDSL.g:170:3: ( rule__ProjectUse__ProjectAssignment )
            // InternalTaskDSL.g:170:4: rule__ProjectUse__ProjectAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ProjectUse__ProjectAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectUseAccess().getProjectAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjectUse"


    // $ANTLR start "entryRuleDuration"
    // InternalTaskDSL.g:179:1: entryRuleDuration : ruleDuration EOF ;
    public final void entryRuleDuration() throws RecognitionException {
        try {
            // InternalTaskDSL.g:180:1: ( ruleDuration EOF )
            // InternalTaskDSL.g:181:1: ruleDuration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDuration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // InternalTaskDSL.g:188:1: ruleDuration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:192:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalTaskDSL.g:193:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalTaskDSL.g:193:2: ( ( rule__Duration__Group__0 ) )
            // InternalTaskDSL.g:194:3: ( rule__Duration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationAccess().getGroup()); 
            }
            // InternalTaskDSL.g:195:3: ( rule__Duration__Group__0 )
            // InternalTaskDSL.g:195:4: rule__Duration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleAction"
    // InternalTaskDSL.g:204:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:205:1: ( ruleAction EOF )
            // InternalTaskDSL.g:206:1: ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalTaskDSL.g:213:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:217:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalTaskDSL.g:218:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalTaskDSL.g:218:2: ( ( rule__Action__Alternatives ) )
            // InternalTaskDSL.g:219:3: ( rule__Action__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getAlternatives()); 
            }
            // InternalTaskDSL.g:220:3: ( rule__Action__Alternatives )
            // InternalTaskDSL.g:220:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleLunchAction"
    // InternalTaskDSL.g:229:1: entryRuleLunchAction : ruleLunchAction EOF ;
    public final void entryRuleLunchAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:230:1: ( ruleLunchAction EOF )
            // InternalTaskDSL.g:231:1: ruleLunchAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLunchActionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLunchAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLunchActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLunchAction"


    // $ANTLR start "ruleLunchAction"
    // InternalTaskDSL.g:238:1: ruleLunchAction : ( ( rule__LunchAction__Group__0 ) ) ;
    public final void ruleLunchAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:242:2: ( ( ( rule__LunchAction__Group__0 ) ) )
            // InternalTaskDSL.g:243:2: ( ( rule__LunchAction__Group__0 ) )
            {
            // InternalTaskDSL.g:243:2: ( ( rule__LunchAction__Group__0 ) )
            // InternalTaskDSL.g:244:3: ( rule__LunchAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLunchActionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:245:3: ( rule__LunchAction__Group__0 )
            // InternalTaskDSL.g:245:4: rule__LunchAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLunchActionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLunchAction"


    // $ANTLR start "entryRuleMeetingAction"
    // InternalTaskDSL.g:254:1: entryRuleMeetingAction : ruleMeetingAction EOF ;
    public final void entryRuleMeetingAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:255:1: ( ruleMeetingAction EOF )
            // InternalTaskDSL.g:256:1: ruleMeetingAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeetingActionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMeetingAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeetingActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMeetingAction"


    // $ANTLR start "ruleMeetingAction"
    // InternalTaskDSL.g:263:1: ruleMeetingAction : ( ( rule__MeetingAction__Group__0 ) ) ;
    public final void ruleMeetingAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:267:2: ( ( ( rule__MeetingAction__Group__0 ) ) )
            // InternalTaskDSL.g:268:2: ( ( rule__MeetingAction__Group__0 ) )
            {
            // InternalTaskDSL.g:268:2: ( ( rule__MeetingAction__Group__0 ) )
            // InternalTaskDSL.g:269:3: ( rule__MeetingAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeetingActionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:270:3: ( rule__MeetingAction__Group__0 )
            // InternalTaskDSL.g:270:4: rule__MeetingAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeetingActionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeetingAction"


    // $ANTLR start "entryRulePaperAction"
    // InternalTaskDSL.g:279:1: entryRulePaperAction : rulePaperAction EOF ;
    public final void entryRulePaperAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:280:1: ( rulePaperAction EOF )
            // InternalTaskDSL.g:281:1: rulePaperAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaperActionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePaperAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaperActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePaperAction"


    // $ANTLR start "rulePaperAction"
    // InternalTaskDSL.g:288:1: rulePaperAction : ( ( rule__PaperAction__Group__0 ) ) ;
    public final void rulePaperAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:292:2: ( ( ( rule__PaperAction__Group__0 ) ) )
            // InternalTaskDSL.g:293:2: ( ( rule__PaperAction__Group__0 ) )
            {
            // InternalTaskDSL.g:293:2: ( ( rule__PaperAction__Group__0 ) )
            // InternalTaskDSL.g:294:3: ( rule__PaperAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaperActionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:295:3: ( rule__PaperAction__Group__0 )
            // InternalTaskDSL.g:295:4: rule__PaperAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaperActionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePaperAction"


    // $ANTLR start "entryRulePaymentAction"
    // InternalTaskDSL.g:304:1: entryRulePaymentAction : rulePaymentAction EOF ;
    public final void entryRulePaymentAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:305:1: ( rulePaymentAction EOF )
            // InternalTaskDSL.g:306:1: rulePaymentAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePaymentAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePaymentAction"


    // $ANTLR start "rulePaymentAction"
    // InternalTaskDSL.g:313:1: rulePaymentAction : ( ( rule__PaymentAction__Group__0 ) ) ;
    public final void rulePaymentAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:317:2: ( ( ( rule__PaymentAction__Group__0 ) ) )
            // InternalTaskDSL.g:318:2: ( ( rule__PaymentAction__Group__0 ) )
            {
            // InternalTaskDSL.g:318:2: ( ( rule__PaymentAction__Group__0 ) )
            // InternalTaskDSL.g:319:3: ( rule__PaymentAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:320:3: ( rule__PaymentAction__Group__0 )
            // InternalTaskDSL.g:320:4: rule__PaymentAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePaymentAction"


    // $ANTLR start "entryRuleIntExpression"
    // InternalTaskDSL.g:329:1: entryRuleIntExpression : ruleIntExpression EOF ;
    public final void entryRuleIntExpression() throws RecognitionException {
        try {
            // InternalTaskDSL.g:330:1: ( ruleIntExpression EOF )
            // InternalTaskDSL.g:331:1: ruleIntExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIntExpression"


    // $ANTLR start "ruleIntExpression"
    // InternalTaskDSL.g:338:1: ruleIntExpression : ( ruleExpressionLevel1 ) ;
    public final void ruleIntExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:342:2: ( ( ruleExpressionLevel1 ) )
            // InternalTaskDSL.g:343:2: ( ruleExpressionLevel1 )
            {
            // InternalTaskDSL.g:343:2: ( ruleExpressionLevel1 )
            // InternalTaskDSL.g:344:3: ruleExpressionLevel1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntExpressionAccess().getExpressionLevel1ParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntExpressionAccess().getExpressionLevel1ParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntExpression"


    // $ANTLR start "entryRuleExpressionLevel1"
    // InternalTaskDSL.g:354:1: entryRuleExpressionLevel1 : ruleExpressionLevel1 EOF ;
    public final void entryRuleExpressionLevel1() throws RecognitionException {
        try {
            // InternalTaskDSL.g:355:1: ( ruleExpressionLevel1 EOF )
            // InternalTaskDSL.g:356:1: ruleExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionLevel1"


    // $ANTLR start "ruleExpressionLevel1"
    // InternalTaskDSL.g:363:1: ruleExpressionLevel1 : ( ( rule__ExpressionLevel1__Group__0 ) ) ;
    public final void ruleExpressionLevel1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:367:2: ( ( ( rule__ExpressionLevel1__Group__0 ) ) )
            // InternalTaskDSL.g:368:2: ( ( rule__ExpressionLevel1__Group__0 ) )
            {
            // InternalTaskDSL.g:368:2: ( ( rule__ExpressionLevel1__Group__0 ) )
            // InternalTaskDSL.g:369:3: ( rule__ExpressionLevel1__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getGroup()); 
            }
            // InternalTaskDSL.g:370:3: ( rule__ExpressionLevel1__Group__0 )
            // InternalTaskDSL.g:370:4: rule__ExpressionLevel1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel1"


    // $ANTLR start "entryRuleExpressionLevel2"
    // InternalTaskDSL.g:379:1: entryRuleExpressionLevel2 : ruleExpressionLevel2 EOF ;
    public final void entryRuleExpressionLevel2() throws RecognitionException {
        try {
            // InternalTaskDSL.g:380:1: ( ruleExpressionLevel2 EOF )
            // InternalTaskDSL.g:381:1: ruleExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionLevel2"


    // $ANTLR start "ruleExpressionLevel2"
    // InternalTaskDSL.g:388:1: ruleExpressionLevel2 : ( ( rule__ExpressionLevel2__Group__0 ) ) ;
    public final void ruleExpressionLevel2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:392:2: ( ( ( rule__ExpressionLevel2__Group__0 ) ) )
            // InternalTaskDSL.g:393:2: ( ( rule__ExpressionLevel2__Group__0 ) )
            {
            // InternalTaskDSL.g:393:2: ( ( rule__ExpressionLevel2__Group__0 ) )
            // InternalTaskDSL.g:394:3: ( rule__ExpressionLevel2__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getGroup()); 
            }
            // InternalTaskDSL.g:395:3: ( rule__ExpressionLevel2__Group__0 )
            // InternalTaskDSL.g:395:4: rule__ExpressionLevel2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel2"


    // $ANTLR start "entryRuleExpressionLevel3"
    // InternalTaskDSL.g:404:1: entryRuleExpressionLevel3 : ruleExpressionLevel3 EOF ;
    public final void entryRuleExpressionLevel3() throws RecognitionException {
        try {
            // InternalTaskDSL.g:405:1: ( ruleExpressionLevel3 EOF )
            // InternalTaskDSL.g:406:1: ruleExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionLevel3"


    // $ANTLR start "ruleExpressionLevel3"
    // InternalTaskDSL.g:413:1: ruleExpressionLevel3 : ( ( rule__ExpressionLevel3__Group__0 ) ) ;
    public final void ruleExpressionLevel3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:417:2: ( ( ( rule__ExpressionLevel3__Group__0 ) ) )
            // InternalTaskDSL.g:418:2: ( ( rule__ExpressionLevel3__Group__0 ) )
            {
            // InternalTaskDSL.g:418:2: ( ( rule__ExpressionLevel3__Group__0 ) )
            // InternalTaskDSL.g:419:3: ( rule__ExpressionLevel3__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getGroup()); 
            }
            // InternalTaskDSL.g:420:3: ( rule__ExpressionLevel3__Group__0 )
            // InternalTaskDSL.g:420:4: rule__ExpressionLevel3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel3"


    // $ANTLR start "entryRuleExpressionLevel4"
    // InternalTaskDSL.g:429:1: entryRuleExpressionLevel4 : ruleExpressionLevel4 EOF ;
    public final void entryRuleExpressionLevel4() throws RecognitionException {
        try {
            // InternalTaskDSL.g:430:1: ( ruleExpressionLevel4 EOF )
            // InternalTaskDSL.g:431:1: ruleExpressionLevel4 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel4Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel4Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionLevel4"


    // $ANTLR start "ruleExpressionLevel4"
    // InternalTaskDSL.g:438:1: ruleExpressionLevel4 : ( ( rule__ExpressionLevel4__Alternatives ) ) ;
    public final void ruleExpressionLevel4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:442:2: ( ( ( rule__ExpressionLevel4__Alternatives ) ) )
            // InternalTaskDSL.g:443:2: ( ( rule__ExpressionLevel4__Alternatives ) )
            {
            // InternalTaskDSL.g:443:2: ( ( rule__ExpressionLevel4__Alternatives ) )
            // InternalTaskDSL.g:444:3: ( rule__ExpressionLevel4__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel4Access().getAlternatives()); 
            }
            // InternalTaskDSL.g:445:3: ( rule__ExpressionLevel4__Alternatives )
            // InternalTaskDSL.g:445:4: rule__ExpressionLevel4__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel4__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel4Access().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel4"


    // $ANTLR start "entryRuleExpressionMinus"
    // InternalTaskDSL.g:454:1: entryRuleExpressionMinus : ruleExpressionMinus EOF ;
    public final void entryRuleExpressionMinus() throws RecognitionException {
        try {
            // InternalTaskDSL.g:455:1: ( ruleExpressionMinus EOF )
            // InternalTaskDSL.g:456:1: ruleExpressionMinus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionMinus"


    // $ANTLR start "ruleExpressionMinus"
    // InternalTaskDSL.g:463:1: ruleExpressionMinus : ( ( rule__ExpressionMinus__Group__0 ) ) ;
    public final void ruleExpressionMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:467:2: ( ( ( rule__ExpressionMinus__Group__0 ) ) )
            // InternalTaskDSL.g:468:2: ( ( rule__ExpressionMinus__Group__0 ) )
            {
            // InternalTaskDSL.g:468:2: ( ( rule__ExpressionMinus__Group__0 ) )
            // InternalTaskDSL.g:469:3: ( rule__ExpressionMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getGroup()); 
            }
            // InternalTaskDSL.g:470:3: ( rule__ExpressionMinus__Group__0 )
            // InternalTaskDSL.g:470:4: rule__ExpressionMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionMinus"


    // $ANTLR start "entryRuleExpressionPlus"
    // InternalTaskDSL.g:479:1: entryRuleExpressionPlus : ruleExpressionPlus EOF ;
    public final void entryRuleExpressionPlus() throws RecognitionException {
        try {
            // InternalTaskDSL.g:480:1: ( ruleExpressionPlus EOF )
            // InternalTaskDSL.g:481:1: ruleExpressionPlus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionPlus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionPlus"


    // $ANTLR start "ruleExpressionPlus"
    // InternalTaskDSL.g:488:1: ruleExpressionPlus : ( ( rule__ExpressionPlus__Group__0 ) ) ;
    public final void ruleExpressionPlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:492:2: ( ( ( rule__ExpressionPlus__Group__0 ) ) )
            // InternalTaskDSL.g:493:2: ( ( rule__ExpressionPlus__Group__0 ) )
            {
            // InternalTaskDSL.g:493:2: ( ( rule__ExpressionPlus__Group__0 ) )
            // InternalTaskDSL.g:494:3: ( rule__ExpressionPlus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getGroup()); 
            }
            // InternalTaskDSL.g:495:3: ( rule__ExpressionPlus__Group__0 )
            // InternalTaskDSL.g:495:4: rule__ExpressionPlus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionPlus"


    // $ANTLR start "entryRuleExpressionLevel5"
    // InternalTaskDSL.g:504:1: entryRuleExpressionLevel5 : ruleExpressionLevel5 EOF ;
    public final void entryRuleExpressionLevel5() throws RecognitionException {
        try {
            // InternalTaskDSL.g:505:1: ( ruleExpressionLevel5 EOF )
            // InternalTaskDSL.g:506:1: ruleExpressionLevel5 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel5Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel5Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionLevel5"


    // $ANTLR start "ruleExpressionLevel5"
    // InternalTaskDSL.g:513:1: ruleExpressionLevel5 : ( ( rule__ExpressionLevel5__Alternatives ) ) ;
    public final void ruleExpressionLevel5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:517:2: ( ( ( rule__ExpressionLevel5__Alternatives ) ) )
            // InternalTaskDSL.g:518:2: ( ( rule__ExpressionLevel5__Alternatives ) )
            {
            // InternalTaskDSL.g:518:2: ( ( rule__ExpressionLevel5__Alternatives ) )
            // InternalTaskDSL.g:519:3: ( rule__ExpressionLevel5__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel5Access().getAlternatives()); 
            }
            // InternalTaskDSL.g:520:3: ( rule__ExpressionLevel5__Alternatives )
            // InternalTaskDSL.g:520:4: rule__ExpressionLevel5__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel5Access().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel5"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalTaskDSL.g:529:1: entryRuleExpressionBracket : ruleExpressionBracket EOF ;
    public final void entryRuleExpressionBracket() throws RecognitionException {
        try {
            // InternalTaskDSL.g:530:1: ( ruleExpressionBracket EOF )
            // InternalTaskDSL.g:531:1: ruleExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionBracket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionBracket"


    // $ANTLR start "ruleExpressionBracket"
    // InternalTaskDSL.g:538:1: ruleExpressionBracket : ( ( rule__ExpressionBracket__Group__0 ) ) ;
    public final void ruleExpressionBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:542:2: ( ( ( rule__ExpressionBracket__Group__0 ) ) )
            // InternalTaskDSL.g:543:2: ( ( rule__ExpressionBracket__Group__0 ) )
            {
            // InternalTaskDSL.g:543:2: ( ( rule__ExpressionBracket__Group__0 ) )
            // InternalTaskDSL.g:544:3: ( rule__ExpressionBracket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getGroup()); 
            }
            // InternalTaskDSL.g:545:3: ( rule__ExpressionBracket__Group__0 )
            // InternalTaskDSL.g:545:4: rule__ExpressionBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleExpressionConstantInt"
    // InternalTaskDSL.g:554:1: entryRuleExpressionConstantInt : ruleExpressionConstantInt EOF ;
    public final void entryRuleExpressionConstantInt() throws RecognitionException {
        try {
            // InternalTaskDSL.g:555:1: ( ruleExpressionConstantInt EOF )
            // InternalTaskDSL.g:556:1: ruleExpressionConstantInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantIntRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionConstantInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantIntRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionConstantInt"


    // $ANTLR start "ruleExpressionConstantInt"
    // InternalTaskDSL.g:563:1: ruleExpressionConstantInt : ( ( rule__ExpressionConstantInt__ValueAssignment ) ) ;
    public final void ruleExpressionConstantInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:567:2: ( ( ( rule__ExpressionConstantInt__ValueAssignment ) ) )
            // InternalTaskDSL.g:568:2: ( ( rule__ExpressionConstantInt__ValueAssignment ) )
            {
            // InternalTaskDSL.g:568:2: ( ( rule__ExpressionConstantInt__ValueAssignment ) )
            // InternalTaskDSL.g:569:3: ( rule__ExpressionConstantInt__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantIntAccess().getValueAssignment()); 
            }
            // InternalTaskDSL.g:570:3: ( rule__ExpressionConstantInt__ValueAssignment )
            // InternalTaskDSL.g:570:4: rule__ExpressionConstantInt__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionConstantInt__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantIntAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionConstantInt"


    // $ANTLR start "entryRuleExpressionBalance"
    // InternalTaskDSL.g:579:1: entryRuleExpressionBalance : ruleExpressionBalance EOF ;
    public final void entryRuleExpressionBalance() throws RecognitionException {
        try {
            // InternalTaskDSL.g:580:1: ( ruleExpressionBalance EOF )
            // InternalTaskDSL.g:581:1: ruleExpressionBalance EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBalanceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionBalance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBalanceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionBalance"


    // $ANTLR start "ruleExpressionBalance"
    // InternalTaskDSL.g:588:1: ruleExpressionBalance : ( ( rule__ExpressionBalance__ValueAssignment ) ) ;
    public final void ruleExpressionBalance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:592:2: ( ( ( rule__ExpressionBalance__ValueAssignment ) ) )
            // InternalTaskDSL.g:593:2: ( ( rule__ExpressionBalance__ValueAssignment ) )
            {
            // InternalTaskDSL.g:593:2: ( ( rule__ExpressionBalance__ValueAssignment ) )
            // InternalTaskDSL.g:594:3: ( rule__ExpressionBalance__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBalanceAccess().getValueAssignment()); 
            }
            // InternalTaskDSL.g:595:3: ( rule__ExpressionBalance__ValueAssignment )
            // InternalTaskDSL.g:595:4: rule__ExpressionBalance__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBalance__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBalanceAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionBalance"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalTaskDSL.g:604:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // InternalTaskDSL.g:605:1: ( ruleBooleanExpression EOF )
            // InternalTaskDSL.g:606:1: ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalTaskDSL.g:613:1: ruleBooleanExpression : ( ruleBooleanExpressionLevel1 ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:617:2: ( ( ruleBooleanExpressionLevel1 ) )
            // InternalTaskDSL.g:618:2: ( ruleBooleanExpressionLevel1 )
            {
            // InternalTaskDSL.g:618:2: ( ruleBooleanExpressionLevel1 )
            // InternalTaskDSL.g:619:3: ruleBooleanExpressionLevel1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionLevel1ParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionLevel1ParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel1"
    // InternalTaskDSL.g:629:1: entryRuleBooleanExpressionLevel1 : ruleBooleanExpressionLevel1 EOF ;
    public final void entryRuleBooleanExpressionLevel1() throws RecognitionException {
        try {
            // InternalTaskDSL.g:630:1: ( ruleBooleanExpressionLevel1 EOF )
            // InternalTaskDSL.g:631:1: ruleBooleanExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpressionLevel1"


    // $ANTLR start "ruleBooleanExpressionLevel1"
    // InternalTaskDSL.g:638:1: ruleBooleanExpressionLevel1 : ( ( rule__BooleanExpressionLevel1__Group__0 ) ) ;
    public final void ruleBooleanExpressionLevel1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:642:2: ( ( ( rule__BooleanExpressionLevel1__Group__0 ) ) )
            // InternalTaskDSL.g:643:2: ( ( rule__BooleanExpressionLevel1__Group__0 ) )
            {
            // InternalTaskDSL.g:643:2: ( ( rule__BooleanExpressionLevel1__Group__0 ) )
            // InternalTaskDSL.g:644:3: ( rule__BooleanExpressionLevel1__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getGroup()); 
            }
            // InternalTaskDSL.g:645:3: ( rule__BooleanExpressionLevel1__Group__0 )
            // InternalTaskDSL.g:645:4: rule__BooleanExpressionLevel1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpressionLevel1"


    // $ANTLR start "entryRuleBooleanExpressionLevel2"
    // InternalTaskDSL.g:654:1: entryRuleBooleanExpressionLevel2 : ruleBooleanExpressionLevel2 EOF ;
    public final void entryRuleBooleanExpressionLevel2() throws RecognitionException {
        try {
            // InternalTaskDSL.g:655:1: ( ruleBooleanExpressionLevel2 EOF )
            // InternalTaskDSL.g:656:1: ruleBooleanExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel2Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpressionLevel2"


    // $ANTLR start "ruleBooleanExpressionLevel2"
    // InternalTaskDSL.g:663:1: ruleBooleanExpressionLevel2 : ( ( rule__BooleanExpressionLevel2__Alternatives ) ) ;
    public final void ruleBooleanExpressionLevel2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:667:2: ( ( ( rule__BooleanExpressionLevel2__Alternatives ) ) )
            // InternalTaskDSL.g:668:2: ( ( rule__BooleanExpressionLevel2__Alternatives ) )
            {
            // InternalTaskDSL.g:668:2: ( ( rule__BooleanExpressionLevel2__Alternatives ) )
            // InternalTaskDSL.g:669:3: ( rule__BooleanExpressionLevel2__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel2Access().getAlternatives()); 
            }
            // InternalTaskDSL.g:670:3: ( rule__BooleanExpressionLevel2__Alternatives )
            // InternalTaskDSL.g:670:4: rule__BooleanExpressionLevel2__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel2__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel2Access().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpressionLevel2"


    // $ANTLR start "entryRuleNotExpression"
    // InternalTaskDSL.g:679:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // InternalTaskDSL.g:680:1: ( ruleNotExpression EOF )
            // InternalTaskDSL.g:681:1: ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNotExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalTaskDSL.g:688:1: ruleNotExpression : ( ( rule__NotExpression__Group__0 ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:692:2: ( ( ( rule__NotExpression__Group__0 ) ) )
            // InternalTaskDSL.g:693:2: ( ( rule__NotExpression__Group__0 ) )
            {
            // InternalTaskDSL.g:693:2: ( ( rule__NotExpression__Group__0 ) )
            // InternalTaskDSL.g:694:3: ( rule__NotExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:695:3: ( rule__NotExpression__Group__0 )
            // InternalTaskDSL.g:695:4: rule__NotExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel3"
    // InternalTaskDSL.g:704:1: entryRuleBooleanExpressionLevel3 : ruleBooleanExpressionLevel3 EOF ;
    public final void entryRuleBooleanExpressionLevel3() throws RecognitionException {
        try {
            // InternalTaskDSL.g:705:1: ( ruleBooleanExpressionLevel3 EOF )
            // InternalTaskDSL.g:706:1: ruleBooleanExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel3Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpressionLevel3"


    // $ANTLR start "ruleBooleanExpressionLevel3"
    // InternalTaskDSL.g:713:1: ruleBooleanExpressionLevel3 : ( ( rule__BooleanExpressionLevel3__Alternatives ) ) ;
    public final void ruleBooleanExpressionLevel3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:717:2: ( ( ( rule__BooleanExpressionLevel3__Alternatives ) ) )
            // InternalTaskDSL.g:718:2: ( ( rule__BooleanExpressionLevel3__Alternatives ) )
            {
            // InternalTaskDSL.g:718:2: ( ( rule__BooleanExpressionLevel3__Alternatives ) )
            // InternalTaskDSL.g:719:3: ( rule__BooleanExpressionLevel3__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel3Access().getAlternatives()); 
            }
            // InternalTaskDSL.g:720:3: ( rule__BooleanExpressionLevel3__Alternatives )
            // InternalTaskDSL.g:720:4: rule__BooleanExpressionLevel3__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel3__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel3Access().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpressionLevel3"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalTaskDSL.g:729:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalTaskDSL.g:730:1: ( ruleComparisonExpression EOF )
            // InternalTaskDSL.g:731:1: ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalTaskDSL.g:738:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:742:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalTaskDSL.g:743:2: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalTaskDSL.g:743:2: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalTaskDSL.g:744:3: ( rule__ComparisonExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:745:3: ( rule__ComparisonExpression__Group__0 )
            // InternalTaskDSL.g:745:4: rule__ComparisonExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleBooleanExpressionBracket"
    // InternalTaskDSL.g:754:1: entryRuleBooleanExpressionBracket : ruleBooleanExpressionBracket EOF ;
    public final void entryRuleBooleanExpressionBracket() throws RecognitionException {
        try {
            // InternalTaskDSL.g:755:1: ( ruleBooleanExpressionBracket EOF )
            // InternalTaskDSL.g:756:1: ruleBooleanExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionBracket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpressionBracket"


    // $ANTLR start "ruleBooleanExpressionBracket"
    // InternalTaskDSL.g:763:1: ruleBooleanExpressionBracket : ( ( rule__BooleanExpressionBracket__Group__0 ) ) ;
    public final void ruleBooleanExpressionBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:767:2: ( ( ( rule__BooleanExpressionBracket__Group__0 ) ) )
            // InternalTaskDSL.g:768:2: ( ( rule__BooleanExpressionBracket__Group__0 ) )
            {
            // InternalTaskDSL.g:768:2: ( ( rule__BooleanExpressionBracket__Group__0 ) )
            // InternalTaskDSL.g:769:3: ( rule__BooleanExpressionBracket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getGroup()); 
            }
            // InternalTaskDSL.g:770:3: ( rule__BooleanExpressionBracket__Group__0 )
            // InternalTaskDSL.g:770:4: rule__BooleanExpressionBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpressionBracket"


    // $ANTLR start "entryRuleBooleanExpressionConstant"
    // InternalTaskDSL.g:779:1: entryRuleBooleanExpressionConstant : ruleBooleanExpressionConstant EOF ;
    public final void entryRuleBooleanExpressionConstant() throws RecognitionException {
        try {
            // InternalTaskDSL.g:780:1: ( ruleBooleanExpressionConstant EOF )
            // InternalTaskDSL.g:781:1: ruleBooleanExpressionConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionConstantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpressionConstant"


    // $ANTLR start "ruleBooleanExpressionConstant"
    // InternalTaskDSL.g:788:1: ruleBooleanExpressionConstant : ( ( rule__BooleanExpressionConstant__ValueAssignment ) ) ;
    public final void ruleBooleanExpressionConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:792:2: ( ( ( rule__BooleanExpressionConstant__ValueAssignment ) ) )
            // InternalTaskDSL.g:793:2: ( ( rule__BooleanExpressionConstant__ValueAssignment ) )
            {
            // InternalTaskDSL.g:793:2: ( ( rule__BooleanExpressionConstant__ValueAssignment ) )
            // InternalTaskDSL.g:794:3: ( rule__BooleanExpressionConstant__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionConstantAccess().getValueAssignment()); 
            }
            // InternalTaskDSL.g:795:3: ( rule__BooleanExpressionConstant__ValueAssignment )
            // InternalTaskDSL.g:795:4: rule__BooleanExpressionConstant__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionConstant__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionConstantAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpressionConstant"


    // $ANTLR start "ruleTimeUnit"
    // InternalTaskDSL.g:804:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:808:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalTaskDSL.g:809:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalTaskDSL.g:809:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalTaskDSL.g:810:3: ( rule__TimeUnit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            }
            // InternalTaskDSL.g:811:3: ( rule__TimeUnit__Alternatives )
            // InternalTaskDSL.g:811:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleBalance"
    // InternalTaskDSL.g:820:1: ruleBalance : ( ( 'balance' ) ) ;
    public final void ruleBalance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:824:1: ( ( ( 'balance' ) ) )
            // InternalTaskDSL.g:825:2: ( ( 'balance' ) )
            {
            // InternalTaskDSL.g:825:2: ( ( 'balance' ) )
            // InternalTaskDSL.g:826:3: ( 'balance' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBalanceAccess().getBALANCEEnumLiteralDeclaration()); 
            }
            // InternalTaskDSL.g:827:3: ( 'balance' )
            // InternalTaskDSL.g:827:4: 'balance'
            {
            match(input,12,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBalanceAccess().getBALANCEEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBalance"


    // $ANTLR start "ruleBinaryBooleanOperator"
    // InternalTaskDSL.g:836:1: ruleBinaryBooleanOperator : ( ( rule__BinaryBooleanOperator__Alternatives ) ) ;
    public final void ruleBinaryBooleanOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:840:1: ( ( ( rule__BinaryBooleanOperator__Alternatives ) ) )
            // InternalTaskDSL.g:841:2: ( ( rule__BinaryBooleanOperator__Alternatives ) )
            {
            // InternalTaskDSL.g:841:2: ( ( rule__BinaryBooleanOperator__Alternatives ) )
            // InternalTaskDSL.g:842:3: ( rule__BinaryBooleanOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryBooleanOperatorAccess().getAlternatives()); 
            }
            // InternalTaskDSL.g:843:3: ( rule__BinaryBooleanOperator__Alternatives )
            // InternalTaskDSL.g:843:4: rule__BinaryBooleanOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBooleanOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryBooleanOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryBooleanOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalTaskDSL.g:852:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:856:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalTaskDSL.g:857:2: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalTaskDSL.g:857:2: ( ( rule__CompareOperator__Alternatives ) )
            // InternalTaskDSL.g:858:3: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalTaskDSL.g:859:3: ( rule__CompareOperator__Alternatives )
            // InternalTaskDSL.g:859:4: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rule__Planning__Alternatives_3"
    // InternalTaskDSL.g:867:1: rule__Planning__Alternatives_3 : ( ( ( rule__Planning__PersonsAssignment_3_0 ) ) | ( ( rule__Planning__TasksAssignment_3_1 ) ) );
    public final void rule__Planning__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:871:1: ( ( ( rule__Planning__PersonsAssignment_3_0 ) ) | ( ( rule__Planning__TasksAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTaskDSL.g:872:2: ( ( rule__Planning__PersonsAssignment_3_0 ) )
                    {
                    // InternalTaskDSL.g:872:2: ( ( rule__Planning__PersonsAssignment_3_0 ) )
                    // InternalTaskDSL.g:873:3: ( rule__Planning__PersonsAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlanningAccess().getPersonsAssignment_3_0()); 
                    }
                    // InternalTaskDSL.g:874:3: ( rule__Planning__PersonsAssignment_3_0 )
                    // InternalTaskDSL.g:874:4: rule__Planning__PersonsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Planning__PersonsAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlanningAccess().getPersonsAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:878:2: ( ( rule__Planning__TasksAssignment_3_1 ) )
                    {
                    // InternalTaskDSL.g:878:2: ( ( rule__Planning__TasksAssignment_3_1 ) )
                    // InternalTaskDSL.g:879:3: ( rule__Planning__TasksAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlanningAccess().getTasksAssignment_3_1()); 
                    }
                    // InternalTaskDSL.g:880:3: ( rule__Planning__TasksAssignment_3_1 )
                    // InternalTaskDSL.g:880:4: rule__Planning__TasksAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Planning__TasksAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlanningAccess().getTasksAssignment_3_1()); 
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
    // $ANTLR end "rule__Planning__Alternatives_3"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalTaskDSL.g:888:1: rule__Action__Alternatives : ( ( ruleLunchAction ) | ( ruleMeetingAction ) | ( rulePaperAction ) | ( rulePaymentAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:892:1: ( ( ruleLunchAction ) | ( ruleMeetingAction ) | ( rulePaperAction ) | ( rulePaymentAction ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt2=1;
                }
                break;
            case 35:
                {
                alt2=2;
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            case 37:
            case 39:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTaskDSL.g:893:2: ( ruleLunchAction )
                    {
                    // InternalTaskDSL.g:893:2: ( ruleLunchAction )
                    // InternalTaskDSL.g:894:3: ruleLunchAction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLunchAction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:899:2: ( ruleMeetingAction )
                    {
                    // InternalTaskDSL.g:899:2: ( ruleMeetingAction )
                    // InternalTaskDSL.g:900:3: ruleMeetingAction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMeetingAction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:905:2: ( rulePaperAction )
                    {
                    // InternalTaskDSL.g:905:2: ( rulePaperAction )
                    // InternalTaskDSL.g:906:3: rulePaperAction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePaperAction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:911:2: ( rulePaymentAction )
                    {
                    // InternalTaskDSL.g:911:2: ( rulePaymentAction )
                    // InternalTaskDSL.g:912:3: rulePaymentAction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePaymentAction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3()); 
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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__ExpressionLevel1__Alternatives_1"
    // InternalTaskDSL.g:921:1: rule__ExpressionLevel1__Alternatives_1 : ( ( ( rule__ExpressionLevel1__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel1__Group_1_1__0 ) ) );
    public final void rule__ExpressionLevel1__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:925:1: ( ( ( rule__ExpressionLevel1__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel1__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==40) ) {
                alt3=1;
            }
            else if ( (LA3_0==41) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTaskDSL.g:926:2: ( ( rule__ExpressionLevel1__Group_1_0__0 ) )
                    {
                    // InternalTaskDSL.g:926:2: ( ( rule__ExpressionLevel1__Group_1_0__0 ) )
                    // InternalTaskDSL.g:927:3: ( rule__ExpressionLevel1__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel1Access().getGroup_1_0()); 
                    }
                    // InternalTaskDSL.g:928:3: ( rule__ExpressionLevel1__Group_1_0__0 )
                    // InternalTaskDSL.g:928:4: rule__ExpressionLevel1__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel1__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel1Access().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:932:2: ( ( rule__ExpressionLevel1__Group_1_1__0 ) )
                    {
                    // InternalTaskDSL.g:932:2: ( ( rule__ExpressionLevel1__Group_1_1__0 ) )
                    // InternalTaskDSL.g:933:3: ( rule__ExpressionLevel1__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel1Access().getGroup_1_1()); 
                    }
                    // InternalTaskDSL.g:934:3: ( rule__ExpressionLevel1__Group_1_1__0 )
                    // InternalTaskDSL.g:934:4: rule__ExpressionLevel1__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel1__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel1Access().getGroup_1_1()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Alternatives_1"


    // $ANTLR start "rule__ExpressionLevel2__Alternatives_1"
    // InternalTaskDSL.g:942:1: rule__ExpressionLevel2__Alternatives_1 : ( ( ( rule__ExpressionLevel2__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_1__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_2__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_3__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_4__0 ) ) );
    public final void rule__ExpressionLevel2__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:946:1: ( ( ( rule__ExpressionLevel2__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_1__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_2__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_3__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_4__0 ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt4=1;
                }
                break;
            case 43:
                {
                alt4=2;
                }
                break;
            case 44:
                {
                alt4=3;
                }
                break;
            case 13:
                {
                alt4=4;
                }
                break;
            case 45:
                {
                alt4=5;
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
                    // InternalTaskDSL.g:947:2: ( ( rule__ExpressionLevel2__Group_1_0__0 ) )
                    {
                    // InternalTaskDSL.g:947:2: ( ( rule__ExpressionLevel2__Group_1_0__0 ) )
                    // InternalTaskDSL.g:948:3: ( rule__ExpressionLevel2__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_0()); 
                    }
                    // InternalTaskDSL.g:949:3: ( rule__ExpressionLevel2__Group_1_0__0 )
                    // InternalTaskDSL.g:949:4: rule__ExpressionLevel2__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:953:2: ( ( rule__ExpressionLevel2__Group_1_1__0 ) )
                    {
                    // InternalTaskDSL.g:953:2: ( ( rule__ExpressionLevel2__Group_1_1__0 ) )
                    // InternalTaskDSL.g:954:3: ( rule__ExpressionLevel2__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_1()); 
                    }
                    // InternalTaskDSL.g:955:3: ( rule__ExpressionLevel2__Group_1_1__0 )
                    // InternalTaskDSL.g:955:4: rule__ExpressionLevel2__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:959:2: ( ( rule__ExpressionLevel2__Group_1_2__0 ) )
                    {
                    // InternalTaskDSL.g:959:2: ( ( rule__ExpressionLevel2__Group_1_2__0 ) )
                    // InternalTaskDSL.g:960:3: ( rule__ExpressionLevel2__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_2()); 
                    }
                    // InternalTaskDSL.g:961:3: ( rule__ExpressionLevel2__Group_1_2__0 )
                    // InternalTaskDSL.g:961:4: rule__ExpressionLevel2__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:965:2: ( ( rule__ExpressionLevel2__Group_1_3__0 ) )
                    {
                    // InternalTaskDSL.g:965:2: ( ( rule__ExpressionLevel2__Group_1_3__0 ) )
                    // InternalTaskDSL.g:966:3: ( rule__ExpressionLevel2__Group_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_3()); 
                    }
                    // InternalTaskDSL.g:967:3: ( rule__ExpressionLevel2__Group_1_3__0 )
                    // InternalTaskDSL.g:967:4: rule__ExpressionLevel2__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTaskDSL.g:971:2: ( ( rule__ExpressionLevel2__Group_1_4__0 ) )
                    {
                    // InternalTaskDSL.g:971:2: ( ( rule__ExpressionLevel2__Group_1_4__0 ) )
                    // InternalTaskDSL.g:972:3: ( rule__ExpressionLevel2__Group_1_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_4()); 
                    }
                    // InternalTaskDSL.g:973:3: ( rule__ExpressionLevel2__Group_1_4__0 )
                    // InternalTaskDSL.g:973:4: rule__ExpressionLevel2__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_4()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Alternatives_1"


    // $ANTLR start "rule__ExpressionLevel4__Alternatives"
    // InternalTaskDSL.g:981:1: rule__ExpressionLevel4__Alternatives : ( ( ruleExpressionMinus ) | ( ruleExpressionPlus ) | ( ruleExpressionLevel5 ) );
    public final void rule__ExpressionLevel4__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:985:1: ( ( ruleExpressionMinus ) | ( ruleExpressionPlus ) | ( ruleExpressionLevel5 ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt5=1;
                }
                break;
            case 40:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
            case 12:
            case 47:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTaskDSL.g:986:2: ( ruleExpressionMinus )
                    {
                    // InternalTaskDSL.g:986:2: ( ruleExpressionMinus )
                    // InternalTaskDSL.g:987:3: ruleExpressionMinus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel4Access().getExpressionMinusParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionMinus();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel4Access().getExpressionMinusParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:992:2: ( ruleExpressionPlus )
                    {
                    // InternalTaskDSL.g:992:2: ( ruleExpressionPlus )
                    // InternalTaskDSL.g:993:3: ruleExpressionPlus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel4Access().getExpressionPlusParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionPlus();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel4Access().getExpressionPlusParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:998:2: ( ruleExpressionLevel5 )
                    {
                    // InternalTaskDSL.g:998:2: ( ruleExpressionLevel5 )
                    // InternalTaskDSL.g:999:3: ruleExpressionLevel5
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionLevel5();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_2()); 
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
    // $ANTLR end "rule__ExpressionLevel4__Alternatives"


    // $ANTLR start "rule__ExpressionLevel5__Alternatives"
    // InternalTaskDSL.g:1008:1: rule__ExpressionLevel5__Alternatives : ( ( ruleExpressionBracket ) | ( ruleExpressionConstantInt ) | ( ruleExpressionBalance ) );
    public final void rule__ExpressionLevel5__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1012:1: ( ( ruleExpressionBracket ) | ( ruleExpressionConstantInt ) | ( ruleExpressionBalance ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case 12:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTaskDSL.g:1013:2: ( ruleExpressionBracket )
                    {
                    // InternalTaskDSL.g:1013:2: ( ruleExpressionBracket )
                    // InternalTaskDSL.g:1014:3: ruleExpressionBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel5Access().getExpressionBracketParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionBracket();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel5Access().getExpressionBracketParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1019:2: ( ruleExpressionConstantInt )
                    {
                    // InternalTaskDSL.g:1019:2: ( ruleExpressionConstantInt )
                    // InternalTaskDSL.g:1020:3: ruleExpressionConstantInt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel5Access().getExpressionConstantIntParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionConstantInt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel5Access().getExpressionConstantIntParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1025:2: ( ruleExpressionBalance )
                    {
                    // InternalTaskDSL.g:1025:2: ( ruleExpressionBalance )
                    // InternalTaskDSL.g:1026:3: ruleExpressionBalance
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel5Access().getExpressionBalanceParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionBalance();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel5Access().getExpressionBalanceParserRuleCall_2()); 
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
    // $ANTLR end "rule__ExpressionLevel5__Alternatives"


    // $ANTLR start "rule__BooleanExpressionLevel2__Alternatives"
    // InternalTaskDSL.g:1035:1: rule__BooleanExpressionLevel2__Alternatives : ( ( ruleNotExpression ) | ( ruleBooleanExpressionLevel3 ) );
    public final void rule__BooleanExpressionLevel2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1039:1: ( ( ruleNotExpression ) | ( ruleBooleanExpressionLevel3 ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==49) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT||LA7_0==RULE_BOOL_LITERAL||LA7_0==12||(LA7_0>=40 && LA7_0<=41)||LA7_0==47) ) {
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
                    // InternalTaskDSL.g:1040:2: ( ruleNotExpression )
                    {
                    // InternalTaskDSL.g:1040:2: ( ruleNotExpression )
                    // InternalTaskDSL.g:1041:3: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel2Access().getNotExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel2Access().getNotExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1046:2: ( ruleBooleanExpressionLevel3 )
                    {
                    // InternalTaskDSL.g:1046:2: ( ruleBooleanExpressionLevel3 )
                    // InternalTaskDSL.g:1047:3: ruleBooleanExpressionLevel3
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel2Access().getBooleanExpressionLevel3ParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpressionLevel3();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel2Access().getBooleanExpressionLevel3ParserRuleCall_1()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel2__Alternatives"


    // $ANTLR start "rule__BooleanExpressionLevel3__Alternatives"
    // InternalTaskDSL.g:1056:1: rule__BooleanExpressionLevel3__Alternatives : ( ( ( ruleComparisonExpression ) ) | ( ruleBooleanExpressionBracket ) | ( ruleBooleanExpressionConstant ) );
    public final void rule__BooleanExpressionLevel3__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1060:1: ( ( ( ruleComparisonExpression ) ) | ( ruleBooleanExpressionBracket ) | ( ruleBooleanExpressionConstant ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 12:
            case 40:
            case 41:
                {
                alt8=1;
                }
                break;
            case 47:
                {
                int LA8_3 = input.LA(2);

                if ( (synpred15_InternalTaskDSL()) ) {
                    alt8=1;
                }
                else if ( (synpred16_InternalTaskDSL()) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOL_LITERAL:
                {
                alt8=3;
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
                    // InternalTaskDSL.g:1061:2: ( ( ruleComparisonExpression ) )
                    {
                    // InternalTaskDSL.g:1061:2: ( ( ruleComparisonExpression ) )
                    // InternalTaskDSL.g:1062:3: ( ruleComparisonExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0()); 
                    }
                    // InternalTaskDSL.g:1063:3: ( ruleComparisonExpression )
                    // InternalTaskDSL.g:1063:4: ruleComparisonExpression
                    {
                    pushFollow(FOLLOW_2);
                    ruleComparisonExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1067:2: ( ruleBooleanExpressionBracket )
                    {
                    // InternalTaskDSL.g:1067:2: ( ruleBooleanExpressionBracket )
                    // InternalTaskDSL.g:1068:3: ruleBooleanExpressionBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpressionBracket();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1073:2: ( ruleBooleanExpressionConstant )
                    {
                    // InternalTaskDSL.g:1073:2: ( ruleBooleanExpressionConstant )
                    // InternalTaskDSL.g:1074:3: ruleBooleanExpressionConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionConstantParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpressionConstant();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionConstantParserRuleCall_2()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel3__Alternatives"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalTaskDSL.g:1083:1: rule__TimeUnit__Alternatives : ( ( ( 'min' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1087:1: ( ( ( 'min' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt9=1;
                }
                break;
            case 14:
                {
                alt9=2;
                }
                break;
            case 15:
                {
                alt9=3;
                }
                break;
            case 16:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTaskDSL.g:1088:2: ( ( 'min' ) )
                    {
                    // InternalTaskDSL.g:1088:2: ( ( 'min' ) )
                    // InternalTaskDSL.g:1089:3: ( 'min' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0()); 
                    }
                    // InternalTaskDSL.g:1090:3: ( 'min' )
                    // InternalTaskDSL.g:1090:4: 'min'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1094:2: ( ( 'hour' ) )
                    {
                    // InternalTaskDSL.g:1094:2: ( ( 'hour' ) )
                    // InternalTaskDSL.g:1095:3: ( 'hour' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1()); 
                    }
                    // InternalTaskDSL.g:1096:3: ( 'hour' )
                    // InternalTaskDSL.g:1096:4: 'hour'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1100:2: ( ( 'day' ) )
                    {
                    // InternalTaskDSL.g:1100:2: ( ( 'day' ) )
                    // InternalTaskDSL.g:1101:3: ( 'day' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2()); 
                    }
                    // InternalTaskDSL.g:1102:3: ( 'day' )
                    // InternalTaskDSL.g:1102:4: 'day'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:1106:2: ( ( 'week' ) )
                    {
                    // InternalTaskDSL.g:1106:2: ( ( 'week' ) )
                    // InternalTaskDSL.g:1107:3: ( 'week' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3()); 
                    }
                    // InternalTaskDSL.g:1108:3: ( 'week' )
                    // InternalTaskDSL.g:1108:4: 'week'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3()); 
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
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__BinaryBooleanOperator__Alternatives"
    // InternalTaskDSL.g:1116:1: rule__BinaryBooleanOperator__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryBooleanOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1120:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            else if ( (LA10_0==18) ) {
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
                    // InternalTaskDSL.g:1121:2: ( ( 'AND' ) )
                    {
                    // InternalTaskDSL.g:1121:2: ( ( 'AND' ) )
                    // InternalTaskDSL.g:1122:3: ( 'AND' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalTaskDSL.g:1123:3: ( 'AND' )
                    // InternalTaskDSL.g:1123:4: 'AND'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1127:2: ( ( 'OR' ) )
                    {
                    // InternalTaskDSL.g:1127:2: ( ( 'OR' ) )
                    // InternalTaskDSL.g:1128:3: ( 'OR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalTaskDSL.g:1129:3: ( 'OR' )
                    // InternalTaskDSL.g:1129:4: 'OR'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__BinaryBooleanOperator__Alternatives"


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // InternalTaskDSL.g:1137:1: rule__CompareOperator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1141:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case 21:
                {
                alt11=3;
                }
                break;
            case 22:
                {
                alt11=4;
                }
                break;
            case 23:
                {
                alt11=5;
                }
                break;
            case 24:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTaskDSL.g:1142:2: ( ( '==' ) )
                    {
                    // InternalTaskDSL.g:1142:2: ( ( '==' ) )
                    // InternalTaskDSL.g:1143:3: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalTaskDSL.g:1144:3: ( '==' )
                    // InternalTaskDSL.g:1144:4: '=='
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1148:2: ( ( '!=' ) )
                    {
                    // InternalTaskDSL.g:1148:2: ( ( '!=' ) )
                    // InternalTaskDSL.g:1149:3: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1()); 
                    }
                    // InternalTaskDSL.g:1150:3: ( '!=' )
                    // InternalTaskDSL.g:1150:4: '!='
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1154:2: ( ( '>=' ) )
                    {
                    // InternalTaskDSL.g:1154:2: ( ( '>=' ) )
                    // InternalTaskDSL.g:1155:3: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 
                    }
                    // InternalTaskDSL.g:1156:3: ( '>=' )
                    // InternalTaskDSL.g:1156:4: '>='
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:1160:2: ( ( '>' ) )
                    {
                    // InternalTaskDSL.g:1160:2: ( ( '>' ) )
                    // InternalTaskDSL.g:1161:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3()); 
                    }
                    // InternalTaskDSL.g:1162:3: ( '>' )
                    // InternalTaskDSL.g:1162:4: '>'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTaskDSL.g:1166:2: ( ( '<=' ) )
                    {
                    // InternalTaskDSL.g:1166:2: ( ( '<=' ) )
                    // InternalTaskDSL.g:1167:3: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4()); 
                    }
                    // InternalTaskDSL.g:1168:3: ( '<=' )
                    // InternalTaskDSL.g:1168:4: '<='
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTaskDSL.g:1172:2: ( ( '<' ) )
                    {
                    // InternalTaskDSL.g:1172:2: ( ( '<' ) )
                    // InternalTaskDSL.g:1173:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5()); 
                    }
                    // InternalTaskDSL.g:1174:3: ( '<' )
                    // InternalTaskDSL.g:1174:4: '<'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5()); 
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
    // $ANTLR end "rule__CompareOperator__Alternatives"


    // $ANTLR start "rule__Planning__Group__0"
    // InternalTaskDSL.g:1182:1: rule__Planning__Group__0 : rule__Planning__Group__0__Impl rule__Planning__Group__1 ;
    public final void rule__Planning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1186:1: ( rule__Planning__Group__0__Impl rule__Planning__Group__1 )
            // InternalTaskDSL.g:1187:2: rule__Planning__Group__0__Impl rule__Planning__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Planning__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Planning__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__0"


    // $ANTLR start "rule__Planning__Group__0__Impl"
    // InternalTaskDSL.g:1194:1: rule__Planning__Group__0__Impl : ( 'Planning' ) ;
    public final void rule__Planning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1198:1: ( ( 'Planning' ) )
            // InternalTaskDSL.g:1199:1: ( 'Planning' )
            {
            // InternalTaskDSL.g:1199:1: ( 'Planning' )
            // InternalTaskDSL.g:1200:2: 'Planning'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getPlanningKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getPlanningKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__0__Impl"


    // $ANTLR start "rule__Planning__Group__1"
    // InternalTaskDSL.g:1209:1: rule__Planning__Group__1 : rule__Planning__Group__1__Impl rule__Planning__Group__2 ;
    public final void rule__Planning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1213:1: ( rule__Planning__Group__1__Impl rule__Planning__Group__2 )
            // InternalTaskDSL.g:1214:2: rule__Planning__Group__1__Impl rule__Planning__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Planning__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Planning__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__1"


    // $ANTLR start "rule__Planning__Group__1__Impl"
    // InternalTaskDSL.g:1221:1: rule__Planning__Group__1__Impl : ( ( rule__Planning__NameAssignment_1 ) ) ;
    public final void rule__Planning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1225:1: ( ( ( rule__Planning__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:1226:1: ( ( rule__Planning__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:1226:1: ( ( rule__Planning__NameAssignment_1 ) )
            // InternalTaskDSL.g:1227:2: ( rule__Planning__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getNameAssignment_1()); 
            }
            // InternalTaskDSL.g:1228:2: ( rule__Planning__NameAssignment_1 )
            // InternalTaskDSL.g:1228:3: rule__Planning__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Planning__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__1__Impl"


    // $ANTLR start "rule__Planning__Group__2"
    // InternalTaskDSL.g:1236:1: rule__Planning__Group__2 : rule__Planning__Group__2__Impl rule__Planning__Group__3 ;
    public final void rule__Planning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1240:1: ( rule__Planning__Group__2__Impl rule__Planning__Group__3 )
            // InternalTaskDSL.g:1241:2: rule__Planning__Group__2__Impl rule__Planning__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Planning__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Planning__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__2"


    // $ANTLR start "rule__Planning__Group__2__Impl"
    // InternalTaskDSL.g:1248:1: rule__Planning__Group__2__Impl : ( ( rule__Planning__AnonymousAssignment_2 )? ) ;
    public final void rule__Planning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1252:1: ( ( ( rule__Planning__AnonymousAssignment_2 )? ) )
            // InternalTaskDSL.g:1253:1: ( ( rule__Planning__AnonymousAssignment_2 )? )
            {
            // InternalTaskDSL.g:1253:1: ( ( rule__Planning__AnonymousAssignment_2 )? )
            // InternalTaskDSL.g:1254:2: ( rule__Planning__AnonymousAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getAnonymousAssignment_2()); 
            }
            // InternalTaskDSL.g:1255:2: ( rule__Planning__AnonymousAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==50) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTaskDSL.g:1255:3: rule__Planning__AnonymousAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Planning__AnonymousAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getAnonymousAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__2__Impl"


    // $ANTLR start "rule__Planning__Group__3"
    // InternalTaskDSL.g:1263:1: rule__Planning__Group__3 : rule__Planning__Group__3__Impl ;
    public final void rule__Planning__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1267:1: ( rule__Planning__Group__3__Impl )
            // InternalTaskDSL.g:1268:2: rule__Planning__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Planning__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__3"


    // $ANTLR start "rule__Planning__Group__3__Impl"
    // InternalTaskDSL.g:1274:1: rule__Planning__Group__3__Impl : ( ( rule__Planning__Alternatives_3 )* ) ;
    public final void rule__Planning__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1278:1: ( ( ( rule__Planning__Alternatives_3 )* ) )
            // InternalTaskDSL.g:1279:1: ( ( rule__Planning__Alternatives_3 )* )
            {
            // InternalTaskDSL.g:1279:1: ( ( rule__Planning__Alternatives_3 )* )
            // InternalTaskDSL.g:1280:2: ( rule__Planning__Alternatives_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getAlternatives_3()); 
            }
            // InternalTaskDSL.g:1281:2: ( rule__Planning__Alternatives_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=26 && LA13_0<=27)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTaskDSL.g:1281:3: rule__Planning__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Planning__Alternatives_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__3__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalTaskDSL.g:1290:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1294:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalTaskDSL.g:1295:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Person__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalTaskDSL.g:1302:1: rule__Person__Group__0__Impl : ( 'Person:' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1306:1: ( ( 'Person:' ) )
            // InternalTaskDSL.g:1307:1: ( 'Person:' )
            {
            // InternalTaskDSL.g:1307:1: ( 'Person:' )
            // InternalTaskDSL.g:1308:2: 'Person:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalTaskDSL.g:1317:1: rule__Person__Group__1 : rule__Person__Group__1__Impl ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1321:1: ( rule__Person__Group__1__Impl )
            // InternalTaskDSL.g:1322:2: rule__Person__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalTaskDSL.g:1328:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1332:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:1333:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:1333:1: ( ( rule__Person__NameAssignment_1 ) )
            // InternalTaskDSL.g:1334:2: ( rule__Person__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            }
            // InternalTaskDSL.g:1335:2: ( rule__Person__NameAssignment_1 )
            // InternalTaskDSL.g:1335:3: rule__Person__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalTaskDSL.g:1344:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1348:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalTaskDSL.g:1349:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalTaskDSL.g:1356:1: rule__Task__Group__0__Impl : ( 'Task:' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1360:1: ( ( 'Task:' ) )
            // InternalTaskDSL.g:1361:1: ( 'Task:' )
            {
            // InternalTaskDSL.g:1361:1: ( 'Task:' )
            // InternalTaskDSL.g:1362:2: 'Task:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalTaskDSL.g:1371:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1375:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalTaskDSL.g:1376:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalTaskDSL.g:1383:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1387:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:1388:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:1388:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalTaskDSL.g:1389:2: ( rule__Task__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            }
            // InternalTaskDSL.g:1390:2: ( rule__Task__NameAssignment_1 )
            // InternalTaskDSL.g:1390:3: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalTaskDSL.g:1398:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1402:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalTaskDSL.g:1403:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalTaskDSL.g:1410:1: rule__Task__Group__2__Impl : ( ( rule__Task__ActionAssignment_2 ) ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1414:1: ( ( ( rule__Task__ActionAssignment_2 ) ) )
            // InternalTaskDSL.g:1415:1: ( ( rule__Task__ActionAssignment_2 ) )
            {
            // InternalTaskDSL.g:1415:1: ( ( rule__Task__ActionAssignment_2 ) )
            // InternalTaskDSL.g:1416:2: ( rule__Task__ActionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getActionAssignment_2()); 
            }
            // InternalTaskDSL.g:1417:2: ( rule__Task__ActionAssignment_2 )
            // InternalTaskDSL.g:1417:3: rule__Task__ActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__ActionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getActionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalTaskDSL.g:1425:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1429:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalTaskDSL.g:1430:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalTaskDSL.g:1437:1: rule__Task__Group__3__Impl : ( 'persons:' ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1441:1: ( ( 'persons:' ) )
            // InternalTaskDSL.g:1442:1: ( 'persons:' )
            {
            // InternalTaskDSL.g:1442:1: ( 'persons:' )
            // InternalTaskDSL.g:1443:2: 'persons:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPersonsKeyword_3()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPersonsKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__4"
    // InternalTaskDSL.g:1452:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1456:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalTaskDSL.g:1457:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Task__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4"


    // $ANTLR start "rule__Task__Group__4__Impl"
    // InternalTaskDSL.g:1464:1: rule__Task__Group__4__Impl : ( ( ( rule__Task__PersonsAssignment_4 ) ) ( ( rule__Task__PersonsAssignment_4 )* ) ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1468:1: ( ( ( ( rule__Task__PersonsAssignment_4 ) ) ( ( rule__Task__PersonsAssignment_4 )* ) ) )
            // InternalTaskDSL.g:1469:1: ( ( ( rule__Task__PersonsAssignment_4 ) ) ( ( rule__Task__PersonsAssignment_4 )* ) )
            {
            // InternalTaskDSL.g:1469:1: ( ( ( rule__Task__PersonsAssignment_4 ) ) ( ( rule__Task__PersonsAssignment_4 )* ) )
            // InternalTaskDSL.g:1470:2: ( ( rule__Task__PersonsAssignment_4 ) ) ( ( rule__Task__PersonsAssignment_4 )* )
            {
            // InternalTaskDSL.g:1470:2: ( ( rule__Task__PersonsAssignment_4 ) )
            // InternalTaskDSL.g:1471:3: ( rule__Task__PersonsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPersonsAssignment_4()); 
            }
            // InternalTaskDSL.g:1472:3: ( rule__Task__PersonsAssignment_4 )
            // InternalTaskDSL.g:1472:4: rule__Task__PersonsAssignment_4
            {
            pushFollow(FOLLOW_9);
            rule__Task__PersonsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPersonsAssignment_4()); 
            }

            }

            // InternalTaskDSL.g:1475:2: ( ( rule__Task__PersonsAssignment_4 )* )
            // InternalTaskDSL.g:1476:3: ( rule__Task__PersonsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPersonsAssignment_4()); 
            }
            // InternalTaskDSL.g:1477:3: ( rule__Task__PersonsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTaskDSL.g:1477:4: rule__Task__PersonsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Task__PersonsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPersonsAssignment_4()); 
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
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group__5"
    // InternalTaskDSL.g:1486:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1490:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalTaskDSL.g:1491:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5"


    // $ANTLR start "rule__Task__Group__5__Impl"
    // InternalTaskDSL.g:1498:1: rule__Task__Group__5__Impl : ( 'priority:' ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1502:1: ( ( 'priority:' ) )
            // InternalTaskDSL.g:1503:1: ( 'priority:' )
            {
            // InternalTaskDSL.g:1503:1: ( 'priority:' )
            // InternalTaskDSL.g:1504:2: 'priority:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPriorityKeyword_5()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPriorityKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__6"
    // InternalTaskDSL.g:1513:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1517:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalTaskDSL.g:1518:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6"


    // $ANTLR start "rule__Task__Group__6__Impl"
    // InternalTaskDSL.g:1525:1: rule__Task__Group__6__Impl : ( ( rule__Task__PrioAssignment_6 ) ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1529:1: ( ( ( rule__Task__PrioAssignment_6 ) ) )
            // InternalTaskDSL.g:1530:1: ( ( rule__Task__PrioAssignment_6 ) )
            {
            // InternalTaskDSL.g:1530:1: ( ( rule__Task__PrioAssignment_6 ) )
            // InternalTaskDSL.g:1531:2: ( rule__Task__PrioAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPrioAssignment_6()); 
            }
            // InternalTaskDSL.g:1532:2: ( rule__Task__PrioAssignment_6 )
            // InternalTaskDSL.g:1532:3: rule__Task__PrioAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Task__PrioAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPrioAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6__Impl"


    // $ANTLR start "rule__Task__Group__7"
    // InternalTaskDSL.g:1540:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1544:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalTaskDSL.g:1545:2: rule__Task__Group__7__Impl rule__Task__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__7"


    // $ANTLR start "rule__Task__Group__7__Impl"
    // InternalTaskDSL.g:1552:1: rule__Task__Group__7__Impl : ( ( rule__Task__Group_7__0 )? ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1556:1: ( ( ( rule__Task__Group_7__0 )? ) )
            // InternalTaskDSL.g:1557:1: ( ( rule__Task__Group_7__0 )? )
            {
            // InternalTaskDSL.g:1557:1: ( ( rule__Task__Group_7__0 )? )
            // InternalTaskDSL.g:1558:2: ( rule__Task__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getGroup_7()); 
            }
            // InternalTaskDSL.g:1559:2: ( rule__Task__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTaskDSL.g:1559:3: rule__Task__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__7__Impl"


    // $ANTLR start "rule__Task__Group__8"
    // InternalTaskDSL.g:1567:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1571:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalTaskDSL.g:1572:2: rule__Task__Group__8__Impl rule__Task__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__8"


    // $ANTLR start "rule__Task__Group__8__Impl"
    // InternalTaskDSL.g:1579:1: rule__Task__Group__8__Impl : ( 'defineProjects:' ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1583:1: ( ( 'defineProjects:' ) )
            // InternalTaskDSL.g:1584:1: ( 'defineProjects:' )
            {
            // InternalTaskDSL.g:1584:1: ( 'defineProjects:' )
            // InternalTaskDSL.g:1585:2: 'defineProjects:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getDefineProjectsKeyword_8()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getDefineProjectsKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__8__Impl"


    // $ANTLR start "rule__Task__Group__9"
    // InternalTaskDSL.g:1594:1: rule__Task__Group__9 : rule__Task__Group__9__Impl rule__Task__Group__10 ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1598:1: ( rule__Task__Group__9__Impl rule__Task__Group__10 )
            // InternalTaskDSL.g:1599:2: rule__Task__Group__9__Impl rule__Task__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__9"


    // $ANTLR start "rule__Task__Group__9__Impl"
    // InternalTaskDSL.g:1606:1: rule__Task__Group__9__Impl : ( ( rule__Task__ProjectsAssignment_9 )* ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1610:1: ( ( ( rule__Task__ProjectsAssignment_9 )* ) )
            // InternalTaskDSL.g:1611:1: ( ( rule__Task__ProjectsAssignment_9 )* )
            {
            // InternalTaskDSL.g:1611:1: ( ( rule__Task__ProjectsAssignment_9 )* )
            // InternalTaskDSL.g:1612:2: ( rule__Task__ProjectsAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getProjectsAssignment_9()); 
            }
            // InternalTaskDSL.g:1613:2: ( rule__Task__ProjectsAssignment_9 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTaskDSL.g:1613:3: rule__Task__ProjectsAssignment_9
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Task__ProjectsAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getProjectsAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__9__Impl"


    // $ANTLR start "rule__Task__Group__10"
    // InternalTaskDSL.g:1621:1: rule__Task__Group__10 : rule__Task__Group__10__Impl rule__Task__Group__11 ;
    public final void rule__Task__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1625:1: ( rule__Task__Group__10__Impl rule__Task__Group__11 )
            // InternalTaskDSL.g:1626:2: rule__Task__Group__10__Impl rule__Task__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__Task__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__10"


    // $ANTLR start "rule__Task__Group__10__Impl"
    // InternalTaskDSL.g:1633:1: rule__Task__Group__10__Impl : ( 'useProjects:' ) ;
    public final void rule__Task__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1637:1: ( ( 'useProjects:' ) )
            // InternalTaskDSL.g:1638:1: ( 'useProjects:' )
            {
            // InternalTaskDSL.g:1638:1: ( 'useProjects:' )
            // InternalTaskDSL.g:1639:2: 'useProjects:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getUseProjectsKeyword_10()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getUseProjectsKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__10__Impl"


    // $ANTLR start "rule__Task__Group__11"
    // InternalTaskDSL.g:1648:1: rule__Task__Group__11 : rule__Task__Group__11__Impl rule__Task__Group__12 ;
    public final void rule__Task__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1652:1: ( rule__Task__Group__11__Impl rule__Task__Group__12 )
            // InternalTaskDSL.g:1653:2: rule__Task__Group__11__Impl rule__Task__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__Task__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__11"


    // $ANTLR start "rule__Task__Group__11__Impl"
    // InternalTaskDSL.g:1660:1: rule__Task__Group__11__Impl : ( ( rule__Task__UseAssignment_11 )* ) ;
    public final void rule__Task__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1664:1: ( ( ( rule__Task__UseAssignment_11 )* ) )
            // InternalTaskDSL.g:1665:1: ( ( rule__Task__UseAssignment_11 )* )
            {
            // InternalTaskDSL.g:1665:1: ( ( rule__Task__UseAssignment_11 )* )
            // InternalTaskDSL.g:1666:2: ( rule__Task__UseAssignment_11 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getUseAssignment_11()); 
            }
            // InternalTaskDSL.g:1667:2: ( rule__Task__UseAssignment_11 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTaskDSL.g:1667:3: rule__Task__UseAssignment_11
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Task__UseAssignment_11();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getUseAssignment_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__11__Impl"


    // $ANTLR start "rule__Task__Group__12"
    // InternalTaskDSL.g:1675:1: rule__Task__Group__12 : rule__Task__Group__12__Impl ;
    public final void rule__Task__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1679:1: ( rule__Task__Group__12__Impl )
            // InternalTaskDSL.g:1680:2: rule__Task__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__12"


    // $ANTLR start "rule__Task__Group__12__Impl"
    // InternalTaskDSL.g:1686:1: rule__Task__Group__12__Impl : ( ( rule__Task__Group_12__0 )? ) ;
    public final void rule__Task__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1690:1: ( ( ( rule__Task__Group_12__0 )? ) )
            // InternalTaskDSL.g:1691:1: ( ( rule__Task__Group_12__0 )? )
            {
            // InternalTaskDSL.g:1691:1: ( ( rule__Task__Group_12__0 )? )
            // InternalTaskDSL.g:1692:2: ( rule__Task__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getGroup_12()); 
            }
            // InternalTaskDSL.g:1693:2: ( rule__Task__Group_12__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTaskDSL.g:1693:3: rule__Task__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_12__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getGroup_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__12__Impl"


    // $ANTLR start "rule__Task__Group_7__0"
    // InternalTaskDSL.g:1702:1: rule__Task__Group_7__0 : rule__Task__Group_7__0__Impl rule__Task__Group_7__1 ;
    public final void rule__Task__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1706:1: ( rule__Task__Group_7__0__Impl rule__Task__Group_7__1 )
            // InternalTaskDSL.g:1707:2: rule__Task__Group_7__0__Impl rule__Task__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_7__0"


    // $ANTLR start "rule__Task__Group_7__0__Impl"
    // InternalTaskDSL.g:1714:1: rule__Task__Group_7__0__Impl : ( 'duration:' ) ;
    public final void rule__Task__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1718:1: ( ( 'duration:' ) )
            // InternalTaskDSL.g:1719:1: ( 'duration:' )
            {
            // InternalTaskDSL.g:1719:1: ( 'duration:' )
            // InternalTaskDSL.g:1720:2: 'duration:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getDurationKeyword_7_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getDurationKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_7__0__Impl"


    // $ANTLR start "rule__Task__Group_7__1"
    // InternalTaskDSL.g:1729:1: rule__Task__Group_7__1 : rule__Task__Group_7__1__Impl ;
    public final void rule__Task__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1733:1: ( rule__Task__Group_7__1__Impl )
            // InternalTaskDSL.g:1734:2: rule__Task__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_7__1"


    // $ANTLR start "rule__Task__Group_7__1__Impl"
    // InternalTaskDSL.g:1740:1: rule__Task__Group_7__1__Impl : ( ( rule__Task__DurationAssignment_7_1 ) ) ;
    public final void rule__Task__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1744:1: ( ( ( rule__Task__DurationAssignment_7_1 ) ) )
            // InternalTaskDSL.g:1745:1: ( ( rule__Task__DurationAssignment_7_1 ) )
            {
            // InternalTaskDSL.g:1745:1: ( ( rule__Task__DurationAssignment_7_1 ) )
            // InternalTaskDSL.g:1746:2: ( rule__Task__DurationAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getDurationAssignment_7_1()); 
            }
            // InternalTaskDSL.g:1747:2: ( rule__Task__DurationAssignment_7_1 )
            // InternalTaskDSL.g:1747:3: rule__Task__DurationAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__DurationAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getDurationAssignment_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_7__1__Impl"


    // $ANTLR start "rule__Task__Group_12__0"
    // InternalTaskDSL.g:1756:1: rule__Task__Group_12__0 : rule__Task__Group_12__0__Impl rule__Task__Group_12__1 ;
    public final void rule__Task__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1760:1: ( rule__Task__Group_12__0__Impl rule__Task__Group_12__1 )
            // InternalTaskDSL.g:1761:2: rule__Task__Group_12__0__Impl rule__Task__Group_12__1
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group_12__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_12__0"


    // $ANTLR start "rule__Task__Group_12__0__Impl"
    // InternalTaskDSL.g:1768:1: rule__Task__Group_12__0__Impl : ( 'extends' ) ;
    public final void rule__Task__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1772:1: ( ( 'extends' ) )
            // InternalTaskDSL.g:1773:1: ( 'extends' )
            {
            // InternalTaskDSL.g:1773:1: ( 'extends' )
            // InternalTaskDSL.g:1774:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getExtendsKeyword_12_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getExtendsKeyword_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_12__0__Impl"


    // $ANTLR start "rule__Task__Group_12__1"
    // InternalTaskDSL.g:1783:1: rule__Task__Group_12__1 : rule__Task__Group_12__1__Impl ;
    public final void rule__Task__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1787:1: ( rule__Task__Group_12__1__Impl )
            // InternalTaskDSL.g:1788:2: rule__Task__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_12__1"


    // $ANTLR start "rule__Task__Group_12__1__Impl"
    // InternalTaskDSL.g:1794:1: rule__Task__Group_12__1__Impl : ( ( rule__Task__ExtendsAssignment_12_1 ) ) ;
    public final void rule__Task__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1798:1: ( ( ( rule__Task__ExtendsAssignment_12_1 ) ) )
            // InternalTaskDSL.g:1799:1: ( ( rule__Task__ExtendsAssignment_12_1 ) )
            {
            // InternalTaskDSL.g:1799:1: ( ( rule__Task__ExtendsAssignment_12_1 ) )
            // InternalTaskDSL.g:1800:2: ( rule__Task__ExtendsAssignment_12_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getExtendsAssignment_12_1()); 
            }
            // InternalTaskDSL.g:1801:2: ( rule__Task__ExtendsAssignment_12_1 )
            // InternalTaskDSL.g:1801:3: rule__Task__ExtendsAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__ExtendsAssignment_12_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getExtendsAssignment_12_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_12__1__Impl"


    // $ANTLR start "rule__Duration__Group__0"
    // InternalTaskDSL.g:1810:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1814:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalTaskDSL.g:1815:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Duration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Duration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0"


    // $ANTLR start "rule__Duration__Group__0__Impl"
    // InternalTaskDSL.g:1822:1: rule__Duration__Group__0__Impl : ( ( rule__Duration__DlAssignment_0 ) ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1826:1: ( ( ( rule__Duration__DlAssignment_0 ) ) )
            // InternalTaskDSL.g:1827:1: ( ( rule__Duration__DlAssignment_0 ) )
            {
            // InternalTaskDSL.g:1827:1: ( ( rule__Duration__DlAssignment_0 ) )
            // InternalTaskDSL.g:1828:2: ( rule__Duration__DlAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationAccess().getDlAssignment_0()); 
            }
            // InternalTaskDSL.g:1829:2: ( rule__Duration__DlAssignment_0 )
            // InternalTaskDSL.g:1829:3: rule__Duration__DlAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__DlAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationAccess().getDlAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0__Impl"


    // $ANTLR start "rule__Duration__Group__1"
    // InternalTaskDSL.g:1837:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl ;
    public final void rule__Duration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1841:1: ( rule__Duration__Group__1__Impl )
            // InternalTaskDSL.g:1842:2: rule__Duration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1"


    // $ANTLR start "rule__Duration__Group__1__Impl"
    // InternalTaskDSL.g:1848:1: rule__Duration__Group__1__Impl : ( ( rule__Duration__UnitAssignment_1 ) ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1852:1: ( ( ( rule__Duration__UnitAssignment_1 ) ) )
            // InternalTaskDSL.g:1853:1: ( ( rule__Duration__UnitAssignment_1 ) )
            {
            // InternalTaskDSL.g:1853:1: ( ( rule__Duration__UnitAssignment_1 ) )
            // InternalTaskDSL.g:1854:2: ( rule__Duration__UnitAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationAccess().getUnitAssignment_1()); 
            }
            // InternalTaskDSL.g:1855:2: ( rule__Duration__UnitAssignment_1 )
            // InternalTaskDSL.g:1855:3: rule__Duration__UnitAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Duration__UnitAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationAccess().getUnitAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1__Impl"


    // $ANTLR start "rule__LunchAction__Group__0"
    // InternalTaskDSL.g:1864:1: rule__LunchAction__Group__0 : rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1 ;
    public final void rule__LunchAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1868:1: ( rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1 )
            // InternalTaskDSL.g:1869:2: rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LunchAction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__Group__0"


    // $ANTLR start "rule__LunchAction__Group__0__Impl"
    // InternalTaskDSL.g:1876:1: rule__LunchAction__Group__0__Impl : ( 'Lunch' ) ;
    public final void rule__LunchAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1880:1: ( ( 'Lunch' ) )
            // InternalTaskDSL.g:1881:1: ( 'Lunch' )
            {
            // InternalTaskDSL.g:1881:1: ( 'Lunch' )
            // InternalTaskDSL.g:1882:2: 'Lunch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLunchActionAccess().getLunchKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLunchActionAccess().getLunchKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__Group__0__Impl"


    // $ANTLR start "rule__LunchAction__Group__1"
    // InternalTaskDSL.g:1891:1: rule__LunchAction__Group__1 : rule__LunchAction__Group__1__Impl ;
    public final void rule__LunchAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1895:1: ( rule__LunchAction__Group__1__Impl )
            // InternalTaskDSL.g:1896:2: rule__LunchAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__Group__1"


    // $ANTLR start "rule__LunchAction__Group__1__Impl"
    // InternalTaskDSL.g:1902:1: rule__LunchAction__Group__1__Impl : ( ( rule__LunchAction__LocationAssignment_1 ) ) ;
    public final void rule__LunchAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1906:1: ( ( ( rule__LunchAction__LocationAssignment_1 ) ) )
            // InternalTaskDSL.g:1907:1: ( ( rule__LunchAction__LocationAssignment_1 ) )
            {
            // InternalTaskDSL.g:1907:1: ( ( rule__LunchAction__LocationAssignment_1 ) )
            // InternalTaskDSL.g:1908:2: ( rule__LunchAction__LocationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLunchActionAccess().getLocationAssignment_1()); 
            }
            // InternalTaskDSL.g:1909:2: ( rule__LunchAction__LocationAssignment_1 )
            // InternalTaskDSL.g:1909:3: rule__LunchAction__LocationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__LocationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLunchActionAccess().getLocationAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__Group__1__Impl"


    // $ANTLR start "rule__MeetingAction__Group__0"
    // InternalTaskDSL.g:1918:1: rule__MeetingAction__Group__0 : rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1 ;
    public final void rule__MeetingAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1922:1: ( rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1 )
            // InternalTaskDSL.g:1923:2: rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__MeetingAction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__Group__0"


    // $ANTLR start "rule__MeetingAction__Group__0__Impl"
    // InternalTaskDSL.g:1930:1: rule__MeetingAction__Group__0__Impl : ( 'Meeting' ) ;
    public final void rule__MeetingAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1934:1: ( ( 'Meeting' ) )
            // InternalTaskDSL.g:1935:1: ( 'Meeting' )
            {
            // InternalTaskDSL.g:1935:1: ( 'Meeting' )
            // InternalTaskDSL.g:1936:2: 'Meeting'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeetingActionAccess().getMeetingKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeetingActionAccess().getMeetingKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__Group__0__Impl"


    // $ANTLR start "rule__MeetingAction__Group__1"
    // InternalTaskDSL.g:1945:1: rule__MeetingAction__Group__1 : rule__MeetingAction__Group__1__Impl ;
    public final void rule__MeetingAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1949:1: ( rule__MeetingAction__Group__1__Impl )
            // InternalTaskDSL.g:1950:2: rule__MeetingAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__Group__1"


    // $ANTLR start "rule__MeetingAction__Group__1__Impl"
    // InternalTaskDSL.g:1956:1: rule__MeetingAction__Group__1__Impl : ( ( rule__MeetingAction__TopicAssignment_1 ) ) ;
    public final void rule__MeetingAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1960:1: ( ( ( rule__MeetingAction__TopicAssignment_1 ) ) )
            // InternalTaskDSL.g:1961:1: ( ( rule__MeetingAction__TopicAssignment_1 ) )
            {
            // InternalTaskDSL.g:1961:1: ( ( rule__MeetingAction__TopicAssignment_1 ) )
            // InternalTaskDSL.g:1962:2: ( rule__MeetingAction__TopicAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeetingActionAccess().getTopicAssignment_1()); 
            }
            // InternalTaskDSL.g:1963:2: ( rule__MeetingAction__TopicAssignment_1 )
            // InternalTaskDSL.g:1963:3: rule__MeetingAction__TopicAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__TopicAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeetingActionAccess().getTopicAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__Group__1__Impl"


    // $ANTLR start "rule__PaperAction__Group__0"
    // InternalTaskDSL.g:1972:1: rule__PaperAction__Group__0 : rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1 ;
    public final void rule__PaperAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1976:1: ( rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1 )
            // InternalTaskDSL.g:1977:2: rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PaperAction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__Group__0"


    // $ANTLR start "rule__PaperAction__Group__0__Impl"
    // InternalTaskDSL.g:1984:1: rule__PaperAction__Group__0__Impl : ( 'Report' ) ;
    public final void rule__PaperAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1988:1: ( ( 'Report' ) )
            // InternalTaskDSL.g:1989:1: ( 'Report' )
            {
            // InternalTaskDSL.g:1989:1: ( 'Report' )
            // InternalTaskDSL.g:1990:2: 'Report'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaperActionAccess().getReportKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaperActionAccess().getReportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__Group__0__Impl"


    // $ANTLR start "rule__PaperAction__Group__1"
    // InternalTaskDSL.g:1999:1: rule__PaperAction__Group__1 : rule__PaperAction__Group__1__Impl ;
    public final void rule__PaperAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2003:1: ( rule__PaperAction__Group__1__Impl )
            // InternalTaskDSL.g:2004:2: rule__PaperAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__Group__1"


    // $ANTLR start "rule__PaperAction__Group__1__Impl"
    // InternalTaskDSL.g:2010:1: rule__PaperAction__Group__1__Impl : ( ( rule__PaperAction__ReportAssignment_1 ) ) ;
    public final void rule__PaperAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2014:1: ( ( ( rule__PaperAction__ReportAssignment_1 ) ) )
            // InternalTaskDSL.g:2015:1: ( ( rule__PaperAction__ReportAssignment_1 ) )
            {
            // InternalTaskDSL.g:2015:1: ( ( rule__PaperAction__ReportAssignment_1 ) )
            // InternalTaskDSL.g:2016:2: ( rule__PaperAction__ReportAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaperActionAccess().getReportAssignment_1()); 
            }
            // InternalTaskDSL.g:2017:2: ( rule__PaperAction__ReportAssignment_1 )
            // InternalTaskDSL.g:2017:3: rule__PaperAction__ReportAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__ReportAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaperActionAccess().getReportAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__Group__1__Impl"


    // $ANTLR start "rule__PaymentAction__Group__0"
    // InternalTaskDSL.g:2026:1: rule__PaymentAction__Group__0 : rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1 ;
    public final void rule__PaymentAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2030:1: ( rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1 )
            // InternalTaskDSL.g:2031:2: rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PaymentAction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__0"


    // $ANTLR start "rule__PaymentAction__Group__0__Impl"
    // InternalTaskDSL.g:2038:1: rule__PaymentAction__Group__0__Impl : ( ( rule__PaymentAction__Group_0__0 )? ) ;
    public final void rule__PaymentAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2042:1: ( ( ( rule__PaymentAction__Group_0__0 )? ) )
            // InternalTaskDSL.g:2043:1: ( ( rule__PaymentAction__Group_0__0 )? )
            {
            // InternalTaskDSL.g:2043:1: ( ( rule__PaymentAction__Group_0__0 )? )
            // InternalTaskDSL.g:2044:2: ( rule__PaymentAction__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getGroup_0()); 
            }
            // InternalTaskDSL.g:2045:2: ( rule__PaymentAction__Group_0__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTaskDSL.g:2045:3: rule__PaymentAction__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PaymentAction__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__0__Impl"


    // $ANTLR start "rule__PaymentAction__Group__1"
    // InternalTaskDSL.g:2053:1: rule__PaymentAction__Group__1 : rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2 ;
    public final void rule__PaymentAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2057:1: ( rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2 )
            // InternalTaskDSL.g:2058:2: rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__PaymentAction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__1"


    // $ANTLR start "rule__PaymentAction__Group__1__Impl"
    // InternalTaskDSL.g:2065:1: rule__PaymentAction__Group__1__Impl : ( 'Pay' ) ;
    public final void rule__PaymentAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2069:1: ( ( 'Pay' ) )
            // InternalTaskDSL.g:2070:1: ( 'Pay' )
            {
            // InternalTaskDSL.g:2070:1: ( 'Pay' )
            // InternalTaskDSL.g:2071:2: 'Pay'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getPayKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getPayKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__1__Impl"


    // $ANTLR start "rule__PaymentAction__Group__2"
    // InternalTaskDSL.g:2080:1: rule__PaymentAction__Group__2 : rule__PaymentAction__Group__2__Impl rule__PaymentAction__Group__3 ;
    public final void rule__PaymentAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2084:1: ( rule__PaymentAction__Group__2__Impl rule__PaymentAction__Group__3 )
            // InternalTaskDSL.g:2085:2: rule__PaymentAction__Group__2__Impl rule__PaymentAction__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__PaymentAction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__2"


    // $ANTLR start "rule__PaymentAction__Group__2__Impl"
    // InternalTaskDSL.g:2092:1: rule__PaymentAction__Group__2__Impl : ( ( rule__PaymentAction__AmountAssignment_2 ) ) ;
    public final void rule__PaymentAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2096:1: ( ( ( rule__PaymentAction__AmountAssignment_2 ) ) )
            // InternalTaskDSL.g:2097:1: ( ( rule__PaymentAction__AmountAssignment_2 ) )
            {
            // InternalTaskDSL.g:2097:1: ( ( rule__PaymentAction__AmountAssignment_2 ) )
            // InternalTaskDSL.g:2098:2: ( rule__PaymentAction__AmountAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getAmountAssignment_2()); 
            }
            // InternalTaskDSL.g:2099:2: ( rule__PaymentAction__AmountAssignment_2 )
            // InternalTaskDSL.g:2099:3: rule__PaymentAction__AmountAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__AmountAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getAmountAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__2__Impl"


    // $ANTLR start "rule__PaymentAction__Group__3"
    // InternalTaskDSL.g:2107:1: rule__PaymentAction__Group__3 : rule__PaymentAction__Group__3__Impl ;
    public final void rule__PaymentAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2111:1: ( rule__PaymentAction__Group__3__Impl )
            // InternalTaskDSL.g:2112:2: rule__PaymentAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__3"


    // $ANTLR start "rule__PaymentAction__Group__3__Impl"
    // InternalTaskDSL.g:2118:1: rule__PaymentAction__Group__3__Impl : ( 'euro' ) ;
    public final void rule__PaymentAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2122:1: ( ( 'euro' ) )
            // InternalTaskDSL.g:2123:1: ( 'euro' )
            {
            // InternalTaskDSL.g:2123:1: ( 'euro' )
            // InternalTaskDSL.g:2124:2: 'euro'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getEuroKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getEuroKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__3__Impl"


    // $ANTLR start "rule__PaymentAction__Group_0__0"
    // InternalTaskDSL.g:2134:1: rule__PaymentAction__Group_0__0 : rule__PaymentAction__Group_0__0__Impl rule__PaymentAction__Group_0__1 ;
    public final void rule__PaymentAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2138:1: ( rule__PaymentAction__Group_0__0__Impl rule__PaymentAction__Group_0__1 )
            // InternalTaskDSL.g:2139:2: rule__PaymentAction__Group_0__0__Impl rule__PaymentAction__Group_0__1
            {
            pushFollow(FOLLOW_18);
            rule__PaymentAction__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group_0__0"


    // $ANTLR start "rule__PaymentAction__Group_0__0__Impl"
    // InternalTaskDSL.g:2146:1: rule__PaymentAction__Group_0__0__Impl : ( 'If' ) ;
    public final void rule__PaymentAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2150:1: ( ( 'If' ) )
            // InternalTaskDSL.g:2151:1: ( 'If' )
            {
            // InternalTaskDSL.g:2151:1: ( 'If' )
            // InternalTaskDSL.g:2152:2: 'If'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getIfKeyword_0_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getIfKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group_0__0__Impl"


    // $ANTLR start "rule__PaymentAction__Group_0__1"
    // InternalTaskDSL.g:2161:1: rule__PaymentAction__Group_0__1 : rule__PaymentAction__Group_0__1__Impl ;
    public final void rule__PaymentAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2165:1: ( rule__PaymentAction__Group_0__1__Impl )
            // InternalTaskDSL.g:2166:2: rule__PaymentAction__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group_0__1"


    // $ANTLR start "rule__PaymentAction__Group_0__1__Impl"
    // InternalTaskDSL.g:2172:1: rule__PaymentAction__Group_0__1__Impl : ( ( rule__PaymentAction__ConditionAssignment_0_1 ) ) ;
    public final void rule__PaymentAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2176:1: ( ( ( rule__PaymentAction__ConditionAssignment_0_1 ) ) )
            // InternalTaskDSL.g:2177:1: ( ( rule__PaymentAction__ConditionAssignment_0_1 ) )
            {
            // InternalTaskDSL.g:2177:1: ( ( rule__PaymentAction__ConditionAssignment_0_1 ) )
            // InternalTaskDSL.g:2178:2: ( rule__PaymentAction__ConditionAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getConditionAssignment_0_1()); 
            }
            // InternalTaskDSL.g:2179:2: ( rule__PaymentAction__ConditionAssignment_0_1 )
            // InternalTaskDSL.g:2179:3: rule__PaymentAction__ConditionAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__ConditionAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getConditionAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group__0"
    // InternalTaskDSL.g:2188:1: rule__ExpressionLevel1__Group__0 : rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1 ;
    public final void rule__ExpressionLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2192:1: ( rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1 )
            // InternalTaskDSL.g:2193:2: rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ExpressionLevel1__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group__0"


    // $ANTLR start "rule__ExpressionLevel1__Group__0__Impl"
    // InternalTaskDSL.g:2200:1: rule__ExpressionLevel1__Group__0__Impl : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2204:1: ( ( ruleExpressionLevel2 ) )
            // InternalTaskDSL.g:2205:1: ( ruleExpressionLevel2 )
            {
            // InternalTaskDSL.g:2205:1: ( ruleExpressionLevel2 )
            // InternalTaskDSL.g:2206:2: ruleExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group__1"
    // InternalTaskDSL.g:2215:1: rule__ExpressionLevel1__Group__1 : rule__ExpressionLevel1__Group__1__Impl ;
    public final void rule__ExpressionLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2219:1: ( rule__ExpressionLevel1__Group__1__Impl )
            // InternalTaskDSL.g:2220:2: rule__ExpressionLevel1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group__1"


    // $ANTLR start "rule__ExpressionLevel1__Group__1__Impl"
    // InternalTaskDSL.g:2226:1: rule__ExpressionLevel1__Group__1__Impl : ( ( rule__ExpressionLevel1__Alternatives_1 )* ) ;
    public final void rule__ExpressionLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2230:1: ( ( ( rule__ExpressionLevel1__Alternatives_1 )* ) )
            // InternalTaskDSL.g:2231:1: ( ( rule__ExpressionLevel1__Alternatives_1 )* )
            {
            // InternalTaskDSL.g:2231:1: ( ( rule__ExpressionLevel1__Alternatives_1 )* )
            // InternalTaskDSL.g:2232:2: ( rule__ExpressionLevel1__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getAlternatives_1()); 
            }
            // InternalTaskDSL.g:2233:2: ( rule__ExpressionLevel1__Alternatives_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=40 && LA20_0<=41)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTaskDSL.g:2233:3: rule__ExpressionLevel1__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ExpressionLevel1__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__0"
    // InternalTaskDSL.g:2242:1: rule__ExpressionLevel1__Group_1_0__0 : rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1 ;
    public final void rule__ExpressionLevel1__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2246:1: ( rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1 )
            // InternalTaskDSL.g:2247:2: rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1
            {
            pushFollow(FOLLOW_21);
            rule__ExpressionLevel1__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__0"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__0__Impl"
    // InternalTaskDSL.g:2254:1: rule__ExpressionLevel1__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel1__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2258:1: ( ( () ) )
            // InternalTaskDSL.g:2259:1: ( () )
            {
            // InternalTaskDSL.g:2259:1: ( () )
            // InternalTaskDSL.g:2260:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getExpressionAdditionLeftAction_1_0_0()); 
            }
            // InternalTaskDSL.g:2261:2: ()
            // InternalTaskDSL.g:2261:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getExpressionAdditionLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__1"
    // InternalTaskDSL.g:2269:1: rule__ExpressionLevel1__Group_1_0__1 : rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2 ;
    public final void rule__ExpressionLevel1__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2273:1: ( rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2 )
            // InternalTaskDSL.g:2274:2: rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2
            {
            pushFollow(FOLLOW_16);
            rule__ExpressionLevel1__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__1"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__1__Impl"
    // InternalTaskDSL.g:2281:1: rule__ExpressionLevel1__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__ExpressionLevel1__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2285:1: ( ( '+' ) )
            // InternalTaskDSL.g:2286:1: ( '+' )
            {
            // InternalTaskDSL.g:2286:1: ( '+' )
            // InternalTaskDSL.g:2287:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getPlusSignKeyword_1_0_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getPlusSignKeyword_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__2"
    // InternalTaskDSL.g:2296:1: rule__ExpressionLevel1__Group_1_0__2 : rule__ExpressionLevel1__Group_1_0__2__Impl ;
    public final void rule__ExpressionLevel1__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2300:1: ( rule__ExpressionLevel1__Group_1_0__2__Impl )
            // InternalTaskDSL.g:2301:2: rule__ExpressionLevel1__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__2"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__2__Impl"
    // InternalTaskDSL.g:2307:1: rule__ExpressionLevel1__Group_1_0__2__Impl : ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) ) ;
    public final void rule__ExpressionLevel1__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2311:1: ( ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) ) )
            // InternalTaskDSL.g:2312:1: ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) )
            {
            // InternalTaskDSL.g:2312:1: ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) )
            // InternalTaskDSL.g:2313:2: ( rule__ExpressionLevel1__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_0_2()); 
            }
            // InternalTaskDSL.g:2314:2: ( rule__ExpressionLevel1__RightAssignment_1_0_2 )
            // InternalTaskDSL.g:2314:3: rule__ExpressionLevel1__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__0"
    // InternalTaskDSL.g:2323:1: rule__ExpressionLevel1__Group_1_1__0 : rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1 ;
    public final void rule__ExpressionLevel1__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2327:1: ( rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1 )
            // InternalTaskDSL.g:2328:2: rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1
            {
            pushFollow(FOLLOW_19);
            rule__ExpressionLevel1__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__0"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__0__Impl"
    // InternalTaskDSL.g:2335:1: rule__ExpressionLevel1__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel1__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2339:1: ( ( () ) )
            // InternalTaskDSL.g:2340:1: ( () )
            {
            // InternalTaskDSL.g:2340:1: ( () )
            // InternalTaskDSL.g:2341:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getExpressionSubtractionLeftAction_1_1_0()); 
            }
            // InternalTaskDSL.g:2342:2: ()
            // InternalTaskDSL.g:2342:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getExpressionSubtractionLeftAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__1"
    // InternalTaskDSL.g:2350:1: rule__ExpressionLevel1__Group_1_1__1 : rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2 ;
    public final void rule__ExpressionLevel1__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2354:1: ( rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2 )
            // InternalTaskDSL.g:2355:2: rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ExpressionLevel1__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__1"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__1__Impl"
    // InternalTaskDSL.g:2362:1: rule__ExpressionLevel1__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__ExpressionLevel1__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2366:1: ( ( '-' ) )
            // InternalTaskDSL.g:2367:1: ( '-' )
            {
            // InternalTaskDSL.g:2367:1: ( '-' )
            // InternalTaskDSL.g:2368:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getHyphenMinusKeyword_1_1_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getHyphenMinusKeyword_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__2"
    // InternalTaskDSL.g:2377:1: rule__ExpressionLevel1__Group_1_1__2 : rule__ExpressionLevel1__Group_1_1__2__Impl ;
    public final void rule__ExpressionLevel1__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2381:1: ( rule__ExpressionLevel1__Group_1_1__2__Impl )
            // InternalTaskDSL.g:2382:2: rule__ExpressionLevel1__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__2"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__2__Impl"
    // InternalTaskDSL.g:2388:1: rule__ExpressionLevel1__Group_1_1__2__Impl : ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) ) ;
    public final void rule__ExpressionLevel1__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2392:1: ( ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) ) )
            // InternalTaskDSL.g:2393:1: ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) )
            {
            // InternalTaskDSL.g:2393:1: ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) )
            // InternalTaskDSL.g:2394:2: ( rule__ExpressionLevel1__RightAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_1_2()); 
            }
            // InternalTaskDSL.g:2395:2: ( rule__ExpressionLevel1__RightAssignment_1_1_2 )
            // InternalTaskDSL.g:2395:3: rule__ExpressionLevel1__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__RightAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group__0"
    // InternalTaskDSL.g:2404:1: rule__ExpressionLevel2__Group__0 : rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1 ;
    public final void rule__ExpressionLevel2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2408:1: ( rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1 )
            // InternalTaskDSL.g:2409:2: rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ExpressionLevel2__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group__0"


    // $ANTLR start "rule__ExpressionLevel2__Group__0__Impl"
    // InternalTaskDSL.g:2416:1: rule__ExpressionLevel2__Group__0__Impl : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2420:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:2421:1: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:2421:1: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:2422:2: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group__1"
    // InternalTaskDSL.g:2431:1: rule__ExpressionLevel2__Group__1 : rule__ExpressionLevel2__Group__1__Impl ;
    public final void rule__ExpressionLevel2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2435:1: ( rule__ExpressionLevel2__Group__1__Impl )
            // InternalTaskDSL.g:2436:2: rule__ExpressionLevel2__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group__1"


    // $ANTLR start "rule__ExpressionLevel2__Group__1__Impl"
    // InternalTaskDSL.g:2442:1: rule__ExpressionLevel2__Group__1__Impl : ( ( rule__ExpressionLevel2__Alternatives_1 )* ) ;
    public final void rule__ExpressionLevel2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2446:1: ( ( ( rule__ExpressionLevel2__Alternatives_1 )* ) )
            // InternalTaskDSL.g:2447:1: ( ( rule__ExpressionLevel2__Alternatives_1 )* )
            {
            // InternalTaskDSL.g:2447:1: ( ( rule__ExpressionLevel2__Alternatives_1 )* )
            // InternalTaskDSL.g:2448:2: ( rule__ExpressionLevel2__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getAlternatives_1()); 
            }
            // InternalTaskDSL.g:2449:2: ( rule__ExpressionLevel2__Alternatives_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==13||(LA21_0>=42 && LA21_0<=45)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTaskDSL.g:2449:3: rule__ExpressionLevel2__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ExpressionLevel2__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__0"
    // InternalTaskDSL.g:2458:1: rule__ExpressionLevel2__Group_1_0__0 : rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1 ;
    public final void rule__ExpressionLevel2__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2462:1: ( rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1 )
            // InternalTaskDSL.g:2463:2: rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1
            {
            pushFollow(FOLLOW_24);
            rule__ExpressionLevel2__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__0__Impl"
    // InternalTaskDSL.g:2470:1: rule__ExpressionLevel2__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2474:1: ( ( () ) )
            // InternalTaskDSL.g:2475:1: ( () )
            {
            // InternalTaskDSL.g:2475:1: ( () )
            // InternalTaskDSL.g:2476:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionMultiplyLeftAction_1_0_0()); 
            }
            // InternalTaskDSL.g:2477:2: ()
            // InternalTaskDSL.g:2477:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionMultiplyLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__1"
    // InternalTaskDSL.g:2485:1: rule__ExpressionLevel2__Group_1_0__1 : rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2 ;
    public final void rule__ExpressionLevel2__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2489:1: ( rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2 )
            // InternalTaskDSL.g:2490:2: rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2
            {
            pushFollow(FOLLOW_16);
            rule__ExpressionLevel2__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__1__Impl"
    // InternalTaskDSL.g:2497:1: rule__ExpressionLevel2__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__ExpressionLevel2__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2501:1: ( ( '*' ) )
            // InternalTaskDSL.g:2502:1: ( '*' )
            {
            // InternalTaskDSL.g:2502:1: ( '*' )
            // InternalTaskDSL.g:2503:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getAsteriskKeyword_1_0_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getAsteriskKeyword_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__2"
    // InternalTaskDSL.g:2512:1: rule__ExpressionLevel2__Group_1_0__2 : rule__ExpressionLevel2__Group_1_0__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2516:1: ( rule__ExpressionLevel2__Group_1_0__2__Impl )
            // InternalTaskDSL.g:2517:2: rule__ExpressionLevel2__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__2__Impl"
    // InternalTaskDSL.g:2523:1: rule__ExpressionLevel2__Group_1_0__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2527:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) ) )
            // InternalTaskDSL.g:2528:1: ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) )
            {
            // InternalTaskDSL.g:2528:1: ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) )
            // InternalTaskDSL.g:2529:2: ( rule__ExpressionLevel2__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_0_2()); 
            }
            // InternalTaskDSL.g:2530:2: ( rule__ExpressionLevel2__RightAssignment_1_0_2 )
            // InternalTaskDSL.g:2530:3: rule__ExpressionLevel2__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__0"
    // InternalTaskDSL.g:2539:1: rule__ExpressionLevel2__Group_1_1__0 : rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1 ;
    public final void rule__ExpressionLevel2__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2543:1: ( rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1 )
            // InternalTaskDSL.g:2544:2: rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1
            {
            pushFollow(FOLLOW_25);
            rule__ExpressionLevel2__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__0__Impl"
    // InternalTaskDSL.g:2551:1: rule__ExpressionLevel2__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2555:1: ( ( () ) )
            // InternalTaskDSL.g:2556:1: ( () )
            {
            // InternalTaskDSL.g:2556:1: ( () )
            // InternalTaskDSL.g:2557:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionDivisionLeftAction_1_1_0()); 
            }
            // InternalTaskDSL.g:2558:2: ()
            // InternalTaskDSL.g:2558:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionDivisionLeftAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__1"
    // InternalTaskDSL.g:2566:1: rule__ExpressionLevel2__Group_1_1__1 : rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2 ;
    public final void rule__ExpressionLevel2__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2570:1: ( rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2 )
            // InternalTaskDSL.g:2571:2: rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ExpressionLevel2__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__1__Impl"
    // InternalTaskDSL.g:2578:1: rule__ExpressionLevel2__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__ExpressionLevel2__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2582:1: ( ( '/' ) )
            // InternalTaskDSL.g:2583:1: ( '/' )
            {
            // InternalTaskDSL.g:2583:1: ( '/' )
            // InternalTaskDSL.g:2584:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getSolidusKeyword_1_1_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getSolidusKeyword_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__2"
    // InternalTaskDSL.g:2593:1: rule__ExpressionLevel2__Group_1_1__2 : rule__ExpressionLevel2__Group_1_1__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2597:1: ( rule__ExpressionLevel2__Group_1_1__2__Impl )
            // InternalTaskDSL.g:2598:2: rule__ExpressionLevel2__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__2__Impl"
    // InternalTaskDSL.g:2604:1: rule__ExpressionLevel2__Group_1_1__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2608:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) ) )
            // InternalTaskDSL.g:2609:1: ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) )
            {
            // InternalTaskDSL.g:2609:1: ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) )
            // InternalTaskDSL.g:2610:2: ( rule__ExpressionLevel2__RightAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_1_2()); 
            }
            // InternalTaskDSL.g:2611:2: ( rule__ExpressionLevel2__RightAssignment_1_1_2 )
            // InternalTaskDSL.g:2611:3: rule__ExpressionLevel2__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__0"
    // InternalTaskDSL.g:2620:1: rule__ExpressionLevel2__Group_1_2__0 : rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1 ;
    public final void rule__ExpressionLevel2__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2624:1: ( rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1 )
            // InternalTaskDSL.g:2625:2: rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1
            {
            pushFollow(FOLLOW_26);
            rule__ExpressionLevel2__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__0__Impl"
    // InternalTaskDSL.g:2632:1: rule__ExpressionLevel2__Group_1_2__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2636:1: ( ( () ) )
            // InternalTaskDSL.g:2637:1: ( () )
            {
            // InternalTaskDSL.g:2637:1: ( () )
            // InternalTaskDSL.g:2638:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionMaximumLeftAction_1_2_0()); 
            }
            // InternalTaskDSL.g:2639:2: ()
            // InternalTaskDSL.g:2639:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionMaximumLeftAction_1_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__1"
    // InternalTaskDSL.g:2647:1: rule__ExpressionLevel2__Group_1_2__1 : rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2 ;
    public final void rule__ExpressionLevel2__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2651:1: ( rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2 )
            // InternalTaskDSL.g:2652:2: rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2
            {
            pushFollow(FOLLOW_16);
            rule__ExpressionLevel2__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__1__Impl"
    // InternalTaskDSL.g:2659:1: rule__ExpressionLevel2__Group_1_2__1__Impl : ( 'max' ) ;
    public final void rule__ExpressionLevel2__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2663:1: ( ( 'max' ) )
            // InternalTaskDSL.g:2664:1: ( 'max' )
            {
            // InternalTaskDSL.g:2664:1: ( 'max' )
            // InternalTaskDSL.g:2665:2: 'max'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getMaxKeyword_1_2_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getMaxKeyword_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__2"
    // InternalTaskDSL.g:2674:1: rule__ExpressionLevel2__Group_1_2__2 : rule__ExpressionLevel2__Group_1_2__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2678:1: ( rule__ExpressionLevel2__Group_1_2__2__Impl )
            // InternalTaskDSL.g:2679:2: rule__ExpressionLevel2__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__2__Impl"
    // InternalTaskDSL.g:2685:1: rule__ExpressionLevel2__Group_1_2__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2689:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) ) )
            // InternalTaskDSL.g:2690:1: ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) )
            {
            // InternalTaskDSL.g:2690:1: ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) )
            // InternalTaskDSL.g:2691:2: ( rule__ExpressionLevel2__RightAssignment_1_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_2_2()); 
            }
            // InternalTaskDSL.g:2692:2: ( rule__ExpressionLevel2__RightAssignment_1_2_2 )
            // InternalTaskDSL.g:2692:3: rule__ExpressionLevel2__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__0"
    // InternalTaskDSL.g:2701:1: rule__ExpressionLevel2__Group_1_3__0 : rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1 ;
    public final void rule__ExpressionLevel2__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2705:1: ( rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1 )
            // InternalTaskDSL.g:2706:2: rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1
            {
            pushFollow(FOLLOW_27);
            rule__ExpressionLevel2__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__0__Impl"
    // InternalTaskDSL.g:2713:1: rule__ExpressionLevel2__Group_1_3__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2717:1: ( ( () ) )
            // InternalTaskDSL.g:2718:1: ( () )
            {
            // InternalTaskDSL.g:2718:1: ( () )
            // InternalTaskDSL.g:2719:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionMinimumLeftAction_1_3_0()); 
            }
            // InternalTaskDSL.g:2720:2: ()
            // InternalTaskDSL.g:2720:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionMinimumLeftAction_1_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__1"
    // InternalTaskDSL.g:2728:1: rule__ExpressionLevel2__Group_1_3__1 : rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2 ;
    public final void rule__ExpressionLevel2__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2732:1: ( rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2 )
            // InternalTaskDSL.g:2733:2: rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2
            {
            pushFollow(FOLLOW_16);
            rule__ExpressionLevel2__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__1__Impl"
    // InternalTaskDSL.g:2740:1: rule__ExpressionLevel2__Group_1_3__1__Impl : ( 'min' ) ;
    public final void rule__ExpressionLevel2__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2744:1: ( ( 'min' ) )
            // InternalTaskDSL.g:2745:1: ( 'min' )
            {
            // InternalTaskDSL.g:2745:1: ( 'min' )
            // InternalTaskDSL.g:2746:2: 'min'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getMinKeyword_1_3_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getMinKeyword_1_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__2"
    // InternalTaskDSL.g:2755:1: rule__ExpressionLevel2__Group_1_3__2 : rule__ExpressionLevel2__Group_1_3__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2759:1: ( rule__ExpressionLevel2__Group_1_3__2__Impl )
            // InternalTaskDSL.g:2760:2: rule__ExpressionLevel2__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__2__Impl"
    // InternalTaskDSL.g:2766:1: rule__ExpressionLevel2__Group_1_3__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2770:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) ) )
            // InternalTaskDSL.g:2771:1: ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) )
            {
            // InternalTaskDSL.g:2771:1: ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) )
            // InternalTaskDSL.g:2772:2: ( rule__ExpressionLevel2__RightAssignment_1_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_3_2()); 
            }
            // InternalTaskDSL.g:2773:2: ( rule__ExpressionLevel2__RightAssignment_1_3_2 )
            // InternalTaskDSL.g:2773:3: rule__ExpressionLevel2__RightAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__0"
    // InternalTaskDSL.g:2782:1: rule__ExpressionLevel2__Group_1_4__0 : rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1 ;
    public final void rule__ExpressionLevel2__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2786:1: ( rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1 )
            // InternalTaskDSL.g:2787:2: rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1
            {
            pushFollow(FOLLOW_22);
            rule__ExpressionLevel2__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__0__Impl"
    // InternalTaskDSL.g:2794:1: rule__ExpressionLevel2__Group_1_4__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2798:1: ( ( () ) )
            // InternalTaskDSL.g:2799:1: ( () )
            {
            // InternalTaskDSL.g:2799:1: ( () )
            // InternalTaskDSL.g:2800:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionModuloLeftAction_1_4_0()); 
            }
            // InternalTaskDSL.g:2801:2: ()
            // InternalTaskDSL.g:2801:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionModuloLeftAction_1_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__1"
    // InternalTaskDSL.g:2809:1: rule__ExpressionLevel2__Group_1_4__1 : rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2 ;
    public final void rule__ExpressionLevel2__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2813:1: ( rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2 )
            // InternalTaskDSL.g:2814:2: rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2
            {
            pushFollow(FOLLOW_16);
            rule__ExpressionLevel2__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__1__Impl"
    // InternalTaskDSL.g:2821:1: rule__ExpressionLevel2__Group_1_4__1__Impl : ( 'mod' ) ;
    public final void rule__ExpressionLevel2__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2825:1: ( ( 'mod' ) )
            // InternalTaskDSL.g:2826:1: ( 'mod' )
            {
            // InternalTaskDSL.g:2826:1: ( 'mod' )
            // InternalTaskDSL.g:2827:2: 'mod'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getModKeyword_1_4_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getModKeyword_1_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__2"
    // InternalTaskDSL.g:2836:1: rule__ExpressionLevel2__Group_1_4__2 : rule__ExpressionLevel2__Group_1_4__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2840:1: ( rule__ExpressionLevel2__Group_1_4__2__Impl )
            // InternalTaskDSL.g:2841:2: rule__ExpressionLevel2__Group_1_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__2__Impl"
    // InternalTaskDSL.g:2847:1: rule__ExpressionLevel2__Group_1_4__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2851:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) ) )
            // InternalTaskDSL.g:2852:1: ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) )
            {
            // InternalTaskDSL.g:2852:1: ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) )
            // InternalTaskDSL.g:2853:2: ( rule__ExpressionLevel2__RightAssignment_1_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_4_2()); 
            }
            // InternalTaskDSL.g:2854:2: ( rule__ExpressionLevel2__RightAssignment_1_4_2 )
            // InternalTaskDSL.g:2854:3: rule__ExpressionLevel2__RightAssignment_1_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__2__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group__0"
    // InternalTaskDSL.g:2863:1: rule__ExpressionLevel3__Group__0 : rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1 ;
    public final void rule__ExpressionLevel3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2867:1: ( rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1 )
            // InternalTaskDSL.g:2868:2: rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ExpressionLevel3__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group__0"


    // $ANTLR start "rule__ExpressionLevel3__Group__0__Impl"
    // InternalTaskDSL.g:2875:1: rule__ExpressionLevel3__Group__0__Impl : ( ruleExpressionLevel4 ) ;
    public final void rule__ExpressionLevel3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2879:1: ( ( ruleExpressionLevel4 ) )
            // InternalTaskDSL.g:2880:1: ( ruleExpressionLevel4 )
            {
            // InternalTaskDSL.g:2880:1: ( ruleExpressionLevel4 )
            // InternalTaskDSL.g:2881:2: ruleExpressionLevel4
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group__1"
    // InternalTaskDSL.g:2890:1: rule__ExpressionLevel3__Group__1 : rule__ExpressionLevel3__Group__1__Impl ;
    public final void rule__ExpressionLevel3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2894:1: ( rule__ExpressionLevel3__Group__1__Impl )
            // InternalTaskDSL.g:2895:2: rule__ExpressionLevel3__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group__1"


    // $ANTLR start "rule__ExpressionLevel3__Group__1__Impl"
    // InternalTaskDSL.g:2901:1: rule__ExpressionLevel3__Group__1__Impl : ( ( rule__ExpressionLevel3__Group_1__0 )? ) ;
    public final void rule__ExpressionLevel3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2905:1: ( ( ( rule__ExpressionLevel3__Group_1__0 )? ) )
            // InternalTaskDSL.g:2906:1: ( ( rule__ExpressionLevel3__Group_1__0 )? )
            {
            // InternalTaskDSL.g:2906:1: ( ( rule__ExpressionLevel3__Group_1__0 )? )
            // InternalTaskDSL.g:2907:2: ( rule__ExpressionLevel3__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getGroup_1()); 
            }
            // InternalTaskDSL.g:2908:2: ( rule__ExpressionLevel3__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTaskDSL.g:2908:3: rule__ExpressionLevel3__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel3__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__0"
    // InternalTaskDSL.g:2917:1: rule__ExpressionLevel3__Group_1__0 : rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1 ;
    public final void rule__ExpressionLevel3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2921:1: ( rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1 )
            // InternalTaskDSL.g:2922:2: rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__ExpressionLevel3__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__0"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__0__Impl"
    // InternalTaskDSL.g:2929:1: rule__ExpressionLevel3__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2933:1: ( ( () ) )
            // InternalTaskDSL.g:2934:1: ( () )
            {
            // InternalTaskDSL.g:2934:1: ( () )
            // InternalTaskDSL.g:2935:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getExpressionPowerLeftAction_1_0()); 
            }
            // InternalTaskDSL.g:2936:2: ()
            // InternalTaskDSL.g:2936:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getExpressionPowerLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__1"
    // InternalTaskDSL.g:2944:1: rule__ExpressionLevel3__Group_1__1 : rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2 ;
    public final void rule__ExpressionLevel3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2948:1: ( rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2 )
            // InternalTaskDSL.g:2949:2: rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ExpressionLevel3__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__1"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__1__Impl"
    // InternalTaskDSL.g:2956:1: rule__ExpressionLevel3__Group_1__1__Impl : ( '^' ) ;
    public final void rule__ExpressionLevel3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2960:1: ( ( '^' ) )
            // InternalTaskDSL.g:2961:1: ( '^' )
            {
            // InternalTaskDSL.g:2961:1: ( '^' )
            // InternalTaskDSL.g:2962:2: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getCircumflexAccentKeyword_1_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getCircumflexAccentKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__2"
    // InternalTaskDSL.g:2971:1: rule__ExpressionLevel3__Group_1__2 : rule__ExpressionLevel3__Group_1__2__Impl ;
    public final void rule__ExpressionLevel3__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2975:1: ( rule__ExpressionLevel3__Group_1__2__Impl )
            // InternalTaskDSL.g:2976:2: rule__ExpressionLevel3__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__2"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__2__Impl"
    // InternalTaskDSL.g:2982:1: rule__ExpressionLevel3__Group_1__2__Impl : ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) ) ;
    public final void rule__ExpressionLevel3__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2986:1: ( ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) ) )
            // InternalTaskDSL.g:2987:1: ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) )
            {
            // InternalTaskDSL.g:2987:1: ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) )
            // InternalTaskDSL.g:2988:2: ( rule__ExpressionLevel3__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_2()); 
            }
            // InternalTaskDSL.g:2989:2: ( rule__ExpressionLevel3__RightAssignment_1_2 )
            // InternalTaskDSL.g:2989:3: rule__ExpressionLevel3__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__2__Impl"


    // $ANTLR start "rule__ExpressionMinus__Group__0"
    // InternalTaskDSL.g:2998:1: rule__ExpressionMinus__Group__0 : rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1 ;
    public final void rule__ExpressionMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3002:1: ( rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1 )
            // InternalTaskDSL.g:3003:2: rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ExpressionMinus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMinus__Group__0"


    // $ANTLR start "rule__ExpressionMinus__Group__0__Impl"
    // InternalTaskDSL.g:3010:1: rule__ExpressionMinus__Group__0__Impl : ( '-' ) ;
    public final void rule__ExpressionMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3014:1: ( ( '-' ) )
            // InternalTaskDSL.g:3015:1: ( '-' )
            {
            // InternalTaskDSL.g:3015:1: ( '-' )
            // InternalTaskDSL.g:3016:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMinus__Group__0__Impl"


    // $ANTLR start "rule__ExpressionMinus__Group__1"
    // InternalTaskDSL.g:3025:1: rule__ExpressionMinus__Group__1 : rule__ExpressionMinus__Group__1__Impl ;
    public final void rule__ExpressionMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3029:1: ( rule__ExpressionMinus__Group__1__Impl )
            // InternalTaskDSL.g:3030:2: rule__ExpressionMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMinus__Group__1"


    // $ANTLR start "rule__ExpressionMinus__Group__1__Impl"
    // InternalTaskDSL.g:3036:1: rule__ExpressionMinus__Group__1__Impl : ( ( rule__ExpressionMinus__SubAssignment_1 ) ) ;
    public final void rule__ExpressionMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3040:1: ( ( ( rule__ExpressionMinus__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:3041:1: ( ( rule__ExpressionMinus__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:3041:1: ( ( rule__ExpressionMinus__SubAssignment_1 ) )
            // InternalTaskDSL.g:3042:2: ( rule__ExpressionMinus__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getSubAssignment_1()); 
            }
            // InternalTaskDSL.g:3043:2: ( rule__ExpressionMinus__SubAssignment_1 )
            // InternalTaskDSL.g:3043:3: rule__ExpressionMinus__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getSubAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMinus__Group__1__Impl"


    // $ANTLR start "rule__ExpressionPlus__Group__0"
    // InternalTaskDSL.g:3052:1: rule__ExpressionPlus__Group__0 : rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1 ;
    public final void rule__ExpressionPlus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3056:1: ( rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1 )
            // InternalTaskDSL.g:3057:2: rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ExpressionPlus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionPlus__Group__0"


    // $ANTLR start "rule__ExpressionPlus__Group__0__Impl"
    // InternalTaskDSL.g:3064:1: rule__ExpressionPlus__Group__0__Impl : ( '+' ) ;
    public final void rule__ExpressionPlus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3068:1: ( ( '+' ) )
            // InternalTaskDSL.g:3069:1: ( '+' )
            {
            // InternalTaskDSL.g:3069:1: ( '+' )
            // InternalTaskDSL.g:3070:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionPlus__Group__0__Impl"


    // $ANTLR start "rule__ExpressionPlus__Group__1"
    // InternalTaskDSL.g:3079:1: rule__ExpressionPlus__Group__1 : rule__ExpressionPlus__Group__1__Impl ;
    public final void rule__ExpressionPlus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3083:1: ( rule__ExpressionPlus__Group__1__Impl )
            // InternalTaskDSL.g:3084:2: rule__ExpressionPlus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionPlus__Group__1"


    // $ANTLR start "rule__ExpressionPlus__Group__1__Impl"
    // InternalTaskDSL.g:3090:1: rule__ExpressionPlus__Group__1__Impl : ( ( rule__ExpressionPlus__SubAssignment_1 ) ) ;
    public final void rule__ExpressionPlus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3094:1: ( ( ( rule__ExpressionPlus__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:3095:1: ( ( rule__ExpressionPlus__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:3095:1: ( ( rule__ExpressionPlus__SubAssignment_1 ) )
            // InternalTaskDSL.g:3096:2: ( rule__ExpressionPlus__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getSubAssignment_1()); 
            }
            // InternalTaskDSL.g:3097:2: ( rule__ExpressionPlus__SubAssignment_1 )
            // InternalTaskDSL.g:3097:3: rule__ExpressionPlus__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getSubAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionPlus__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__0"
    // InternalTaskDSL.g:3106:1: rule__ExpressionBracket__Group__0 : rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 ;
    public final void rule__ExpressionBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3110:1: ( rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 )
            // InternalTaskDSL.g:3111:2: rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ExpressionBracket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__0"


    // $ANTLR start "rule__ExpressionBracket__Group__0__Impl"
    // InternalTaskDSL.g:3118:1: rule__ExpressionBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__ExpressionBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3122:1: ( ( '(' ) )
            // InternalTaskDSL.g:3123:1: ( '(' )
            {
            // InternalTaskDSL.g:3123:1: ( '(' )
            // InternalTaskDSL.g:3124:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__0__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__1"
    // InternalTaskDSL.g:3133:1: rule__ExpressionBracket__Group__1 : rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 ;
    public final void rule__ExpressionBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3137:1: ( rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 )
            // InternalTaskDSL.g:3138:2: rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__ExpressionBracket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__1"


    // $ANTLR start "rule__ExpressionBracket__Group__1__Impl"
    // InternalTaskDSL.g:3145:1: rule__ExpressionBracket__Group__1__Impl : ( ( rule__ExpressionBracket__SubAssignment_1 ) ) ;
    public final void rule__ExpressionBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3149:1: ( ( ( rule__ExpressionBracket__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:3150:1: ( ( rule__ExpressionBracket__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:3150:1: ( ( rule__ExpressionBracket__SubAssignment_1 ) )
            // InternalTaskDSL.g:3151:2: ( rule__ExpressionBracket__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getSubAssignment_1()); 
            }
            // InternalTaskDSL.g:3152:2: ( rule__ExpressionBracket__SubAssignment_1 )
            // InternalTaskDSL.g:3152:3: rule__ExpressionBracket__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getSubAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__2"
    // InternalTaskDSL.g:3160:1: rule__ExpressionBracket__Group__2 : rule__ExpressionBracket__Group__2__Impl ;
    public final void rule__ExpressionBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3164:1: ( rule__ExpressionBracket__Group__2__Impl )
            // InternalTaskDSL.g:3165:2: rule__ExpressionBracket__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__2"


    // $ANTLR start "rule__ExpressionBracket__Group__2__Impl"
    // InternalTaskDSL.g:3171:1: rule__ExpressionBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__ExpressionBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3175:1: ( ( ')' ) )
            // InternalTaskDSL.g:3176:1: ( ')' )
            {
            // InternalTaskDSL.g:3176:1: ( ')' )
            // InternalTaskDSL.g:3177:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__2__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__0"
    // InternalTaskDSL.g:3187:1: rule__BooleanExpressionLevel1__Group__0 : rule__BooleanExpressionLevel1__Group__0__Impl rule__BooleanExpressionLevel1__Group__1 ;
    public final void rule__BooleanExpressionLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3191:1: ( rule__BooleanExpressionLevel1__Group__0__Impl rule__BooleanExpressionLevel1__Group__1 )
            // InternalTaskDSL.g:3192:2: rule__BooleanExpressionLevel1__Group__0__Impl rule__BooleanExpressionLevel1__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__BooleanExpressionLevel1__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__0"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__0__Impl"
    // InternalTaskDSL.g:3199:1: rule__BooleanExpressionLevel1__Group__0__Impl : ( ruleBooleanExpressionLevel2 ) ;
    public final void rule__BooleanExpressionLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3203:1: ( ( ruleBooleanExpressionLevel2 ) )
            // InternalTaskDSL.g:3204:1: ( ruleBooleanExpressionLevel2 )
            {
            // InternalTaskDSL.g:3204:1: ( ruleBooleanExpressionLevel2 )
            // InternalTaskDSL.g:3205:2: ruleBooleanExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getBooleanExpressionLevel2ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getBooleanExpressionLevel2ParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__0__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__1"
    // InternalTaskDSL.g:3214:1: rule__BooleanExpressionLevel1__Group__1 : rule__BooleanExpressionLevel1__Group__1__Impl ;
    public final void rule__BooleanExpressionLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3218:1: ( rule__BooleanExpressionLevel1__Group__1__Impl )
            // InternalTaskDSL.g:3219:2: rule__BooleanExpressionLevel1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__1"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__1__Impl"
    // InternalTaskDSL.g:3225:1: rule__BooleanExpressionLevel1__Group__1__Impl : ( ( rule__BooleanExpressionLevel1__Group_1__0 )* ) ;
    public final void rule__BooleanExpressionLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3229:1: ( ( ( rule__BooleanExpressionLevel1__Group_1__0 )* ) )
            // InternalTaskDSL.g:3230:1: ( ( rule__BooleanExpressionLevel1__Group_1__0 )* )
            {
            // InternalTaskDSL.g:3230:1: ( ( rule__BooleanExpressionLevel1__Group_1__0 )* )
            // InternalTaskDSL.g:3231:2: ( rule__BooleanExpressionLevel1__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getGroup_1()); 
            }
            // InternalTaskDSL.g:3232:2: ( rule__BooleanExpressionLevel1__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=17 && LA23_0<=18)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTaskDSL.g:3232:3: rule__BooleanExpressionLevel1__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__BooleanExpressionLevel1__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__0"
    // InternalTaskDSL.g:3241:1: rule__BooleanExpressionLevel1__Group_1__0 : rule__BooleanExpressionLevel1__Group_1__0__Impl rule__BooleanExpressionLevel1__Group_1__1 ;
    public final void rule__BooleanExpressionLevel1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3245:1: ( rule__BooleanExpressionLevel1__Group_1__0__Impl rule__BooleanExpressionLevel1__Group_1__1 )
            // InternalTaskDSL.g:3246:2: rule__BooleanExpressionLevel1__Group_1__0__Impl rule__BooleanExpressionLevel1__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__BooleanExpressionLevel1__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__0"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__0__Impl"
    // InternalTaskDSL.g:3253:1: rule__BooleanExpressionLevel1__Group_1__0__Impl : ( () ) ;
    public final void rule__BooleanExpressionLevel1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3257:1: ( ( () ) )
            // InternalTaskDSL.g:3258:1: ( () )
            {
            // InternalTaskDSL.g:3258:1: ( () )
            // InternalTaskDSL.g:3259:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getExpressionBinOpLeftAction_1_0()); 
            }
            // InternalTaskDSL.g:3260:2: ()
            // InternalTaskDSL.g:3260:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getExpressionBinOpLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__0__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__1"
    // InternalTaskDSL.g:3268:1: rule__BooleanExpressionLevel1__Group_1__1 : rule__BooleanExpressionLevel1__Group_1__1__Impl rule__BooleanExpressionLevel1__Group_1__2 ;
    public final void rule__BooleanExpressionLevel1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3272:1: ( rule__BooleanExpressionLevel1__Group_1__1__Impl rule__BooleanExpressionLevel1__Group_1__2 )
            // InternalTaskDSL.g:3273:2: rule__BooleanExpressionLevel1__Group_1__1__Impl rule__BooleanExpressionLevel1__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__BooleanExpressionLevel1__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__1"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__1__Impl"
    // InternalTaskDSL.g:3280:1: rule__BooleanExpressionLevel1__Group_1__1__Impl : ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) ) ;
    public final void rule__BooleanExpressionLevel1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3284:1: ( ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) ) )
            // InternalTaskDSL.g:3285:1: ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) )
            {
            // InternalTaskDSL.g:3285:1: ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) )
            // InternalTaskDSL.g:3286:2: ( rule__BooleanExpressionLevel1__BopAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getBopAssignment_1_1()); 
            }
            // InternalTaskDSL.g:3287:2: ( rule__BooleanExpressionLevel1__BopAssignment_1_1 )
            // InternalTaskDSL.g:3287:3: rule__BooleanExpressionLevel1__BopAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__BopAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getBopAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__2"
    // InternalTaskDSL.g:3295:1: rule__BooleanExpressionLevel1__Group_1__2 : rule__BooleanExpressionLevel1__Group_1__2__Impl ;
    public final void rule__BooleanExpressionLevel1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3299:1: ( rule__BooleanExpressionLevel1__Group_1__2__Impl )
            // InternalTaskDSL.g:3300:2: rule__BooleanExpressionLevel1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__2"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__2__Impl"
    // InternalTaskDSL.g:3306:1: rule__BooleanExpressionLevel1__Group_1__2__Impl : ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) ) ;
    public final void rule__BooleanExpressionLevel1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3310:1: ( ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) ) )
            // InternalTaskDSL.g:3311:1: ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) )
            {
            // InternalTaskDSL.g:3311:1: ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) )
            // InternalTaskDSL.g:3312:2: ( rule__BooleanExpressionLevel1__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getRightAssignment_1_2()); 
            }
            // InternalTaskDSL.g:3313:2: ( rule__BooleanExpressionLevel1__RightAssignment_1_2 )
            // InternalTaskDSL.g:3313:3: rule__BooleanExpressionLevel1__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__2__Impl"


    // $ANTLR start "rule__NotExpression__Group__0"
    // InternalTaskDSL.g:3322:1: rule__NotExpression__Group__0 : rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 ;
    public final void rule__NotExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3326:1: ( rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 )
            // InternalTaskDSL.g:3327:2: rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__NotExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group__0"


    // $ANTLR start "rule__NotExpression__Group__0__Impl"
    // InternalTaskDSL.g:3334:1: rule__NotExpression__Group__0__Impl : ( 'NOT' ) ;
    public final void rule__NotExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3338:1: ( ( 'NOT' ) )
            // InternalTaskDSL.g:3339:1: ( 'NOT' )
            {
            // InternalTaskDSL.g:3339:1: ( 'NOT' )
            // InternalTaskDSL.g:3340:2: 'NOT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getNOTKeyword_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getNOTKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group__0__Impl"


    // $ANTLR start "rule__NotExpression__Group__1"
    // InternalTaskDSL.g:3349:1: rule__NotExpression__Group__1 : rule__NotExpression__Group__1__Impl ;
    public final void rule__NotExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3353:1: ( rule__NotExpression__Group__1__Impl )
            // InternalTaskDSL.g:3354:2: rule__NotExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group__1"


    // $ANTLR start "rule__NotExpression__Group__1__Impl"
    // InternalTaskDSL.g:3360:1: rule__NotExpression__Group__1__Impl : ( ( rule__NotExpression__SubAssignment_1 ) ) ;
    public final void rule__NotExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3364:1: ( ( ( rule__NotExpression__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:3365:1: ( ( rule__NotExpression__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:3365:1: ( ( rule__NotExpression__SubAssignment_1 ) )
            // InternalTaskDSL.g:3366:2: ( rule__NotExpression__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubAssignment_1()); 
            }
            // InternalTaskDSL.g:3367:2: ( rule__NotExpression__SubAssignment_1 )
            // InternalTaskDSL.g:3367:3: rule__NotExpression__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getSubAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // InternalTaskDSL.g:3376:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3380:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalTaskDSL.g:3381:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // InternalTaskDSL.g:3388:1: rule__ComparisonExpression__Group__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3392:1: ( ( () ) )
            // InternalTaskDSL.g:3393:1: ( () )
            {
            // InternalTaskDSL.g:3393:1: ( () )
            // InternalTaskDSL.g:3394:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getExpressionCompOpAction_0()); 
            }
            // InternalTaskDSL.g:3395:2: ()
            // InternalTaskDSL.g:3395:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getExpressionCompOpAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // InternalTaskDSL.g:3403:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl rule__ComparisonExpression__Group__2 ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3407:1: ( rule__ComparisonExpression__Group__1__Impl rule__ComparisonExpression__Group__2 )
            // InternalTaskDSL.g:3408:2: rule__ComparisonExpression__Group__1__Impl rule__ComparisonExpression__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // InternalTaskDSL.g:3415:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__LeftAssignment_1 ) ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3419:1: ( ( ( rule__ComparisonExpression__LeftAssignment_1 ) ) )
            // InternalTaskDSL.g:3420:1: ( ( rule__ComparisonExpression__LeftAssignment_1 ) )
            {
            // InternalTaskDSL.g:3420:1: ( ( rule__ComparisonExpression__LeftAssignment_1 ) )
            // InternalTaskDSL.g:3421:2: ( rule__ComparisonExpression__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getLeftAssignment_1()); 
            }
            // InternalTaskDSL.g:3422:2: ( rule__ComparisonExpression__LeftAssignment_1 )
            // InternalTaskDSL.g:3422:3: rule__ComparisonExpression__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__2"
    // InternalTaskDSL.g:3430:1: rule__ComparisonExpression__Group__2 : rule__ComparisonExpression__Group__2__Impl rule__ComparisonExpression__Group__3 ;
    public final void rule__ComparisonExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3434:1: ( rule__ComparisonExpression__Group__2__Impl rule__ComparisonExpression__Group__3 )
            // InternalTaskDSL.g:3435:2: rule__ComparisonExpression__Group__2__Impl rule__ComparisonExpression__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ComparisonExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__2"


    // $ANTLR start "rule__ComparisonExpression__Group__2__Impl"
    // InternalTaskDSL.g:3442:1: rule__ComparisonExpression__Group__2__Impl : ( ( rule__ComparisonExpression__OpAssignment_2 ) ) ;
    public final void rule__ComparisonExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3446:1: ( ( ( rule__ComparisonExpression__OpAssignment_2 ) ) )
            // InternalTaskDSL.g:3447:1: ( ( rule__ComparisonExpression__OpAssignment_2 ) )
            {
            // InternalTaskDSL.g:3447:1: ( ( rule__ComparisonExpression__OpAssignment_2 ) )
            // InternalTaskDSL.g:3448:2: ( rule__ComparisonExpression__OpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getOpAssignment_2()); 
            }
            // InternalTaskDSL.g:3449:2: ( rule__ComparisonExpression__OpAssignment_2 )
            // InternalTaskDSL.g:3449:3: rule__ComparisonExpression__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__OpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getOpAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__2__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__3"
    // InternalTaskDSL.g:3457:1: rule__ComparisonExpression__Group__3 : rule__ComparisonExpression__Group__3__Impl ;
    public final void rule__ComparisonExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3461:1: ( rule__ComparisonExpression__Group__3__Impl )
            // InternalTaskDSL.g:3462:2: rule__ComparisonExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__3"


    // $ANTLR start "rule__ComparisonExpression__Group__3__Impl"
    // InternalTaskDSL.g:3468:1: rule__ComparisonExpression__Group__3__Impl : ( ( rule__ComparisonExpression__RightAssignment_3 ) ) ;
    public final void rule__ComparisonExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3472:1: ( ( ( rule__ComparisonExpression__RightAssignment_3 ) ) )
            // InternalTaskDSL.g:3473:1: ( ( rule__ComparisonExpression__RightAssignment_3 ) )
            {
            // InternalTaskDSL.g:3473:1: ( ( rule__ComparisonExpression__RightAssignment_3 ) )
            // InternalTaskDSL.g:3474:2: ( rule__ComparisonExpression__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_3()); 
            }
            // InternalTaskDSL.g:3475:2: ( rule__ComparisonExpression__RightAssignment_3 )
            // InternalTaskDSL.g:3475:3: rule__ComparisonExpression__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getRightAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__3__Impl"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__0"
    // InternalTaskDSL.g:3484:1: rule__BooleanExpressionBracket__Group__0 : rule__BooleanExpressionBracket__Group__0__Impl rule__BooleanExpressionBracket__Group__1 ;
    public final void rule__BooleanExpressionBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3488:1: ( rule__BooleanExpressionBracket__Group__0__Impl rule__BooleanExpressionBracket__Group__1 )
            // InternalTaskDSL.g:3489:2: rule__BooleanExpressionBracket__Group__0__Impl rule__BooleanExpressionBracket__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__BooleanExpressionBracket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionBracket__Group__0"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__0__Impl"
    // InternalTaskDSL.g:3496:1: rule__BooleanExpressionBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__BooleanExpressionBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3500:1: ( ( '(' ) )
            // InternalTaskDSL.g:3501:1: ( '(' )
            {
            // InternalTaskDSL.g:3501:1: ( '(' )
            // InternalTaskDSL.g:3502:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionBracket__Group__0__Impl"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__1"
    // InternalTaskDSL.g:3511:1: rule__BooleanExpressionBracket__Group__1 : rule__BooleanExpressionBracket__Group__1__Impl rule__BooleanExpressionBracket__Group__2 ;
    public final void rule__BooleanExpressionBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3515:1: ( rule__BooleanExpressionBracket__Group__1__Impl rule__BooleanExpressionBracket__Group__2 )
            // InternalTaskDSL.g:3516:2: rule__BooleanExpressionBracket__Group__1__Impl rule__BooleanExpressionBracket__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__BooleanExpressionBracket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionBracket__Group__1"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__1__Impl"
    // InternalTaskDSL.g:3523:1: rule__BooleanExpressionBracket__Group__1__Impl : ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) ) ;
    public final void rule__BooleanExpressionBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3527:1: ( ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:3528:1: ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:3528:1: ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) )
            // InternalTaskDSL.g:3529:2: ( rule__BooleanExpressionBracket__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getSubAssignment_1()); 
            }
            // InternalTaskDSL.g:3530:2: ( rule__BooleanExpressionBracket__SubAssignment_1 )
            // InternalTaskDSL.g:3530:3: rule__BooleanExpressionBracket__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getSubAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionBracket__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__2"
    // InternalTaskDSL.g:3538:1: rule__BooleanExpressionBracket__Group__2 : rule__BooleanExpressionBracket__Group__2__Impl ;
    public final void rule__BooleanExpressionBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3542:1: ( rule__BooleanExpressionBracket__Group__2__Impl )
            // InternalTaskDSL.g:3543:2: rule__BooleanExpressionBracket__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionBracket__Group__2"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__2__Impl"
    // InternalTaskDSL.g:3549:1: rule__BooleanExpressionBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__BooleanExpressionBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3553:1: ( ( ')' ) )
            // InternalTaskDSL.g:3554:1: ( ')' )
            {
            // InternalTaskDSL.g:3554:1: ( ')' )
            // InternalTaskDSL.g:3555:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionBracket__Group__2__Impl"


    // $ANTLR start "rule__Planning__NameAssignment_1"
    // InternalTaskDSL.g:3565:1: rule__Planning__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Planning__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3569:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:3570:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:3570:2: ( RULE_ID )
            // InternalTaskDSL.g:3571:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__NameAssignment_1"


    // $ANTLR start "rule__Planning__AnonymousAssignment_2"
    // InternalTaskDSL.g:3580:1: rule__Planning__AnonymousAssignment_2 : ( ( 'anonymous' ) ) ;
    public final void rule__Planning__AnonymousAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3584:1: ( ( ( 'anonymous' ) ) )
            // InternalTaskDSL.g:3585:2: ( ( 'anonymous' ) )
            {
            // InternalTaskDSL.g:3585:2: ( ( 'anonymous' ) )
            // InternalTaskDSL.g:3586:3: ( 'anonymous' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 
            }
            // InternalTaskDSL.g:3587:3: ( 'anonymous' )
            // InternalTaskDSL.g:3588:4: 'anonymous'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__AnonymousAssignment_2"


    // $ANTLR start "rule__Planning__PersonsAssignment_3_0"
    // InternalTaskDSL.g:3599:1: rule__Planning__PersonsAssignment_3_0 : ( rulePerson ) ;
    public final void rule__Planning__PersonsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3603:1: ( ( rulePerson ) )
            // InternalTaskDSL.g:3604:2: ( rulePerson )
            {
            // InternalTaskDSL.g:3604:2: ( rulePerson )
            // InternalTaskDSL.g:3605:3: rulePerson
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__PersonsAssignment_3_0"


    // $ANTLR start "rule__Planning__TasksAssignment_3_1"
    // InternalTaskDSL.g:3614:1: rule__Planning__TasksAssignment_3_1 : ( ruleTask ) ;
    public final void rule__Planning__TasksAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3618:1: ( ( ruleTask ) )
            // InternalTaskDSL.g:3619:2: ( ruleTask )
            {
            // InternalTaskDSL.g:3619:2: ( ruleTask )
            // InternalTaskDSL.g:3620:3: ruleTask
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__TasksAssignment_3_1"


    // $ANTLR start "rule__Person__NameAssignment_1"
    // InternalTaskDSL.g:3629:1: rule__Person__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3633:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:3634:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:3634:2: ( RULE_ID )
            // InternalTaskDSL.g:3635:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__NameAssignment_1"


    // $ANTLR start "rule__Task__NameAssignment_1"
    // InternalTaskDSL.g:3644:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3648:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:3649:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:3649:2: ( RULE_ID )
            // InternalTaskDSL.g:3650:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__NameAssignment_1"


    // $ANTLR start "rule__Task__ActionAssignment_2"
    // InternalTaskDSL.g:3659:1: rule__Task__ActionAssignment_2 : ( ruleAction ) ;
    public final void rule__Task__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3663:1: ( ( ruleAction ) )
            // InternalTaskDSL.g:3664:2: ( ruleAction )
            {
            // InternalTaskDSL.g:3664:2: ( ruleAction )
            // InternalTaskDSL.g:3665:3: ruleAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getActionActionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getActionActionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ActionAssignment_2"


    // $ANTLR start "rule__Task__PersonsAssignment_4"
    // InternalTaskDSL.g:3674:1: rule__Task__PersonsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Task__PersonsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3678:1: ( ( ( RULE_ID ) ) )
            // InternalTaskDSL.g:3679:2: ( ( RULE_ID ) )
            {
            // InternalTaskDSL.g:3679:2: ( ( RULE_ID ) )
            // InternalTaskDSL.g:3680:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPersonsPersonCrossReference_4_0()); 
            }
            // InternalTaskDSL.g:3681:3: ( RULE_ID )
            // InternalTaskDSL.g:3682:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPersonsPersonIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPersonsPersonIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPersonsPersonCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__PersonsAssignment_4"


    // $ANTLR start "rule__Task__PrioAssignment_6"
    // InternalTaskDSL.g:3693:1: rule__Task__PrioAssignment_6 : ( RULE_INT ) ;
    public final void rule__Task__PrioAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3697:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:3698:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:3698:2: ( RULE_INT )
            // InternalTaskDSL.g:3699:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_6_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__PrioAssignment_6"


    // $ANTLR start "rule__Task__DurationAssignment_7_1"
    // InternalTaskDSL.g:3708:1: rule__Task__DurationAssignment_7_1 : ( ruleDuration ) ;
    public final void rule__Task__DurationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3712:1: ( ( ruleDuration ) )
            // InternalTaskDSL.g:3713:2: ( ruleDuration )
            {
            // InternalTaskDSL.g:3713:2: ( ruleDuration )
            // InternalTaskDSL.g:3714:3: ruleDuration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getDurationDurationParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getDurationDurationParserRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DurationAssignment_7_1"


    // $ANTLR start "rule__Task__ProjectsAssignment_9"
    // InternalTaskDSL.g:3723:1: rule__Task__ProjectsAssignment_9 : ( ruleProject ) ;
    public final void rule__Task__ProjectsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3727:1: ( ( ruleProject ) )
            // InternalTaskDSL.g:3728:2: ( ruleProject )
            {
            // InternalTaskDSL.g:3728:2: ( ruleProject )
            // InternalTaskDSL.g:3729:3: ruleProject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getProjectsProjectParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleProject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getProjectsProjectParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ProjectsAssignment_9"


    // $ANTLR start "rule__Task__UseAssignment_11"
    // InternalTaskDSL.g:3738:1: rule__Task__UseAssignment_11 : ( ruleProjectUse ) ;
    public final void rule__Task__UseAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3742:1: ( ( ruleProjectUse ) )
            // InternalTaskDSL.g:3743:2: ( ruleProjectUse )
            {
            // InternalTaskDSL.g:3743:2: ( ruleProjectUse )
            // InternalTaskDSL.g:3744:3: ruleProjectUse
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getUseProjectUseParserRuleCall_11_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleProjectUse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getUseProjectUseParserRuleCall_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__UseAssignment_11"


    // $ANTLR start "rule__Task__ExtendsAssignment_12_1"
    // InternalTaskDSL.g:3753:1: rule__Task__ExtendsAssignment_12_1 : ( ( RULE_ID ) ) ;
    public final void rule__Task__ExtendsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3757:1: ( ( ( RULE_ID ) ) )
            // InternalTaskDSL.g:3758:2: ( ( RULE_ID ) )
            {
            // InternalTaskDSL.g:3758:2: ( ( RULE_ID ) )
            // InternalTaskDSL.g:3759:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getExtendsTaskCrossReference_12_1_0()); 
            }
            // InternalTaskDSL.g:3760:3: ( RULE_ID )
            // InternalTaskDSL.g:3761:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getExtendsTaskIDTerminalRuleCall_12_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getExtendsTaskIDTerminalRuleCall_12_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getExtendsTaskCrossReference_12_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ExtendsAssignment_12_1"


    // $ANTLR start "rule__Project__NameAssignment"
    // InternalTaskDSL.g:3772:1: rule__Project__NameAssignment : ( RULE_ID ) ;
    public final void rule__Project__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3776:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:3777:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:3777:2: ( RULE_ID )
            // InternalTaskDSL.g:3778:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__NameAssignment"


    // $ANTLR start "rule__ProjectUse__ProjectAssignment"
    // InternalTaskDSL.g:3787:1: rule__ProjectUse__ProjectAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ProjectUse__ProjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3791:1: ( ( ( RULE_ID ) ) )
            // InternalTaskDSL.g:3792:2: ( ( RULE_ID ) )
            {
            // InternalTaskDSL.g:3792:2: ( ( RULE_ID ) )
            // InternalTaskDSL.g:3793:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectUseAccess().getProjectProjectCrossReference_0()); 
            }
            // InternalTaskDSL.g:3794:3: ( RULE_ID )
            // InternalTaskDSL.g:3795:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectUseAccess().getProjectProjectIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectUseAccess().getProjectProjectIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectUseAccess().getProjectProjectCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectUse__ProjectAssignment"


    // $ANTLR start "rule__Duration__DlAssignment_0"
    // InternalTaskDSL.g:3806:1: rule__Duration__DlAssignment_0 : ( RULE_INT ) ;
    public final void rule__Duration__DlAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3810:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:3811:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:3811:2: ( RULE_INT )
            // InternalTaskDSL.g:3812:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationAccess().getDlINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationAccess().getDlINTTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__DlAssignment_0"


    // $ANTLR start "rule__Duration__UnitAssignment_1"
    // InternalTaskDSL.g:3821:1: rule__Duration__UnitAssignment_1 : ( ruleTimeUnit ) ;
    public final void rule__Duration__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3825:1: ( ( ruleTimeUnit ) )
            // InternalTaskDSL.g:3826:2: ( ruleTimeUnit )
            {
            // InternalTaskDSL.g:3826:2: ( ruleTimeUnit )
            // InternalTaskDSL.g:3827:3: ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationAccess().getUnitTimeUnitEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationAccess().getUnitTimeUnitEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__UnitAssignment_1"


    // $ANTLR start "rule__LunchAction__LocationAssignment_1"
    // InternalTaskDSL.g:3836:1: rule__LunchAction__LocationAssignment_1 : ( RULE_ID ) ;
    public final void rule__LunchAction__LocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3840:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:3841:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:3841:2: ( RULE_ID )
            // InternalTaskDSL.g:3842:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__LocationAssignment_1"


    // $ANTLR start "rule__MeetingAction__TopicAssignment_1"
    // InternalTaskDSL.g:3851:1: rule__MeetingAction__TopicAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MeetingAction__TopicAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3855:1: ( ( RULE_STRING ) )
            // InternalTaskDSL.g:3856:2: ( RULE_STRING )
            {
            // InternalTaskDSL.g:3856:2: ( RULE_STRING )
            // InternalTaskDSL.g:3857:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__TopicAssignment_1"


    // $ANTLR start "rule__PaperAction__ReportAssignment_1"
    // InternalTaskDSL.g:3866:1: rule__PaperAction__ReportAssignment_1 : ( RULE_ID ) ;
    public final void rule__PaperAction__ReportAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3870:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:3871:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:3871:2: ( RULE_ID )
            // InternalTaskDSL.g:3872:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__ReportAssignment_1"


    // $ANTLR start "rule__PaymentAction__ConditionAssignment_0_1"
    // InternalTaskDSL.g:3881:1: rule__PaymentAction__ConditionAssignment_0_1 : ( ruleBooleanExpression ) ;
    public final void rule__PaymentAction__ConditionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3885:1: ( ( ruleBooleanExpression ) )
            // InternalTaskDSL.g:3886:2: ( ruleBooleanExpression )
            {
            // InternalTaskDSL.g:3886:2: ( ruleBooleanExpression )
            // InternalTaskDSL.g:3887:3: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getConditionBooleanExpressionParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getConditionBooleanExpressionParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__ConditionAssignment_0_1"


    // $ANTLR start "rule__PaymentAction__AmountAssignment_2"
    // InternalTaskDSL.g:3896:1: rule__PaymentAction__AmountAssignment_2 : ( ruleIntExpression ) ;
    public final void rule__PaymentAction__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3900:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:3901:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:3901:2: ( ruleIntExpression )
            // InternalTaskDSL.g:3902:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getAmountIntExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getAmountIntExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__AmountAssignment_2"


    // $ANTLR start "rule__ExpressionLevel1__RightAssignment_1_0_2"
    // InternalTaskDSL.g:3911:1: rule__ExpressionLevel1__RightAssignment_1_0_2 : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3915:1: ( ( ruleExpressionLevel2 ) )
            // InternalTaskDSL.g:3916:2: ( ruleExpressionLevel2 )
            {
            // InternalTaskDSL.g:3916:2: ( ruleExpressionLevel2 )
            // InternalTaskDSL.g:3917:3: ruleExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__RightAssignment_1_0_2"


    // $ANTLR start "rule__ExpressionLevel1__RightAssignment_1_1_2"
    // InternalTaskDSL.g:3926:1: rule__ExpressionLevel1__RightAssignment_1_1_2 : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3930:1: ( ( ruleExpressionLevel2 ) )
            // InternalTaskDSL.g:3931:2: ( ruleExpressionLevel2 )
            {
            // InternalTaskDSL.g:3931:2: ( ruleExpressionLevel2 )
            // InternalTaskDSL.g:3932:3: ruleExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__RightAssignment_1_1_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_0_2"
    // InternalTaskDSL.g:3941:1: rule__ExpressionLevel2__RightAssignment_1_0_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3945:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:3946:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:3946:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:3947:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_0_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_1_2"
    // InternalTaskDSL.g:3956:1: rule__ExpressionLevel2__RightAssignment_1_1_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3960:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:3961:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:3961:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:3962:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_1_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_2_2"
    // InternalTaskDSL.g:3971:1: rule__ExpressionLevel2__RightAssignment_1_2_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3975:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:3976:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:3976:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:3977:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_2_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_3_2"
    // InternalTaskDSL.g:3986:1: rule__ExpressionLevel2__RightAssignment_1_3_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3990:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:3991:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:3991:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:3992:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_3_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_4_2"
    // InternalTaskDSL.g:4001:1: rule__ExpressionLevel2__RightAssignment_1_4_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4005:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:4006:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:4006:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:4007:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_4_2"


    // $ANTLR start "rule__ExpressionLevel3__RightAssignment_1_2"
    // InternalTaskDSL.g:4016:1: rule__ExpressionLevel3__RightAssignment_1_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel3__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4020:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:4021:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:4021:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:4022:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel3ParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel3ParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__RightAssignment_1_2"


    // $ANTLR start "rule__ExpressionMinus__SubAssignment_1"
    // InternalTaskDSL.g:4031:1: rule__ExpressionMinus__SubAssignment_1 : ( ruleExpressionLevel5 ) ;
    public final void rule__ExpressionMinus__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4035:1: ( ( ruleExpressionLevel5 ) )
            // InternalTaskDSL.g:4036:2: ( ruleExpressionLevel5 )
            {
            // InternalTaskDSL.g:4036:2: ( ruleExpressionLevel5 )
            // InternalTaskDSL.g:4037:3: ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMinus__SubAssignment_1"


    // $ANTLR start "rule__ExpressionPlus__SubAssignment_1"
    // InternalTaskDSL.g:4046:1: rule__ExpressionPlus__SubAssignment_1 : ( ruleExpressionLevel5 ) ;
    public final void rule__ExpressionPlus__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4050:1: ( ( ruleExpressionLevel5 ) )
            // InternalTaskDSL.g:4051:2: ( ruleExpressionLevel5 )
            {
            // InternalTaskDSL.g:4051:2: ( ruleExpressionLevel5 )
            // InternalTaskDSL.g:4052:3: ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionPlus__SubAssignment_1"


    // $ANTLR start "rule__ExpressionBracket__SubAssignment_1"
    // InternalTaskDSL.g:4061:1: rule__ExpressionBracket__SubAssignment_1 : ( ruleIntExpression ) ;
    public final void rule__ExpressionBracket__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4065:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:4066:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:4066:2: ( ruleIntExpression )
            // InternalTaskDSL.g:4067:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getSubIntExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getSubIntExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__SubAssignment_1"


    // $ANTLR start "rule__ExpressionConstantInt__ValueAssignment"
    // InternalTaskDSL.g:4076:1: rule__ExpressionConstantInt__ValueAssignment : ( RULE_INT ) ;
    public final void rule__ExpressionConstantInt__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4080:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:4081:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:4081:2: ( RULE_INT )
            // InternalTaskDSL.g:4082:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionConstantInt__ValueAssignment"


    // $ANTLR start "rule__ExpressionBalance__ValueAssignment"
    // InternalTaskDSL.g:4091:1: rule__ExpressionBalance__ValueAssignment : ( ruleBalance ) ;
    public final void rule__ExpressionBalance__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4095:1: ( ( ruleBalance ) )
            // InternalTaskDSL.g:4096:2: ( ruleBalance )
            {
            // InternalTaskDSL.g:4096:2: ( ruleBalance )
            // InternalTaskDSL.g:4097:3: ruleBalance
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBalanceAccess().getValueBalanceEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBalance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBalanceAccess().getValueBalanceEnumRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBalance__ValueAssignment"


    // $ANTLR start "rule__BooleanExpressionLevel1__BopAssignment_1_1"
    // InternalTaskDSL.g:4106:1: rule__BooleanExpressionLevel1__BopAssignment_1_1 : ( ruleBinaryBooleanOperator ) ;
    public final void rule__BooleanExpressionLevel1__BopAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4110:1: ( ( ruleBinaryBooleanOperator ) )
            // InternalTaskDSL.g:4111:2: ( ruleBinaryBooleanOperator )
            {
            // InternalTaskDSL.g:4111:2: ( ruleBinaryBooleanOperator )
            // InternalTaskDSL.g:4112:3: ruleBinaryBooleanOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getBopBinaryBooleanOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryBooleanOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getBopBinaryBooleanOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__BopAssignment_1_1"


    // $ANTLR start "rule__BooleanExpressionLevel1__RightAssignment_1_2"
    // InternalTaskDSL.g:4121:1: rule__BooleanExpressionLevel1__RightAssignment_1_2 : ( ruleBooleanExpressionLevel2 ) ;
    public final void rule__BooleanExpressionLevel1__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4125:1: ( ( ruleBooleanExpressionLevel2 ) )
            // InternalTaskDSL.g:4126:2: ( ruleBooleanExpressionLevel2 )
            {
            // InternalTaskDSL.g:4126:2: ( ruleBooleanExpressionLevel2 )
            // InternalTaskDSL.g:4127:3: ruleBooleanExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getRightBooleanExpressionLevel2ParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getRightBooleanExpressionLevel2ParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__RightAssignment_1_2"


    // $ANTLR start "rule__NotExpression__SubAssignment_1"
    // InternalTaskDSL.g:4136:1: rule__NotExpression__SubAssignment_1 : ( ruleBooleanExpressionLevel3 ) ;
    public final void rule__NotExpression__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4140:1: ( ( ruleBooleanExpressionLevel3 ) )
            // InternalTaskDSL.g:4141:2: ( ruleBooleanExpressionLevel3 )
            {
            // InternalTaskDSL.g:4141:2: ( ruleBooleanExpressionLevel3 )
            // InternalTaskDSL.g:4142:3: ruleBooleanExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubBooleanExpressionLevel3ParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getSubBooleanExpressionLevel3ParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__SubAssignment_1"


    // $ANTLR start "rule__ComparisonExpression__LeftAssignment_1"
    // InternalTaskDSL.g:4151:1: rule__ComparisonExpression__LeftAssignment_1 : ( ruleIntExpression ) ;
    public final void rule__ComparisonExpression__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4155:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:4156:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:4156:2: ( ruleIntExpression )
            // InternalTaskDSL.g:4157:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getLeftIntExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getLeftIntExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__LeftAssignment_1"


    // $ANTLR start "rule__ComparisonExpression__OpAssignment_2"
    // InternalTaskDSL.g:4166:1: rule__ComparisonExpression__OpAssignment_2 : ( ruleCompareOperator ) ;
    public final void rule__ComparisonExpression__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4170:1: ( ( ruleCompareOperator ) )
            // InternalTaskDSL.g:4171:2: ( ruleCompareOperator )
            {
            // InternalTaskDSL.g:4171:2: ( ruleCompareOperator )
            // InternalTaskDSL.g:4172:3: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getOpCompareOperatorEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompareOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getOpCompareOperatorEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__OpAssignment_2"


    // $ANTLR start "rule__ComparisonExpression__RightAssignment_3"
    // InternalTaskDSL.g:4181:1: rule__ComparisonExpression__RightAssignment_3 : ( ruleIntExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4185:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:4186:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:4186:2: ( ruleIntExpression )
            // InternalTaskDSL.g:4187:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getRightIntExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getRightIntExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__RightAssignment_3"


    // $ANTLR start "rule__BooleanExpressionBracket__SubAssignment_1"
    // InternalTaskDSL.g:4196:1: rule__BooleanExpressionBracket__SubAssignment_1 : ( ruleBooleanExpression ) ;
    public final void rule__BooleanExpressionBracket__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4200:1: ( ( ruleBooleanExpression ) )
            // InternalTaskDSL.g:4201:2: ( ruleBooleanExpression )
            {
            // InternalTaskDSL.g:4201:2: ( ruleBooleanExpression )
            // InternalTaskDSL.g:4202:3: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getSubBooleanExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getSubBooleanExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionBracket__SubAssignment_1"


    // $ANTLR start "rule__BooleanExpressionConstant__ValueAssignment"
    // InternalTaskDSL.g:4211:1: rule__BooleanExpressionConstant__ValueAssignment : ( RULE_BOOL_LITERAL ) ;
    public final void rule__BooleanExpressionConstant__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4215:1: ( ( RULE_BOOL_LITERAL ) )
            // InternalTaskDSL.g:4216:2: ( RULE_BOOL_LITERAL )
            {
            // InternalTaskDSL.g:4216:2: ( RULE_BOOL_LITERAL )
            // InternalTaskDSL.g:4217:3: RULE_BOOL_LITERAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionConstantAccess().getValueBOOL_LITERALTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOL_LITERAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionConstantAccess().getValueBOOL_LITERALTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionConstant__ValueAssignment"

    // $ANTLR start synpred15_InternalTaskDSL
    public final void synpred15_InternalTaskDSL_fragment() throws RecognitionException {   
        // InternalTaskDSL.g:1061:2: ( ( ( ruleComparisonExpression ) ) )
        // InternalTaskDSL.g:1061:2: ( ( ruleComparisonExpression ) )
        {
        // InternalTaskDSL.g:1061:2: ( ( ruleComparisonExpression ) )
        // InternalTaskDSL.g:1062:3: ( ruleComparisonExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0()); 
        }
        // InternalTaskDSL.g:1063:3: ( ruleComparisonExpression )
        // InternalTaskDSL.g:1063:4: ruleComparisonExpression
        {
        pushFollow(FOLLOW_2);
        ruleComparisonExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred15_InternalTaskDSL

    // $ANTLR start synpred16_InternalTaskDSL
    public final void synpred16_InternalTaskDSL_fragment() throws RecognitionException {   
        // InternalTaskDSL.g:1067:2: ( ( ruleBooleanExpressionBracket ) )
        // InternalTaskDSL.g:1067:2: ( ruleBooleanExpressionBracket )
        {
        // InternalTaskDSL.g:1067:2: ( ruleBooleanExpressionBracket )
        // InternalTaskDSL.g:1068:3: ruleBooleanExpressionBracket
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleBooleanExpressionBracket();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalTaskDSL

    // Delegated rules

    public final boolean synpred15_InternalTaskDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalTaskDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalTaskDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalTaskDSL_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000400000C000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000BC00000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000830000001020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00028300000010A0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00003C0000002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00003C0000002002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000001F80000L});

}