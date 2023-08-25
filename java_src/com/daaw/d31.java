package com.daaw;

import android.net.Uri;
/* loaded from: classes.dex */
public final class d31 {

    /* renamed from: a */
    public final long f6440a;

    /* renamed from: b */
    public final long f6441b;

    /* renamed from: c */
    public final String f6442c;

    /* renamed from: d */
    public int f6443d;

    public d31(String str, long j, long j2) {
        this.f6442c = str == null ? "" : str;
        this.f6440a = j;
        this.f6441b = j2;
    }

    /* renamed from: a */
    public d31 m24731a(d31 d31Var, String str) {
        String m24729c = m24729c(str);
        if (d31Var != null && m24729c.equals(d31Var.m24729c(str))) {
            long j = this.f6441b;
            if (j != -1) {
                long j2 = this.f6440a;
                if (j2 + j == d31Var.f6440a) {
                    long j3 = d31Var.f6441b;
                    return new d31(m24729c, j2, j3 != -1 ? j + j3 : -1L);
                }
            }
            long j4 = d31Var.f6441b;
            if (j4 != -1) {
                long j5 = d31Var.f6440a;
                if (j5 + j4 == this.f6440a) {
                    return new d31(m24729c, j5, j != -1 ? j4 + j : -1L);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public Uri m24730b(String str) {
        return iq1.m19491d(str, this.f6442c);
    }

    /* renamed from: c */
    public String m24729c(String str) {
        return iq1.m19492c(str, this.f6442c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d31.class != obj.getClass()) {
            return false;
        }
        d31 d31Var = (d31) obj;
        return this.f6440a == d31Var.f6440a && this.f6441b == d31Var.f6441b && this.f6442c.equals(d31Var.f6442c);
    }

    public int hashCode() {
        if (this.f6443d == 0) {
            this.f6443d = ((((527 + ((int) this.f6440a)) * 31) + ((int) this.f6441b)) * 31) + this.f6442c.hashCode();
        }
        return this.f6443d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f6442c + ", start=" + this.f6440a + ", length=" + this.f6441b + ")";
    }
}
