package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.signin.internal.zai;
/* loaded from: classes2.dex */
public final class s12 extends mz1 {
    public s12(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void g3(zai zaiVar, p12 p12Var) {
        Parcel D = D();
        s02.b(D, zaiVar);
        s02.c(D, p12Var);
        I(12, D);
    }
}
