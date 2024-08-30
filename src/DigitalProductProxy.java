

public class DigitalProductProxy implements Product {

  private DigitalProduct product;

  public DigitalProductProxy(DigitalProduct product) {
    this.product = product;
  }

  public boolean userHasLicense() {
    // verificaria permissao no banco de dados
    return false;
  }

  @Override
  public String getName() {
    return product.getName();
  }

  @Override
  public double getPrice() {
    return product.getPrice();
  }

  public void downloadProduct() {
    if (userHasLicense()) {
      System.out.println("Download concluido - " + product.getName());
    } else {
      System.out.println("Error - Don't have permission to access this product");
    }
  }

}
