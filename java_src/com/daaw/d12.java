package com.daaw;

import com.google.android.gms.signin.internal.zak;
/* loaded from: classes.dex */
public final class d12 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zak f6360p;

    /* renamed from: q */
    public final /* synthetic */ f12 f6361q;

    public d12(f12 f12Var, zak zakVar) {
        this.f6361q = f12Var;
        this.f6360p = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f12.m22969i3(this.f6361q, this.f6360p);
    }
}
