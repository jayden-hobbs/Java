package introFiles.Strings;

public class specialCharacters {
    public static void main(String[] args) {
        //String txt = "We are the so-called "Vikings" from the north.";  this would print an error because the double quotes are not escaped
        String txt = "We are the so-called \"Vikings\" from the north."; // this is the correct way to escape double quotes
        System.out.println(txt); // prints We are the so-called "Vikings" from the north.

        //String txt2 = "It's alright."; this would print an error because the single quote is not escaped
        String txt2 = "It\'s alright."; // this is the correct way to escape single quotes
        System.out.println(txt2); // prints It's alright.

        //String txt3 = "The character \ is called backslash."; this would print an error because the backslash is not escaped
        String txt3 = "The character \\ is called backslash."; // this is the correct way to escape backslashes
        System.out.println(txt3); // prints The character \ is called backslash.
    }
}
