package com.daaw;
/* loaded from: classes.dex */
public class wy0 {

    /* renamed from: a */
    public String f31651a;

    /* renamed from: b */
    public Long f31652b;

    public wy0(String str, long j) {
        this.f31651a = str;
        this.f31652b = Long.valueOf(j);
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
            if (this.f31651a.equals(wy0Var.f31651a)) {
                Long l = this.f31652b;
                Long l2 = wy0Var.f31652b;
                return l != null ? l.equals(l2) : l2 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f31651a.hashCode() * 31;
        Long l = this.f31652b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
