package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class r84 {

    /* renamed from: f */
    public static final th8 f24959f = new th8() { // from class: com.daaw.o74
    };

    /* renamed from: a */
    public final int f24960a = 1;

    /* renamed from: b */
    public final String f24961b;

    /* renamed from: c */
    public final int f24962c;

    /* renamed from: d */
    public final f92[] f24963d;

    /* renamed from: e */
    public int f24964e;

    public r84(String str, f92... f92VarArr) {
        this.f24961b = str;
        this.f24963d = f92VarArr;
        int m27388b = ak3.m27388b(f92VarArr[0].f9275l);
        this.f24962c = m27388b == -1 ? ak3.m27388b(f92VarArr[0].f9274k) : m27388b;
        m11588d(f92VarArr[0].f9266c);
        int i = f92VarArr[0].f9268e;
    }

    /* renamed from: d */
    public static String m11588d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    /* renamed from: a */
    public final int m11591a(f92 f92Var) {
        for (int i = 0; i <= 0; i++) {
            if (f92Var == this.f24963d[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final f92 m11590b(int i) {
        return this.f24963d[i];
    }

    /* renamed from: c */
    public final r84 m11589c(String str) {
        return new r84(str, this.f24963d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r84.class == obj.getClass()) {
            r84 r84Var = (r84) obj;
            if (this.f24961b.equals(r84Var.f24961b) && Arrays.equals(this.f24963d, r84Var.f24963d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f24964e;
        if (i == 0) {
            int hashCode = ((this.f24961b.hashCode() + 527) * 31) + Arrays.hashCode(this.f24963d);
            this.f24964e = hashCode;
            return hashCode;
        }
        return i;
    }
}
