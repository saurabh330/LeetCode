class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsCompliment = new HashMap<>();
        for (int idx = 0;idx < nums.length; idx++) {
            if (numsCompliment.containsKey(nums[idx])) {
                return new int[] {numsCompliment.get(nums[idx]),idx};
            } else {
                numsCompliment.put(target-nums[idx],idx);
            }
        }
        return new int[] {};
    }
}
