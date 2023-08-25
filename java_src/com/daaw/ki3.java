package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.AbstractC2527pa;
import com.google.android.gms.ads.internal.zzc;
/* loaded from: classes.dex */
public final class ki3 extends zzc {
    public ki3(Context context, Looper looper, AbstractC2527pa.InterfaceC2528a interfaceC2528a, AbstractC2527pa.InterfaceC2529b interfaceC2529b) {
        super(av3.m26956a(context), looper, 166, interfaceC2528a, interfaceC2529b, null);
    }

    /* renamed from: J */
    public final pi3 m17717J() {
        return (pi3) super.getService();
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: e */
    public final /* synthetic */ IInterface mo6177e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof pi3 ? (pi3) queryLocalInterface : new pi3(iBinder);
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: k */
    public final String mo6175k() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: l */
    public final String mo6174l() {
        return "com.google.android.gms.ads.service.HTTP";
    }
}
