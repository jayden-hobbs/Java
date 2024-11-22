package javaMethods;

public class methodOverloading {
    static int method1(int x, int y) {
        return x + y;
    }

static double method1(double x, double y) {
    return x + y;
}
    public static void main(String[] args) {
        int num1 = method1(3, 5); // 3 + 5 = 8
        double num2 = method1(3.5, 5.5); // double means decimal, 3.5 + 5.5 = 9.0
        System.out.println("int: "+num1);
        System.out.println("double: "+num2);
    }
}
