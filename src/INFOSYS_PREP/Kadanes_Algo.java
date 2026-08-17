package INFOSYS_PREP;
import java.util.*;
public class Kadanes_Algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int currSum=0;
        int max=0;
        for(int i=0;i<n;i++){
            currSum=Math.max(currSum,arr[i]+currSum);
            max=Math.max(max,currSum);
        }
        System.out.println(max);
    }
}
