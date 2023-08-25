package com.daaw;
/* loaded from: classes.dex */
public final class sn6 {

    /* renamed from: a */
    public final String f26434a;

    /* renamed from: b */
    public final String f26435b;

    public sn6(String str, String str2) {
        this.f26434a = str;
        this.f26435b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sn6) {
            sn6 sn6Var = (sn6) obj;
            return this.f26434a.equals(sn6Var.f26434a) && this.f26435b.equals(sn6Var.f26435b);
        }
        return false;
    }

    public final int hashCode() {
        return String.valueOf(this.f26434a).concat(String.valueOf(this.f26435b)).hashCode();
    }
}
