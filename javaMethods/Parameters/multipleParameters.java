package javaMethods.Parameters;

public class multipleParameters {
    static void method1(String firstName, int age) {
        System.out.println(firstName + " is " + age + " years old");
    }

    public static void main(String[] args) {
        method1("Jayden", 25);
        method1("Jane", 30);
        method1("Tom", 35);
    }
}
