class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        int i=0,j=0,count=0;
        while (i<jewels.length())
        {
            if (jewels.charAt(i)==stones.charAt(j))
            { 
                count++; 
            }
                j++;
            
            if (j==stones.length())
            {
                i++;
                j=0;
            }
        }
        return count; 
    }
}