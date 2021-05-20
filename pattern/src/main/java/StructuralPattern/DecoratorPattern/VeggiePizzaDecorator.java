package StructuralPattern.DecoratorPattern;

public class VeggiePizzaDecorator extends PizzaDecorator {
  public VeggiePizzaDecorator(Pizza pizza) {
    super(pizza);
  }

  @Override
  public void bake() {
    super.bake();
    System.out.println("adding veggie toppings");
  }
}
