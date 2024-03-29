package in.thiru.exceptionhandling;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RestControllerAdvice
public class GlobalExceptionHandlerClass 
{

	@ExceptionHandler(ProductNotFuoundException.class)
	public String getProductNotFoundException(Model model)
	{
		return "errorpage";
	}
}
