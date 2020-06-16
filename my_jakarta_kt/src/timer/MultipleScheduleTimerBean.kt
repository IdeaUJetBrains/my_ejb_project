package timer

import jakarta.ejb.Schedule
import jakarta.ejb.Singleton
import jakarta.ejb.Startup
import jakarta.ejb.Timer
import jakarta.enterprise.event.Event
import jakarta.inject.Inject

/**
 * @author Jacek Jackowiak
 */
@Startup
@Singleton
class MultipleScheduleTimerBean {
    @Inject
    var pingEvent: Event<Ping>? = null

    @Schedule(hour = "*", minute = "*", second = "*/5", info = "Every 5 second timer")
    fun fastAutomaticallyScheduled(timer: Timer) {
        fireEvent(timer)
    }

    @Schedule(hour = "*", minute = "*", second = "*/10", info = "Every 10 second timer")
    fun slowlyAutomaticallyScheduled(timer: Timer) {
        fireEvent(timer)
    }

    private fun fireEvent(timer: Timer) {
        pingEvent!!.fire(timer.Ping(timer.info.toString()))
    }
}