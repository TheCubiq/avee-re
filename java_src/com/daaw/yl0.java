package com.daaw;

import android.annotation.SuppressLint;
import com.daaw.ep0;
/* loaded from: classes.dex */
public class yl0 extends vl0<hi0, z41<?>> implements ep0 {

    /* renamed from: e */
    public ep0.InterfaceC1210a f33770e;

    public yl0(int i) {
        super(i);
    }

    @Override // com.daaw.ep0
    /* renamed from: a */
    public /* bridge */ /* synthetic */ z41 mo3591a(hi0 hi0Var, z41 z41Var) {
        return (z41) super.m7061k(hi0Var, z41Var);
    }

    @Override // com.daaw.ep0
    /* renamed from: b */
    public /* bridge */ /* synthetic */ z41 mo3590b(hi0 hi0Var) {
        return (z41) super.m7060l(hi0Var);
    }

    @Override // com.daaw.ep0
    @SuppressLint({"InlinedApi"})
    /* renamed from: c */
    public void mo3589c(int i) {
        if (i >= 60) {
            m7065d();
        } else if (i >= 40) {
            m7059m(m7062h() / 2);
        }
    }

    @Override // com.daaw.ep0
    /* renamed from: e */
    public void mo3588e(ep0.InterfaceC1210a interfaceC1210a) {
        this.f33770e = interfaceC1210a;
    }

    @Override // com.daaw.vl0
    /* renamed from: n */
    public int mo3587i(z41<?> z41Var) {
        return z41Var.mo2828a();
    }

    @Override // com.daaw.vl0
    /* renamed from: o */
    public void mo3586j(hi0 hi0Var, z41<?> z41Var) {
        ep0.InterfaceC1210a interfaceC1210a = this.f33770e;
        if (interfaceC1210a != null) {
            interfaceC1210a.mo22180d(z41Var);
        }
    }
}
