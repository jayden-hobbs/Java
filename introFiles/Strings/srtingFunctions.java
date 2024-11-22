package introFiles.Strings;

public class srtingFunctions {
    public static void main(String[] args) {
        String name = "Jayden";
        System.out.println(name.length()); // prints length of the string - 6

        System.out.println(name.toUpperCase()); // prints the string in uppercase - JAYDEN

        System.out.println(name.toLowerCase()); // prints the string in lowercase - jayden 

        System.out.println(name.substring(0, 3)); // prints the string from index 0 to 3 - Jay

        System.out.println(name.substring(3)); // prints the string from index 3 to the end - den

        System.out.println(name.replace('J', 'K')); // replaces J with K - Kayden

        System.out.println(name.indexOf('a')); // prints the index of the character a - 1


    }
}
