package by.moiseenko.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Subscription {

    private int id;
    private BigDecimal totalPrice;
    private BigDecimal paid;
    private int monthSubscribed;
    private Periodical periodical;
    private LocalDate dateBeginSubscribe;
    private LocalDate dateEndSubscribe;
    private boolean paymentStatus;
    private boolean active;

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

    public LocalDate getDateBeginSubscribe() {
	return dateBeginSubscribe;
    }

    public void setDateBeginSubscribe(LocalDate dateBeginSubscribe) {
	this.dateBeginSubscribe = dateBeginSubscribe;
    }

    public LocalDate getDateEndSubscribe() {
	return dateEndSubscribe;
    }

    public void setDateEndSubscribe(LocalDate dateEndSubscribe) {
	this.dateEndSubscribe = dateEndSubscribe;
    }

    public boolean isPaymentStatus() {
	return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
	this.paymentStatus = paymentStatus;
    }

    public boolean isActive() {
	return active;
    }

    public void setActive(boolean active) {
	this.active = active;
    }

    @Override
    public String toString() {
	return "Subscribe [id=" + id + ", totalPrice=" + totalPrice + ", paid=" + paid + ", monthSubscribed="
		+ monthSubscribed + ", periodical=" + periodical + ", dateBeginSubscribe=" + dateBeginSubscribe
		+ ", dateEndSubscribe=" + dateEndSubscribe + ", paymentStatus=" + paymentStatus + ", active=" + active
		+ "]";
    }

}
