package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class r26 implements i76 {
    public final ge6 a;

    public r26(ge6 ge6Var) {
        this.a = ge6Var;
    }

    public final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("key_schema", this.a.a());
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 15;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        ge6 ge6Var = this.a;
        h76 h76Var = null;
        if (ge6Var != null && ge6Var.a() != null && !ge6Var.a().isEmpty()) {
            h76Var = new h76() { // from class: com.daaw.q26
                @Override // com.daaw.h76
                public final void b(Object obj) {
                    r26.this.a((Bundle) obj);
                }
            };
        }
        return s67.i(h76Var);
    }
}
