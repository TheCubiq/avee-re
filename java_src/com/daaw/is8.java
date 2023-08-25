package com.daaw;
/* loaded from: classes.dex */
public final class is8 {

    /* renamed from: d */
    public static final is8 f13979d = new is8(0, 0, 0);

    /* renamed from: e */
    public static final th8 f13980e = new th8() { // from class: com.daaw.dr8
    };

    /* renamed from: a */
    public final int f13981a = 0;

    /* renamed from: b */
    public final int f13982b;

    /* renamed from: c */
    public final int f13983c;

    public is8(int i, int i2, int i3) {
        this.f13982b = i2;
        this.f13983c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof is8) {
            is8 is8Var = (is8) obj;
            int i = is8Var.f13981a;
            return this.f13982b == is8Var.f13982b && this.f13983c == is8Var.f13983c;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13982b + 16337) * 31) + this.f13983c;
    }
}
