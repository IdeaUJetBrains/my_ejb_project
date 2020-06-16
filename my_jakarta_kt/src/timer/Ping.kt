package timer

class Ping(val timeInfo: String) {
    val time = System.currentTimeMillis()

    override fun toString(): String {
        return "Ping {" +
                "timeInfo='" + timeInfo + '\'' +
                ", time=" + time +
                '}'
    }

}