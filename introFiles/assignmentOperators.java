public class assignmentOperators {
    public static void main(String[] args) {
        int number1 = 5;
        System.out.println(number1); // prints 5

        number1 = 10;
        System.out.println(number1); // prints 10

        int number2 = 5;
        number2 += 5; // adds 5 to the value of number2
        System.out.println(number2); // prints 10

        int number3 = 5;
        number3 -= 5; // subtracts 5 from the value of number3 
        System.out.println(number3); // prints 0

        int number4 = 5;
        number4 *= 5; // multiplies the value of number4 by 5
        System.out.println(number4); // prints 25

        int number5 = 5;   
        number5 /= 5; // divides the value of number5 by 5
        System.out.println(number5); // prints 1

        int number6 = 5;
        number6 %= 5; // assigns the remainder of number6 divided by 5 to number6
        System.out.println(number6); // prints 0
        
        int number7 = 5;
        number7 &= 5; // assigns the bitwise AND of number7 and 5 to number7
        System.out.println(number7); // prints 5

        int number8 = 5;
        number8 |= 5; // assigns the bitwise OR of number8 and 5 to number8
        System.out.println(number8); // prints 5
        
        int number9 = 5;
        number9 ^= 5; // assigns the bitwise XOR of number9 and 5 to number9
        System.out.println(number9); // prints 0

        int number10 = 5;
        number10 >>= 5; // assigns the value of number10 shifted right by 5 bits to number10
        System.out.println(number10); // prints 0

        int number11 = 5;
        number11 <<= 5; // assigns the value of number11 shifted left by 5 bits to number11
        System.out.println(number11); // prints 160
    }
}
