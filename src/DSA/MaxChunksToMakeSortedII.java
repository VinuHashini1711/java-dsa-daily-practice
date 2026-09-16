package DSA;
import java.util.Arrays;
public class MaxChunksToMakeSortedII {

        public static int maxChunksToSorted(int[] arr) {

            int n = arr.length;

            // Suffix minimum array
            int[] suffixMin = new int[n];

            suffixMin[n - 1] = arr[n - 1];

            for (int i = n - 2; i >= 0; i--) {
                suffixMin[i] = Math.min(arr[i], suffixMin[i + 1]);
            }

            int chunks = 1;
            int prefixMax = arr[0];

            // Find valid cut positions
            for (int i = 0; i < n - 1; i++) {

                prefixMax = Math.max(prefixMax, arr[i]);

                if (prefixMax <= suffixMin[i + 1]) {
                    chunks++;
                }
            }
            return chunks;
        }

        public static void main(String[] args) {

            int[] arr = {2, 1, 3, 4, 4};

            int result = maxChunksToSorted(arr);

            System.out.println("Array: " + Arrays.toString(arr));
            System.out.println("Maximum Chunks: " + result);
        }
    }
