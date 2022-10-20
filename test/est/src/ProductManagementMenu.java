import java.util.Scanner;

public class ProductManagementMenu {
    public void displayMenu() {
        System.out.println("Quản lý sản phẩm");
        System.out.println("1. Add new product");
        System.out.println("2. Update product");
        System.out.println("3. Remove product");
        System.out.println("4. Search by ID");
        System.out.println("5. Display All");

    }

    public void menu() {
        ProductManagement productManagement = new ProductManagement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice");
        while (true) {
            int choice = scanner.nextInt(); scanner.nextLine();
            switch(choice) {
                case 1:
                    Product newProduct = new Product(1, "tea", 10.5);
                    productManagement.addProduct(newProduct);
                    break;
                case 2:
                    //Nhap thong so tu ban phim
                    break;
                case 3:
                    System.out.println("Nhap vao id de tim kiem");
                    int searchId = scanner.nextInt(); scanner.nextLine();
                    productManagement.remove(searchId);
                case 4:
                    System.out.println("Nhap vao id de tim kiem");
                    int id = scanner.nextInt(); scanner.nextLine();
                    

            }

        }

    }
}
