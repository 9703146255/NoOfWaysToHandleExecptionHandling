package in.thiru.service;

import org.springframework.stereotype.Service;

import in.thiru.exceptions.NoBookFoundException;

@Service
public class BookServiceImpl implements IBookService{
	
	public Double findBookPriceById(String id)
	{
		if(id.equals("101"))
		{
			return 400.00;
		}
		else
		{
			throw new NoBookFoundException("No book is found with given id..");
		}
	}
}
