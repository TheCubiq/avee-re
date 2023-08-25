package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class if8 extends ad2 {

    /* renamed from: r */
    public final /* synthetic */ ck8 f13620r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if8(vh8 vh8Var, String str, ck8 ck8Var) {
        super("getValue");
        this.f13620r = ck8Var;
    }

    @Override // com.daaw.ad2
    /* renamed from: a */
    public final gl2 mo5780a(w07 w07Var, List list) {
        ou7.m13916h("getValue", 2, list);
        gl2 m6608b = w07Var.m6608b((gl2) list.get(0));
        gl2 m6608b2 = w07Var.m6608b((gl2) list.get(1));
        String zza = this.f13620r.zza(m6608b.zzi());
        return zza != null ? new wp2(zza) : m6608b2;
    }
}
