package by.moiseenko.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import by.moiseenko.entity.User;
import by.moiseenko.service.UserService;

@Controller
@SessionAttributes("userLoged")
public class UserController {

    private static final Logger logger = Logger.getLogger(UserController.class);
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
	super();
	this.userService = userService;

    }

    @PostMapping("/userslist")
    public String getAllUsersList(Model model) {
	model.addAttribute("usersList", userService.getAllUsersWithRoles());
	return "/admin/usersList";
    }

    @GetMapping("/userRegistrationForm")
    public String userRegistrationForm() {
	return "service/userRegistrationForm";
    }

    @PostMapping("/authorization")
    public String authorization(@SessionAttribute(required = false) User user, @RequestParam String login,
	    @RequestParam String password, Model model) {

	user = userService.authorization(login, password);

	if (user == null) {
	    model.addAttribute("badAuthorization", "Wrong login or password. Try again.");
	    return "/service/badAuthorization";
	}

	if (!userService.checkStatus(user)) {
	    model.addAttribute("badAuthorization", "Your account still not activated. Please, wait.");
	    return "service/badAuthorization";
	}

	switch (userService.checkRole(user)) {
	case "ADMIN":
	    model.addAttribute("userLoged", user);
	    return "admin/adminHomePage";
	case "CUSTOMER":
	    model.addAttribute("userLoged", user);
	    return "user/userHomePage";
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