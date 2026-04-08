import java.util.Scanner;

public class Solution {

    // Generic method
    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Integer array input
        int N = sc.nextInt();
        Integer[] intArray = new Integer[N];

        for (int i = 0; i < N; i++) {
            intArray[i] = sc.nextInt();
        }

        // String array input
        int M = sc.nextInt();
        String[] strArray = new String[M];

        for (int i = 0; i < M; i++) {
            strArray[i] = sc.next();
        }

        // Output
        System.out.println("Max Integer: " + findMax(intArray));
        System.out.println("Max String: " + findMax(strArray));

        sc.close();
    }
}
