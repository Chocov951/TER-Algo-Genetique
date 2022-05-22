import leekscript.runner.*;
import leekscript.runner.values.*;
import leekscript.common.*;

public class AI_6 extends com.leekwars.generator.fight.entity.EntityAI {
public AI_6() throws LeekRunException {
super(1, 2);
}
public void staticInit() throws LeekRunException {
}
public Object runIA() throws LeekRunException { resetCounter();
return new ArrayLeekValue(AI_6.this, new Object[] { load(sysexec(LeekFunctions.typeOf, load(sysexec(com.leekwars.generator.FightFunctions.getObstacles)))) }, false);
}
protected String getAIString() { return "<snippet 6>";}
protected String[] getErrorFiles() { return new String[] {"<snippet 6>", };}
}
