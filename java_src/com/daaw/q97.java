package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class q97 implements Comparable {
    public final byte[] p;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        q97 q97Var = (q97) obj;
        int length = this.p.length;
        int length2 = q97Var.p.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.p;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = q97Var.p[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q97) {
            return Arrays.equals(this.p, ((q97) obj).p);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.p);
    }

    public final String toString() {
        return op7.a(this.p);
    }
}
