package com.daaw;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class fs8 extends sq8 {

    /* renamed from: t */
    public static final f53 f9852t;

    /* renamed from: k */
    public final rr8[] f9853k;

    /* renamed from: l */
    public final l64[] f9854l;

    /* renamed from: m */
    public final ArrayList f9855m;

    /* renamed from: n */
    public final Map f9856n;

    /* renamed from: o */
    public final w27 f9857o;

    /* renamed from: p */
    public int f9858p;

    /* renamed from: q */
    public long[][] f9859q;

    /* renamed from: r */
    public es8 f9860r;

    /* renamed from: s */
    public final uq8 f9861s;

    static {
        ee2 ee2Var = new ee2();
        ee2Var.m23540a("MergingMediaSource");
        f9852t = ee2Var.m23538c();
    }

    public fs8(boolean z, boolean z2, rr8... rr8VarArr) {
        uq8 uq8Var = new uq8();
        this.f9853k = rr8VarArr;
        this.f9861s = uq8Var;
        this.f9855m = new ArrayList(Arrays.asList(rr8VarArr));
        this.f9858p = -1;
        this.f9854l = new l64[rr8VarArr.length];
        this.f9859q = new long[0];
        this.f9856n = new HashMap();
        this.f9857o = d37.m24716a(8).m25643b(2).mo26497c();
    }

    @Override // com.daaw.sq8
    /* renamed from: D */
    public final /* bridge */ /* synthetic */ pr8 mo9985D(Object obj, pr8 pr8Var) {
        if (((Integer) obj).intValue() == 0) {
            return pr8Var;
        }
        return null;
    }

    @Override // com.daaw.sq8
    /* renamed from: E */
    public final /* bridge */ /* synthetic */ void mo9984E(Object obj, rr8 rr8Var, l64 l64Var) {
        int i;
        if (this.f9860r != null) {
            return;
        }
        if (this.f9858p == -1) {
            i = l64Var.mo4510b();
            this.f9858p = i;
        } else {
            int mo4510b = l64Var.mo4510b();
            int i2 = this.f9858p;
            if (mo4510b != i2) {
                this.f9860r = new es8(0);
                return;
            }
            i = i2;
        }
        if (this.f9859q.length == 0) {
            this.f9859q = (long[][]) Array.newInstance(long.class, i, this.f9854l.length);
        }
        this.f9855m.remove(rr8Var);
        this.f9854l[((Integer) obj).intValue()] = l64Var;
        if (this.f9855m.isEmpty()) {
            m16639x(this.f9854l[0]);
        }
    }

    @Override // com.daaw.sq8, com.daaw.rr8
    /* renamed from: e */
    public final void mo9983e() {
        es8 es8Var = this.f9860r;
        if (es8Var != null) {
            throw es8Var;
        }
        super.mo9983e();
    }

    @Override // com.daaw.rr8
    /* renamed from: h */
    public final f53 mo11003h() {
        rr8[] rr8VarArr = this.f9853k;
        return rr8VarArr.length > 0 ? rr8VarArr[0].mo11003h() : f9852t;
    }

    @Override // com.daaw.rr8
    /* renamed from: k */
    public final nr8 mo11000k(pr8 pr8Var, nw8 nw8Var, long j) {
        int length = this.f9853k.length;
        nr8[] nr8VarArr = new nr8[length];
        int mo4511a = this.f9854l[0].mo4511a(pr8Var.f18805a);
        for (int i = 0; i < length; i++) {
            nr8VarArr[i] = this.f9853k[i].mo11000k(pr8Var.m13184c(this.f9854l[i].mo4508f(mo4511a)), nw8Var, j - this.f9859q[mo4511a][i]);
        }
        return new ds8(this.f9861s, this.f9859q[mo4511a], nr8VarArr, null);
    }

    @Override // com.daaw.rr8
    /* renamed from: l */
    public final void mo10999l(nr8 nr8Var) {
        ds8 ds8Var = (ds8) nr8Var;
        int i = 0;
        while (true) {
            rr8[] rr8VarArr = this.f9853k;
            if (i >= rr8VarArr.length) {
                return;
            }
            rr8VarArr[i].mo10999l(ds8Var.m23992f(i));
            i++;
        }
    }

    @Override // com.daaw.sq8, com.daaw.lq8
    /* renamed from: w */
    public final void mo9980w(qz6 qz6Var) {
        super.mo9980w(qz6Var);
        for (int i = 0; i < this.f9853k.length; i++) {
            m9988A(Integer.valueOf(i), this.f9853k[i]);
        }
    }

    @Override // com.daaw.sq8, com.daaw.lq8
    /* renamed from: y */
    public final void mo9979y() {
        super.mo9979y();
        Arrays.fill(this.f9854l, (Object) null);
        this.f9858p = -1;
        this.f9860r = null;
        this.f9855m.clear();
        Collections.addAll(this.f9855m, this.f9853k);
    }
}
