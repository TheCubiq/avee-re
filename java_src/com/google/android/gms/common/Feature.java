package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.cs3;
import com.daaw.ot0;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new cs3();
    public final String p;
    @Deprecated
    public final int q;
    public final long r;

    public Feature(String str, int i, long j) {
        this.p = str;
        this.q = i;
        this.r = j;
    }

    public Feature(String str, long j) {
        this.p = str;
        this.r = j;
        this.q = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((h() != null && h().equals(feature.h())) || (h() == null && feature.h() == null)) && q() == feature.q()) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.p;
    }

    public final int hashCode() {
        return ot0.b(h(), Long.valueOf(q()));
    }

    public long q() {
        long j = this.r;
        return j == -1 ? this.q : j;
    }

    public final String toString() {
        ot0.a c = ot0.c(this);
        c.a("name", h());
        c.a("version", Long.valueOf(q()));
        return c.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.q(parcel, 1, h(), false);
        z71.k(parcel, 2, this.q);
        z71.n(parcel, 3, q());
        z71.b(parcel, a);
    }
}
