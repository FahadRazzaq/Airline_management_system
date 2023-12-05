import java.util.Scanner;

public class LevelOfSeat {
    public int price;
    public String meal;
    public int luggage;

    public LevelOfSeat() {
    
    }

    public void Business(int price, String meal, int luggage) {
        this.price = price;
        this.meal = meal;
        this.luggage = luggage;
    }

    public void Economy(int price, String meal, int luggage) {
        this.price = price;
        this.meal = meal;
        this.luggage = luggage;
    }

    public String chooseSeatType() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose seat type:");
        System.out.println("1. Economy");
        System.out.println("2. Business");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                Economy(100, "Standard Meal", 1);
                return "Economy";
            case 2:
                Business(300, "Gourmet Meal", 2);
                return "Business";
            default:
                return "Invalid choice";
        }
    }
}
