

public class DigitalProduct implements Product {

  private String name;
  private double price;

  public DigitalProduct(String name, double price){
    this.name = name;
    this.price = price;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public double getPrice() {
    return this.price;
  }
  
}
