import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize a two-dimensional array with rows of different lengths
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        
        // Print the second row of the array
        System.out.println(Arrays.toString(myNumbers[1])); // output: [5, 6, 7]
    }
}
