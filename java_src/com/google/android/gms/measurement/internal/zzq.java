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

    /* renamed from: A */
    public final long f37079A;

    /* renamed from: B */
    public final long f37080B;

    /* renamed from: C */
    public final int f37081C;

    /* renamed from: D */
    public final boolean f37082D;

    /* renamed from: E */
    public final boolean f37083E;

    /* renamed from: F */
    public final String f37084F;

    /* renamed from: G */
    public final Boolean f37085G;

    /* renamed from: H */
    public final long f37086H;

    /* renamed from: I */
    public final List f37087I;

    /* renamed from: J */
    public final String f37088J;

    /* renamed from: K */
    public final String f37089K;

    /* renamed from: L */
    public final String f37090L;

    /* renamed from: M */
    public final String f37091M;

    /* renamed from: p */
    public final String f37092p;

    /* renamed from: q */
    public final String f37093q;

    /* renamed from: r */
    public final String f37094r;

    /* renamed from: s */
    public final String f37095s;

    /* renamed from: t */
    public final long f37096t;

    /* renamed from: u */
    public final long f37097u;

    /* renamed from: v */
    public final String f37098v;

    /* renamed from: w */
    public final boolean f37099w;

    /* renamed from: x */
    public final boolean f37100x;

    /* renamed from: y */
    public final long f37101y;

    /* renamed from: z */
    public final String f37102z;

    public zzq(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11) {
        ry0.m10834f(str);
        this.f37092p = str;
        this.f37093q = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f37094r = str3;
        this.f37101y = j;
        this.f37095s = str4;
        this.f37096t = j2;
        this.f37097u = j3;
        this.f37098v = str5;
        this.f37099w = z;
        this.f37100x = z2;
        this.f37102z = str6;
        this.f37079A = 0L;
        this.f37080B = j5;
        this.f37081C = i;
        this.f37082D = z3;
        this.f37083E = z4;
        this.f37084F = str7;
        this.f37085G = bool;
        this.f37086H = j6;
        this.f37087I = list;
        this.f37088J = null;
        this.f37089K = str9;
        this.f37090L = str10;
        this.f37091M = str11;
    }

    public zzq(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11) {
        this.f37092p = str;
        this.f37093q = str2;
        this.f37094r = str3;
        this.f37101y = j3;
        this.f37095s = str4;
        this.f37096t = j;
        this.f37097u = j2;
        this.f37098v = str5;
        this.f37099w = z;
        this.f37100x = z2;
        this.f37102z = str6;
        this.f37079A = j4;
        this.f37080B = j5;
        this.f37081C = i;
        this.f37082D = z3;
        this.f37083E = z4;
        this.f37084F = str7;
        this.f37085G = bool;
        this.f37086H = j6;
        this.f37087I = list;
        this.f37088J = str8;
        this.f37089K = str9;
        this.f37090L = str10;
        this.f37091M = str11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 2, this.f37092p, false);
        z71.m2717q(parcel, 3, this.f37093q, false);
        z71.m2717q(parcel, 4, this.f37094r, false);
        z71.m2717q(parcel, 5, this.f37095s, false);
        z71.m2720n(parcel, 6, this.f37096t);
        z71.m2720n(parcel, 7, this.f37097u);
        z71.m2717q(parcel, 8, this.f37098v, false);
        z71.m2731c(parcel, 9, this.f37099w);
        z71.m2731c(parcel, 10, this.f37100x);
        z71.m2720n(parcel, 11, this.f37101y);
        z71.m2717q(parcel, 12, this.f37102z, false);
        z71.m2720n(parcel, 13, this.f37079A);
        z71.m2720n(parcel, 14, this.f37080B);
        z71.m2723k(parcel, 15, this.f37081C);
        z71.m2731c(parcel, 16, this.f37082D);
        z71.m2731c(parcel, 18, this.f37083E);
        z71.m2717q(parcel, 19, this.f37084F, false);
        z71.m2730d(parcel, 21, this.f37085G, false);
        z71.m2720n(parcel, 22, this.f37086H);
        z71.m2715s(parcel, 23, this.f37087I, false);
        z71.m2717q(parcel, 24, this.f37088J, false);
        z71.m2717q(parcel, 25, this.f37089K, false);
        z71.m2717q(parcel, 26, this.f37090L, false);
        z71.m2717q(parcel, 27, this.f37091M, false);
        z71.m2732b(parcel, m2733a);
    }
}
