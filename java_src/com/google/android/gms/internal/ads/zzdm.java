package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public final class zzdm extends zzei {
    public zzdm(zzcz zzczVar, String str, String str2, zzba zzbaVar, int i, int i2) {
        super(zzczVar, str, str2, zzbaVar, i, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    protected final void zzar() throws IllegalAccessException, InvocationTargetException {
        this.zztq.zzem = 2;
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.zztz.invoke(null, this.zzps.getContext())).booleanValue();
            zzba zzbaVar = this.zztq;
            if (!booleanValue) {
                i = 0;
            }
            zzbaVar.zzem = Integer.valueOf(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
