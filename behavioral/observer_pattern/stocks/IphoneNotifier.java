package behavioral.observer_pattern.stocks;

import behavioral.observer_pattern.users.*;
import java.util.ArrayList;
import java.util.List;

public class IphoneNotifier implements StockNotifierInterface {
    List<UserNotificationInterface> users;
    int current_stock;

    public IphoneNotifier(){
        users = new ArrayList<>();
        current_stock = 0;
    }

    @Override
    public void incrementStock(int val){
        current_stock += val;
        notifyStock();
    }

    @Override
    public void decrementStock(int val){
        current_stock -= val;
    }

    @Override
    public int getStockValue(){
        return current_stock;
    }

    @Override
    public void addUserToNotifyList(UserNotificationInterface user){
        users.add(user);
    }

    @Override
    public void removeUserFromNotifyList(UserNotificationInterface user){
        users.remove(user);
    }

    @Override
    public void notifyStock(){
        System.out.println("Iphone stock is back");
        for(UserNotificationInterface user : users){
            user.updateUser();
        }
    }

    @Override
    public String getStockName(){
        return "Iphone";
    }
}
