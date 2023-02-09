import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val N = br.readLine().split(" ").map { it.toInt() }
    val n = N[0]
    val m = N[1]

    var array1 = Array(n) {IntArray(m)}
    var array2 = Array(n) {IntArray(m)}

    repeat(n) {
        val stk = StringTokenizer(br.readLine())
        val i = it
        repeat(m) {
            val j = it
            array1[i][j] = stk.nextToken().toInt()
        }
    }

    repeat(n) {
        val stk = StringTokenizer(br.readLine())
        val i = it
        repeat(m) {
            val j = it
            array2[i][j] = stk.nextToken().toInt()
        }
    }

    repeat(n) {
        val i = it
        repeat(m) {
            val j = it
            bw.write("${array1[i][j] + array2[i][j]} ")
            if(j == m - 1)
                bw.write("\n")
        }
    }

    bw.flush()
}