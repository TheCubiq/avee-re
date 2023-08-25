package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.k32;
import com.daaw.ry0;
import com.daaw.z71;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new k32();
    public final int p;
    public final String q;

    public Scope(int i, String str) {
        ry0.g(str, "scopeUri must not be null or empty");
        this.p = i;
        this.q = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.q.equals(((Scope) obj).q);
        }
        return false;
    }

    public String h() {
        return this.q;
    }

    public int hashCode() {
        return this.q.hashCode();
    }

    public String toString() {
        return this.q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.p);
        z71.q(parcel, 2, h(), false);
        z71.b(parcel, a);
    }
}
