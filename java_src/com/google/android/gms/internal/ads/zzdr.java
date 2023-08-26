package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public final class zzdr extends zzei {
    private long startTime;

    public zzdr(zzcz zzczVar, String str, String str2, zzba zzbaVar, long j, int i, int i2) {
        super(zzczVar, str, str2, zzbaVar, i, 25);
        this.startTime = j;
    }

    @Override // com.google.android.gms.internal.ads.zzei
    protected final void zzar() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zztz.invoke(null, new Object[0])).longValue();
        synchronized (this.zztq) {
            this.zztq.zzfm = Long.valueOf(longValue);
            if (this.startTime != 0) {
                this.zztq.zzdr = Long.valueOf(longValue - this.startTime);
                this.zztq.zzdw = Long.valueOf(this.startTime);
            }
        }
    }
}
