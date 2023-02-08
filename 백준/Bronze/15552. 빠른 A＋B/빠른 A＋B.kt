import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var br = StringTokenizer(readLine())

    var t = br.nextToken().toInt()

    for (i in 1..t) {
        br = StringTokenizer(readLine())
        var a = br.nextToken().toInt()
        var b = br.nextToken().toInt()

        bw.write("${a+b}\n")
    }

    bw.flush()
}

