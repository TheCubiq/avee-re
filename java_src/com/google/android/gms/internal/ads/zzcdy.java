package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.kw3;
import com.daaw.z71;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcdy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcdy> CREATOR = new kw3();

    /* renamed from: p */
    public final String f36979p;

    /* renamed from: q */
    public final String f36980q;

    public zzcdy(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }

    public zzcdy(String str, String str2) {
        this.f36979p = str;
        this.f36980q = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 1, this.f36979p, false);
        z71.m2717q(parcel, 2, this.f36980q, false);
        z71.m2732b(parcel, m2733a);
    }
}
