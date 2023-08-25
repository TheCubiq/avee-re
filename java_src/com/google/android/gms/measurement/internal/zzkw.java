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

    /* renamed from: p */
    public final int f37072p;

    /* renamed from: q */
    public final String f37073q;

    /* renamed from: r */
    public final long f37074r;

    /* renamed from: s */
    public final Long f37075s;

    /* renamed from: t */
    public final String f37076t;

    /* renamed from: u */
    public final String f37077u;

    /* renamed from: v */
    public final Double f37078v;

    public zzkw(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f37072p = i;
        this.f37073q = str;
        this.f37074r = j;
        this.f37075s = l;
        if (i == 1) {
            this.f37078v = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f37078v = d;
        }
        this.f37076t = str2;
        this.f37077u = str3;
    }

    public zzkw(mc8 mc8Var) {
        this(mc8Var.f18796c, mc8Var.f18797d, mc8Var.f18798e, mc8Var.f18795b);
    }

    public zzkw(String str, long j, Object obj, String str2) {
        ry0.m10834f(str);
        this.f37072p = 2;
        this.f37073q = str;
        this.f37074r = j;
        this.f37077u = str2;
        if (obj == null) {
            this.f37075s = null;
            this.f37078v = null;
            this.f37076t = null;
        } else if (obj instanceof Long) {
            this.f37075s = (Long) obj;
            this.f37078v = null;
            this.f37076t = null;
        } else if (obj instanceof String) {
            this.f37075s = null;
            this.f37078v = null;
            this.f37076t = (String) obj;
        } else if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        } else {
            this.f37075s = null;
            this.f37078v = (Double) obj;
            this.f37076t = null;
        }
    }

    /* renamed from: h */
    public final Object m1073h() {
        Long l = this.f37075s;
        if (l != null) {
            return l;
        }
        Double d = this.f37078v;
        if (d != null) {
            return d;
        }
        String str = this.f37076t;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        jc8.m18604a(this, parcel, i);
    }
}
