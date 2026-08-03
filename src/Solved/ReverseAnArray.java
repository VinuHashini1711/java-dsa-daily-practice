package Solved;
import java.util.*;
public class ReverseAnArray {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    for(int i=0;i<n/2;i++){
        int temp=arr[i];
        arr[i]=arr[n-1-i];
        arr[n-1-i]=temp;
    }
    System.out.print(Arrays.toString(arr));
//    System.out.print("[");
//    for(int i=n-1;i>=0;i--){
//        System.out.print(arr[i]);
//        if(i!=0){
//            System.out.print(", ");
//        }
//    }
//    System.out.print("]");
}
}
