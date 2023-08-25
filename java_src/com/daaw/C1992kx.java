package com.daaw;

import android.os.Looper;
import java.util.Objects;
/* renamed from: com.daaw.kx */
/* loaded from: classes.dex */
public class C1992kx<Z> implements z41<Z> {

    /* renamed from: a */
    public final z41<Z> f16794a;

    /* renamed from: b */
    public final boolean f16795b;

    /* renamed from: c */
    public InterfaceC1993a f16796c;

    /* renamed from: d */
    public hi0 f16797d;

    /* renamed from: e */
    public int f16798e;

    /* renamed from: f */
    public boolean f16799f;

    /* renamed from: com.daaw.kx$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1993a {
        /* renamed from: c */
        void mo17367c(hi0 hi0Var, C1992kx<?> c1992kx);
    }

    public C1992kx(z41<Z> z41Var, boolean z) {
        Objects.requireNonNull(z41Var, "Wrapped resource must not be null");
        this.f16794a = z41Var;
        this.f16795b = z;
    }

    @Override // com.daaw.z41
    /* renamed from: a */
    public int mo2828a() {
        return this.f16794a.mo2828a();
    }

    /* renamed from: b */
    public void m17371b() {
        if (this.f16799f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
        this.f16798e++;
    }

    @Override // com.daaw.z41
    /* renamed from: c */
    public void mo2827c() {
        if (this.f16798e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f16799f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f16799f = true;
        this.f16794a.mo2827c();
    }

    /* renamed from: d */
    public boolean m17370d() {
        return this.f16795b;
    }

    /* renamed from: e */
    public void m17369e() {
        if (this.f16798e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
        int i = this.f16798e - 1;
        this.f16798e = i;
        if (i == 0) {
            this.f16796c.mo17367c(this.f16797d, this);
        }
    }

    /* renamed from: f */
    public void m17368f(hi0 hi0Var, InterfaceC1993a interfaceC1993a) {
        this.f16797d = hi0Var;
        this.f16796c = interfaceC1993a;
    }

    @Override // com.daaw.z41
    public Z get() {
        return this.f16794a.get();
    }
}
