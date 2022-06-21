package Lab16.Lab16a.Composite;

public abstract class ElementXML {

    protected String tag;

    public ElementXML(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }
    public abstract String getValue();
    public abstract void setValue(String value);

    public abstract void addChild(ElementXML child);
}