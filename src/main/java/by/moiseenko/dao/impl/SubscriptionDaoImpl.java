package by.moiseenko.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import by.moiseenko.dao.SubscriptionDao;
import by.moiseenko.entity.Subscription;
import by.moiseenko.mapper.SubscriptionMapper;

@Repository
public class SubscriptionDaoImpl implements SubscriptionDao {

    private final String SQL_ADD_SUBSCRIBE_FOR_USER_BY_ID = "INSERT INTO subscribes (user_id, periodical_id, total_price, months_of_subscription, date_begin_subscribe, date_end_subscribe) VALUE (?, ?, ?, ?, ?, ?)";
    private final String SQL_GET_USER_SUBSCRIBES_BY_USER_ID = "SELECT subscribes.id AS ID, subscribes.total_price AS TOTAL_PRICE, subscribes.paid AS PAID, subscribes.months_of_subscription AS MONTHS_OF_SUBSCRIPTION, subscribes.date_begin_subscribe AS BEGIN_DATE, subscribes.date_end_subscribe AS END_DATE, subscribes.payment_status AS PAYMENT_STATUS, subscribes.active AS ACTIVE, periodicals.id AS PERIODICAL_ID, periodicals.title AS PERIODICAL_TITLE FROM subscribes JOIN periodicals ON subscribes.periodical_id = periodicals.id WHERE user_id = ?";
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public SubscriptionDaoImpl(JdbcTemplate jdbcTemplate) {
	super();
	this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addSubscribeForUserById(Subscription subscribe, int user_id) {
	jdbcTemplate.update(SQL_ADD_SUBSCRIBE_FOR_USER_BY_ID, user_id, subscribe.getPeriodical().getId(),
		subscribe.getTotalPrice(), subscribe.getMonthSubscribed(), subscribe.getDateBeginSubscribe(),
		subscribe.getDateEndSubscribe());

    }

    @Override
    public List<Subscription> getSubscribeForUserById(int user_id) {
	return jdbcTemplate.query(SQL_GET_USER_SUBSCRIBES_BY_USER_ID, new Object[] { user_id },
		new SubscriptionMapper());

    }

}
