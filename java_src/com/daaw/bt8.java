package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class bt8 implements or8 {

    /* renamed from: a */
    public final m36 f5174a;

    /* renamed from: b */
    public int f5175b;

    /* renamed from: c */
    public final at8 f5176c;

    /* renamed from: d */
    public final rw8 f5177d;

    /* renamed from: e */
    public final dn8 f5178e;

    public bt8(m36 m36Var, at8 at8Var, byte[] bArr) {
        dn8 dn8Var = new dn8();
        rw8 rw8Var = new rw8(-1);
        this.f5174a = m36Var;
        this.f5176c = at8Var;
        this.f5178e = dn8Var;
        this.f5177d = rw8Var;
        this.f5175b = 1048576;
    }

    /* renamed from: a */
    public final bt8 m25832a(int i) {
        this.f5175b = i;
        return this;
    }

    /* renamed from: b */
    public final dt8 m25831b(f53 f53Var) {
        Objects.requireNonNull(f53Var.f9119b);
        return new dt8(f53Var, this.f5174a, this.f5176c, vn8.f30380a, this.f5177d, this.f5175b, null, null);
    }
}
