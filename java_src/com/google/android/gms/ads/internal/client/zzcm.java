package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.an3;
import com.daaw.bp2;
import com.daaw.dp2;
import com.daaw.gj3;
import com.daaw.yd0;
import com.google.android.gms.internal.ads.zzbrz;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzcm extends bp2 implements zzco {
    public zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final float zze() {
        Parcel m25951I = m25951I(7, m25952D());
        float readFloat = m25951I.readFloat();
        m25951I.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        Parcel m25951I = m25951I(9, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() {
        Parcel m25951I = m25951I(13, m25952D());
        ArrayList createTypedArrayList = m25951I.createTypedArrayList(zzbrz.CREATOR);
        m25951I.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        m25950M(10, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        m25950M(15, m25952D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) {
        Parcel m25952D = m25952D();
        dp2.m24104d(m25952D, z);
        m25950M(17, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() {
        m25950M(1, m25952D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, yd0 yd0Var) {
        Parcel m25952D = m25952D();
        m25952D.writeString(null);
        dp2.m24101g(m25952D, yd0Var);
        m25950M(6, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, zzdaVar);
        m25950M(16, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(yd0 yd0Var, String str) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25952D.writeString(str);
        m25950M(5, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(an3 an3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, an3Var);
        m25950M(11, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z) {
        Parcel m25952D = m25952D();
        dp2.m24104d(m25952D, z);
        m25950M(4, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f) {
        Parcel m25952D = m25952D();
        m25952D.writeFloat(f);
        m25950M(2, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(gj3 gj3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, gj3Var);
        m25950M(12, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        m25950M(18, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzffVar);
        m25950M(14, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() {
        Parcel m25951I = m25951I(8, m25952D());
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }
}
