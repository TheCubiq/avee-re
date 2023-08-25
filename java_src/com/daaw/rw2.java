package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class rw2 {
    public static final rw2 d = new rw2(new mw2[0]);
    public final int a;
    public final mw2[] b;
    public int c;

    public rw2(mw2... mw2VarArr) {
        this.b = mw2VarArr;
        this.a = mw2VarArr.length;
    }

    public final int a(mw2 mw2Var) {
        for (int i = 0; i < this.a; i++) {
            if (this.b[i] == mw2Var) {
                return i;
            }
        }
        return -1;
    }

    public final mw2 b(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rw2.class == obj.getClass()) {
            rw2 rw2Var = (rw2) obj;
            if (this.a == rw2Var.a && Arrays.equals(this.b, rw2Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.b);
            this.c = hashCode;
            return hashCode;
        }
        return i;
    }
}
