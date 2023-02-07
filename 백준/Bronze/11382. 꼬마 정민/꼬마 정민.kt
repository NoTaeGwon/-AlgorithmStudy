import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
   val br = StringTokenizer(readLine())
   val a = br.nextToken().toBigInteger()
   val b = br.nextToken().toBigInteger()
   val c = br.nextToken().toBigInteger()

   println(a + b + c)
}
