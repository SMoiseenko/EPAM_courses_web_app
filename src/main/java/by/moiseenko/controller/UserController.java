package by.moiseenko.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
    public String index(HttpServletRequest request) {
	HttpSession session = request.getSession();
	session.setAttribute("mysSession", "pa-ra-ra-pam");
	return "/index";
    }

    @PostMapping("/userslist")
    public String getAllUsersList(@RequestParam String uname, @RequestParam String psw,
	    @CookieValue(value = "hitCounter", defaultValue = "0") Long hitCounter, HttpServletResponse response,
	    HttpServletRequest request, Model model) {

	hitCounter++;

	response.addCookie(new Cookie("hitCounter", hitCounter.toString()));

	Cookie[] allReturnCookies = request.getCookies();
	String cookieName = "hitCounter";
	Cookie cookieReturned = null;
	String cookieRecievedValue = "No cookie found";
	for (Cookie c : allReturnCookies) {
	    if (c.getName().equals(cookieName)) {
		cookieReturned = c;
		cookieRecievedValue = cookieReturned.getValue();
		break;
	    }
	}
	System.out.printf("Sended cookie is : %s.%n", hitCounter.toString());
	System.out.printf("Returned cookie is : %s.%n", cookieRecievedValue);
	System.out.printf("Session ID : %s.%n", request.getSession().getAttribute("mysSession"));

	model.addAttribute("usersList", userService.getAllUsers());
	model.addAttribute("USERNAME", uname);
	model.addAttribute("PASSWORD", psw);
	return "admin/usersList";
    }

}