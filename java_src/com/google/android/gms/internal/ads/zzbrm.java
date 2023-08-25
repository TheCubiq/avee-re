package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.li3;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzbrm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrm> CREATOR = new li3();

    /* renamed from: p */
    public final String f36855p;

    /* renamed from: q */
    public final String[] f36856q;

    /* renamed from: r */
    public final String[] f36857r;

    public zzbrm(String str, String[] strArr, String[] strArr2) {
        this.f36855p = str;
        this.f36856q = strArr;
        this.f36857r = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 1, this.f36855p, false);
        z71.m2716r(parcel, 2, this.f36856q, false);
        z71.m2716r(parcel, 3, this.f36857r, false);
        z71.m2732b(parcel, m2733a);
    }
}
