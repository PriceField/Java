package designPattern.factory;

public class FactoryProduct implements FactoryInterface {

    @Override
    public void prodcutFunction() {
        System.out.println("Create product No.1,2,3....");
    }
}
