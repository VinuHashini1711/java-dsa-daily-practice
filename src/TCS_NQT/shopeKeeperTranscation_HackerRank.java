package TCS_NQT;
import java.util.*;
public class shopeKeeperTranscation_HackerRank {
    public static void main(String args[] ){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]<30){
                System.out.print("Transaction failed");
                return;
            }
            else if(arr[i]>30){
                int bal=arr[i]-30;
                if(bal>=sum){
                    System.out.print("Transaction failed");
                    return;
                }else{
                    sum-=bal;
                    sum+=bal;
                }
            }else{
                sum+=arr[i];
            }
        }
        System.out.print("Transaction successful");
    }
}
