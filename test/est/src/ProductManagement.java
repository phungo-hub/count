import java.util.ArrayList;
import java.util.List;

public class ProductManagement {
    private List<Product> products = new ArrayList<>();

    public ProductManagement() {
    }

    public ProductManagement(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void remove(int p) {
        products.remove(p);
    }

    public void update(int id, Product newProduct) {

    }

    public Product searchById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return products.get(i);
            }
        }
        return null;
    }

    public Product searchByName(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).equals(name))
                return products.get(i);
        }
        return null;
    }
}
