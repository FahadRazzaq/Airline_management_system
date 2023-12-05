import java.util.Scanner;

class Employee extends User {
    private String passwordE;
    private int scheduleNumber;
    private String email;
    private int phoneNumber;
    

    public Employee(String firstName, String lastName, long id) {
        super(firstName, lastName, id);
        this.passwordE = "alpha";
        this.email = "";
        this.phoneNumber = 0;
        this.scheduleNumber = scheduleNumber;
    
    }
        // Override the getFirstName() method in the subclass
        @Override
        public String getFirstName() {
            return "Employee's first name: " + super.getFirstName();
        }

    public void setPassword(String passwordE) {
        this.passwordE = passwordE;
    }

    public String getPassword() {
        return this.passwordE;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void changeInformation(Scanner scanner) {

        System.out.println("Enter new password:");
        String newPassword = scanner.nextLine();

        System.out.println("Enter new email:");
        String newEmail = scanner.nextLine();

        System.out.println("Enter new phone number:");
        String phoneNumberInput = scanner.nextLine();
        int newPhoneNumber = 0; // Default value if input is empty
    
        if (!phoneNumberInput.isEmpty()) {
            try {
                newPhoneNumber = Integer.parseInt(phoneNumberInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid phone number format. Using default (0).");
            }
        } else {
            System.out.println("Phone number cannot be empty. Using default (0).");
        }
    
        this.passwordE = newPassword;
        this.email = newEmail;
        this.phoneNumber = newPhoneNumber;
        System.out.print("All Details Have Been updated ");
    }

    public String getUpdatedInformation() {
        return "Password: " + this.passwordE + ", Email: " + this.email + ", Phone Number: " + this.phoneNumber;
    }
    public void setSchedule(int scheduleNumber) {
        this.scheduleNumber = scheduleNumber;
    }
    


}
