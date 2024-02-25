package mymoves.aegislashblade;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;
import mypoki.Aegislashblade;

public class headsmash extends PhysicalMove {
    public headsmash(double power, double acc) {
        super(Type.ROCK, power, acc);


    }

@Override
     protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        // buff or debuff urself
        //Effect e = new Effect().stat(Stat.HP,);
    }

    @Override
    protected void applySelfDamage(Pokemon p, double damage) {
        super.applySelfDamage(p, damage / 2);


    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        // debuf enemy
    }

    //переопределение метода
    @Override


    // элемент доступен только для классов из того же пакета и подкласса s
    protected String describe() {
        return "does headsmash";
    }
}
