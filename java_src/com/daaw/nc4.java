package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class nc4 implements bf5 {

    /* renamed from: a */
    public final Long f20040a;

    /* renamed from: b */
    public final String f20041b;

    /* renamed from: c */
    public final bb4 f20042c;

    /* renamed from: d */
    public final rc4 f20043d;

    /* renamed from: e */
    public final nc4 f20044e = this;

    public /* synthetic */ nc4(bb4 bb4Var, rc4 rc4Var, Long l, String str, mc4 mc4Var) {
        this.f20042c = bb4Var;
        this.f20043d = rc4Var;
        this.f20040a = l;
        this.f20041b = str;
    }

    @Override // com.daaw.bf5
    public final lf5 zza() {
        Context context;
        ef5 m22693b;
        long longValue = this.f20040a.longValue();
        rc4 rc4Var = this.f20043d;
        context = rc4Var.f25132a;
        m22693b = ff5.m22693b(rc4Var.f25133b);
        return mf5.m16040a(longValue, context, m22693b, this.f20042c, this.f20041b);
    }

    @Override // com.daaw.bf5
    public final pf5 zzb() {
        Context context;
        ef5 m22693b;
        long longValue = this.f20040a.longValue();
        rc4 rc4Var = this.f20043d;
        context = rc4Var.f25132a;
        m22693b = ff5.m22693b(rc4Var.f25133b);
        return qf5.m12563a(longValue, context, m22693b, this.f20042c, this.f20041b);
    }
}
