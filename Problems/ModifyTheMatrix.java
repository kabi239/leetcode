public class ModifyTheMatrix {
    public int[][] modifiedMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int arr[][] = new int[m][n];
        for (int j = 0; j < n; j++) {
            int maxVal = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                maxVal = Math.max(maxVal, mat[i][j]);
            }
            for (int i = 0; i < m; i++) {
                if (mat[i][j] == -1) {
                    arr[i][j] = maxVal;
                } else {
                    arr[i][j] = mat[i][j];
                }
            }

        }
        return arr;
    }
}
