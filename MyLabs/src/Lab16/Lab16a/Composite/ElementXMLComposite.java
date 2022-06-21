package Lab16.Lab16a.Composite;

import java.util.*;

public class ElementXMLComposite extends ElementXML {

    protected List<ElementXML> myChildren = new ArrayList<ElementXML>();

    public ElementXMLComposite(String tag) {
        super(tag);
    }

    @Override
    public void setValue(String valeur) {
    }
    @Override
    public String getValue() {
        return null;
    }

    @Override
    public void addChild(ElementXML child) {
        myChildren.add(child);
    }

    public List<ElementXML> getElementsChildren() {
        return myChildren;
    }

}
