package async

import jakarta.ejb.AsyncResult
import jakarta.ejb.Asynchronous
import jakarta.ejb.Stateless
import java.util.concurrent.Future
import java.util.logging.Level
import java.util.logging.Logger

/**
 * @author Arun Gupta
 */
@Stateless
class MyAsyncBeanMethodLevel {
    @Asynchronous
    fun addNumbers(n1: Int, n2: Int): Future<Int?> {
        try {
            // simulating a long running query
            Thread.sleep(AWAIT)
        } catch (ex: InterruptedException) {
            Logger.getLogger(MyAsyncBeanMethodLevel::class.java.name).log(Level.SEVERE, null, ex)
        }
        return AsyncResult<Any?>(n1 + n2)
    }

    companion object {
        const val AWAIT: Long = 3000
    }
}