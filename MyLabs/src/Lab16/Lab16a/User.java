package Lab16.Lab16a;

import Lab16.Lab16a.Adapter.Element;
import Lab16.Lab16a.Adapter.ElementAdapter;
import Lab16.Lab16a.Composite.ElementXML;
import Lab16.Lab16a.Composite.ElementXMLComposite;
import Lab16.Lab16a.Composite.ElementXMLSimple;

public class User {

    public static void main(String[] args) {
        ElementXML element1 = new ElementXMLSimple("title");
        element1.setValue("Narnia");
        ElementXML element2 = new ElementXMLSimple("author");
        element2.setValue("C.S. Lewis");
        ElementXML livre1 = new ElementXMLComposite("book");
        livre1.addChild(element1);
        livre1.addChild(element2);

        ElementXML element4 = new ElementXMLSimple("title");
        element4.setValue("Apocalypse");
        ElementXML element5 = new ElementXMLSimple("author");
        element5.setValue("Saint John");
        ElementXML livre2 = new ElementXMLComposite("book");
        livre2.addChild(element4);
        livre2.addChild(element5);

        ElementXML livres = new ElementXMLComposite("books");
        livres.addChild(livre1);
        livres.addChild(livre2);

        Element livre1adaptateur = new ElementAdapter((ElementXMLComposite) livre1);
        int nb = livre1adaptateur.getNumberOfChildren();
        System.out.println(nb);

        ElementXML elt = livre1adaptateur.getFirstChildWithTag("author");
        System.out.println(elt.getValue());
    }
}