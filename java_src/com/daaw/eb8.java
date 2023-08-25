package com.daaw;

import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class eb8 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzq f8323a;

    /* renamed from: b */
    public final /* synthetic */ yb8 f8324b;

    public eb8(yb8 yb8Var, zzq zzqVar) {
        this.f8324b = yb8Var;
        this.f8323a = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        cd2 m3916V = this.f8324b.m3916V((String) ry0.m10830j(this.f8323a.f37092p));
        vb2 vb2Var = vb2.ANALYTICS_STORAGE;
        if (m3916V.m25423i(vb2Var) && cd2.m25430b(this.f8323a.f37089K).m25423i(vb2Var)) {
            return this.f8324b.m3919S(this.f8323a).m12167e0();
        }
        this.f8324b.mo3895i().m14156v().m20653a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
