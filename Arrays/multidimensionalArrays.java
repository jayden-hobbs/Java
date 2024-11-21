package Arrays;

public class multidimensionalArrays {
    public static void main(String[] args) {
        String[][] footballTeams = {{"Arsenal", "Chelsea", "Tottenham"}, {"Leeds", "Burnley", "Sheffield United"}}; // create a 2D array of strings
        System.out.println(footballTeams[0][0]); // print the first element of the first array - Arsenal
        System.out.println(footballTeams[1][0]); // print the first element of the second array - Leeds
        System.out.println(footballTeams[0][1]); // print the second element of the first array - Chelsea
        System.out.println(footballTeams[1][1]); // print the second element of the second array - Burnley
        System.out.println(footballTeams[0][2]); // print the third element of the first array - Tottenham
        System.out.println(footballTeams[1][2]); // print the third element of the second array - Sheffield United

        footballTeams[0][2] = "Brighton and Hove Albion"; // change the third element of the first array to Brighton and Hove Albion
        System.out.println(footballTeams[0][2]); // print the third element of the first array - Brighton and Hove Albion
    }
}
