package com.daaw;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes2.dex */
public final class z98 {
    public final /* synthetic */ ca8 a;

    public z98(ca8 ca8Var) {
        this.a = ca8Var;
    }

    public final void a() {
        this.a.f();
        if (this.a.a.F().v(this.a.a.b().a())) {
            this.a.a.F().l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.a.a.i().v().a("Detected application was in foreground");
                c(this.a.a.b().a(), false);
            }
        }
    }

    public final void b(long j, boolean z) {
        this.a.f();
        this.a.s();
        if (this.a.a.F().v(j)) {
            this.a.a.F().l.a(true);
            zm8.b();
            if (this.a.a.z().B(null, m75.o0)) {
                this.a.a.B().v();
            }
        }
        this.a.a.F().o.b(j);
        if (this.a.a.F().l.b()) {
            c(j, z);
        }
    }

    public final void c(long j, boolean z) {
        this.a.f();
        if (this.a.a.n()) {
            this.a.a.F().o.b(j);
            this.a.a.i().v().b("Session started, time", Long.valueOf(this.a.a.b().b()));
            Long valueOf = Long.valueOf(j / 1000);
            this.a.a.I().M("auto", "_sid", valueOf, j);
            this.a.a.F().p.b(valueOf.longValue());
            this.a.a.F().l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.a.a.z().B(null, m75.b0) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.a.a.I().v("auto", "_s", j, bundle);
            qj8.b();
            if (this.a.a.z().B(null, m75.e0)) {
                String a = this.a.a.F().u.a();
                if (TextUtils.isEmpty(a)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a);
                this.a.a.I().v("auto", "_ssr", j, bundle2);
            }
        }
    }
}
