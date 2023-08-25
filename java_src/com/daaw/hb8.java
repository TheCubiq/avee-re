package com.daaw;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzaw;
/* loaded from: classes2.dex */
public final class hb8 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ String f12364p;

    /* renamed from: q */
    public final /* synthetic */ String f12365q = "_err";

    /* renamed from: r */
    public final /* synthetic */ Bundle f12366r;

    /* renamed from: s */
    public final /* synthetic */ kb8 f12367s;

    public hb8(kb8 kb8Var, String str, String str2, Bundle bundle) {
        this.f12367s = kb8Var;
        this.f12364p = str;
        this.f12366r = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12367s.f16131a.m3893j((zzaw) ry0.m10830j(this.f12367s.f16131a.m3896h0().m24457w0(this.f12364p, this.f12365q, this.f12366r, "auto", this.f12367s.f16131a.mo3909b().mo15860a(), false, true)), this.f12364p);
    }
}
