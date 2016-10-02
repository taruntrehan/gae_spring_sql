package blog.allzhere.in.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreController {

	//DI via Spring
	String message;

	@RequestMapping(value="/movie/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {
		System.out.println("Inside Call For get movie URL mapper");

		model.addAttribute("movie", name);
		model.addAttribute("message", this.message);

		//return to jsp page, configured in mvc-dispatcher-servlet.xml, view resolver
		return "list";

	}

	public void setMessage(String message) {
		this.message = message;
	}

}
