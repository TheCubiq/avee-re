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

    /* renamed from: p */
    public final int f36718p;

    /* renamed from: q */
    public final String f36719q;

    /* renamed from: r */
    public final String f36720r;

    /* renamed from: s */
    public final String f36721s;

    /* renamed from: t */
    public final boolean f36722t;

    /* renamed from: u */
    public final int f36723u;

    public zzacn(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        uo4.m7874d(z2);
        this.f36718p = i;
        this.f36719q = str;
        this.f36720r = str2;
        this.f36721s = str3;
        this.f36722t = z;
        this.f36723u = i2;
    }

    public zzacn(Parcel parcel) {
        this.f36718p = parcel.readInt();
        this.f36719q = parcel.readString();
        this.f36720r = parcel.readString();
        this.f36721s = parcel.readString();
        this.f36722t = it5.m19370z(parcel);
        this.f36723u = parcel.readInt();
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
            if (this.f36718p == zzacnVar.f36718p && it5.m19376t(this.f36719q, zzacnVar.f36719q) && it5.m19376t(this.f36720r, zzacnVar.f36720r) && it5.m19376t(this.f36721s, zzacnVar.f36721s) && this.f36722t == zzacnVar.f36722t && this.f36723u == zzacnVar.f36723u) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    /* renamed from: f */
    public final void mo1104f(x93 x93Var) {
        String str = this.f36720r;
        if (str != null) {
            x93Var.m5408G(str);
        }
        String str2 = this.f36719q;
        if (str2 != null) {
            x93Var.m5373z(str2);
        }
    }

    public final int hashCode() {
        int i = (this.f36718p + 527) * 31;
        String str = this.f36719q;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f36720r;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36721s;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f36722t ? 1 : 0)) * 31) + this.f36723u;
    }

    public final String toString() {
        String str = this.f36720r;
        String str2 = this.f36719q;
        int i = this.f36718p;
        int i2 = this.f36723u;
        return "IcyHeaders: name=\"" + str + "\", genre=\"" + str2 + "\", bitrate=" + i + ", metadataInterval=" + i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f36718p);
        parcel.writeString(this.f36719q);
        parcel.writeString(this.f36720r);
        parcel.writeString(this.f36721s);
        it5.m19377s(parcel, this.f36722t);
        parcel.writeInt(this.f36723u);
    }
}
