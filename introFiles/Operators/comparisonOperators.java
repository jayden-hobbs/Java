public class comparisonOperators {
    public static void main(String[] args) {
        System.out.println(2 == 2); // is 2 equal to 2? prints true
        System.out.println(2 != 2); // is 2 not equal to 2? prints false
        System.out.println(2 > 2); // is 2 greater than 2? prints false
        System.out.println(2 < 2); // is 2 less than 2? prints false
        System.out.println(2 >= 2); // is 2 greater than or equal to 2? prints true
        System.out.println(2 <= 2); // is 2 less than or equal to 2? prints true
        System.out.println(2 == 2 && 2 != 2); // is 2 equal to 2 AND 2 not equal to 2? prints false
        System.out.println(2 == 2 || 2 != 2); // is 2 equal to 2 OR 2 not equal to 2? prints true
        System.out.println(!(2 == 2)); // is 2 not equal to 2? prints false
    }
}
