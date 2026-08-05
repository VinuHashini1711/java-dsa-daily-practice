package Leetcode.Frequency;
import java.util.*;
public class CountElementsWithMaximumFrequency_3005 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int freq[]=new int[11];
        int arr[]=new int[8];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int num : arr){
            freq[num]++;
        }

        for(int i=0;i<freq.length;i++){
            System.out.print(freq[i]+" ");
        }
        System.out.println();
        System.out.print("Maximum Frequency: ");
        int max=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
                max=freq[i];
            }
        }
        int total=0;
        for(int i=0;i<=10;i++){
            if(freq[i]==max){
                total+=freq[i];
            }
        }
        System.out.print(total);
    }
}
