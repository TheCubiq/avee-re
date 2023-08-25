package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.pa;
import com.google.android.gms.ads.internal.zzc;
/* loaded from: classes.dex */
public final class qt6 extends zzc {
    public final int E;

    public qt6(Context context, Looper looper, pa.a aVar, pa.b bVar, int i) {
        super(context, looper, x21.C0, aVar, bVar, null);
        this.E = i;
    }

    public final tt6 J() {
        return (tt6) super.getService();
    }

    @Override // com.daaw.pa
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof tt6 ? (tt6) queryLocalInterface : new tt6(iBinder);
    }

    @Override // com.daaw.pa
    public final int getMinApkVersion() {
        return this.E;
    }

    @Override // com.daaw.pa
    public final String k() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.daaw.pa
    public final String l() {
        return "com.google.android.gms.gass.START";
    }
}
