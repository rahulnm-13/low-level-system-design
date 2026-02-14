package behavioral.observer_pattern.users;

import behavioral.observer_pattern.stocks.StockNotifierInterface;

public interface UserNotificationInterface {
    public String getUserData();
    public StockNotifierInterface getStockNotifier();
    public void setStockNotifier(StockNotifierInterface notifier);
    public void updateUser();
}
