package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class if8 extends ad2 {
    public final /* synthetic */ ck8 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if8(vh8 vh8Var, String str, ck8 ck8Var) {
        super("getValue");
        this.r = ck8Var;
    }

    @Override // com.daaw.ad2
    public final gl2 a(w07 w07Var, List list) {
        ou7.h("getValue", 2, list);
        gl2 b = w07Var.b((gl2) list.get(0));
        gl2 b2 = w07Var.b((gl2) list.get(1));
        String zza = this.r.zza(b.zzi());
        return zza != null ? new wp2(zza) : b2;
    }
}
