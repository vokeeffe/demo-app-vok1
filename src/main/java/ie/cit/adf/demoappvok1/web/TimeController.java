package ie.cit.adf.demoappvok1.web;

import ie.cit.adf.demoappvok1.TimeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TimeController {

@Autowired
private TimeService timeService;

@RequestMapping("time")
public String time(Model model){
	model.addAttribute("time", timeService.getCurrentDate());
	return "index.jsp";
}	
}
