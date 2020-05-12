public class Solution{

public int singleNonDuplicate(int[] nums) 
{
        //You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. Find this single element that appears only once.
        
        if(nums.length % 2 == 0)
            return -1;
            
        for(int i=0; i<nums.length-1; i=i+2)
        {
            if(nums[i] != nums[i+1])
                return nums[i];
        }
        
        return nums[nums.length-1];
}

public static void main(String [] args)
{
	Solution s = new Solution();

	int [] arr = {3,3,6};
        int res = s.singleNonDuplicate(arr);
        System.out.println(res);
}

}