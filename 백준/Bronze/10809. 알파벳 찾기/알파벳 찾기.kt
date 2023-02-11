import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val S = br.readLine()
    var arr = Array(26, {-1})

    for (i in 0 until S.length) {
        var ch = S[i]

        if (arr[ch - 'a'] == -1) {
            arr[ch - 'a'] = i
        }
    }

    arr.forEach {
        bw.write("$it ")
    }

    bw.flush()

}