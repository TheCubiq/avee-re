package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.AbstractC2527pa;
import com.google.android.gms.ads.internal.zzc;
/* loaded from: classes.dex */
public final class pt3 extends zzc {
    public pt3(Context context, Looper looper, AbstractC2527pa.InterfaceC2528a interfaceC2528a, AbstractC2527pa.InterfaceC2529b interfaceC2529b) {
        super(av3.m26956a(context), looper, 8, interfaceC2528a, interfaceC2529b, null);
    }

    /* renamed from: J */
    public final xt3 m13149J() {
        return (xt3) super.getService();
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: e */
    public final /* synthetic */ IInterface mo6177e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof xt3 ? (xt3) queryLocalInterface : new vt3(iBinder);
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: k */
    public final String mo6175k() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: l */
    public final String mo6174l() {
        return "com.google.android.gms.ads.service.START";
    }
}
