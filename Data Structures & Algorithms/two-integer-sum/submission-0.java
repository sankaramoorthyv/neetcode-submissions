class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        if(nums==null || nums.length<2){
            return new int[]{-1,-1};
        
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];

            if(map.containsKey(complement)){
                int j = map.get(complement);

                return j<i ? new int[]{j,i}: new int[]{i,j}; 
            }

            map.put(nums[i],i);
        }

        return new int[]{-1,-1};



    }
}
