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

    /* renamed from: p */
    public String f37056p;

    /* renamed from: q */
    public String f37057q;

    /* renamed from: r */
    public zzkw f37058r;

    /* renamed from: s */
    public long f37059s;

    /* renamed from: t */
    public boolean f37060t;

    /* renamed from: u */
    public String f37061u;

    /* renamed from: v */
    public final zzaw f37062v;

    /* renamed from: w */
    public long f37063w;

    /* renamed from: x */
    public zzaw f37064x;

    /* renamed from: y */
    public final long f37065y;

    /* renamed from: z */
    public final zzaw f37066z;

    public zzac(zzac zzacVar) {
        ry0.m10830j(zzacVar);
        this.f37056p = zzacVar.f37056p;
        this.f37057q = zzacVar.f37057q;
        this.f37058r = zzacVar.f37058r;
        this.f37059s = zzacVar.f37059s;
        this.f37060t = zzacVar.f37060t;
        this.f37061u = zzacVar.f37061u;
        this.f37062v = zzacVar.f37062v;
        this.f37063w = zzacVar.f37063w;
        this.f37064x = zzacVar.f37064x;
        this.f37065y = zzacVar.f37065y;
        this.f37066z = zzacVar.f37066z;
    }

    public zzac(String str, String str2, zzkw zzkwVar, long j, boolean z, String str3, zzaw zzawVar, long j2, zzaw zzawVar2, long j3, zzaw zzawVar3) {
        this.f37056p = str;
        this.f37057q = str2;
        this.f37058r = zzkwVar;
        this.f37059s = j;
        this.f37060t = z;
        this.f37061u = str3;
        this.f37062v = zzawVar;
        this.f37063w = j2;
        this.f37064x = zzawVar2;
        this.f37065y = j3;
        this.f37066z = zzawVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 2, this.f37056p, false);
        z71.m2717q(parcel, 3, this.f37057q, false);
        z71.m2718p(parcel, 4, this.f37058r, i, false);
        z71.m2720n(parcel, 5, this.f37059s);
        z71.m2731c(parcel, 6, this.f37060t);
        z71.m2717q(parcel, 7, this.f37061u, false);
        z71.m2718p(parcel, 8, this.f37062v, i, false);
        z71.m2720n(parcel, 9, this.f37063w);
        z71.m2718p(parcel, 10, this.f37064x, i, false);
        z71.m2720n(parcel, 11, this.f37065y);
        z71.m2718p(parcel, 12, this.f37066z, i, false);
        z71.m2732b(parcel, m2733a);
    }
}
