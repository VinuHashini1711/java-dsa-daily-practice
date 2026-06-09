package Solved;
import java.util.*;
class LeftRotationOfAnArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        k=k%n;
        for(int i=0;i<k;i++){
            int temp=arr[0];

            // we can use any one logic for forloop here, both are same
            //  for(int j=0;j<n-1;j++){
            //     arr[j]=arr[j+1];
            //  }
            for(int j=1;j<n;j++){
                arr[j-1]=arr[j];
            }
            arr[n-1]=temp;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
//        System.out.print(Arrays.toString(arr));
    }
}
