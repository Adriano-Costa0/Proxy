

class ProductWrappingDecorator implements Product {
    private PhysicalProduct product;

    public ProductWrappingDecorator(PhysicalProduct product) {
        this.product = product;
    }

    public String getName() {
        return product.getName() + " (Embalagem personalizada)";
    }

    public double getPrice() {
        return product.getPrice() + 5.0; // Custo da embalagem
    }
}