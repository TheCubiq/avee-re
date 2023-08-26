package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public final class zzdv extends zzei {
    private long zzts;

    public zzdv(zzcz zzczVar, String str, String str2, zzba zzbaVar, int i, int i2) {
        super(zzczVar, str, str2, zzbaVar, i, 12);
        this.zzts = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzei
    protected final void zzar() throws IllegalAccessException, InvocationTargetException {
        this.zztq.zzdm = -1L;
        this.zztq.zzdm = (Long) this.zztz.invoke(null, this.zzps.getContext());
    }
}
