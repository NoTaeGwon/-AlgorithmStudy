import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    var br = StringTokenizer(readLine())
    val t = br.nextToken().toInt()
    for (i in 1..t) {
        br = StringTokenizer(readLine())
        var a = br.nextToken().toInt()
        var b = br.nextToken().toInt()
        println(a + b)
    }
}

