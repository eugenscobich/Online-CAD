package org.onlinecad.web.controller;

import org.onlinecad.web.session.DataHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(value = "dataHolder")
public class HomeController {

	// private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);

	@ModelAttribute("dataHolder")
	public DataHolder newDataHolder() {
		return new DataHolder();
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, @ModelAttribute("dataHolder") DataHolder dataHolder) {
		return "home";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String homepost(Model model, @ModelAttribute("dataHolder") DataHolder dataHolder) {
		return "home";
	}

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String hometest(Model model, @ModelAttribute("dataHolder") DataHolder dataHolder) {
		dataHolder.setMessage("Home Page!");
		return "testhome";
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String getPage(Model model, @ModelAttribute("dataHolder") DataHolder dataHolder) {

		dataHolder.setMessage("Home Page!");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "home";
	}
}
