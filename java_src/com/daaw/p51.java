package com.daaw;

import java.io.Serializable;
/* loaded from: classes2.dex */
public final class p51<T> implements Serializable {
    public static final a p = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(pq pqVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Serializable {
        public final Throwable p;

        public b(Throwable th) {
            ug0.f(th, "exception");
            this.p = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && ug0.a(this.p, ((b) obj).p);
        }

        public int hashCode() {
            return this.p.hashCode();
        }

        public String toString() {
            return "Failure(" + this.p + ')';
        }
    }

    public static <T> Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).p;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }
}
