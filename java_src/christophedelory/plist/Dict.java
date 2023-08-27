package christophedelory.plist;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
/* loaded from: classes.dex */
public class Dict extends PlistObject {
    private final Hashtable<Key, PlistObject> _objects = new Hashtable<>();
    private transient Key _tmpKey = null;

    public Hashtable<Key, PlistObject> getDictionary() {
        return this._objects;
    }

    public PlistObject put(Key key, PlistObject plistObject) {
        return this._objects.put(key, plistObject);
    }

    public PlistObject put(java.lang.String str, PlistObject plistObject) {
        return this._objects.put(new Key(str), plistObject);
    }

    @Deprecated
    public List<PlistObject> getKeysAndObjects() {
        ArrayList arrayList = new ArrayList(this._objects.size());
        Enumeration<Key> keys = this._objects.keys();
        while (keys.hasMoreElements()) {
            Key nextElement = keys.nextElement();
            arrayList.add(nextElement);
            arrayList.add(this._objects.get(nextElement));
        }
        return arrayList;
    }

    @Deprecated
    public void addKeyOrObject(PlistObject plistObject) {
        plistObject.setParent(this);
        Key key = this._tmpKey;
        if (key == null) {
            if (!(plistObject instanceof Key)) {
                throw new IllegalArgumentException("A key is expected here");
            }
            this._tmpKey = (Key) plistObject;
        } else if (plistObject instanceof Key) {
            throw new IllegalArgumentException("A key is unexpected here");
        } else {
            put(key, plistObject);
            this._tmpKey = null;
        }
    }

    public PlistObject findObjectByKey(java.lang.String str) {
        return this._objects.get(new Key(str));
    }
}
