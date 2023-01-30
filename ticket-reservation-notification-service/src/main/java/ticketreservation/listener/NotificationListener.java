package ticketreservation.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import ticketreservation.model.User;


@Component
public class NotificationListener {

    @RabbitListener(queues = "ticket-reservation-notification")
    public void notificationListener(User user){

        System.out.printf("%s ,%s , %s, %s", user.getName(), user.getEmail(), user.getPassword(), user.getPhoneNumber());
    }
}
