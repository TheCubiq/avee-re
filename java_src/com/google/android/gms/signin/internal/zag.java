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
    public final List<String> p;
    public final String q;

    public zag(List<String> list, String str) {
        this.p = list;
        this.q = str;
    }

    @Override // com.daaw.q51
    public final Status getStatus() {
        return this.q != null ? Status.v : Status.z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.s(parcel, 1, this.p, false);
        z71.q(parcel, 2, this.q, false);
        z71.b(parcel, a);
    }
}
