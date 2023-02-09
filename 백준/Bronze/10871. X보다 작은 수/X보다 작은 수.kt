import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.`out`))
    var stk = StringTokenizer(br.readLine())

    val N: Int = stk.nextToken().toInt()
    var x = stk.nextToken().toInt()

    var array = IntArray(N)

    stk = StringTokenizer(br.readLine())

    repeat(N) {
        array[it] = stk.nextToken().toInt()
    }

    array.forEach {
        if (it < x ) {
            bw.write("${it} ")
        }
    }

//    for (i in 0..array.size - 1) {
//        if (array[i] < x ) {
//            bw.write("${array[i]} ")
//        }
//    }

    bw.flush()
    bw.close()
}