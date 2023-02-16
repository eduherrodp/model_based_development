package modelbaseddevelopment.singleton;

public class DatabaseConnection {
    // We need check that don't exist more than one thread tryng to create an instance
    private static DatabaseConnection instance = null;

    // We need to create a private constructor to avoid the creation of new instances
    private DatabaseConnection() {
        // We need to create a private constructor to avoid the creation of new instances
    }

    // We need to create a public method to get the instance of the class
public static DatabaseConnection getInstance() {
        // We need to check if the instance of the class is null
        if (instance == null) {
            // If the instance of the class is null, we create a new instance
            instance = new DatabaseConnection();
        }
        // If the instance of the class is not null delete it and create a new instance
        else {
            instance = null;
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // We need to create a method to get the database
    public void getDatabase() {
        System.out.println("Getting the database");
    }
}
