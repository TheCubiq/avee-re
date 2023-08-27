package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public final class zzdw extends zzei {
    private static volatile String zzdc;
    private static final Object zztn = new Object();

    public zzdw(zzcz zzczVar, String str, String str2, zzba zzbaVar, int i, int i2) {
        super(zzczVar, str, str2, zzbaVar, i, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    protected final void zzar() throws IllegalAccessException, InvocationTargetException {
        this.zztq.zzdc = "E";
        if (zzdc == null) {
            synchronized (zztn) {
                if (zzdc == null) {
                    zzdc = (String) this.zztz.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zztq) {
            this.zztq.zzdc = zzdc;
        }
    }
}
