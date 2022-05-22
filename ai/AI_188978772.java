import leekscript.runner.*;
import leekscript.runner.values.*;
import leekscript.common.*;

public class AI_188978772 extends com.leekwars.generator.fight.entity.EntityAI {
public AI_188978772() throws LeekRunException {
super(34, 2);
}
public void staticInit() throws LeekRunException {
}
private Object g_ADN = null;
private boolean g_init_ADN = false;
private Object g_enemyId = null;
private boolean g_init_enemyId = false;
private Object g_myId = null;
private boolean g_init_myId = false;
private Object g_EnemyWeapons = null;
private boolean g_init_EnemyWeapons = false;
private Object g_EnemyChips = null;
private boolean g_init_EnemyChips = false;
private Object g_MyWeapons = null;
private boolean g_init_MyWeapons = false;
private Object g_MyChips = null;
private boolean g_init_MyChips = false;
private Object g_cellCible = null;
private boolean g_init_cellCible = false;
private Object g_cellTest = null;
private boolean g_init_cellTest = false;
private Object g_valTest = null;
private boolean g_init_valTest = false;
private Object g_valTest2 = null;
private boolean g_init_valTest2 = false;
private Object g_weaponTest = null;
private boolean g_init_weaponTest = false;
private Object g_chipTest = null;
private boolean g_init_chipTest = false;
private Object g_apw = null;
private boolean g_init_apw = false;
private Object g_apc = null;
private boolean g_init_apc = false;
private Object g_cellapw = null;
private boolean g_init_cellapw = false;
private Object g_cellapc = null;
private boolean g_init_cellapc = false;
private Object g_cond1 = null;
private boolean g_init_cond1 = false;
private Object g_cond2 = null;
private boolean g_init_cond2 = false;
private Object g_cond3 = null;
private boolean g_init_cond3 = false;
private Object g_accE = null;
private boolean g_init_accE = false;
private Object g_tabTests = null;
private boolean g_init_tabTests = false;
private Object g_tabActions = null;
private boolean g_init_tabActions = false;
private Object f_getAccessible(Object p_cell, Object p_MP) throws LeekRunException {var u_cell = p_cell; ops(1); var u_MP = p_MP; ops(1); 
ops(1);Object u_acc = ops(new ArrayLeekValue(), 1);
Object u_k = ops(0, 1);
Object u_cx = ops(load(sysexec(com.leekwars.generator.FightFunctions.getCellX, u_cell)), 1);
Object u_cy = ops(load(sysexec(com.leekwars.generator.FightFunctions.getCellY, u_cell)), 1);
Object u_tcell = ops(null, 1);
Object u_gpl = ops(null, 1);
for (Object u_i = ops(0, 1);
ops(lessequals(u_i, u_MP), 1); ops(sub(u_i = add(u_i, 1), 1), 1)) {
ops(1);for (Object u_j = ops(0, 1);
ops(lessequals(u_j, u_i), 1); ops(sub(u_j = add(u_j, 1), 1), 1)) {
ops(1);if (ops((ops(eq(u_i, 0), 1) && ops(eq(u_j, 0), 1)), 0)) {
ops(sub(u_j = add(u_j, 1), 1), 1);
ops(1);}
ops(u_tcell = load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, (sub(u_i, u_j))), add(u_cy, u_j))), 4);
ops(u_gpl = load(sysexec(com.leekwars.generator.FightFunctions.getPathLength, u_cell, u_tcell, null)), 1);
if (ops((ops((ops((ops(neq(u_tcell, null), 1) && ops(moreequals(u_gpl, u_i), 1)), 0) && ops(lessequals(u_gpl, u_MP), 1)), 0) && ops(!bool(load(sysexec(LeekFunctions.inArray, u_acc, new ArrayLeekValue(AI_188978772.this, new Object[] { u_gpl, u_tcell }, false)))), 1)), 0)) {
ops(put(u_acc, u_k, new ArrayLeekValue(AI_188978772.this, new Object[] { u_gpl, u_tcell }, false)), 1);
ops(sub(u_k = add(u_k, 1), 1), 1);
ops(1);}
ops(u_tcell = load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, (sub(u_i, u_j))), sub(u_cy, u_j))), 4);
ops(u_gpl = load(sysexec(com.leekwars.generator.FightFunctions.getPathLength, u_cell, u_tcell, null)), 1);
if (ops((ops((ops((ops(neq(u_tcell, null), 1) && ops(moreequals(u_gpl, u_i), 1)), 0) && ops(lessequals(u_gpl, u_MP), 1)), 0) && ops(!bool(load(sysexec(LeekFunctions.inArray, u_acc, new ArrayLeekValue(AI_188978772.this, new Object[] { u_gpl, u_tcell }, false)))), 1)), 0)) {
ops(put(u_acc, u_k, new ArrayLeekValue(AI_188978772.this, new Object[] { u_gpl, u_tcell }, false)), 1);
ops(sub(u_k = add(u_k, 1), 1), 1);
ops(1);}
ops(u_tcell = load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, (sub(u_i, u_j))), sub(u_cy, u_j))), 4);
ops(u_gpl = load(sysexec(com.leekwars.generator.FightFunctions.getPathLength, u_cell, u_tcell, null)), 1);
if (ops((ops((ops((ops(neq(u_tcell, null), 1) && ops(moreequals(u_gpl, u_i), 1)), 0) && ops(lessequals(u_gpl, u_MP), 1)), 0) && ops(!bool(load(sysexec(LeekFunctions.inArray, u_acc, new ArrayLeekValue(AI_188978772.this, new Object[] { u_gpl, u_tcell }, false)))), 1)), 0)) {
ops(put(u_acc, u_k, new ArrayLeekValue(AI_188978772.this, new Object[] { u_gpl, u_tcell }, false)), 1);
ops(sub(u_k = add(u_k, 1), 1), 1);
ops(1);}
ops(u_tcell = load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, (sub(u_i, u_j))), add(u_cy, u_j))), 4);
ops(u_gpl = load(sysexec(com.leekwars.generator.FightFunctions.getPathLength, u_cell, u_tcell, null)), 1);
if (ops((ops((ops((ops(neq(u_tcell, null), 1) && ops(moreequals(u_gpl, u_i), 1)), 0) && ops(lessequals(u_gpl, u_MP), 1)), 0) && ops(!bool(load(sysexec(LeekFunctions.inArray, u_acc, new ArrayLeekValue(AI_188978772.this, new Object[] { u_gpl, u_tcell }, false)))), 1)), 0)) {
ops(put(u_acc, u_k, new ArrayLeekValue(AI_188978772.this, new Object[] { u_gpl, u_tcell }, false)), 1);
ops(sub(u_k = add(u_k, 1), 1), 1);
ops(1);}
}
}
ops(u_k = 0, 1);
Object u_acc2 = ops(new ArrayLeekValue(), 1);
for (Object u_i = ops(0, 1);
ops(lessequals(u_i, u_MP), 1); ops(sub(u_i = add(u_i, 1), 1), 1)) {
ops(1);final var ar0 = ops(u_acc, 0);if (isIterable(ar0)) {
Object u_j = null;
ops(1);for (var i0 : (ArrayLeekValue) ar0) {
u_j = i0.getValue();
ops(1);if (ops(eq(get(u_j, 0, null), u_i), 1)) {
ops(put(u_acc2, u_k, get(u_j, 1, null)), 1);
ops(sub(u_k = add(u_k, 1), 1), 1);
ops(1);}
}}
}
return u_acc2;
}
private Object f_isOnDiagonal(Object p_startCell, Object p_endCell) throws LeekRunException {var u_startCell = p_startCell; ops(1); var u_endCell = p_endCell; ops(1); 
ops(1);return ops(eq(load(sysexec(LeekFunctions.abs, sub(load(sysexec(com.leekwars.generator.FightFunctions.getCellX, u_startCell)), load(sysexec(com.leekwars.generator.FightFunctions.getCellX, u_endCell))))), load(sysexec(LeekFunctions.abs, sub(load(sysexec(com.leekwars.generator.FightFunctions.getCellY, u_startCell)), load(sysexec(com.leekwars.generator.FightFunctions.getCellY, u_endCell)))))), 3);
}
private Object f_canUseFromCellOnCell(Object p_startCell, Object p_endCell, Object p_porteeMax, Object p_porteeMin, Object p_isInLine, Object p_isInDiagonal, Object p_needLos) throws LeekRunException {var u_startCell = p_startCell; ops(1); var u_endCell = p_endCell; ops(1); var u_porteeMax = p_porteeMax; ops(1); var u_porteeMin = p_porteeMin; ops(1); var u_isInLine = p_isInLine; ops(1); var u_isInDiagonal = p_isInDiagonal; ops(1); var u_needLos = p_needLos; ops(1); 
ops(1);Object u_res = ops(false, 1);
if (ops(bool(u_needLos), 0)) {
if (ops(bool(u_isInLine), 0)) {
if (ops((ops((ops((ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.lineOfSight, u_startCell, u_endCell, null))), 0) && ops(lessequals(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, u_startCell, u_endCell)), u_porteeMax), 1)), 0) && ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, u_startCell, u_endCell)), u_porteeMin), 1)), 0) && ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.isOnSameLine, u_startCell, u_endCell))), 0)), 0)) {
ops(u_res = true, 1);
ops(1);}
else if (ops(bool(u_isInDiagonal), 0)) {
if (ops((ops((ops(lessequals(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, u_startCell, u_endCell)), u_porteeMax), 1) && ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, u_startCell, u_endCell)), u_porteeMin), 1)), 0) && ops(bool(load(f_isOnDiagonal(u_startCell, u_endCell))), 0)), 0)) {
ops(u_res = true, 1);
ops(1);}
ops(1);}
ops(1);}
else if (ops(bool(u_isInDiagonal), 0)) {
if (ops((ops((ops(lessequals(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, u_startCell, u_endCell)), u_porteeMax), 1) && ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, u_startCell, u_endCell)), u_porteeMin), 1)), 0) && ops(bool(load(f_isOnDiagonal(u_startCell, u_endCell))), 0)), 0)) {
ops(u_res = true, 1);
ops(1);}
ops(1);}
else if (ops((ops((ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.lineOfSight, u_startCell, u_endCell, null))), 0) && ops(lessequals(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, u_startCell, u_endCell)), u_porteeMax), 1)), 0) && ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, u_startCell, u_endCell)), u_porteeMin), 1)), 0)) {
ops(u_res = true, 1);
ops(1);}
ops(1);}
else {
if (ops(bool(u_isInLine), 0)) {
if (ops((ops((ops(lessequals(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, u_startCell, u_endCell)), u_porteeMax), 1) && ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, u_startCell, u_endCell)), u_porteeMin), 1)), 0) && ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.isOnSameLine, u_startCell, u_endCell))), 0)), 0)) {
ops(u_res = true, 1);
ops(1);}
ops(1);}
else if (ops((ops(lessequals(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, u_startCell, u_endCell)), u_porteeMax), 1) && ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, u_startCell, u_endCell)), u_porteeMin), 1)), 0)) {
ops(u_res = true, 1);
ops(1);}
ops(1);}
return u_res;
}
private Object f_aPorteeWeapon(Object p_startCell, Object p_endCell, Object p_weapon) throws LeekRunException {var u_startCell = p_startCell; ops(1); var u_endCell = p_endCell; ops(1); var u_weapon = p_weapon; ops(1); 
ops(1);Object u_isInLine = ops(false, 1);
Object u_isInDiagonal = ops(false, 1);
Object u_launchType = ops(load(sysexec(com.leekwars.generator.FightFunctions.getWeaponLaunchType, u_weapon)), 1);
Object u_area = ops(load(sysexec(com.leekwars.generator.FightFunctions.getWeaponArea, u_weapon)), 1);
Object u_porteeMax = ops(load(sysexec(com.leekwars.generator.FightFunctions.getWeaponMaxRange, u_weapon)), 1);
Object u_porteeMin = ops(load(sysexec(com.leekwars.generator.FightFunctions.getWeaponMinRange, u_weapon)), 1);
Object u_needLos = ops(load(sysexec(com.leekwars.generator.FightFunctions.weaponNeedLos, u_weapon)), 1);
Object u_cx = ops(load(sysexec(com.leekwars.generator.FightFunctions.getCellX, u_endCell)), 1);
Object u_cy = ops(load(sysexec(com.leekwars.generator.FightFunctions.getCellY, u_endCell)), 1);
Object u_i = ops(1, 1);
Object u_acc = ops(null, 1);
Object u_res = ops(new ArrayLeekValue(AI_188978772.this, new Object[] { false, 0 }, false), 1);
if (ops(neq(u_launchType, 7), 1)) {
if (ops(eq(u_launchType, 2), 1)) {
ops(u_isInDiagonal = true, 1);
ops(1);}
else if (ops(eq(u_launchType, 1), 1)) {
ops(u_isInLine = true, 1);
ops(1);}
else {
ops(u_isInDiagonal = true, 1);
ops(u_isInLine = true, 1);
ops(1);}
ops(1);}
if (ops(eq(u_area, 1), 1)) {
if (ops(bool(load(f_canUseFromCellOnCell(u_startCell, u_endCell, u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos))), 0)) {
ops(put(u_res, 0, true), 1);
ops(put(u_res, 1, u_endCell), 1);
ops(1);}
ops(1);}
else if (ops(eq(u_area, 4), 1)) {
ops(u_acc = new ArrayLeekValue(AI_188978772.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), u_cy)) }, false), 17);
ops(u_res = new ArrayLeekValue(AI_188978772.this, new Object[] { false, get(u_acc, 0, null) }, false), 1);
while (ops((ops(((ops(eq(get(u_res, 1, null), null), 1) || ops(!bool((load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos)))), 1))), 0) && ops(less(u_i, 13), 1)), 0)) {
ops(1);ops(put(u_res, 1, get(u_acc, u_i, null)), 1);
ops(sub(u_i = add(u_i, 1), 1), 1);
}
if (ops(less(u_i, 13), 1)) {
ops(put(u_res, 0, true), 1);
ops(1);}
else if (ops((ops(neq(get(u_res, 1, null), null), 1) && ops(bool(load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos))), 0)), 0)) {
ops(put(u_res, 0, true), 1);
ops(1);}
ops(1);}
else if (ops(eq(u_area, 5), 1)) {
ops(u_acc = new ArrayLeekValue(AI_188978772.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 3), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), add(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 3))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 3))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), add(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 3), u_cy)) }, false), 37);
ops(u_res = new ArrayLeekValue(AI_188978772.this, new Object[] { false, get(u_acc, 0, null) }, false), 1);
while (ops((ops(((ops(eq(get(u_res, 1, null), null), 1) || ops(!bool((load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos)))), 1))), 0) && ops(less(u_i, 25), 1)), 0)) {
ops(1);ops(put(u_res, 1, get(u_acc, u_i, null)), 1);
ops(sub(u_i = add(u_i, 1), 1), 1);
}
if (ops(less(u_i, 25), 1)) {
ops(put(u_res, 0, true), 1);
ops(1);}
else if (ops((ops(neq(get(u_res, 1, null), null), 1) && ops(bool(load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos))), 0)), 0)) {
ops(put(u_res, 0, true), 1);
ops(1);}
ops(1);}
else if (ops(eq(u_area, 3), 1)) {
ops(u_acc = new ArrayLeekValue(AI_188978772.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), u_cy)) }, false), 5);
ops(u_res = new ArrayLeekValue(AI_188978772.this, new Object[] { false, get(u_acc, 0, null) }, false), 1);
while (ops((ops(((ops(eq(get(u_res, 1, null), null), 1) || ops(!bool((load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos)))), 1))), 0) && ops(less(u_i, 5), 1)), 0)) {
ops(1);ops(put(u_res, 1, get(u_acc, u_i, null)), 1);
ops(sub(u_i = add(u_i, 1), 1), 1);
}
if (ops(less(u_i, 5), 1)) {
ops(put(u_res, 0, true), 1);
ops(1);}
else if (ops((ops(neq(get(u_res, 1, null), null), 1) && ops(bool(load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos))), 0)), 0)) {
ops(put(u_res, 0, true), 1);
ops(1);}
ops(1);}
else if (ops(eq(u_area, 2), 1)) {
if (ops(bool(load(f_canUseFromCellOnCell(u_startCell, u_endCell, u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, false))), 0)) {
Object u_dist = ops(null, 1);
Object u_clear = ops(true, 1);
if (ops(eq(sub(u_cx, load(sysexec(com.leekwars.generator.FightFunctions.getCellX, u_endCell))), 0), 2)) {
ops(u_dist = sub(u_cy, load(sysexec(com.leekwars.generator.FightFunctions.getCellY, u_endCell))), 2);
if (ops(more(u_dist, 1), 1)) {
while (ops((ops(bool(u_clear), 0) && ops(less(u_i, u_dist), 1)), 0)) {
ops(1);ops(u_clear = !bool(load(sysexec(com.leekwars.generator.FightFunctions.isObstacle, load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, u_i)))))), 3);
ops(sub(u_i = add(u_i, 1), 1), 1);
}
ops(put(u_res, 0, u_clear), 1);
ops(put(u_res, 1, u_endCell), 1);
ops(1);}
else if (ops(less(u_dist, -1), 2)) {
while (ops((ops(bool(u_clear), 0) && ops(less(u_i, load(sysexec(LeekFunctions.abs, u_dist))), 1)), 0)) {
ops(1);ops(u_clear = !bool(load(sysexec(com.leekwars.generator.FightFunctions.isObstacle, load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, u_i)))))), 3);
ops(sub(u_i = add(u_i, 1), 1), 1);
}
ops(put(u_res, 0, u_clear), 1);
ops(put(u_res, 1, u_endCell), 1);
ops(1);}
else {
ops(put(u_res, 0, true), 1);
ops(put(u_res, 1, u_endCell), 1);
ops(1);}
ops(1);}
else {
ops(u_dist = sub(u_cx, load(sysexec(com.leekwars.generator.FightFunctions.getCellX, u_endCell))), 2);
if (ops(more(u_dist, 1), 1)) {
while (ops((ops(bool(u_clear), 0) && ops(less(u_i, u_dist), 1)), 0)) {
ops(1);ops(u_clear = !bool(load(sysexec(com.leekwars.generator.FightFunctions.isObstacle, load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, u_i), u_cy))))), 3);
ops(sub(u_i = add(u_i, 1), 1), 1);
}
ops(put(u_res, 0, u_clear), 1);
ops(put(u_res, 1, u_endCell), 1);
ops(1);}
else if (ops(less(u_dist, -1), 2)) {
while (ops((ops(bool(u_clear), 0) && ops(less(u_i, load(sysexec(LeekFunctions.abs, u_dist))), 1)), 0)) {
ops(1);ops(u_clear = !bool(load(sysexec(com.leekwars.generator.FightFunctions.isObstacle, load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, u_i), u_cy))))), 3);
ops(sub(u_i = add(u_i, 1), 1), 1);
}
ops(put(u_res, 0, u_clear), 1);
ops(put(u_res, 1, u_endCell), 1);
ops(1);}
else {
ops(put(u_res, 0, true), 1);
ops(put(u_res, 1, u_endCell), 1);
ops(1);}
ops(1);}
ops(1);}
ops(1);}
else if (ops(eq(u_area, 8), 1)) {
ops(u_acc = new ArrayLeekValue(AI_188978772.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), add(u_cy, 1))) }, false), 9);
ops(u_res = new ArrayLeekValue(AI_188978772.this, new Object[] { false, get(u_acc, 0, null) }, false), 1);
while (ops((ops(((ops(eq(get(u_res, 1, null), null), 1) || ops(!bool((load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos)))), 1))), 0) && ops(less(u_i, 5), 1)), 0)) {
ops(1);ops(put(u_res, 1, get(u_acc, u_i, null)), 1);
ops(sub(u_i = add(u_i, 1), 1), 1);
}
if (ops(less(u_i, 5), 1)) {
ops(put(u_res, 0, true), 1);
ops(1);}
else if (ops((ops(neq(get(u_res, 1, null), null), 1) && ops(bool(load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos))), 0)), 0)) {
ops(put(u_res, 0, true), 1);
ops(1);}
ops(1);}
return u_res;
}
private Object f_aPorteeChip(Object p_startCell, Object p_endCell, Object p_chip) throws LeekRunException {var u_startCell = p_startCell; ops(1); var u_endCell = p_endCell; ops(1); var u_chip = p_chip; ops(1); 
ops(1);Object u_isInLine = ops(false, 1);
Object u_isInDiagonal = ops(false, 1);
Object u_launchType = ops(load(sysexec(com.leekwars.generator.FightFunctions.getChipLaunchType, u_chip)), 1);
Object u_area = ops(load(sysexec(com.leekwars.generator.FightFunctions.getChipArea, u_chip)), 1);
Object u_porteeMax = ops(load(sysexec(com.leekwars.generator.FightFunctions.getChipMaxRange, u_chip)), 1);
Object u_porteeMin = ops(load(sysexec(com.leekwars.generator.FightFunctions.getChipMinRange, u_chip)), 1);
Object u_needLos = ops(load(sysexec(com.leekwars.generator.FightFunctions.chipNeedLos, u_chip)), 1);
Object u_cx = ops(load(sysexec(com.leekwars.generator.FightFunctions.getCellX, u_endCell)), 1);
Object u_cy = ops(load(sysexec(com.leekwars.generator.FightFunctions.getCellY, u_endCell)), 1);
Object u_i = ops(1, 1);
Object u_acc = ops(null, 1);
Object u_res = ops(new ArrayLeekValue(AI_188978772.this, new Object[] { false, 0 }, false), 1);
if (ops(neq(u_launchType, 7), 1)) {
ops(u_isInLine = true, 1);
ops(1);}
if (ops(eq(u_area, 1), 1)) {
if (ops(bool(load(f_canUseFromCellOnCell(u_startCell, u_endCell, u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos))), 0)) {
ops(put(u_res, 0, true), 1);
ops(put(u_res, 1, u_endCell), 1);
ops(1);}
ops(1);}
else if (ops(eq(u_area, 4), 1)) {
ops(u_acc = new ArrayLeekValue(AI_188978772.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), u_cy)) }, false), 17);
ops(u_res = new ArrayLeekValue(AI_188978772.this, new Object[] { false, get(u_acc, 0, null) }, false), 1);
while (ops((ops(((ops(eq(get(u_res, 1, null), null), 1) || ops(!bool((load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos)))), 1))), 0) && ops(less(u_i, 13), 1)), 0)) {
ops(1);ops(put(u_res, 1, get(u_acc, u_i, null)), 1);
ops(sub(u_i = add(u_i, 1), 1), 1);
}
if (ops(less(u_i, 13), 1)) {
ops(put(u_res, 0, true), 1);
ops(1);}
else if (ops((ops(neq(get(u_res, 1, null), null), 1) && ops(bool(load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos))), 0)), 0)) {
ops(put(u_res, 0, true), 1);
ops(1);}
ops(1);}
else if (ops(eq(u_area, 5), 1)) {
ops(u_acc = new ArrayLeekValue(AI_188978772.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 3), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), add(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 3))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 3))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), add(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 3), u_cy)) }, false), 37);
ops(u_res = new ArrayLeekValue(AI_188978772.this, new Object[] { false, get(u_acc, 0, null) }, false), 1);
while (ops((ops(((ops(eq(get(u_res, 1, null), null), 1) || ops(!bool((load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos)))), 1))), 0) && ops(less(u_i, 25), 1)), 0)) {
ops(1);ops(put(u_res, 1, get(u_acc, u_i, null)), 1);
ops(sub(u_i = add(u_i, 1), 1), 1);
}
if (ops(less(u_i, 25), 1)) {
ops(put(u_res, 0, true), 1);
ops(1);}
else if (ops((ops(neq(get(u_res, 1, null), null), 1) && ops(bool(load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos))), 0)), 0)) {
ops(put(u_res, 0, true), 1);
ops(1);}
ops(1);}
else if (ops(eq(u_area, 3), 1)) {
ops(u_acc = new ArrayLeekValue(AI_188978772.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), u_cy)) }, false), 5);
ops(u_res = new ArrayLeekValue(AI_188978772.this, new Object[] { false, get(u_acc, 0, null) }, false), 1);
while (ops((ops(((ops(eq(get(u_res, 1, null), null), 1) || ops(!bool((load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos)))), 1))), 0) && ops(less(u_i, 5), 1)), 0)) {
ops(1);ops(put(u_res, 1, get(u_acc, u_i, null)), 1);
ops(sub(u_i = add(u_i, 1), 1), 1);
}
if (ops(less(u_i, 5), 1)) {
ops(put(u_res, 0, true), 1);
ops(1);}
else if (ops((ops(neq(get(u_res, 1, null), null), 1) && ops(bool(load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos))), 0)), 0)) {
ops(put(u_res, 0, true), 1);
ops(1);}
ops(1);}
else if (ops(eq(u_area, 6), 1)) {
ops(u_acc = new ArrayLeekValue(AI_188978772.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), u_cy)) }, false), 9);
ops(u_res = new ArrayLeekValue(AI_188978772.this, new Object[] { false, get(u_acc, 0, null) }, false), 1);
while (ops((ops(((ops(eq(get(u_res, 1, null), null), 1) || ops(!bool((load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos)))), 1))), 0) && ops(less(u_i, 9), 1)), 0)) {
ops(1);ops(put(u_res, 1, get(u_acc, u_i, null)), 1);
ops(sub(u_i = add(u_i, 1), 1), 1);
}
if (ops(less(u_i, 9), 1)) {
ops(put(u_res, 0, true), 1);
ops(1);}
else if (ops((ops(neq(get(u_res, 1, null), null), 1) && ops(bool(load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos))), 0)), 0)) {
ops(put(u_res, 0, true), 1);
ops(1);}
ops(1);}
else if (ops(eq(u_area, 7), 1)) {
ops(u_acc = new ArrayLeekValue(AI_188978772.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 3), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 3))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 3))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 3), u_cy)) }, false), 13);
ops(u_res = new ArrayLeekValue(AI_188978772.this, new Object[] { false, get(u_acc, 0, null) }, false), 1);
while (ops((ops(((ops(eq(get(u_res, 1, null), null), 1) || ops(!bool((load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos)))), 1))), 0) && ops(less(u_i, 13), 1)), 0)) {
ops(1);ops(put(u_res, 1, get(u_acc, u_i, null)), 1);
ops(sub(u_i = add(u_i, 1), 1), 1);
}
if (ops(less(u_i, 13), 1)) {
ops(put(u_res, 0, true), 1);
ops(1);}
else if (ops((ops(neq(get(u_res, 1, null), null), 1) && ops(bool(load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos))), 0)), 0)) {
ops(put(u_res, 0, true), 1);
ops(1);}
ops(1);}
else if (ops(eq(u_area, 11), 1)) {
ops(u_acc = new ArrayLeekValue(AI_188978772.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), add(u_cy, 1))) }, false), 13);
ops(u_res = new ArrayLeekValue(AI_188978772.this, new Object[] { false, get(u_acc, 0, null) }, false), 1);
while (ops((ops(((ops(eq(get(u_res, 1, null), null), 1) || ops(!bool((load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos)))), 1))), 0) && ops(less(u_i, 9), 1)), 0)) {
ops(1);ops(put(u_res, 1, get(u_acc, u_i, null)), 1);
ops(sub(u_i = add(u_i, 1), 1), 1);
}
if (ops(less(u_i, 9), 1)) {
ops(put(u_res, 0, true), 1);
ops(1);}
else if (ops((ops(neq(get(u_res, 1, null), null), 1) && ops(bool(load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos))), 0)), 0)) {
ops(put(u_res, 0, true), 1);
ops(1);}
ops(1);}
else if (ops(eq(u_area, 12), 1)) {
ops(u_acc = new ArrayLeekValue(AI_188978772.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), add(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), add(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), add(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), add(u_cy, 2))) }, false), 41);
ops(u_res = new ArrayLeekValue(AI_188978772.this, new Object[] { false, get(u_acc, 0, null) }, false), 1);
while (ops((ops(((ops(eq(get(u_res, 1, null), null), 1) || ops(!bool((load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos)))), 1))), 0) && ops(less(u_i, 25), 1)), 0)) {
ops(1);ops(put(u_res, 1, get(u_acc, u_i, null)), 1);
ops(sub(u_i = add(u_i, 1), 1), 1);
}
if (ops(less(u_i, 25), 1)) {
ops(put(u_res, 0, true), 1);
ops(1);}
else if (ops((ops(neq(get(u_res, 1, null), null), 1) && ops(bool(load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos))), 0)), 0)) {
ops(put(u_res, 0, true), 1);
ops(1);}
ops(1);}
else if (ops(eq(u_area, 13), 1)) {
if (ops(bool(load(f_canUseFromCellOnCell(u_startCell, u_endCell, u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos))), 0)) {
ops(put(u_res, 0, true), 1);
ops(put(u_res, 1, u_endCell), 1);
ops(1);}
ops(1);}
else if (ops(eq(u_area, 9), 1)) {
ops(u_acc = new ArrayLeekValue(AI_188978772.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), add(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), add(u_cy, 2))) }, false), 17);
ops(u_res = new ArrayLeekValue(AI_188978772.this, new Object[] { false, get(u_acc, 0, null) }, false), 1);
while (ops((ops(((ops(eq(get(u_res, 1, null), null), 1) || ops(!bool((load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos)))), 1))), 0) && ops(less(u_i, 9), 1)), 0)) {
ops(1);ops(put(u_res, 1, get(u_acc, u_i, null)), 1);
ops(sub(u_i = add(u_i, 1), 1), 1);
}
if (ops(less(u_i, 9), 1)) {
ops(put(u_res, 0, true), 1);
ops(1);}
else if (ops((ops(neq(get(u_res, 1, null), null), 1) && ops(bool(load(f_canUseFromCellOnCell(u_startCell, get(u_res, 1, null), u_porteeMax, u_porteeMin, u_isInLine, u_isInDiagonal, u_needLos))), 0)), 0)) {
ops(put(u_res, 0, true), 1);
ops(1);}
ops(1);}
return u_res;
}
private Object f_peutEtreAPorteeWeapon(Object p_cellTest, Object p_endCell, Object p_weapon, Object p_mp) throws LeekRunException {var u_cellTest = p_cellTest; ops(1); var u_endCell = p_endCell; ops(1); var u_weapon = p_weapon; ops(1); var u_mp = p_mp; ops(1); 
ops(1);Object u_res = ops(new ArrayLeekValue(AI_188978772.this, new Object[] { false, null, null }, false), 1);
Object u_ap = ops(load(f_aPorteeWeapon(u_cellTest, u_endCell, u_weapon)), 1);
ops(load(sysexec(LeekFunctions.debug, add("ap = ", u_ap))), 1);
ops(load(sysexec(LeekFunctions.debug, add("res = ", u_res))), 1);
Object u_i = ops(0, 1);
Object u_acc = ops(load(f_getAccessible(u_cellTest, u_mp)), 1);
if (ops((ops(!bool(get(u_ap, 0, null)), 1) && ops(!bool(load(sysexec(LeekFunctions.isEmpty, u_acc))), 1)), 0)) {
ops(u_ap = load(f_aPorteeWeapon(get(u_acc, u_i, null), u_endCell, u_weapon)), 1);
while (ops((ops(less(u_i, sub(load(sysexec(LeekFunctions.count, u_acc)), 1)), 2) && ops(bool(get(u_ap, 0, null)), 0)), 0)) {
ops(1);ops(sub(u_i = add(u_i, 1), 1), 1);
ops(u_ap = load(f_aPorteeWeapon(get(u_acc, u_i, null), u_endCell, u_weapon)), 1);
}
ops(put(u_res, 1, get(u_acc, u_i, null)), 1);
ops(1);}
else {
ops(put(u_res, 1, u_cellTest), 1);
ops(1);}
ops(put(u_res, 0, get(u_ap, 0, null)), 1);
ops(put(u_res, 2, get(u_ap, 1, null)), 1);
return u_res;
}
private Object f_peutEtreAPorteeChip(Object p_cellTest, Object p_endCell, Object p_chip, Object p_mp) throws LeekRunException {var u_cellTest = p_cellTest; ops(1); var u_endCell = p_endCell; ops(1); var u_chip = p_chip; ops(1); var u_mp = p_mp; ops(1); 
ops(1);Object u_res = ops(new ArrayLeekValue(AI_188978772.this, new Object[] { false, null, null }, false), 1);
Object u_ap = ops(load(f_aPorteeChip(u_cellTest, u_endCell, u_chip)), 1);
Object u_i = ops(0, 1);
Object u_acc = ops(load(f_getAccessible(u_cellTest, u_mp)), 1);
if (ops((ops(!bool(get(u_ap, 0, null)), 1) && ops(!bool(load(sysexec(LeekFunctions.isEmpty, u_acc))), 1)), 0)) {
ops(u_ap = load(f_aPorteeChip(get(u_acc, u_i, null), u_endCell, u_chip)), 1);
while (ops((ops(less(u_i, sub(load(sysexec(LeekFunctions.count, u_acc)), 1)), 2) && ops(!bool(get(u_ap, 0, null)), 1)), 0)) {
ops(1);ops(sub(u_i = add(u_i, 1), 1), 1);
ops(u_ap = load(f_aPorteeChip(get(u_acc, u_i, null), u_endCell, u_chip)), 1);
}
ops(put(u_res, 1, get(u_acc, u_i, null)), 1);
ops(1);}
else {
ops(put(u_res, 1, u_cellTest), 1);
ops(1);}
ops(put(u_res, 0, get(u_ap, 0, null)), 1);
ops(put(u_res, 2, get(u_ap, 1, null)), 1);
return u_res;
}
private Object f_aRisque(Object p_cell1, Object p_accEnemy) throws LeekRunException {var u_cell1 = p_cell1; ops(1); var u_accEnemy = p_accEnemy; ops(1); 
ops(1);Object u_res = ops(false, 1);
Object u_i = ops(0, 1);
while (ops((ops(less(u_i, load(sysexec(LeekFunctions.count, u_accEnemy))), 1) && ops(!bool(u_res), 1)), 0)) {
ops(1);ops(u_res = (ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.lineOfSight, get(u_accEnemy, u_i, null), u_cell1, null))), 0) && ops(lessequals(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, get(u_accEnemy, u_i, null), u_cell1)), 10), 1)), 1);
ops(sub(u_i = add(u_i, 1), 1), 1);
}
return u_res;
}
private Object f_fuite(Object p_nbCellAlly, Object p_accE) throws LeekRunException {var u_nbCellAlly = p_nbCellAlly; ops(1); var u_accE = p_accE; ops(1); 
ops(1);Object u_res = ops(new ArrayLeekValue(AI_188978772.this, new Object[] { false, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })) }, false), 1);
Object u_accMe = ops(load(f_getAccessible(load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), u_nbCellAlly)), 1);
Object u_i = ops(sub(load(sysexec(LeekFunctions.count, u_accMe)), 1), 2);
if (ops(bool(load(sysexec(LeekFunctions.isEmpty, u_accMe))), 0)) {
return null;}
while (ops((ops(moreequals(u_i, 0), 1) && ops(!bool(get(u_res, 0, null)), 1)), 0)) {
ops(1);if (ops(!bool(load(f_aRisque(get(u_accMe, u_i, null), u_accE))), 1)) {
ops(u_res = new ArrayLeekValue(AI_188978772.this, new Object[] { true, get(u_accMe, u_i, null) }, false), 1);
ops(1);}
ops(add(u_i = sub(u_i, 1), 1), 1);
}
ops(u_i = sub(load(sysexec(LeekFunctions.count, u_accMe)), 1), 2);
while (ops((ops(moreequals(u_i, 0), 1) && ops(!bool(get(u_res, 0, null)), 1)), 0)) {
ops(1);if (ops(!bool(load(sysexec(com.leekwars.generator.FightFunctions.lineOfSight, load(sysexec(com.leekwars.generator.FightFunctions.getCell, g_enemyId)), get(u_accMe, u_i, null), null))), 1)) {
ops(u_res = new ArrayLeekValue(AI_188978772.this, new Object[] { true, get(u_accMe, u_i, null) }, false), 1);
ops(1);}
ops(add(u_i = sub(u_i, 1), 1), 1);
}
ops(u_i = sub(load(sysexec(LeekFunctions.count, u_accMe)), 1), 2);
while (ops((ops(moreequals(u_i, 0), 1) && ops(!bool(get(u_res, 0, null)), 1)), 0)) {
ops(1);if (ops((ops(!bool(load(sysexec(com.leekwars.generator.FightFunctions.isOnSameLine, load(sysexec(com.leekwars.generator.FightFunctions.getCell, g_enemyId)), get(u_accMe, u_i, null)))), 1) && ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, load(sysexec(com.leekwars.generator.FightFunctions.getCell, g_enemyId)), get(u_accMe, u_i, null))), load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, load(sysexec(com.leekwars.generator.FightFunctions.getCell, g_enemyId)), load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null }))))), 1)), 0)) {
ops(u_res = new ArrayLeekValue(AI_188978772.this, new Object[] { true, get(u_accMe, u_i, null) }, false), 1);
ops(1);}
ops(add(u_i = sub(u_i, 1), 1), 1);
}
if (ops(!bool(get(u_res, 0, null)), 1)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveAwayFrom, g_enemyId, null));
ops(1);}
else {
load(sysexec(com.leekwars.generator.FightFunctions.moveTowardCell, get(u_res, 1, null), null));
ops(1);}
return null;}
private Object f_maxDamageAllW(Object p_valTest) throws LeekRunException {var u_valTest = p_valTest; ops(1); 
ops(1);Object u_tab = ops(new ArrayLeekValue(), 1);
Object u_effects = ops(null, 1);
Object u_cost = ops(null, 1);
Object u_shield = ops(null, 1);
Object u_vuln = ops(null, 1);
ops(u_shield = load(sysexec(com.leekwars.generator.FightFunctions.getAbsoluteShield, g_myId)), 1);
ops(u_vuln = load(f_getAbsoluteVulnerability(g_myId)), 1);
for (Object u_i = ops(0, 1);
ops(less(u_i, load(sysexec(LeekFunctions.count, g_EnemyWeapons))), 1); ops(sub(u_i = add(u_i, 1), 1), 1)) {
ops(1);ops(u_effects = load(sysexec(com.leekwars.generator.FightFunctions.getWeaponEffects, get(g_EnemyWeapons, u_i, null))), 1);
ops(u_cost = load(sysexec(com.leekwars.generator.FightFunctions.getWeaponCost, get(g_EnemyWeapons, u_i, null))), 1);
ops(put(u_tab, u_i, 0), 1);
final var ar1 = ops(u_effects, 0);if (isIterable(ar1)) {
Object u_eff = null;
ops(1);for (var i1 : (ArrayLeekValue) ar1) {
u_eff = i1.getValue();
ops(1);if (ops(eq(get(u_eff, 0, null), 1), 1)) {
ops(put_add_eq(u_tab, u_i, mul((add(sub(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getStrength, g_enemyId)), 100)))), u_shield), u_vuln)), load(sysexec(LeekFunctions.floor, div(u_valTest, load(u_cost)))))), 24);
ops(1);}
else if (ops(eq(get(u_eff, 0, null), 13), 1)) {
ops(put_add_eq(u_tab, u_i, mul(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getMagic, g_enemyId)), 100)))), load(sysexec(LeekFunctions.floor, div(u_valTest, load(u_cost)))))), 22);
ops(1);}
else if (ops(eq(get(u_eff, 0, null), 30), 1)) {
ops(put_add_eq(u_tab, u_i, mul(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getScience, g_enemyId)), 100)))), load(sysexec(LeekFunctions.floor, div(u_valTest, load(u_cost)))))), 22);
ops(1);}
}}
ops(load(sysexec(LeekFunctions.debug, add(add(add("arme : ", load(sysexec(com.leekwars.generator.FightFunctions.getWeaponName, get(g_EnemyWeapons, u_i, null)))), ", maxDam : "), get(u_tab, u_i, null)))), 3);
}
return load(sysexec(LeekFunctions.arrayMax, u_tab));
}
private Object f_maxDamageAllWMe(Object p_valTest) throws LeekRunException {var u_valTest = p_valTest; ops(1); 
ops(1);Object u_tab = ops(new ArrayLeekValue(), 1);
Object u_effects = ops(null, 1);
Object u_cost = ops(null, 1);
Object u_shield = ops(null, 1);
Object u_vuln = ops(null, 1);
ops(u_shield = load(sysexec(com.leekwars.generator.FightFunctions.getAbsoluteShield, g_enemyId)), 1);
ops(u_vuln = load(f_getAbsoluteVulnerability(g_enemyId)), 1);
for (Object u_i = ops(0, 1);
ops(less(u_i, load(sysexec(LeekFunctions.count, g_MyWeapons))), 1); ops(sub(u_i = add(u_i, 1), 1), 1)) {
ops(1);ops(u_effects = load(sysexec(com.leekwars.generator.FightFunctions.getWeaponEffects, get(g_MyWeapons, u_i, null))), 1);
ops(u_cost = load(sysexec(com.leekwars.generator.FightFunctions.getWeaponCost, get(g_MyWeapons, u_i, null))), 1);
ops(put(u_tab, u_i, 0), 1);
final var ar2 = ops(u_effects, 0);if (isIterable(ar2)) {
Object u_eff = null;
ops(1);for (var i2 : (ArrayLeekValue) ar2) {
u_eff = i2.getValue();
ops(1);if (ops(eq(get(u_eff, 0, null), 1), 1)) {
ops(put_add_eq(u_tab, u_i, mul((add(sub(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getStrength, g_myId)), 100)))), u_shield), u_vuln)), load(sysexec(LeekFunctions.floor, div(u_valTest, load(u_cost)))))), 24);
ops(1);}
else if (ops(eq(get(u_eff, 0, null), 13), 1)) {
ops(put_add_eq(u_tab, u_i, mul(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getMagic, g_myId)), 100)))), load(sysexec(LeekFunctions.floor, div(u_valTest, load(u_cost)))))), 22);
ops(1);}
else if (ops(eq(get(u_eff, 0, null), 30), 1)) {
ops(put_add_eq(u_tab, u_i, mul(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getScience, g_myId)), 100)))), load(sysexec(LeekFunctions.floor, div(u_valTest, load(u_cost)))))), 22);
ops(1);}
}}
ops(load(sysexec(LeekFunctions.debug, add(add(add("arme : ", load(sysexec(com.leekwars.generator.FightFunctions.getWeaponName, get(g_MyWeapons, u_i, null)))), ", maxDam : "), get(u_tab, u_i, null)))), 3);
}
return load(sysexec(LeekFunctions.arrayMax, u_tab));
}
private Object f_maxDamageW(Object p_weaponTest) throws LeekRunException {var u_weaponTest = p_weaponTest; ops(1); 
ops(1);Object u_effects = ops(null, 1);
Object u_cost = ops(null, 1);
Object u_shield = ops(null, 1);
Object u_vuln = ops(null, 1);
Object u_res = ops(null, 1);
ops(u_shield = load(sysexec(com.leekwars.generator.FightFunctions.getAbsoluteShield, g_myId)), 1);
ops(u_vuln = load(f_getAbsoluteVulnerability(g_myId)), 1);
ops(u_effects = load(sysexec(com.leekwars.generator.FightFunctions.getWeaponEffects, u_weaponTest)), 1);
ops(u_cost = load(sysexec(com.leekwars.generator.FightFunctions.getWeaponCost, u_weaponTest)), 1);
ops(u_res = 0, 1);
final var ar3 = ops(u_effects, 0);if (isIterable(ar3)) {
Object u_eff = null;
ops(1);for (var i3 : (ArrayLeekValue) ar3) {
u_eff = i3.getValue();
ops(1);if (ops(eq(get(u_eff, 0, null), 1), 1)) {
ops(u_res = add_eq(u_res, mul((add(sub(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getStrength, g_enemyId)), 100)))), u_shield), u_vuln)), load(sysexec(LeekFunctions.floor, div(g_valTest, load(u_cost)))))), 24);
ops(1);}
else if (ops(eq(get(u_eff, 0, null), 13), 1)) {
ops(u_res = add_eq(u_res, mul(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getMagic, g_enemyId)), 100)))), load(sysexec(LeekFunctions.floor, div(g_valTest, load(u_cost)))))), 22);
ops(1);}
else if (ops(eq(get(u_eff, 0, null), 30), 1)) {
ops(u_res = add_eq(u_res, mul(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getScience, g_enemyId)), 100)))), load(sysexec(LeekFunctions.floor, div(g_valTest, load(u_cost)))))), 22);
ops(1);}
}}
return u_res;
}
private Object f_maxDamageWMe(Object p_weaponTest) throws LeekRunException {var u_weaponTest = p_weaponTest; ops(1); 
ops(1);Object u_effects = ops(null, 1);
Object u_cost = ops(null, 1);
Object u_shield = ops(null, 1);
Object u_vuln = ops(null, 1);
Object u_res = ops(null, 1);
ops(u_shield = load(sysexec(com.leekwars.generator.FightFunctions.getAbsoluteShield, g_enemyId)), 1);
ops(u_vuln = load(f_getAbsoluteVulnerability(g_enemyId)), 1);
ops(u_effects = load(sysexec(com.leekwars.generator.FightFunctions.getWeaponEffects, u_weaponTest)), 1);
ops(u_cost = load(sysexec(com.leekwars.generator.FightFunctions.getWeaponCost, u_weaponTest)), 1);
ops(u_res = 0, 1);
final var ar4 = ops(u_effects, 0);if (isIterable(ar4)) {
Object u_eff = null;
ops(1);for (var i4 : (ArrayLeekValue) ar4) {
u_eff = i4.getValue();
ops(1);if (ops(eq(get(u_eff, 0, null), 1), 1)) {
ops(u_res = add_eq(u_res, mul((add(sub(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getStrength, g_myId)), 100)))), u_shield), u_vuln)), load(sysexec(LeekFunctions.floor, div(g_valTest, load(u_cost)))))), 24);
ops(1);}
else if (ops(eq(get(u_eff, 0, null), 13), 1)) {
ops(u_res = add_eq(u_res, mul(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getMagic, g_myId)), 100)))), load(sysexec(LeekFunctions.floor, div(g_valTest, load(u_cost)))))), 22);
ops(1);}
else if (ops(eq(get(u_eff, 0, null), 30), 1)) {
ops(u_res = add_eq(u_res, mul(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getScience, g_myId)), 100)))), load(sysexec(LeekFunctions.floor, div(g_valTest, load(u_cost)))))), 22);
ops(1);}
}}
return u_res;
}
private Object f_maxDamageC(Object p_chipTest) throws LeekRunException {var u_chipTest = p_chipTest; ops(1); 
ops(1);Object u_effects = ops(null, 1);
Object u_cost = ops(null, 1);
Object u_shield = ops(null, 1);
Object u_vuln = ops(null, 1);
Object u_res = ops(null, 1);
ops(u_shield = load(sysexec(com.leekwars.generator.FightFunctions.getAbsoluteShield, g_myId)), 1);
ops(u_vuln = load(f_getAbsoluteVulnerability(g_myId)), 1);
ops(u_effects = load(sysexec(com.leekwars.generator.FightFunctions.getChipEffects, u_chipTest)), 1);
ops(u_cost = load(sysexec(com.leekwars.generator.FightFunctions.getChipCost, u_chipTest)), 1);
ops(u_res = 0, 1);
final var ar5 = ops(u_effects, 0);if (isIterable(ar5)) {
Object u_eff = null;
ops(1);for (var i5 : (ArrayLeekValue) ar5) {
u_eff = i5.getValue();
ops(1);if (ops(eq(get(u_eff, 0, null), 1), 1)) {
ops(u_res = add_eq(u_res, mul((add(sub(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getStrength, g_enemyId)), 100)))), u_shield), u_vuln)), load(sysexec(LeekFunctions.floor, div(g_valTest, load(u_cost)))))), 24);
ops(1);}
else if (ops(eq(get(u_eff, 0, null), 13), 1)) {
ops(u_res = add_eq(u_res, mul(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getMagic, g_enemyId)), 100)))), load(sysexec(LeekFunctions.floor, div(g_valTest, load(u_cost)))))), 22);
ops(1);}
else if (ops(eq(get(u_eff, 0, null), 30), 1)) {
ops(u_res = add_eq(u_res, mul(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getScience, g_enemyId)), 100)))), load(sysexec(LeekFunctions.floor, div(g_valTest, load(u_cost)))))), 22);
ops(1);}
}}
return u_res;
}
private Object f_maxDamageCMe(Object p_chipTest) throws LeekRunException {var u_chipTest = p_chipTest; ops(1); 
ops(1);Object u_effects = ops(null, 1);
Object u_cost = ops(null, 1);
Object u_shield = ops(null, 1);
Object u_vuln = ops(null, 1);
Object u_res = ops(null, 1);
ops(u_shield = load(sysexec(com.leekwars.generator.FightFunctions.getAbsoluteShield, g_enemyId)), 1);
ops(u_vuln = load(f_getAbsoluteVulnerability(g_enemyId)), 1);
ops(u_effects = load(sysexec(com.leekwars.generator.FightFunctions.getChipEffects, u_chipTest)), 1);
ops(u_cost = load(sysexec(com.leekwars.generator.FightFunctions.getChipCost, u_chipTest)), 1);
ops(u_res = 0, 1);
final var ar6 = ops(u_effects, 0);if (isIterable(ar6)) {
Object u_eff = null;
ops(1);for (var i6 : (ArrayLeekValue) ar6) {
u_eff = i6.getValue();
ops(1);if (ops(eq(get(u_eff, 0, null), 1), 1)) {
ops(u_res = add_eq(u_res, mul((add(sub(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getStrength, g_myId)), 100)))), u_shield), u_vuln)), load(sysexec(LeekFunctions.floor, div(g_valTest, load(u_cost)))))), 24);
ops(1);}
else if (ops(eq(get(u_eff, 0, null), 13), 1)) {
ops(u_res = add_eq(u_res, mul(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getMagic, g_myId)), 100)))), load(sysexec(LeekFunctions.floor, div(g_valTest, load(u_cost)))))), 22);
ops(1);}
else if (ops(eq(get(u_eff, 0, null), 30), 1)) {
ops(u_res = add_eq(u_res, mul(mul(get(u_eff, 2, null), (add(1, div(load(sysexec(com.leekwars.generator.FightFunctions.getScience, g_myId)), 100)))), load(sysexec(LeekFunctions.floor, div(g_valTest, load(u_cost)))))), 22);
ops(1);}
}}
return u_res;
}
private Object f_getPoison(Object p_entity) throws LeekRunException {var u_entity = p_entity; ops(1); 
ops(1);Object u_effects = ops(load(sysexec(LeekFunctions.arrayFlatten, load(sysexec(com.leekwars.generator.FightFunctions.getEffects, u_entity)), null)), 1);
Object u_posPoison = ops(load(sysexec(LeekFunctions.search, u_effects, 13, null)), 1);
Object u_poison = ops(0, 1);
if (ops(neq(u_posPoison, null), 1)) {
ops(u_poison = get(u_effects, add(u_posPoison, 1), null), 2);
ops(1);}
return null;
}
private Object f_getAbsoluteVulnerability(Object p_entity) throws LeekRunException {var u_entity = p_entity; ops(1); 
ops(1);Object u_effects = ops(load(sysexec(LeekFunctions.arrayFlatten, load(sysexec(com.leekwars.generator.FightFunctions.getEffects, u_entity)), null)), 1);
Object u_posAV = ops(load(sysexec(LeekFunctions.search, u_effects, 27, null)), 1);
Object u_av = ops(0, 1);
if (ops(neq(u_posAV, null), 1)) {
ops(u_av = get(u_effects, add(u_posAV, 1), null), 2);
ops(1);}
return null;
}
private Object f_t1() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 1), 1);
}
private Object f_t2() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 2), 1);
}
private Object f_t3() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 3), 1);
}
private Object f_t4() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 4), 1);
}
private Object f_t5() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 5), 1);
}
private Object f_t6() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 6), 1);
}
private Object f_t7() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 7), 1);
}
private Object f_t8() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 8), 1);
}
private Object f_t9() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 9), 1);
}
private Object f_t10() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 10), 1);
}
private Object f_t11() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 11), 1);
}
private Object f_t12() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 12), 1);
}
private Object f_t13() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 13), 1);
}
private Object f_t14() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 14), 1);
}
private Object f_t15() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 15), 1);
}
private Object f_t16() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 16), 1);
}
private Object f_t17() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 17), 1);
}
private Object f_t18() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 18), 1);
}
private Object f_t19() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 19), 1);
}
private Object f_t20() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 20), 1);
}
private Object f_t21() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 21), 1);
}
private Object f_t22() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 22), 1);
}
private Object f_t23() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 23), 1);
}
private Object f_t24() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 24), 1);
}
private Object f_t25() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 25), 1);
}
private Object f_t26() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 26), 1);
}
private Object f_t27() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 27), 1);
}
private Object f_t28() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 28), 1);
}
private Object f_t29() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 29), 1);
}
private Object f_t30() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 30), 1);
}
private Object f_t31() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 31), 1);
}
private Object f_t32() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 32), 1);
}
private Object f_t33() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 33), 1);
}
private Object f_t34() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 34), 1);
}
private Object f_t35() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 35), 1);
}
private Object f_t36() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 36), 1);
}
private Object f_t37() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 37), 1);
}
private Object f_t38() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 38), 1);
}
private Object f_t39() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 39), 1);
}
private Object f_t40() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 40), 1);
}
private Object f_t41() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 41), 1);
}
private Object f_t42() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 42), 1);
}
private Object f_t43() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 43), 1);
}
private Object f_t44() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 44), 1);
}
private Object f_t45() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 45), 1);
}
private Object f_t46() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 46), 1);
}
private Object f_t47() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 47), 1);
}
private Object f_t48() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 48), 1);
}
private Object f_t49() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 49), 1);
}
private Object f_t50() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 50), 1);
}
private Object f_t51() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 51), 1);
}
private Object f_t52() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 52), 1);
}
private Object f_t53() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 53), 1);
}
private Object f_t54() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 54), 1);
}
private Object f_t55() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 55), 1);
}
private Object f_t56() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 56), 1);
}
private Object f_t57() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 57), 1);
}
private Object f_t58() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 58), 1);
}
private Object f_t59() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 59), 1);
}
private Object f_t60() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 60), 1);
}
private Object f_t61() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 61), 1);
}
private Object f_t62() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 62), 1);
}
private Object f_t63() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 63), 1);
}
private Object f_t64() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTurn)), 64), 1);
}
private Object f_isLeekAlly(Object p_cell) throws LeekRunException {var u_cell = p_cell; ops(1); 
ops(1);Object u_res = ops(false, 1);
if (ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.isEntity, u_cell))), 0)) {
Object u_e = ops(load(sysexec(com.leekwars.generator.FightFunctions.getEntityOnCell, u_cell)), 1);
ops(u_res = (ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.isAlly, u_e))), 0) && ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getType, u_e)), 1), 1)), 1);
ops(1);}
return u_res;
}
private Object f_isLeekEnemy(Object p_cell) throws LeekRunException {var u_cell = p_cell; ops(1); 
ops(1);Object u_res = ops(false, 1);
if (ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.isEntity, u_cell))), 0)) {
Object u_e = ops(load(sysexec(com.leekwars.generator.FightFunctions.getEntityOnCell, u_cell)), 1);
ops(u_res = (ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.isEnemy, u_e))), 0) && ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getType, u_e)), 1), 1)), 1);
ops(1);}
return u_res;
}
private Object f_isBulbAlly(Object p_cell) throws LeekRunException {var u_cell = p_cell; ops(1); 
ops(1);Object u_res = ops(false, 1);
if (ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.isEntity, u_cell))), 0)) {
Object u_e = ops(load(sysexec(com.leekwars.generator.FightFunctions.getEntityOnCell, u_cell)), 1);
ops(u_res = (ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.isAlly, u_e))), 0) && ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getType, u_e)), 2), 1)), 1);
ops(1);}
return u_res;
}
private Object f_isBulbEnemy(Object p_cell) throws LeekRunException {var u_cell = p_cell; ops(1); 
ops(1);Object u_res = ops(false, 1);
if (ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.isEntity, u_cell))), 0)) {
Object u_e = ops(load(sysexec(com.leekwars.generator.FightFunctions.getEntityOnCell, u_cell)), 1);
ops(u_res = (ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.isEnemy, u_e))), 0) && ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getType, u_e)), 2), 1)), 1);
ops(1);}
return u_res;
}
private Object f_t65() throws LeekRunException {
ops(1);return load(sysexec(com.leekwars.generator.FightFunctions.isEmptyCell, g_cellCible));
}
private Object f_t66() throws LeekRunException {
ops(1);return load(f_isLeekAlly(g_cellCible));
}
private Object f_t67() throws LeekRunException {
ops(1);return load(f_isLeekEnemy(g_cellCible));
}
private Object f_t68() throws LeekRunException {
ops(1);return load(f_isBulbAlly(g_cellCible));
}
private Object f_t69() throws LeekRunException {
ops(1);return load(f_isBulbEnemy(g_cellCible));
}
private Object f_t70() throws LeekRunException {
ops(1);return load(sysexec(com.leekwars.generator.FightFunctions.isEmptyCell, g_cellTest));
}
private Object f_t71() throws LeekRunException {
ops(1);return load(f_isLeekAlly(g_cellTest));
}
private Object f_t72() throws LeekRunException {
ops(1);return load(f_isLeekEnemy(g_cellTest));
}
private Object f_t73() throws LeekRunException {
ops(1);return load(f_isBulbAlly(g_cellTest));
}
private Object f_t74() throws LeekRunException {
ops(1);return load(f_isBulbEnemy(g_cellTest));
}
private Object f_t75() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getLife, g_myId)), g_valTest), 1);
}
private Object f_t76() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getLife, g_myId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getLife, g_myId)), g_valTest2), 1));
}
private Object f_t77() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getLife, g_myId)), g_valTest), 1);
}
private Object f_t78() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getStrength, g_myId)), g_valTest), 1);
}
private Object f_t79() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getStrength, g_myId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getStrength, g_myId)), g_valTest2), 1));
}
private Object f_t80() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getStrength, g_myId)), g_valTest), 1);
}
private Object f_t81() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getWisdom, g_myId)), g_valTest), 1);
}
private Object f_t82() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getWisdom, g_myId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getWisdom, g_myId)), g_valTest2), 1));
}
private Object f_t83() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getWisdom, g_myId)), g_valTest), 1);
}
private Object f_t84() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getAgility, g_myId)), g_valTest), 1);
}
private Object f_t85() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getAgility, g_myId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getAgility, g_myId)), g_valTest2), 1));
}
private Object f_t86() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getAgility, g_myId)), g_valTest), 1);
}
private Object f_t87() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getResistance, g_myId)), g_valTest), 1);
}
private Object f_t88() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getResistance, g_myId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getResistance, g_myId)), g_valTest2), 1));
}
private Object f_t89() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getResistance, g_myId)), g_valTest), 1);
}
private Object f_t90() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getScience, g_myId)), g_valTest), 1);
}
private Object f_t91() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getScience, g_myId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getScience, g_myId)), g_valTest2), 1));
}
private Object f_t92() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getScience, g_myId)), g_valTest), 1);
}
private Object f_t93() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getMagic, g_myId)), g_valTest), 1);
}
private Object f_t94() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getMagic, g_myId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getMagic, g_myId)), g_valTest2), 1));
}
private Object f_t95() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getMagic, g_myId)), g_valTest), 1);
}
private Object f_t96() throws LeekRunException {
ops(1);return ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getMP, g_myId)), g_valTest), 1);
}
private Object f_t97() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getMP, g_myId)), g_valTest), 1);
}
private Object f_t98() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getMP, g_myId)), g_valTest), 1);
}
private Object f_t99() throws LeekRunException {
ops(1);return ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getTP, g_myId)), g_valTest), 1);
}
private Object f_t100() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTP, g_myId)), g_valTest), 1);
}
private Object f_t101() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getTP, g_myId)), g_valTest), 1);
}
private Object f_t102() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getAbsoluteShield, g_myId)), g_valTest), 1);
}
private Object f_t103() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getAbsoluteShield, g_myId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getAbsoluteShield, g_myId)), g_valTest2), 1));
}
private Object f_t104() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getAbsoluteShield, g_myId)), g_valTest), 1);
}
private Object f_t105() throws LeekRunException {
ops(1);return ops(less(load(f_getAbsoluteVulnerability(g_myId)), g_valTest), 1);
}
private Object f_t106() throws LeekRunException {
ops(1);return (ops(moreequals(load(f_getAbsoluteVulnerability(g_myId)), g_valTest), 1) && ops(less(load(f_getAbsoluteVulnerability(g_myId)), g_valTest2), 1));
}
private Object f_t107() throws LeekRunException {
ops(1);return ops(moreequals(load(f_getAbsoluteVulnerability(g_myId)), g_valTest), 1);
}
private Object f_t108() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getDamageReturn, g_myId)), g_valTest), 1);
}
private Object f_t109() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getDamageReturn, g_myId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getDamageReturn, g_myId)), g_valTest2), 1));
}
private Object f_t110() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getDamageReturn, g_myId)), g_valTest), 1);
}
private Object f_t111() throws LeekRunException {
ops(1);return ops(less(load(f_getPoison(g_myId)), g_valTest), 1);
}
private Object f_t112() throws LeekRunException {
ops(1);return (ops(moreequals(load(f_getPoison(g_myId)), g_valTest), 1) && ops(less(load(f_getPoison(g_myId)), g_valTest2), 1));
}
private Object f_t113() throws LeekRunException {
ops(1);return ops(moreequals(load(f_getPoison(g_myId)), g_valTest), 1);
}
private Object f_t114() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getLife, g_enemyId)), g_valTest), 1);
}
private Object f_t115() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getLife, g_enemyId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getLife, g_enemyId)), g_valTest2), 1));
}
private Object f_t116() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getLife, g_enemyId)), g_valTest), 1);
}
private Object f_t117() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getStrength, g_enemyId)), g_valTest), 1);
}
private Object f_t118() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getStrength, g_enemyId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getStrength, g_enemyId)), g_valTest2), 1));
}
private Object f_t119() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getStrength, g_enemyId)), g_valTest), 1);
}
private Object f_t120() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getWisdom, g_enemyId)), g_valTest), 1);
}
private Object f_t121() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getWisdom, g_enemyId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getWisdom, g_enemyId)), g_valTest2), 1));
}
private Object f_t122() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getWisdom, g_enemyId)), g_valTest), 1);
}
private Object f_t123() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getAgility, g_enemyId)), g_valTest), 1);
}
private Object f_t124() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getAgility, g_enemyId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getAgility, g_enemyId)), g_valTest2), 1));
}
private Object f_t125() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getAgility, g_enemyId)), g_valTest), 1);
}
private Object f_t126() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getResistance, g_enemyId)), g_valTest), 1);
}
private Object f_t127() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getResistance, g_enemyId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getResistance, g_enemyId)), g_valTest2), 1));
}
private Object f_t128() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getResistance, g_enemyId)), g_valTest), 1);
}
private Object f_t129() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getScience, g_enemyId)), g_valTest), 1);
}
private Object f_t130() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getScience, g_enemyId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getScience, g_enemyId)), g_valTest2), 1));
}
private Object f_t131() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getScience, g_enemyId)), g_valTest), 1);
}
private Object f_t132() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getMagic, g_enemyId)), g_valTest), 1);
}
private Object f_t133() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getMagic, g_enemyId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getMagic, g_enemyId)), g_valTest2), 1));
}
private Object f_t134() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getMagic, g_enemyId)), g_valTest), 1);
}
private Object f_t135() throws LeekRunException {
ops(1);return ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getMP, g_enemyId)), g_valTest), 1);
}
private Object f_t136() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getMP, g_enemyId)), g_valTest), 1);
}
private Object f_t137() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getMP, g_enemyId)), g_valTest), 1);
}
private Object f_t138() throws LeekRunException {
ops(1);return ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getTP, g_enemyId)), g_valTest), 1);
}
private Object f_t139() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getTP, g_enemyId)), g_valTest), 1);
}
private Object f_t140() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getTP, g_enemyId)), g_valTest), 1);
}
private Object f_t141() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getAbsoluteShield, g_enemyId)), g_valTest), 1);
}
private Object f_t142() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getAbsoluteShield, g_enemyId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getAbsoluteShield, g_enemyId)), g_valTest2), 1));
}
private Object f_t143() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getAbsoluteShield, g_enemyId)), g_valTest), 1);
}
private Object f_t144() throws LeekRunException {
ops(1);return ops(less(load(f_getAbsoluteVulnerability(g_enemyId)), g_valTest), 1);
}
private Object f_t145() throws LeekRunException {
ops(1);return (ops(moreequals(load(f_getAbsoluteVulnerability(g_enemyId)), g_valTest), 1) && ops(less(load(f_getAbsoluteVulnerability(g_enemyId)), g_valTest2), 1));
}
private Object f_t146() throws LeekRunException {
ops(1);return ops(moreequals(load(f_getAbsoluteVulnerability(g_enemyId)), g_valTest), 1);
}
private Object f_t147() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getDamageReturn, g_enemyId)), g_valTest), 1);
}
private Object f_t148() throws LeekRunException {
ops(1);return (ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getDamageReturn, g_enemyId)), g_valTest), 1) && ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getDamageReturn, g_enemyId)), g_valTest2), 1));
}
private Object f_t149() throws LeekRunException {
ops(1);return ops(moreequals(load(sysexec(com.leekwars.generator.FightFunctions.getDamageReturn, g_enemyId)), g_valTest), 1);
}
private Object f_t150() throws LeekRunException {
ops(1);return ops(less(load(f_getPoison(g_enemyId)), g_valTest), 1);
}
private Object f_t151() throws LeekRunException {
ops(1);return (ops(moreequals(load(f_getPoison(g_enemyId)), g_valTest), 1) && ops(less(load(f_getPoison(g_enemyId)), g_valTest2), 1));
}
private Object f_t152() throws LeekRunException {
ops(1);return ops(moreequals(load(f_getPoison(g_enemyId)), g_valTest), 1);
}
private Object f_t153() throws LeekRunException {
ops(1);Object u_ap = ops(load(f_aPorteeWeapon(g_cellTest, g_cellCible, g_weaponTest)), 1);
ops(g_apw = get(u_ap, 1, null), 1);
return get(u_ap, 0, null);
}
private Object f_t154() throws LeekRunException {
ops(1);Object u_ap = ops(load(f_aPorteeWeapon(g_cellCible, g_cellTest, g_weaponTest)), 1);
ops(g_apw = get(u_ap, 1, null), 1);
return get(u_ap, 0, null);
}
private Object f_t155() throws LeekRunException {
ops(1);Object u_ap = ops(load(f_aPorteeChip(g_cellTest, g_cellCible, g_chipTest)), 1);
ops(g_apc = get(u_ap, 1, null), 1);
return get(u_ap, 0, null);
}
private Object f_t156() throws LeekRunException {
ops(1);Object u_ap = ops(load(f_aPorteeChip(g_cellCible, g_cellTest, g_chipTest)), 1);
ops(g_apc = get(u_ap, 1, null), 1);
return get(u_ap, 0, null);
}
private Object f_t157() throws LeekRunException {
ops(1);Object u_peap = ops(load(f_peutEtreAPorteeWeapon(g_cellTest, g_cellCible, g_weaponTest, g_valTest)), 1);
ops(g_cellapw = get(u_peap, 1, null), 1);
ops(g_apw = get(u_peap, 2, null), 1);
load(sysexec(LeekFunctions.debug, "APW!!!"));
load(sysexec(com.leekwars.generator.FightFunctions.mark, g_cellapw, 1, null));
return get(u_peap, 0, null);
}
private Object f_t158() throws LeekRunException {
ops(1);Object u_peap = ops(load(f_peutEtreAPorteeWeapon(g_cellCible, g_cellTest, g_weaponTest, g_valTest)), 1);
ops(g_cellapw = get(u_peap, 1, null), 1);
ops(g_apw = get(u_peap, 2, null), 1);
return get(u_peap, 0, null);
}
private Object f_t159() throws LeekRunException {
ops(1);Object u_peap = ops(load(f_peutEtreAPorteeChip(g_cellTest, g_cellCible, g_chipTest, g_valTest)), 1);
ops(g_cellapc = get(u_peap, 1, null), 1);
ops(g_apc = get(u_peap, 2, null), 1);
return get(u_peap, 0, null);
}
private Object f_t160() throws LeekRunException {
ops(1);Object u_peap = ops(load(f_peutEtreAPorteeChip(g_cellCible, g_cellTest, g_chipTest, g_valTest)), 1);
ops(g_cellapc = get(u_peap, 1, null), 1);
ops(g_apc = get(u_peap, 2, null), 1);
return get(u_peap, 0, null);
}
private Object f_t161() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getWeapon, g_myId)), g_weaponTest), 1);
}
private Object f_t162() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getCooldown, g_chipTest, g_myId)), g_valTest), 1);
}
private Object f_t163() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getWeapon, g_enemyId)), g_weaponTest), 1);
}
private Object f_t164() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getCooldown, g_chipTest, g_enemyId)), g_valTest), 1);
}
private Object f_t165() throws LeekRunException {
ops(1);return g_cond1;
}
private Object f_t166() throws LeekRunException {
ops(1);return g_cond2;
}
private Object f_t167() throws LeekRunException {
ops(1);return g_cond3;
}
private Object f_t168() throws LeekRunException {
ops(1);return ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, g_cellTest, g_cellCible)), g_valTest), 1);
}
private Object f_t169() throws LeekRunException {
ops(1);return ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, g_cellTest, g_cellCible)), g_valTest), 1);
}
private Object f_t170() throws LeekRunException {
ops(1);return ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, g_cellTest, g_cellCible)), g_valTest), 1);
}
private Object f_t171() throws LeekRunException {
ops(1);return load(sysexec(com.leekwars.generator.FightFunctions.canUseWeaponOnCell, g_weaponTest, g_cellCible));
}
private Object f_t172() throws LeekRunException {
ops(1);return load(sysexec(com.leekwars.generator.FightFunctions.canUseChipOnCell, g_chipTest, g_cellCible));
}
private Object f_usePBulbe() throws LeekRunException {
ops(1);Object u_path = ops(load(sysexec(com.leekwars.generator.FightFunctions.getPath, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCell, load(sysexec(com.leekwars.generator.FightFunctions.getNearestEnemy)))), null)), 1);
if (ops(!bool(load(sysexec(LeekFunctions.isEmpty, u_path))), 1)) {
if (ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.lineOfSight, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), get(u_path, 2, null), null))), 0)) {
load(sysexec(com.leekwars.generator.FightFunctions.summon, 73, get(u_path, 2, null), new FunctionLeekValue(198)));
ops(1);}
else {
load(sysexec(com.leekwars.generator.FightFunctions.summon, 73, get(u_path, 1, null), new FunctionLeekValue(198)));
ops(1);}
ops(1);}
return null;
}
private Object f_useIBulbe() throws LeekRunException {
ops(1);Object u_path = ops(load(sysexec(com.leekwars.generator.FightFunctions.getPath, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCell, load(sysexec(com.leekwars.generator.FightFunctions.getNearestEnemy)))), null)), 1);
if (ops(!bool(load(sysexec(LeekFunctions.isEmpty, u_path))), 1)) {
load(sysexec(com.leekwars.generator.FightFunctions.summon, 77, get(u_path, 1, null), new FunctionLeekValue(199)));
ops(1);}
return null;
}
private Object f_useRBulbe() throws LeekRunException {
ops(1);Object u_path = ops(load(sysexec(com.leekwars.generator.FightFunctions.getPath, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCell, load(sysexec(com.leekwars.generator.FightFunctions.getNearestEnemy)))), null)), 1);
if (ops(!bool(load(sysexec(LeekFunctions.isEmpty, u_path))), 1)) {
if (ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.lineOfSight, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), get(u_path, 2, null), null))), 0)) {
load(sysexec(com.leekwars.generator.FightFunctions.summon, 76, get(u_path, 2, null), new FunctionLeekValue(200)));
ops(1);}
else {
load(sysexec(com.leekwars.generator.FightFunctions.summon, 76, get(u_path, 1, null), new FunctionLeekValue(200)));
ops(1);}
ops(1);}
return null;
}
private Object f_useHBulbe() throws LeekRunException {
ops(1);Object u_cx = ops(load(sysexec(com.leekwars.generator.FightFunctions.getCellX, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))), 1);
Object u_cy = ops(load(sysexec(com.leekwars.generator.FightFunctions.getCellY, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))), 1);
Object u_acc = ops(new ArrayLeekValue(AI_188978772.this, new Object[] { load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 2), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(u_cx, 1), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, u_cx, add(u_cy, 2))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), sub(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), u_cy)), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 1), add(u_cy, 1))), load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(u_cx, 2), u_cy)) }, false), 17);
Object u_cell = ops(null, 1);
final var ar7 = ops(u_acc, 0);if (isIterable(ar7)) {
Object u_i = null;
ops(1);for (var i7 : (ArrayLeekValue) ar7) {
u_i = i7.getValue();
ops(1);if (ops((ops(neq(u_i, null), 1) && ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.isEmptyCell, u_i))), 0)), 0)) {
ops(u_cell = u_i, 1);
ops(1);}
}}
if (ops(neq(u_cell, null), 1)) {
load(sysexec(com.leekwars.generator.FightFunctions.summon, 75, u_cell, new FunctionLeekValue(201)));
ops(1);}
return null;
}
private Object f_iaChetif() throws LeekRunException {
ops(1);Object u_summ = ops(load(sysexec(com.leekwars.generator.FightFunctions.getSummoner, new Object[] { null })), 1);
Object u_Enemy = ops(g_enemyId, 1);
if (ops(less(sub(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, load(sysexec(com.leekwars.generator.FightFunctions.getCell, load(sysexec(com.leekwars.generator.FightFunctions.getEntity)))), load(sysexec(com.leekwars.generator.FightFunctions.getCell, u_Enemy)))), load(sysexec(com.leekwars.generator.FightFunctions.getMP, new Object[] { null }))), 6), 2)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveToward, u_Enemy, null));
ops(1);}
else {
while (ops((ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getMP, new Object[] { null })), 0), 1) && ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, load(sysexec(com.leekwars.generator.FightFunctions.getCell, load(sysexec(com.leekwars.generator.FightFunctions.getEntity)))), load(sysexec(com.leekwars.generator.FightFunctions.getCell, u_Enemy)))), 10), 1)), 0)) {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.moveToward, u_Enemy, 1));
}
ops(1);}
load(sysexec(com.leekwars.generator.FightFunctions.useChip, 19, u_Enemy));
load(sysexec(com.leekwars.generator.FightFunctions.useChip, 21, load(sysexec(com.leekwars.generator.FightFunctions.getEntity))));
load(sysexec(com.leekwars.generator.FightFunctions.useChip, 8, load(sysexec(com.leekwars.generator.FightFunctions.getEntity))));
return null;
}
private Object f_iaGlace() throws LeekRunException {
ops(1);Object u_summ = ops(load(sysexec(com.leekwars.generator.FightFunctions.getSummoner, new Object[] { null })), 1);
Object u_Enemy = ops(g_enemyId, 1);
Object u_tp = ops(load(sysexec(com.leekwars.generator.FightFunctions.getTP, new Object[] { null })), 1);
Object u_aps = ops(load(f_peutEtreAPorteeChip(load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCell, u_Enemy)), 30, load(sysexec(com.leekwars.generator.FightFunctions.getMP, new Object[] { null })))), 1);
Object u_apice = ops(load(f_peutEtreAPorteeChip(load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCell, u_Enemy)), 2, load(sysexec(com.leekwars.generator.FightFunctions.getMP, new Object[] { null })))), 1);
if (ops(more(u_tp, 6), 1)) {
Object u_api = ops(load(f_peutEtreAPorteeChip(load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCell, u_Enemy)), 31, load(sysexec(com.leekwars.generator.FightFunctions.getMP, new Object[] { null })))), 1);
if (ops(bool(get(u_api, 0, null)), 0)) {
if (ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getCooldown, 31, null)), 0), 1)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveTowardCell, get(u_api, 1, null), null));
load(sysexec(com.leekwars.generator.FightFunctions.useChipOnCell, 31, get(u_api, 2, null)));
ops(1);}
else if (ops(bool(get(u_aps, 0, null)), 0)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveTowardCell, get(u_aps, 1, null), null));
load(sysexec(com.leekwars.generator.FightFunctions.useChip, 30, u_Enemy));
ops(1);}
else if (ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getCooldown, 31, null)), 1), 1)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveAwayFrom, u_Enemy, null));
ops(1);}
ops(1);}
else if (ops(bool(get(u_aps, 0, null)), 0)) {
if (ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getCooldown, 30, null)), 0), 1)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveTowardCell, get(u_aps, 1, null), null));
load(sysexec(com.leekwars.generator.FightFunctions.useChip, 30, u_Enemy));
ops(1);}
else if (ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getCooldown, 31, null)), 1), 1)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveAwayFrom, u_Enemy, null));
ops(1);}
ops(1);}
else if (ops((ops(more(u_tp, 7), 1) && ops(bool(get(u_apice, 0, null)), 0)), 0)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveTowardCell, get(u_apice, 1, null), null));
load(sysexec(com.leekwars.generator.FightFunctions.useChip, 2, u_Enemy));
ops(1);}
ops(1);}
if (ops(eq(u_tp, 6), 1)) {
if (ops(bool(get(u_aps, 0, null)), 0)) {
if (ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getCooldown, 30, null)), 0), 1)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveTowardCell, get(u_aps, 1, null), null));
load(sysexec(com.leekwars.generator.FightFunctions.useChip, 30, u_Enemy));
ops(1);}
else if (ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getCooldown, 30, null)), 1), 1)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveAwayFrom, u_Enemy, null));
ops(1);}
ops(1);}
ops(1);}
if (ops((ops(eq(u_tp, 5), 1) || ops(eq(u_tp, 4), 1)), 0)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveToward, u_Enemy, null));
load(sysexec(com.leekwars.generator.FightFunctions.useChip, 2, u_Enemy));
ops(1);}
while (ops((ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCell, u_Enemy)))), 5), 1) && ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getMP, new Object[] { null })), 0), 1)), 0)) {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.moveToward, u_Enemy, 1));
}
return null;
}
private Object f_iaRock() throws LeekRunException {
ops(1);Object u_summ = ops(load(sysexec(com.leekwars.generator.FightFunctions.getSummoner, new Object[] { null })), 1);
Object u_Enemy = ops(g_enemyId, 1);
Object u_tp = ops(load(sysexec(com.leekwars.generator.FightFunctions.getTP, new Object[] { null })), 1);
Object u_apr = ops(load(f_peutEtreAPorteeChip(load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCell, u_Enemy)), 7, load(sysexec(com.leekwars.generator.FightFunctions.getMP, new Object[] { null })))), 1);
Object u_app = ops(load(f_peutEtreAPorteeChip(load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCell, u_Enemy)), 19, load(sysexec(com.leekwars.generator.FightFunctions.getMP, new Object[] { null })))), 1);
if (ops(more(u_tp, 4), 1)) {
Object u_aprf = ops(load(f_peutEtreAPorteeChip(load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCell, u_Enemy)), 32, load(sysexec(com.leekwars.generator.FightFunctions.getMP, new Object[] { null })))), 1);
if (ops(bool(get(u_aprf, 0, null)), 0)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveTowardCell, get(u_aprf, 1, null), null));
load(sysexec(com.leekwars.generator.FightFunctions.useChipOnCell, 32, get(u_aprf, 2, null)));
ops(1);}
else if (ops(bool(get(u_apr, 0, null)), 0)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveTowardCell, get(u_apr, 1, null), null));
load(sysexec(com.leekwars.generator.FightFunctions.useChip, 7, u_Enemy));
ops(1);}
ops(u_app = load(f_peutEtreAPorteeChip(load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCell, u_Enemy)), 19, load(sysexec(com.leekwars.generator.FightFunctions.getMP, new Object[] { null })))), 1);
ops(1);}
if (ops((ops(bool(get(u_app, 0, null)), 0) && ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getTP, new Object[] { null })), 1), 1)), 0)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveTowardCell, get(u_app, 1, null), null));
load(sysexec(com.leekwars.generator.FightFunctions.useChip, 19, u_Enemy));
ops(1);}
load(sysexec(com.leekwars.generator.FightFunctions.useChip, 21, load(sysexec(com.leekwars.generator.FightFunctions.getEntity))));
while (ops((ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCell, u_Enemy)))), 5), 1) && ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getMP, new Object[] { null })), 0), 1)), 0)) {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.moveToward, u_Enemy, 1));
}
while (ops((ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCell, u_Enemy)))), 3), 1) && ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getMP, new Object[] { null })), 0), 1)), 0)) {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.moveAwayFrom, u_Enemy, 1));
}
return null;
}
private Object f_iaHealer() throws LeekRunException {
ops(1);Object u_summ = ops(load(sysexec(com.leekwars.generator.FightFunctions.getSummoner, new Object[] { null })), 1);
Object u_Enemy = ops(g_enemyId, 1);
Object u_tp = ops(load(sysexec(com.leekwars.generator.FightFunctions.getTP, new Object[] { null })), 1);
while (ops((ops(less(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCell, u_summ)))), 6), 1) && ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getMP, new Object[] { null })), 0), 1)), 0)) {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.moveAwayFrom, u_Enemy, null));
}
while (ops((ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getCellDistance, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCell, u_summ)))), 5), 1) && ops(more(load(sysexec(com.leekwars.generator.FightFunctions.getMP, new Object[] { null })), 0), 1)), 0)) {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.moveToward, u_summ, null));
}
load(sysexec(com.leekwars.generator.FightFunctions.useChip, 11, u_summ));
Object u_apd = ops(load(f_peutEtreAPorteeChip(load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })), load(sysexec(com.leekwars.generator.FightFunctions.getCell, u_Enemy)), 10, load(sysexec(com.leekwars.generator.FightFunctions.getMP, new Object[] { null })))), 1);
if (ops(bool(get(u_apd, 0, null)), 0)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveTowardCell, get(u_apd, 1, null), null));
load(sysexec(com.leekwars.generator.FightFunctions.useChipOnCell, 10, get(u_apd, 2, null)));
ops(1);}
load(sysexec(com.leekwars.generator.FightFunctions.useChip, 4, u_summ));
load(sysexec(com.leekwars.generator.FightFunctions.useChip, 3, u_summ));
return null;
}
private Object f_a0() throws LeekRunException {
ops(1);ops(g_valTest = 0, 1);
return null;
}
private Object f_a1() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 1), 1);
return null;
}
private Object f_a2() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 2), 1);
return null;
}
private Object f_a3() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 3), 1);
return null;
}
private Object f_a4() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 4), 1);
return null;
}
private Object f_a5() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 5), 1);
return null;
}
private Object f_a6() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 6), 1);
return null;
}
private Object f_a7() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 7), 1);
return null;
}
private Object f_a8() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 8), 1);
return null;
}
private Object f_a9() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 9), 1);
return null;
}
private Object f_a10() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 10), 1);
return null;
}
private Object f_a11() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 20), 1);
return null;
}
private Object f_a12() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 30), 1);
return null;
}
private Object f_a13() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 40), 1);
return null;
}
private Object f_a14() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 50), 1);
return null;
}
private Object f_a15() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 60), 1);
return null;
}
private Object f_a16() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 70), 1);
return null;
}
private Object f_a17() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 80), 1);
return null;
}
private Object f_a18() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 90), 1);
return null;
}
private Object f_a19() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 100), 1);
return null;
}
private Object f_a20() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 200), 1);
return null;
}
private Object f_a21() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 300), 1);
return null;
}
private Object f_a22() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 400), 1);
return null;
}
private Object f_a23() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 500), 1);
return null;
}
private Object f_a24() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 600), 1);
return null;
}
private Object f_a25() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 700), 1);
return null;
}
private Object f_a26() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 800), 1);
return null;
}
private Object f_a27() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 900), 1);
return null;
}
private Object f_a28() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, 1000), 1);
return null;
}
private Object f_a29() throws LeekRunException {
ops(1);ops(g_valTest2 = 0, 1);
return null;
}
private Object f_a30() throws LeekRunException {
ops(1);ops(g_cellCible = load(sysexec(com.leekwars.generator.FightFunctions.getCell, g_myId)), 1);
return null;
}
private Object f_a31() throws LeekRunException {
ops(1);ops(g_cellCible = load(sysexec(com.leekwars.generator.FightFunctions.getCell, g_enemyId)), 1);
return null;
}
private Object f_a32() throws LeekRunException {
ops(1);ops(g_cellTest = load(sysexec(com.leekwars.generator.FightFunctions.getCell, g_enemyId)), 1);
return null;
}
private Object f_a33() throws LeekRunException {
ops(1);ops(g_cellTest = load(sysexec(com.leekwars.generator.FightFunctions.getCell, g_myId)), 1);
return null;
}
private Object f_a34() throws LeekRunException {
ops(1);Object u_cell = ops(load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, add(load(sysexec(com.leekwars.generator.FightFunctions.getCellX, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))), 1), load(sysexec(com.leekwars.generator.FightFunctions.getCellY, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))))), 2);
if (ops((ops(neq(u_cell, null), 1) && ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.isEmptyCell, u_cell))), 0)), 0)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveTowardCell, u_cell, null));
ops(1);}
else {
load(sysexec(LeekFunctions.debug, "cell invalide"));
ops(1);}
return null;
}
private Object f_a35() throws LeekRunException {
ops(1);Object u_cell = ops(load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, sub(load(sysexec(com.leekwars.generator.FightFunctions.getCellX, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))), 1), load(sysexec(com.leekwars.generator.FightFunctions.getCellY, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))))), 2);
if (ops((ops(neq(u_cell, null), 1) && ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.isEmptyCell, u_cell))), 0)), 0)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveTowardCell, u_cell, null));
ops(1);}
else {
load(sysexec(LeekFunctions.debug, "cell invalide"));
ops(1);}
return null;
}
private Object f_a36() throws LeekRunException {
ops(1);Object u_cell = ops(load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, load(sysexec(com.leekwars.generator.FightFunctions.getCellX, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))), add(load(sysexec(com.leekwars.generator.FightFunctions.getCellY, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))), 1))), 2);
if (ops((ops(neq(u_cell, null), 1) && ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.isEmptyCell, u_cell))), 0)), 0)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveTowardCell, u_cell, null));
ops(1);}
else {
load(sysexec(LeekFunctions.debug, "cell invalide"));
ops(1);}
return null;
}
private Object f_a37() throws LeekRunException {
ops(1);Object u_cell = ops(load(sysexec(com.leekwars.generator.FightFunctions.getCellFromXY, load(sysexec(com.leekwars.generator.FightFunctions.getCellX, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))), sub(load(sysexec(com.leekwars.generator.FightFunctions.getCellY, load(sysexec(com.leekwars.generator.FightFunctions.getCell, new Object[] { null })))), 1))), 2);
if (ops((ops(neq(u_cell, null), 1) && ops(bool(load(sysexec(com.leekwars.generator.FightFunctions.isEmptyCell, u_cell))), 0)), 0)) {
load(sysexec(com.leekwars.generator.FightFunctions.moveTowardCell, u_cell, null));
ops(1);}
else {
load(sysexec(LeekFunctions.debug, "cell invalide"));
ops(1);}
return null;
}
private Object f_a38() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.moveTowardCell, g_cellCible, g_valTest));
return null;
}
private Object f_a39() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.moveAwayFromCell, g_cellCible, g_valTest));
return null;
}
private Object f_a40() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 109));
return null;
}
private Object f_a41() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 184));
return null;
}
private Object f_a42() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 60));
return null;
}
private Object f_a43() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 108));
return null;
}
private Object f_a44() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 187));
return null;
}
private Object f_a45() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 40));
return null;
}
private Object f_a46() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 39));
return null;
}
private Object f_a47() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 44));
return null;
}
private Object f_a48() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 175));
return null;
}
private Object f_a49() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 46));
return null;
}
private Object f_a50() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 48));
return null;
}
private Object f_a51() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 43));
return null;
}
private Object f_a52() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 116));
return null;
}
private Object f_a53() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 107));
return null;
}
private Object f_a54() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 42));
return null;
}
private Object f_a55() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 180));
return null;
}
private Object f_a56() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 38));
return null;
}
private Object f_a57() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 45));
return null;
}
private Object f_a58() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 47));
return null;
}
private Object f_a59() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 117));
return null;
}
private Object f_a60() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 182));
return null;
}
private Object f_a61() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 37));
return null;
}
private Object f_a62() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 119));
return null;
}
private Object f_a63() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 153));
return null;
}
private Object f_a64() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 151));
return null;
}
private Object f_a65() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 41));
return null;
}
private Object f_a66() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 118));
return null;
}
private Object f_a67() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.setWeapon, 115));
return null;
}
private Object f_a68() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.moveTowardCell, g_cellapw, null));
return null;
}
private Object f_a69() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.moveTowardCell, g_cellapc, null));
return null;
}
private Object f_a70() throws LeekRunException {
ops(1);ops(g_cellCible = g_apw, 1);
return null;
}
private Object f_a71() throws LeekRunException {
ops(1);ops(g_cellCible = g_apc, 1);
return null;
}
private Object f_a72() throws LeekRunException {
ops(1);ops(g_cellTest = g_cellapw, 1);
return null;
}
private Object f_a73() throws LeekRunException {
ops(1);ops(g_cellTest = g_cellapc, 1);
return null;
}
private Object f_a74() throws LeekRunException {
ops(1);ops(g_weaponTest = 109, 1);
return null;
}
private Object f_a75() throws LeekRunException {
ops(1);ops(g_weaponTest = 184, 1);
return null;
}
private Object f_a76() throws LeekRunException {
ops(1);ops(g_weaponTest = 60, 1);
return null;
}
private Object f_a77() throws LeekRunException {
ops(1);ops(g_weaponTest = 108, 1);
return null;
}
private Object f_a78() throws LeekRunException {
ops(1);ops(g_weaponTest = 187, 1);
return null;
}
private Object f_a79() throws LeekRunException {
ops(1);ops(g_weaponTest = 40, 1);
return null;
}
private Object f_a80() throws LeekRunException {
ops(1);ops(g_weaponTest = 39, 1);
return null;
}
private Object f_a81() throws LeekRunException {
ops(1);ops(g_weaponTest = 44, 1);
return null;
}
private Object f_a82() throws LeekRunException {
ops(1);ops(g_weaponTest = 175, 1);
return null;
}
private Object f_a83() throws LeekRunException {
ops(1);ops(g_weaponTest = 46, 1);
return null;
}
private Object f_a84() throws LeekRunException {
ops(1);ops(g_weaponTest = 48, 1);
return null;
}
private Object f_a85() throws LeekRunException {
ops(1);ops(g_weaponTest = 43, 1);
return null;
}
private Object f_a86() throws LeekRunException {
ops(1);ops(g_weaponTest = 116, 1);
return null;
}
private Object f_a87() throws LeekRunException {
ops(1);ops(g_weaponTest = 107, 1);
return null;
}
private Object f_a88() throws LeekRunException {
ops(1);ops(g_weaponTest = 42, 1);
return null;
}
private Object f_a89() throws LeekRunException {
ops(1);ops(g_weaponTest = 180, 1);
return null;
}
private Object f_a90() throws LeekRunException {
ops(1);ops(g_weaponTest = 38, 1);
return null;
}
private Object f_a91() throws LeekRunException {
ops(1);ops(g_weaponTest = 45, 1);
return null;
}
private Object f_a92() throws LeekRunException {
ops(1);ops(g_weaponTest = 47, 1);
return null;
}
private Object f_a93() throws LeekRunException {
ops(1);ops(g_weaponTest = 117, 1);
return null;
}
private Object f_a94() throws LeekRunException {
ops(1);ops(g_weaponTest = 182, 1);
return null;
}
private Object f_a95() throws LeekRunException {
ops(1);ops(g_weaponTest = 37, 1);
return null;
}
private Object f_a96() throws LeekRunException {
ops(1);ops(g_weaponTest = 119, 1);
return null;
}
private Object f_a97() throws LeekRunException {
ops(1);ops(g_weaponTest = 153, 1);
return null;
}
private Object f_a98() throws LeekRunException {
ops(1);ops(g_weaponTest = 151, 1);
return null;
}
private Object f_a99() throws LeekRunException {
ops(1);ops(g_weaponTest = 41, 1);
return null;
}
private Object f_a100() throws LeekRunException {
ops(1);ops(g_weaponTest = 118, 1);
return null;
}
private Object f_a101() throws LeekRunException {
ops(1);ops(g_weaponTest = 115, 1);
return null;
}
private Object f_a102() throws LeekRunException {
ops(1);ops(g_chipTest = 91, 1);
return null;
}
private Object f_a103() throws LeekRunException {
ops(1);ops(g_chipTest = 16, 1);
return null;
}
private Object f_a104() throws LeekRunException {
ops(1);ops(g_chipTest = 141, 1);
return null;
}
private Object f_a105() throws LeekRunException {
ops(1);ops(g_chipTest = 110, 1);
return null;
}
private Object f_a106() throws LeekRunException {
ops(1);ops(g_chipTest = 22, 1);
return null;
}
private Object f_a107() throws LeekRunException {
ops(1);ops(g_chipTest = 67, 1);
return null;
}
private Object f_a108() throws LeekRunException {
ops(1);ops(g_chipTest = 171, 1);
return null;
}
private Object f_a109() throws LeekRunException {
ops(1);ops(g_chipTest = 93, 1);
return null;
}
private Object f_a110() throws LeekRunException {
ops(1);ops(g_chipTest = 3, 1);
return null;
}
private Object f_a111() throws LeekRunException {
ops(1);ops(g_chipTest = 104, 1);
return null;
}
private Object f_a112() throws LeekRunException {
ops(1);ops(g_chipTest = 163, 1);
return null;
}
private Object f_a113() throws LeekRunException {
ops(1);ops(g_chipTest = 170, 1);
return null;
}
private Object f_a114() throws LeekRunException {
ops(1);ops(g_chipTest = 172, 1);
return null;
}
private Object f_a115() throws LeekRunException {
ops(1);ops(g_chipTest = 105, 1);
return null;
}
private Object f_a116() throws LeekRunException {
ops(1);ops(g_chipTest = 81, 1);
return null;
}
private Object f_a117() throws LeekRunException {
ops(1);ops(g_chipTest = 103, 1);
return null;
}
private Object f_a118() throws LeekRunException {
ops(1);ops(g_chipTest = 120, 1);
return null;
}
private Object f_a119() throws LeekRunException {
ops(1);ops(g_chipTest = 152, 1);
return null;
}
private Object f_a120() throws LeekRunException {
ops(1);ops(g_chipTest = 169, 1);
return null;
}
private Object f_a121() throws LeekRunException {
ops(1);ops(g_chipTest = 4, 1);
return null;
}
private Object f_a122() throws LeekRunException {
ops(1);ops(g_chipTest = 160, 1);
return null;
}
private Object f_a123() throws LeekRunException {
ops(1);ops(g_chipTest = 85, 1);
return null;
}
private Object f_a124() throws LeekRunException {
ops(1);ops(g_chipTest = 173, 1);
return null;
}
private Object f_a125() throws LeekRunException {
ops(1);ops(g_chipTest = 26, 1);
return null;
}
private Object f_a126() throws LeekRunException {
ops(1);ops(g_chipTest = 10, 1);
return null;
}
private Object f_a127() throws LeekRunException {
ops(1);ops(g_chipTest = 154, 1);
return null;
}
private Object f_a128() throws LeekRunException {
ops(1);ops(g_chipTest = 102, 1);
return null;
}
private Object f_a129() throws LeekRunException {
ops(1);ops(g_chipTest = 90, 1);
return null;
}
private Object f_a130() throws LeekRunException {
ops(1);ops(g_chipTest = 74, 1);
return null;
}
private Object f_a131() throws LeekRunException {
ops(1);ops(g_chipTest = 5, 1);
return null;
}
private Object f_a132() throws LeekRunException {
ops(1);ops(g_chipTest = 6, 1);
return null;
}
private Object f_a133() throws LeekRunException {
ops(1);ops(g_chipTest = 29, 1);
return null;
}
private Object f_a134() throws LeekRunException {
ops(1);ops(g_chipTest = 106, 1);
return null;
}
private Object f_a135() throws LeekRunException {
ops(1);ops(g_chipTest = 162, 1);
return null;
}
private Object f_a136() throws LeekRunException {
ops(1);ops(g_chipTest = 75, 1);
return null;
}
private Object f_a137() throws LeekRunException {
ops(1);ops(g_chipTest = 21, 1);
return null;
}
private Object f_a138() throws LeekRunException {
ops(1);ops(g_chipTest = 2, 1);
return null;
}
private Object f_a139() throws LeekRunException {
ops(1);ops(g_chipTest = 31, 1);
return null;
}
private Object f_a140() throws LeekRunException {
ops(1);ops(g_chipTest = 77, 1);
return null;
}
private Object f_a141() throws LeekRunException {
ops(1);ops(g_chipTest = 68, 1);
return null;
}
private Object f_a142() throws LeekRunException {
ops(1);ops(g_chipTest = 144, 1);
return null;
}
private Object f_a143() throws LeekRunException {
ops(1);ops(g_chipTest = 155, 1);
return null;
}
private Object f_a144() throws LeekRunException {
ops(1);ops(g_chipTest = 14, 1);
return null;
}
private Object f_a145() throws LeekRunException {
ops(1);ops(g_chipTest = 34, 1);
return null;
}
private Object f_a146() throws LeekRunException {
ops(1);ops(g_chipTest = 33, 1);
return null;
}
private Object f_a147() throws LeekRunException {
ops(1);ops(g_chipTest = 78, 1);
return null;
}
private Object f_a148() throws LeekRunException {
ops(1);ops(g_chipTest = 89, 1);
return null;
}
private Object f_a149() throws LeekRunException {
ops(1);ops(g_chipTest = 174, 1);
return null;
}
private Object f_a150() throws LeekRunException {
ops(1);ops(g_chipTest = 79, 1);
return null;
}
private Object f_a151() throws LeekRunException {
ops(1);ops(g_chipTest = 36, 1);
return null;
}
private Object f_a152() throws LeekRunException {
ops(1);ops(g_chipTest = 101, 1);
return null;
}
private Object f_a153() throws LeekRunException {
ops(1);ops(g_chipTest = 15, 1);
return null;
}
private Object f_a154() throws LeekRunException {
ops(1);ops(g_chipTest = 159, 1);
return null;
}
private Object f_a155() throws LeekRunException {
ops(1);ops(g_chipTest = 19, 1);
return null;
}
private Object f_a156() throws LeekRunException {
ops(1);ops(g_chipTest = 99, 1);
return null;
}
private Object f_a157() throws LeekRunException {
ops(1);ops(g_chipTest = 143, 1);
return null;
}
private Object f_a158() throws LeekRunException {
ops(1);ops(g_chipTest = 122, 1);
return null;
}
private Object f_a159() throws LeekRunException {
ops(1);ops(g_chipTest = 8, 1);
return null;
}
private Object f_a160() throws LeekRunException {
ops(1);ops(g_chipTest = 114, 1);
return null;
}
private Object f_a161() throws LeekRunException {
ops(1);ops(g_chipTest = 73, 1);
return null;
}
private Object f_a162() throws LeekRunException {
ops(1);ops(g_chipTest = 17, 1);
return null;
}
private Object f_a163() throws LeekRunException {
ops(1);ops(g_chipTest = 24, 1);
return null;
}
private Object f_a164() throws LeekRunException {
ops(1);ops(g_chipTest = 27, 1);
return null;
}
private Object f_a165() throws LeekRunException {
ops(1);ops(g_chipTest = 35, 1);
return null;
}
private Object f_a166() throws LeekRunException {
ops(1);ops(g_chipTest = 80, 1);
return null;
}
private Object f_a167() throws LeekRunException {
ops(1);ops(g_chipTest = 157, 1);
return null;
}
private Object f_a168() throws LeekRunException {
ops(1);ops(g_chipTest = 84, 1);
return null;
}
private Object f_a169() throws LeekRunException {
ops(1);ops(g_chipTest = 7, 1);
return null;
}
private Object f_a170() throws LeekRunException {
ops(1);ops(g_chipTest = 32, 1);
return null;
}
private Object f_a171() throws LeekRunException {
ops(1);ops(g_chipTest = 76, 1);
return null;
}
private Object f_a172() throws LeekRunException {
ops(1);ops(g_chipTest = 167, 1);
return null;
}
private Object f_a173() throws LeekRunException {
ops(1);ops(g_chipTest = 168, 1);
return null;
}
private Object f_a174() throws LeekRunException {
ops(1);ops(g_chipTest = 12, 1);
return null;
}
private Object f_a175() throws LeekRunException {
ops(1);ops(g_chipTest = 20, 1);
return null;
}
private Object f_a176() throws LeekRunException {
ops(1);ops(g_chipTest = 1, 1);
return null;
}
private Object f_a177() throws LeekRunException {
ops(1);ops(g_chipTest = 92, 1);
return null;
}
private Object f_a178() throws LeekRunException {
ops(1);ops(g_chipTest = 96, 1);
return null;
}
private Object f_a179() throws LeekRunException {
ops(1);ops(g_chipTest = 95, 1);
return null;
}
private Object f_a180() throws LeekRunException {
ops(1);ops(g_chipTest = 18, 1);
return null;
}
private Object f_a181() throws LeekRunException {
ops(1);ops(g_chipTest = 30, 1);
return null;
}
private Object f_a182() throws LeekRunException {
ops(1);ops(g_chipTest = 25, 1);
return null;
}
private Object f_a183() throws LeekRunException {
ops(1);ops(g_chipTest = 9, 1);
return null;
}
private Object f_a184() throws LeekRunException {
ops(1);ops(g_chipTest = 166, 1);
return null;
}
private Object f_a185() throws LeekRunException {
ops(1);ops(g_chipTest = 59, 1);
return null;
}
private Object f_a186() throws LeekRunException {
ops(1);ops(g_chipTest = 158, 1);
return null;
}
private Object f_a187() throws LeekRunException {
ops(1);ops(g_chipTest = 100, 1);
return null;
}
private Object f_a188() throws LeekRunException {
ops(1);ops(g_chipTest = 98, 1);
return null;
}
private Object f_a189() throws LeekRunException {
ops(1);ops(g_chipTest = 94, 1);
return null;
}
private Object f_a190() throws LeekRunException {
ops(1);ops(g_chipTest = 161, 1);
return null;
}
private Object f_a191() throws LeekRunException {
ops(1);ops(g_chipTest = 11, 1);
return null;
}
private Object f_a192() throws LeekRunException {
ops(1);ops(g_chipTest = 121, 1);
return null;
}
private Object f_a193() throws LeekRunException {
ops(1);ops(g_chipTest = 97, 1);
return null;
}
private Object f_a194() throws LeekRunException {
ops(1);ops(g_chipTest = 23, 1);
return null;
}
private Object f_a195() throws LeekRunException {
ops(1);ops(g_chipTest = 28, 1);
return null;
}
private Object f_a196() throws LeekRunException {
ops(1);ops(g_chipTest = 88, 1);
return null;
}
private Object f_a197() throws LeekRunException {
ops(1);ops(g_chipTest = 13, 1);
return null;
}
private Object f_a198() throws LeekRunException {
ops(1);ops(g_chipTest = 142, 1);
return null;
}
private Object f_a199() throws LeekRunException {
ops(1);ops(g_chipTest = 156, 1);
return null;
}
private Object f_a200() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.useWeaponOnCell, g_cellCible));
return null;
}
private Object f_a201() throws LeekRunException {
ops(1);load(sysexec(com.leekwars.generator.FightFunctions.useChipOnCell, g_chipTest, g_cellCible));
return null;
}
private Object f_a202() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getTP, g_myId))), 1);
return null;
}
private Object f_a203() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getTP, g_enemyId))), 1);
return null;
}
private Object f_a204() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getMP, g_myId))), 1);
return null;
}
private Object f_a205() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getMP, g_enemyId))), 1);
return null;
}
private Object f_a206() throws LeekRunException {
ops(1);ops(g_valTest = sub(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getWeaponCost, g_weaponTest))), 1);
return null;
}
private Object f_a207() throws LeekRunException {
ops(1);ops(g_valTest = sub(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getChipCost, g_chipTest))), 1);
return null;
}
private Object f_a208() throws LeekRunException {
ops(1);ops(g_valTest2 = g_valTest, 1);
return null;
}
private Object f_a209() throws LeekRunException {
ops(1);ops(g_valTest = g_valTest2, 1);
return null;
}
private Object f_a210() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(f_maxDamageAllW(g_valTest2))), 1);
return null;
}
private Object f_a211() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(f_maxDamageW(g_weaponTest))), 1);
return null;
}
private Object f_a212() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(f_maxDamageC(g_chipTest))), 1);
return null;
}
private Object f_a213() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(f_maxDamageAllWMe(g_valTest2))), 1);
return null;
}
private Object f_a214() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(f_maxDamageWMe(g_weaponTest))), 1);
return null;
}
private Object f_a215() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(f_maxDamageCMe(g_chipTest))), 1);
return null;
}
private Object f_a216() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(f_getPoison(g_myId))), 1);
return null;
}
private Object f_a217() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(f_getPoison(g_enemyId))), 1);
return null;
}
private Object f_a218() throws LeekRunException {
ops(1);ops(g_cond1 = true, 1);
return null;
}
private Object f_a219() throws LeekRunException {
ops(1);ops(g_cond2 = true, 1);
return null;
}
private Object f_a220() throws LeekRunException {
ops(1);ops(g_cond3 = true, 1);
return null;
}
private Object f_a221() throws LeekRunException {
ops(1);ops(g_cond1 = false, 1);
return null;
}
private Object f_a222() throws LeekRunException {
ops(1);ops(g_cond2 = false, 1);
return null;
}
private Object f_a223() throws LeekRunException {
ops(1);ops(g_cond3 = false, 1);
return null;
}
private Object f_a224() throws LeekRunException {
ops(1);load(f_usePBulbe());
return null;
}
private Object f_a225() throws LeekRunException {
ops(1);load(f_useRBulbe());
return null;
}
private Object f_a226() throws LeekRunException {
ops(1);load(f_useIBulbe());
return null;
}
private Object f_a227() throws LeekRunException {
ops(1);load(f_useHBulbe());
return null;
}
private Object f_a228() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getTotalLife, g_myId))), 1);
return null;
}
private Object f_a229() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getTotalLife, g_enemyId))), 1);
return null;
}
private Object f_a230() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getLife, g_myId))), 1);
return null;
}
private Object f_a231() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getLife, g_enemyId))), 1);
return null;
}
private Object f_a232() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getStrength, g_myId))), 1);
return null;
}
private Object f_a233() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getStrength, g_enemyId))), 1);
return null;
}
private Object f_a234() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getWisdom, g_myId))), 1);
return null;
}
private Object f_a235() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getWisdom, g_enemyId))), 1);
return null;
}
private Object f_a236() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getAgility, g_myId))), 1);
return null;
}
private Object f_a237() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getAgility, g_enemyId))), 1);
return null;
}
private Object f_a238() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getResistance, g_myId))), 1);
return null;
}
private Object f_a239() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getResistance, g_enemyId))), 1);
return null;
}
private Object f_a240() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getScience, g_myId))), 1);
return null;
}
private Object f_a241() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getScience, g_enemyId))), 1);
return null;
}
private Object f_a242() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getMagic, g_myId))), 1);
return null;
}
private Object f_a243() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getMagic, g_enemyId))), 1);
return null;
}
private Object f_a244() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getAbsoluteShield, g_myId))), 1);
return null;
}
private Object f_a245() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getAbsoluteShield, g_enemyId))), 1);
return null;
}
private Object f_a246() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(f_getAbsoluteVulnerability(g_myId))), 1);
return null;
}
private Object f_a247() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(f_getAbsoluteVulnerability(g_enemyId))), 1);
return null;
}
private Object f_a248() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getDamageReturn, g_myId))), 1);
return null;
}
private Object f_a249() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getDamageReturn, g_enemyId))), 1);
return null;
}
private Object f_a250() throws LeekRunException {
ops(1);load(f_fuite(g_valTest, g_accE));
return null;
}
private Object f_a251() throws LeekRunException {
ops(1);ops(g_accE = load(f_getAccessible(load(sysexec(com.leekwars.generator.FightFunctions.getCell, g_enemyId)), load(sysexec(com.leekwars.generator.FightFunctions.getMP, g_enemyId)))), 1);
return null;
}
private Object f_a252() throws LeekRunException {
ops(1);ops(g_valTest = sub(g_valTest, g_valTest2), 1);
return null;
}
private Object f_a253() throws LeekRunException {
ops(1);ops(g_valTest = mul(g_valTest, g_valTest2), 5);
return null;
}
private Object f_a254() throws LeekRunException {
ops(1);ops(g_valTest = div(g_valTest, g_valTest2), 5);
return null;
}
private Object f_a255() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getTotalTP, g_myId))), 1);
return null;
}
private Object f_a256() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getTotalTP, g_enemyId))), 1);
return null;
}
private Object f_a257() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getTotalMP, g_myId))), 1);
return null;
}
private Object f_a258() throws LeekRunException {
ops(1);ops(g_valTest = add(g_valTest, load(sysexec(com.leekwars.generator.FightFunctions.getTotalMP, g_enemyId))), 1);
return null;
}
private Object f_a259() throws LeekRunException {
ops(1);ops(g_weaponTest = null, 1);
return null;
}
private Object f_a260() throws LeekRunException {
ops(1);ops(g_weaponTest = load(sysexec(com.leekwars.generator.FightFunctions.getWeapon, g_myId)), 1);
return null;
}
private Object f_a261() throws LeekRunException {
ops(1);ops(g_weaponTest = load(sysexec(com.leekwars.generator.FightFunctions.getWeapon, g_enemyId)), 1);
return null;
}
private Object f_a262() throws LeekRunException {
ops(1);load(sysexec(LeekFunctions.debug, "test ok"));
return null;
}
public Object runIA() throws LeekRunException { resetCounter();
if (!g_init_ADN) { g_ADN = "A083N161F049A031A000A204A038A188A201A193A201A200A200A200A200A200"; g_init_ADN = true; ops(1); }
if (!g_init_enemyId) { g_enemyId = null; g_init_enemyId = true; ops(1); }
if (!g_init_myId) { g_myId = null; g_init_myId = true; ops(1); }
if (ops(eq(load(sysexec(com.leekwars.generator.FightFunctions.getEntity)), 1), 1)) {
ops(g_enemyId = 0, 1);
ops(g_myId = 1, 1);
ops(1);}
else {
ops(g_enemyId = 1, 1);
ops(g_myId = 0, 1);
ops(1);}
if (!g_init_EnemyWeapons) { g_EnemyWeapons = load(sysexec(com.leekwars.generator.FightFunctions.getWeapons, g_enemyId)); g_init_EnemyWeapons = true; ops(1); }
if (!g_init_EnemyChips) { g_EnemyChips = load(sysexec(com.leekwars.generator.FightFunctions.getChips, g_enemyId)); g_init_EnemyChips = true; ops(1); }
if (!g_init_MyWeapons) { g_MyWeapons = load(sysexec(com.leekwars.generator.FightFunctions.getWeapons, load(sysexec(com.leekwars.generator.FightFunctions.getEntity)))); g_init_MyWeapons = true; ops(1); }
if (!g_init_MyChips) { g_MyChips = load(sysexec(com.leekwars.generator.FightFunctions.getChips, load(sysexec(com.leekwars.generator.FightFunctions.getEntity)))); g_init_MyChips = true; ops(1); }
if (!g_init_cellCible) { g_cellCible = null; g_init_cellCible = true; ops(1); }
if (!g_init_cellTest) { g_cellTest = null; g_init_cellTest = true; ops(1); }
if (!g_init_valTest) { g_valTest = null; g_init_valTest = true; ops(1); }
if (!g_init_valTest2) { g_valTest2 = 0; g_init_valTest2 = true; ops(1); }
if (!g_init_weaponTest) { g_weaponTest = null; g_init_weaponTest = true; ops(1); }
if (!g_init_chipTest) { g_chipTest = 0; g_init_chipTest = true; ops(1); }
if (!g_init_apw) { g_apw = null; g_init_apw = true; ops(1); }
if (!g_init_apc) { g_apc = null; g_init_apc = true; ops(1); }
if (!g_init_cellapw) { g_cellapw = null; g_init_cellapw = true; ops(1); }
if (!g_init_cellapc) { g_cellapc = 0; g_init_cellapc = true; ops(1); }
if (!g_init_cond1) { g_cond1 = null; g_init_cond1 = true; ops(1); }
if (!g_init_cond2) { g_cond2 = null; g_init_cond2 = true; ops(1); }
if (!g_init_cond3) { g_cond3 = false; g_init_cond3 = true; ops(1); }
if (!g_init_accE) { g_accE = null; g_init_accE = true; ops(1); }
if (!g_init_tabTests) { g_tabTests = new ArrayLeekValue(AI_188978772.this, new Object[] { true, new FunctionLeekValue(18), new FunctionLeekValue(19), new FunctionLeekValue(20), new FunctionLeekValue(21), new FunctionLeekValue(22), new FunctionLeekValue(23), new FunctionLeekValue(24), new FunctionLeekValue(25), new FunctionLeekValue(26), new FunctionLeekValue(27), new FunctionLeekValue(28), new FunctionLeekValue(29), new FunctionLeekValue(30), new FunctionLeekValue(31), new FunctionLeekValue(32), new FunctionLeekValue(33), new FunctionLeekValue(34), new FunctionLeekValue(35), new FunctionLeekValue(36), new FunctionLeekValue(37), new FunctionLeekValue(38), new FunctionLeekValue(39), new FunctionLeekValue(40), new FunctionLeekValue(41), new FunctionLeekValue(42), new FunctionLeekValue(43), new FunctionLeekValue(44), new FunctionLeekValue(45), new FunctionLeekValue(46), new FunctionLeekValue(47), new FunctionLeekValue(48), new FunctionLeekValue(49), new FunctionLeekValue(50), new FunctionLeekValue(51), new FunctionLeekValue(52), new FunctionLeekValue(53), new FunctionLeekValue(54), new FunctionLeekValue(55), new FunctionLeekValue(56), new FunctionLeekValue(57), new FunctionLeekValue(58), new FunctionLeekValue(59), new FunctionLeekValue(60), new FunctionLeekValue(61), new FunctionLeekValue(62), new FunctionLeekValue(63), new FunctionLeekValue(64), new FunctionLeekValue(65), new FunctionLeekValue(66), new FunctionLeekValue(67), new FunctionLeekValue(68), new FunctionLeekValue(69), new FunctionLeekValue(70), new FunctionLeekValue(71), new FunctionLeekValue(72), new FunctionLeekValue(73), new FunctionLeekValue(74), new FunctionLeekValue(75), new FunctionLeekValue(76), new FunctionLeekValue(77), new FunctionLeekValue(78), new FunctionLeekValue(79), new FunctionLeekValue(80), new FunctionLeekValue(81), new FunctionLeekValue(86), new FunctionLeekValue(87), new FunctionLeekValue(88), new FunctionLeekValue(89), new FunctionLeekValue(90), new FunctionLeekValue(91), new FunctionLeekValue(92), new FunctionLeekValue(93), new FunctionLeekValue(94), new FunctionLeekValue(95), new FunctionLeekValue(96), new FunctionLeekValue(97), new FunctionLeekValue(98), new FunctionLeekValue(99), new FunctionLeekValue(100), new FunctionLeekValue(101), new FunctionLeekValue(102), new FunctionLeekValue(103), new FunctionLeekValue(104), new FunctionLeekValue(105), new FunctionLeekValue(106), new FunctionLeekValue(107), new FunctionLeekValue(108), new FunctionLeekValue(109), new FunctionLeekValue(110), new FunctionLeekValue(111), new FunctionLeekValue(112), new FunctionLeekValue(113), new FunctionLeekValue(114), new FunctionLeekValue(115), new FunctionLeekValue(116), new FunctionLeekValue(117), new FunctionLeekValue(118), new FunctionLeekValue(119), new FunctionLeekValue(120), new FunctionLeekValue(121), new FunctionLeekValue(122), new FunctionLeekValue(123), new FunctionLeekValue(124), new FunctionLeekValue(125), new FunctionLeekValue(126), new FunctionLeekValue(127), new FunctionLeekValue(128), new FunctionLeekValue(129), new FunctionLeekValue(130), new FunctionLeekValue(131), new FunctionLeekValue(132), new FunctionLeekValue(133), new FunctionLeekValue(134), new FunctionLeekValue(135), new FunctionLeekValue(136), new FunctionLeekValue(137), new FunctionLeekValue(138), new FunctionLeekValue(139), new FunctionLeekValue(140), new FunctionLeekValue(141), new FunctionLeekValue(142), new FunctionLeekValue(143), new FunctionLeekValue(144), new FunctionLeekValue(145), new FunctionLeekValue(146), new FunctionLeekValue(147), new FunctionLeekValue(148), new FunctionLeekValue(149), new FunctionLeekValue(150), new FunctionLeekValue(151), new FunctionLeekValue(152), new FunctionLeekValue(153), new FunctionLeekValue(154), new FunctionLeekValue(155), new FunctionLeekValue(156), new FunctionLeekValue(157), new FunctionLeekValue(158), new FunctionLeekValue(159), new FunctionLeekValue(160), new FunctionLeekValue(161), new FunctionLeekValue(162), new FunctionLeekValue(163), new FunctionLeekValue(164), new FunctionLeekValue(165), new FunctionLeekValue(166), new FunctionLeekValue(167), new FunctionLeekValue(168), new FunctionLeekValue(169), new FunctionLeekValue(170), new FunctionLeekValue(171), new FunctionLeekValue(172), new FunctionLeekValue(173), new FunctionLeekValue(174), new FunctionLeekValue(175), new FunctionLeekValue(176), new FunctionLeekValue(177), new FunctionLeekValue(178), new FunctionLeekValue(179), new FunctionLeekValue(180), new FunctionLeekValue(181), new FunctionLeekValue(182), new FunctionLeekValue(183), new FunctionLeekValue(184), new FunctionLeekValue(185), new FunctionLeekValue(186), new FunctionLeekValue(187), new FunctionLeekValue(188), new FunctionLeekValue(189), new FunctionLeekValue(190), new FunctionLeekValue(191), new FunctionLeekValue(192), new FunctionLeekValue(193), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 109)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 184)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 60)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 108)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 187)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 40)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 39)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 44)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 175)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 46)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 48)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 43)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 116)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 115)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 107)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 42)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 180)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 38)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 45)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 47)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 117)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 182)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 37)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 119)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 153)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 151)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 41)), load(sysexec(LeekFunctions.inArray, g_MyWeapons, 118)), load(sysexec(LeekFunctions.inArray, g_MyChips, 91)), load(sysexec(LeekFunctions.inArray, g_MyChips, 16)), load(sysexec(LeekFunctions.inArray, g_MyChips, 141)), load(sysexec(LeekFunctions.inArray, g_MyChips, 110)), load(sysexec(LeekFunctions.inArray, g_MyChips, 22)), load(sysexec(LeekFunctions.inArray, g_MyChips, 67)), load(sysexec(LeekFunctions.inArray, g_MyChips, 171)), load(sysexec(LeekFunctions.inArray, g_MyChips, 93)), load(sysexec(LeekFunctions.inArray, g_MyChips, 3)), load(sysexec(LeekFunctions.inArray, g_MyChips, 104)), load(sysexec(LeekFunctions.inArray, g_MyChips, 163)), load(sysexec(LeekFunctions.inArray, g_MyChips, 170)), load(sysexec(LeekFunctions.inArray, g_MyChips, 172)), load(sysexec(LeekFunctions.inArray, g_MyChips, 105)), load(sysexec(LeekFunctions.inArray, g_MyChips, 81)), load(sysexec(LeekFunctions.inArray, g_MyChips, 103)), load(sysexec(LeekFunctions.inArray, g_MyChips, 120)), load(sysexec(LeekFunctions.inArray, g_MyChips, 152)), load(sysexec(LeekFunctions.inArray, g_MyChips, 169)), load(sysexec(LeekFunctions.inArray, g_MyChips, 4)), load(sysexec(LeekFunctions.inArray, g_MyChips, 160)), load(sysexec(LeekFunctions.inArray, g_MyChips, 85)), load(sysexec(LeekFunctions.inArray, g_MyChips, 173)), load(sysexec(LeekFunctions.inArray, g_MyChips, 26)), load(sysexec(LeekFunctions.inArray, g_MyChips, 10)), load(sysexec(LeekFunctions.inArray, g_MyChips, 154)), load(sysexec(LeekFunctions.inArray, g_MyChips, 102)), load(sysexec(LeekFunctions.inArray, g_MyChips, 90)), load(sysexec(LeekFunctions.inArray, g_MyChips, 74)), load(sysexec(LeekFunctions.inArray, g_MyChips, 5)), load(sysexec(LeekFunctions.inArray, g_MyChips, 6)), load(sysexec(LeekFunctions.inArray, g_MyChips, 29)), load(sysexec(LeekFunctions.inArray, g_MyChips, 106)), load(sysexec(LeekFunctions.inArray, g_MyChips, 162)), load(sysexec(LeekFunctions.inArray, g_MyChips, 75)), load(sysexec(LeekFunctions.inArray, g_MyChips, 21)), load(sysexec(LeekFunctions.inArray, g_MyChips, 2)), load(sysexec(LeekFunctions.inArray, g_MyChips, 31)), load(sysexec(LeekFunctions.inArray, g_MyChips, 77)), load(sysexec(LeekFunctions.inArray, g_MyChips, 68)), load(sysexec(LeekFunctions.inArray, g_MyChips, 144)), load(sysexec(LeekFunctions.inArray, g_MyChips, 155)), load(sysexec(LeekFunctions.inArray, g_MyChips, 14)), load(sysexec(LeekFunctions.inArray, g_MyChips, 34)), load(sysexec(LeekFunctions.inArray, g_MyChips, 33)), load(sysexec(LeekFunctions.inArray, g_MyChips, 78)), load(sysexec(LeekFunctions.inArray, g_MyChips, 89)), load(sysexec(LeekFunctions.inArray, g_MyChips, 174)), load(sysexec(LeekFunctions.inArray, g_MyChips, 79)), load(sysexec(LeekFunctions.inArray, g_MyChips, 36)), load(sysexec(LeekFunctions.inArray, g_MyChips, 101)), load(sysexec(LeekFunctions.inArray, g_MyChips, 15)), load(sysexec(LeekFunctions.inArray, g_MyChips, 159)), load(sysexec(LeekFunctions.inArray, g_MyChips, 19)), load(sysexec(LeekFunctions.inArray, g_MyChips, 99)), load(sysexec(LeekFunctions.inArray, g_MyChips, 143)), load(sysexec(LeekFunctions.inArray, g_MyChips, 122)), load(sysexec(LeekFunctions.inArray, g_MyChips, 8)), load(sysexec(LeekFunctions.inArray, g_MyChips, 114)), load(sysexec(LeekFunctions.inArray, g_MyChips, 73)), load(sysexec(LeekFunctions.inArray, g_MyChips, 17)), load(sysexec(LeekFunctions.inArray, g_MyChips, 24)), load(sysexec(LeekFunctions.inArray, g_MyChips, 27)), load(sysexec(LeekFunctions.inArray, g_MyChips, 35)), load(sysexec(LeekFunctions.inArray, g_MyChips, 80)), load(sysexec(LeekFunctions.inArray, g_MyChips, 157)), load(sysexec(LeekFunctions.inArray, g_MyChips, 84)), load(sysexec(LeekFunctions.inArray, g_MyChips, 7)), load(sysexec(LeekFunctions.inArray, g_MyChips, 32)), load(sysexec(LeekFunctions.inArray, g_MyChips, 76)), load(sysexec(LeekFunctions.inArray, g_MyChips, 167)), load(sysexec(LeekFunctions.inArray, g_MyChips, 168)), load(sysexec(LeekFunctions.inArray, g_MyChips, 12)), load(sysexec(LeekFunctions.inArray, g_MyChips, 20)), load(sysexec(LeekFunctions.inArray, g_MyChips, 1)), load(sysexec(LeekFunctions.inArray, g_MyChips, 92)), load(sysexec(LeekFunctions.inArray, g_MyChips, 96)), load(sysexec(LeekFunctions.inArray, g_MyChips, 95)), load(sysexec(LeekFunctions.inArray, g_MyChips, 18)), load(sysexec(LeekFunctions.inArray, g_MyChips, 30)), load(sysexec(LeekFunctions.inArray, g_MyChips, 25)), load(sysexec(LeekFunctions.inArray, g_MyChips, 9)), load(sysexec(LeekFunctions.inArray, g_MyChips, 166)), load(sysexec(LeekFunctions.inArray, g_MyChips, 59)), load(sysexec(LeekFunctions.inArray, g_MyChips, 158)), load(sysexec(LeekFunctions.inArray, g_MyChips, 100)), load(sysexec(LeekFunctions.inArray, g_MyChips, 98)), load(sysexec(LeekFunctions.inArray, g_MyChips, 94)), load(sysexec(LeekFunctions.inArray, g_MyChips, 161)), load(sysexec(LeekFunctions.inArray, g_MyChips, 11)), load(sysexec(LeekFunctions.inArray, g_MyChips, 121)), load(sysexec(LeekFunctions.inArray, g_MyChips, 97)), load(sysexec(LeekFunctions.inArray, g_MyChips, 23)), load(sysexec(LeekFunctions.inArray, g_MyChips, 28)), load(sysexec(LeekFunctions.inArray, g_MyChips, 88)), load(sysexec(LeekFunctions.inArray, g_MyChips, 13)), load(sysexec(LeekFunctions.inArray, g_MyChips, 142)), load(sysexec(LeekFunctions.inArray, g_MyChips, 156)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 109)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 184)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 60)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 108)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 187)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 40)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 39)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 44)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 175)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 46)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 48)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 43)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 116)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 115)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 107)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 42)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 180)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 38)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 45)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 47)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 117)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 182)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 37)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 119)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 153)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 151)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 41)), load(sysexec(LeekFunctions.inArray, g_EnemyWeapons, 118)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 91)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 16)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 141)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 110)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 22)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 67)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 171)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 93)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 3)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 104)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 163)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 170)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 172)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 105)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 81)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 103)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 120)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 152)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 169)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 4)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 160)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 85)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 173)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 26)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 10)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 154)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 102)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 90)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 74)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 5)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 6)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 29)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 106)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 162)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 75)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 21)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 2)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 31)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 77)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 68)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 144)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 155)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 14)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 34)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 33)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 78)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 89)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 174)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 79)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 36)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 101)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 15)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 159)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 19)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 99)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 143)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 122)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 8)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 114)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 73)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 17)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 24)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 27)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 35)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 80)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 157)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 84)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 7)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 32)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 76)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 167)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 168)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 12)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 20)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 1)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 92)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 96)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 95)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 18)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 30)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 25)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 9)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 166)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 59)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 158)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 100)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 98)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 94)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 161)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 11)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 121)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 97)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 23)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 28)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 88)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 13)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 142)), load(sysexec(LeekFunctions.inArray, g_EnemyChips, 156)) }, false); g_init_tabTests = true; ops(1); }
if (!g_init_tabActions) { g_tabActions = new ArrayLeekValue(AI_188978772.this, new Object[] { new FunctionLeekValue(202), new FunctionLeekValue(203), new FunctionLeekValue(204), new FunctionLeekValue(205), new FunctionLeekValue(206), new FunctionLeekValue(207), new FunctionLeekValue(208), new FunctionLeekValue(209), new FunctionLeekValue(210), new FunctionLeekValue(211), new FunctionLeekValue(212), new FunctionLeekValue(213), new FunctionLeekValue(214), new FunctionLeekValue(215), new FunctionLeekValue(216), new FunctionLeekValue(217), new FunctionLeekValue(218), new FunctionLeekValue(219), new FunctionLeekValue(220), new FunctionLeekValue(221), new FunctionLeekValue(222), new FunctionLeekValue(223), new FunctionLeekValue(224), new FunctionLeekValue(225), new FunctionLeekValue(226), new FunctionLeekValue(227), new FunctionLeekValue(228), new FunctionLeekValue(229), new FunctionLeekValue(230), new FunctionLeekValue(231), new FunctionLeekValue(232), new FunctionLeekValue(233), new FunctionLeekValue(234), new FunctionLeekValue(235), new FunctionLeekValue(236), new FunctionLeekValue(237), new FunctionLeekValue(238), new FunctionLeekValue(239), new FunctionLeekValue(240), new FunctionLeekValue(241), new FunctionLeekValue(242), new FunctionLeekValue(243), new FunctionLeekValue(244), new FunctionLeekValue(245), new FunctionLeekValue(246), new FunctionLeekValue(247), new FunctionLeekValue(248), new FunctionLeekValue(249), new FunctionLeekValue(250), new FunctionLeekValue(251), new FunctionLeekValue(252), new FunctionLeekValue(253), new FunctionLeekValue(254), new FunctionLeekValue(255), new FunctionLeekValue(256), new FunctionLeekValue(257), new FunctionLeekValue(258), new FunctionLeekValue(259), new FunctionLeekValue(260), new FunctionLeekValue(261), new FunctionLeekValue(262), new FunctionLeekValue(263), new FunctionLeekValue(264), new FunctionLeekValue(265), new FunctionLeekValue(266), new FunctionLeekValue(267), new FunctionLeekValue(268), new FunctionLeekValue(269), new FunctionLeekValue(270), new FunctionLeekValue(271), new FunctionLeekValue(272), new FunctionLeekValue(273), new FunctionLeekValue(274), new FunctionLeekValue(275), new FunctionLeekValue(276), new FunctionLeekValue(277), new FunctionLeekValue(278), new FunctionLeekValue(279), new FunctionLeekValue(280), new FunctionLeekValue(281), new FunctionLeekValue(282), new FunctionLeekValue(283), new FunctionLeekValue(284), new FunctionLeekValue(285), new FunctionLeekValue(286), new FunctionLeekValue(287), new FunctionLeekValue(288), new FunctionLeekValue(289), new FunctionLeekValue(290), new FunctionLeekValue(291), new FunctionLeekValue(292), new FunctionLeekValue(293), new FunctionLeekValue(294), new FunctionLeekValue(295), new FunctionLeekValue(296), new FunctionLeekValue(297), new FunctionLeekValue(298), new FunctionLeekValue(299), new FunctionLeekValue(300), new FunctionLeekValue(301), new FunctionLeekValue(302), new FunctionLeekValue(303), new FunctionLeekValue(304), new FunctionLeekValue(305), new FunctionLeekValue(306), new FunctionLeekValue(307), new FunctionLeekValue(308), new FunctionLeekValue(309), new FunctionLeekValue(310), new FunctionLeekValue(311), new FunctionLeekValue(312), new FunctionLeekValue(313), new FunctionLeekValue(314), new FunctionLeekValue(315), new FunctionLeekValue(316), new FunctionLeekValue(317), new FunctionLeekValue(318), new FunctionLeekValue(319), new FunctionLeekValue(320), new FunctionLeekValue(321), new FunctionLeekValue(322), new FunctionLeekValue(323), new FunctionLeekValue(324), new FunctionLeekValue(325), new FunctionLeekValue(326), new FunctionLeekValue(327), new FunctionLeekValue(328), new FunctionLeekValue(329), new FunctionLeekValue(330), new FunctionLeekValue(331), new FunctionLeekValue(332), new FunctionLeekValue(333), new FunctionLeekValue(334), new FunctionLeekValue(335), new FunctionLeekValue(336), new FunctionLeekValue(337), new FunctionLeekValue(338), new FunctionLeekValue(339), new FunctionLeekValue(340), new FunctionLeekValue(341), new FunctionLeekValue(342), new FunctionLeekValue(343), new FunctionLeekValue(344), new FunctionLeekValue(345), new FunctionLeekValue(346), new FunctionLeekValue(347), new FunctionLeekValue(348), new FunctionLeekValue(349), new FunctionLeekValue(350), new FunctionLeekValue(351), new FunctionLeekValue(352), new FunctionLeekValue(353), new FunctionLeekValue(354), new FunctionLeekValue(355), new FunctionLeekValue(356), new FunctionLeekValue(357), new FunctionLeekValue(358), new FunctionLeekValue(359), new FunctionLeekValue(360), new FunctionLeekValue(361), new FunctionLeekValue(362), new FunctionLeekValue(363), new FunctionLeekValue(364), new FunctionLeekValue(365), new FunctionLeekValue(366), new FunctionLeekValue(367), new FunctionLeekValue(368), new FunctionLeekValue(369), new FunctionLeekValue(370), new FunctionLeekValue(371), new FunctionLeekValue(372), new FunctionLeekValue(373), new FunctionLeekValue(374), new FunctionLeekValue(375), new FunctionLeekValue(376), new FunctionLeekValue(377), new FunctionLeekValue(378), new FunctionLeekValue(379), new FunctionLeekValue(380), new FunctionLeekValue(381), new FunctionLeekValue(382), new FunctionLeekValue(383), new FunctionLeekValue(384), new FunctionLeekValue(385), new FunctionLeekValue(386), new FunctionLeekValue(387), new FunctionLeekValue(388), new FunctionLeekValue(389), new FunctionLeekValue(390), new FunctionLeekValue(391), new FunctionLeekValue(392), new FunctionLeekValue(393), new FunctionLeekValue(394), new FunctionLeekValue(395), new FunctionLeekValue(396), new FunctionLeekValue(397), new FunctionLeekValue(398), new FunctionLeekValue(399), new FunctionLeekValue(400), new FunctionLeekValue(401), new FunctionLeekValue(402), new FunctionLeekValue(403), new FunctionLeekValue(404), new FunctionLeekValue(405), new FunctionLeekValue(406), new FunctionLeekValue(407), new FunctionLeekValue(408), new FunctionLeekValue(409), new FunctionLeekValue(410), new FunctionLeekValue(411), new FunctionLeekValue(412), new FunctionLeekValue(413), new FunctionLeekValue(414), new FunctionLeekValue(415), new FunctionLeekValue(416), new FunctionLeekValue(417), new FunctionLeekValue(418), new FunctionLeekValue(419), new FunctionLeekValue(420), new FunctionLeekValue(421), new FunctionLeekValue(422), new FunctionLeekValue(423), new FunctionLeekValue(424), new FunctionLeekValue(425), new FunctionLeekValue(426), new FunctionLeekValue(427), new FunctionLeekValue(428), new FunctionLeekValue(429), new FunctionLeekValue(430), new FunctionLeekValue(431), new FunctionLeekValue(432), new FunctionLeekValue(433), new FunctionLeekValue(434), new FunctionLeekValue(435), new FunctionLeekValue(436), new FunctionLeekValue(437), new FunctionLeekValue(438), new FunctionLeekValue(439), new FunctionLeekValue(440), new FunctionLeekValue(441), new FunctionLeekValue(442), new FunctionLeekValue(443), new FunctionLeekValue(444), new FunctionLeekValue(445), new FunctionLeekValue(446), new FunctionLeekValue(447), new FunctionLeekValue(448), new FunctionLeekValue(449), new FunctionLeekValue(450), new FunctionLeekValue(451), new FunctionLeekValue(452), new FunctionLeekValue(453), new FunctionLeekValue(454), new FunctionLeekValue(455), new FunctionLeekValue(456), new FunctionLeekValue(457), new FunctionLeekValue(458), new FunctionLeekValue(459), new FunctionLeekValue(460), new FunctionLeekValue(461), new FunctionLeekValue(462), new FunctionLeekValue(463), new FunctionLeekValue(464) }, false); g_init_tabActions = true; ops(1); }
ops(g_accE = load(f_getAccessible(load(sysexec(com.leekwars.generator.FightFunctions.getCell, g_enemyId)), load(sysexec(com.leekwars.generator.FightFunctions.getMP, g_enemyId)))), 1);
Object u_CDT = ops(true, 1);
Object u_CDO = ops(false, 1);
Object u_type = ops(null, 1);
Object u_gene = ops(null, 1);
Object u_test = ops(null, 1);
Object u_action = ops(null, 1);
Object u_wh = ops(null, 1);
for (Object u_i = ops(0, 1);
ops(less(u_i, load(sysexec(LeekFunctions.length, g_ADN))), 1); ops(u_i = add_eq(u_i, 4), 1)) {
ops(1);ops(u_type = load(sysexec(LeekFunctions.charAt, g_ADN, u_i)), 1);
ops(u_gene = load(sysexec(LeekFunctions.substring, g_ADN, add(u_i, 1), 3)), 2);
if (ops(eq(u_type, "P"), 1)) {
ops(u_action = get(g_tabActions, load(sysexec(LeekFunctions.number, u_gene)), null), 1);
load(execute(u_action));
load(sysexec(LeekFunctions.debug, u_type));
ops(load(sysexec(LeekFunctions.debug, add("Prioritaire : ", u_gene))), 1);
ops(1);}
else if (ops(bool(u_CDT), 0)) {
if (ops((ops(eq(u_type, "A"), 1) || ops(eq(u_type, "F"), 1)), 0)) {
ops(u_action = get(g_tabActions, load(sysexec(LeekFunctions.number, u_gene)), null), 1);
load(execute(u_action));
load(sysexec(LeekFunctions.debug, u_type));
ops(load(sysexec(LeekFunctions.debug, add("Action : ", u_gene))), 1);
ops(1);}
else if (ops(eq(u_type, "T"), 1)) {
ops(u_test = get(g_tabTests, load(sysexec(LeekFunctions.number, u_gene)), null), 1);
if (ops(eq(load(sysexec(LeekFunctions.typeOf, u_test)), 2), 1)) {
ops(u_CDT = u_test, 1);
ops(1);}
else {
ops(u_CDT = load(execute(u_test)), 1);
ops(1);}
load(sysexec(LeekFunctions.debug, u_type));
ops(load(sysexec(LeekFunctions.debug, add(add(add("test : ", u_gene), " = "), u_CDT))), 3);
ops(1);}
else if (ops(eq(u_type, "O"), 1)) {
if (ops(!bool(u_CDO), 1)) {
ops(u_test = get(g_tabTests, load(sysexec(LeekFunctions.number, u_gene)), null), 1);
if (ops(eq(load(sysexec(LeekFunctions.typeOf, u_test)), 2), 1)) {
ops(u_CDO = u_test, 1);
ops(1);}
else {
ops(u_CDO = load(execute(u_test)), 1);
ops(1);}
load(sysexec(LeekFunctions.debug, u_type));
ops(1);}
if (ops((ops(neq(load(sysexec(LeekFunctions.charAt, g_ADN, add(u_i, 4))), "O"), 2) && ops(neq(load(sysexec(LeekFunctions.charAt, g_ADN, add(u_i, 4))), "Q"), 2)), 0)) {
if (ops(!bool(u_CDO), 1)) {
ops(u_CDT = false, 1);
ops(1);}
ops(u_CDO = false, 1);
ops(1);}
ops(1);}
else if (ops(eq(u_type, "N"), 1)) {
ops(u_test = get(g_tabTests, load(sysexec(LeekFunctions.number, u_gene)), null), 1);
if (ops(eq(load(sysexec(LeekFunctions.typeOf, u_test)), 2), 1)) {
ops(u_CDT = !bool(u_test), 2);
ops(1);}
else {
ops(u_CDT = !bool(load(execute(u_test))), 2);
ops(1);}
load(sysexec(LeekFunctions.debug, u_type));
ops(load(sysexec(LeekFunctions.debug, add(add(add("test : ", u_gene), " = "), u_CDT))), 3);
ops(1);}
else if (ops(eq(u_type, "Q"), 1)) {
if (ops(!bool(u_CDO), 1)) {
ops(u_test = get(g_tabTests, load(sysexec(LeekFunctions.number, u_gene)), null), 1);
if (ops(eq(load(sysexec(LeekFunctions.typeOf, u_test)), 2), 1)) {
ops(u_CDO = !bool(u_test), 2);
ops(1);}
else {
ops(u_CDO = !bool(load(execute(u_test))), 2);
ops(1);}
load(sysexec(LeekFunctions.debug, u_type));
ops(1);}
if (ops((ops(neq(load(sysexec(LeekFunctions.charAt, g_ADN, add(u_i, 4))), "O"), 2) && ops(neq(load(sysexec(LeekFunctions.charAt, g_ADN, add(u_i, 4))), "Q"), 2)), 0)) {
if (ops(!bool(u_CDO), 1)) {
ops(u_CDT = false, 1);
ops(1);}
ops(u_CDO = false, 1);
ops(1);}
ops(1);}
else if (ops(eq(u_type, "W"), 1)) {
ops(u_wh = sub(u_i, 4), 2);
ops(u_test = get(g_tabTests, load(sysexec(LeekFunctions.number, u_gene)), null), 1);
if (ops(eq(load(sysexec(LeekFunctions.typeOf, u_test)), 2), 1)) {
ops(u_CDT = u_test, 1);
ops(1);}
else {
ops(u_CDT = load(execute(u_test)), 1);
ops(1);}
load(sysexec(LeekFunctions.debug, u_type));
ops(1);}
else if (ops(eq(u_type, "M"), 1)) {
ops(u_action = get(g_tabActions, load(sysexec(LeekFunctions.number, u_gene)), null), 1);
load(execute(u_action));
ops(u_i = u_wh, 1);
load(sysexec(LeekFunctions.debug, u_type));
ops(1);}
ops(1);}
else if (ops((ops(eq(u_type, "F"), 1) || ops(eq(u_type, "M"), 1)), 0)) {
ops(u_CDT = true, 1);
ops(1);}
}
return null;
}
protected String getAIString() { return "test/ai/gen_2.leek";}
protected String[] getErrorFiles() { return new String[] {"test/ai/gen_2.leek", };}
public int userFunctionCount(int id) {
switch(id) {
case 1: return 2;
case 2: return 2;
case 3: return 7;
case 4: return 3;
case 5: return 3;
case 6: return 4;
case 7: return 4;
case 8: return 2;
case 9: return 2;
case 10: return 1;
case 11: return 1;
case 12: return 1;
case 13: return 1;
case 14: return 1;
case 15: return 1;
case 16: return 1;
case 17: return 1;
case 18: return 0;
case 19: return 0;
case 20: return 0;
case 21: return 0;
case 22: return 0;
case 23: return 0;
case 24: return 0;
case 25: return 0;
case 26: return 0;
case 27: return 0;
case 28: return 0;
case 29: return 0;
case 30: return 0;
case 31: return 0;
case 32: return 0;
case 33: return 0;
case 34: return 0;
case 35: return 0;
case 36: return 0;
case 37: return 0;
case 38: return 0;
case 39: return 0;
case 40: return 0;
case 41: return 0;
case 42: return 0;
case 43: return 0;
case 44: return 0;
case 45: return 0;
case 46: return 0;
case 47: return 0;
case 48: return 0;
case 49: return 0;
case 50: return 0;
case 51: return 0;
case 52: return 0;
case 53: return 0;
case 54: return 0;
case 55: return 0;
case 56: return 0;
case 57: return 0;
case 58: return 0;
case 59: return 0;
case 60: return 0;
case 61: return 0;
case 62: return 0;
case 63: return 0;
case 64: return 0;
case 65: return 0;
case 66: return 0;
case 67: return 0;
case 68: return 0;
case 69: return 0;
case 70: return 0;
case 71: return 0;
case 72: return 0;
case 73: return 0;
case 74: return 0;
case 75: return 0;
case 76: return 0;
case 77: return 0;
case 78: return 0;
case 79: return 0;
case 80: return 0;
case 81: return 0;
case 82: return 1;
case 83: return 1;
case 84: return 1;
case 85: return 1;
case 86: return 0;
case 87: return 0;
case 88: return 0;
case 89: return 0;
case 90: return 0;
case 91: return 0;
case 92: return 0;
case 93: return 0;
case 94: return 0;
case 95: return 0;
case 96: return 0;
case 97: return 0;
case 98: return 0;
case 99: return 0;
case 100: return 0;
case 101: return 0;
case 102: return 0;
case 103: return 0;
case 104: return 0;
case 105: return 0;
case 106: return 0;
case 107: return 0;
case 108: return 0;
case 109: return 0;
case 110: return 0;
case 111: return 0;
case 112: return 0;
case 113: return 0;
case 114: return 0;
case 115: return 0;
case 116: return 0;
case 117: return 0;
case 118: return 0;
case 119: return 0;
case 120: return 0;
case 121: return 0;
case 122: return 0;
case 123: return 0;
case 124: return 0;
case 125: return 0;
case 126: return 0;
case 127: return 0;
case 128: return 0;
case 129: return 0;
case 130: return 0;
case 131: return 0;
case 132: return 0;
case 133: return 0;
case 134: return 0;
case 135: return 0;
case 136: return 0;
case 137: return 0;
case 138: return 0;
case 139: return 0;
case 140: return 0;
case 141: return 0;
case 142: return 0;
case 143: return 0;
case 144: return 0;
case 145: return 0;
case 146: return 0;
case 147: return 0;
case 148: return 0;
case 149: return 0;
case 150: return 0;
case 151: return 0;
case 152: return 0;
case 153: return 0;
case 154: return 0;
case 155: return 0;
case 156: return 0;
case 157: return 0;
case 158: return 0;
case 159: return 0;
case 160: return 0;
case 161: return 0;
case 162: return 0;
case 163: return 0;
case 164: return 0;
case 165: return 0;
case 166: return 0;
case 167: return 0;
case 168: return 0;
case 169: return 0;
case 170: return 0;
case 171: return 0;
case 172: return 0;
case 173: return 0;
case 174: return 0;
case 175: return 0;
case 176: return 0;
case 177: return 0;
case 178: return 0;
case 179: return 0;
case 180: return 0;
case 181: return 0;
case 182: return 0;
case 183: return 0;
case 184: return 0;
case 185: return 0;
case 186: return 0;
case 187: return 0;
case 188: return 0;
case 189: return 0;
case 190: return 0;
case 191: return 0;
case 192: return 0;
case 193: return 0;
case 194: return 0;
case 195: return 0;
case 196: return 0;
case 197: return 0;
case 198: return 0;
case 199: return 0;
case 200: return 0;
case 201: return 0;
case 202: return 0;
case 203: return 0;
case 204: return 0;
case 205: return 0;
case 206: return 0;
case 207: return 0;
case 208: return 0;
case 209: return 0;
case 210: return 0;
case 211: return 0;
case 212: return 0;
case 213: return 0;
case 214: return 0;
case 215: return 0;
case 216: return 0;
case 217: return 0;
case 218: return 0;
case 219: return 0;
case 220: return 0;
case 221: return 0;
case 222: return 0;
case 223: return 0;
case 224: return 0;
case 225: return 0;
case 226: return 0;
case 227: return 0;
case 228: return 0;
case 229: return 0;
case 230: return 0;
case 231: return 0;
case 232: return 0;
case 233: return 0;
case 234: return 0;
case 235: return 0;
case 236: return 0;
case 237: return 0;
case 238: return 0;
case 239: return 0;
case 240: return 0;
case 241: return 0;
case 242: return 0;
case 243: return 0;
case 244: return 0;
case 245: return 0;
case 246: return 0;
case 247: return 0;
case 248: return 0;
case 249: return 0;
case 250: return 0;
case 251: return 0;
case 252: return 0;
case 253: return 0;
case 254: return 0;
case 255: return 0;
case 256: return 0;
case 257: return 0;
case 258: return 0;
case 259: return 0;
case 260: return 0;
case 261: return 0;
case 262: return 0;
case 263: return 0;
case 264: return 0;
case 265: return 0;
case 266: return 0;
case 267: return 0;
case 268: return 0;
case 269: return 0;
case 270: return 0;
case 271: return 0;
case 272: return 0;
case 273: return 0;
case 274: return 0;
case 275: return 0;
case 276: return 0;
case 277: return 0;
case 278: return 0;
case 279: return 0;
case 280: return 0;
case 281: return 0;
case 282: return 0;
case 283: return 0;
case 284: return 0;
case 285: return 0;
case 286: return 0;
case 287: return 0;
case 288: return 0;
case 289: return 0;
case 290: return 0;
case 291: return 0;
case 292: return 0;
case 293: return 0;
case 294: return 0;
case 295: return 0;
case 296: return 0;
case 297: return 0;
case 298: return 0;
case 299: return 0;
case 300: return 0;
case 301: return 0;
case 302: return 0;
case 303: return 0;
case 304: return 0;
case 305: return 0;
case 306: return 0;
case 307: return 0;
case 308: return 0;
case 309: return 0;
case 310: return 0;
case 311: return 0;
case 312: return 0;
case 313: return 0;
case 314: return 0;
case 315: return 0;
case 316: return 0;
case 317: return 0;
case 318: return 0;
case 319: return 0;
case 320: return 0;
case 321: return 0;
case 322: return 0;
case 323: return 0;
case 324: return 0;
case 325: return 0;
case 326: return 0;
case 327: return 0;
case 328: return 0;
case 329: return 0;
case 330: return 0;
case 331: return 0;
case 332: return 0;
case 333: return 0;
case 334: return 0;
case 335: return 0;
case 336: return 0;
case 337: return 0;
case 338: return 0;
case 339: return 0;
case 340: return 0;
case 341: return 0;
case 342: return 0;
case 343: return 0;
case 344: return 0;
case 345: return 0;
case 346: return 0;
case 347: return 0;
case 348: return 0;
case 349: return 0;
case 350: return 0;
case 351: return 0;
case 352: return 0;
case 353: return 0;
case 354: return 0;
case 355: return 0;
case 356: return 0;
case 357: return 0;
case 358: return 0;
case 359: return 0;
case 360: return 0;
case 361: return 0;
case 362: return 0;
case 363: return 0;
case 364: return 0;
case 365: return 0;
case 366: return 0;
case 367: return 0;
case 368: return 0;
case 369: return 0;
case 370: return 0;
case 371: return 0;
case 372: return 0;
case 373: return 0;
case 374: return 0;
case 375: return 0;
case 376: return 0;
case 377: return 0;
case 378: return 0;
case 379: return 0;
case 380: return 0;
case 381: return 0;
case 382: return 0;
case 383: return 0;
case 384: return 0;
case 385: return 0;
case 386: return 0;
case 387: return 0;
case 388: return 0;
case 389: return 0;
case 390: return 0;
case 391: return 0;
case 392: return 0;
case 393: return 0;
case 394: return 0;
case 395: return 0;
case 396: return 0;
case 397: return 0;
case 398: return 0;
case 399: return 0;
case 400: return 0;
case 401: return 0;
case 402: return 0;
case 403: return 0;
case 404: return 0;
case 405: return 0;
case 406: return 0;
case 407: return 0;
case 408: return 0;
case 409: return 0;
case 410: return 0;
case 411: return 0;
case 412: return 0;
case 413: return 0;
case 414: return 0;
case 415: return 0;
case 416: return 0;
case 417: return 0;
case 418: return 0;
case 419: return 0;
case 420: return 0;
case 421: return 0;
case 422: return 0;
case 423: return 0;
case 424: return 0;
case 425: return 0;
case 426: return 0;
case 427: return 0;
case 428: return 0;
case 429: return 0;
case 430: return 0;
case 431: return 0;
case 432: return 0;
case 433: return 0;
case 434: return 0;
case 435: return 0;
case 436: return 0;
case 437: return 0;
case 438: return 0;
case 439: return 0;
case 440: return 0;
case 441: return 0;
case 442: return 0;
case 443: return 0;
case 444: return 0;
case 445: return 0;
case 446: return 0;
case 447: return 0;
case 448: return 0;
case 449: return 0;
case 450: return 0;
case 451: return 0;
case 452: return 0;
case 453: return 0;
case 454: return 0;
case 455: return 0;
case 456: return 0;
case 457: return 0;
case 458: return 0;
case 459: return 0;
case 460: return 0;
case 461: return 0;
case 462: return 0;
case 463: return 0;
case 464: return 0;
} return -1; }

