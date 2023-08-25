package com.daaw;
/* loaded from: classes.dex */
public final class lu3 {
    public static final lu3 b = new ls3().e();
    public static final th8 c = new th8() { // from class: com.daaw.qq3
    };
    public final r32 a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lu3) {
            return this.a.equals(((lu3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
