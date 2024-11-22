package introFiles.ifStatements;

public class ifElseIfStatements {
    public static void main(String[] args) {
        int age = 18;
        if (age < 18) {
            System.out.println("You are not an adult");
        } else if (age == 18) {
            System.out.println("You are 18 years old");
        } else {
            System.out.println("You are an adult");
        }
    }
}
