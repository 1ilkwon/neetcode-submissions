class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length){
            return false
        }

        var sArr = mutableListOf<Char>()
        var tArr = mutableListOf<Char>()

        for(i in s.indices){
            sArr.add(s[i]) 
            tArr.add(t[i])
        }

        return sArr.sorted() == tArr.sorted()
        
    
        // for (i in 0 until sArr.size){
        //     if(sArr.get(i) != tArr.get(i)){
        //         return false
        //     }
        // }

    }
}
