package StructuralPattern.FacadePattern;

public class Test {
  public static void main(String[] args) {
    OrderFacade orderFacade = new OrderFacade();
    orderFacade.processOrder("macbook", 3);
  }
}
