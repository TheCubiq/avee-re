package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class rw2 {

    /* renamed from: d */
    public static final rw2 f25665d = new rw2(new mw2[0]);

    /* renamed from: a */
    public final int f25666a;

    /* renamed from: b */
    public final mw2[] f25667b;

    /* renamed from: c */
    public int f25668c;

    public rw2(mw2... mw2VarArr) {
        this.f25667b = mw2VarArr;
        this.f25666a = mw2VarArr.length;
    }

    /* renamed from: a */
    public final int m10859a(mw2 mw2Var) {
        for (int i = 0; i < this.f25666a; i++) {
            if (this.f25667b[i] == mw2Var) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final mw2 m10858b(int i) {
        return this.f25667b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rw2.class == obj.getClass()) {
            rw2 rw2Var = (rw2) obj;
            if (this.f25666a == rw2Var.f25666a && Arrays.equals(this.f25667b, rw2Var.f25667b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f25668c;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.f25667b);
            this.f25668c = hashCode;
            return hashCode;
        }
        return i;
    }
}
