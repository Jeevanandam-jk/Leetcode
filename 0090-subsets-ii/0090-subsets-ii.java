class Solution
{
    public void solve(int[] nums, List<Integer> list,List<List<Integer>> result,int i)
    {
        if(i==nums.length)
        {
           result.add(new ArrayList<>(list)); 
           return;
        }
        else
        {
           list.add(nums[i]); 
           solve(nums,list,result,i+1); 
           list.remove(list.size()-1); 
           while (i + 1 < nums.length && nums[i] == nums[i + 1]) 
           {
              i++;
           }
           solve(nums,list,result,i+1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>(); 
        List<Integer> list = new ArrayList<>(); 
        solve(nums,list,result,0); 
        return result; 
    }
}