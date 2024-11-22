package introFiles.Operators;
public class arithmeticOperators {
    public static void main(String[] args) {
        System.out.println(2+2); // prints simple addition = 4
        System.out.println(2-2); // prints simple subtraction = 0
        System.out.println(3*2); // prints simple multiplication = 6
        System.out.println(6/2); // prints simple division = 3
        System.out.println(5%2); // prints the remainder of 5 divided by 2 = 1
        System.out.println(5/2); // prints the quotient of 5 divided by 2 = 2

        int number1 = 5;
        System.out.println(++number1); // increases value by 1 - prints 6

        int number2 = 5;
        System.out.println(--number2); // decreases value by 1 - prints 4

        int number3 = 5;
        number3 +=5; // adds 5 to the value of number3  
        System.out.println(number3); // prints 10  
    }
}
