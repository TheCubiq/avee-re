package com.daaw;
/* loaded from: classes.dex */
public class wy0 {
    public String a;
    public Long b;

    public wy0(String str, long j) {
        this.a = str;
        this.b = Long.valueOf(j);
    }

    public wy0(String str, boolean z) {
        this(str, z ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wy0) {
            wy0 wy0Var = (wy0) obj;
            if (this.a.equals(wy0Var.a)) {
                Long l = this.b;
                Long l2 = wy0Var.b;
                return l != null ? l.equals(l2) : l2 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
