package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.bp2;
/* loaded from: classes.dex */
public final class zzbz extends bp2 implements zzcb {
    public zzbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zzc(String str, String str2) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        M(1, D);
    }
}
