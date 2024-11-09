package section3.code1

import kotlinx.coroutines.launch
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.runBlocking

val multiThreadDispatcher = newFixedThreadPoolContext(2, "MultiThread")

fun main(): Unit = runBlocking {
    launch(multiThreadDispatcher) {
        println("[${Thread.currentThread().name}] 실행")
    }

    launch(multiThreadDispatcher) {
        println("[${Thread.currentThread().name}] 실행")
    }
}
