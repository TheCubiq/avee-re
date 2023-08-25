package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.nu2;
import com.daaw.ry0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new nu2();

    /* renamed from: p */
    public final String f37068p;

    /* renamed from: q */
    public final zzau f37069q;

    /* renamed from: r */
    public final String f37070r;

    /* renamed from: s */
    public final long f37071s;

    public zzaw(zzaw zzawVar, long j) {
        ry0.m10830j(zzawVar);
        this.f37068p = zzawVar.f37068p;
        this.f37069q = zzawVar.f37069q;
        this.f37070r = zzawVar.f37070r;
        this.f37071s = j;
    }

    public zzaw(String str, zzau zzauVar, String str2, long j) {
        this.f37068p = str;
        this.f37069q = zzauVar;
        this.f37070r = str2;
        this.f37071s = j;
    }

    public final String toString() {
        String str = this.f37070r;
        String str2 = this.f37068p;
        String valueOf = String.valueOf(this.f37069q);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        nu2.m14781a(this, parcel, i);
    }
}
