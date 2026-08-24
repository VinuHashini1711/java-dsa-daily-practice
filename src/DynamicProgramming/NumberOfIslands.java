package DynamicProgramming;
import java.util.*;
public class NumberOfIslands {
    public static int numOfIslands(char[][] grid){
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    public static void dfs(char[][] grid,int row,int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length){
            return;
        }
        if(grid[row][col]=='0'){
            return;
        }
        grid[row][col]='0';
        dfs(grid,row-1,col);
        dfs(grid,row+1,col);
        dfs(grid,row,col-1);
        dfs(grid,row,col+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][] grid=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[0].length;j++) {
                grid[i][j]=sc.next().charAt(0);
            }
        }
        System.out.print(numOfIslands(grid));
    }
}
