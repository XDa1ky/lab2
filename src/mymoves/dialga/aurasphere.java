package mymoves.dialga;

import ru.ifmo.se.pokemon.*;

public class aurasphere extends SpecialMove {
    int m = 2147483647;
    public aurasphere (double power, double acc){
        super(Type.FIGHTING, power , acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        // debuf enemy
        Effect e = new Effect().stat(Stat.EVASION, -m);
        p.addEffect(e);
    }
    //переопределение метода
    @Override
    // элемент доступен только для классов из того же пакета и подкласса s
    protected String describe(){
        return "does auraspere";
    }
}
