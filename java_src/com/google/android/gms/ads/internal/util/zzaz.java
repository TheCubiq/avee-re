package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.hz6;
import com.daaw.tj6;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    public final String zza;
    public final int zzb;

    public zzaz(String str, int i) {
        this.zza = str == null ? "" : str;
        this.zzb = i;
    }

    public static zzaz zzb(Throwable th) {
        com.google.android.gms.ads.internal.client.zze a = tj6.a(th);
        return new zzaz(hz6.d(th.getMessage()) ? a.zzb : th.getMessage(), a.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.q(parcel, 1, this.zza, false);
        z71.k(parcel, 2, this.zzb);
        z71.b(parcel, a);
    }

    public final zzay zza() {
        return new zzay(this.zza, this.zzb);
    }
}
