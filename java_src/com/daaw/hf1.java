package com.daaw;

import androidx.work.WorkerParameters;
/* loaded from: classes.dex */
public class hf1 implements Runnable {

    /* renamed from: p */
    public ey1 f12496p;

    /* renamed from: q */
    public String f12497q;

    /* renamed from: r */
    public WorkerParameters.C0506a f12498r;

    public hf1(ey1 ey1Var, String str, WorkerParameters.C0506a c0506a) {
        this.f12496p = ey1Var;
        this.f12497q = str;
        this.f12498r = c0506a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f12496p.m23002m().m18151k(this.f12497q, this.f12498r);
    }
}
