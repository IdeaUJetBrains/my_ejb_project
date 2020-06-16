package DATA_ejb_test_data;

import javax.annotation.Resource;

public class MessageMDB {

    @Resource(name="insertion")
    private String insertion;

    @Resource(name="updation")
    private String updation;
}
