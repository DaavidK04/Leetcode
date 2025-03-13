import java.util.HashMap;


/*This method solves the two sum problem in O(n) time.
Given an unsorted array of integers and a target value, the goal is to return the indices
of the two numbers that add up to the target value.
 */
public class NumberOne_TwoSum {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hm.containsKey(complement)) {
                //return indices
                return new int[]{hm.get(complement), i};
            }
            //save curent number and its index
            hm.put(nums[i], i);
        }
        //no sum found
        return null;
    }
}
