package by.moiseenko.service;

public interface DataValidator {

    Boolean registrationUserUniqueLoginValidation(String login);

    Boolean registrationUserUniqueEmailAndPhoneValidation(String email, String phone);
}
