package com.daaw;
/* loaded from: classes.dex */
public final class hz8 implements i42 {

    /* renamed from: a */
    public final kz8 f13086a;

    /* renamed from: b */
    public final long f13087b;

    /* renamed from: c */
    public final long f13088c;

    /* renamed from: d */
    public final long f13089d;

    /* renamed from: e */
    public final long f13090e;

    /* renamed from: f */
    public final long f13091f;

    public hz8(kz8 kz8Var, long j, long j2, long j3, long j4, long j5, long j6) {
        this.f13086a = kz8Var;
        this.f13087b = j;
        this.f13088c = j3;
        this.f13089d = j4;
        this.f13090e = j5;
        this.f13091f = j6;
    }

    @Override // com.daaw.i42
    /* renamed from: b */
    public final g42 mo2631b(long j) {
        j42 j42Var = new j42(j, jz8.m18118f(this.f13086a.mo15520a(j), 0L, this.f13088c, this.f13089d, this.f13090e, this.f13091f));
        return new g42(j42Var, j42Var);
    }

    /* renamed from: g */
    public final long m20307g(long j) {
        return this.f13086a.mo15520a(j);
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.f13087b;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
