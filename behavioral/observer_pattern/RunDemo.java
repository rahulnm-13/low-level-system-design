package behavioral.observer_pattern;

import behavioral.observer_pattern.stocks.IphoneNotifier;
import behavioral.observer_pattern.stocks.StockNotifierInterface;
import behavioral.observer_pattern.users.UserNotificationInterface;
import behavioral.observer_pattern.users.EmailNotification;
import behavioral.observer_pattern.users.SmsNotification;

public class RunDemo {
    public static void main(String[] args) {
        StockNotifierInterface notifier = new IphoneNotifier();
        UserNotificationInterface user1 = new EmailNotification("Rahul", notifier);
        UserNotificationInterface user2 = new SmsNotification("Muddu", notifier);

        notifier.addUserToNotifyList(user1);
        notifier.addUserToNotifyList(user2);
        notifier.incrementStock(10);

    }
}
