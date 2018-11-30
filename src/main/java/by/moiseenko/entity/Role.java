package by.moiseenko.entity;

public class Role {

    private int id;
    private String role;
    private boolean active;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getRole() {
	return role;
    }

    public void setRole(String role) {
	this.role = role;
    }

    public boolean isActive() {
	return active;
    }

    public void setActive(boolean active) {
	this.active = active;
    }

    @Override
    public String toString() {
	return "Role [id=" + id + ", role=" + role + ", role=" + active + "]";
    }

}
