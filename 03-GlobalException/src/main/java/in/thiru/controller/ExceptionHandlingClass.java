package in.thiru.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@Component
@ControllerAdvice
public class ExceptionHandlingClass {
	
	@ExceptionHandler(Exception.class)
	public String handleExceptions(Model model) {
		model.addAttribute("errorMsg", "unable to process your request, please access later");

		return "errorpage";
	}

}
