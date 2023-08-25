package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class hg5 implements yx4 {
    public final Bundle p = new Bundle();

    public final synchronized Bundle a() {
        return new Bundle(this.p);
    }

    @Override // com.daaw.yx4
    public final synchronized void c(String str, String str2) {
        this.p.putInt(str, 3);
    }

    @Override // com.daaw.yx4
    public final synchronized void l(String str) {
        this.p.putInt(str, 2);
    }

    @Override // com.daaw.yx4
    public final synchronized void m(String str) {
        this.p.putInt(str, 1);
    }

    @Override // com.daaw.yx4
    public final void zza(String str) {
    }

    @Override // com.daaw.yx4
    public final void zze() {
    }

    @Override // com.daaw.yx4
    public final void zzf() {
    }
}
