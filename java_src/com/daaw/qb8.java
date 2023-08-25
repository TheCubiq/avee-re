package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class qb8 {

    /* renamed from: a */
    public j47 f23846a;

    /* renamed from: b */
    public List f23847b;

    /* renamed from: c */
    public List f23848c;

    /* renamed from: d */
    public long f23849d;

    /* renamed from: e */
    public final /* synthetic */ yb8 f23850e;

    public /* synthetic */ qb8(yb8 yb8Var, nb8 nb8Var) {
        this.f23850e = yb8Var;
    }

    /* renamed from: b */
    public static final long m12629b(it6 it6Var) {
        return ((it6Var.m19366G() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean m12630a(long j, it6 it6Var) {
        ry0.m10830j(it6Var);
        if (this.f23848c == null) {
            this.f23848c = new ArrayList();
        }
        if (this.f23847b == null) {
            this.f23847b = new ArrayList();
        }
        if (this.f23848c.isEmpty() || m12629b((it6) this.f23848c.get(0)) == m12629b(it6Var)) {
            long mo2461c = this.f23849d + it6Var.mo2461c();
            this.f23850e.m3917U();
            if (mo2461c >= Math.max(0, ((Integer) m75.f18537j.m18786a(null)).intValue())) {
                return false;
            }
            this.f23849d = mo2461c;
            this.f23848c.add(it6Var);
            this.f23847b.add(Long.valueOf(j));
            int size = this.f23848c.size();
            this.f23850e.m3917U();
            return size < Math.max(1, ((Integer) m75.f18539k.m18786a(null)).intValue());
        }
        return false;
    }
}
