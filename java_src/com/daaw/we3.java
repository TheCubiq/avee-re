package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class we3 extends bp2 implements ye3 {
    public we3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.daaw.ye3
    /* renamed from: L0 */
    public final void mo3807L0(zzdg zzdgVar) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, zzdgVar);
        m25950M(32, m25952D);
    }

    @Override // com.daaw.ye3
    /* renamed from: M1 */
    public final void mo3806M1(zzcs zzcsVar) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, zzcsVar);
        m25950M(26, m25952D);
    }

    @Override // com.daaw.ye3
    /* renamed from: W2 */
    public final void mo3805W2(Bundle bundle) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, bundle);
        m25950M(15, m25952D);
    }

    @Override // com.daaw.ye3
    /* renamed from: Z0 */
    public final void mo3804Z0(Bundle bundle) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, bundle);
        m25950M(17, m25952D);
    }

    @Override // com.daaw.ye3
    /* renamed from: b */
    public final List mo3803b() {
        Parcel m25951I = m25951I(3, m25952D());
        ArrayList m24106b = dp2.m24106b(m25951I);
        m25951I.recycle();
        return m24106b;
    }

    @Override // com.daaw.ye3
    /* renamed from: d2 */
    public final void mo3802d2(ve3 ve3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, ve3Var);
        m25950M(21, m25952D);
    }

    @Override // com.daaw.ye3
    /* renamed from: g */
    public final boolean mo3801g() {
        Parcel m25951I = m25951I(24, m25952D());
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }

    @Override // com.daaw.ye3
    /* renamed from: g2 */
    public final boolean mo3800g2(Bundle bundle) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, bundle);
        Parcel m25951I = m25951I(16, m25952D);
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }

    @Override // com.daaw.ye3
    /* renamed from: j */
    public final boolean mo3799j() {
        Parcel m25951I = m25951I(30, m25952D());
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }

    @Override // com.daaw.ye3
    /* renamed from: k */
    public final void mo3798k() {
        m25950M(22, m25952D());
    }

    @Override // com.daaw.ye3
    /* renamed from: v0 */
    public final void mo3797v0(zzcw zzcwVar) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, zzcwVar);
        m25950M(25, m25952D);
    }

    @Override // com.daaw.ye3
    public final void zzA() {
        m25950M(28, m25952D());
    }

    @Override // com.daaw.ye3
    public final void zzC() {
        m25950M(27, m25952D());
    }

    @Override // com.daaw.ye3
    public final double zze() {
        Parcel m25951I = m25951I(8, m25952D());
        double readDouble = m25951I.readDouble();
        m25951I.recycle();
        return readDouble;
    }

    @Override // com.daaw.ye3
    public final Bundle zzf() {
        Parcel m25951I = m25951I(20, m25952D());
        Bundle bundle = (Bundle) dp2.m24107a(m25951I, Bundle.CREATOR);
        m25951I.recycle();
        return bundle;
    }

    @Override // com.daaw.ye3
    public final zzdn zzg() {
        Parcel m25951I = m25951I(31, m25952D());
        zzdn zzb = zzdm.zzb(m25951I.readStrongBinder());
        m25951I.recycle();
        return zzb;
    }

    @Override // com.daaw.ye3
    public final zzdq zzh() {
        Parcel m25951I = m25951I(11, m25952D());
        zzdq zzb = zzdp.zzb(m25951I.readStrongBinder());
        m25951I.recycle();
        return zzb;
    }

    @Override // com.daaw.ye3
    public final nc3 zzi() {
        nc3 lc3Var;
        Parcel m25951I = m25951I(14, m25952D());
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            lc3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            lc3Var = queryLocalInterface instanceof nc3 ? (nc3) queryLocalInterface : new lc3(readStrongBinder);
        }
        m25951I.recycle();
        return lc3Var;
    }

    @Override // com.daaw.ye3
    public final sc3 zzj() {
        sc3 qc3Var;
        Parcel m25951I = m25951I(29, m25952D());
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            qc3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            qc3Var = queryLocalInterface instanceof sc3 ? (sc3) queryLocalInterface : new qc3(readStrongBinder);
        }
        m25951I.recycle();
        return qc3Var;
    }

    @Override // com.daaw.ye3
    public final vc3 zzk() {
        vc3 tc3Var;
        Parcel m25951I = m25951I(5, m25952D());
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            tc3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            tc3Var = queryLocalInterface instanceof vc3 ? (vc3) queryLocalInterface : new tc3(readStrongBinder);
        }
        m25951I.recycle();
        return tc3Var;
    }

    @Override // com.daaw.ye3
    public final yd0 zzl() {
        Parcel m25951I = m25951I(19, m25952D());
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m25951I.readStrongBinder());
        m25951I.recycle();
        return m3857I;
    }

    @Override // com.daaw.ye3
    public final yd0 zzm() {
        Parcel m25951I = m25951I(18, m25952D());
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m25951I.readStrongBinder());
        m25951I.recycle();
        return m3857I;
    }

    @Override // com.daaw.ye3
    public final String zzn() {
        Parcel m25951I = m25951I(7, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.daaw.ye3
    public final String zzo() {
        Parcel m25951I = m25951I(4, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.daaw.ye3
    public final String zzp() {
        Parcel m25951I = m25951I(6, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.daaw.ye3
    public final String zzq() {
        Parcel m25951I = m25951I(2, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.daaw.ye3
    public final String zzr() {
        Parcel m25951I = m25951I(12, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.daaw.ye3
    public final String zzs() {
        Parcel m25951I = m25951I(10, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.daaw.ye3
    public final String zzt() {
        Parcel m25951I = m25951I(9, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.daaw.ye3
    public final List zzv() {
        Parcel m25951I = m25951I(23, m25952D());
        ArrayList m24106b = dp2.m24106b(m25951I);
        m25951I.recycle();
        return m24106b;
    }

    @Override // com.daaw.ye3
    public final void zzx() {
        m25950M(13, m25952D());
    }
}
