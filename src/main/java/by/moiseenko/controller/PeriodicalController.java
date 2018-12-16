package by.moiseenko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import by.moiseenko.entity.periodical.Periodical;
import by.moiseenko.service.PeriodicalService;

@Controller

public class PeriodicalController {

    private PeriodicalService periodicalService;

    @Autowired
    public PeriodicalController(PeriodicalService periodicalService) {
	super();
	this.periodicalService = periodicalService;
    }

    @GetMapping("/periodicals")
    public String getAllPeriodicals(Model model) {
	model.addAttribute("periodicalList", periodicalService.getAllPeriodicals());
	return "/admin/periodicalsServiceList";
    }

    @PostMapping("/addPeriodical")
    public String addNewspaper(@ModelAttribute("periodical") Periodical periodical) {
	this.periodicalService.addPeriodical(periodical);
	return "redirect:/periodicals";
    }

    @PostMapping("/editPeriodicals/{id}")
    public String editNewspaper(@ModelAttribute("periodical") Periodical periodical, @PathVariable("id") int id) {
	periodical.setId(id);
	this.periodicalService.editPeriodical(periodical);
	return "redirect:/periodicalUpdateDelete/{id}";
    }

    @GetMapping("/periodicalUpdateDelete/{id}")
    public String newspaperUpdateDelete(@PathVariable("id") int id, Model model) {
	model.addAttribute("periodical", periodicalService.getPeriodicalById(id));
	return "/admin/periodicalUpdateDelete";
    }

}
