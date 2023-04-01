import java.util.*;

public class MovesEndOfArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");

        int Arraysize = s.nextInt();

        int[] arrNum = new int[Arraysize];

        for (int i = 0; i < Arraysize; i++) {

            System.out.print("Enter the element at index " + i + ": ");

            arrNum[i] = s.nextInt();
        }

        int countOne = 0;

        for (int i = 0; i < arrNum.length; i++) {

            if (arrNum[i] != 1) {

                arrNum[countOne++] = arrNum[i];
            }
        }

        while (countOne < arrNum.length) {

            arrNum[countOne++] = 1;
        }

        System.out.print("Array elements after moving Ones to end: ");

        for (int num : arrNum) {

            System.out.print(num + " ");
        }
    }
}