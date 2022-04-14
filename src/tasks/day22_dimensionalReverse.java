package tasks;

public class day22_dimensionalReverse {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < arr2D.length; i++) { // i: indexes of each 1D array started from 0

            for (int j = arr2D[i].length - 1; j >= 0; j--) { // j: indexes of each element starting from last index
                System.out.print(arr2D[i][j] + " ");
            }
        }
        System.out.println("------------------");

        for (int[] each2DArray : arr2D) {
            for (int eachElement : each2DArray) {
                System.out.println(eachElement);
            }
        }
    }
}
   /* Write a program that can reverse a two dimensional array (return new
                                                              array)
Ex:
        array = { {1,2,3}, {4,5,6}};
        output:
        reverse = { {6,5,4}, {3,2,1},};

        */
