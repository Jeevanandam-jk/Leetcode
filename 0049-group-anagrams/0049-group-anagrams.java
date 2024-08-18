class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap <String, List<String>> res = new HashMap<>();
        for (String str:strs)
        {
            char ch [] = str.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if (!res.containsKey(key))
            {
                res.put(key, new ArrayList<>());
            }
            res.get(key).add(str);
        }   
        return new ArrayList<>(res.values());
    }
}