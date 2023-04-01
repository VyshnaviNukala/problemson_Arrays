import java.util.*;

 public class LargestPrime {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter  size of the array: ");

        int Arraysize = s.nextInt();

        int[] arrNum = new int[Arraysize];

        for (int i = 0; i < Arraysize; i++) {

            System.out.print("Enter the element at index " + i + ": ");

            arrNum[i] = s.nextInt();
        }

        int largestPrime = Integer.MIN_VALUE;

        for (int num : arrNum) {

            if (isPrime(num) && num > largestPrime) {

                largestPrime = num;
            }
        }

        if (largestPrime == Integer.MIN_VALUE) {

            System.out.println("There are no prime numbers in the array");

        } else {

            System.out.println("The largest prime number in the given array is: " + largestPrime);

        }
    }

    public static boolean isPrime(int num) {

        if (num <= 1) {

            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}