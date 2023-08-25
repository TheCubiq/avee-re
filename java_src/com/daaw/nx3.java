package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class nx3 {

    /* renamed from: j */
    public static final th8 f20823j = new th8() { // from class: com.daaw.nw3
    };

    /* renamed from: a */
    public final Object f20824a;

    /* renamed from: b */
    public final int f20825b;

    /* renamed from: c */
    public final f53 f20826c;

    /* renamed from: d */
    public final Object f20827d;

    /* renamed from: e */
    public final int f20828e;

    /* renamed from: f */
    public final long f20829f;

    /* renamed from: g */
    public final long f20830g;

    /* renamed from: h */
    public final int f20831h;

    /* renamed from: i */
    public final int f20832i;

    public nx3(Object obj, int i, f53 f53Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.f20824a = obj;
        this.f20825b = i;
        this.f20826c = f53Var;
        this.f20827d = obj2;
        this.f20828e = i2;
        this.f20829f = j;
        this.f20830g = j2;
        this.f20831h = i3;
        this.f20832i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nx3.class == obj.getClass()) {
            nx3 nx3Var = (nx3) obj;
            if (this.f20825b == nx3Var.f20825b && this.f20828e == nx3Var.f20828e && this.f20829f == nx3Var.f20829f && this.f20830g == nx3Var.f20830g && this.f20831h == nx3Var.f20831h && this.f20832i == nx3Var.f20832i && ky6.m17316a(this.f20824a, nx3Var.f20824a) && ky6.m17316a(this.f20827d, nx3Var.f20827d) && ky6.m17316a(this.f20826c, nx3Var.f20826c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20824a, Integer.valueOf(this.f20825b), this.f20826c, this.f20827d, Integer.valueOf(this.f20828e), Long.valueOf(this.f20829f), Long.valueOf(this.f20830g), Integer.valueOf(this.f20831h), Integer.valueOf(this.f20832i)});
    }
}
