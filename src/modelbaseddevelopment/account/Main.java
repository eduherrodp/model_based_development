package modelbaseddevelopment.account;

import modelbaseddevelopment.account.command.*;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1, 1000);

        DepositarImpl depositar = new DepositarImpl(cuenta, 2300);
        RetirarImpl retirar = new RetirarImpl(cuenta, 100);

        Invoker ivk = new Invoker();
        ivk.recibirOperacion(depositar);
        ivk.recibirOperacion(retirar);

        ivk.realizarOperaciones();
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
