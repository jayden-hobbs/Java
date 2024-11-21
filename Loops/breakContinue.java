package Loops;

public class breakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // loop will run until i is less than 10
            if (i == 4) { // if i is equal to 4
                break; // break the loop if i is equal to 4
            }
            System.out.println(i);
        }

        for (int w = 0; w < 10; w++) { // loop will run until w is less than 10
            if (w == 4) { // if w is equal to 4
                continue; // skip the rest of the code inside the loop if i is equal to 4
            }
            System.out.println(w);
        }
    }
}
