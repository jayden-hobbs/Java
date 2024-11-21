package Loops;

public class nestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) { // outer loop
            for (int j = 0; j < 3; j++) { // inner loop
                System.out.println(i + " " + j);
            }
        }
    }
}
