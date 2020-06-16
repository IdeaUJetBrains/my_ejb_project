package timer

import jakarta.annotation.Resource
import jakarta.ejb.Schedule
import jakarta.ejb.SessionContext
import jakarta.ejb.Singleton
import jakarta.ejb.Startup
import jakarta.enterprise.event.Event
import jakarta.inject.Inject

/**
 * @author Arun Gupta
 */
@Startup
@Singleton
class AutomaticTimerBean {
    @Resource
    var ctx: SessionContext? = null

    @Inject
    var pingEvent: Event<Ping>? = null

    @Schedule(hour = "*", minute = "*", second = "*/5", info = "Every 5 second timer")
    fun printDate() {
        val timers = ctx!!.timerService.allTimers
        for (t in timers) {
            pingEvent!!.fire(Ping(t.info.toString()))
        }
    }
}