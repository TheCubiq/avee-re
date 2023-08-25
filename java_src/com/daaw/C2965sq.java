package com.daaw;

import android.content.Context;
import com.daaw.InterfaceC2200mp;
/* renamed from: com.daaw.sq */
/* loaded from: classes.dex */
public final class C2965sq implements InterfaceC2200mp.InterfaceC2201a {

    /* renamed from: a */
    public final Context f26517a;

    /* renamed from: b */
    public final bn1<? super InterfaceC2200mp> f26518b;

    /* renamed from: c */
    public final InterfaceC2200mp.InterfaceC2201a f26519c;

    public C2965sq(Context context, bn1<? super InterfaceC2200mp> bn1Var, InterfaceC2200mp.InterfaceC2201a interfaceC2201a) {
        this.f26517a = context.getApplicationContext();
        this.f26518b = bn1Var;
        this.f26519c = interfaceC2201a;
    }

    @Override // com.daaw.InterfaceC2200mp.InterfaceC2201a
    /* renamed from: b */
    public C2875rq mo9376a() {
        return new C2875rq(this.f26517a, this.f26518b, this.f26519c.mo9376a());
    }
}
