package END_SEM.Unit_3.Array;

public class MultiArry {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {1, 2, 3}
        };

        // print the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
