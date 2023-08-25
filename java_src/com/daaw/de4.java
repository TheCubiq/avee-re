package com.daaw;

import java.util.HashMap;
import java.util.HashSet;
/* loaded from: classes.dex */
public class de4 {
    public static final de4 A;
    @Deprecated
    public static final de4 B;
    @Deprecated
    public static final th8 C;
    public final int a = Integer.MAX_VALUE;
    public final int b = Integer.MAX_VALUE;
    public final int c = Integer.MAX_VALUE;
    public final int d = Integer.MAX_VALUE;
    public final int e = 0;
    public final int f = 0;
    public final int g = 0;
    public final int h = 0;
    public final int i;
    public final int j;
    public final boolean k;
    public final y17 l;
    public final int m;
    public final y17 n;
    public final int o;
    public final int p;
    public final int q;
    public final y17 r;
    public final y17 s;
    public final int t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final b27 y;
    public final d27 z;

    static {
        de4 de4Var = new de4(new bd4());
        A = de4Var;
        B = de4Var;
        C = new th8() { // from class: com.daaw.yb4
        };
    }

    public de4(bd4 bd4Var) {
        int i;
        int i2;
        boolean z;
        y17 y17Var;
        y17 y17Var2;
        y17 y17Var3;
        y17 y17Var4;
        int i3;
        HashMap hashMap;
        HashSet hashSet;
        i = bd4Var.e;
        this.i = i;
        i2 = bd4Var.f;
        this.j = i2;
        z = bd4Var.g;
        this.k = z;
        y17Var = bd4Var.h;
        this.l = y17Var;
        this.m = 0;
        y17Var2 = bd4Var.i;
        this.n = y17Var2;
        this.o = 0;
        this.p = Integer.MAX_VALUE;
        this.q = Integer.MAX_VALUE;
        y17Var3 = bd4Var.l;
        this.r = y17Var3;
        y17Var4 = bd4Var.m;
        this.s = y17Var4;
        i3 = bd4Var.n;
        this.t = i3;
        this.u = 0;
        this.v = false;
        this.w = false;
        this.x = false;
        hashMap = bd4Var.o;
        this.y = b27.c(hashMap);
        hashSet = bd4Var.p;
        this.z = d27.r(hashSet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            de4 de4Var = (de4) obj;
            if (this.k == de4Var.k && this.i == de4Var.i && this.j == de4Var.j && this.l.equals(de4Var.l) && this.n.equals(de4Var.n) && this.r.equals(de4Var.r) && this.s.equals(de4Var.s) && this.t == de4Var.t && this.y.equals(de4Var.y) && this.z.equals(de4Var.z)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.k ? 1 : 0) - 1048002209) * 31) + this.i) * 31) + this.j) * 31) + this.l.hashCode()) * 961) + this.n.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t) * 28629151) + this.y.hashCode()) * 31) + this.z.hashCode();
    }
}
