package com.daaw;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
/* loaded from: classes.dex */
public class x00 implements d51<ParcelFileDescriptor, Bitmap> {
    public final ns1 a;
    public final bc b;
    public cq c;

    public x00(bc bcVar, cq cqVar) {
        this(new ns1(), bcVar, cqVar);
    }

    public x00(ns1 ns1Var, bc bcVar, cq cqVar) {
        this.a = ns1Var;
        this.b = bcVar;
        this.c = cqVar;
    }

    @Override // com.daaw.d51
    /* renamed from: a */
    public z41<Bitmap> c(ParcelFileDescriptor parcelFileDescriptor, int i, int i2) {
        return dc.d(this.a.a(parcelFileDescriptor, this.b, i, i2, this.c), this.b);
    }

    @Override // com.daaw.d51
    public String getId() {
        return "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap";
    }
}
