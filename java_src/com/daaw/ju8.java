package com.daaw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes.dex */
public class ju8 implements tv8 {

    /* renamed from: a */
    public final r84 f15428a;

    /* renamed from: b */
    public final int f15429b;

    /* renamed from: c */
    public final int[] f15430c;

    /* renamed from: d */
    public final f92[] f15431d;

    /* renamed from: e */
    public int f15432e;

    public ju8(r84 r84Var, int[] iArr, int i) {
        int length = iArr.length;
        uo4.m7872f(length > 0);
        Objects.requireNonNull(r84Var);
        this.f15428a = r84Var;
        this.f15429b = length;
        this.f15431d = new f92[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f15431d[i2] = r84Var.m11590b(iArr[i2]);
        }
        Arrays.sort(this.f15431d, new Comparator() { // from class: com.daaw.iu8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((f92) obj2).f9271h - ((f92) obj).f9271h;
            }
        });
        this.f15430c = new int[this.f15429b];
        for (int i3 = 0; i3 < this.f15429b; i3++) {
            this.f15430c[i3] = r84Var.m11591a(this.f15431d[i3]);
        }
    }

    @Override // com.daaw.xv8
    /* renamed from: a */
    public final int mo4483a(int i) {
        return this.f15430c[0];
    }

    @Override // com.daaw.xv8
    /* renamed from: b */
    public final f92 mo4482b(int i) {
        return this.f15431d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ju8 ju8Var = (ju8) obj;
            if (this.f15428a == ju8Var.f15428a && Arrays.equals(this.f15430c, ju8Var.f15430c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f15432e;
        if (i == 0) {
            int identityHashCode = (System.identityHashCode(this.f15428a) * 31) + Arrays.hashCode(this.f15430c);
            this.f15432e = identityHashCode;
            return identityHashCode;
        }
        return i;
    }

    @Override // com.daaw.xv8
    public final int zzb(int i) {
        for (int i2 = 0; i2 < this.f15429b; i2++) {
            if (this.f15430c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.daaw.xv8
    public final int zzc() {
        return this.f15430c.length;
    }

    @Override // com.daaw.xv8
    public final r84 zze() {
        return this.f15428a;
    }
}
