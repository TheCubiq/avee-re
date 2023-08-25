package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzg;
/* loaded from: classes.dex */
public final class xo5 implements fs4, oq4 {
    public static final Object r = new Object();
    public static int s;
    public final zzg p;
    public final hp5 q;

    public xo5(hp5 hp5Var, zzg zzgVar) {
        this.q = hp5Var;
        this.p = zzgVar;
    }

    public final void a(boolean z) {
        int i;
        int intValue;
        if (((Boolean) zzba.zzc().b(g93.E5)).booleanValue() && !this.p.zzP()) {
            Object obj = r;
            synchronized (obj) {
                i = s;
                intValue = ((Integer) zzba.zzc().b(g93.F5)).intValue();
            }
            if (i >= intValue) {
                return;
            }
            this.q.e(z);
            synchronized (obj) {
                s++;
            }
        }
    }

    @Override // com.daaw.oq4
    public final void b(zze zzeVar) {
        a(false);
    }

    @Override // com.daaw.fs4
    public final void zzn() {
        a(true);
    }
}
