package lab2;
import mypoki.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class program {
    public static void main(String[] args) {
        Battle b = new Battle();
        Heliolisk p1 = new Heliolisk("heliolisk",1);
        Helioptile p2 = new Helioptile("helioptile",1);
        Dialga p3 = new Dialga("dialga",1);
        Doublade p4 = new Doublade("doublade",1);
        Honedge p5 = new Honedge("honedge",1);
        Aegislashblade p6 = new Aegislashblade("aegislashblade",1);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        //team 1
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);
        // team 2
        b.go();
    }
    public static boolean chance (double d){
        return d > Math.random();
    }

}
