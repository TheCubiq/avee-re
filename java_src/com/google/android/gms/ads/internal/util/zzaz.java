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
        com.google.android.gms.ads.internal.client.zze m9074a = tj6.m9074a(th);
        return new zzaz(hz6.m20315d(th.getMessage()) ? m9074a.zzb : th.getMessage(), m9074a.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 1, this.zza, false);
        z71.m2723k(parcel, 2, this.zzb);
        z71.m2732b(parcel, m2733a);
    }

    public final zzay zza() {
        return new zzay(this.zza, this.zzb);
    }
}
