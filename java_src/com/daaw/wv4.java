package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzccb;
/* loaded from: classes.dex */
public final class wv4 implements pt4 {

    /* renamed from: p */
    public int f31578p = ((Integer) zzba.zzc().m23658b(g93.f10623a1)).intValue();

    @Override // com.daaw.pt4
    /* renamed from: F */
    public final synchronized void mo5181F(fi6 fi6Var) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10634b1)).booleanValue()) {
            try {
                this.f31578p = fi6Var.f9624b.f8508b.f31253c;
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: a */
    public final synchronized int m5764a() {
        return this.f31578p;
    }

    @Override // com.daaw.pt4
    /* renamed from: e */
    public final void mo5174e(zzccb zzccbVar) {
    }
}
