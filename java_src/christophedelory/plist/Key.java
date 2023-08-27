package christophedelory.plist;
/* loaded from: classes.dex */
public class Key extends PlistText {
    public Key() {
    }

    public Key(java.lang.String str) {
        setValue(str);
    }

    public int hashCode() {
        java.lang.String value = getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Key)) {
            return false;
        }
        Key key = (Key) obj;
        java.lang.String value = getValue();
        if (value == null) {
            return key.getValue() == null;
        }
        return value.equals(key.getValue());
    }
}
