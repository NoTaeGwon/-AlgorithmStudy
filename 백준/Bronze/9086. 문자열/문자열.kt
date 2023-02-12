import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val T = br.readLine().toInt()
    val stb = StringBuilder()

    repeat(T) {
        var str = br.readLine()
        stb.append(str[0])
        stb.append(str[str.length - 1] + "\n")
    }

    bw.write("$stb")
    bw.flush()
}