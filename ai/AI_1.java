import leekscript.runner.*;
import leekscript.runner.values.*;
import leekscript.common.*;

public class AI_1 extends com.leekwars.generator.fight.entity.EntityAI {
public AI_1() throws LeekRunException {
super(1, 2);
}
public void staticInit() throws LeekRunException {
}
public Object runIA() throws LeekRunException { resetCounter();
return ops(new ArrayLeekValue(AI_1.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getType, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getType, 1)), load(sysexec(com.leekwars.generator.FightFunctions.getType, -1)), load(sysexec(com.leekwars.generator.FightFunctions.isSummon, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.isSummon, 1)), load(sysexec(com.leekwars.generator.FightFunctions.getType, -1)), load(sysexec(com.leekwars.generator.FightFunctions.getBirthTurn, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getBirthTurn, -1)), load(sysexec(com.leekwars.generator.FightFunctions.getSummoner, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getSummoner, 1)), load(sysexec(com.leekwars.generator.FightFunctions.getSummoner, -1)) }, false), 4);
}
protected String getAIString() { return "<snippet 1>";}
protected String[] getErrorFiles() { return new String[] {"<snippet 1>", };}
}
