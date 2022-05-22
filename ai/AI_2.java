import leekscript.runner.*;
import leekscript.runner.values.*;
import leekscript.common.*;

public class AI_2 extends com.leekwars.generator.fight.entity.EntityAI {
public AI_2() throws LeekRunException {
super(1, 2);
}
public void staticInit() throws LeekRunException {
}
public Object runIA() throws LeekRunException { resetCounter();
return new ArrayLeekValue(AI_2.this, new Object[] { load(sysexec(LeekFunctions.typeOf, LeekValueManager.getFunction(com.leekwars.generator.FightFunctions.getLeek))) }, false);
}
protected String getAIString() { return "<snippet 2>";}
protected String[] getErrorFiles() { return new String[] {"<snippet 2>", };}
}
