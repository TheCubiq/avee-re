package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.pe3;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class zzbq implements Parcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new pe3();

    /* renamed from: p */
    public final zzbp[] f36853p;

    /* renamed from: q */
    public final long f36854q;

    public zzbq(long j, zzbp... zzbpVarArr) {
        this.f36854q = j;
        this.f36853p = zzbpVarArr;
    }

    public zzbq(Parcel parcel) {
        this.f36853p = new zzbp[parcel.readInt()];
        int i = 0;
        while (true) {
            zzbp[] zzbpVarArr = this.f36853p;
            if (i >= zzbpVarArr.length) {
                this.f36854q = parcel.readLong();
                return;
            } else {
                zzbpVarArr[i] = (zzbp) parcel.readParcelable(zzbp.class.getClassLoader());
                i++;
            }
        }
    }

    public zzbq(List list) {
        this(-9223372036854775807L, (zzbp[]) list.toArray(new zzbp[0]));
    }

    /* renamed from: a */
    public final int m1103a() {
        return this.f36853p.length;
    }

    /* renamed from: b */
    public final zzbp m1102b(int i) {
        return this.f36853p[i];
    }

    /* renamed from: c */
    public final zzbq m1101c(zzbp... zzbpVarArr) {
        return zzbpVarArr.length == 0 ? this : new zzbq(this.f36854q, (zzbp[]) it5.m19427E(this.f36853p, zzbpVarArr));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbq.class == obj.getClass()) {
            zzbq zzbqVar = (zzbq) obj;
            if (Arrays.equals(this.f36853p, zzbqVar.f36853p) && this.f36854q == zzbqVar.f36854q) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final zzbq m1100g(zzbq zzbqVar) {
        return zzbqVar == null ? this : m1101c(zzbqVar.f36853p);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f36853p);
        long j = this.f36854q;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        String arrays = Arrays.toString(this.f36853p);
        long j = this.f36854q;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return "entries=" + arrays + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f36853p.length);
        for (zzbp zzbpVar : this.f36853p) {
            parcel.writeParcelable(zzbpVar, 0);
        }
        parcel.writeLong(this.f36854q);
    }
}
