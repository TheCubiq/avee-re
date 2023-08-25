package com.daaw;

import android.net.Uri;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class gs3 {
    public static final th8 h = new th8() { // from class: com.daaw.tx2
    };
    public final long a;
    public final int b;
    public final Uri[] c;
    public final int[] d;
    public final long[] e;
    public final long f;
    public final boolean g;

    public gs3(long j) {
        this(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
    }

    public gs3(long j, int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        uo4.d(iArr.length == uriArr.length);
        this.a = 0L;
        this.b = i;
        this.d = iArr;
        this.c = uriArr;
        this.e = jArr;
        this.f = 0L;
        this.g = false;
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.d;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final gs3 b(int i) {
        int[] iArr = this.d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new gs3(0L, 0, -1, copyOf, (Uri[]) Arrays.copyOf(this.c, 0), copyOf2, 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gs3.class == obj.getClass()) {
            gs3 gs3Var = (gs3) obj;
            if (this.b == gs3Var.b && Arrays.equals(this.c, gs3Var.c) && Arrays.equals(this.d, gs3Var.d) && Arrays.equals(this.e, gs3Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b * 31) - 1) * 961) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e)) * 961;
    }
}
