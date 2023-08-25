package com.daaw;

import android.os.Parcel;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
/* loaded from: classes2.dex */
public abstract class me5 extends vx2 implements a86 {
    public me5() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // com.daaw.vx2
    /* renamed from: D */
    public final boolean mo6674D(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo26080x1((Status) rr3.m11050a(parcel, Status.CREATOR), (zzc) rr3.m11050a(parcel, zzc.CREATOR));
            return true;
        }
        return false;
    }
}
