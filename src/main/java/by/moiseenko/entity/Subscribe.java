package by.moiseenko.entity;

import java.math.BigDecimal;

public class Subscribe {
    private int id;
    private User user;
    private BigDecimal price;
    private int monthSubscribed;
    private Periodical periodical;
    private int time;
    private String status;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public User getUser() {
	return user;
    }

    public void setUser(User user) {
	this.user = user;
    }

    public BigDecimal getPrice() {
	return price;
    }

    public void setPrice(BigDecimal price) {
	this.price = price;
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

    public int getTime() {
	return time;
    }

    public void setTime(int time) {
	this.time = time;
    }

    public String getStatus() {
	return status;
    }

    public void setStatus(String status) {
	this.status = status;
    }

    @Override
    public String toString() {
	return "Subscribe [id=" + id + ", user=" + user + ", price=" + price + ", monthSubscribed=" + monthSubscribed
		+ ", periodical=" + periodical + ", time=" + time + ", status=" + status + "]";
    }

}
