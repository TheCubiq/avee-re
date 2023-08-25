package com.daaw;

import com.google.android.gms.signin.internal.zak;
/* loaded from: classes.dex */
public final class d12 implements Runnable {
    public final /* synthetic */ zak p;
    public final /* synthetic */ f12 q;

    public d12(f12 f12Var, zak zakVar) {
        this.q = f12Var;
        this.p = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f12.i3(this.q, this.p);
    }
}
