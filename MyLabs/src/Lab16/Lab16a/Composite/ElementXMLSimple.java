package Lab16.Lab16a.Composite;

public class ElementXMLSimple extends ElementXML {
    protected String value;

    public ElementXMLSimple(String tag) {
        super(tag);
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void addChild(ElementXML child) {
    };
}
