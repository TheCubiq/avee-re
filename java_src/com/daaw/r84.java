package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class r84 {
    public static final th8 f = new th8() { // from class: com.daaw.o74
    };
    public final int a = 1;
    public final String b;
    public final int c;
    public final f92[] d;
    public int e;

    public r84(String str, f92... f92VarArr) {
        this.b = str;
        this.d = f92VarArr;
        int b = ak3.b(f92VarArr[0].l);
        this.c = b == -1 ? ak3.b(f92VarArr[0].k) : b;
        d(f92VarArr[0].c);
        int i = f92VarArr[0].e;
    }

    public static String d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final int a(f92 f92Var) {
        for (int i = 0; i <= 0; i++) {
            if (f92Var == this.d[i]) {
                return i;
            }
        }
        return -1;
    }

    public final f92 b(int i) {
        return this.d[i];
    }

    public final r84 c(String str) {
        return new r84(str, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r84.class == obj.getClass()) {
            r84 r84Var = (r84) obj;
            if (this.b.equals(r84Var.b) && Arrays.equals(this.d, r84Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = ((this.b.hashCode() + 527) * 31) + Arrays.hashCode(this.d);
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }
}
