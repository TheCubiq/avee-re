package com.daaw;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class f55 extends l75 {
    public final /* synthetic */ Long t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ Bundle w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ gk5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f55(gk5 gk5Var, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(gk5Var, true);
        this.z = gk5Var;
        this.t = l;
        this.u = str;
        this.v = str2;
        this.w = bundle;
        this.x = z;
        this.y = z2;
    }

    @Override // com.daaw.l75
    public final void a() {
        ju3 ju3Var;
        Long l = this.t;
        long longValue = l == null ? this.p : l.longValue();
        ju3Var = this.z.i;
        ((ju3) ry0.j(ju3Var)).logEvent(this.u, this.v, this.w, this.x, this.y, longValue);
    }
}
