package com.daaw;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes2.dex */
public final class z98 {

    /* renamed from: a */
    public final /* synthetic */ ca8 f34633a;

    public z98(ca8 ca8Var) {
        this.f34633a = ca8Var;
    }

    /* renamed from: a */
    public final void m2584a() {
        this.f34633a.mo6991f();
        if (this.f34633a.f25143a.m24053F().m17169v(this.f34633a.f25143a.mo3909b().mo15860a())) {
            this.f34633a.f25143a.m24053F().f17010l.m12013a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f34633a.f25143a.mo3895i().m14156v().m20653a("Detected application was in foreground");
                m2582c(this.f34633a.f25143a.mo3909b().mo15860a(), false);
            }
        }
    }

    /* renamed from: b */
    public final void m2583b(long j, boolean z) {
        this.f34633a.mo6991f();
        this.f34633a.m25459s();
        if (this.f34633a.f25143a.m24053F().m17169v(j)) {
            this.f34633a.f25143a.m24053F().f17010l.m12013a(true);
            zm8.m2111b();
            if (this.f34633a.f25143a.m24020z().m12677B(null, m75.f18548o0)) {
                this.f34633a.f25143a.m24057B().m5298v();
            }
        }
        this.f34633a.f25143a.m24053F().f17013o.m4399b(j);
        if (this.f34633a.f25143a.m24053F().f17010l.m12012b()) {
            m2582c(j, z);
        }
    }

    /* renamed from: c */
    public final void m2582c(long j, boolean z) {
        this.f34633a.mo6991f();
        if (this.f34633a.f25143a.m24031n()) {
            this.f34633a.f25143a.m24053F().f17013o.m4399b(j);
            this.f34633a.f25143a.mo3895i().m14156v().m20652b("Session started, time", Long.valueOf(this.f34633a.f25143a.mo3909b().mo15859b()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f34633a.f25143a.m24050I().m13709M("auto", "_sid", valueOf, j);
            this.f34633a.f25143a.m24053F().f17014p.m4399b(valueOf.longValue());
            this.f34633a.f25143a.m24053F().f17010l.m12013a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f34633a.f25143a.m24020z().m12677B(null, m75.f18522b0) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.f34633a.f25143a.m24050I().m13682v("auto", "_s", j, bundle);
            qj8.m12386b();
            if (this.f34633a.f25143a.m24020z().m12677B(null, m75.f18528e0)) {
                String m20167a = this.f34633a.f25143a.m24053F().f17019u.m20167a();
                if (TextUtils.isEmpty(m20167a)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", m20167a);
                this.f34633a.f25143a.m24050I().m13682v("auto", "_ssr", j, bundle2);
            }
        }
    }
}
