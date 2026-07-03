class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var size = nums.size-1
        for(i in 0..size){
            for(j in 0..size){
                if(nums[i] == nums[j] && i != j){
                    return true
                }
            }
        }

        return false
    }
}
