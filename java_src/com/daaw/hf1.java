package com.daaw;

import androidx.work.WorkerParameters;
/* loaded from: classes.dex */
public class hf1 implements Runnable {
    public ey1 p;
    public String q;
    public WorkerParameters.a r;

    public hf1(ey1 ey1Var, String str, WorkerParameters.a aVar) {
        this.p = ey1Var;
        this.q = str;
        this.r = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.p.m().k(this.q, this.r);
    }
}
