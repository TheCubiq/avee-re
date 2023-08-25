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

    /* renamed from: p */
    public final String f36577p;
    @Deprecated

    /* renamed from: q */
    public final int f36578q;

    /* renamed from: r */
    public final long f36579r;

    public Feature(String str, int i, long j) {
        this.f36577p = str;
        this.f36578q = i;
        this.f36579r = j;
    }

    public Feature(String str, long j) {
        this.f36577p = str;
        this.f36579r = j;
        this.f36578q = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((m1203h() != null && m1203h().equals(feature.m1203h())) || (m1203h() == null && feature.m1203h() == null)) && m1202q() == feature.m1202q()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public String m1203h() {
        return this.f36577p;
    }

    public final int hashCode() {
        return ot0.m13980b(m1203h(), Long.valueOf(m1202q()));
    }

    /* renamed from: q */
    public long m1202q() {
        long j = this.f36579r;
        return j == -1 ? this.f36578q : j;
    }

    public final String toString() {
        ot0.C2476a m13979c = ot0.m13979c(this);
        m13979c.m13978a("name", m1203h());
        m13979c.m13978a("version", Long.valueOf(m1202q()));
        return m13979c.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 1, m1203h(), false);
        z71.m2723k(parcel, 2, this.f36578q);
        z71.m2720n(parcel, 3, m1202q());
        z71.m2732b(parcel, m2733a);
    }
}
