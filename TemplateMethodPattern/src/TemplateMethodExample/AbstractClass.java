package TemplateMethodExample;

public abstract class AbstractClass {
    final void templateMethod(){
        primitiveOperation1();
        notPrimitiveOperation();
        primitiveOperation2();
    }

    protected abstract void primitiveOperation2();

    private void notPrimitiveOperation(){
        System.out.println("Do something");

    };

    protected abstract void primitiveOperation1();
}
