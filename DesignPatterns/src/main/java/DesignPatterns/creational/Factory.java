package DesignPatterns.creational;

//Product interface
interface ProductInterface {
 void display();
}

//Concrete product implementations
class ConcreteProduct1 implements ProductInterface {
 @Override
 public void display() {
     System.out.println("Concrete Product 1");
 }
}

class ConcreteProduct2 implements ProductInterface {
 @Override
 public void display() {
     System.out.println("Concrete Product 2");
 }
}

//Simple factory class
class SimpleFactory {
 public static ProductInterface createProduct(String type) {
     switch (type) {
         case "Product1":
             return new ConcreteProduct1();
         case "Product2":
             return new ConcreteProduct2();
         default:
             throw new IllegalArgumentException("Invalid product type");
     }
 }
}

//Client code
 class Client {
 private ProductInterface product;

 public Client(String productType) {
     this.product = SimpleFactory.createProduct(productType);
 }

 public void displayProduct() {
     product.display();
 }
}


public class Factory {
	public static void main(String[] args) {
		 Client client1 = new Client("Product1");
	     client1.displayProduct();

	     Client client2 = new Client("Product2");
	     client2.displayProduct();
	}
}
