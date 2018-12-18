package by.moiseenko.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Subscribe {

    private int id;
    private BigDecimal totalPrice;
    private BigDecimal paid;
    private int monthSubscribed;
    private Periodical periodical;
    private User user;

    private Date dateBeginSubscribe;
    private Date dateEndSubscribe;
    private boolean paymentStatus;
    private boolean subscribeStatus;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public BigDecimal getTotalPrice() {
	return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
	this.totalPrice = totalPrice;
    }

    public BigDecimal getPaid() {
	return paid;
    }

    public void setPaid(BigDecimal paid) {
	this.paid = paid;
    }

    public int getMonthSubscribed() {
	return monthSubscribed;
    }

    public void setMonthSubscribed(int monthSubscribed) {
	this.monthSubscribed = monthSubscribed;
    }

    public Periodical getPeriodical() {
	return periodical;
    }

    public void setPeriodical(Periodical periodical) {
	this.periodical = periodical;
    }

    public User getUser() {
	return user;
    }

    public void setUser(User user) {
	this.user = user;
    }

    public Date getDateBeginSubscribe() {
	return dateBeginSubscribe;
    }

    public void setDateBeginSubscribe(Date dateBeginSubscribe) {
	this.dateBeginSubscribe = dateBeginSubscribe;
    }

    public Date getDateEndSubscribe() {
	return dateEndSubscribe;
    }

    public void setDateEndSubscribe(Date dateEndSubscribe) {
	this.dateEndSubscribe = dateEndSubscribe;
    }

    public boolean isPaymentStatus() {
	return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
	this.paymentStatus = paymentStatus;
    }

    public boolean isSubscribeStatus() {
	return subscribeStatus;
    }

    public void setSubscribeStatus(boolean subscribeStatus) {
	this.subscribeStatus = subscribeStatus;
    }

    @Override
    public String toString() {
	return "Subscribe [id=" + id + ", totalPrice=" + totalPrice + ", paid=" + paid + ", monthSubscribed="
		+ monthSubscribed + ", periodical=" + periodical + ", user=" + user + ", dateBeginSubscribe="
		+ dateBeginSubscribe + ", dateEndSubscribe=" + dateEndSubscribe + ", paymentStatus=" + paymentStatus
		+ ", subscribeStatus=" + subscribeStatus + "]";
    }

}
