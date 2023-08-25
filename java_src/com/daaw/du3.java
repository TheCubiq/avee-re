package com.daaw;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzaz;
/* loaded from: classes.dex */
public abstract class du3 extends cp2 implements eu3 {
    public du3() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            dp2.m24105c(parcel);
            mo19640y((ParcelFileDescriptor) dp2.m24107a(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            dp2.m24105c(parcel);
            mo19641K((zzaz) dp2.m24107a(parcel, zzaz.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
