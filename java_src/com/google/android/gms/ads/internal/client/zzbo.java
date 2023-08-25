package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.bp2;
import com.daaw.ce3;
import com.daaw.dp2;
import com.daaw.fe3;
import com.daaw.je3;
import com.daaw.me3;
import com.daaw.sj3;
import com.daaw.wd3;
import com.daaw.zd3;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbsl;
/* loaded from: classes.dex */
public final class zzbo extends bp2 implements zzbq {
    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() {
        zzbn zzblVar;
        Parcel m25951I = m25951I(1, m25952D());
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            zzblVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzblVar = queryLocalInterface instanceof zzbn ? (zzbn) queryLocalInterface : new zzbl(readStrongBinder);
        }
        m25951I.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(wd3 wd3Var) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zd3 zd3Var) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, fe3 fe3Var, ce3 ce3Var) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        dp2.m24101g(m25952D, fe3Var);
        dp2.m24101g(m25952D, ce3Var);
        m25950M(5, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(sj3 sj3Var) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(je3 je3Var, zzq zzqVar) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, je3Var);
        dp2.m24103e(m25952D, zzqVar);
        m25950M(8, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(me3 me3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, me3Var);
        m25950M(10, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(zzbh zzbhVar) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, zzbhVar);
        m25950M(2, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, adManagerAdViewOptions);
        m25950M(15, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbsl zzbslVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzblz zzblzVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzblzVar);
        m25950M(6, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcf zzcfVar) {
        throw null;
    }
}
