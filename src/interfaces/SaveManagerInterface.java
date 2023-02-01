
package interfaces;

import entity.Customer;
import entity.Product;
import entity.Orders;
import java.util.List;

public interface SaveManagerInterface {
    public void saveCustomers(List<Customer> customers);
    public List<Customer> loadCustomers();
    public void saveProducts(List<Product> products);
    public List<Product> loadProducts();
    public void savePurchases(List<Orders> orders);
    public List<Orders> loadPurchases();
}