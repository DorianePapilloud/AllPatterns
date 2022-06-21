package Lab16.Lab16a.Adapter;

import Lab16.Lab16a.Composite.ElementXML;

public interface Element {
	
    int getNumberOfChildren();
    ElementXML getChild(int index);
    ElementXML getFirstChildWithTag(String tag);
}
