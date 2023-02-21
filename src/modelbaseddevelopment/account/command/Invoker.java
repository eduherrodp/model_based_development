package modelbaseddevelopment.account.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private final List<Operacion> operaciones = new ArrayList<>();

    public void recibirOperacion(Operacion operacion) {
        operaciones.add(operacion);
    }

    public void realizarOperaciones() {
        this.operaciones.forEach(Operacion::execute);
        operaciones.clear();
    }
}
