package TemplateMethodExample;

public class ConcreteClass extends AbstractClass {


    @Override
    protected void primitiveOperation2() {
        System.out.println("Concrete Operation 1");
    }

    @Override
    protected void primitiveOperation1() {
        System.out.println("Concrete Operation 2");

    }
}
