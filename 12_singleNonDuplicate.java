public class Solution
{

//input example : int [] arr = {3,3,6};

  public int singleNonDuplicate(int[] nums) 
  {
          //if nums has even elements, either all are in pairs or 2 non duplicates exist. so return error code.
          if(nums.length % 2 == 0)
              return -1;

          for(int i=0; i<nums.length-1; i=i+2)
          {
              if(nums[i] != nums[i+1])
                  return nums[i];
          }

          //if all but last elements are in pair - that means last one is non duplicate. Return that.
          return nums[nums.length-1];
  }
}
