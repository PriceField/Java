package designPattern.builder;

import designPattern.SomeClass;

public interface BuilderInterface {

    BuilderInterface buildSome();

    BuilderInterface buildAnother();

    BuilderInterface buildOthers();

    SomeClass build();
}
