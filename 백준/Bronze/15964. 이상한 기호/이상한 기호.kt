import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun mul(a: Int, b: Int): Int {
    return (a + b) * (a - b)
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b) = br.readLine().split(" ").map { it.toInt() }

    bw.write("${mul(a, b)}")
    bw.flush()
}