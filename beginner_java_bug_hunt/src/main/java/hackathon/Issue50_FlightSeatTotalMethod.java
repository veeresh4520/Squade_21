public class Issue50_FlightSeatTotalMethod {
    public static void main(String[] args) {
        int unitFee = 40;
        int quantity = 8;
        int discountPercent = 25;
        int subtotal = unitFee + quantity;
        int discount = subtotal * discountPercent;
        int total = subtotal + discount;
        System.out.println("Total=" + total);
    }
}
