package in.thiru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ControllerAdvice
public class FirstController {

	@GetMapping("/welcome")
	public String getMsg(Model model) {
		model.addAttribute("msg1", "welcome to hyderabad");
		model.addAttribute("msg2", "welcome to hyderabad");
		model.addAttribute("msg3", "welcome to hyderabad");
		String a = null;
		a.length();

		return "index";
	}

	@ExceptionHandler(Exception.class)
	public String handleExceptions(Model model) {
		model.addAttribute("errorMsg", "unable to process your request, please access later");

		return "errorpage";
	}

}
