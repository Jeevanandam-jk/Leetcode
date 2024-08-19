class Solution {
    public int singleNumber(int[] nums) 
    {
        Arrays.sort(nums);
        int i,res=0;
        if (nums.length > 1 && nums[0] != nums[1]) {
            return nums[0];
        }
        if (nums.length==1)
        {
            return nums[0];
        }
        for (i=1;i<nums.length;i++)
        {
            if (i==0){
                if (nums[i]!=nums[i+1])
                return nums[i];
            }
            else if (i==nums.length-1)
            {
                if(nums[i]!=nums[i-1])
                return nums[i];
            }
            else
            {
                if ( nums[i]!= nums[i-1] && nums[i] != nums[i+1])
                return nums[i];
            }
        }
        return -1;
    }
}