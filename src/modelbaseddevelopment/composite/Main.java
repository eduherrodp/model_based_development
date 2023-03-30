package modelbaseddevelopment.composite;

public class Main {
    public static void main(String[] args) {
        /*
        // 2 + 3 = 5
        Arithmetic arithmetic = new Addition(2, 3);
        System.out.println(arithmetic.compute());
        // 2 * 3 = 6
        Arithmetic arithmetic1 = new Multiplication(2, 3);
        System.out.println(arithmetic1.compute());
        // 6 / 2 = 3
        Arithmetic arithmetic2 = new Division(6, 2);
        System.out.println(arithmetic2.compute());
        // 5 - 3 = 2
        Arithmetic arithmetic3 = new Subtraction(5, 3);
        System.out.println(arithmetic3.compute());*/

        Arithmetic arithmetic = new Multiplication(2, 3);
        arithmetic.append(new Addition(4, 5));
        arithmetic.append(new Subtraction(6, 7));
        arithmetic.append(new Division(8, 9));
        arithmetic.append(new Multiplication(10, 11));
        arithmetic.append(new Addition(12, 13));
        arithmetic.append(new Subtraction(14, 15));

        Arithmetic compositeAddition = new CompositeAddition();
        compositeAddition.append(new Addition(16, 17));
        compositeAddition.append(new Multiplication(18, 19));
        arithmetic.append(compositeAddition);

        System.out.println(arithmetic.compute());
    }
}
