package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.bp2;
import com.daaw.dp2;
import com.daaw.yd0;
/* loaded from: classes.dex */
public final class zzbp extends bp2 implements zzbr {
    public zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(2, D);
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(yd0 yd0Var, String str, String str2) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        D.writeString(str);
        D.writeString(str2);
        Parcel I = I(1, D);
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }
}
