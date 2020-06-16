package timer;

import javax.annotation.Resource;
import javax.ejb.*;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import java.util.Collection;

/**
 * @author Arun Gupta
 */
@Startup
@Singleton
public class AutomaticTimerBean {

    @Resource
    SessionContext ctx;

    @Inject
    Event<Ping> pingEvent;

    @Schedule(hour = "*", minute = "*", second = "*/5", info = "Every 5 second timer")
    public void printDate() {
        Collection<Timer> timers = ctx.getTimerService().getAllTimers();
        for (Timer t : timers) {
            pingEvent.fire(new Ping(t.getInfo().toString()));
        }
    }

}
