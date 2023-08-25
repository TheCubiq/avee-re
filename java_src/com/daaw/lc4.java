package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class lc4 implements af5 {

    /* renamed from: a */
    public final bb4 f17253a;

    /* renamed from: b */
    public final rc4 f17254b;

    /* renamed from: c */
    public Long f17255c;

    /* renamed from: d */
    public String f17256d;

    public /* synthetic */ lc4(bb4 bb4Var, rc4 rc4Var, kc4 kc4Var) {
        this.f17253a = bb4Var;
        this.f17254b = rc4Var;
    }

    @Override // com.daaw.af5
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ af5 mo17050a(long j) {
        this.f17255c = Long.valueOf(j);
        return this;
    }

    @Override // com.daaw.af5
    public final /* synthetic */ af5 zza(String str) {
        Objects.requireNonNull(str);
        this.f17256d = str;
        return this;
    }

    @Override // com.daaw.af5
    public final bf5 zzc() {
        e08.m23800c(this.f17255c, Long.class);
        e08.m23800c(this.f17256d, String.class);
        return new nc4(this.f17253a, this.f17254b, this.f17255c, this.f17256d, null);
    }
}
