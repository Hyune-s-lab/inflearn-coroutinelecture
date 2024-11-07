package section1.code2

class ExampleThread : Thread() {
    override fun run() {
        println("[${currentThread().name}] start")

        sleep(2000L)

        println("[${currentThread().name}] end")
    }
}

fun main() {
    println("[${Thread.currentThread().name}] start")

    ExampleThread().start()

    Thread.sleep(1000L)

    println("[${Thread.currentThread().name}] main end")
}
