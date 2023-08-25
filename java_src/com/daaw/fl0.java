package com.daaw;

import java.io.File;
/* loaded from: classes2.dex */
public class fl0 {

    /* renamed from: c */
    public static final C1305b f9655c = new C1305b();

    /* renamed from: a */
    public final h10 f9656a;

    /* renamed from: b */
    public e10 f9657b;

    /* renamed from: com.daaw.fl0$b */
    /* loaded from: classes2.dex */
    public static final class C1305b implements e10 {
        public C1305b() {
        }

        @Override // com.daaw.e10
        /* renamed from: a */
        public void mo15621a() {
        }

        @Override // com.daaw.e10
        /* renamed from: b */
        public String mo15620b() {
            return null;
        }

        @Override // com.daaw.e10
        /* renamed from: c */
        public byte[] mo15619c() {
            return null;
        }

        @Override // com.daaw.e10
        /* renamed from: d */
        public void mo15618d() {
        }

        @Override // com.daaw.e10
        /* renamed from: e */
        public void mo15617e(long j, String str) {
        }
    }

    public fl0(h10 h10Var) {
        this.f9656a = h10Var;
        this.f9657b = f9655c;
    }

    public fl0(h10 h10Var, String str) {
        this(h10Var);
        m22510e(str);
    }

    /* renamed from: a */
    public void m22514a() {
        this.f9657b.mo15618d();
    }

    /* renamed from: b */
    public byte[] m22513b() {
        return this.f9657b.mo15619c();
    }

    /* renamed from: c */
    public String m22512c() {
        return this.f9657b.mo15620b();
    }

    /* renamed from: d */
    public final File m22511d(String str) {
        return this.f9656a.m21097o(str, "userlog");
    }

    /* renamed from: e */
    public final void m22510e(String str) {
        this.f9657b.mo15621a();
        this.f9657b = f9655c;
        if (str == null) {
            return;
        }
        m22509f(m22511d(str), 65536);
    }

    /* renamed from: f */
    public void m22509f(File file, int i) {
        this.f9657b = new n01(file, i);
    }

    /* renamed from: g */
    public void m22508g(long j, String str) {
        this.f9657b.mo15617e(j, str);
    }
}
