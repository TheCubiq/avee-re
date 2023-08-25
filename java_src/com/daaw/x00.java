package com.daaw;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
/* loaded from: classes.dex */
public class x00 implements d51<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    public final ns1 f31700a;

    /* renamed from: b */
    public final InterfaceC0832bc f31701b;

    /* renamed from: c */
    public EnumC0988cq f31702c;

    public x00(InterfaceC0832bc interfaceC0832bc, EnumC0988cq enumC0988cq) {
        this(new ns1(), interfaceC0832bc, enumC0988cq);
    }

    public x00(ns1 ns1Var, InterfaceC0832bc interfaceC0832bc, EnumC0988cq enumC0988cq) {
        this.f31700a = ns1Var;
        this.f31701b = interfaceC0832bc;
        this.f31702c = enumC0988cq;
    }

    @Override // com.daaw.d51
    /* renamed from: a */
    public z41<Bitmap> mo2793c(ParcelFileDescriptor parcelFileDescriptor, int i, int i2) {
        return C1073dc.m24559d(this.f31700a.m14849a(parcelFileDescriptor, this.f31701b, i, i2, this.f31702c), this.f31701b);
    }

    @Override // com.daaw.d51
    public String getId() {
        return "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap";
    }
}
