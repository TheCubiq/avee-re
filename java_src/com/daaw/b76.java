package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class b76 implements i76 {
    public final boolean a;

    public b76(if6 if6Var) {
        this.a = if6Var != null;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 36;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return s67.i(this.a ? new h76() { // from class: com.daaw.a76
            @Override // com.daaw.h76
            public final void b(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