public boolean[] userFunctionReference(int id) {
switch(id) {
case 1: return new boolean[]{false,false};
case 2: return new boolean[]{false,false};
case 3: return new boolean[]{false,false,false,false,false,false,false};
case 4: return new boolean[]{false,false,false};
case 5: return new boolean[]{false,false,false};
case 6: return new boolean[]{false,false,false,false};
case 7: return new boolean[]{false,false,false,false};
case 8: return new boolean[]{false,false};
case 9: return new boolean[]{false,false};
case 10: return new boolean[]{false};
case 11: return new boolean[]{false};
case 12: return new boolean[]{false};
case 13: return new boolean[]{false};
case 14: return new boolean[]{false};
case 15: return new boolean[]{false};
case 16: return new boolean[]{false};
case 17: return new boolean[]{false};
case 18: return new boolean[]{};
case 19: return new boolean[]{};
case 20: return new boolean[]{};
case 21: return new boolean[]{};
case 22: return new boolean[]{};
case 23: return new boolean[]{};
case 24: return new boolean[]{};
case 25: return new boolean[]{};
case 26: return new boolean[]{};
case 27: return new boolean[]{};
case 28: return new boolean[]{};
case 29: return new boolean[]{};
case 30: return new boolean[]{};
case 31: return new boolean[]{};
case 32: return new boolean[]{};
case 33: return new boolean[]{};
case 34: return new boolean[]{};
case 35: return new boolean[]{};
case 36: return new boolean[]{};
case 37: return new boolean[]{};
case 38: return new boolean[]{};
case 39: return new boolean[]{};
case 40: return new boolean[]{};
case 41: return new boolean[]{};
case 42: return new boolean[]{};
case 43: return new boolean[]{};
case 44: return new boolean[]{};
case 45: return new boolean[]{};
case 46: return new boolean[]{};
case 47: return new boolean[]{};
case 48: return new boolean[]{};
case 49: return new boolean[]{};
case 50: return new boolean[]{};
case 51: return new boolean[]{};
case 52: return new boolean[]{};
case 53: return new boolean[]{};
case 54: return new boolean[]{};
case 55: return new boolean[]{};
case 56: return new boolean[]{};
case 57: return new boolean[]{};
case 58: return new boolean[]{};
case 59: return new boolean[]{};
case 60: return new boolean[]{};
case 61: return new boolean[]{};
case 62: return new boolean[]{};
case 63: return new boolean[]{};
case 64: return new boolean[]{};
case 65: return new boolean[]{};
case 66: return new boolean[]{};
case 67: return new boolean[]{};
case 68: return new boolean[]{};
case 69: return new boolean[]{};
case 70: return new boolean[]{};
case 71: return new boolean[]{};
case 72: return new boolean[]{};
case 73: return new boolean[]{};
case 74: return new boolean[]{};
case 75: return new boolean[]{};
case 76: return new boolean[]{};
case 77: return new boolean[]{};
case 78: return new boolean[]{};
case 79: return new boolean[]{};
case 80: return new boolean[]{};
case 81: return new boolean[]{};
case 82: return new boolean[]{false};
case 83: return new boolean[]{false};
case 84: return new boolean[]{false};
case 85: return new boolean[]{false};
case 86: return new boolean[]{};
case 87: return new boolean[]{};
case 88: return new boolean[]{};
case 89: return new boolean[]{};
case 90: return new boolean[]{};
case 91: return new boolean[]{};
case 92: return new boolean[]{};
case 93: return new boolean[]{};
case 94: return new boolean[]{};
case 95: return new boolean[]{};
case 96: return new boolean[]{};
case 97: return new boolean[]{};
case 98: return new boolean[]{};
case 99: return new boolean[]{};
case 100: return new boolean[]{};
case 101: return new boolean[]{};
case 102: return new boolean[]{};
case 103: return new boolean[]{};
case 104: return new boolean[]{};
case 105: return new boolean[]{};
case 106: return new boolean[]{};
case 107: return new boolean[]{};
case 108: return new boolean[]{};
case 109: return new boolean[]{};
case 110: return new boolean[]{};
case 111: return new boolean[]{};
case 112: return new boolean[]{};
case 113: return new boolean[]{};
case 114: return new boolean[]{};
case 115: return new boolean[]{};
case 116: return new boolean[]{};
case 117: return new boolean[]{};
case 118: return new boolean[]{};
case 119: return new boolean[]{};
case 120: return new boolean[]{};
case 121: return new boolean[]{};
case 122: return new boolean[]{};
case 123: return new boolean[]{};
case 124: return new boolean[]{};
case 125: return new boolean[]{};
case 126: return new boolean[]{};
case 127: return new boolean[]{};
case 128: return new boolean[]{};
case 129: return new boolean[]{};
case 130: return new boolean[]{};
case 131: return new boolean[]{};
case 132: return new boolean[]{};
case 133: return new boolean[]{};
case 134: return new boolean[]{};
case 135: return new boolean[]{};
case 136: return new boolean[]{};
case 137: return new boolean[]{};
case 138: return new boolean[]{};
case 139: return new boolean[]{};
case 140: return new boolean[]{};
case 141: return new boolean[]{};
case 142: return new boolean[]{};
case 143: return new boolean[]{};
case 144: return new boolean[]{};
case 145: return new boolean[]{};
case 146: return new boolean[]{};
case 147: return new boolean[]{};
case 148: return new boolean[]{};
case 149: return new boolean[]{};
case 150: return new boolean[]{};
case 151: return new boolean[]{};
case 152: return new boolean[]{};
case 153: return new boolean[]{};
case 154: return new boolean[]{};
case 155: return new boolean[]{};
case 156: return new boolean[]{};
case 157: return new boolean[]{};
case 158: return new boolean[]{};
case 159: return new boolean[]{};
case 160: return new boolean[]{};
case 161: return new boolean[]{};
case 162: return new boolean[]{};
case 163: return new boolean[]{};
case 164: return new boolean[]{};
case 165: return new boolean[]{};
case 166: return new boolean[]{};
case 167: return new boolean[]{};
case 168: return new boolean[]{};
case 169: return new boolean[]{};
case 170: return new boolean[]{};
case 171: return new boolean[]{};
case 172: return new boolean[]{};
case 173: return new boolean[]{};
case 174: return new boolean[]{};
case 175: return new boolean[]{};
case 176: return new boolean[]{};
case 177: return new boolean[]{};
case 178: return new boolean[]{};
case 179: return new boolean[]{};
case 180: return new boolean[]{};
case 181: return new boolean[]{};
case 182: return new boolean[]{};
case 183: return new boolean[]{};
case 184: return new boolean[]{};
case 185: return new boolean[]{};
case 186: return new boolean[]{};
case 187: return new boolean[]{};
case 188: return new boolean[]{};
case 189: return new boolean[]{};
case 190: return new boolean[]{};
case 191: return new boolean[]{};
case 192: return new boolean[]{};
case 193: return new boolean[]{};
case 194: return new boolean[]{};
case 195: return new boolean[]{};
case 196: return new boolean[]{};
case 197: return new boolean[]{};
case 198: return new boolean[]{};
case 199: return new boolean[]{};
case 200: return new boolean[]{};
case 201: return new boolean[]{};
case 202: return new boolean[]{};
case 203: return new boolean[]{};
case 204: return new boolean[]{};
case 205: return new boolean[]{};
case 206: return new boolean[]{};
case 207: return new boolean[]{};
case 208: return new boolean[]{};
case 209: return new boolean[]{};
case 210: return new boolean[]{};
case 211: return new boolean[]{};
case 212: return new boolean[]{};
case 213: return new boolean[]{};
case 214: return new boolean[]{};
case 215: return new boolean[]{};
case 216: return new boolean[]{};
case 217: return new boolean[]{};
case 218: return new boolean[]{};
case 219: return new boolean[]{};
case 220: return new boolean[]{};
case 221: return new boolean[]{};
case 222: return new boolean[]{};
case 223: return new boolean[]{};
case 224: return new boolean[]{};
case 225: return new boolean[]{};
case 226: return new boolean[]{};
case 227: return new boolean[]{};
case 228: return new boolean[]{};
case 229: return new boolean[]{};
case 230: return new boolean[]{};
case 231: return new boolean[]{};
case 232: return new boolean[]{};
case 233: return new boolean[]{};
case 234: return new boolean[]{};
case 235: return new boolean[]{};
case 236: return new boolean[]{};
case 237: return new boolean[]{};
case 238: return new boolean[]{};
case 239: return new boolean[]{};
case 240: return new boolean[]{};
case 241: return new boolean[]{};
case 242: return new boolean[]{};
case 243: return new boolean[]{};
case 244: return new boolean[]{};
case 245: return new boolean[]{};
case 246: return new boolean[]{};
case 247: return new boolean[]{};
case 248: return new boolean[]{};
case 249: return new boolean[]{};
case 250: return new boolean[]{};
case 251: return new boolean[]{};
case 252: return new boolean[]{};
case 253: return new boolean[]{};
case 254: return new boolean[]{};
case 255: return new boolean[]{};
case 256: return new boolean[]{};
case 257: return new boolean[]{};
case 258: return new boolean[]{};
case 259: return new boolean[]{};
case 260: return new boolean[]{};
case 261: return new boolean[]{};
case 262: return new boolean[]{};
case 263: return new boolean[]{};
case 264: return new boolean[]{};
case 265: return new boolean[]{};
case 266: return new boolean[]{};
case 267: return new boolean[]{};
case 268: return new boolean[]{};
case 269: return new boolean[]{};
case 270: return new boolean[]{};
case 271: return new boolean[]{};
case 272: return new boolean[]{};
case 273: return new boolean[]{};
case 274: return new boolean[]{};
case 275: return new boolean[]{};
case 276: return new boolean[]{};
case 277: return new boolean[]{};
case 278: return new boolean[]{};
case 279: return new boolean[]{};
case 280: return new boolean[]{};
case 281: return new boolean[]{};
case 282: return new boolean[]{};
case 283: return new boolean[]{};
case 284: return new boolean[]{};
case 285: return new boolean[]{};
case 286: return new boolean[]{};
case 287: return new boolean[]{};
case 288: return new boolean[]{};
case 289: return new boolean[]{};
case 290: return new boolean[]{};
case 291: return new boolean[]{};
case 292: return new boolean[]{};
case 293: return new boolean[]{};
case 294: return new boolean[]{};
case 295: return new boolean[]{};
case 296: return new boolean[]{};
case 297: return new boolean[]{};
case 298: return new boolean[]{};
case 299: return new boolean[]{};
case 300: return new boolean[]{};
case 301: return new boolean[]{};
case 302: return new boolean[]{};
case 303: return new boolean[]{};
case 304: return new boolean[]{};
case 305: return new boolean[]{};
case 306: return new boolean[]{};
case 307: return new boolean[]{};
case 308: return new boolean[]{};
case 309: return new boolean[]{};
case 310: return new boolean[]{};
case 311: return new boolean[]{};
case 312: return new boolean[]{};
case 313: return new boolean[]{};
case 314: return new boolean[]{};
case 315: return new boolean[]{};
case 316: return new boolean[]{};
case 317: return new boolean[]{};
case 318: return new boolean[]{};
case 319: return new boolean[]{};
case 320: return new boolean[]{};
case 321: return new boolean[]{};
case 322: return new boolean[]{};
case 323: return new boolean[]{};
case 324: return new boolean[]{};
case 325: return new boolean[]{};
case 326: return new boolean[]{};
case 327: return new boolean[]{};
case 328: return new boolean[]{};
case 329: return new boolean[]{};
case 330: return new boolean[]{};
case 331: return new boolean[]{};
case 332: return new boolean[]{};
case 333: return new boolean[]{};
case 334: return new boolean[]{};
case 335: return new boolean[]{};
case 336: return new boolean[]{};
case 337: return new boolean[]{};
case 338: return new boolean[]{};
case 339: return new boolean[]{};
case 340: return new boolean[]{};
case 341: return new boolean[]{};
case 342: return new boolean[]{};
case 343: return new boolean[]{};
case 344: return new boolean[]{};
case 345: return new boolean[]{};
case 346: return new boolean[]{};
case 347: return new boolean[]{};
case 348: return new boolean[]{};
case 349: return new boolean[]{};
case 350: return new boolean[]{};
case 351: return new boolean[]{};
case 352: return new boolean[]{};
case 353: return new boolean[]{};
case 354: return new boolean[]{};
case 355: return new boolean[]{};
case 356: return new boolean[]{};
case 357: return new boolean[]{};
case 358: return new boolean[]{};
case 359: return new boolean[]{};
case 360: return new boolean[]{};
case 361: return new boolean[]{};
case 362: return new boolean[]{};
case 363: return new boolean[]{};
case 364: return new boolean[]{};
case 365: return new boolean[]{};
case 366: return new boolean[]{};
case 367: return new boolean[]{};
case 368: return new boolean[]{};
case 369: return new boolean[]{};
case 370: return new boolean[]{};
case 371: return new boolean[]{};
case 372: return new boolean[]{};
case 373: return new boolean[]{};
case 374: return new boolean[]{};
case 375: return new boolean[]{};
case 376: return new boolean[]{};
case 377: return new boolean[]{};
case 378: return new boolean[]{};
case 379: return new boolean[]{};
case 380: return new boolean[]{};
case 381: return new boolean[]{};
case 382: return new boolean[]{};
case 383: return new boolean[]{};
case 384: return new boolean[]{};
case 385: return new boolean[]{};
case 386: return new boolean[]{};
case 387: return new boolean[]{};
case 388: return new boolean[]{};
case 389: return new boolean[]{};
case 390: return new boolean[]{};
case 391: return new boolean[]{};
case 392: return new boolean[]{};
case 393: return new boolean[]{};
case 394: return new boolean[]{};
case 395: return new boolean[]{};
case 396: return new boolean[]{};
case 397: return new boolean[]{};
case 398: return new boolean[]{};
case 399: return new boolean[]{};
case 400: return new boolean[]{};
case 401: return new boolean[]{};
case 402: return new boolean[]{};
case 403: return new boolean[]{};
case 404: return new boolean[]{};
case 405: return new boolean[]{};
case 406: return new boolean[]{};
case 407: return new boolean[]{};
case 408: return new boolean[]{};
case 409: return new boolean[]{};
case 410: return new boolean[]{};
case 411: return new boolean[]{};
case 412: return new boolean[]{};
case 413: return new boolean[]{};
case 414: return new boolean[]{};
case 415: return new boolean[]{};
case 416: return new boolean[]{};
case 417: return new boolean[]{};
case 418: return new boolean[]{};
case 419: return new boolean[]{};
case 420: return new boolean[]{};
case 421: return new boolean[]{};
case 422: return new boolean[]{};
case 423: return new boolean[]{};
case 424: return new boolean[]{};
case 425: return new boolean[]{};
case 426: return new boolean[]{};
case 427: return new boolean[]{};
case 428: return new boolean[]{};
case 429: return new boolean[]{};
case 430: return new boolean[]{};
case 431: return new boolean[]{};
case 432: return new boolean[]{};
case 433: return new boolean[]{};
case 434: return new boolean[]{};
case 435: return new boolean[]{};
case 436: return new boolean[]{};
case 437: return new boolean[]{};
case 438: return new boolean[]{};
case 439: return new boolean[]{};
case 440: return new boolean[]{};
case 441: return new boolean[]{};
case 442: return new boolean[]{};
case 443: return new boolean[]{};
case 444: return new boolean[]{};
case 445: return new boolean[]{};
case 446: return new boolean[]{};
case 447: return new boolean[]{};
case 448: return new boolean[]{};
case 449: return new boolean[]{};
case 450: return new boolean[]{};
case 451: return new boolean[]{};
case 452: return new boolean[]{};
case 453: return new boolean[]{};
case 454: return new boolean[]{};
case 455: return new boolean[]{};
case 456: return new boolean[]{};
case 457: return new boolean[]{};
case 458: return new boolean[]{};
case 459: return new boolean[]{};
case 460: return new boolean[]{};
case 461: return new boolean[]{};
case 462: return new boolean[]{};
case 463: return new boolean[]{};
case 464: return new boolean[]{};
} return null; }

