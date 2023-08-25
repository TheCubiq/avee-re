package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class kh4 {
    public static final th8 e = new th8() { // from class: com.daaw.hg4
    };
    public final int a;
    public final r84 b;
    public final int[] c;
    public final boolean[] d;

    public kh4(r84 r84Var, boolean z, int[] iArr, boolean[] zArr) {
        int i = r84Var.a;
        this.a = 1;
        this.b = r84Var;
        this.c = (int[]) iArr.clone();
        this.d = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.b.c;
    }

    public final f92 b(int i) {
        return this.b.b(i);
    }

    public final boolean c() {
        for (boolean z : this.d) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kh4.class == obj.getClass()) {
            kh4 kh4Var = (kh4) obj;
            if (this.b.equals(kh4Var.b) && Arrays.equals(this.c, kh4Var.c) && Arrays.equals(this.d, kh4Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 961) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }
}
