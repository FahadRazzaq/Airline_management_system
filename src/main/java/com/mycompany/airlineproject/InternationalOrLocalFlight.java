import java.util.ArrayList;

class InternationalOrLocalFlight extends Flight {
    public final int LOCAL_CAPACITY;
    public final int INTERNATIONAL_CAPACITY;

    public InternationalOrLocalFlight(ArrayList<Integer> flightNumber, Airport source, Airport destination, boolean seatAvailable, int takeOff, int arrival,
     int localCapacity, int internationalCapacity) {
        super(flightNumber, source, destination, seatAvailable, takeOff, arrival);
        this.LOCAL_CAPACITY = localCapacity;
        this.INTERNATIONAL_CAPACITY = internationalCapacity;
    }

    public String internationalFlight() {
        return "This is an international flight.";
    }

    public String localFlight() {
        return "This is a local flight.";
    }
}

