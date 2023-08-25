package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class bt8 implements or8 {
    public final m36 a;
    public int b;
    public final at8 c;
    public final rw8 d;
    public final dn8 e;

    public bt8(m36 m36Var, at8 at8Var, byte[] bArr) {
        dn8 dn8Var = new dn8();
        rw8 rw8Var = new rw8(-1);
        this.a = m36Var;
        this.c = at8Var;
        this.e = dn8Var;
        this.d = rw8Var;
        this.b = 1048576;
    }

    public final bt8 a(int i) {
        this.b = i;
        return this;
    }

    public final dt8 b(f53 f53Var) {
        Objects.requireNonNull(f53Var.b);
        return new dt8(f53Var, this.a, this.c, vn8.a, this.d, this.b, null, null);
    }
}
