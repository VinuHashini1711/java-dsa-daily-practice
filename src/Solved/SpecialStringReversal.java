package Solved;

import java.util.Scanner;

public class SpecialStringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //"A#C&Y%X"
        char arr[] = str.toCharArray();
        String rev = "";
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (!Character.isLetter(arr[i])) {
                i++;
            } else if (!Character.isLetter(arr[j])) {
                j--;
            } else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        //since we have used return type lyk return new String(arr);
        // we cant use it here becuz the in the main method we hv declared it lyk as void
        // void doent have return value
        // so we print it using the sop;

        System.out.print(new String(arr));

    }
}
