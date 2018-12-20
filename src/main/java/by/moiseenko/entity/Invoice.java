package by.moiseenko.entity;

import java.math.BigDecimal;

public class Invoice {
    private int id;
    private Subscription subscribe;
    private BigDecimal cost;
    private boolean paid;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public Subscription getSubscribe() {
	return subscribe;
    }

    public void setSubscribe(Subscription subscribe) {
	this.subscribe = subscribe;
    }

    public BigDecimal getCost() {
	return cost;
    }

    public void setCost(BigDecimal cost) {
	this.cost = cost;
    }

    public boolean isPaid() {
	return paid;
    }

    public void setPaid(boolean paid) {
	this.paid = paid;
    }

    @Override
    public String toString() {
	return "Invoice [id=" + id + ", subscribe=" + subscribe + ", cost=" + cost + ", paid=" + paid + "]";
    }

}
