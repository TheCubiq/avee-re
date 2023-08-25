package com.daaw;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class ff0 implements d51<jf0, Bitmap> {
    public final d51<InputStream, Bitmap> a;
    public final d51<ParcelFileDescriptor, Bitmap> b;

    public ff0(d51<InputStream, Bitmap> d51Var, d51<ParcelFileDescriptor, Bitmap> d51Var2) {
        this.a = d51Var;
        this.b = d51Var2;
    }

    @Override // com.daaw.d51
    /* renamed from: a */
    public z41<Bitmap> c(jf0 jf0Var, int i, int i2) {
        z41<Bitmap> c;
        ParcelFileDescriptor a;
        InputStream b = jf0Var.b();
        if (b != null) {
            try {
                c = this.a.c(b, i, i2);
            } catch (IOException unused) {
            }
            return (c != null || (a = jf0Var.a()) == null) ? c : this.b.c(a, i, i2);
        }
        c = null;
        if (c != null) {
            return c;
        }
    }

    @Override // com.daaw.d51
    public String getId() {
        return "ImageVideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }
}
