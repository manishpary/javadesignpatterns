package StructuralPattern.FacadePattern;

public class OrderProcessor {
  public boolean checkStock(String name) {
    System.out.println("Checking Stock");
    return true;
  }

  public void placeOrder(String name, int quantity) {
    System.out.println("order placed");
  }

  public void shipOrder(String OrderId) {
    System.out.println("order Shipped");
  }
}
