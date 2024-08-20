class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int  [] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        int i,val;
        for (i=0;i<nums.length;i++)
        {
            val = target-nums[i];
            if (map.containsKey(val))
            {
                res[0]=i;
                res[1]=map.get(val);
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}