package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.daaw.bq8;
import com.daaw.ry0;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new bq8();
    @Deprecated
    public final long A;
    public final long B;
    public final int C;
    public final boolean D;
    public final boolean E;
    public final String F;
    public final Boolean G;
    public final long H;
    public final List I;
    public final String J;
    public final String K;
    public final String L;
    public final String M;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final long t;
    public final long u;
    public final String v;
    public final boolean w;
    public final boolean x;
    public final long y;
    public final String z;

    public zzq(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11) {
        ry0.f(str);
        this.p = str;
        this.q = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.r = str3;
        this.y = j;
        this.s = str4;
        this.t = j2;
        this.u = j3;
        this.v = str5;
        this.w = z;
        this.x = z2;
        this.z = str6;
        this.A = 0L;
        this.B = j5;
        this.C = i;
        this.D = z3;
        this.E = z4;
        this.F = str7;
        this.G = bool;
        this.H = j6;
        this.I = list;
        this.J = null;
        this.K = str9;
        this.L = str10;
        this.M = str11;
    }

    public zzq(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11) {
        this.p = str;
        this.q = str2;
        this.r = str3;
        this.y = j3;
        this.s = str4;
        this.t = j;
        this.u = j2;
        this.v = str5;
        this.w = z;
        this.x = z2;
        this.z = str6;
        this.A = j4;
        this.B = j5;
        this.C = i;
        this.D = z3;
        this.E = z4;
        this.F = str7;
        this.G = bool;
        this.H = j6;
        this.I = list;
        this.J = str8;
        this.K = str9;
        this.L = str10;
        this.M = str11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.q(parcel, 2, this.p, false);
        z71.q(parcel, 3, this.q, false);
        z71.q(parcel, 4, this.r, false);
        z71.q(parcel, 5, this.s, false);
        z71.n(parcel, 6, this.t);
        z71.n(parcel, 7, this.u);
        z71.q(parcel, 8, this.v, false);
        z71.c(parcel, 9, this.w);
        z71.c(parcel, 10, this.x);
        z71.n(parcel, 11, this.y);
        z71.q(parcel, 12, this.z, false);
        z71.n(parcel, 13, this.A);
        z71.n(parcel, 14, this.B);
        z71.k(parcel, 15, this.C);
        z71.c(parcel, 16, this.D);
        z71.c(parcel, 18, this.E);
        z71.q(parcel, 19, this.F, false);
        z71.d(parcel, 21, this.G, false);
        z71.n(parcel, 22, this.H);
        z71.s(parcel, 23, this.I, false);
        z71.q(parcel, 24, this.J, false);
        z71.q(parcel, 25, this.K, false);
        z71.q(parcel, 26, this.L, false);
        z71.q(parcel, 27, this.M, false);
        z71.b(parcel, a);
    }
}
