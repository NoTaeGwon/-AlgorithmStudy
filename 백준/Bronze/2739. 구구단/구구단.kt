import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    var br = StringTokenizer(readLine())
    var a = br.nextToken().toInt()
    for (i in 1..9) {
        println("$a * $i = " + a * i)
    }
}

