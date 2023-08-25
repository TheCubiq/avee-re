package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class qd3 extends bp2 implements sd3 {
    public qd3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.daaw.sd3
    /* renamed from: F2 */
    public final String mo2685F2(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        Parcel m25951I = m25951I(1, m25952D);
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.daaw.sd3
    /* renamed from: f0 */
    public final void mo2684f0(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(14, m25952D);
    }

    @Override // com.daaw.sd3
    /* renamed from: q */
    public final boolean mo2682q(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        Parcel m25951I = m25951I(10, m25952D);
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }

    @Override // com.daaw.sd3
    /* renamed from: s */
    public final vc3 mo2681s(String str) {
        vc3 tc3Var;
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        Parcel m25951I = m25951I(2, m25952D);
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

    @Override // com.daaw.sd3
    public final zzdq zze() {
        Parcel m25951I = m25951I(7, m25952D());
        zzdq zzb = zzdp.zzb(m25951I.readStrongBinder());
        m25951I.recycle();
        return zzb;
    }

    @Override // com.daaw.sd3
    public final sc3 zzf() {
        sc3 qc3Var;
        Parcel m25951I = m25951I(16, m25952D());
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

    @Override // com.daaw.sd3
    public final yd0 zzh() {
        Parcel m25951I = m25951I(9, m25952D());
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m25951I.readStrongBinder());
        m25951I.recycle();
        return m3857I;
    }

    @Override // com.daaw.sd3
    public final String zzi() {
        Parcel m25951I = m25951I(4, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.daaw.sd3
    public final List zzk() {
        Parcel m25951I = m25951I(3, m25952D());
        ArrayList<String> createStringArrayList = m25951I.createStringArrayList();
        m25951I.recycle();
        return createStringArrayList;
    }

    @Override // com.daaw.sd3
    public final void zzl() {
        m25950M(8, m25952D());
    }

    @Override // com.daaw.sd3
    public final void zzm() {
        m25950M(15, m25952D());
    }

    @Override // com.daaw.sd3
    public final void zzn(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        m25950M(5, m25952D);
    }

    @Override // com.daaw.sd3
    public final void zzo() {
        m25950M(6, m25952D());
    }

    @Override // com.daaw.sd3
    public final boolean zzq() {
        Parcel m25951I = m25951I(12, m25952D());
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }

    @Override // com.daaw.sd3
    public final boolean zzs() {
        Parcel m25951I = m25951I(13, m25952D());
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }
}
