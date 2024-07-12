package produtos;

import java.util.List;

public class main {
	public static void main(String[] args) {
		ProductManager manager = new ProductManager();

        manager.addProduct(new Product("Laptop", 1500.0, "Electronics"));
        manager.addProduct(new Product("Phone", 800.0, "Electronics"));
        manager.addProduct(new Product("Desk", 200.0, "Furniture"));
        manager.addProduct(new Product("Chair", 100.0, "Furniture"));

        System.out.println("Todos os produtos:");
        manager.getProductNames().forEach(System.out::println);

        System.out.println("\nElectronics:");
        List<Product> electronics = manager.filterByCategory("Eletronicos");
        electronics.forEach(System.out::println);

        double totalPrice = manager.getTotalPrice();
        System.out.println("\nPreço total dos produtos: $" + totalPrice);
	}
}
