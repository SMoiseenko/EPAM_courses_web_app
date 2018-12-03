package by.moiseenko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import by.moiseenko.entity.Newspaper;
import by.moiseenko.service.PeriodicalService;

@Controller

public class PeriodicalController {

    private PeriodicalService periodicalService;

    @Autowired
    public PeriodicalController(PeriodicalService periodicalService) {
	super();
	this.periodicalService = periodicalService;
    }

    @GetMapping("/newspapers")
    public String getAllNewspappers(Model model) {
	model.addAttribute("newspaperList", periodicalService.getAllNewspapers());
	return "/admin/newspapersServiceList";
    }

    @PostMapping("/addNewspaper")
    public String addNewspaper(@ModelAttribute("newspaper") Newspaper newspaper) {
	this.periodicalService.addNewspaper(newspaper);
	return "redirect:/newspapers";
    }

    @GetMapping("/newspaperUpdateDelete/{id}")
    public String newspaperUpdateDelete(@PathVariable("id") int id, Model model) {
	model.addAttribute("newspaper", periodicalService.getNewspaperById(id));
	return "/admin/newspaperUpdateDelete";
    }

}
