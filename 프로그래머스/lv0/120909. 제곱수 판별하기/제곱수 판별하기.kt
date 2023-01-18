class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 2
        var i = 1
        do {
            var num = i * i
            if (num == n) return 1
            i++
        } while (num < n)
        return answer
    }
}