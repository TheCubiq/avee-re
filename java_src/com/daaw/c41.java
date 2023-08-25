package com.daaw;
/* loaded from: classes.dex */
public final class c41 {
    public static final c41 b = new c41(0);
    public final int a;

    public c41(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c41.class == obj.getClass() && this.a == ((c41) obj).a;
    }

    public int hashCode() {
        return this.a;
    }
}
