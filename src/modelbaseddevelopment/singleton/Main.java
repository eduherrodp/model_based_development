package modelbaseddevelopment.singleton;

public class Main {
    // Simulation of singleton pattern:
    // create a simulation of a connection to a database where the object1
    // will be connected to the database and object2 will be disconnected

    public static void main(String[] args) {
        // We create the first object
        DatabaseConnection object1 = DatabaseConnection.getInstance();
        // We create the second object
        DatabaseConnection object2 = DatabaseConnection.getInstance();
        // We check if the two objects are the same
        if (object1 == object2) {
            System.out.println("The two objects are the same");
        } else {
            System.out.println("The two objects are different");
        }

        // We get the database
        object1.getDatabase();
        object2.getDatabase();

        // We get the hash code of the objects
        System.out.println("The hash code of the object1 is: " + object1.hashCode());
        System.out.println("The hash code of the object2 is: " + object2.hashCode());

        // Check if the instance of the class is the same
        if (object1.hashCode() == object2.hashCode()) {
            System.out.println("The two objects are the same");
        } else {
            // This will be printed because the hash code of the objects are different, so the object1 is disconnected and the object2 is connected
            System.out.println("The two objects are different");
        }

    }
}
