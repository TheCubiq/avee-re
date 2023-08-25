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
    /* renamed from: D */
    public final boolean mo5540D(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            sr3.m9942b(parcel);
            mo9293p1(parcel.readInt(), parcel.readStrongBinder(), (Bundle) sr3.m9943a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            sr3.m9942b(parcel);
            mo9294O0(parcel.readInt(), (Bundle) sr3.m9943a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            sr3.m9942b(parcel);
            mo9292w1(parcel.readInt(), parcel.readStrongBinder(), (zzj) sr3.m9943a(parcel, zzj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
