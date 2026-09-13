package DSA;

public class ImageOverlap {

    public static int largestOverlap(int[][] img1, int[][] img2) {

        int n = img1.length;
        int max = 0;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {

                int count = 0;

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {

                        int x = i + r;
                        int y = j + c;

                        if (x < n && y < n &&
                                img1[i][j] == 1 &&
                                img2[x][y] == 1) {

                            count++;
                        }
                    }
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[][] img1 = {
                {1, 1, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        int[][] img2 = {
                {0, 0, 0},
                {0, 1, 1},
                {0, 0, 1}
        };

        System.out.println(largestOverlap(img1, img2));
    }
}