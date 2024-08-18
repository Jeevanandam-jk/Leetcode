class Solution {
    public int numRescueBoats(int[] people, int limit) 
    {
        Arrays.sort(people);
        int count=0,start=0 , end = people.length-1;
        while (start < end)
        {
            if (people[start]==limit)
            {
                end--;
                count++;
            }
            else {
                int s = people[start]+people[end];
                if (s==limit)
                {
                    start++;
                    end--;
                    count++;
                }
                else if (s>limit)
                {
                    end--;
                    count++;
                }
                else {
                    start++;
                    end--;
                    count++;
                }

                if (start==end && people[end]<=limit)
                {
                    count++;
                }
            }
        }
        return count;
    }
}