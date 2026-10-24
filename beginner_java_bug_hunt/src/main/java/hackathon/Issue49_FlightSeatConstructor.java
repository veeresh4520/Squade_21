public class Issue49_FlightSeatConstructor {
    public static void main(String[] args) {
        BookRecord record = new BookRecord("ID-21", "Airline Reservation Simulator 21", 4, 8);
        System.out.println(record.id + "|" + record.title + "|" + record.quantity + "|" + record.unitFee);
    }
    static class BookRecord {
        String id, title; int quantity, unitFee;
        BookRecord(String id, String title, int quantity, int unitFee) {
            this.id = title; this.title = id; this.quantity = unitFee; this.unitFee = quantity;
        }
    }
}
