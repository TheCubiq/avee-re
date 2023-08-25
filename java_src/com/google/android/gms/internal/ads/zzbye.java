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
    public final int p;
    public final int q;
    public final int r;

    public zzbye(int i, int i2, int i3) {
        this.p = i;
        this.q = i2;
        this.r = i3;
    }

    public static zzbye h(VersionInfo versionInfo) {
        return new zzbye(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbye)) {
            zzbye zzbyeVar = (zzbye) obj;
            if (zzbyeVar.r == this.r && zzbyeVar.q == this.q && zzbyeVar.p == this.p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.p, this.q, this.r});
    }

    public final String toString() {
        int i = this.p;
        int i2 = this.q;
        int i3 = this.r;
        return i + "." + i2 + "." + i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.p);
        z71.k(parcel, 2, this.q);
        z71.k(parcel, 3, this.r);
        z71.b(parcel, a);
    }
}
