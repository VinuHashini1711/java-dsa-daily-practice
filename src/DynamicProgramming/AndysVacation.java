/*
n=4
contest=[1,3,2,4]
gym=[2,2,5,1]

andy cannot do the same activity on consecutive days except rest
Rest-happiness 0
 Goal: to maximize the total happiness
 */


package DynamicProgramming;
import java.util.*;
public class AndysVacation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] contest={1,3,5,4};
        int[] gym={2,2,5,1};
        int dp[][]=new int[n][3];
        dp[0][0]=0;
        dp[0][1]=contest[0];
        dp[0][2]=gym[0];
        for(int i=1;i<n;i++){
            dp[i][0]=Math.max(dp[i-1][0],Math.max(dp[i-1][1],dp[i-1][2]));
            dp[i][1]=contest[i]+Math.max(dp[i-1][0],dp[i-1][2]);
            dp[i][2]=gym[i]+Math.max(dp[i-1][0],dp[i-1][1]);
        }
        int answer=Math.max(dp[n-1][0],Math.max(dp[n-1][1],dp[n-1][2]));
        System.out.print(answer);
    }
}
