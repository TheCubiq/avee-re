package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C1184eh;
import com.daaw.jy2;
import com.daaw.ot0;
import com.daaw.q51;
import com.daaw.z71;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements q51, ReflectedParcelable {

    /* renamed from: p */
    public final int f36592p;

    /* renamed from: q */
    public final int f36593q;

    /* renamed from: r */
    public final String f36594r;

    /* renamed from: s */
    public final PendingIntent f36595s;

    /* renamed from: t */
    public final ConnectionResult f36596t;

    /* renamed from: u */
    public static final Status f36586u = new Status(-1);

    /* renamed from: v */
    public static final Status f36587v = new Status(0);

    /* renamed from: w */
    public static final Status f36588w = new Status(14);

    /* renamed from: x */
    public static final Status f36589x = new Status(8);

    /* renamed from: y */
    public static final Status f36590y = new Status(15);

    /* renamed from: z */
    public static final Status f36591z = new Status(16);

    /* renamed from: B */
    public static final Status f36585B = new Status(17);

    /* renamed from: A */
    public static final Status f36584A = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new jy2();

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f36592p = i;
        this.f36593q = i2;
        this.f36594r = str;
        this.f36595s = pendingIntent;
        this.f36596t = connectionResult;
    }

    public Status(int i, String str) {
        this(1, i, str, null, null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    @Deprecated
    public Status(ConnectionResult connectionResult, String str, int i) {
        this(1, i, str, connectionResult.m1207s(), connectionResult);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.f36592p == status.f36592p && this.f36593q == status.f36593q && ot0.m13981a(this.f36594r, status.f36594r) && ot0.m13981a(this.f36595s, status.f36595s) && ot0.m13981a(this.f36596t, status.f36596t);
        }
        return false;
    }

    @Override // com.daaw.q51
    public Status getStatus() {
        return this;
    }

    /* renamed from: h */
    public ConnectionResult m1198h() {
        return this.f36596t;
    }

    public int hashCode() {
        return ot0.m13980b(Integer.valueOf(this.f36592p), Integer.valueOf(this.f36593q), this.f36594r, this.f36595s, this.f36596t);
    }

    /* renamed from: q */
    public int m1197q() {
        return this.f36593q;
    }

    /* renamed from: s */
    public String m1196s() {
        return this.f36594r;
    }

    /* renamed from: t */
    public boolean m1195t() {
        return this.f36595s != null;
    }

    public String toString() {
        ot0.C2476a m13979c = ot0.m13979c(this);
        m13979c.m13978a("statusCode", m1193v());
        m13979c.m13978a("resolution", this.f36595s);
        return m13979c.toString();
    }

    /* renamed from: u */
    public boolean m1194u() {
        return this.f36593q <= 0;
    }

    /* renamed from: v */
    public final String m1193v() {
        String str = this.f36594r;
        return str != null ? str : C1184eh.m23471a(this.f36593q);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, m1197q());
        z71.m2717q(parcel, 2, m1196s(), false);
        z71.m2718p(parcel, 3, this.f36595s, i, false);
        z71.m2718p(parcel, 4, m1198h(), i, false);
        z71.m2723k(parcel, 1000, this.f36592p);
        z71.m2732b(parcel, m2733a);
    }
}
