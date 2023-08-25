package com.daaw;

import android.net.Uri;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class gs3 {

    /* renamed from: h */
    public static final th8 f11703h = new th8() { // from class: com.daaw.tx2
    };

    /* renamed from: a */
    public final long f11704a;

    /* renamed from: b */
    public final int f11705b;

    /* renamed from: c */
    public final Uri[] f11706c;

    /* renamed from: d */
    public final int[] f11707d;

    /* renamed from: e */
    public final long[] f11708e;

    /* renamed from: f */
    public final long f11709f;

    /* renamed from: g */
    public final boolean f11710g;

    public gs3(long j) {
        this(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
    }

    public gs3(long j, int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        uo4.m7874d(iArr.length == uriArr.length);
        this.f11704a = 0L;
        this.f11705b = i;
        this.f11707d = iArr;
        this.f11706c = uriArr;
        this.f11708e = jArr;
        this.f11709f = 0L;
        this.f11710g = false;
    }

    /* renamed from: a */
    public final int m21254a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f11707d;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    /* renamed from: b */
    public final gs3 m21253b(int i) {
        int[] iArr = this.f11707d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.f11708e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new gs3(0L, 0, -1, copyOf, (Uri[]) Arrays.copyOf(this.f11706c, 0), copyOf2, 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gs3.class == obj.getClass()) {
            gs3 gs3Var = (gs3) obj;
            if (this.f11705b == gs3Var.f11705b && Arrays.equals(this.f11706c, gs3Var.f11706c) && Arrays.equals(this.f11707d, gs3Var.f11707d) && Arrays.equals(this.f11708e, gs3Var.f11708e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f11705b * 31) - 1) * 961) + Arrays.hashCode(this.f11706c)) * 31) + Arrays.hashCode(this.f11707d)) * 31) + Arrays.hashCode(this.f11708e)) * 961;
    }
}
