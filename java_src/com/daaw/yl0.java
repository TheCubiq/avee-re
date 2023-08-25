package com.daaw;

import android.annotation.SuppressLint;
import com.daaw.ep0;
/* loaded from: classes.dex */
public class yl0 extends vl0<hi0, z41<?>> implements ep0 {
    public ep0.a e;

    public yl0(int i) {
        super(i);
    }

    @Override // com.daaw.ep0
    public /* bridge */ /* synthetic */ z41 a(hi0 hi0Var, z41 z41Var) {
        return (z41) super.k(hi0Var, z41Var);
    }

    @Override // com.daaw.ep0
    public /* bridge */ /* synthetic */ z41 b(hi0 hi0Var) {
        return (z41) super.l(hi0Var);
    }

    @Override // com.daaw.ep0
    @SuppressLint({"InlinedApi"})
    public void c(int i) {
        if (i >= 60) {
            d();
        } else if (i >= 40) {
            m(h() / 2);
        }
    }

    @Override // com.daaw.ep0
    public void e(ep0.a aVar) {
        this.e = aVar;
    }

    @Override // com.daaw.vl0
    /* renamed from: n */
    public int i(z41<?> z41Var) {
        return z41Var.a();
    }

    @Override // com.daaw.vl0
    /* renamed from: o */
    public void j(hi0 hi0Var, z41<?> z41Var) {
        ep0.a aVar = this.e;
        if (aVar != null) {
            aVar.d(z41Var);
        }
    }
}
