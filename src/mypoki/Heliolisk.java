package mypoki;

import mymoves.heliolisk.focusblast;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Heliolisk extends Helioptile {
    public Heliolisk (String name, int lvl){
        super(name, lvl);
        super.setType(Type.ELECTRIC,Type.NORMAL);
        super.setStats(62,55,52,109,94,109);
        focusblast focusblast = new focusblast(10,70);
        super.addMove(focusblast);
    }
}
