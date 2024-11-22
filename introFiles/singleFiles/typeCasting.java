package introFiles.singleFiles;
public class typeCasting {
    public static void main(String[] args) {
        int age = 18;
        double newAge = age; // this is an example of widening type casting
        System.out.println(newAge); // prints 18.0

        double pi = 3.14;
        int newPi = (int) pi; // this is an example of narrowing type casting
        System.out.println(newPi); // prints 3

    }
}
