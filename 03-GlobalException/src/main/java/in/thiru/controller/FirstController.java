package in.thiru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import in.thiru.service.EmployeeService;

@Controller
public class FirstController {
	
	@Autowired
	private EmployeeService eService;
	
	

	
	@GetMapping("/welcome")
	public String getMsg(Model model) {
		model.addAttribute("msg1", "welcome to hyderabad");
		model.addAttribute("msg2", "welcome to hyderabad");
		model.addAttribute("msg3", "welcome to hyderabad");
		String a = null;
		a.length();

		return "index";
	}
	
	@GetMapping("/div")
	public String div()
	{
		eService.getEmpDtls();
		
	
		
		return "index";
	}

}