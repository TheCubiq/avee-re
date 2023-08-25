package com.daaw;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class l60 implements i51<k60, l70> {

    /* renamed from: a */
    public final i51<Bitmap, h70> f17079a;

    public l60(i51<Bitmap, h70> i51Var) {
        this.f17079a = i51Var;
    }

    @Override // com.daaw.i51
    /* renamed from: a */
    public z41<l70> mo15864a(z41<k60> z41Var) {
        k60 k60Var = z41Var.get();
        z41<Bitmap> m18035a = k60Var.m18035a();
        return m18035a != null ? this.f17079a.mo15864a(m18035a) : k60Var.m18034b();
    }

    @Override // com.daaw.i51
    public String getId() {
        return "GifBitmapWrapperDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
