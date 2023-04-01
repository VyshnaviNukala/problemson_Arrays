import java.util.*;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  number of elements in the array: ");
        int N = sc.nextInt();

        int[] arrNum = new int[N];

        System.out.println("Enter  elements of the array:");
        for (int i = 0; i < N; i++) {
            arrNum[i] = sc.nextInt();
        }

        System.out.print("The elements in reverse order: ");

        for (int i = N - 1; i >= 0; i--) {

            System.out.print(arrNum[i] + " ");
        }

        
    }
}