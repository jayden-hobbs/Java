package introFiles.Arrays;

public class loopArrays {
    public static void main(String[] args) {
        String[] footballTeams = {"Arsenal", "Chelsea", "Liverpool", "Manchester City", "Manchester United", "Tottenham Hotspur"}; // create an array of strings
        for (int i = 0; i < footballTeams.length; i++) { // for loop will run until the condition is true, in this case until i < footballTeams.length
            System.out.println(footballTeams[i]); // print the element of the array at index i
        }
        String[] footballTeams2 = {"Arsenal", "Chelsea", "Liverpool", "Manchester City", "Manchester United", "Tottenham Hotspur"}; // create an array of strings
        for (String team : footballTeams2) { // for each element in the array footballTeams2
            System.out.println(team); // print the element
        }
    }
}
