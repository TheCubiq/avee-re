package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.up3;
import com.daaw.z71;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbye extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbye> CREATOR = new up3();

    /* renamed from: p */
    public final int f36876p;

    /* renamed from: q */
    public final int f36877q;

    /* renamed from: r */
    public final int f36878r;

    public zzbye(int i, int i2, int i3) {
        this.f36876p = i;
        this.f36877q = i2;
        this.f36878r = i3;
    }

    /* renamed from: h */
    public static zzbye m1099h(VersionInfo versionInfo) {
        return new zzbye(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbye)) {
            zzbye zzbyeVar = (zzbye) obj;
            if (zzbyeVar.f36878r == this.f36878r && zzbyeVar.f36877q == this.f36877q && zzbyeVar.f36876p == this.f36876p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f36876p, this.f36877q, this.f36878r});
    }

    public final String toString() {
        int i = this.f36876p;
        int i2 = this.f36877q;
        int i3 = this.f36878r;
        return i + "." + i2 + "." + i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f36876p);
        z71.m2723k(parcel, 2, this.f36877q);
        z71.m2723k(parcel, 3, this.f36878r);
        z71.m2732b(parcel, m2733a);
    }
}
