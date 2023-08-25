package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class tm3 {

    /* renamed from: b */
    public static tm3 f27867b;

    /* renamed from: a */
    public final AtomicBoolean f27868a = new AtomicBoolean(false);

    /* renamed from: a */
    public static tm3 m8966a() {
        if (f27867b == null) {
            f27867b = new tm3();
        }
        return f27867b;
    }

    /* renamed from: b */
    public final Thread m8965b(final Context context, final String str) {
        if (this.f27868a.compareAndSet(false, true)) {
            Thread thread = new Thread(new Runnable() { // from class: com.daaw.sm3
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    String str2 = str;
                    g93.m21879c(context2);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("measurementEnabled", ((Boolean) zzba.zzc().m23658b(g93.f10677f0)).booleanValue());
                    if (((Boolean) zzba.zzc().m23658b(g93.f10754m0)).booleanValue()) {
                        bundle.putString("ad_storage", "denied");
                        bundle.putString("analytics_storage", "denied");
                    }
                    try {
                        ((a94) o04.m14656b(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new m04() { // from class: com.daaw.rm3
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.daaw.m04
                            public final Object zza(Object obj) {
                                return z84.m2623g3(obj);
                            }
                        })).mo4001K0(nt0.m14830g3(context2), new qm3(C1361g5.m21955k(context2, "FA-Ads", "am", str2, bundle)));
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
