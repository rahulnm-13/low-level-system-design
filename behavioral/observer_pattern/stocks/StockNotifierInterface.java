package behavioral.observer_pattern.stocks;

import behavioral.observer_pattern.users.*;

public interface StockNotifierInterface {
    public void notifyStock();
    public void incrementStock(int val);
    public void decrementStock(int val);
    public int getStockValue();
    public String getStockName();
    public void addUserToNotifyList(UserNotificationInterface user);
    public void removeUserFromNotifyList(UserNotificationInterface user);
    
}
