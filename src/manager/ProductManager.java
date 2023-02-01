
package manager;

import entity.Product;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private final Scanner scanner;

    public ProductManager() {
        scanner = new Scanner(System.in);
    }

    public Product createProduct() {
        Product product = new Product();
        System.out.println("Product name: ");
        product.setTitle(scanner.nextLine());
        System.out.println("Price for product : ");
        product.setPrice(scanner.nextInt());
        System.out.println("How many in store?:");
        product.setInStoreQty(scanner.nextInt());
        return product;
    }
    
    public void printListProducts(List<Product> products ){
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d - %s, Price: %d, Quantity: %d,%n",
                    i+1,
                    products.get(i).getTitle(),
                    products.get(i).getInStoreQty(),
                    products.get(i).getPrice()
            );
        }
    }
    
}