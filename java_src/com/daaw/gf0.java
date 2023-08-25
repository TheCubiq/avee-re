package com.daaw;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
public class gf0 implements InterfaceC1849jp<jf0, Bitmap> {

    /* renamed from: p */
    public final ff0 f11133p;

    /* renamed from: q */
    public final d51<File, Bitmap> f11134q;

    /* renamed from: r */
    public final e51<Bitmap> f11135r;

    /* renamed from: s */
    public final kf0 f11136s;

    public gf0(InterfaceC1849jp<InputStream, Bitmap> interfaceC1849jp, InterfaceC1849jp<ParcelFileDescriptor, Bitmap> interfaceC1849jp2) {
        this.f11135r = interfaceC1849jp.mo6617c();
        this.f11136s = new kf0(interfaceC1849jp.mo6618a(), interfaceC1849jp2.mo6618a());
        this.f11134q = interfaceC1849jp.mo6615e();
        this.f11133p = new ff0(interfaceC1849jp.mo6616d(), interfaceC1849jp2.mo6616d());
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: a */
    public InterfaceC3911zw<jf0> mo6618a() {
        return this.f11136s;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: c */
    public e51<Bitmap> mo6617c() {
        return this.f11135r;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: d */
    public d51<jf0, Bitmap> mo6616d() {
        return this.f11133p;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: e */
    public d51<File, Bitmap> mo6615e() {
        return this.f11134q;
    }
}
