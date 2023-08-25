package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class kh4 {

    /* renamed from: e */
    public static final th8 f16372e = new th8() { // from class: com.daaw.hg4
    };

    /* renamed from: a */
    public final int f16373a;

    /* renamed from: b */
    public final r84 f16374b;

    /* renamed from: c */
    public final int[] f16375c;

    /* renamed from: d */
    public final boolean[] f16376d;

    public kh4(r84 r84Var, boolean z, int[] iArr, boolean[] zArr) {
        int i = r84Var.f24960a;
        this.f16373a = 1;
        this.f16374b = r84Var;
        this.f16375c = (int[]) iArr.clone();
        this.f16376d = (boolean[]) zArr.clone();
    }

    /* renamed from: a */
    public final int m17749a() {
        return this.f16374b.f24962c;
    }

    /* renamed from: b */
    public final f92 m17748b(int i) {
        return this.f16374b.m11590b(i);
    }

    /* renamed from: c */
    public final boolean m17747c() {
        for (boolean z : this.f16376d) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m17746d(int i) {
        return this.f16376d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kh4.class == obj.getClass()) {
            kh4 kh4Var = (kh4) obj;
            if (this.f16374b.equals(kh4Var.f16374b) && Arrays.equals(this.f16375c, kh4Var.f16375c) && Arrays.equals(this.f16376d, kh4Var.f16376d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f16374b.hashCode() * 961) + Arrays.hashCode(this.f16375c)) * 31) + Arrays.hashCode(this.f16376d);
    }
}
