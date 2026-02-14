package behavioral.observer_pattern.users;

import behavioral.observer_pattern.stocks.StockNotifierInterface;

public class EmailNotification implements UserNotificationInterface {
    StockNotifierInterface notifier;
    String user_name;

    public EmailNotification(String user_name, StockNotifierInterface notifier){
        this.notifier = notifier;
        this.user_name = user_name;
    }

    @Override
    public String getUserData(){
        return user_name;
    }

    @Override
    public StockNotifierInterface getStockNotifier(){
        return notifier;
    }
    
    @Override
    public void setStockNotifier(StockNotifierInterface notifier){
        this.notifier = notifier;
    }

    @Override
    public void updateUser(){
        System.out.println("Email sent to User: "+user_name+" for the stock of "+notifier.getStockName());
    }
}
