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
    public final String F2(String str) {
        Parcel D = D();
        D.writeString(str);
        Parcel I = I(1, D);
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.daaw.sd3
    public final void f0(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(14, D);
    }

    @Override // com.daaw.sd3
    public final boolean q(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        Parcel I = I(10, D);
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    @Override // com.daaw.sd3
    public final vc3 s(String str) {
        vc3 tc3Var;
        Parcel D = D();
        D.writeString(str);
        Parcel I = I(2, D);
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            tc3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            tc3Var = queryLocalInterface instanceof vc3 ? (vc3) queryLocalInterface : new tc3(readStrongBinder);
        }
        I.recycle();
        return tc3Var;
    }

    @Override // com.daaw.sd3
    public final zzdq zze() {
        Parcel I = I(7, D());
        zzdq zzb = zzdp.zzb(I.readStrongBinder());
        I.recycle();
        return zzb;
    }

    @Override // com.daaw.sd3
    public final sc3 zzf() {
        sc3 qc3Var;
        Parcel I = I(16, D());
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            qc3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            qc3Var = queryLocalInterface instanceof sc3 ? (sc3) queryLocalInterface : new qc3(readStrongBinder);
        }
        I.recycle();
        return qc3Var;
    }

    @Override // com.daaw.sd3
    public final yd0 zzh() {
        Parcel I = I(9, D());
        yd0 I2 = yd0.a.I(I.readStrongBinder());
        I.recycle();
        return I2;
    }

    @Override // com.daaw.sd3
    public final String zzi() {
        Parcel I = I(4, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.daaw.sd3
    public final List zzk() {
        Parcel I = I(3, D());
        ArrayList<String> createStringArrayList = I.createStringArrayList();
        I.recycle();
        return createStringArrayList;
    }

    @Override // com.daaw.sd3
    public final void zzl() {
        M(8, D());
    }

    @Override // com.daaw.sd3
    public final void zzm() {
        M(15, D());
    }

    @Override // com.daaw.sd3
    public final void zzn(String str) {
        Parcel D = D();
        D.writeString(str);
        M(5, D);
    }

    @Override // com.daaw.sd3
    public final void zzo() {
        M(6, D());
    }

    @Override // com.daaw.sd3
    public final boolean zzq() {
        Parcel I = I(12, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    @Override // com.daaw.sd3
    public final boolean zzs() {
        Parcel I = I(13, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }
}
