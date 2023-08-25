package com.daaw;
/* loaded from: classes2.dex */
public final class j65 {
    public static final Object h = new Object();
    public final String a;
    public final b35 b;
    public final Object c;
    public final Object d;
    public final Object e = new Object();
    public volatile Object f = null;
    public volatile Object g = null;

    public /* synthetic */ j65(String str, Object obj, Object obj2, b35 b35Var, g55 g55Var) {
        this.a = str;
        this.c = obj;
        this.d = obj2;
        this.b = b35Var;
    }

    public final Object a(Object obj) {
        synchronized (this.e) {
        }
        if (obj != null) {
            return obj;
        }
        if (d45.a == null) {
            return this.c;
        }
        synchronized (h) {
            if (b52.a()) {
                return this.g == null ? this.c : this.g;
            }
            try {
                for (j65 j65Var : m75.b()) {
                    if (b52.a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    Object obj2 = null;
                    try {
                        b35 b35Var = j65Var.b;
                        if (b35Var != null) {
                            obj2 = b35Var.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (h) {
                        j65Var.g = obj2;
                    }
                }
            } catch (SecurityException unused2) {
            }
            b35 b35Var2 = this.b;
            if (b35Var2 == null) {
                return this.c;
            }
            try {
                return b35Var2.zza();
            } catch (IllegalStateException unused3) {
                return this.c;
            } catch (SecurityException unused4) {
                return this.c;
            }
        }
    }

    public final String b() {
        return this.a;
    }
}
