package timer

import jakarta.ejb.*
import jakarta.enterprise.event.Event
import jakarta.inject.Inject

/**
 * @author Jacek Jackowiak
 */
@Startup
@Singleton
class SchedulesTimerBean {
    @Inject
    var pingEvent: Event<Ping>? = null

    @Schedules(Schedule(hour = "*", minute = "*", second = "*/5", info = "Every 5 second timer"), Schedule(hour = "*", minute = "*", second = "*/10", info = "Every 10 second timer"))
    fun automaticallyScheduled(timer: Timer) {
        pingEvent!!.fire(timer.Ping(timer.info.toString()))
    }
}