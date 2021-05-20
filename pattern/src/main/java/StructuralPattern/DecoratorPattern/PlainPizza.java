package StructuralPattern.DecoratorPattern;

public class PlainPizza implements Pizza {
  @Override
  public void bake() {
    System.out.println("baking plain pizza");
  }
}
