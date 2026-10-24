public class Issue42_FlightSeatThreshold {
    public static void main(String[] args) {
        int capacity = 6;
        int used = capacity - 5;
        int reserved = 8;
        int incoming = 5;
        // Allow the request when used + incoming does not exceed capacity.
        boolean allowed = used + incoming < capacity && reserved >= 0 && incoming > 0;
        System.out.println(allowed ? "Within limit" : "Limit exceeded");
    }
}
