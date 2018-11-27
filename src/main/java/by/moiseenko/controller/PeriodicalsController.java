package by.moiseenko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import by.moiseenko.entity.Newspaper;
import by.moiseenko.service.PeriodicalsService;

@Controller
public class PeriodicalsController {

    private PeriodicalsService periodicalsService;

    @Autowired
    public PeriodicalsController(PeriodicalsService periodicalsService) {
	super();
	this.periodicalsService = periodicalsService;
    }

    @GetMapping("/hello")
    public String hello() {
	return "hello";
    }

    @GetMapping("/")
    public String index() {
	return "index";
    }

    @GetMapping("/newspapers")
    public String getAllNewspappers(Model model) {
	model.addAttribute("newspaperList", this.periodicalsService.getAll());
	return "newspapersList";
    }
    
    @PostMapping("/addNewspaper")
    public String addNewspaper(@ModelAttribute("newspaper") Newspaper newspaper ) {
	periodicalsService.add(newspaper);
	return "redirect:/newspapers";
    }

}
