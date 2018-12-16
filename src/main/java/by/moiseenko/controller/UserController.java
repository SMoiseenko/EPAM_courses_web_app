package by.moiseenko.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.moiseenko.entity.User;
import by.moiseenko.service.UserService;

@Controller
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);
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

	model.addAttribute("usersList", userService.getAllUsersWithRoles());
	model.addAttribute("USERNAME", uname);
	model.addAttribute("PASSWORD", psw);
	return "admin/usersList";
    }

    @GetMapping("/userRegistrationForm")
    public String userRegistrationForm() {
	return "service/userRegistrationForm";
    }

    @PostMapping("/authorization")
    public String authorization(@RequestParam String login, @RequestParam String password, Model model) {

	User user = userService.authorization(login, password);

	if (user == null) {
	    model.addAttribute("badAuthorization", "Wrong login or password. Try again.");
	    return "service/badAuthorization";
	}

	if (!userService.checkStatus(user)) {
	    model.addAttribute("badAuthorization", "Your account still not activated. Please, wait.");
	    return "service/badAuthorization";
	}

	switch (userService.checkRole(user)) {
	case "ADMIN":
	    return "admin/adminHomePage";

	case "ANONYMOUS":
	    return "redirect:/index";

	case "CUSTOMER":
	    return "redirect:/index";

	default:
	    return "redirect:/index";
	}
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("user") User user) {
	logger.debug(user);
	userService.addUser(user);
	return "/index";
    }

}
