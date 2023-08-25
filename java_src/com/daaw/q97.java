package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class q97 implements Comparable {

    /* renamed from: p */
    public final byte[] f23789p;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        q97 q97Var = (q97) obj;
        int length = this.f23789p.length;
        int length2 = q97Var.f23789p.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f23789p;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = q97Var.f23789p[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q97) {
            return Arrays.equals(this.f23789p, ((q97) obj).f23789p);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23789p);
    }

    public final String toString() {
        return op7.m14096a(this.f23789p);
    }
}
