package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public final class zzea extends zzei {
    private final StackTraceElement[] zztv;

    public zzea(zzcz zzczVar, String str, String str2, zzba zzbaVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzczVar, str, str2, zzbaVar, i, 45);
        this.zztv = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzei
    protected final void zzar() throws IllegalAccessException, InvocationTargetException {
        if (this.zztv != null) {
            zzcx zzcxVar = new zzcx((String) this.zztz.invoke(null, this.zztv));
            synchronized (this.zztq) {
                this.zztq.zzek = zzcxVar.zzro;
                if (zzcxVar.zzrp.booleanValue()) {
                    this.zztq.zzes = Integer.valueOf(zzcxVar.zzrq.booleanValue() ? 0 : 1);
                }
            }
        }
    }
}
