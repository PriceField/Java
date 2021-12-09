package designPattern.factory;

public class FactoryProduct2 implements FactoryInterface {

    @Override
    public void prodcutFunction() {
        System.out.println("Create another product for similar type in the factory ....");
    }
}
