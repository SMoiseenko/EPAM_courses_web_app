package by.moiseenko.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @PostMapping("/userslist")
    public String getAllUsersList(@RequestParam String uname, @RequestParam String psw,
	    @CookieValue(value = "hitCounter", defaultValue = "0") Long hitCounter, HttpServletResponse response,
	    HttpServletRequest request, Model model) {

	Cookie cookieSend = new Cookie("hitCounter", hitCounter.toString());
	hitCounter++;
	response.addCookie(cookieSend);

	Cookie[] allReturnCookies = request.getCookies();
	String cookieName = "hitCounter";
	Cookie cookieReturned = null;
	for (Cookie c : allReturnCookies) {
	    if (c.getName().equals(cookieName))
		cookieReturned = c;
	    break;
	}
	System.out.printf("Returned cookie is : %s.\n", cookieReturned.getValue());
	model.addAttribute("usersList", userService.getAllUsers());
	model.addAttribute("USERNAME", uname);
	model.addAttribute("PASSWORD", psw);
	return "admin/usersList";
    }

}
