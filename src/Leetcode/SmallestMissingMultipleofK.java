package Leetcode;
import java.util.*;
public class SmallestMissingMultipleofK {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int nums[]=new int[n];
    for(int i=0;i<n;i++) {
        nums[i] = sc.nextInt();
    }
    int k=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
                list.add(nums[i]);
            }
        }
        for(int i=1;i<nums.length;i++){
            int x=k*i;
            for(int j=0;j<list.size();j++){
                if(!list.contains(x)){
                    System.out.println(x);
                }
            }
        }
        if(nums.length==1 && list.contains(k)){
            System.out.println(k*2);
        }
        if(nums.length==1 && !list.contains(k)){
            System.out.println(k);
        }
        int len=list.size()+1;
        int r=k*len;
        System.out.println(r);
    }
}
