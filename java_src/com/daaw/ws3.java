package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class ws3 extends qs3 {

    /* renamed from: p */
    public final /* synthetic */ List f31484p;

    public ws3(zs3 zs3Var, List list) {
        this.f31484p = list;
    }

    @Override // com.daaw.rs3
    /* renamed from: a */
    public final void mo4546a(String str) {
        k04.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    @Override // com.daaw.rs3
    /* renamed from: x0 */
    public final void mo4545x0(List list) {
        k04.zzi("Recorded impression urls: ".concat(this.f31484p.toString()));
    }
}
