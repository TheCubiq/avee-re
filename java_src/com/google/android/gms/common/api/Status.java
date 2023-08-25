package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.eh;
import com.daaw.jy2;
import com.daaw.ot0;
import com.daaw.q51;
import com.daaw.z71;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements q51, ReflectedParcelable {
    public final int p;
    public final int q;
    public final String r;
    public final PendingIntent s;
    public final ConnectionResult t;
    public static final Status u = new Status(-1);
    public static final Status v = new Status(0);
    public static final Status w = new Status(14);
    public static final Status x = new Status(8);
    public static final Status y = new Status(15);
    public static final Status z = new Status(16);
    public static final Status B = new Status(17);
    public static final Status A = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new jy2();

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.p = i;
        this.q = i2;
        this.r = str;
        this.s = pendingIntent;
        this.t = connectionResult;
    }

    public Status(int i, String str) {
        this(1, i, str, null, null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    @Deprecated
    public Status(ConnectionResult connectionResult, String str, int i) {
        this(1, i, str, connectionResult.s(), connectionResult);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.p == status.p && this.q == status.q && ot0.a(this.r, status.r) && ot0.a(this.s, status.s) && ot0.a(this.t, status.t);
        }
        return false;
    }

    @Override // com.daaw.q51
    public Status getStatus() {
        return this;
    }

    public ConnectionResult h() {
        return this.t;
    }

    public int hashCode() {
        return ot0.b(Integer.valueOf(this.p), Integer.valueOf(this.q), this.r, this.s, this.t);
    }

    public int q() {
        return this.q;
    }

    public String s() {
        return this.r;
    }

    public boolean t() {
        return this.s != null;
    }

    public String toString() {
        ot0.a c = ot0.c(this);
        c.a("statusCode", v());
        c.a("resolution", this.s);
        return c.toString();
    }

    public boolean u() {
        return this.q <= 0;
    }

    public final String v() {
        String str = this.r;
        return str != null ? str : eh.a(this.q);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, q());
        z71.q(parcel, 2, s(), false);
        z71.p(parcel, 3, this.s, i, false);
        z71.p(parcel, 4, h(), i, false);
        z71.k(parcel, 1000, this.p);
        z71.b(parcel, a);
    }
}
