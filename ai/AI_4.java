import leekscript.runner.*;
import leekscript.runner.values.*;
import leekscript.common.*;

public class AI_4 extends com.leekwars.generator.fight.entity.EntityAI {
public AI_4() throws LeekRunException {
super(1, 2);
}
public void staticInit() throws LeekRunException {
}
public Object runIA() throws LeekRunException { resetCounter();
return ops(new ArrayLeekValue(AI_4.this, new Object[] { load(sysexec(LeekFunctions.count, load(sysexec(com.leekwars.generator.FightFunctions.getPath, load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, -1, 0)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, 1, 0)), null)))), load(sysexec(LeekFunctions.count, load(sysexec(com.leekwars.generator.FightFunctions.getPath, load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, -1, 0)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, 1, 0)), load(sysexec(com.leekwars.generator.FightFunctions.getLeek)))))) }, false), 2);
}
protected String getAIString() { return "<snippet 4>";}
protected String[] getErrorFiles() { return new String[] {"<snippet 4>", };}
}
