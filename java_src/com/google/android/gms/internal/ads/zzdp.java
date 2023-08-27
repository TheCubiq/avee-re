package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public final class zzdp extends zzei {
    public zzdp(zzcz zzczVar, String str, String str2, zzba zzbaVar, int i, int i2) {
        super(zzczVar, str, str2, zzbaVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    protected final void zzar() throws IllegalAccessException, InvocationTargetException {
        this.zztq.zzdf = -1L;
        this.zztq.zzdg = -1L;
        int[] iArr = (int[]) this.zztz.invoke(null, this.zzps.getContext());
        synchronized (this.zztq) {
            this.zztq.zzdf = Long.valueOf(iArr[0]);
            this.zztq.zzdg = Long.valueOf(iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.zztq.zzex = Long.valueOf(iArr[2]);
            }
        }
    }
}
