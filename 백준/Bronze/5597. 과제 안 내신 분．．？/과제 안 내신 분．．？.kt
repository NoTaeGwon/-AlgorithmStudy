package KotlinBaekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = BooleanArray(31)

    for (i in 1..28) {
        array[br.readLine().toInt()] = true
    }

    for (i in 1..30) {
        if (!array[i]) {
            bw.write("$i \n")
        }
    }

    bw.close()
}