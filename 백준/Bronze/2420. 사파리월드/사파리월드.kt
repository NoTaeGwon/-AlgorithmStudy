import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val br = StringTokenizer(readLine())
    val a = br.nextToken().toLong()
    val b = br.nextToken().toLong()

    println(abs(a - b))
}

