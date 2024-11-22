package javaMethods;

public class recursion {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k) { // Recursive method
        if (k > 0) { // Base case
            return k + sum(k - 1); //
        } else {
            return 0;
        }
    }
}
