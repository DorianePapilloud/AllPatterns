package Lab16.Lab16a.Adapter;

import Lab16.Lab16a.Composite.ElementXML;
import Lab16.Lab16a.Composite.ElementXMLComposite;

import java.util.List;

public class ElementAdapter implements Element {

    protected ElementXMLComposite adapte;

    public ElementAdapter(ElementXMLComposite adapte) {
        this.adapte = adapte;
    }

    public int getNumberOfChildren() {
        return adapte.getElementsChildren().size();
    }

    public ElementXML getChild(int index) {
        List<ElementXML> enfants = adapte
                .getElementsChildren();
        return enfants.get(index);

    }

    public ElementXML getFirstChildWithTag(String tag) {
        List<ElementXML> enfants = adapte
                .getElementsChildren();
        for (ElementXML elt : enfants) {
            if (elt.getTag().equals(tag))
                return elt;
        }
        return null;
    }
}
