package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.vz2;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzbbb implements Parcelable {
    public static final Parcelable.Creator<zzbbb> CREATOR = new vz2();

    /* renamed from: p */
    public final int f36819p;

    /* renamed from: q */
    public final int f36820q;

    /* renamed from: r */
    public final int f36821r;

    /* renamed from: s */
    public final byte[] f36822s;

    /* renamed from: t */
    public int f36823t;

    public zzbbb(int i, int i2, int i3, byte[] bArr) {
        this.f36819p = i;
        this.f36820q = i2;
        this.f36821r = i3;
        this.f36822s = bArr;
    }

    public zzbbb(Parcel parcel) {
        this.f36819p = parcel.readInt();
        this.f36820q = parcel.readInt();
        this.f36821r = parcel.readInt();
        this.f36822s = parcel.readInt() != 0 ? parcel.createByteArray() : null;
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
            if (this.f36819p == zzbbbVar.f36819p && this.f36820q == zzbbbVar.f36820q && this.f36821r == zzbbbVar.f36821r && Arrays.equals(this.f36822s, zzbbbVar.f36822s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f36823t;
        if (i == 0) {
            int hashCode = ((((((this.f36819p + 527) * 31) + this.f36820q) * 31) + this.f36821r) * 31) + Arrays.hashCode(this.f36822s);
            this.f36823t = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        int i = this.f36819p;
        int i2 = this.f36820q;
        int i3 = this.f36821r;
        boolean z = this.f36822s != null;
        return "ColorInfo(" + i + ", " + i2 + ", " + i3 + ", " + z + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f36819p);
        parcel.writeInt(this.f36820q);
        parcel.writeInt(this.f36821r);
        parcel.writeInt(this.f36822s != null ? 1 : 0);
        byte[] bArr = this.f36822s;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
