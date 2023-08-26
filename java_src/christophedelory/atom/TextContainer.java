package christophedelory.atom;
/* loaded from: classes.dex */
public class TextContainer extends Type {
    private String _text = null;

    public String getText() {
        return this._text;
    }

    public void setText(String str) {
        this._text = str.trim();
    }
}
