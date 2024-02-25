package mypoki;

import mymoves.dialga.aurasphere;
import mymoves.dialga.flashcannon;
import mymoves.dialga.powergem;
import mymoves.dialga.scaryface;
import mymoves.heliolisk.focusblast;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Dialga extends Pokemon {
    public Dialga (String name, int lvl){
        super(name, lvl);
        super.setType(Type.STEEL, Type.DRAGON);
        super.setStats(100,120,120,150,100,90);
        scaryface scaryface = new scaryface(0,100);
        aurasphere aurasphere = new aurasphere(80, 100);
        flashcannon flashcannon = new flashcannon(80,100);
        powergem powergem = new powergem(80,100);
        super.setMove(scaryface,aurasphere,flashcannon, powergem );
    }

}
