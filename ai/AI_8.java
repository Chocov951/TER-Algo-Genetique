import leekscript.runner.*;
import leekscript.runner.values.*;
import leekscript.common.*;

public class AI_8 extends com.leekwars.generator.fight.entity.EntityAI {
public AI_8() throws LeekRunException {
super(1, 2);
}
public void staticInit() throws LeekRunException {
}
public Object runIA() throws LeekRunException { resetCounter();
return new ArrayLeekValue(AI_8.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getName, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getName, load(sysexec(com.leekwars.generator.FightFunctions.getNearestEnemy)))) }, false);
}
protected String getAIString() { return "<snippet 8>";}
protected String[] getErrorFiles() { return new String[] {"<snippet 8>", };}
}
