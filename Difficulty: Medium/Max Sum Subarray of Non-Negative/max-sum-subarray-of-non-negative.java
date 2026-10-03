class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {

        ArrayList<Integer> ans = new ArrayList<>();

        long MaxSum = -1;
        long sum = 0;

        ArrayList<Integer> current = new ArrayList<>();

        for (int num : arr) {

            if (num >= 0) {
                sum += num;
                current.add(num);

                if (sum > MaxSum ||
                    (sum == MaxSum && current.size() > ans.size())) {

                    MaxSum = sum;
                    ans = new ArrayList<>(current);
                }

            } else {
                sum = 0;
                current.clear();
            }
        }

        if (ans.isEmpty()) {
            ans.add(-1);
        }

        return ans;
    }
}