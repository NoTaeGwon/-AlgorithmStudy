import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val str = br.readLine()

    str.forEach {
        bw.append(
            when (it) { // it -> 입력받은 문자열 중 하나(char)
                in 'A'..'Z' -> it + 32 // 아스키 코드를 이용함 (대문자 -> 소문자)
                else -> it - 32 // (소문자 -> 대문자)
            }
        )
    }

    bw.flush()
}