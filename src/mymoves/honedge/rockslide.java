package mymoves.honedge;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;
import lab2.program;
public class rockslide extends PhysicalMove {
    public rockslide ( double power, double acc){
        super(Type.ROCK, power, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (program.chance(0.3)) {
            Effect.flinch(p);
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
