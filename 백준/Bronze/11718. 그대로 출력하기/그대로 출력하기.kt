import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val stb = StringBuilder()

    while (true) {
        val str = br.readLine()
        if (str == null || str.isEmpty()) {
            break
        }
        stb.append(str).append("\n")
    }
    bw.write("$stb")
    bw.flush()
}