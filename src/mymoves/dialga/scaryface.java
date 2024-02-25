package mymoves.dialga;

import ru.ifmo.se.pokemon.*;

public class scaryface extends StatusMove {
    public scaryface (double power, double acc){
        super(Type.NORMAL, power, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        // debuf enemy
        Effect e = new Effect().stat(Stat.SPEED, -2);
        p.addEffect(e);
    }
    //переопределение метода
    @Override
    // элемент доступен только для классов из того же пакета и подкласса s
    protected String describe(){
        // class.pokemon.sample_move
        // "\\." split this string and restore into "class pokemon sample_move"
        return "does scasryface" ;
        //and we get only the last piece of the string. For example this is should be a "does sample_move"
    }
}
