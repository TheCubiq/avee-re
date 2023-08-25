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

    /* renamed from: p */
    public final int f36582p;

    /* renamed from: q */
    public final String f36583q;

    public Scope(int i, String str) {
        ry0.m10833g(str, "scopeUri must not be null or empty");
        this.f36582p = i;
        this.f36583q = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f36583q.equals(((Scope) obj).f36583q);
        }
        return false;
    }

    /* renamed from: h */
    public String m1199h() {
        return this.f36583q;
    }

    public int hashCode() {
        return this.f36583q.hashCode();
    }

    public String toString() {
        return this.f36583q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f36582p);
        z71.m2717q(parcel, 2, m1199h(), false);
        z71.m2732b(parcel, m2733a);
    }
}
