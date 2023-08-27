package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcd implements Runnable {
    private final /* synthetic */ zzcc zzpx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcd(zzcc zzccVar) {
        this.zzpx = zzccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        zzcz zzczVar;
        ConditionVariable conditionVariable2;
        if (this.zzpx.zzpv != null) {
            return;
        }
        conditionVariable = zzcc.zzpt;
        synchronized (conditionVariable) {
            if (this.zzpx.zzpv != null) {
                return;
            }
            boolean booleanValue = ((Boolean) zzkb.zzik().zzd(zznk.zzbap)).booleanValue();
            if (booleanValue) {
                try {
                    zzczVar = this.zzpx.zzps;
                    zzcc.zzpu = new zzhx(zzczVar.zzrt, "ADSHIELD", null);
                } catch (Throwable unused) {
                    booleanValue = false;
                }
            }
            this.zzpx.zzpv = Boolean.valueOf(booleanValue);
            conditionVariable2 = zzcc.zzpt;
            conditionVariable2.open();
        }
    }
}
