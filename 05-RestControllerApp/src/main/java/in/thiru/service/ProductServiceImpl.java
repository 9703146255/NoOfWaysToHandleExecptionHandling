package in.thiru.service;

import org.springframework.stereotype.Service;

import in.thiru.entity.Product;
import in.thiru.exceptionhandling.ProductNotFuoundException;
@Service
public class ProductServiceImpl implements IProductService {

	@Override
	public Product getProductsById(Integer id) {

		if (id == 101) {
			return new Product("101", "Mobile", 4000.00);
		} else {
			throw new ProductNotFuoundException("NO PRODUCTS FOUND WITH GIVEN ID");
		}

	}

}
