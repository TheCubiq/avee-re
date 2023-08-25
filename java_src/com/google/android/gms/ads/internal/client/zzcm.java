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
        Parcel I = I(7, D());
        float readFloat = I.readFloat();
        I.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        Parcel I = I(9, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() {
        Parcel I = I(13, D());
        ArrayList createTypedArrayList = I.createTypedArrayList(zzbrz.CREATOR);
        I.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        Parcel D = D();
        D.writeString(str);
        M(10, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        M(15, D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) {
        Parcel D = D();
        dp2.d(D, z);
        M(17, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() {
        M(1, D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, yd0 yd0Var) {
        Parcel D = D();
        D.writeString(null);
        dp2.g(D, yd0Var);
        M(6, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) {
        Parcel D = D();
        dp2.g(D, zzdaVar);
        M(16, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(yd0 yd0Var, String str) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        D.writeString(str);
        M(5, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(an3 an3Var) {
        Parcel D = D();
        dp2.g(D, an3Var);
        M(11, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z) {
        Parcel D = D();
        dp2.d(D, z);
        M(4, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f) {
        Parcel D = D();
        D.writeFloat(f);
        M(2, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(gj3 gj3Var) {
        Parcel D = D();
        dp2.g(D, gj3Var);
        M(12, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        Parcel D = D();
        D.writeString(str);
        M(18, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) {
        Parcel D = D();
        dp2.e(D, zzffVar);
        M(14, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() {
        Parcel I = I(8, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }
}
