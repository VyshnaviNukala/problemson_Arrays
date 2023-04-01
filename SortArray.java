
import java.util.*;

public class SortArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");

        int N = sc.nextInt();

        int[] arrNum = new int[N];

        System.out.println("Enter elements of the array:");

        for (int i = 0; i < N; i++) {

            arrNum[i] = sc.nextInt();
        }
        Arrays.sort(arrNum);

        System.out.print(" elements in ascending order: ");

        for (int i = 0; i < N; i++) {

            System.out.print(arrNum[i] + " ");
        }
        System.out.print("\nThe elements in descending order: ");

        for (int i = N - 1; i >= 0; i--) {

            System.out.print(arrNum[i] + " ");
        }

        sc.close();
    }
}