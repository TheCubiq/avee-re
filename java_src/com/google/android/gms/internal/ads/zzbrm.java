package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.li3;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzbrm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrm> CREATOR = new li3();
    public final String p;
    public final String[] q;
    public final String[] r;

    public zzbrm(String str, String[] strArr, String[] strArr2) {
        this.p = str;
        this.q = strArr;
        this.r = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.q(parcel, 1, this.p, false);
        z71.r(parcel, 2, this.q, false);
        z71.r(parcel, 3, this.r, false);
        z71.b(parcel, a);
    }
}
