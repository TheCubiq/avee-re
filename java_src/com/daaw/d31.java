package com.daaw;

import android.net.Uri;
/* loaded from: classes.dex */
public final class d31 {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public d31(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public d31 a(d31 d31Var, String str) {
        String c = c(str);
        if (d31Var != null && c.equals(d31Var.c(str))) {
            long j = this.b;
            if (j != -1) {
                long j2 = this.a;
                if (j2 + j == d31Var.a) {
                    long j3 = d31Var.b;
                    return new d31(c, j2, j3 != -1 ? j + j3 : -1L);
                }
            }
            long j4 = d31Var.b;
            if (j4 != -1) {
                long j5 = d31Var.a;
                if (j5 + j4 == this.a) {
                    return new d31(c, j5, j != -1 ? j4 + j : -1L);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return iq1.d(str, this.c);
    }

    public String c(String str) {
        return iq1.c(str, this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d31.class != obj.getClass()) {
            return false;
        }
        d31 d31Var = (d31) obj;
        return this.a == d31Var.a && this.b == d31Var.b && this.c.equals(d31Var.c);
    }

    public int hashCode() {
        if (this.d == 0) {
            this.d = ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31) + this.c.hashCode();
        }
        return this.d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.c + ", start=" + this.a + ", length=" + this.b + ")";
    }
}
