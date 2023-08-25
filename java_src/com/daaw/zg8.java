package com.daaw;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class zg8 implements hh8 {
    public static final iz6 h = new iz6() { // from class: com.daaw.vg8
        @Override // com.daaw.iz6
        public final Object zza() {
            String k;
            k = zg8.k();
            return k;
        }
    };
    public static final Random i = new Random();
    public final iz6 d;
    public fh8 e;
    public String g;
    public final i54 a = new i54();
    public final d34 b = new d34();
    public final HashMap c = new HashMap();
    public l64 f = l64.a;

    public zg8(iz6 iz6Var) {
        this.d = iz6Var;
    }

    public static String k() {
        byte[] bArr = new byte[12];
        i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.daaw.hh8
    public final synchronized String a(l64 l64Var, pr8 pr8Var) {
        String str;
        str = j(l64Var.n(pr8Var.a, this.b).c, pr8Var).a;
        return str;
    }

    @Override // com.daaw.hh8
    public final synchronized void b(ib8 ib8Var) {
        boolean z;
        fh8 fh8Var;
        String str;
        this.g = null;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            xg8 xg8Var = (xg8) it.next();
            it.remove();
            z = xg8Var.e;
            if (z && (fh8Var = this.e) != null) {
                str = xg8Var.a;
                fh8Var.a(ib8Var, str, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x003d, code lost:
        if (r1 < r3) goto L18;
     */
    @Override // com.daaw.hh8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(com.daaw.ib8 r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.daaw.fh8 r0 = r9.e     // Catch: java.lang.Throwable -> Lcb
            java.util.Objects.requireNonNull(r0)
            com.daaw.l64 r0 = r10.b     // Catch: java.lang.Throwable -> Lcb
            boolean r0 = r0.o()     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto L10
            monitor-exit(r9)
            return
        L10:
            java.util.HashMap r0 = r9.c     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r9.g     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lcb
            com.daaw.xg8 r0 = (com.daaw.xg8) r0     // Catch: java.lang.Throwable -> Lcb
            com.daaw.pr8 r1 = r10.d     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto L41
            if (r0 == 0) goto L41
            long r1 = com.daaw.xg8.b(r0)     // Catch: java.lang.Throwable -> Lcb
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L33
            int r0 = com.daaw.xg8.a(r0)     // Catch: java.lang.Throwable -> Lcb
            int r1 = r10.c     // Catch: java.lang.Throwable -> Lcb
            if (r0 != r1) goto L3f
            goto L41
        L33:
            com.daaw.pr8 r1 = r10.d     // Catch: java.lang.Throwable -> Lcb
            long r1 = r1.d     // Catch: java.lang.Throwable -> Lcb
            long r3 = com.daaw.xg8.b(r0)     // Catch: java.lang.Throwable -> Lcb
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L41
        L3f:
            monitor-exit(r9)
            return
        L41:
            int r0 = r10.c     // Catch: java.lang.Throwable -> Lcb
            com.daaw.pr8 r1 = r10.d     // Catch: java.lang.Throwable -> Lcb
            com.daaw.xg8 r0 = r9.j(r0, r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r9.g     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto L53
            java.lang.String r1 = com.daaw.xg8.d(r0)     // Catch: java.lang.Throwable -> Lcb
            r9.g = r1     // Catch: java.lang.Throwable -> Lcb
        L53:
            com.daaw.pr8 r1 = r10.d     // Catch: java.lang.Throwable -> Lcb
            r2 = 1
            if (r1 == 0) goto L9d
            boolean r3 = r1.b()     // Catch: java.lang.Throwable -> Lcb
            if (r3 == 0) goto L9d
            com.daaw.pr8 r3 = new com.daaw.pr8     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r4 = r1.a     // Catch: java.lang.Throwable -> Lcb
            long r5 = r1.d     // Catch: java.lang.Throwable -> Lcb
            int r1 = r1.b     // Catch: java.lang.Throwable -> Lcb
            r3.<init>(r4, r5, r1)     // Catch: java.lang.Throwable -> Lcb
            int r1 = r10.c     // Catch: java.lang.Throwable -> Lcb
            com.daaw.xg8 r1 = r9.j(r1, r3)     // Catch: java.lang.Throwable -> Lcb
            boolean r3 = com.daaw.xg8.i(r1)     // Catch: java.lang.Throwable -> Lcb
            if (r3 != 0) goto L9d
            com.daaw.xg8.f(r1, r2)     // Catch: java.lang.Throwable -> Lcb
            com.daaw.l64 r3 = r10.b     // Catch: java.lang.Throwable -> Lcb
            com.daaw.pr8 r4 = r10.d     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r4 = r4.a     // Catch: java.lang.Throwable -> Lcb
            com.daaw.d34 r5 = r9.b     // Catch: java.lang.Throwable -> Lcb
            r3.n(r4, r5)     // Catch: java.lang.Throwable -> Lcb
            com.daaw.d34 r3 = r9.b     // Catch: java.lang.Throwable -> Lcb
            com.daaw.pr8 r4 = r10.d     // Catch: java.lang.Throwable -> Lcb
            int r4 = r4.b     // Catch: java.lang.Throwable -> Lcb
            r3.h(r4)     // Catch: java.lang.Throwable -> Lcb
            r3 = 0
            long r5 = com.daaw.it5.j0(r3)     // Catch: java.lang.Throwable -> Lcb
            long r7 = com.daaw.it5.j0(r3)     // Catch: java.lang.Throwable -> Lcb
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> Lcb
            com.daaw.xg8.d(r1)     // Catch: java.lang.Throwable -> Lcb
        L9d:
            boolean r1 = com.daaw.xg8.i(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto La9
            com.daaw.xg8.f(r0, r2)     // Catch: java.lang.Throwable -> Lcb
            com.daaw.xg8.d(r0)     // Catch: java.lang.Throwable -> Lcb
        La9:
            java.lang.String r1 = com.daaw.xg8.d(r0)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = r9.g     // Catch: java.lang.Throwable -> Lcb
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto Lc9
            boolean r1 = com.daaw.xg8.h(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto Lc9
            com.daaw.xg8.e(r0, r2)     // Catch: java.lang.Throwable -> Lcb
            com.daaw.fh8 r1 = r9.e     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = com.daaw.xg8.d(r0)     // Catch: java.lang.Throwable -> Lcb
            r1.c(r10, r0)     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r9)
            return
        Lc9:
            monitor-exit(r9)
            return
        Lcb:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.zg8.c(com.daaw.ib8):void");
    }

    @Override // com.daaw.hh8
    public final void d(fh8 fh8Var) {
        this.e = fh8Var;
    }

    @Override // com.daaw.hh8
    public final synchronized void e(ib8 ib8Var) {
        boolean z;
        String str;
        String str2;
        Objects.requireNonNull(this.e);
        l64 l64Var = this.f;
        this.f = ib8Var.b;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            xg8 xg8Var = (xg8) it.next();
            if (!xg8Var.l(l64Var, this.f) || xg8Var.k(ib8Var)) {
                it.remove();
                z = xg8Var.e;
                if (z) {
                    str = xg8Var.a;
                    if (str.equals(this.g)) {
                        this.g = null;
                    }
                    fh8 fh8Var = this.e;
                    str2 = xg8Var.a;
                    fh8Var.a(ib8Var, str2, false);
                }
            }
        }
        l(ib8Var);
    }

    @Override // com.daaw.hh8
    public final synchronized void f(ib8 ib8Var, int i2) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        Objects.requireNonNull(this.e);
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            xg8 xg8Var = (xg8) it.next();
            if (xg8Var.k(ib8Var)) {
                it.remove();
                z = xg8Var.e;
                if (z) {
                    str = xg8Var.a;
                    boolean equals = str.equals(this.g);
                    boolean z3 = false;
                    if (i2 == 0 && equals) {
                        z2 = xg8Var.f;
                        if (z2) {
                            z3 = true;
                        }
                    }
                    if (equals) {
                        this.g = null;
                    }
                    fh8 fh8Var = this.e;
                    str2 = xg8Var.a;
                    fh8Var.a(ib8Var, str2, z3);
                }
            }
        }
        l(ib8Var);
    }

    public final xg8 j(int i2, pr8 pr8Var) {
        long j;
        pr8 pr8Var2;
        pr8 pr8Var3;
        xg8 xg8Var = null;
        long j2 = Long.MAX_VALUE;
        for (xg8 xg8Var2 : this.c.values()) {
            xg8Var2.g(i2, pr8Var);
            if (xg8Var2.j(i2, pr8Var)) {
                j = xg8Var2.c;
                if (j == -1 || j < j2) {
                    xg8Var = xg8Var2;
                    j2 = j;
                } else if (j == j2) {
                    int i3 = it5.a;
                    pr8Var2 = xg8Var.d;
                    if (pr8Var2 != null) {
                        pr8Var3 = xg8Var2.d;
                        if (pr8Var3 != null) {
                            xg8Var = xg8Var2;
                        }
                    }
                }
            }
        }
        if (xg8Var == null) {
            String k = k();
            xg8 xg8Var3 = new xg8(this, k, i2, pr8Var);
            this.c.put(k, xg8Var3);
            return xg8Var3;
        }
        return xg8Var;
    }

    @RequiresNonNull({"listener"})
    public final void l(ib8 ib8Var) {
        String str;
        long j;
        pr8 pr8Var;
        pr8 pr8Var2;
        pr8 pr8Var3;
        String unused;
        String unused2;
        if (ib8Var.b.o()) {
            this.g = null;
            return;
        }
        xg8 xg8Var = (xg8) this.c.get(this.g);
        xg8 j2 = j(ib8Var.c, ib8Var.d);
        str = j2.a;
        this.g = str;
        c(ib8Var);
        pr8 pr8Var4 = ib8Var.d;
        if (pr8Var4 == null || !pr8Var4.b()) {
            return;
        }
        if (xg8Var != null) {
            j = xg8Var.c;
            if (j == ib8Var.d.d) {
                pr8Var = xg8Var.d;
                if (pr8Var != null) {
                    pr8Var2 = xg8Var.d;
                    if (pr8Var2.b == ib8Var.d.b) {
                        pr8Var3 = xg8Var.d;
                        if (pr8Var3.c == ib8Var.d.c) {
                            return;
                        }
                    }
                }
            }
        }
        pr8 pr8Var5 = ib8Var.d;
        unused = j(ib8Var.c, new pr8(pr8Var5.a, pr8Var5.d)).a;
        unused2 = j2.a;
    }

    @Override // com.daaw.hh8
    public final synchronized String zzd() {
        return this.g;
    }
}
