package DATA_ejb_test_data.generated;

import jakarta.jms.Message;
import jakarta.jms.MessageListener;

import javax.ejb.MessageDriven;

@MessageDriven(name = "MessageTest1EJB")
public class MessageTest1Bean implements MessageListener {
    public MessageTest1Bean() {
    }

    @Override
    public void onMessage(Message message) {

    }
}
