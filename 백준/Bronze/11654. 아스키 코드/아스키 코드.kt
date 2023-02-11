import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var ch = StringTokenizer(br.readLine()).nextToken()[0]
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${ch.toInt()}")

    bw.flush()
}