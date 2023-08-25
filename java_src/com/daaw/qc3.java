package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
/* loaded from: classes.dex */
public final class qc3 extends bp2 implements sc3 {
    public qc3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.daaw.sc3
    public final float zze() {
        Parcel m25951I = m25951I(2, m25952D());
        float readFloat = m25951I.readFloat();
        m25951I.recycle();
        return readFloat;
    }

    @Override // com.daaw.sc3
    public final float zzf() {
        Parcel m25951I = m25951I(6, m25952D());
        float readFloat = m25951I.readFloat();
        m25951I.recycle();
        return readFloat;
    }

    @Override // com.daaw.sc3
    public final float zzg() {
        Parcel m25951I = m25951I(5, m25952D());
        float readFloat = m25951I.readFloat();
        m25951I.recycle();
        return readFloat;
    }

    @Override // com.daaw.sc3
    public final zzdq zzh() {
        Parcel m25951I = m25951I(7, m25952D());
        zzdq zzb = zzdp.zzb(m25951I.readStrongBinder());
        m25951I.recycle();
        return zzb;
    }

    @Override // com.daaw.sc3
    public final yd0 zzi() {
        Parcel m25951I = m25951I(4, m25952D());
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m25951I.readStrongBinder());
        m25951I.recycle();
        return m3857I;
    }

    @Override // com.daaw.sc3
    public final void zzj(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(3, m25952D);
    }

    @Override // com.daaw.sc3
    public final boolean zzk() {
        Parcel m25951I = m25951I(8, m25952D());
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }
}
