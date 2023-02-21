package modelbaseddevelopment.account.command;

public class Cuenta {
    private int id;
    private double saldo;

    public Cuenta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }
    public void retirar(double monto) {
        saldo -= monto;
        System.out.println("Retirando " + monto + " de la cuenta " + id);
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depositando " + monto + " a la cuenta " + id);
    }

    public double getSaldo() {
        return saldo;
    }
}
