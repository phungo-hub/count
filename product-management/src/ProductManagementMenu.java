import java.util.Scanner;

public class ProductManagementMenu {
    public void displayMenu() {
        System.out.println("Menu");
        System.out.println("1. Add new Product");
        System.out.println("2. Update product");
        System.out.println("3. Remove product");
        System.out.println("4. Search by ID");
        System.out.println("5. Display All");
    }

    public void handleMenu() {
        ProductManagement productManagement = new ProductManagement();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            displayMenu();
            int option = scanner.nextInt(); scanner.nextLine();
            switch (option) {
                case 1:
                    Product p1 = new Product(1, "tea",100);
                    productManagement.add(p1);
                    break;
                case 2:
                    Product p2 = new Product(1, "sua ong tho", 200);
                    productManagement.update(1, p2);
                    break;
                case 4:
                    System.out.println("Nhap id");
                    int idToSearch = scanner.nextInt(); scanner.nextLine();
                    productManagement.searchById(idToSearch);
                    System.out.println(productManagement);
                    break;
                case 5:
                    productManagement.displayAll();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
