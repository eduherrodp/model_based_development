package modelbaseddevelopment.adapter.adapters;

import modelbaseddevelopment.adapter.ducks.Duck;
import modelbaseddevelopment.adapter.turkeys.Turkey;

public class DuckAdapter implements Turkey {
    Duck duck;
    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }
    @Override
    public void gobble() {
        duck.quack();
    }
    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
