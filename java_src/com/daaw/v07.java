package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.appset.zza;
/* loaded from: classes2.dex */
public final class v07 extends y22 {
    public v07(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void M(zza zzaVar, a86 a86Var) {
        Parcel D = D();
        rr3.b(D, zzaVar);
        rr3.c(D, a86Var);
        I(1, D);
    }
}
