//import java.util.Stack;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Stack<Integer> Stack=new Stack<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i]) return true;
        }
        return false;
    }
}