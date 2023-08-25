package com.daaw;

import com.daaw.C1897k3;
/* loaded from: classes.dex */
public final class g02 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ h02 f10119p;

    public g02(h02 h02Var) {
        this.f10119p = h02Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1897k3.InterfaceC1906f interfaceC1906f;
        C1897k3.InterfaceC1906f interfaceC1906f2;
        i02 i02Var = this.f10119p.f11920a;
        interfaceC1906f = i02Var.f13126q;
        interfaceC1906f2 = i02Var.f13126q;
        interfaceC1906f.disconnect(interfaceC1906f2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
