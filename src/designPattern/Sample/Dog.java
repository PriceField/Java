package designPattern.Sample;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Wong");
    }

    @Override
    public void fly() {
        System.out.println("Can't fly");
    }

    @Override
    public void getAnimal() {
        System.out.println("Dog");
    }
}
