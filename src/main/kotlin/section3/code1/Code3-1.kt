package section3.code1

import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

val singleThreadDispatcher = newSingleThreadContext("SingleThread")

fun main(): Unit = runBlocking {
    launch(singleThreadDispatcher) {
        println("[${Thread.currentThread().name}] 실행")
    }
}
