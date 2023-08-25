package com.daaw;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class fs8 extends sq8 {
    public static final f53 t;
    public final rr8[] k;
    public final l64[] l;
    public final ArrayList m;
    public final Map n;
    public final w27 o;
    public int p;
    public long[][] q;
    public es8 r;
    public final uq8 s;

    static {
        ee2 ee2Var = new ee2();
        ee2Var.a("MergingMediaSource");
        t = ee2Var.c();
    }

    public fs8(boolean z, boolean z2, rr8... rr8VarArr) {
        uq8 uq8Var = new uq8();
        this.k = rr8VarArr;
        this.s = uq8Var;
        this.m = new ArrayList(Arrays.asList(rr8VarArr));
        this.p = -1;
        this.l = new l64[rr8VarArr.length];
        this.q = new long[0];
        this.n = new HashMap();
        this.o = d37.a(8).b(2).c();
    }

    @Override // com.daaw.sq8
    public final /* bridge */ /* synthetic */ pr8 D(Object obj, pr8 pr8Var) {
        if (((Integer) obj).intValue() == 0) {
            return pr8Var;
        }
        return null;
    }

    @Override // com.daaw.sq8
    public final /* bridge */ /* synthetic */ void E(Object obj, rr8 rr8Var, l64 l64Var) {
        int i;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            i = l64Var.b();
            this.p = i;
        } else {
            int b = l64Var.b();
            int i2 = this.p;
            if (b != i2) {
                this.r = new es8(0);
                return;
            }
            i = i2;
        }
        if (this.q.length == 0) {
            this.q = (long[][]) Array.newInstance(long.class, i, this.l.length);
        }
        this.m.remove(rr8Var);
        this.l[((Integer) obj).intValue()] = l64Var;
        if (this.m.isEmpty()) {
            x(this.l[0]);
        }
    }

    @Override // com.daaw.sq8, com.daaw.rr8
    public final void e() {
        es8 es8Var = this.r;
        if (es8Var != null) {
            throw es8Var;
        }
        super.e();
    }

    @Override // com.daaw.rr8
    public final f53 h() {
        rr8[] rr8VarArr = this.k;
        return rr8VarArr.length > 0 ? rr8VarArr[0].h() : t;
    }

    @Override // com.daaw.rr8
    public final nr8 k(pr8 pr8Var, nw8 nw8Var, long j) {
        int length = this.k.length;
        nr8[] nr8VarArr = new nr8[length];
        int a = this.l[0].a(pr8Var.a);
        for (int i = 0; i < length; i++) {
            nr8VarArr[i] = this.k[i].k(pr8Var.c(this.l[i].f(a)), nw8Var, j - this.q[a][i]);
        }
        return new ds8(this.s, this.q[a], nr8VarArr, null);
    }

    @Override // com.daaw.rr8
    public final void l(nr8 nr8Var) {
        ds8 ds8Var = (ds8) nr8Var;
        int i = 0;
        while (true) {
            rr8[] rr8VarArr = this.k;
            if (i >= rr8VarArr.length) {
                return;
            }
            rr8VarArr[i].l(ds8Var.f(i));
            i++;
        }
    }

    @Override // com.daaw.sq8, com.daaw.lq8
    public final void w(qz6 qz6Var) {
        super.w(qz6Var);
        for (int i = 0; i < this.k.length; i++) {
            A(Integer.valueOf(i), this.k[i]);
        }
    }

    @Override // com.daaw.sq8, com.daaw.lq8
    public final void y() {
        super.y();
        Arrays.fill(this.l, (Object) null);
        this.p = -1;
        this.r = null;
        this.m.clear();
        Collections.addAll(this.m, this.k);
    }
}
