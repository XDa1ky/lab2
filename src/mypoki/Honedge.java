package mypoki;

import mymoves.honedge.rockslide;
import mymoves.honedge.swordsdance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Honedge extends Pokemon {
    public Honedge (String name, int lvl){
        super(name, lvl);
        super.setType(Type.STEEL, Type.GHOST);
        super.setStats(45,80,100,35,37,28);
        swordsdance swordsdance = new swordsdance(0,0);
        rockslide rockslide = new rockslide(75,90);
        super.setMove(swordsdance,rockslide);
    }
}
