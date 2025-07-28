class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {int diff=target-nums[i];
        
        if(map.containsKey(diff))
        {
            return new int[]{map.get(diff),i};
        }
        map.put(nums[i],i);
        }
         return null;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n)

//"Can you improve space complexity?"
//Yes, but only with a brute-force solution using nested loops. 
// It would reduce space to O(1) but time complexity becomes O(n²), which is not ideal.

//If sorted or nested loops are used, the time complexity would be O(n log n) or O(n^2).