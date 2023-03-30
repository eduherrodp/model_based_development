package modelbaseddevelopment.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeAddition implements Arithmetic {
    private final List<Arithmetic> operations = new ArrayList<>();

    @Override
    public double compute() {
        return operations.stream().mapToDouble(Arithmetic::compute).sum();
    }

    @Override
    public void append(Arithmetic arithmetic) {
        operations.add(arithmetic);
    }

    @Override
    public void remove(Arithmetic arithmetic) {
        operations.remove(arithmetic);
    }
}
