package by.moiseenko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.moiseenko.entity.User;
import by.moiseenko.service.UserService;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
	super();
	this.userService = userService;
    }

    @GetMapping("/hello")
    public String hello() {
	return "/hello";
    }

    @GetMapping("/")
    public String index() {
	return "/index";
    }

    @GetMapping("/autorisation")
    public String autorisation(@RequestParam String uname, @RequestParam String psw) {
	User user = userService.autorisation(uname, psw);
	return "redirect:/hello";
    }

}
