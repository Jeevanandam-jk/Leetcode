class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int  [] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        int i, val;
        
        for (i = 0; i < nums.length; i++)
        {
            val = target - nums[i]; // To find in the map to reach the target sum.
            
            if (map.containsKey(val)) // Check if this required value exists in the map.
            {
                res[0] = i; // The current index (where we found the number).
                
                res[1] = map.get(val);                 
                // The index of the previously stored number that together with the current number sums to the target.
                return res;
            }
            
            map.put(nums[i], i);e map.
        }
        
        return res;
    }
}