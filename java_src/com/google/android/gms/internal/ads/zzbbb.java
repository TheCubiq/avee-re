package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.vz2;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzbbb implements Parcelable {
    public static final Parcelable.Creator<zzbbb> CREATOR = new vz2();
    public final int p;
    public final int q;
    public final int r;
    public final byte[] s;
    public int t;

    public zzbbb(int i, int i2, int i3, byte[] bArr) {
        this.p = i;
        this.q = i2;
        this.r = i3;
        this.s = bArr;
    }

    public zzbbb(Parcel parcel) {
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbbb.class == obj.getClass()) {
            zzbbb zzbbbVar = (zzbbb) obj;
            if (this.p == zzbbbVar.p && this.q == zzbbbVar.q && this.r == zzbbbVar.r && Arrays.equals(this.s, zzbbbVar.s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.t;
        if (i == 0) {
            int hashCode = ((((((this.p + 527) * 31) + this.q) * 31) + this.r) * 31) + Arrays.hashCode(this.s);
            this.t = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        int i = this.p;
        int i2 = this.q;
        int i3 = this.r;
        boolean z = this.s != null;
        return "ColorInfo(" + i + ", " + i2 + ", " + i3 + ", " + z + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s != null ? 1 : 0);
        byte[] bArr = this.s;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
