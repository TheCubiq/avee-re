package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzj;
/* loaded from: classes.dex */
public abstract class x42 extends wx2 implements td0 {
    public x42() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.daaw.wx2
    public final boolean D(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            sr3.b(parcel);
            p1(parcel.readInt(), parcel.readStrongBinder(), (Bundle) sr3.a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            sr3.b(parcel);
            O0(parcel.readInt(), (Bundle) sr3.a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            sr3.b(parcel);
            w1(parcel.readInt(), parcel.readStrongBinder(), (zzj) sr3.a(parcel, zzj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
