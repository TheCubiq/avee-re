package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.pa;
import com.google.android.gms.ads.internal.zzc;
/* loaded from: classes.dex */
public final class pt3 extends zzc {
    public pt3(Context context, Looper looper, pa.a aVar, pa.b bVar) {
        super(av3.a(context), looper, 8, aVar, bVar, null);
    }

    public final xt3 J() {
        return (xt3) super.getService();
    }

    @Override // com.daaw.pa
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof xt3 ? (xt3) queryLocalInterface : new vt3(iBinder);
    }

    @Override // com.daaw.pa
    public final String k() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.daaw.pa
    public final String l() {
        return "com.google.android.gms.ads.service.START";
    }
}
