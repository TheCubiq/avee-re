package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class nx3 {
    public static final th8 j = new th8() { // from class: com.daaw.nw3
    };
    public final Object a;
    public final int b;
    public final f53 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    public nx3(Object obj, int i, f53 f53Var, Object obj2, int i2, long j2, long j3, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = f53Var;
        this.d = obj2;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nx3.class == obj.getClass()) {
            nx3 nx3Var = (nx3) obj;
            if (this.b == nx3Var.b && this.e == nx3Var.e && this.f == nx3Var.f && this.g == nx3Var.g && this.h == nx3Var.h && this.i == nx3Var.i && ky6.a(this.a, nx3Var.a) && ky6.a(this.d, nx3Var.d) && ky6.a(this.c, nx3Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }
}
