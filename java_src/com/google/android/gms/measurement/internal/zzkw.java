package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.jc8;
import com.daaw.mc8;
import com.daaw.ry0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class zzkw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkw> CREATOR = new jc8();
    public final int p;
    public final String q;
    public final long r;
    public final Long s;
    public final String t;
    public final String u;
    public final Double v;

    public zzkw(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.p = i;
        this.q = str;
        this.r = j;
        this.s = l;
        if (i == 1) {
            this.v = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.v = d;
        }
        this.t = str2;
        this.u = str3;
    }

    public zzkw(mc8 mc8Var) {
        this(mc8Var.c, mc8Var.d, mc8Var.e, mc8Var.b);
    }

    public zzkw(String str, long j, Object obj, String str2) {
        ry0.f(str);
        this.p = 2;
        this.q = str;
        this.r = j;
        this.u = str2;
        if (obj == null) {
            this.s = null;
            this.v = null;
            this.t = null;
        } else if (obj instanceof Long) {
            this.s = (Long) obj;
            this.v = null;
            this.t = null;
        } else if (obj instanceof String) {
            this.s = null;
            this.v = null;
            this.t = (String) obj;
        } else if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        } else {
            this.s = null;
            this.v = (Double) obj;
            this.t = null;
        }
    }

    public final Object h() {
        Long l = this.s;
        if (l != null) {
            return l;
        }
        Double d = this.v;
        if (d != null) {
            return d;
        }
        String str = this.t;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        jc8.a(this, parcel, i);
    }
}
