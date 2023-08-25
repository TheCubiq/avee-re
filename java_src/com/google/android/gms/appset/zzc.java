package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.al4;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new al4();

    /* renamed from: p */
    public final String f36556p;

    /* renamed from: q */
    public final int f36557q;

    public zzc(String str, int i) {
        this.f36556p = str;
        this.f36557q = i;
    }

    /* renamed from: h */
    public final String m1222h() {
        return this.f36556p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 1, this.f36556p, false);
        z71.m2723k(parcel, 2, this.f36557q);
        z71.m2732b(parcel, m2733a);
    }

    public final int zza() {
        return this.f36557q;
    }
}
