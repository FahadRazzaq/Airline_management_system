import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = User.getUserInfo();
        Employee employee = new Employee("John", "Doe", 123456);
        boolean running = true;
while (running) {
    System.out.println("\nLogin as:");
    System.out.println("1. Passenger");
    System.out.println("2. Employee");
    System.out.println("3. Admin");
    System.out.println("4. Exit");

    int loginChoice = Integer.parseInt(scanner.nextLine());

    switch (loginChoice) {
        case 1:
            // Passenger Menu
            System.out.println("\nPassenger Menu:");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Update Ticket");
            System.out.println("4. Display Upcoming Flights");
            System.out.println("5. Exit");

            int passengerChoice = Integer.parseInt(scanner.nextLine());
            Passenger passenger = new Passenger(user.getFirstName(), user.getLastName(), user.getId());

            switch (passengerChoice) {
                case 1:
                    passenger.bookTicket();
                    break;
                case 2:
                passenger.cancelTicket(scanner);
                    break;
                case 3:
                passenger.updateTicket(scanner);
                    break;
                case 4:
                Airport sourceAirport = new Airport("SFO", "San Francisco Airport", "San Francisco");
                Airport destinationAirport = new Airport("JFK", "John F. Kennedy Airport", "New York");
        
                ArrayList<Integer> flightNumbers = new ArrayList<>();
                flightNumbers.add(741);
        
                InternationalOrLocalFlight flight = new InternationalOrLocalFlight(flightNumbers, sourceAirport, destinationAirport, true, 800, 1200, 150, 250);
                flight.flightList();
                System.out.println(flight.internationalFlight());
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            break;

        case 2:
            // Employee Menu
          //  Employee employee = new Employee("John", "Doe", 1001);
            System.out.println("Enter password:"); // Prompt for password
            String enteredPassword = scanner.nextLine();

            // Check password here
            if (enteredPassword.equals(employee.getPassword())) {
            System.out.println("\nEmployee Menu:");
            System.out.println("1. Display Employee Information");
            System.out.println("2. Change Employee Information");
            System.out.println("3. Exit");

            int employeeChoice = Integer.parseInt(scanner.nextLine());


            switch (employeeChoice) {
                case 1:
                employee.setEmail("john.doe@example.com");
                employee.setPassword("alpha");
                employee.setPhoneNumber(1234567890);
        
                // Displaying employee details
                System.out.println("\nEmployee Details:");
                System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
                System.out.println("ID: " + employee.getId());
                System.out.println("Email: " + employee.getEmail());
                System.out.println("Phone Number: " + employee.getPhoneNumber());
                    break;
                case 2:
                employee.changeInformation(scanner);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } else {
            System.out.println("Incorrect password. Access denied!");
        }
            break;

        case 3:
            // Admin Menu
            Admin admin = new Admin("Admin", "Smith", 1001);
           // Employee employee = new Employee("John", "Doe", 123456);
            System.out.println("Enter admin password:");
            String nteredPassword = scanner.nextLine();
            if (!nteredPassword.equals(admin.getPassword())) {
                System.out.println("Incorrect password. Access denied.");
                return;
            }

            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Flight");
            System.out.println("2. Cancel Flight");
            System.out.println("3. Update Flight");
            System.out.println("4. Change Employee Schedule");
            System.out.println("5. Exit");

            int adminChoice = Integer.parseInt(scanner.nextLine());

            switch (adminChoice) {
                case 1:
                    admin.addFlight(scanner);
                    break;
                case 2:
                    admin.cancelFlight(scanner);
                    break;
                case 3:
                    admin.updateFlight(scanner);
                    break;
                case 4:
                    admin.chooseEmployeeSchedule(employee);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            break;

        case 4:
            running = false;
            break;

        default:
            System.out.println("Invalid choice!");
            break;
    }
}
scanner.close(); // Closing scanner after main loop
    }
}
