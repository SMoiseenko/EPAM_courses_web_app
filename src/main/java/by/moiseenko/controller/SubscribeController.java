package by.moiseenko.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import by.moiseenko.service.UserService;

@Controller
public class SubscribeController {

    private static final Logger logger = Logger.getLogger(SubscribeController.class);
    private UserService userService;

    @Autowired
    public SubscribeController(UserService userService) {
	super();
	this.userService = userService;

    }

}