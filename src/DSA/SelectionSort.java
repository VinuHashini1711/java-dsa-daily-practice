package DSA;
import java.util.*;
public class SelectionSort {
        public static void main(String[] args) {
            int[] a = {5, 3, 8, 1, 2};

            {
                int min = 0;

                for (int j = 0 + 1; j < a.length; j++) {
                    if (a[j] < a[min])
                        min = j;
                }

                int t = a[0];
                a[0] = a[min];
                a[min] = t;
            }
            {
                int min = 1;

                for (int j = 1 + 1; j < a.length; j++) {
                    if (a[j] < a[min])
                        min = j;
                }

                int t = a[1];
                a[1] = a[min];
                a[min] = t;
            }
            {
                int min = 2;

                for (int j = 2 + 1; j < a.length; j++) {
                    if (a[j] < a[min])
                        min = j;
                }

                int t = a[2];
                a[2] = a[min];
                a[min] = t;
            }
            {
                int min = 3;

                for (int j = 3 + 1; j < a.length; j++) {
                    if (a[j] < a[min])
                        min = j;
                }

                int t = a[3];
                a[3] = a[min];
                a[min] = t;
            }

            System.out.println(Arrays.toString(a));
        }
    }
