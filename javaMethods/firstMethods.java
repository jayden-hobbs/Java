package javaMethods;

public class firstMethods {
    static void method1() {
        System.out.println("This is the first method");
    }

    public static void main (String[] args) {
        method1();
        method1();
        method1(); // call the method three times so output will be printed three times
    }
}
