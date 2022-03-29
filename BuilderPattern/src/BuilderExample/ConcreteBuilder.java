package BuilderExample;

public class ConcreteBuilder extends Builder{

    @Override
    public void buildPartA() {
        System.out.println("Build part A");
        product.setPartA("material 1");
    }

    @Override
    public void buildPartB() {
        System.out.println("Build part B");
        product.setPartB("material 2");
    }

    @Override
    public void buildPartC() {
        System.out.println("Build part C");
        product.setPartC("material 3");
    }
}
