package by.moiseenko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import by.moiseenko.service.NewspaperService;

@Controller
public class PeriodicalsController {

    private NewspaperService newspaperService;

    @Autowired
    public PeriodicalsController(NewspaperService newspaperService) {
	super();
	this.newspaperService = newspaperService;
    }

    @RequestMapping("/hello")
    public String hello() {
	return "hello";
    }

    @RequestMapping("/")
    public String index() {
	return "index";
    }

    @RequestMapping("/newspapers")
    public String getAllNewspappers(Model model) {
	model.addAttribute("newspaperList", this.newspaperService.getAll());
	return "newspapersList";
    }

}
