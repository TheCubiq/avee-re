package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public final class zzdn extends zzei {
    private static volatile String zztm;
    private static final Object zztn = new Object();

    public zzdn(zzcz zzczVar, String str, String str2, zzba zzbaVar, int i, int i2) {
        super(zzczVar, str, str2, zzbaVar, i, 29);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    protected final void zzar() throws IllegalAccessException, InvocationTargetException {
        this.zztq.zzdx = "E";
        if (zztm == null) {
            synchronized (zztn) {
                if (zztm == null) {
                    zztm = (String) this.zztz.invoke(null, this.zzps.getContext());
                }
            }
        }
        synchronized (this.zztq) {
            this.zztq.zzdx = zzbi.zza(zztm.getBytes(), true);
        }
    }
}
