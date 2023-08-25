package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.AbstractC2527pa;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzg;
import com.google.android.gms.common.Feature;
/* loaded from: classes.dex */
public final class j33 extends zzc {
    public j33(Context context, Looper looper, AbstractC2527pa.InterfaceC2528a interfaceC2528a, AbstractC2527pa.InterfaceC2529b interfaceC2529b) {
        super(av3.m26956a(context), looper, x21.f31804J0, interfaceC2528a, interfaceC2529b, null);
    }

    /* renamed from: J */
    public final boolean m19157J() {
        return ((Boolean) zzba.zzc().m23658b(g93.f10413F1)).booleanValue() && C1913k6.m18036c(getAvailableFeatures(), zzg.zza);
    }

    /* renamed from: K */
    public final l33 m19156K() {
        return (l33) super.getService();
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: e */
    public final /* synthetic */ IInterface mo6177e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof l33 ? (l33) queryLocalInterface : new l33(iBinder);
    }

    @Override // com.daaw.AbstractC2527pa
    public final Feature[] getApiFeatures() {
        return zzg.zzb;
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: k */
    public final String mo6175k() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: l */
    public final String mo6174l() {
        return "com.google.android.gms.ads.service.CACHE";
    }
}
