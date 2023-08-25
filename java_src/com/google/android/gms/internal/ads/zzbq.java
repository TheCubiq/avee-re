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
    public final zzbp[] p;
    public final long q;

    public zzbq(long j, zzbp... zzbpVarArr) {
        this.q = j;
        this.p = zzbpVarArr;
    }

    public zzbq(Parcel parcel) {
        this.p = new zzbp[parcel.readInt()];
        int i = 0;
        while (true) {
            zzbp[] zzbpVarArr = this.p;
            if (i >= zzbpVarArr.length) {
                this.q = parcel.readLong();
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

    public final int a() {
        return this.p.length;
    }

    public final zzbp b(int i) {
        return this.p[i];
    }

    public final zzbq c(zzbp... zzbpVarArr) {
        return zzbpVarArr.length == 0 ? this : new zzbq(this.q, (zzbp[]) it5.E(this.p, zzbpVarArr));
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
            if (Arrays.equals(this.p, zzbqVar.p) && this.q == zzbqVar.q) {
                return true;
            }
        }
        return false;
    }

    public final zzbq g(zzbq zzbqVar) {
        return zzbqVar == null ? this : c(zzbqVar.p);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.p);
        long j = this.q;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        String arrays = Arrays.toString(this.p);
        long j = this.q;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return "entries=" + arrays + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.p.length);
        for (zzbp zzbpVar : this.p) {
            parcel.writeParcelable(zzbpVar, 0);
        }
        parcel.writeLong(this.q);
    }
}
