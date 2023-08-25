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
    public final Bundle p;

    public zzau(Bundle bundle) {
        this.p = bundle;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new xp2(this);
    }

    public final Bundle q() {
        return new Bundle(this.p);
    }

    public final Double s(String str) {
        return Double.valueOf(this.p.getDouble("value"));
    }

    public final Long t(String str) {
        return Long.valueOf(this.p.getLong("value"));
    }

    public final String toString() {
        return this.p.toString();
    }

    public final Object u(String str) {
        return this.p.get(str);
    }

    public final String v(String str) {
        return this.p.getString(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.e(parcel, 2, q(), false);
        z71.b(parcel, a);
    }

    public final int zza() {
        return this.p.size();
    }
}
