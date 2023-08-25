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
        Parcel I = I(1, D());
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            zzblVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzblVar = queryLocalInterface instanceof zzbn ? (zzbn) queryLocalInterface : new zzbl(readStrongBinder);
        }
        I.recycle();
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
        Parcel D = D();
        D.writeString(str);
        dp2.g(D, fe3Var);
        dp2.g(D, ce3Var);
        M(5, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(sj3 sj3Var) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(je3 je3Var, zzq zzqVar) {
        Parcel D = D();
        dp2.g(D, je3Var);
        dp2.e(D, zzqVar);
        M(8, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(me3 me3Var) {
        Parcel D = D();
        dp2.g(D, me3Var);
        M(10, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(zzbh zzbhVar) {
        Parcel D = D();
        dp2.g(D, zzbhVar);
        M(2, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        Parcel D = D();
        dp2.e(D, adManagerAdViewOptions);
        M(15, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbsl zzbslVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzblz zzblzVar) {
        Parcel D = D();
        dp2.e(D, zzblzVar);
        M(6, D);
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
