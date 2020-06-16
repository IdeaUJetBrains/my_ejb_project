package timer

import jakarta.ejb.Singleton
import jakarta.ejb.Startup
import jakarta.enterprise.event.Observes
import java.util.concurrent.CopyOnWriteArrayList

@Startup
@Singleton
class PingsListener {
    val pings: MutableList<Ping> = CopyOnWriteArrayList()
    fun listen(@Observes ping: Ping) {
        println("ping = $ping")
        pings.add(ping)
    }

    fun getPings(): List<Ping> {
        return pings
    }
}