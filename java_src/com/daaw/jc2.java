package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class jc2 implements ac2 {
    public final id2 a;
    public long e;
    public String g;
    public m42 h;
    public ic2 i;
    public boolean j;
    public boolean l;
    public final boolean[] f = new boolean[3];
    public final pc2 b = new pc2(7, 128);
    public final pc2 c = new pc2(8, 128);
    public final pc2 d = new pc2(6, 128);
    public long k = -9223372036854775807L;
    public final ik5 m = new ik5();

    public jc2(id2 id2Var, boolean z, boolean z2) {
        this.a = id2Var;
    }

    @Override // com.daaw.ac2
    public final void a(ik5 ik5Var) {
        pc2 pc2Var;
        uo4.b(this.h);
        int i = it5.a;
        int k = ik5Var.k();
        int l = ik5Var.l();
        byte[] h = ik5Var.h();
        this.e += ik5Var.i();
        this.h.c(ik5Var, ik5Var.i());
        while (true) {
            int a = c42.a(h, k, l, this.f);
            if (a == l) {
                d(h, k, l);
                return;
            }
            int i2 = a + 3;
            int i3 = h[i2] & 31;
            int i4 = a - k;
            if (i4 > 0) {
                d(h, k, a);
            }
            int i5 = l - a;
            long j = this.e - i5;
            int i6 = i4 < 0 ? -i4 : 0;
            long j2 = this.k;
            if (!this.j) {
                this.b.d(i6);
                this.c.d(i6);
                if (this.j) {
                    pc2 pc2Var2 = this.b;
                    if (pc2Var2.e()) {
                        this.i.b(c42.d(pc2Var2.d, 4, pc2Var2.e));
                        pc2Var = this.b;
                    } else {
                        pc2 pc2Var3 = this.c;
                        if (pc2Var3.e()) {
                            this.i.a(c42.c(pc2Var3.d, 4, pc2Var3.e));
                            pc2Var = this.c;
                        }
                    }
                } else if (this.b.e() && this.c.e()) {
                    ArrayList arrayList = new ArrayList();
                    pc2 pc2Var4 = this.b;
                    arrayList.add(Arrays.copyOf(pc2Var4.d, pc2Var4.e));
                    pc2 pc2Var5 = this.c;
                    arrayList.add(Arrays.copyOf(pc2Var5.d, pc2Var5.e));
                    pc2 pc2Var6 = this.b;
                    b42 d = c42.d(pc2Var6.d, 4, pc2Var6.e);
                    pc2 pc2Var7 = this.c;
                    a42 c = c42.c(pc2Var7.d, 4, pc2Var7.e);
                    String a2 = ar4.a(d.a, d.b, d.c);
                    m42 m42Var = this.h;
                    b72 b72Var = new b72();
                    b72Var.h(this.g);
                    b72Var.s("video/avc");
                    b72Var.f0(a2);
                    b72Var.x(d.e);
                    b72Var.f(d.f);
                    b72Var.p(d.g);
                    b72Var.i(arrayList);
                    m42Var.f(b72Var.y());
                    this.j = true;
                    this.i.b(d);
                    this.i.a(c);
                    this.b.b();
                    pc2Var = this.c;
                }
                pc2Var.b();
            }
            if (this.d.d(i6)) {
                pc2 pc2Var8 = this.d;
                this.m.d(this.d.d, c42.b(pc2Var8.d, pc2Var8.e));
                this.m.f(4);
                this.a.a(j2, this.m);
            }
            if (this.i.e(j, i5, this.j, this.l)) {
                this.l = false;
            }
            long j3 = this.k;
            if (!this.j) {
                this.b.c(i3);
                this.c.c(i3);
            }
            this.d.c(i3);
            this.i.d(j, i3, j3);
            k = i2;
        }
    }

    @Override // com.daaw.ac2
    public final void b(m09 m09Var, td2 td2Var) {
        td2Var.c();
        this.g = td2Var.b();
        m42 n = m09Var.n(td2Var.a(), 2);
        this.h = n;
        this.i = new ic2(n, false, false);
        this.a.b(m09Var, td2Var);
    }

    @Override // com.daaw.ac2
    public final void c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
        this.l |= (i & 2) != 0;
    }

    @RequiresNonNull({"sampleReader"})
    public final void d(byte[] bArr, int i, int i2) {
        if (!this.j) {
            this.b.a(bArr, i, i2);
            this.c.a(bArr, i, i2);
        }
        this.d.a(bArr, i, i2);
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.e = 0L;
        this.l = false;
        this.k = -9223372036854775807L;
        c42.e(this.f);
        this.b.b();
        this.c.b();
        this.d.b();
        ic2 ic2Var = this.i;
        if (ic2Var != null) {
            ic2Var.c();
        }
    }
}
