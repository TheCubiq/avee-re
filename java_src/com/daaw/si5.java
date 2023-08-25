package com.daaw;

import android.content.Context;
import android.content.pm.ApplicationInfo;
/* loaded from: classes.dex */
public final class si5 implements wz7 {
    public final m08 a;

    public si5(m08 m08Var) {
        this.a = m08Var;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.a.zzb()).getApplicationInfo();
        e08.b(applicationInfo);
        return applicationInfo;
    }
}
