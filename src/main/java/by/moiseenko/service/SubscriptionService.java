package by.moiseenko.service;

import java.util.List;

import by.moiseenko.entity.Subscription;

public interface SubscriptionService {

    void addSubscribeForUserById(Subscription subscribe, int user_id, int periodical_id);

    List<Subscription> getSubscribeForUserById(int user_id);
}
