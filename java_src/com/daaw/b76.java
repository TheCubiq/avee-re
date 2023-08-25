package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class b76 implements i76 {

    /* renamed from: a */
    public final boolean f4513a;

    public b76(if6 if6Var) {
        this.f4513a = if6Var != null;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 36;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return s67.m10634i(this.f4513a ? new h76() { // from class: com.daaw.a76
            @Override // com.daaw.h76
            /* renamed from: b */
            public final void mo2851b(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
