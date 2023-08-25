package com.daaw;

import android.graphics.Bitmap;
import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
public class jg1 implements InterfaceC1849jp<InputStream, Bitmap> {

    /* renamed from: p */
    public final kg1 f15079p;

    /* renamed from: q */
    public final C3826zb f15080q;

    /* renamed from: r */
    public final mg1 f15081r = new mg1();

    /* renamed from: s */
    public final i10<Bitmap> f15082s;

    public jg1(InterfaceC0832bc interfaceC0832bc, EnumC0988cq enumC0988cq) {
        kg1 kg1Var = new kg1(interfaceC0832bc, enumC0988cq);
        this.f15079p = kg1Var;
        this.f15080q = new C3826zb();
        this.f15082s = new i10<>(kg1Var);
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: a */
    public InterfaceC3911zw<InputStream> mo6618a() {
        return this.f15081r;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: c */
    public e51<Bitmap> mo6617c() {
        return this.f15080q;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: d */
    public d51<InputStream, Bitmap> mo6616d() {
        return this.f15079p;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: e */
    public d51<File, Bitmap> mo6615e() {
        return this.f15082s;
    }
}
