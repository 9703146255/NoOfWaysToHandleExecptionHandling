package in.thiru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.thiru.service.BookServiceImpl;

@Controller
public class BookController {

@Autowired
private	BookServiceImpl service;

@GetMapping("/book")
  public String getBookPriceById(Model model,@RequestParam("bookId") String bookId)
  {
	  
	  Double findBookPriceById = service.findBookPriceById(bookId);
	  model.addAttribute("bookId", "book price is :: "+findBookPriceById);
	  
	  return "index";
  }

}