import java.util.ArrayList;

public class Flight {
    private ArrayList<Integer> flightNumber;
    private Airport destination;
    private Airport source;
    private boolean seatAvailable;
    private int takeOff;
    private int arrival;

    public Flight(ArrayList<Integer> flightNumber, Airport source, Airport destination, boolean seatAvailable, int takeOff, int arrival) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.seatAvailable = seatAvailable;
        this.takeOff = takeOff;
        this.arrival = arrival;
    }

    public String getFlightNumber() {
        return flightNumber.toString();
    }

    public Airport getSource() {
        return source;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    public boolean getSeatsAvailable() {
        return seatAvailable;
    }

    public void flightList() {
        System.out.println("Flight Number: " + getFlightNumber());
        System.out.println("Source: " + getSource());
        System.out.println("Destination: " + getDestination());
        System.out.println("Seats Available: " + getSeatsAvailable());
        System.out.println("Takeoff: " + takeOff);
        System.out.println("Arrival: " + arrival);
    }
}
