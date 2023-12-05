import java.util.Scanner;

public class User {
    private String firstName;
    private String lastName;
    private long id;

    public User(String firstName, String lastName, long id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getId() {
        return id;
    }

    public static User getUserInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine().trim();

        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine().trim();

        System.out.println("Enter your ID:");
        long id = scanner.nextLong();
        scanner.nextLine();

        return new User(firstName, lastName, id);
    }
}