package by.moiseenko.entity;

import java.math.BigDecimal;

public class Newspaper {
    private String issn;
    private String title;
    private String discription;
    private int qtyPerYear;
    private BigDecimal price;

    public String getIssn() {
	return issn;
    }

    public void setIssn(String issn) {
	this.issn = issn;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public String getDiscription() {
	return discription;
    }

    public void setDiscription(String discription) {
	this.discription = discription;
    }

    public int getQtyPerYear() {
	return qtyPerYear;
    }

    public void setQtyPerYear(int qtyPerYear) {
	this.qtyPerYear = qtyPerYear;
    }

    public BigDecimal getPrice() {
	return price;
    }

    public void setPrice(BigDecimal price) {
	this.price = price;
    }

    @Override
    public String toString() {
	return issn + " " + title + " " + qtyPerYear + " " + price;
    }
}
