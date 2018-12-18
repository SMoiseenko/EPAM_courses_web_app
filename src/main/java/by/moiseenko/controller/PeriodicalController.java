package by.moiseenko.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.moiseenko.entity.Periodical;
import by.moiseenko.entity.Subscribe;
import by.moiseenko.service.PeriodicalService;

@Controller

public class PeriodicalController {
    private static final Logger logger = Logger.getLogger(PeriodicalController.class);
    private PeriodicalService periodicalService;

    @Autowired
    public PeriodicalController(PeriodicalService periodicalService) {
	super();
	this.periodicalService = periodicalService;
    }

    @GetMapping("/periodicals")
    public String getAllPeriodicals(Model model) {
	model.addAttribute("periodicalsList", periodicalService.getAllPeriodicals());

	return "/admin/periodicalsServiceList";
    }

    @PostMapping("/addPeriodical")
    public String addPeriodical(@ModelAttribute("periodical") Periodical periodical) {
	this.periodicalService.addPeriodical(periodical);
	return "redirect:/periodicals";
    }

    @PostMapping("/editPeriodical")
    public String editPeriodical(@ModelAttribute("periodical") Periodical periodical) {
	this.periodicalService.editPeriodicalById(periodical);
	return "redirect:/periodicalUpdateDelete?id=" + periodical.getId();
    }

    @GetMapping("/periodicalUpdateDelete")
    public String periodicalUpdateDelete(@RequestParam int id, Model model) {
	model.addAttribute("periodical", periodicalService.getPeriodicalById(id));
	return "/admin/periodicalUpdateDelete";
    }

    @PostMapping("/deletePeriodical")
    public String deletePeriodical(@ModelAttribute("periodical") Periodical periodical) {
	this.periodicalService.deletePeriodicalById(periodical);
	return "redirect:/periodicals";
    }

    @GetMapping("/periodicalsListForSubscribe")
    public String periodicalsListForSubscribe(Model model) {
	model.addAttribute("periodicalsListForSubscribe", periodicalService.getAllPeriodicals());

	return "user/periodicalsListForSubscribe";
    }

    @PostMapping("/addSubscribe")
    public String addSubscribe(@ModelAttribute("periodicals") Periodical periodical) {

	logger.debug(periodical);
	Subscribe subscribe = new Subscribe();

	subscribe.setPeriodical(periodical);
	logger.debug(subscribe);
	return "redirect:/periodicalsListForSubscribe";
    }

}
