public class Issue53_FlightSeatSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {4, 8, 5, 121};
        int target = 121;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
