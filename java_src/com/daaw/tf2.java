package com.daaw;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class tf2 {

    /* renamed from: a */
    public final AtomicInteger f27589a;

    /* renamed from: b */
    public final Set f27590b;

    /* renamed from: c */
    public final PriorityBlockingQueue f27591c;

    /* renamed from: d */
    public final PriorityBlockingQueue f27592d;

    /* renamed from: e */
    public final we2 f27593e;

    /* renamed from: f */
    public final ff2 f27594f;

    /* renamed from: g */
    public final gf2[] f27595g;

    /* renamed from: h */
    public ye2 f27596h;

    /* renamed from: i */
    public final List f27597i;

    /* renamed from: j */
    public final List f27598j;

    /* renamed from: k */
    public final df2 f27599k;

    public tf2(we2 we2Var, ff2 ff2Var, int i) {
        df2 df2Var = new df2(new Handler(Looper.getMainLooper()));
        this.f27589a = new AtomicInteger();
        this.f27590b = new HashSet();
        this.f27591c = new PriorityBlockingQueue();
        this.f27592d = new PriorityBlockingQueue();
        this.f27597i = new ArrayList();
        this.f27598j = new ArrayList();
        this.f27593e = we2Var;
        this.f27594f = ff2Var;
        this.f27595g = new gf2[4];
        this.f27599k = df2Var;
    }

    /* renamed from: a */
    public final qf2 m9199a(qf2 qf2Var) {
        qf2Var.zzf(this);
        synchronized (this.f27590b) {
            this.f27590b.add(qf2Var);
        }
        qf2Var.zzg(this.f27589a.incrementAndGet());
        qf2Var.zzm("add-to-queue");
        m9197c(qf2Var, 0);
        this.f27591c.add(qf2Var);
        return qf2Var;
    }

    /* renamed from: b */
    public final void m9198b(qf2 qf2Var) {
        synchronized (this.f27590b) {
            this.f27590b.remove(qf2Var);
        }
        synchronized (this.f27597i) {
            for (sf2 sf2Var : this.f27597i) {
                sf2Var.zza();
            }
        }
        m9197c(qf2Var, 5);
    }

    /* renamed from: c */
    public final void m9197c(qf2 qf2Var, int i) {
        synchronized (this.f27598j) {
            for (rf2 rf2Var : this.f27598j) {
                rf2Var.zza();
            }
        }
    }

    /* renamed from: d */
    public final void m9196d() {
        ye2 ye2Var = this.f27596h;
        if (ye2Var != null) {
            ye2Var.m3809b();
        }
        gf2[] gf2VarArr = this.f27595g;
        for (int i = 0; i < 4; i++) {
            gf2 gf2Var = gf2VarArr[i];
            if (gf2Var != null) {
                gf2Var.m21726a();
            }
        }
        ye2 ye2Var2 = new ye2(this.f27591c, this.f27592d, this.f27593e, this.f27599k, null);
        this.f27596h = ye2Var2;
        ye2Var2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            gf2 gf2Var2 = new gf2(this.f27592d, this.f27594f, this.f27593e, this.f27599k, null);
            this.f27595g[i2] = gf2Var2;
            gf2Var2.start();
        }
    }
}
