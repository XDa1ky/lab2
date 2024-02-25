package mypoki;

import mymoves.helioptile.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Helioptile extends Pokemon {
    public Helioptile (String name, int lvl){
        super(name,lvl);
        super.setType(Type.ELECTRIC, Type.NORMAL);
        super.setStats(44,38,33,61,43,70);
        doubleteam pound = new doubleteam(40,100);
        thunderbolt thunderbolt = new thunderbolt(90, 100);
        swagger swagger = new swagger(0, 85);


        super.setMove(pound,thunderbolt,swagger);
    }

}
