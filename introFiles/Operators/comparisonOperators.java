package Operators;
@SuppressWarnings("all")
public class comparisonOperators {
    public static void main(String[] args) {
        System.out.println(2 == 3); // is 2 equal to 3? prints false
        System.out.println(2 != 3); // is 2 not equal to 3? prints true
        System.out.println(2 > 2); // is 2 greater than 2? prints false
        System.out.println(2 < 2); // is 2 less than 2? prints false
        System.out.println(2 >= 2); // is 2 greater than or equal to 2? prints true
        System.out.println(2 <= 2); // is 2 less than or equal to 2? prints true
        System.out.println(4 == 4 && 4!=5); // is 4 equal to 4 AND 4 not equal to 5? prints true
        System.out.println(2 == 4 || 3 != 2); // is 2 equal to 4 OR 3 not equal to 2? prints true
        System.out.println(!(2 == 3)); // is 2 not equal to 3? prints true
    }
}
