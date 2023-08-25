package com.daaw;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class z88 {

    /* renamed from: a */
    public final w88 f34609a;

    /* renamed from: b */
    public final t88 f34610b;

    /* renamed from: c */
    public final xp4 f34611c;

    /* renamed from: d */
    public final l64 f34612d;

    /* renamed from: e */
    public int f34613e;

    /* renamed from: f */
    public Object f34614f;

    /* renamed from: g */
    public final Looper f34615g;

    /* renamed from: h */
    public final int f34616h;

    /* renamed from: i */
    public boolean f34617i;

    /* renamed from: j */
    public boolean f34618j;

    /* renamed from: k */
    public boolean f34619k;

    public z88(t88 t88Var, w88 w88Var, l64 l64Var, int i, xp4 xp4Var, Looper looper) {
        this.f34610b = t88Var;
        this.f34609a = w88Var;
        this.f34612d = l64Var;
        this.f34615g = looper;
        this.f34611c = xp4Var;
        this.f34616h = i;
    }

    /* renamed from: a */
    public final int m2609a() {
        return this.f34613e;
    }

    /* renamed from: b */
    public final Looper m2608b() {
        return this.f34615g;
    }

    /* renamed from: c */
    public final w88 m2607c() {
        return this.f34609a;
    }

    /* renamed from: d */
    public final z88 m2606d() {
        uo4.m7872f(!this.f34617i);
        this.f34617i = true;
        this.f34610b.mo8514c(this);
        return this;
    }

    /* renamed from: e */
    public final z88 m2605e(Object obj) {
        uo4.m7872f(!this.f34617i);
        this.f34614f = obj;
        return this;
    }

    /* renamed from: f */
    public final z88 m2604f(int i) {
        uo4.m7872f(!this.f34617i);
        this.f34613e = i;
        return this;
    }

    /* renamed from: g */
    public final Object m2603g() {
        return this.f34614f;
    }

    /* renamed from: h */
    public final synchronized void m2602h(boolean z) {
        this.f34618j = z | this.f34618j;
        this.f34619k = true;
        notifyAll();
    }

    /* renamed from: i */
    public final synchronized boolean m2601i(long j) {
        uo4.m7872f(this.f34617i);
        uo4.m7872f(this.f34615g.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.f34619k) {
            if (j <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(j);
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        return this.f34618j;
    }

    /* renamed from: j */
    public final synchronized boolean m2600j() {
        return false;
    }
}
