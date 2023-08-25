package com.daaw;

import android.content.ComponentName;
/* loaded from: classes2.dex */
public final class i78 implements Runnable {
    public final /* synthetic */ ComponentName p;
    public final /* synthetic */ u78 q;

    public i78(u78 u78Var, ComponentName componentName) {
        this.q = u78Var;
        this.p = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x78.M(this.q.c, this.p);
    }
}
