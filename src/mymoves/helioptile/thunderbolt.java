package mymoves.helioptile;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import lab2.program;

public class thunderbolt extends SpecialMove {

    public thunderbolt (double power, double acc){
        super(Type.ELECTRIC, power, acc);

    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (program.chance(0.1)){
            Effect.paralyze(p);
            
        }
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
