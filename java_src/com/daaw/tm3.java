package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class tm3 {
    public static tm3 b;
    public final AtomicBoolean a = new AtomicBoolean(false);

    public static tm3 a() {
        if (b == null) {
            b = new tm3();
        }
        return b;
    }

    public final Thread b(final Context context, final String str) {
        if (this.a.compareAndSet(false, true)) {
            Thread thread = new Thread(new Runnable() { // from class: com.daaw.sm3
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    String str2 = str;
                    g93.c(context2);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("measurementEnabled", ((Boolean) zzba.zzc().b(g93.f0)).booleanValue());
                    if (((Boolean) zzba.zzc().b(g93.m0)).booleanValue()) {
                        bundle.putString("ad_storage", "denied");
                        bundle.putString("analytics_storage", "denied");
                    }
                    try {
                        ((a94) o04.b(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new m04() { // from class: com.daaw.rm3
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.daaw.m04
                            public final Object zza(Object obj) {
                                return z84.g3(obj);
                            }
                        })).K0(nt0.g3(context2), new qm3(g5.k(context2, "FA-Ads", "am", str2, bundle)));
                    } catch (RemoteException | n04 | NullPointerException e) {
                        k04.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
            thread.start();
            return thread;
        }
        return null;
    }
}
