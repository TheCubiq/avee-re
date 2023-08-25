package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.qt3;
import com.daaw.z71;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbc> CREATOR = new qt3();
    public final Bundle A;
    public final int B;
    public final List C;
    public final Bundle D;
    public final boolean E;
    public final int F;
    public final int G;
    public final float H;
    public final String I;
    public final long J;
    public final String K;
    public final List L;
    public final String M;
    public final zzblz N;
    public final List O;
    public final long P;
    public final String Q;
    public final float R;
    public final int S;
    public final int T;
    public final boolean U;
    public final String V;
    public final boolean W;
    public final String X;
    public final boolean Y;
    public final int Z;
    public final Bundle a0;
    public final String b0;
    public final zzdu c0;
    public final boolean d0;
    public final Bundle e0;
    public final String f0;
    public final String g0;
    public final String h0;
    public final boolean i0;
    public final List j0;
    public final String k0;
    public final List l0;
    public final int m0;
    public final boolean n0;
    public final boolean o0;
    public final int p;
    public final boolean p0;
    public final Bundle q;
    public final ArrayList q0;
    public final zzl r;
    public final String r0;
    public final zzq s;
    public final zzbsl s0;
    public final String t;
    public final String t0;
    public final ApplicationInfo u;
    public final Bundle u0;
    public final PackageInfo v;
    public final String w;
    public final String x;
    public final String y;
    public final zzchu z;

    public zzcbc(int i, Bundle bundle, zzl zzlVar, zzq zzqVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzchu zzchuVar, Bundle bundle2, int i2, List list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List list2, String str7, zzblz zzblzVar, List list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, String str9, String str10, boolean z4, int i7, Bundle bundle4, String str11, zzdu zzduVar, boolean z5, Bundle bundle5, String str12, String str13, String str14, boolean z6, List list4, String str15, List list5, int i8, boolean z7, boolean z8, boolean z9, ArrayList arrayList, String str16, zzbsl zzbslVar, String str17, Bundle bundle6) {
        this.p = i;
        this.q = bundle;
        this.r = zzlVar;
        this.s = zzqVar;
        this.t = str;
        this.u = applicationInfo;
        this.v = packageInfo;
        this.w = str2;
        this.x = str3;
        this.y = str4;
        this.z = zzchuVar;
        this.A = bundle2;
        this.B = i2;
        this.C = list;
        this.O = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.D = bundle3;
        this.E = z;
        this.F = i3;
        this.G = i4;
        this.H = f;
        this.I = str5;
        this.J = j;
        this.K = str6;
        this.L = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.M = str7;
        this.N = zzblzVar;
        this.P = j2;
        this.Q = str8;
        this.R = f2;
        this.W = z2;
        this.S = i5;
        this.T = i6;
        this.U = z3;
        this.V = str9;
        this.X = str10;
        this.Y = z4;
        this.Z = i7;
        this.a0 = bundle4;
        this.b0 = str11;
        this.c0 = zzduVar;
        this.d0 = z5;
        this.e0 = bundle5;
        this.f0 = str12;
        this.g0 = str13;
        this.h0 = str14;
        this.i0 = z6;
        this.j0 = list4;
        this.k0 = str15;
        this.l0 = list5;
        this.m0 = i8;
        this.n0 = z7;
        this.o0 = z8;
        this.p0 = z9;
        this.q0 = arrayList;
        this.r0 = str16;
        this.s0 = zzbslVar;
        this.t0 = str17;
        this.u0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.p);
        z71.e(parcel, 2, this.q, false);
        z71.p(parcel, 3, this.r, i, false);
        z71.p(parcel, 4, this.s, i, false);
        z71.q(parcel, 5, this.t, false);
        z71.p(parcel, 6, this.u, i, false);
        z71.p(parcel, 7, this.v, i, false);
        z71.q(parcel, 8, this.w, false);
        z71.q(parcel, 9, this.x, false);
        z71.q(parcel, 10, this.y, false);
        z71.p(parcel, 11, this.z, i, false);
        z71.e(parcel, 12, this.A, false);
        z71.k(parcel, 13, this.B);
        z71.s(parcel, 14, this.C, false);
        z71.e(parcel, 15, this.D, false);
        z71.c(parcel, 16, this.E);
        z71.k(parcel, 18, this.F);
        z71.k(parcel, 19, this.G);
        z71.h(parcel, 20, this.H);
        z71.q(parcel, 21, this.I, false);
        z71.n(parcel, 25, this.J);
        z71.q(parcel, 26, this.K, false);
        z71.s(parcel, 27, this.L, false);
        z71.q(parcel, 28, this.M, false);
        z71.p(parcel, 29, this.N, i, false);
        z71.s(parcel, 30, this.O, false);
        z71.n(parcel, 31, this.P);
        z71.q(parcel, 33, this.Q, false);
        z71.h(parcel, 34, this.R);
        z71.k(parcel, 35, this.S);
        z71.k(parcel, 36, this.T);
        z71.c(parcel, 37, this.U);
        z71.q(parcel, 39, this.V, false);
        z71.c(parcel, 40, this.W);
        z71.q(parcel, 41, this.X, false);
        z71.c(parcel, 42, this.Y);
        z71.k(parcel, 43, this.Z);
        z71.e(parcel, 44, this.a0, false);
        z71.q(parcel, 45, this.b0, false);
        z71.p(parcel, 46, this.c0, i, false);
        z71.c(parcel, 47, this.d0);
        z71.e(parcel, 48, this.e0, false);
        z71.q(parcel, 49, this.f0, false);
        z71.q(parcel, 50, this.g0, false);
        z71.q(parcel, 51, this.h0, false);
        z71.c(parcel, 52, this.i0);
        z71.m(parcel, 53, this.j0, false);
        z71.q(parcel, 54, this.k0, false);
        z71.s(parcel, 55, this.l0, false);
        z71.k(parcel, 56, this.m0);
        z71.c(parcel, 57, this.n0);
        z71.c(parcel, 58, this.o0);
        z71.c(parcel, 59, this.p0);
        z71.s(parcel, 60, this.q0, false);
        z71.q(parcel, 61, this.r0, false);
        z71.p(parcel, 63, this.s0, i, false);
        z71.q(parcel, 64, this.t0, false);
        z71.e(parcel, 65, this.u0, false);
        z71.b(parcel, a);
    }
}
