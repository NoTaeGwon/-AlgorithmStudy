import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    while (true) {
        var br = StringTokenizer(readLine())
        var a = br.nextToken().toInt()
        var b = br.nextToken().toInt()

        if (a == 0 && b == 0) {
            break
        }
        
        println(a + b)

    }
}

