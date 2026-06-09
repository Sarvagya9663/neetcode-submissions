class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> indices = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            indices.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int d = target - nums[i];
            if(indices.containsKey(d) && indices.get(d) != i){
                return new int[]{i, indices.get(d)};
            }
        }
        return new int[0];
    }
}
