package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class nc4 implements bf5 {
    public final Long a;
    public final String b;
    public final bb4 c;
    public final rc4 d;
    public final nc4 e = this;

    public /* synthetic */ nc4(bb4 bb4Var, rc4 rc4Var, Long l, String str, mc4 mc4Var) {
        this.c = bb4Var;
        this.d = rc4Var;
        this.a = l;
        this.b = str;
    }

    @Override // com.daaw.bf5
    public final lf5 zza() {
        Context context;
        ef5 b;
        long longValue = this.a.longValue();
        rc4 rc4Var = this.d;
        context = rc4Var.a;
        b = ff5.b(rc4Var.b);
        return mf5.a(longValue, context, b, this.c, this.b);
    }

    @Override // com.daaw.bf5
    public final pf5 zzb() {
        Context context;
        ef5 b;
        long longValue = this.a.longValue();
        rc4 rc4Var = this.d;
        context = rc4Var.a;
        b = ff5.b(rc4Var.b);
        return qf5.a(longValue, context, b, this.c, this.b);
    }
}
