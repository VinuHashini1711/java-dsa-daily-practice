package DSA;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        int l=0;
        int r=n - 1;
        boolean isAsc=arr[l] < arr[r];

        while(l<r){
            int mid=l+(r-l)/2;
            if(target<arr[mid]){
                System.out.print(mid);
            }
            if(isAsc){
                 if(target>arr[mid]){
                        l=mid+1;
                }else{
                    r=mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }
        }
        System.out.print(-1);
    }
}
