package mymoves;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;
public class sample_move extends PhysicalMove {
    public sample_move ( double power, double acc){
        super(Type.NORMAL, power, acc);

    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        // debuf enemy
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
