package com.daaw;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class ff0 implements d51<jf0, Bitmap> {

    /* renamed from: a */
    public final d51<InputStream, Bitmap> f9532a;

    /* renamed from: b */
    public final d51<ParcelFileDescriptor, Bitmap> f9533b;

    public ff0(d51<InputStream, Bitmap> d51Var, d51<ParcelFileDescriptor, Bitmap> d51Var2) {
        this.f9532a = d51Var;
        this.f9533b = d51Var2;
    }

    @Override // com.daaw.d51
    /* renamed from: a */
    public z41<Bitmap> mo2793c(jf0 jf0Var, int i, int i2) {
        z41<Bitmap> mo2793c;
        ParcelFileDescriptor m18541a;
        InputStream m18540b = jf0Var.m18540b();
        if (m18540b != null) {
            try {
                mo2793c = this.f9532a.mo2793c(m18540b, i, i2);
            } catch (IOException unused) {
            }
            return (mo2793c != null || (m18541a = jf0Var.m18541a()) == null) ? mo2793c : this.f9533b.mo2793c(m18541a, i, i2);
        }
        mo2793c = null;
        if (mo2793c != null) {
            return mo2793c;
        }
    }

    @Override // com.daaw.d51
    public String getId() {
        return "ImageVideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }
}
