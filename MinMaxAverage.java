import java.util.Scanner;

public class MinMaxAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int N = input.nextInt();
        int[] arrNum = new int[N];

        System.out.println("Enter  elements of the array:");
        for (int i = 0; i < N; i++) {
            arrNum[i] = input.nextInt();
        }

        int minval = arrNum[0];
        int maxval = arrNum[0];
        int sumval = 0;
        int count = arrNum.length;

        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] < minval) {
                minval = arrNum[i];
            }
            if (arrNum[i] > maxval) {
                maxval = arrNum[i];
            }
            sumval += arrNum[i];
        }

        double avgval = (double) sumval / count;

        System.out.println("The element with the Minimum value: " + minval);
        System.out.println("The element with the Maximum value: " + maxval);
        System.out.println("Average of all array elements: " + avgval);
        System.out.println("Total number of array elements: " + count);

        input.close();
    }
}