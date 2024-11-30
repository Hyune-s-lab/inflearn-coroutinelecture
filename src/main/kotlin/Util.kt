import kotlinx.coroutines.Job

fun getElapsedTime(startTime: Long): String {
    return "지난 시간: ${System.currentTimeMillis() - startTime} ms"
}

fun printJobState(job: Job) {
    println(
        """
Job State
isActive >> ${job.isActive}
isCancelled >> ${job.isCancelled}
isCompleted >> ${job.isCompleted}
     """.trimMargin()
    )
}
