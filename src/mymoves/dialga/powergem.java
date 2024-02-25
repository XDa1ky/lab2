package mymoves.dialga;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class powergem extends SpecialMove {
    public powergem (double power, double acc){
        super(Type.ROCK, power, acc);
    }
    @Override
    protected String describe(){
        return "does powergem";
    }
}
