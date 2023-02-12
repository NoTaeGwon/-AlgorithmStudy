import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var score = br.readLine().toInt()
    
    val grade = when(score){
        in 90 .. 100 -> "A"
        in 80 until 90 -> "B"
        in 70 until 80 -> "C"
        in 60 until 70 -> "D"
        else -> "F"
    }

    bw.write("$grade")
    bw.flush()
}