package section4.code4

import kotlinx.coroutines.*

fun main(): Unit = runBlocking {
    val whileJob = launch(Dispatchers.Default) {
        while (this.isActive) {
            println("작업 중")
        }
    }

    delay(100L)
    whileJob.cancel()
}
