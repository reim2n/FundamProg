package ee.itcollege.ics0004.practice9;

public class SumOfMatrixRowMaximums {

    /*

    Write a method that returns the sum of the greatest elements in each row of a matrix

     */


    public static void main(String[] args) {

        int[] row1 = {4, 6, 1, 9};
        int[] row2 = {-5, -10, -12};
        int[] row3 = {0, 2, 1};

        int[][] matrix =
                {
                        row1,   // max: 9
                        row2, // max: -5
                        row3,      // max: 2
                };

        // -> 6 // returns 6 == 9 + (-5) + 2}

        System.out.println(sumOfRowMax(matrix));

//        System.out.println(maxOfRow(row1));

    }


    public static int sumOfRowMax(int[][] matrix) {

        int sum = 0;

        for (int[] aMatrix : matrix) {
            sum += maxOfRow(aMatrix);
        }

        return sum;
    }

    public static int maxOfRow(int[] row) {

        int max = Integer.MIN_VALUE;

        for (int aRow : row) {
            if (aRow > max)
                max = aRow;
        }

        System.out.println("max of a row is: " + max);
        return max;
    }
}