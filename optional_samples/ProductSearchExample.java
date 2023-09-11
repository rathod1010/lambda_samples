package optional_samples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Product {
	private int id;
	private String name;

	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class ProductSearchExample {

	public static void main(String[] args) {
		
		List<Product> product = Arrays.asList(

				new Product(1, "laptop"),
				new Product(2, "mobile"),
				new Product(3,"tablet")
				);
		
		int productIdToFind =3 ;
		
		Optional<Product> foundProduct = product.stream().filter(p->p.getId() == productIdToFind).findFirst();
		
		if(foundProduct.isPresent())
		{
			System.out.println("Product found :"+foundProduct.get().getName());
		}
		else
		{
			System.out.println("Product Not Found");
		}

	}

}
