package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public final class zzdu extends zzei {
    private static final Object zztn = new Object();
    private static volatile Long zztr;

    public zzdu(zzcz zzczVar, String str, String str2, zzba zzbaVar, int i, int i2) {
        super(zzczVar, str, str2, zzbaVar, i, 22);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    protected final void zzar() throws IllegalAccessException, InvocationTargetException {
        if (zztr == null) {
            synchronized (zztn) {
                if (zztr == null) {
                    zztr = (Long) this.zztz.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zztq) {
            this.zztq.zzdv = zztr;
        }
    }
}
