package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.pa;
import com.google.android.gms.ads.internal.zzc;
/* loaded from: classes.dex */
public final class ki3 extends zzc {
    public ki3(Context context, Looper looper, pa.a aVar, pa.b bVar) {
        super(av3.a(context), looper, 166, aVar, bVar, null);
    }

    public final pi3 J() {
        return (pi3) super.getService();
    }

    @Override // com.daaw.pa
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof pi3 ? (pi3) queryLocalInterface : new pi3(iBinder);
    }

    @Override // com.daaw.pa
    public final String k() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.daaw.pa
    public final String l() {
        return "com.google.android.gms.ads.service.HTTP";
    }
}
