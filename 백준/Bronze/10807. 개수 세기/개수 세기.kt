package KotlinBaekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    var br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val N = br.readLine().toInt()   // 받을 정수 개수
    var v = 0                       // 찾을려고 하는 정수
    var num = 0                     // v가 몇 개인지 나타내는 변수

    var array = IntArray(N)

    var stk = StringTokenizer(br.readLine())

    repeat(N) {
        array[it] = stk.nextToken().toInt()
    }

    v = br.readLine().toInt()

    array.forEach {
        if (it == v) {
            num += 1
        }
    }

    bw.write("$num")
    bw.flush()
    bw.close()
}