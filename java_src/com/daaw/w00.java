package com.daaw;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.File;
/* loaded from: classes.dex */
public class w00 implements InterfaceC1849jp<ParcelFileDescriptor, Bitmap> {

    /* renamed from: p */
    public final d51<File, Bitmap> f30742p;

    /* renamed from: q */
    public final x00 f30743q;

    /* renamed from: r */
    public final C3826zb f30744r = new C3826zb();

    /* renamed from: s */
    public final InterfaceC3911zw<ParcelFileDescriptor> f30745s = it0.m19435b();

    public w00(InterfaceC0832bc interfaceC0832bc, EnumC0988cq enumC0988cq) {
        this.f30742p = new i10(new kg1(interfaceC0832bc, enumC0988cq));
        this.f30743q = new x00(interfaceC0832bc, enumC0988cq);
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: a */
    public InterfaceC3911zw<ParcelFileDescriptor> mo6618a() {
        return this.f30745s;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: c */
    public e51<Bitmap> mo6617c() {
        return this.f30744r;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: d */
    public d51<ParcelFileDescriptor, Bitmap> mo6616d() {
        return this.f30743q;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: e */
    public d51<File, Bitmap> mo6615e() {
        return this.f30742p;
    }
}
