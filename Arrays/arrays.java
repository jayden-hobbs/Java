package Arrays;

public class arrays {
    public static void main(String[] argd) {
        String[] footballTeams = {"Arsenal", "Chelsea", "Liverpool", "Manchester City", "Manchester United", "Tottenham Hotspur"}; // create an array of strings
        System.out.println(footballTeams[0]); // print the first element of the array - Arsenal. the first element of an array is at index 0

        footballTeams[0] = "Brighton & Hove Albion"; // change the first element of the array to Brighton & Hove Albion
        System.out.println(footballTeams[0]); // print the first element of the array - Brighton & Hove Albion

        System.out.println(footballTeams.length); // print the length of the array - 6
    }
}
