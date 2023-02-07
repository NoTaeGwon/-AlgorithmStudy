import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
   val br = StringTokenizer(readLine())
   val a = br.nextToken().toInt()

   if (a % 4 == 0 && (a % 400 == 0 || a % 100 != 0)) {
      println("1")
   } else println("0")
}

