import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    var s: String?
    while (readLine().also { s = it } != null) {
        var br = StringTokenizer(s)
        var a = br.nextToken().toInt()
        var b = br.nextToken().toInt()

        println(a + b)

    }
}

