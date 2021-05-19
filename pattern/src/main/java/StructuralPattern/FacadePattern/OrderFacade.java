package StructuralPattern.FacadePattern;

public class OrderFacade {

  public void processOrder(String name,int quantity) {
    OrderProcessor orderProcessor = new OrderProcessor();
    if (orderProcessor.checkStock(name)) {
      orderProcessor.placeOrder(name, quantity);
      orderProcessor.shipOrder("abc123");
    }
  }
}
