// Last updated: 5/27/2026, 12:31:31 PM
import java.util.*;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        for (int k = 0; k < 4; k++) {
            if (areEqual(mat, target)) return true;

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }

            for (int i = 0; i < n / 2; i++) {
                int[] temp = mat[i];
                mat[i] = mat[n - 1 - i];
                mat[n - 1 - i] = temp;
            }
        }

        return false;
    }

    public boolean areEqual(int[][] a, int[][] b) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (!Arrays.equals(a[i], b[i])) return false;
        }
        return true;
    }
}