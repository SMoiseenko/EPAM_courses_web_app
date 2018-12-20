package by.moiseenko.service.impl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.moiseenko.dao.PeriodicalDao;
import by.moiseenko.dao.SubscriptionDao;
import by.moiseenko.entity.Periodical;
import by.moiseenko.entity.Subscription;
import by.moiseenko.service.SubscriptionService;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    private static final Logger logger = Logger.getLogger(SubscriptionServiceImpl.class);
    private SubscriptionDao subscribeDao;
    private PeriodicalDao periodicalDao;

    @Autowired
    public SubscriptionServiceImpl(SubscriptionDao subscribeDao, PeriodicalDao periodicalDao) {
	this.subscribeDao = subscribeDao;
	this.periodicalDao = periodicalDao;
    }

    @Override
    public void addSubscribeForUserById(Subscription subscribe, int user_id, int periodical_id) {

	Periodical periodical = periodicalDao.getPeriodicalById(periodical_id);
	subscribe.setPeriodical(periodical);

	//
	subscribe.setDateBeginSubscribe(LocalDate.now());
	subscribe.setDateEndSubscribe(subscribe.getDateBeginSubscribe().plusMonths(subscribe.getMonthSubscribed()));
	BigDecimal a = BigDecimal.valueOf(periodical.getQtyPerYear() * subscribe.getMonthSubscribed() / 12);
	subscribe.setTotalPrice(periodical.getPrice().multiply(a));
	subscribe.setPaid(BigDecimal.valueOf(0));
	logger.debug(subscribe);
	//
	subscribeDao.addSubscribeForUserById(subscribe, user_id);

    }

    @Override
    public List<Subscription> getSubscribeForUserById(int user_id) {
	return subscribeDao.getSubscribeForUserById(user_id);
    }

}
