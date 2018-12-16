package by.moiseenko.entity.periodical;

import java.math.BigDecimal;

public class Periodical {

    private int id;
    private String issn;
    private PeriodicalType periodicalType;
    private String title;
    private String description;
    private int qtyPerYear;
    private BigDecimal price;
    private boolean active;

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

    public PeriodicalType getPeriodicalType() {
	return periodicalType;
    }

    public void setPeriodicalType(PeriodicalType periodicalType) {
	this.periodicalType = periodicalType;
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

    public void setDescription(String description) {
	this.description = description;
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

    public boolean isActive() {
	return active;
    }

    public void setActive(boolean active) {
	this.active = active;
    }

    @Override
    public String toString() {
	return "Periodical [id=" + id + ", issn=" + issn + ", periodicalType=" + periodicalType + ", title=" + title
		+ ", description=" + description + ", qtyPerYear=" + qtyPerYear + ", price=" + price + ", active="
		+ active + "]";
    }

}
