package com.daaw;

import android.content.res.Resources;
import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class j70 implements i51<Bitmap, h70> {
    public final Resources a;
    public final bc b;

    public j70(Resources resources, bc bcVar) {
        this.a = resources;
        this.b = bcVar;
    }

    @Override // com.daaw.i51
    public z41<h70> a(z41<Bitmap> z41Var) {
        return new i70(new h70(this.a, z41Var.get()), this.b);
    }

    @Override // com.daaw.i51
    public String getId() {
        return "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
