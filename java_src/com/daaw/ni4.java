package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class ni4 {
    public static final ni4 b = new ni4(y17.u());
    public static final th8 c = new th8() { // from class: com.daaw.ff4
    };
    public final y17 a;

    public ni4(List list) {
        this.a = y17.s(list);
    }

    public final y17 a() {
        return this.a;
    }

    public final boolean b(int i) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            kh4 kh4Var = (kh4) this.a.get(i2);
            if (kh4Var.c() && kh4Var.a() == i) {
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
        return this.a.equals(((ni4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
