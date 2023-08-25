package com.daaw;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzaw;
/* loaded from: classes2.dex */
public final class hb8 implements Runnable {
    public final /* synthetic */ String p;
    public final /* synthetic */ String q = "_err";
    public final /* synthetic */ Bundle r;
    public final /* synthetic */ kb8 s;

    public hb8(kb8 kb8Var, String str, String str2, Bundle bundle) {
        this.s = kb8Var;
        this.p = str;
        this.r = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.s.a.j((zzaw) ry0.j(this.s.a.h0().w0(this.p, this.q, this.r, "auto", this.s.a.b().a(), false, true)), this.p);
    }
}
