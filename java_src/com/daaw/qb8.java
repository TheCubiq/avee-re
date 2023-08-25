package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class qb8 {
    public j47 a;
    public List b;
    public List c;
    public long d;
    public final /* synthetic */ yb8 e;

    public /* synthetic */ qb8(yb8 yb8Var, nb8 nb8Var) {
        this.e = yb8Var;
    }

    public static final long b(it6 it6Var) {
        return ((it6Var.G() / 1000) / 60) / 60;
    }

    public final boolean a(long j, it6 it6Var) {
        ry0.j(it6Var);
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (this.c.isEmpty() || b((it6) this.c.get(0)) == b(it6Var)) {
            long c = this.d + it6Var.c();
            this.e.U();
            if (c >= Math.max(0, ((Integer) m75.j.a(null)).intValue())) {
                return false;
            }
            this.d = c;
            this.c.add(it6Var);
            this.b.add(Long.valueOf(j));
            int size = this.c.size();
            this.e.U();
            return size < Math.max(1, ((Integer) m75.k.a(null)).intValue());
        }
        return false;
    }
}
