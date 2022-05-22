import leekscript.runner.*;
import leekscript.runner.values.*;
import leekscript.common.*;

public class AI_7 extends com.leekwars.generator.fight.entity.EntityAI {
public AI_7() throws LeekRunException {
super(1, 2);
}
public void staticInit() throws LeekRunException {
}
public Object runIA() throws LeekRunException { resetCounter();
return ops(new ArrayLeekValue(AI_7.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getDistance, 164, 200)), load(sysexec(com.leekwars.generator.FightFunctions.getDistance, 17, 595)), load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, 164, 200)), load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, 17, 595)), load(sysexec(com.leekwars.generator.FightFunctions.getLeekOnCell, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))), load(sysexec(com.leekwars.generator.FightFunctions.getLeekOnCell, load(sysexec(com.leekwars.generator.FightFunctions.getCell, 1)))), load(sysexec(com.leekwars.generator.FightFunctions.getLeekOnCell, 1)), load(sysexec(com.leekwars.generator.FightFunctions.getLeekOnCell, -1)), load(sysexec(com.leekwars.generator.FightFunctions.getCellContent, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))), load(sysexec(com.leekwars.generator.FightFunctions.getCellContent, load(sysexec(com.leekwars.generator.FightFunctions.getCell, 1)))), load(sysexec(com.leekwars.generator.FightFunctions.getCellContent, 1)), load(sysexec(com.leekwars.generator.FightFunctions.getCellContent, 17)), load(sysexec(com.leekwars.generator.FightFunctions.getCellContent, -1)), load(sysexec(com.leekwars.generator.FightFunctions.isEmptyCell, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))), load(sysexec(com.leekwars.generator.FightFunctions.isEmptyCell, load(sysexec(com.leekwars.generator.FightFunctions.getCell, 1)))), load(sysexec(com.leekwars.generator.FightFunctions.isEmptyCell, 1)), load(sysexec(com.leekwars.generator.FightFunctions.isEmptyCell, 17)), load(sysexec(com.leekwars.generator.FightFunctions.isEmptyCell, -1)), load(sysexec(com.leekwars.generator.FightFunctions.isObstacle, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))), load(sysexec(com.leekwars.generator.FightFunctions.isObstacle, load(sysexec(com.leekwars.generator.FightFunctions.getCell, 1)))), load(sysexec(com.leekwars.generator.FightFunctions.isObstacle, 1)), load(sysexec(com.leekwars.generator.FightFunctions.isObstacle, 17)), load(sysexec(com.leekwars.generator.FightFunctions.isObstacle, -1)), load(sysexec(com.leekwars.generator.FightFunctions.isLeek, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))), load(sysexec(com.leekwars.generator.FightFunctions.isLeek, load(sysexec(com.leekwars.generator.FightFunctions.getCell, 1)))), load(sysexec(com.leekwars.generator.FightFunctions.isLeek, 1)), load(sysexec(com.leekwars.generator.FightFunctions.isLeek, 17)), load(sysexec(com.leekwars.generator.FightFunctions.isLeek, -1)), load(sysexec(com.leekwars.generator.FightFunctions.getCellX, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))), load(sysexec(com.leekwars.generator.FightFunctions.getCellX, load(sysexec(com.leekwars.generator.FightFunctions.getCell, 1)))), load(sysexec(com.leekwars.generator.FightFunctions.getCellX, 1)), load(sysexec(com.leekwars.generator.FightFunctions.getCellX, 17)), load(sysexec(com.leekwars.generator.FightFunctions.getCellX, -1)), load(sysexec(com.leekwars.generator.FightFunctions.getCellY, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))), load(sysexec(com.leekwars.generator.FightFunctions.getCellY, load(sysexec(com.leekwars.generator.FightFunctions.getCell, 1)))), load(sysexec(com.leekwars.generator.FightFunctions.getCellY, 1)), load(sysexec(com.leekwars.generator.FightFunctions.getCellY, 17)), load(sysexec(com.leekwars.generator.FightFunctions.getCellY, -1)), load(sysexec(com.leekwars.generator.FightFunctions.getNearestEnemy)), load(sysexec(com.leekwars.generator.FightFunctions.getFarestEnemy)), load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), load(sysexec(LeekFunctions.string, load(sysexec(com.leekwars.generator.FightFunctions.getAliveEnemies)))), load(sysexec(com.leekwars.generator.FightFunctions.getAliveEnemiesCount)), load(sysexec(LeekFunctions.string, load(sysexec(com.leekwars.generator.FightFunctions.getDeadEnemies)))), load(sysexec(com.leekwars.generator.FightFunctions.getDeadEnemiesCount)), load(sysexec(LeekFunctions.string, load(sysexec(com.leekwars.generator.FightFunctions.getEnemies)))), load(sysexec(LeekFunctions.string, load(sysexec(com.leekwars.generator.FightFunctions.getAllies)))), load(sysexec(com.leekwars.generator.FightFunctions.getEnemiesCount)), load(sysexec(com.leekwars.generator.FightFunctions.getNearestAlly)), load(sysexec(com.leekwars.generator.FightFunctions.getFarestAlly)), load(sysexec(com.leekwars.generator.FightFunctions.getFarestAlly)), load(sysexec(LeekFunctions.string, load(sysexec(com.leekwars.generator.FightFunctions.getAliveAllies)))), load(sysexec(LeekFunctions.string, load(sysexec(com.leekwars.generator.FightFunctions.getDeadAllies)))), load(sysexec(com.leekwars.generator.FightFunctions.getAlliesCount)) }, false), 7);
}
protected String getAIString() { return "<snippet 7>";}
protected String[] getErrorFiles() { return new String[] {"<snippet 7>", };}
}
