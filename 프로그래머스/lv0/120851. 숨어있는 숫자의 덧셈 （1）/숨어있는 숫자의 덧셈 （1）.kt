class Solution {
    fun solution(str: String): Int {
        val array = str.split("")
        var result = 0
        for (i in array.indices) {
            if (array[i].toIntOrNull() != null) {
                result += array[i].toInt()
            }
        }
        return result
    }
}