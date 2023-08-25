package com.daaw;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class q95 extends tz3 {
    public final pl7 p;

    public q95(pl7 pl7Var) {
        this.p = pl7Var;
    }

    @Override // com.daaw.v04
    public final void T(String str, String str2, Bundle bundle, long j) {
        this.p.a(str, str2, bundle, j);
    }

    @Override // com.daaw.v04
    public final int zzd() {
        return System.identityHashCode(this.p);
    }
}
