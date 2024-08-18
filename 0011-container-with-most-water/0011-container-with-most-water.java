class Solution
{
    public int maxArea(int[] height)
    {
        int start = 0, end = height.length-1;
        int dummy , min, res = 0;
        while(start < end)
        {
           min = Math.min(height[start] , height[end]);
           dummy = min*(end - start);
           if(dummy > res)
           {
             res =  dummy;
           }
           if(height[start] <= height[end])
           {
             start++;
           }
           else
           {
              end--;
           }

        }
        return res;
    }
}