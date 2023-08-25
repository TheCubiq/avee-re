package com.daaw;
/* loaded from: classes.dex */
public final class tk6 implements rk6 {
    public final String a;

    public tk6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tk6) {
            return this.a.equals(((tk6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
