import java.util.Scanner;

public class Admin extends User {
    private String passwordA;
    private Flight[] flights;
    private int numberOfFlights;

    public Admin(String firstName, String lastName, long id) {
        super(firstName, lastName, id);
        this.passwordA = "admin";
        this.flights = new Flight[5]; // Entries of 5 flights
        this.numberOfFlights = 0;
    }

    
    public void addFlight(Scanner scanner) {
        if (numberOfFlights >= 5) {
            System.out.println("Maximum number of flights reached.");
            return;
            }
            
            System.out.println("Enter source Airport:");
            String sourceCode = scanner.nextLine();
            System.out.println("Enter country of departure:");
            String sourceCountry = scanner.nextLine();
            Airport sourceAirport = new Airport(sourceCode, "", sourceCountry);
        
            System.out.println("Enter destination Airport:");
            String destCode = scanner.nextLine();
            System.out.println("Enter country of arrival:");
            String destCountry = scanner.nextLine();
            Airport destAirport = new Airport(destCode, "", destCountry);
        
            System.out.println("Enter flight number:");
            int flightNumber = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            flights[numberOfFlights] = new Flight(null, sourceAirport, destAirport, false, flightNumber, flightNumber);
            numberOfFlights++;
            
            System.out.println("Flight added from " + sourceCode + " (" + sourceCountry + ") to " + destCode + " (" + destCountry + ")");
        }
    
    // Method to cancel a flight
    public void cancelFlight(Scanner scanner) {
        System.out.println("Enter the flight number you want to cancel:");
        int flightNumber = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character
    
        String flightNumberString = String.valueOf(flightNumber); // Convert int to String
    
        boolean found = false;
        for (int i = 0; i < numberOfFlights; i++) {
            if (flights[i] != null && flights[i].getFlightNumber().equals(flightNumberString)) {
                System.out.println("Cancelled flight: " + flightNumber);
                flights[i] = null;
                found = true;
                break;
            }
        }
    
        if (!found) {
            System.out.println("Flight with number " + flightNumber + " not found.");
        }
    }

    public void updateFlight(Scanner scanner) {
        System.out.println("Enter the flight number you want to update:");
        int flightNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
    
        String flightNumberString = String.valueOf(flightNumber); // Convert int to String
    
        for (int i = 0; i < numberOfFlights; i++) {
            if (flights[i] != null && flights[i].getFlightNumber().equals(flightNumberString)) {
                System.out.println("What attribute do you want to update?");
                System.out.println("1. Source Airport");
                System.out.println("2. Destination Airport");
                // Add more options for other attributes
                
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                
                switch (choice) {
                    case 1:
                        // Update source airport
                        // flights[i].setSourceAirport(/*new source airport*/);
                        break;
                    case 2:
                        // Update destination airport
                        // flights[i].setDestinationAirport(/*new destination airport*/);
                        break;
                    // Add cases for other attributes
                    default:
                        System.out.println("Invalid choice.");
                        return;
                }
                System.out.println("Flight updated: " + flights[i].getFlightNumber());
                return;
            }
        }
        System.out.println("Flight with number " + flightNumber + " not found.");
    }
    


    public void chooseEmployeeSchedule(Employee employee) {
        Scanner scanner = new Scanner(System.in);
    
        // Prompt user for employee's name
        System.out.print("Enter the employee's name: ");
        String employeeName = scanner.nextLine();
    
        // Prompt user for the new schedule number
        System.out.print("Enter the new schedule number: ");
        int newScheduleNumber = scanner.nextInt();
    
        // Update the employee's schedule
        employee.setSchedule(newScheduleNumber);
    
        // Print a message indicating the updated schedule
        System.out.println("Schedule updated for employee " + employeeName + " to schedule number " + newScheduleNumber);
    }

    public void setPassword(String passwordA) {
        this.passwordA = passwordA;
    }

    public String getPassword() {
        return this.passwordA;
    }

    
}
