package com.daaw;

import android.content.Context;
/* loaded from: classes2.dex */
public final class yp8 implements InterfaceC2013l5 {

    /* renamed from: a */
    public final InterfaceC2013l5 f33935a;

    /* renamed from: b */
    public final InterfaceC2013l5 f33936b;

    public yp8(Context context) {
        this.f33935a = new pm8(context, x70.m5492f());
        this.f33936b = tc8.m9299d(context);
    }

    /* renamed from: b */
    public static /* synthetic */ rj1 m3452b(yp8 yp8Var, rj1 rj1Var) {
        if (rj1Var.mo11236n() || rj1Var.mo11238l()) {
            return rj1Var;
        }
        Exception mo11240j = rj1Var.mo11240j();
        if (mo11240j instanceof C2009l3) {
            int m17190b = ((C2009l3) mo11240j).m17190b();
            return (m17190b == 43001 || m17190b == 43002 || m17190b == 43003 || m17190b == 17) ? yp8Var.f33936b.mo3453a() : m17190b == 43000 ? dk1.m24305d(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : m17190b != 15 ? rj1Var : dk1.m24305d(new Exception("The operation to get app set ID timed out. Please try again later."));
        }
        return rj1Var;
    }

    @Override // com.daaw.InterfaceC2013l5
    /* renamed from: a */
    public final rj1<C2151m5> mo3453a() {
        return this.f33935a.mo3453a().mo11242h(new InterfaceC1587hl() { // from class: com.daaw.no8
            @Override // com.daaw.InterfaceC1587hl
            /* renamed from: a */
            public final Object mo2139a(rj1 rj1Var) {
                return yp8.m3452b(yp8.this, rj1Var);
            }
        });
    }
}
