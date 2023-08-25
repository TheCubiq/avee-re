package com.daaw;

import android.graphics.Bitmap;
import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
public class hf0 implements InterfaceC1849jp<jf0, k60> {

    /* renamed from: p */
    public final d51<File, k60> f12492p;

    /* renamed from: q */
    public final d51<jf0, k60> f12493q;

    /* renamed from: r */
    public final e51<k60> f12494r;

    /* renamed from: s */
    public final InterfaceC3911zw<jf0> f12495s;

    public hf0(InterfaceC1849jp<jf0, Bitmap> interfaceC1849jp, InterfaceC1849jp<InputStream, s60> interfaceC1849jp2, InterfaceC0832bc interfaceC0832bc) {
        n60 n60Var = new n60(interfaceC1849jp.mo6616d(), interfaceC1849jp2.mo6616d(), interfaceC0832bc);
        this.f12492p = new i10(new p60(n60Var));
        this.f12493q = n60Var;
        this.f12494r = new o60(interfaceC1849jp.mo6617c(), interfaceC1849jp2.mo6617c());
        this.f12495s = interfaceC1849jp.mo6618a();
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: a */
    public InterfaceC3911zw<jf0> mo6618a() {
        return this.f12495s;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: c */
    public e51<k60> mo6617c() {
        return this.f12494r;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: d */
    public d51<jf0, k60> mo6616d() {
        return this.f12493q;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: e */
    public d51<File, k60> mo6615e() {
        return this.f12492p;
    }
}
