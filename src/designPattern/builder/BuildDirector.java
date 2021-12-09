package designPattern.builder;

import designPattern.SomeClass;

public class BuildDirector {

    private SomeClass someClass;

    public SomeClass buildThis() {
        Builder builder = new Builder();
        return builder.buildAnother().buildSome().build();
    }

    public SomeClass buildThat() {
        Builder builder = new Builder();
        return builder.buildSome().buildOthers().buildAnother().build();
    }
}
