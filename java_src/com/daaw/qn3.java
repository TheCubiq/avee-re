package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class qn3 extends bp2 implements sn3 {
    public qn3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.daaw.sn3
    /* renamed from: b */
    public final String mo10146b() {
        Parcel m25951I = m25951I(9, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.daaw.sn3
    /* renamed from: n0 */
    public final void mo10145n0(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(22, m25952D);
    }

    @Override // com.daaw.sn3
    /* renamed from: n2 */
    public final void mo10144n2(yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, yd0Var2);
        dp2.m24101g(m25952D, yd0Var3);
        m25950M(21, m25952D);
    }

    @Override // com.daaw.sn3
    /* renamed from: w2 */
    public final void mo10143w2(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(20, m25952D);
    }

    @Override // com.daaw.sn3
    public final boolean zzA() {
        Parcel m25951I = m25951I(18, m25952D());
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }

    @Override // com.daaw.sn3
    public final boolean zzB() {
        Parcel m25951I = m25951I(17, m25952D());
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }

    @Override // com.daaw.sn3
    public final double zze() {
        Parcel m25951I = m25951I(8, m25952D());
        double readDouble = m25951I.readDouble();
        m25951I.recycle();
        return readDouble;
    }

    @Override // com.daaw.sn3
    public final float zzf() {
        Parcel m25951I = m25951I(23, m25952D());
        float readFloat = m25951I.readFloat();
        m25951I.recycle();
        return readFloat;
    }

    @Override // com.daaw.sn3
    public final float zzg() {
        Parcel m25951I = m25951I(25, m25952D());
        float readFloat = m25951I.readFloat();
        m25951I.recycle();
        return readFloat;
    }

    @Override // com.daaw.sn3
    public final float zzh() {
        Parcel m25951I = m25951I(24, m25952D());
        float readFloat = m25951I.readFloat();
        m25951I.recycle();
        return readFloat;
    }

    @Override // com.daaw.sn3
    public final Bundle zzi() {
        Parcel m25951I = m25951I(16, m25952D());
        Bundle bundle = (Bundle) dp2.m24107a(m25951I, Bundle.CREATOR);
        m25951I.recycle();
        return bundle;
    }

    @Override // com.daaw.sn3
    public final zzdq zzj() {
        Parcel m25951I = m25951I(11, m25952D());
        zzdq zzb = zzdp.zzb(m25951I.readStrongBinder());
        m25951I.recycle();
        return zzb;
    }

    @Override // com.daaw.sn3
    public final nc3 zzk() {
        Parcel m25951I = m25951I(12, m25952D());
        nc3 m16089g3 = mc3.m16089g3(m25951I.readStrongBinder());
        m25951I.recycle();
        return m16089g3;
    }

    @Override // com.daaw.sn3
    public final vc3 zzl() {
        Parcel m25951I = m25951I(5, m25952D());
        vc3 m8320g3 = uc3.m8320g3(m25951I.readStrongBinder());
        m25951I.recycle();
        return m8320g3;
    }

    @Override // com.daaw.sn3
    public final yd0 zzm() {
        Parcel m25951I = m25951I(13, m25952D());
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m25951I.readStrongBinder());
        m25951I.recycle();
        return m3857I;
    }

    @Override // com.daaw.sn3
    public final yd0 zzn() {
        Parcel m25951I = m25951I(14, m25952D());
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m25951I.readStrongBinder());
        m25951I.recycle();
        return m3857I;
    }

    @Override // com.daaw.sn3
    public final yd0 zzo() {
        Parcel m25951I = m25951I(15, m25952D());
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m25951I.readStrongBinder());
        m25951I.recycle();
        return m3857I;
    }

    @Override // com.daaw.sn3
    public final String zzp() {
        Parcel m25951I = m25951I(7, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.daaw.sn3
    public final String zzq() {
        Parcel m25951I = m25951I(4, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.daaw.sn3
    public final String zzr() {
        Parcel m25951I = m25951I(6, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.daaw.sn3
    public final String zzs() {
        Parcel m25951I = m25951I(2, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.daaw.sn3
    public final String zzt() {
        Parcel m25951I = m25951I(10, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.daaw.sn3
    public final List zzv() {
        Parcel m25951I = m25951I(3, m25952D());
        ArrayList m24106b = dp2.m24106b(m25951I);
        m25951I.recycle();
        return m24106b;
    }

    @Override // com.daaw.sn3
    public final void zzx() {
        m25950M(19, m25952D());
    }
}
