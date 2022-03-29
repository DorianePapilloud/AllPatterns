package FactoryMethodExample;

public class ConcreteProduct implements Product{

    private String cathegory;

    public ConcreteProduct(String cathegory) {
        this.cathegory = cathegory;
    }

    @Override
    public String toString() {
        return "ConcreteProduct{" +
                "cathegory='" + cathegory + '\'' +
                '}';
    }
}
