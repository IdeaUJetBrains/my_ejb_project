package DATA_ejb_test_data.generated;

import jakarta.jms.Message;
import jakarta.jms.MessageListener;

import javax.ejb.MessageDriven;

@MessageDriven(name = "MessageTestEJB")
public class MessageTestBean implements MessageListener {
    public MessageTestBean() {
    }

    @Override
    public void onMessage(Message message) {

    }
}
