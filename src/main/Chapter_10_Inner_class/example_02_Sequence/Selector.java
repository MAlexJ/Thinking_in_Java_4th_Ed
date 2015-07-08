package example_02_Sequence;

public interface Selector {
    boolean end();

    Object current();

    void next();
}
