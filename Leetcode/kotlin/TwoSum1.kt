fun main() {
    print(twoSum(intArrayOf(3,3), 6)[0])
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var x = 0
    var y = x+1
    do {
        when {
            y == nums.size -> {
                ++x
                y = x+1
            }
            nums[x] + nums[y] != target -> y++
            nums[x] + nums[y] == target -> return intArrayOf(x, y)
        }
    } while(x != nums.size - 1)
    return intArrayOf(0)
}
// 256ms | 37.95mb
/* 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/