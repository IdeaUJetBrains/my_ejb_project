package timer

import jakarta.annotation.PostConstruct
import jakarta.annotation.Resource
import jakarta.ejb.*
import jakarta.enterprise.event.Event
import jakarta.inject.Inject

/**
 * author: Jacek Jackowiak
 */
@Startup
@Singleton
class ProgrammaticTimerBean {
    @Inject
    var pingEvent: Event<Ping>? = null

    @Resource
    var timerService: TimerService? = null

    @PostConstruct
    fun initialize() {
        val scheduleExpression = ScheduleExpression()
                .hour("*")
                .minute("*")
                .second("*/5")
        val timerConfig = TimerConfig()
        timerConfig.info = "Every 5 second timer"
        timerService!!.createCalendarTimer(scheduleExpression, timerConfig)
    }

    @Timeout
    fun programmaticTimout(timer: Timer) {
        pingEvent!!.fire(timer.Ping(timer.info.toString()))
    }
}