package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.s72;
import com.daaw.t72;
import com.daaw.x93;
/* loaded from: classes.dex */
public final class zzadu implements zzbp {
    public static final Parcelable.Creator<zzadu> CREATOR = new s72();

    /* renamed from: p */
    public final long f36766p;

    /* renamed from: q */
    public final long f36767q;

    /* renamed from: r */
    public final long f36768r;

    /* renamed from: s */
    public final long f36769s;

    /* renamed from: t */
    public final long f36770t;

    public zzadu(long j, long j2, long j3, long j4, long j5) {
        this.f36766p = j;
        this.f36767q = j2;
        this.f36768r = j3;
        this.f36769s = j4;
        this.f36770t = j5;
    }

    public /* synthetic */ zzadu(Parcel parcel, t72 t72Var) {
        this.f36766p = parcel.readLong();
        this.f36767q = parcel.readLong();
        this.f36768r = parcel.readLong();
        this.f36769s = parcel.readLong();
        this.f36770t = parcel.readLong();
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
            if (this.f36766p == zzaduVar.f36766p && this.f36767q == zzaduVar.f36767q && this.f36768r == zzaduVar.f36768r && this.f36769s == zzaduVar.f36769s && this.f36770t == zzaduVar.f36770t) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    /* renamed from: f */
    public final /* synthetic */ void mo1104f(x93 x93Var) {
    }

    public final int hashCode() {
        long j = this.f36766p;
        long j2 = this.f36767q;
        long j3 = this.f36768r;
        long j4 = this.f36769s;
        long j5 = this.f36770t;
        return ((((((((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        long j = this.f36766p;
        long j2 = this.f36767q;
        long j3 = this.f36768r;
        long j4 = this.f36769s;
        long j5 = this.f36770t;
        return "Motion photo metadata: photoStartPosition=" + j + ", photoSize=" + j2 + ", photoPresentationTimestampUs=" + j3 + ", videoStartPosition=" + j4 + ", videoSize=" + j5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f36766p);
        parcel.writeLong(this.f36767q);
        parcel.writeLong(this.f36768r);
        parcel.writeLong(this.f36769s);
        parcel.writeLong(this.f36770t);
    }
}
