package designPattern.builder;

import designPattern.SomeClass;

public class Builder implements BuilderInterface {

    private SomeClass someClass;

    @Override
    public BuilderInterface buildSome() {
        someClass.doSomething();
        return this;
    }

    @Override
    public BuilderInterface buildAnother() {
        someClass.doAnother();
        return this;
    }

    @Override
    public BuilderInterface buildOthers() {
        someClass.doOthers();
        return this;
    }

    @Override
    public SomeClass build() {
        // someClass already build
        return someClass;
    }

    public BuilderInterface buildMyOwn() {
        System.out.println("I'm not my interface...");
        return this;
    }
}
