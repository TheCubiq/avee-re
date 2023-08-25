package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class lc4 implements af5 {
    public final bb4 a;
    public final rc4 b;
    public Long c;
    public String d;

    public /* synthetic */ lc4(bb4 bb4Var, rc4 rc4Var, kc4 kc4Var) {
        this.a = bb4Var;
        this.b = rc4Var;
    }

    @Override // com.daaw.af5
    public final /* bridge */ /* synthetic */ af5 a(long j) {
        this.c = Long.valueOf(j);
        return this;
    }

    @Override // com.daaw.af5
    public final /* synthetic */ af5 zza(String str) {
        Objects.requireNonNull(str);
        this.d = str;
        return this;
    }

    @Override // com.daaw.af5
    public final bf5 zzc() {
        e08.c(this.c, Long.class);
        e08.c(this.d, String.class);
        return new nc4(this.a, this.b, this.c, this.d, null);
    }
}
