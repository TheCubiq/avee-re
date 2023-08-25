package com.daaw;

import android.content.res.Resources;
import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class j70 implements i51<Bitmap, h70> {

    /* renamed from: a */
    public final Resources f14483a;

    /* renamed from: b */
    public final InterfaceC0832bc f14484b;

    public j70(Resources resources, InterfaceC0832bc interfaceC0832bc) {
        this.f14483a = resources;
        this.f14484b = interfaceC0832bc;
    }

    @Override // com.daaw.i51
    /* renamed from: a */
    public z41<h70> mo15864a(z41<Bitmap> z41Var) {
        return new i70(new h70(this.f14483a, z41Var.get()), this.f14484b);
    }

    @Override // com.daaw.i51
    public String getId() {
        return "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
