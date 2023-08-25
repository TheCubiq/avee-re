package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzccb;
/* loaded from: classes.dex */
public final class wv4 implements pt4 {
    public int p = ((Integer) zzba.zzc().b(g93.a1)).intValue();

    @Override // com.daaw.pt4
    public final synchronized void F(fi6 fi6Var) {
        if (((Boolean) zzba.zzc().b(g93.b1)).booleanValue()) {
            try {
                this.p = fi6Var.b.b.c;
            } catch (NullPointerException unused) {
            }
        }
    }

    public final synchronized int a() {
        return this.p;
    }

    @Override // com.daaw.pt4
    public final void e(zzccb zzccbVar) {
    }
}
