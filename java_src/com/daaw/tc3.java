package com.daaw;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public final class tc3 extends bp2 implements vc3 {
    public tc3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.daaw.vc3
    public final double zzb() {
        Parcel m25951I = m25951I(3, m25952D());
        double readDouble = m25951I.readDouble();
        m25951I.recycle();
        return readDouble;
    }

    @Override // com.daaw.vc3
    public final int zzc() {
        Parcel m25951I = m25951I(5, m25952D());
        int readInt = m25951I.readInt();
        m25951I.recycle();
        return readInt;
    }

    @Override // com.daaw.vc3
    public final int zzd() {
        Parcel m25951I = m25951I(4, m25952D());
        int readInt = m25951I.readInt();
        m25951I.recycle();
        return readInt;
    }

    @Override // com.daaw.vc3
    public final Uri zze() {
        Parcel m25951I = m25951I(2, m25952D());
        Uri uri = (Uri) dp2.m24107a(m25951I, Uri.CREATOR);
        m25951I.recycle();
        return uri;
    }

    @Override // com.daaw.vc3
    public final yd0 zzf() {
        Parcel m25951I = m25951I(1, m25952D());
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m25951I.readStrongBinder());
        m25951I.recycle();
        return m3857I;
    }
}
