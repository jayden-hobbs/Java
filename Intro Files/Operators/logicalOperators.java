package Operators;
public class logicalOperators {
    public static void main(String[] args) {
        int number1 = 5;
        boolean result = number1 < 10 && number1 > 4; // is number less than 10 AND greater than 4? prints true
        System.out.println(result); // prints true
        
        int number2 = 5;
        boolean result2 = number2 < 10 || number2 > 10; // is number2 less than 10 OR greater than 10? prints true
        System.out.println(result2); // prints true

        int number3 = 5;
        boolean result3 = !(number3 < 10); // is number3 not less than 10? prints false
        System.out.println(result3); // prints false

    }
}
