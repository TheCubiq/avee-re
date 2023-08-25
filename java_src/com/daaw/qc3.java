package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
/* loaded from: classes.dex */
public final class qc3 extends bp2 implements sc3 {
    public qc3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.daaw.sc3
    public final float zze() {
        Parcel I = I(2, D());
        float readFloat = I.readFloat();
        I.recycle();
        return readFloat;
    }

    @Override // com.daaw.sc3
    public final float zzf() {
        Parcel I = I(6, D());
        float readFloat = I.readFloat();
        I.recycle();
        return readFloat;
    }

    @Override // com.daaw.sc3
    public final float zzg() {
        Parcel I = I(5, D());
        float readFloat = I.readFloat();
        I.recycle();
        return readFloat;
    }

    @Override // com.daaw.sc3
    public final zzdq zzh() {
        Parcel I = I(7, D());
        zzdq zzb = zzdp.zzb(I.readStrongBinder());
        I.recycle();
        return zzb;
    }

    @Override // com.daaw.sc3
    public final yd0 zzi() {
        Parcel I = I(4, D());
        yd0 I2 = yd0.a.I(I.readStrongBinder());
        I.recycle();
        return I2;
    }

    @Override // com.daaw.sc3
    public final void zzj(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(3, D);
    }

    @Override // com.daaw.sc3
    public final boolean zzk() {
        Parcel I = I(8, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }
}
