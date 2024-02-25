package mymoves.helioptile;

import ru.ifmo.se.pokemon.*;

public class doubleteam extends StatusMove {
    public doubleteam(double power, double acc){
        super(Type.NORMAL, power, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        // buff or debuff urself
        Effect e = new Effect().stat(Stat.EVASION, 1);
        p.addEffect(e);
    }
    //переопределение метода
    @Override
    // элемент доступен только для классов из того же пакета и подкласса s
    protected String describe(){
        // class.pokemon.sample_move
        // "\\." split this string and restore into "class pokemon sample_move"
        String[] pieces = this.getClass().toString().split("\\.");
        return "does "  + pieces[pieces.length - 1];
        //and we get only the last piece of the string. For example this is should be a "does sample_move"
    }
}
