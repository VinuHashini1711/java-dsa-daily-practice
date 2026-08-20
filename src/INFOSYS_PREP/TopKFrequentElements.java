/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
Example 1:
Input: nums = [1,1,1,2,2,3], k = 2  Output: [1,2]

Example 2:
Input: nums = [1], k = 1 Output: [1]

Example 3:
Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2 Output: [1,2]
 */

package INFOSYS_PREP;
import java.util.*;
public class TopKFrequentElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }

        System.out.println(Arrays.toString(ans));
    }
}
