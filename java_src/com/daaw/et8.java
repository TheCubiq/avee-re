package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class et8 implements hw8 {
    public long a;
    public long b;
    public gw8 c;
    public et8 d;

    public et8(long j, int i) {
        c(j, 65536);
    }

    public final int a(long j) {
        long j2 = this.a;
        int i = this.c.b;
        return (int) (j - j2);
    }

    public final et8 b() {
        this.c = null;
        et8 et8Var = this.d;
        this.d = null;
        return et8Var;
    }

    public final void c(long j, int i) {
        uo4.f(this.c == null);
        this.a = j;
        this.b = j + 65536;
    }

    @Override // com.daaw.hw8
    public final gw8 zzc() {
        gw8 gw8Var = this.c;
        Objects.requireNonNull(gw8Var);
        return gw8Var;
    }

    @Override // com.daaw.hw8
    public final hw8 zzd() {
        et8 et8Var = this.d;
        if (et8Var == null || et8Var.c == null) {
            return null;
        }
        return et8Var;
    }
}
