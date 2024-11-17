package section6

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    val startTime = System.currentTimeMillis()

    val participantDeferred1 = async(Dispatchers.IO) {
        println("participantDeferred1")
        delay(1000L)
        return@async arrayOf("철수", "영수")
    }

    val participantDeferred2 = async(Dispatchers.IO) {
        println("participantDeferred2")
        delay(1000L)
        return@async arrayOf("영희")
    }

    val participants1 = participantDeferred1.await()
    val participants2 = participantDeferred2.await()

    println("[${getElapsedTime(startTime)}] 참여자 목록: ${listOf(*participants1, *participants2)}")
}

fun getElapsedTime(startTime: Long): String {
    return "지난 시간: ${System.currentTimeMillis() - startTime} ms"
}
