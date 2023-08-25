package com.daaw;

import java.util.HashMap;
import java.util.HashSet;
/* loaded from: classes.dex */
public class de4 {

    /* renamed from: A */
    public static final de4 f6993A;
    @Deprecated

    /* renamed from: B */
    public static final de4 f6994B;
    @Deprecated

    /* renamed from: C */
    public static final th8 f6995C;

    /* renamed from: a */
    public final int f6996a = Integer.MAX_VALUE;

    /* renamed from: b */
    public final int f6997b = Integer.MAX_VALUE;

    /* renamed from: c */
    public final int f6998c = Integer.MAX_VALUE;

    /* renamed from: d */
    public final int f6999d = Integer.MAX_VALUE;

    /* renamed from: e */
    public final int f7000e = 0;

    /* renamed from: f */
    public final int f7001f = 0;

    /* renamed from: g */
    public final int f7002g = 0;

    /* renamed from: h */
    public final int f7003h = 0;

    /* renamed from: i */
    public final int f7004i;

    /* renamed from: j */
    public final int f7005j;

    /* renamed from: k */
    public final boolean f7006k;

    /* renamed from: l */
    public final y17 f7007l;

    /* renamed from: m */
    public final int f7008m;

    /* renamed from: n */
    public final y17 f7009n;

    /* renamed from: o */
    public final int f7010o;

    /* renamed from: p */
    public final int f7011p;

    /* renamed from: q */
    public final int f7012q;

    /* renamed from: r */
    public final y17 f7013r;

    /* renamed from: s */
    public final y17 f7014s;

    /* renamed from: t */
    public final int f7015t;

    /* renamed from: u */
    public final int f7016u;

    /* renamed from: v */
    public final boolean f7017v;

    /* renamed from: w */
    public final boolean f7018w;

    /* renamed from: x */
    public final boolean f7019x;

    /* renamed from: y */
    public final b27 f7020y;

    /* renamed from: z */
    public final d27 f7021z;

    static {
        de4 de4Var = new de4(new bd4());
        f6993A = de4Var;
        f6994B = de4Var;
        f6995C = new th8() { // from class: com.daaw.yb4
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
        i = bd4Var.f4729e;
        this.f7004i = i;
        i2 = bd4Var.f4730f;
        this.f7005j = i2;
        z = bd4Var.f4731g;
        this.f7006k = z;
        y17Var = bd4Var.f4732h;
        this.f7007l = y17Var;
        this.f7008m = 0;
        y17Var2 = bd4Var.f4733i;
        this.f7009n = y17Var2;
        this.f7010o = 0;
        this.f7011p = Integer.MAX_VALUE;
        this.f7012q = Integer.MAX_VALUE;
        y17Var3 = bd4Var.f4736l;
        this.f7013r = y17Var3;
        y17Var4 = bd4Var.f4737m;
        this.f7014s = y17Var4;
        i3 = bd4Var.f4738n;
        this.f7015t = i3;
        this.f7016u = 0;
        this.f7017v = false;
        this.f7018w = false;
        this.f7019x = false;
        hashMap = bd4Var.f4739o;
        this.f7020y = b27.m26519c(hashMap);
        hashSet = bd4Var.f4740p;
        this.f7021z = d27.m24762r(hashSet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            de4 de4Var = (de4) obj;
            if (this.f7006k == de4Var.f7006k && this.f7004i == de4Var.f7004i && this.f7005j == de4Var.f7005j && this.f7007l.equals(de4Var.f7007l) && this.f7009n.equals(de4Var.f7009n) && this.f7013r.equals(de4Var.f7013r) && this.f7014s.equals(de4Var.f7014s) && this.f7015t == de4Var.f7015t && this.f7020y.equals(de4Var.f7020y) && this.f7021z.equals(de4Var.f7021z)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f7006k ? 1 : 0) - 1048002209) * 31) + this.f7004i) * 31) + this.f7005j) * 31) + this.f7007l.hashCode()) * 961) + this.f7009n.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.f7013r.hashCode()) * 31) + this.f7014s.hashCode()) * 31) + this.f7015t) * 28629151) + this.f7020y.hashCode()) * 31) + this.f7021z.hashCode();
    }
}
