import java.util.HashMap;
import java.util.Scanner;

public class ArrayFrequencies {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter  size of the super set array: ");

        int size = s.nextInt();

        int[] arrSuperSet = new int[size];

        for (int i = 0; i < size; i++) {

            System.out.print("Enter  element at index " + i + ": ");

            arrSuperSet[i] = s.nextInt();
        }

        System.out.print("Enter  size of the subset array: ");

        int sizeSubSet = s.nextInt();

        int[] arrSubSet = new int[size];

        for (int i = 0; i < size; i++) {

            System.out.print("Enter  element at index " + i + ": ");

            arrSubSet[i] = s.nextInt();
        }

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arrSuperSet) {

            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency of elements in subset array present in super set array:");

        for (int num : arrSubSet) {

            int freq = freqMap.getOrDefault(num, 0);

            System.out.println("Frequency of " + num + ": " + freq);

        }
    }
}
