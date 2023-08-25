package com.daaw;

import java.io.Serializable;
/* loaded from: classes2.dex */
public final class p51<T> implements Serializable {

    /* renamed from: p */
    public static final C2516a f22616p = new C2516a(null);

    /* renamed from: com.daaw.p51$a */
    /* loaded from: classes2.dex */
    public static final class C2516a {
        public C2516a() {
        }

        public /* synthetic */ C2516a(C2575pq c2575pq) {
            this();
        }
    }

    /* renamed from: com.daaw.p51$b */
    /* loaded from: classes2.dex */
    public static final class C2517b implements Serializable {

        /* renamed from: p */
        public final Throwable f22617p;

        public C2517b(Throwable th) {
            ug0.m8268f(th, "exception");
            this.f22617p = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C2517b) && ug0.m8273a(this.f22617p, ((C2517b) obj).f22617p);
        }

        public int hashCode() {
            return this.f22617p.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f22617p + ')';
        }
    }

    /* renamed from: a */
    public static <T> Object m13631a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final Throwable m13630b(Object obj) {
        if (obj instanceof C2517b) {
            return ((C2517b) obj).f22617p;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m13629c(Object obj) {
        return obj instanceof C2517b;
    }

    /* renamed from: d */
    public static final boolean m13628d(Object obj) {
        return !(obj instanceof C2517b);
    }
}
