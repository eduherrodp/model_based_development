package modelbaseddevelopment.adapter;

import modelbaseddevelopment.adapter.adapters.*;
import modelbaseddevelopment.adapter.ducks.*;
import modelbaseddevelopment.adapter.turkeys.*;

public class useTurkeyAdapter {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkey_in_disguise = new TurkeyAdapter(turkey);
        Turkey duck_in_disguise = new DuckAdapter(duck);

        System.out.println("The ducks.Duck says...");
        testDuck(duck);

        System.out.println("\nThe turkeys.Turkey adapter says...");
        testDuck(turkey_in_disguise);

        System.out.println("\nThe ducks.Duck adapter says...");
        testTurkey(duck_in_disguise);
    }

    public static <T extends Duck> void testDuck(T duck) {
        duck.quack();
        duck.fly();
    }

    public static <T extends Turkey> void testTurkey(T turkey) {
        turkey.gobble();
        turkey.fly();
    }
}