package christophedelory.plist;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class Array extends PlistObject {
    private final List<PlistObject> _objects = new ArrayList();

    public List<PlistObject> getPlistObjects() {
        return this._objects;
    }

    public void addPlistObject(PlistObject plistObject) {
        if (plistObject instanceof Key) {
            throw new IllegalArgumentException("No dictionary key allowed in an array");
        }
        plistObject.setParent(this);
        this._objects.add(plistObject);
    }
}
