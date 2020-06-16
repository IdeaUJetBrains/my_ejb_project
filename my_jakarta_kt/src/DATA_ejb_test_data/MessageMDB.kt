package DATA_ejb_test_data

import javax.annotation.Resource

class MessageMDB {
    @Resource(name = "insertion")
    private val insertion: String? = null

    @Resource(name = "updation")
    private val updation: String? = null
}