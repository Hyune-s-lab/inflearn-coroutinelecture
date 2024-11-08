package section2.code1

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    println("[${Thread.currentThread().name}] runBlocking 코루틴 실행")

    launch {
        println("[${Thread.currentThread().name}] launch 코루틴 실행")
    }
}
