package modelbaseddevelopment.account.command;

public class DepositarImpl implements Operacion {
    private Cuenta cuenta;
    private double monto;

    public DepositarImpl(Cuenta cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void execute() {
        cuenta.depositar(monto);
    }
}
