package mypoki;

import mymoves.aegislashblade.headsmash;
import mymoves.doublade.metalsound;
import ru.ifmo.se.pokemon.Type;

public class Aegislashblade extends Doublade{
    public Aegislashblade (String name, int lvl){
        super(name, lvl);
        super.setStats(60,50,140,50,140,60);
        headsmash headsmash = new headsmash(150, 80);
        super.addMove(headsmash);

    }
}
