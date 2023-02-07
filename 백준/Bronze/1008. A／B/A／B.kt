import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
   val br = StringTokenizer(readLine())
   val a = br.nextToken().toDouble()
   val b = br.nextToken().toDouble()

   println(a / b)
}

