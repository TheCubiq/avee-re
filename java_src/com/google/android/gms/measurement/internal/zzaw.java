package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.nu2;
import com.daaw.ry0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new nu2();
    public final String p;
    public final zzau q;
    public final String r;
    public final long s;

    public zzaw(zzaw zzawVar, long j) {
        ry0.j(zzawVar);
        this.p = zzawVar.p;
        this.q = zzawVar.q;
        this.r = zzawVar.r;
        this.s = j;
    }

    public zzaw(String str, zzau zzauVar, String str2, long j) {
        this.p = str;
        this.q = zzauVar;
        this.r = str2;
        this.s = j;
    }

    public final String toString() {
        String str = this.r;
        String str2 = this.p;
        String valueOf = String.valueOf(this.q);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        nu2.a(this, parcel, i);
    }
}
