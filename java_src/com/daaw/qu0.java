package com.daaw;

import android.annotation.SuppressLint;
/* loaded from: classes.dex */
public interface qu0 {
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c a = new b.c();
    @SuppressLint({"SyntheticAccessor"})
    public static final b.C0086b b = new b.C0086b();

    /* loaded from: classes.dex */
    public static abstract class b {

        /* loaded from: classes.dex */
        public static final class a extends b {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public Throwable a() {
                return this.a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.a.getMessage());
            }
        }

        /* renamed from: com.daaw.qu0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0086b extends b {
            public C0086b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends b {
            public c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }
    }
}
