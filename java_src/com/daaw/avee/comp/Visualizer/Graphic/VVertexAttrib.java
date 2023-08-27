package com.daaw.avee.comp.Visualizer.Graphic;

import mdesl.graphics.glutils.VertexAttrib;
/* loaded from: classes.dex */
public class VVertexAttrib extends VertexAttrib {
    public final int dataType;
    public final int sizeInBytes;

    public VVertexAttrib(int i, String str, int i2, int i3, int i4) {
        super(i, str, i2);
        this.dataType = i3;
        this.sizeInBytes = i4;
    }
}
