package by.moiseenko.dao;

import java.util.List;

import by.moiseenko.entity.Subscription;

public interface SubscriptionDao {

    void addSubscribeForUserById(Subscription subscribe, int user_id);

    List<Subscription> getSubscribeForUserById(int user_id);

}
