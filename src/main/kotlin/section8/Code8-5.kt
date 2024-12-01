package section8

import kotlinx.coroutines.*

fun main() {
    val newScope = CoroutineScope(CoroutineName("MyCoroutine") + Dispatchers.IO)
    newScope.launch(context = CoroutineName("LaunchCoroutine")) {
        println("newScope의 coroutineContext: ${newScope.coroutineContext}")
        println("launch의 coroutineContext: ${this.coroutineContext}")
        println("launch의 parentJob: ${this.coroutineContext[Job]?.parent}")
    }
    Thread.sleep(1000L)
}
