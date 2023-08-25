package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class r26 implements i76 {

    /* renamed from: a */
    public final ge6 f24788a;

    public r26(ge6 ge6Var) {
        this.f24788a = ge6Var;
    }

    /* renamed from: a */
    public final /* synthetic */ void m11829a(Bundle bundle) {
        bundle.putString("key_schema", this.f24788a.m21731a());
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 15;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        ge6 ge6Var = this.f24788a;
        h76 h76Var = null;
        if (ge6Var != null && ge6Var.m21731a() != null && !ge6Var.m21731a().isEmpty()) {
            h76Var = new h76() { // from class: com.daaw.q26
                @Override // com.daaw.h76
                /* renamed from: b */
                public final void mo2851b(Object obj) {
                    r26.this.m11829a((Bundle) obj);
                }
            };
        }
        return s67.m10634i(h76Var);
    }
}
