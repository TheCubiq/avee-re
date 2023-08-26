package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public final class zzdq extends zzei {
    private static volatile Long zzej;
    private static final Object zztn = new Object();

    public zzdq(zzcz zzczVar, String str, String str2, zzba zzbaVar, int i, int i2) {
        super(zzczVar, str, str2, zzbaVar, i, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    protected final void zzar() throws IllegalAccessException, InvocationTargetException {
        if (zzej == null) {
            synchronized (zztn) {
                if (zzej == null) {
                    zzej = (Long) this.zztz.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zztq) {
            this.zztq.zzej = zzej;
        }
    }
}
