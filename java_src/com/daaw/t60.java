package com.daaw;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
public class t60 implements InterfaceC1849jp<InputStream, s60> {

    /* renamed from: p */
    public final c70 f27024p;

    /* renamed from: q */
    public final d70 f27025q;

    /* renamed from: r */
    public final mg1 f27026r;

    /* renamed from: s */
    public final i10<s60> f27027s;

    public t60(Context context, InterfaceC0832bc interfaceC0832bc) {
        c70 c70Var = new c70(context, interfaceC0832bc);
        this.f27024p = c70Var;
        this.f27027s = new i10<>(c70Var);
        this.f27025q = new d70(interfaceC0832bc);
        this.f27026r = new mg1();
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: a */
    public InterfaceC3911zw<InputStream> mo6618a() {
        return this.f27026r;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: c */
    public e51<s60> mo6617c() {
        return this.f27025q;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: d */
    public d51<InputStream, s60> mo6616d() {
        return this.f27024p;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: e */
    public d51<File, s60> mo6615e() {
        return this.f27027s;
    }
}
