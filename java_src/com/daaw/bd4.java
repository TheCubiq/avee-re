package com.daaw;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
/* loaded from: classes.dex */
public class bd4 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public int e;
    public int f;
    public boolean g;
    public final y17 h;
    public final y17 i;
    public final int j;
    public final int k;
    public final y17 l;
    public y17 m;
    public int n;
    public final HashMap o;
    public final HashSet p;

    @Deprecated
    public bd4() {
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = true;
        this.h = y17.u();
        this.i = y17.u();
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.l = y17.u();
        this.m = y17.u();
        this.n = 0;
        this.o = new HashMap();
        this.p = new HashSet();
    }

    public bd4(de4 de4Var) {
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.e = de4Var.i;
        this.f = de4Var.j;
        this.g = de4Var.k;
        this.h = de4Var.l;
        this.i = de4Var.n;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.l = de4Var.r;
        this.m = de4Var.s;
        this.n = de4Var.t;
        this.p = new HashSet(de4Var.z);
        this.o = new HashMap(de4Var.y);
    }

    public final bd4 d(Context context) {
        CaptioningManager captioningManager;
        if ((it5.a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.n = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.m = y17.v(it5.n(locale));
            }
        }
        return this;
    }

    public bd4 e(int i, int i2, boolean z) {
        this.e = i;
        this.f = i2;
        this.g = true;
        return this;
    }
}
