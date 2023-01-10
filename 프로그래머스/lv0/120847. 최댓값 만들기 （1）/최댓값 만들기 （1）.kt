class Solution {
    fun solution(numbers: IntArray): Int {
        val list = numbers.sorted()
        val max1 = list.last()
        val max2 = list[list.size - 2]

        return max1 * max2
    }
}