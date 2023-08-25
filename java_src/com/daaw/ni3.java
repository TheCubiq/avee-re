package com.daaw;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
/* loaded from: classes.dex */
public abstract class ni3 extends cp2 implements oi3 {
    public ni3() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            dp2.m24105c(parcel);
            mo12474S((ParcelFileDescriptor) dp2.m24107a(parcel, ParcelFileDescriptor.CREATOR));
            return true;
        }
        return false;
    }
}
