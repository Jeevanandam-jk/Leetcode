class Solution {
    public boolean isPalindrome(int x) 
    {
        int temp=x;
        int sum=0;
        while (x>0)
        {
            sum=(sum*10)+(x%10);
            x=x/10;
        }
        if (sum==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}