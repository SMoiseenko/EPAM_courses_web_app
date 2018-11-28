package by.moiseenko.entity;

import java.math.BigDecimal;

public class Newspaper {
    private int id;
    private String issn;
    private String title;
    private String description;
    private int qtyPerYear;
    private BigDecimal price;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

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

    public String getDescription() {
	return description;
    }

    public void setDescription(String discription) {
	this.description = discription;
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
	return id + " " + issn + " " + title + " " + qtyPerYear + " " + price;
    }
}
