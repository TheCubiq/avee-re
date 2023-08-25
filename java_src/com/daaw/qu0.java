package com.daaw;

import android.annotation.SuppressLint;
/* loaded from: classes.dex */
public interface qu0 {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a */
    public static final AbstractC2755b.C2758c f24327a = new AbstractC2755b.C2758c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b */
    public static final AbstractC2755b.C2757b f24328b = new AbstractC2755b.C2757b();

    /* renamed from: com.daaw.qu0$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2755b {

        /* renamed from: com.daaw.qu0$b$a */
        /* loaded from: classes.dex */
        public static final class C2756a extends AbstractC2755b {

            /* renamed from: a */
            public final Throwable f24329a;

            public C2756a(Throwable th) {
                this.f24329a = th;
            }

            /* renamed from: a */
            public Throwable m12221a() {
                return this.f24329a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f24329a.getMessage());
            }
        }

        /* renamed from: com.daaw.qu0$b$b */
        /* loaded from: classes.dex */
        public static final class C2757b extends AbstractC2755b {
            public C2757b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* renamed from: com.daaw.qu0$b$c */
        /* loaded from: classes.dex */
        public static final class C2758c extends AbstractC2755b {
            public C2758c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }
    }
}
