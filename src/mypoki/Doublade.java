package mypoki;

import mymoves.doublade.metalsound;
import ru.ifmo.se.pokemon.Type;

public class Doublade extends Honedge{
    public Doublade (String name, int lvl){
        super(name, lvl);
        super.setStats(59,110,150,45,49,35);
        metalsound metalsound = new metalsound(0, 85);
        super.addMove(metalsound);
    }
}
