package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class xs3 extends qs3 {
    public final /* synthetic */ List p;

    public xs3(zs3 zs3Var, List list) {
        this.p = list;
    }

    @Override // com.daaw.rs3
    public final void a(String str) {
        k04.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.daaw.rs3
    public final void x0(List list) {
        k04.zzi("Recorded click: ".concat(this.p.toString()));
    }
}
