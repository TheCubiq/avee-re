package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class vv8 {
    public final String[] a;
    public final int[] b;
    public final au8[] c;
    public final int[] d;
    public final int[][][] e;
    public final au8 f;

    public vv8(String[] strArr, int[] iArr, au8[] au8VarArr, int[] iArr2, int[][][] iArr3, au8 au8Var) {
        this.a = strArr;
        this.b = iArr;
        this.c = au8VarArr;
        this.e = iArr3;
        this.d = iArr2;
        this.f = au8Var;
    }

    public final int a(int i, int i2, boolean z) {
        int i3 = this.c[i].b(i2).a;
        int[] iArr = new int[1];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 <= 0; i6++) {
            if ((this.e[i][i2][i6] & 7) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i5);
        String str = null;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 16;
        while (i4 < copyOf.length) {
            String str2 = this.c[i].b(i2).b(copyOf[i4]).l;
            int i9 = i7 + 1;
            if (i7 != 0) {
                z2 |= !it5.t(str, str2);
            } else {
                str = str2;
            }
            i8 = Math.min(i8, this.e[i][i2][i4] & 24);
            i4++;
            i7 = i9;
        }
        return z2 ? Math.min(i8, this.d[i]) : i8;
    }

    public final int b(int i, int i2, int i3) {
        return this.e[i][i2][i3];
    }

    public final int c(int i) {
        return this.b[i];
    }

    public final au8 d(int i) {
        return this.c[i];
    }

    public final au8 e() {
        return this.f;
    }
}
