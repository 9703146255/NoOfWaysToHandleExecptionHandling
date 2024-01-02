package in.thiru.handleexception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import in.thiru.exceptions.NoBookFoundException;

@ControllerAdvice
@Controller
public class ExceptionHandlerClass {

	@ExceptionHandler(NoBookFoundException.class)
	public String getNoBookFoundException(Model modle) {

		return "errorpage";
	}

}