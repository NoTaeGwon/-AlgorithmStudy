import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val grade = br.readLine() // 성적
    var point = 0.0 // 점수

    when(grade) {
        "A+" -> point = 4.3
        "A0" -> point = 4.0
        "A-" -> point = 3.7
        "B+" -> point = 3.3
        "B0" -> point = 3.0
        "B-" -> point = 2.7
        "C+" -> point = 2.3
        "C0" -> point = 2.0
        "C-" -> point = 1.7
        "D+" -> point = 1.3
        "D0" -> point = 1.0
        "D-" -> point = 0.7
        "F" -> point = 0.0
    }
    bw.write("$point")

    bw.flush()
}