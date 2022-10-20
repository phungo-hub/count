import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {
    private List<Product> products = new ArrayList<>();

    public ProductManagement() {
    }

    public void add(Product p) {
        products.add(p);
        System.out.println(p.toString());
    }

    public void remove(int id) {
        Product p = searchById(id);
        if (p != null)
            products.remove(id);
    }

    public void update(int id,Product newProduct) {
        Product p = searchById(id);
        if (newProduct != null) {
            p.setName(newProduct.getName());
            p.setPrice(newProduct.getPrice());
        } else {
            System.out.println("Can't find it");
        }
    }

    public Product searchById(int id) {
        for (Product p: products){
            if (p.getId() == id)
                System.out.println(p);
                return p;
        }
        return null;
    }

    public Product searchByName(String name) {
        for (Product p: products){
            if (p.getName().equals(name))
                return p;
        }
        return null;
    }
    public void  displayAll(){
        for (Product p: products) {
            System.out.println(p.toString());
        }
    }

    @Override
    public String toString() {
        return "ProductManagement{" +
                "products=" + products +
                '}';
    }
}
