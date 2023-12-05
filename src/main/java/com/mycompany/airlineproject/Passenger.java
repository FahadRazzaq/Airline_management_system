import java.util.Date;
import java.util.Scanner;

public class Passenger extends User {
    private String levelOfSeat;
    private int age;
    private Date date;
    private LevelOfSeat level;
    private int ticketId;
    private int[] ticketIds = new int[5];

    public Passenger(String firstName, String lastName, long id) {
        super(firstName, lastName, id);
        this.levelOfSeat = "";
        this.age = 0;
        this.date = new Date(); // Current date
        this.level = null;
        generateRandomTicketIds();
        this.ticketId = -1;
    }
        // Override the method in the Passenger class
        @Override
        public String getFirstName() {
            return "Passenger's first name: " + super.getFirstName();
        }
        @Override
        public String getLastName() {
            return "Passenger's Last name: " + super.getLastName();
        }
        
    private void generateRandomTicketIds() {
        for (int i = 0; i < 5; i++) {
            ticketIds[i] = generateRandomTicketId();
        }
    }

    public  void bookTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter passenger's first name:");
        String firstName = scanner.nextLine().trim();

        System.out.println("Enter passenger's last name:");
        String lastName = scanner.nextLine().trim();

        System.out.println("Enter passenger's ID:");
        long id = scanner.nextLong();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter passenger's age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        LevelOfSeat seatType = new LevelOfSeat();
        this.levelOfSeat = seatType.chooseSeatType();
        this.age = age; // Set passenger's age
        this.ticketId = generateRandomTicketId(); 

        System.out.println("Ticket booked for " + firstName + " " + lastName + " with ID: " + this.ticketId);
    }

    public int getTicketId() {
        return this.ticketId;
    }

    public void bookedTicket() {
        System.out.println("Passenger has a booked ticket with ID: " + this.ticketId);
    }

    public void cancelTicket(Scanner scanner) {
        System.out.println("Enter ticket number to cancel:");
        int ticketNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        boolean ticketFound = false;
        for (int i = 0; i < 5; i++) {
            if (ticketIds[i] == ticketNumber) {
                System.out.println("Cancelled ticket with ID: " + ticketNumber);
                ticketIds[i] = -1; // Invalidate the ticket ID
                ticketFound = true;
                break;
            }
        }

        if (!ticketFound) {
            System.out.println("Ticket not found.");
        }
    }

    public void updateTicket(Scanner scanner) {
        System.out.println("Enter ticket number to update:");
        int ticketNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        boolean ticketFound = false;
        for (int i = 0; i < 5; i++) {
            if (ticketIds[i] == ticketNumber) {
                // Logic to update ticket details
                System.out.println("Updated ticket with ID: " + ticketNumber);
                ticketFound = true;
                break;
            }
        }

        if (!ticketFound) {
            System.out.println("Ticket not found.");
        }
    }


    private int generateRandomTicketId() {
        return (int) (Math.random() * 100000); // Generates a random ticket ID
    }
}
