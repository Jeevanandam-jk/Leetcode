class Solution {
    public int romanToInt(String s) 
    {
        HashMap <Character,Integer> Map = new HashMap<>();

        Map.put('I',1);
        Map.put('V', 5);
        Map.put('X', 10);
        Map.put('L', 50);
        Map.put('C', 100);
        Map.put('D',500);
        Map.put('M',1000);

        int i,ans=0;
        for (i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if (i+1<s.length() && Map.get(s.charAt(i+1)) > Map.get(c)) 
            {
                ans += Map.get(s.charAt(i+1)) - Map.get(c);
                i+=1;
            }
            else 
            {
                ans += Map.get(c);
            }
            
        }
        return ans;
    }
}