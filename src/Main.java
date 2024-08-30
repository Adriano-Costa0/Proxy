

public class Main {
  public static void main(String[] args) {

    // Decorator, Proxy e Abstract Factory

    SaraivaFactory saraivaFactory = new SaraivaFactory();

    PhysicalProduct livro1 = saraivaFactory.createPhysicalProduct();
    DigitalProduct ebook1 = saraivaFactory.createDigitalProduct();

    DigitalProductProxy productProxy = new DigitalProductProxy(ebook1);

    ProductWrappingDecorator physicalProductDecorator = new ProductWrappingDecorator(livro1);

    productProxy.downloadProduct();

    System.out.println("\nProduto Fisico S/Decorator - " + livro1.getName() + "\nPrice: R$" + livro1.getPrice());
    System.out.println("\nProduto Fisico C/Decorator - " + physicalProductDecorator.getName() + "\nPrice: R$"
        + physicalProductDecorator.getPrice());

  }

}
