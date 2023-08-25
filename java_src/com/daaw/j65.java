package com.daaw;
/* loaded from: classes2.dex */
public final class j65 {

    /* renamed from: h */
    public static final Object f14454h = new Object();

    /* renamed from: a */
    public final String f14455a;

    /* renamed from: b */
    public final b35 f14456b;

    /* renamed from: c */
    public final Object f14457c;

    /* renamed from: d */
    public final Object f14458d;

    /* renamed from: e */
    public final Object f14459e = new Object();

    /* renamed from: f */
    public volatile Object f14460f = null;

    /* renamed from: g */
    public volatile Object f14461g = null;

    public /* synthetic */ j65(String str, Object obj, Object obj2, b35 b35Var, g55 g55Var) {
        this.f14455a = str;
        this.f14457c = obj;
        this.f14458d = obj2;
        this.f14456b = b35Var;
    }

    /* renamed from: a */
    public final Object m18786a(Object obj) {
        synchronized (this.f14459e) {
        }
        if (obj != null) {
            return obj;
        }
        if (d45.f6527a == null) {
            return this.f14457c;
        }
        synchronized (f14454h) {
            if (b52.m26486a()) {
                return this.f14461g == null ? this.f14457c : this.f14461g;
            }
            try {
                for (j65 j65Var : m75.m16191b()) {
                    if (b52.m26486a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    Object obj2 = null;
                    try {
                        b35 b35Var = j65Var.f14456b;
                        if (b35Var != null) {
                            obj2 = b35Var.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (f14454h) {
                        j65Var.f14461g = obj2;
                    }
                }
            } catch (SecurityException unused2) {
            }
            b35 b35Var2 = this.f14456b;
            if (b35Var2 == null) {
                return this.f14457c;
            }
            try {
                return b35Var2.zza();
            } catch (IllegalStateException unused3) {
                return this.f14457c;
            } catch (SecurityException unused4) {
                return this.f14457c;
            }
        }
    }

    /* renamed from: b */
    public final String m18785b() {
        return this.f14455a;
    }
}
