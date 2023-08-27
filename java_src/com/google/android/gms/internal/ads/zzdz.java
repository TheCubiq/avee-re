package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public final class zzdz extends zzei {
    private final boolean zztu;

    public zzdz(zzcz zzczVar, String str, String str2, zzba zzbaVar, int i, int i2) {
        super(zzczVar, str, str2, zzbaVar, i, 61);
        this.zztu = zzczVar.zzai();
    }

    @Override // com.google.android.gms.internal.ads.zzei
    protected final void zzar() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zztz.invoke(null, this.zzps.getContext(), Boolean.valueOf(this.zztu))).longValue();
        synchronized (this.zztq) {
            this.zztq.zzez = Long.valueOf(longValue);
        }
    }
}
