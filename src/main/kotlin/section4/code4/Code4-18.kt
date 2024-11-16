package section4.code4

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    val job = launch(Dispatchers.IO) {
        delay(1000L)
    }
    job.cancel()
    println(job)
}
