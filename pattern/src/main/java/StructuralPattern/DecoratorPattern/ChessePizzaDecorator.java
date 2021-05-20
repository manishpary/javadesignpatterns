package StructuralPattern.DecoratorPattern;

public class ChessePizzaDecorator extends PizzaDecorator {
  public ChessePizzaDecorator(Pizza pizza) {
    super(pizza);
  }

  @Override
  public void bake() {
    super.bake();
    System.out.println("adding cheese toppings");
  }
}
