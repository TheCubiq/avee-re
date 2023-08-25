package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.signin.internal.zai;
/* loaded from: classes2.dex */
public final class s12 extends mz1 {
    public s12(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: g3 */
    public final void m10764g3(zai zaiVar, p12 p12Var) {
        Parcel m15654D = m15654D();
        s02.m10802b(m15654D, zaiVar);
        s02.m10801c(m15654D, p12Var);
        m15653I(12, m15654D);
    }
}
