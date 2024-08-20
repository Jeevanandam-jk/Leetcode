class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int i,c=0,scope=nums.length-1;
        for (i=0;i<nums.length;i++)
        {
            if (target==nums[i])
            c=i;
            if (nums[scope]<target)
            c=scope+1;
            if (nums[scope]>target)
            {
                scope--;
            }
 
        }   
        return c;
    }
}