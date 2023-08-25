package com.daaw;

import android.view.View;
/* loaded from: classes.dex */
public final class o13 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ View f20916p;

    /* renamed from: q */
    public final /* synthetic */ s13 f20917q;

    public o13(s13 s13Var, View view) {
        this.f20917q = s13Var;
        this.f20916p = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20917q.m10761c(this.f20916p);
    }
}
