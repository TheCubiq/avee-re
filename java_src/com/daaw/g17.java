package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class g17 extends h07 {
    public final Object p;
    public int q;
    public final /* synthetic */ i17 r;

    public g17(i17 i17Var, int i) {
        this.r = i17Var;
        this.p = i17.i(i17Var, i);
        this.q = i;
    }

    public final void a() {
        int x;
        int i = this.q;
        if (i == -1 || i >= this.r.size() || !ky6.a(this.p, i17.i(this.r, this.q))) {
            x = this.r.x(this.p);
            this.q = x;
        }
    }

    @Override // com.daaw.h07, java.util.Map.Entry
    public final Object getKey() {
        return this.p;
    }

    @Override // com.daaw.h07, java.util.Map.Entry
    public final Object getValue() {
        Map n = this.r.n();
        if (n != null) {
            return n.get(this.p);
        }
        a();
        int i = this.q;
        if (i == -1) {
            return null;
        }
        return i17.l(this.r, i);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map n = this.r.n();
        if (n != null) {
            return n.put(this.p, obj);
        }
        a();
        int i = this.q;
        if (i == -1) {
            this.r.put(this.p, obj);
            return null;
        }
        Object l = i17.l(this.r, i);
        i17.o(this.r, this.q, obj);
        return l;
    }
}
