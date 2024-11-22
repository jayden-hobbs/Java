package javaMethods;
public class conditionalMethods {
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - Your are too young!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) {
        checkAge(20);
        checkAge(15);
        checkAge(30);
    }
}
