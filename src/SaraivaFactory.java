

public class SaraivaFactory implements ProductFactory {

  @Override
  public PhysicalProduct createPhysicalProduct() {
    return new PhysicalProduct("Livro senhor dos aneis - Capa dura", 60);
  }

  @Override
  public DigitalProduct createDigitalProduct() {
    return new DigitalProduct("Ebook senhor dos aneis", 30);
  }
  
}
