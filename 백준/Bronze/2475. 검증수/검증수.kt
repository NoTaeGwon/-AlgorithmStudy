package KotlinBaekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

// 검증수: 고유번호의 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n1, n2, n3, n4, n5) = br.readLine().split(" ").map { it.toInt() }
    val num = ((n1 * n1) + (n2 * n2) + (n3 * n3) + (n4 * n4) + (n5 * n5)) % 10

    bw.write("$num")
    bw.flush()
}