package by.moiseenko.entity;

import java.math.BigDecimal;
import java.util.List;

public class User {

    private int id;
    private String login;
    private String password;
    private Role role;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private BigDecimal balance;
    private List<Subscribe> userSubscribes;
    private boolean active;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getLogin() {
	return login;
    }

    public void setLogin(String login) {
	this.login = login;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public Role getRole() {
	return role;
    }

    public void setRole(Role role) {
	this.role = role;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getPhoneNumber() {
	return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public List<Subscribe> getUserSubscribes() {
	return userSubscribes;
    }

    public void setUserSubscribes(List<Subscribe> userSubscribes) {
	this.userSubscribes = userSubscribes;
    }

    public BigDecimal getBalance() {
	return balance;
    }

    public void setBalance(BigDecimal balance) {
	this.balance = balance;
    }

    public boolean isActive() {
	return active;
    }

    public void setActive(boolean active) {
	this.active = active;
    }

    @Override
    public String toString() {
	return "User [id=" + id + ", login=" + login + ", password=" + password + ", role=" + role + ", firstName="
		+ firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber=" + phoneNumber
		+ ", address=" + address + ", balance=" + balance + ", userSubscribes=" + userSubscribes + ", active="
		+ active + "]";
    }

}