public Object userFunctionExecute(int id, Object[] value) throws LeekRunException {
switch(id) {
case 1: return f_getAccessible(value[0],value[1]);
case 2: return f_isOnDiagonal(value[0],value[1]);
case 3: return f_canUseFromCellOnCell(value[0],value[1],value[2],value[3],value[4],value[5],value[6]);
case 4: return f_aPorteeWeapon(value[0],value[1],value[2]);
case 5: return f_aPorteeChip(value[0],value[1],value[2]);
case 6: return f_peutEtreAPorteeWeapon(value[0],value[1],value[2],value[3]);
case 7: return f_peutEtreAPorteeChip(value[0],value[1],value[2],value[3]);
case 8: return f_aRisque(value[0],value[1]);
case 9: return f_fuite(value[0],value[1]);
case 10: return f_maxDamageAllW(value[0]);
case 11: return f_maxDamageAllWMe(value[0]);
case 12: return f_maxDamageW(value[0]);
case 13: return f_maxDamageWMe(value[0]);
case 14: return f_maxDamageC(value[0]);
case 15: return f_maxDamageCMe(value[0]);
case 16: return f_getPoison(value[0]);
case 17: return f_getAbsoluteVulnerability(value[0]);
case 18: return f_t1();
case 19: return f_t2();
case 20: return f_t3();
case 21: return f_t4();
case 22: return f_t5();
case 23: return f_t6();
case 24: return f_t7();
case 25: return f_t8();
case 26: return f_t9();
case 27: return f_t10();
case 28: return f_t11();
case 29: return f_t12();
case 30: return f_t13();
case 31: return f_t14();
case 32: return f_t15();
case 33: return f_t16();
case 34: return f_t17();
case 35: return f_t18();
case 36: return f_t19();
case 37: return f_t20();
case 38: return f_t21();
case 39: return f_t22();
case 40: return f_t23();
case 41: return f_t24();
case 42: return f_t25();
case 43: return f_t26();
case 44: return f_t27();
case 45: return f_t28();
case 46: return f_t29();
case 47: return f_t30();
case 48: return f_t31();
case 49: return f_t32();
case 50: return f_t33();
case 51: return f_t34();
case 52: return f_t35();
case 53: return f_t36();
case 54: return f_t37();
case 55: return f_t38();
case 56: return f_t39();
case 57: return f_t40();
case 58: return f_t41();
case 59: return f_t42();
case 60: return f_t43();
case 61: return f_t44();
case 62: return f_t45();
case 63: return f_t46();
case 64: return f_t47();
case 65: return f_t48();
case 66: return f_t49();
case 67: return f_t50();
case 68: return f_t51();
case 69: return f_t52();
case 70: return f_t53();
case 71: return f_t54();
case 72: return f_t55();
case 73: return f_t56();
case 74: return f_t57();
case 75: return f_t58();
case 76: return f_t59();
case 77: return f_t60();
case 78: return f_t61();
case 79: return f_t62();
case 80: return f_t63();
case 81: return f_t64();
case 82: return f_isLeekAlly(value[0]);
case 83: return f_isLeekEnemy(value[0]);
case 84: return f_isBulbAlly(value[0]);
case 85: return f_isBulbEnemy(value[0]);
case 86: return f_t65();
case 87: return f_t66();
case 88: return f_t67();
case 89: return f_t68();
case 90: return f_t69();
case 91: return f_t70();
case 92: return f_t71();
case 93: return f_t72();
case 94: return f_t73();
case 95: return f_t74();
case 96: return f_t75();
case 97: return f_t76();
case 98: return f_t77();
case 99: return f_t78();
case 100: return f_t79();
case 101: return f_t80();
case 102: return f_t81();
case 103: return f_t82();
case 104: return f_t83();
case 105: return f_t84();
case 106: return f_t85();
case 107: return f_t86();
case 108: return f_t87();
case 109: return f_t88();
case 110: return f_t89();
case 111: return f_t90();
case 112: return f_t91();
case 113: return f_t92();
case 114: return f_t93();
case 115: return f_t94();
case 116: return f_t95();
case 117: return f_t96();
case 118: return f_t97();
case 119: return f_t98();
case 120: return f_t99();
case 121: return f_t100();
case 122: return f_t101();
case 123: return f_t102();
case 124: return f_t103();
case 125: return f_t104();
case 126: return f_t105();
case 127: return f_t106();
case 128: return f_t107();
case 129: return f_t108();
case 130: return f_t109();
case 131: return f_t110();
case 132: return f_t111();
case 133: return f_t112();
case 134: return f_t113();
case 135: return f_t114();
case 136: return f_t115();
case 137: return f_t116();
case 138: return f_t117();
case 139: return f_t118();
case 140: return f_t119();
case 141: return f_t120();
case 142: return f_t121();
case 143: return f_t122();
case 144: return f_t123();
case 145: return f_t124();
case 146: return f_t125();
case 147: return f_t126();
case 148: return f_t127();
case 149: return f_t128();
case 150: return f_t129();
case 151: return f_t130();
case 152: return f_t131();
case 153: return f_t132();
case 154: return f_t133();
case 155: return f_t134();
case 156: return f_t135();
case 157: return f_t136();
case 158: return f_t137();
case 159: return f_t138();
case 160: return f_t139();
case 161: return f_t140();
case 162: return f_t141();
case 163: return f_t142();
case 164: return f_t143();
case 165: return f_t144();
case 166: return f_t145();
case 167: return f_t146();
case 168: return f_t147();
case 169: return f_t148();
case 170: return f_t149();
case 171: return f_t150();
case 172: return f_t151();
case 173: return f_t152();
case 174: return f_t153();
case 175: return f_t154();
case 176: return f_t155();
case 177: return f_t156();
case 178: return f_t157();
case 179: return f_t158();
case 180: return f_t159();
case 181: return f_t160();
case 182: return f_t161();
case 183: return f_t162();
case 184: return f_t163();
case 185: return f_t164();
case 186: return f_t165();
case 187: return f_t166();
case 188: return f_t167();
case 189: return f_t168();
case 190: return f_t169();
case 191: return f_t170();
case 192: return f_t171();
case 193: return f_t172();
case 194: return f_usePBulbe();
case 195: return f_useIBulbe();
case 196: return f_useRBulbe();
case 197: return f_useHBulbe();
case 198: return f_iaChetif();
case 199: return f_iaGlace();
case 200: return f_iaRock();
case 201: return f_iaHealer();
case 202: return f_a0();
case 203: return f_a1();
case 204: return f_a2();
case 205: return f_a3();
case 206: return f_a4();
case 207: return f_a5();
case 208: return f_a6();
case 209: return f_a7();
case 210: return f_a8();
case 211: return f_a9();
case 212: return f_a10();
case 213: return f_a11();
case 214: return f_a12();
case 215: return f_a13();
case 216: return f_a14();
case 217: return f_a15();
case 218: return f_a16();
case 219: return f_a17();
case 220: return f_a18();
case 221: return f_a19();
case 222: return f_a20();
case 223: return f_a21();
case 224: return f_a22();
case 225: return f_a23();
case 226: return f_a24();
case 227: return f_a25();
case 228: return f_a26();
case 229: return f_a27();
case 230: return f_a28();
case 231: return f_a29();
case 232: return f_a30();
case 233: return f_a31();
case 234: return f_a32();
case 235: return f_a33();
case 236: return f_a34();
case 237: return f_a35();
case 238: return f_a36();
case 239: return f_a37();
case 240: return f_a38();
case 241: return f_a39();
case 242: return f_a40();
case 243: return f_a41();
case 244: return f_a42();
case 245: return f_a43();
case 246: return f_a44();
case 247: return f_a45();
case 248: return f_a46();
case 249: return f_a47();
case 250: return f_a48();
case 251: return f_a49();
case 252: return f_a50();
case 253: return f_a51();
case 254: return f_a52();
case 255: return f_a53();
case 256: return f_a54();
case 257: return f_a55();
case 258: return f_a56();
case 259: return f_a57();
case 260: return f_a58();
case 261: return f_a59();
case 262: return f_a60();
case 263: return f_a61();
case 264: return f_a62();
case 265: return f_a63();
case 266: return f_a64();
case 267: return f_a65();
case 268: return f_a66();
case 269: return f_a67();
case 270: return f_a68();
case 271: return f_a69();
case 272: return f_a70();
case 273: return f_a71();
case 274: return f_a72();
case 275: return f_a73();
case 276: return f_a74();
case 277: return f_a75();
case 278: return f_a76();
case 279: return f_a77();
case 280: return f_a78();
case 281: return f_a79();
case 282: return f_a80();
case 283: return f_a81();
case 284: return f_a82();
case 285: return f_a83();
case 286: return f_a84();
case 287: return f_a85();
case 288: return f_a86();
case 289: return f_a87();
case 290: return f_a88();
case 291: return f_a89();
case 292: return f_a90();
case 293: return f_a91();
case 294: return f_a92();
case 295: return f_a93();
case 296: return f_a94();
case 297: return f_a95();
case 298: return f_a96();
case 299: return f_a97();
case 300: return f_a98();
case 301: return f_a99();
case 302: return f_a100();
case 303: return f_a101();
case 304: return f_a102();
case 305: return f_a103();
case 306: return f_a104();
case 307: return f_a105();
case 308: return f_a106();
case 309: return f_a107();
case 310: return f_a108();
case 311: return f_a109();
case 312: return f_a110();
case 313: return f_a111();
case 314: return f_a112();
case 315: return f_a113();
case 316: return f_a114();
case 317: return f_a115();
case 318: return f_a116();
case 319: return f_a117();
case 320: return f_a118();
case 321: return f_a119();
case 322: return f_a120();
case 323: return f_a121();
case 324: return f_a122();
case 325: return f_a123();
case 326: return f_a124();
case 327: return f_a125();
case 328: return f_a126();
case 329: return f_a127();
case 330: return f_a128();
case 331: return f_a129();
case 332: return f_a130();
case 333: return f_a131();
case 334: return f_a132();
case 335: return f_a133();
case 336: return f_a134();
case 337: return f_a135();
case 338: return f_a136();
case 339: return f_a137();
case 340: return f_a138();
case 341: return f_a139();
case 342: return f_a140();
case 343: return f_a141();
case 344: return f_a142();
case 345: return f_a143();
case 346: return f_a144();
case 347: return f_a145();
case 348: return f_a146();
case 349: return f_a147();
case 350: return f_a148();
case 351: return f_a149();
case 352: return f_a150();
case 353: return f_a151();
case 354: return f_a152();
case 355: return f_a153();
case 356: return f_a154();
case 357: return f_a155();
case 358: return f_a156();
case 359: return f_a157();
case 360: return f_a158();
case 361: return f_a159();
case 362: return f_a160();
case 363: return f_a161();
case 364: return f_a162();
case 365: return f_a163();
case 366: return f_a164();
case 367: return f_a165();
case 368: return f_a166();
case 369: return f_a167();
case 370: return f_a168();
case 371: return f_a169();
case 372: return f_a170();
case 373: return f_a171();
case 374: return f_a172();
case 375: return f_a173();
case 376: return f_a174();
case 377: return f_a175();
case 378: return f_a176();
case 379: return f_a177();
case 380: return f_a178();
case 381: return f_a179();
case 382: return f_a180();
case 383: return f_a181();
case 384: return f_a182();
case 385: return f_a183();
case 386: return f_a184();
case 387: return f_a185();
case 388: return f_a186();
case 389: return f_a187();
case 390: return f_a188();
case 391: return f_a189();
case 392: return f_a190();
case 393: return f_a191();
case 394: return f_a192();
case 395: return f_a193();
case 396: return f_a194();
case 397: return f_a195();
case 398: return f_a196();
case 399: return f_a197();
case 400: return f_a198();
case 401: return f_a199();
case 402: return f_a200();
case 403: return f_a201();
case 404: return f_a202();
case 405: return f_a203();
case 406: return f_a204();
case 407: return f_a205();
case 408: return f_a206();
case 409: return f_a207();
case 410: return f_a208();
case 411: return f_a209();
case 412: return f_a210();
case 413: return f_a211();
case 414: return f_a212();
case 415: return f_a213();
case 416: return f_a214();
case 417: return f_a215();
case 418: return f_a216();
case 419: return f_a217();
case 420: return f_a218();
case 421: return f_a219();
case 422: return f_a220();
case 423: return f_a221();
case 424: return f_a222();
case 425: return f_a223();
case 426: return f_a224();
case 427: return f_a225();
case 428: return f_a226();
case 429: return f_a227();
case 430: return f_a228();
case 431: return f_a229();
case 432: return f_a230();
case 433: return f_a231();
case 434: return f_a232();
case 435: return f_a233();
case 436: return f_a234();
case 437: return f_a235();
case 438: return f_a236();
case 439: return f_a237();
case 440: return f_a238();
case 441: return f_a239();
case 442: return f_a240();
case 443: return f_a241();
case 444: return f_a242();
case 445: return f_a243();
case 446: return f_a244();
case 447: return f_a245();
case 448: return f_a246();
case 449: return f_a247();
case 450: return f_a248();
case 451: return f_a249();
case 452: return f_a250();
case 453: return f_a251();
case 454: return f_a252();
case 455: return f_a253();
case 456: return f_a254();
case 457: return f_a255();
case 458: return f_a256();
case 459: return f_a257();
case 460: return f_a258();
case 461: return f_a259();
case 462: return f_a260();
case 463: return f_a261();
case 464: return f_a262();
} return null; }
}
