package com.daaw;
/* loaded from: classes.dex */
public final class ws8 {

    /* renamed from: a */
    public final int f31492a;

    /* renamed from: b */
    public final boolean f31493b;

    public ws8(int i, boolean z) {
        this.f31492a = i;
        this.f31493b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ws8.class == obj.getClass()) {
            ws8 ws8Var = (ws8) obj;
            if (this.f31492a == ws8Var.f31492a && this.f31493b == ws8Var.f31493b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f31492a * 31) + (this.f31493b ? 1 : 0);
    }
}
