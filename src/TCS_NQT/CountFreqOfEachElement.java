package TCS_NQT;
import java.util.*;
public class CountFreqOfEachElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Frequency(arr, n);
    }
public static void Frequency(int n,int arr[]) {
HashMap<Integer,Integer> map=new HashMap<>();
for(int num:arr){
    map.put(num,map.getOrDefault(num,0)+1);
}
for(Map.Entry<Integer,Integer> entry:map.entrySet()){
    System.out.println(entry.getKey() + " " + entry.getValue());
}

}
}
