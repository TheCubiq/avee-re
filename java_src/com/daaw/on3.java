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
public final class on3 extends bp2 {
    public on3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* renamed from: h3 */
    public final zzdq m14138h3() {
        Parcel m25951I = m25951I(17, m25952D());
        zzdq zzb = zzdp.zzb(m25951I.readStrongBinder());
        m25951I.recycle();
        return zzb;
    }

    /* renamed from: i3 */
    public final nc3 m14137i3() {
        Parcel m25951I = m25951I(19, m25952D());
        nc3 m16089g3 = mc3.m16089g3(m25951I.readStrongBinder());
        m25951I.recycle();
        return m16089g3;
    }

    /* renamed from: j3 */
    public final vc3 m14136j3() {
        Parcel m25951I = m25951I(5, m25952D());
        vc3 m8320g3 = uc3.m8320g3(m25951I.readStrongBinder());
        m25951I.recycle();
        return m8320g3;
    }

    /* renamed from: k3 */
    public final yd0 m14135k3() {
        Parcel m25951I = m25951I(18, m25952D());
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m25951I.readStrongBinder());
        m25951I.recycle();
        return m3857I;
    }

    /* renamed from: l3 */
    public final yd0 m14134l3() {
        Parcel m25951I = m25951I(20, m25952D());
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m25951I.readStrongBinder());
        m25951I.recycle();
        return m3857I;
    }

    /* renamed from: m3 */
    public final List m14133m3() {
        Parcel m25951I = m25951I(3, m25952D());
        ArrayList m24106b = dp2.m24106b(m25951I);
        m25951I.recycle();
        return m24106b;
    }

    /* renamed from: n3 */
    public final void m14132n3(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(11, m25952D);
    }

    /* renamed from: o3 */
    public final void m14131o3(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(12, m25952D);
    }

    /* renamed from: p3 */
    public final void m14130p3(yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, yd0Var2);
        dp2.m24101g(m25952D, yd0Var3);
        m25950M(22, m25952D);
    }

    /* renamed from: q3 */
    public final boolean m14129q3() {
        Parcel m25951I = m25951I(14, m25952D());
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }

    /* renamed from: r3 */
    public final boolean m14128r3() {
        Parcel m25951I = m25951I(13, m25952D());
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }

    /* renamed from: w2 */
    public final void m14127w2(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(16, m25952D);
    }

    public final double zze() {
        Parcel m25951I = m25951I(7, m25952D());
        double readDouble = m25951I.readDouble();
        m25951I.recycle();
        return readDouble;
    }

    public final Bundle zzf() {
        Parcel m25951I = m25951I(15, m25952D());
        Bundle bundle = (Bundle) dp2.m24107a(m25951I, Bundle.CREATOR);
        m25951I.recycle();
        return bundle;
    }

    public final yd0 zzl() {
        Parcel m25951I = m25951I(21, m25952D());
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m25951I.readStrongBinder());
        m25951I.recycle();
        return m3857I;
    }

    public final String zzm() {
        Parcel m25951I = m25951I(4, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    public final String zzn() {
        Parcel m25951I = m25951I(6, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    public final String zzo() {
        Parcel m25951I = m25951I(2, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    public final String zzp() {
        Parcel m25951I = m25951I(9, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    public final String zzq() {
        Parcel m25951I = m25951I(8, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    public final void zzt() {
        m25950M(10, m25952D());
    }
}
