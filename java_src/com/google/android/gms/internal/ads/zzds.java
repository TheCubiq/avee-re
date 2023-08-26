package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public final class zzds extends zzei {
    public zzds(zzcz zzczVar, String str, String str2, zzba zzbaVar, int i, int i2) {
        super(zzczVar, str, str2, zzbaVar, i, 24);
    }

    private final void zzau() {
        AdvertisingIdClient zzan = this.zzps.zzan();
        if (zzan == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = zzan.getInfo();
            String zzn = zzdg.zzn(info.getId());
            if (zzn != null) {
                synchronized (this.zztq) {
                    this.zztq.zzfi = zzn;
                    this.zztq.zzfk = Boolean.valueOf(info.isLimitAdTrackingEnabled());
                    this.zztq.zzfj = 5;
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzei, java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        return call();
    }

    @Override // com.google.android.gms.internal.ads.zzei
    protected final void zzar() throws IllegalAccessException, InvocationTargetException {
        if (this.zzps.zzaf()) {
            zzau();
            return;
        }
        synchronized (this.zztq) {
            this.zztq.zzfi = (String) this.zztz.invoke(null, this.zzps.getContext());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final Void zzat() throws Exception {
        if (this.zzps.isInitialized()) {
            return super.call();
        }
        if (this.zzps.zzaf()) {
            zzau();
            return null;
        }
        return null;
    }
}
