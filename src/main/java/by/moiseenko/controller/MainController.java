package by.moiseenko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("userLoged")
public class MainController {

    @GetMapping("/")
    public String index() {
	return "/index";
    }

    @GetMapping("/signout")
    public String signOut(SessionStatus status) {
	status.setComplete();
	return "redirect:/";
    }

}
