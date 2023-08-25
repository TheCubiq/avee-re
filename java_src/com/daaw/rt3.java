package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.AbstractC2527pa;
/* loaded from: classes.dex */
public final class rt3 extends AbstractC2527pa {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rt3(Context context, Looper looper, AbstractC2527pa.InterfaceC2528a interfaceC2528a, AbstractC2527pa.InterfaceC2529b interfaceC2529b) {
        super(r0 != null ? r0 : context, looper, 8, interfaceC2528a, interfaceC2529b, null);
        Context applicationContext = context.getApplicationContext();
    }

    /* renamed from: J */
    public final bu3 m10957J() {
        return (bu3) super.getService();
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: e */
    public final /* synthetic */ IInterface mo6177e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsService");
        return queryLocalInterface instanceof bu3 ? (bu3) queryLocalInterface : new zt3(iBinder);
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: k */
    public final String mo6175k() {
        return "com.google.android.gms.ads.internal.request.IAdsService";
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: l */
    public final String mo6174l() {
        return "com.google.android.gms.ads.service.ADS";
    }
}
