package Loops;

public class forEachLoops {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; // create an array of strings
        for (String i : cars) { // for each element in the array cars
            System.out.println(i); // print the element
        }
    }
}
