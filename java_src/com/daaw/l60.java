package com.daaw;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class l60 implements i51<k60, l70> {
    public final i51<Bitmap, h70> a;

    public l60(i51<Bitmap, h70> i51Var) {
        this.a = i51Var;
    }

    @Override // com.daaw.i51
    public z41<l70> a(z41<k60> z41Var) {
        k60 k60Var = z41Var.get();
        z41<Bitmap> a = k60Var.a();
        return a != null ? this.a.a(a) : k60Var.b();
    }

    @Override // com.daaw.i51
    public String getId() {
        return "GifBitmapWrapperDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
