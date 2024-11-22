package Loops;

public class nestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) { // this will run 3 times as the condition is i < 3
            for (int j = 0; j < 3; j++) { // this will run 3 times each time the outer loop runs as the condition is j < 3
                System.out.println(i + " " + j); // print the value of i and j together as a pair
            }
        }
    } 
} 
