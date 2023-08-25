package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.daaw.cp2;
/* loaded from: classes.dex */
public abstract class zzbd extends cp2 implements zzbe {
    public zzbd() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzb();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
