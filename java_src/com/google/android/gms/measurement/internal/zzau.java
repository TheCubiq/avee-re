package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.hs2;
import com.daaw.xp2;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class zzau extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzau> CREATOR = new hs2();

    /* renamed from: p */
    public final Bundle f37067p;

    public zzau(Bundle bundle) {
        this.f37067p = bundle;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new xp2(this);
    }

    /* renamed from: q */
    public final Bundle m1078q() {
        return new Bundle(this.f37067p);
    }

    /* renamed from: s */
    public final Double m1077s(String str) {
        return Double.valueOf(this.f37067p.getDouble("value"));
    }

    /* renamed from: t */
    public final Long m1076t(String str) {
        return Long.valueOf(this.f37067p.getLong("value"));
    }

    public final String toString() {
        return this.f37067p.toString();
    }

    /* renamed from: u */
    public final Object m1075u(String str) {
        return this.f37067p.get(str);
    }

    /* renamed from: v */
    public final String m1074v(String str) {
        return this.f37067p.getString(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2729e(parcel, 2, m1078q(), false);
        z71.m2732b(parcel, m2733a);
    }

    public final int zza() {
        return this.f37067p.size();
    }
}
