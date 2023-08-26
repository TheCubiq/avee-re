package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public final class zzee extends zzei {
    public zzee(zzcz zzczVar, String str, String str2, zzba zzbaVar, int i, int i2) {
        super(zzczVar, str, str2, zzbaVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    protected final void zzar() throws IllegalAccessException, InvocationTargetException {
        zzba zzbaVar;
        int i;
        this.zztq.zzel = 2;
        boolean booleanValue = ((Boolean) this.zztz.invoke(null, this.zzps.getContext())).booleanValue();
        synchronized (this.zztq) {
            if (booleanValue) {
                zzbaVar = this.zztq;
                i = 1;
            } else {
                zzbaVar = this.zztq;
                i = 0;
            }
            zzbaVar.zzel = i;
        }
    }
}
