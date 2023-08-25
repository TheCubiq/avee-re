package com.daaw;
/* loaded from: classes.dex */
public final class sn6 {
    public final String a;
    public final String b;

    public sn6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sn6) {
            sn6 sn6Var = (sn6) obj;
            return this.a.equals(sn6Var.a) && this.b.equals(sn6Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return String.valueOf(this.a).concat(String.valueOf(this.b)).hashCode();
    }
}
