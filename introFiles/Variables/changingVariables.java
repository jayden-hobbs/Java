public class changingVariables {
    public static void main(String[] args){
        
        int age = 18;
        age = 19;
        System.out.println(age); // prints 19   // this snippet will print 19 because the value of age is changed from 18 to 19

        final String name = "Jayden";
        // name = "Jayden Hobbs";
        System.out.println(name); // this snippet would print an error because the value of name is set as final and cannot be changed
    }
}
