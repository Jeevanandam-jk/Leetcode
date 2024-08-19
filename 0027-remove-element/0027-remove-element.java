class Solution {
    public int removeElement(int[] nums, int val)
    {
        int i,count=0;
        for (i=0;i<nums.length;i++)
        {
            if (nums[i]!=val)
            {
                count++;
            }
            else {
                nums[i]=51;
            }
            
        }
        Arrays.sort(nums);
        return count;
    }
}