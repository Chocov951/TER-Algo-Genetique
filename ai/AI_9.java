import leekscript.runner.*;
import leekscript.runner.values.*;
import leekscript.common.*;

public class AI_9 extends com.leekwars.generator.fight.entity.EntityAI {
public AI_9() throws LeekRunException {
super(1, 2);
}
public void staticInit() throws LeekRunException {
}
public Object runIA() throws LeekRunException { resetCounter();
return new ArrayLeekValue(AI_9.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCell, load(sysexec(com.leekwars.generator.FightFunctions.getNearestEnemy)))) }, false);
}
protected String getAIString() { return "<snippet 9>";}
protected String[] getErrorFiles() { return new String[] {"<snippet 9>", };}
}
