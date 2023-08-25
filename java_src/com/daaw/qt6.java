package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.AbstractC2527pa;
import com.google.android.gms.ads.internal.zzc;
/* loaded from: classes.dex */
public final class qt6 extends zzc {

    /* renamed from: E */
    public final int f24323E;

    public qt6(Context context, Looper looper, AbstractC2527pa.InterfaceC2528a interfaceC2528a, AbstractC2527pa.InterfaceC2529b interfaceC2529b, int i) {
        super(context, looper, x21.f31769C0, interfaceC2528a, interfaceC2529b, null);
        this.f24323E = i;
    }

    /* renamed from: J */
    public final tt6 m12223J() {
        return (tt6) super.getService();
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: e */
    public final /* synthetic */ IInterface mo6177e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof tt6 ? (tt6) queryLocalInterface : new tt6(iBinder);
    }

    @Override // com.daaw.AbstractC2527pa
    public final int getMinApkVersion() {
        return this.f24323E;
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: k */
    public final String mo6175k() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: l */
    public final String mo6174l() {
        return "com.google.android.gms.gass.START";
    }
}
