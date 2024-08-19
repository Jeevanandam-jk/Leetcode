class Solution
{
    public int removeDuplicates(int[] nums)
    {
        int start = 1,end;

        for(end = 1 ; end < nums.length ; end++)
        {
            if(nums[end-1] != nums[end])
            {
                nums[start] = nums[end];
                start++;
            } 
        }

        return start;
        
    }
}