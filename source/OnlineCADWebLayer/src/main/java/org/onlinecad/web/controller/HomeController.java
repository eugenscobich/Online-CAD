package org.onlinecad.web.controller;

import org.onlinecad.model.entity.Layer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@ModelAttribute("layer")
	public Layer createLayer() {
		return new Layer();
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, @ModelAttribute("layer") Layer layer) {
		layer.setName("Salut");
		return "home";
	}
}
