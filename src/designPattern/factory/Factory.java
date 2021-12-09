package designPattern.factory;

public class Factory {

    public Factory() {}

    public FactoryInterface createProduct(String productType) {
        if (productType.equals("NO1")) {
            return new FactoryProduct();
        } else if (productType.equals("NO2")) {
            return new FactoryProduct2();
        }

        return null;
    }
}
