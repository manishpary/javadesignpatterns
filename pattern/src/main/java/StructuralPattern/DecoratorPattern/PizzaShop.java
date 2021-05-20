package StructuralPattern.DecoratorPattern;

public class PizzaShop {
  public static void main(String[] args) {
    Pizza pizza = new VeggiePizzaDecorator(new ChessePizzaDecorator(new PlainPizza()));
    pizza.bake();
  }
}
