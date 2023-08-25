package com.daaw;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class v60 implements cn1<s60> {

    /* renamed from: a */
    public final cn1<Bitmap> f29932a;

    /* renamed from: b */
    public final InterfaceC0832bc f29933b;

    public v60(cn1<Bitmap> cn1Var, InterfaceC0832bc interfaceC0832bc) {
        this.f29932a = cn1Var;
        this.f29933b = interfaceC0832bc;
    }

    @Override // com.daaw.cn1
    /* renamed from: a */
    public z41<s60> mo7395a(z41<s60> z41Var, int i, int i2) {
        s60 s60Var = z41Var.get();
        Bitmap m10681f = z41Var.get().m10681f();
        Bitmap bitmap = this.f29932a.mo7395a(new C1073dc(m10681f, this.f29933b), i, i2).get();
        return !bitmap.equals(m10681f) ? new u60(new s60(s60Var, bitmap, this.f29932a)) : z41Var;
    }

    @Override // com.daaw.cn1
    public String getId() {
        return this.f29932a.getId();
    }
}
