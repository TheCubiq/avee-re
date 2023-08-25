package com.daaw;

import java.io.File;
/* loaded from: classes2.dex */
public class fl0 {
    public static final b c = new b();
    public final h10 a;
    public e10 b;

    /* loaded from: classes2.dex */
    public static final class b implements e10 {
        public b() {
        }

        @Override // com.daaw.e10
        public void a() {
        }

        @Override // com.daaw.e10
        public String b() {
            return null;
        }

        @Override // com.daaw.e10
        public byte[] c() {
            return null;
        }

        @Override // com.daaw.e10
        public void d() {
        }

        @Override // com.daaw.e10
        public void e(long j, String str) {
        }
    }

    public fl0(h10 h10Var) {
        this.a = h10Var;
        this.b = c;
    }

    public fl0(h10 h10Var, String str) {
        this(h10Var);
        e(str);
    }

    public void a() {
        this.b.d();
    }

    public byte[] b() {
        return this.b.c();
    }

    public String c() {
        return this.b.b();
    }

    public final File d(String str) {
        return this.a.o(str, "userlog");
    }

    public final void e(String str) {
        this.b.a();
        this.b = c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    public void f(File file, int i) {
        this.b = new n01(file, i);
    }

    public void g(long j, String str) {
        this.b.e(j, str);
    }
}
