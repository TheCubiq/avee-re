package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.s72;
import com.daaw.t72;
import com.daaw.x93;
/* loaded from: classes.dex */
public final class zzadu implements zzbp {
    public static final Parcelable.Creator<zzadu> CREATOR = new s72();
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    public final long t;

    public zzadu(long j, long j2, long j3, long j4, long j5) {
        this.p = j;
        this.q = j2;
        this.r = j3;
        this.s = j4;
        this.t = j5;
    }

    public /* synthetic */ zzadu(Parcel parcel, t72 t72Var) {
        this.p = parcel.readLong();
        this.q = parcel.readLong();
        this.r = parcel.readLong();
        this.s = parcel.readLong();
        this.t = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadu.class == obj.getClass()) {
            zzadu zzaduVar = (zzadu) obj;
            if (this.p == zzaduVar.p && this.q == zzaduVar.q && this.r == zzaduVar.r && this.s == zzaduVar.s && this.t == zzaduVar.t) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final /* synthetic */ void f(x93 x93Var) {
    }

    public final int hashCode() {
        long j = this.p;
        long j2 = this.q;
        long j3 = this.r;
        long j4 = this.s;
        long j5 = this.t;
        return ((((((((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        long j = this.p;
        long j2 = this.q;
        long j3 = this.r;
        long j4 = this.s;
        long j5 = this.t;
        return "Motion photo metadata: photoStartPosition=" + j + ", photoSize=" + j2 + ", photoPresentationTimestampUs=" + j3 + ", videoStartPosition=" + j4 + ", videoSize=" + j5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.p);
        parcel.writeLong(this.q);
        parcel.writeLong(this.r);
        parcel.writeLong(this.s);
        parcel.writeLong(this.t);
    }
}
