package DynamicProgramming;
import java.util.*;
public class MinimumNumberOfPlatformsRequired {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            int[] dep=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                dep[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            Arrays.sort(dep);
            int i=0;
            int j=0;
            int count=0;
            int maxCount=0;
            while(i<n && j<n){
                if(arr[i]<=dep[j]){
                    count++;
                    i=i+1;
                }else{
                    count--;
                    j=j+1;
                }
                maxCount=Math.max(count,maxCount);
            }
            System.out.print(maxCount);
        }
    }
