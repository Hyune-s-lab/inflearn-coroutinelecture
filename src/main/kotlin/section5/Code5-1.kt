package section5

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    val networkDeferred = async(Dispatchers.IO) {
        delay(1000L)
        return@async "Dummy Response"
    }

    val result = networkDeferred.await()
    println(result)
}
