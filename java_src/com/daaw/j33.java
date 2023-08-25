package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.pa;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzg;
import com.google.android.gms.common.Feature;
/* loaded from: classes.dex */
public final class j33 extends zzc {
    public j33(Context context, Looper looper, pa.a aVar, pa.b bVar) {
        super(av3.a(context), looper, x21.J0, aVar, bVar, null);
    }

    public final boolean J() {
        return ((Boolean) zzba.zzc().b(g93.F1)).booleanValue() && k6.c(getAvailableFeatures(), zzg.zza);
    }

    public final l33 K() {
        return (l33) super.getService();
    }

    @Override // com.daaw.pa
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof l33 ? (l33) queryLocalInterface : new l33(iBinder);
    }

    @Override // com.daaw.pa
    public final Feature[] getApiFeatures() {
        return zzg.zzb;
    }

    @Override // com.daaw.pa
    public final String k() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.daaw.pa
    public final String l() {
        return "com.google.android.gms.ads.service.CACHE";
    }
}
