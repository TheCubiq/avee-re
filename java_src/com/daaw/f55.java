package com.daaw;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class f55 extends l75 {

    /* renamed from: t */
    public final /* synthetic */ Long f9131t;

    /* renamed from: u */
    public final /* synthetic */ String f9132u;

    /* renamed from: v */
    public final /* synthetic */ String f9133v;

    /* renamed from: w */
    public final /* synthetic */ Bundle f9134w;

    /* renamed from: x */
    public final /* synthetic */ boolean f9135x;

    /* renamed from: y */
    public final /* synthetic */ boolean f9136y;

    /* renamed from: z */
    public final /* synthetic */ gk5 f9137z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f55(gk5 gk5Var, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(gk5Var, true);
        this.f9137z = gk5Var;
        this.f9131t = l;
        this.f9132u = str;
        this.f9133v = str2;
        this.f9134w = bundle;
        this.f9135x = z;
        this.f9136y = z2;
    }

    @Override // com.daaw.l75
    /* renamed from: a */
    public final void mo2297a() {
        ju3 ju3Var;
        Long l = this.f9131t;
        long longValue = l == null ? this.f17103p : l.longValue();
        ju3Var = this.f9137z.f11397i;
        ((ju3) ry0.m10830j(ju3Var)).logEvent(this.f9132u, this.f9133v, this.f9134w, this.f9135x, this.f9136y, longValue);
    }
}
