class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[2];

        for(int i=0;i<n;i++){
            int d = target- nums[i];

            if(map.containsKey(d)){
                return new int[]{map.get(d),i};
            }else{
                map.put(nums[i],i);
            }
        }

        return ans;
        
    }
}
