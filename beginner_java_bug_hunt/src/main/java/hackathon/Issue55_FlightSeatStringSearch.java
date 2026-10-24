public class Issue55_FlightSeatStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A21", "B21", "C21"};
        String target = new String("B21");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
