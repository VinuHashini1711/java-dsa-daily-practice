package TCS_NQT.Matrix;
import java.util.*;
public class CheckPositionInASortedArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int dup[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            dup[i]=arr[i];
        }
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]!=dup[i]){
                count++;
            }
        }
        System.out.print(count);
    }
}
