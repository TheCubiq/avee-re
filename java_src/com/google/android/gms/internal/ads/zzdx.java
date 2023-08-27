package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public final class zzdx extends zzei {
    public zzdx(zzcz zzczVar, String str, String str2, zzba zzbaVar, int i, int i2) {
        super(zzczVar, str, str2, zzbaVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    protected final void zzar() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zztq) {
            zzcm zzcmVar = new zzcm((String) this.zztz.invoke(null, this.zzps.getContext()));
            synchronized (this.zztq) {
                this.zztq.zzdd = Long.valueOf(zzcmVar.zzri);
                this.zztq.zzey = Long.valueOf(zzcmVar.zzrj);
            }
        }
    }
}
