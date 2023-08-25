package com.daaw;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class q60 implements cn1<k60> {

    /* renamed from: a */
    public final cn1<Bitmap> f23683a;

    /* renamed from: b */
    public final cn1<s60> f23684b;

    public q60(InterfaceC0832bc interfaceC0832bc, cn1<Bitmap> cn1Var) {
        this(cn1Var, new v60(cn1Var, interfaceC0832bc));
    }

    public q60(cn1<Bitmap> cn1Var, cn1<s60> cn1Var2) {
        this.f23683a = cn1Var;
        this.f23684b = cn1Var2;
    }

    @Override // com.daaw.cn1
    /* renamed from: a */
    public z41<k60> mo7395a(z41<k60> z41Var, int i, int i2) {
        cn1<s60> cn1Var;
        cn1<Bitmap> cn1Var2;
        z41<Bitmap> m18035a = z41Var.get().m18035a();
        z41<s60> m18034b = z41Var.get().m18034b();
        if (m18035a != null && (cn1Var2 = this.f23683a) != null) {
            z41<Bitmap> mo7395a = cn1Var2.mo7395a(m18035a, i, i2);
            return !m18035a.equals(mo7395a) ? new m60(new k60(mo7395a, z41Var.get().m18034b())) : z41Var;
        } else if (m18034b == null || (cn1Var = this.f23684b) == null) {
            return z41Var;
        } else {
            z41<s60> mo7395a2 = cn1Var.mo7395a(m18034b, i, i2);
            return !m18034b.equals(mo7395a2) ? new m60(new k60(z41Var.get().m18035a(), mo7395a2)) : z41Var;
        }
    }

    @Override // com.daaw.cn1
    public String getId() {
        return this.f23683a.getId();
    }
}
