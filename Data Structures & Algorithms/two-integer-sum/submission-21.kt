class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result = ArrayList<Int>()
        var flag = false
        for (i in nums.indices){
            for(j in nums.indices){
                if(i != j && nums[i] + nums[j] == target){
                    return intArrayOf(i,j)
                    // result.add(i)
                    // result.add(j)
                    // break
                }
            }
        }
        return intArrayOf()
    }
}
