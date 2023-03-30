package modelbaseddevelopment.composite;

public interface Arithmetic {
    double compute();
    default void append(Arithmetic arithmetic){}
    default void remove(Arithmetic arithmetic){}
}