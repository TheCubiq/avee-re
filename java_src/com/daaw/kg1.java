package com.daaw;

import android.graphics.Bitmap;
import java.io.InputStream;
/* loaded from: classes.dex */
public class kg1 implements d51<InputStream, Bitmap> {
    public final com.bumptech.glide.load.resource.bitmap.a a;
    public bc b;
    public cq c;
    public String d;

    public kg1(com.bumptech.glide.load.resource.bitmap.a aVar, bc bcVar, cq cqVar) {
        this.a = aVar;
        this.b = bcVar;
        this.c = cqVar;
    }

    public kg1(bc bcVar, cq cqVar) {
        this(com.bumptech.glide.load.resource.bitmap.a.c, bcVar, cqVar);
    }

    @Override // com.daaw.d51
    /* renamed from: a */
    public z41<Bitmap> c(InputStream inputStream, int i, int i2) {
        return dc.d(this.a.a(inputStream, this.b, i, i2, this.c), this.b);
    }

    @Override // com.daaw.d51
    public String getId() {
        if (this.d == null) {
            this.d = "StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap" + this.a.getId() + this.c.name();
        }
        return this.d;
    }
}
