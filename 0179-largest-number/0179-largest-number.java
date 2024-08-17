class Solution {
    public String largestNumber(int[] nums)
    {
        int n = nums.length;
        if (n==1)
        {
            return String.valueOf(nums[0]);
        }
        int i,j,f=0;
        for (i=0;i<n-1;i++)
        {
            
            for (j=i+1;j<n;j++)
            {
                String str1 = String.valueOf(nums[i]);
                String str2 = String.valueOf(nums[j]);
                String s1 = str1+str2;
                String s2 = str2+str1;
                
                if (s2.compareTo(s1)>0)
                {
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                
                if (nums[i]!=0)
                {
                    f=1;
                }
            }
        }
            if (f==0)
            {
                return "0";
            }
        
        String res = "";
        for (i=0;i<n;i++)
        {
            res += String.valueOf(nums[i]);
        }
        return res;
    }
}