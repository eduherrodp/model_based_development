package modelbaseddevelopment.account.command;

public class RetirarImpl implements Operacion{
    private Cuenta cuenta;
    private double monto;

    public RetirarImpl(Cuenta cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void execute() {
        cuenta.retirar(monto);
    }
}
