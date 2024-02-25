package mymoves.heliolisk;

import ru.ifmo.se.pokemon.*;
import lab2.program;
public class focusblast extends SpecialMove {
    public focusblast(double power, double acc){
        super(Type.FIGHTING, power, acc);

    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        // debuf enemy
        Effect e = new Effect().stat(Stat.DEFENSE, -1);
        if(program.chance(0.1)){
            p.addEffect(e);
        }
    }
    //переопределение метода
    @Override
    // элемент доступен только для классов из того же пакета и подкласса s
    protected String describe(){
        // class.pokemon.sample_move
        // "\\." split this string and restore into "class pokemon sample_move"
        return "does focusblast";
        //and we get only the last piece of the string. For example this is should be a "does sample_move"
    }
}
