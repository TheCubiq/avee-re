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
    public final AtomicInteger a;
    public final Set b;
    public final PriorityBlockingQueue c;
    public final PriorityBlockingQueue d;
    public final we2 e;
    public final ff2 f;
    public final gf2[] g;
    public ye2 h;
    public final List i;
    public final List j;
    public final df2 k;

    public tf2(we2 we2Var, ff2 ff2Var, int i) {
        df2 df2Var = new df2(new Handler(Looper.getMainLooper()));
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue();
        this.d = new PriorityBlockingQueue();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.e = we2Var;
        this.f = ff2Var;
        this.g = new gf2[4];
        this.k = df2Var;
    }

    public final qf2 a(qf2 qf2Var) {
        qf2Var.zzf(this);
        synchronized (this.b) {
            this.b.add(qf2Var);
        }
        qf2Var.zzg(this.a.incrementAndGet());
        qf2Var.zzm("add-to-queue");
        c(qf2Var, 0);
        this.c.add(qf2Var);
        return qf2Var;
    }

    public final void b(qf2 qf2Var) {
        synchronized (this.b) {
            this.b.remove(qf2Var);
        }
        synchronized (this.i) {
            for (sf2 sf2Var : this.i) {
                sf2Var.zza();
            }
        }
        c(qf2Var, 5);
    }

    public final void c(qf2 qf2Var, int i) {
        synchronized (this.j) {
            for (rf2 rf2Var : this.j) {
                rf2Var.zza();
            }
        }
    }

    public final void d() {
        ye2 ye2Var = this.h;
        if (ye2Var != null) {
            ye2Var.b();
        }
        gf2[] gf2VarArr = this.g;
        for (int i = 0; i < 4; i++) {
            gf2 gf2Var = gf2VarArr[i];
            if (gf2Var != null) {
                gf2Var.a();
            }
        }
        ye2 ye2Var2 = new ye2(this.c, this.d, this.e, this.k, null);
        this.h = ye2Var2;
        ye2Var2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            gf2 gf2Var2 = new gf2(this.d, this.f, this.e, this.k, null);
            this.g[i2] = gf2Var2;
            gf2Var2.start();
        }
    }
}
