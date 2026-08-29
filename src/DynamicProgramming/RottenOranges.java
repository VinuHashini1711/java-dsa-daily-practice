package DynamicProgramming;
import java.util.*;
public class RottenOranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] grid = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        Solution obj = new Solution();
        int result = obj.orangesRotting(grid);
        System.out.println(result);
        sc.close();
    }
    static class Solution {
        public int orangesRotting(int[][] grid) {

            int row = grid.length;
            int col = grid[0].length;

            int[][] time = new int[row][col];

            // Initially, every cell has infinite time
            for (int i = 0; i < row; i++) {
                Arrays.fill(time[i], Integer.MAX_VALUE);
            }

            // Start DFS from every rotten orange
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {

                    if (grid[i][j] == 2) {
                        dfs(grid, time, i, j, 0);
                    }
                }
            }

            int total_days = 0;

            // Find maximum time required
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {

                    if (grid[i][j] == 1) {

                        // Fresh orange cannot be reached
                        if (time[i][j] == Integer.MAX_VALUE) {
                            return -1;
                        }

                        total_days = Math.max(total_days, time[i][j]);
                    }
                }
            }

            return total_days;
        }

        static void dfs(int[][] grid, int[][] time, int i, int j, int current_time) {
            // Boundary / empty cell / already reached faster
            if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || current_time >= time[i][j]) {
                return;
            }
            // Store minimum time
            time[i][j] = current_time;
            dfs(grid, time, i + 1, j, current_time + 1);
            dfs(grid, time, i, j + 1, current_time + 1);
            dfs(grid, time, i - 1, j, current_time + 1);
            dfs(grid, time, i, j - 1, current_time + 1);
        }
    }
}