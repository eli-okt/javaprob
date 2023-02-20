public class ProductPrinter {

  public static void main (String[] args) {
    
    Product product1 = new Product("Toaster", 29.95);
    Product product2 = new Product("Blender", 49.99);

    System.out.println(product1.getName() + ": $" + product1.getPrice());
    System.out.println(product2.getName() + ": $" + product2.getPrice());
        
    product1.reducePrice();
    product2.reducePrice();
        
    System.out.println(product1.getName() + ": $" + product1.getPrice());
    System.out.println(product2.getName() + ": $" + product2.getPrice());

    }
}
