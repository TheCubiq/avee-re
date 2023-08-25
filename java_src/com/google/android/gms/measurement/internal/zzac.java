package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.e72;
import com.daaw.ry0;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new e72();
    public String p;
    public String q;
    public zzkw r;
    public long s;
    public boolean t;
    public String u;
    public final zzaw v;
    public long w;
    public zzaw x;
    public final long y;
    public final zzaw z;

    public zzac(zzac zzacVar) {
        ry0.j(zzacVar);
        this.p = zzacVar.p;
        this.q = zzacVar.q;
        this.r = zzacVar.r;
        this.s = zzacVar.s;
        this.t = zzacVar.t;
        this.u = zzacVar.u;
        this.v = zzacVar.v;
        this.w = zzacVar.w;
        this.x = zzacVar.x;
        this.y = zzacVar.y;
        this.z = zzacVar.z;
    }

    public zzac(String str, String str2, zzkw zzkwVar, long j, boolean z, String str3, zzaw zzawVar, long j2, zzaw zzawVar2, long j3, zzaw zzawVar3) {
        this.p = str;
        this.q = str2;
        this.r = zzkwVar;
        this.s = j;
        this.t = z;
        this.u = str3;
        this.v = zzawVar;
        this.w = j2;
        this.x = zzawVar2;
        this.y = j3;
        this.z = zzawVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.q(parcel, 2, this.p, false);
        z71.q(parcel, 3, this.q, false);
        z71.p(parcel, 4, this.r, i, false);
        z71.n(parcel, 5, this.s);
        z71.c(parcel, 6, this.t);
        z71.q(parcel, 7, this.u, false);
        z71.p(parcel, 8, this.v, i, false);
        z71.n(parcel, 9, this.w);
        z71.p(parcel, 10, this.x, i, false);
        z71.n(parcel, 11, this.y);
        z71.p(parcel, 12, this.z, i, false);
        z71.b(parcel, a);
    }
}
