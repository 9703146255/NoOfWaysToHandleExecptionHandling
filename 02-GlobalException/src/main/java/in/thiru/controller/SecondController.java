package in.thiru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class SecondController {
	
	@GetMapping("/greet")
	public String getMsg(Model model)
	{
		model.addAttribute("msg1", "welcome to hyderabad");
		model.addAttribute("msg2", "welcome to hyderabad");
		model.addAttribute("msg3", "welcome to hyderabad");
		String a=null;
		a.length();
		
		return "index";
	}
	
	
	

}
