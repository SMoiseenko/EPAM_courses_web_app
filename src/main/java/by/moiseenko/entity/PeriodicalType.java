package by.moiseenko.entity;

public enum PeriodicalType {

    NEWSPAPPER("newspaper"), COMIC("comic"), SCIENCE_MAGAZINE("science magazine");

    private String type;
    private boolean active;

    PeriodicalType(String type) {
	this.type = type;
    }

    public String getType() {
	return type;
    }

    public boolean isActive() {
	return active;
    }

    public void setActive(boolean active) {
	this.active = active;
    }

}
