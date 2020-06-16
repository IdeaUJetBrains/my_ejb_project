package DATA_ejb_test_data.generated;

import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(name = "MessageTestEJB")
public class MessageTestBean implements MessageListener {
    public MessageTestBean() {
    }

    @Override
    public void onMessage(Message message) {

    }
}
