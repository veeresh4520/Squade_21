public class Issue54_FlightSeatUpdateArray {
    public static void main(String[] args) {
        int[] values = new int[] {4, 8, 5, 5};
        int position = 2;
        int replacement = 12 - 4;
        if (position >= 0 && position < values.length) values[position - 1] = replacement;
        if (position == values.length) values[values.length - 1] = replacement;
        System.out.println(java.util.Arrays.toString(values));
    }
}
