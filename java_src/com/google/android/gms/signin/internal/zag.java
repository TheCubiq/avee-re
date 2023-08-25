package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.q51;
import com.daaw.x12;
import com.daaw.z71;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public final class zag extends AbstractSafeParcelable implements q51 {
    public static final Parcelable.Creator<zag> CREATOR = new x12();

    /* renamed from: p */
    public final List<String> f37106p;

    /* renamed from: q */
    public final String f37107q;

    public zag(List<String> list, String str) {
        this.f37106p = list;
        this.f37107q = str;
    }

    @Override // com.daaw.q51
    public final Status getStatus() {
        return this.f37107q != null ? Status.f36587v : Status.f36591z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2715s(parcel, 1, this.f37106p, false);
        z71.m2717q(parcel, 2, this.f37107q, false);
        z71.m2732b(parcel, m2733a);
    }
}
