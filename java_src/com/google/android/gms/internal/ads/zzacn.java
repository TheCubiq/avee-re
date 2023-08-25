package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.t62;
import com.daaw.uo4;
import com.daaw.x93;
/* loaded from: classes.dex */
public final class zzacn implements zzbp {
    public static final Parcelable.Creator<zzacn> CREATOR = new t62();
    public final int p;
    public final String q;
    public final String r;
    public final String s;
    public final boolean t;
    public final int u;

    public zzacn(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        uo4.d(z2);
        this.p = i;
        this.q = str;
        this.r = str2;
        this.s = str3;
        this.t = z;
        this.u = i2;
    }

    public zzacn(Parcel parcel) {
        this.p = parcel.readInt();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = parcel.readString();
        this.t = it5.z(parcel);
        this.u = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacn.class == obj.getClass()) {
            zzacn zzacnVar = (zzacn) obj;
            if (this.p == zzacnVar.p && it5.t(this.q, zzacnVar.q) && it5.t(this.r, zzacnVar.r) && it5.t(this.s, zzacnVar.s) && this.t == zzacnVar.t && this.u == zzacnVar.u) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void f(x93 x93Var) {
        String str = this.r;
        if (str != null) {
            x93Var.G(str);
        }
        String str2 = this.q;
        if (str2 != null) {
            x93Var.z(str2);
        }
    }

    public final int hashCode() {
        int i = (this.p + 527) * 31;
        String str = this.q;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.r;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.s;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.t ? 1 : 0)) * 31) + this.u;
    }

    public final String toString() {
        String str = this.r;
        String str2 = this.q;
        int i = this.p;
        int i2 = this.u;
        return "IcyHeaders: name=\"" + str + "\", genre=\"" + str2 + "\", bitrate=" + i + ", metadataInterval=" + i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        it5.s(parcel, this.t);
        parcel.writeInt(this.u);
    }
}
