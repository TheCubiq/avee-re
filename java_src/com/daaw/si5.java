package com.daaw;

import android.content.Context;
import android.content.pm.ApplicationInfo;
/* loaded from: classes.dex */
public final class si5 implements wz7 {

    /* renamed from: a */
    public final m08 f26279a;

    public si5(m08 m08Var) {
        this.f26279a = m08Var;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.f26279a.zzb()).getApplicationInfo();
        e08.m23801b(applicationInfo);
        return applicationInfo;
    }
}
