package modelbaseddevelopment.adapter;

public class DuckAdapter implements Turkey{
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
        duck.fly();
        System.out.println("A short distance");
    }
}
