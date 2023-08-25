package com.daaw;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class l61 {
    public static int h;
    public kx1 c;
    public kx1 d;
    public int f;
    public int g;
    public int a = 0;
    public boolean b = false;
    public ArrayList<kx1> e = new ArrayList<>();

    public l61(kx1 kx1Var, int i) {
        this.c = null;
        this.d = null;
        int i2 = h;
        this.f = i2;
        h = i2 + 1;
        this.c = kx1Var;
        this.d = kx1Var;
        this.g = i;
    }

    public void a(kx1 kx1Var) {
        this.e.add(kx1Var);
        this.d = kx1Var;
    }

    public long b(rj rjVar, int i) {
        long j;
        kx1 kx1Var;
        long j2;
        long j3;
        kx1 kx1Var2 = this.c;
        if (kx1Var2 instanceof se) {
            if (((se) kx1Var2).f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(kx1Var2 instanceof sb0)) {
                return 0L;
            }
        } else if (!(kx1Var2 instanceof ms1)) {
            return 0L;
        }
        ft ftVar = (i == 0 ? rjVar.e : rjVar.f).h;
        ft ftVar2 = (i == 0 ? rjVar.e : rjVar.f).i;
        boolean contains = kx1Var2.h.l.contains(ftVar);
        boolean contains2 = this.c.i.l.contains(ftVar2);
        long j4 = this.c.j();
        if (!contains || !contains2) {
            if (contains) {
                ft ftVar3 = this.c.h;
                j3 = d(ftVar3, ftVar3.f);
                j2 = this.c.h.f + j4;
            } else if (contains2) {
                ft ftVar4 = this.c.i;
                long c = c(ftVar4, ftVar4.f);
                j2 = (-this.c.i.f) + j4;
                j3 = -c;
            } else {
                kx1 kx1Var3 = this.c;
                j = kx1Var3.h.f + kx1Var3.j();
                kx1Var = this.c;
            }
            return Math.max(j3, j2);
        }
        long d = d(this.c.h, 0L);
        long c2 = c(this.c.i, 0L);
        long j5 = d - j4;
        kx1 kx1Var4 = this.c;
        int i2 = kx1Var4.i.f;
        if (j5 >= (-i2)) {
            j5 += i2;
        }
        int i3 = kx1Var4.h.f;
        long j6 = ((-c2) - j4) - i3;
        if (j6 >= i3) {
            j6 -= i3;
        }
        float m = kx1Var4.b.m(i);
        float f = (float) (m > 0.0f ? (((float) j6) / m) + (((float) j5) / (1.0f - m)) : 0L);
        long j7 = (f * m) + 0.5f + j4 + (f * (1.0f - m)) + 0.5f;
        kx1Var = this.c;
        j = kx1Var.h.f + j7;
        return j - kx1Var.i.f;
    }

    public final long c(ft ftVar, long j) {
        kx1 kx1Var = ftVar.d;
        if (kx1Var instanceof ab0) {
            return j;
        }
        int size = ftVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            zs zsVar = ftVar.k.get(i);
            if (zsVar instanceof ft) {
                ft ftVar2 = (ft) zsVar;
                if (ftVar2.d != kx1Var) {
                    j2 = Math.min(j2, c(ftVar2, ftVar2.f + j));
                }
            }
        }
        if (ftVar == kx1Var.i) {
            long j3 = j - kx1Var.j();
            return Math.min(Math.min(j2, c(kx1Var.h, j3)), j3 - kx1Var.h.f);
        }
        return j2;
    }

    public final long d(ft ftVar, long j) {
        kx1 kx1Var = ftVar.d;
        if (kx1Var instanceof ab0) {
            return j;
        }
        int size = ftVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            zs zsVar = ftVar.k.get(i);
            if (zsVar instanceof ft) {
                ft ftVar2 = (ft) zsVar;
                if (ftVar2.d != kx1Var) {
                    j2 = Math.max(j2, d(ftVar2, ftVar2.f + j));
                }
            }
        }
        if (ftVar == kx1Var.h) {
            long j3 = j + kx1Var.j();
            return Math.max(Math.max(j2, d(kx1Var.i, j3)), j3 - kx1Var.i.f);
        }
        return j2;
    }
}
