package by.moiseenko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.moiseenko.entity.User;
import by.moiseenko.service.ApplicationService;

@Controller
public class ApplicationController {

    private ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
	super();
	this.applicationService = applicationService;
    }

    @PostMapping("/authorization")
    public String authorization(@RequestParam String login, @RequestParam String password, Model model) {

	User user = applicationService.authorization(login, password);

	if (user == null) {
	    model.addAttribute("badAuthorization", "Wrong login or password. Try again.");
	    return "service/badAuthorization";
	}

	if (!applicationService.checkStatus(user)) {
	    model.addAttribute("badAuthorization", "Your account still not activated. Please, wait.");
	    return "service/badAuthorization";
	}

	switch (applicationService.checkRole(user)) {
	case "ADMIN":
	    return "admin/adminHomePage";

	case "anonumouse":
	    return "";

	default:
	    return "/index";
	}

//	hitCounter++;
//
//	response.addCookie(new Cookie("hitCounter", hitCounter.toString()));
//
//	Cookie[] allReturnCookies = request.getCookies();
//	String cookieName = "hitCounter";
//	Cookie cookieReturned = null;
//	String cookieRecievedValue = "No cookie found";
//	for (Cookie c : allReturnCookies) {
//	    if (c.getName().equals(cookieName)) {
//		cookieReturned = c;
//		cookieRecievedValue = cookieReturned.getValue();
//		break;
//	    }
//	}
//	System.out.printf("Sended cookie is : %s.%n", hitCounter.toString());
//	System.out.printf("Returned cookie is : %s.%n", cookieRecievedValue);
//	System.ot5ut.printf("Session ID : %s.%n", request.getSession().getAttribute("mysSession"));
//
//	model.addAttribute("usersList", userService.getAllUsers());
//	model.addAttribute("USERNAME", uname);
//	model.addAttribute("PASSWORD", psw);

    }

    @PostMapping("/registration")
    public String registration() {
	return "";
    }

}
