package com.daaw;

import android.os.Looper;
import java.util.Objects;
/* loaded from: classes.dex */
public class kx<Z> implements z41<Z> {
    public final z41<Z> a;
    public final boolean b;
    public a c;
    public hi0 d;
    public int e;
    public boolean f;

    /* loaded from: classes.dex */
    public interface a {
        void c(hi0 hi0Var, kx<?> kxVar);
    }

    public kx(z41<Z> z41Var, boolean z) {
        Objects.requireNonNull(z41Var, "Wrapped resource must not be null");
        this.a = z41Var;
        this.b = z;
    }

    @Override // com.daaw.z41
    public int a() {
        return this.a.a();
    }

    public void b() {
        if (this.f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
        this.e++;
    }

    @Override // com.daaw.z41
    public void c() {
        if (this.e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f = true;
        this.a.c();
    }

    public boolean d() {
        return this.b;
    }

    public void e() {
        if (this.e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
        int i = this.e - 1;
        this.e = i;
        if (i == 0) {
            this.c.c(this.d, this);
        }
    }

    public void f(hi0 hi0Var, a aVar) {
        this.d = hi0Var;
        this.c = aVar;
    }

    @Override // com.daaw.z41
    public Z get() {
        return this.a.get();
    }
}
