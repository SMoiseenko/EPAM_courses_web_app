package by.moiseenko.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import by.moiseenko.entity.Periodical;
import by.moiseenko.entity.Subscription;

public class SubscriptionMapper implements RowMapper<Subscription> {

    @Override
    public Subscription mapRow(ResultSet rs, int rowNum) throws SQLException {
	Subscription subscribe = new Subscription();
	Periodical periodical = new Periodical();
	periodical.setId(rs.getInt("PERIODICAL_ID"));
	periodical.setTitle(rs.getString("PERIODICAL_TITLE"));
	subscribe.setPeriodical(periodical);
	subscribe.setId(rs.getInt("ID"));
	subscribe.setTotalPrice(rs.getBigDecimal("TOTAL_PRICE"));
	subscribe.setPaid(rs.getBigDecimal("PAID"));
	subscribe.setMonthSubscribed(rs.getInt("MONTHS_OF_SUBSCRIPTION"));
	subscribe.setDateBeginSubscribe(rs.getDate("BEGIN_DATE").toLocalDate());
	subscribe.setDateEndSubscribe(rs.getDate("END_DATE").toLocalDate());
	subscribe.setPaymentStatus(rs.getBoolean("PAYMENT_STATUS"));
	subscribe.setActive(rs.getBoolean("ACTIVE"));
	return subscribe;
    }

}
