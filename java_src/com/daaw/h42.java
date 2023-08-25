package com.daaw;
/* loaded from: classes.dex */
public class h42 implements i42 {

    /* renamed from: a */
    public final long f12038a;

    /* renamed from: b */
    public final g42 f12039b;

    public h42(long j, long j2) {
        this.f12038a = j;
        j42 j42Var = j2 == 0 ? j42.f14255c : new j42(0L, j2);
        this.f12039b = new g42(j42Var, j42Var);
    }

    @Override // com.daaw.i42
    /* renamed from: b */
    public final g42 mo2631b(long j) {
        return this.f12039b;
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.f12038a;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return false;
    }
}
