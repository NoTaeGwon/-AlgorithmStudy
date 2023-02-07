import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val br = StringTokenizer(readLine())
    val a = br.nextToken().toInt()
    var mul = 1
    for (i in 1..a) {
        mul *= i
    }
    println(mul)
}

