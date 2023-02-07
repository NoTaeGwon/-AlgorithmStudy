import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
   val br = StringTokenizer(readLine())
   val a = br.nextToken().toInt()
   val b = br.nextToken().toInt()

   if (a < b) {
      println("<")
   } else if (a > b) {
      println(">")
   } else println("==")
}

