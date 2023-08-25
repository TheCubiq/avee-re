package com.daaw;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class z60 implements d51<r60, Bitmap> {
    public final bc a;

    public z60(bc bcVar) {
        this.a = bcVar;
    }

    @Override // com.daaw.d51
    /* renamed from: a */
    public z41<Bitmap> c(r60 r60Var, int i, int i2) {
        return dc.d(r60Var.i(), this.a);
    }

    @Override // com.daaw.d51
    public String getId() {
        return "GifFrameResourceDecoder.com.bumptech.glide.load.resource.gif";
    }
}
