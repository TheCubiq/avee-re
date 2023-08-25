package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class ni4 {

    /* renamed from: b */
    public static final ni4 f20135b = new ni4(y17.m4260u());

    /* renamed from: c */
    public static final th8 f20136c = new th8() { // from class: com.daaw.ff4
    };

    /* renamed from: a */
    public final y17 f20137a;

    public ni4(List list) {
        this.f20137a = y17.m4262s(list);
    }

    /* renamed from: a */
    public final y17 m15163a() {
        return this.f20137a;
    }

    /* renamed from: b */
    public final boolean m15162b(int i) {
        for (int i2 = 0; i2 < this.f20137a.size(); i2++) {
            kh4 kh4Var = (kh4) this.f20137a.get(i2);
            if (kh4Var.m17747c() && kh4Var.m17749a() == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ni4.class != obj.getClass()) {
            return false;
        }
        return this.f20137a.equals(((ni4) obj).f20137a);
    }

    public final int hashCode() {
        return this.f20137a.hashCode();
    }
}
