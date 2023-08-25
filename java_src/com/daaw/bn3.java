package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbye;
import java.util.List;
/* loaded from: classes.dex */
public final class bn3 extends bp2 implements dn3 {
    public bn3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.daaw.dn3
    /* renamed from: D0 */
    public final void mo24148D0(yd0 yd0Var, zzl zzlVar, String str, String str2, gn3 gn3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24103e(m25952D, zzlVar);
        m25952D.writeString(str);
        m25952D.writeString(str2);
        dp2.m24101g(m25952D, gn3Var);
        m25950M(7, m25952D);
    }

    @Override // com.daaw.dn3
    /* renamed from: D1 */
    public final void mo24147D1(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(37, m25952D);
    }

    @Override // com.daaw.dn3
    /* renamed from: I2 */
    public final void mo24146I2(yd0 yd0Var, pv3 pv3Var, List list) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, pv3Var);
        m25952D.writeStringList(list);
        m25950M(23, m25952D);
    }

    @Override // com.daaw.dn3
    /* renamed from: J1 */
    public final void mo24145J1(yd0 yd0Var, zzl zzlVar, String str, pv3 pv3Var, String str2) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24103e(m25952D, zzlVar);
        m25952D.writeString(null);
        dp2.m24101g(m25952D, pv3Var);
        m25952D.writeString(str2);
        m25950M(10, m25952D);
    }

    @Override // com.daaw.dn3
    /* renamed from: N0 */
    public final void mo24144N0(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(39, m25952D);
    }

    @Override // com.daaw.dn3
    /* renamed from: R0 */
    public final void mo24143R0(yd0 yd0Var, zzl zzlVar, String str, String str2, gn3 gn3Var, zzblz zzblzVar, List list) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24103e(m25952D, zzlVar);
        m25952D.writeString(str);
        m25952D.writeString(str2);
        dp2.m24101g(m25952D, gn3Var);
        dp2.m24103e(m25952D, zzblzVar);
        m25952D.writeStringList(list);
        m25950M(14, m25952D);
    }

    @Override // com.daaw.dn3
    /* renamed from: V1 */
    public final void mo24142V1(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(30, m25952D);
    }

    @Override // com.daaw.dn3
    /* renamed from: W */
    public final void mo24141W(yd0 yd0Var, zzl zzlVar, String str, gn3 gn3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24103e(m25952D, zzlVar);
        m25952D.writeString(str);
        dp2.m24101g(m25952D, gn3Var);
        m25950M(32, m25952D);
    }

    @Override // com.daaw.dn3
    /* renamed from: W1 */
    public final void mo24140W1(boolean z) {
        Parcel m25952D = m25952D();
        dp2.m24104d(m25952D, z);
        m25950M(25, m25952D);
    }

    @Override // com.daaw.dn3
    /* renamed from: X0 */
    public final void mo24139X0(yd0 yd0Var, zzq zzqVar, zzl zzlVar, String str, String str2, gn3 gn3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24103e(m25952D, zzqVar);
        dp2.m24103e(m25952D, zzlVar);
        m25952D.writeString(str);
        m25952D.writeString(str2);
        dp2.m24101g(m25952D, gn3Var);
        m25950M(35, m25952D);
    }

    @Override // com.daaw.dn3
    /* renamed from: d */
    public final void mo24137d() {
        m25950M(9, m25952D());
    }

    @Override // com.daaw.dn3
    /* renamed from: h */
    public final void mo24134h() {
        m25950M(4, m25952D());
    }

    @Override // com.daaw.dn3
    /* renamed from: i0 */
    public final void mo24132i0(yd0 yd0Var, dj3 dj3Var, List list) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, dj3Var);
        m25952D.writeTypedList(list);
        m25950M(31, m25952D);
    }

    @Override // com.daaw.dn3
    /* renamed from: k1 */
    public final void mo24129k1(yd0 yd0Var, zzq zzqVar, zzl zzlVar, String str, String str2, gn3 gn3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24103e(m25952D, zzqVar);
        dp2.m24103e(m25952D, zzlVar);
        m25952D.writeString(str);
        m25952D.writeString(str2);
        dp2.m24101g(m25952D, gn3Var);
        m25950M(6, m25952D);
    }

    @Override // com.daaw.dn3
    /* renamed from: p */
    public final void mo24123p() {
        m25950M(12, m25952D());
    }

    @Override // com.daaw.dn3
    /* renamed from: q2 */
    public final void mo24121q2(yd0 yd0Var, zzl zzlVar, String str, gn3 gn3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24103e(m25952D, zzlVar);
        m25952D.writeString(str);
        dp2.m24101g(m25952D, gn3Var);
        m25950M(28, m25952D);
    }

    @Override // com.daaw.dn3
    /* renamed from: t2 */
    public final void mo24119t2(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(21, m25952D);
    }

    @Override // com.daaw.dn3
    /* renamed from: v2 */
    public final void mo24118v2(zzl zzlVar, String str) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzlVar);
        m25952D.writeString(str);
        m25950M(11, m25952D);
    }

    @Override // com.daaw.dn3
    /* renamed from: x2 */
    public final void mo24117x2(yd0 yd0Var, zzl zzlVar, String str, gn3 gn3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24103e(m25952D, zzlVar);
        m25952D.writeString(str);
        dp2.m24101g(m25952D, gn3Var);
        m25950M(38, m25952D);
    }

    @Override // com.daaw.dn3
    public final void zzE() {
        m25950M(8, m25952D());
    }

    @Override // com.daaw.dn3
    public final boolean zzM() {
        Parcel m25951I = m25951I(22, m25952D());
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }

    @Override // com.daaw.dn3
    public final boolean zzN() {
        Parcel m25951I = m25951I(13, m25952D());
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }

    @Override // com.daaw.dn3
    public final on3 zzO() {
        on3 on3Var;
        Parcel m25951I = m25951I(15, m25952D());
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            on3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            on3Var = queryLocalInterface instanceof on3 ? (on3) queryLocalInterface : new on3(readStrongBinder);
        }
        m25951I.recycle();
        return on3Var;
    }

    @Override // com.daaw.dn3
    public final pn3 zzP() {
        pn3 pn3Var;
        Parcel m25951I = m25951I(16, m25952D());
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            pn3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            pn3Var = queryLocalInterface instanceof pn3 ? (pn3) queryLocalInterface : new pn3(readStrongBinder);
        }
        m25951I.recycle();
        return pn3Var;
    }

    @Override // com.daaw.dn3
    public final zzdq zzh() {
        Parcel m25951I = m25951I(26, m25952D());
        zzdq zzb = zzdp.zzb(m25951I.readStrongBinder());
        m25951I.recycle();
        return zzb;
    }

    @Override // com.daaw.dn3
    public final mn3 zzj() {
        mn3 kn3Var;
        Parcel m25951I = m25951I(36, m25952D());
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            kn3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            kn3Var = queryLocalInterface instanceof mn3 ? (mn3) queryLocalInterface : new kn3(readStrongBinder);
        }
        m25951I.recycle();
        return kn3Var;
    }

    @Override // com.daaw.dn3
    public final sn3 zzk() {
        sn3 qn3Var;
        Parcel m25951I = m25951I(27, m25952D());
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            qn3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            qn3Var = queryLocalInterface instanceof sn3 ? (sn3) queryLocalInterface : new qn3(readStrongBinder);
        }
        m25951I.recycle();
        return qn3Var;
    }

    @Override // com.daaw.dn3
    public final zzbye zzl() {
        Parcel m25951I = m25951I(33, m25952D());
        zzbye zzbyeVar = (zzbye) dp2.m24107a(m25951I, zzbye.CREATOR);
        m25951I.recycle();
        return zzbyeVar;
    }

    @Override // com.daaw.dn3
    public final zzbye zzm() {
        Parcel m25951I = m25951I(34, m25952D());
        zzbye zzbyeVar = (zzbye) dp2.m24107a(m25951I, zzbye.CREATOR);
        m25951I.recycle();
        return zzbyeVar;
    }

    @Override // com.daaw.dn3
    public final yd0 zzn() {
        Parcel m25951I = m25951I(2, m25952D());
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m25951I.readStrongBinder());
        m25951I.recycle();
        return m3857I;
    }

    @Override // com.daaw.dn3
    public final void zzo() {
        m25950M(5, m25952D());
    }
}
