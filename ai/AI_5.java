import leekscript.runner.*;
import leekscript.runner.values.*;
import leekscript.common.*;

public class AI_5 extends com.leekwars.generator.fight.entity.EntityAI {
public AI_5() throws LeekRunException {
super(1, 2);
}
public void staticInit() throws LeekRunException {
}
public Object runIA() throws LeekRunException { resetCounter();
return new ArrayLeekValue(AI_5.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCellX, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))), load(sysexec(com.leekwars.generator.FightFunctions.getCellY, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, 0, 0)), load(sysexec(com.leekwars.generator.FightFunctions.getCellX, load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, 14, 0)))), load(sysexec(com.leekwars.generator.FightFunctions.getCellY, load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, 0, 14)))) }, false);
}
protected String getAIString() { return "<snippet 5>";}
protected String[] getErrorFiles() { return new String[] {"<snippet 5>", };}
}
