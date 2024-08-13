class Solution {
    public void rec(int[] nums, int t, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp, int start) {
        if (t < 0) {
            return;
        }
        if (t == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue; 
            temp.add(nums[i]);
            rec(nums, t - nums[i], ans, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        rec(nums, target, ans, new ArrayList<>(), 0);
        return new ArrayList<>(ans);
    }
}
