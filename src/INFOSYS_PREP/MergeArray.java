package INFOSYS_PREP;
import java.util.*;
public class MergeArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            // Input first array
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            // Input second array
            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
            }
            // Merge arrays
            int[] merged = new int[2 * n];

            for (int i = 0; i < n; i++) {
                merged[i ] = arr1[i];
            }

            for (int i = 0; i < n; i++) {
                merged[n + i] = arr2[i];
            }

            // Print merged array
            for (int i = 0; i < merged.length; i++) {
                System.out.print(merged[i] + " ");
            }

            sc.close();
        }
    }