package section8

import kotlinx.coroutines.*

fun main(): Unit = runBlocking {
    val parentJob = launch(Dispatchers.IO) {
        val dbResultDeferred = listOf("db1", "db2", "db3").map {
            async {
                delay(1000L)
                println("${it}로부터 데이터를 가져오는데 성공했습니다")
                return@async "[${it}] data"
            }
        }
        val dbResults = dbResultDeferred.awaitAll()
        println(dbResults)
    }

    parentJob.cancel()
}
