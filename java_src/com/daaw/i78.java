package com.daaw;

import android.content.ComponentName;
/* loaded from: classes2.dex */
public final class i78 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ ComponentName f13340p;

    /* renamed from: q */
    public final /* synthetic */ u78 f13341q;

    public i78(u78 u78Var, ComponentName componentName) {
        this.f13341q = u78Var;
        this.f13340p = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x78.m5471M(this.f13341q.f28773c, this.f13340p);
    }
}
