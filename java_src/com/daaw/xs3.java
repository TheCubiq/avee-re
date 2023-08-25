package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class xs3 extends qs3 {

    /* renamed from: p */
    public final /* synthetic */ List f32925p;

    public xs3(zs3 zs3Var, List list) {
        this.f32925p = list;
    }

    @Override // com.daaw.rs3
    /* renamed from: a */
    public final void mo4546a(String str) {
        k04.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.daaw.rs3
    /* renamed from: x0 */
    public final void mo4545x0(List list) {
        k04.zzi("Recorded click: ".concat(this.f32925p.toString()));
    }
}
