package com.daaw;

import com.daaw.C1325ft;
/* renamed from: com.daaw.pt */
/* loaded from: classes.dex */
public class C2587pt extends C1325ft {

    /* renamed from: m */
    public int f23257m;

    public C2587pt(kx1 kx1Var) {
        super(kx1Var);
        this.f9866e = kx1Var instanceof sb0 ? C1325ft.EnumC1326a.HORIZONTAL_DIMENSION : C1325ft.EnumC1326a.VERTICAL_DIMENSION;
    }

    @Override // com.daaw.C1325ft
    /* renamed from: d */
    public void mo13161d(int i) {
        if (this.f9871j) {
            return;
        }
        this.f9871j = true;
        this.f9868g = i;
        for (InterfaceC3891zs interfaceC3891zs : this.f9872k) {
            interfaceC3891zs.mo1956a(interfaceC3891zs);
        }
    }
}
