package by.moiseenko.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.moiseenko.entity.Subscription;
import by.moiseenko.service.SubscriptionService;

@Controller
public class SubscriptionController {

    private static final Logger logger = Logger.getLogger(SubscriptionController.class);
    private SubscriptionService subscribeService;

    @Autowired
    public SubscriptionController(SubscriptionService subscribeService) {
	super();
	this.subscribeService = subscribeService;

    }

    @PostMapping("/addSubscribe")
    public String addSubscribe(@ModelAttribute("subscribe") Subscription subscribe, @RequestParam int periodical_id,
	    @RequestParam(required = false) Integer user_id) {
	if (user_id != null) {
	    subscribeService.addSubscribeForUserById(subscribe, user_id, periodical_id);
	    logger.debug(subscribe.toString() + user_id.toString() + String.valueOf(periodical_id));
	    return "redirect:/periodicalsListForSubscription";
	} else
	    return "redirect:/";
    }

    @PostMapping("/userSubscriptionList")
    public String getUserSubscriptionList(@RequestParam(required = false) Integer user_id, Model model) {
	logger.debug(user_id);
	if (user_id != null) {
	    model.addAttribute("userSubscriptionList", subscribeService.getSubscribeForUserById(user_id));
	    return "/user/userSubscriptionList";
	} else
	    return "redirect:/";
    }

}