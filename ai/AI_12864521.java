import leekscript.runner.*;
import leekscript.runner.values.*;
import leekscript.common.*;

public class AI_12864521 extends com.leekwars.generator.fight.entity.EntityAI {
public AI_12864521() throws LeekRunException {
super(4, 2);
}
public void staticInit() throws LeekRunException {
}
public Object runIA() throws LeekRunException { resetCounter();
Object u_enemy = ops(load(sysexec(com.leekwars.generator.FightFunctions.getNearestEnemy)), 1);
if (ops(bool(load(sysexec(LeekFunctions.count, load(sysexec(com.leekwars.generator.FightFunctions.getWeapons, new Object[] { null }))))), 0)) {
load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, get(load(sysexec(com.leekwars.generator.FightFunctions.getWeapons, new Object[] { null })), 0, null)));
ops(1);}
load(sysexec(com.leekwars.generator.FightFunctions.moveToward, u_enemy, null));
load(sysexec(com.leekwars.generator.FightFunctions.useWeapon, u_enemy));
return null;
}
protected String getAIString() { return "test/ai/basic.leek";}
protected String[] getErrorFiles() { return new String[] {"test/ai/basic.leek", };}
}
