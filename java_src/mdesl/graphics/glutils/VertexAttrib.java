package mdesl.graphics.glutils;
/* loaded from: classes2.dex */
public class VertexAttrib {
    public final int location;
    public final String name;
    public final int numComponents;

    public VertexAttrib(int i, String str, int i2) {
        this.location = i;
        this.name = str;
        this.numComponents = i2;
    }

    public String toString() {
        return this.name + " (" + this.numComponents + ")";
    }
}
