package com.daaw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes.dex */
public class ju8 implements tv8 {
    public final r84 a;
    public final int b;
    public final int[] c;
    public final f92[] d;
    public int e;

    public ju8(r84 r84Var, int[] iArr, int i) {
        int length = iArr.length;
        uo4.f(length > 0);
        Objects.requireNonNull(r84Var);
        this.a = r84Var;
        this.b = length;
        this.d = new f92[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = r84Var.b(iArr[i2]);
        }
        Arrays.sort(this.d, new Comparator() { // from class: com.daaw.iu8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((f92) obj2).h - ((f92) obj).h;
            }
        });
        this.c = new int[this.b];
        for (int i3 = 0; i3 < this.b; i3++) {
            this.c[i3] = r84Var.a(this.d[i3]);
        }
    }

    @Override // com.daaw.xv8
    public final int a(int i) {
        return this.c[0];
    }

    @Override // com.daaw.xv8
    public final f92 b(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ju8 ju8Var = (ju8) obj;
            if (this.a == ju8Var.a && Arrays.equals(this.c, ju8Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int identityHashCode = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
            this.e = identityHashCode;
            return identityHashCode;
        }
        return i;
    }

    @Override // com.daaw.xv8
    public final int zzb(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.daaw.xv8
    public final int zzc() {
        return this.c.length;
    }

    @Override // com.daaw.xv8
    public final r84 zze() {
        return this.a;
    }
}
