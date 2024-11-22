package Arrays;

public class loop2dArrays {
    public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        }; // create a 2D array of integers

        for (int i = 0; i < numbers.length; i++) { // loop through the rows of the 2D array
            for (int j = 0; j < numbers[i].length; j++) { // loop through the columns of the 2D array
                System.out.print(numbers[i][j] + " "); // print the element at the current row and column
            }
            System.out.println(); // print a new line after each row
        }
    }
}
