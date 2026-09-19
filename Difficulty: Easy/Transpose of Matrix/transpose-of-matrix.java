class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(mat[j][i]);
            }
            ans.add(row);
        }

        return ans;
    }
}