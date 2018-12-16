package by.moiseenko.entity;

public enum UserRole {

    ADMIN, CUSTOMER, ANONYMOUS;

    private boolean active;

    public String getType() {
	return this.toString();
    }

    public boolean isActive() {
	return active;
    }

    public void setActive(boolean active) {
	this.active = active;
    }

}