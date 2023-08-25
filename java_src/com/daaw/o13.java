package com.daaw;

import android.view.View;
/* loaded from: classes.dex */
public final class o13 implements Runnable {
    public final /* synthetic */ View p;
    public final /* synthetic */ s13 q;

    public o13(s13 s13Var, View view) {
        this.q = s13Var;
        this.p = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.c(this.p);
    }
}
